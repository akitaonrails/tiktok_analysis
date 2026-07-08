package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ir8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258560ir8 implements InterfaceC636340Oxc<C1258560ir8, C050A> {
    public final C627660Ojc<C050A> LL;
    public final C291001Au<String> LLILLJJLI;
    public final C291001Au<C1258620irE> LLILLL;
    public final C291001Au<String> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Integer> LLILZLL;
    public final C291001Au<Boolean> LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;
    public final boolean LLJ;
    public final C291001Au<Boolean> LLJI;
    public final C291001Au<Long> LLJIJIL;

    public C1258560ir8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1258560ir8)) {
            return false;
        }
        C1258560ir8 c1258560ir8 = (C1258560ir8) obj;
        return Intrinsics.LJFF(this.LL, c1258560ir8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1258560ir8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1258560ir8.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1258560ir8.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1258560ir8.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1258560ir8.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1258560ir8.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1258560ir8.LLIZLLLIL) && this.LLJ == c1258560ir8.LLJ && Intrinsics.LJFF(this.LLJI, c1258560ir8.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1258560ir8.LLJIJIL);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode();
    }

    public final String toString() {
        return "RepostVideoState(listState=" + this.LL + ", onCellClickEvent=" + this.LLILLJJLI + ", onCellLongPressEvent=" + this.LLILLL + ", deleteRepost=" + this.LLILZ + ", needRefresh=" + this.LLILZIL + ", scrollToPosition=" + this.LLILZLL + ", showPrivateAccount=" + this.LLIZ + ", clearState=" + this.LLIZLLLIL + ", pullUpLoadMore=" + this.LLJ + ", clearMobCache=" + this.LLJI + ", loadMoreEvent=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC636270OxV
    public final List<C050A> getListItemState() {
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
    public final C627660Ojc<C050A> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1258560ir8(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C291001Au c291001Au = new C291001Au("");
        C291001Au c291001Au2 = new C291001Au(new C1258620irE(null, null));
        C291001Au c291001Au3 = new C291001Au("");
        Boolean bool = Boolean.TRUE;
        C291001Au c291001Au4 = new C291001Au(bool);
        C291001Au c291001Au5 = new C291001Au(0);
        Boolean bool2 = Boolean.FALSE;
        this(c627660Ojc, c291001Au, c291001Au2, c291001Au3, c291001Au4, c291001Au5, new C291001Au(bool2), new C291001Au(bool2), false, new C291001Au(bool), new C291001Au(0L));
    }

    public C1258560ir8(C627660Ojc<C050A> c627660Ojc, C291001Au<String> c291001Au, C291001Au<C1258620irE> c291001Au2, C291001Au<String> c291001Au3, C291001Au<Boolean> c291001Au4, C291001Au<Integer> c291001Au5, C291001Au<Boolean> c291001Au6, C291001Au<Boolean> c291001Au7, boolean z, C291001Au<Boolean> c291001Au8, C291001Au<Long> c291001Au9) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = c291001Au5;
        this.LLIZ = c291001Au6;
        this.LLIZLLLIL = c291001Au7;
        this.LLJ = z;
        this.LLJI = c291001Au8;
        this.LLJIJIL = c291001Au9;
    }

    public static C1258560ir8 LIZ(C1258560ir8 c1258560ir8, C627660Ojc c627660Ojc, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, boolean z, C291001Au c291001Au7, C291001Au c291001Au8, int i) {
        C291001Au<String> c291001Au9;
        C291001Au c291001Au10 = c291001Au8;
        C291001Au c291001Au11 = c291001Au7;
        boolean z2 = z;
        C291001Au c291001Au12 = c291001Au6;
        C291001Au c291001Au13 = c291001Au5;
        C291001Au c291001Au14 = c291001Au4;
        C291001Au c291001Au15 = c291001Au3;
        C291001Au c291001Au16 = c291001Au2;
        C291001Au c291001Au17 = c291001Au;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1258560ir8.LL;
        }
        if ((i & 2) != 0) {
            c291001Au17 = c1258560ir8.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au16 = c1258560ir8.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au9 = c1258560ir8.LLILZ;
        } else {
            c291001Au9 = null;
        }
        if ((i & 16) != 0) {
            c291001Au15 = c1258560ir8.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au14 = c1258560ir8.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au13 = c1258560ir8.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au12 = c1258560ir8.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            z2 = c1258560ir8.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au11 = c1258560ir8.LLJI;
        }
        if ((i & 1024) != 0) {
            c291001Au10 = c1258560ir8.LLJIJIL;
        }
        c1258560ir8.getClass();
        return new C1258560ir8(c627660Ojc2, c291001Au17, c291001Au16, c291001Au9, c291001Au15, c291001Au14, c291001Au13, c291001Au12, z2, c291001Au11, c291001Au10);
    }
}
