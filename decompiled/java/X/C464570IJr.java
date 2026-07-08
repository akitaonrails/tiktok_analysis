package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0IJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464570IJr {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C0IKY c0iky) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_link_phone_popup_click");
        c474500IjALIZ.LJJIIZI(c0iky.LIZLLL);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(C0IKY c0iky) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_link_phone_popup_show");
        c474500IjALIZ.LJJIIZI(c0iky.LIZLLL);
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(C0IKY c0iky, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c0iky.LIZLLL);
        linkedHashMap.remove("trigger_method");
        linkedHashMap.put("enter_method", str);
        C474500IjA c474500IjALIZJ = C0IJT.LIZJ("link_phone_popup_show");
        c474500IjALIZJ.LJJIIZI(linkedHashMap);
        c474500IjALIZJ.LIZ();
    }
}
