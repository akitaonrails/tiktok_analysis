package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V9Q, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V9Q {
    public static double LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C791560V3i.LIZLLL().getClass();
        long jLIZIZ = C08OX.LIZIZ();
        try {
            Thread.sleep(360L);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C791560V3i.LIZLLL().getClass();
        return (((C08OX.LIZIZ() - jLIZIZ) * 1000.0d) / (System.currentTimeMillis() - jCurrentTimeMillis)) / C08OX.LJFF();
    }
}
