package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768860UEa {
    public static final Map<Integer, Integer> LIZ = new LinkedHashMap();
    public static final Map<Integer, String> LIZIZ = new LinkedHashMap();
    public static final C01GW LIZJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(372));

    public static void LIZ(int i, Map map) {
        RtcUserInfo rtcUserInfoG0;
        String str;
        String string;
        String strInvoke;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            HashMap map2 = (HashMap) map;
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map2.put("room_id", room.getIdStr());
        }
        HashMap map3 = (HashMap) map;
        map3.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            rtcUserInfoG0 = interfaceC954180awCLLJLL.G0();
        } else {
            rtcUserInfoG0 = null;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (i == 2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map3.put("is_default_value", str);
        if (rtcUserInfoG0 == null || (string = Long.valueOf(rtcUserInfoG0.channelId).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map3.put("channel_id", string);
        Function0<String> function0 = C474640IjO.LIZJ;
        if (function0 != null && (strInvoke = function0.invoke()) != null) {
            str2 = strInvoke;
        }
        map3.put("link_id", str2);
        map3.put("effect_id", "00");
        map3.put("beauty_type_name", "Default_slider");
        map3.put("resource_id", "00");
        map3.put("beauty_value", String.valueOf(i));
    }

    public static void LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("method#");
        sbLIZ.append(str);
        sbLIZ.append(" - ");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("MultiGuestOldBeautyLogUtil", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(int i, String str) {
        if (i == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("beautyLevel=");
        sbLIZ.append(i);
        sbLIZ.append(", eventPage=");
        sbLIZ.append(str);
        LIZIZ("reportBeautySelected", C2188811AlT.LIZIZ(sbLIZ));
        HashMap map = new HashMap();
        LIZ(i, map);
        map.put("event_page", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_beauty_select");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJIJL();
    }
}
