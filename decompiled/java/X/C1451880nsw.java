package X;

/* JADX INFO: renamed from: X.0nsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451880nsw {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C375830EoP<Boolean> LJI;
    public final C375830EoP<Boolean> LJII;

    public C1451880nsw() {
        this(false, 255);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1451880nsw(boolean z, int i) {
        String str;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        if ((i & 1) != 0) {
            str = "";
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z4 = (i & 16) != 0 ? false : z4;
        if ((i & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this(str, z2, false, false, z4, z3, null, null);
    }

    public static C1451880nsw LIZ(C1451880nsw c1451880nsw, boolean z, boolean z2, boolean z3, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        String str;
        boolean z4;
        boolean z5;
        boolean z6 = z3;
        C375830EoP c375830EoP3 = c375830EoP2;
        boolean z7 = z2;
        C375830EoP c375830EoP4 = c375830EoP;
        boolean z8 = z;
        if ((i & 1) != 0) {
            str = c1451880nsw.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            z8 = c1451880nsw.LIZIZ;
        }
        if ((i & 4) != 0) {
            z7 = c1451880nsw.LIZJ;
        }
        if ((i & 8) != 0) {
            z6 = c1451880nsw.LIZLLL;
        }
        if ((i & 16) != 0) {
            z4 = c1451880nsw.LJ;
        } else {
            z4 = false;
        }
        if ((i & 32) != 0) {
            z5 = c1451880nsw.LJFF;
        } else {
            z5 = false;
        }
        if ((i & 64) != 0) {
            c375830EoP4 = c1451880nsw.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP3 = c1451880nsw.LJII;
        }
        c1451880nsw.getClass();
        return new C1451880nsw(str, z8, z7, z6, z4, z5, c375830EoP4, c375830EoP3);
    }

    public C1451880nsw(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C375830EoP<Boolean> c375830EoP, C375830EoP<Boolean> c375830EoP2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = z5;
        this.LJI = c375830EoP;
        this.LJII = c375830EoP2;
    }
}
