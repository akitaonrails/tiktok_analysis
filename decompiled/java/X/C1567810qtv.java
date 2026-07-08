package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qtv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567810qtv implements InterfaceC636270OxV<C1567810qtv, Aweme> {
    public final C627660Ojc<Aweme> LL;
    public final boolean LLILLJJLI;
    public final C1567820qtw<Boolean> LLILLL;
    public final C1567820qtw<Boolean> LLILZ;
    public final C1567840qty LLILZIL;

    public C1567810qtv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567810qtv)) {
            return false;
        }
        C1567810qtv c1567810qtv = (C1567810qtv) obj;
        return Intrinsics.LJFF(this.LL, c1567810qtv.LL) && this.LLILLJJLI == c1567810qtv.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1567810qtv.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1567810qtv.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1567810qtv.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C1567820qtw<Boolean> c1567820qtw = this.LLILLL;
        int iHashCode2 = (iHashCode + (c1567820qtw == null ? 0 : c1567820qtw.hashCode())) * 31;
        C1567820qtw<Boolean> c1567820qtw2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c1567820qtw2 == null ? 0 : c1567820qtw2.hashCode())) * 31;
        C1567840qty c1567840qty = this.LLILZIL;
        return iHashCode3 + (c1567840qty != null ? c1567840qty.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaPicksState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showCleanMode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", loadMoreEmpty=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", deleteItem=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<Aweme> getListItemState() {
        return this.LL.LLILZ;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return this.LL.LLILLL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return this.LL.LLILLJJLI;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return this.LL.LL;
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<Aweme> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1567810qtv(int i) {
        this(new C627660Ojc(null, null, null, null, 15), true, null, null, null);
    }

    public C1567810qtv(C627660Ojc<Aweme> c627660Ojc, boolean z, C1567820qtw<Boolean> c1567820qtw, C1567820qtw<Boolean> c1567820qtw2, C1567840qty c1567840qty) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
        this.LLILLL = c1567820qtw;
        this.LLILZ = c1567820qtw2;
        this.LLILZIL = c1567840qty;
    }

    public static C1567810qtv LIZ(C1567810qtv c1567810qtv, C627660Ojc c627660Ojc, boolean z, C1567820qtw c1567820qtw, C1567820qtw c1567820qtw2, C1567840qty c1567840qty, int i) {
        C1567840qty c1567840qty2 = c1567840qty;
        C1567820qtw c1567820qtw3 = c1567820qtw2;
        C1567820qtw c1567820qtw4 = c1567820qtw;
        boolean z2 = z;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1567810qtv.LL;
        }
        if ((i & 2) != 0) {
            z2 = c1567810qtv.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1567820qtw4 = c1567810qtv.LLILLL;
        }
        if ((i & 8) != 0) {
            c1567820qtw3 = c1567810qtv.LLILZ;
        }
        if ((i & 16) != 0) {
            c1567840qty2 = c1567810qtv.LLILZIL;
        }
        c1567810qtv.getClass();
        return new C1567810qtv(c627660Ojc2, z2, c1567820qtw4, c1567820qtw3, c1567840qty2);
    }
}
