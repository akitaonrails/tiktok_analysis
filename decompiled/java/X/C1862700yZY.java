package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yZY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862700yZY {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("screen_type", "inspiration_session_id", "bot_type", "session_source", "tako_session_id", "tako_chat_id");
    public static final ConcurrentHashMap<String, Map<String, String>> LIZIZ = new ConcurrentHashMap<>();

    public static Map LIZ(Map map) {
        String str = (String) map.get("process_id");
        if (str != null) {
            Map mapLIZIZ = LIZIZ(str, LIZ);
            if (!mapLIZIZ.isEmpty()) {
                return C2097608Jq.LJIIL(map, mapLIZIZ);
            }
            return map;
        }
        return map;
    }

    public static Map LIZIZ(String str, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = LIZIZ.get(str);
        if (map != null) {
            for (Object obj : list) {
                String str2 = map.get(obj);
                if (str2 != null) {
                    linkedHashMap.put(obj, str2);
                }
            }
        }
        return linkedHashMap;
    }

    public static void LIZJ(String str, Pair pair, C1862790yZh c1862790yZh) {
        ConcurrentHashMap<String, Map<String, String>> concurrentHashMap = LIZIZ;
        Map linkedHashMap = concurrentHashMap.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            Map<String, String> mapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (Map<String, String>) linkedHashMap);
            if (mapPutIfAbsent != null) {
                linkedHashMap = mapPutIfAbsent;
            }
        }
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        if (c1862790yZh != null) {
            Map<String, String> mapLIZ = c1862790yZh.LIZ();
            Map<String, String> linkedHashMap2 = concurrentHashMap.get(str);
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap<>();
                Map<String, String> mapPutIfAbsent2 = concurrentHashMap.putIfAbsent(str, linkedHashMap2);
                if (mapPutIfAbsent2 != null) {
                    linkedHashMap2 = mapPutIfAbsent2;
                }
            }
            linkedHashMap2.putAll(mapLIZ);
        }
    }
}
