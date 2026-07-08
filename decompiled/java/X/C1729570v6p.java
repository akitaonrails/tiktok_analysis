package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0v6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729570v6p {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZLLL(long j, String str, String str2) throws JSONException {
        C1421105hJ.LIZLLL("rd_ec_enter_page", new Pair("page_name", str), new Pair("previous_page", str2), new Pair("start_click_to_now", Long.valueOf(j)));
    }

    public static final void LIZIZ(long j, String str, String str2, String str3, String str4) throws JSONException {
        C1421105hJ.LIZLLL("rd_ec_duration_debugger", new Pair("page_name", str), new Pair("previous_page", str2), new Pair("stage", str3), new Pair(Scene.SCENE_SERVICE, str4), new Pair("duration", Long.valueOf(j)));
    }

    public static void LIZ(String str, String str2, Boolean bool, String str3, Long l, int i) {
        String str4;
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("stage", str), new Pair(Scene.SCENE_SERVICE, str2));
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            mapLJIIJ.put("is_success", str4);
        }
        if (l != null) {
            l.longValue();
            mapLJIIJ.put("duration", l);
        }
        if (str3 != null) {
            mapLJIIJ.put("error_msg", str3);
        }
        C1421105hJ.LIZJ("rd_ec_billboard_image_monitor", mapLJIIJ);
    }

    public static void LIZJ(String str, String str2, String str3, long j, String str4, boolean z) {
        Pair pair = new Pair("room_id", str);
        int i = 0;
        Map mapLJIIJ = C2097608Jq.LJIIJ(pair, new Pair("author_id", str2), new Pair("image_upload_host", str3), new Pair("duration", Long.valueOf(j)));
        if (z) {
            i = 1;
        }
        mapLJIIJ.put("is_success", Integer.valueOf(i));
        if (str4 != null) {
            mapLJIIJ.put("fail_reason", str4);
        }
        C1421105hJ.LIZJ("rd_ec_live_end_upload_image", mapLJIIJ);
    }

    public static void LJFF(String str, String str2, String str3, Integer num, Long l, String str4, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", str);
        linkedHashMap.put("enter_from", str2);
        if (str3 != null) {
            linkedHashMap.put("activity_id", str3);
        }
        if (num != null) {
            linkedHashMap.put("template_type", Integer.valueOf(num.intValue()));
        }
        if (l != null) {
            linkedHashMap.put("during_time", Long.valueOf(l.longValue()));
        }
        if (str4 != null) {
            linkedHashMap.put("fail_reason", str4);
        }
        C1421105hJ.LIZJ("rd_ttec_billboard_jsb_step", linkedHashMap);
    }

    public static void LJ(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, Integer num, String str8) {
        Map mapLIZ = C1729250v6J.LIZ(str, str2, str3, z, str4, null);
        mapLIZ.put("resource_id", str5);
        mapLIZ.put(Scene.SCENE_SERVICE, str6);
        mapLIZ.put("step", str7);
        if (num != null) {
            num.intValue();
            mapLIZ.put("error_code", num);
        }
        if (str8 != null) {
            mapLIZ.put("error_info", str8);
        }
        C1421105hJ.LIZJ("rd_ttec_billboard_effect_step_event", mapLIZ);
    }
}
