package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0IbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469660IbM {
    public static boolean LIZ;

    public static void LIZ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_lite_mode_event");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("toast_type", str);
        linkedHashMap.put("toast_action_type", "show");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_lite_mode_event");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("toast_type", str);
        linkedHashMap.put("toast_action_type", "exit");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_lite_mode_event");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("toast_type", str);
        linkedHashMap.put("toast_action_type", "ignore");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
