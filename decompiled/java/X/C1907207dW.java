package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07dW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1907207dW {
    public final Map<String, List<C20110213mO>> LIZ;

    public C1907207dW(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                linkedHashMap.put(next, C1697810uHb.LJIILJJIL(new C20110213mO(next, (JSONObject) objOpt)));
            } else if (objOpt instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = (JSONArray) objOpt;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new C20110213mO(next, jSONObjectOptJSONObject));
                    }
                }
                linkedHashMap.put(next, arrayList);
            }
        }
        this.LIZ = linkedHashMap;
    }
}
