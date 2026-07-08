package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C889103dh implements InterfaceC892703eH, InterfaceC894303eX {
    public final PaymentMethod LL;
    public final C869603aY LLILLJJLI;
    public final Object LLILLL;
    public C21588719eH LLILZ = new C21588719eH(C679280Qkg.LIZ(25), 0, 0, 0, false, 0, true, 254);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C889103dh)) {
            return false;
        }
        C889103dh c889103dh = (C889103dh) obj;
        return Intrinsics.LJFF(this.LL, c889103dh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c889103dh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c889103dh.LLILLL);
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
        sbLIZ.append("USNormalElementItemV2(ccdcPaymentMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ccdcNormalElementVO=");
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

    @Override // X.InterfaceC894303eX
    public final void LIZIZ(C21588719eH c21588719eH) {
        this.LLILZ = c21588719eH;
    }

    @Override // X.InterfaceC892703eH
    public final void LJJJJJL(Object obj) {
        String str;
        C869603aY c869603aY = this.LLILLJJLI;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        c869603aY.LIZJ = str;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C889103dh(PaymentMethod paymentMethod, C869603aY c869603aY, Object obj) {
        this.LL = paymentMethod;
        this.LLILLJJLI = c869603aY;
        this.LLILLL = obj;
    }
}
