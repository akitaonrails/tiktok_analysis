package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uLO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700160uLO {
    public C1700160uLO(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, int i) throws JSONException {
        jSONObject = (i & 2) != 0 ? new JSONObject() : jSONObject;
        jSONObject2 = (i & 4) != 0 ? new JSONObject() : jSONObject2;
        str2 = (i & 8) != 0 ? "success" : str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        jSONObject.put("name", str);
        jSONObject.put("startTimeStamp", jCurrentTimeMillis);
        jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
    }
}
