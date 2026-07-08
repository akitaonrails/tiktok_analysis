package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.MultiGuestAsGuestInviteSheetFragment;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a8O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923300a8O {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("anchor_id", String.valueOf(C930540aK4.LJII()));
        linkedHashMap.put("room_id", String.valueOf(C950220apo.LIZLLL()));
        C0KX4.LIZ("livesdk_multi_anchor_interact_panel", linkedHashMap, null, true);
    }

    public static void LJFF(String str) {
        String str2;
        RtcUserInfo rtcUserInfoG0;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) == null || (str2 = rtcUserInfoG0.linkMicId) == null) {
            str2 = "";
        }
        map.put("link_id", str2);
        map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("guest_invite_type", C917520Zz4.LJI());
        C0KX4.LIZ("livesdk_multi_guest_personal_manage_panel", map, null, true);
    }

    public static void LJI(String str) {
        String str2;
        boolean zLJFF;
        Object obj;
        RtcUserInfo rtcUserInfoG0;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) == null || (str2 = rtcUserInfoG0.linkMicId) == null) {
            str2 = "";
        }
        map.put("link_id", str2);
        map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("guest_invite_type", C917520Zz4.LJI());
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        C923330a8R c923330a8R = C923330a8R.LIZ;
        map.put("is_multi_guest_moderator", C923330a8R.LIZLLL());
        if (multiGuestDataHolder != null) {
            zLJFF = Intrinsics.LJFF(multiGuestDataHolder.LJIILLIIL(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ())), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (!zLJFF) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("camera_status", obj);
        if (multiGuestDataHolder == null || !Intrinsics.LJFF(multiGuestDataHolder.LIZLLL(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ())), Boolean.TRUE)) {
            str3 = "1";
        }
        map.put("mic_status", str3);
        C0KX4.LIZ("livesdk_multi_guest_personal_manage_panel", map, null, true);
    }

    public static void LJII(String str) {
        String str2;
        boolean zLJFF;
        Object obj;
        RtcUserInfo rtcUserInfoG0;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) == null || (str2 = rtcUserInfoG0.linkMicId) == null) {
            str2 = "";
        }
        map.put("link_id", str2);
        map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("guest_invite_type", C917520Zz4.LJI());
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        C923330a8R c923330a8R = C923330a8R.LIZ;
        map.put("is_multi_guest_moderator", C923330a8R.LIZLLL());
        if (multiGuestDataHolder != null) {
            zLJFF = Intrinsics.LJFF(multiGuestDataHolder.LJIILLIIL(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ())), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (!zLJFF) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("camera_status", obj);
        if (multiGuestDataHolder == null || !Intrinsics.LJFF(multiGuestDataHolder.LIZLLL(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ())), Boolean.TRUE)) {
            str3 = "1";
        }
        map.put("mic_status", str3);
        C0KX4.LIZ("livesdk_multi_guest_interact_panel", map, null, true);
    }

    public static void LIZLLL(int i, String str) {
        String str2;
        RtcUserInfo rtcUserInfoG0;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) == null || (str2 = rtcUserInfoG0.linkMicId) == null) {
            str2 = "";
        }
        map.put("link_id", str2);
        map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("guest_invite_type", C917520Zz4.LJI());
        map.put("friends_num", String.valueOf(i));
        map.put("request_page", str);
        C0KX4.LIZ("livesdk_multi_guest_invite_panel_show", map, null, true);
    }

    public static void LJ(String str, List list, Map map) {
        String str2;
        RtcUserInfo rtcUserInfoG0;
        HashMap map2 = new HashMap();
        C01Z4.LIZ(null, map2);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) == null || (str2 = rtcUserInfoG0.linkMicId) == null) {
            str2 = "";
        }
        map2.put("link_id", str2);
        map2.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map2.put("guest_invite_type", C917520Zz4.LJI());
        map2.put("friends_num", String.valueOf(list.size()));
        map2.put("request_page", MultiGuestAsGuestInviteSheetFragment.LLLFZ);
        map2.put("link_reason", str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((GuestInvitePanelResp.ListUser) obj).onlineStatus == 1) {
                arrayList.add(obj);
            }
        }
        map2.put("green_spot_num", String.valueOf(arrayList.size()));
        if (map != null) {
            map2.putAll(map);
        }
        C0KX4.LIZ("livesdk_multi_guest_invite_panel_list_show", map2, null, true);
    }

    public static void LIZIZ(String str, String str2, int i, int i2, Boolean bool, Map map, boolean z, String str3, String str4, String str5) {
        String str6;
        Object obj;
        RtcUserInfo rtcUserInfoG0;
        HashMap map2 = new HashMap();
        C01Z4.LIZ(null, map2);
        map2.put("action_type", str);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) == null || (str6 = rtcUserInfoG0.linkMicId) == null) {
            str6 = "";
        }
        map2.put("link_id", str6);
        map2.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map2.put("guest_invite_type", C917520Zz4.LJI());
        map2.put("friend_id", str2);
        map2.put("friends_num", String.valueOf(i));
        map2.put("rank", String.valueOf(i2));
        map2.put("request_page", MultiGuestAsGuestInviteSheetFragment.LLLFZ);
        String str7 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_green_spot", obj);
        map2.put("link_reason", str3);
        map2.put("multi_request_id", str4);
        map2.put("link_sub_reason", str5);
        if (bool != null) {
            if (!bool.booleanValue()) {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("is_invited", str7);
        }
        if (map != null) {
            map2.putAll(map);
        }
        C0KX4.LIZ("livesdk_multi_guest_invite_panel_list", map2, null, true);
    }
}
