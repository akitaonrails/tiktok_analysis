package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09hb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2442109hb implements InterfaceC0148002o {
    public final AbstractC1623806Xk<BaseResponse> LL;
    public final C1613680s5u LLILLJJLI;

    public C2442109hb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2442109hb)) {
            return false;
        }
        C2442109hb c2442109hb = (C2442109hb) obj;
        return Intrinsics.LJFF(this.LL, c2442109hb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2442109hb.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1613680s5u c1613680s5u = this.LLILLJJLI;
        return iHashCode + (c1613680s5u == null ? 0 : c1613680s5u.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentDetailVoucherState(voucherResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", voucherPanelColorState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2442109hb(int i) {
        this(C491101vh.LIZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2442109hb(AbstractC1623806Xk<? extends BaseResponse> abstractC1623806Xk, C1613680s5u c1613680s5u) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c1613680s5u;
    }

    public static C2442109hb LIZ(C2442109hb c2442109hb, AbstractC1623806Xk abstractC1623806Xk, C1613680s5u c1613680s5u, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c2442109hb.LL;
        }
        if ((i & 2) != 0) {
            c1613680s5u = c2442109hb.LLILLJJLI;
        }
        c2442109hb.getClass();
        return new C2442109hb(abstractC1623806Xk, c1613680s5u);
    }
}
