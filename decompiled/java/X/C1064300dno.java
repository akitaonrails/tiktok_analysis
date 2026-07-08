package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064300dno {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJ;
    public String LJFF;
    public int LJI;
    public int LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchError{method='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", url='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", errorMessage='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", requestErrorCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", requestErrorMsg='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", jsbReturn=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", hitPrefetch=");
        sbLIZ.append(0);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(JSONObject jSONObject) {
        C1520640pfq.LJIILIIL("event_type", "fetchError", jSONObject);
        C1520640pfq.LJIIJJI(this.LJI, "error_no", jSONObject);
        C1520640pfq.LJIILIIL("error_msg", this.LJFF, jSONObject);
        C1520640pfq.LJIILIIL("method", this.LIZ, jSONObject);
        C1520640pfq.LJIILIIL("url", this.LIZIZ, jSONObject);
        C1520640pfq.LJIIJJI(this.LIZJ, "status_code", jSONObject);
        C1520640pfq.LJIIJJI(this.LIZLLL, "request_error_code", jSONObject);
        C1520640pfq.LJIILIIL("request_error_msg", this.LJ, jSONObject);
        C1520640pfq.LJIIJJI(this.LJII, "jsb_ret", jSONObject);
        C1520640pfq.LJIIJJI(0, "hit_prefetch", jSONObject);
    }
}
