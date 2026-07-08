package X;

/* JADX INFO: renamed from: X.0ELV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELV {
    public final float LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ELV)) {
            return false;
        }
        C0ELV c0elv = (C0ELV) obj;
        return Float.compare(this.LIZ, c0elv.LIZ) == 0 && Float.compare(this.LIZIZ, c0elv.LIZIZ) == 0 && this.LIZJ == c0elv.LIZJ && Float.compare(this.LIZLLL, c0elv.LIZLLL) == 0 && Float.compare(this.LJ, c0elv.LJ) == 0 && Float.compare(this.LJFF, c0elv.LJFF) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OverlaySaveData(transX=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", transY=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", transZ=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rotate=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF);
    }

    public C0ELV(int i, float f, float f2, float f3, float f4, float f5) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = i;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = f5;
    }
}
