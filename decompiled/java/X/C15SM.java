package X;

import com.ss.android.ugc.aweme.explore.data.ExploreTopBannerData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15SM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15SM implements InterfaceC636340Oxc<C15SM, C150D> {
    public final C291001Au<Unit> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C1582730rHz LLILLL;
    public final C627660Ojc<C150D> LLILZ;
    public final C291001Au<Integer> LLILZIL;
    public final boolean LLILZLL;
    public final C291001Au<Unit> LLIZ;
    public final ExploreTopBannerData LLIZLLLIL;

    public C15SM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15SM)) {
            return false;
        }
        C15SM c15sm = (C15SM) obj;
        return Intrinsics.LJFF(this.LL, c15sm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c15sm.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c15sm.LLILLL) && Intrinsics.LJFF(this.LLILZ, c15sm.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c15sm.LLILZIL) && this.LLILZLL == c15sm.LLILZLL && Intrinsics.LJFF(this.LLIZ, c15sm.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c15sm.LLIZLLLIL);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C1582730rHz c1582730rHz = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (c1582730rHz == null ? 0 : c1582730rHz.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        C291001Au<Integer> c291001Au3 = this.LLILZIL;
        int iHashCode4 = (((iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        C291001Au<Unit> c291001Au4 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        ExploreTopBannerData exploreTopBannerData = this.LLIZLLLIL;
        return iHashCode5 + (exploreTopBannerData != null ? exploreTopBannerData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreFeedState(emptyNoticeEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", refreshFinishEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", externalRefreshedTriggered=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", scrollToPosition=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", manualLoading=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", publishFinishEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", topBannerData=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C150D> getListItemState() {
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
    public final C627660Ojc<C150D> getListState() {
        return this.LLILZ;
    }

    public /* synthetic */ C15SM(int i) {
        this(null, null, null, new C627660Ojc(null, null, null, null, 15), null, false, null, null);
    }

    public C15SM(C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2, C1582730rHz c1582730rHz, C627660Ojc<C150D> c627660Ojc, C291001Au<Integer> c291001Au3, boolean z, C291001Au<Unit> c291001Au4, ExploreTopBannerData exploreTopBannerData) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c1582730rHz;
        this.LLILZ = c627660Ojc;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = z;
        this.LLIZ = c291001Au4;
        this.LLIZLLLIL = exploreTopBannerData;
    }

    public static C15SM LIZ(C15SM c15sm, C291001Au c291001Au, C291001Au c291001Au2, C1582730rHz c1582730rHz, C627660Ojc c627660Ojc, C291001Au c291001Au3, boolean z, C291001Au c291001Au4, ExploreTopBannerData exploreTopBannerData, int i) {
        ExploreTopBannerData exploreTopBannerData2 = exploreTopBannerData;
        C291001Au c291001Au5 = c291001Au4;
        boolean z2 = z;
        C291001Au c291001Au6 = c291001Au3;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        C1582730rHz c1582730rHz2 = c1582730rHz;
        C291001Au c291001Au7 = c291001Au2;
        C291001Au c291001Au8 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au8 = c15sm.LL;
        }
        if ((i & 2) != 0) {
            c291001Au7 = c15sm.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1582730rHz2 = c15sm.LLILLL;
        }
        if ((i & 8) != 0) {
            c627660Ojc2 = c15sm.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au6 = c15sm.LLILZIL;
        }
        if ((i & 32) != 0) {
            z2 = c15sm.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au5 = c15sm.LLIZ;
        }
        if ((i & 128) != 0) {
            exploreTopBannerData2 = c15sm.LLIZLLLIL;
        }
        c15sm.getClass();
        return new C15SM(c291001Au8, c291001Au7, c1582730rHz2, c627660Ojc2, c291001Au6, z2, c291001Au5, exploreTopBannerData2);
    }
}
