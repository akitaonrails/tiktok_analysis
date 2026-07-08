package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1698670uIz {
    public long LIZIZ;
    public long LIZJ;
    public long LJFF;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public String LIZ = "";
    public EnumC1699210uJr LIZLLL = EnumC1699210uJr.IN_ROOM;
    public String LJ = "";
    public String LJI = "";
    public String LJII = "";
    public String LJIIJJI = "";

    public final JSONObject LIZ(long j) throws JSONException {
        long j2;
        int code;
        long j3;
        long j4;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("unique_id", this.LIZ);
        long j5 = this.LIZIZ;
        long j6 = 0;
        if (j5 > 0) {
            j2 = j5 + j;
        } else {
            j2 = 0;
        }
        jSONObject.put("signal_receive_ts", j2);
        jSONObject.put("signaling_push_ts", this.LIZJ);
        EnumC1699210uJr enumC1699210uJr = this.LIZLLL;
        if (enumC1699210uJr != null) {
            code = enumC1699210uJr.getCode();
        } else {
            code = 0;
        }
        jSONObject.put("in_feed_ind", code);
        String str = this.LJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        jSONObject.put("switch_result", str);
        jSONObject.put("error_code", this.LJFF);
        String str3 = this.LJI;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("source_domain", str3);
        String str4 = this.LJII;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("target_domain", str4);
        long j7 = this.LJIIIIZZ;
        if (j7 > 0) {
            j3 = j7 + j;
        } else {
            j3 = 0;
        }
        jSONObject.put("attempt_ts", j3);
        long j8 = this.LJIIIZ;
        if (j8 > 0) {
            j4 = j8 + j;
        } else {
            j4 = 0;
        }
        jSONObject.put("success_ts", j4);
        long j9 = this.LJIIJ;
        if (j9 > 0) {
            j6 = j9 + j;
        }
        jSONObject.put("fail_ts", j6);
        String str5 = this.LJIIJJI;
        if (str5 != null) {
            str2 = str5;
        }
        jSONObject.put("ignore_reason", str2);
        return jSONObject;
    }
}
