package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07mD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1961107mD {
    public static Field LIZ(Class<?> cls, String str) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 || (i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
                field.setAccessible(true);
                return field;
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return null;
                }
            }
        }
        return C1958707lp.LIZ(cls, str);
    }

    public static Object LIZJ(Object obj, String str) {
        try {
            return LIZ(obj.getClass(), str).get(obj);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
