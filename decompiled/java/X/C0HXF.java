package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HXF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HXF implements InterfaceC636340Oxc<C0HXF, C1782840wUk> {
    public final C627660Ojc<C1782840wUk> LL;

    public C0HXF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0HXF) && Intrinsics.LJFF(this.LL, ((C0HXF) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MyClipsListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1782840wUk> getListItemState() {
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
    public final C627660Ojc<C1782840wUk> getListState() {
        return this.LL;
    }

    public /* synthetic */ C0HXF(int i) {
        this((C627660Ojc<C1782840wUk>) new C627660Ojc(null, null, null, null, 15));
    }

    public C0HXF(C627660Ojc<C1782840wUk> c627660Ojc) {
        this.LL = c627660Ojc;
    }
}
