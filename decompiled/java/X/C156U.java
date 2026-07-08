package X;

/* JADX INFO: renamed from: X.156U, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C156U {
    public final boolean LIZ;
    public final CharSequence LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final C156K LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public C156U() {
        this(0);
    }

    public /* synthetic */ C156U(int i) {
        this(false, "", false, 0, new C156K(null, 3, 0), false, false, false);
    }

    public C156U(boolean z, CharSequence charSequence, boolean z2, int i, C156K c156k, boolean z3, boolean z4, boolean z5) {
        this.LIZ = z;
        this.LIZIZ = charSequence;
        this.LIZJ = z2;
        this.LIZLLL = i;
        this.LJ = c156k;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = z5;
    }

    public static C156U LIZ(C156U c156u, boolean z, CharSequence charSequence, boolean z2, int i, C156K c156k, boolean z3, boolean z4, boolean z5, int i2) {
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        C156K c156k2 = c156k;
        int i3 = i;
        boolean z9 = z2;
        CharSequence charSequence2 = charSequence;
        boolean z10 = z;
        if ((i2 & 1) != 0) {
            z10 = c156u.LIZ;
        }
        if ((i2 & 2) != 0) {
            charSequence2 = c156u.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z9 = c156u.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i3 = c156u.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c156k2 = c156u.LJ;
        }
        if ((i2 & 32) != 0) {
            z8 = c156u.LJFF;
        }
        if ((i2 & 64) != 0) {
            z7 = c156u.LJI;
        }
        if ((i2 & 128) != 0) {
            z6 = c156u.LJII;
        }
        c156u.getClass();
        return new C156U(z10, charSequence2, z9, i3, c156k2, z8, z7, z6);
    }
}
