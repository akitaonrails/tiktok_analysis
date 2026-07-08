package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020640cfO {
    public static final void LIZ(C1015550cXB c1015550cXB, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap;
        Map<String, ? extends Object> map = c1015550cXB.LL.data;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("layout_type", jSONObject.optInt("layout_type", 1));
        jSONObject2.put("system", jSONObject.optString("system", "Android"));
        jSONObject2.put("carouselSelected", jSONObject.optBoolean("carouselSelected", false));
        jSONObject2.put("current_index", jSONObject.optInt("current_index", 0));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("carouselUpdateInfo");
        if (jSONObjectOptJSONObject != null) {
            jSONObject2.put("carouselUpdateInfo", jSONObjectOptJSONObject);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("jigsaw_data");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObject2.put("jigsaw_data", jSONObjectOptJSONObject2);
        }
        String strOptString = jSONObject.optString("ugen_dsl");
        if ((true ^ a0.LJJJIL(strOptString)) && strOptString != null) {
            jSONObject2.put("ugen_dsl", strOptString);
        }
        linkedHashMap.putAll(C1020890cfn.LJIIIIZZ(jSONObject2));
        c1015550cXB.LL.setData(linkedHashMap);
    }
}
