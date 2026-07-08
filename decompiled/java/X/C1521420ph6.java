package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ph6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521420ph6 extends AbstractC1521700phY {
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final JSONObject LJIILIIL;
    public final C1521290pgt LJIILJJIL;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0pgt] */
    public C1521420ph6(C1521360ph0 c1521360ph0) {
        super(c1521360ph0);
        this.LJIILIIL = new JSONObject();
        this.LJIILJJIL = new AbstractC1520150pf3() { // from class: X.0pgt
            {
                super("performance");
            }

            @Override // X.AbstractC1520070pev
            public final void LIZ(JSONObject jSONObject) {
                C1520640pfq.LJIIL("page_start", this.LJI.LIZLLL, jSONObject);
                C1520640pfq.LJIIL("page_finish", this.LJI.LJ, jSONObject);
                C1520640pfq.LJIIL("page_progress_100", this.LJI.LJFF, jSONObject);
                C1520640pfq.LJIIL("show_start", this.LJI.LJII, jSONObject);
                C1520640pfq.LJIIL("show_end", this.LJI.LJIIIIZZ, jSONObject);
                C1521420ph6 c1521420ph6 = this.LJI;
                if (c1521420ph6.LJIIJJI) {
                    C1520640pfq.LJIIL("init_time", c1521420ph6.LJIIIZ, jSONObject);
                }
                C1520640pfq.LJIIL("inject_js_time", this.LJI.LJI, jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                C1520640pfq.LJIIJJI(this.LJI.LJIIJ, "load_state", jSONObject2);
                C1520640pfq.LJIILJJIL(jSONObject, "assist_info", jSONObject2);
                C1520640pfq.LJIILJJIL(jSONObject, "event_counts", this.LJI.LJIILIIL);
                C1520640pfq.LJIIL("load_start", this.LJI.LIZ.LJIIL, jSONObject);
                C1520640pfq.LJIILJJIL(jSONObject, "is_first_page_started", Boolean.valueOf(this.LJI.LJIIL));
            }
        };
    }
}
