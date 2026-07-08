package X;

import com.ss.android.ugc.aweme.explore.data.ExploreTopBannerData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15SI, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15SI implements InterfaceC0148002o {
    public final Boolean LL;
    public final C291001Au<Long> LLILLJJLI;
    public final ExploreTopBannerData LLILLL;
    public final C291001Au<Unit> LLILZ;

    public C15SI() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15SI)) {
            return false;
        }
        C15SI c15si = (C15SI) obj;
        return Intrinsics.LJFF(this.LL, c15si.LL) && Intrinsics.LJFF(this.LLILLJJLI, c15si.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c15si.LLILLL) && Intrinsics.LJFF(this.LLILZ, c15si.LLILZ);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C291001Au<Long> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        ExploreTopBannerData exploreTopBannerData = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (exploreTopBannerData == null ? 0 : exploreTopBannerData.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILZ;
        return iHashCode3 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedState(refreshFinish=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subTabChangeEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", topBanner=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", vpScrollIdle=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15SI(Boolean bool, C291001Au<Long> c291001Au, ExploreTopBannerData exploreTopBannerData, C291001Au<Unit> c291001Au2) {
        this.LL = bool;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = exploreTopBannerData;
        this.LLILZ = c291001Au2;
    }

    public static C15SI LIZ(C15SI c15si, Boolean bool, C291001Au c291001Au, ExploreTopBannerData exploreTopBannerData, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            bool = c15si.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c15si.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            exploreTopBannerData = c15si.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c15si.LLILZ;
        }
        c15si.getClass();
        return new C15SI(bool, c291001Au, exploreTopBannerData, c291001Au2);
    }
}
