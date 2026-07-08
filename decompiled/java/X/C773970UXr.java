package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773970UXr {
    public static void LIZ(String str) {
        C978370bZD c978370bZDLIZIZ;
        C01HZ c01hzKi1;
        if (Intrinsics.LJFF(str, "show") && (c01hzKi1 = C781270Ukn.LJIILL().ki1()) != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZ("live_setting"), null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("room_id", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        linkedHashMap.put("is_guest_connection", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("guest_cnt", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("layout_id", "");
        linkedHashMap.put("is_multi_guest_moderator", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("from_page", "live_setting");
        InterfaceC774000UXu interfaceC774000UXuG20 = C781270Ukn.LJIILL().G20("livesdk_multi_anchor_funkit_icon");
        if (interfaceC774000UXuG20 != null && (c978370bZDLIZIZ = interfaceC774000UXuG20.LIZIZ((Map) linkedHashMap)) != null) {
            c978370bZDLIZIZ.LIZ();
        }
    }

    public static void LIZIZ(String str) {
        int iLIZIZ;
        String str2;
        String str3;
        C978370bZD c978370bZDLIZIZ;
        C948100amO c948100amOU7;
        String str4;
        C948100amO c948100amOU72;
        C948100amO c948100amOU73;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        InterfaceC769410UGd interfaceC769410UGdM70 = C781270Ukn.LJIILJJIL().M70();
        if (interfaceC769410UGdM70 != null && (c948100amOU73 = interfaceC769410UGdM70.u7()) != null) {
            iLIZIZ = c948100amOU73.LIZIZ();
        } else {
            iLIZIZ = 1;
        }
        linkedHashMap.put("panel_layout_type", String.valueOf(iLIZIZ));
        InterfaceC769410UGd interfaceC769410UGdM702 = C781270Ukn.LJIILJJIL().M70();
        String str5 = "";
        if (interfaceC769410UGdM702 == null || (c948100amOU72 = interfaceC769410UGdM702.u7()) == null || (str2 = c948100amOU72.LIZLLL) == null) {
            str2 = "";
        }
        linkedHashMap.put("layout_id", str2);
        InterfaceC769410UGd interfaceC769410UGdM703 = C781270Ukn.LJIILJJIL().M70();
        if (interfaceC769410UGdM703 != null && (c948100amOU7 = interfaceC769410UGdM703.u7()) != null && (str4 = c948100amOU7.LJ) != null) {
            str5 = str4;
        }
        linkedHashMap.put("layout_key", str5);
        if (C0UX6.MG_PREVIEW_LIVE_LAYOUT_SETTING_GUIDE.isShowing()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_red_dot", str3);
        linkedHashMap.put("from_page", "multiguest_icon");
        InterfaceC774000UXu interfaceC774000UXuG20 = C781270Ukn.LJIILL().G20("livesdk_multi_live_take_multiguest_icon");
        if (interfaceC774000UXuG20 != null && (c978370bZDLIZIZ = interfaceC774000UXuG20.LIZIZ((Map) linkedHashMap)) != null) {
            c978370bZDLIZIZ.LIZ();
        }
    }
}
