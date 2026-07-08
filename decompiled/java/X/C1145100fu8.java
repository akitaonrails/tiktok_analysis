package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.0fu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145100fu8 {
    public static void LIZ(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }
}
