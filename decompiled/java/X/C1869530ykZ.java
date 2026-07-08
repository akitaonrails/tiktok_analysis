package X;

/* JADX INFO: renamed from: X.0ykZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869530ykZ {
    public final float LIZ;
    public float LIZIZ = 1.0f;
    public int LIZJ;
    public boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869530ykZ)) {
            return false;
        }
        C1869530ykZ c1869530ykZ = (C1869530ykZ) obj;
        return Float.compare(this.LIZ, c1869530ykZ.LIZ) == 0 && Float.compare(this.LIZIZ, c1869530ykZ.LIZIZ) == 0 && this.LIZJ == c1869530ykZ.LIZJ && this.LIZLLL == c1869530ykZ.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DotInfo(centerX=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", color=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isVisible=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public C1869530ykZ(int i, float f, boolean z) {
        this.LIZ = f;
        this.LIZJ = i;
        this.LIZLLL = z;
    }
}
