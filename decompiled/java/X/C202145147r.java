package X;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import android.os.StatFs;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Pair;
import kotlin.jvm.internal.AwS54S1000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.147r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202145147r {
    public static final C202145147r LIZ = new C202145147r();

    public static int LIZJ() throws Throwable {
        try {
            int iLJIILJJIL = C0WYJ.LJIILJJIL();
            if (iLJIILJJIL > 0) {
                return iLJIILJJIL;
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static String LIZLLL() {
        String strLJIIL = LJIIL("model name");
        if (strLJIIL != null) {
            return strLJIIL;
        }
        String strLJIIL2 = LJIIL("Processor");
        if (strLJIIL2 != null) {
            for (int i = 0; i < strLJIIL2.length(); i++) {
                if (!Character.isDigit(strLJIIL2.charAt(i))) {
                    return strLJIIL2;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.SOC_MODEL;
            if ((!a0.LJJJIL(str)) && !Intrinsics.LJFF(str, "unknown") && str != null) {
                return str;
            }
        }
        String str2 = Build.HARDWARE;
        return (!(a0.LJJJIL(str2) ^ true) || Intrinsics.LJFF(str2, "unknown") || str2 == null) ? "" : str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF() {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202145147r.LJFF():java.lang.String");
    }

    public static String LIZIZ() {
        String strLIZJ = AnonymousClass1440.LIZJ();
        return strLIZJ == null ? "" : strLIZJ;
    }

    public static Pair LJ() {
        AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
        if (abstractC1387200mCcLIZJ == null || abstractC1387200mCcLIZJ.LIZIZ() == null || !Intrinsics.LJFF(C786410Ut5.X3(), "mounted")) {
            return null;
        }
        StatFs statFs = new StatFs(C786410Ut5.W3().getPath());
        long jLLIFFJFJJ = C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SiH6h7lKwa3FdOxkKEmAZ4QUB5kU8Wqxag==", null));
        return new Pair(Long.valueOf(C2204961BRm.LLFZ(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SiH6h7lKwa3FdOxkKEmAZ4QUB5kU8Wqxag==", null)) * jLLIFFJFJJ), Long.valueOf(C2204961BRm.LLFF(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SiH6h7lKwa3FdOxkKEmAZ4QUB5kU8Wqxag==", null)) * jLLIFFJFJJ));
    }

    public static int LJIIJ() {
        C0VA1 c0va1LIZ = C0VAA.LIZ(C1717770unn.LIZJ().getApplicationContext());
        if (c0va1LIZ != null) {
            return c0va1LIZ.LIZIZ.LIZLLL ? 1 : 0;
        }
        return 0;
    }

    public static int LIZ(Context context) {
        if (context == null) {
            return 0;
        }
        return C2204961BRm.LL((BatteryManager) C786410Ut5.H2(context, "batterymanager"), 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SiH6h7lKwa3FdOxkKEmAZ4QUB5kU8Wqxag==", null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(android.content.Context r16) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202145147r.LJI(android.content.Context):java.lang.String");
    }

    public static int LJII(Context context) throws Throwable {
        if (context == null) {
            return 60;
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SiH6h7lKwa3FdOxkKEmAZ4QUB5kU8Wqxag==", null));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || i >= 24) {
            float refreshRate = displayLLILZIL.getRefreshRate();
            return (int) refreshRate;
        }
        try {
            int refreshRate2 = (int) displayLLILZIL.getRefreshRate();
            if (refreshRate2 <= 0) {
                return 60;
            }
            return refreshRate2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 60;
        }
    }

    public static float LJIIIIZZ(Context context) {
        float f = 0.5f;
        if (context == null) {
            return 0.5f;
        }
        try {
            f = Settings.System.getInt(context.getContentResolver(), "screen_brightness", 127) / 255.0f;
            return f;
        } catch (Settings.SettingNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return f;
        }
    }

    public static int LJIIIZ(Context context) {
        if (context == null) {
            return 0;
        }
        return C2204961BRm.LL((BatteryManager) C786410Ut5.H2(context, "batterymanager"), 4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SiH6h7lKwa3FdOxkKEmAZ4QUB5kU8Wqxag==", null));
    }

    public static String LJIIL(String str) {
        Object c098200Yq;
        BufferedReader bufferedReader;
        try {
            Reader inputStreamReader = new InputStreamReader(new C0VSP(new C0VSJ("/proc/cpuinfo")), Charsets.UTF_8);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        try {
            c098200Yq = C09RB.LJIILLIIL(C09RB.LJJI(C08KC.LIZIZ(bufferedReader), 400), "\n", null, null, null, 62);
            C2107108Nh.LIZ(bufferedReader, null);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            if (str2 == null) {
                return null;
            }
            return (String) C09RB.LJIIL(C09RB.LJIJI(new C1947107jx(str2), new AwS54S1000000_3(str, 2)));
        } catch (Throwable th2) {
            th = th2;
            try {
                TryCatchGuardChecker.doCheck(th);
                try {
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedReader, th);
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                th = null;
            }
        }
    }

    public static int LJIIJJI(int i, Context context) {
        if (context == null) {
            return 0;
        }
        return (int) (i / context.getResources().getDisplayMetrics().density);
    }
}
