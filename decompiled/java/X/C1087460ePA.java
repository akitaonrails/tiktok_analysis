package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.gift.GiftAdvancedNotificationSceneConfig;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0ePA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087460ePA {
    public static void LIZIZ(DataChannel dataChannel, String str) {
        boolean z;
        String str2;
        String str3;
        if (dataChannel == null) {
            return;
        }
        boolean zEquals = Boolean.TRUE.equals(dataChannel.gg0(UserIsAnchorChannel.class));
        if (dataChannel.gg0(RoomUserChannel.class) != null && ((User) dataChannel.gg0(RoomUserChannel.class)).getUserAttr() != null && ((User) dataChannel.gg0(RoomUserChannel.class)).getUserAttr().isAdmin) {
            z = true;
        } else {
            z = false;
        }
        if (zEquals) {
            str2 = "anchor";
        } else if (z) {
            str2 = "admin";
        } else {
            str2 = "viewer";
        }
        if (str == "show") {
            str3 = "livesdk_privilege_show_frame_check";
        } else {
            str3 = "livesdk_advanced_message_click_frame_check";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(C474500IjA c474500IjA, RoomNotifyMessage roomNotifyMessage, DataChannel dataChannel) {
        long id;
        long id2;
        String str;
        if (dataChannel != null && roomNotifyMessage != null) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            long j = 0;
            if (room != null) {
                id = room.getId();
                if (room.getOwner() != null) {
                    id2 = room.getOwner().getId();
                } else {
                    id2 = 0;
                }
            } else {
                id = 0;
                id2 = 0;
            }
            GiftAdvancedNotificationSceneConfig giftAdvancedNotificationSceneConfig = GiftAdvancedNotificationSceneConfig.INSTANCE;
            String str2 = roomNotifyMessage.source;
            String orDefault = giftAdvancedNotificationSceneConfig.getOrDefault(str2, str2);
            if (Boolean.TRUE.equals(dataChannel.gg0(UserIsAnchorChannel.class))) {
                str = "anchor";
            } else {
                str = "user";
            }
            CommonMessageData commonMessageData = roomNotifyMessage.baseMessage;
            if (commonMessageData != null) {
                j = commonMessageData.createTime;
            }
            c474500IjA.LJJII(Long.valueOf(id), "room_id");
            c474500IjA.LJJII(Long.valueOf(id2), "anchor_id");
            c474500IjA.LJJII(str, "user_type");
            c474500IjA.LJJII(Long.valueOf(System.currentTimeMillis() - j), "duration_from_sent");
            c474500IjA.LJJII(Long.valueOf(System.currentTimeMillis() - roomNotifyMessage.receiveTime), "duration_from_receive");
            c474500IjA.LJJII(orDefault, "privilege_scenario");
            c474500IjA.LJJII(Boolean.valueOf(!C504670Jqj.LIZIZ(roomNotifyMessage.schema)), "has_schema");
            c474500IjA.LJJII(roomNotifyMessage.source, "sub_type");
            c474500IjA.LJJII(Integer.valueOf(roomNotifyMessage.getPriority()), "priority");
        }
    }
}
