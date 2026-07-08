package X;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.0pPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510720pPq {
    public static final /* synthetic */ int LIZ = 0;

    public static final ScheduledExecutorService LIZIZ() {
        C1510800pPy c1510800pPy = C1510850pQ3.LIZ;
        if (c1510800pPy == null) {
            c1510800pPy = C1510830pQ1.LIZ;
        }
        return c1510800pPy.LIZIZ();
    }

    public static final void LIZ(Runnable runnable) {
        ScheduledExecutorService scheduledExecutorServiceLIZIZ = LIZIZ();
        if (scheduledExecutorServiceLIZIZ != null) {
            scheduledExecutorServiceLIZIZ.execute(runnable);
        }
    }
}
