package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HYM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYM {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZIZ() {
        return C2097608Jq.LJIIJ(new Pair("source", "social_avatar"));
    }

    public static void LIZ(String str) {
        C0I0B.LJFF.LIZIZ();
        Map mapLIZIZ = LIZIZ();
        mapLIZIZ.put("enter_method", "aimoji_tab");
        mapLIZIZ.put("action_type", str);
        C20684815ws.LJIILLIIL("aimoji_confirm_edit", mapLIZIZ);
    }

    public static void LIZLLL(String str) {
        C0I0B.LJFF.LIZIZ();
        Map mapLIZIZ = LIZIZ();
        mapLIZIZ.put("enter_from", "chat");
        mapLIZIZ.put("action_type", str);
        C20684815ws.LJIILLIIL("social_avatar_sticker_create", mapLIZIZ);
    }

    public static void LJ(String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = "chat";
        }
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        Map mapLIZIZ = LIZIZ();
        mapLIZIZ.put("enter_method", str);
        mapLIZIZ.put("enter_from", str2);
        if (str3 != null) {
            mapLIZIZ.put(Scene.SCENE_SERVICE, str3);
        }
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("show_aimoji_creation_banner", mapLIZIZ);
    }

    public static void LIZJ(String str, String str2, String str3, String str4, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        Map mapLIZIZ = LIZIZ();
        mapLIZIZ.put("enter_from", str);
        mapLIZIZ.put("enter_method", str2);
        mapLIZIZ.put("action_type", str3);
        if ((Intrinsics.LJFF(str2, "story_reaction") || Intrinsics.LJFF(str2, "long_press")) && str4 != null) {
            mapLIZIZ.put(Scene.SCENE_SERVICE, str4);
        }
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("click_aimoji_creation_banner", mapLIZIZ);
    }
}
