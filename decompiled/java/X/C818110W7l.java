package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818110W7l {
    public static C818120W7m LIZ(JSONObject jSONObject) {
        boolean z;
        String strOptString = jSONObject.optString("command");
        if (strOptString != null && strOptString.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        LinkedHashMap linkedHashMap = null;
        if (z) {
            return null;
        }
        String strOptString2 = jSONObject.optString("reason");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject != null) {
            linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObjectOptJSONObject.optString(next));
            }
        }
        return new C818120W7m(strOptString, strOptString2, jSONObject.optString("trigger_msg_id"), linkedHashMap);
    }
}
