package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19502211Rs extends C11RO {
    public static final C11S1 LIZLLL;
    public static final ThreadFactoryC1301810jyt LJ;
    public static final int LJFF;
    public static final C11S2 LJI;
    public final ThreadFactory LIZIZ = LJ;
    public final AtomicReference<C11S1> LIZJ;

    public C19502211Rs() {
        int i;
        C11S1 c11s1 = LIZLLL;
        AtomicReference<C11S1> atomicReference = new AtomicReference<>(c11s1);
        this.LIZJ = atomicReference;
        C11S1 c11s12 = new C11S1(LJFF, this.LIZIZ);
        do {
            if (atomicReference.compareAndSet(c11s1, c11s12)) {
                return;
            }
        } while (atomicReference.get() == c11s1);
        for (C11S2 c11s2 : c11s12.LIZIZ) {
            c11s2.dispose();
        }
    }

    @Override // X.C11RO
    public final C11RN LIZ() {
        final C11S2 c11s2LIZ = this.LIZJ.get().LIZ();
        return new C11RN(c11s2LIZ) { // from class: X.11RQ
            public final C11NI LL;
            public final C11NJ LLILLJJLI;
            public final C11NI LLILLL;
            public final C11S2 LLILZ;
            public volatile boolean LLILZIL;

            @Override // X.InterfaceC420801kM
            public final void dispose() {
                if (this.LLILZIL) {
                    return;
                }
                this.LLILZIL = true;
                this.LLILLL.dispose();
            }

            @Override // X.InterfaceC420801kM
            public final boolean isDisposed() {
                return this.LLILZIL;
            }

            {
                this.LLILZ = c11s2LIZ;
                C11NI c11ni = new C11NI();
                this.LL = c11ni;
                C11NJ c11nj = new C11NJ();
                this.LLILLJJLI = c11nj;
                C11NI c11ni2 = new C11NI();
                this.LLILLL = c11ni2;
                c11ni2.LIZ(c11ni);
                c11ni2.LIZ(c11nj);
            }

            @Override // X.C11RN
            public final InterfaceC420801kM LIZIZ(Runnable runnable) {
                if (this.LLILZIL) {
                    return C11JT.INSTANCE;
                }
                return this.LLILZ.LJ(runnable, 0L, TimeUnit.MILLISECONDS, this.LL);
            }

            @Override // X.C11RN
            public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
                if (this.LLILZIL) {
                    return C11JT.INSTANCE;
                }
                return this.LLILZ.LJ(runnable, j, timeUnit, this.LLILLJJLI);
            }
        };
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        LJFF = iAvailableProcessors;
        C11S2 c11s2 = new C11S2(new ThreadFactoryC1301810jyt("RxComputationShutdown"));
        LJI = c11s2;
        c11s2.dispose();
        LJ = new ThreadFactoryC1301810jyt("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        C11S1 c11s1 = new C11S1(0, LJ);
        LIZLLL = c11s1;
        for (C11S2 c11s22 : c11s1.LIZIZ) {
            c11s22.dispose();
        }
    }

    @Override // X.C11RO
    public final InterfaceC420801kM LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> futureSubmit;
        C11S2 c11s2LIZ = this.LIZJ.get().LIZ();
        c11s2LIZ.getClass();
        C1701890uOB.LIZ(runnable, "run is null");
        CallableC19502911Rz callableC19502911Rz = new CallableC19502911Rz(runnable);
        try {
            if (j > 0) {
                futureSubmit = c11s2LIZ.LL.schedule(callableC19502911Rz, j, timeUnit);
            } else {
                futureSubmit = c11s2LIZ.LL.submit(callableC19502911Rz);
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
        C11S2 c11s2LIZ = this.LIZJ.get().LIZ();
        c11s2LIZ.getClass();
        C1701890uOB.LIZ(runnable, "run is null");
        if (j2 <= 0) {
            CallableC19502411Ru callableC19502411Ru = new CallableC19502411Ru(runnable, c11s2LIZ.LL);
            try {
                if (j > 0) {
                    futureSubmit = c11s2LIZ.LL.schedule(callableC19502411Ru, j, timeUnit);
                } else {
                    futureSubmit = c11s2LIZ.LL.submit(callableC19502411Ru);
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
            runnableC19502811Ry.setFuture(c11s2LIZ.LL.scheduleAtFixedRate(runnableC19502811Ry, j, j2, timeUnit));
            return runnableC19502811Ry;
        } catch (RejectedExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C19489211Ms.LIZIZ(e2);
            return C11JT.INSTANCE;
        }
    }
}
