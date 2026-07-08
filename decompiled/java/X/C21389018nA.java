package X;

/* JADX INFO: renamed from: X.18nA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21389018nA {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21389018nA)) {
            return false;
        }
        C21389018nA c21389018nA = (C21389018nA) obj;
        return Float.compare(this.LIZ, c21389018nA.LIZ) == 0 && Float.compare(this.LIZIZ, c21389018nA.LIZIZ) == 0 && Float.compare(this.LIZJ, c21389018nA.LIZJ) == 0 && Float.compare(this.LIZLLL, c21389018nA.LIZLLL) == 0 && Float.compare(this.LJ, c21389018nA.LJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MorphFrame(scale=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", transX=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", transY=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cornerRadius=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", clipHeight=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ);
    }

    public C21389018nA(float f, float f2, float f3, float f4, float f5) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
    }
}
