package X;

import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnhanceRename;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.android.livesdk.model.BaLeadsGenInfo;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PartnershipInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PollConf;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UIM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UIM {
    public static final boolean LIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        LiveToolbarMoreConfig liveToolbarMoreConfig = LiveToolbarMoreConfig.INSTANCE;
        sbLIZ.append(liveToolbarMoreConfig.enableInteractionPanelOptimize());
        sbLIZ.append(" && ");
        sbLIZ.append(room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId());
        sbLIZ.append("&&");
        LiveMode streamType = room != null ? room.getStreamType() : null;
        LiveMode liveMode = LiveMode.VIDEO;
        sbLIZ.append(streamType == liveMode);
        C20441214yg.LIZIZ("KReddot", C2188811AlT.LIZIZ(sbLIZ));
        return liveToolbarMoreConfig.enableInteractionPanelOptimize() && room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId() && room.getStreamType() == liveMode;
    }

    public static final boolean LIZIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || room.getOwnerUserId() != UserService.getInstance().user().getCurrentUserId()) {
            return false;
        }
        return room.getStreamType() == LiveMode.SCREEN_RECORD || room.getStreamType() == LiveMode.THIRD_PARTY;
    }

    public static final boolean LIZJ() {
        PollConf pollConf;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return (room == null || (pollConf = room.pollConf) == null || !pollConf.useNewGiftPoll) ? false : true;
    }

    public static final int LIZLLL() {
        LiveEnhanceRename liveEnhanceRename = LiveEnhanceRename.INSTANCE;
        if (liveEnhanceRename.isV1()) {
            return 2131843995;
        }
        return liveEnhanceRename.isV2() ? 2131843996 : 2131842802;
    }

    public static final boolean LJFF() {
        PaidContentInfo paidContentInfo;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || room.getOwnerUserId() != UserService.getInstance().user().getCurrentUserId() || room.getStreamType() != LiveMode.VIDEO) {
            return false;
        }
        CommerceStruct commerceStruct = room.getCommerceStruct();
        if ((commerceStruct != null && commerceStruct.commercePermission == 1) || ((paidContentInfo = room.paidContentInfo) != null && paidContentInfo.paidContentPermission)) {
            return true;
        }
        BALinkStruct bALinkStruct = room.getBALinkStruct();
        if (bALinkStruct != null && bALinkStruct.baLinkPermission == 1) {
            return true;
        }
        BaLeadsGenInfo baLeadsGenInfo = room.baLeadsGenInfo;
        if (baLeadsGenInfo != null && baLeadsGenInfo.leadsGenPermission) {
            return true;
        }
        PartnershipInfo partnershipInfo = room.partnershipInfo;
        if (partnershipInfo == null || !Intrinsics.LJFF(partnershipInfo.partnershipRoom, Boolean.TRUE)) {
            PartnershipInfo partnershipInfo2 = room.partnershipInfo;
            return partnershipInfo2 != null && partnershipInfo2.promotingRoom;
        }
        return true;
    }

    public static final boolean LJI() {
        Long l;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return false;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus == null || roomAuthStatus.enablePoll != 1 || room.getStreamType() != LiveMode.VIDEO) {
            if (room == null) {
                return false;
            }
            RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
            if (roomAuthStatus2 == null || (l = roomAuthStatus2.customizablepoll) == null || l.longValue() != 1) {
                RoomAuthStatus roomAuthStatus3 = room.getRoomAuthStatus();
                if (roomAuthStatus3 != null && roomAuthStatus3.enableGiftPoll == 1) {
                    return true;
                }
                RoomAuthStatus roomAuthStatus4 = room.getRoomAuthStatus();
                if (roomAuthStatus4 != null && roomAuthStatus4.customizablegiftpoll == 1) {
                    return true;
                }
                RoomAuthStatus roomAuthStatus5 = room.getRoomAuthStatus();
                return roomAuthStatus5 != null && roomAuthStatus5.emotepoll == 1;
            }
        }
        return true;
    }

    public static final boolean LJII() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return (room != null ? room.getStreamType() : null) == LiveMode.SCREEN_RECORD;
    }

    public static final boolean LJIIIIZZ(Room room) {
        return ((IShareService) C1161920gLG.LIZJ(IShareService.class)).vH2(room);
    }

    public static final boolean LJIIIZ(Room room) {
        return !((IShareService) C1161920gLG.LIZJ(IShareService.class)).I21(room);
    }

    public static final int LJ(int i, int i2) {
        if (!ToolBarButtonWithTextExperiment.hasText()) {
            return i2;
        }
        return i;
    }
}
