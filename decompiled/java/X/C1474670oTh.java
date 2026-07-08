package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474670oTh {
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C1474680oTi> LIZIZ = new ConcurrentHashMap<>();

    public static Integer LIZ(String str) {
        String str2;
        C1474680oTi c1474680oTi;
        C1474690oTj c1474690oTj;
        if (str == null || (str2 = LIZ.get(str)) == null || (c1474680oTi = LIZIZ.get(str2)) == null || (c1474690oTj = c1474680oTi.LIZ.get(str)) == null) {
            return null;
        }
        return Integer.valueOf(c1474690oTj.LIZIZ);
    }

    public static void LIZIZ(String str, String str2, int i, long j, AbstractC1474630oTd abstractC1474630oTd) {
        C1474680oTi c1474680oTiPutIfAbsent;
        if (str != null && str2 != null) {
            LIZ.put(str, str2);
            ConcurrentHashMap<String, C1474680oTi> concurrentHashMap = LIZIZ;
            C1474680oTi c1474680oTi = concurrentHashMap.get(str2);
            if (c1474680oTi == null && (c1474680oTiPutIfAbsent = concurrentHashMap.putIfAbsent(str2, (c1474680oTi = new C1474680oTi()))) != null) {
                c1474680oTi = c1474680oTiPutIfAbsent;
            }
            c1474680oTi.LIZ.put(str, new C1474690oTj(str, i, j, abstractC1474630oTd));
        }
    }
}
