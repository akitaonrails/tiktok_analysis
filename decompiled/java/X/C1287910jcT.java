package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0jcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287910jcT {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZLLL() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static int LIZ(int i) {
        return (int) ((i * LIZLLL()) + 0.5f);
    }

    public static int LIZIZ(float f) {
        return (int) ((f * LIZLLL()) + 0.5f);
    }

    public static float LIZJ(float f) {
        return (f * LIZLLL()) + 0.5f;
    }

    public static Point LJ(Context context) {
        Point point = new Point();
        C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEgAjS8/YVFkiQFyBYEX3a2w90uwm6aLMSbFiJWE1UvIsGBUlSnj4PBTU1O2EsO+S9HiRGTUMaRP0EdJK", null)).getRealSize(point);
        return point;
    }
}
