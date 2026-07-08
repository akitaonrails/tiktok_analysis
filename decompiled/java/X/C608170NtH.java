package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0NtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608170NtH {
    public static final /* synthetic */ int LIZ = 0;

    public static HashMap LJFF(String str) {
        try {
            return (HashMap) C08JS.LIZIZ().LJIIIIZZ(str, new TypeToken<HashMap<String, String>>() { // from class: X.0NtI
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Map LIZ(String str, String str2, boolean z) {
        String str3;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("room_id", str);
        pairArr[1] = new Pair("anchor_id", str2);
        pairArr[2] = new Pair("event_page", "shop_live_highlight");
        pairArr[3] = new Pair("enter_from_page", "shop_live");
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[4] = new Pair("is_top_module", str3);
        pairArr[5] = new Pair("is_ecom_live_highlight", 1);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static void LJ(String str, String str2, String str3, boolean z) {
        HashMap mapLJFF;
        Object obj;
        Map mapLIZ = LIZ(str, str2, z);
        if (str3 != null && (mapLJFF = LJFF(str3)) != null && (obj = mapLJFF.get("room_id")) != null) {
            mapLIZ.put("room_id", obj);
        }
        C1421105hJ.LIZJ("livesdk_live_highlight_show", mapLIZ);
    }

    public static Map LIZIZ(String str, String str2, String str3, boolean z, boolean z2) {
        int i;
        Pair[] pairArr = new Pair[9];
        int i2 = 0;
        pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
        pairArr[1] = new Pair("author_id", str2);
        pairArr[2] = new Pair("room_id", str);
        pairArr[3] = new Pair("page_name", "shop_live_highlight");
        pairArr[4] = new Pair("previous_page", str3);
        pairArr[5] = new Pair("live_status", "before_live");
        pairArr[6] = new Pair("user_type", "author");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[7] = new Pair("is_empty", Integer.valueOf(i));
        if (z2) {
            i2 = 1;
        }
        pairArr[8] = new Pair("is_greenhand_guider", Integer.valueOf(i2));
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static void LIZJ(String str, String str2, String str3, long j, String str4, boolean z) {
        HashMap mapLJFF;
        Map mapLIZ = LIZ(str, str2, z);
        mapLIZ.put("time", String.valueOf(j));
        mapLIZ.put("fragment_id", str3);
        if (str4 != null && (mapLJFF = LJFF(str4)) != null) {
            mapLIZ.putAll(mapLJFF);
        }
        C1421105hJ.LIZJ("livesdk_live_highlight_cover_show", mapLIZ);
    }

    public static void LJI(String str, String str2, String str3, Long l, Integer num, String str4, int i) {
        String str5;
        if ((i & 8) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        Map mapLIZ = LIZ(str2, str3, false);
        mapLIZ.put("step", str);
        if (l != null) {
            mapLIZ.put("duration", Long.valueOf(l.longValue()));
        }
        if (num != null) {
            mapLIZ.put("error_code", Integer.valueOf(num.intValue()));
        }
        if (str4 != null) {
            mapLIZ.put("error_info", str4);
        }
        if (str5 != null) {
            mapLIZ.put("icon_url", str5);
        }
        C1421105hJ.LIZJ("rd_tiktokec_highlight_step_event", mapLIZ);
    }

    public static void LIZLLL(long j, long j2, String str, String str2, String str3, String str4, String str5, boolean z) {
        HashMap mapLJFF;
        Map mapLIZ = LIZ(str, str2, z);
        mapLIZ.put("time", String.valueOf(j));
        mapLIZ.put("fragment_id", str3);
        mapLIZ.put("duration", Long.valueOf(j2));
        mapLIZ.put("close_status", str4);
        if (str5 != null && (mapLJFF = LJFF(str5)) != null) {
            mapLIZ.putAll(mapLJFF);
        }
        C1421105hJ.LIZJ("livesdk_anchor_highlight_post_loading_close", mapLIZ);
    }
}
