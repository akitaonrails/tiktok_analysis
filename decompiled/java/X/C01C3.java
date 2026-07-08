package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.01C3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01C3 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(User user) {
        Boolean boolValueOf;
        UserAttr userAttr;
        if (user != null && (userAttr = user.getUserAttr()) != null) {
            boolValueOf = Boolean.valueOf(userAttr.isAdmin);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return "moderator";
        }
        return "host";
    }

    public static void LIZIZ(DataChannel dataChannel, C01C1 c01c1, String str) {
        String str2;
        User user;
        String strLIZ;
        Long lValueOf;
        String str3;
        PollStartContent pollStartContent;
        PollStartContent pollStartContent2;
        Room room;
        LiveMode streamType;
        PollStartContent pollStartContent3;
        if (!C01C5.LIZ(dataChannel) && !C500260Jjc.LJIIZILJ(dataChannel)) {
            str2 = "livesdk_poll_card_show";
        } else {
            str2 = "livesdk_anchor_custom_poll_card_show";
        }
        PollMessage pollMessage = c01c1.LJFF;
        Long lValueOf2 = null;
        if (pollMessage != null && (pollStartContent3 = pollMessage.startContent) != null) {
            user = pollStartContent3.operator;
        } else {
            user = null;
        }
        String strLIZ2 = LIZ(user);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJ(strLIZ);
        PollMessage pollMessage2 = c01c1.LJFF;
        if (pollMessage2 != null) {
            lValueOf = Long.valueOf(pollMessage2.pollId);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "poll_id");
        PollMessage pollMessage3 = c01c1.LJFF;
        if (pollMessage3 != null && (pollStartContent2 = pollMessage3.startContent) != null) {
            str3 = pollStartContent2.title;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "poll_title");
        c474500IjALIZ.LJJII(strLIZ2, "poll_sponsor");
        c474500IjALIZ.LJJII(str, "enter_from");
        if (C01C5.LIZ(dataChannel)) {
            User userLIZIZ = C0KXJ.LIZIZ();
            if (userLIZIZ != null) {
                lValueOf2 = Long.valueOf(userLIZIZ.getId());
            }
            c474500IjALIZ.LJJII(lValueOf2, "moderator_id");
            c474500IjALIZ.LJJII("moderator", "user_type");
        } else if (C500260Jjc.LJIIZILJ(dataChannel)) {
            c474500IjALIZ.LJJII("anchor", "user_type");
        }
        long j = c01c1.LIZIZ;
        if (j > 0) {
            PollMessage pollMessage4 = c01c1.LJFF;
            if (pollMessage4 != null && (pollStartContent = pollMessage4.startContent) != null) {
                c474500IjALIZ.LJJII(Long.valueOf(Math.max(0L, pollStartContent.endTime - C963140bAe.LIZIZ())), "time_remain");
            }
        } else {
            c474500IjALIZ.LJJII(Long.valueOf(j), "time_remain");
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.bytedance.ies.sdk.datachannel.DataChannel r18, X.C01C1 r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01C3.LJI(com.bytedance.ies.sdk.datachannel.DataChannel, X.01C1, java.lang.String):void");
    }

    public static void LJ(DataChannel dataChannel, String str, String str2, boolean z, boolean z2, boolean z3) {
        C0IUQ.LIZ(new C01C4(dataChannel, str, str2, z3, z, z2));
    }

    public static void LIZJ(DataChannel dataChannel, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i) {
        boolean z5;
        String str3;
        Room room;
        LiveMode streamType;
        Object obj;
        if (!C500260Jjc.LJIIZILJ(dataChannel) && !z4) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!C01C5.LIZ(dataChannel) && !C01C5.LIZIZ(dataChannel)) {
            if (z5) {
                str3 = "livesdk_anchor_custom_poll_entrance_click";
            } else {
                str3 = "livesdk_poll_entrance_click";
            }
        } else {
            str3 = "livesdk_moderator_poll_entrance_click";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "enter_from");
        if (!z5) {
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj, "is_end_show");
        } else {
            c474500IjALIZ.LJJII("anchor", "user_type");
        }
        String strLIZ = null;
        Object objValueOf = null;
        strLIZ = null;
        strLIZ = null;
        if (C01C5.LIZ(dataChannel)) {
            User userLIZIZ = C0KXJ.LIZIZ();
            if (userLIZIZ != null) {
                objValueOf = Long.valueOf(userLIZIZ.getId());
            }
            c474500IjALIZ.LJJII(objValueOf, "moderator_id");
            c474500IjALIZ.LJJII("moderator", "user_type");
        } else if (z5) {
            if (z4) {
                c474500IjALIZ.LJJ(str2);
                c474500IjALIZ.LJJII(Integer.valueOf(i), "index");
            } else {
                if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
                    strLIZ = C354201Zc.LIZ(streamType);
                }
                c474500IjALIZ.LJJ(strLIZ);
            }
            c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "has_red_dot");
            c474500IjALIZ.LJJII(Integer.valueOf(z3 ? 1 : 0), "has_bubble_guidance");
        }
        c474500IjALIZ.LJJII(C0KYR.LIZJ(dataChannel), "admin_type");
        c474500IjALIZ.LIZ();
    }
}
