package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iQ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241760iQ2 implements InterfaceC636340Oxc<C1241760iQ2, InterfaceC1240590iO9> {
    public final EnumC1241490iPb LL;
    public final C1241790iQ5 LLILLJJLI;
    public final C627660Ojc<InterfaceC1240590iO9> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1241760iQ2)) {
            return false;
        }
        C1241760iQ2 c1241760iQ2 = (C1241760iQ2) obj;
        return this.LL == c1241760iQ2.LL && Intrinsics.LJFF(this.LLILLJJLI, c1241760iQ2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1241760iQ2.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1241790iQ5 c1241790iQ5 = this.LLILLJJLI;
        return ((iHashCode + (c1241790iQ5 == null ? 0 : c1241790iQ5.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchResultListState(pageLoadState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", filterUIData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1240590iO9> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<InterfaceC1240590iO9> getListState() {
        return this.LLILLL;
    }

    public C1241760iQ2(EnumC1241490iPb enumC1241490iPb, C1241790iQ5 c1241790iQ5, C627660Ojc<InterfaceC1240590iO9> c627660Ojc) {
        this.LL = enumC1241490iPb;
        this.LLILLJJLI = c1241790iQ5;
        this.LLILLL = c627660Ojc;
    }

    public static C1241760iQ2 LIZ(C1241760iQ2 c1241760iQ2, EnumC1241490iPb enumC1241490iPb, C1241790iQ5 c1241790iQ5, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            enumC1241490iPb = c1241760iQ2.LL;
        }
        if ((i & 2) != 0) {
            c1241790iQ5 = c1241760iQ2.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c627660Ojc = c1241760iQ2.LLILLL;
        }
        c1241760iQ2.getClass();
        return new C1241760iQ2(enumC1241490iPb, c1241790iQ5, c627660Ojc);
    }
}
