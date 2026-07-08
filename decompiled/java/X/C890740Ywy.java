package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ywy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890740Ywy implements InterfaceC1903310zd3 {
    public static final C890740Ywy LIZ = new C890740Ywy();

    @Override // X.InterfaceC1903310zd3
    public final void LIZ(String str) {
        C0I0B.LJFF.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("enter_method", "receive_failed_message_cell");
        linkedHashMap.put("panel_version", "3");
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }

    @Override // X.InterfaceC1903310zd3
    public final void LIZIZ(Map<String, String> map) {
        String str;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("rank", map.get("rank"));
        linkedHashMap.put("unread_cnt", map.get("show_cnt"));
        linkedHashMap.put("num_strangers", map.get("num_strangers"));
        linkedHashMap.put("num_muf_maf", map.get("num_muf_maf"));
        linkedHashMap.put("num_users", map.get("num_users"));
        if (Intrinsics.LJFF(map.get("action_type"), "show")) {
            str = "show_receive_failed_message_cell";
        } else {
            str = "click_receive_failed_message_cell";
        }
        interfaceC1493505szLIZIZ.sendEvent(str, linkedHashMap);
    }
}
