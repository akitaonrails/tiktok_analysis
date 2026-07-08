package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172070gbd implements InterfaceC636340Oxc<C1172070gbd, C1172110gbh> {
    public final C627660Ojc<C1172110gbh> LL;
    public final C1193740hAa LLILLJJLI;

    public C1172070gbd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1172070gbd)) {
            return false;
        }
        C1172070gbd c1172070gbd = (C1172070gbd) obj;
        return Intrinsics.LJFF(this.LL, c1172070gbd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1172070gbd.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1193740hAa c1193740hAa = this.LLILLJJLI;
        return iHashCode + (c1193740hAa == null ? 0 : c1193740hAa.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyFavoriteListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", prfNetworkData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1172110gbh> getListItemState() {
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
    public final C627660Ojc<C1172110gbh> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1172070gbd(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null);
    }

    public C1172070gbd(C627660Ojc<C1172110gbh> c627660Ojc, C1193740hAa c1193740hAa) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c1193740hAa;
    }
}
