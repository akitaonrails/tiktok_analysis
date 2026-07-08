package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C889703dn implements InterfaceC1891350zJl {
    public final PaymentMethod LL;
    public final C873003b6 LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C889703dn)) {
            return false;
        }
        C889703dn c889703dn = (C889703dn) obj;
        return Intrinsics.LJFF(this.LL, c889703dn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c889703dn.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C873003b6 c873003b6 = this.LLILLJJLI;
        return iHashCode + (c873003b6 == null ? 0 : c873003b6.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCPromotionBannerItem(paymentMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bankInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C889703dn(PaymentMethod paymentMethod, C873003b6 c873003b6) {
        this.LL = paymentMethod;
        this.LLILLJJLI = c873003b6;
    }
}
