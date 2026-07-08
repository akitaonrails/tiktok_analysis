package X;

/* JADX INFO: renamed from: X.0kMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316750kMz {
    public final C1316810kN5 LIZ;
    public final EnumC1300260jwO LIZIZ;
    public final EnumC1300260jwO LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + this.LJFF) * 31) + (this.LJI ? 1 : 0)) * 31) + (this.LJII ? 1 : 0)) * 31) + (this.LJIIIIZZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) this.LIZ.LIZ);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" ");
        sbLIZ.append(this.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1316750kMz)) {
            return false;
        }
        C1316750kMz c1316750kMz = (C1316750kMz) obj;
        if (!this.LIZ.equals(c1316750kMz.LIZ) || this.LIZIZ != c1316750kMz.LIZIZ || this.LIZJ != c1316750kMz.LIZJ || this.LIZLLL != c1316750kMz.LIZLLL || this.LJ != c1316750kMz.LJ || this.LJFF != c1316750kMz.LJFF || this.LJI != c1316750kMz.LJI || this.LJII != c1316750kMz.LJII || this.LJIIIIZZ != c1316750kMz.LJIIIIZZ) {
            return false;
        }
        return true;
    }

    public C1316750kMz(CharSequence charSequence, C1316720kMw c1316720kMw, EnumC1300260jwO enumC1300260jwO, EnumC1300260jwO enumC1300260jwO2, float f, float f2, int i, boolean z, boolean z2, boolean z3) {
        this.LIZ = new C1316810kN5(charSequence, c1316720kMw);
        this.LIZLLL = f;
        this.LJ = f2;
        this.LIZIZ = enumC1300260jwO;
        this.LIZJ = enumC1300260jwO2;
        this.LJFF = i;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
    }
}
