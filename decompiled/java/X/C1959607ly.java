package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07ly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1959607ly {
    public static C1959607ly LIZ;

    public static Method LIZ(Class cls, String str, Class... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Object LIZIZ(Object obj, Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyJaZYcJ8F1QKUvN/qh36swEXiaulQ7rgePb1IHJdS9HQ==", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}
