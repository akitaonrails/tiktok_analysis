package X;

/* JADX INFO: renamed from: X.00XP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00XP {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public C00XP() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00XP)) {
            return false;
        }
        C00XP c00xp = (C00XP) obj;
        return Float.compare(this.LIZ, c00xp.LIZ) == 0 && Float.compare(this.LIZIZ, c00xp.LIZIZ) == 0 && Float.compare(this.LIZJ, c00xp.LIZJ) == 0 && Float.compare(this.LIZLLL, c00xp.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Quad(sx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ey=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C00XP(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
