package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.04au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1126604au {
    public static volatile Map<String, Object> LIZ = new ConcurrentHashMap();

    public static <T> T LIZ(String str) {
        T t;
        try {
            T t2 = (T) ((ConcurrentHashMap) LIZ).get(str);
            if (t2 == null) {
                synchronized (C1126604au.class) {
                    try {
                        t = (T) ((ConcurrentHashMap) LIZ).get(str);
                        if (t == null) {
                            t = (T) Class.forName(str).newInstance();
                            ((ConcurrentHashMap) LIZ).put(str, t);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return t;
            }
            return t2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
