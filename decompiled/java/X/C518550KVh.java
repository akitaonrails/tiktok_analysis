package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.event.SkuRoutingLeadConversionEvent;
import com.bytedance.android.livesdk.livesetting.pcs.TTLivePcsEventBAListSetting;
import com.bytedance.android.livesdk.livesetting.pcs.TTLivePcsEventDMListSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0KVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518550KVh {
    public static final List<InterfaceC518600KVm> LIZ = C1697810uHb.LJIIJJI(new InterfaceC518600KVm() { // from class: X.0KVp
        public final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("quick_interaction_click", "livesdk_quick_interaction_click"), new Pair("quick_interaction_show", "livesdk_quick_interaction_show"), new Pair("enter_b2c_chat", "livesdk_enter_b2c_chat"), new Pair("send_message", "livesdk_send_message"), new Pair("like_message", "livesdk_like_message"), new Pair("receive_message", "livesdk_receive_message"), new Pair("read_message", "livesdk_read_message"), new Pair("message_mock", "livesdk_message_mock"), new Pair("send_message_response", "livesdk_send_message_response"), new Pair("im_card_click", "livesdk_im_card_click"));

        @Override // X.InterfaceC518600KVm
        public final C518590KVl LIZ(C518590KVl c518590KVl) throws JSONException {
            String str = c518590KVl.LIZ;
            LinkedHashMap linkedHashMap = null;
            if (str == null) {
                return null;
            }
            String str2 = this.LIZ.get(str);
            if (Intrinsics.LJFF(str2, "livesdk_send_message")) {
                C1103300eoi c1103300eoi = C1103300eoi.LIZLLL;
                c1103300eoi.getClass();
                c1103300eoi.LIZLLL(1, "smb_viewer_dm_send_count");
                c1103300eoi.LIZLLL(1, "smb_viewer_dm_send_count_app_session");
                DataChannelGlobal.LLILZ.FQ2(SkuRoutingLeadConversionEvent.class, EnumC1122660fJw.DM);
            }
            Map<String, String> map = c518590KVl.LIZJ;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
            }
            if (linkedHashMap != null) {
                linkedHashMap.put("DMInterceptor", "true");
                String str3 = (String) linkedHashMap.get("extra_info");
                if (str3 != null && str3.length() != 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            linkedHashMap.put(next, jSONObject.optString(next, jSONObject.get(next).toString()));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJII(e);
                    }
                }
            }
            JSONObject jSONObject2 = c518590KVl.LIZIZ;
            if (jSONObject2 != null) {
                jSONObject2.put("DMInterceptor", "true");
                String strOptString = jSONObject2.optString("extra_info");
                if (strOptString != null && strOptString.length() != 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(strOptString);
                        Iterator<String> itKeys2 = jSONObject3.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            jSONObject2.put(next2, jSONObject3.optString(next2, jSONObject3.get(next2).toString()));
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C20441214yg.LJII(e2);
                    }
                }
            }
            long id = UserService.getInstance().user().getCurrentUser().getId();
            w.LIZ.getClass();
            String strLJIIIZ = w.LJIIIZ();
            String strLJIIL = w.LJIIL();
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("from_user_id", String.valueOf(id)), new Pair("enter_from_merge", strLJIIIZ), new Pair("enter_method", strLJIIL), new Pair("live_enter_method", strLJIIL), new Pair("traffic_action_type", w.LIZLLL()), new Pair("request_id", w.LJIJI()), new Pair("is_service_plus", "1"));
            if (jSONObject2 != null) {
                for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap != null) {
                linkedHashMap.putAll(mapLJIIIIZZ);
            }
            return new C518590KVl(jSONObject2, str2, linkedHashMap);
        }

        @Override // X.InterfaceC518600KVm
        public final boolean LIZIZ(C518590KVl c518590KVl) {
            JSONObject jSONObject;
            Map<String, String> map;
            String str;
            if (!this.LIZ.containsKey(c518590KVl.LIZ) || (((jSONObject = c518590KVl.LIZIZ) != null && jSONObject.has("DMInterceptor")) || ((map = c518590KVl.LIZJ) != null && map.get("DMInterceptor") != null))) {
                return false;
            }
            if (C13LQ.LJIILLIIL(c518590KVl.LIZ, TTLivePcsEventDMListSetting.INSTANCE.getValue())) {
                JSONObject jSONObject2 = c518590KVl.LIZIZ;
                if (jSONObject2 != null) {
                    if (a0.LJJIIZI(jSONObject2.optString("extra_info"), "upsell_user_type", false)) {
                        return true;
                    }
                } else {
                    Map<String, String> map2 = c518590KVl.LIZJ;
                    if (map2 != null && (str = map2.get("extra_info")) != null && a0.LJJIIZI(str, "upsell_user_type", false)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }, new InterfaceC518600KVm() { // from class: X.0KVn
        public final Map<String, C518620KVo> LIZ = C2097608Jq.LJIIIIZZ(new Pair("lead_center_show", new C518620KVo("livesdk_ba_get_leads_page")), new Pair("lead_center_leads_list", new C518620KVo("livesdk_ba_get_leads_page_lead_details")), new Pair("lead_center_settings_form_click", new C518620KVo("livesdk_ba_get_leads_page_lead_collection")), new Pair("lead_center_leads_list_status_click", new C518620KVo("livesdk_ba_lead_status_click")), new Pair("lead_center_lead_detail_page", new C518620KVo("livesdk_ba_lead_detail_page")), new Pair("lead_center_settings_form_show", new C518620KVo("livesdk_ba_lead_forms_page")), new Pair("lead_center_form_detail_page", new C518620KVo("livesdk_ba_form_details_page")), new Pair("lead_center_create_form_button_click", new C518620KVo("livesdk_ba_create_form_button_click")), new Pair("lead_center_ba_form_info_edit_page", new C518620KVo("livesdk_ba_form_info_edit_page")), new Pair("lead_center_ba_form_content_edit_page", new C518620KVo("livesdk_ba_form_content_edit_page")), new Pair("lead_center_ba_form_privacy_police_page", new C518620KVo("livesdk_ba_form_privacy_police_page")), new Pair("lead_center_ba_form_final_edit_page", new C518620KVo("livesdk_ba_form_final_edit_page")), new Pair("lead_center_ba_submit_form_confirm_popup", new C518620KVo("livesdk_ba_submit_form_confirm_popup")));

        /* JADX WARN: Removed duplicated region for block: B:59:0x013f A[PHI: r13
          0x013f: PHI (r13v2 java.lang.String) = (r13v0 java.lang.String), (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:67:0x01d1, B:72:0x01e0, B:58:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
        @Override // X.InterfaceC518600KVm
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C518590KVl LIZ(X.C518590KVl r21) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 505
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C518610KVn.LIZ(X.0KVl):X.0KVl");
        }

        @Override // X.InterfaceC518600KVm
        public final boolean LIZIZ(C518590KVl c518590KVl) {
            JSONObject jSONObject;
            Map<String, String> map;
            String str;
            if (!this.LIZ.containsKey(c518590KVl.LIZ) || (((jSONObject = c518590KVl.LIZIZ) != null && jSONObject.has("FormInterceptor")) || ((map = c518590KVl.LIZJ) != null && map.get("FormInterceptor") != null))) {
                return false;
            }
            if (C13LQ.LJIILLIIL(c518590KVl.LIZ, TTLivePcsEventBAListSetting.INSTANCE.getValue())) {
                JSONObject jSONObject2 = c518590KVl.LIZIZ;
                if (jSONObject2 != null) {
                    if (a0.LJJIIZI(jSONObject2.optString(Scene.SCENE_SERVICE), "pcs_upsell", false)) {
                        return true;
                    }
                } else {
                    Map<String, String> map2 = c518590KVl.LIZJ;
                    if (map2 != null && (str = map2.get(Scene.SCENE_SERVICE)) != null && a0.LJJIIZI(str, "pcs_upsell", false)) {
                        return true;
                    }
                }
            }
            return false;
        }
    });
    public static final C518580KVk LIZIZ = new C518580KVk();
}
