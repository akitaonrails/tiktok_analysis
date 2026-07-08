package X;

import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuBuyLimit;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SubmitOrderResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gH4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159320gH4 implements InterfaceC0148002o {
    public final AbstractC1623806Xk<SubmitOrderResponse> LL;
    public final C291001Au<Map<String, Integer>> LLILLJJLI;
    public final Boolean LLILLL;
    public final List<SkuBuyLimit> LLILZ;
    public final boolean LLILZIL;

    public C1159320gH4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159320gH4)) {
            return false;
        }
        C1159320gH4 c1159320gH4 = (C1159320gH4) obj;
        return Intrinsics.LJFF(this.LL, c1159320gH4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159320gH4.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1159320gH4.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1159320gH4.LLILZ) && this.LLILZIL == c1159320gH4.LLILZIL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Map<String, Integer>> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SkuBuyLimit> list = this.LLILZ;
        return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiOrderSubmitState(submitOrderResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", restoreSkuQuantity=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", accountComplianceToastFinish=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", exceptionUxSkuLimitList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isExpand=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159320gH4(int i) {
        this(C491101vh.LIZ, null, null, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1159320gH4(AbstractC1623806Xk<SubmitOrderResponse> abstractC1623806Xk, C291001Au<? extends Map<String, Integer>> c291001Au, Boolean bool, List<SkuBuyLimit> list, boolean z) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = bool;
        this.LLILZ = list;
        this.LLILZIL = z;
    }

    public static C1159320gH4 LIZ(C1159320gH4 c1159320gH4, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, Boolean bool, List list, boolean z, int i) {
        boolean z2 = z;
        List list2 = list;
        Boolean bool2 = bool;
        C291001Au c291001Au2 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk2 = c1159320gH4.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1159320gH4.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            bool2 = c1159320gH4.LLILLL;
        }
        if ((i & 8) != 0) {
            list2 = c1159320gH4.LLILZ;
        }
        if ((i & 16) != 0) {
            z2 = c1159320gH4.LLILZIL;
        }
        c1159320gH4.getClass();
        return new C1159320gH4(abstractC1623806Xk2, c291001Au2, bool2, list2, z2);
    }
}
