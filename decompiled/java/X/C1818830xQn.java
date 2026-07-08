package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818830xQn implements InterfaceC636340Oxc<C1818830xQn, C1818820xQm> {
    public final C627660Ojc<C1818820xQm> LL;
    public final EnumC1818710xQb LLILLJJLI;

    public C1818830xQn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1818830xQn)) {
            return false;
        }
        C1818830xQn c1818830xQn = (C1818830xQn) obj;
        return Intrinsics.LJFF(this.LL, c1818830xQn.LL) && this.LLILLJJLI == c1818830xQn.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneryModeOperationListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", currentMode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1818820xQm> getListItemState() {
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
    public final C627660Ojc<C1818820xQm> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1818830xQn(int i) {
        this(new C627660Ojc(null, null, null, null, 15), EnumC1818710xQb.LAYOUT);
    }

    public C1818830xQn(C627660Ojc<C1818820xQm> c627660Ojc, EnumC1818710xQb enumC1818710xQb) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = enumC1818710xQb;
    }

    public static C1818830xQn LIZ(C1818830xQn c1818830xQn, C627660Ojc c627660Ojc, EnumC1818710xQb enumC1818710xQb, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1818830xQn.LL;
        }
        if ((i & 2) != 0) {
            enumC1818710xQb = c1818830xQn.LLILLJJLI;
        }
        c1818830xQn.getClass();
        return new C1818830xQn(c627660Ojc, enumC1818710xQb);
    }
}
