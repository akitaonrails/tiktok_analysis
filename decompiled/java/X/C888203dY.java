package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03dY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C888203dY implements InterfaceC111300bX {
    public final PaymentMethod LL;
    public final EnterParams LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C873003b6 LLILZLL;
    public final String LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C888203dY)) {
            return false;
        }
        C888203dY c888203dY = (C888203dY) obj;
        return Intrinsics.LJFF(this.LL, c888203dY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c888203dY.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c888203dY.LLILLL) && Intrinsics.LJFF(this.LLILZ, c888203dY.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c888203dY.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c888203dY.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c888203dY.LLIZ);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LL;
        int iHashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
        EnterParams enterParams = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enterParams == null ? 0 : enterParams.hashCode())) * 31;
        Function0<Unit> function0 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        String str = this.LLILZ;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        C873003b6 c873003b6 = this.LLILZLL;
        return ((iHashCode4 + (c873003b6 != null ? c873003b6.hashCode() : 0)) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCAddCardHierarchyData(ccdcPaymentMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dismissParent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", openType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", logBtName=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", bankInfo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", logButtonName=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C888203dY(PaymentMethod paymentMethod, EnterParams enterParams, Function0<Unit> function0, String str, String str2, C873003b6 c873003b6, String str3) {
        this.LL = paymentMethod;
        this.LLILLJJLI = enterParams;
        this.LLILLL = function0;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = c873003b6;
        this.LLIZ = str3;
    }
}
