package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.Thread;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301610jyZ {
    public static volatile Executor LIZ;
    public static volatile Executor LIZIZ;
    public static volatile Executor LIZJ;
    public static volatile Executor LIZLLL;
    public static volatile Executor LJ;

    public static Executor LIZ() {
        if (LIZIZ == null) {
            synchronized (C1301610jyZ.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = LIZJ(10, 2, "lynx-card-service-thread");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static Executor LIZIZ() {
        if (LIZ == null) {
            synchronized (C1301610jyZ.class) {
                try {
                    if (LIZ == null) {
                        LIZ = LIZJ(3, 2, "lynx-brief-io-thread");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static Executor LIZLLL() {
        if (LIZJ == null) {
            synchronized (C1301610jyZ.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = LIZJ(10, 1, "lynx-image-request-thread");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static Executor LJ() {
        if (LIZLLL == null) {
            synchronized (C1301610jyZ.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = LIZJ(3, 1, "lynx-svg-thread");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static Executor LIZJ(final int i, int i2, final String str) {
        try {
            return C786410Ut5.e4(i2, new ThreadFactory() { // from class: X.0jyd
                public final AtomicInteger LL = new AtomicInteger(1);

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("-");
                    sbLIZ.append(this.LL.getAndIncrement());
                    BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ));
                    if (bPEAThread.isDaemon()) {
                        bPEAThread.setDaemon(false);
                    }
                    ThreadMethodProxy.setPriority(bPEAThread, i);
                    bPEAThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0jye
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        public final void uncaughtException(Thread thread, Throwable th) {
                        }
                    });
                    return bPEAThread;
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new Executor() { // from class: X.0jya
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                }
            };
        }
    }
}
