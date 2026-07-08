package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358490lSJ implements InterfaceC636340Oxc<C1358490lSJ, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final C1358520lSM LLILLJJLI;
    public final C1358760lSk LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final int LLILZIL;
    public final C291001Au<String> LLILZLL;
    public final int LLIZ;

    public C1358490lSJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1358490lSJ)) {
            return false;
        }
        C1358490lSJ c1358490lSJ = (C1358490lSJ) obj;
        return Intrinsics.LJFF(this.LL, c1358490lSJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1358490lSJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1358490lSJ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1358490lSJ.LLILZ) && this.LLILZIL == c1358490lSJ.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1358490lSJ.LLILZLL) && this.LLIZ == c1358490lSJ.LLIZ;
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostInteractState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", titleState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", buttonState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", closePanel=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", panelHeight=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", toastString=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", scrollToPosition=");
        sbLIZ.append(this.LLIZ);
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

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1358490lSJ(int i) {
        this(new C627660Ojc(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15), new C1358520lSM(0), new C1358760lSk(0), new C291001Au(Boolean.FALSE), 0, new C291001Au(""), 0);
    }

    public C1358490lSJ(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C1358520lSM c1358520lSM, C1358760lSk c1358760lSk, C291001Au<Boolean> c291001Au, int i, C291001Au<String> c291001Au2, int i2) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c1358520lSM;
        this.LLILLL = c1358760lSk;
        this.LLILZ = c291001Au;
        this.LLILZIL = i;
        this.LLILZLL = c291001Au2;
        this.LLIZ = i2;
    }

    public static C1358490lSJ LIZ(C1358490lSJ c1358490lSJ, C627660Ojc c627660Ojc, C1358520lSM c1358520lSM, C1358760lSk c1358760lSk, C291001Au c291001Au, int i, C291001Au c291001Au2, int i2, int i3) {
        int i4 = i2;
        C291001Au c291001Au3 = c291001Au2;
        int i5 = i;
        C291001Au c291001Au4 = c291001Au;
        C1358760lSk c1358760lSk2 = c1358760lSk;
        C1358520lSM c1358520lSM2 = c1358520lSM;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i3 & 1) != 0) {
            c627660Ojc2 = c1358490lSJ.LL;
        }
        if ((i3 & 2) != 0) {
            c1358520lSM2 = c1358490lSJ.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            c1358760lSk2 = c1358490lSJ.LLILLL;
        }
        if ((i3 & 8) != 0) {
            c291001Au4 = c1358490lSJ.LLILZ;
        }
        if ((i3 & 16) != 0) {
            i5 = c1358490lSJ.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            c291001Au3 = c1358490lSJ.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            i4 = c1358490lSJ.LLIZ;
        }
        c1358490lSJ.getClass();
        return new C1358490lSJ(c627660Ojc2, c1358520lSM2, c1358760lSk2, c291001Au4, i5, c291001Au3, i4);
    }
}
