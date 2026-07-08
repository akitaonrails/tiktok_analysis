package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0FU0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FU0 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static Point LIZIZ(Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (!((Boolean) C275430Aqr.LIZ.getValue()).booleanValue()) {
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEd/bVhkgSxaWaVj4PP6E5MRAQI1wDdSEfPyqAM5kEAbyUPHFItd6VQ==", null)).getRealSize(point);
            return point;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = C2204961BRm.LLILZ(windowManager, new C0WZX("dzBzEhEpEd/bVhkgSxaWaVj4PP6E5MRAQI1wDdSEfPyqAM5kEAbyUPHFItd6VQ==", null)).getBounds();
            point.x = bounds.width();
            point.y = bounds.height();
            return point;
        }
        C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEd/bVhkgSxaWaVj4PP6E5MRAQI1wDdSEfPyqAM5kEAbyUPHFItd6VQ==", null)).getSize(point);
        return point;
    }

    public static int LIZJ(Context context) {
        return LIZIZ(context).x;
    }
}
