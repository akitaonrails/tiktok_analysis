package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13mN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20110113mN {
    public final String LIZ;
    public final C1907207dW LIZIZ;
    public final C1907307dX LIZJ;
    public final Map<String, C20109313mF> LIZLLL;

    public C20110113mN() {
        throw null;
    }

    public C20110113mN(JSONObject jSONObject) {
        C1907207dW c1907207dW;
        Iterator<String> itKeys;
        String strOptString = jSONObject.optString("project");
        jSONObject.optString("version");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("occasions");
        if (jSONObjectOptJSONObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
            while (itKeys2.hasNext()) {
                String next = itKeys2.next();
                linkedHashMap.put(next, C20109613mI.LIZJ(jSONObjectOptJSONObject.optJSONArray(next)));
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("rules");
        if (jSONObjectOptJSONObject2 != null) {
            c1907207dW = new C1907207dW(jSONObjectOptJSONObject2);
        } else {
            c1907207dW = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("restful_rules");
        C1907307dX c1907307dX = jSONObjectOptJSONObject3 != null ? new C1907307dX(jSONObjectOptJSONObject3) : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("prefetch_apis");
        if (jSONObjectOptJSONObject4 != null && (itKeys = jSONObjectOptJSONObject4.keys()) != null) {
            while (itKeys.hasNext()) {
                String next2 = itKeys.next();
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject(next2);
                if (jSONObjectOptJSONObject5 != null) {
                    linkedHashMap2.put(next2, new C20109313mF(jSONObjectOptJSONObject5));
                }
            }
        }
        this.LIZ = strOptString;
        this.LIZIZ = c1907207dW;
        this.LIZJ = c1907307dX;
        this.LIZLLL = linkedHashMap2;
    }
}
