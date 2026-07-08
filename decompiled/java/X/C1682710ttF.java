package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ttF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682710ttF extends AbstractC1682720ttG {
    public final Integer LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1682710ttF)) {
            return false;
        }
        C1682710ttF c1682710ttF = (C1682710ttF) obj;
        return Intrinsics.LJFF(this.LIZ, c1682710ttF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1682710ttF.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1682710ttF(Integer num, String str) {
        this.LIZ = num;
        this.LIZIZ = str;
    }
}
