package X;

/* JADX INFO: renamed from: X.0qks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562200qks extends AbstractC1562180qkq {
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1562200qks)) {
            return false;
        }
        C1562200qks c1562200qks = (C1562200qks) obj;
        return Float.compare(this.LIZIZ, c1562200qks.LIZIZ) == 0 && Float.compare(this.LIZJ, c1562200qks.LIZJ) == 0 && Float.compare(this.LIZLLL, c1562200qks.LIZLLL) == 0 && Float.compare(this.LJ, c1562200qks.LJ) == 0 && Float.compare(this.LJFF, c1562200qks.LJFF) == 0 && Float.compare(this.LJI, c1562200qks.LJI) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListDropPerformanceParams(drop0=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", drop1_2=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", drop3_6=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", drop7_13=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", drop14_25=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", drop25=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI);
    }

    public C1562200qks(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = f6;
    }
}
