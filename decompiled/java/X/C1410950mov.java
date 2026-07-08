package X;

/* JADX INFO: renamed from: X.0mov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410950mov extends AbstractC1411370mpb {
    public final float LIZ;

    public C1410950mov() {
        this(0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1410950mov) && Float.compare(this.LIZ, ((C1410950mov) obj).LIZ) == 0;
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

    public C1410950mov(float f) {
        this.LIZ = f;
    }
}
