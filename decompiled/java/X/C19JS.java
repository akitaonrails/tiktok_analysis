package X;

import android.content.Context;

/* JADX INFO: renamed from: X.19JS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JS {
    public float LIZ = Float.MIN_VALUE;
    public float LIZIZ = Float.MIN_VALUE;
    public int LIZJ;
    public final C19JV LIZLLL;
    public String LJ;
    public final Context LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public C1050110dQv LJIIIIZZ;

    public final void LIZ() {
        if (this.LJII) {
            this.LJIIIIZZ = new C1050110dQv();
        }
        C19JV c19jv = this.LIZLLL;
        if (c19jv == null) {
            return;
        }
        this.LIZJ = c19jv.LIZJ.optInt("slideThreshold");
        this.LJ = this.LIZLLL.LIZJ.optString("slideDirection");
    }

    public C19JS(Context context, C19JV c19jv, boolean z, boolean z2) {
        this.LJFF = context;
        this.LIZLLL = c19jv;
        this.LJI = z;
        this.LJII = z2;
        LIZ();
    }

    public C19JS(Context context, C19JV c19jv, C19JV c19jv2, boolean z, boolean z2) {
        this.LJFF = context;
        this.LIZLLL = c19jv;
        this.LJI = z;
        this.LJII = z2;
        LIZ();
    }
}
