package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064310dnp extends AbstractC1520150pf3 {
    public String LJI;
    public String LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;

    public C1064310dnp() {
        super("fetchError");
    }

    @Override // X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        C1520640pfq.LJIILIIL("method", this.LJI, jSONObject);
        C1520640pfq.LJIIJJI(this.LJIILIIL, "error_no", jSONObject);
        C1520640pfq.LJIILIIL("error_msg", this.LJIIL, jSONObject);
        C1520640pfq.LJIILIIL("url", this.LJII, jSONObject);
        C1520640pfq.LJIIJJI(this.LJIIIIZZ, "status_code", jSONObject);
        C1520640pfq.LJIIJJI(this.LJIIIZ, "request_error_code", jSONObject);
        C1520640pfq.LJIILIIL("request_error_msg", this.LJIIJ, jSONObject);
        C1520640pfq.LJIIJJI(this.LJIIJJI, "jsb_ret", jSONObject);
        C1520640pfq.LJIIJJI(0, "hit_prefetch", jSONObject);
    }
}
