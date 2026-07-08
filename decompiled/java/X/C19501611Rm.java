package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11Rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19501611Rm extends C11RO {
    public static final C11RO LIZLLL = C11S5.LIZ;
    public final boolean LIZIZ = false;
    public final Executor LIZJ;

    @Override // X.C11RO
    public final C11RN LIZ() {
        return new RunnableC19501511Rl(this.LIZJ, this.LIZIZ);
    }

    public C19501611Rm(Executor executor) {
        this.LIZJ = executor;
    }

    @Override // X.C11RO
    public final InterfaceC420801kM LIZIZ(Runnable runnable) {
        C1701890uOB.LIZ(runnable, "run is null");
        try {
            if (this.LIZJ instanceof ExecutorService) {
                CallableC19502911Rz callableC19502911Rz = new CallableC19502911Rz(runnable);
                callableC19502911Rz.setFuture(((ExecutorService) this.LIZJ).submit(callableC19502911Rz));
                return callableC19502911Rz;
            }
            if (this.LIZIZ) {
                RunnableC19502711Rx runnableC19502711Rx = new RunnableC19502711Rx(runnable, null);
                this.LIZJ.execute(runnableC19502711Rx);
                return runnableC19502711Rx;
            }
            RunnableC19501811Ro runnableC19501811Ro = new RunnableC19501811Ro(runnable);
            this.LIZJ.execute(runnableC19501811Ro);
            return runnableC19501811Ro;
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            C19489211Ms.LIZIZ(e);
            return C11JT.INSTANCE;
        }
    }

    @Override // X.C11RO
    public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        C1701890uOB.LIZ(runnable, "run is null");
        if (this.LIZJ instanceof ScheduledExecutorService) {
            try {
                CallableC19502911Rz callableC19502911Rz = new CallableC19502911Rz(runnable);
                callableC19502911Rz.setFuture(((ScheduledExecutorService) this.LIZJ).schedule(callableC19502911Rz, j, timeUnit));
                return callableC19502911Rz;
            } catch (RejectedExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                C19489211Ms.LIZIZ(e);
                return C11JT.INSTANCE;
            }
        }
        final RunnableC19485011Lc runnableC19485011Lc = new RunnableC19485011Lc(runnable);
        runnableC19485011Lc.LL.replace(LIZLLL.LIZJ(new Runnable(runnableC19485011Lc) { // from class: X.11Ld
            public final RunnableC19485011Lc LL;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    RunnableC19485011Lc runnableC19485011Lc2 = this.LL;
                    runnableC19485011Lc2.LLILLJJLI.replace(this.LLILLJJLI.LIZIZ(runnableC19485011Lc2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }

            {
                this.LL = runnableC19485011Lc;
            }
        }, j, timeUnit));
        return runnableC19485011Lc;
    }

    @Override // X.C11RO
    public final InterfaceC420801kM LIZLLL(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (this.LIZJ instanceof ScheduledExecutorService) {
            C1701890uOB.LIZ(runnable, "run is null");
            try {
                RunnableC19502811Ry runnableC19502811Ry = new RunnableC19502811Ry(runnable);
                runnableC19502811Ry.setFuture(((ScheduledExecutorService) this.LIZJ).scheduleAtFixedRate(runnableC19502811Ry, j, j2, timeUnit));
                return runnableC19502811Ry;
            } catch (RejectedExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                C19489211Ms.LIZIZ(e);
                return C11JT.INSTANCE;
            }
        }
        return super.LIZLLL(runnable, j, j2, timeUnit);
    }
}
