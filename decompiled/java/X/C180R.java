package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.180R, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C180R {
    public static final /* synthetic */ int LIZ = 0;

    public static C2344009Gk LIZ(C1743900vTw c1743900vTw) {
        String strLIZJ;
        String str = "";
        if (Intrinsics.LJFF(c1743900vTw.LIZJ("room_id"), CardStruct.IStatusCode.DEFAULT)) {
            strLIZJ = "";
        } else {
            strLIZJ = c1743900vTw.LIZJ("room_id");
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", c1743900vTw.LIZJ("anchor_id"));
        c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c2344009Gk.LJIIIIZZ("room_id", strLIZJ);
        c2344009Gk.LJIIIIZZ("live_status", c1743900vTw.LIZJ("live_status"));
        String strLIZJ2 = c1743900vTw.LIZJ("page_type");
        if (strLIZJ2 == null) {
            strLIZJ2 = "";
        }
        c2344009Gk.LJIIIIZZ("page_type", strLIZJ2);
        String strLIZJ3 = c1743900vTw.LIZJ("anchor_show_type");
        if (strLIZJ3 == null) {
            strLIZJ3 = "";
        }
        c2344009Gk.LJIIIIZZ("anchor_show_type", strLIZJ3);
        String strLIZJ4 = c1743900vTw.LIZJ("fans_cnt");
        if (strLIZJ4 == null) {
            strLIZJ4 = "";
        }
        c2344009Gk.LJIIIIZZ("fans_cnt", strLIZJ4);
        String strLIZJ5 = c1743900vTw.LIZJ("is_red_dot");
        if (strLIZJ5 == null) {
            strLIZJ5 = "";
        }
        c2344009Gk.LJIIIIZZ("is_red_dot", strLIZJ5);
        String strLIZJ6 = c1743900vTw.LIZJ("has_ec_permission");
        if (strLIZJ6 == null) {
            strLIZJ6 = "";
        }
        c2344009Gk.LJIIIIZZ("has_ec_permission", strLIZJ6);
        String strLIZJ7 = c1743900vTw.LIZJ("previous_page");
        if (strLIZJ7 == null) {
            strLIZJ7 = "";
        }
        c2344009Gk.LJIIIIZZ("previous_page", strLIZJ7);
        String strLIZJ8 = c1743900vTw.LIZJ("ec_icon_show_position");
        if (strLIZJ8 == null) {
            strLIZJ8 = "";
        }
        c2344009Gk.LJIIIIZZ("ec_icon_show_position", strLIZJ8);
        String strLIZJ9 = c1743900vTw.LIZJ("live_task_id");
        if (strLIZJ9 != null) {
            c2344009Gk.LJFF("live_task_id", strLIZJ9);
            String strLIZJ10 = c1743900vTw.LIZJ("live_task_status");
            if (strLIZJ10 != null) {
                str = strLIZJ10;
            }
            c2344009Gk.LJFF("live_task_status", str);
        }
        String strLIZJ11 = c1743900vTw.LIZJ("is_bubble_show");
        if (strLIZJ11 != null) {
            c2344009Gk.LJFF("is_bubble_show", strLIZJ11);
        }
        String strLIZJ12 = c1743900vTw.LIZJ("bubble_type_info");
        if (strLIZJ12 != null) {
            c2344009Gk.LJFF("bubble_type_info", strLIZJ12);
        }
        return c2344009Gk;
    }

    public static void LIZIZ(C1743900vTw c1743900vTw, Function1 function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String strLIZJ = c1743900vTw.LIZJ("anchor_id");
        if (strLIZJ != null) {
            linkedHashMap.put("anchor_id", strLIZJ);
        }
        String strLIZJ2 = c1743900vTw.LIZJ("room_id");
        if (strLIZJ2 != null) {
            linkedHashMap.put("room_id", strLIZJ2);
        }
        function1.invoke(linkedHashMap);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_bubble_show", linkedHashMap);
    }

    public static void LIZJ(String str, boolean z, long j, EnumC21196517xD enumC21196517xD, int i, String str2) {
        int i2;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_success", i2);
            jSONObject.put("live_role", enumC21196517xD.getRoleStr());
            jSONObject.put("anchor_id", str);
            jSONObject.put("room_id", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("cost", j);
            jSONObject.put("error_msg", str2);
            jSONObject.put("ec_code", String.valueOf(i));
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_get_products_count", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
