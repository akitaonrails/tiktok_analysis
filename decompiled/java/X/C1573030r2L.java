package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573030r2L implements InterfaceC636340Oxc<C1573030r2L, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final C291001Au<C443120HZe<Integer, Boolean, Boolean>> LLILLJJLI;
    public final C291001Au<InterfaceC1891350zJl> LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final C291001Au<C1573100r2S> LLILZIL;
    public C291001Au<C1595190rc5> LLILZLL;
    public final C291001Au<AbstractC641380PDs> LLIZ;
    public final C291001Au<Object> LLIZLLLIL;
    public final List<InterfaceC1891350zJl> LLJ;

    public C1573030r2L() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573030r2L)) {
            return false;
        }
        C1573030r2L c1573030r2L = (C1573030r2L) obj;
        return Intrinsics.LJFF(this.LL, c1573030r2L.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1573030r2L.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1573030r2L.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1573030r2L.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1573030r2L.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1573030r2L.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1573030r2L.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1573030r2L.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1573030r2L.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<InterfaceC1891350zJl> c291001Au = this.LLILLL;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<C1573100r2S> c291001Au3 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<C1595190rc5> c291001Au4 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<AbstractC641380PDs> c291001Au5 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Object> c291001Au6 = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        List<InterfaceC1891350zJl> list = this.LLJ;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedSkylightListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedCellPosition=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemDeleteEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scrollToBeginEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", doEnterFollowingInnerSkylightTransitionEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", rerankState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", rerankScrollToTargetEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", visibleChangeEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", cacheData=");
        sbLIZ.append(this.LLJ);
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

    public /* synthetic */ C1573030r2L(int i) {
        this(new C627660Ojc(null, null, null, null, 15), new C291001Au(new C443120HZe(0, Boolean.TRUE, Boolean.FALSE)), null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1573030r2L(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C291001Au<C443120HZe<Integer, Boolean, Boolean>> c291001Au, C291001Au<? extends InterfaceC1891350zJl> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<C1573100r2S> c291001Au4, C291001Au<C1595190rc5> c291001Au5, C291001Au<? extends AbstractC641380PDs> c291001Au6, C291001Au<Object> c291001Au7, List<? extends InterfaceC1891350zJl> list) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = c291001Au5;
        this.LLIZ = c291001Au6;
        this.LLIZLLLIL = c291001Au7;
        this.LLJ = list;
    }

    public static C1573030r2L LIZ(C1573030r2L c1573030r2L, C627660Ojc c627660Ojc, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, List list, int i) {
        C291001Au<Unit> c291001Au6;
        C291001Au c291001Au7 = c291001Au5;
        C291001Au c291001Au8 = c291001Au4;
        C291001Au c291001Au9 = c291001Au2;
        C291001Au c291001Au10 = c291001Au3;
        List list2 = list;
        C291001Au c291001Au11 = c291001Au;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1573030r2L.LL;
        }
        if ((i & 2) != 0) {
            c291001Au11 = c1573030r2L.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au9 = c1573030r2L.LLILLL;
        }
        C291001Au<Object> c291001Au12 = null;
        if ((i & 8) != 0) {
            c291001Au6 = c1573030r2L.LLILZ;
        } else {
            c291001Au6 = null;
        }
        if ((i & 16) != 0) {
            c291001Au10 = c1573030r2L.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au8 = c1573030r2L.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au7 = c1573030r2L.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au12 = c1573030r2L.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            list2 = c1573030r2L.LLJ;
        }
        c1573030r2L.getClass();
        return new C1573030r2L(c627660Ojc2, c291001Au11, c291001Au9, c291001Au6, c291001Au10, c291001Au8, c291001Au7, c291001Au12, list2);
    }
}
