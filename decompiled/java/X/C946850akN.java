package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0akN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946850akN {
    public static boolean LIZ;
    public static EnumC952890au7 LIZIZ = EnumC952890au7.UNKNOWN;
    public static final Map<String, Long> LIZJ = Collections.synchronizedMap(new LinkedHashMap());

    public static Map LIZJ() {
        String idStr;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        String realDrawLayoutId;
        List<LinkUser> listLIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String str = "";
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        linkedHashMap.put("room_id", idStr);
        List<String> listZP2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ZP2();
        if (listZP2 != null) {
            int size = listZP2.size();
            linkedHashMap.put("guest_cnt", String.valueOf(size));
            if (size > 0) {
                linkedHashMap.put("link_id_list", C13LP.LJJLIIIJ(listZP2, ",", null, null, 0, null, null, 62));
            }
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        linkedHashMap.put("is_guest_connection", (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || listLIZLLL.size() - 1 <= 0) ? false : true ? "1" : CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("is_multi_guest_moderator", CardStruct.IStatusCode.DEFAULT);
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        linkedHashMap.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJII).getSecond());
        linkedHashMap.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJII).getFirst());
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL2.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) != null && (realDrawLayoutId = interfaceC937820aVoLJJJJZ.getRealDrawLayoutId()) != null) {
            str = realDrawLayoutId;
        }
        linkedHashMap.put("layout_id", str);
        return linkedHashMap;
    }

    public static void LJIIL() {
        String idStr;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (idStr = room.getIdStr()) != null && idStr.length() != 0) {
            linkedHashMap.put("room_id", idStr);
        }
        linkedHashMap.put("action_type", "show");
        LJIILIIL("livesdk_multi_anchor_nr_noticeboard_popup", linkedHashMap);
    }

    public static void LIZIZ(EnumC919090a1b enumC919090a1b) {
        String idStr;
        Long lValueOf;
        int size;
        String str;
        List<LinkUser> listLIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        linkedHashMap.put("room_id", idStr);
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("anchor_id", String.valueOf(lValueOf));
        linkedHashMap.put("action_type", enumC919090a1b.getValue());
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            size = listLIZLLL.size();
        } else {
            size = 1;
        }
        int iMax = Math.max(size - 1, 0);
        if (iMax > 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_guest_connection", str);
        linkedHashMap.put("guest_cnt", String.valueOf(iMax));
        LJIILIIL("livesdk_multi_audience_noticeboard_grid", linkedHashMap);
    }

    public static void LJIIJJI(EnumC946860akO enumC946860akO) {
        String idStr;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (idStr = room.getIdStr()) != null && idStr.length() != 0) {
            linkedHashMap.put("room_id", idStr);
        }
        linkedHashMap.put("action_type", "click");
        linkedHashMap.put("btn_name", enumC946860akO.getBtnName());
        LJIILIIL("livesdk_multi_anchor_nr_noticeboard_popup", linkedHashMap);
    }

    public static void LJIILIIL(String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(long j, String str, String str2) {
        Map mapLIZJ = LIZJ();
        mapLIZJ.put("fail_reason", str);
        if (str2 == null) {
            str2 = "";
        }
        mapLIZJ.put("error_code", str2);
        mapLIZJ.put("duration", String.valueOf(j));
        LJIILIIL("livesdk_multi_anchor_noticeboard_pic_upload_fail", mapLIZJ);
    }

    public static void LJFF(EnumC937290aUx enumC937290aUx, EnumC971610bOJ enumC971610bOJ, String str) {
        Map mapLIZJ;
        String strValueOf;
        boolean z;
        if (enumC937290aUx == EnumC937290aUx.LIVE_SETTING) {
            mapLIZJ = new LinkedHashMap();
        } else {
            mapLIZJ = LIZJ();
        }
        mapLIZJ.put("position", enumC937290aUx.getValue());
        mapLIZJ.put("page_name", enumC971610bOJ.getValue());
        C953230auf.LIZ.getClass();
        mapLIZJ.put("your_templates_num", String.valueOf(C953230auf.LIZIZ.size()));
        mapLIZJ.put("is_multi_guest_moderator", CardStruct.IStatusCode.DEFAULT);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (strValueOf = Long.valueOf(room.getOwnerUserId()).toString()) == null) {
            strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        }
        mapLIZJ.put("anchor_id", strValueOf);
        if (!C500260Jjc.LJJIL() && !C930540aK4.LIZJ()) {
            z = false;
        } else {
            z = true;
        }
        if (C931810aM7.LIZJ(z) && str.length() > 0) {
            mapLIZJ.put("notice_board_type", str);
        }
        LJIILIIL("livesdk_multi_anchor_noticeboard_panel_show", mapLIZJ);
    }

    public static void LJII(EnumC945540aiG enumC945540aiG, Long l, String str) {
        String strValueOf;
        String str2;
        Map mapLIZJ = LIZJ();
        mapLIZJ.put("action_type", enumC945540aiG.getValue());
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (strValueOf = Long.valueOf(room.getOwnerUserId()).toString()) == null) {
            strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        }
        mapLIZJ.put("anchor_id", strValueOf);
        if (LIZ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLIZJ.put("is_use_template", str2);
        if (LIZ) {
            mapLIZJ.put("template_id", String.valueOf(l));
            if (str == null) {
                str = "";
            }
            mapLIZJ.put("template_type", str);
        }
        LJIILIIL("livesdk_multi_anchor_noticeboard_click", mapLIZJ);
    }

    public static void LJIIIIZZ(EnumC937290aUx enumC937290aUx, EnumC919090a1b enumC919090a1b, EnumC2399109af enumC2399109af) {
        Map mapLIZJ;
        if (enumC937290aUx == EnumC937290aUx.LIVE_SETTING) {
            mapLIZJ = new LinkedHashMap();
        } else {
            mapLIZJ = LIZJ();
        }
        mapLIZJ.put("position", enumC937290aUx.getValue());
        mapLIZJ.put("action_type", enumC919090a1b.getValue());
        if (enumC2399109af != null) {
            mapLIZJ.put("btn_name", enumC2399109af.getValue());
        }
        LJIILIIL("livesdk_multi_anchor_noticeboard_new_guide", mapLIZJ);
    }

    public static void LJIIIZ(EnumC971520bOA enumC971520bOA, Long l, String str, EnumC937290aUx enumC937290aUx, String str2) {
        String strValueOf;
        boolean z;
        Map mapLIZJ = LIZJ();
        mapLIZJ.put("action_type", enumC971520bOA.getValue());
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (strValueOf = Long.valueOf(room.getOwnerUserId()).toString()) == null) {
            strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        }
        mapLIZJ.put("anchor_id", strValueOf);
        mapLIZJ.put("template_id", String.valueOf(l));
        if (str == null) {
            str = "";
        }
        mapLIZJ.put("template_type", str);
        mapLIZJ.put("position", enumC937290aUx.getValue());
        if (!C500260Jjc.LJJIL() && !C930540aK4.LIZJ()) {
            z = false;
        } else {
            z = true;
        }
        if (C931810aM7.LIZJ(z) && str2.length() > 0) {
            mapLIZJ.put("notice_board_type", str2);
        }
        LJIILIIL("livesdk_multi_anchor_noticeboard_template", mapLIZJ);
    }

    public static void LIZLLL(EnumC937290aUx enumC937290aUx, EnumC953330aup enumC953330aup, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6) {
        Map mapLIZJ;
        String value;
        Object obj;
        String strValueOf;
        boolean z3;
        C953610avH.LJJI.getClass();
        if (C953610avH.LJJII != null) {
            if (z2) {
                LIZ = true;
            }
        } else {
            LIZ = z2;
        }
        if (enumC937290aUx == EnumC937290aUx.LIVE_SETTING) {
            mapLIZJ = new LinkedHashMap();
        } else {
            mapLIZJ = LIZJ();
        }
        mapLIZJ.put("position", enumC937290aUx.getValue());
        if (z2) {
            value = "photo";
        } else if (enumC953330aup != null) {
            value = enumC953330aup.getValue();
        } else {
            value = null;
        }
        if (Intrinsics.LJFF(str3, "in_spots") && value != null) {
            mapLIZJ.put("background_type", value);
        }
        String str7 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        mapLIZJ.put("is_text", obj);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (strValueOf = Long.valueOf(room.getOwnerUserId()).toString()) == null) {
            strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        }
        mapLIZJ.put("anchor_id", strValueOf);
        if (!LIZ) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLIZJ.put("is_use_template", str7);
        mapLIZJ.put("is_multi_guest_moderator", CardStruct.IStatusCode.DEFAULT);
        if (LIZ) {
            if (str == null) {
                str = "";
            }
            mapLIZJ.put("template_id", str);
            if (str2 == null) {
                str2 = "";
            }
            mapLIZJ.put("template_type", str2);
        }
        if (!C500260Jjc.LJJIL() && !C930540aK4.LIZJ()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (C931810aM7.LIZJ(z3) && str3.length() > 0) {
            mapLIZJ.put("notice_board_type", str3);
        }
        if (C931810aM7.LIZLLL() && str3.length() > 0) {
            mapLIZJ.put("original_template_id", str4);
            mapLIZJ.put("template_media_id", str5);
            mapLIZJ.put("original_template_media_id", str6);
        }
        LJIILIIL("livesdk_multi_anchor_noticeboard_create", mapLIZJ);
    }

    public static void LJI(EnumC937290aUx enumC937290aUx, EnumC953330aup enumC953330aup, boolean z, String str, Long l, boolean z2, String str2, Boolean bool, String str3, String str4, String str5) {
        Map mapLIZJ;
        String value;
        Object obj;
        Object obj2;
        String strValueOf;
        boolean z3;
        if (enumC937290aUx == EnumC937290aUx.LIVE_SETTING) {
            mapLIZJ = new LinkedHashMap();
        } else {
            mapLIZJ = LIZJ();
        }
        mapLIZJ.put("position", enumC937290aUx.getValue());
        if (z2) {
            value = "photo";
        } else if (enumC953330aup != null) {
            value = enumC953330aup.getValue();
        } else {
            value = null;
        }
        if (Intrinsics.LJFF(str2, "in_spots") && value != null) {
            mapLIZJ.put("background_type", value);
        }
        String str6 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        mapLIZJ.put("is_text", obj);
        if (LIZ) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLIZJ.put("is_use_template", obj2);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (strValueOf = Long.valueOf(room.getOwnerUserId()).toString()) == null) {
            strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        }
        mapLIZJ.put("anchor_id", strValueOf);
        mapLIZJ.put("is_multi_guest_moderator", CardStruct.IStatusCode.DEFAULT);
        if (z2) {
            if (str == null) {
                str = "";
            }
            mapLIZJ.put("template_type", str);
            mapLIZJ.put("template_id", String.valueOf(l));
        }
        if (!C500260Jjc.LJJIL() && !C930540aK4.LIZJ()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (C931810aM7.LIZJ(z3) && str2.length() > 0) {
            mapLIZJ.put("notice_board_type", str2);
        }
        if (Intrinsics.LJFF(str2, "header") && bool != null) {
            if (!bool.booleanValue()) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            mapLIZJ.put("is_auto", str6);
        }
        if (Intrinsics.LJFF(str2, "header") && C931810aM7.LIZLLL()) {
            mapLIZJ.put("original_template_id", str3);
            mapLIZJ.put("template_media_id", str4);
            mapLIZJ.put("original_template_media_id", str5);
        }
        LJIILIIL("livesdk_multi_anchor_noticeboard_apply", mapLIZJ);
    }
}
