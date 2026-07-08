package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03OE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OE implements IEvent {
    public final PaymentInfo LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final ExceptionUX LIZLLL;
    public final boolean LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C03OE() {
        this((PaymentInfo) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03OE)) {
            return false;
        }
        C03OE c03oe = (C03OE) obj;
        return Intrinsics.LJFF(this.LIZ, c03oe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03oe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c03oe.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c03oe.LIZLLL) && this.LJ == c03oe.LJ;
    }

    public final int hashCode() {
        PaymentInfo paymentInfo = this.LIZ;
        int iHashCode = (paymentInfo == null ? 0 : paymentInfo.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExceptionUX exceptionUX = this.LIZLLL;
        return ((iHashCode3 + (exceptionUX != null ? exceptionUX.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
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
        sbLIZ.append("EcAddCCDCEvent(paymentInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", oldKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", exceptionUX=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", directCheckout=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C03OE(PaymentInfo paymentInfo, String str, String str2, boolean z, int i) {
        this((i & 1) != 0 ? null : paymentInfo, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (ExceptionUX) null, (i & 16) != 0 ? false : z);
    }

    public C03OE(PaymentInfo paymentInfo, String str, String str2, ExceptionUX exceptionUX, boolean z) {
        this.LIZ = paymentInfo;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = exceptionUX;
        this.LJ = z;
    }
}
