package X;

/* JADX INFO: renamed from: X.12TN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12TN {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final C375830EoP<Boolean> LIZLLL;
    public final C375830EoP<Boolean> LJ;
    public final C375830EoP<Boolean> LJFF;
    public final String LJI;

    public C12TN() {
        this(0);
    }

    public /* synthetic */ C12TN(int i) {
        C375830EoP c375830EoP = new C375830EoP(Boolean.FALSE);
        Boolean bool = Boolean.TRUE;
        this(0, 0, 0, c375830EoP, new C375830EoP(bool), new C375830EoP(bool), "");
    }

    public static C12TN LIZ(C12TN c12tn, int i, int i2, int i3, int i4) {
        C375830EoP<Boolean> c375830EoP;
        C375830EoP<Boolean> c375830EoP2;
        C375830EoP<Boolean> c375830EoP3;
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        if ((i4 & 1) != 0) {
            i7 = c12tn.LIZ;
        }
        if ((i4 & 2) != 0) {
            i6 = c12tn.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            i5 = c12tn.LIZJ;
        }
        String str = null;
        if ((i4 & 8) != 0) {
            c375830EoP = c12tn.LIZLLL;
        } else {
            c375830EoP = null;
        }
        if ((i4 & 16) != 0) {
            c375830EoP2 = c12tn.LJ;
        } else {
            c375830EoP2 = null;
        }
        if ((i4 & 32) != 0) {
            c375830EoP3 = c12tn.LJFF;
        } else {
            c375830EoP3 = null;
        }
        if ((i4 & 64) != 0) {
            str = c12tn.LJI;
        }
        c12tn.getClass();
        return new C12TN(i7, i6, i5, c375830EoP, c375830EoP2, c375830EoP3, str);
    }

    public C12TN(int i, int i2, int i3, C375830EoP<Boolean> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<Boolean> c375830EoP3, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = c375830EoP;
        this.LJ = c375830EoP2;
        this.LJFF = c375830EoP3;
        this.LJI = str;
    }
}
