package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1958907lr {
    public static final Method LIZ;
    public static final HashMap<String, Field> LIZIZ = new HashMap<>();

    static {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            LIZ = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Field LIZ(Class cls, String str) {
        String str2 = cls.getName() + e3.d + str;
        HashMap<String, Field> map = LIZIZ;
        if (map.containsKey(str2)) {
            return map.get(str2);
        }
        Field declaredField = null;
        while (cls != null && cls != Object.class) {
            try {
                Method method = LIZ;
                if (method != null) {
                    declaredField = (Field) C2204961BRm.a0(method, cls, new Object[]{str}, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrnefn6WvofFe5V6Gw2EWE1prX9z9ZoO+131uf+kaQ7jxp8EEf7KgMImDVvBw==", null));
                } else {
                    declaredField = cls.getDeclaredField(str);
                }
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (declaredField != null) {
                LIZIZ.put(str2, declaredField);
                return declaredField;
            }
            cls = cls.getSuperclass();
        }
        LIZIZ.put(str2, null);
        return null;
    }
}
