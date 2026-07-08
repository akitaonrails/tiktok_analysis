package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241540iPg implements InterfaceC636340Oxc<C1241540iPg, C1241350iPN> {
    public final EnumC1241490iPb LL;
    public final C627660Ojc<C1241350iPN> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1241540iPg)) {
            return false;
        }
        C1241540iPg c1241540iPg = (C1241540iPg) obj;
        return this.LL == c1241540iPg.LL && Intrinsics.LJFF(this.LLILLJJLI, c1241540iPg.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchUserFilterVMState(status=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1241350iPN> getListItemState() {
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
    public final C627660Ojc<C1241350iPN> getListState() {
        return this.LLILLJJLI;
    }

    public C1241540iPg(EnumC1241490iPb enumC1241490iPb, C627660Ojc<C1241350iPN> c627660Ojc) {
        this.LL = enumC1241490iPb;
        this.LLILLJJLI = c627660Ojc;
    }

    public static C1241540iPg LIZ(C1241540iPg c1241540iPg, EnumC1241490iPb enumC1241490iPb, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            enumC1241490iPb = c1241540iPg.LL;
        }
        if ((i & 2) != 0) {
            c627660Ojc = c1241540iPg.LLILLJJLI;
        }
        c1241540iPg.getClass();
        return new C1241540iPg(enumC1241490iPb, c627660Ojc);
    }
}
