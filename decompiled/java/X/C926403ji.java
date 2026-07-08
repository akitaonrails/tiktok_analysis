package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C926403ji implements InterfaceC1891350zJl {
    public final PaymentMethod LL;
    public final PaymentMethod LLILLJJLI;
    public final boolean LLILLL;
    public final C926303jh LLILZ;
    public final boolean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C926403ji)) {
            return false;
        }
        C926403ji c926403ji = (C926403ji) obj;
        return Intrinsics.LJFF(this.LL, c926403ji.LL) && Intrinsics.LJFF(this.LLILLJJLI, c926403ji.LLILLJJLI) && this.LLILLL == c926403ji.LLILLL && Intrinsics.LJFF(this.LLILZ, c926403ji.LLILZ) && this.LLILZIL == c926403ji.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubPaymentItem(parentPaymentMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subPaymentMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", subPaymentListLogger=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isBindMode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C926403ji c926403ji;
        PaymentMethod paymentMethod = this.LLILLJJLI;
        PaymentMethod paymentMethod2 = null;
        if ((interfaceC1891350zJl instanceof C926403ji) && (c926403ji = (C926403ji) interfaceC1891350zJl) != null) {
            paymentMethod2 = c926403ji.LLILLJJLI;
        }
        return Intrinsics.LJFF(paymentMethod, paymentMethod2);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C926403ji c926403ji;
        PaymentMethod paymentMethod = this.LLILLJJLI;
        PaymentMethod paymentMethod2 = null;
        if ((interfaceC1891350zJl instanceof C926403ji) && (c926403ji = (C926403ji) interfaceC1891350zJl) != null) {
            paymentMethod2 = c926403ji.LLILLJJLI;
        }
        return Intrinsics.LJFF(paymentMethod, paymentMethod2);
    }

    public C926403ji(PaymentMethod paymentMethod, PaymentMethod paymentMethod2, boolean z, C926303jh c926303jh, boolean z2) {
        this.LL = paymentMethod;
        this.LLILLJJLI = paymentMethod2;
        this.LLILLL = z;
        this.LLILZ = c926303jh;
        this.LLILZIL = z2;
    }
}
