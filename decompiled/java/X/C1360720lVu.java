package X;

import android.app.Activity;
import android.os.Build;
import android.view.Window;

/* JADX INFO: renamed from: X.0lVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360720lVu {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Activity activity) {
        Window window = activity.getWindow();
        if (window != null && Build.VERSION.SDK_INT >= 26) {
            window.setNavigationBarColor(-16777216);
            LIZJ(window, false);
        }
    }

    public static final void LIZIZ(C19EG c19eg) {
        Window window = c19eg.getWindow();
        if (window != null && Build.VERSION.SDK_INT >= 26) {
            window.setNavigationBarColor(-1);
            LIZJ(window, true);
        }
    }

    public static final void LIZJ(Window window, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (z) {
                window.clearFlags(134217728);
                window.addFlags(Integer.MIN_VALUE);
                i = systemUiVisibility | 16;
            } else {
                i = systemUiVisibility & (-17);
            }
            if (i != systemUiVisibility) {
                window.getDecorView().setSystemUiVisibility(i);
            }
        }
    }
}
