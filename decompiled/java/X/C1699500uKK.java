package X;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uKK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699500uKK {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public List<String> LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final long LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WifiData(ssid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bssid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rssi=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", matchedRule=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", connected=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", ts=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.LIZLLL;
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", this.LJ);
        jSONObject.put("connected", this.LJFF);
        jSONObject.put("matched_rule", jSONArray);
        jSONObject.put("ssid", this.LIZ);
        jSONObject.put("bssid", this.LIZIZ);
        jSONObject.put("rssi", this.LIZJ);
        jSONObject.put("ts", this.LJI);
        return C786410Ut5.J3(jSONObject);
    }

    public C1699500uKK(int i, String str, long j, String str2, boolean z, int i2, int i3) {
        i2 = (i3 & 16) != 0 ? -1 : i2;
        z = (i3 & 32) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = null;
        this.LJ = i2;
        this.LJFF = z;
        this.LJI = j;
    }
}
