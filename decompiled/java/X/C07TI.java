package X;

/* JADX INFO: renamed from: X.07TI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TI {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07TI) && Float.compare(this.LIZ, ((C07TI) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Params(heightDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C07TI(float f) {
        this.LIZ = f;
    }
}
