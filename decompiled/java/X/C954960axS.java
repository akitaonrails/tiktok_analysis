package X;

/* JADX INFO: renamed from: X.0axS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954960axS {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkRtcState(joiningRtc=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", joinedRtc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pushStream=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", forwardStream=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mixStream=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", rtcError=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", rtcLost=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", forwardStreamError=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C954960axS(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = z5;
        this.LJFF = z6;
        this.LJI = z7;
        this.LJII = z8;
        this.LJIIIIZZ = str;
    }
}
