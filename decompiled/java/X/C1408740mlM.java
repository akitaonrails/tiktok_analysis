package X;

/* JADX INFO: renamed from: X.0mlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408740mlM {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1408740mlM)) {
            return false;
        }
        C1408740mlM c1408740mlM = (C1408740mlM) obj;
        return this.LIZ == c1408740mlM.LIZ && this.LIZIZ == c1408740mlM.LIZIZ && this.LIZJ == c1408740mlM.LIZJ && this.LIZLLL == c1408740mlM.LIZLLL && this.LJ == c1408740mlM.LJ && this.LJFF == c1408740mlM.LJFF;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuPropPayload(isSelectedChanged=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isEnabledChanged=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textChanged=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", imageChanged=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", tagChanged=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cellStyleChanged=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1408740mlM(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = z5;
        this.LJFF = z6;
    }
}
