package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172130gbj implements InterfaceC636340Oxc<C1172130gbj, C1172320gc2> {
    public final C627660Ojc<C1172320gc2> LL;
    public final C1193740hAa LLILLJJLI;

    public C1172130gbj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1172130gbj)) {
            return false;
        }
        C1172130gbj c1172130gbj = (C1172130gbj) obj;
        return Intrinsics.LJFF(this.LL, c1172130gbj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1172130gbj.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1193740hAa c1193740hAa = this.LLILLJJLI;
        return iHashCode + (c1193740hAa == null ? 0 : c1193740hAa.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCollectListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", prfNetworkData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1172320gc2> getListItemState() {
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
    public final C627660Ojc<C1172320gc2> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1172130gbj(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null);
    }

    public C1172130gbj(C627660Ojc<C1172320gc2> c627660Ojc, C1193740hAa c1193740hAa) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c1193740hAa;
    }
}
