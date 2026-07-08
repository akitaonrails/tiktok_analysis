package X;

/* JADX INFO: renamed from: X.0tkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677390tkf extends AbstractC1677260tkS {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public final int LJ = 4;

    @Override // X.AbstractC1677260tkS
    public final void LIZLLL() {
        this.LIZ = 0.0f;
        this.LIZIZ = 0.0f;
        this.LIZJ = 0.0f;
        this.LIZLLL = 0.0f;
    }

    @Override // X.AbstractC1677260tkS
    public final AbstractC1677260tkS LIZJ() {
        return new C1677390tkf(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationVector4D: v1 = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", v2 = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", v3 = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", v4 = ");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1677260tkS
    public final int LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC1677260tkS
    public final float LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0.0f;
                    }
                    return this.LIZLLL;
                }
                return this.LIZJ;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1677390tkf)) {
            return false;
        }
        C1677390tkf c1677390tkf = (C1677390tkf) obj;
        if (c1677390tkf.LIZ != this.LIZ || c1677390tkf.LIZIZ != this.LIZIZ || c1677390tkf.LIZJ != this.LIZJ || c1677390tkf.LIZLLL != this.LIZLLL) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1677260tkS
    public final void LJ(float f, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.LIZLLL = f;
                        return;
                    }
                    return;
                }
                this.LIZJ = f;
                return;
            }
            this.LIZIZ = f;
            return;
        }
        this.LIZ = f;
    }

    public C1677390tkf(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
