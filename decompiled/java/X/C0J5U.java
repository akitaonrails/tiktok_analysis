package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0J5U, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J5U {
    public static final C0J5U LIZ = new C0J5U();

    static {
        new ArrayList();
    }

    public static EnterRoomConfig LIZ(InboxLiveNotice inboxLiveNotice, int i, View view) {
        User user;
        User user2;
        String uid;
        SlimRoom slimRoom;
        int i2;
        com.bytedance.android.live.base.model.user.User user3;
        String requestId;
        int i3;
        int followStatus;
        String strValueOf;
        if (inboxLiveNotice == null || (user = inboxLiveNotice.user) == null) {
            return null;
        }
        long j = user.roomId;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        SlimRoom slimRoom2 = inboxLiveNotice.roomInfo;
        if ((slimRoom2 == null || (uid = Long.valueOf(slimRoom2.getOwnerUserId()).toString()) == null) && ((user2 = inboxLiveNotice.user) == null || (uid = user2.getUid()) == null)) {
            uid = CardStruct.IStatusCode.DEFAULT;
        }
        roomsData.userId = uid;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        User user4 = inboxLiveNotice.user;
        if ((user4 != null && user4.isAccuratePrivateAccount()) || ((slimRoom = inboxLiveNotice.roomInfo) != null && (user3 = slimRoom.owner) != null && user3.getSecret() == 1)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        roomsData2.isSecret = i2;
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        roomsData3.enterType = "click";
        roomsData3.roomId = j;
        roomsData3.enterFromMerge = "message";
        roomsData3.enterMethod = "live_cover";
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        logData.anchorType = "click";
        logData.positionOutsideLiveRoom = i;
        User user5 = inboxLiveNotice.user;
        if (user5 == null || (requestId = user5.getRequestId()) == null) {
            requestId = "";
        }
        logData.requestId = requestId;
        EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
        if (C10EU.LJIILJJIL(inboxLiveNotice.user)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        logData2.isMaf = i3;
        EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
        roomsData4.windowMode = "full_screen";
        roomsData4.isFresh = inboxLiveNotice.isFresh();
        EnterRoomConfig.LogData logData3 = enterRoomConfig.mLogData;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c38611.d1618_i");
        sbLIZ.append(i);
        logData3.sourceBtmToken = btmSDK.createJumpSourceBtmToken(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via(view), null);
        User user6 = inboxLiveNotice.user;
        if (user6 != null) {
            followStatus = user6.getFollowStatus();
        } else {
            followStatus = 0;
        }
        EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
        if (followStatus >= 0 && followStatus < 3) {
            strValueOf = String.valueOf(followStatus);
        } else {
            strValueOf = "3";
        }
        roomsData5.followStatus = strValueOf;
        C0IVT.LIZJ(inboxLiveNotice.roomInfo, enterRoomConfig);
        return enterRoomConfig;
    }

    public static void LIZIZ(Context context, InboxLiveNotice inboxLiveNotice, int i, EnterRoomConfig enterRoomConfig, View view) {
        String str;
        if (inboxLiveNotice != null && inboxLiveNotice.user != null) {
            if (enterRoomConfig == null && (enterRoomConfig = LIZ(inboxLiveNotice, i, view)) == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - inboxLiveNotice.receiveTime;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            enterRoomConfig.mLogData.latencyEnterRoomInterval = jCurrentTimeMillis;
            User user = inboxLiveNotice.user;
            if (user != null) {
                str = user.roomData;
            } else {
                str = null;
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().watchLive(context, enterRoomConfig, str);
        }
    }
}
