package X;

/* JADX INFO: renamed from: X.0GqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428030GqP {
    public final boolean LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final float LJFF = 10.0f;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C428030GqP)) {
            return false;
        }
        C428030GqP c428030GqP = (C428030GqP) obj;
        return this.LIZ == c428030GqP.LIZ && Float.compare(this.LIZIZ, c428030GqP.LIZIZ) == 0 && this.LIZJ == c428030GqP.LIZJ && this.LIZLLL == c428030GqP.LIZLLL && Float.compare(this.LJ, c428030GqP.LJ) == 0 && Float.compare(this.LJFF, c428030GqP.LJFF) == 0 && this.LJI == c428030GqP.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(hasNotch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", overlapWidth=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", strokeColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", strokeWidth=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", textSizeSp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Z2(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + this.LJI;
    }

    public C428030GqP(float f, float f2, int i, int i2, int i3, boolean z) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = f2;
        this.LJI = i3;
    }
}
