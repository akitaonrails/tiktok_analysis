package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import qo2.w;

/* JADX INFO: renamed from: X.01Z4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01Z4 {
    public static final String LIZIZ(long j) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        String str;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkPlayerInfo linkPlayerInfo;
        String str2;
        if (C930540aK4.LIZJ()) {
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ2.LJIILIIL(j)) != null && (str2 = linkPlayerInfo.mInteractIdStr) != null) {
                return str2;
            }
            return "";
        }
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIILIIL(j)) != null && (str = linkListUser.linkMicId) != null) {
            return str;
        }
        return "";
    }

    public static final void LIZ(Room room, Map map) {
        int i;
        String strValueOf;
        int size;
        int iLJIIL;
        String str;
        List<LinkUser> listLIZLLL;
        if (room == null) {
            room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        }
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
            map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            w.LIZ.getClass();
            map.put("enter_method", w.LJIIL());
            map.put("enter_from_merge", w.LJIIIZ());
            String guestRequestId = room.getGuestRequestId();
            if (guestRequestId != null) {
                map.put("guest_request_id", guestRequestId);
            }
            map.put("action_type", w.LIZLLL());
            map.put("layout_id", C917520Zz4.LIZJ());
            EnumC918970a1P enumC918970a1PLJIILIIL = C917520Zz4.LJIILIIL();
            if (!C781520UlC.LJFF(room)) {
                map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getFirst());
                map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getSecond());
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                size = listLIZLLL.size();
            } else {
                size = 1;
            }
            if (C917810ZzX.LJIILIIL()) {
                iLJIIL = C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ());
            } else {
                iLJIIL = size - 1;
            }
            if (iLJIIL > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_guest_connection", str);
            map.put("guest_cnt", String.valueOf(iLJIIL));
            map.put("live_room_mode", String.valueOf(room.liveRoomMode));
            map.put("live_type", room.getStreamType().logStreamingType);
            String requestId = room.getRequestId();
            if (requestId != null) {
                map.put("request_id", requestId);
            }
        }
        if (C917810ZzX.LJIILIIL()) {
            strValueOf = String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()));
        } else {
            MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
            if (multiGuestDataHolder != null) {
                i = multiGuestDataHolder.LJJIFFI;
            } else {
                i = 0;
            }
            strValueOf = String.valueOf(i);
        }
        map.put("guest_cnt", strValueOf);
        if (C924240a9u.LIZ().codeTechSwitchForAndroid != 0) {
            map.put("link_id_list", C917520Zz4.LJ());
        }
        C924620aAW.LJIIL(map);
        C924620aAW.LJIIJJI(map);
        C917650ZzH.LIZIZ(map);
    }
}
