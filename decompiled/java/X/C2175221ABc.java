package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.SMBInfo;

/* JADX INFO: renamed from: X.1ABc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175221ABc {
    public static final /* synthetic */ int LIZ = 0;

    public static Room LIZ(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct != null) {
            try {
                Room room = new Room();
                room.allowPreviewTime = liveRoomStruct.allowPreviewTime;
                room.hasCommerceGoods = liveRoomStruct.hasCommerceGoods;
                room.setId(liveRoomStruct.id);
                room.setIdStr(liveRoomStruct.idStr);
                room.isScreenshot = liveRoomStruct.isScreenshot;
                room.isThirdParty = liveRoomStruct.isThirdParty;
                SlimRoom.LinkMic linkMic = (SlimRoom.LinkMic) C2183471Acr.LIZ(liveRoomStruct.linkMic, new C2261501DfQ());
                if (linkMic != null) {
                    RoomLinkInfo roomLinkInfo = new RoomLinkInfo();
                    roomLinkInfo.audienceIdList = linkMic.audienceIdList;
                    room.setLinkMicInfo(roomLinkInfo);
                }
                room.liveRoomMode = liveRoomStruct.liveRoomMode;
                room.liveSubOnly = liveRoomStruct.liveSubOnly;
                room.setLiveTypeAudio(liveRoomStruct.liveTypeAudio);
                room.maxPreviewTime = liveRoomStruct.maxPreviewTime;
                room.multiStreamId = liveRoomStruct.multiStreamId;
                room.multiStreamIdStr = liveRoomStruct.multiStreamIdStr;
                room.multiStreamScene = liveRoomStruct.multiStreamScene;
                room.multiStreamSource = (int) liveRoomStruct.multiStreamSource;
                room.setOwnerUserId(liveRoomStruct.ownerUserId);
                room.setRequestId(liveRoomStruct.getRequestId());
                room.roomLayout = liveRoomStruct.roomLayout;
                room.blurredCover = C20639815pc.LJ(liveRoomStruct.blurredCover);
                room.setStatus(liveRoomStruct.status);
                room.setTitle(liveRoomStruct.title);
                room.setUserCount(liveRoomStruct.user_count);
                room.setHostWebcastSdkVersion(liveRoomStruct.webcastSdkVersion);
                room.multiStreamUrl = (StreamUrl) C1AEY.LIZ(StreamUrl.class, liveRoomStruct.multiStreamUrl);
                room.setOwner(C20639815pc.LIZLLL(liveRoomStruct.owner));
                room.setStreamUrl((StreamUrl) C1AEY.LIZ(StreamUrl.class, liveRoomStruct.stream_url));
                room.smbBoardId = liveRoomStruct.smbBoardId;
                SMBInfo sMBInfo = liveRoomStruct.smbInfo;
                if (sMBInfo != null) {
                    com.bytedance.android.livesdkapi.depend.model.live.SMBInfo sMBInfo2 = new com.bytedance.android.livesdkapi.depend.model.live.SMBInfo();
                    sMBInfo2.optInStatus = sMBInfo.optInStatus;
                    sMBInfo2.activeSkuCount = sMBInfo.activeSkuCount;
                    sMBInfo2.smbOptInSource = sMBInfo.smbOptInSource;
                    sMBInfo2.publicRoomParam = sMBInfo.publicRoomParam;
                    room.smbInfo = sMBInfo2;
                }
                return room;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}
