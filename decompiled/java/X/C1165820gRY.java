package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gRY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165820gRY implements InterfaceC636340Oxc<C1165820gRY, C912570Zr5> {
    public final C627660Ojc<C912570Zr5> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C1165820gRY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165820gRY)) {
            return false;
        }
        C1165820gRY c1165820gRY = (C1165820gRY) obj;
        return Intrinsics.LJFF(this.LL, c1165820gRY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1165820gRY.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeMessageListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scrollToFirst=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C912570Zr5> getListItemState() {
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
    public final C627660Ojc<C912570Zr5> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1165820gRY(int i) {
        this(null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1165820gRY(C291001Au c291001Au, C627660Ojc c627660Ojc) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
    }
}
