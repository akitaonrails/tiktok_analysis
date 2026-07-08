package X;

/* JADX INFO: renamed from: X.1Dyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273611Dyx {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final long LJIIL;
    public final long LJIILIIL;
    public final long LJIILJJIL;
    public final long LJIILL;
    public final long LJIILLIIL;
    public final long LJIIZILJ;
    public final long LJIJ;
    public final long LJIJI;
    public final long LJIJJ;
    public final long LJIJJLI;
    public final long LJIL;
    public final long LJJ;
    public final long LJJI;
    public final long LJJIFFI;
    public final long LJJII;
    public final long LJJIII;
    public final long LJJIIJ;

    public static long LIZ(long j, long j2) {
        return (j < 0 || j2 < 0) ? j : j + j2;
    }

    public static long LIZIZ(long j, long j2) {
        if (j < 0 || j2 < 0) {
            return -1L;
        }
        long j3 = j2 - j;
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    public final C2273611Dyx LIZLLL(C2273651Dz1 c2273651Dz1) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6 = this.LIZ;
        if (j6 <= c2273651Dz1.LIZ) {
            return this;
        }
        long j7 = this.LIZJ;
        long jLIZ = this.LIZLLL;
        long jLIZ2 = this.LJ;
        long jLIZ3 = this.LJIIZILJ;
        long jLIZ4 = this.LJIJ;
        long jLIZ5 = this.LJIJI;
        long j8 = this.LJIIJJI;
        long jLIZ6 = this.LJIIL;
        long j9 = this.LJIILIIL;
        long jLIZ7 = this.LJIILJJIL;
        long jLIZ8 = this.LJIILL;
        long jLIZ9 = this.LJIILLIIL;
        long jMax = this.LJIJJ;
        long jMax2 = this.LJIJJLI;
        long j10 = this.LJIL;
        long j11 = this.LJJ;
        long j12 = this.LJJIFFI;
        long j13 = this.LJJII;
        long jMin = Math.min(j6, c2273651Dz1.LJI);
        long j14 = c2273651Dz1.LIZ;
        if (jMin > j14) {
            long j15 = jMin - j14;
            if (this.LIZ >= c2273651Dz1.LJI) {
                j = c2273651Dz1.LJII;
                j2 = c2273651Dz1.LJIIIIZZ;
                j3 = c2273651Dz1.LJIIIZ;
                j4 = c2273651Dz1.LJIIJ;
                j5 = c2273651Dz1.LJIIJJI;
            } else {
                j = this.LIZIZ;
                j2 = this.LJIIIIZZ;
                j3 = this.LJI;
                j4 = this.LJII;
                j5 = this.LJFF;
            }
            long jLIZIZ = LIZIZ(c2273651Dz1.LIZIZ, j);
            j8 += j15;
            if (jLIZIZ >= 0) {
                j9 += jLIZIZ;
            }
            jLIZ6 = LIZ(jLIZ6, LIZIZ(c2273651Dz1.LIZJ, j2));
            jLIZ7 = LIZ(jLIZ7, LIZIZ(c2273651Dz1.LIZLLL, j3));
            jLIZ8 = LIZ(jLIZ8, LIZIZ(c2273651Dz1.LJ, j4));
            jLIZ9 = LIZ(jLIZ9, LIZIZ(c2273651Dz1.LJFF, j5));
            if (j15 >= this.LJJI) {
                j10++;
                if (jLIZIZ >= 0) {
                    jMax += Math.max(0L, j15 - jLIZIZ);
                }
            } else {
                j11++;
                if (jLIZIZ >= 0) {
                    jMax2 += Math.max(0L, j15 - jLIZIZ);
                }
            }
            if (this.LIZ >= c2273651Dz1.LJI) {
                j12++;
                j13++;
            }
        }
        if (c2273651Dz1.LJIIL) {
            long j16 = this.LIZ;
            long j17 = c2273651Dz1.LJI;
            if (j16 > j17) {
                j7 += j16 - j17;
                jLIZ = LIZ(jLIZ, LIZIZ(c2273651Dz1.LJII, this.LIZIZ));
                jLIZ2 = LIZ(jLIZ2, LIZIZ(c2273651Dz1.LJIIIIZZ, this.LJIIIIZZ));
                jLIZ3 = LIZ(jLIZ3, LIZIZ(c2273651Dz1.LJIIIZ, this.LJI));
                jLIZ4 = LIZ(jLIZ4, LIZIZ(c2273651Dz1.LJIIJ, this.LJII));
                jLIZ5 = LIZ(jLIZ5, LIZIZ(c2273651Dz1.LJIIJJI, this.LJFF));
            }
        }
        return new C2273611Dyx(this.LIZ, this.LIZIZ, j7, jLIZ, jLIZ2, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, j8, jLIZ6, j9, jLIZ7, jLIZ8, jLIZ9, jLIZ3, jLIZ4, jLIZ5, jMax, jMax2, j10, j11, this.LJJI, j12, j13, this.LJJIII, this.LJJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.otis.resource.psi.ResourceContentionSnapshot LIZJ(X.C2273611Dyx r121, X.C2273611Dyx r122, com.bytedance.otis.resource.psi.ResourceContentionConfig r123, java.lang.String r124, long r125, boolean r127) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2273611Dyx.LIZJ(X.1Dyx, X.1Dyx, com.bytedance.otis.resource.psi.ResourceContentionConfig, java.lang.String, long, boolean):com.bytedance.otis.resource.psi.ResourceContentionSnapshot");
    }

    public C2273611Dyx(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j28, long j29, long j30) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = j6;
        this.LJI = j7;
        this.LJII = j8;
        this.LJIIIIZZ = j9;
        this.LJIIIZ = j10;
        this.LJIIJ = j11;
        this.LJIIJJI = j12;
        this.LJIIL = j13;
        this.LJIILIIL = j14;
        this.LJIILJJIL = j15;
        this.LJIILL = j16;
        this.LJIILLIIL = j17;
        this.LJIIZILJ = j18;
        this.LJIJ = j19;
        this.LJIJI = j20;
        this.LJIJJ = j21;
        this.LJIJJLI = j22;
        this.LJIL = j23;
        this.LJJ = j24;
        this.LJJI = j25;
        this.LJJIFFI = j26;
        this.LJJII = j28;
        this.LJJIII = j29;
        this.LJJIIJ = j30;
    }
}
