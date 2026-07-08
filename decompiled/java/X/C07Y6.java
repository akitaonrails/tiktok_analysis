package X;

/* JADX INFO: renamed from: X.07Y6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Y6 implements C0I6M {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07Y6) && Float.compare(this.LIZ, ((C07Y6) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoundedCorner(radius=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C07Y6(float f) {
        this.LIZ = f;
    }
}
