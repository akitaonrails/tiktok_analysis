package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C895103ef implements InterfaceC894103eV, InterfaceC903003fw, InterfaceC892703eH, InterfaceC894303eX {
    public final PaymentMethod LL;
    public final C869603aY LLILLJJLI;
    public final String LLILLL;
    public final Object LLILZ;
    public int LLILZIL;
    public C21588719eH LLILZLL = new C21588719eH(C679280Qkg.LIZ(25), 0, 0, 0, false, 0, true, 254);

    @Override // X.InterfaceC892703eH
    public final void LJJJJJL(Object obj) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C895103ef)) {
            return false;
        }
        C895103ef c895103ef = (C895103ef) obj;
        return Intrinsics.LJFF(this.LL, c895103ef.LL) && Intrinsics.LJFF(this.LLILLJJLI, c895103ef.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c895103ef.LLILLL) && Intrinsics.LJFF(this.LLILZ, c895103ef.LLILZ) && this.LLILZIL == c895103ef.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ATMCCDCNormalElementItemV2(ccdcPaymentMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ccdcNormalElementVO=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", initialInputMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", update=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", imeOptions=");
        sbLIZ.append(this.LLILZIL);
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
        this.LLILZIL = i;
    }

    @Override // X.InterfaceC894303eX
    public final void LIZIZ(C21588719eH c21588719eH) {
        this.LLILZLL = c21588719eH;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C895103ef) {
            return Intrinsics.LJFF(this.LLILLJJLI.LIZ.id, ((C895103ef) interfaceC1891350zJl).LLILLJJLI.LIZ.id);
        }
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    public C895103ef(PaymentMethod paymentMethod, C869603aY c869603aY, String str, Object obj, int i) {
        this.LL = paymentMethod;
        this.LLILLJJLI = c869603aY;
        this.LLILLL = str;
        this.LLILZ = obj;
        this.LLILZIL = i;
    }
}
