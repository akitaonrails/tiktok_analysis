package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0phD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521490phD extends AbstractC1520070pev {
    public static final /* synthetic */ int LJII = 0;
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public int LJI = -1;

    @Override // X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        C1520640pfq.LJIIL("load_start", this.LIZ, jSONObject);
        C1520640pfq.LJIIL("load_finish", this.LIZIZ, jSONObject);
        C1520640pfq.LJIIL("load_failed", 0L, jSONObject);
        C1520640pfq.LJIIL("show_start", this.LIZJ, jSONObject);
        C1520640pfq.LJIIL("show_end", this.LIZLLL, jSONObject);
        C1520640pfq.LJIIL("receive_error", 0L, jSONObject);
        C1520640pfq.LJIIL("first_screen", this.LJ, jSONObject);
        C1520640pfq.LJIIL("runtime_ready", this.LJFF, jSONObject);
    }
}
