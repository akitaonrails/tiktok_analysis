package X;

/* JADX INFO: renamed from: X.0uW1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706750uW1 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final EnumC1706740uW0 LJ;
    public final int LJFF;
    public final int LJI;
    public final EnumC1706740uW0 LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1706750uW1)) {
            return false;
        }
        C1706750uW1 c1706750uW1 = (C1706750uW1) obj;
        return this.LIZ == c1706750uW1.LIZ && this.LIZIZ == c1706750uW1.LIZIZ && this.LIZJ == c1706750uW1.LIZJ && this.LIZLLL == c1706750uW1.LIZLLL && this.LJ == c1706750uW1.LJ && this.LJFF == c1706750uW1.LJFF && this.LJI == c1706750uW1.LJI && this.LJII == c1706750uW1.LJII;
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostPaymentGuideLayoutSpec(headerHeightDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bodyTopMarginDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bodyRowTopMarginDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bodyRowBottomMarginDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bodyTextTone=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", bodyIconSizeDp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", bodyIconRightMarginDp=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", bodyIconTintTone=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1706750uW1(int i, int i2, int i3, int i4, EnumC1706740uW0 enumC1706740uW0, int i5, int i6, EnumC1706740uW0 enumC1706740uW02) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = enumC1706740uW0;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = enumC1706740uW02;
    }
}
