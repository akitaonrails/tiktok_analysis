package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14KZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14KZ {
    public static volatile float LIZ = -1.0f;
    public static int LIZIZ;

    public static DisplayMetrics LIZ(Context context) {
        DisplayMetrics displayMetrics = null;
        try {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            try {
                C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkifFJUT/QTDNVq6qRZ/n+KY7", null)).getRealMetrics(displayMetrics2);
                return displayMetrics2;
            } catch (Exception e) {
                e = e;
                displayMetrics = displayMetrics2;
                TryCatchGuardChecker.doCheck(e);
                return displayMetrics;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static float LIZIZ(Context context) throws Throwable {
        if (LIZ == -1.0f) {
            try {
                Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkifFJUT/QTDNVq6qRZ/n+KY7", null));
                if (displayLLILZIL != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    displayLLILZIL.getMetrics(displayMetrics);
                    LIZ = displayMetrics.density;
                    return LIZ;
                }
                return 1.0f;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("DevicesUtil", "#getPixelRadio (catch error)", e);
                return 1.0f;
            }
        }
        return LIZ;
    }

    public static int LIZJ(Context context) {
        DisplayMetrics displayMetricsLIZ = LIZ(context);
        if (displayMetricsLIZ != null) {
            return displayMetricsLIZ.widthPixels;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r0 == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r0 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        r0 = X.C20246614Ka.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r0 == (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r0 != 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        r0 = X.C20246614Ka.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (r0 != (-1)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        r5 = new int[]{0, 0};
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        if (r8 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        r2 = r8.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
        r0 = ((java.lang.Boolean) r2.getMethod("hasNotchInScreen", new java.lang.Class[0]).invoke(r2, new java.lang.Object[0])).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        if (r0 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        r2 = r8.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
        r5 = (int[]) r2.getMethod("getNotchSize", new java.lang.Class[0]).invoke(r2, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0113, code lost:
    
        r1 = X.C786410Ut5.n3(r8.getResources(), "status_bar_height", "dimen", "android");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0121, code lost:
    
        if (r1 <= 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        r0 = r8.getResources().getDimensionPixelOffset(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012b, code lost:
    
        if (r0 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012d, code lost:
    
        X.C1396030mQr.LIZ.getClass();
        r0 = (int) X.C1396030mQr.LIZ(25.0f, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:
    
        X.C14KZ.LIZIZ = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013b, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14KZ.LIZLLL(android.content.Context):int");
    }

    public static EnumC1153710g81 LJ(Activity activity) {
        if (activity == null) {
            return EnumC1153710g81.RET_FALSE;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (activity.getWindow().getDecorView().getRootWindowInsets() == null) {
                return EnumC1153710g81.RET_FAIL;
            }
            DisplayCutout displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
            if (displayCutout != null && displayCutout.getSafeInsetTop() > 0) {
                return EnumC1153710g81.RET_TRUE;
            }
        }
        return EnumC1153710g81.RET_FALSE;
    }
}
