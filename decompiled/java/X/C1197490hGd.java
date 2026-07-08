package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.search.data.PoiSearchFilterDataItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197490hGd implements InterfaceC636340Oxc<C1197490hGd, C1198630hIT> {
    public final String LL;
    public final Boolean LLILLJJLI;
    public final C627660Ojc<C1198630hIT> LLILLL;
    public final PoiSearchApi.PoiSearchResultWrapper LLILZ;
    public final Long LLILZIL;
    public final Integer LLILZLL;
    public final C1193740hAa LLIZ;
    public final List<PoiSearchFilterDataItem> LLIZLLLIL;
    public final List<String> LLJ;

    public C1197490hGd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1197490hGd)) {
            return false;
        }
        C1197490hGd c1197490hGd = (C1197490hGd) obj;
        return Intrinsics.LJFF(this.LL, c1197490hGd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1197490hGd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1197490hGd.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1197490hGd.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1197490hGd.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1197490hGd.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1197490hGd.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1197490hGd.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1197490hGd.LLJ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (poiSearchResultWrapper == null ? 0 : poiSearchResultWrapper.hashCode())) * 31;
        Long l = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        C1193740hAa c1193740hAa = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (c1193740hAa == null ? 0 : c1193740hAa.hashCode())) * 31;
        List<PoiSearchFilterDataItem> list = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LLJ;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSearchVMState(keyWord=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isShowLoadingHUD=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", poiSearchResult=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", requestEndTs=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", poiSearchResponseSourceType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", prfNetworkData=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", filterDataList=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", selectedFilterList=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1198630hIT> getListItemState() {
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
    public final C627660Ojc<C1198630hIT> getListState() {
        return this.LLILLL;
    }

    public /* synthetic */ C1197490hGd(int i) {
        this(null, null, new C627660Ojc(null, null, null, null, 15), null, null, null, null, null, null);
    }

    public C1197490hGd(String str, Boolean bool, C627660Ojc<C1198630hIT> c627660Ojc, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, Long l, Integer num, C1193740hAa c1193740hAa, List<PoiSearchFilterDataItem> list, List<String> list2) {
        this.LL = str;
        this.LLILLJJLI = bool;
        this.LLILLL = c627660Ojc;
        this.LLILZ = poiSearchResultWrapper;
        this.LLILZIL = l;
        this.LLILZLL = num;
        this.LLIZ = c1193740hAa;
        this.LLIZLLLIL = list;
        this.LLJ = list2;
    }

    public static C1197490hGd LIZ(C1197490hGd c1197490hGd, String str, Boolean bool, C627660Ojc c627660Ojc, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, Long l, Integer num, C1193740hAa c1193740hAa, List list, List list2, int i) {
        List list3 = list2;
        List list4 = list;
        C1193740hAa c1193740hAa2 = c1193740hAa;
        Integer num2 = num;
        Long l2 = l;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper2 = poiSearchResultWrapper;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        Boolean bool2 = bool;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c1197490hGd.LL;
        }
        if ((i & 2) != 0) {
            bool2 = c1197490hGd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c627660Ojc2 = c1197490hGd.LLILLL;
        }
        if ((i & 8) != 0) {
            poiSearchResultWrapper2 = c1197490hGd.LLILZ;
        }
        if ((i & 16) != 0) {
            l2 = c1197490hGd.LLILZIL;
        }
        if ((i & 32) != 0) {
            num2 = c1197490hGd.LLILZLL;
        }
        if ((i & 64) != 0) {
            c1193740hAa2 = c1197490hGd.LLIZ;
        }
        if ((i & 128) != 0) {
            list4 = c1197490hGd.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            list3 = c1197490hGd.LLJ;
        }
        c1197490hGd.getClass();
        return new C1197490hGd(str2, bool2, c627660Ojc2, poiSearchResultWrapper2, l2, num2, c1193740hAa2, list4, list3);
    }
}
