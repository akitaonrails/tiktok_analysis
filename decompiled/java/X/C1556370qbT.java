package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556370qbT {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556370qbT)) {
            return false;
        }
        C1556370qbT c1556370qbT = (C1556370qbT) obj;
        return Intrinsics.LJFF(this.LIZ, c1556370qbT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1556370qbT.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingPurchase(paymentReference=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556370qbT(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
