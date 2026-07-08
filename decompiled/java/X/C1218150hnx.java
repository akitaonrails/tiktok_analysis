package X;

import com.ss.android.ugc.now.interaction.assem.LikeItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hnx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218150hnx implements InterfaceC636340Oxc<C1218150hnx, LikeItem> {
    public final C627660Ojc<LikeItem> LL;
    public final C291001Au<Long> LLILLJJLI;

    public C1218150hnx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218150hnx)) {
            return false;
        }
        C1218150hnx c1218150hnx = (C1218150hnx) obj;
        return Intrinsics.LJFF(this.LL, c1218150hnx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1218150hnx.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Long> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LikeListVMState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", likeCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<LikeItem> getListItemState() {
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
    public final C627660Ojc<LikeItem> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1218150hnx(int i) {
        this(null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1218150hnx(C291001Au c291001Au, C627660Ojc c627660Ojc) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
    }
}
