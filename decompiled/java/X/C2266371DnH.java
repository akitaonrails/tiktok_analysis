package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2266371DnH extends AbstractC336760DIc {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2266371DnH)) {
            return false;
        }
        C2266371DnH c2266371DnH = (C2266371DnH) obj;
        return Intrinsics.LJFF(this.LIZ, c2266371DnH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2266371DnH.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2266371DnH.LIZJ) && this.LIZLLL == c2266371DnH.LIZLLL && this.LJ == c2266371DnH.LJ && Intrinsics.LJFF(this.LJFF, c2266371DnH.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentSubmit(orderAmount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paymentMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", protocolCheckoutType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasCouponApplied=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", placeOrderSessionId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2266371DnH(String str, String str2, String str3, int i, int i2, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = str4;
    }
}
