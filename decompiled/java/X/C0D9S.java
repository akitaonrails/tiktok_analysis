package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9S, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D9S {
    public final String LIZ;
    public final CheckoutIntent LIZIZ;
    public final CheckoutStoredUserAddress LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C0D7I LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D9S)) {
            return false;
        }
        C0D9S c0d9s = (C0D9S) obj;
        return Intrinsics.LJFF(this.LIZ, c0d9s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d9s.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d9s.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0d9s.LIZLLL) && Intrinsics.LJFF(this.LJ, c0d9s.LJ) && Intrinsics.LJFF(this.LJFF, c0d9s.LJFF) && Intrinsics.LJFF(this.LJI, c0d9s.LJI) && Intrinsics.LJFF(this.LJII, c0d9s.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C0D7I c0d7i = this.LJFF;
        int iHashCode4 = (iHashCode3 + (c0d7i == null ? 0 : c0d7i.hashCode())) * 31;
        String str3 = this.LJI;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJII;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompleteCheckoutInput(checkoutId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", intent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", address=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paymentToken=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", paymentMethodType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", billingAddress=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", paymentMethodId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", instrumentId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D9S(String str, CheckoutIntent checkoutIntent, CheckoutStoredUserAddress checkoutStoredUserAddress, String str2, String str3, C0D7I c0d7i, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = checkoutIntent;
        this.LIZJ = checkoutStoredUserAddress;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = c0d7i;
        this.LJI = str4;
        this.LJII = str5;
    }
}
