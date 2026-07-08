package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07z4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2040807z4 {
    public static final boolean LIZ;

    static {
        Method method = C2040707z3.LIZIZ;
        boolean z = false;
        if (method != null) {
            try {
                if (((Integer) C2204961BRm.a0(method, null, new Object[]{"debug.watson.log", 0}, new C0WZX("dzBzEgAjS8/YVFkiQFyTZ17d7BzqoAoS7urIfx2mZIzDV8zN5+ga3N+/ywdI6exHPKg=", null))).intValue() == 1) {
                    z = true;
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        LIZ = z;
    }
}
