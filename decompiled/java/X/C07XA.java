package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07XA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XA implements C07XB {
    public final String LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07XA)) {
            return false;
        }
        C07XA c07xa = (C07XA) obj;
        return Intrinsics.LJFF(this.LIZ, c07xa.LIZ) && Float.compare(this.LIZIZ, c07xa.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssemPreloadSuccessRateParams(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", successRate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C07XA(String str, float f) {
        this.LIZ = str;
        this.LIZIZ = f;
    }
}
