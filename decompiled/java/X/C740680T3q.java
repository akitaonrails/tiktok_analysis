package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740680T3q {
    public static final Map<String, Integer> LIZ = new ConcurrentHashMap();
    public static final Map<Integer, String> LIZIZ = new ConcurrentHashMap();

    public static Integer LIZ(String str) {
        if (str == null) {
            return null;
        }
        Map<String, Integer> map = LIZ;
        Integer num = (Integer) ((ConcurrentHashMap) map).get(str);
        if (num != null) {
            return num;
        }
        synchronized (map) {
            try {
                Integer num2 = (Integer) ((ConcurrentHashMap) map).get(str);
                if (num2 != null) {
                    return num2;
                }
                Integer numValueOf = Integer.valueOf(C20885716oB.LIZ(str));
                if (numValueOf.intValue() != -1) {
                    ((ConcurrentHashMap) map).put(str, numValueOf);
                    ((ConcurrentHashMap) LIZIZ).put(numValueOf, str);
                }
                return numValueOf;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LIZIZ(int i) {
        Map<Integer, String> map = LIZIZ;
        String str = (String) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        synchronized (map) {
            try {
                String str2 = (String) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
                if (str2 != null) {
                    return str2;
                }
                String strLIZIZ = C20885716oB.LIZIZ(i);
                if (strLIZIZ != null) {
                    ((ConcurrentHashMap) map).put(Integer.valueOf(i), strLIZIZ);
                    ((ConcurrentHashMap) LIZ).put(strLIZIZ, Integer.valueOf(i));
                }
                return strLIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
