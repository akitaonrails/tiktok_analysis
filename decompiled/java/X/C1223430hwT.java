package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1223430hwT implements InterfaceC636340Oxc<C1223430hwT, InterfaceC1361290lWp> {
    public final C1223490hwZ LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C627660Ojc<InterfaceC1361290lWp> LLILZ;
    public final C291001Au<String> LLILZIL;
    public final Boolean LLILZLL;
    public final List<String> LLIZ;
    public final Boolean LLIZLLLIL;

    public C1223430hwT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1223430hwT)) {
            return false;
        }
        C1223430hwT c1223430hwT = (C1223430hwT) obj;
        return Intrinsics.LJFF(this.LL, c1223430hwT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1223430hwT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1223430hwT.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1223430hwT.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1223430hwT.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1223430hwT.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1223430hwT.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1223430hwT.LLIZLLLIL);
    }

    public final int hashCode() {
        C1223490hwZ c1223490hwZ = this.LL;
        int iHashCode = (c1223490hwZ == null ? 0 : c1223490hwZ.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        C291001Au<String> c291001Au2 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.LLIZLLLIL;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3FeedListState(refreshInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", resetPlayerStateEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scrollToTopStateEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", initialAnchorItem=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", jumpToTopCapsuleVisible=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", sessionMafIds=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", nestScrollEnable=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1361290lWp> getListItemState() {
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
    public final C627660Ojc<InterfaceC1361290lWp> getListState() {
        return this.LLILZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1223430hwT(int i) {
        this(null, null, new C291001Au(Boolean.FALSE), new C627660Ojc(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15), null, null, null, null);
    }

    public C1223430hwT(C1223490hwZ c1223490hwZ, C291001Au<Unit> c291001Au, C291001Au<Boolean> c291001Au2, C627660Ojc<InterfaceC1361290lWp> c627660Ojc, C291001Au<String> c291001Au3, Boolean bool, List<String> list, Boolean bool2) {
        this.LL = c1223490hwZ;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c627660Ojc;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = bool;
        this.LLIZ = list;
        this.LLIZLLLIL = bool2;
    }

    public static C1223430hwT LIZ(C1223430hwT c1223430hwT, C1223490hwZ c1223490hwZ, C291001Au c291001Au, C291001Au c291001Au2, C627660Ojc c627660Ojc, C291001Au c291001Au3, Boolean bool, List list, int i) {
        Boolean bool2;
        List list2 = list;
        Boolean bool3 = bool;
        C291001Au c291001Au4 = c291001Au3;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        C1223490hwZ c1223490hwZ2 = c1223490hwZ;
        if ((i & 1) != 0) {
            c1223490hwZ2 = c1223430hwT.LL;
        }
        if ((i & 2) != 0) {
            c291001Au6 = c1223430hwT.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au5 = c1223430hwT.LLILLL;
        }
        if ((i & 8) != 0) {
            c627660Ojc2 = c1223430hwT.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au4 = c1223430hwT.LLILZIL;
        }
        if ((i & 32) != 0) {
            bool3 = c1223430hwT.LLILZLL;
        }
        if ((i & 64) != 0) {
            list2 = c1223430hwT.LLIZ;
        }
        if ((i & 128) != 0) {
            bool2 = c1223430hwT.LLIZLLLIL;
        } else {
            bool2 = null;
        }
        c1223430hwT.getClass();
        return new C1223430hwT(c1223490hwZ2, c291001Au6, c291001Au5, c627660Ojc2, c291001Au4, bool3, list2, bool2);
    }
}
