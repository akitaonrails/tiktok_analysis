package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03OO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OO implements IEvent {
    public final PaymentMethod LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C03OO() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03OO)) {
            return false;
        }
        C03OO c03oo = (C03OO) obj;
        return Intrinsics.LJFF(this.LIZ, c03oo.LIZ) && this.LIZIZ == c03oo.LIZIZ && this.LIZJ == c03oo.LIZJ && this.LIZLLL == c03oo.LIZLLL;
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LIZ;
        return ((((((paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
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
        sbLIZ.append("PaymentPricingOspEvent(paymentMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", forceRequest=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", newCardScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromCashier=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C03OO(PaymentMethod paymentMethod, int i) {
        this((i & 1) != 0 ? null : paymentMethod, false, false, false);
    }

    public C03OO(PaymentMethod paymentMethod, boolean z, boolean z2, boolean z3) {
        this.LIZ = paymentMethod;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}
