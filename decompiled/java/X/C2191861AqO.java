package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191861AqO {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<String> LJ;
    public final String LJFF;
    public final C1308600k9q LJI;

    public C2191861AqO(String str, String str2, JSONObject jSONObject) {
        C1308600k9q c1308600k9q;
        this.LIZ = jSONObject.optInt("global_priority", 0);
        int iOptInt = jSONObject.optInt("interval", 0);
        this.LIZIZ = iOptInt < 0 ? 0 : iOptInt;
        this.LIZJ = jSONObject.optString("report_host", str);
        this.LIZLLL = jSONObject.optString("report_path", str2);
        this.LJ = new ArrayList();
        this.LJFF = jSONObject.optString("event_priority", "P2");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("filter");
        if (jSONObjectOptJSONObject != null) {
            c1308600k9q = new C1308600k9q(jSONObjectOptJSONObject);
        } else {
            c1308600k9q = null;
        }
        this.LJI = c1308600k9q;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("support_event_types");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (strOptString != null && strOptString.length() != 0) {
                    ((ArrayList) this.LJ).add(strOptString.toLowerCase(Locale.ROOT));
                }
            }
        }
    }
}
