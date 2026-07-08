package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.08Xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2132908Xf {
    public static int LIZ(Context context) {
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWugrzj+hbYmH1oRLzWAw7BEeAdQ==", null)).getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int LIZIZ(Context context) {
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWugrzj+hbYmH1oRLzWAw7BEeAdQ==", null)).getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}
