package X;

/* JADX INFO: renamed from: X.0tkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677270tkT extends AbstractC1677260tkS {
    public float LIZ;
    public float LIZIZ;
    public final int LIZJ = 2;

    @Override // X.AbstractC1677260tkS
    public final void LIZLLL() {
        this.LIZ = 0.0f;
        this.LIZIZ = 0.0f;
    }

    @Override // X.AbstractC1677260tkS
    public final AbstractC1677260tkS LIZJ() {
        return new C1677270tkT(0.0f, 0.0f);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationVector2D: v1 = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", v2 = ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1677260tkS
    public final int LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1677260tkS
    public final float LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1677270tkT)) {
            return false;
        }
        C1677270tkT c1677270tkT = (C1677270tkT) obj;
        if (c1677270tkT.LIZ != this.LIZ || c1677270tkT.LIZIZ != this.LIZIZ) {
            return false;
        }
        return true;
    }

    public C1677270tkT(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }

    @Override // X.AbstractC1677260tkS
    public final void LJ(float f, int i) {
        if (i != 0) {
            if (i == 1) {
                this.LIZIZ = f;
                return;
            }
            return;
        }
        this.LIZ = f;
    }
}
