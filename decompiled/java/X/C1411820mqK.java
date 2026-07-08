package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411820mqK extends AbstractC1411840mqM {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final String LIZLLL;

    public C1411820mqK() {
        this(0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1411820mqK)) {
            return false;
        }
        C1411820mqK c1411820mqK = (C1411820mqK) obj;
        return this.LIZ == c1411820mqK.LIZ && this.LIZIZ == c1411820mqK.LIZIZ && Float.compare(this.LIZJ, c1411820mqK.LIZJ) == 0 && Intrinsics.LJFF(this.LIZLLL, c1411820mqK.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloudCompileError(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", f=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((this.LIZ * 31) + this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return iFloatToIntBits + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ C1411820mqK(int i, int i2) {
        this((i2 & 1) != 0 ? -1 : i, 0, 0.0f, null);
    }

    public C1411820mqK(int i, int i2, float f, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = f;
        this.LIZLLL = str;
    }
}
