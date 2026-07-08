package X;

import com.ss.android.ugc.aweme.explore.data.ExploreTopBannerData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15SN, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15SN implements InterfaceC636340Oxc<C15SN, C20526015Tm> {
    public final C627660Ojc<C20526015Tm> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C1582730rHz LLILZ;
    public final String LLILZIL;
    public final C291001Au<Integer> LLILZLL;
    public final boolean LLIZ;
    public final ExploreTopBannerData LLIZLLLIL;
    public final C291001Au<Unit> LLJ;

    public C15SN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15SN)) {
            return false;
        }
        C15SN c15sn = (C15SN) obj;
        return Intrinsics.LJFF(this.LL, c15sn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c15sn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c15sn.LLILLL) && Intrinsics.LJFF(this.LLILZ, c15sn.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c15sn.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c15sn.LLILZLL) && this.LLIZ == c15sn.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c15sn.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c15sn.LLJ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C1582730rHz c1582730rHz = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c1582730rHz == null ? 0 : c1582730rHz.hashCode())) * 31;
        String str = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        C291001Au<Integer> c291001Au3 = this.LLILZLL;
        int iHashCode6 = (((iHashCode5 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        ExploreTopBannerData exploreTopBannerData = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (exploreTopBannerData == null ? 0 : exploreTopBannerData.hashCode())) * 31;
        C291001Au<Unit> c291001Au4 = this.LLJ;
        return iHashCode7 + (c291001Au4 != null ? c291001Au4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreTopicFeedState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emptyNoticeEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", refreshFinishEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", externalRefreshedTriggered=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", suggestedWord=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", scrollToPosition=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", manualLoading=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", topBannerData=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", contentExhaustedEvent=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C20526015Tm> getListItemState() {
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
    public final C627660Ojc<C20526015Tm> getListState() {
        return this.LL;
    }

    public /* synthetic */ C15SN(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null, null, null, null, null, false, null, null);
    }

    public C15SN(C627660Ojc<C20526015Tm> c627660Ojc, C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2, C1582730rHz c1582730rHz, String str, C291001Au<Integer> c291001Au3, boolean z, ExploreTopBannerData exploreTopBannerData, C291001Au<Unit> c291001Au4) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c1582730rHz;
        this.LLILZIL = str;
        this.LLILZLL = c291001Au3;
        this.LLIZ = z;
        this.LLIZLLLIL = exploreTopBannerData;
        this.LLJ = c291001Au4;
    }

    public static C15SN LIZ(C15SN c15sn, C627660Ojc c627660Ojc, C291001Au c291001Au, C291001Au c291001Au2, C1582730rHz c1582730rHz, C291001Au c291001Au3, boolean z, ExploreTopBannerData exploreTopBannerData, C291001Au c291001Au4, int i) {
        String str;
        C291001Au c291001Au5 = c291001Au4;
        ExploreTopBannerData exploreTopBannerData2 = exploreTopBannerData;
        boolean z2 = z;
        C291001Au c291001Au6 = c291001Au3;
        C1582730rHz c1582730rHz2 = c1582730rHz;
        C291001Au c291001Au7 = c291001Au2;
        C291001Au c291001Au8 = c291001Au;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c15sn.LL;
        }
        if ((i & 2) != 0) {
            c291001Au8 = c15sn.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au7 = c15sn.LLILLL;
        }
        if ((i & 8) != 0) {
            c1582730rHz2 = c15sn.LLILZ;
        }
        if ((i & 16) != 0) {
            str = c15sn.LLILZIL;
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            c291001Au6 = c15sn.LLILZLL;
        }
        if ((i & 64) != 0) {
            z2 = c15sn.LLIZ;
        }
        if ((i & 128) != 0) {
            exploreTopBannerData2 = c15sn.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au5 = c15sn.LLJ;
        }
        c15sn.getClass();
        return new C15SN(c627660Ojc2, c291001Au8, c291001Au7, c1582730rHz2, str, c291001Au6, z2, exploreTopBannerData2, c291001Au5);
    }
}
