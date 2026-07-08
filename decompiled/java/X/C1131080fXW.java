package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fXW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131080fXW {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ() {
        Object obj;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return Intrinsics.LJFF(strValueOf, obj) ? 1 : 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final void LIZIZ(C1131790fYf c1131790fYf, C1130140fW0 c1130140fW0, C1129710fVJ c1129710fVJ, C1128640fTa c1128640fTa, long j, long j2, String str, int i, long j3, long j4, int i2) {
        int i3;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("panel_stay_time", j);
            jSONObject.put("click_react_duration", c1129710fVJ.LIZ);
            jSONObject.put("click_data_structure_ready_duration", c1129710fVJ.LJ);
            jSONObject.put("click_data_show_duration", c1129710fVJ.LIZIZ);
            jSONObject.put("click_panel_animation_duration", c1129710fVJ.LJFF);
            jSONObject.put("click_panel_available_duration", c1129710fVJ.LIZIZ);
            jSONObject.put("first_screen_image_scc_cnt", c1131790fYf.LJI);
            jSONObject.put("first_screen_image_cache_cnt", c1131790fYf.LJII);
            jSONObject.put("first_screen_image_load_rate", String.valueOf(c1131790fYf.LJI / c1131790fYf.LJFF));
            jSONObject.put("first_screen_image_load_duration", j2);
            jSONObject.put("click_panel_first_frame_duration", c1129710fVJ.LIZJ);
            jSONObject.put("live_dur_when_open_panel", c1129710fVJ.LIZLLL);
            jSONObject.put("loading_view_count", c1131790fYf.LJ);
            jSONObject.put("retry_view_count", i);
            jSONObject.put("initialize_gift_panel_leaf_duration", c1128640fTa.LIZ);
            jSONObject.put("update_gift_pages_duration", c1128640fTa.LIZIZ);
            jSONObject.put("load_visible_image_duration", c1128640fTa.LIZJ);
            jSONObject.put("add_gift_panel_leaf_duration", c1128640fTa.LIZLLL);
            jSONObject.put("add_top_sub_leaf_duration", c1128640fTa.LJ);
            jSONObject.put("add_bottom_sub_leaf_duration", c1128640fTa.LJFF);
            jSONObject.put("add_match_tray_leaf_duration", c1128640fTa.LJI);
            jSONObject.put("add_bubble_sub_leaf_duration", c1128640fTa.LJII);
            jSONObject.put("top_banner_on_start_duration", c1128640fTa.LJIIIIZZ);
            if (j3 != 0) {
                jSONObject.put("multi_guest_view_create_time", j3);
            }
            if (j4 != 0) {
                jSONObject.put("multi_guest_view_start_time", j4);
            }
            jSONObject2.put("is_anchor", LIZ());
            jSONObject2.put("data_status", c1131790fYf.LIZJ);
            jSONObject2.put("first_screen_gift_count", c1131790fYf.LJFF);
            jSONObject2.put("is_use_cache", c1131790fYf.LIZLLL);
            jSONObject2.put("gift_enter_from", c1131790fYf.LIZIZ);
            if (c1131790fYf.LJIIIIZZ) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject2.put("is_landscape", i3);
            jSONObject2.put("error_type", c1130140fW0.LIZ);
            jSONObject2.put("error_msg", c1130140fW0.LIZIZ);
            jSONObject2.put("error_code", c1130140fW0.LIZJ);
            jSONObject2.put("first_screen_image_status", str);
            jSONObject2.put("upload_opportunity", i2);
        } catch (JSONException e) {
            e = e;
        }
        try {
            jSONObject3.put("error_msg", c1130140fW0.LIZIZ);
            jSONObject3.put("error_code", c1130140fW0.LIZJ);
            jSONObject3.put("is_update_by_client_ai", c1131790fYf.LJIIIZ);
            jSONObject3.put("real_panel_show_data", c1131790fYf.LJIIJ);
            jSONObject3.put("recommend_panel_data", c1131790fYf.LJIIJJI);
        } catch (JSONException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("GiftPerformanceMonitor", String.valueOf(e.getMessage()));
        }
        C1135800ff8.LJIILJJIL(jSONObject2, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_load_status");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LIZ();
        C1CC2.LJ("gift_panel_load_status", jSONObject2, jSONObject, jSONObject3);
        LinkedList<AbstractC1143340frI> linkedList = C1143330frH.LIZ;
        C1143330frH.LIZ(new C1143460frU(c1131790fYf.LIZJ));
        C1130460fWW.LIZ.storeBoolean("sp_is_gift_panel_status_uploaded", true);
    }
}
