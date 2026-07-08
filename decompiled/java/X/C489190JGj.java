package X;

/* JADX INFO: renamed from: X.0JGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489190JGj extends AbstractC489130JGd {
    public final float LIZ;

    public C489190JGj() {
        this(0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C489190JGj) && Float.compare(this.LIZ, ((C489190JGj) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LOADING(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C489190JGj(float f) {
        this.LIZ = f;
    }
}
