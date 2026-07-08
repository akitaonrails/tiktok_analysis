package X;

/* JADX INFO: renamed from: X.0VIG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VIG {
    public String LIZ;
    public C0VIP LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public C795380VIa LJ;
    public C795380VIa LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public C0VIK LJIIIZ;
    public int LJIIJ;
    public C0VIT LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public boolean LJIILLIIL;
    public C0VIU LJIIZILJ;

    static {
        C0VI8.LIZIZ("WorkSpec");
    }

    public final long LIZ() {
        if (this.LIZIZ == C0VIP.ENQUEUED && this.LJIIJ > 0) {
            return this.LJIILIIL + Math.min(18000000L, this.LJIIJJI == C0VIT.LINEAR ? this.LJIIL * ((long) this.LJIIJ) : (long) Math.scalb(this.LJIIL, this.LJIIJ - 1));
        }
        if (!LIZJ()) {
            long jCurrentTimeMillis = this.LJIILIIL;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.LJI;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.LJIILIIL;
        if (j == 0) {
            j = this.LJI + jCurrentTimeMillis2;
        }
        long j2 = this.LJIIIIZZ;
        long j3 = this.LJII;
        if (j2 != j3) {
            return j + j3 + (j == 0 ? j2 * (-1) : 0L);
        }
        return j + (j != 0 ? j3 : 0L);
    }

    public final boolean LIZIZ() {
        return !C0VIK.LJIIIIZZ.equals(this.LJIIIZ);
    }

    public final boolean LIZJ() {
        return this.LJII != 0;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        long j = this.LJI;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.LJII;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.LJIIIIZZ;
        int iHashCode3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ) * 31) + this.LJIIJJI.hashCode()) * 31;
        long j4 = this.LJIIL;
        int i3 = (iHashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.LJIILIIL;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.LJIILJJIL;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.LJIILL;
        return ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.LJIILLIIL ? 1 : 0)) * 31) + this.LJIIZILJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{WorkSpec: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VIG(C0VIG c0vig) {
        this.LIZIZ = C0VIP.ENQUEUED;
        C795380VIa c795380VIa = C795380VIa.LIZIZ;
        this.LJ = c795380VIa;
        this.LJFF = c795380VIa;
        this.LJIIIZ = C0VIK.LJIIIIZZ;
        this.LJIIJJI = C0VIT.EXPONENTIAL;
        this.LJIIL = 30000L;
        this.LJIILL = -1L;
        this.LJIIZILJ = C0VIU.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.LIZ = c0vig.LIZ;
        this.LIZJ = c0vig.LIZJ;
        this.LIZIZ = c0vig.LIZIZ;
        this.LIZLLL = c0vig.LIZLLL;
        this.LJ = new C795380VIa(c0vig.LJ);
        this.LJFF = new C795380VIa(c0vig.LJFF);
        this.LJI = c0vig.LJI;
        this.LJII = c0vig.LJII;
        this.LJIIIIZZ = c0vig.LJIIIIZZ;
        this.LJIIIZ = new C0VIK(c0vig.LJIIIZ);
        this.LJIIJ = c0vig.LJIIJ;
        this.LJIIJJI = c0vig.LJIIJJI;
        this.LJIIL = c0vig.LJIIL;
        this.LJIILIIL = c0vig.LJIILIIL;
        this.LJIILJJIL = c0vig.LJIILJJIL;
        this.LJIILL = c0vig.LJIILL;
        this.LJIILLIIL = c0vig.LJIILLIIL;
        this.LJIIZILJ = c0vig.LJIIZILJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0VIG.class != obj.getClass()) {
            return false;
        }
        C0VIG c0vig = (C0VIG) obj;
        if (this.LJI != c0vig.LJI || this.LJII != c0vig.LJII || this.LJIIIIZZ != c0vig.LJIIIIZZ || this.LJIIJ != c0vig.LJIIJ || this.LJIIL != c0vig.LJIIL || this.LJIILIIL != c0vig.LJIILIIL || this.LJIILJJIL != c0vig.LJIILJJIL || this.LJIILL != c0vig.LJIILL || this.LJIILLIIL != c0vig.LJIILLIIL || !this.LIZ.equals(c0vig.LIZ) || this.LIZIZ != c0vig.LIZIZ || !this.LIZJ.equals(c0vig.LIZJ)) {
            return false;
        }
        String str = this.LIZLLL;
        if (str != null) {
            if (!str.equals(c0vig.LIZLLL)) {
                return false;
            }
        } else if (c0vig.LIZLLL != null) {
            return false;
        }
        if (this.LJ.equals(c0vig.LJ) && this.LJFF.equals(c0vig.LJFF) && this.LJIIIZ.equals(c0vig.LJIIIZ) && this.LJIIJJI == c0vig.LJIIJJI && this.LJIIZILJ == c0vig.LJIIZILJ) {
            return true;
        }
        return false;
    }

    public C0VIG(String str, String str2) {
        this.LIZIZ = C0VIP.ENQUEUED;
        C795380VIa c795380VIa = C795380VIa.LIZIZ;
        this.LJ = c795380VIa;
        this.LJFF = c795380VIa;
        this.LJIIIZ = C0VIK.LJIIIIZZ;
        this.LJIIJJI = C0VIT.EXPONENTIAL;
        this.LJIIL = 30000L;
        this.LJIILL = -1L;
        this.LJIIZILJ = C0VIU.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.LIZ = str;
        this.LIZJ = str2;
    }

    public final void LIZLLL(long j, long j2) {
        if (j < 900000) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L});
            c0vi8LIZ.getClass();
            j = 900000;
        }
        if (j2 < 300000) {
            C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
            C786410Ut5.j4("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{300000L});
            c0vi8LIZ2.getClass();
            j2 = 300000;
        }
        if (j2 > j) {
            C0VI8 c0vi8LIZ3 = C0VI8.LIZ();
            C786410Ut5.j4("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j)});
            c0vi8LIZ3.getClass();
            j2 = j;
        }
        this.LJII = j;
        this.LJIIIIZZ = j2;
    }
}
