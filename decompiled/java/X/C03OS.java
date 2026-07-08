package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03OS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OS implements IEvent {
    public final PaymentMethod LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final PaymentMethod LIZLLL;

    public C03OS() {
        this(null, false, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03OS)) {
            return false;
        }
        C03OS c03os = (C03OS) obj;
        return Intrinsics.LJFF(this.LIZ, c03os.LIZ) && this.LIZIZ == c03os.LIZIZ && this.LIZJ == c03os.LIZJ && Intrinsics.LJFF(this.LIZLLL, c03os.LIZLLL);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LIZ;
        int iHashCode = (((((paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        PaymentMethod paymentMethod2 = this.LIZLLL;
        return iHashCode + (paymentMethod2 != null ? paymentMethod2.hashCode() : 0);
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
        sbLIZ.append("MiniOspEcSubPaymentBottomButtonClickedEvent(selectedSubPaymentMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFromOsp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isHybrid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", parentPaymentMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03OS(PaymentMethod paymentMethod, boolean z, boolean z2, PaymentMethod paymentMethod2) {
        this.LIZ = paymentMethod;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = paymentMethod2;
    }
}
