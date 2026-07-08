package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326320Cqk implements InterfaceC636340Oxc<C326320Cqk, Object> {
    public final String LL;
    public final C627660Ojc<Object> LLILLJJLI;

    public C326320Cqk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326320Cqk)) {
            return false;
        }
        C326320Cqk c326320Cqk = (C326320Cqk) obj;
        return Intrinsics.LJFF(this.LL, c326320Cqk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c326320Cqk.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolListState(searchTerm=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<Object> getListItemState() {
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
    public final C627660Ojc<Object> getListState() {
        return this.LLILLJJLI;
    }

    public /* synthetic */ C326320Cqk(int i) {
        this("", new C627660Ojc(null, null, null, null, 15));
    }

    public C326320Cqk(String str, C627660Ojc<Object> c627660Ojc) {
        this.LL = str;
        this.LLILLJJLI = c627660Ojc;
    }
}
