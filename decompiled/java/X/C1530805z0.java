package X;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05z0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1530805z0 {
    public static final C1530805z0 LIZ = new C1530805z0();

    public static final void LIZ(int i, boolean z, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1530705yz(interfaceC1493105sv, z, i, null), 3);
    }

    public static final void LIZIZ(List<String> list, String str, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("ttsocial_create_group_menu_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("menu_array", list.toString()), new Pair("action", str)));
    }
}
