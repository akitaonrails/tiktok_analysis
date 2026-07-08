package X;

import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0BdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C292560BdO {
    public static boolean LIZ;
    public static final InterfaceC307670C4f LIZIZ;
    public static final boolean LIZJ;
    public static final List<String> LIZLLL;
    public static final Map<String, String> LJ;
    public static final ConcurrentHashMap<Object, Boolean> LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;

    static {
        C0C58 c0c58 = C0C58.LIZJ;
        InterfaceC307670C4f interfaceC307670C4fLJIIIIZZ = c0c58.LIZ.LJIIIIZZ();
        if (!(interfaceC307670C4fLJIIIIZZ instanceof C308110C5x)) {
            interfaceC307670C4fLJIIIIZZ = new C307660C4e(interfaceC307670C4fLJIIIIZZ);
        }
        LIZIZ = interfaceC307670C4fLJIIIIZZ;
        LIZJ = c0c58.LIZIZ;
        LIZLLL = new ArrayList();
        LJ = new LinkedHashMap();
        LJFF = new ConcurrentHashMap<>();
        LJI = C452501pT.LIZIZ(new C292630BdV());
        LJII = C452501pT.LIZIZ(new C292710Bdd());
    }

    public static void LIZIZ() {
        LJFF.remove(Integer.valueOf(Thread.currentThread().hashCode()));
    }

    public static String LJFF() {
        Object objCall;
        try {
            objCall = new C0C6T() { // from class: X.0BeE
                @Override // X.C0C6T
                public final Object call() {
                    String[] strArrLJI;
                    InterfaceC307670C4f interfaceC307670C4f = C292560BdO.LIZIZ;
                    if (interfaceC307670C4f == null) {
                        interfaceC307670C4f = null;
                    }
                    String[] strArrLJI2 = interfaceC307670C4f.LJI("__client_exp_vids", new String[0]);
                    Object[] array = strArrLJI2;
                    if (C292560BdO.LIZ) {
                        ArrayList arrayList = new ArrayList();
                        for (String str : strArrLJI2) {
                            if (C292560BdO.LJIIJ("client_expose_vid", str)) {
                                arrayList.add(str);
                            }
                        }
                        array = arrayList.toArray(new String[0]);
                    }
                    InterfaceC307670C4f interfaceC307670C4f2 = C292560BdO.LIZIZ;
                    if (interfaceC307670C4f2 == null) {
                        interfaceC307670C4f2 = null;
                    }
                    String[] strArrLJI3 = interfaceC307670C4f2.LJI("__exposed_vids", new String[0]);
                    Object[] array2 = strArrLJI3;
                    if (C292560BdO.LIZ) {
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : strArrLJI3) {
                            if (C292560BdO.LJIIJ("normal_expose_vid", str2)) {
                                arrayList2.add(str2);
                            }
                        }
                        array2 = arrayList2.toArray(new String[0]);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    C19719612Di.LJJII(arrayList3, array);
                    C19719612Di.LJJII(arrayList3, array2);
                    if (C0C5A.LIZJ().LJ != null) {
                        boolean z = C292560BdO.LIZ;
                        if (C0C5A.LIZJ().LJ != null) {
                            String strLJI = C292560BdO.LJI();
                            InterfaceC307670C4f interfaceC307670C4f3 = C292560BdO.LIZIZ;
                            InterfaceC307670C4f interfaceC307670C4f4 = interfaceC307670C4f3 != null ? interfaceC307670C4f3 : null;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("{__exposed_vids_for_current_user}_{");
                            sbLIZ.append(strLJI);
                            sbLIZ.append('}');
                            strArrLJI = interfaceC307670C4f4.LJI(C2188811AlT.LIZIZ(sbLIZ), new String[0]);
                        } else {
                            strArrLJI = new String[0];
                        }
                        Object[] array3 = strArrLJI;
                        if (C292560BdO.LIZ) {
                            ArrayList arrayList4 = new ArrayList();
                            for (String str3 : strArrLJI) {
                                if (C292560BdO.LJIIJ("current_user_expose_vid", str3)) {
                                    arrayList4.add(str3);
                                }
                            }
                            array3 = arrayList4.toArray(new String[0]);
                        }
                        C19719612Di.LJJII(arrayList3, array3);
                    }
                    String[] strArrLJII = C292560BdO.LJII();
                    Object[] array4 = strArrLJII;
                    if (C292560BdO.LIZ) {
                        ArrayList arrayList5 = new ArrayList();
                        for (String str4 : strArrLJII) {
                            if (C292560BdO.LJIIJ("extra_expose_vid", str4)) {
                                arrayList5.add(str4);
                            }
                        }
                        array4 = arrayList5.toArray(new String[0]);
                    }
                    C19719612Di.LJJII(arrayList3, array4);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ConcurrentHashMap<String, C293180BeO> concurrentHashMap = C293180BeO.LJ;
                    synchronized (concurrentHashMap) {
                        try {
                            Iterator<Map.Entry<String, C293180BeO>> it2 = concurrentHashMap.entrySet().iterator();
                            while (it2.hasNext()) {
                                C293180BeO value = it2.next().getValue();
                                String[] strArr = (String[]) ((C293230BeT) value.LIZLLL.getValue()).LIZIZ.toArray(new String[0]);
                                C293230BeT c293230BeTLIZIZ = value.LIZIZ();
                                if (c293230BeTLIZIZ != null) {
                                    strArr = (String[]) C13DL.LJIIIZ(strArr, (String[]) c293230BeTLIZIZ.LIZIZ.toArray(new String[0]));
                                }
                                C19719612Di.LJJII(linkedHashSet, strArr);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    Object obj = linkedHashSet;
                    if (C292560BdO.LIZ) {
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj2 : linkedHashSet) {
                            if (C292560BdO.LJIIJ("combine_expose_vid", (String) obj2)) {
                                arrayList6.add(obj2);
                            }
                        }
                        obj = arrayList6;
                    }
                    arrayList3.addAll(obj);
                    return C13LP.LJJLIIIJ(new HashSet(arrayList3), ",", null, null, 0, null, null, 62);
                }
            }.call();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append("");
            C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
            objCall = null;
        }
        String str = (String) objCall;
        return str != null ? str : "";
    }

    public static String[] LJII() {
        C292830Bdp c292830Bdp = (C292830Bdp) LJI.getValue();
        String[] strArr = (String[]) c292830Bdp.LJ.LIZIZ.toArray(new String[0]);
        C293230BeT c293230BeTLIZ = c292830Bdp.LIZ();
        return c293230BeTLIZ != null ? (String[]) C13DL.LJIIIZ(strArr, c293230BeTLIZ.LIZIZ.toArray(new String[0])) : strArr;
    }

    public static void LJIIIZ() {
        ArrayList arrayList = (ArrayList) LIZLLL;
        arrayList.add("ac_reuse_permission_switch");
        arrayList.add("analytics_reverse_exp_long_term");
        arrayList.add("chat_list_loading_opt");
        arrayList.add("creator_inbox_blue_dot");
        arrayList.add("creator_inbox_dm_edit_mode");
        arrayList.add("creator_inbox_dm_tab_name");
        arrayList.add("creator_inbox_dm_tab_unread_new");
        arrayList.add("creator_inbox_dot_count");
        arrayList.add("creator_inbox_follower_activity_merge");
        arrayList.add("creator_inbox_preload");
        arrayList.add("creator_inbox_request_red_dot");
        arrayList.add("creator_inbox_request_unread_new");
        arrayList.add("dm_archive_enable");
        arrayList.add("dm_avatar_live_enter_room_with_stream_data");
        arrayList.add("dm_b2C_business_indicator_add_resp_time");
        arrayList.add("dm_b2c_feedback_aibot_message");
        arrayList.add("dm_page_show_live_room_polling_time");
        arrayList.add("dm_push_user_alter");
        arrayList.add("dm_unread_dot_display_degrade_strategy");
        arrayList.add("ec_anchor_bottom_button_popular_video_config");
        arrayList.add("ec_anchor_comment_reviews_enable");
        arrayList.add("ec_anchor_comment_reviews_enable_ads");
        arrayList.add("ec_anchor_consumer_photo_mode_enable");
        arrayList.add("ec_anchor_creator_photo_mode_enable");
        arrayList.add("ec_anchor_creator_recommend_products");
        arrayList.add("ec_anchor_show_add_product_bottom_button");
        arrayList.add("ec_anchor_show_add_product_bottom_button_entrance_black_list");
        arrayList.add("ec_enable_auto_check_accurate");
        arrayList.add("ec_mall_default_landing_shoptab");
        arrayList.add("ec_pdp_ai_assistant_show");
        arrayList.add("ec_pdp_filter_sku_options_on_cache_switch");
        arrayList.add("ec_pdp_lockup_framework_upgrade");
        arrayList.add("ec_pdp_pip_ui_enhancement");
        arrayList.add("ec_search_live_vol_optimize");
        arrayList.add("ec_search_middle_guess_optimize");
        arrayList.add("ec_seo_empty_track_params_judge_fix_enable");
        arrayList.add("ec_trace_parent_enable");
        arrayList.add("ec_video_publish_add_anchor_force_single");
        arrayList.add("ecom_cart_vibrate");
        arrayList.add("ecom_review_gallery_video_optimize_config");
        arrayList.add("ecom_sticker_category");
        arrayList.add("enable_activity_priority");
        arrayList.add("enable_inbox_activity_classification");
        arrayList.add("enable_live_highlight_playlist_notice");
        arrayList.add("enable_pro_inbox_tab_list_optimization");
        arrayList.add("enable_top_creator_list");
        arrayList.add("enable_unlimited_story_replies");
        arrayList.add("fix_album_content_new_flag_leak");
        arrayList.add("iap_merchant_id_live_event");
        arrayList.add("iap_merchant_id_minis");
        arrayList.add("im_business_indicator_single_chat");
        arrayList.add("im_business_insights_entrance_enable");
        arrayList.add("im_camera_in_group_chat");
        arrayList.add("im_creator_inbox_switch_strategy");
        arrayList.add("im_enable_group_history_visibility");
        arrayList.add("im_light_interaction_sayhi_expiration");
        arrayList.add("im_light_interaction_view_list_disappear");
        arrayList.add("im_message_request_spam_filter");
        arrayList.add("im_show_group_camera_entrance");
        arrayList.add("imsdk_enable_set_media_vod_region");
        arrayList.add("inbox_banner_platform_v2");
        arrayList.add("inbox_banner_reverse");
        arrayList.add("inbox_bb_archive_enable");
        arrayList.add("inbox_business_fold_skylight_enabled");
        arrayList.add("inbox_count_unread_by_cell");
        arrayList.add("inbox_creator_fold_skylight_enabled");
        arrayList.add("inbox_entrance_show_track_opt");
        arrayList.add("inbox_shop_entry_migration_config");
        arrayList.add("inspiration_3_0_release");
        arrayList.add("invite_and_share_settings");
        arrayList.add("link_reflow_optimistic_ui");
        arrayList.add("linkmic_voice_chat_layout_config");
        arrayList.add("live_ai_summary_config");
        arrayList.add("live_ai_summary_config_v2");
        arrayList.add("live_ai_summary_typewriter_anim_config");
        arrayList.add("live_anim_entry_curve_exp");
        arrayList.add("live_funder_preview_exp");
        arrayList.add("live_highlight_aisummary_show_delay_time_ms");
        arrayList.add("live_highlight_aisummary_show_opt");
        arrayList.add("live_hot_room_parallel_stream_exp");
        arrayList.add("live_link_relation_config");
        arrayList.add("live_pcs_new_leads_awareness_enable");
        arrayList.add("live_podcast_api_pre_request_exp");
        arrayList.add("live_podcast_hot_start_pre_request_config");
        arrayList.add("live_preview_card_recycle_config");
        arrayList.add("live_preview_card_recycle_list_opt");
        arrayList.add("live_preview_comment_box_config");
        arrayList.add("live_preview_cta_delay_experiment");
        arrayList.add("live_preview_dynamic_pre_pull_config");
        arrayList.add("live_preview_follow_guide_setting");
        arrayList.add("live_preview_guide_style_setting");
        arrayList.add("live_preview_interaction_message");
        arrayList.add("live_preview_smb_info_setting");
        arrayList.add("live_psc_opt_in_preload");
        arrayList.add("live_replace_inbox_poll_check");
        arrayList.add("live_replay_preload_opt_config");
        arrayList.add("live_smb_ai_summary_config");
        arrayList.add("live_user_parallel_stream_uid_exp");
        arrayList.add("live_video_feed_author_avatar_on_live_anim_start_fix");
        arrayList.add("live_video_feed_avatar_live_anim_logic_opt");
        arrayList.add("message_request_new_edit_mode");
        arrayList.add("mute_strip_profile_banner");
        arrayList.add("not_close_comment_when_paused");
        arrayList.add("opt_inbox_chat_label_exp");
        arrayList.add("osp_open_dialog_while_has_operation");
        arrayList.add("pdp_first_screen_perf_opt");
        arrayList.add("poi_autofill_precise");
        arrayList.add("post_process_ui_optimize");
        arrayList.add("preview_live_end_optimize");
        arrayList.add("professional_business_inbox_strategy");
        arrayList.add("professional_creator_inbox");
        arrayList.add("remove_like_list_permission_empty_hint");
        arrayList.add("remove_set_as_default_tips_type");
        arrayList.add("search_animated_cover_enabled");
        arrayList.add("search_haptic_after_show_result");
        arrayList.add("show_toplive_hangout_module");
        arrayList.add("smart_reply_creator");
        arrayList.add("story_thought_configs_api_optimization");
        arrayList.add("subscription_mvp_sticker_is_enabled");
        arrayList.add("tiktok_live_inbox_2_following_guide_type");
        arrayList.add("tt_album_diversion_cc_config");
        arrayList.add("tt_dm_light_interaction_reversal");
        arrayList.add("tt_im_business_inbox_tab_list_selector_revamp");
        arrayList.add("tt_im_enable_b2c_auto_reply_optimization");
        arrayList.add("tt_im_pro_creator_inbox_tab_list_selector_revamp");
        arrayList.add("uid_precise_exp_share");
        arrayList.add("verify_proaccount_precise_exp");
    }

    public static void LJ() {
        String strLJFF = LJFF();
        InterfaceC292790Bdl interfaceC292790Bdl = C0C5A.LIZJ().LJ;
        if (interfaceC292790Bdl != null) {
            interfaceC292790Bdl.LIZJ(strLJFF);
        }
    }

    public static String LJI() {
        InterfaceC292790Bdl interfaceC292790Bdl = C0C5A.LIZJ().LJ;
        String currentUid = interfaceC292790Bdl != null ? interfaceC292790Bdl.getCurrentUid() : null;
        if (currentUid == null) {
            currentUid = "";
        }
        return (TextUtils.isEmpty(currentUid) || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, currentUid)) ? "" : currentUid;
    }

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            ConcurrentHashMap<Object, Boolean> concurrentHashMap = LJFF;
            if (!concurrentHashMap.containsKey(Integer.valueOf(Thread.currentThread().hashCode())) && concurrentHashMap.containsKey(str)) {
                concurrentHashMap.remove(str);
                LJIILLIIL(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th);
            sbLIZ2.append("--message: ");
            sbLIZ2.append(strLIZIZ);
            C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
        }
    }

    public static void LIZJ(String str) {
        try {
            InterfaceC307670C4f interfaceC307670C4f = LIZIZ;
            if (interfaceC307670C4f == null) {
                interfaceC307670C4f = null;
            }
            interfaceC307670C4f.LIZ(str);
            if (LIZJ) {
                ((Set) LJII.getValue()).remove(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append("");
            C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public static void LJIIJJI(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC307670C4f interfaceC307670C4f = null;
        if (z) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            InterfaceC307670C4f interfaceC307670C4f2 = LIZIZ;
            if (interfaceC307670C4f2 != null) {
                interfaceC307670C4f = interfaceC307670C4f2;
            }
            interfaceC307670C4f.LJII("__client_exp_vids", (String[]) listLJJLIIIJILLIZJL.toArray(new String[0]));
            return;
        }
        InterfaceC307670C4f interfaceC307670C4f3 = LIZIZ;
        if (interfaceC307670C4f3 != null) {
            interfaceC307670C4f = interfaceC307670C4f3;
        }
        interfaceC307670C4f.LJII("__client_exp_vids", new String[0]);
    }

    public static void LJIIL(final String[] strArr) {
        try {
            new C0C6T() { // from class: X.0Bdn
                @Override // X.C0C6T
                public final Object call() {
                    String[] strArr2 = strArr;
                    InterfaceC307670C4f interfaceC307670C4f = C292560BdO.LIZIZ;
                    if (interfaceC307670C4f == null) {
                        interfaceC307670C4f = null;
                    }
                    ArrayList arrayList = (ArrayList) C13LQ.LJLI(interfaceC307670C4f.LJI("__exposed_vids", new String[0]));
                    Iterator it2 = arrayList.iterator();
                    boolean z = false;
                    while (it2.hasNext()) {
                        if (!C292560BdO.LJ.containsKey(it2.next())) {
                            it2.remove();
                            z = true;
                        }
                    }
                    String strLJI = C292560BdO.LJI();
                    InterfaceC307670C4f interfaceC307670C4f2 = C292560BdO.LIZIZ;
                    if (interfaceC307670C4f2 == null) {
                        interfaceC307670C4f2 = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("{__exposed_vids_for_current_user}_{");
                    sbLIZ.append(strLJI);
                    sbLIZ.append('}');
                    ArrayList arrayList2 = (ArrayList) C13LQ.LJLI(interfaceC307670C4f2.LJI(C2188811AlT.LIZIZ(sbLIZ), new String[0]));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        if (!C292560BdO.LJ.containsKey(it3.next())) {
                            it3.remove();
                            z = true;
                        }
                    }
                    if (z) {
                        InterfaceC307670C4f interfaceC307670C4f3 = C292560BdO.LIZIZ;
                        (interfaceC307670C4f3 == null ? null : interfaceC307670C4f3).LJII("__exposed_vids", (String[]) arrayList.toArray(new String[0]));
                        if (interfaceC307670C4f3 == null) {
                            interfaceC307670C4f3 = null;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("{__exposed_vids_for_current_user}_{");
                        sbLIZ2.append(strLJI);
                        sbLIZ2.append('}');
                        interfaceC307670C4f3.LJII(C2188811AlT.LIZIZ(sbLIZ2), (String[]) arrayList2.toArray(new String[0]));
                    }
                    C292830Bdp c292830Bdp = (C292830Bdp) C292560BdO.LJI.getValue();
                    String strLJJJ = strArr2 != null ? C13LQ.LJJJ(strArr2, ",", null, null, null, 62) : null;
                    c292830Bdp.getClass();
                    List<String> listLIZIZ = C292830Bdp.LIZIZ(strLJJJ);
                    if (listLIZIZ != null) {
                        c292830Bdp.LJ.LIZJ(listLIZIZ);
                        C293230BeT c293230BeTLIZ = c292830Bdp.LIZ();
                        if (c293230BeTLIZ != null) {
                            c293230BeTLIZ.LIZJ(listLIZIZ);
                        }
                    }
                    C292560BdO.LJ();
                    return Unit.LIZ;
                }
            }.call();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append("");
            C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public static void LJIILLIIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            ArrayList arrayList = (ArrayList) LIZLLL;
            if (arrayList.isEmpty()) {
                LJIIIZ();
            }
            ConcurrentHashMap<Object, Boolean> concurrentHashMap = LJFF;
            if (concurrentHashMap.containsKey(Integer.valueOf(Thread.currentThread().hashCode()))) {
                if (((HashMap) C2502809rO.LIZIZ).containsKey(str)) {
                    concurrentHashMap.put(str, Boolean.TRUE);
                    return;
                }
                return;
            }
            LIZLLL(str, arrayList.contains(str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th);
            sbLIZ2.append("--message: ");
            sbLIZ2.append(strLIZIZ);
            C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
        }
    }

    public static void LIZLLL(final String str, final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            new C0C6T() { // from class: X.0Bdm
                @Override // X.C0C6T
                public final Object call() {
                    boolean zContains;
                    String str2 = str;
                    boolean z2 = z;
                    if (((ArrayList) C292560BdO.LIZLLL).isEmpty()) {
                        C292560BdO.LJIIIZ();
                    }
                    if (C292560BdO.LIZJ) {
                        zContains = ((Set) C292560BdO.LJII.getValue()).contains(str2);
                    } else {
                        InterfaceC307670C4f interfaceC307670C4f = C292560BdO.LIZIZ;
                        if (interfaceC307670C4f == null) {
                            interfaceC307670C4f = null;
                        }
                        zContains = interfaceC307670C4f.contains(str2);
                    }
                    if (zContains) {
                        String strLJI = C292560BdO.LJI();
                        if (z2) {
                            InterfaceC307670C4f interfaceC307670C4f2 = C292560BdO.LIZIZ;
                            InterfaceC307670C4f interfaceC307670C4f3 = interfaceC307670C4f2 == null ? null : interfaceC307670C4f2;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("{__exposed_vids_for_current_user}_{");
                            sbLIZ2.append(strLJI);
                            sbLIZ2.append('}');
                            String[] strArrLJI = interfaceC307670C4f3.LJI(C2188811AlT.LIZIZ(sbLIZ2), new String[0]);
                            String string = (interfaceC307670C4f2 == null ? null : interfaceC307670C4f2).getString(str2, "");
                            if (string.length() > 0 && !C13LQ.LJIILLIIL(string, strArrLJI)) {
                                ArrayList arrayList = (ArrayList) C13LQ.LJLI(strArrLJI);
                                arrayList.add(string);
                                InterfaceC307670C4f interfaceC307670C4f4 = interfaceC307670C4f2 != null ? interfaceC307670C4f2 : null;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("{__exposed_vids_for_current_user}_{");
                                sbLIZ3.append(strLJI);
                                sbLIZ3.append('}');
                                interfaceC307670C4f4.LJII(C2188811AlT.LIZIZ(sbLIZ3), (String[]) arrayList.toArray(new String[0]));
                                C292560BdO.LJ();
                            }
                        } else {
                            InterfaceC307670C4f interfaceC307670C4f5 = C292560BdO.LIZIZ;
                            String[] strArrLJI2 = (interfaceC307670C4f5 == null ? null : interfaceC307670C4f5).LJI("__exposed_vids", new String[0]);
                            String string2 = (interfaceC307670C4f5 == null ? null : interfaceC307670C4f5).getString(str2, "");
                            if (string2.length() > 0 && !C13LQ.LJIILLIIL(string2, strArrLJI2)) {
                                ArrayList arrayList2 = (ArrayList) C13LQ.LJLI(strArrLJI2);
                                arrayList2.add(string2);
                                (interfaceC307670C4f5 != null ? interfaceC307670C4f5 : null).LJII("__exposed_vids", (String[]) arrayList2.toArray(new String[0]));
                                C292560BdO.LJ();
                            }
                        }
                    }
                    return Unit.LIZ;
                }
            }.call();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th);
            sbLIZ2.append("--message: ");
            sbLIZ2.append(strLIZIZ);
            C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
        }
    }

    public static void LJIIIIZZ(boolean z, String[] strArr) {
        try {
            if (((ArrayList) LIZLLL).isEmpty()) {
                LJIIIZ();
            }
            if (!z) {
                LJIIL(strArr);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append("");
            C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
        try {
            LJ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C0C46.LIZIZ("PreciseExposureManager", new Throwable("cause: " + th2 + "--message: ", th2));
        }
    }

    public static boolean LJIIJ(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return true;
        }
        boolean zMatches = new Regex("^[0-9, ]+$").matches(str2);
        if (!zMatches) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exposure vid is invalid, source: ");
            sbLIZ.append(str);
            sbLIZ.append(", vids: ");
            sbLIZ.append(C13LN.LJZL(50, str2));
            Npth.reportBizException("ABMock", new Throwable(C2188811AlT.LIZIZ(sbLIZ)), "PreciseExposureManager", null);
        }
        return zMatches;
    }

    public static void LJIILIIL(n nVar, String str) {
        k kVarLJJIIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            LJIILJJIL(nVar, str);
            n nVarLJJIJ = nVar.LJJIJ(str);
            if (nVarLJJIJ != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("val")) != null) {
                C0C4Y.LIZJ.LJIILJJIL(str, kVarLJJIIZ.toString());
            } else if (nVar.LJJIJIIJIL(str)) {
                C0C4Y.LIZJ.LJIILJJIL(str, null);
            } else {
                C0C4Y.LIZJ.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th);
            sbLIZ2.append("--message: ");
            sbLIZ2.append(strLIZIZ);
            C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
        }
    }

    public static void LJIILJJIL(final n nVar, final String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key:");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            new C0C6T() { // from class: X.0Bdj
                @Override // X.C0C6T
                public final Object call() {
                    q qVarLJJIJIIJI;
                    q qVarLJJIJIIJI2;
                    n nVar2 = nVar;
                    String str2 = str;
                    if (nVar2.LJJIJ(str2) == null) {
                        return Unit.LIZ;
                    }
                    n nVarLJJIJ = nVar2.LJJIJ(str2);
                    String strLJIL = (nVarLJJIJ == null || (qVarLJJIJIIJI2 = nVarLJJIJ.LJJIJIIJI("vid")) == null) ? null : qVarLJJIJIIJI2.LJIL();
                    n nVarLJJIJ2 = nVar2.LJJIJ(str2);
                    String strLJIL2 = (nVarLJJIJ2 == null || (qVarLJJIJIIJI = nVarLJJIJ2.LJJIJIIJI("type")) == null) ? null : qVarLJJIJIIJI.LJIL();
                    boolean z = C292560BdO.LIZ;
                    if (strLJIL == null || strLJIL2 == null || !Intrinsics.LJFF("1", strLJIL2)) {
                        InterfaceC307670C4f interfaceC307670C4f = C292560BdO.LIZIZ;
                        if ((interfaceC307670C4f == null ? null : interfaceC307670C4f).contains(str2)) {
                            (interfaceC307670C4f != null ? interfaceC307670C4f : null).LIZ(str2);
                            if (C292560BdO.LIZJ) {
                                ((Set) C292560BdO.LJII.getValue()).remove(str2);
                            }
                        }
                    } else {
                        InterfaceC307670C4f interfaceC307670C4f2 = C292560BdO.LIZIZ;
                        (interfaceC307670C4f2 != null ? interfaceC307670C4f2 : null).LIZIZ(str2, strLJIL);
                        if (C292560BdO.LIZJ) {
                            ((Set) C292560BdO.LJII.getValue()).add(str2);
                        }
                        C292560BdO.LJ.put(strLJIL, str2);
                    }
                    return Unit.LIZ;
                }
            }.call();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cause: ");
            sbLIZ2.append(th);
            sbLIZ2.append("--message: ");
            sbLIZ2.append(strLIZIZ);
            C0C46.LIZIZ(str, new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th));
        }
    }

    public static void LJIILL(String str, ConfigItem configItem, String str2) {
        if ((configItem != null || str2 != null) && str2 != null) {
            try {
                InterfaceC307670C4f interfaceC307670C4f = LIZIZ;
                if (interfaceC307670C4f == null) {
                    interfaceC307670C4f = null;
                }
                interfaceC307670C4f.LIZIZ(str, str2);
                if (LIZJ) {
                    ((Set) LJII.getValue()).add(str);
                }
                LJ.put(str2, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cause: ");
                sbLIZ.append(th);
                sbLIZ.append("--message: ");
                sbLIZ.append("");
                C0C46.LIZIZ("PreciseExposureManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
            }
        }
    }
}
