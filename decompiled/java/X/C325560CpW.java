package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325560CpW implements InterfaceC636340Oxc<C325560CpW, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final boolean LLILLJJLI;

    public C325560CpW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C325560CpW)) {
            return false;
        }
        C325560CpW c325560CpW = (C325560CpW) obj;
        return Intrinsics.LJFF(this.LL, c325560CpW.LL) && this.LLILLJJLI == c325560CpW.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionListState(listState=");
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

    public /* synthetic */ C325560CpW(int i) {
        this(new C627660Ojc(null, null, null, null, 15), false);
    }

    public C325560CpW(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, boolean z) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
    }

    public static C325560CpW LIZ(C325560CpW c325560CpW, C627660Ojc c627660Ojc, boolean z, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c325560CpW.LL;
        }
        if ((i & 2) != 0) {
            z = c325560CpW.LLILLJJLI;
        }
        c325560CpW.getClass();
        return new C325560CpW(c627660Ojc, z);
    }
}
