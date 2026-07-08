package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h2B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188530h2B implements Serializable, InterfaceC2753014t {
    public static final C1185500gxI Companion = new C1185500gxI();
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final String LLJJJJ;
    public final String LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final String LLJJL;
    public final Map<String, String> LLJJLIIIJLLLLLLLZ;
    public final String LLJL;
    public final String LLJLIL;
    public final String LLJLILLLLZIIL;
    public final Map<String, String> LLJLL;
    public final Map<String, String> LLJLLIL;

    public C1188530h2B() {
        this(null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LinkedHashMap(), null, null, null, null, new LinkedHashMap());
    }

    public final C1188530h2B copy(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Map<String, String> map, String str26, String str27, String str28, Map<String, String> map2, Map<String, String> map3) {
        return new C1188530h2B(str, str2, str3, i, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, map, str26, str27, str28, map2, map3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1188530h2B)) {
            return false;
        }
        C1188530h2B c1188530h2B = (C1188530h2B) obj;
        return Intrinsics.LJFF(this.LL, c1188530h2B.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1188530h2B.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1188530h2B.LLILLL) && this.LLILZ == c1188530h2B.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1188530h2B.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1188530h2B.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1188530h2B.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1188530h2B.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1188530h2B.LLJ) && Intrinsics.LJFF(this.LLJI, c1188530h2B.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1188530h2B.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1188530h2B.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1188530h2B.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1188530h2B.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1188530h2B.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1188530h2B.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1188530h2B.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1188530h2B.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1188530h2B.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c1188530h2B.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1188530h2B.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1188530h2B.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c1188530h2B.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c1188530h2B.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c1188530h2B.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c1188530h2B.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c1188530h2B.LLJJLIIIJLLLLLLLZ) && Intrinsics.LJFF(this.LLJL, c1188530h2B.LLJL) && Intrinsics.LJFF(this.LLJLIL, c1188530h2B.LLJLIL) && Intrinsics.LJFF(this.LLJLILLLLZIIL, c1188530h2B.LLJLILLLLZIIL) && Intrinsics.LJFF(this.LLJLL, c1188530h2B.LLJLL) && Intrinsics.LJFF(this.LLJLLIL, c1188530h2B.LLJLLIL);
    }

    public String getSourceId() {
        return "PoiCollectMobData";
    }

    public int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLILZ) * 31;
        String str4 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJ;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJI;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LLJIJIL;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LLJILJIL;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LLJILJILJ;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LLJILLL;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.LLJJ;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.LLJJI;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.LLJJIII;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.LLJJIJI;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.LLJJIJIIJIL;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.LLJJIJIL;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.LLJJJ;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.LLJJJIL;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.LLJJJJ;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.LLJJJJJIL;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.LLJJJJLIIL;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.LLJJL;
        int iHashCode25 = (((iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31) + this.LLJJLIIIJLLLLLLLZ.hashCode()) * 31;
        String str26 = this.LLJL;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.LLJLIL;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.LLJLILLLLZIIL;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Map<String, String> map = this.LLJLL;
        return ((iHashCode28 + (map != null ? map.hashCode() : 0)) * 31) + this.LLJLLIL.hashCode();
    }

    public String toString() {
        return "PoiCollectMobData(enterFrom=" + this.LL + ", enterMethod=" + this.LLILLJJLI + ", previousPage=" + this.LLILLL + ", enableLocation=" + this.LLILZ + ", pageModel=" + this.LLILZIL + ", poiDetailEnterFrom=" + this.LLILZLL + ", poiDetailEnterMethod=" + this.LLIZ + ", initialPoiId=" + this.LLIZLLLIL + ", initialPoiEnterFrom=" + this.LLJ + ", initialPoiEnterMethod=" + this.LLJI + ", initialPoiFromGroupId=" + this.LLJIJIL + ", pagePoiId=" + this.LLJILJIL + ", pagePoiInfoSource=" + this.LLJILJILJ + ", pagePoiCity=" + this.LLJILLL + ", pagePoiRegionCode=" + this.LLJJ + ", pageIsClaimed=" + this.LLJJI + ", pagePoiDetailType=" + this.LLJJIII + ", pageCollectInfo=" + this.LLJJIJI + ", poiId=" + this.LLJJIJIIJIL + ", poiInfoSource=" + this.LLJJIJIL + ", poiCity=" + this.LLJJJ + ", poiRegionCode=" + this.LLJJJIL + ", poiDeviceSameCity=" + this.LLJJJJ + ", isClaimed=" + this.LLJJJJJIL + ", poiDetailType=" + this.LLJJJJLIIL + ", collectInfo=" + this.LLJJL + ", transferParams=" + this.LLJJLIIIJLLLLLLLZ + ", fromGroupId=" + this.LLJL + ", groupId=" + this.LLJLIL + ", authorId=" + this.LLJLILLLLZIIL + ", searchParams=" + this.LLJLL + ", allParamsMap=" + this.LLJLLIL + ')';
    }

    public final Map<String, String> forceToMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LL;
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        String str2 = this.LLILLJJLI;
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        String str3 = this.LLJILJIL;
        if (str3 != null) {
            linkedHashMap.put("page_poi_id", str3);
        }
        String str4 = this.LLJILJILJ;
        if (str4 != null) {
            linkedHashMap.put("page_poi_info_source", str4);
        }
        String str5 = this.LLJILLL;
        if (str5 != null) {
            linkedHashMap.put("page_poi_city", str5);
        }
        String str6 = this.LLJJ;
        if (str6 != null) {
            linkedHashMap.put("page_poi_region_code", str6);
        }
        linkedHashMap.put("enable_location", String.valueOf(this.LLILZ));
        String str7 = this.LLILLL;
        if (str7 != null) {
            linkedHashMap.put("previous_page", str7);
        }
        if (C123100dR.LIZ(this.LLJL)) {
            linkedHashMap.put("from_group_id", this.LLJL);
        }
        if (C123100dR.LIZ(this.LLILZLL)) {
            linkedHashMap.put("poi_detail_enter_from", this.LLILZLL);
        }
        if (C123100dR.LIZ(this.LLIZ)) {
            linkedHashMap.put("poi_detail_enter_method", this.LLIZ);
        }
        if (C123100dR.LIZ(this.LLIZLLLIL)) {
            linkedHashMap.put("initial_poi_id", this.LLIZLLLIL);
        }
        if (C123100dR.LIZ(this.LLJIJIL)) {
            linkedHashMap.put("initial_poi_from_group_id", this.LLJIJIL);
        }
        if (C123100dR.LIZ(this.LLJ)) {
            linkedHashMap.put("initial_poi_enter_from", this.LLJ);
        }
        if (C123100dR.LIZ(this.LLJI)) {
            linkedHashMap.put("initial_poi_enter_method", this.LLJI);
        }
        String str8 = this.LLJJIJIIJIL;
        if (str8 != null) {
            linkedHashMap.put("poi_id", str8);
        }
        String str9 = this.LLJJJJ;
        if (str9 != null) {
            linkedHashMap.put("poi_device_samecity", str9);
        }
        String str10 = this.LLJJJ;
        if (str10 != null) {
            linkedHashMap.put("poi_city", str10);
        }
        String str11 = this.LLJJJ;
        if (str11 != null) {
            linkedHashMap.put("poi_city", str11);
        }
        String str12 = this.LLJJJIL;
        if (str12 != null) {
            linkedHashMap.put("poi_region_code", str12);
        }
        String str13 = this.LLJJIJIL;
        if (str13 != null) {
            linkedHashMap.put("poi_info_source", str13);
        }
        String str14 = this.LLJLIL;
        if (str14 != null) {
            linkedHashMap.put("group_id", str14);
        }
        String str15 = this.LLJLILLLLZIIL;
        if (str15 != null) {
            linkedHashMap.put("author_id", str15);
        }
        C1189060h32.LIZ(this.LLJJL, linkedHashMap);
        C1189060h32.LJFF(this.LLJJIJI, linkedHashMap);
        String str16 = this.LLJJJJLIIL;
        if (str16 != null) {
            linkedHashMap.put("poi_detail_type", str16);
        }
        if (C123100dR.LIZ(this.LLJJJJJIL)) {
            linkedHashMap.put("is_claimed", this.LLJJJJJIL);
        }
        if (C123100dR.LIZ(this.LLJJI)) {
            linkedHashMap.put("page_is_claimed", this.LLJJI);
        }
        String str17 = this.LLJJIII;
        if (str17 != null) {
            linkedHashMap.put("page_poi_detail_type", str17);
        }
        linkedHashMap.putAll(this.LLJJLIIIJLLLLLLLZ);
        C1189060h32.LJIJI(linkedHashMap, "page_model", this.LLILZIL);
        this.LLJLLIL.clear();
        this.LLJLLIL.putAll(linkedHashMap);
        return linkedHashMap;
    }

    public final Map<String, String> toMap() {
        return this.LLJLLIL.isEmpty() ? forceToMap() : this.LLJLLIL;
    }

    public final Map<String, String> getAllParamsMap() {
        return this.LLJLLIL;
    }

    public final String getAuthorId() {
        return this.LLJLILLLLZIIL;
    }

    public final String getCollectInfo() {
        return this.LLJJL;
    }

    public final int getEnableLocation() {
        return this.LLILZ;
    }

    public final String getEnterFrom() {
        return this.LL;
    }

    public final String getEnterMethod() {
        return this.LLILLJJLI;
    }

    public final String getFromGroupId() {
        return this.LLJL;
    }

    public final String getGroupId() {
        return this.LLJLIL;
    }

    public final String getInitialPoiEnterFrom() {
        return this.LLJ;
    }

    public final String getInitialPoiEnterMethod() {
        return this.LLJI;
    }

    public final String getInitialPoiFromGroupId() {
        return this.LLJIJIL;
    }

    public final String getInitialPoiId() {
        return this.LLIZLLLIL;
    }

    public final String getPageCollectInfo() {
        return this.LLJJIJI;
    }

    public final String getPageIsClaimed() {
        return this.LLJJI;
    }

    public final String getPageModel() {
        return this.LLILZIL;
    }

    public final String getPagePoiCity() {
        return this.LLJILLL;
    }

    public final String getPagePoiDetailType() {
        return this.LLJJIII;
    }

    public final String getPagePoiId() {
        return this.LLJILJIL;
    }

    public final String getPagePoiInfoSource() {
        return this.LLJILJILJ;
    }

    public final String getPagePoiRegionCode() {
        return this.LLJJ;
    }

    public final String getPoiCity() {
        return this.LLJJJ;
    }

    public final String getPoiDetailEnterFrom() {
        return this.LLILZLL;
    }

    public final String getPoiDetailEnterMethod() {
        return this.LLIZ;
    }

    public final String getPoiDetailType() {
        return this.LLJJJJLIIL;
    }

    public final String getPoiDeviceSameCity() {
        return this.LLJJJJ;
    }

    public final String getPoiId() {
        return this.LLJJIJIIJIL;
    }

    public final String getPoiInfoSource() {
        return this.LLJJIJIL;
    }

    public final String getPoiRegionCode() {
        return this.LLJJJIL;
    }

    public final String getPreviousPage() {
        return this.LLILLL;
    }

    public final Map<String, String> getSearchParams() {
        return this.LLJLL;
    }

    public final Map<String, String> getTransferParams() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final String isClaimed() {
        return this.LLJJJJJIL;
    }

    public C1188530h2B(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Map<String, String> map, String str26, String str27, String str28, Map<String, String> map2, Map<String, String> map3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = i;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
        this.LLJI = str9;
        this.LLJIJIL = str10;
        this.LLJILJIL = str11;
        this.LLJILJILJ = str12;
        this.LLJILLL = str13;
        this.LLJJ = str14;
        this.LLJJI = str15;
        this.LLJJIII = str16;
        this.LLJJIJI = str17;
        this.LLJJIJIIJIL = str18;
        this.LLJJIJIL = str19;
        this.LLJJJ = str20;
        this.LLJJJIL = str21;
        this.LLJJJJ = str22;
        this.LLJJJJJIL = str23;
        this.LLJJJJLIIL = str24;
        this.LLJJL = str25;
        this.LLJJLIIIJLLLLLLLZ = map;
        this.LLJL = str26;
        this.LLJLIL = str27;
        this.LLJLILLLLZIIL = str28;
        this.LLJLL = map2;
        this.LLJLLIL = map3;
    }
}
