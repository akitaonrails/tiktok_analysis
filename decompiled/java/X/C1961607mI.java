package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07mI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1961607mI {
    public static Method LIZ(Class<?> cls, String str, Class<?>[] clsArr) {
        if (!C2093608Ic.LJ(str)) {
            try {
                return cls.getMethod(str, clsArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return null;
                }
            }
        }
        return null;
    }

    public static Object LIZIZ(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr, Object... objArr2) {
        if (!C2093608Ic.LJ(str)) {
            if (clsArr == null) {
                clsArr = new Class[0];
            }
            if (objArr == null) {
                objArr = new Object[0];
            }
            try {
                Method methodLIZ = LIZ(cls, str, clsArr);
                if (methodLIZ == null) {
                    return null;
                }
                methodLIZ.setAccessible(true);
                if (objArr2.length > 0) {
                    return C2204961BRm.a0(methodLIZ, objArr2[0], objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8tdof/xwVMiSRiloB4siNQSrRwY/w==", null));
                }
                return C2204961BRm.a0(methodLIZ, null, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8tdof/xwVMiSRiloB4siNQSrRwY/w==", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }
}
