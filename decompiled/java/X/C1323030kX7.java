package X;

import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323030kX7 {
    public static final void LIZ(Window window) {
        if (window != null) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            if (C2451209j4.LIZLLL()) {
                try {
                    Class<?> cls = window.getClass();
                    Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                    int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                    Class<?> cls3 = Integer.TYPE;
                    cls.getMethod("setExtraFlags", cls3, cls3).invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (C2451209j4.LIZJ()) {
                C1323020kX6.LIZIZ(window, true);
            }
        }
    }
}
