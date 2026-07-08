package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191871AqP {
    public final C2191951AqX LIZ;
    public final List<C2191861AqO> LIZIZ = new ArrayList();

    public C2191871AqP(String str, String str2, JSONObject jSONObject) {
        this.LIZ = new C2191951AqX(jSONObject.optJSONArray("config_ids"), jSONObject.optInt("version", 0));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("priorities");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    ((ArrayList) this.LIZIZ).add(new C2191861AqO(str, str2, jSONObjectOptJSONObject));
                }
            }
        }
    }
}
