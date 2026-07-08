package X;

/* JADX INFO: renamed from: X.18nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21391718nb {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21391718nb)) {
            return false;
        }
        C21391718nb c21391718nb = (C21391718nb) obj;
        return Float.compare(this.LIZ, c21391718nb.LIZ) == 0 && Float.compare(this.LIZIZ, c21391718nb.LIZIZ) == 0 && Float.compare(this.LIZJ, c21391718nb.LIZJ) == 0 && this.LIZLLL == c21391718nb.LIZLLL && this.LJ == c21391718nb.LJ && Float.compare(this.LJFF, c21391718nb.LJFF) == 0 && Float.compare(this.LJI, c21391718nb.LJI) == 0 && Float.compare(this.LJII, c21391718nb.LJII) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MorphGeom(startScale=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTransX=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startTransY=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageW=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pageH=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", startCornerRadius=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", startClipHeight=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", endClipHeight=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII);
    }

    public C21391718nb(float f, float f2, float f3, int i, int i2, float f4, float f5, float f6) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = f4;
        this.LJI = f5;
        this.LJII = f6;
    }
}
