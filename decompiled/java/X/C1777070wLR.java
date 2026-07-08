package X;

/* JADX INFO: renamed from: X.0wLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777070wLR {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777070wLR)) {
            return false;
        }
        C1777070wLR c1777070wLR = (C1777070wLR) obj;
        return Float.compare(this.LIZ, c1777070wLR.LIZ) == 0 && Float.compare(this.LIZIZ, c1777070wLR.LIZIZ) == 0 && Float.compare(this.LIZJ, c1777070wLR.LIZJ) == 0 && Float.compare(this.LIZLLL, c1777070wLR.LIZLLL) == 0 && Float.compare(this.LJ, c1777070wLR.LJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TicketDimens(trayHeightDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", giftIconMarginLeftDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", giftIconSizeDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", giftTextMarginRightDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", giftTextSizeSp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ);
    }

    public C1777070wLR(float f, float f2, float f3, float f4, float f5) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
    }
}
