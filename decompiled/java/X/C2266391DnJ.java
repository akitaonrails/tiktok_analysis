package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2266391DnJ extends AbstractC336760DIc {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL = "1";
    public final long LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2266391DnJ)) {
            return false;
        }
        C2266391DnJ c2266391DnJ = (C2266391DnJ) obj;
        return Intrinsics.LJFF(this.LIZ, c2266391DnJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2266391DnJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2266391DnJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2266391DnJ.LIZLLL) && this.LJ == c2266391DnJ.LJ && Intrinsics.LJFF(this.LJFF, c2266391DnJ.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentResultSuccess(orderId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orderAmount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paymentMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paymentStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", paymentDurationMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", placeOrderSessionId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2266391DnJ(String str, String str2, long j, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LJ = j;
        this.LJFF = str4;
    }
}
