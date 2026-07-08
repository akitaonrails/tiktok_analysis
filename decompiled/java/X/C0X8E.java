package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X8E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X8E {
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();

    public C0X8E(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("includes");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("excludes");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    ((ArrayList) this.LIZ).add(strOptString);
                }
            }
        }
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String strOptString2 = jSONArrayOptJSONArray2.optString(i2);
                if (!TextUtils.isEmpty(strOptString2)) {
                    ((ArrayList) this.LIZIZ).add(strOptString2);
                }
            }
        }
    }
}
