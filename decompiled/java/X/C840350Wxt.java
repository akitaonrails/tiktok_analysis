package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wxt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C840350Wxt {
    public final EnumC840370Wxv LIZ;
    public String LIZIZ;
    public Map<String, String> LIZJ;
    public Set<String> LIZLLL;

    public C840350Wxt(EnumC840370Wxv enumC840370Wxv) {
        this.LIZ = enumC840370Wxv;
    }

    public static void LIZ(JSONObject jSONObject, Map<String, String> map, Set<String> set) throws JSONException {
        if (set != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = set.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            jSONObject.put("removed_headers", jSONArray);
        }
        if (map == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (!((String) entry.getValue()).isEmpty()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("new_headers", jSONObject2);
    }
}
