package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.14KI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public final class C14KI {
    public static final String LIZ = Build.BRAND.toLowerCase(Locale.ENGLISH);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C14KN());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C14KO());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C14KP());
    public static final C01GW LJ = C452501pT.LIZIZ(new C14KL());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C14KK());
    public static final C01GW LJI = C452501pT.LIZIZ(new C14KM());
    public static final C01GW LJII = C452501pT.LIZIZ(new C14KJ());

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.content.Context r7) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14KI.LIZ(android.content.Context):int");
    }

    public static int LIZIZ(Context context) {
        Resources resources = context.getResources();
        int iN3 = C786410Ut5.n3(resources, "navigation_bar_height", "dimen", "android");
        if (iN3 > 0) {
            return resources.getDimensionPixelSize(iN3);
        }
        return 0;
    }

    public static int LIZJ(Activity activity) {
        Rect rect = new Rect();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAySbspStFS7vOyqGsMYyfY2ecgw==", null)).getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels - (rect.top + rect.height());
    }

    public static final int LIZLLL(Context context) throws Throwable {
        WindowManager windowManager;
        if (context == null) {
            return 0;
        }
        try {
            Object objH2 = C786410Ut5.H2(context, "window");
            if ((objH2 instanceof WindowManager) && (windowManager = (WindowManager) objH2) != null) {
                Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAySbspStFS7vOyqGsMYyfY2ecgw==", null));
                Point point = new Point();
                if (displayLLILZIL == null) {
                    return 0;
                }
                displayLLILZIL.getSize(point);
                return point.x;
            }
            return C14KQ.LJIIIIZZ(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static final int LJ(Activity activity) {
        View decorView;
        C20246014Ju c20246014JuLIZ;
        C1683900tvA c1683900tvALJFF;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null || (c20246014JuLIZ = C14K4.LIZ(decorView)) == null || (c1683900tvALJFF = c20246014JuLIZ.LIZ.LJFF()) == null || Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        return C20245414Jo.LJFF(c1683900tvALJFF.LIZ);
    }

    public static boolean LJFF(Context context) {
        if (context == null || Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(Context context) {
        if (context == null) {
            return false;
        }
        int iLJ = C14KQ.LJ(context);
        int iLJIIIIZZ = C14KQ.LJIIIIZZ(context);
        if (iLJ > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640)) && iLJIIIIZZ > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360))) {
            return false;
        }
        return true;
    }
}
