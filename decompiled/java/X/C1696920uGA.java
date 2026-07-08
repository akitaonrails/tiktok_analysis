package X;

/* JADX INFO: renamed from: X.0uGA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696920uGA {
    public final int LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1696920uGA)) {
            return false;
        }
        C1696920uGA c1696920uGA = (C1696920uGA) obj;
        return this.LIZ == c1696920uGA.LIZ && Float.compare(this.LIZIZ, c1696920uGA.LIZIZ) == 0 && Float.compare(this.LIZJ, c1696920uGA.LIZJ) == 0 && Float.compare(this.LIZLLL, c1696920uGA.LIZLLL) == 0 && Float.compare(this.LJ, c1696920uGA.LJ) == 0 && Float.compare(this.LJFF, c1696920uGA.LJFF) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LegacyWaveLayer(color=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", baseAlpha=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", frequency=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", offset=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", colorCenter=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF);
    }

    public C1696920uGA(int i, float f, float f2, float f3, float f4, float f5) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = f5;
    }
}
