package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618880OPe implements InterfaceC636340Oxc<C618880OPe, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final InterfaceC1891350zJl LLILLJJLI;

    public C618880OPe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C618880OPe)) {
            return false;
        }
        C618880OPe c618880OPe = (C618880OPe) obj;
        return Intrinsics.LJFF(this.LL, c618880OPe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c618880OPe.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        InterfaceC1891350zJl interfaceC1891350zJl = this.LLILLJJLI;
        return iHashCode + (interfaceC1891350zJl == null ? 0 : interfaceC1891350zJl.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinShareMusicListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedItem=");
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

    public /* synthetic */ C618880OPe(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null);
    }

    public C618880OPe(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, InterfaceC1891350zJl interfaceC1891350zJl) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = interfaceC1891350zJl;
    }
}
