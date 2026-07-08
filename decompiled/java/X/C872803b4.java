package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C872803b4 implements InterfaceC0148002o {
    public final C873003b6 LL;
    public final List<InterfaceC1891350zJl> LLILLJJLI;
    public final boolean LLILLL;
    public final Integer LLILZ;
    public final PaymentInfo LLILZIL;

    public C872803b4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C872803b4)) {
            return false;
        }
        C872803b4 c872803b4 = (C872803b4) obj;
        return Intrinsics.LJFF(this.LL, c872803b4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c872803b4.LLILLJJLI) && this.LLILLL == c872803b4.LLILLL && Intrinsics.LJFF(this.LLILZ, c872803b4.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c872803b4.LLILZIL);
    }

    public final int hashCode() {
        C873003b6 c873003b6 = this.LL;
        int iHashCode = (((((c873003b6 == null ? 0 : c873003b6.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        Integer num = this.LLILZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        PaymentInfo paymentInfo = this.LLILZIL;
        return iHashCode2 + (paymentInfo != null ? paymentInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BankInstallmentState(currentSelectedBank=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", powerItemList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enableContinue=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", paymentInfoForSummary=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C872803b4(int i) {
        this(null, new ArrayList(), false, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C872803b4(C873003b6 c873003b6, List<? extends InterfaceC1891350zJl> list, boolean z, Integer num, PaymentInfo paymentInfo) {
        this.LL = c873003b6;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = num;
        this.LLILZIL = paymentInfo;
    }

    public static C872803b4 LIZ(C872803b4 c872803b4, C873003b6 c873003b6, List list, boolean z, Integer num, PaymentInfo paymentInfo, int i) {
        PaymentInfo paymentInfo2 = paymentInfo;
        Integer num2 = num;
        boolean z2 = z;
        List list2 = list;
        C873003b6 c873003b62 = c873003b6;
        if ((i & 1) != 0) {
            c873003b62 = c872803b4.LL;
        }
        if ((i & 2) != 0) {
            list2 = c872803b4.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c872803b4.LLILLL;
        }
        if ((i & 8) != 0) {
            num2 = c872803b4.LLILZ;
        }
        if ((i & 16) != 0) {
            paymentInfo2 = c872803b4.LLILZIL;
        }
        c872803b4.getClass();
        return new C872803b4(c873003b62, list2, z2, num2, paymentInfo2);
    }
}
