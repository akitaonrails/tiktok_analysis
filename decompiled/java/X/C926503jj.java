package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C926503jj implements InterfaceC111300bX {
    public final String LL;
    public final PaymentMethod LLILLJJLI;
    public final boolean LLILLL;
    public final EnterParams LLILZ;
    public final C926303jh LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final C927003jo LLIZ;
    public final boolean LLIZLLLIL;
    public final String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C926503jj)) {
            return false;
        }
        C926503jj c926503jj = (C926503jj) obj;
        return Intrinsics.LJFF(this.LL, c926503jj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c926503jj.LLILLJJLI) && this.LLILLL == c926503jj.LLILLL && Intrinsics.LJFF(this.LLILZ, c926503jj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c926503jj.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c926503jj.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c926503jj.LLIZ) && this.LLIZLLLIL == c926503jj.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c926503jj.LLJ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentMethod paymentMethod = this.LLILLJJLI;
        int iHashCode2 = (((((((((iHashCode + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        C927003jo c927003jo = this.LLIZ;
        int iHashCode3 = (((iHashCode2 + (c927003jo == null ? 0 : c927003jo.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        String str2 = this.LLJ;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubPaymentListHierarchyData(checkedSubPaymentMethodId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", parentPaymentMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFromOsp=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterParams=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", subPaymentListLogger=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", buttonClick=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isHybrid=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", selectedAnchorTenure=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C926503jj(String str, PaymentMethod paymentMethod, boolean z, EnterParams enterParams, C926303jh c926303jh, Function0<Unit> function0, C927003jo c927003jo, boolean z2, String str2) {
        this.LL = str;
        this.LLILLJJLI = paymentMethod;
        this.LLILLL = z;
        this.LLILZ = enterParams;
        this.LLILZIL = c926303jh;
        this.LLILZLL = function0;
        this.LLIZ = c927003jo;
        this.LLIZLLLIL = z2;
        this.LLJ = str2;
    }
}
