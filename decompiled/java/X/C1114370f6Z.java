package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import webcast.data.UserIdentity;

/* JADX INFO: renamed from: X.0f6Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114370f6Z {
    public static String LIZ = "";
    public static String LIZIZ;

    public static String LJIIIZ() {
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        boolean zIsInGracePeriod = false;
        boolean zIsSubscribed = (room == null || (owner2 = room.getOwner()) == null) ? false : owner2.isSubscribed();
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null && (owner = room2.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
            zIsInGracePeriod = subscribeInfo.isInGracePeriod();
        }
        return zIsSubscribed ? "subscribed_not_expired" : zIsInGracePeriod ? "subscribed_expired_grace_period" : "not_subscribed";
    }

    public static void LJIIIIZZ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_guidance_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.FALSE)) {
            c474500IjALIZ.LJJII(Integer.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).WS1()), "user_rank");
        }
        c474500IjALIZ.LJJII("keyboard", "position");
        if (C497740JfY.LJIL()) {
            c474500IjALIZ.LJJII("portrait", "room_orientation");
        } else {
            c474500IjALIZ.LJJII("landscape", "room_orientation");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(C474500IjA c474500IjA) {
        c474500IjA.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fc2(), "send_comment_scene");
    }

    public static void LIZ(C474500IjA c474500IjA, DataChannel dataChannel) {
        long j;
        int i;
        boolean z;
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        if (c1095140ebYUw0 != null) {
            j = c1095140ebYUw0.LIZ;
        } else {
            j = 0;
        }
        int i2 = 0;
        if (c1095140ebYUw0 != null) {
            i = c1095140ebYUw0.LJ;
        } else {
            i = 0;
        }
        if (!C500260Jjc.LJIIZILJ(dataChannel)) {
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (j > 0) {
                if (!z) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
            }
            c474500IjA.LJJII(String.valueOf(j), "fans_club_level");
            c474500IjA.LJJII(Integer.valueOf(i2), "fans_club_relation_status");
            c474500IjA.LJJII(Integer.valueOf(i2), "fans_club_status");
        }
    }

    public static int LIZIZ(DataChannel dataChannel, InputAttrs inputAttrs) {
        boolean zIsSubscribed;
        User owner;
        if (C1114730f79.LIZ()) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room2 != null && (owner = room2.getOwner()) != null) {
                zIsSubscribed = owner.isSubscribed();
            } else {
                zIsSubscribed = false;
            }
            boolean z = !C518190KTx.LIZ(C500260Jjc.LJIIZILJ(dataChannel), room);
            if (inputAttrs == null || !inputAttrs.emoteEnabled) {
                return 0;
            }
            if (!zIsSubscribed && !z) {
                return 0;
            }
            return 1;
        }
        if (inputAttrs != null) {
            return inputAttrs.emoteEnabled ? 1 : 0;
        }
        return 0;
    }

    public static void LJ(long j, DataChannel dataChannel) {
        String roomOrientation;
        Room room;
        if (j < 0 || dataChannel == null) {
            return;
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_comment_box_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJJII(Long.valueOf(j), "duration");
        LJIIJ(c474500IjALIZIZ, dataChannel);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIJJLI(dataChannel);
            c474500IjALIZIZ.LIZ();
            return;
        }
        c474500IjALIZIZ.LJJIJLIJ();
        c474500IjALIZIZ.LJIIIIZZ();
        w wVar = w.LIZ;
        wVar.getClass();
        C0IR5 c0ir5LJJIII = w.LJJIII();
        if (c0ir5LJJIII == null || (room = c0ir5LJJIII.LIZIZ) == null || (roomOrientation = room.getRoomOrientation()) == null) {
            roomOrientation = "";
        }
        c474500IjALIZIZ.LJJII(roomOrientation, "room_orientation");
        c474500IjALIZIZ.LJJII(wVar.LIZJ(), "live_type");
        c474500IjALIZIZ.LJJIJL();
    }

    public static C474500IjA LJIIJ(C474500IjA c474500IjA, DataChannel dataChannel) {
        String str;
        if (dataChannel == null) {
            return c474500IjA;
        }
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (room != null && interfaceC500940JkiUser.getCurrentUserId() == room.getOwnerUserId()) {
            str = "anchor";
        } else {
            UserAttr userAttr = interfaceC500940JkiUser.getCurrentUser().getUserAttr();
            if (userAttr != null && userAttr.isAdmin) {
                str = "admin";
            } else {
                str = "user";
            }
        }
        c474500IjA.LJJII(str, "admin_type");
        return c474500IjA;
    }

    public static void LJFF(boolean z, boolean z2, DataChannel dataChannel) {
        boolean zBooleanValue;
        String roomOrientation;
        Room room;
        int i;
        if (dataChannel == null) {
            return;
        }
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        int i2 = 0;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_comment_box_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        if (!zBooleanValue) {
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_click_available");
        }
        if (z2) {
            i2 = 1;
        }
        c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "is_whisper");
        LJIIJ(c474500IjALIZIZ, dataChannel);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIJJLI(dataChannel);
            c474500IjALIZIZ.LIZ();
            return;
        }
        c474500IjALIZIZ.LJJIJLIJ();
        w wVar = w.LIZ;
        wVar.getClass();
        C0IR5 c0ir5LJJIII = w.LJJIII();
        if (c0ir5LJJIII == null || (room = c0ir5LJJIII.LIZIZ) == null || (roomOrientation = room.getRoomOrientation()) == null) {
            roomOrientation = "";
        }
        c474500IjALIZIZ.LJJII(roomOrientation, "room_orientation");
        c474500IjALIZIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZIZ.LJJII(wVar.LIZJ(), "live_type");
        c474500IjALIZIZ.LJIIIIZZ();
        c474500IjALIZIZ.LJJIJL();
    }

    public static void LJII(DataChannel dataChannel, int i, String str) {
        long id;
        String strLIZ;
        LiveMode streamType;
        if (dataChannel == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guessing_emoji_tab_entrance");
        c474500IjALIZ.LJIJJLI(dataChannel);
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        long ownerUserId = 0;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        Room room2 = (Room) dataChannel.gg0(RoomChannel.class);
        if (room2 != null) {
            ownerUserId = room2.getOwnerUserId();
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        Room room3 = (Room) dataChannel.gg0(RoomChannel.class);
        if (room3 != null && (streamType = room3.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = "";
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "available_emoji_nums");
        c474500IjALIZ.LIZ();
    }

    public static final void LJI(DataChannel dataChannel, int i, int i2, long j) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_comment_failed");
        LJIIJ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "retry_count");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LIZ();
    }

    public static final void LIZLLL(long j, UserIdentity userIdentity, int i, long j2, C474500IjA c474500IjA, String str, long j3) throws JSONException {
        boolean z = true;
        if (((str != null && str.length() != 0) || j3 > 0) && c474500IjA != null) {
            c474500IjA.LJJII(String.valueOf(j), "comment_id");
            if (userIdentity != null) {
                JSONArray jSONArray = new JSONArray();
                if (userIdentity.isGiftGiverOfAnchor) {
                    jSONArray.put("gifter");
                    z = false;
                }
                if (userIdentity.isSubscriberOfAnchor) {
                    jSONArray.put("subscriber");
                    z = false;
                }
                if (userIdentity.isFollowerOfAnchor) {
                    jSONArray.put("fans");
                    z = false;
                }
                if (userIdentity.isMutualFollowingWithAnchor) {
                    jSONArray.put("friends");
                    z = false;
                }
                if (userIdentity.isModeratorOfAnchor) {
                    jSONArray.put("moderator");
                } else if (z) {
                    jSONArray.put("audience");
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("user_type", jSONArray);
                c474500IjA.LJJIIJZLJL(jSONObject);
            }
            c474500IjA.LJJII(Integer.valueOf(i), "retry_count");
            c474500IjA.LJJII(Long.valueOf(j2), "duration");
            c474500IjA.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(com.bytedance.ies.sdk.datachannel.DataChannel r8, com.bytedance.android.livesdk.chatroom.model.ReplyInfo r9, java.lang.String r10, java.lang.String r11, X.C1114480f6k r12, com.bytedance.android.livesdk.chatroom.model.InputAttrs r13, int r14, long r15, boolean r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1114370f6Z.LIZJ(com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdk.chatroom.model.ReplyInfo, java.lang.String, java.lang.String, X.0f6k, com.bytedance.android.livesdk.chatroom.model.InputAttrs, int, long, boolean, java.lang.String):void");
    }
}
