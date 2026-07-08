package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03OC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OC implements IEvent {
    public final PaymentMethodsData LIZ;
    public final List<PaymentMethod> LIZIZ;
    public final PaymentMethod LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final PaymentMethodsData LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03OC)) {
            return false;
        }
        C03OC c03oc = (C03OC) obj;
        return Intrinsics.LJFF(this.LIZ, c03oc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03oc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c03oc.LIZJ) && this.LIZLLL == c03oc.LIZLLL && this.LJ == c03oc.LJ && Intrinsics.LJFF(this.LJFF, c03oc.LJFF);
    }

    public final int hashCode() {
        PaymentMethodsData paymentMethodsData = this.LIZ;
        int iHashCode = (paymentMethodsData == null ? 0 : paymentMethodsData.hashCode()) * 31;
        List<PaymentMethod> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        PaymentMethod paymentMethod = this.LIZJ;
        int iHashCode3 = (((((iHashCode2 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        PaymentMethodsData paymentMethodsData2 = this.LJFF;
        return iHashCode3 + (paymentMethodsData2 != null ? paymentMethodsData2.hashCode() : 0);
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
        sbLIZ.append("PaymentPricingDataUpdateEvent(localPaymentMethodsData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", independentPaymentMethods=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentPaymentMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", newCardScene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", secondPay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", remotePaymentMethodsData=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03OC(PaymentMethodsData paymentMethodsData, List<PaymentMethod> list, PaymentMethod paymentMethod, boolean z, boolean z2, PaymentMethodsData paymentMethodsData2) {
        this.LIZ = paymentMethodsData;
        this.LIZIZ = list;
        this.LIZJ = paymentMethod;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = paymentMethodsData2;
    }
}
