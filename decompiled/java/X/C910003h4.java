package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03h4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C910003h4 {
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mBody", this.LIZ);
            jSONObject.put("mHeader", this.LIZIZ);
            jSONObject.put("mMethod", this.LIZJ);
            jSONObject.put("mUrl", this.LIZLLL);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static C910003h4 LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C910003h4(jSONObject.optString("method"), jSONObject.optString("url"), jSONObject.optJSONObject("body"), jSONObject.optJSONObject("header"));
    }

    public C910003h4(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.LIZ = jSONObject;
        this.LIZIZ = jSONObject2;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
