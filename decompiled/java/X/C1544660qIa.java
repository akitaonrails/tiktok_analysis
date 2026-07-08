package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544660qIa implements C1BRK {
    @Override // X.C1BRK
    public final void LIZ(String str, JSONObject jSONObject) {
        if ("host".equals(str) && jSONObject != null) {
            C1542900qFk.LIZJ("jsb_auth_on_host_config", new JSONObject());
            C1542900qFk.LIZ(LivePreviewCTASmartDisplayManager.DEFAULT, "from_JSB2", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("content");
                if (jSONObjectOptJSONObject != null) {
                    jSONObject2.put("content", jSONObjectOptJSONObject.length());
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
