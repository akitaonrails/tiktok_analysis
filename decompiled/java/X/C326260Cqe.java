package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326260Cqe implements InterfaceC636340Oxc<C326260Cqe, C632560OrW> {
    public final boolean LL;
    public final C627660Ojc<C632560OrW> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326260Cqe)) {
            return false;
        }
        C326260Cqe c326260Cqe = (C326260Cqe) obj;
        return this.LL == c326260Cqe.LL && Intrinsics.LJFF(this.LLILLJJLI, c326260Cqe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c326260Cqe.LLILLL);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportMusicListState(needRefresh=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showNoNetworkToast=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C632560OrW> getListItemState() {
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
    public final C627660Ojc<C632560OrW> getListState() {
        return this.LLILLJJLI;
    }

    public C326260Cqe(boolean z, C627660Ojc<C632560OrW> c627660Ojc, C291001Au<Boolean> c291001Au) {
        this.LL = z;
        this.LLILLJJLI = c627660Ojc;
        this.LLILLL = c291001Au;
    }

    public static C326260Cqe LIZ(C326260Cqe c326260Cqe, boolean z, C627660Ojc c627660Ojc, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            z = c326260Cqe.LL;
        }
        if ((i & 2) != 0) {
            c627660Ojc = c326260Cqe.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c326260Cqe.LLILLL;
        }
        c326260Cqe.getClass();
        return new C326260Cqe(z, c627660Ojc, c291001Au);
    }
}
