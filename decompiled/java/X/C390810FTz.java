package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0FTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390810FTz {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static Point LIZIZ(Context context) {
        Point point = new Point();
        C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEd/bVhkgSxaWaVj4PP6E5MRAQI1mHsaCOacJWDzXswlK+pDj9rUJ", null)).getRealSize(point);
        return point;
    }

    public static int LIZJ(Context context) {
        return LIZIZ(context).x;
    }
}
