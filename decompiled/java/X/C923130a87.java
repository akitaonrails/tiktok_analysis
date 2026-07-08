package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0a87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923130a87 {
    public static final ConcurrentHashMap<Long, Integer> LIZ = new ConcurrentHashMap<>();

    public static String LIZ(MultiGuestDataHolder multiGuestDataHolder) {
        if (LIZJ(multiGuestDataHolder) <= 0) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }

    public static long LIZJ(MultiGuestDataHolder multiGuestDataHolder) {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) != null) {
            return multiLiveAnchorPanelSettingsLIZIZ.applierSortGiftScoreThreshold;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) != null) {
            return multiLiveUserApplyPermission.applierSortGiftScoreThreshold;
        }
        return 0L;
    }

    public static String LIZIZ(MultiGuestDataHolder multiGuestDataHolder, long j) {
        long jLIZJ = LIZJ(multiGuestDataHolder);
        if (jLIZJ > 0) {
            if (jLIZJ > j) {
                return "under_threshold";
            }
            if (1 <= jLIZJ && jLIZJ <= j) {
                return "meet_threshold";
            }
            return "close_mode";
        }
        return "close_mode";
    }
}
