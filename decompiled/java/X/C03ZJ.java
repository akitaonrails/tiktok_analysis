package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZJ implements IEvent {
    public final PaymentMethod LIZ;
    public final Boolean LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03ZJ)) {
            return false;
        }
        C03ZJ c03zj = (C03ZJ) obj;
        return Intrinsics.LJFF(this.LIZ, c03zj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03zj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c03zj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c03zj.LIZLLL) && Intrinsics.LJFF(this.LJ, c03zj.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Boolean bool = this.LIZIZ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.LJ;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubPaymentPromotionUIUpdateEvent(parentPM=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subShowPromotion=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subShowDiscountPromotion=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", subShowInterestFeePromotion=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", identifier=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03ZJ(PaymentMethod paymentMethod, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.LIZ = paymentMethod;
        this.LIZIZ = bool;
        this.LIZJ = bool2;
        this.LIZLLL = bool3;
        this.LJ = str;
    }
}
