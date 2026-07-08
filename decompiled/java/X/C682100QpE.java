package X;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682100QpE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C19EG c19eg) {
        if (c19eg.getWindow() == null) {
            return;
        }
        C1A6V c1a6v = new C1A6V(c19eg.getWindow(), c19eg.getWindow().getDecorView());
        SAFHelper.LIZ.getClass();
        if (!SAFHelper.LJIIJ()) {
            c1a6v.LIZJ(false);
            c1a6v.LIZIZ(true);
        }
        Window window = c19eg.getWindow();
        if (window != null && Build.VERSION.SDK_INT >= 26) {
            window.setNavigationBarColor(-1);
            C1360720lVu.LIZJ(window, true);
        }
    }

    public static void LIZ(C19EG c19eg, Context context) {
        Integer numLIZJ;
        if (context == null || c19eg.getWindow() == null) {
            return;
        }
        C1A6V c1a6v = new C1A6V(c19eg.getWindow(), c19eg.getWindow().getDecorView());
        SAFHelper.LIZ.getClass();
        if (!SAFHelper.LJIIJ()) {
            c1a6v.LIZJ(false);
            c1a6v.LIZIZ(false);
        }
        if (Build.VERSION.SDK_INT >= 26 && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            c19eg.getWindow().setNavigationBarColor(numLIZJ.intValue());
            C1360720lVu.LIZJ(c19eg.getWindow(), false);
        }
    }
}
