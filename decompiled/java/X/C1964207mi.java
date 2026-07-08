package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1964207mi {
    public static final C1964107mh LIZ = new C1964107mh();
    public static final Map<String, Object> LIZIZ = new ConcurrentHashMap();

    public static Object LIZ(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        Object obj = concurrentHashMap.get(str);
        if (obj != null) {
            return obj;
        }
        LIZ.getClass();
        String strLIZ = C1964107mh.LIZ(str);
        if (strLIZ != null) {
            concurrentHashMap.put(str, strLIZ);
        }
        return strLIZ;
    }
}
