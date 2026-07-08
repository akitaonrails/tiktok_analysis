package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k8K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307660k8K {
    public final boolean LIZ;
    public final Object LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1307660k8K)) {
            return false;
        }
        C1307660k8K c1307660k8K = (C1307660k8K) obj;
        return this.LIZ == c1307660k8K.LIZ && Intrinsics.LJFF(this.LIZIZ, c1307660k8K.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1307660k8K.LIZJ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        Object obj = this.LIZIZ;
        int iHashCode = (iZ2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StarshipTTMResult(isError=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1307660k8K(Object obj, String str, boolean z) {
        this.LIZ = z;
        this.LIZIZ = obj;
        this.LIZJ = str;
    }
}
