package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0ksn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336470ksn {
    public static final int LIZ(Context context) throws Throwable {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kqamJ9c/6hb9Hi3StfzmTNTsiH", null));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayLLILZIL.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static final int LIZIZ(Context context) throws Throwable {
        Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kqamJ9c/6hb9Hi3StfzmTNTsiH", null));
        Point point = new Point();
        displayLLILZIL.getSize(point);
        return point.x;
    }

    public static final boolean LIZJ(Context context) {
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
