package X;

import com.bytedance.crash.npth_repair.monitor.SignalMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0Vf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803170Vf1 {
    public static void LIZ(File file) {
        try {
            String absolutePath = new C0VSJ(file, "signal_monitor.txt").getAbsolutePath();
            synchronized (C803380VfM.class) {
                if ((C802350Vdh.LIZ.LIZLLL & 4) != 0) {
                    SignalMonitor.LIZIZ().LIZ(absolutePath);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
