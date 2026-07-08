package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import kotlin.Pair;
import qo2.w;

/* JADX INFO: renamed from: X.01HU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01HU {
    public static final void LIZIZ(Map map) {
        Long lValueOf;
        String idStr;
        String string;
        String string2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        Pair[] pairArr = new Pair[3];
        String str = "";
        if (roomLJJLI == null || (idStr = roomLJJLI.getIdStr()) == null) {
            idStr = "";
        }
        pairArr[0] = new Pair("room_id", idStr);
        if (roomLJJLI == null || (string = Long.valueOf(roomLJJLI.getOwnerUserId()).toString()) == null) {
            string = "";
        }
        pairArr[1] = new Pair("anchor_id", string);
        if (lValueOf != null && (string2 = lValueOf.toString()) != null) {
            str = string2;
        }
        pairArr[2] = new Pair("guest_id", str);
        map.putAll(C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static final void LIZJ(Map map) {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        Pair pairLJII = C917520Zz4.LJII(C927600aFK.LJII());
        map.putAll(C2097608Jq.LJIIIIZZ(new Pair("layout_setting", pairLJII.getFirst()), new Pair("window_setting", pairLJII.getSecond())));
        C917520Zz4.LIZ(map);
    }

    public static final void LIZ(Room room, Map map) {
        Long lValueOf;
        String string;
        String string2;
        String idStr;
        String str;
        String requestId;
        LiveMode streamType;
        if (room == null) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            room = C500260Jjc.LJJLI();
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        Pair[] pairArr = new Pair[7];
        String str2 = "";
        if (room == null || (string = Long.valueOf(room.getOwnerUserId()).toString()) == null) {
            string = "";
        }
        pairArr[0] = new Pair("anchor_id", string);
        if (lValueOf == null || (string2 = lValueOf.toString()) == null) {
            string2 = "";
        }
        pairArr[1] = new Pair("user_id", string2);
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        pairArr[2] = new Pair("room_id", idStr);
        w.LIZ.getClass();
        pairArr[3] = new Pair("enter_method", w.LJIIL());
        pairArr[4] = new Pair("enter_from_merge", w.LJIIIZ());
        if (room == null || (streamType = room.getStreamType()) == null || (str = streamType.logStreamingType) == null) {
            str = "video_live";
        }
        pairArr[5] = new Pair("live_type", str);
        if (room != null && (requestId = room.getRequestId()) != null) {
            str2 = requestId;
        }
        pairArr[6] = new Pair("request_id", str2);
        map.putAll(C2097608Jq.LJIIIIZZ(pairArr));
        EnumC918970a1P enumC918970a1PLJIILIIL = C917520Zz4.LJIILIIL();
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getSecond());
    }
}
