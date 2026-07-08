package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07l8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1954407l8 {
    public static final Map<String, Field> LIZ = new HashMap();
    public static boolean LIZIZ;

    static {
        new HashMap();
        new HashMap();
        LIZIZ = false;
    }

    public static Field LIZ(Class<?> cls, String str) {
        Field field;
        if (cls != null) {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(cls.getName());
                sbLIZ.append("#");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Map<String, Field> map = LIZ;
                synchronized (map) {
                    try {
                        field = (Field) ((HashMap) map).get(strLIZIZ);
                    } finally {
                    }
                }
                if (field != null) {
                    if (!field.isAccessible()) {
                        field.setAccessible(true);
                    }
                    return field;
                }
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    if (declaredField != null && !declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    if (declaredField != null) {
                        synchronized (map) {
                            try {
                                ((HashMap) map).put(strLIZIZ, declaredField);
                            } finally {
                            }
                        }
                        return declaredField;
                    }
                    return declaredField;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }
            throw new IllegalArgumentException("The field name must not be blank !!!");
        }
        throw new IllegalArgumentException("The class must not be null !!!");
    }
}
