package X;

/* JADX INFO: renamed from: X.1517, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1517 {
    public final long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public final C151G LJI = new C151G();
    public String LJII = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public final C204519150z LJIIJ = new C204519150z();

    public final void LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZJ = jCurrentTimeMillis;
        this.LJ = jCurrentTimeMillis - this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("part1Duration: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", part2Duration: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", part3Duration: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fullDuration: ");
        sbLIZ.append(this.LIZLLL + this.LJ + this.LJFF);
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass1517(long j) {
        this.LIZ = j;
    }

    public final void LIZ(long j) {
        this.LIZIZ = j;
        this.LIZLLL = j - this.LIZ;
    }
}
