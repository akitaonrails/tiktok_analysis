package X;

import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0UwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788350UwD {
    public static Method LIZ(String str) {
        if (C788360UwE.LIZIZ.get(str) != null) {
            return null;
        }
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = C788360UwE.LIZ;
            Method declaredMethod = concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C788360UwE.LIZIZ.put(str, Boolean.TRUE);
            return null;
        }
    }
}
