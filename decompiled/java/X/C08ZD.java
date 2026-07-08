package X;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08ZD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08ZD {
    public static int LIZ = -1;
    public static int LIZIZ = -1;

    public static void LIZ(Context context) throws Throwable {
        WindowManager windowManager;
        try {
            Object objH2 = C786410Ut5.H2(context, "window");
            if ((objH2 instanceof WindowManager) && (windowManager = (WindowManager) objH2) != null) {
                Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvWla6T/3ebr2Gu4ZWNWm/fit1VrveoMR", null));
                Point point = new Point();
                if (displayLLILZIL == null) {
                    return;
                }
                displayLLILZIL.getRealSize(point);
                LIZ = point.y;
                LIZIZ = point.x;
                return;
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            LIZ = displayMetrics.heightPixels;
            LIZIZ = displayMetrics.widthPixels;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
