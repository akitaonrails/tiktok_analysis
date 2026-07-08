package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325960CqA implements InterfaceC636340Oxc<C325960CqA, AbstractC993580bxk> {
    public final C627660Ojc<AbstractC993580bxk> LL;

    public C325960CqA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C325960CqA) && Intrinsics.LJFF(this.LL, ((C325960CqA) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WatchLaterHistoryState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<AbstractC993580bxk> getListItemState() {
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
    public final C627660Ojc<AbstractC993580bxk> getListState() {
        return this.LL;
    }

    public /* synthetic */ C325960CqA(int i) {
        this((C627660Ojc<AbstractC993580bxk>) new C627660Ojc(null, null, null, null, 15));
    }

    public C325960CqA(C627660Ojc<AbstractC993580bxk> c627660Ojc) {
        this.LL = c627660Ojc;
    }
}
