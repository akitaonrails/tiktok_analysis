package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567900qu4 implements InterfaceC636270OxV<C1567900qu4, Aweme> {
    public final C627660Ojc<Aweme> LL;
    public final boolean LLILLJJLI;
    public final C1567820qtw<Boolean> LLILLL;
    public final C1567820qtw<Boolean> LLILZ;
    public final Boolean LLILZIL;
    public final C1567840qty LLILZLL;
    public final C291001Au<C0N3M> LLIZ;
    public final C291001Au<List<Pair<Aweme, Integer>>> LLIZLLLIL;
    public final C291001Au<Boolean> LLJ;

    public C1567900qu4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567900qu4)) {
            return false;
        }
        C1567900qu4 c1567900qu4 = (C1567900qu4) obj;
        return Intrinsics.LJFF(this.LL, c1567900qu4.LL) && this.LLILLJJLI == c1567900qu4.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1567900qu4.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1567900qu4.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1567900qu4.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1567900qu4.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1567900qu4.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1567900qu4.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1567900qu4.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C1567820qtw<Boolean> c1567820qtw = this.LLILLL;
        int iHashCode2 = (iHashCode + (c1567820qtw == null ? 0 : c1567820qtw.hashCode())) * 31;
        C1567820qtw<Boolean> c1567820qtw2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c1567820qtw2 == null ? 0 : c1567820qtw2.hashCode())) * 31;
        Boolean bool = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C1567840qty c1567840qty = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (c1567840qty == null ? 0 : c1567840qty.hashCode())) * 31;
        C291001Au<C0N3M> c291001Au = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<List<Pair<Aweme, Integer>>> c291001Au2 = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLJ;
        return iHashCode7 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showCleanMode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", loadMoreEmpty=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", pauseVideo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", deleteItem=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", insertItem=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", replaceItems=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", showLoginPageEvent=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<Aweme> getListItemState() {
        return this.LL.LLILZ;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return this.LL.LLILLL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return this.LL.LLILLJJLI;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return this.LL.LL;
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<Aweme> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1567900qu4(int i) {
        this(new C627660Ojc(null, null, null, null, 15), true, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1567900qu4(C627660Ojc<Aweme> c627660Ojc, boolean z, C1567820qtw<Boolean> c1567820qtw, C1567820qtw<Boolean> c1567820qtw2, Boolean bool, C1567840qty c1567840qty, C291001Au<C0N3M> c291001Au, C291001Au<? extends List<? extends Pair<? extends Aweme, Integer>>> c291001Au2, C291001Au<Boolean> c291001Au3) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
        this.LLILLL = c1567820qtw;
        this.LLILZ = c1567820qtw2;
        this.LLILZIL = bool;
        this.LLILZLL = c1567840qty;
        this.LLIZ = c291001Au;
        this.LLIZLLLIL = c291001Au2;
        this.LLJ = c291001Au3;
    }

    public static C1567900qu4 LIZ(C1567900qu4 c1567900qu4, C627660Ojc c627660Ojc, boolean z, C1567820qtw c1567820qtw, C1567820qtw c1567820qtw2, Boolean bool, C1567840qty c1567840qty, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        C1567840qty c1567840qty2 = c1567840qty;
        Boolean bool2 = bool;
        C1567820qtw c1567820qtw3 = c1567820qtw2;
        C1567820qtw c1567820qtw4 = c1567820qtw;
        boolean z2 = z;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1567900qu4.LL;
        }
        if ((i & 2) != 0) {
            z2 = c1567900qu4.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1567820qtw4 = c1567900qu4.LLILLL;
        }
        if ((i & 8) != 0) {
            c1567820qtw3 = c1567900qu4.LLILZ;
        }
        if ((i & 16) != 0) {
            bool2 = c1567900qu4.LLILZIL;
        }
        if ((i & 32) != 0) {
            c1567840qty2 = c1567900qu4.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au6 = c1567900qu4.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au5 = c1567900qu4.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au4 = c1567900qu4.LLJ;
        }
        c1567900qu4.getClass();
        return new C1567900qu4(c627660Ojc2, z2, c1567820qtw4, c1567820qtw3, bool2, c1567840qty2, c291001Au6, c291001Au5, c291001Au4);
    }
}
