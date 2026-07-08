package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172490gcJ implements InterfaceC636340Oxc<C1172490gcJ, C1175980ghw> {
    public final C627660Ojc<C1175980ghw> LL;
    public final C1193740hAa LLILLJJLI;

    public C1172490gcJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1172490gcJ)) {
            return false;
        }
        C1172490gcJ c1172490gcJ = (C1172490gcJ) obj;
        return Intrinsics.LJFF(this.LL, c1172490gcJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1172490gcJ.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1193740hAa c1193740hAa = this.LLILLJJLI;
        return iHashCode + (c1193740hAa == null ? 0 : c1193740hAa.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCollectListStateForSlashCell(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", prfNetworkData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1175980ghw> getListItemState() {
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
    public final C627660Ojc<C1175980ghw> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1172490gcJ(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null);
    }

    public C1172490gcJ(C627660Ojc<C1175980ghw> c627660Ojc, C1193740hAa c1193740hAa) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c1193740hAa;
    }
}
