package X;

/* JADX INFO: renamed from: X.07To, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1868607To {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868607To)) {
            return false;
        }
        C1868607To c1868607To = (C1868607To) obj;
        return Float.compare(this.LIZ, c1868607To.LIZ) == 0 && Float.compare(this.LIZIZ, c1868607To.LIZIZ) == 0 && Float.compare(this.LIZJ, c1868607To.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemAnimationState(window=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", transition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", animator=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C1868607To(float f, float f2, float f3) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
    }
}
