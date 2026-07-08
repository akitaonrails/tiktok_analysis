package X;

/* JADX INFO: renamed from: X.0o51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459370o51 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final C375830EoP<Boolean> LJIIIZ;
    public final boolean LJIIJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1459370o51() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1459370o51(int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4) {
        String str;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        int i5 = i3;
        int i6 = i2;
        int i7 = (i4 & 1) != 0 ? 0 : i;
        i6 = (i4 & 2) != 0 ? 0 : i6;
        i5 = (i4 & 4) != 0 ? 0 : i5;
        z6 = (i4 & 8) != 0 ? false : z6;
        z5 = (i4 & 16) != 0 ? false : z5;
        z4 = (i4 & 32) != 0 ? false : z4;
        boolean z7 = (i4 & 64) != 0;
        if ((i4 & 128) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(i7, i6, i5, z6, z5, z4, z7, str, (i4 & 256) == 0 ? null : "", null, false);
    }

    public C1459370o51(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, C375830EoP<Boolean> c375830EoP, boolean z5) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = str;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = c375830EoP;
        this.LJIIJ = z5;
    }

    public static C1459370o51 LIZ(C1459370o51 c1459370o51, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, C375830EoP c375830EoP, int i4) {
        boolean z5;
        C375830EoP c375830EoP2 = c375830EoP;
        String str3 = str2;
        String str4 = str;
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        boolean z9 = z;
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        if ((i4 & 1) != 0) {
            i7 = c1459370o51.LIZ;
        }
        if ((i4 & 2) != 0) {
            i6 = c1459370o51.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            i5 = c1459370o51.LIZJ;
        }
        if ((i4 & 8) != 0) {
            z9 = c1459370o51.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            z8 = c1459370o51.LJ;
        }
        if ((i4 & 32) != 0) {
            z7 = c1459370o51.LJFF;
        }
        if ((i4 & 64) != 0) {
            z6 = c1459370o51.LJI;
        }
        if ((i4 & 128) != 0) {
            str4 = c1459370o51.LJII;
        }
        if ((i4 & 256) != 0) {
            str3 = c1459370o51.LJIIIIZZ;
        }
        if ((i4 & 512) != 0) {
            c375830EoP2 = c1459370o51.LJIIIZ;
        }
        if ((i4 & 1024) != 0) {
            z5 = c1459370o51.LJIIJ;
        } else {
            z5 = false;
        }
        c1459370o51.getClass();
        return new C1459370o51(i7, i6, i5, z9, z8, z7, z6, str4, str3, c375830EoP2, z5);
    }
}
