package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.TabOrder;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0QER, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QER implements Serializable {
    public static final C667050QEl Companion = new C667050QEl();
    public static final long serialVersionUID = 42;
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public EnumC669620QOi LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public Word LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public Map<String, Object> LLL;
    public String LLLF;
    public String LLLFF;
    public String LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public String LLLIIIIL;
    public String LLLIIIL;
    public String LLLIIL;
    public Long LLLIILIL;
    public Integer LLLIL;
    public String LLLILZ;
    public Integer LLLILZJ;
    public String LLLILZLLLI;
    public String LLLIZZ;
    public String LLLJ;
    public String LLLJIL;
    public ECSearchEntranceData LLLJL;
    public boolean LLLL;
    public Map<String, Object> LLLLII;
    public Map<String, Object> LLLLIIIILLL;
    public Map<String, Object> LLLLIIL;
    public String LLLLIILL;
    public Integer LLLLIILLL;
    public Integer LLLLIL;
    public String LLLLILI;
    public boolean LLLLJ;
    public String LLLLJI;
    public List<TabOrder> LLLLL;
    public boolean LLJJL = true;
    public boolean LLJJLIIIJLLLLLLLZ = true;
    public String LLLII = "";
    public int LLLIIII = -100;

    @InterfaceC1294060jmO
    public static /* synthetic */ void getEcExtraLogParams$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getHalfSearchForMallParams$annotations() {
    }

    public static final C0QEQ newBuilder() {
        return Companion.newBuilder();
    }

    public final void restEnterSearchPosition() {
        Map<String, Object> map = this.LLL;
        if (map == null || !map.containsKey("search_position")) {
            return;
        }
        this.LLL.remove("search_position");
    }

    public final String getAuthorId() {
        return this.LLJJI;
    }

    public final String getBlankPageId() {
        return this.LLIZ;
    }

    public final String getBlankPageLynxQuery() {
        return this.LLILZIL;
    }

    public final String getDisplayHint() {
        return this.LLJJJIL;
    }

    public final Integer getDmaConsentStatus() {
        return this.LLLLIILLL;
    }

    public final Map<String, Object> getEcExtraLogParams() {
        return this.LLLLII;
    }

    public final Integer getEcNextRootEnterFromType() {
        return this.LLLIL;
    }

    public final Map<String, Object> getEcSearchCommonParams() {
        return this.LLLLIIL;
    }

    public final ECSearchEntranceData getEcSearchEntranceData() {
        return this.LLLJL;
    }

    public final int getEcSearchEntranceValue() {
        return this.LLLIIII;
    }

    public final String getEcSearchSessionId() {
        return this.LLLIIIL;
    }

    public final String getEcUserActions() {
        return this.LLLIZZ;
    }

    public final Integer getEdmConsentStatus() {
        return this.LLLLIL;
    }

    public final Long getEndToEndSession() {
        return this.LLLIILIL;
    }

    public final String getEnterFromMusicId() {
        return this.LLLLILI;
    }

    public final String getEnterSearchFrom() {
        return this.LLILLJJLI;
    }

    public final String getEnterSearchFromSub() {
        return this.LLILLL;
    }

    public final String getEnterType() {
        return this.LLJI;
    }

    public final String getGidRequest() {
        return this.LLJJIJI;
    }

    public final String getGroupId() {
        return this.LLJJ;
    }

    public final Map<String, Object> getHalfSearchForMallParams() {
        return this.LLLLIIIILLL;
    }

    public final boolean getHideTabs() {
        return this.LLJJIJIL;
    }

    public final Word getInboxWord() {
        return this.LLJL;
    }

    public final String getInitSugWord() {
        return this.LLLILZ;
    }

    public final String getInterventionGuideInfoParams() {
        return this.LLIZLLLIL;
    }

    public final boolean getKeepTabPosition() {
        return this.LLJJIJIIJIL;
    }

    public final String getLastSearchPosition() {
        return this.LL;
    }

    public final boolean getLeftIcon() {
        return this.LLLFZ;
    }

    public final Map<String, Object> getLogExtraMap() {
        return this.LLL;
    }

    public final String getLsAttributionParams() {
        return this.LLILZLL;
    }

    public final String getMallExtraInfo() {
        return this.LLLLIILL;
    }

    public final boolean getNeedHideKeyboard() {
        return this.LLJ;
    }

    public final boolean getNotShowPhotoSearchIcon() {
        return this.LLLI;
    }

    public final Integer getOrderSearchRegion() {
        return this.LLLILZJ;
    }

    public final String getOriginIsMallTab() {
        return this.LLLJ;
    }

    public final String getPageName() {
        return this.LLJILLL;
    }

    public final String getPreloadSuggestWordsScene() {
        return this.LLLFFI;
    }

    public final String getPreviousPage() {
        return this.LLJILJIL;
    }

    public final String getRefreshTime() {
        return this.LLLILZLLLI;
    }

    public final String getRoomId() {
        return this.LLJJIII;
    }

    public final String getRouteUri() {
        return this.LLLJIL;
    }

    public final String getSearchAdExtraContext() {
        return this.LLLLJI;
    }

    public final String getSearchHint() {
        return this.LLJJJJ;
    }

    public final String getSearchHintPenetrateInfo() {
        return this.LLJJJJJIL;
    }

    public final String getSearchHintWordId() {
        return this.LLJJJJLIIL;
    }

    public final String getSearchSessionId() {
        return this.LLLIIL;
    }

    public final boolean getShouldShowScanView() {
        return this.LLJJL;
    }

    public final boolean getShouldShowSug() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final String getSourcePage() {
        return this.LLJILJILJ;
    }

    public final String getSrcAnchorProductId() {
        return this.LLLFF;
    }

    public final String getSrcMaterialId() {
        return this.LLLF;
    }

    public final List<TabOrder> getTabOrderList() {
        return this.LLLLL;
    }

    public final EnumC669620QOi getTargetTab() {
        return this.LLJJJ;
    }

    public final String getTrafficSourceList() {
        return this.LLLIIIIL;
    }

    public final boolean getUseSAF() {
        return this.LLJLL;
    }

    public final boolean getUseSAFPreload() {
        return this.LLJLLL;
    }

    public final boolean getUseSAFReuse() {
        return this.LLJLLIL;
    }

    public final boolean getUseSingleStack() {
        return this.LLJLILLLLZIIL;
    }

    public final boolean isFromPublish() {
        return this.LLJZIJLIL;
    }

    public final String isFromSensitiveWords() {
        return this.LLILZ;
    }

    public final boolean isFromShopVideo() {
        return this.LLLL;
    }

    public final String isFromVideoFix() {
        return this.LLLII;
    }

    public final boolean isLandingBeforeSearchPage() {
        return this.LLJZ;
    }

    public final boolean isSearchSevenScreen() {
        return this.LLJIJIL;
    }

    public final boolean isSetHintBySugWord() {
        return this.LLJLIL;
    }

    public final boolean isStarHub() {
        return this.LLLLJ;
    }

    @InterfaceC1294060jmO
    public final Object obtainEcLogData(String str) {
        Map<String, Object> map = this.LLLLII;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final Object obtainLogData(String str) {
        Map<String, Object> map = this.LLL;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final void setAuthorId(String str) {
        this.LLJJI = str;
    }

    public final void setBlankPageId(String str) {
        this.LLIZ = str;
    }

    public final void setBlankPageLynxQuery(String str) {
        this.LLILZIL = str;
    }

    public final void setDisplayHint(String str) {
        this.LLJJJIL = str;
    }

    public final void setDmaConsentStatus(Integer num) {
        this.LLLLIILLL = num;
    }

    public final void setEcExtraLogParams(Map<String, Object> map) {
        this.LLLLII = map;
    }

    public final void setEcNextRootEnterFromType(Integer num) {
        this.LLLIL = num;
    }

    public final void setEcSearchCommonParams(Map<String, Object> map) {
        this.LLLLIIL = map;
    }

    public final void setEcSearchEntranceData(ECSearchEntranceData eCSearchEntranceData) {
        this.LLLJL = eCSearchEntranceData;
    }

    public final void setEcSearchEntranceValue(int i) {
        this.LLLIIII = i;
    }

    public final void setEcSearchSessionId(String str) {
        this.LLLIIIL = str;
    }

    public final void setEcUserActions(String str) {
        this.LLLIZZ = str;
    }

    public final void setEdmConsentStatus(Integer num) {
        this.LLLLIL = num;
    }

    public final void setEndToEndSession(Long l) {
        this.LLLIILIL = l;
    }

    public final void setEnterFromMusicId(String str) {
        this.LLLLILI = str;
    }

    public final void setEnterSearchFrom(String str) {
        this.LLILLJJLI = str;
    }

    public final void setEnterSearchFromSub(String str) {
        this.LLILLL = str;
    }

    public final void setEnterType(String str) {
        this.LLJI = str;
    }

    public final void setFromPublish(boolean z) {
        this.LLJZIJLIL = z;
    }

    public final void setFromSensitiveWords(String str) {
        this.LLILZ = str;
    }

    public final void setFromShopVideo(boolean z) {
        this.LLLL = z;
    }

    public final void setFromVideoFix(String str) {
        this.LLLII = str;
    }

    public final void setGidRequest(String str) {
        this.LLJJIJI = str;
    }

    public final void setGroupId(String str) {
        this.LLJJ = str;
        this.LLJJIJI = str;
    }

    public final void setHalfSearchForMallParams(Map<String, Object> map) {
        this.LLLLIIIILLL = map;
    }

    public final void setHideTabs(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setInboxWord(Word word) {
        this.LLJL = word;
    }

    public final void setInitSugWord(String str) {
        this.LLLILZ = str;
    }

    public final void setInterventionGuideInfoParams(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setKeepTabPosition(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setLandingBeforeSearchPage(boolean z) {
        this.LLJZ = z;
    }

    public final void setLastSearchPosition(String str) {
        this.LL = str;
    }

    public final void setLeftIcon(boolean z) {
        this.LLLFZ = z;
    }

    public final void setLogExtraMap(Map<String, Object> map) {
        this.LLL = map;
    }

    public final void setLsAttributionParams(String str) {
        this.LLILZLL = str;
    }

    public final void setMallExtraInfo(String str) {
        this.LLLLIILL = str;
    }

    public final void setNeedHideKeyboard(boolean z) {
        this.LLJ = z;
    }

    public final void setNotShowPhotoSearchIcon(boolean z) {
        this.LLLI = z;
    }

    public final void setOrderSearchRegion(Integer num) {
        this.LLLILZJ = num;
    }

    public final void setOriginIsMallTab(String str) {
        this.LLLJ = str;
    }

    public final void setPageName(String str) {
        this.LLJILLL = str;
    }

    public final void setPreloadSuggestWordsScene(String str) {
        this.LLLFFI = str;
    }

    public final void setPreviousPage(String str) {
        this.LLJILJIL = str;
    }

    public final void setRefreshTime(String str) {
        this.LLLILZLLLI = str;
    }

    public final void setRoomId(String str) {
        this.LLJJIII = str;
    }

    public final void setRouteUri(String str) {
        this.LLLJIL = str;
    }

    public final void setSearchAdExtraContext(String str) {
        this.LLLLJI = str;
    }

    public final void setSearchHint(String str) {
        this.LLJJJJ = str;
    }

    public final void setSearchHintPenetrateInfo(String str) {
        this.LLJJJJJIL = str;
    }

    public final void setSearchHintWordId(String str) {
        this.LLJJJJLIIL = str;
    }

    public final void setSearchSessionId(String str) {
        this.LLLIIL = str;
    }

    public final void setSearchSevenScreen(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setSetHintBySugWord(boolean z) {
        this.LLJLIL = z;
    }

    public final void setShouldShowScanView(boolean z) {
        this.LLJJL = z;
    }

    public final void setShouldShowSug(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void setSourcePage(String str) {
        this.LLJILJILJ = str;
    }

    public final void setSrcAnchorProductId(String str) {
        this.LLLFF = str;
    }

    public final void setSrcMaterialId(String str) {
        this.LLLF = str;
    }

    public final void setStarHub(boolean z) {
        this.LLLLJ = z;
    }

    public final void setTabOrderList(List<TabOrder> list) {
        this.LLLLL = list;
    }

    public final void setTargetTab(EnumC669620QOi enumC669620QOi) {
        this.LLJJJ = enumC669620QOi;
    }

    public final void setTrafficSourceList(String str) {
        this.LLLIIIIL = str;
    }

    public final void setUseSAF(boolean z) {
        this.LLJLL = z;
    }

    public final void setUseSAFPreload(boolean z) {
        this.LLJLLL = z;
    }

    public final void setUseSAFReuse(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setUseSingleStack(boolean z) {
        this.LLJLILLLLZIIL = z;
    }
}
