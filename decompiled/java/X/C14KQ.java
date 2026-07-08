package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.14KQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14KQ {
    public static int LIZ = -1;
    public static int LIZIZ = -1;
    public static int LIZJ;
    public static int LIZLLL;

    public static int LJII() {
        return LJIIIIZZ(C2213981Bky.LIZIZ.getApplicationContext());
    }

    public static int[] LIZ(Context context) {
        Display displayLLILZIL;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
            if (windowManager != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAySbspStFS7vOyqGsL4yje30=", null))) != null) {
                displayLLILZIL.getRealMetrics(displayMetrics);
                return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
            }
            return new int[]{-1, -1};
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new int[]{-1, -1};
        }
    }

    public static int LIZIZ(Context context) {
        int iLJIIIIZZ = LJIIIIZZ(context);
        int iLJ = LJ(context);
        if (iLJIIIIZZ > iLJ) {
            return iLJ;
        }
        return iLJIIIIZZ;
    }

    public static int LIZJ(Context context) throws Throwable {
        WindowManager windowManager;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            windowManager = activityLIZ.getWindowManager();
        } else {
            windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAySbspStFS7vOyqGsL4yje30=", null));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(displayLLILZIL, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LJ(context);
        }
    }

    public static int LIZLLL(Context context) {
        String str;
        if (context != null) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!"1".equals(str)) {
                if (!CardStruct.IStatusCode.DEFAULT.equals(str)) {
                    Resources resources = context.getResources();
                    int iN3 = C786410Ut5.n3(resources, "config_showNavigationBar", "bool", "android");
                    if (iN3 > 0 && resources.getBoolean(iN3)) {
                    }
                }
                Resources resources2 = context.getResources();
                int iN32 = C786410Ut5.n3(resources2, "navigation_bar_height", "dimen", "android");
                if (iN32 > 0) {
                    return resources2.getDimensionPixelSize(iN32);
                }
            }
        }
        return 0;
    }

    public static int LJ(Context context) {
        int i = LIZIZ;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        int[] iArrLJI = LJI(context);
        LIZ = iArrLJI[0];
        int i2 = iArrLJI[1];
        LIZIZ = i2;
        if (i2 <= 0) {
            return 0;
        }
        return i2;
    }

    public static int LJFF(Context context) {
        int i = LIZLLL;
        if (i != 0) {
            return i;
        }
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (windowManager != null) {
            Point point = new Point();
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAySbspStFS7vOyqGsL4yje30=", null)).getSize(point);
            LIZJ = point.x;
            LIZLLL = point.y;
        }
        if (LIZJ == 0 || LIZLLL == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            LIZJ = displayMetrics.widthPixels;
            LIZLLL = displayMetrics.heightPixels;
        }
        return LIZLLL;
    }

    public static int[] LJI(Context context) throws Throwable {
        if (context == null) {
            return new int[]{-1, -1};
        }
        try {
            WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
            if (windowManager != null) {
                Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAySbspStFS7vOyqGsL4yje30=", null));
                Point point = new Point();
                if (displayLLILZIL == null) {
                    return new int[]{-1, -1};
                }
                displayLLILZIL.getRealSize(point);
                return new int[]{point.x, point.y};
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new int[]{-1, -1};
        }
    }

    public static int LJIIIIZZ(Context context) {
        int i = LIZ;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        int[] iArrLJI = LJI(context);
        int i2 = iArrLJI[0];
        LIZ = i2;
        LIZIZ = iArrLJI[1];
        if (i2 <= 0) {
            return 0;
        }
        return i2;
    }

    public static int LJIIIZ(Context context) {
        int i = LIZJ;
        if (i != 0) {
            return i;
        }
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (windowManager != null) {
            Point point = new Point();
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAySbspStFS7vOyqGsL4yje30=", null)).getSize(point);
            LIZJ = point.x;
            LIZLLL = point.y;
        }
        if (LIZJ == 0 || LIZLLL == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            LIZJ = displayMetrics.widthPixels;
            LIZLLL = displayMetrics.heightPixels;
        }
        return LIZJ;
    }
}
