package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187300h0C implements InterfaceC636340Oxc<C1187300h0C, InterfaceC1891350zJl> {
    public final PoiDetailApi.PoiTopVideosLoadMoreResponse LL;
    public final PoiDetailApi.PoiMultiMediumTab LLILLJJLI;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLL;

    public C1187300h0C() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1187300h0C)) {
            return false;
        }
        C1187300h0C c1187300h0C = (C1187300h0C) obj;
        return Intrinsics.LJFF(this.LL, c1187300h0C.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1187300h0C.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1187300h0C.LLILLL);
    }

    public final int hashCode() {
        PoiDetailApi.PoiTopVideosLoadMoreResponse poiTopVideosLoadMoreResponse = this.LL;
        int iHashCode = (poiTopVideosLoadMoreResponse == null ? 0 : poiTopVideosLoadMoreResponse.hashCode()) * 31;
        PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab = this.LLILLJJLI;
        return ((iHashCode + (poiMultiMediumTab != null ? poiMultiMediumTab.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHeaderTopVideosState(response=");
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

    public /* synthetic */ C1187300h0C(int i) {
        this(null, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1187300h0C(PoiDetailApi.PoiTopVideosLoadMoreResponse poiTopVideosLoadMoreResponse, PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = poiTopVideosLoadMoreResponse;
        this.LLILLJJLI = poiMultiMediumTab;
        this.LLILLL = c627660Ojc;
    }

    public static C1187300h0C LIZ(C1187300h0C c1187300h0C, PoiDetailApi.PoiTopVideosLoadMoreResponse poiTopVideosLoadMoreResponse, PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            poiTopVideosLoadMoreResponse = c1187300h0C.LL;
        }
        if ((i & 2) != 0) {
            poiMultiMediumTab = c1187300h0C.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c627660Ojc = c1187300h0C.LLILLL;
        }
        c1187300h0C.getClass();
        return new C1187300h0C(poiTopVideosLoadMoreResponse, poiMultiMediumTab, c627660Ojc);
    }
}
