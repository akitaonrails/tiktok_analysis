package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabApiConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabLynxEventConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabPlayConfig;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646870PYv implements Serializable {
    public static final int $stable = 8;
    public final SearchTabApiConfig apiConfig;
    public final String btm;
    public final int curTabIndex;
    public final boolean enableSearchFilter;
    public final boolean isNativeFirstRequest;
    public final int loadMoreCount;
    public final List<SearchTabLynxEventConfig> lynxEventDelegates;
    public final boolean needLocationParams;
    public final String pageSchema;
    public final String searchChannel;
    public final SearchTabPlayConfig searchTabPlayConfig;
    public final String searchType;
    public final boolean shouldShowCenterLoadingView;

    public C646870PYv() {
        this(null, 0, null, null, false, false, false, false, 0, null, null, null, null, 8191, null);
    }

    public final C646870PYv copy(String str, int i, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i2, SearchTabPlayConfig searchTabPlayConfig, String str4, SearchTabApiConfig searchTabApiConfig, List<SearchTabLynxEventConfig> list) {
        return new C646870PYv(str, i, str2, str3, z, z2, z3, z4, i2, searchTabPlayConfig, str4, searchTabApiConfig, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C646870PYv)) {
            return false;
        }
        C646870PYv c646870PYv = (C646870PYv) obj;
        return Intrinsics.LJFF(this.searchType, c646870PYv.searchType) && this.curTabIndex == c646870PYv.curTabIndex && Intrinsics.LJFF(this.pageSchema, c646870PYv.pageSchema) && Intrinsics.LJFF(this.btm, c646870PYv.btm) && this.enableSearchFilter == c646870PYv.enableSearchFilter && this.isNativeFirstRequest == c646870PYv.isNativeFirstRequest && this.shouldShowCenterLoadingView == c646870PYv.shouldShowCenterLoadingView && this.needLocationParams == c646870PYv.needLocationParams && this.loadMoreCount == c646870PYv.loadMoreCount && Intrinsics.LJFF(this.searchTabPlayConfig, c646870PYv.searchTabPlayConfig) && Intrinsics.LJFF(this.searchChannel, c646870PYv.searchChannel) && Intrinsics.LJFF(this.apiConfig, c646870PYv.apiConfig) && Intrinsics.LJFF(this.lynxEventDelegates, c646870PYv.lynxEventDelegates);
    }

    public String toString() {
        return "SearchTabItem(searchType=" + this.searchType + ", curTabIndex=" + this.curTabIndex + ", pageSchema=" + this.pageSchema + ", btm=" + this.btm + ", enableSearchFilter=" + this.enableSearchFilter + ", isNativeFirstRequest=" + this.isNativeFirstRequest + ", shouldShowCenterLoadingView=" + this.shouldShowCenterLoadingView + ", needLocationParams=" + this.needLocationParams + ", loadMoreCount=" + this.loadMoreCount + ", searchTabPlayConfig=" + this.searchTabPlayConfig + ", searchChannel=" + this.searchChannel + ", apiConfig=" + this.apiConfig + ", lynxEventDelegates=" + this.lynxEventDelegates + ')';
    }

    public final boolean isNativeFirstRequest() {
        return this.isNativeFirstRequest;
    }

    public C646870PYv(String str, int i, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i2, SearchTabPlayConfig searchTabPlayConfig, String str4, SearchTabApiConfig searchTabApiConfig, List<SearchTabLynxEventConfig> list) {
        this.searchType = str;
        this.curTabIndex = i;
        this.pageSchema = str2;
        this.btm = str3;
        this.enableSearchFilter = z;
        this.isNativeFirstRequest = z2;
        this.shouldShowCenterLoadingView = z3;
        this.needLocationParams = z4;
        this.loadMoreCount = i2;
        this.searchTabPlayConfig = searchTabPlayConfig;
        this.searchChannel = str4;
        this.apiConfig = searchTabApiConfig;
        this.lynxEventDelegates = list;
    }

    public C646870PYv(String str, int i, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i2, SearchTabPlayConfig searchTabPlayConfig, String str4, SearchTabApiConfig searchTabApiConfig, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? true : z2, (i3 & 64) == 0 ? z3 : true, (i3 & 128) == 0 ? z4 : false, (i3 & 256) != 0 ? 20 : i2, (i3 & 512) != 0 ? new SearchTabPlayConfig(false, false, false, false) : searchTabPlayConfig, (i3 & 1024) == 0 ? str4 : "", (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new SearchTabApiConfig(null, null, null, null) : searchTabApiConfig, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list);
    }
}
