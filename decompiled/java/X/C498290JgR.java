package X;

import com.bytedance.android.livesdk.userservice.UserService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0JgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498290JgR {
    public static final Map<String, Object> LIZ = new LinkedHashMap();
    public static long LIZIZ = -1;

    public static void LJ() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("scm_tag_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "object_id");
        c474500IjALIZ.LJJII("live_mini_profile", "current_page");
        c474500IjALIZ.LJJII(C0X2A.LIZJ, "country_code");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("scm_live_back");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "object_id");
        c474500IjALIZ.LJJII(C0X2A.LIZJ, "country_code");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZ(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("is_mic", Boolean.valueOf(z));
        LIZJ("profile_clicked", linkedHashMap);
    }

    public static final void LIZIZ(long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        long j2 = LIZIZ;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j - j2;
        }
        linkedHashMap.put("duration", Long.valueOf(j3));
        LIZJ("widget_load_finished", linkedHashMap);
    }

    public static void LIZLLL(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("scm_page_view");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "object_id");
        c474500IjALIZ.LJJII(str, "page_name");
        c474500IjALIZ.LJJII(C0X2A.LIZJ, "country_code");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_userinfo_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C501590Jll.LIZLLL(map);
        C1CC2.LJII(0, strLIZIZ, map);
        map.put("event_name", strLIZIZ);
        C1143300frE.LJIIJJI().LJII("ttlive_room", map);
    }
}
