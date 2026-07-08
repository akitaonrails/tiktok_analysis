package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C895303eh implements InterfaceC894103eV, InterfaceC903003fw {
    public final PaymentMethod LL;
    public final C866903a7 LLILLJJLI;
    public final Object LLILLL;
    public int LLILZ = 5;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C895303eh)) {
            return false;
        }
        C895303eh c895303eh = (C895303eh) obj;
        return Intrinsics.LJFF(this.LL, c895303eh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c895303eh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c895303eh.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ATMCardNumberElementItemV2(ccdcPaymentMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ccdcCardNumberElementVO=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", update=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC894103eV
    public final C862703Yr LLIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC903003fw
    public final void LIZ(int i) {
        this.LLILZ = i;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C895303eh) {
            return Intrinsics.LJFF(this.LLILLJJLI.LIZ.id, ((C895303eh) interfaceC1891350zJl).LLILLJJLI.LIZ.id);
        }
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    public C895303eh(PaymentMethod paymentMethod, C866903a7 c866903a7, Object obj) {
        this.LL = paymentMethod;
        this.LLILLJJLI = c866903a7;
        this.LLILLL = obj;
    }
}
