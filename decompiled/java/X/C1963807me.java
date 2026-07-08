package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1963807me {
    public final Object LIZ;
    public final Method LIZIZ;

    public C1963807me() {
        try {
            Class<?> cls = Class.forName("com.bytedance.pia.core.ServiceProvider");
            this.LIZ = cls.newInstance();
            this.LIZIZ = cls.getMethod("get", Class.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static <T> T LIZ(Class<T> cls) {
        Method method;
        C1963807me c1963807me = C1963907mf.LIZ;
        Object obj = c1963807me.LIZ;
        T t = null;
        if (obj != null && (method = c1963807me.LIZIZ) != null) {
            try {
                t = (T) C2204961BRm.a0(method, obj, new Object[]{cls}, new C0WZX("dzBzEgAjS8/YVFkiQFyUb+fKyhgISWMgPR8Z/BbnZf+42hlXIA==", null));
                return t;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return t;
    }
}
