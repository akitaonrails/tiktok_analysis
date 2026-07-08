package X;

import Y.ARunnableS46S0300000_13;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0WQT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQT {
    public static final AtomicInteger LIZ;
    public static final int LIZIZ;
    public static final C0WPM LIZJ;
    public static final C0WPM LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final long LJI;
    public static final RejectedExecutionHandlerC822950WQb LJII;
    public static final RejectedExecutionHandlerC822940WQa LJIIIIZZ;

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0WQb] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0WQa] */
    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        LIZ = new AtomicInteger(0);
        int i = iAvailableProcessors + 1;
        int i2 = iAvailableProcessors - 1;
        int iMax = Math.max(2, Math.min(i2, 6)) * 2;
        LIZIZ = Math.max(2, Math.min(i2, 4));
        Math.max(2, i2);
        LIZJ = LIZIZ(iMax, C0WQX.IO, "tp-reject");
        LIZLLL = LIZIZ(i, C0WQX.DEFAULT, "tp-default-reject");
        LJI = TimeUnit.SECONDS.toMillis(3L);
        LJII = new RejectedExecutionHandler() { // from class: X.0WQb
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                C0WQT.LIZJ.execute(runnable);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - C0WQT.LJ >= C0WQT.LJI) {
                    C0WQT.LJ = jElapsedRealtime;
                    C822960WQc.LIZ.getClass();
                    if (C823050WQl.LIZIZ.LIZIZ()) {
                        C822990WQf.LIZLLL.execute(new ARunnableS46S0300000_13(runnable, threadPoolExecutor, new Exception(), 21));
                        return;
                    }
                    return;
                }
                C0WQT.LJ = jElapsedRealtime;
            }
        };
        LJIIIIZZ = new RejectedExecutionHandler() { // from class: X.0WQa
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                C0WQT.LIZLLL.execute(runnable);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - C0WQT.LJFF < C0WQT.LJI && !C823050WQl.LIZ.LIZ) {
                    C0WQT.LJFF = jElapsedRealtime;
                    return;
                }
                C0WQT.LJFF = jElapsedRealtime;
                C822960WQc.LIZ.getClass();
                if (!C823050WQl.LIZIZ.LIZIZ()) {
                    return;
                }
                C822990WQf.LIZLLL.execute(new ARunnableS46S0300000_13(runnable, threadPoolExecutor, new Exception(), 21));
            }
        };
    }

    public static C0WPM LIZ(boolean z) {
        int iIntValue = 128;
        if (z && ((Boolean) C1224504qh.LIZIZ.getValue()).booleanValue()) {
            C1224504qh.LIZ = 128;
            C01GW c01gw = C1224504qh.LIZLLL;
            if (((Number) c01gw.getValue()).longValue() > 0) {
                C823050WQl.LJ().schedule(new Runnable() { // from class: X.0CAT
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ThreadIOExecutorOpt@f134.storeGlobalMax$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ThreadIOExecutorOpt@f134.storeGlobalMax$1");
                    }

                    public static void LIZ() {
                        Object c098200Yq;
                        try {
                            ExecutorService executorServiceLIZLLL = C823050WQl.LIZLLL();
                            int i = C1224504qh.LIZ;
                            if (i > 0 && (executorServiceLIZLLL instanceof ThreadPoolExecutor) && i != ((ThreadPoolExecutor) executorServiceLIZLLL).getMaximumPoolSize()) {
                                ((ThreadPoolExecutor) executorServiceLIZLLL).setMaximumPoolSize(C1224504qh.LIZ);
                            }
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    }
                }, ((Number) c01gw.getValue()).longValue(), TimeUnit.MILLISECONDS);
            }
            iIntValue = ((Number) C1224504qh.LIZJ.getValue()).intValue();
        }
        return new C0WPM(C0WQX.IO, 0, iIntValue, 30L, TimeUnit.SECONDS, new SynchronousQueue(), new C0WQU("tp-io", false, 0), LJII);
    }

    public static C0WPM LIZIZ(int i, C0WQX c0wqx, String str) {
        C0WPM c0wpm = new C0WPM(c0wqx, i, i, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C0WQU(str, false, 0));
        c0wpm.allowCoreThreadTimeOut(true);
        return c0wpm;
    }
}
