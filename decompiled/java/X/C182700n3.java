package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00n3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C182700n3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Long l, Long l2, Long l3, String str, int i, int i2, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("room_id", l);
            jSONObject.put("anchor_id", l2);
            jSONObject.put("user_id", l3);
            jSONObject.put("action", str);
            jSONObject.put("tab_schema_type", i);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i2);
            jSONObject.put("schema", str2);
            jSONObject.put("biz_type", str3);
            C1CC2.LJ("ttlive_multi_tab_service_track", jSONObject, jSONObject2, new JSONObject());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
