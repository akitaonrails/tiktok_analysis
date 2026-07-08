package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.SortedMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13mH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20109513mH {
    public static C20108713m9 LIZ(JSONObject jSONObject) {
        SortedMap<String, String> sortedMapLIZLLL;
        C20108713m9 c20108713m9 = new C20108713m9(JSONObjectProtectorUtils.getString(jSONObject, "page_url"), new C20109413mG(JSONObjectProtectorUtils.getJSONObject(jSONObject, "request")), JSONObjectProtectorUtils.getLong(jSONObject, "timestamp"), JSONObjectProtectorUtils.getLong(jSONObject, "expires"));
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "response");
        new C20109213mE();
        C20109213mE c20109213mE = new C20109213mE();
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("headers");
        SortedMap<String, String> sortedMapLIZLLL2 = null;
        if (jSONObjectOptJSONObject != null) {
            sortedMapLIZLLL = C20109613mI.LIZLLL(jSONObjectOptJSONObject);
        } else {
            sortedMapLIZLLL = null;
        }
        c20109213mE.LIZJ = sortedMapLIZLLL;
        c20109213mE.LIZIZ = jSONObject2.optString("body");
        c20109213mE.LIZLLL = jSONObject2.optInt("status_code");
        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("extra");
        if (jSONObjectOptJSONObject2 != null) {
            sortedMapLIZLLL2 = C20109613mI.LIZLLL(jSONObjectOptJSONObject2);
        }
        c20109213mE.LJ = sortedMapLIZLLL2;
        c20108713m9.LJFF = c20109213mE;
        return c20108713m9;
    }
}
