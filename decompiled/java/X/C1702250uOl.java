package X;

import android.os.Process;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702250uOl {
    public static final int LIZ = Runtime.getRuntime().availableProcessors();
    public static long LIZIZ = -1;
    public static float LIZJ = -1.0f;
    public static float LIZLLL = 0.7f;

    public static boolean LIZ() {
        float elapsedCpuTime;
        if (LIZIZ <= 0 || SystemClock.elapsedRealtime() - LIZIZ >= 500) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long elapsedCpuTime2 = Process.getElapsedCpuTime();
                Thread.sleep(100L);
                elapsedCpuTime = ((Process.getElapsedCpuTime() - elapsedCpuTime2) / (System.currentTimeMillis() - jCurrentTimeMillis)) / LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CpuMonitor cpu rate: ");
                sbLIZ.append(elapsedCpuTime);
                C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                elapsedCpuTime = 0.0f;
            }
            LIZJ = elapsedCpuTime;
            LIZIZ = SystemClock.elapsedRealtime();
        }
        return LIZJ >= LIZLLL;
    }
}
