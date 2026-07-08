package X;

import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridJsbThreadConfigMapSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridJsbThreadDispatchOptimizeSetting;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ESg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2281601ESg extends C1545130qJL {
    public static final C2281601ESg LIZ = new C2281601ESg();
    public static final Map<String, EnumC1544180qHo> LIZIZ;

    static {
        EnumC1544180qHo enumC1544180qHo = EnumC1544180qHo.CURRENT_THREAD;
        EnumC1544180qHo enumC1544180qHo2 = EnumC1544180qHo.MAIN_THREAD;
        LIZIZ = C2097608Jq.LJIIJ(new Pair("getPrefetchResult", enumC1544180qHo), new Pair("x.getStorageItem", enumC1544180qHo), new Pair("x.removeStorageItem", enumC1544180qHo), new Pair("x.setStorageItem", enumC1544180qHo), new Pair("x.getStorageInfo", enumC1544180qHo), new Pair("fetch", enumC1544180qHo), new Pair("getAppInfo", enumC1544180qHo), new Pair("webcast_i18n.lruCacheGet", enumC1544180qHo), new Pair("webcast_i18n.lruCacheSet", enumC1544180qHo), new Pair("x.getSettings", enumC1544180qHo), new Pair("x.request", enumC1544180qHo), new Pair("appInfo", enumC1544180qHo), new Pair("getAppInfo", enumC1544180qHo), new Pair("x.publishEvent", enumC1544180qHo2), new Pair("x.showToast", enumC1544180qHo2), new Pair("toast", enumC1544180qHo2), new Pair("openLive", enumC1544180qHo2), new Pair("chooseImageForSubV2", enumC1544180qHo2), new Pair("close", enumC1544180qHo2), new Pair("chooseImageForGame", enumC1544180qHo2), new Pair("uploadImage", enumC1544180qHo2), new Pair("chooseImage", enumC1544180qHo2), new Pair("chooseImageForSub", enumC1544180qHo2), new Pair("editImageForSub", enumC1544180qHo2), new Pair("dialog", enumC1544180qHo2), new Pair("x.showLoading", enumC1544180qHo2), new Pair("x.hideLoading", enumC1544180qHo2), new Pair("x.configureStatusBar", enumC1544180qHo2), new Pair("x.setContainer", enumC1544180qHo2), new Pair("x.showModel", enumC1544180qHo2), new Pair("x.close", enumC1544180qHo2), new Pair("x.open", enumC1544180qHo2), new Pair("x.scanCode", enumC1544180qHo2), new Pair("downloadFileWithLoadingView", enumC1544180qHo2), new Pair("downloadPartneringGame", enumC1544180qHo2), new Pair("gameOpenSheetSchema", enumC1544180qHo2), new Pair("liveNotification", enumC1544180qHo2), new Pair("liveReplayRemux", enumC1544180qHo2), new Pair("liveReplayTranscode", enumC1544180qHo2), new Pair("login", enumC1544180qHo2), new Pair("openCalendarSelect", enumC1544180qHo2), new Pair("openInvoiceFile", enumC1544180qHo2), new Pair("openPlaybookDetailPanel", enumC1544180qHo2), new Pair("openPlaybookManagerPanel", enumC1544180qHo2), new Pair("openRegionListPage", enumC1544180qHo2), new Pair("openReplayPlayer", enumC1544180qHo2), new Pair("openStoreSubscribePage", enumC1544180qHo2), new Pair("openSubActionSheet", enumC1544180qHo2), new Pair("openVideoClipPage", enumC1544180qHo2), new Pair("openVideoFullScreen", enumC1544180qHo2), new Pair("operateCustomBadgeKeyboard", enumC1544180qHo2), new Pair("partnershipMixRegisterEvent", enumC1544180qHo2), new Pair("postVideo", enumC1544180qHo2), new Pair("shareGameLive", enumC1544180qHo2), new Pair("liveShare", enumC1544180qHo2), new Pair("sharePanel", enumC1544180qHo2), new Pair("shareSubInvitation", enumC1544180qHo2), new Pair("showCPPDialog", enumC1544180qHo2), new Pair("showLivePopup", enumC1544180qHo2), new Pair("showLocationPicker", enumC1544180qHo2), new Pair("startVideoEdit", enumC1544180qHo2), new Pair("streamPlayerControl", enumC1544180qHo2), new Pair("subLinkShare", enumC1544180qHo2), new Pair("updateReplayInfo", enumC1544180qHo2), new Pair("uploadImageForGame", enumC1544180qHo2), new Pair("userAction", enumC1544180qHo2), new Pair("gameJumpToApp", enumC1544180qHo2), new Pair("downloadMediaToSystem", enumC1544180qHo2), new Pair("copyToClipboard", enumC1544180qHo2));
    }

    @Override // X.C1545130qJL
    public final EnumC1544180qHo LIZ(String str) {
        String threadType = LiveHybridJsbThreadConfigMapSetting.INSTANCE.getThreadType(str);
        if (threadType != null) {
            return C1544290qHz.LIZ(threadType);
        }
        if (LiveHybridJsbThreadDispatchOptimizeSetting.INSTANCE.getValue() && (Intrinsics.LJFF(str, "openLive") || Intrinsics.LJFF(str, "x.open"))) {
            EnumC1544180qHo enumC1544180qHo = EnumC1544180qHo.MAIN_THREAD_IMMEDIATE;
            if (enumC1544180qHo != null) {
                return enumC1544180qHo;
            }
        }
        EnumC1544180qHo enumC1544180qHo2 = (EnumC1544180qHo) ((LinkedHashMap) LIZIZ).get(str);
        if (enumC1544180qHo2 != null) {
            return enumC1544180qHo2;
        }
        return EnumC1544180qHo.NORMAL_THREAD;
    }
}
