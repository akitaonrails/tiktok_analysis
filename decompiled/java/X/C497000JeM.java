package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0JeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497000JeM {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(String str) {
        if (!TextUtils.equals(str, "AIGC_Toggle") && !TextUtils.equals(str, "AIGC_Metadata")) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(User user) {
        User owner;
        Long lValueOf = Long.valueOf(user.getId());
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long lValueOf2 = null;
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        }
        if (!Intrinsics.LJFF(lValueOf2, lValueOf) && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70().contains(Long.valueOf(user.getId()))) {
            return "cohost";
        }
        int i = C496930JeF.LIZ[((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ND(user).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "host";
                }
                return "viewer";
            }
            return "guest";
        }
        return "viewer";
    }

    public static final void LIZJ(DataChannel dataChannel, String str, BottomMessage bottomMessage) {
        String str2;
        String str3;
        PunishEventInfo punishEventInfo;
        if (bottomMessage != null && (punishEventInfo = bottomMessage.punishInfo) != null) {
            str2 = punishEventInfo.punishReason;
        } else {
            str2 = null;
        }
        if (LIZ(str2)) {
            if (Intrinsics.LJFF(str2, "AIGC_Toggle")) {
                str3 = "self_toggle";
            } else if (Intrinsics.LJFF(str2, "AIGC_Metadata")) {
                str3 = "metadata_detect";
            } else {
                str3 = "";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
            c474500IjALIZ.LJJII(LIZIZ(UserService.getInstance().user().LJIJJLI()), "user_type");
            c474500IjALIZ.LJJII(str3, "source");
            c474500IjALIZ.LJJII("app", "platform");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZLLL(DataChannel dataChannel, Room room, String str, BottomMessage bottomMessage) {
        PunishEventInfo punishEventInfo;
        String str2;
        String str3;
        PunishEventInfo punishEventInfo2;
        if (bottomMessage != null && (punishEventInfo = bottomMessage.punishInfo) != null && (str2 = punishEventInfo.punishReason) != null && a0.LJJIIZI(str2, "live_misinfo", false)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
            c474500IjALIZ.LJJII(LIZIZ(UserService.getInstance().user().LJIJJLI()), "user_type");
            c474500IjALIZ.LJJII("app", "platform");
            String title = null;
            if (room != null) {
                title = room.getTitle();
            }
            c474500IjALIZ.LJJII(String.valueOf(title), "room_title");
            if (bottomMessage == null || (punishEventInfo2 = bottomMessage.punishInfo) == null || (str3 = punishEventInfo2.punishReason) == null) {
                str3 = "";
            }
            c474500IjALIZ.LJJII(str3, "strategy");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
        }
    }
}
