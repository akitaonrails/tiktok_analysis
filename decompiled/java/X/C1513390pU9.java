package X;

/* JADX INFO: renamed from: X.0pU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513390pU9 implements InterfaceC1513720pUg {
    public final int LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1513390pU9)) {
            return false;
        }
        C1513390pU9 c1513390pU9 = (C1513390pU9) obj;
        return this.LIZ == c1513390pU9.LIZ && Float.compare(this.LIZIZ, c1513390pU9.LIZIZ) == 0 && Float.compare(this.LIZJ, c1513390pU9.LIZJ) == 0 && Float.compare(this.LIZLLL, c1513390pU9.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OHRPredictResultImpl(hand=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", leftPercent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rightPercent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", confidence=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    @Override // X.InterfaceC1513720pUg
    public final float LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1513720pUg
    public final int LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1513720pUg
    public final float LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1513720pUg
    public final float LIZLLL() {
        return this.LIZIZ;
    }

    public C1513390pU9(C1513490pUJ c1513490pUJ) {
        float f;
        int i = c1513490pUJ.LIZ;
        float f2 = c1513490pUJ.LIZIZ;
        float f3 = c1513490pUJ.LIZJ;
        if (i != 1) {
            if (i != 2) {
                f = 0.0f;
            } else {
                f = f3;
            }
        } else {
            f = f2;
        }
        this.LIZ = i;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f;
    }
}
