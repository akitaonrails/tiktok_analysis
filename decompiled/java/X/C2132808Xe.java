package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.08Xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2132808Xe {
    public static int LIZ = -1;
    public static int LIZIZ = -1;

    public static int[] LIZJ() {
        DisplayMetrics displayMetrics = C1948707kD.LIZ().getApplicationContext().getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int LIZ(Context context) {
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

    public static int LIZIZ(Context context) throws Throwable {
        int i = LIZIZ;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        int[] iArrLIZLLL = LIZLLL(context);
        LIZ = iArrLIZLLL[0];
        int i2 = iArrLIZLLL[1];
        LIZIZ = i2;
        if (i2 <= 0) {
            return 0;
        }
        return i2;
    }

    public static int[] LIZLLL(Context context) throws Throwable {
        if (context == null) {
            return new int[]{-1, -1};
        }
        try {
            WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
            if (windowManager != null) {
                Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnuxeu5Rue0rgOE52KcXyA11og==", null));
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

    public static int LJ(Context context) throws Throwable {
        int i = LIZ;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        int[] iArrLIZLLL = LIZLLL(context);
        int i2 = iArrLIZLLL[0];
        LIZ = i2;
        LIZIZ = iArrLIZLLL[1];
        if (i2 <= 0) {
            return 0;
        }
        return i2;
    }
}
