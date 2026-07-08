package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03dQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C887403dQ implements InterfaceC111300bX {
    public final PaymentMethod LL;
    public final EnterParams LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function1<C886903dL, Unit> LLILZ;

    public C887403dQ() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C887403dQ)) {
            return false;
        }
        C887403dQ c887403dQ = (C887403dQ) obj;
        return Intrinsics.LJFF(this.LL, c887403dQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c887403dQ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c887403dQ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c887403dQ.LLILZ);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LL;
        int iHashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
        EnterParams enterParams = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enterParams == null ? 0 : enterParams.hashCode())) * 31;
        Function0<Unit> function0 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<C886903dL, Unit> function1 = this.LLILZ;
        return iHashCode3 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCFillCVVHierarchyData(ccdcPaymentMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dismissParent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onResult=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C887403dQ(PaymentMethod paymentMethod, EnterParams enterParams, Function0<Unit> function0, Function1<? super C886903dL, Unit> function1) {
        this.LL = paymentMethod;
        this.LLILLJJLI = enterParams;
        this.LLILLL = function0;
        this.LLILZ = function1;
    }
}
