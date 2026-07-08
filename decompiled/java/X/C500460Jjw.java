package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Jjw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500460Jjw {
    public static final /* synthetic */ int LIZ = 0;

    public static HashMap LIZ(Long l, Long l2, String str) {
        String str2;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap(16);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        if (C930540aK4.LIZJ()) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        map.put("user_type", str2);
        map.put("pk_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()));
        map.put("sub_match_type", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my());
        map.put("guide_type", str);
        map.put("show_type", "room_notification");
        if (l != null && l.longValue() > 0) {
            map.put("redpacket_id", String.valueOf(l.longValue()));
        }
        if (l2 != null && l2.longValue() > 0) {
            map.put("redpacket_anchor_id", String.valueOf(l2.longValue()));
        }
        return map;
    }

    public static void LIZIZ(Long l, Long l2, String str) {
        HashMap mapLIZ = LIZ(l, l2, str);
        mapLIZ.put("click_area", "room_notification");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_match_virtual_tickets_guide_click");
        c474500IjALIZ.LJJIIZI(mapLIZ);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
