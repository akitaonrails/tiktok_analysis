package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VCI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VCI {
    public final /* synthetic */ C0VCC LIZ;

    public C0VCI(C0VCC c0vcc) {
        this.LIZ = c0vcc;
    }

    public final void LIZ(String str, JSONObject jSONObject) throws JSONException {
        String sessionId;
        if (!TextUtils.equals(str, "api_all") || !TextUtils.equals(str, "api_error")) {
            C0VCZ c0vcz = this.LIZ.LJIILL;
            String sessionId2 = null;
            if (c0vcz != null) {
                sessionId = c0vcz.getSessionId();
            } else {
                sessionId = null;
            }
            if (!TextUtils.isEmpty(sessionId)) {
                C0VCZ c0vcz2 = this.LIZ.LJIILL;
                if (c0vcz2 != null) {
                    sessionId2 = c0vcz2.getSessionId();
                }
                jSONObject.put("session_id", sessionId2);
            }
        }
        jSONObject.put("network_type", C804420Vh2.LJ(this.LIZ.LIZ).getValue());
        this.LIZ.LIZ(jSONObject);
    }
}
