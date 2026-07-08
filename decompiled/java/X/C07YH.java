package X;

/* JADX INFO: renamed from: X.07YH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YH {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07YH)) {
            return false;
        }
        C07YH c07yh = (C07YH) obj;
        return this.LIZ == c07yh.LIZ && this.LIZIZ == c07yh.LIZIZ && this.LIZJ == c07yh.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RowInfo(rowCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFirstRow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isLastRow=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07YH(int i, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
