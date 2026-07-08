package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0BIA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BIA {
    public static Boolean LIZ = null;
    public static int LIZIZ = -1;

    public static boolean LIZ() {
        if (!C0BIB.LIZ) {
            return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_benchmark_performance", true, false);
        }
        if (LIZ == null) {
            LIZ = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_benchmark_performance", true, false));
        }
        return LIZ.booleanValue();
    }

    public static boolean LIZIZ() {
        if (LIZIZ == -1) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("benchmark_poor_perf_device", false)) {
                LIZIZ = 1;
            } else {
                LIZIZ = 0;
            }
        }
        return LIZIZ > 0;
    }
}
