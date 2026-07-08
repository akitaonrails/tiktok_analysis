package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1759806uq implements InterfaceC901070ZWn {
    public static final C1759806uq LIZ = new C1759806uq();
    public static final InterfaceC1493505sz LIZIZ = C0I0B.LJFF.LIZIZ();

    @Override // X.InterfaceC901070ZWn
    public final void LIZ() {
        LJFF("click_inline_dm_option", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "im_translation"), new Pair("enter_from", "chat")));
    }

    @Override // X.InterfaceC901070ZWn
    public final void LIZLLL() {
        LJFF("show_inline_dm_option", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "im_translation"), new Pair("enter_from", "chat")));
    }

    @Override // X.InterfaceC901070ZWn
    public final void LIZIZ() {
        LJFF("im_translation_message_icon_click", C2097608Jq.LJ());
    }

    @Override // X.InterfaceC901070ZWn
    public final void LJ() {
        LJFF("im_translation_popup_show", C2097608Jq.LJ());
    }

    @Override // X.InterfaceC901070ZWn
    public final void LIZJ(EnumC901120ZWs enumC901120ZWs) {
        LJFF("im_translation_popup_click", C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, enumC901120ZWs.getReportName())));
    }

    public static void LJFF(String str, Map map) {
        LIZIZ.sendEvent(str, map);
    }
}
