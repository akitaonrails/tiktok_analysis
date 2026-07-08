package X;

/* JADX INFO: renamed from: X.05gE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1414405gE {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1414405gE)) {
            return false;
        }
        C1414405gE c1414405gE = (C1414405gE) obj;
        return this.LIZ == c1414405gE.LIZ && this.LIZIZ == c1414405gE.LIZIZ && this.LIZJ == c1414405gE.LIZJ && this.LIZLLL == c1414405gE.LIZLLL && this.LJ == c1414405gE.LJ && this.LJFF == c1414405gE.LJFF && this.LJI == c1414405gE.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentFilterSettings(commentOffensiveFilter=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", commentFilterAll=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", careModeStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", commentFilterStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isCommentManagerVisible=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isVulnerableUser=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", filterAllExpired=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1414405gE(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = i2;
        this.LJ = z3;
        this.LJFF = i3;
        this.LJI = i4;
    }
}
