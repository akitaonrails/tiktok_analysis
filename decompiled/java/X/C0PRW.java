package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PRW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C0PRW implements Serializable {
    public String enterMethod;
    public List<FeedbackContents> feedbackSurvey;
    public final HashMap<String, Object> feelGoodToken;
    public String feelgoodSurveyDataStr;
    public Boolean hasShownResearchFilter;
    public boolean isFragmentVisible;
    public boolean isRecentRequestSearchSourceUnknown;
    public String searchId;
    public String searchKeyword;
    public String searchPosition;
    public final Map<String, String> searchTrackMap;
    public int tabIndex;

    public C0PRW() {
        this(0, null, null, null, null, null, null, null, false, null, false, null, 4095, null);
    }

    public final C0PRW copy(int i, String str, String str2, String str3, Map<String, String> map, List<FeedbackContents> list, HashMap<String, Object> map2, Boolean bool, boolean z, String str4, boolean z2, String str5) {
        return new C0PRW(i, str, str2, str3, map, list, map2, bool, z, str4, z2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PRW)) {
            return false;
        }
        C0PRW c0prw = (C0PRW) obj;
        return this.tabIndex == c0prw.tabIndex && Intrinsics.LJFF(this.searchPosition, c0prw.searchPosition) && Intrinsics.LJFF(this.searchId, c0prw.searchId) && Intrinsics.LJFF(this.searchKeyword, c0prw.searchKeyword) && Intrinsics.LJFF(this.searchTrackMap, c0prw.searchTrackMap) && Intrinsics.LJFF(this.feedbackSurvey, c0prw.feedbackSurvey) && Intrinsics.LJFF(this.feelGoodToken, c0prw.feelGoodToken) && Intrinsics.LJFF(this.hasShownResearchFilter, c0prw.hasShownResearchFilter) && this.isRecentRequestSearchSourceUnknown == c0prw.isRecentRequestSearchSourceUnknown && Intrinsics.LJFF(this.feelgoodSurveyDataStr, c0prw.feelgoodSurveyDataStr) && this.isFragmentVisible == c0prw.isFragmentVisible && Intrinsics.LJFF(this.enterMethod, c0prw.enterMethod);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.tabIndex * 31) + this.searchPosition.hashCode()) * 31) + this.searchId.hashCode()) * 31) + this.searchKeyword.hashCode()) * 31) + this.searchTrackMap.hashCode()) * 31;
        List<FeedbackContents> list = this.feedbackSurvey;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.feelGoodToken.hashCode()) * 31;
        Boolean bool = this.hasShownResearchFilter;
        return ((((((((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isRecentRequestSearchSourceUnknown)) * 31) + this.feelgoodSurveyDataStr.hashCode()) * 31) + C786410Ut5.Z2(this.isFragmentVisible)) * 31) + this.enterMethod.hashCode();
    }

    public String toString() {
        return "SearchFragmentData(tabIndex=" + this.tabIndex + ", searchPosition=" + this.searchPosition + ", searchId=" + this.searchId + ", searchKeyword=" + this.searchKeyword + ", searchTrackMap=" + this.searchTrackMap + ", feedbackSurvey=" + this.feedbackSurvey + ", feelGoodToken=" + this.feelGoodToken + ", hasShownResearchFilter=" + this.hasShownResearchFilter + ", isRecentRequestSearchSourceUnknown=" + this.isRecentRequestSearchSourceUnknown + ", feelgoodSurveyDataStr=" + this.feelgoodSurveyDataStr + ", isFragmentVisible=" + this.isFragmentVisible + ", enterMethod=" + this.enterMethod + ')';
    }

    public final boolean isFragmentVisible() {
        return this.isFragmentVisible;
    }

    public final boolean isRecentRequestSearchSourceUnknown() {
        return this.isRecentRequestSearchSourceUnknown;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFeedbackSurvey(List<FeedbackContents> list) {
        this.feedbackSurvey = list;
    }

    public final void setFeelgoodSurveyDataStr(String str) {
        this.feelgoodSurveyDataStr = str;
    }

    public final void setFragmentVisible(boolean z) {
        this.isFragmentVisible = z;
    }

    public final void setHasShownResearchFilter(Boolean bool) {
        this.hasShownResearchFilter = bool;
    }

    public final void setRecentRequestSearchSourceUnknown(boolean z) {
        this.isRecentRequestSearchSourceUnknown = z;
    }

    public final void setSearchId(String str) {
        this.searchId = str;
    }

    public final void setSearchKeyword(String str) {
        this.searchKeyword = str;
    }

    public final void setSearchPosition(String str) {
        this.searchPosition = str;
    }

    public final void setTabIndex(int i) {
        this.tabIndex = i;
    }

    public final void update(C0PRW c0prw) {
        this.tabIndex = c0prw.tabIndex;
        this.searchPosition = c0prw.searchPosition;
        this.searchId = c0prw.searchId;
        this.searchKeyword = c0prw.searchKeyword;
        this.searchTrackMap.putAll(c0prw.searchTrackMap);
        this.feedbackSurvey = c0prw.feedbackSurvey;
        this.feelGoodToken.putAll(c0prw.feelGoodToken);
        this.hasShownResearchFilter = c0prw.hasShownResearchFilter;
        this.isRecentRequestSearchSourceUnknown = c0prw.isRecentRequestSearchSourceUnknown;
        this.feelgoodSurveyDataStr = c0prw.feelgoodSurveyDataStr;
        this.isFragmentVisible = c0prw.isFragmentVisible;
        this.enterMethod = c0prw.enterMethod;
    }

    public C0PRW(int i, String str, String str2, String str3, Map<String, String> map, List<FeedbackContents> list, HashMap<String, Object> map2, Boolean bool, boolean z, String str4, boolean z2, String str5) {
        this.tabIndex = i;
        this.searchPosition = str;
        this.searchId = str2;
        this.searchKeyword = str3;
        this.searchTrackMap = map;
        this.feedbackSurvey = list;
        this.feelGoodToken = map2;
        this.hasShownResearchFilter = bool;
        this.isRecentRequestSearchSourceUnknown = z;
        this.feelgoodSurveyDataStr = str4;
        this.isFragmentVisible = z2;
        this.enterMethod = str5;
    }

    public C0PRW(int i, String str, String str2, String str3, Map map, List list, HashMap map2, Boolean bool, boolean z, String str4, boolean z2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str6 = str4;
        boolean z3 = z;
        Boolean bool2 = bool;
        HashMap map3 = map2;
        List list2 = list;
        Map map4 = map;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        int i3 = (i2 & 1) != 0 ? 0 : i;
        str9 = (i2 & 2) != 0 ? "" : str9;
        str8 = (i2 & 4) != 0 ? "" : str8;
        str7 = (i2 & 8) != 0 ? "" : str7;
        if ((i2 & 16) != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("tns_ban_type", "normal");
            linkedHashMap.put("use_scenario", "normal");
            map4 = linkedHashMap;
        }
        this(i3, str9, str8, str7, map4, (i2 & 32) != 0 ? C13BV.INSTANCE : list2, (i2 & 64) != 0 ? new HashMap() : map3, (i2 & 128) != 0 ? Boolean.FALSE : bool2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) == 0 ? z2 : false, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str5 : "");
    }
}
