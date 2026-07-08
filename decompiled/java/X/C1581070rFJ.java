package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rFJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581070rFJ implements InterfaceC636340Oxc<C1581070rFJ, C343280Dd0> {
    public final C1582730rHz LL;
    public final C627660Ojc<C343280Dd0> LLILLJJLI;

    public C1581070rFJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1581070rFJ)) {
            return false;
        }
        C1581070rFJ c1581070rFJ = (C1581070rFJ) obj;
        return Intrinsics.LJFF(this.LL, c1581070rFJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1581070rFJ.LLILLJJLI);
    }

    public final int hashCode() {
        C1582730rHz c1582730rHz = this.LL;
        return ((c1582730rHz == null ? 0 : c1582730rHz.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveDualFeedState(externalRefreshedTriggered=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C343280Dd0> getListItemState() {
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
    public final C627660Ojc<C343280Dd0> getListState() {
        return this.LLILLJJLI;
    }

    public /* synthetic */ C1581070rFJ(int i) {
        this(null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1581070rFJ(C1582730rHz c1582730rHz, C627660Ojc<C343280Dd0> c627660Ojc) {
        this.LL = c1582730rHz;
        this.LLILLJJLI = c627660Ojc;
    }
}
