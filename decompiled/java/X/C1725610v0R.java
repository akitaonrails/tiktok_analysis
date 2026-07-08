package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v0R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725610v0R {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final long LJI;

    public static JSONObject LIZ(C1725610v0R c1725610v0R, boolean z, boolean z2, int i) throws JSONException {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        JSONObject jSONObject = new JSONObject();
        if (!z && !z2) {
            jSONObject.put("url_original_host", c1725610v0R.LIZIZ);
            jSONObject.put("url_original_path", c1725610v0R.LIZJ);
        } else {
            jSONObject.put("schema", c1725610v0R.LIZ);
            jSONObject.put("url_host", c1725610v0R.LIZIZ);
            jSONObject.put("url_path", c1725610v0R.LIZJ);
            jSONObject.put("timestamp", c1725610v0R.LJI);
            if (z) {
                jSONObject.put("url_current_host", c1725610v0R.LIZIZ);
                jSONObject.put("url_current_path", c1725610v0R.LIZJ);
            }
        }
        jSONObject.put("bdhm_bid", c1725610v0R.LIZLLL);
        jSONObject.put("biz", c1725610v0R.LJ);
        jSONObject.put("pipo_additional_tracking_params", c1725610v0R.LJFF);
        return jSONObject;
    }

    public C1725610v0R(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = j;
    }
}
