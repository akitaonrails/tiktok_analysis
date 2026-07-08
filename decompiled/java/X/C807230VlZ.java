package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C807230VlZ implements InterfaceC794760VFq {
    public int LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC794760VFq
    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZ);
        jSONObject.put("btm", this.LIZIZ);
        return jSONObject;
    }

    public C807230VlZ(boolean z, String str) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
