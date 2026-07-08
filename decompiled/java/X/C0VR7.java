package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VR7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VR7 {
    public static Map<String, C0VR8> LIZIZ;
    public static C0VRH LIZJ;
    public static boolean LIZLLL;
    public static Map<String, String> LJI;
    public static final C0VR7 LIZ = new C0VR7();
    public static boolean LJ = true;
    public static int LJFF = 100;

    public static C0VR8 LJ(Map map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof Boolean) {
                if (entry.getKey() instanceof String) {
                    linkedHashSet.add(entry.getKey());
                }
            } else if ((entry.getValue() instanceof Map) && (entry.getKey() instanceof String)) {
                linkedHashMap.put(entry.getKey(), LJ((Map) entry.getValue()));
            }
        }
        return new C0VR8(linkedHashSet, linkedHashMap);
    }

    public static JSONObject LIZ(JSONObject jSONObject, C0VR8 c0vr8) throws JSONException {
        C0VR8 c0vr82;
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (c0vr8.LIZ.contains(next)) {
                jSONObject2.put(next, objOpt);
            } else if ((objOpt instanceof JSONObject) && c0vr8.LIZIZ.containsKey(next) && (c0vr82 = c0vr8.LIZIZ.get(next)) != null) {
                jSONObject2.put(next, LIZ((JSONObject) objOpt, c0vr82));
            }
        }
        return jSONObject2;
    }

    public static Pair LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        C0VR6 c0vr6;
        C0VR8 c0vr8;
        C0VRH c0vrh = LIZJ;
        if (c0vrh != null && c0vrh.LIZ()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("block_source", "applog");
            linkedHashMap.put("blocked_event", str);
            linkedHashMap.put("is_only_event_blocked", Boolean.valueOf(LIZLLL));
            Map<String, C0VR8> map = LIZIZ;
            if (map != null && (c0vr8 = (C0VR8) ((LinkedHashMap) map).get(str)) != null) {
                if (LJ) {
                    return new Pair(Boolean.TRUE, jSONObject);
                }
                if (LIZLLL) {
                    return new Pair(Boolean.TRUE, jSONObject);
                }
                JSONObject jSONObjectLIZ = LIZ(jSONObject, c0vr8);
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jSONObject.remove((String) it2.next());
                }
                Iterator<String> itKeys2 = jSONObjectLIZ.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    jSONObject.put(next, jSONObjectLIZ.get(next));
                }
                C0VR6 c0vr62 = C0VR5.LIZ;
                if (c0vr62 != null) {
                    c0vr62.LIZ(linkedHashMap);
                }
                return new Pair(Boolean.TRUE, jSONObjectLIZ);
            }
            if (AbstractC19994813Le.Default.nextLong((((long) (-1)) & 4294967295L) + 1) % ((long) LJFF) == 0 && (c0vr6 = C0VR5.LIZ) != null) {
                c0vr6.LIZ(linkedHashMap);
            }
            return new Pair(Boolean.valueOf(LJ), null);
        }
        return new Pair(Boolean.TRUE, jSONObject);
    }

    public static Map LIZLLL(Map map, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                linkedHashMap.put(entry.getKey(), new C0VR8(C08CX.INSTANCE, C2097608Jq.LJ()));
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (entry.getValue() instanceof Map) {
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        if (entry2.getValue() instanceof Boolean) {
                            if (entry2.getKey() instanceof String) {
                                linkedHashSet.add(entry2.getKey());
                            }
                        } else if ((entry2.getValue() instanceof Map) && (entry2.getKey() instanceof String)) {
                            linkedHashMap2.put(entry2.getKey(), LJ((Map) entry2.getValue()));
                        }
                    }
                }
                linkedHashMap.put(entry.getKey(), new C0VR8(linkedHashSet, linkedHashMap2));
            }
        }
        return linkedHashMap;
    }

    public final void LIZJ(C0VR9 c0vr9, C0VRH c0vrh, Map<String, String> map) {
        boolean z = c0vr9.LIZ;
        LIZLLL = z;
        LJ = c0vr9.LIZIZ;
        LJFF = c0vr9.LIZJ;
        LIZJ = c0vrh;
        Map<String, Object> map2 = c0vr9.LIZLLL;
        synchronized (this) {
            try {
                if (LIZIZ == null) {
                    LIZIZ = LIZLLL(map2, z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (map != null) {
            LJI = map;
            C0VR5.LIZIZ(C795640VJa.LIZJ("tea_event_management", map, C0VR5.LIZ(), C0VJY.SPEC_STATUS_RULE_PARSE));
        }
    }
}
