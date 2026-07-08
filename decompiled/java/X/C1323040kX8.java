package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0kX8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323040kX8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Window window, boolean z) {
        int i;
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZIZ(Activity activity, Window window, boolean z) {
        if (activity != null && window != null) {
            try {
                View decorView = window.getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                if (!z) {
                    decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                } else {
                    decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                }
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                if (C2451209j4.LIZLLL()) {
                    LIZ(window, z);
                }
                if (C2451209j4.LIZJ()) {
                    C1323020kX6.LIZ(activity, z, true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
