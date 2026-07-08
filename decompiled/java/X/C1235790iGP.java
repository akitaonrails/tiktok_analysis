package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iGP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235790iGP implements InterfaceC636340Oxc<C1235790iGP, InterfaceC1891350zJl> {
    public final Pair<List<IMUser>, String> LL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1235790iGP)) {
            return false;
        }
        C1235790iGP c1235790iGP = (C1235790iGP) obj;
        return Intrinsics.LJFF(this.LL, c1235790iGP.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1235790iGP.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchState(searchResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
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
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1235790iGP(Pair<? extends List<? extends IMUser>, String> pair, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = pair;
        this.LLILLJJLI = c627660Ojc;
    }
}
