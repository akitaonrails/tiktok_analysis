package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165890gRf implements InterfaceC636340Oxc<C1165890gRf, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final AbstractC1623806Xk<C626160OhC> LLILLJJLI;
    public final AbstractC1623806Xk<C626160OhC> LLILLL;
    public final AbstractC1623806Xk<C626160OhC> LLILZ;

    public C1165890gRf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165890gRf)) {
            return false;
        }
        C1165890gRf c1165890gRf = (C1165890gRf) obj;
        return Intrinsics.LJFF(this.LL, c1165890gRf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1165890gRf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1165890gRf.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1165890gRf.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaCategoryContentListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadMoreState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadLatestState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", refreshState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return this.LLILZ;
    }

    public /* synthetic */ C1165890gRf(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C491101vh c491101vh = C491101vh.LIZ;
        this(c627660Ojc, c491101vh, c491101vh, c491101vh);
    }

    public C1165890gRf(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = abstractC1623806Xk3;
    }

    public static C1165890gRf LIZ(C1165890gRf c1165890gRf, C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, int i) {
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2;
        if ((i & 1) != 0) {
            c627660Ojc = c1165890gRf.LL;
        }
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3 = null;
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c1165890gRf.LLILLJJLI;
        } else {
            abstractC1623806Xk2 = null;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk3 = c1165890gRf.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk = c1165890gRf.LLILZ;
        }
        c1165890gRf.getClass();
        return new C1165890gRf(c627660Ojc, abstractC1623806Xk2, abstractC1623806Xk3, abstractC1623806Xk);
    }
}
