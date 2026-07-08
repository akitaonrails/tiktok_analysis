package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325550CpV implements InterfaceC636340Oxc<C325550CpV, InterfaceC1891350zJl> {
    public final C20611415l2 LL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLJJLI;
    public final C317090Cbr LLILLL;

    public C325550CpV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C325550CpV)) {
            return false;
        }
        C325550CpV c325550CpV = (C325550CpV) obj;
        return Intrinsics.LJFF(this.LL, c325550CpV.LL) && Intrinsics.LJFF(this.LLILLJJLI, c325550CpV.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c325550CpV.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCaptionMentionSearchState(selectedUser=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", localSearchResult=");
        sbLIZ.append(this.LLILLL);
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
        return this.LLILLJJLI;
    }

    public /* synthetic */ C325550CpV(int i) {
        this(new C20611415l2(null, 0, 0, null, null, null, null, null, null, null, 0, null, null, 0, null, null, 2097151), new C627660Ojc(null, null, null, null, 15), new C317090Cbr(0));
    }

    public C325550CpV(C20611415l2 c20611415l2, C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C317090Cbr c317090Cbr) {
        this.LL = c20611415l2;
        this.LLILLJJLI = c627660Ojc;
        this.LLILLL = c317090Cbr;
    }

    public static C325550CpV LIZ(C325550CpV c325550CpV, C20611415l2 c20611415l2, C627660Ojc c627660Ojc, C317090Cbr c317090Cbr, int i) {
        if ((i & 1) != 0) {
            c20611415l2 = c325550CpV.LL;
        }
        if ((i & 2) != 0) {
            c627660Ojc = c325550CpV.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c317090Cbr = c325550CpV.LLILLL;
        }
        c325550CpV.getClass();
        return new C325550CpV(c20611415l2, c627660Ojc, c317090Cbr);
    }
}
