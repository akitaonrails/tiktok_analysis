package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03jl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C926703jl implements InterfaceC0148002o {
    public final String LL;
    public final PaymentMethod LLILLJJLI;
    public final List<PaymentMethod> LLILLL;
    public final PaymentMethod LLILZ;
    public final boolean LLILZIL;

    public C926703jl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C926703jl)) {
            return false;
        }
        C926703jl c926703jl = (C926703jl) obj;
        return Intrinsics.LJFF(this.LL, c926703jl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c926703jl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c926703jl.LLILLL) && Intrinsics.LJFF(this.LLILZ, c926703jl.LLILZ) && this.LLILZIL == c926703jl.LLILZIL;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentMethod paymentMethod = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        List<PaymentMethod> list = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PaymentMethod paymentMethod2 = this.LLILZ;
        return ((iHashCode3 + (paymentMethod2 != null ? paymentMethod2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubPaymentListState(inputText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", parentPaymentMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", subPaymentMethodList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", checkedSubPaymentMethod=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C926703jl(int i) {
        this(null, null, null, null, false);
    }

    public C926703jl(String str, PaymentMethod paymentMethod, List<PaymentMethod> list, PaymentMethod paymentMethod2, boolean z) {
        this.LL = str;
        this.LLILLJJLI = paymentMethod;
        this.LLILLL = list;
        this.LLILZ = paymentMethod2;
        this.LLILZIL = z;
    }

    public static C926703jl LIZ(C926703jl c926703jl, PaymentMethod paymentMethod, List list, PaymentMethod paymentMethod2, boolean z, int i) {
        String str;
        boolean z2 = z;
        PaymentMethod paymentMethod3 = paymentMethod2;
        List list2 = list;
        PaymentMethod paymentMethod4 = paymentMethod;
        if ((i & 1) != 0) {
            str = c926703jl.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            paymentMethod4 = c926703jl.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list2 = c926703jl.LLILLL;
        }
        if ((i & 8) != 0) {
            paymentMethod3 = c926703jl.LLILZ;
        }
        if ((i & 16) != 0) {
            z2 = c926703jl.LLILZIL;
        }
        c926703jl.getClass();
        return new C926703jl(str, paymentMethod4, list2, paymentMethod3, z2);
    }
}
