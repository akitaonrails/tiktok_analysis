package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440670HPt {
    public final Integer LIZ;
    public final Boolean LIZIZ;
    public final InterfaceC440090HNn LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440670HPt)) {
            return false;
        }
        C440670HPt c440670HPt = (C440670HPt) obj;
        return Intrinsics.LJFF(this.LIZ, c440670HPt.LIZ) && Intrinsics.LJFF(this.LIZIZ, c440670HPt.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c440670HPt.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        InterfaceC440090HNn interfaceC440090HNn = this.LIZJ;
        return iHashCode2 + (interfaceC440090HNn != null ? interfaceC440090HNn.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionBarConfig(defaultIdType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableDualId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", defaultElement=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440670HPt(Integer num, Boolean bool, InterfaceC440090HNn interfaceC440090HNn) {
        this.LIZ = num;
        this.LIZIZ = bool;
        this.LIZJ = interfaceC440090HNn;
    }
}
