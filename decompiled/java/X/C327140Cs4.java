package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cs4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327140Cs4 implements InterfaceC636340Oxc<C327140Cs4, C1834080xpO> {
    public final AbstractC1623806Xk<Boolean> LL;
    public final C627660Ojc<C1834080xpO> LLILLJJLI;

    public C327140Cs4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C327140Cs4)) {
            return false;
        }
        C327140Cs4 c327140Cs4 = (C327140Cs4) obj;
        return Intrinsics.LJFF(this.LL, c327140Cs4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c327140Cs4.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveReplayListBBState(isEmptyList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1834080xpO> getListItemState() {
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
    public final C627660Ojc<C1834080xpO> getListState() {
        return this.LLILLJJLI;
    }

    public /* synthetic */ C327140Cs4(int i) {
        this(C491101vh.LIZ, new C627660Ojc(null, null, null, null, 15));
    }

    public C327140Cs4(AbstractC1623806Xk<Boolean> abstractC1623806Xk, C627660Ojc<C1834080xpO> c627660Ojc) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c627660Ojc;
    }

    public static C327140Cs4 LIZ(C327140Cs4 c327140Cs4, AbstractC1623806Xk abstractC1623806Xk, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c327140Cs4.LL;
        }
        if ((i & 2) != 0) {
            c627660Ojc = c327140Cs4.LLILLJJLI;
        }
        c327140Cs4.getClass();
        return new C327140Cs4(abstractC1623806Xk, c627660Ojc);
    }
}
