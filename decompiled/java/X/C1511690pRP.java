package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0pRP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511690pRP {
    public static ExecutorService LIZ;
    public static ScheduledExecutorService LIZIZ;

    public static ScheduledExecutorService LIZ() {
        ScheduledExecutorService scheduledExecutorService = LIZIZ;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        if (C1510910pQ9.LIZ == null) {
            return C1511710pRR.LIZ();
        }
        synchronized (C1511690pRP.class) {
            try {
                if (LIZIZ == null) {
                    ScheduledExecutorService scheduledExecutorServiceLIZJ = C1510910pQ9.LIZ.LIZJ();
                    LIZIZ = scheduledExecutorServiceLIZJ;
                    if (scheduledExecutorServiceLIZJ == null) {
                        LIZIZ = C1511710pRR.LIZ();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return LIZIZ;
    }

    public static void LIZIZ(Runnable runnable) {
        LIZ().execute(runnable);
    }

    public static void LIZJ(long j, Runnable runnable) {
        if (j <= 0) {
            LIZIZ(runnable);
        } else {
            LIZ().schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }
}
