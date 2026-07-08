package X;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0FV2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FV2 {
    public static int LIZ;
    public static int LIZIZ;

    public static int LIZ(Context context) {
        DisplayMetrics displayMetrics;
        Display displayLLILZIL;
        int i = LIZIZ;
        if (i != 0 || context == null) {
            return i;
        }
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (windowManager != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2g1fX42dOGhd9HbyDt3RKc0Axa57vJP033y/w==", null))) != null) {
            Point point = new Point();
            displayLLILZIL.getSize(point);
            LIZ = point.x;
            LIZIZ = point.y;
        }
        if ((LIZ == 0 || LIZIZ == 0) && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
            LIZ = displayMetrics.widthPixels;
            LIZIZ = displayMetrics.heightPixels;
        }
        return LIZIZ;
    }

    public static int LIZIZ(Context context) {
        DisplayMetrics displayMetrics;
        Display displayLLILZIL;
        int i = LIZ;
        if (i != 0 || context == null) {
            return i;
        }
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (windowManager != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2g1fX42dOGhd9HbyDt3RKc0Axa57vJP033y/w==", null))) != null) {
            Point point = new Point();
            displayLLILZIL.getSize(point);
            LIZ = point.x;
            LIZIZ = point.y;
        }
        if ((LIZ == 0 || LIZIZ == 0) && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
            LIZ = displayMetrics.widthPixels;
            LIZIZ = displayMetrics.heightPixels;
        }
        return LIZ;
    }
}
