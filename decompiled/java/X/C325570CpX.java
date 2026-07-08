package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325570CpX implements InterfaceC636340Oxc<C325570CpX, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final boolean LLILLJJLI;

    public C325570CpX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C325570CpX)) {
            return false;
        }
        C325570CpX c325570CpX = (C325570CpX) obj;
        return Intrinsics.LJFF(this.LL, c325570CpX.LL) && this.LLILLJJLI == c325570CpX.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryUserListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasProgressiveResults=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
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
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LL;
    }

    public /* synthetic */ C325570CpX(int i) {
        this(new C627660Ojc(null, null, null, null, 15), false);
    }

    public C325570CpX(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, boolean z) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
    }

    public static C325570CpX LIZ(C325570CpX c325570CpX, C627660Ojc c627660Ojc, boolean z, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c325570CpX.LL;
        }
        if ((i & 2) != 0) {
            z = c325570CpX.LLILLJJLI;
        }
        c325570CpX.getClass();
        return new C325570CpX(c627660Ojc, z);
    }
}
