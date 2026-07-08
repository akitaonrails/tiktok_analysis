package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07lo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1958607lo {
    public static final Map<String, Field> LIZ = new HashMap();

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
        Map<String, Field> map = LIZ;
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
                Map<String, Field> map2 = LIZ;
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
}
