package X;

import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0UyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789710UyP {
    public static Method LIZ(String str) {
        if (C789720UyQ.LIZIZ.get(str) != null) {
            return null;
        }
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = C789720UyQ.LIZ;
            Method declaredMethod = concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C789720UyQ.LIZIZ.put(str, Boolean.TRUE);
            return null;
        }
    }

    public static Object LIZIZ(Object obj, String str, Object obj2) {
        Object objInvoke;
        Method methodLIZ;
        try {
            try {
                methodLIZ = LIZ(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (methodLIZ != null) {
                objInvoke = methodLIZ.invoke(obj, new Object[0]);
            } else {
                objInvoke = obj2;
            }
            if (objInvoke != null) {
                return objInvoke;
            }
            return obj2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }
}
