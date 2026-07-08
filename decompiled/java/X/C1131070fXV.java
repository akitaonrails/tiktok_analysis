package X;

import android.os.SystemClock;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDebugPanelSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fXV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131070fXV {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static int LIZIZ() {
        Object obj;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return Intrinsics.LJFF(strValueOf, obj) ? 1 : 0;
    }

    public static final void LIZJ(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(Scene.SCENE_SERVICE, str);
        C1135800ff8.LJIILJJIL(jSONObject3, jSONObject, C158B.LIZ(), System.currentTimeMillis());
        C1CC2.LJ("gift_widget_unload_error", jSONObject3, jSONObject2, jSONObject);
    }

    public static final void LJIIIIZZ(float f, int i) {
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_gift_list_data_reduction_fetch", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJJII(Integer.valueOf(LIZIZ()), "is_anchor");
        c474500IjALIZIZ.LJJIFFI(Float.valueOf(f), "reusage_ratio");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), "cache_size");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        } else {
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJJIJL();
        }
    }

    public static void LIZ(String str, List list, List list2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("type", "gift_panel_show_data_error");
        jSONObject2.put("real_panel_show_data", list);
        jSONObject2.put("recommend_panel_data", list2);
        jSONObject2.put("is_update_by_client_ai", false);
        jSONObject2.put("sort_status", str);
        C1CC2.LJ("gift_core_monitor", jSONObject, new JSONObject(), jSONObject2);
    }

    public static final void LJIIIZ(C1131790fYf c1131790fYf, C1130140fW0 c1130140fW0, C1129710fVJ c1129710fVJ, C1128640fTa c1128640fTa) {
        InterfaceC1100860ekm interfaceC1100860ekmSg;
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("click_react_duration", c1129710fVJ.LIZ);
            jSONObject.put("click_data_structure_ready_duration", c1129710fVJ.LJ);
            jSONObject.put("click_data_show_duration", c1129710fVJ.LIZIZ);
            jSONObject.put("click_panel_animation_duration", c1129710fVJ.LJFF);
            long j = c1129710fVJ.LIZIZ;
            long j2 = c1129710fVJ.LJFF;
            if (j < j2) {
                j = j2;
            }
            jSONObject.put("click_panel_available_duration", j);
            jSONObject.put("first_screen_image_scc_cnt", c1131790fYf.LJI);
            jSONObject.put("first_screen_image_cache_cnt", c1131790fYf.LJII);
            jSONObject.put("first_screen_image_load_rate", String.valueOf(c1131790fYf.LJI / c1131790fYf.LJFF));
            jSONObject.put("click_panel_first_frame_duration", c1129710fVJ.LIZJ);
            jSONObject.put("live_dur_when_open_panel", c1129710fVJ.LIZLLL);
            jSONObject.put("loading_view_count", c1131790fYf.LJ);
            jSONObject.put("initialize_gift_panel_leaf_duration", c1128640fTa.LIZ);
            jSONObject.put("update_gift_pages_duration", c1128640fTa.LIZIZ);
            jSONObject.put("load_visible_image_duration", c1128640fTa.LIZJ);
            jSONObject.put("add_gift_panel_leaf_duration", c1128640fTa.LIZLLL);
            jSONObject.put("add_top_sub_leaf_duration", c1128640fTa.LJ);
            jSONObject.put("add_bottom_sub_leaf_duration", c1128640fTa.LJFF);
            jSONObject.put("add_match_tray_leaf_duration", c1128640fTa.LJI);
            jSONObject.put("add_bubble_sub_leaf_duration", c1128640fTa.LJII);
            jSONObject.put("top_banner_on_start_duration", c1128640fTa.LJIIIIZZ);
            jSONObject2.put("is_anchor", LIZIZ());
            jSONObject2.put("data_status", c1131790fYf.LIZJ);
            jSONObject2.put("update_by_client_strategy", c1131790fYf.LIZJ);
            jSONObject2.put("first_screen_gift_count", c1131790fYf.LJFF);
            jSONObject2.put("is_use_cache", c1131790fYf.LIZLLL);
            jSONObject2.put("gift_enter_from", c1131790fYf.LIZIZ);
            if (c1131790fYf.LJIIIIZZ) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("is_landscape", i);
            jSONObject2.put("error_type", c1130140fW0.LIZ);
            jSONObject2.put("error_msg", c1130140fW0.LIZIZ);
            jSONObject2.put("error_code", c1130140fW0.LIZJ);
            jSONObject3.put("error_msg", c1130140fW0.LIZIZ);
            jSONObject3.put("error_code", c1130140fW0.LIZJ);
            LinkedList<AbstractC1143340frI> linkedList = C1143330frH.LIZ;
            long j3 = c1129710fVJ.LIZIZ;
            long j4 = c1129710fVJ.LJFF;
            if (j3 < j4) {
                j3 = j4;
            }
            C1143330frH.LIZ(new C1143450frT(j3));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("GiftPerformanceMonitor", String.valueOf(e.getMessage()));
        }
        C1134970fdn.LIZ(jSONObject3);
        C1135800ff8.LJIILJJIL(jSONObject2, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        if (C500260Jjc.LJJJI(Boolean.valueOf(C1138640fji.LJIIIIZZ())) && LiveGiftDebugPanelSettings.INSTANCE.getEnable() && (interfaceC1100860ekmSg = ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).Sg()) != null) {
            C1133970fcB c1133970fcB = (C1133970fcB) interfaceC1100860ekmSg;
            if (c1133970fcB.LIZJ == null) {
                c1133970fcB.LIZJ = new LinkedHashMap();
            }
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if (next != null && objOpt != null) {
                        linkedHashMap.put(next, objOpt.toString());
                    }
                }
                Map<String, String> map = c1133970fcB.LIZJ;
                if (map != null) {
                    map.putAll(linkedHashMap);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_data_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LIZ();
        if (c1131790fYf.LIZJ != 0) {
            C1CC2.LJ("gift_panel_data_show", jSONObject2, jSONObject, jSONObject3);
        } else {
            C1CC2.LIZJ("gift_panel_data_show", jSONObject2, jSONObject, jSONObject3);
            C1CC2.LJ("gift_panel_data_show_error", jSONObject2, jSONObject, jSONObject3);
        }
    }

    public static final void LJIIJ(int i, int i2, Boolean bool, String str) {
        int i3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click_react_duration", 0);
        jSONObject.put("click_data_structure_ready_duration", 0);
        jSONObject.put("click_data_show_duration", 0);
        jSONObject.put("click_panel_animation_duration", 0);
        jSONObject.put("click_panel_available_duration", 0);
        jSONObject.put("first_screen_image_scc_cnt", 0);
        jSONObject.put("first_screen_image_cache_cnt", 0);
        jSONObject.put("first_screen_image_load_rate", "");
        jSONObject.put("click_panel_first_frame_duration", 0);
        jSONObject.put("live_dur_when_open_panel", 0);
        jSONObject.put("loading_view_count", 0);
        jSONObject.put("initialize_gift_panel_leaf_duration", 0);
        jSONObject.put("update_gift_pages_duration", 0);
        jSONObject.put("load_visible_image_duration", 0);
        jSONObject.put("add_gift_panel_leaf_duration", 0);
        jSONObject.put("add_top_sub_leaf_duration", 0);
        jSONObject.put("add_bottom_sub_leaf_duration", 0);
        jSONObject.put("add_match_tray_leaf_duration", 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_anchor", LIZIZ());
        jSONObject2.put("data_status", i);
        jSONObject2.put("first_screen_gift_count", 0);
        jSONObject2.put("is_use_cache", 0);
        jSONObject2.put("gift_enter_from", str);
        if (bool != null && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        jSONObject2.put("is_landscape", i3);
        jSONObject2.put("error_type", 0);
        jSONObject2.put("error_msg", "");
        jSONObject2.put("error_code", 0);
        jSONObject2.put("is_gift_list_optimized", 0);
        jSONObject2.put("upload_opportunity", i2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("error_msg", "");
        jSONObject3.put("error_code", 0);
        C1134970fdn.LIZ(jSONObject3);
        C1135800ff8.LJIILJJIL(jSONObject2, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_data_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LIZ();
        C1CC2.LIZJ("gift_panel_data_show", jSONObject2, jSONObject, jSONObject3);
        jSONObject.put("panel_stay_time", 0);
        jSONObject.put("retry_view_count", 0);
        jSONObject.put("first_screen_image_load_duration", 0);
        jSONObject2.put("first_screen_image_status", "");
        C1135800ff8.LJIILJJIL(jSONObject2, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("gift_panel_dismiss");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ2.LJJIIJZLJL(jSONObject);
        c474500IjALIZ2.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ2.LIZ();
        C1CC2.LJ("gift_panel_dismiss", jSONObject2, jSONObject, jSONObject3);
        C1130450fWV.LIZ.storeBoolean("sp_is_gift_panel_dismiss_uploaded", true);
    }

    public static final void LJIIL(long j, String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gift_enter_from", C1130100fVw.LIZ.LIZJ);
        JSONObject jSONObject2 = new JSONObject();
        Locale locale = Locale.ROOT;
        jSONObject2.put("banner_type", str.toLowerCase(locale));
        jSONObject2.put("dispatch_source", str2.toLowerCase(locale));
        jSONObject2.put("show_duration", j);
        jSONObject2.put("arch", str3);
        JSONObject jSONObject3 = new JSONObject();
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_top_banner_show");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LIZ();
    }

    public static final void LJII(int i, int i2, long j, String str, String str2, String str3) {
        String str4;
        String strValueOf;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", j);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("error_code", i);
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        jSONObject2.put("error_msg", str4);
        switch (i2) {
            case 0:
                strValueOf = "invalid";
                break;
            case 1:
                strValueOf = "app_launch";
                break;
            case 2:
                strValueOf = "enter_room";
                break;
            case 3:
                strValueOf = "show_gift_panel";
                break;
            case 4:
                strValueOf = "receive_new_effect";
                break;
            case 5:
                strValueOf = "receive_update_message";
                break;
            case 6:
                strValueOf = "language_changed";
                break;
            case 7:
                strValueOf = "gift_box_update";
                break;
            case 8:
                strValueOf = "open_debug_tool";
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                strValueOf = "open_panel_predict";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                strValueOf = "mock_gift";
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                strValueOf = "send_gift";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                strValueOf = "live_goal_panel";
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                strValueOf = "send_fans_gift";
                break;
            case 14:
                strValueOf = "quit_fans_club";
                break;
            case 15:
                strValueOf = "user_level_update";
                break;
            default:
                switch (i2) {
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        strValueOf = "goal_before_live";
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        strValueOf = "client_ai";
                        break;
                    case 19:
                        strValueOf = "creator_gift_panel";
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        strValueOf = "privilege_center_page";
                        break;
                    case 21:
                        strValueOf = "strategy_1coin_gift_recommend";
                        break;
                    case 22:
                        strValueOf = "gift_gallery_optout";
                        break;
                    case 23:
                        strValueOf = "ug_points_gift_quit_refresh";
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        strValueOf = "viewer_picks_select_panel";
                        break;
                    case 25:
                        strValueOf = "gift_info_jsb";
                        break;
                    case 26:
                        strValueOf = "eoy25_upgrade_gift_bubble";
                        break;
                    case 27:
                        strValueOf = "close_gift_panel";
                        break;
                    default:
                        switch (i2) {
                            case 101:
                                strValueOf = "watch_n_sec_for_strategy";
                                break;
                            case 102:
                                strValueOf = "match_gift_only_start_for_strategy";
                                break;
                            case 103:
                                strValueOf = "live_goal_change_for_strategy";
                                break;
                            default:
                                strValueOf = String.valueOf(i2);
                                break;
                        }
                        break;
                }
                break;
        }
        jSONObject2.put("fetch_giftlist_from", strValueOf);
        jSONObject2.put("trigger_type", str3);
        jSONObject2.put("is_use_cache", 0);
        jSONObject2.put("live_dur_when_list_return", SystemClock.elapsedRealtime() - LIZ);
        JSONObject jSONObject3 = new JSONObject();
        if (str == null) {
            str = "";
        }
        jSONObject3.put("error_msg", str);
        jSONObject3.put("error_code", i);
        jSONObject3.put("log_id", str2);
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("gift_list_data_fetch", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJJII(Integer.valueOf(LIZIZ()), "is_anchor");
        c474500IjALIZIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZIZ.LJJIIJZLJL(jSONObject3);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        } else {
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJJIJL();
        }
        if (i == 0) {
            if (SlardarSampleSetting.INSTANCE.isSampleReportSlardar("gift_list_data_fetch", 0.1d)) {
                C1CC2.LJ("gift_list_data_fetch", jSONObject2, jSONObject, jSONObject3);
            }
        } else {
            if (SlardarSampleSetting.INSTANCE.isSampleReportSlardar("gift_list_data_fetch", 0.1d)) {
                C1CC2.LIZJ("gift_list_data_fetch", jSONObject2, jSONObject, jSONObject3);
            }
            C1CC2.LJ("gift_list_data_fetch_error", jSONObject2, jSONObject, jSONObject3);
        }
    }

    public static final void LIZLLL(int i, int i2, int i3, int i4, String str, String str2, long j, String str3, String str4, Integer num) throws JSONException {
        Integer numValueOf;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", j);
        jSONObject.putOpt("missing_effects_count", num);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("error_code", i3);
        jSONObject2.put("source", i4);
        jSONObject2.put("error_msg", str);
        jSONObject2.put("is_background", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground() ? 1 : 0));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("effects_count", i);
        jSONObject3.put("request_effects_count", i2);
        jSONObject3.put("log_id", str3);
        if (room != null) {
            numValueOf = Integer.valueOf(room.getOrientation());
        } else {
            numValueOf = null;
        }
        jSONObject3.put("room_type", numValueOf);
        jSONObject3.put("error_code", i3);
        jSONObject3.put("error_msg", str);
        jSONObject3.put("error_domain", str2);
        jSONObject3.putOpt("missing_effects_ids", str4);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_assets_effects_fetch_status");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(LIZIZ()), "is_anchor");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LIZ();
        C1CC2.LJ("gift_assets_effects_fetch_status", jSONObject2, jSONObject, jSONObject3);
        if (i3 != 0) {
            String strLIZ = C1132930faV.LIZ("gift_assets_effects_fetch_status");
            C1CC2.LJ(strLIZ, jSONObject2, jSONObject, jSONObject3);
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ(strLIZ);
            c474500IjALIZ2.LJJIIJZLJL(jSONObject2);
            c474500IjALIZ2.LJJIIJZLJL(jSONObject);
            c474500IjALIZ2.LJJIIJZLJL(jSONObject3);
            c474500IjALIZ2.LIZ();
        }
    }

    public static void LJIIJJI(C1131790fYf c1131790fYf, C1130140fW0 c1130140fW0, C1129710fVJ c1129710fVJ, C1128640fTa c1128640fTa, long j, long j2, String str, int i, boolean z, int i2) throws JSONException {
        String str2;
        int i3;
        int i4 = i;
        long j3 = j;
        if ((i2 & 16) != 0) {
            j3 = 0;
        }
        if ((i2 & 128) != 0) {
            i4 = 0;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("panel_stay_time", j3);
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
            jSONObject.put("retry_view_count", i4);
            jSONObject.put("initialize_gift_panel_leaf_duration", c1128640fTa.LIZ);
            jSONObject.put("update_gift_pages_duration", c1128640fTa.LIZIZ);
            jSONObject.put("load_visible_image_duration", c1128640fTa.LIZJ);
            jSONObject.put("add_gift_panel_leaf_duration", c1128640fTa.LIZLLL);
            jSONObject.put("add_top_sub_leaf_duration", c1128640fTa.LJ);
            jSONObject.put("add_bottom_sub_leaf_duration", c1128640fTa.LJFF);
            jSONObject.put("add_match_tray_leaf_duration", c1128640fTa.LJI);
            jSONObject.put("add_bubble_sub_leaf_duration", c1128640fTa.LJII);
            jSONObject.put("top_banner_on_start_duration", c1128640fTa.LJIIIIZZ);
            jSONObject.put("request_panel_id", c1131790fYf.LIZ);
            C1135800ff8.LIZ(C1697810uHb.LJIIJJI("enter_from_merge", "enter_method", "anchor_id", "room_id", "action_type", "send_gift_scene", "has_coin"), jSONObject);
            if (z) {
                str2 = "tux_dropdown";
            } else {
                str2 = "default";
            }
            jSONObject.put("close_type", str2);
            jSONObject2.put("is_anchor", LIZIZ());
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
            jSONObject2.put("upload_opportunity", 0);
            jSONObject3.put("error_msg", c1130140fW0.LIZIZ);
            jSONObject3.put("error_code", c1130140fW0.LIZJ);
            C1123380fL6.LIZ(jSONObject3);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("GiftPerformanceMonitor", String.valueOf(e.getMessage()));
        }
        C1134970fdn.LIZ(jSONObject3);
        C1135800ff8.LJIILJJIL(jSONObject2, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_dismiss");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LIZ();
        C1CC2.LJ("gift_panel_dismiss", jSONObject2, jSONObject, jSONObject3);
        C1130450fWV.LIZ.storeBoolean("sp_is_gift_panel_dismiss_uploaded", true);
    }

    public static void LJI(final int i, final int i2, final int i3, final long j, final long j2, final long j3, final Long l, final Long l2, final String str, final String str2, final String str3, final String str4, final String str5, final Map map, final boolean z) {
        C1138350fjF.LJI(new Runnable() { // from class: X.0fe6
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GiftPerformanceMonitor@6dca.onGiftAssetDownloadStartInternal$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GiftPerformanceMonitor@6dca.onGiftAssetDownloadStartInternal$1");
            }

            public final void LIZ() throws Throwable {
                long jLIZ = C2193608ic.LIZ();
                JSONObject jSONObject = new JSONObject();
                int i4 = i2;
                long j4 = j2;
                String str6 = str2;
                Map<String, String> map2 = map;
                jSONObject.put("asset_type", i4);
                jSONObject.put("download_assets_from", j4);
                jSONObject.put("resource_format", str6);
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                JSONObject jSONObject2 = new JSONObject();
                long j5 = j;
                String str7 = str3;
                String str8 = str4;
                Long l3 = l;
                Long l4 = l2;
                int i5 = i;
                int i6 = i2;
                long j6 = j2;
                String str9 = str2;
                int i7 = i3;
                boolean z2 = z;
                Map<String, String> map3 = map;
                jSONObject2.put("asset_id", j5);
                jSONObject2.put("resource_bytevc1_url", str7);
                jSONObject2.put("urls", str8);
                jSONObject2.put("free_disksize", jLIZ);
                jSONObject2.put("prepare_available_duration", (l3 != null ? l3.longValue() : 0L) + (l4 != null ? l4.longValue() : 0L));
                jSONObject2.put("prepare_download_duration", l3);
                jSONObject2.put("download_process_duration", l4);
                jSONObject2.put("error_type", i5);
                jSONObject2.put("asset_type", i6);
                jSONObject2.put("download_assets_from", j6);
                jSONObject2.put("resource_format", str9);
                jSONObject2.put("retry_count", i7);
                jSONObject2.put("immediate_download", z2 ? 1 : 0);
                for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                    jSONObject2.put(entry2.getKey(), entry2.getValue());
                }
                JSONObject jSONObject3 = new JSONObject();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gift_asset_download_start");
                sbLIZ.append(str);
                C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIJZLJL(jSONObject);
                c474500IjALIZ.LJJIIJZLJL(jSONObject2);
                c474500IjALIZ.LJJII(Integer.valueOf(C1131070fXV.LIZIZ()), "is_anchor");
                c474500IjALIZ.LJJII(Integer.valueOf(i2), "asset_type");
                c474500IjALIZ.LJJII(Long.valueOf(j2), "download_assets_from");
                c474500IjALIZ.LJJII(str2, "resource_format");
                c474500IjALIZ.LJJII(Long.valueOf(j), "asset_id");
                c474500IjALIZ.LJJII(str3, "resource_bytevc1_url");
                c474500IjALIZ.LJJII(str4, "urls");
                c474500IjALIZ.LJJII(str5, "remote_md5");
                c474500IjALIZ.LJJII(Long.valueOf(j3), "remote_filesize");
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "free_disksize");
                c474500IjALIZ.LJJII(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL(), "overload_score");
                c474500IjALIZ.LIZ();
                if (i == 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("gift_asset_download_start");
                    sbLIZ2.append(str);
                    C1CC2.LJ(C2188811AlT.LIZIZ(sbLIZ2), jSONObject, jSONObject3, jSONObject2);
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("gift_asset_download_start");
                sbLIZ3.append(str);
                C1CC2.LIZJ(C2188811AlT.LIZIZ(sbLIZ3), jSONObject, jSONObject3, jSONObject2);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("gift_asset_download_start_error");
                sbLIZ4.append(str);
                C1CC2.LJ(C2188811AlT.LIZIZ(sbLIZ4), jSONObject, jSONObject3, jSONObject2);
            }
        });
    }

    public static void LJ(long j, long j2, Long l, Long l2, String str, String str2, String str3, int i, String str4, int i2, String str5, String str6, Long l3, long j3, Map map, int i3, boolean z, int i4) {
        Integer numLJIIJJI;
        boolean z2 = z;
        int i5 = i3;
        int i6 = i;
        Long l4 = l3;
        String str7 = str5;
        String str8 = str4;
        if ((i4 & 128) != 0) {
            i6 = 0;
        }
        if ((i4 & 256) != 0) {
            str8 = "";
        }
        if ((i4 & 1024) != 0) {
            str7 = "null";
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            l4 = 0L;
        }
        if ((32768 & i4) != 0) {
            i5 = 0;
        }
        if ((i4 & 65536) != 0) {
            z2 = false;
        }
        String str9 = (String) map.get("is_own_send");
        if (str9 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str9)) != null && numLJIIJJI.intValue() == 1) {
            LJFF(i6, i2, i5, j, j2, j3, l, l2, l4, "_self", str, str2, str3, str8, str7, str6, map, z2);
            if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
                return;
            }
        } else if (C2640010k.LIZIZ()) {
            LJFF(i6, i2, i5, j, j2, j3, l, l2, l4, "_anchor", str, str2, str3, str8, str7, str6, map, z2);
            if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
                return;
            }
        } else if (C1128450fTH.LJJIJ()) {
            LJFF(i6, i2, i5, j, j2, j3, l, l2, l4, "_guest", str, str2, str3, str8, str7, str6, map, z2);
            if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
                return;
            }
        }
        LJFF(i6, i2, i5, j, j2, j3, l, l2, l4, "", str, str2, str3, str8, str7, str6, map, z2);
    }

    public static final void LJFF(final int i, final int i2, final int i3, final long j, final long j2, final long j3, final Long l, final Long l2, final Long l3, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final Map map, final boolean z) {
        C1138350fjF.LJI(new Runnable() { // from class: X.0fe7
            public final void LIZ() throws JSONException {
                long jLIZ = i == 0 ? 0L : C2193608ic.LIZ();
                JSONObject jSONObject = new JSONObject();
                Long l4 = l;
                Long l5 = l2;
                jSONObject.put("prepare_available_duration", (l4 != null ? l4.longValue() : 0L) + (l5 != null ? l5.longValue() : 0L));
                jSONObject.put("prepare_download_duration", l4);
                jSONObject.put("download_process_duration", l5);
                JSONObject jSONObject2 = new JSONObject();
                int i4 = i;
                String str8 = str5;
                int i5 = i2;
                long j4 = j2;
                String str9 = str2;
                Map<String, String> map2 = map;
                jSONObject2.put("error_type", i4);
                jSONObject2.put("error_msg", str8);
                jSONObject2.put("asset_type", i5);
                jSONObject2.put("download_assets_from", j4);
                jSONObject2.put("resource_format", str9);
                C1135180fe8.LIZ(jSONObject2);
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                JSONObject jSONObject3 = new JSONObject();
                long j5 = j;
                String str10 = str3;
                String str11 = str4;
                String str12 = str5;
                int i6 = i;
                String str13 = str6;
                String str14 = str7;
                Long l6 = l3;
                long j6 = j3;
                Long l7 = l;
                Long l8 = l2;
                int i7 = i2;
                long j7 = j2;
                String str15 = str2;
                int i8 = i3;
                boolean z2 = z;
                Map<String, String> map3 = map;
                jSONObject3.put("asset_id", j5);
                jSONObject3.put("resource_bytevc1_url", str10);
                jSONObject3.put("urls", str11);
                jSONObject3.put("error_msg", str12);
                jSONObject3.put("error_code", i6);
                jSONObject3.put("local_md5", str13);
                jSONObject3.put("remote_md5", str14);
                jSONObject3.put("local_filesize", l6);
                jSONObject3.put("remote_filesize", j6);
                jSONObject3.put("free_disksize", jLIZ);
                jSONObject3.put("prepare_available_duration", (l7 != null ? l7.longValue() : 0L) + (l8 != null ? l8.longValue() : 0L));
                jSONObject3.put("prepare_download_duration", l7);
                jSONObject3.put("download_process_duration", l8);
                jSONObject3.put("error_type", i6);
                jSONObject3.put("asset_type", i7);
                jSONObject3.put("download_assets_from", j7);
                jSONObject3.put("resource_format", str15);
                jSONObject3.put("retry_count", i8);
                jSONObject3.put("immediate_download", z2 ? 1 : 0);
                C1135180fe8.LIZ(jSONObject3);
                for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("gift_asset_download_status");
                sbLIZ.append(str);
                C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIJZLJL(jSONObject);
                c474500IjALIZ.LJJIIJZLJL(jSONObject2);
                c474500IjALIZ.LJJIIJZLJL(jSONObject3);
                c474500IjALIZ.LJJII(Integer.valueOf(C1131070fXV.LIZIZ()), "is_anchor");
                Long l9 = l;
                long jLongValue = l9 != null ? l9.longValue() : 0L;
                Long l10 = l2;
                c474500IjALIZ.LJJII(Long.valueOf(jLongValue + (l10 != null ? l10.longValue() : 0L)), "prepare_available_duration");
                c474500IjALIZ.LJJII(l, "prepare_download_duration");
                c474500IjALIZ.LJJII(l2, "download_process_duration");
                c474500IjALIZ.LJJII(Integer.valueOf(i), "error_type");
                c474500IjALIZ.LJJII(Integer.valueOf(i2), "asset_type");
                c474500IjALIZ.LJJII(Long.valueOf(j2), "download_assets_from");
                c474500IjALIZ.LJJII(str2, "resource_format");
                c474500IjALIZ.LJJII(Long.valueOf(j), "asset_id");
                c474500IjALIZ.LJJII(str3, "resource_bytevc1_url");
                c474500IjALIZ.LJJII(str4, "urls");
                c474500IjALIZ.LJJII(str6, "local_md5");
                c474500IjALIZ.LJJII(str7, "remote_md5");
                c474500IjALIZ.LJJII(l3, "local_filesize");
                c474500IjALIZ.LJJII(Long.valueOf(j3), "remote_filesize");
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "free_disksize");
                c474500IjALIZ.LJJII(Integer.valueOf(i3), "retry_count");
                C1135180fe8.LIZIZ(c474500IjALIZ);
                c474500IjALIZ.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("gift_asset_download_status");
                sbLIZ2.append(str);
                C1CC2.LJ(C2188811AlT.LIZIZ(sbLIZ2), jSONObject2, jSONObject, jSONObject3);
                if (i != 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(C1132930faV.LIZ("gift_asset_download_status"));
                    sbLIZ3.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    C1CC2.LJ(strLIZIZ, jSONObject2, jSONObject, jSONObject3);
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ(strLIZIZ);
                    c474500IjALIZ2.LJJIIJZLJL(jSONObject2);
                    c474500IjALIZ2.LJJIIJZLJL(jSONObject);
                    c474500IjALIZ2.LJJIIJZLJL(jSONObject3);
                    c474500IjALIZ2.LIZ();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GiftPerformanceMonitor@6dca.onGiftAssetDownloadInternal$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GiftPerformanceMonitor@6dca.onGiftAssetDownloadInternal$1");
            }
        });
    }
}
