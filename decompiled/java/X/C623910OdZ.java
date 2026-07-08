package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623910OdZ implements InterfaceC636340Oxc<C623910OdZ, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final EnumC623930Odb LLILLJJLI;

    public C623910OdZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C623910OdZ)) {
            return false;
        }
        C623910OdZ c623910OdZ = (C623910OdZ) obj;
        return Intrinsics.LJFF(this.LL, c623910OdZ.LL) && this.LLILLJJLI == c623910OdZ.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkBenchCardListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listLoadState=");
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

    public /* synthetic */ C623910OdZ(int i) {
        this(new C627660Ojc(null, null, null, null, 15), EnumC623930Odb.LOADING);
    }

    public C623910OdZ(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, EnumC623930Odb enumC623930Odb) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = enumC623930Odb;
    }

    public static C623910OdZ LIZ(C623910OdZ c623910OdZ, C627660Ojc c627660Ojc, EnumC623930Odb enumC623930Odb, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c623910OdZ.LL;
        }
        if ((i & 2) != 0) {
            enumC623930Odb = c623910OdZ.LLILLJJLI;
        }
        c623910OdZ.getClass();
        return new C623910OdZ(c627660Ojc, enumC623930Odb);
    }
}
