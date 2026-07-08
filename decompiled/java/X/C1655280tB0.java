package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0tB0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655280tB0 {
    public final int[] LIZ;
    public final float[] LIZIZ;
    public final float[] LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GradientConfig(colors=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", stops=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append(", direction=");
        sbLIZ.append(Arrays.toString(this.LIZJ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.LIZ) * 31) + Arrays.hashCode(this.LIZIZ)) * 31) + Arrays.hashCode(this.LIZJ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1655280tB0)) {
            return false;
        }
        C1655280tB0 c1655280tB0 = (C1655280tB0) obj;
        if (Arrays.equals(this.LIZ, c1655280tB0.LIZ) && Arrays.equals(this.LIZIZ, c1655280tB0.LIZIZ) && Arrays.equals(this.LIZJ, c1655280tB0.LIZJ)) {
            return true;
        }
        return false;
    }

    public C1655280tB0(float[] fArr, float[] fArr2, int[] iArr) {
        this.LIZ = iArr;
        this.LIZIZ = fArr;
        this.LIZJ = fArr2;
    }
}
