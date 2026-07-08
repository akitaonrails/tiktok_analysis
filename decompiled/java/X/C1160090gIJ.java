package X;

/* JADX INFO: renamed from: X.0gIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160090gIJ {
    public static final /* synthetic */ int LIZIZ = 0;
    public final float LIZ;

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public final String toString() {
        float f = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaselineShift(multiplier=");
        sbLIZ.append(f);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        float f = this.LIZ;
        if (!(obj instanceof C1160090gIJ) || Float.compare(f, ((C1160090gIJ) obj).LIZ) != 0) {
            return false;
        }
        return true;
    }
}
