package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VEU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VEU {
    public String LIZ = "";

    public static Map<String, List<C0VEU>> LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            LinkedList linkedList = new LinkedList();
            String next = itKeys.next();
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, next);
                int i = 0;
                while (jSONArray != null && i < jSONArray.length()) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    C0VEU c0veu = new C0VEU();
                    i++;
                    if (jSONObject2.has("IP")) {
                        c0veu.LIZ = jSONObject2.optString("IP");
                        if (jSONObject2.has("DomainParseType")) {
                            jSONObject2.optInt("DomainParseType");
                        }
                        if (jSONObject2.has("ProtocolType")) {
                            jSONObject2.optInt("ProtocolType");
                        }
                        linkedList.add(c0veu);
                    } else {
                        C1698940uJQ.LIZIZ();
                    }
                }
                if (!linkedList.isEmpty() && !map.containsKey(next)) {
                    map.put(next, linkedList);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return map;
    }
}
