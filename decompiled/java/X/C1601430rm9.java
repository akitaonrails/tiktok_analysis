package X;

import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.EpiDecision;
import com.ss.android.ugc.aweme.feed.model.live.FeedStrategyPlatformFeatures;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0rm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601430rm9 {
    public static void LIZIZ(Map map, Map map2, Map map3) {
        ILiveOuterService iLiveOuterService;
        ILiveOuterService iLiveOuterService2;
        ILiveOuterService iLiveOuterService3;
        if (!((HashMap) map).isEmpty() && (iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null) {
            iLiveOuterService3.H4(map);
        }
        if (!((HashMap) map2).isEmpty() && (iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null) {
            iLiveOuterService2.L4(map2);
        }
        if ((!((HashMap) map3).isEmpty()) && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null) {
            iLiveOuterService.e5(map3);
        }
    }

    public static void LIZ(String str, long j, LiveRoomStruct liveRoomStruct, Aweme aweme, Map map, Map map2, Map map3) {
        Map<String, String> map4;
        ICommercializeLiveService iCommercializeLiveService;
        if (liveRoomStruct == null || aweme == null) {
            return;
        }
        User user = liveRoomStruct.owner;
        User user2 = new User();
        user2.setUid(user.getUid());
        user2.setSecUid(user.getSecUid());
        user2.setNickname(user.getNickname());
        user2.setShortId(user.getShortId());
        user2.setUniqueId(user.getUniqueId());
        user2.setSignature(user.getSignature());
        user2.setAvatarThumb(user.getAvatarThumb());
        user2.setAvatarLarger(user.getAvatarLarger());
        user2.setAvatarMedium(user.getAvatarMedium());
        RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
        if (roomFeedCellStruct != null) {
            roomFeedCellStruct.room = liveRoomStruct;
        }
        aweme.setRoomFeedCellStruct(roomFeedCellStruct);
        aweme.setAuthor(user2);
        if (aweme.isAd() && aweme.getAwemeRawAd() != null && (iCommercializeLiveService = (ICommercializeLiveService) PluggableExtentionKt.pluggableSpi$default(ICommercializeLiveService.class, false, false, false, 14, null)) != null) {
            iCommercializeLiveService.LIZJ(aweme);
        }
        if (C1594720rbK.LIZ() > 0) {
            liveRoomStruct.liveNoDeduplicationClient = true;
        }
        C1594670rbF.LIZJ(EnumC1594650rbD.CLIENT_ACCEPT, aweme, j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(liveRoomStruct.id);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (aweme.getLiveExtraInfoStruct() != null) {
            ((HashMap) map).put(strLIZIZ, aweme.getLiveExtraInfoStruct());
        }
        EpiDecision epiDecision = liveRoomStruct.epiDecision;
        if (epiDecision != null && (map4 = epiDecision.dataV2) != null) {
            ((HashMap) map2).put(strLIZIZ, map4);
        }
        FeedStrategyPlatformFeatures feedStrategyPlatformFeatures = liveRoomStruct.strategyPlatformFeatures;
        if (feedStrategyPlatformFeatures != null) {
            ((HashMap) map3).put(strLIZIZ, feedStrategyPlatformFeatures);
        }
    }
}
