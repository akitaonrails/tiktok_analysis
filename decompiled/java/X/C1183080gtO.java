package X;

import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailFeedModule;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183080gtO implements InterfaceC636340Oxc<C1183080gtO, InterfaceC1891350zJl> {
    public final PoiRecommendFeatureDetailFeedModule LL;
    public final PoiRecommendFeatureDetailTabItem LLILLJJLI;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLL;

    public C1183080gtO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183080gtO)) {
            return false;
        }
        C1183080gtO c1183080gtO = (C1183080gtO) obj;
        return Intrinsics.LJFF(this.LL, c1183080gtO.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1183080gtO.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1183080gtO.LLILLL);
    }

    public final int hashCode() {
        PoiRecommendFeatureDetailFeedModule poiRecommendFeatureDetailFeedModule = this.LL;
        int iHashCode = (poiRecommendFeatureDetailFeedModule == null ? 0 : poiRecommendFeatureDetailFeedModule.hashCode()) * 31;
        PoiRecommendFeatureDetailTabItem poiRecommendFeatureDetailTabItem = this.LLILLJJLI;
        return ((iHashCode + (poiRecommendFeatureDetailTabItem != null ? poiRecommendFeatureDetailTabItem.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureDetailState(module=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedTab=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLL);
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
        return this.LLILLL;
    }

    public /* synthetic */ C1183080gtO(int i) {
        this(null, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1183080gtO(PoiRecommendFeatureDetailFeedModule poiRecommendFeatureDetailFeedModule, PoiRecommendFeatureDetailTabItem poiRecommendFeatureDetailTabItem, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = poiRecommendFeatureDetailFeedModule;
        this.LLILLJJLI = poiRecommendFeatureDetailTabItem;
        this.LLILLL = c627660Ojc;
    }

    public static C1183080gtO LIZ(C1183080gtO c1183080gtO, PoiRecommendFeatureDetailFeedModule poiRecommendFeatureDetailFeedModule, C627660Ojc c627660Ojc, int i) {
        PoiRecommendFeatureDetailTabItem poiRecommendFeatureDetailTabItem;
        if ((i & 1) != 0) {
            poiRecommendFeatureDetailFeedModule = c1183080gtO.LL;
        }
        if ((i & 2) != 0) {
            poiRecommendFeatureDetailTabItem = c1183080gtO.LLILLJJLI;
        } else {
            poiRecommendFeatureDetailTabItem = null;
        }
        if ((i & 4) != 0) {
            c627660Ojc = c1183080gtO.LLILLL;
        }
        c1183080gtO.getClass();
        return new C1183080gtO(poiRecommendFeatureDetailFeedModule, poiRecommendFeatureDetailTabItem, c627660Ojc);
    }
}
