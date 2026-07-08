package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0kX6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323020kX6 {
    public static final int LIZ;
    public static final Field LIZIZ;
    public static final Method LIZJ;

    static {
        try {
            Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZIZ = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZJ = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }

    public static void LIZIZ(Window window, boolean z) {
        int i;
        int i2;
        if (C2451209j4.LIZ < 23) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            try {
                Field declaredField = attributes.getClass().getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                declaredField.setAccessible(true);
                int i3 = declaredField.getInt(attributes);
                Field declaredField2 = attributes.getClass().getDeclaredField("meizuFlags");
                declaredField2.setAccessible(true);
                int i4 = declaredField2.getInt(attributes);
                if (z) {
                    i2 = i3 | i4;
                } else {
                    i2 = (~i3) & i4;
                }
                if (i4 != i2) {
                    declaredField2.setInt(attributes, i2);
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = LIZ | systemUiVisibility;
        } else {
            i = (~LIZ) & systemUiVisibility;
        }
        if (i != systemUiVisibility) {
            decorView.setSystemUiVisibility(i);
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        Field field = LIZIZ;
        if (field != null) {
            try {
                if (field.getInt(attributes2) != 0) {
                    field.set(attributes2, 0);
                    window.setAttributes(attributes2);
                }
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void LIZ(Activity activity, boolean z, boolean z2) throws Throwable {
        Method method = LIZJ;
        if (method != null) {
            try {
                C2204961BRm.a0(method, activity, new Object[]{Boolean.valueOf(z)}, new C0WZX("dzBzEgAjS8/YVFkiQFyNa64pcCva5iUtsnf/Krexh6ckPkLNqo4f76L1nC2YsbvsDWa0xA==", null));
                return;
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            } catch (InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        if (z2) {
            LIZIZ(activity.getWindow(), z);
        }
    }
}
