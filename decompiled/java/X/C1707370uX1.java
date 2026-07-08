package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0uX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707370uX1 {
    public static final void LIZ(int i, String str, String str2) {
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ("autofill");
        HashMap map = new HashMap();
        map.put("result", String.valueOf(i));
        map.put("error_code", str);
        if (str2 == null) {
            str2 = "";
        }
        map.put("error_message", str2);
        interfaceC1709310ua9LIZIZ.LIZ("rd_pipo_auto_fill_jsb_call_end", map);
    }
}
