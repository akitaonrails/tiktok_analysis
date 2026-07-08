package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DA1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DA1 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DA1)) {
            return false;
        }
        C0DA1 c0da1 = (C0DA1) obj;
        return Intrinsics.LJFF(this.LIZ, c0da1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0da1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0da1.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutProductPriceDisplayState(currentPriceText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originalPriceText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", discountText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DA1(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
