package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gPQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164500gPQ {
    public final EnumC336190DFx LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164500gPQ)) {
            return false;
        }
        C1164500gPQ c1164500gPQ = (C1164500gPQ) obj;
        return this.LIZ == c1164500gPQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1164500gPQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1164500gPQ.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentInfo(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paymentInfoString=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1164500gPQ(EnumC336190DFx enumC336190DFx, String str, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        this.LIZ = enumC336190DFx;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
