package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1AvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195051AvX {
    public static final LinkedHashMap<String, List<String>> LIZ = C2097608Jq.LJII(new Pair("default.allowed.jsb", C1697810uHb.LJIIJJI("minis.sendLog", "minis.startEntranceMission", "minis.getEntranceMissionReward", "minis.addShortcut", "minis.getShortcutMissionReward", "sendLog", "x.subscribeEvent", "minis.enableCapture", "minis.disableCapture", "minis.pay", "minis.hideRibbon", "minis.showSurfaceCoupon", "minis.report", "minis.share", "minis.shareAppMessage", "minis.recharge", "minis.checkBalance", "minis.openBalance", "minis.prefetch", "x.reportAppLog", "minis.subscriptionChange", "minis.subscriptionCreate", "minis.subscriptionReactive", "minis.publishEvent", "minis.setNavigationBarColor", "minis.userStorageAPI", "minis.clearStorage", "minis.getStorageItem", "minis.removeStorageItem", "minis.setStorageItem", "minis.createRewardedVideoAd", "minis.rewardedVideoAdShow", "minis.createInterstitialAd", "minis.interstitialAdShow", "minis.rewardClaimed", "minis.shareCurrentContentToTikTokStory", "minis.console", "minis.updateNotificationSubscriptionState", "minis.getPlayerConfig", "minis.getDramaInfo", "sendLogV3", "minis.reportImageUpload", "minis.reportSubmitFinish", "minis.reportEventParamsUpload")), new Pair("user.info.basic", Collections.singletonList("jumpOpenAuthPage")));

    public static List LIZ(List list) {
        List<String> list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            LinkedHashMap<String, List<String>> linkedHashMap = LIZ;
            if (linkedHashMap.containsKey(obj) && (list2 = linkedHashMap.get(obj)) != null) {
                arrayList.addAll(list2);
            }
        }
        return arrayList;
    }
}
