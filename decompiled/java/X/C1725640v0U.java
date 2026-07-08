package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v0U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725640v0U {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final long LJFF;
    public long LJI;
    public C1725670v0X LJII;
    public long LJIIIIZZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1725640v0U() {
        String str = null;
        this(str, str, str, 0L, 63);
    }

    public final JSONObject LIZ(String str) throws JSONException {
        String strLIZIZ;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('_');
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        JSONObject jSONObject = new JSONObject();
        if (str == null || str.length() == 0) {
            jSONObject.put("url_current_host", this.LIZ);
            jSONObject.put("url_current_path", this.LIZIZ);
            jSONObject.put("step", this.LIZJ);
            jSONObject.put("time_duration", this.LJI);
            jSONObject.put("timestamp", this.LJFF);
            String str2 = this.LIZLLL;
            if (str2 != null) {
                jSONObject.put("error_code", str2);
            }
            String str3 = this.LJ;
            if (str3 != null) {
                jSONObject.put("error_message", str3);
            }
            if (this.LJII != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("is_manual", 1);
                jSONObject.put("extra_info", C786410Ut5.J3(jSONObject2));
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("url");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("_host");
        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ2), this.LIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("url");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append("_path");
        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ3), this.LIZIZ);
        return jSONObject;
    }

    public /* synthetic */ C1725640v0U(String str, String str2, String str3, long j, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, null, null, (i & 32) != 0 ? 0L : j);
    }

    public C1725640v0U(String str, String str2, String str3, String str4, String str5, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = j;
    }
}
