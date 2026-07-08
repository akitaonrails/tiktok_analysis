package X;

import com.bytedance.crash.entity.Header;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C801830Vcr {
    public JSONObject LIZ = new JSONObject();
    public Header LIZIZ = new Header();

    public final void LIZ(String str, String str2) {
        LIZLLL(str2, "custom", str, this.LIZ);
    }

    public final void LIZIZ(String str, String str2) {
        LIZLLL(str2, "filters", str, this.LIZ);
    }

    public final void LIZJ(String str, Object obj) {
        C0VJO.LJIIIIZZ(this.LIZ, str, obj);
    }

    public static void LIZLLL(Object obj, String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            C0VJO.LJIIIIZZ(jSONObject, str, jSONObjectOptJSONObject);
        }
        C0VJO.LJIIIIZZ(jSONObjectOptJSONObject, str2, obj);
    }
}
