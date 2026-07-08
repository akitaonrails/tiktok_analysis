package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DTG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DTG implements InterfaceC636340Oxc<C0DTG, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final Long LLILLJJLI;

    public C0DTG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DTG)) {
            return false;
        }
        C0DTG c0dtg = (C0DTG) obj;
        return Intrinsics.LJFF(this.LL, c0dtg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0dtg.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Long l = this.LLILLJJLI;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinMemberListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subscriberCount=");
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

    public /* synthetic */ C0DTG(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null);
    }

    public C0DTG(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, Long l) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = l;
    }

    public static C0DTG LIZ(C0DTG c0dtg, C627660Ojc c627660Ojc, Long l, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c0dtg.LL;
        }
        if ((i & 2) != 0) {
            l = c0dtg.LLILLJJLI;
        }
        c0dtg.getClass();
        return new C0DTG(c627660Ojc, l);
    }
}
