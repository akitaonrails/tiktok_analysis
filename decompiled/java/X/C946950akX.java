package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0akX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946950akX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        Map mapLJ = C2097608Jq.LJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entry_type", str);
        linkedHashMap.putAll(mapLJ);
        LJIIIIZZ("entry_click", linkedHashMap);
    }

    public static void LIZJ(String str) {
        Map mapLJ = C2097608Jq.LJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entry_type", str);
        linkedHashMap.putAll(mapLJ);
        LJIIIIZZ("entry_show", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(java.lang.String r9, java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946950akX.LJIIIIZZ(java.lang.String, java.util.Map):void");
    }

    public static void LJ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result", str);
        if (str2 != null) {
            linkedHashMap.put("server_fail_reason", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("server_error_code", str3);
        }
        LJIIIIZZ("game_start_request", linkedHashMap);
    }

    public static void LJFF(String str, String str2, int i) {
        Map mapLJ = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result", str);
        if (str2 != null) {
            linkedHashMap.put("server_fail_reason", str2);
        }
        linkedHashMap.putAll(mapLJ);
        LJIIIIZZ("join_game_request", linkedHashMap);
    }

    public static void LJI(String str, String str2, String str3) {
        Map mapLJ = C2097608Jq.LJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("resource_type", str);
        linkedHashMap.put("resource_id", str2);
        linkedHashMap.put("result", str3);
        linkedHashMap.putAll(mapLJ);
        LJIIIIZZ("resource_download_request", linkedHashMap);
    }

    public static void LJII(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result", str);
        if (str2 != null) {
            linkedHashMap.put("server_fail_reason", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("server_error_code", str3);
        }
        LJIIIIZZ("sitout_request", linkedHashMap);
    }

    public static void LIZIZ(String str, String str2, String str3, int i) {
        Map mapLJ = null;
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entry_type", str);
        linkedHashMap.put("result", str2);
        if (str3 != null) {
            linkedHashMap.put("client_fail_reason", str3);
        }
        linkedHashMap.putAll(mapLJ);
        LJIIIIZZ("entry_click_result", linkedHashMap);
    }

    public static void LIZLLL(String str, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("result", str2);
        if (str3 != null) {
            linkedHashMap.put("server_fail_reason", str3);
        }
        LJIIIIZZ("finish_game_request", linkedHashMap);
    }
}
