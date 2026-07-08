package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735840vGw implements InterfaceC636340Oxc<C1735840vGw, C1818490xQF> {
    public final C627660Ojc<C1818490xQF> LL;
    public final int LLILLJJLI;

    public C1735840vGw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1735840vGw)) {
            return false;
        }
        C1735840vGw c1735840vGw = (C1735840vGw) obj;
        return Intrinsics.LJFF(this.LL, c1735840vGw.LL) && this.LLILLJJLI == c1735840vGw.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneryLayoutTypeState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedLayoutType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1818490xQF> getListItemState() {
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
    public final C627660Ojc<C1818490xQF> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1735840vGw(int i) {
        this(new C627660Ojc(null, null, null, null, 15), 0);
    }

    public C1735840vGw(C627660Ojc<C1818490xQF> c627660Ojc, int i) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = i;
    }

    public static C1735840vGw LIZ(C1735840vGw c1735840vGw, C627660Ojc c627660Ojc, int i, int i2) {
        if ((i2 & 1) != 0) {
            c627660Ojc = c1735840vGw.LL;
        }
        if ((i2 & 2) != 0) {
            i = c1735840vGw.LLILLJJLI;
        }
        c1735840vGw.getClass();
        return new C1735840vGw(c627660Ojc, i);
    }
}
