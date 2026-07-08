package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00mV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C179300mV {
    public static final Map<String, Map<InterfaceC1467090oHT, Long>> LIZ = new ConcurrentHashMap();
    public static final Map<String, Map<InterfaceC1467090oHT, Long>> LIZIZ = new ConcurrentHashMap();

    public static String LIZ(InterfaceC1470660oNE interfaceC1470660oNE, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Map map2 = (Map) entry.getValue();
            long j = 0;
            for (Map.Entry entry2 : map2.entrySet()) {
                Object key = entry2.getKey();
                long jLongValue = ((Number) entry2.getValue()).longValue();
                long j2 = jCurrentTimeMillis - jLongValue;
                if (jLongValue > 0) {
                    j += j2;
                }
                map2.put(key, Long.valueOf(jCurrentTimeMillis));
                if (Intrinsics.LJFF(interfaceC1470660oNE, key)) {
                    map2.remove(key);
                }
                if (map2.isEmpty()) {
                    concurrentHashMap.remove(str);
                }
            }
            sb.append(str);
            sb.append("=");
            sb.append(j);
            sb.append(";");
        }
        return sb.toString();
    }
}
