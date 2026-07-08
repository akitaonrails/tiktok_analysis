package X;

/* JADX INFO: renamed from: X.1Bm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214701Bm8 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJFF;
    public final long LJ = -1;
    public final long LJI = -1;
    public final long LJII = -1;

    public final boolean LIZ() {
        return this.LIZ > 0 && this.LIZIZ >= 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResourcePsiStartPoint{monoNs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", execNs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", waitNs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sleepNs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", blockNs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", iowaitNs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", voluntarySwitches=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", involuntarySwitches=");
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2214701Bm8(long j, long j2, long j3, long j4, long j5) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJFF = j5;
    }
}
