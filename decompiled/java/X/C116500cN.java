package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C116500cN {
    public static final /* synthetic */ int LIZ = 0;

    public static final List<Object> LIZ(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(LIZIZ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(LIZ((JSONArray) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> LIZIZ(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                linkedHashMap.put(next, LIZIZ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                linkedHashMap.put(next, LIZ((JSONArray) obj));
            } else {
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }
}
