package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200090hKp implements InterfaceC636340Oxc<C1200090hKp, C1200050hKl> {
    public final String LL;
    public final PoiData LLILLJJLI;
    public final PoiData LLILLL;
    public final PoiSearchApi.PoiSearchResultWrapper LLILZ;
    public final C627660Ojc<C1200050hKl> LLILZIL;

    public C1200090hKp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200090hKp)) {
            return false;
        }
        C1200090hKp c1200090hKp = (C1200090hKp) obj;
        return Intrinsics.LJFF(this.LL, c1200090hKp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1200090hKp.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1200090hKp.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1200090hKp.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1200090hKp.LLILZIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PoiData poiData = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (poiData == null ? 0 : poiData.hashCode())) * 31;
        PoiData poiData2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (poiData2 == null ? 0 : poiData2.hashCode())) * 31;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = this.LLILZ;
        return ((iHashCode3 + (poiSearchResultWrapper != null ? poiSearchResultWrapper.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiClaimPoiListVMState(keyword=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedPoi=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mapPositionPoi=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", poiSearchResult=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1200050hKl> getListItemState() {
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
    public final C627660Ojc<C1200050hKl> getListState() {
        return this.LLILZIL;
    }

    public /* synthetic */ C1200090hKp(int i) {
        this(null, null, null, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1200090hKp(String str, PoiData poiData, PoiData poiData2, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, C627660Ojc<C1200050hKl> c627660Ojc) {
        this.LL = str;
        this.LLILLJJLI = poiData;
        this.LLILLL = poiData2;
        this.LLILZ = poiSearchResultWrapper;
        this.LLILZIL = c627660Ojc;
    }

    public static C1200090hKp LIZ(C1200090hKp c1200090hKp, String str, PoiData poiData, PoiData poiData2, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, C627660Ojc c627660Ojc, int i) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper2 = poiSearchResultWrapper;
        PoiData poiData3 = poiData2;
        PoiData poiData4 = poiData;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c1200090hKp.LL;
        }
        if ((i & 2) != 0) {
            poiData4 = c1200090hKp.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            poiData3 = c1200090hKp.LLILLL;
        }
        if ((i & 8) != 0) {
            poiSearchResultWrapper2 = c1200090hKp.LLILZ;
        }
        if ((i & 16) != 0) {
            c627660Ojc2 = c1200090hKp.LLILZIL;
        }
        c1200090hKp.getClass();
        return new C1200090hKp(str2, poiData4, poiData3, poiSearchResultWrapper2, c627660Ojc2);
    }
}
