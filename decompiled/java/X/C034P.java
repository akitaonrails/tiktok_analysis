package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.034P, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C034P implements IEvent {
    public final PaymentInfo LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C034P)) {
            return false;
        }
        C034P c034p = (C034P) obj;
        return Intrinsics.LJFF(this.LIZ, c034p.LIZ) && this.LIZIZ == c034p.LIZIZ;
    }

    public final int hashCode() {
        PaymentInfo paymentInfo = this.LIZ;
        return ((paymentInfo == null ? 0 : paymentInfo.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
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
        sbLIZ.append("BlikLaunchPayDirectlyEvent(paymentInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSecondPay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C034P(PaymentInfo paymentInfo, boolean z) {
        this.LIZ = paymentInfo;
        this.LIZIZ = z;
    }
}
