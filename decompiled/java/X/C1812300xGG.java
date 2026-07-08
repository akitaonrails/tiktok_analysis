package X;

/* JADX INFO: renamed from: X.0xGG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812300xGG {
    public final int LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final EnumC992870bwb LJFF;
    public final float LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1812300xGG)) {
            return false;
        }
        C1812300xGG c1812300xGG = (C1812300xGG) obj;
        return this.LIZ == c1812300xGG.LIZ && Float.compare(this.LIZIZ, c1812300xGG.LIZIZ) == 0 && Float.compare(this.LIZJ, c1812300xGG.LIZJ) == 0 && Float.compare(this.LIZLLL, c1812300xGG.LIZLLL) == 0 && Float.compare(this.LJ, c1812300xGG.LJ) == 0 && this.LJFF == c1812300xGG.LJFF && Float.compare(this.LJI, c1812300xGG.LJI) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Params(topToBottomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", marginTopDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", marginHorizontalDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bias=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dividerHeightDp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", iconLimit=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + Float.floatToIntBits(this.LJI);
    }

    public /* synthetic */ C1812300xGG(int i, float f, float f2, float f3, EnumC992870bwb enumC992870bwb) {
        this(i, 8.0f, f, f2, f3, enumC992870bwb, 1.0f);
    }

    public C1812300xGG(int i, float f, float f2, float f3, float f4, EnumC992870bwb enumC992870bwb, float f5) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = enumC992870bwb;
        this.LJI = f5;
    }
}
