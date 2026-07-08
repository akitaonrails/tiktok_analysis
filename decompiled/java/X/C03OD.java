package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LeadingElevatorBar;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03OD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OD implements IEvent {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final PaymentMethod LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final LeadingElevatorBar LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03OD)) {
            return false;
        }
        C03OD c03od = (C03OD) obj;
        return this.LIZ == c03od.LIZ && this.LIZIZ == c03od.LIZIZ && Intrinsics.LJFF(this.LIZJ, c03od.LIZJ) && this.LIZLLL == c03od.LIZLLL && Intrinsics.LJFF(this.LJ, c03od.LJ) && Intrinsics.LJFF(this.LJFF, c03od.LJFF);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        PaymentMethod paymentMethod = this.LIZJ;
        int iHashCode = (((iZ2 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LeadingElevatorBar leadingElevatorBar = this.LJFF;
        return iHashCode2 + (leadingElevatorBar != null ? leadingElevatorBar.hashCode() : 0);
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
        sbLIZ.append("PaymentPricingResultEvent(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSecondPay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paymentMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", newCardScene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", elevatorBar=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03OD(boolean z, boolean z2, PaymentMethod paymentMethod, boolean z3, String str, LeadingElevatorBar leadingElevatorBar, int i) {
        paymentMethod = (i & 4) != 0 ? null : paymentMethod;
        str = (i & 16) != 0 ? null : str;
        leadingElevatorBar = (i & 32) != 0 ? null : leadingElevatorBar;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = paymentMethod;
        this.LIZLLL = z3;
        this.LJ = str;
        this.LJFF = leadingElevatorBar;
    }
}
