package X;

/* JADX INFO: renamed from: X.0fJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122670fJx {
    public final EnumC1122660fJw LIZ;
    public final C056S LIZIZ;
    public final float LIZJ = 0.0f;
    public final EnumC1122690fJz LIZLLL;
    public final float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1122670fJx)) {
            return false;
        }
        C1122670fJx c1122670fJx = (C1122670fJx) obj;
        return this.LIZ == c1122670fJx.LIZ && this.LIZIZ == c1122670fJx.LIZIZ && Float.compare(this.LIZJ, c1122670fJx.LIZJ) == 0 && this.LIZLLL == c1122670fJx.LIZLLL && Float.compare(this.LJ, c1122670fJx.LJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoutingResult(skuType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", routingScore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", triggerSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", triggerModelScore=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + Float.floatToIntBits(this.LJ);
    }

    public C1122670fJx(EnumC1122660fJw enumC1122660fJw, C056S c056s, EnumC1122690fJz enumC1122690fJz, float f) {
        this.LIZ = enumC1122660fJw;
        this.LIZIZ = c056s;
        this.LIZLLL = enumC1122690fJz;
        this.LJ = f;
    }
}
