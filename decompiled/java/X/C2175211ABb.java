package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RepostInfo;

/* JADX INFO: renamed from: X.1ABb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175211ABb {
    public static final C2175211ABb LIZ = new C2175211ABb();

    public static Room LIZ(LiveRoomStruct liveRoomStruct, SlimRoom.LinkMic linkMic, String str) {
        int i;
        Room room = new Room();
        if (liveRoomStruct != null) {
            try {
                room.setId(liveRoomStruct.id);
                User user = new User();
                user.setSecUid(liveRoomStruct.owner.getSecUid());
                user.setId(liveRoomStruct.ownerUserId);
                FollowInfo followInfo = new FollowInfo();
                followInfo.setFollowStatus(liveRoomStruct.owner.getFollowStatus());
                user.setFollowInfo(followInfo);
                if (liveRoomStruct.owner.isAccuratePrivateAccount()) {
                    i = 1;
                } else {
                    i = 0;
                }
                user.setSecret(i);
                user.setNickName(liveRoomStruct.owner.getNickname());
                room.setOwner(user);
                if (str == null) {
                    str = "";
                }
                room.setRequestId(str);
                room.setOwnerUserId(liveRoomStruct.ownerUserId);
                room.setLiveTypeAudio(liveRoomStruct.liveTypeAudio);
                room.liveSubOnly = liveRoomStruct.liveSubOnly;
                room.reposted = liveRoomStruct.reposted;
                room.repostNote = liveRoomStruct.repostNote;
                room.liveRoomMode = liveRoomStruct.liveRoomMode;
                RepostInfo repostInfo = liveRoomStruct.repostInfo;
                if (repostInfo != null) {
                    com.bytedance.android.livesdkapi.depend.model.live.RepostInfo repostInfo2 = new com.bytedance.android.livesdkapi.depend.model.live.RepostInfo();
                    repostInfo2.showTag = repostInfo.showTag;
                    repostInfo2.repostersCnt = repostInfo.repostersCnt;
                    repostInfo2.repostersToken = repostInfo.repostersToken;
                    room.repostInfo = repostInfo2;
                }
                ImageModel imageModel = new ImageModel();
                imageModel.setUri(liveRoomStruct.roomCover.getUri());
                imageModel.setUrls(liveRoomStruct.roomCover.getUrlList());
                room.setCover(imageModel);
                if (linkMic != null || (linkMic = (SlimRoom.LinkMic) C2183471Acr.LIZ(liveRoomStruct.linkMic, new C2261501DfQ())) != null) {
                    RoomLinkInfo roomLinkInfo = new RoomLinkInfo();
                    roomLinkInfo.audienceIdList = linkMic.audienceIdList;
                    room.setLinkMicInfo(roomLinkInfo);
                    return room;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return room;
    }
}
