package X;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l0M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341160l0M {
    public final boolean LIZ;
    public final float LIZIZ;
    public final Size LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341160l0M)) {
            return false;
        }
        C1341160l0M c1341160l0M = (C1341160l0M) obj;
        return this.LIZ == c1341160l0M.LIZ && Float.compare(this.LIZIZ, c1341160l0M.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c1341160l0M.LIZJ) && this.LIZLLL == c1341160l0M.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImagePlan(useArgb8888=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", srLevel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resizeTarget=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxBitmapSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public C1341160l0M(boolean z, float f, Size size, int i) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = size;
        this.LIZLLL = i;
    }
}
