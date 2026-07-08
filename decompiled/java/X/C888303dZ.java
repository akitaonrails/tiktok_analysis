package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03dZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C888303dZ implements InterfaceC111300bX {
    public final PaymentMethod LL;
    public final EnterParams LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C888303dZ)) {
            return false;
        }
        C888303dZ c888303dZ = (C888303dZ) obj;
        return Intrinsics.LJFF(this.LL, c888303dZ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c888303dZ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c888303dZ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c888303dZ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c888303dZ.LLILZIL);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LL;
        int iHashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
        EnterParams enterParams = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enterParams == null ? 0 : enterParams.hashCode())) * 31;
        Function0<Unit> function0 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        String str = this.LLILZ;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ATMCardHierarchyData(paymentMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dismissParent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", openType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", logBtName=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C888303dZ(PaymentMethod paymentMethod, EnterParams enterParams, Function0<Unit> function0, String str, String str2) {
        this.LL = paymentMethod;
        this.LLILLJJLI = enterParams;
        this.LLILLL = function0;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }
}
