package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01CC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL() {
        User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
        String str = (enigmaInfo == null || !enigmaInfo.isEnigmaMaskOn) ? "eligible_not_purchased" : "purchased_equipped";
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_entrance_click");
        c474500IjALIZ.LJJII("privilege_center", "entrance_type");
        c474500IjALIZ.LJJII(str, "identity_status");
        c474500IjALIZ.LIZ();
    }

    public static String LIZ(String str) {
        long id;
        User user;
        try {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            InterfaceC2262081DgM currentUser = null;
            if (interfaceC500940JkiUser != null) {
                currentUser = interfaceC500940JkiUser.getCurrentUser();
            }
            if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            if (id == CastLongProtector.parseLong(str)) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return CardStruct.IStatusCode.DEFAULT;
        }
    }

    public static String LIZIZ(DataChannel dataChannel) {
        UserAttr userAttr;
        User.EnigmaInfo enigmaInfo;
        User.EnigmaInfo enigmaInfo2 = UserService.getInstance().user().LJIJJLI().enigmaInfo;
        if (enigmaInfo2 != null && enigmaInfo2.isEnigmaMaskOn) {
            return "enigmas";
        }
        User user = (User) dataChannel.gg0(RoomUserChannel.class);
        if (user != null && (enigmaInfo = user.enigmaInfo) != null && enigmaInfo.isEnigmaMaskOn) {
            return "enigmas";
        }
        if (Intrinsics.LJFF(Boolean.TRUE, dataChannel.gg0(UserIsAnchorChannel.class))) {
            return "anchor";
        }
        if (!UserService.getInstance().user().LJIJJLI().getUserAttr().isAdmin) {
            User user2 = (User) dataChannel.gg0(RoomUserChannel.class);
            if (user2 != null && (userAttr = user2.getUserAttr()) != null && userAttr.isChannelAdmin) {
                return "moderator";
            }
            return "other_viewers";
        }
        return "moderator";
    }

    public static void LJ(String str) {
        String str2;
        User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
        if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
            str2 = "purchased_equipped";
        } else {
            str2 = "eligible_not_purchased";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_entrance_show");
        c474500IjALIZ.LJJII("privilege_center", "entrance_type");
        c474500IjALIZ.LJJII(str2, "identity_status");
        c474500IjALIZ.LJJII(str, "tracker_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJII(DataChannel dataChannel, String str, boolean z) {
        long ownerUserId;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_whisper_send_result");
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null) {
            ownerUserId = roomLJJLIIIIJ.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)), "room_id");
        c474500IjALIZ.LJJII(str, "msg_id");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "result_type");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, String str2, Map map, boolean z) {
        long currentUserId;
        Long lValueOf;
        String str3;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        long ownerUserId = 0;
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = 0;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_effects_show");
        c474500IjALIZ.LJJII(str, "effect_show_type");
        c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        c474500IjALIZ.LJJII(str2, "to_user_id");
        c474500IjALIZ.LJJII(LIZ(str2), "self_type");
        if (z) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        c474500IjALIZ.LJJII(str3, "user_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJI(String str, String str2, String str3, boolean z) {
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_profile_card_click_enigma");
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(str2, "to_user_id");
        c474500IjALIZ.LJJII(LIZ(str2), "self_type");
        if (z) {
            str4 = "anchor";
        } else {
            str4 = "user";
        }
        c474500IjALIZ.LJJII(str4, "user_type");
        c474500IjALIZ.LJJII(str3, "click_icon_name");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(int i, String str, String str2, String str3, Integer num) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_toggle_status");
        c474500IjALIZ.LJJII(str, "action");
        c474500IjALIZ.LJJII(str2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(str3, "fail_reason");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "duration");
        if (num != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(num.intValue()), "user_api_refresh_count");
        }
        c474500IjALIZ.LIZ();
    }
}
