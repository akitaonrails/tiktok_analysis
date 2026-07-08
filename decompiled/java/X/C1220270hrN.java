package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220270hrN implements InterfaceC636340Oxc<C1220270hrN, C12823050b> {
    public final C627660Ojc<C12823050b> LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public C1220270hrN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1220270hrN)) {
            return false;
        }
        C1220270hrN c1220270hrN = (C1220270hrN) obj;
        return Intrinsics.LJFF(this.LL, c1220270hrN.LL) && this.LLILLJJLI == c1220270hrN.LLILLJJLI && this.LLILLL == c1220270hrN.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadingTimeOver=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C12823050b> getListItemState() {
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
    public final C627660Ojc<C12823050b> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1220270hrN(int i) {
        this(new C627660Ojc(null, null, null, null, 15), 0, 0);
    }

    public C1220270hrN(C627660Ojc<C12823050b> c627660Ojc, int i, int i2) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    public static C1220270hrN LIZ(C1220270hrN c1220270hrN, C627660Ojc c627660Ojc, int i, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            c627660Ojc = c1220270hrN.LL;
        }
        if ((i2 & 2) != 0) {
            i3 = c1220270hrN.LLILLJJLI;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            i = c1220270hrN.LLILLL;
        }
        c1220270hrN.getClass();
        return new C1220270hrN(c627660Ojc, i3, i);
    }
}
