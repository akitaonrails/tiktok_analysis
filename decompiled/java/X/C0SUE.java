package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SUE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUE {
    public final Float LIZ;
    public final Float LIZIZ;
    public final Float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SUE)) {
            return false;
        }
        C0SUE c0sue = (C0SUE) obj;
        return Intrinsics.LJFF(this.LIZ, c0sue.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0sue.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0sue.LIZJ);
    }

    public final int hashCode() {
        Float f = this.LIZ;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.LIZJ;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypographyValues(headerMultiplier=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bodyMultiplier=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paragraphFactor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SUE(Float f, Float f2, Float f3) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
    }
}
