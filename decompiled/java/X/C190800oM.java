package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00oM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C190800oM {
    public static Map<String, Object> LIZJ(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objLIZJ = jSONObject.get(next);
            if (objLIZJ instanceof JSONObject) {
                objLIZJ = LIZJ((JSONObject) objLIZJ);
            }
            map.put(next, objLIZJ);
        }
        return map;
    }

    public static Map<String, String> LIZ(Map<String, Object> map, Map<String, Object> map2) {
        HashMap map3 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Object obj = map2.get(key);
            if (obj == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(":Key missing in originMap,");
                sbLIZ.append(value);
                map3.put(key, C2188811AlT.LIZIZ(sbLIZ));
            } else if ((value instanceof Map) && (obj instanceof Map)) {
                map3.putAll(LIZ((HashMap) value, (HashMap) obj));
            } else if ((value instanceof JSONArray) && (obj instanceof JSONArray)) {
                if (!value.toString().equals(obj.toString())) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(":Diff JSONArray:");
                    sbLIZ2.append(value);
                    sbLIZ2.append("#");
                    sbLIZ2.append(obj);
                    map3.put(key, C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else if (!value.equals(obj)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(":Diff:");
                sbLIZ3.append(value);
                sbLIZ3.append("#");
                sbLIZ3.append(obj);
                map3.put(key, C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            if (!map.containsKey(key2)) {
                String string = entry2.getValue().toString();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(":Key missing in newMap,");
                sbLIZ4.append(string);
                map3.put(key2, C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        return map3;
    }

    public static void LIZIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject != null && jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    Object obj2 = jSONObject.get(next);
                    if ((obj2 instanceof JSONObject) && (obj instanceof JSONObject)) {
                        LIZIZ((JSONObject) obj2, (JSONObject) obj);
                    } else if ((obj2 instanceof JSONArray) && obj != null) {
                        JSONArray jSONArray = (JSONArray) obj2;
                        if (obj instanceof JSONArray) {
                            JSONArray jSONArray2 = (JSONArray) obj;
                            for (int i = 0; i < jSONArray2.length(); i++) {
                                jSONArray.put(jSONArray2.get(i));
                            }
                        } else {
                            jSONArray.put(obj);
                        }
                    } else {
                        jSONObject.remove(next);
                        jSONObject.put(next, obj);
                    }
                } else {
                    jSONObject.put(next, obj);
                }
            }
        }
    }
}
