package X;

import android.app.Activity;
import android.view.Window;

/* JADX INFO: renamed from: X.0vQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741950vQn {
    public static void LIZ(Activity activity) {
        if (C2162308dZ.LIZJ()) {
            activity.getWindow().addFlags(67108864);
            return;
        }
        Window window = activity.getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }
}
