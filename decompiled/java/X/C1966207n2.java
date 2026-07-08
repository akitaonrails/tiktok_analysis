package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07n2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1966207n2 {
    public static Object LIZIZ(Object[] objArr) {
        try {
            Method methodLIZ = LIZ(Class.forName("android.os.SystemProperties"), objArr);
            methodLIZ.setAccessible(true);
            return C2204961BRm.a0(methodLIZ, null, objArr, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHSelQaZMhoiJRq0AlVDvj+AOqWg2ibWw==", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJ("TEReflectUtil", "couldn't invoke get, " + e);
            return null;
        }
    }

    public static Method LIZ(Class cls, Object[] objArr) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals("get")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes != null && parameterTypes.length != 0) {
                    if (parameterTypes.length == objArr.length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            Object obj = objArr[i];
                            if (obj == null || parameterTypes[i].isAssignableFrom(obj.getClass())) {
                            }
                        }
                        return method;
                    }
                    continue;
                } else if (objArr.length == 0) {
                    return method;
                }
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            return LIZ(superclass, objArr);
        }
        return null;
    }
}
