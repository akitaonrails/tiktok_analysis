package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567600qta implements InterfaceC636270OxV<C1567600qta, Aweme> {
    public final C627660Ojc<Aweme> LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567600qta)) {
            return false;
        }
        C1567600qta c1567600qta = (C1567600qta) obj;
        return Intrinsics.LJFF(this.LL, c1567600qta.LL) && this.LLILLJJLI == c1567600qta.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StemFeedListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1567600qta() {
        this(new C627660Ojc(null, null, null, null, 15), true);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return this.LL.LLILLL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return this.LL.LL;
    }

    @Override // X.InterfaceC636270OxV
    public final List<Aweme> getListItemState() {
        return getListState().LLILZ;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return getListState().LLILLJJLI;
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<Aweme> getListState() {
        return this.LL;
    }

    public C1567600qta(C627660Ojc<Aweme> c627660Ojc, boolean z) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
    }

    public static C1567600qta LIZ(C1567600qta c1567600qta, C627660Ojc c627660Ojc, boolean z, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1567600qta.LL;
        }
        if ((i & 2) != 0) {
            z = c1567600qta.LLILLJJLI;
        }
        c1567600qta.getClass();
        return new C1567600qta(c627660Ojc, z);
    }
}
