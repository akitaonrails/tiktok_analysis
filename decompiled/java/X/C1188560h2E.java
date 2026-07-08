package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiGeneralCommonParams;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h2E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188560h2E implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Boolean LLILZLL;
    public final List<String> LLIZ;
    public final List<String> LLIZLLLIL;
    public final int LLJ;
    public final PoiGeneralCommonParams LLJI;
    public final Map<String, String> LLJIJIL;
    public final Map<String, String> LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1188560h2E)) {
            return false;
        }
        C1188560h2E c1188560h2E = (C1188560h2E) obj;
        return Intrinsics.LJFF(this.LL, c1188560h2E.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1188560h2E.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1188560h2E.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1188560h2E.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1188560h2E.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1188560h2E.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1188560h2E.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1188560h2E.LLIZLLLIL) && this.LLJ == c1188560h2E.LLJ && Intrinsics.LJFF(this.LLJI, c1188560h2E.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1188560h2E.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1188560h2E.LLJILJIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LLIZLLLIL;
        int iHashCode8 = (((iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.LLJ) * 31;
        PoiGeneralCommonParams poiGeneralCommonParams = this.LLJI;
        int iHashCode9 = (iHashCode8 + (poiGeneralCommonParams == null ? 0 : poiGeneralCommonParams.hashCode())) * 31;
        Map<String, String> map = this.LLJIJIL;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.LLJILJIL;
        return iHashCode10 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "PoiFeedBottomHierarchyData(poiId=" + this.LL + ", videoFrom=" + this.LLILLJJLI + ", poiSessionId=" + this.LLILLL + ", poiEnterFrom=" + this.LLILZ + ", adClickId=" + this.LLILZIL + ", privacyAuthStatusQueryRequired=" + this.LLILZLL + ", sourceMerchantIds=" + this.LLIZ + ", sourceProductIds=" + this.LLIZLLLIL + ", bottomBarStyle=" + this.LLJ + ", poiGeneralCommonParams=" + this.LLJI + ", poiRouterParams=" + this.LLJIJIL + ", poiSessionGeneralTrackParams=" + this.LLJILJIL + ')';
    }

    public C1188560h2E(String str, String str2, String str3, String str4, String str5, Boolean bool, List<String> list, List<String> list2, int i, PoiGeneralCommonParams poiGeneralCommonParams, Map<String, String> map, Map<String, String> map2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = bool;
        this.LLIZ = list;
        this.LLIZLLLIL = list2;
        this.LLJ = i;
        this.LLJI = poiGeneralCommonParams;
        this.LLJIJIL = map;
        this.LLJILJIL = map2;
    }
}
