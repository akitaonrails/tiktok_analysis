package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631750OqD implements InterfaceC636340Oxc<C631750OqD, InterfaceC1891350zJl> {
    public final String LL;
    public final boolean LLILLJJLI;
    public final C291001Au<C631780OqG> LLILLL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILZ;

    public C631750OqD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C631750OqD)) {
            return false;
        }
        C631750OqD c631750OqD = (C631750OqD) obj;
        return Intrinsics.LJFF(this.LL, c631750OqD.LL) && this.LLILLJJLI == c631750OqD.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c631750OqD.LLILLL) && Intrinsics.LJFF(this.LLILZ, c631750OqD.LLILZ);
    }

    public final int hashCode() {
        String str = this.LL;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightSelectListState(highlightSourceMusicId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showLoading=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", highlightEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZ);
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
        return this.LLILZ;
    }

    public /* synthetic */ C631750OqD(int i) {
        this(null, false, new C291001Au(null), new C627660Ojc(null, null, null, null, 15));
    }

    public C631750OqD(String str, boolean z, C291001Au<C631780OqG> c291001Au, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au;
        this.LLILZ = c627660Ojc;
    }

    public static C631750OqD LIZ(C631750OqD c631750OqD, String str, boolean z, C291001Au c291001Au, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            str = c631750OqD.LL;
        }
        if ((i & 2) != 0) {
            z = c631750OqD.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c631750OqD.LLILLL;
        }
        if ((i & 8) != 0) {
            c627660Ojc = c631750OqD.LLILZ;
        }
        c631750OqD.getClass();
        return new C631750OqD(str, z, c291001Au, c627660Ojc);
    }
}
