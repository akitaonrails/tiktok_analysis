package X;

/* JADX INFO: renamed from: X.12ZS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZS {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final Long LJII;
    public final Long LJIIIIZZ;
    public final Long LJIIIZ;
    public final Boolean LJIIJ;

    public final C12ZS LIZ(long j, long j2) {
        return new C12ZS(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, j, Long.valueOf(j2), this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
    }

    public C12ZS(String str, String str2, long j) {
        this(str, str2, 0L, 0L, 0L, j, 0L, null, null, null, null);
    }

    public final C12ZS LIZIZ(Boolean bool, Long l, Long l2) {
        Boolean bool2 = bool;
        if (bool2 != null && !bool2.booleanValue()) {
            bool2 = null;
        }
        return new C12ZS(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, l, l2, bool2);
    }

    public C12ZS(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        C0W3J.LJI(str);
        C0W3J.LJI(str2);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZIZ(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0W3J.LIZIZ(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0W3J.LIZIZ(z3);
        C0W3J.LIZIZ(j5 >= 0);
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = j5;
        this.LJII = l;
        this.LJIIIIZZ = l2;
        this.LJIIIZ = l3;
        this.LJIIJ = bool;
    }
}
