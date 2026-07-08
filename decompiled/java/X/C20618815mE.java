package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15mE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20618815mE implements InterfaceC1465770oFL {
    public static final C20618815mE LIZ = new C20618815mE();
    public static final String[] LIZIZ = {"is_draft", "is_text_trans_pic", "is_ai_text_mode", "ai_generated_image_style", "content_type", "content_source", "shoot_way", "creation_id", "enter_from"};

    @Override // X.InterfaceC1465770oFL
    public final void LIZIZ(String str, InterfaceC1493105sv interfaceC1493105sv) {
        C13DA c13da = new C13DA();
        if (str != null) {
            c13da.put("scenario", str);
        }
        c13da.put("enter_method", EnumC1431810nMZ.MAIN_POSTING_CAMERA_ICON.getValue());
        c13da.put("enter_from", EnumC539160LCo.VIDEO_EDIT_PAGE.getValue());
        interfaceC1493105sv.sendEvent("show_send_dm_camera_button", c13da.build());
    }

    @Override // X.InterfaceC1465770oFL
    public final void LIZ(String str, String str2, String str3, String str4, String str5, Integer num, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1530905z1(str4, str3, str2, num, str5, map, interfaceC1493105sv, str, null), 3);
    }

    public static void LIZJ(String str, EnumC19358210oO enumC19358210oO, String str2, String str3, int i, int i2, Integer num, Function1 function1, int i3) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i3 & 64) != 0) {
            num = null;
        }
        if ((i3 & 128) != 0) {
            function1 = null;
        }
        if ((i3 & 256) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        C13DA c13da = new C13DA();
        c13da.put("enter_from", str);
        c13da.put("enter_method", str2);
        c13da.put("action", String.valueOf(enumC19358210oO.getValue()));
        c13da.put("muf_cnt", String.valueOf(i));
        c13da.put("possible_send_user_cnt", String.valueOf(i2));
        if (num != null) {
            c13da.put("send_rank", String.valueOf(num.intValue()));
        }
        if (str3 != null) {
            c13da.put("scenario", str3);
        }
        Map mapBuild = c13da.build();
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("camera_dm_share_panel_click", mapBuild);
        if (function1 != null) {
            function1.invoke(mapBuild);
        }
    }
}
