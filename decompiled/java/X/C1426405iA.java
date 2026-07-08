package X;

/* JADX INFO: renamed from: X.05iA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1426405iA {
    public final EnumC1426605iC LIZ;
    public final float LIZIZ;
    public final float LIZLLL;
    public float LIZJ = 0.0f;
    public boolean LJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1426405iA)) {
            return false;
        }
        C1426405iA c1426405iA = (C1426405iA) obj;
        return this.LIZ == c1426405iA.LIZ && Float.compare(this.LIZIZ, c1426405iA.LIZIZ) == 0 && Float.compare(this.LIZJ, c1426405iA.LIZJ) == 0 && Float.compare(this.LIZLLL, c1426405iA.LIZLLL) == 0 && this.LJ == c1426405iA.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StageProgressTracker(stageType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", weight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subProgress=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startPos=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isCompleted=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public C1426405iA(EnumC1426605iC enumC1426605iC, float f, float f2) {
        this.LIZ = enumC1426605iC;
        this.LIZIZ = f;
        this.LIZLLL = f2;
    }
}
