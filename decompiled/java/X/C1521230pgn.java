package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521230pgn extends C1520160pf4 {
    public int LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public int LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public String LJIL;
    public int LJJ;
    public int LJJI;

    public C1521230pgn() {
        super("blank", new JSONObject());
        this.LJIJI = -1;
        this.LJIL = "";
    }

    @Override // X.C1520160pf4, X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        super.LIZ(jSONObject);
        C1520640pfq.LJIILJJIL(jSONObject, "effective_percentage", Float.valueOf(this.LJII));
        C1520640pfq.LJIIJJI(this.LJIIIZ, "view_height", jSONObject);
        C1520640pfq.LJIIJJI(this.LJIIJ, "view_width", jSONObject);
        C1520640pfq.LJIIJJI(this.LJIJJ, "view_alpha", jSONObject);
        C1520640pfq.LJIIJJI(this.LJIJJLI, "element_count", jSONObject);
        C1520640pfq.LJIIL("collect_time", this.LJIIL, jSONObject);
        C1520640pfq.LJIIL("calculate_time", this.LJIILIIL, jSONObject);
        C1520640pfq.LJIIL("cost_time", this.LJIIJJI, jSONObject);
        C1520640pfq.LJIIJJI(this.LJIILJJIL, "detect_type", jSONObject);
        C1520640pfq.LJIIL("enter_page_time", this.LJIILL, jSONObject);
        C1520640pfq.LJIIL("detect_start_time", this.LJIILLIIL, jSONObject);
        float f = this.LJIIIIZZ;
        if (f > 0.0f) {
            C1520640pfq.LJIILJJIL(jSONObject, "max_blank_rect_radio", Float.valueOf(f));
        }
        JSONObject jSONObject2 = new JSONObject();
        int i = this.LJIIZILJ;
        if (i != 0) {
            C1520640pfq.LJIIJJI(i, "http_rtt_ms", jSONObject2);
        }
        int i2 = this.LJIJ;
        if (i2 != 0) {
            C1520640pfq.LJIIJJI(i2, "transport_rtt_ms", jSONObject2);
        }
        int i3 = this.LJIJI;
        if (i3 >= 0) {
            C1520640pfq.LJIIJJI(i3, "load_state", jSONObject2);
        }
        C1520640pfq.LJIILJJIL(jSONObject, "assist_info", jSONObject2);
        C1520640pfq.LJIILIIL("bitmap", this.LJIL, jSONObject);
        C1520640pfq.LJIIJJI(this.LJJ, "bitmap_width", jSONObject);
        C1520640pfq.LJIIJJI(this.LJJI, "bitmap_height", jSONObject);
    }
}
