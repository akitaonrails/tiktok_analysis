package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202154148a {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) throws JSONException {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 1508632) {
                if (iHashCode != 1509441) {
                    if (iHashCode != 1721912 || !str.equals("8660")) {
                        return;
                    }
                } else {
                    if (!str.equals("1233")) {
                        return;
                    }
                    LIZIZ("va", "https://verification-va.tiktokv.com");
                    C148Y.LIZIZ.optJSONObject("common").optJSONObject("host").put("va", "https://vcs-va.tiktokv.com");
                    return;
                }
            } else if (!str.equals("1180")) {
                return;
            }
            LIZIZ("sg", "https://verify-sg.tiktokv.com");
            C148Y.LIZIZ.optJSONObject("common").optJSONObject("host").put("sg", "https://vcs-sg.tiktokv.com");
        }
    }

    public static void LIZIZ(String str, String str2) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObject = C148Y.LIZIZ;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("sms");
        if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3.optJSONObject("host")) != null) {
            jSONObjectOptJSONObject2.put(str, str2);
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("verify");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("host")) != null) {
            jSONObjectOptJSONObject.put(str, str2);
        }
    }
}
