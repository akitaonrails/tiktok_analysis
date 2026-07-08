package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07nL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1968107nL {
    public static final Map<String, Method> LIZ = new HashMap();

    public static Method LIZJ(String str) {
        Method method;
        Map<String, Method> map = LIZ;
        synchronized (map) {
            try {
                method = (Method) ((HashMap) map).get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        return null;
    }

    public static Object LIZLLL(Class cls, Object... objArr) throws NoSuchMethodException {
        Object[] objArr2;
        Class<?>[] clsArr;
        Class<?> cls2;
        if (objArr.length > 0) {
            objArr2 = objArr;
        } else {
            objArr2 = C1968207nM.LIZ;
        }
        if (objArr.length == 0) {
            clsArr = C1968207nM.LIZIZ;
        } else {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    cls2 = null;
                } else {
                    cls2 = obj.getClass();
                }
                clsArr[i] = cls2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#currentActivityThread");
        if (clsArr.length > 0) {
            for (Class<?> cls3 : clsArr) {
                sb.append(cls3.toString());
                sb.append("#");
            }
        } else {
            sb.append(Void.class.toString());
        }
        String string = sb.toString();
        Method methodLIZJ = LIZJ(string);
        if (methodLIZJ == null) {
            try {
                methodLIZJ = cls.getMethod("currentActivityThread", clsArr);
                C1968007nK.LIZJ(methodLIZJ);
                Map<String, Method> map = LIZ;
                synchronized (map) {
                    try {
                        ((HashMap) map).put(string, methodLIZJ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                methodLIZJ = LIZ(cls, string, clsArr);
            }
        }
        if (methodLIZJ != null) {
            if (objArr2.length <= 0) {
                objArr2 = C1968207nM.LIZ;
            }
            return C2204961BRm.a0(methodLIZJ, null, objArr2, new C0WZX("dzBzEgAjS8/YVFkiQFyJaZYcJ8F1QKUvN/qh56A3GHGbWQx+JvI=", null));
        }
        throw new NoSuchMethodException("No such accessible method: currentActivityThread() on object: ".concat(cls.getName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
    
        r9 = r1.getMethod(r3, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Method LIZ(java.lang.Class r12, java.lang.String r13, java.lang.Class... r14) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1968107nL.LIZ(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (Modifier.isPublic(interfaces[i].getModifiers())) {
                    try {
                        return interfaces[i].getDeclaredMethod(str, clsArr);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        Method methodLIZIZ = LIZIZ(interfaces[i], str, clsArr);
                        if (methodLIZIZ != null) {
                            return methodLIZIZ;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }
}
