package X;

/* JADX INFO: renamed from: X.01vF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C488301vF {
    public static final float LJ = C418440Gaw.LIZIZ(Float.valueOf(390.0f));
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C488301vF)) {
            return false;
        }
        C488301vF c488301vF = (C488301vF) obj;
        return this.LIZ == c488301vF.LIZ && this.LIZIZ == c488301vF.LIZIZ && Float.compare(this.LIZJ, c488301vF.LIZJ) == 0 && Float.compare(this.LIZLLL, c488301vF.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardCanvasConfig(deviceWidthPx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deviceHeightPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", topOffsetPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottomMarginPx=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C488301vF(float f, float f2, int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
