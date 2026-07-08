package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrl;
import com.ss.android.ugc.aweme.feed.model.live.LiveUser;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;

/* JADX INFO: renamed from: X.1AEZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AEZ {
    public static NewLiveRoomStruct LIZIZ(Room room) {
        if (room == null) {
            return null;
        }
        NewLiveRoomStruct newLiveRoomStruct = new NewLiveRoomStruct();
        newLiveRoomStruct.allowPreviewTime = room.allowPreviewTime;
        newLiveRoomStruct.hasCommerceGoods = room.hasCommerceGoods;
        newLiveRoomStruct.id = room.getId();
        newLiveRoomStruct.idStr = room.getIdStr();
        newLiveRoomStruct.isScreenshot = room.isScreenshot;
        newLiveRoomStruct.isThirdParty = room.isThirdParty;
        newLiveRoomStruct.linkMic = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, room.getLinkMicInfo());
        newLiveRoomStruct.liveRoomMode = room.liveRoomMode;
        newLiveRoomStruct.liveSubOnly = room.liveSubOnly;
        newLiveRoomStruct.liveTypeAudio = room.isLiveTypeAudio();
        newLiveRoomStruct.maxPreviewTime = room.maxPreviewTime;
        newLiveRoomStruct.multiStreamId = room.multiStreamId;
        newLiveRoomStruct.multiStreamIdStr = room.multiStreamIdStr;
        newLiveRoomStruct.multiStreamScene = room.multiStreamScene;
        newLiveRoomStruct.multiStreamSource = room.multiStreamSource;
        newLiveRoomStruct.multiStreamUrl = (LiveStreamUrl) LIZ(LiveStreamUrl.class, room.multiStreamUrl);
        newLiveRoomStruct.owner = (LiveUser) LIZ(LiveUser.class, room.getOwner());
        newLiveRoomStruct.ownerUserId = room.getOwnerUserId();
        newLiveRoomStruct.setRequestId(room.getRequestId());
        newLiveRoomStruct.roomCover = (UrlModel) LIZ(UrlModel.class, room.getCover());
        newLiveRoomStruct.roomLayout = room.roomLayout;
        newLiveRoomStruct.status = room.getStatus();
        newLiveRoomStruct.stream_url = (LiveStreamUrl) LIZ(LiveStreamUrl.class, room.getStreamUrl());
        newLiveRoomStruct.title = room.getTitle();
        newLiveRoomStruct.user_count = room.getUserCount();
        newLiveRoomStruct.webcastSdkVersion = room.getHostWebcastSdkVersion();
        newLiveRoomStruct.withLinkmic = room.isWithLinkMic();
        return newLiveRoomStruct;
    }

    public static Object LIZ(Class cls, Object obj) {
        try {
            return C19748512Ol.LIZIZ.LJII(C08JS.LIZIZ().LJIILL(obj), cls);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("LiveShareToStoryUtils.convertToLiveRoomStruct Error", e);
            return null;
        }
    }
}
