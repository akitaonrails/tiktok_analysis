package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: X.07m1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1959907m1 {
    public static final HashMap<String, Method> LIZ = new HashMap<>();
    public static boolean LIZIZ = false;

    public static Method LIZ(String str) {
        Method methodLIZ;
        HashMap<String, Method> map = LIZ;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        try {
            methodLIZ = C1958107lj.LIZ(Class.forName("com.ss.android.agilelogger.ALog"), str, new Class[]{String.class, String.class});
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C1520960pgM.LIZIZ(e);
            methodLIZ = null;
        }
        LIZ.put(str, methodLIZ);
        return methodLIZ;
    }

    public static boolean LIZIZ(Method method, String str, String str2) {
        if (!LIZIZ) {
            try {
                Method methodLIZ = C1958107lj.LIZ(Class.forName("com.ss.android.agilelogger.ALog"), "isInitSuccess", null);
                if (methodLIZ != null) {
                    methodLIZ.setAccessible(true);
                    Object objInvoke = methodLIZ.invoke(null, new Object[0]);
                    if (objInvoke instanceof Boolean) {
                        LIZIZ = ((Boolean) objInvoke).booleanValue();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (!LIZIZ) {
                return false;
            }
        }
        if (method != null) {
            try {
                method.invoke(null, str, str2);
                return true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1520960pgM.LIZIZ(th2);
            }
        }
        return false;
    }
}
