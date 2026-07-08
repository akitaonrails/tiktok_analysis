package X;

import android.os.Build;
import android.view.Window;

/* JADX INFO: renamed from: X.0lkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370030lkv {
    public static final void LIZ(Window window) {
        if (Build.VERSION.SDK_INT >= 26) {
            window.setNavigationBarColor(-1);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            int i = systemUiVisibility | 16;
            if (i != systemUiVisibility) {
                window.getDecorView().setSystemUiVisibility(i);
            }
        }
    }
}
