package X;

/* JADX INFO: renamed from: X.15Or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20513515Or {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20513515Or)) {
            return false;
        }
        C20513515Or c20513515Or = (C20513515Or) obj;
        return this.LIZ == c20513515Or.LIZ && this.LIZIZ == c20513515Or.LIZIZ && this.LIZJ == c20513515Or.LIZJ && this.LIZLLL == c20513515Or.LIZLLL && this.LJ == c20513515Or.LJ && this.LJFF == c20513515Or.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutSize(height=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cardTitleTopSpacing=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cardHeaderTopMargin=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", topCardHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", priceTopMargin=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cardHeaderBottomPadding=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20513515Or(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
    }
}
