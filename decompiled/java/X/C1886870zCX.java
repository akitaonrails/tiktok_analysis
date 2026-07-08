package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import tikcast.api.anchor_data.RealtimeLiveCenterLiveJourneyInfo;
import webcast.data.AnchorGrowRewardInfo;
import webcast.data.LiveJourneyLevelInfo;
import webcast.data.LiveJourneyRewardInfo;
import webcast.data.LiveJourneySeasonInfo;

/* JADX INFO: renamed from: X.0zCX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886870zCX {
    public static final void LIZ(C1AHD c1ahd, String str, int i) {
        RealtimeLiveCenterLiveJourneyInfo realtimeLiveCenterLiveJourneyInfo;
        String string;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI = c1ahd.LJIIJJI();
        if (realtimeLiveCenterDetailDataLJIIJJI != null && (realtimeLiveCenterLiveJourneyInfo = realtimeLiveCenterDetailDataLJIIJJI.liveJourneyInfo) != null) {
            LiveJourneyLevelInfo liveJourneyLevelInfo = realtimeLiveCenterLiveJourneyInfo.currentLevelInfo;
            if (liveJourneyLevelInfo == null || (string = Long.valueOf(liveJourneyLevelInfo.level).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("anchor_level", string);
            if (realtimeLiveCenterLiveJourneyInfo.canClaimLevelList.size() > 0) {
                str2 = "have_rewards";
            } else {
                str2 = "inprogress";
            }
            linkedHashMap.put("show_type", str2);
            linkedHashMap.put("click_position", str);
            LiveJourneySeasonInfo liveJourneySeasonInfo = realtimeLiveCenterLiveJourneyInfo.seasonInfo;
            if (liveJourneySeasonInfo != null && (str3 = liveJourneySeasonInfo.seasonMetaId) != null) {
                linkedHashMap.put("season_id", str3);
            }
        }
        C12OY.LJIILLIIL(C12OY.LIZ, c1ahd.getDataChannel(), C1AH3.LIVE_JOURNEY.getReportName(), "click", null, i, null, linkedHashMap, 40);
    }

    public static final void LIZIZ(C1AHD c1ahd, LiveJourneyLevelInfo liveJourneyLevelInfo, int i, String str) {
        long j;
        long j2;
        Object obj;
        RealtimeLiveCenterLiveJourneyInfo realtimeLiveCenterLiveJourneyInfo;
        LiveJourneySeasonInfo liveJourneySeasonInfo;
        String str2;
        LiveJourneyRewardInfo liveJourneyRewardInfo;
        AnchorGrowRewardInfo anchorGrowRewardInfo;
        LiveJourneyRewardInfo liveJourneyRewardInfo2;
        AnchorGrowRewardInfo anchorGrowRewardInfo2;
        LiveJourneyRewardInfo liveJourneyRewardInfo3;
        AnchorGrowRewardInfo anchorGrowRewardInfo3;
        RealtimeLiveCenterLiveJourneyInfo realtimeLiveCenterLiveJourneyInfo2;
        LiveJourneyLevelInfo liveJourneyLevelInfo2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_livejourney_rewards_module");
        c474500IjALIZ.LJIJJLI(c1ahd.getDataChannel());
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI = c1ahd.LJIIJJI();
        long j3 = 0;
        if (realtimeLiveCenterDetailDataLJIIJJI != null && (realtimeLiveCenterLiveJourneyInfo2 = realtimeLiveCenterDetailDataLJIIJJI.liveJourneyInfo) != null && (liveJourneyLevelInfo2 = realtimeLiveCenterLiveJourneyInfo2.currentLevelInfo) != null) {
            j = liveJourneyLevelInfo2.level;
        } else {
            j = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j), "anchor_level");
        c474500IjALIZ.LJJII(str, "action_type");
        if (liveJourneyLevelInfo != null) {
            j2 = liveJourneyLevelInfo.level;
        } else {
            j2 = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j2), "reward_level");
        int i2 = 0;
        if (liveJourneyLevelInfo == null || (liveJourneyRewardInfo3 = liveJourneyLevelInfo.rewardInfo) == null || (anchorGrowRewardInfo3 = liveJourneyRewardInfo3.rewardInfo) == null || (obj = anchorGrowRewardInfo3.motRewardId) == null) {
            obj = 0;
        }
        c474500IjALIZ.LJJII(obj, "reward_id");
        if (liveJourneyLevelInfo != null && (liveJourneyRewardInfo2 = liveJourneyLevelInfo.rewardInfo) != null && (anchorGrowRewardInfo2 = liveJourneyRewardInfo2.rewardInfo) != null) {
            j3 = anchorGrowRewardInfo2.num;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j3), "reward_num");
        c474500IjALIZ.LJJII(Integer.valueOf(i + 1), "reward_position");
        if (liveJourneyLevelInfo != null && (liveJourneyRewardInfo = liveJourneyLevelInfo.rewardInfo) != null && (anchorGrowRewardInfo = liveJourneyRewardInfo.rewardInfo) != null) {
            i2 = anchorGrowRewardInfo.type;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "reward_type");
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailDataLJIIJJI2 = c1ahd.LJIIJJI();
        if (realtimeLiveCenterDetailDataLJIIJJI2 != null && (realtimeLiveCenterLiveJourneyInfo = realtimeLiveCenterDetailDataLJIIJJI2.liveJourneyInfo) != null && (liveJourneySeasonInfo = realtimeLiveCenterLiveJourneyInfo.seasonInfo) != null && (str2 = liveJourneySeasonInfo.seasonMetaId) != null) {
            c474500IjALIZ.LJJII(str2, "season_id");
        }
        c474500IjALIZ.LIZ();
    }
}
