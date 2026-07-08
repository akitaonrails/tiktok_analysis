package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07mZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1963307mZ {
    public static final Map<String, Field> LIZ = new HashMap();

    public static Field LIZ(Class<?> cls, String str) {
        Field field;
        Field declaredField;
        if (cls != null) {
            if (!TextUtils.isEmpty(str)) {
                String str2 = cls.toString() + "#" + str;
                Map<String, Field> map = LIZ;
                synchronized (map) {
                    try {
                        field = (Field) ((HashMap) map).get(str2);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
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
                        if (!C1963507mb.LIZ() || (declaredField = C1963407ma.LIZ(cls, str)) == null) {
                            declaredField = cls.getDeclaredField(str);
                        }
                        if (!declaredField.isAccessible()) {
                            declaredField.setAccessible(true);
                        }
                        Map<String, Field> map2 = LIZ;
                        synchronized (map2) {
                            try {
                                ((HashMap) map2).put(str2, declaredField);
                            } catch (Throwable th) {
                                throw th;
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
            throw new IllegalArgumentException("The field name must not be blank");
        }
        throw new IllegalArgumentException("The class must not be null");
    }
}
