package X;

/* JADX INFO: renamed from: X.0NBJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NBJ {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NBJ)) {
            return false;
        }
        C0NBJ c0nbj = (C0NBJ) obj;
        return Float.compare(this.LIZ, c0nbj.LIZ) == 0 && Float.compare(this.LIZIZ, c0nbj.LIZIZ) == 0 && Float.compare(this.LIZJ, c0nbj.LIZJ) == 0 && Float.compare(this.LIZLLL, c0nbj.LIZLLL) == 0 && Float.compare(this.LJ, c0nbj.LJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BrightnessMetaInfo(brightnessMean=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", brightRatioMean=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stdBrightness=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", overexposureRatioMean=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", diffOverexposureRatio=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NBJ() {
        this(-1.0f, -1.0f, -1.0f, -1.0f, -1.0f);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ);
    }

    public C0NBJ(float f, float f2, float f3, float f4, float f5) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
    }
}
