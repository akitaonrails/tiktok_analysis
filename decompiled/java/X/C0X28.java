package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X28, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X28 {
    public static C843090X5n LIZ(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("url");
        String upperCase = jSONObject.optString("method").toUpperCase(Locale.ROOT);
        String strOptString2 = jSONObject.optString(FollowStatusChangeMethod.PARAM_UID);
        String strOptString3 = jSONObject.optString("data");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        boolean zOptBoolean = jSONObject.optBoolean("isBinary", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("isResponseBinary", false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObjectOptJSONObject.optString(next));
        }
        if (linkedHashMap.get("User-Agent") == null && linkedHashMap.get("user-agent") == null) {
            linkedHashMap.put("User-Agent", str2);
        }
        return new C843090X5n(upperCase, strOptString2, strOptString, UriProtector.parse(strOptString), strOptString3, linkedHashMap, zOptBoolean, zOptBoolean2);
    }
}
