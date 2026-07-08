package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ip6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257300ip6 {
    public static final C1257300ip6 LIZ = new C1257300ip6();

    public static int LIZ(Context context) {
        Resources resources;
        int iN3;
        Activity activityLIZ;
        Window window;
        View decorView;
        View rootView;
        WindowInsets rootWindowInsets;
        Insets insets;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || (window = activityLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null || (rootWindowInsets = rootView.getRootWindowInsets()) == null || (insets = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars())) == null) {
                return 0;
            }
            return insets.bottom;
        }
        if (context != null && (resources = context.getResources()) != null && (iN3 = C786410Ut5.n3(resources, "navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(iN3);
        }
        return 0;
    }
}
