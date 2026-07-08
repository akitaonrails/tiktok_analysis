package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C116200cK {
    public static final JSONObject LIZ(Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), LIZIZ(entry.getValue()));
        }
        return jSONObject;
    }

    public static final Object LIZIZ(Object obj) {
        if (obj instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && value != null) {
                    map.put(key, value);
                }
            }
            return LIZ(map);
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                jSONArray.put(LIZIZ(it2.next()));
            }
            return jSONArray;
        }
        return obj;
    }

    public static final List<Object> LIZJ(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objLIZLLL = jSONArray.get(i);
            if (objLIZLLL instanceof JSONArray) {
                objLIZLLL = LIZJ((JSONArray) objLIZLLL);
            } else if (objLIZLLL instanceof JSONObject) {
                objLIZLLL = LIZLLL((JSONObject) objLIZLLL);
            }
            arrayList.add(objLIZLLL);
        }
        return arrayList;
    }

    public static final Map<String, Object> LIZLLL(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objLIZLLL = jSONObject.get(next);
            if (objLIZLLL instanceof JSONArray) {
                objLIZLLL = LIZJ((JSONArray) objLIZLLL);
            } else if (objLIZLLL instanceof JSONObject) {
                objLIZLLL = LIZLLL((JSONObject) objLIZLLL);
            }
            map.put(next, objLIZLLL);
        }
        return map;
    }
}
