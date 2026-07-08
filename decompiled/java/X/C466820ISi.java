package X;

import com.bytedance.android.livesdk.livefinishcard.LivePushLiveEndUseSimpleFeed;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFeedLoadMorePreload;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ISi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466820ISi {
    public static void LIZ(EnterRoomConfig enterRoomConfig) {
        String str;
        LiveInnerFeedLoadMorePreload liveInnerFeedLoadMorePreload = LiveInnerFeedLoadMorePreload.INSTANCE;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (!liveInnerFeedLoadMorePreload.isSupport(roomsData.enterFromMerge, roomsData.enterMethod)) {
            return;
        }
        if (LivePushLiveEndUseSimpleFeed.INSTANCE.getValue() && (str = enterRoomConfig.mRoomsData.enterFromMerge) != null && u.LJJIIJZLJL(str, "push", false)) {
            C0IOL c0iolLIZIZ = C466830ISj.LIZIZ(true, enterRoomConfig);
            if (c0iolLIZIZ != null) {
                c0iolLIZIZ.LJJIIZ();
                return;
            }
            return;
        }
        C0IOL c0iolLIZIZ2 = C466830ISj.LIZIZ(true, enterRoomConfig);
        if (c0iolLIZIZ2 == null) {
            return;
        }
        c0iolLIZIZ2.LJJIIJZLJL(0);
    }
}
