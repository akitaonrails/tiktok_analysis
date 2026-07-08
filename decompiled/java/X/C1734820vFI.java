package X;

/* JADX INFO: renamed from: X.0vFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734820vFI {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1734820vFI)) {
            return false;
        }
        C1734820vFI c1734820vFI = (C1734820vFI) obj;
        return this.LIZ == c1734820vFI.LIZ && this.LIZIZ == c1734820vFI.LIZIZ && this.LIZJ == c1734820vFI.LIZJ && this.LIZLLL == c1734820vFI.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsFormFieldMetrics(total=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", required=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", prefilled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", filled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1734820vFI(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
