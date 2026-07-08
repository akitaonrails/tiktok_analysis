package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ooW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487580ooW {
    public static void LIZ(String str) {
        ConcurrentHashMap<String, C1487570ooV> concurrentHashMap = C1487570ooV.LIZIZ;
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        concurrentHashMap.put(str, new C1487570ooV(C1487570ooV.LIZLLL));
        C1487570ooV.LIZJ.add(str);
        C1487570ooV.LJ++;
        C1487570ooV.LIZLLL++;
        if (C1487570ooV.LJ >= 24) {
            int i = (C1487570ooV.LIZLLL - 24) + 8;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C1487570ooV> entry : concurrentHashMap.entrySet()) {
                if (entry.getValue().LIZ < i) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(linkedHashMap.keySet());
            C1487570ooV.LIZIZ.keySet().removeAll(setLLIIJI);
            C1487570ooV.LIZJ.removeAll(setLLIIJI);
            C1487570ooV.LJ -= setLLIIJI.size();
        }
    }
}
