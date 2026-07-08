package X;

/* JADX INFO: renamed from: X.0bgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982760bgI {
    public final EnumC919170a1j LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final C769420UGe LJFF;
    public final long LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameScoreUpdateData(bizType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selfTeamScore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSelfTeamFinalScore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rivalTeamScore=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isRivalTeamFinalScore=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982760bgI(EnumC919170a1j enumC919170a1j, int i, boolean z, int i2, boolean z2, C769420UGe c769420UGe, long j) {
        this.LIZ = enumC919170a1j;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJ = z2;
        this.LJFF = c769420UGe;
        this.LJI = j;
    }
}
