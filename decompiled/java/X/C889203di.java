package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C889203di implements InterfaceC894103eV, InterfaceC903003fw, InterfaceC892703eH, InterfaceC894303eX {
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
        if (!(obj instanceof C889203di)) {
            return false;
        }
        C889203di c889203di = (C889203di) obj;
        return Intrinsics.LJFF(this.LL, c889203di.LL) && Intrinsics.LJFF(this.LLILLJJLI, c889203di.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c889203di.LLILLL) && Intrinsics.LJFF(this.LLILZ, c889203di.LLILZ) && this.LLILZIL == c889203di.LLILZIL;
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
        sbLIZ.append("CCDCNormalElementItemV2(ccdcPaymentMethod=");
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
        if (interfaceC1891350zJl instanceof C889203di) {
            return Intrinsics.LJFF(this.LLILLJJLI.LIZ.id, ((C889203di) interfaceC1891350zJl).LLILLJJLI.LIZ.id);
        }
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    public static C889203di LIZLLL(C889203di c889203di, Object obj) {
        PaymentMethod paymentMethod = c889203di.LL;
        C869603aY c869603aY = c889203di.LLILLJJLI;
        String str = c889203di.LLILLL;
        int i = c889203di.LLILZIL;
        c889203di.getClass();
        return new C889203di(paymentMethod, c869603aY, str, obj, i);
    }

    public C889203di(PaymentMethod paymentMethod, C869603aY c869603aY, String str, Object obj, int i) {
        this.LL = paymentMethod;
        this.LLILLJJLI = c869603aY;
        this.LLILLL = str;
        this.LLILZ = obj;
        this.LLILZIL = i;
    }
}
