package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ON, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ON implements IEvent {
    public final PaymentMethodsData LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03ON)) {
            return false;
        }
        C03ON c03on = (C03ON) obj;
        return Intrinsics.LJFF(this.LIZ, c03on.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03on.LIZIZ) && this.LIZJ == c03on.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
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
        sbLIZ.append("EcUpdatePmDataEvent(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pmId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isHybrid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03ON(PaymentMethodsData paymentMethodsData, String str, boolean z) {
        this.LIZ = paymentMethodsData;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
