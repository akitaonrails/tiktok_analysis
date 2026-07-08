package X;

/* JADX INFO: renamed from: X.07TF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TF {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07TF) && Float.compare(this.LIZ, ((C07TF) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FloatValue(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C07TF(float f) {
        this.LIZ = f;
    }
}
