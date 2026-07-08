package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;

/* JADX INFO: renamed from: X.0L7L, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L7L implements C0L7K {
    public C0L7K LIZ;
    public String LIZJ;
    public String LIZLLL;
    public NLETemplateModel LJ;
    public C0L7B LJFF;
    public String LJII;
    public C0L7F LJIIIIZZ;
    public int LIZIZ = -1;
    public int LJI = -1;

    public C0L7L(C0L7K c0l7k) {
        this.LIZ = c0l7k;
    }

    public final void LJI(C0L7K c0l7k) {
        int i = this.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && c0l7k != null) {
                            c0l7k.onPreSuccess(this.LJ);
                        }
                    } else if (c0l7k != null) {
                        c0l7k.LIZJ(this.LJI, this.LJII, true);
                    }
                } else if (c0l7k != null) {
                    c0l7k.LIZLLL(this.LJFF, true);
                }
            } else if (c0l7k != null) {
                c0l7k.LJFF(this.LJIIIIZZ, true);
            }
        } else if (c0l7k != null) {
            c0l7k.LJ(this.LIZJ, this.LIZLLL, true);
        }
        this.LIZ = c0l7k;
    }

    @Override // X.C0L7K
    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
        this.LIZIZ = 4;
        this.LJ = nLETemplateModel;
        C0L7K c0l7k = this.LIZ;
        if (c0l7k != null) {
            c0l7k.onPreSuccess(nLETemplateModel);
        }
    }

    @Override // X.C0L7K
    public final void LIZLLL(C0L7B c0l7b, boolean z) {
        this.LIZIZ = 2;
        this.LJFF = c0l7b;
        C0L7K c0l7k = this.LIZ;
        if (c0l7k != null) {
            c0l7k.LIZLLL(c0l7b, false);
        }
    }

    @Override // X.C0L7K
    public final void LJFF(C0L7F c0l7f, boolean z) {
        this.LIZIZ = 1;
        this.LJIIIIZZ = c0l7f;
        C0L7K c0l7k = this.LIZ;
        if (c0l7k != null) {
            c0l7k.LJFF(c0l7f, false);
        }
    }

    @Override // X.C0L7K
    public final void LIZJ(int i, String str, boolean z) {
        this.LIZIZ = 3;
        this.LJI = i;
        this.LJII = str;
        C0L7K c0l7k = this.LIZ;
        if (c0l7k != null) {
            c0l7k.LIZJ(i, str, false);
        }
    }

    @Override // X.C0L7K
    public final void LJ(String str, String str2, boolean z) {
        this.LIZIZ = 0;
        this.LIZJ = str;
        this.LIZLLL = str2;
        C0L7K c0l7k = this.LIZ;
        if (c0l7k != null) {
            c0l7k.LJ(str, str2, false);
        }
    }
}
