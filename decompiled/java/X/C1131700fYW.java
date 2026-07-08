package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0fYW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131700fYW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        map.put("prevention_reason", str);
        map.put("gift_enter_from", C1130100fVw.LIZ.LIZJ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_realtime_update_request");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(int i) {
        HashMap map = new HashMap();
        map.put("request_id", "");
        map.put("scene_type", "");
        map.put("trigger_from", "");
        map.put("trigger_type", "");
        map.put("rt_blce_features", "");
        map.put("requestType", String.valueOf(i));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_client_gift_list_request");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(long j, String str) {
        HashMap map = new HashMap();
        map.put("duration", String.valueOf(j));
        if (str == null) {
            str = "";
        }
        map.put("prevention_reason", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_realtime_update_response");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
