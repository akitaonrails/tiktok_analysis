package X;

/* JADX INFO: renamed from: X.07TW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TW {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07TW)) {
            return false;
        }
        C07TW c07tw = (C07TW) obj;
        return Float.compare(this.LIZ, c07tw.LIZ) == 0 && Float.compare(this.LIZIZ, c07tw.LIZIZ) == 0 && Float.compare(this.LIZJ, c07tw.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarSlotSpec(sizeDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", centerXDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", centerYDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C07TW(float f, float f2, float f3) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
    }
}
