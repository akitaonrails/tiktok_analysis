package X;

/* JADX INFO: renamed from: X.0xFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811680xFG {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1811680xFG)) {
            return false;
        }
        C1811680xFG c1811680xFG = (C1811680xFG) obj;
        return this.LIZ == c1811680xFG.LIZ && this.LIZIZ == c1811680xFG.LIZIZ && this.LIZJ == c1811680xFG.LIZJ && this.LIZLLL == c1811680xFG.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchTopology(isTwoMatch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isTwoHostsInMatch=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isIndividualMatch=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isTeamMatch=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1811680xFG(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
