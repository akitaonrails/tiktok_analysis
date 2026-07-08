package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.0DRA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DRA {
    public static void LIZ(Window window, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            C0DRB.LIZ(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility & (-1793);
        } else {
            i = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i);
    }
}
