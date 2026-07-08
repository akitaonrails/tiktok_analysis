package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335780DEi {
    public static C335870DEr LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("jsonrpc", "2.0");
        jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, str);
        jSONObject2.put("result", jSONObject);
        return new C335870DEr(jSONObject2, true);
    }

    public static C335870DEr LIZJ(String str, String str2) {
        return LIZ(str, "unexpected_error", str2);
    }

    public static C335870DEr LIZ(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsonrpc", "2.0");
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", str2);
        jSONObject2.put("message", str3);
        jSONObject.put("error", jSONObject2);
        return new C335870DEr(jSONObject, false);
    }
}
