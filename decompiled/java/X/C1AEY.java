package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlight;
import com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlightVideoInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrl;
import com.ss.android.ugc.aweme.feed.model.live.LiveUser;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;

/* JADX INFO: renamed from: X.1AEY, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AEY {
    public static final LiveRoomStruct LIZIZ(Room room) {
        String strLIZJ;
        NewLiveRoomStruct newLiveRoomStruct = new NewLiveRoomStruct();
        newLiveRoomStruct.allowPreviewTime = room.allowPreviewTime;
        newLiveRoomStruct.hasCommerceGoods = room.hasCommerceGoods;
        newLiveRoomStruct.id = room.getId();
        newLiveRoomStruct.idStr = room.getIdStr();
        newLiveRoomStruct.isScreenshot = room.isScreenshot;
        newLiveRoomStruct.isThirdParty = room.isThirdParty;
        RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
        AILivePreviewHighlight aILivePreviewHighlight = null;
        AILivePreviewHighlightVideoInfo aILivePreviewHighlightVideoInfo = null;
        if (linkMicInfo != null) {
            strLIZJ = C1516000pYM.LIZJ(linkMicInfo);
        } else {
            strLIZJ = null;
        }
        newLiveRoomStruct.linkMic = strLIZJ;
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
        webcast.data.AILivePreviewHighlight aILivePreviewHighlight2 = room.aiLivePreviewHighlight;
        if (aILivePreviewHighlight2 != null) {
            AILivePreviewHighlight aILivePreviewHighlight3 = new AILivePreviewHighlight();
            aILivePreviewHighlight3.fragmentId = aILivePreviewHighlight2.fragmentId;
            aILivePreviewHighlight3.highlightUrl = aILivePreviewHighlight2.highlightUrl;
            aILivePreviewHighlight3.sourceType = aILivePreviewHighlight2.sourceType;
            aILivePreviewHighlight3.createTimestamp = aILivePreviewHighlight2.createTimestamp;
            aILivePreviewHighlight3.expireTimestamp = aILivePreviewHighlight2.expireTimestamp;
            aILivePreviewHighlight3.resultKey = aILivePreviewHighlight2.resultKey;
            webcast.data.AILivePreviewHighlightVideoInfo aILivePreviewHighlightVideoInfo2 = aILivePreviewHighlight2.videoInfo;
            if (aILivePreviewHighlightVideoInfo2 != null) {
                aILivePreviewHighlightVideoInfo = new AILivePreviewHighlightVideoInfo();
                aILivePreviewHighlightVideoInfo.url = aILivePreviewHighlightVideoInfo2.url;
                aILivePreviewHighlightVideoInfo.duration = aILivePreviewHighlightVideoInfo2.duration;
                aILivePreviewHighlightVideoInfo.urlKey = aILivePreviewHighlightVideoInfo2.urlKey;
                aILivePreviewHighlightVideoInfo.bitRate = aILivePreviewHighlightVideoInfo2.bitRate;
                aILivePreviewHighlightVideoInfo.size = aILivePreviewHighlightVideoInfo2.size;
                aILivePreviewHighlightVideoInfo.codecType = aILivePreviewHighlightVideoInfo2.codecType;
                aILivePreviewHighlightVideoInfo.format = aILivePreviewHighlightVideoInfo2.format;
                aILivePreviewHighlightVideoInfo.height = aILivePreviewHighlightVideoInfo2.height;
                aILivePreviewHighlightVideoInfo.width = aILivePreviewHighlightVideoInfo2.width;
                aILivePreviewHighlightVideoInfo.coverUri = aILivePreviewHighlightVideoInfo2.coverUri;
            }
            aILivePreviewHighlight3.videoInfo = aILivePreviewHighlightVideoInfo;
            aILivePreviewHighlight3.isShowHighlight = aILivePreviewHighlight2.LIZ;
            aILivePreviewHighlight3.videoType = aILivePreviewHighlight2.videoType;
            aILivePreviewHighlight = aILivePreviewHighlight3;
        }
        newLiveRoomStruct.aiLivePreviewHighlight = aILivePreviewHighlight;
        LiveRoomStruct liveRoomStructRoomStructConstructor = newLiveRoomStruct.roomStructConstructor();
        liveRoomStructRoomStructConstructor.clientVersion = room.getClientVersion();
        return liveRoomStructRoomStructConstructor;
    }

    public static final Object LIZ(Class cls, Object obj) {
        try {
            return C19748512Ol.LIZIZ.LJII(C08JS.LIZIZ().LJIILL(obj), cls);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
