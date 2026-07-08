package X;

/* JADX INFO: renamed from: X.0tkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677300tkW extends AbstractC1677260tkS {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public final int LIZLLL = 3;

    @Override // X.AbstractC1677260tkS
    public final void LIZLLL() {
        this.LIZ = 0.0f;
        this.LIZIZ = 0.0f;
        this.LIZJ = 0.0f;
    }

    @Override // X.AbstractC1677260tkS
    public final AbstractC1677260tkS LIZJ() {
        return new C1677300tkW(0.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationVector3D: v1 = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", v2 = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", v3 = ");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1677260tkS
    public final int LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC1677260tkS
    public final float LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return 0.0f;
                }
                return this.LIZJ;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1677300tkW)) {
            return false;
        }
        C1677300tkW c1677300tkW = (C1677300tkW) obj;
        if (c1677300tkW.LIZ != this.LIZ || c1677300tkW.LIZIZ != this.LIZIZ || c1677300tkW.LIZJ != this.LIZJ) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1677260tkS
    public final void LJ(float f, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LIZJ = f;
                    return;
                }
                return;
            }
            this.LIZIZ = f;
            return;
        }
        this.LIZ = f;
    }

    public C1677300tkW(float f, float f2, float f3) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
    }
}
