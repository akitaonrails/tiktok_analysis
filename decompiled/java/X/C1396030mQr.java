package X;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0mQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396030mQr {
    public static final C1396030mQr LIZ = new C1396030mQr();

    public static int LIZIZ(Activity activity) throws Throwable {
        int iLIZLLL;
        int iLIZJ = LIZJ(activity);
        DisplayMetrics displayMetricsLIZ = C14KZ.LIZ(activity);
        if (displayMetricsLIZ != null) {
            iLIZLLL = displayMetricsLIZ.heightPixels;
        } else {
            iLIZLLL = 0;
        }
        if (C20642515q3.LJFF().getConfiguration().orientation == 1 && C14KZ.LJ(activity) == EnumC1153710g81.RET_TRUE) {
            iLIZLLL += C14KZ.LIZLLL(activity);
        }
        return iLIZJ - iLIZLLL;
    }

    public static int LIZJ(Context context) throws Throwable {
        Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkifFJUT/QSHhdbOgTJ8=", null));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i = 0;
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(displayLLILZIL, displayMetrics);
            i = displayMetrics.heightPixels;
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    public static float LIZ(float f, Context context) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int LIZLLL(float f, Context context) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
