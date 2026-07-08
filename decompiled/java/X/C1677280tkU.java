package X;

/* JADX INFO: renamed from: X.0tkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677280tkU extends AbstractC1677260tkS {
    public float LIZ;
    public final int LIZIZ = 1;

    @Override // X.AbstractC1677260tkS
    public final void LIZLLL() {
        this.LIZ = 0.0f;
    }

    @Override // X.AbstractC1677260tkS
    public final AbstractC1677260tkS LIZJ() {
        return new C1677280tkU(0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationVector1D: value = ");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1677260tkS
    public final int LIZIZ() {
        return this.LIZIZ;
    }

    public C1677280tkU(float f) {
        this.LIZ = f;
    }

    @Override // X.AbstractC1677260tkS
    public final float LIZ(int i) {
        if (i == 0) {
            return this.LIZ;
        }
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1677280tkU) || ((C1677280tkU) obj).LIZ != this.LIZ) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1677260tkS
    public final void LJ(float f, int i) {
        if (i == 0) {
            this.LIZ = f;
        }
    }
}
