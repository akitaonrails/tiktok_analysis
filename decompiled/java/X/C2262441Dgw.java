package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Dgw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262441Dgw {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ = -1;
    public Integer LJFF = 0;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strSubstring = this.LIZ;
        if (!TextUtils.isEmpty(strSubstring) && strSubstring.length() > 15) {
            strSubstring = strSubstring.substring(0, 14);
        }
        jSONObject.put("ip", strSubstring);
        String strSubstring2 = this.LIZIZ;
        if (!TextUtils.isEmpty(strSubstring2) && strSubstring2.length() > 20) {
            strSubstring2 = strSubstring2.substring(0, 19);
        }
        jSONObject.put("host", strSubstring2);
        jSONObject.put("hit_code", 0);
        jSONObject.put("hit_code_l2", 0);
        jSONObject.put("cdn_hit_str", this.LIZJ);
        jSONObject.put("rsp_time", 0L);
        jSONObject.put("cache_size", 0L);
        jSONObject.put("url_idx", this.LJ);
        jSONObject.put("status_code", this.LIZLLL);
        jSONObject.put("dl_duration", 0L);
        jSONObject.put("dl_size", 0L);
        return jSONObject;
    }
}
