package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C862203Ym implements IEvent {
    public final PaymentMethod LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C862203Ym() {
        this(null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C862203Ym)) {
            return false;
        }
        C862203Ym c862203Ym = (C862203Ym) obj;
        return Intrinsics.LJFF(this.LIZ, c862203Ym.LIZ) && this.LIZIZ == c862203Ym.LIZIZ && this.LIZJ == c862203Ym.LIZJ;
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LIZ;
        return ((((paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
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
        sbLIZ.append("PaymentPricingSecondPayEvent(paymentMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", forceRequest=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", newCardScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C862203Ym(PaymentMethod paymentMethod, boolean z, boolean z2) {
        this.LIZ = paymentMethod;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
