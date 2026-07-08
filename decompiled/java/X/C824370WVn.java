package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824370WVn {
    public static void LIZ(C824380WVo c824380WVo, String str, Object obj, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        Integer numValueOf;
        int iHashCode;
        boolean z;
        C1520360pfO c1520360pfO = new C1520360pfO(str);
        c1520360pfO.LIZIZ = "tiktok_hybrid_ecom_timecost";
        c1520360pfO.LIZ = str2;
        JSONObject jSONObject = new JSONObject();
        if (c824380WVo != null) {
            numValueOf = Integer.valueOf(c824380WVo.LIZ);
        } else {
            numValueOf = null;
        }
        JSONObject jSONObjectPut = jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, numValueOf);
        if (obj != null) {
            iHashCode = obj.hashCode();
        } else {
            iHashCode = 0;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("view_hash", iHashCode);
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        c1520360pfO.LIZLLL = jSONObjectPut2.put("view_status", z).put("trigger_card_event", bool).put("isPageReady", bool2).put("isLoadSuccess", bool3).put("from", "spark").put("url", str2);
        c1520360pfO.LIZIZ(0);
        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
        C1520380pfQ.LIZ.getClass();
        C1520380pfQ.LIZ(c1520350pfNLIZ);
    }
}
