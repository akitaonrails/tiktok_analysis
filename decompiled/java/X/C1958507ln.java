package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1958507ln {
    public static Field LIZ(Class cls) {
        boolean z;
        Field field;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 || (i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                Field field2 = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, "mLastProcessState");
                field2.setAccessible(true);
                return field2;
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                } catch (Throwable th2) {
                    return null;
                }
            }
        }
        String str = cls.toString() + "#mLastProcessState";
        Map<String, Field> map = C1954507l9.LIZ;
        synchronized (map) {
            try {
                field = (Field) ((HashMap) map).get(str);
            } finally {
            }
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField("mLastProcessState");
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Map<String, Field> map2 = C1954507l9.LIZ;
                synchronized (map2) {
                    try {
                        ((HashMap) map2).put(str, declaredField);
                    } finally {
                    }
                }
                return declaredField;
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
                cls = cls.getSuperclass();
            }
        }
        return null;
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
