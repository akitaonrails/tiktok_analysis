package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14KS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14KS {
    public static int LIZLLL() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int LJFF() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static Display LIZ(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            if (Build.VERSION.SDK_INT >= 30) {
                return ((Activity) context).getDisplay();
            }
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        }
        return C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null));
    }

    public static Point LIZIZ(Context context) {
        if (context == null) {
            return new Point(-1, -1);
        }
        try {
            WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
            if (Build.VERSION.SDK_INT >= 30) {
                Rect bounds = C2204961BRm.LLILZ(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null)).getBounds();
                return new Point(bounds.width(), bounds.height());
            }
            Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null));
            Point point = new Point();
            if (displayLLILZIL == null) {
                return new Point(-1, -1);
            }
            displayLLILZIL.getRealSize(point);
            return point;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new Point(-1, -1);
        }
    }

    public static int LIZJ(Context context) {
        int iLIZLLL = LIZLLL();
        if (C2075608Be.LIZJ(context)) {
            return iLIZLLL + C497740JfY.LJIJ();
        }
        return iLIZLLL;
    }

    public static int LJ(Context context) {
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics windowMetricsLJII = LJII(context);
            if (windowMetricsLJII == null) {
                return 0;
            }
            Insets insetsIgnoringVisibility = windowMetricsLJII.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
            int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
            Rect bounds = windowMetricsLJII.getBounds();
            return new Size(bounds.width() - i, bounds.height() - i2).getHeight();
        }
        Display displayLIZ = LIZ(context);
        if (displayLIZ == null) {
            return 0;
        }
        Point point = new Point();
        displayLIZ.getSize(point);
        return point.y;
    }

    public static int LJI(Context context) {
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics windowMetricsLJII = LJII(context);
            if (windowMetricsLJII == null) {
                return 0;
            }
            return windowMetricsLJII.getBounds().width();
        }
        Display displayLIZ = LIZ(context);
        if (displayLIZ == null) {
            return 0;
        }
        Point point = new Point();
        displayLIZ.getSize(point);
        return point.x;
    }

    public static WindowMetrics LJII(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        }
        return C2204961BRm.LLILZ(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null));
    }
}
