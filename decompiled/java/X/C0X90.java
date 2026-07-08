package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X90, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X90 {
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();
    public final List<C843990X8z> LIZJ = new ArrayList();

    public C0X90(JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("param_validator");
        if (jSONObjectOptJSONObject2 != null && (jSONArrayNames = jSONObjectOptJSONObject2.names()) != null && jSONArrayNames.length() > 0) {
            int length = jSONArrayNames.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayNames.optString(i);
                if (!TextUtils.isEmpty(strOptString) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strOptString)) != null) {
                    ((ArrayList) this.LIZJ).add(new C843990X8z(strOptString, jSONObjectOptJSONObject));
                }
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("param_includes");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int length2 = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String strOptString2 = jSONArrayOptJSONArray.optString(i2);
                if (!TextUtils.isEmpty(strOptString2)) {
                    ((ArrayList) this.LIZ).add(strOptString2);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("param_excludes");
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            int length3 = jSONArrayOptJSONArray2.length();
            for (int i3 = 0; i3 < length3; i3++) {
                String strOptString3 = jSONArrayOptJSONArray2.optString(i3);
                if (!TextUtils.isEmpty(strOptString3)) {
                    ((ArrayList) this.LIZIZ).add(strOptString3);
                }
            }
        }
    }
}
