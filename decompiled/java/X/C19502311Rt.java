package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19502311Rt extends C11RO {
    public static final ThreadFactoryC1301810jyt LIZJ;
    public final AtomicReference<ScheduledExecutorService> LIZIZ;

    public C19502311Rt() {
        ThreadFactoryC1301810jyt threadFactoryC1301810jyt = LIZJ;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.LIZIZ = atomicReference;
        atomicReference.lazySet(SchedulerPoolFactory.create(threadFactoryC1301810jyt));
    }

    @Override // X.C11RO
    public final C11RN LIZ() {
        final ScheduledExecutorService scheduledExecutorService = this.LIZIZ.get();
        return new C11RN(scheduledExecutorService) { // from class: X.11Rq
            public final ScheduledExecutorService LL;
            public final C11NJ LLILLJJLI = new C11NJ();
            public volatile boolean LLILLL;

            @Override // X.InterfaceC420801kM
            public final void dispose() {
                if (this.LLILLL) {
                    return;
                }
                this.LLILLL = true;
                this.LLILLJJLI.dispose();
            }

            @Override // X.InterfaceC420801kM
            public final boolean isDisposed() {
                return this.LLILLL;
            }

            {
                this.LL = scheduledExecutorService;
            }

            @Override // X.C11RN
            public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
                Future<?> futureSubmit;
                if (this.LLILLL) {
                    return C11JT.INSTANCE;
                }
                C1701890uOB.LIZ(runnable, "run is null");
                RunnableC19502511Rv runnableC19502511Rv = new RunnableC19502511Rv(runnable, this.LLILLJJLI);
                this.LLILLJJLI.LIZ(runnableC19502511Rv);
                try {
                    if (j > 0) {
                        futureSubmit = this.LL.schedule((Callable) runnableC19502511Rv, j, timeUnit);
                    } else {
                        futureSubmit = this.LL.submit((Callable) runnableC19502511Rv);
                    }
                    runnableC19502511Rv.setFuture(futureSubmit);
                    return runnableC19502511Rv;
                } catch (RejectedExecutionException e) {
                    TryCatchGuardChecker.doCheck(e);
                    dispose();
                    C19489211Ms.LIZIZ(e);
                    return C11JT.INSTANCE;
                }
            }
        };
    }

    static {
        (C0WP5.LIZJ() ? new C822660WOy(0) : C786410Ut5.f4(0)).shutdown();
        LIZJ = new ThreadFactoryC1301810jyt("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    @Override // X.C11RO
    public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> futureSubmit;
        C1701890uOB.LIZ(runnable, "run is null");
        CallableC19502911Rz callableC19502911Rz = new CallableC19502911Rz(runnable);
        try {
            if (j > 0) {
                futureSubmit = this.LIZIZ.get().schedule(callableC19502911Rz, j, timeUnit);
            } else {
                futureSubmit = this.LIZIZ.get().submit(callableC19502911Rz);
            }
            callableC19502911Rz.setFuture(futureSubmit);
            return callableC19502911Rz;
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            C19489211Ms.LIZIZ(e);
            return C11JT.INSTANCE;
        }
    }

    @Override // X.C11RO
    public final InterfaceC420801kM LIZLLL(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> futureSubmit;
        C1701890uOB.LIZ(runnable, "run is null");
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.LIZIZ.get();
            CallableC19502411Ru callableC19502411Ru = new CallableC19502411Ru(runnable, scheduledExecutorService);
            try {
                if (j > 0) {
                    futureSubmit = scheduledExecutorService.schedule(callableC19502411Ru, j, timeUnit);
                } else {
                    futureSubmit = scheduledExecutorService.submit(callableC19502411Ru);
                }
                callableC19502411Ru.LIZ(futureSubmit);
                return callableC19502411Ru;
            } catch (RejectedExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                C19489211Ms.LIZIZ(e);
                return C11JT.INSTANCE;
            }
        }
        RunnableC19502811Ry runnableC19502811Ry = new RunnableC19502811Ry(runnable);
        try {
            runnableC19502811Ry.setFuture(this.LIZIZ.get().scheduleAtFixedRate(runnableC19502811Ry, j, j2, timeUnit));
            return runnableC19502811Ry;
        } catch (RejectedExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C19489211Ms.LIZIZ(e2);
            return C11JT.INSTANCE;
        }
    }
}
