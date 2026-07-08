package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJQ {
    public static final C0VJQ LIZ = new C0VJQ();
    public static Map<String, C0VJR> LIZIZ;
    public static boolean LIZJ;
    public static Map<String, String> LIZLLL;

    public static Map LJFF(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (entry.getValue() instanceof Map) {
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    if (entry2.getValue() instanceof Boolean) {
                        if (entry2.getKey() instanceof String) {
                            linkedHashSet.add(entry2.getKey());
                        }
                    } else if ((entry2.getValue() instanceof Map) && (entry2.getKey() instanceof String)) {
                        linkedHashMap2.put(entry2.getKey(), LJI((Map) entry2.getValue()));
                    }
                }
            }
            linkedHashMap.put(entry.getKey(), new C0VJR(linkedHashSet, linkedHashMap2));
        }
        return linkedHashMap;
    }

    public static C0VJR LJI(Map map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof Boolean) {
                if (entry.getKey() instanceof String) {
                    linkedHashSet.add(entry.getKey());
                }
            } else if ((entry.getValue() instanceof Map) && (entry.getKey() instanceof String)) {
                linkedHashMap.put(entry.getKey(), LJI((Map) entry.getValue()));
            }
        }
        return new C0VJR(linkedHashSet, linkedHashMap);
    }

    public static String LIZ(String str, String str2) {
        if (str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('.');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static String LIZIZ(String str, String str2) {
        if (str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('.');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str2;
    }

    public final void LJ(Map<String, ? extends Object> map, Map<String, String> map2) {
        synchronized (this) {
            try {
                if (LIZIZ == null) {
                    LIZIZ = LJFF(map);
                }
                LIZJ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (map2 != null) {
            LIZLLL = map2;
            C0VR5.LIZIZ(C795640VJa.LIZLLL("apm_event_management", map2, C0VR5.LIZ(), null, C0VJY.SPEC_STATUS_RULE_PARSE));
        }
    }

    public static JSONObject LIZJ(JSONObject jSONObject, String str, Set set) throws JSONException {
        C0VJR c0vjr;
        Map<String, C0VJR> map = LIZIZ;
        if (map != null && (c0vjr = (C0VJR) ((LinkedHashMap) map).get(str)) != null) {
            Map mapLIZLLL = LIZLLL(C116200cK.LIZLLL(jSONObject), c0vjr, set, "");
            if (!set.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62));
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                mapLIZLLL.put("_keys_operate_by_pns_guard", strLIZIZ);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("source", "apm");
                jSONObject2.put("remove_keys", strLIZIZ);
                if (LIZLLL != null) {
                    C0VR5.LIZIZ(C795640VJa.LIZLLL("apm_event_management", LIZLLL, C0VR5.LIZ(), jSONObject2, C0VJY.SPEC_STATUS_RULE_RESULT));
                }
            }
            return C116200cK.LIZ(mapLIZLLL);
        }
        return jSONObject;
    }

    public static Map LIZLLL(Map map, C0VJR c0vjr, Set set, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (c0vjr.LIZ.contains(entry.getKey())) {
                set.add(LIZIZ(str, (String) entry.getKey()));
            } else if ((entry.getValue() instanceof Map) && c0vjr.LIZIZ.containsKey(entry.getKey())) {
                C0VJR c0vjr2 = c0vjr.LIZIZ.get(entry.getKey());
                if (c0vjr2 != null) {
                    linkedHashMap.put(entry.getKey(), LIZLLL((Map) entry.getValue(), c0vjr2, set, LIZIZ(str, (String) entry.getKey())));
                }
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
