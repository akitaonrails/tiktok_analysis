package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VTR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VTR {
    public static long LIZIZ;
    public static float LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static boolean LJFF;
    public static final C0VTR LIZ = new C0VTR();
    public static boolean LJI = true;

    public static void LIZIZ() {
        LJI = !C0VT5.LIZ().LIZLLL;
        LIZJ = C0VT5.LIZ().LIZJ;
        LIZIZ = System.currentTimeMillis();
        if (C0VTN.LIZJ().LJ()) {
            LIZLLL = System.currentTimeMillis();
            LJ = 0L;
        }
    }

    public static void LIZ(C0V9Z c0v9z) {
        if (!LJI) {
            return;
        }
        float f = C0VT5.LIZ().LIZJ;
        float f2 = LIZJ;
        if (f >= f2) {
            return;
        }
        float f3 = f2 - f;
        float fCurrentTimeMillis = (System.currentTimeMillis() - LIZIZ) / 60000.0f;
        String strJ4 = C786410Ut5.j4("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(f3 / fCurrentTimeMillis)}, 1));
        if (Intrinsics.LJFF("0.0000", strJ4)) {
            return;
        }
        if (LJ == 0 && LIZLLL > 0) {
            LJ = System.currentTimeMillis() - LIZLLL;
        }
        boolean zLJ = C0VTN.LIZJ().LJ();
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("is_low_power_mode", String.valueOf(zLJ ? 1 : 0));
        c736480Suk.LIZ("low_power_mode_pct", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf((LJ * 1.0f) / (System.currentTimeMillis() - LIZIZ))}, 1)));
        c736480Suk.LIZ("battery_level", String.valueOf(f));
        c736480Suk.LIZ("battery_temperature", String.valueOf(((C0VA1) c0v9z).LIZIZ.LJFF));
        c736480Suk.LIZ("session_time", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(fCurrentTimeMillis)}, 1)));
        c736480Suk.LIZ("session_usage", String.valueOf(f3));
        c736480Suk.LIZ("per_min_avg_usage", strJ4);
        C20684815ws.LJIJ("prf_battery_usage", c736480Suk.LIZIZ());
    }
}
