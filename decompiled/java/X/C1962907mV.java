package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07mV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1962907mV {
    public static final Map<String, Field> LIZ = new HashMap();

    public static Field LIZ(Class<?> cls, String str) {
        Field field;
        if (!TextUtils.isEmpty(str)) {
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
                    C1963007mW.LIZ();
                    Field declaredField = cls.getDeclaredField(str);
                    if (declaredField != null) {
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
                    }
                    return declaredField;
                } catch (NoSuchFieldException e) {
                    TryCatchGuardChecker.doCheck(e);
                    cls = cls.getSuperclass();
                }
            }
            return null;
        }
        throw new IllegalArgumentException("The field name must not be blank");
    }

    public static Object LIZIZ(Field field, Object obj) {
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    public static void LIZJ(Object obj, String str, Object obj2) throws IllegalAccessException {
        C1963107mX.LIZ(obj, "target object must not be null");
        Field fieldLIZ = LIZ(obj.getClass(), str);
        if (fieldLIZ != null) {
            if (!fieldLIZ.isAccessible()) {
                fieldLIZ.setAccessible(true);
            }
            fieldLIZ.set(obj, obj2);
        }
    }
}
