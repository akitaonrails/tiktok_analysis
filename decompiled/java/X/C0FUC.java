package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0FUC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FUC {
    public static int LIZIZ() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int LIZJ() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static Point LIZ(Context context) {
        Point point = new Point();
        C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFoNaBmU/+ZTsXcOLW1o6jvjs=", null)).getRealSize(point);
        return point;
    }
}
