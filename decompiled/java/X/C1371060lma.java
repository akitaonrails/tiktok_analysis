package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0lma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1371060lma {
    public static int LIZ = -1;
    public static int LIZIZ = -1;

    public static int LIZLLL() throws Throwable {
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null) {
            Context applicationContext = interfaceC1370110ll3.getApplicationContext();
            int i = LIZ;
            if (i > 0) {
                return i;
            }
            if (applicationContext != null) {
                LJ(applicationContext);
                int i2 = LIZ;
                if (i2 > 0) {
                    return i2;
                }
            }
        }
        return 0;
    }

    public static int[] LIZ(Context context) {
        Display displayLLILZIL;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
            if (windowManager != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkjGUTx3XvIQY3FOYg3UsCZ+lzDiPLiVKaF5L", null))) != null) {
                displayLLILZIL.getRealMetrics(displayMetrics);
                return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
            }
            return new int[]{-1, -1};
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new int[]{-1, -1};
        }
    }

    public static int LIZIZ(C19EG c19eg) throws Throwable {
        WindowManager windowManager;
        Activity activityLIZ = C1388190mED.LIZ(c19eg);
        if (activityLIZ != null) {
            windowManager = activityLIZ.getWindowManager();
        } else {
            windowManager = (WindowManager) C786410Ut5.H2(c19eg, "window");
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkjGUTx3XvIQY3FOYg3UsCZ+lzDiPLiVKaF5L", null));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(displayLLILZIL, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZJ(c19eg);
        }
    }

    public static int LIZJ(Context context) throws Throwable {
        int i = LIZIZ;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        LJ(context);
        int i2 = LIZIZ;
        if (i2 <= 0) {
            return 0;
        }
        return i2;
    }

    public static void LJ(Context context) throws Throwable {
        int[] iArr;
        if (context == null) {
            iArr = new int[]{-1, -1};
        } else {
            try {
                WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
                if (windowManager != null) {
                    Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkjGUTx3XvIQY3FOYg3UsCZ+lzDiPLiVKaF5L", null));
                    Point point = new Point();
                    if (displayLLILZIL == null) {
                        iArr = new int[]{-1, -1};
                    } else {
                        displayLLILZIL.getRealSize(point);
                        iArr = new int[]{point.x, point.y};
                    }
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    iArr = new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iArr = new int[]{-1, -1};
            }
        }
        LIZ = iArr[0];
        LIZIZ = iArr[1];
    }
}
