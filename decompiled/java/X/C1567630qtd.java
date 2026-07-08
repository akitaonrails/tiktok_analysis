package X;

import com.ss.android.ugc.aweme.repostfeed.model.RepostFeed;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qtd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567630qtd implements InterfaceC636270OxV<C1567630qtd, RepostFeed> {
    public final C627660Ojc<RepostFeed> LL;
    public final boolean LLILLJJLI;

    public C1567630qtd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567630qtd)) {
            return false;
        }
        C1567630qtd c1567630qtd = (C1567630qtd) obj;
        return Intrinsics.LJFF(this.LL, c1567630qtd.LL) && this.LLILLJJLI == c1567630qtd.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostFeedListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emptyState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<RepostFeed> getListItemState() {
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
    public final C627660Ojc<RepostFeed> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1567630qtd(int i) {
        this(new C627660Ojc(null, null, null, null, 15), false);
    }

    public C1567630qtd(C627660Ojc<RepostFeed> c627660Ojc, boolean z) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
    }

    public static C1567630qtd LIZ(C1567630qtd c1567630qtd, C627660Ojc c627660Ojc, boolean z, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1567630qtd.LL;
        }
        if ((i & 2) != 0) {
            z = c1567630qtd.LLILLJJLI;
        }
        c1567630qtd.getClass();
        return new C1567630qtd(c627660Ojc, z);
    }
}
