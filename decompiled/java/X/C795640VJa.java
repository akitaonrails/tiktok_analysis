package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795640VJa {
    public static final Map<String, Map<String, String>> LIZ = new LinkedHashMap();

    public static Map LJ(Map map, C0VJY c0vjy) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            int i = C0VJZ.LIZ[c0vjy.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    linkedHashMap.put("strategy_status", "end");
                }
                return linkedHashMap;
            }
            linkedHashMap.put("strategy_status", "running");
            return linkedHashMap;
        }
        return map;
    }

    public static Map LIZ(String str, Map map, Map map2, C0VJY c0vjy) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2 != null) {
            linkedHashMap.put("tech", map2);
        }
        Map mapLJ = LJ(map, c0vjy);
        if (mapLJ != null) {
            linkedHashMap.put("spec", mapLJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_audit_aspect_");
        sbLIZ.append(c0vjy.getValue());
        linkedHashMap.put("event_name", C2188811AlT.LIZIZ(sbLIZ));
        return linkedHashMap;
    }

    public static C0W6I LIZJ(String str, Map map, Map map2, C0VJY c0vjy) {
        Map map3;
        if (map2 != null) {
            return new C0W6I(str, LIZ(str, map, map2, c0vjy));
        }
        Map<String, Map<String, String>> map4 = LIZ;
        if (map4 != null) {
            map3 = (Map) ((LinkedHashMap) map4).get(str);
        } else {
            map3 = null;
        }
        return new C0W6I(str, LIZ(str, map, map3, c0vjy));
    }

    public static Map LIZIZ(String str, Map map, Map map2, JSONObject jSONObject, C0VJY c0vjy) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2 != null) {
            linkedHashMap.put("tech", map2);
        }
        Map mapLJ = LJ(map, c0vjy);
        if (mapLJ != null) {
            linkedHashMap.put("spec", mapLJ);
        }
        if (jSONObject != null) {
            linkedHashMap.put("params", jSONObject);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_audit_aspect_");
        sbLIZ.append(c0vjy.getValue());
        linkedHashMap.put("event_name", C2188811AlT.LIZIZ(sbLIZ));
        return linkedHashMap;
    }

    public static C0W6I LIZLLL(String str, Map map, Map map2, JSONObject jSONObject, C0VJY c0vjy) {
        Map map3;
        if (map2 != null) {
            return new C0W6I(str, LIZIZ(str, map, map2, jSONObject, c0vjy));
        }
        Map<String, Map<String, String>> map4 = LIZ;
        if (map4 != null) {
            map3 = (Map) ((LinkedHashMap) map4).get(str);
        } else {
            map3 = null;
        }
        return new C0W6I(str, LIZIZ(str, map, map3, jSONObject, c0vjy));
    }
}
