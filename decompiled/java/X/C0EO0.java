package X;

/* JADX INFO: renamed from: X.0EO0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EO0 {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final long LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EO0)) {
            return false;
        }
        C0EO0 c0eo0 = (C0EO0) obj;
        return Float.compare(this.LIZ, c0eo0.LIZ) == 0 && Float.compare(this.LIZIZ, c0eo0.LIZIZ) == 0 && Float.compare(this.LIZJ, c0eo0.LIZJ) == 0 && Float.compare(this.LIZLLL, c0eo0.LIZLLL) == 0 && Float.compare(this.LJ, c0eo0.LJ) == 0 && this.LJFF == c0eo0.LJFF && this.LJI == c0eo0.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RectInfo(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", centerX=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", centerY=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rotate=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public C0EO0(float f, float f2, float f3, float f4, float f5, long j, long j2) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        this.LJFF = j;
        this.LJI = j2;
    }
}
