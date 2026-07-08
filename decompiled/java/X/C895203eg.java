package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03eg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C895203eg implements InterfaceC894103eV, InterfaceC903003fw, InterfaceC892703eH, InterfaceC894303eX {
    public final PaymentMethod LL;
    public final C869503aX LLILLJJLI;
    public final Object LLILLL;
    public int LLILZ = 5;
    public C21588719eH LLILZIL = new C21588719eH(C679280Qkg.LIZ(25), 0, 0, 0, false, 0, true, 254);

    @Override // X.InterfaceC892703eH
    public final void LJJJJJL(Object obj) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C895203eg)) {
            return false;
        }
        C895203eg c895203eg = (C895203eg) obj;
        return Intrinsics.LJFF(this.LL, c895203eg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c895203eg.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c895203eg.LLILLL);
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
        sbLIZ.append("ATMDateElementItemV2(ccdcPaymentMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ccdcDateElementVO=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", update=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC892703eH
    public final List<String> getIds() {
        return Collections.singletonList(this.LLILLJJLI.LIZ.id);
    }

    @Override // X.InterfaceC894103eV
    public final C862703Yr LLIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC903003fw
    public final void LIZ(int i) {
        this.LLILZ = i;
    }

    @Override // X.InterfaceC894303eX
    public final void LIZIZ(C21588719eH c21588719eH) {
        this.LLILZIL = c21588719eH;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C895203eg) {
            return Intrinsics.LJFF(this.LLILLJJLI.LIZ.id, ((C895203eg) interfaceC1891350zJl).LLILLJJLI.LIZ.id);
        }
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    public C895203eg(PaymentMethod paymentMethod, C869503aX c869503aX, Object obj) {
        this.LL = paymentMethod;
        this.LLILLJJLI = c869503aX;
        this.LLILLL = obj;
    }
}
