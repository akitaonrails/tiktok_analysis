package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Trq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C760160Trq {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final JSONObject LIZJ;
    public int LIZLLL;
    public String LJ;
    public String LJFF;
    public boolean LJI;
    public boolean LJII;

    public final void LJIIIZ() {
        String strLJJJZ;
        String strLIZIZ;
        if (this.LIZJ.length() > 0 || this.LJI) {
            this.LIZJ.put("page", this.LJ);
            if (u.LJIIZILJ(this.LIZ, "_all", false)) {
                if (u.LJIIZILJ(this.LIZ, "_error", false)) {
                    strLIZIZ = a0.LJJJZ(this.LIZ, "all");
                } else if (u.LJIIZILJ(this.LIZ, "_all", false)) {
                    strLIZIZ = this.LIZ;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append("_all");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C1CC2.LJIIIIZZ(strLIZIZ, this.LIZLLL, this.LIZJ);
            }
            if (this.LJII || u.LJIIZILJ(this.LIZ, "_error", false)) {
                if (this.LIZLLL != 0) {
                    if (u.LJIIZILJ(this.LIZ, "_all", false)) {
                        strLJJJZ = a0.LJJJZ(this.LIZ, "error");
                    } else if (u.LJIIZILJ(this.LIZ, "_error", false)) {
                        strLJJJZ = this.LIZ;
                    } else {
                        strLJJJZ = this.LIZ + "_error";
                    }
                    C1CC2.LJIIIIZZ(strLJJJZ, this.LIZLLL, this.LIZJ);
                } else {
                    C20441214yg.LJ(this.LJFF, "slardar error log should not be reported with success status");
                }
            }
            if (!this.LJII && !u.LJIIZILJ(this.LIZ, "_all", false) && !u.LJIIZILJ(this.LIZ, "_error", false)) {
                C20441214yg.LJ(this.LJFF, "slardar log's service name " + this.LIZ + " must end with _all or _error, please call all() or error() method before submit");
            }
            this.LIZIZ.put("slardar", true);
        }
        C20441214yg.LIZIZ(this.LJFF, C786410Ut5.J3(this.LIZIZ));
    }

    public C760160Trq(String str) throws JSONException {
        this.LIZ = str;
        JSONObject jSONObject = new JSONObject();
        this.LIZIZ = jSONObject;
        this.LIZJ = new JSONObject();
        this.LIZLLL = -1;
        this.LJ = "";
        this.LJFF = "LiveBusinessLog";
        jSONObject.put("log_name", str);
    }

    public final void LJ(String str) {
        this.LJ = str;
        this.LIZIZ.put("page", str);
    }

    public final void LJIIIIZZ(int i) {
        this.LIZLLL = i;
        if (i != -1) {
            this.LIZIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        }
    }

    public final void LIZ(Float f, String str) {
        if (f != null && !Float.isNaN(f.floatValue()) && !Float.isInfinite(f.floatValue())) {
            this.LIZIZ.put(str, f);
        } else {
            this.LIZIZ.put(str, Float.valueOf(0.0f));
        }
    }

    public final void LIZIZ(Integer num, String str) {
        int iIntValue;
        JSONObject jSONObject = this.LIZIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        jSONObject.put(str, iIntValue);
    }

    public final void LIZJ(Long l, String str) {
        long jLongValue;
        JSONObject jSONObject = this.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject.put(str, jLongValue);
    }

    public final void LIZLLL(String str, String str2) {
        JSONObject jSONObject = this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put(str, str2);
    }

    public final void LJFF(Integer num, String str) {
        int iIntValue;
        JSONObject jSONObject = this.LIZIZ;
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        jSONObject.put(str, iIntValue);
        JSONObject jSONObject2 = this.LIZJ;
        if (num != null) {
            iIntValue2 = num.intValue();
        }
        jSONObject2.put(str, iIntValue2);
    }

    public final void LJI(Long l, String str) {
        long jLongValue;
        JSONObject jSONObject = this.LIZIZ;
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject.put(str, jLongValue);
        JSONObject jSONObject2 = this.LIZJ;
        if (l != null) {
            jLongValue2 = l.longValue();
        }
        jSONObject2.put(str, jLongValue2);
    }

    public final void LJII(String str, String str2) {
        String str3;
        JSONObject jSONObject = this.LIZIZ;
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        jSONObject.put(str, str3);
        JSONObject jSONObject2 = this.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put(str, str2);
    }
}
