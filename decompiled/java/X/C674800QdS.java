package X;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674800QdS implements Serializable {
    public static final int $stable = 8;
    public Map<String, String> apiParamsInCurrentSearch;
    public final String apiVersion;
    public final String attachProducts;
    public String authorId;
    public String bcmChain;
    public final String chunkSizeList;
    public String clientRequestId;
    public String cmplEnc;
    public final int correctType;
    public final int count;
    public final long cursor;
    public final Integer dmaConsentStatus;
    public String ecSearchSessionId;
    public final Integer edmConsentStatus;
    public final Long endToEndSearchSessionId;
    public final String enterFrom;
    public final String enterFromSecond;
    public C0PSG filterOption;
    public final String filtersData;
    public final int hotSearch;
    public final int isFilterSearch;
    public Integer isLowDevice;
    public final Integer isNonPersonalizedSearch;
    public Integer isWeakNetwork;
    public String keyword;
    public String lastSearchId;
    public final String lastSearchPidList;
    public final String mockAttachProducts;
    public final String newUserExtraInfo;
    public final String nineSearchProductId;
    public Integer noNeedPageStyle;
    public String originIsMallTab;
    public final Integer pageType;
    public String passThroughParams;
    public Map<String, String> requestExtraParams;
    public String roomId;
    public Integer rootEnterFromType;
    public final String searchChannel;
    public Map<String, String> searchExtraRequestParams;
    public String searchId;
    public final Integer searchKeywordStrategy;
    public final String searchPromotionParams;
    public String searchSessionId;
    public final String searchSource;
    public long sectionCursor;
    public final String source;
    public final String sugCreatorId;
    public final String sugQueryState;
    public final String sugShopId;
    public final String sugTagText;
    public final String sugType;
    public String trafficDiversionInfo;
    public final String trafficSourceList;
    public final Integer useNewFilterArch;
    public String userRtActs;
    public String userActions = "";
    public String searchContext = "";

    public final C674800QdS copy(String str, String str2, String str3, int i, int i2, String str4, String str5, long j, int i3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i4, Integer num, String str17, String str18, String str19, Long l, Integer num2, Integer num3, Integer num4, Integer num5, String str20, String str21, Integer num6, String str22, String str23) {
        return new C674800QdS(str, str2, str3, i, i2, str4, str5, j, i3, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, i4, num, str17, str18, str19, l, num2, num3, num4, num5, str20, str21, num6, str22, str23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674800QdS)) {
            return false;
        }
        C674800QdS c674800QdS = (C674800QdS) obj;
        return Intrinsics.LJFF(this.keyword, c674800QdS.keyword) && Intrinsics.LJFF(this.searchSource, c674800QdS.searchSource) && Intrinsics.LJFF(this.source, c674800QdS.source) && this.hotSearch == c674800QdS.hotSearch && this.correctType == c674800QdS.correctType && Intrinsics.LJFF(this.searchId, c674800QdS.searchId) && Intrinsics.LJFF(this.lastSearchId, c674800QdS.lastSearchId) && this.cursor == c674800QdS.cursor && this.count == c674800QdS.count && Intrinsics.LJFF(this.enterFrom, c674800QdS.enterFrom) && Intrinsics.LJFF(this.searchChannel, c674800QdS.searchChannel) && Intrinsics.LJFF(this.sugTagText, c674800QdS.sugTagText) && Intrinsics.LJFF(this.sugType, c674800QdS.sugType) && Intrinsics.LJFF(this.sugQueryState, c674800QdS.sugQueryState) && Intrinsics.LJFF(this.sugCreatorId, c674800QdS.sugCreatorId) && Intrinsics.LJFF(this.attachProducts, c674800QdS.attachProducts) && Intrinsics.LJFF(this.mockAttachProducts, c674800QdS.mockAttachProducts) && Intrinsics.LJFF(this.trafficSourceList, c674800QdS.trafficSourceList) && Intrinsics.LJFF(this.sugShopId, c674800QdS.sugShopId) && Intrinsics.LJFF(this.chunkSizeList, c674800QdS.chunkSizeList) && this.isFilterSearch == c674800QdS.isFilterSearch && Intrinsics.LJFF(this.pageType, c674800QdS.pageType) && Intrinsics.LJFF(this.apiVersion, c674800QdS.apiVersion) && Intrinsics.LJFF(this.filtersData, c674800QdS.filtersData) && Intrinsics.LJFF(this.lastSearchPidList, c674800QdS.lastSearchPidList) && Intrinsics.LJFF(this.endToEndSearchSessionId, c674800QdS.endToEndSearchSessionId) && Intrinsics.LJFF(this.useNewFilterArch, c674800QdS.useNewFilterArch) && Intrinsics.LJFF(this.isNonPersonalizedSearch, c674800QdS.isNonPersonalizedSearch) && Intrinsics.LJFF(this.dmaConsentStatus, c674800QdS.dmaConsentStatus) && Intrinsics.LJFF(this.edmConsentStatus, c674800QdS.edmConsentStatus) && Intrinsics.LJFF(this.newUserExtraInfo, c674800QdS.newUserExtraInfo) && Intrinsics.LJFF(this.nineSearchProductId, c674800QdS.nineSearchProductId) && Intrinsics.LJFF(this.searchKeywordStrategy, c674800QdS.searchKeywordStrategy) && Intrinsics.LJFF(this.enterFromSecond, c674800QdS.enterFromSecond) && Intrinsics.LJFF(this.searchPromotionParams, c674800QdS.searchPromotionParams);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.keyword.hashCode() * 31) + this.searchSource.hashCode()) * 31) + this.source.hashCode()) * 31) + this.hotSearch) * 31) + this.correctType) * 31) + this.searchId.hashCode()) * 31;
        String str = this.lastSearchId;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.cursor)) * 31) + this.count) * 31) + this.enterFrom.hashCode()) * 31;
        String str2 = this.searchChannel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sugTagText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sugType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sugQueryState;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sugCreatorId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.attachProducts;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mockAttachProducts;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.trafficSourceList;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sugShopId;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.chunkSizeList;
        int iHashCode12 = (((iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.isFilterSearch) * 31;
        Integer num = this.pageType;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str12 = this.apiVersion;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.filtersData;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.lastSearchPidList;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l = this.endToEndSearchSessionId;
        int iHashCode17 = (iHashCode16 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.useNewFilterArch;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.isNonPersonalizedSearch;
        int iHashCode19 = (iHashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.dmaConsentStatus;
        int iHashCode20 = (iHashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.edmConsentStatus;
        int iHashCode21 = (iHashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str15 = this.newUserExtraInfo;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.nineSearchProductId;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num6 = this.searchKeywordStrategy;
        int iHashCode24 = (iHashCode23 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str17 = this.enterFromSecond;
        int iHashCode25 = (iHashCode24 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.searchPromotionParams;
        return iHashCode25 + (str18 != null ? str18.hashCode() : 0);
    }

    public final int isFilterSearch() {
        return this.isFilterSearch;
    }

    public final Integer isLowDevice() {
        return this.isLowDevice;
    }

    public final Integer isNonPersonalizedSearch() {
        return this.isNonPersonalizedSearch;
    }

    public final Integer isWeakNetwork() {
        return this.isWeakNetwork;
    }

    public final boolean isSame(C674800QdS c674800QdS) {
        return Intrinsics.LJFF(this, c674800QdS);
    }

    public final void setApiParamsInCurrentSearch(Map<String, String> map) {
        this.apiParamsInCurrentSearch = map;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setBcmChain(String str) {
        this.bcmChain = str;
    }

    public final void setClientRequestId(String str) {
        this.clientRequestId = str;
    }

    public final void setCmplEnc(String str) {
        this.cmplEnc = str;
    }

    public final void setEcSearchSessionId(String str) {
        this.ecSearchSessionId = str;
    }

    public final void setFilterOption(C0PSG c0psg) {
        this.filterOption = c0psg;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLastSearchId(String str) {
        this.lastSearchId = str;
    }

    public final void setLowDevice(Integer num) {
        this.isLowDevice = num;
    }

    public final void setNoNeedPageStyle(Integer num) {
        this.noNeedPageStyle = num;
    }

    public final void setOriginIsMallTab(String str) {
        this.originIsMallTab = str;
    }

    public final void setPassThroughParams(String str) {
        this.passThroughParams = str;
    }

    public final void setRequestExtraParams(Map<String, String> map) {
        this.requestExtraParams = map;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setRootEnterFromType(Integer num) {
        this.rootEnterFromType = num;
    }

    public final void setSearchContext(String str) {
        this.searchContext = str;
    }

    public final void setSearchExtraRequestParams(Map<String, String> map) {
        this.searchExtraRequestParams = map;
    }

    public final void setSearchId(String str) {
        this.searchId = str;
    }

    public final void setSearchSessionId(String str) {
        this.searchSessionId = str;
    }

    public final void setSectionCursor(long j) {
        this.sectionCursor = j;
    }

    public final void setTrafficDiversionInfo(String str) {
        this.trafficDiversionInfo = str;
    }

    public final void setUserActions(String str) {
        this.userActions = str;
    }

    public final void setUserRtActs(String str) {
        this.userRtActs = str;
    }

    public final void setWeakNetwork(Integer num) {
        this.isWeakNetwork = num;
    }

    public C674800QdS(String str, String str2, String str3, int i, int i2, String str4, String str5, long j, int i3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i4, Integer num, String str17, String str18, String str19, Long l, Integer num2, Integer num3, Integer num4, Integer num5, String str20, String str21, Integer num6, String str22, String str23) {
        this.keyword = str;
        this.searchSource = str2;
        this.source = str3;
        this.hotSearch = i;
        this.correctType = i2;
        this.searchId = str4;
        this.lastSearchId = str5;
        this.cursor = j;
        this.count = i3;
        this.enterFrom = str6;
        this.searchChannel = str7;
        this.sugTagText = str8;
        this.sugType = str9;
        this.sugQueryState = str10;
        this.sugCreatorId = str11;
        this.attachProducts = str12;
        this.mockAttachProducts = str13;
        this.trafficSourceList = str14;
        this.sugShopId = str15;
        this.chunkSizeList = str16;
        this.isFilterSearch = i4;
        this.pageType = num;
        this.apiVersion = str17;
        this.filtersData = str18;
        this.lastSearchPidList = str19;
        this.endToEndSearchSessionId = l;
        this.useNewFilterArch = num2;
        this.isNonPersonalizedSearch = num3;
        this.dmaConsentStatus = num4;
        this.edmConsentStatus = num5;
        this.newUserExtraInfo = str20;
        this.nineSearchProductId = str21;
        this.searchKeywordStrategy = num6;
        this.enterFromSecond = str22;
        this.searchPromotionParams = str23;
    }
}
