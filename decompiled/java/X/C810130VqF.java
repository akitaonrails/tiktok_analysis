package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810130VqF {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ;
    public List<String> LIZLLL;

    public final boolean LIZ() {
        List<String> list;
        return (this.LIZ == 0 || this.LIZIZ == 0 || TextUtils.isEmpty(this.LIZJ) || (list = this.LIZLLL) == null || ((ArrayList) list).size() <= 0) ? false : true;
    }

    public static C810130VqF LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C810130VqF c810130VqF = new C810130VqF();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
        if (jSONArrayOptJSONArray != null) {
            c810130VqF.LIZLLL = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    if (!strOptString.endsWith("/ws/v2")) {
                        if (strOptString.endsWith("/")) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strOptString);
                            sbLIZ.append("ws/v2");
                            strOptString = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strOptString);
                            sbLIZ2.append("/ws/v2");
                            strOptString = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    }
                    c810130VqF.LIZLLL.add(strOptString);
                }
            }
        }
        c810130VqF.LIZ = jSONObject.optInt("aid");
        c810130VqF.LIZIZ = jSONObject.optInt("pid");
        c810130VqF.LIZJ = jSONObject.optString("app_key");
        return c810130VqF;
    }
}
