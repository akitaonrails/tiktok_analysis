package X;

/* JADX INFO: renamed from: X.0Q4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664400Q4g {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public int LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public String LJIIJ = "";
    public int LJIIJJI = 1;

    public final long LIZ() {
        long j = this.LJIIIZ;
        if (j <= 0) {
            return -1L;
        }
        long j2 = this.LJIIIIZZ;
        if (j2 <= 0) {
            return -1L;
        }
        long j3 = j - j2;
        if (j3 > 0) {
            return j3;
        }
        return 0L;
    }

    public final long LIZIZ() {
        long j = this.LJFF;
        if (j <= 0) {
            return -1L;
        }
        long j2 = this.LJ;
        if (j2 <= 0) {
            return -1L;
        }
        long j3 = j - j2;
        if (j3 > 0) {
            return j3;
        }
        return 0L;
    }

    public final long LIZJ() {
        long j = this.LIZLLL;
        if (j <= 0) {
            return -1L;
        }
        long j2 = this.LIZIZ;
        if (j2 <= 0) {
            return -1L;
        }
        long j3 = j - j2;
        if (j3 > 0) {
            return j3;
        }
        return 0L;
    }

    public final long LIZLLL() {
        long j = this.LJIIIZ;
        if (j <= 0) {
            return -1L;
        }
        long j2 = this.LIZIZ;
        if (j2 <= 0) {
            return -1L;
        }
        long j3 = j - j2;
        if (j3 > 0) {
            return j3;
        }
        return 0L;
    }

    public final long LJ() {
        long j = this.LJ;
        if (j <= 0) {
            return -1L;
        }
        long j2 = this.LIZLLL;
        if (j2 <= 0) {
            return -1L;
        }
        long j3 = j - j2;
        if (j3 > 0) {
            return j3;
        }
        return 0L;
    }

    public final long LJFF() {
        long j = this.LJI;
        if (j <= 0) {
            return -1L;
        }
        long j2 = this.LJFF;
        if (j2 <= 0) {
            return -1L;
        }
        long j3 = j - j2;
        if (j3 > 0) {
            return j3;
        }
        return 0L;
    }

    public final long LJI() {
        long j = this.LJIIIIZZ;
        if (j <= 0) {
            return -1L;
        }
        long j2 = this.LJI;
        if (j2 <= 0) {
            return -1L;
        }
        long j3 = j - j2;
        if (j3 > 0) {
            return j3;
        }
        return 0L;
    }

    public final long LJII() {
        long j = this.LIZIZ;
        if (j <= 0) {
            return -1L;
        }
        long j2 = this.LIZ;
        if (j2 <= 0) {
            return -1L;
        }
        long j3 = j - j2;
        if (j3 > 0) {
            return j3;
        }
        return 0L;
    }

    public final boolean LJIIIIZZ() {
        int i = this.LJIIJJI;
        return i == 2 || i == 3;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Metrics@");
        sbLIZ.append(Integer.toHexString(hashCode()));
        sbLIZ.append("(source:");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", state:");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", autoplayCheck:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", beginPlay:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", endPlay:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", firstFrame:");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
