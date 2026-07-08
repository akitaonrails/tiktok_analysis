package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7767031p {
    public final Amount LIZ;
    public final Amount LIZIZ;
    public final Amount LIZJ;
    public final Amount LIZLLL;
    public final List<PaymentMethod> LJ;
    public final List<PaymentMethod> LJFF;
    public final List<PaymentMethod> LJI;
    public final Integer LJII;
    public final String LJIIIIZZ;

    public C7767031p() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7767031p)) {
            return false;
        }
        C7767031p c7767031p = (C7767031p) obj;
        return Intrinsics.LJFF(this.LIZ, c7767031p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c7767031p.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c7767031p.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c7767031p.LIZLLL) && Intrinsics.LJFF(this.LJ, c7767031p.LJ) && Intrinsics.LJFF(this.LJFF, c7767031p.LJFF) && Intrinsics.LJFF(this.LJI, c7767031p.LJI) && Intrinsics.LJFF(this.LJII, c7767031p.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c7767031p.LJIIIIZZ);
    }

    public final int hashCode() {
        Amount amount = this.LIZ;
        int iHashCode = (amount == null ? 0 : amount.hashCode()) * 31;
        Amount amount2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        Amount amount3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (amount3 == null ? 0 : amount3.hashCode())) * 31;
        Amount amount4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (amount4 == null ? 0 : amount4.hashCode())) * 31;
        List<PaymentMethod> list = this.LJ;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<PaymentMethod> list2 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PaymentMethod> list3 = this.LJI;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.LJII;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LJIIIIZZ;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HybridInfo(creditBalanceAmount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creditFreezeAmount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creditPaymentAmount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", remainedAmount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", recommendPaymentMethods=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", storedMethods=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", paymentMethods=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", recommendMethodShowCount=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", creditPaymentType=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7767031p(Amount amount, Amount amount2, Amount amount3, Amount amount4, List<PaymentMethod> list, List<PaymentMethod> list2, List<PaymentMethod> list3, Integer num, String str) {
        this.LIZ = amount;
        this.LIZIZ = amount2;
        this.LIZJ = amount3;
        this.LIZLLL = amount4;
        this.LJ = list;
        this.LJFF = list2;
        this.LJI = list3;
        this.LJII = num;
        this.LJIIIIZZ = str;
    }
}
