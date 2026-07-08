package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1958707lp {
    public static final Map<String, Field> LIZ = new HashMap();

    public static Field LIZ(Class<?> cls, String str) {
        Field field;
        String str2 = cls.toString() + "#" + str;
        Map<String, Field> map = LIZ;
        synchronized (map) {
            try {
                field = (Field) ((HashMap) map).get(str2);
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
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Map<String, Field> map2 = LIZ;
                synchronized (map2) {
                    try {
                        ((HashMap) map2).put(str2, declaredField);
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

    public static Object LIZIZ(Object obj, String str) {
        Field fieldLIZ = LIZ(obj.getClass(), str);
        if (fieldLIZ != null) {
            if (!fieldLIZ.isAccessible()) {
                fieldLIZ.setAccessible(true);
            }
            return fieldLIZ.get(obj);
        }
        return null;
    }
}
