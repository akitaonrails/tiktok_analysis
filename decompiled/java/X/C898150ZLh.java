package X;

import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898150ZLh implements InterfaceC892560Yzu {
    public static final C898150ZLh LL = new C898150ZLh();

    @Override // X.InterfaceC892560Yzu
    public final void LIZLLL(String str) {
        C0I0B.LJFF.LIZIZ().sendEvent("legacy_light_interaction_usage", C2097608Jq.LJIIIIZZ(new Pair("light_interaction_type", str), new Pair("msg_type", "sticker"), new Pair(Scene.SCENE_SERVICE, "send")));
    }

    @Override // X.InterfaceC892560Yzu
    public final void LIZJ(String str, Map map) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        LIZIZ(str, (String) linkedHashMap.get("enter_from"), (String) linkedHashMap.get("enter_method"), (String) linkedHashMap.get("position"), (String) linkedHashMap.get("push_label"), (String) linkedHashMap.get("active_status_type"), "send_a_hi");
    }

    @Override // X.InterfaceC892560Yzu
    public final void LJFF(String str, Map<String, String> map) {
        LJ(map.get("enter_from"), map.get("enter_method"), map.get("position"), map.get("push_label"), map.get("active_status_type"), str);
    }

    @Override // X.InterfaceC892560Yzu
    public final void LJ(String str, String str2, String str3, String str4, String str5, String str6) {
        C0I0B.LJFF.LIZIZ().sendEvent("light_interaction_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("position", str3), new Pair("push_label", str4), new Pair("interaction_type", str6), new Pair("active_status_type", str5)));
    }

    @Override // X.InterfaceC892560Yzu
    public final void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C0I0B.LJFF.LIZIZ().sendEvent("light_interaction_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str2), new Pair("enter_method", str3), new Pair("position", str4), new Pair("push_label", str5), new Pair("interaction_type", str7), new Pair("active_status_type", str6)));
    }
}
