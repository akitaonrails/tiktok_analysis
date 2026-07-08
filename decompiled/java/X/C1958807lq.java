package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1958807lq {
    public static Field LIZ(Class<?> cls, String str) {
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
                Field field2 = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
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
        String str2 = cls.toString() + "#" + str;
        Map<String, Field> map = C1954607lA.LIZ;
        synchronized (map) {
            try {
                field = (Field) ((HashMap) map).get(str2);
            } finally {
                TryCatchGuardChecker.doCheck(th2);
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
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Map<String, Field> map2 = C1954607lA.LIZ;
                synchronized (map2) {
                    try {
                        ((HashMap) map2).put(str2, declaredField);
                    } catch (Throwable th22) {
                        throw th22;
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
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Object LIZJ(Object obj, Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyVa7cmL/N3ioXqsJzYVuJ0xzYo3Bp/t+UN2WRS1fU5", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}
