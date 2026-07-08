package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ojc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627660Ojc<ITEM> implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C626160OhC> LL;
    public final AbstractC1623806Xk<C626160OhC> LLILLJJLI;
    public final AbstractC1623806Xk<C626160OhC> LLILLL;
    public final List<ITEM> LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C627660Ojc() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C627660Ojc)) {
            return false;
        }
        C627660Ojc c627660Ojc = (C627660Ojc) obj;
        return Intrinsics.LJFF(this.LL, c627660Ojc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c627660Ojc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c627660Ojc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c627660Ojc.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        List<ITEM> list = this.LLILZ;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssemListState(refreshState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadMoreState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadLatestState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listItemState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C627660Ojc(AbstractC1623806Xk<C626160OhC> abstractC1623806Xk, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3, List<? extends ITEM> list) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = abstractC1623806Xk3;
        this.LLILZ = list;
    }

    public /* synthetic */ C627660Ojc(AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, List list, int i) {
        this((i & 1) != 0 ? C491101vh.LIZ : abstractC1623806Xk, (i & 2) != 0 ? C491101vh.LIZ : abstractC1623806Xk2, (i & 4) != 0 ? C491101vh.LIZ : abstractC1623806Xk3, (i & 8) != 0 ? null : list);
    }

    public static C627660Ojc LIZ(C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, List list, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c627660Ojc.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c627660Ojc.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk3 = c627660Ojc.LLILLL;
        }
        if ((i & 8) != 0) {
            list = c627660Ojc.LLILZ;
        }
        c627660Ojc.getClass();
        return new C627660Ojc(abstractC1623806Xk, abstractC1623806Xk2, abstractC1623806Xk3, list);
    }
}
