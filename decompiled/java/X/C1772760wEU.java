package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wEU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772760wEU {
    public static final C1772760wEU LIZ = new C1772760wEU();
    public static Map<String, ? extends Object> LIZIZ;
    public static String LIZJ;
    public static Long LIZLLL;

    public static void LIZIZ(C1772820wEa c1772820wEa) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", c1772820wEa.LIZIZ);
        linkedHashMap.put("gecko_url", c1772820wEa.LIZJ);
        linkedHashMap.put("gecko_version", c1772820wEa.LIZLLL);
        linkedHashMap.put("gecko_channel", c1772820wEa.LJ);
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(c1772820wEa.LIZ));
        linkedHashMap.put("is_offline", Integer.valueOf(c1772820wEa.LJFF ? 1 : 0));
        linkedHashMap.put("is_required", Integer.valueOf(c1772820wEa.LJI ? 1 : 0));
        if (c1772820wEa.LJIILJJIL) {
            i = 1;
        } else {
            i = 2;
        }
        linkedHashMap.put("is_first_load", Integer.valueOf(i));
        linkedHashMap.put("source", c1772820wEa.LJII);
        linkedHashMap.put("container_type", c1772820wEa.LJIIIIZZ);
        linkedHashMap.put("is_refresh_first_screen_show", Integer.valueOf(c1772820wEa.LJJIIZI ? 1 : 0));
        if (Intrinsics.LJFF(c1772820wEa.LJIIIIZZ, "lynx") && c1772820wEa.LJIILJJIL) {
            linkedHashMap.put("opt_remove_live_plugin", Integer.valueOf(c1772820wEa.LJJIJIIJI ? 1 : 0));
        }
        long j = c1772820wEa.LJIJJ;
        if (j > 0) {
            linkedHashMap.put("t_init_data_start", Long.valueOf(j));
        }
        long j2 = c1772820wEa.LJIJJLI;
        if (j2 > 0) {
            linkedHashMap.put("t_init_data_end", Long.valueOf(j2));
        }
        long j3 = c1772820wEa.LJIL;
        if (j3 > 0) {
            linkedHashMap.put("t_container_init_start", Long.valueOf(j3));
        }
        long j4 = c1772820wEa.LJJ;
        if (j4 > 0) {
            linkedHashMap.put("t_container_init_end", Long.valueOf(j4));
        }
        long j5 = c1772820wEa.LJJI;
        if (j5 > 0) {
            linkedHashMap.put("t_prepare_template_start", Long.valueOf(j5));
        }
        long j6 = c1772820wEa.LJJIFFI;
        if (j6 > 0) {
            linkedHashMap.put("t_prepare_template_end", Long.valueOf(j6));
        }
        long j7 = c1772820wEa.LJJII;
        if (j7 > 0) {
            linkedHashMap.put("t_create_lynx_view_start", Long.valueOf(j7));
        }
        long j8 = c1772820wEa.LJJIII;
        if (j8 > 0) {
            linkedHashMap.put("t_create_lynx_view_end", Long.valueOf(j8));
        }
        long j9 = c1772820wEa.LJJIIJ;
        if (j9 > 0) {
            linkedHashMap.put("t_load_template_start", Long.valueOf(j9));
        }
        long j10 = c1772820wEa.LJJIIJZLJL;
        if (j10 > 0) {
            linkedHashMap.put("t_load_template_end", Long.valueOf(j10));
        }
        long j11 = c1772820wEa.LJJIIZ;
        if (j11 > 0) {
            linkedHashMap.put("t_draw_end", Long.valueOf(j11));
        }
        long j12 = c1772820wEa.LJIIZILJ;
        if (j12 > 0 && c1772820wEa.LJIJ > 0) {
            linkedHashMap.put("t_cover_item_bind_start", Long.valueOf(j12));
            linkedHashMap.put("t_cover_item_bind_end", Long.valueOf(c1772820wEa.LJIJ));
        }
        String str = c1772820wEa.LJIJI;
        if (str != null) {
            linkedHashMap.put("super_item_type", str);
        }
        String str2 = c1772820wEa.LJIIIZ;
        if (str2 != null) {
            linkedHashMap.put("lynx_error", str2);
        }
        Integer num = c1772820wEa.LJIIJ;
        if (num != null) {
            linkedHashMap.put("error_code", Integer.valueOf(num.intValue()));
        }
        String str3 = c1772820wEa.LJIIJJI;
        if (str3 != null) {
            linkedHashMap.put("error_msg", str3);
        }
        linkedHashMap.put("is_predecode", Integer.valueOf(c1772820wEa.LJIIL ? 1 : 0));
        linkedHashMap.put("is_preload", Integer.valueOf(c1772820wEa.LJIILIIL ? 1 : 0));
        long j13 = c1772820wEa.LJIILL;
        if (j13 > 0) {
            linkedHashMap.put("t_update_start", Long.valueOf(j13));
        }
        long j14 = c1772820wEa.LJIILLIIL;
        if (j14 > 0) {
            linkedHashMap.put("t_update_end", Long.valueOf(j14));
        }
        JSONObject jSONObject = c1772820wEa.LJJIJ;
        if (jSONObject != null) {
            linkedHashMap.put("timing_api", jSONObject);
        }
        Map<String, ? extends Object> map = c1772820wEa.LJJIJIIJIL;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        Map<String, ? extends Object> map2 = LIZIZ;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        linkedHashMap.putAll(C2190491AoB.LIZ());
        Intrinsics.LJFF(c1772820wEa.LIZIZ, "feed_recommend_video_card");
        C1018703yb.LJ("rd_mixmall_perf_card_render", linkedHashMap);
    }

    public static Map LIZ(C1772750wET c1772750wET, String str) throws JSONException {
        Long lValueOf;
        Long lValueOf2;
        Object obj;
        Object obj2;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        Long lValueOf6;
        String str2;
        String strLJJLIIIJ;
        int i;
        boolean z;
        boolean z2;
        Integer num;
        Object obj3;
        if (c1772750wET.LJIILIIL > 0) {
            lValueOf = Long.valueOf(c1772750wET.LJIILIIL);
        } else {
            long j = c1772750wET.LJIIZILJ;
            if (j > 0) {
                lValueOf = Long.valueOf(j);
            } else {
                lValueOf = null;
            }
        }
        long j2 = c1772750wET.LJIIZILJ;
        if (j2 <= 0) {
            j2 = c1772750wET.LJJJJ;
        }
        if (lValueOf != null && lValueOf.longValue() > 0) {
            lValueOf2 = Long.valueOf(lValueOf.longValue() - c1772750wET.LJ);
        } else {
            lValueOf2 = null;
        }
        long j3 = j2 - c1772750wET.LJ;
        long j4 = c1772750wET.LJJJJ - c1772750wET.LJJJIL;
        String str3 = "cancel";
        String str4 = "fail";
        if (c1772750wET.LJIIL > 0) {
            obj = "success";
        } else if (c1772750wET.LJIJ) {
            obj = "cancel";
        } else {
            obj = "fail";
        }
        if (c1772750wET.LJIILIIL > 0) {
            str3 = "success";
        } else if (!c1772750wET.LJIJ) {
            str3 = "fail";
        }
        if (c1772750wET.LJIILLIIL > 0) {
            obj2 = "success";
        } else if (!Intrinsics.LJFF(c1772750wET.LJJJJI, Boolean.FALSE)) {
            obj2 = "fail";
        } else {
            obj2 = "none";
        }
        if (c1772750wET.LJIIZILJ > 0) {
            str4 = "success";
        } else if (Intrinsics.LJFF(c1772750wET.LJJJJI, Boolean.FALSE)) {
            str4 = "none";
        }
        long j5 = c1772750wET.LJJIII;
        if (j5 > 0) {
            lValueOf3 = Long.valueOf(j5);
        } else {
            lValueOf3 = null;
        }
        long j6 = c1772750wET.LJJIIJ;
        if (j6 > 0) {
            lValueOf4 = Long.valueOf(j6);
        } else {
            lValueOf4 = null;
        }
        long j7 = c1772750wET.LJJIIJZLJL;
        if (j7 > 0) {
            lValueOf5 = Long.valueOf(j7);
        } else {
            lValueOf5 = null;
        }
        long j8 = c1772750wET.LJJIIZ;
        if (j8 > 0) {
            lValueOf6 = Long.valueOf(j8);
        } else {
            lValueOf6 = null;
        }
        int i2 = C1772950wEn.LIZ[c1772750wET.LJJ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                str2 = null;
            } else {
                str2 = "online";
            }
        } else {
            str2 = "cache";
        }
        if (c1772750wET.LJLJLJ < 0 && (!c1772750wET.LLD.isEmpty())) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(c1772750wET.LLD, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = "";
        }
        Pair[] pairArr = new Pair[37];
        pairArr[0] = new Pair("is_cache_render", Integer.valueOf(c1772750wET.LIZ ? 1 : 0));
        pairArr[1] = new Pair("net_hit_preload", Integer.valueOf(c1772750wET.LJJJJIZL ? 1 : 0));
        pairArr[2] = new Pair("net_hit_chunk_preload", Integer.valueOf(c1772750wET.LJJJJJ ? 1 : 0));
        pairArr[3] = new Pair("net_hit_chunk_preread", Integer.valueOf(c1772750wET.LJJJJJL ? 1 : 0));
        pairArr[4] = new Pair("has_popup", Integer.valueOf(c1772750wET.LJJJLIIL ? 1 : 0));
        pairArr[5] = new Pair("use_cache", Integer.valueOf(c1772750wET.LJJJLZIJ ? 1 : 0));
        pairArr[6] = new Pair("is_offline", Integer.valueOf(c1772750wET.LJJJLL ? 1 : 0));
        pairArr[7] = new Pair("has_report_render_status", Integer.valueOf(c1772750wET.LJLZ ? 1 : 0));
        pairArr[8] = new Pair("cache_required_render_result", obj);
        pairArr[9] = new Pair("cache_all_render_result", str3);
        pairArr[10] = new Pair("cache_render_count", Integer.valueOf(c1772750wET.LJJL + c1772750wET.LJJLIIIJ + c1772750wET.LJJLIIIJJIZ));
        pairArr[11] = new Pair("cache_render_success_count", Integer.valueOf(c1772750wET.LJJLI + c1772750wET.LJJLIIIJILLIZJL + c1772750wET.LJJLIIIJL));
        pairArr[12] = new Pair("cache_render_fail_count", Integer.valueOf(c1772750wET.LJJLIIIIJ + c1772750wET.LJJLIIIJJI + c1772750wET.LJJLIIIJLJLI));
        pairArr[13] = new Pair("cache_render_lynx_count", Integer.valueOf(c1772750wET.LJJLIIIJ));
        pairArr[14] = new Pair("cache_render_lynx_success_count", Integer.valueOf(c1772750wET.LJJLIIIJILLIZJL));
        pairArr[15] = new Pair("cache_render_lynx_fail_count", Integer.valueOf(c1772750wET.LJJLIIIJJI));
        pairArr[16] = new Pair("cache_render_geccard_count", Integer.valueOf(c1772750wET.LJJLIIIJJIZ));
        pairArr[17] = new Pair("cache_render_geccard_success_count", Integer.valueOf(c1772750wET.LJJLIIIJL));
        pairArr[18] = new Pair("cache_render_geccard_fail_count", Integer.valueOf(c1772750wET.LJJLIIIJLJLI));
        pairArr[19] = new Pair("online_required_render_result", obj2);
        pairArr[20] = new Pair("online_all_render_result", str4);
        pairArr[21] = new Pair("online_render_count", Integer.valueOf(c1772750wET.LJJLIIIJLLLLLLLZ + c1772750wET.LJJLJ + c1772750wET.LJJZ));
        pairArr[22] = new Pair("online_render_success_count", Integer.valueOf(c1772750wET.LJJLIIJ + c1772750wET.LJJLJLI + c1772750wET.LJJZZI));
        pairArr[23] = new Pair("online_render_fail_count", Integer.valueOf(c1772750wET.LJJLIL + c1772750wET.LJJLL + c1772750wET.LJJZZIII));
        pairArr[24] = new Pair("online_render_lynx_count", Integer.valueOf(c1772750wET.LJJLJ));
        pairArr[25] = new Pair("online_render_lynx_success_count", Integer.valueOf(c1772750wET.LJJLJLI));
        pairArr[26] = new Pair("online_render_lynx_fail_count", Integer.valueOf(c1772750wET.LJJLL));
        pairArr[27] = new Pair("online_render_geccard_count", Integer.valueOf(c1772750wET.LJJZ));
        pairArr[28] = new Pair("online_render_geccard_success_count", Integer.valueOf(c1772750wET.LJJZZI));
        pairArr[29] = new Pair("online_render_geccard_fail_count", Integer.valueOf(c1772750wET.LJJZZIII));
        pairArr[30] = new Pair("mall_render_result", Integer.valueOf(c1772750wET.LJJI));
        pairArr[31] = new Pair("preload_count", Integer.valueOf(c1772750wET.LJLI));
        pairArr[32] = new Pair("preload_effective_count", Integer.valueOf(c1772750wET.LJLIIIL));
        pairArr[33] = new Pair("predecode_count", Integer.valueOf(c1772750wET.LJLJI));
        pairArr[34] = new Pair("predecode_effective_count", Integer.valueOf(c1772750wET.LJLJJI));
        pairArr[35] = new Pair("has_shown_tokopedia_loading", Integer.valueOf(c1772750wET.LJZI ? 1 : 0));
        if (str != null) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[36] = new Pair("is_chunk_render", Integer.valueOf(i));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (lValueOf != null) {
            lValueOf.longValue();
            mapLJIIJ.put("t_view_meaningful_render_end", lValueOf);
        }
        if (lValueOf2 != null) {
            lValueOf2.longValue();
            mapLJIIJ.put("duration_fmp", lValueOf2);
        }
        if (lValueOf3 != null) {
            lValueOf3.longValue();
            mapLJIIJ.put("t_load_cache_start", lValueOf3);
        }
        if (lValueOf4 != null) {
            lValueOf4.longValue();
            mapLJIIJ.put("t_load_cache_end", lValueOf4);
        }
        if (lValueOf5 != null) {
            lValueOf5.longValue();
            mapLJIIJ.put("t_parse_online_data_start", lValueOf5);
        }
        if (lValueOf6 != null) {
            lValueOf6.longValue();
            mapLJIIJ.put("t_parse_online_data_end", lValueOf6);
        }
        if (str2 != null) {
            mapLJIIJ.put("lazy_render_from", str2);
        }
        Object objLJJLIIIJL = C13LP.LJJLIIIJL(c1772750wET.LLD);
        if (objLJJLIIIJL != null) {
            mapLJIIJ.put("current_vc_state", objLJJLIIIJL);
        }
        if (strLJJLIIIJ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mapLJIIJ.put("vc_state_list", strLJJLIIIJ);
        }
        String str5 = c1772750wET.LJJJJL;
        if (str5 != null) {
            mapLJIIJ.put("network_info", str5);
        }
        Map<String, Object> map = c1772750wET.LJJJJLI;
        if (map != null) {
            if (!(!map.isEmpty())) {
                map = null;
            }
            if (map != null) {
                mapLJIIJ.put("network_prepare_info", C1741890vQh.LJIIIIZZ(map));
            }
        }
        String str6 = c1772750wET.LJJJJLL;
        if (str6 != null) {
            mapLJIIJ.put("tts_server_timing", str6);
        }
        Map<String, ? extends Object> map2 = c1772750wET.LLIIIL;
        if (map2 != null && (obj3 = map2.get("vregion")) != null) {
            mapLJIIJ.put("vregion", obj3);
        }
        mapLJIIJ.put("hit_merge_cache_and_online_render", Integer.valueOf(c1772750wET.LJZL ? 1 : 0));
        Integer num2 = c1772750wET.LL;
        if (num2 != null) {
            mapLJIIJ.put("merge_cache_and_online_render_strategy", Integer.valueOf(num2.intValue()));
        }
        Boolean bool = c1772750wET.LJJJJI;
        if (bool != null) {
            mapLJIIJ.put("net_success", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        long j9 = c1772750wET.LIZLLL;
        if (j9 > 0) {
            mapLJIIJ.put("t_click_tab_start", Long.valueOf(j9));
        }
        long j10 = c1772750wET.LIZIZ;
        if (j10 > 0) {
            mapLJIIJ.put("t_touch_down_start", Long.valueOf(j10));
        }
        long j11 = c1772750wET.LJ;
        if (j11 > 0) {
            mapLJIIJ.put("t_open_time", Long.valueOf(j11));
        }
        long j12 = c1772750wET.LJFF;
        if (j12 > 0) {
            mapLJIIJ.put("t_mix_mall_view_did_load", Long.valueOf(j12));
        }
        long j13 = c1772750wET.LJI;
        if (j13 > 0) {
            mapLJIIJ.put("t_mix_mall_view_resume_end", Long.valueOf(j13));
        }
        long j14 = c1772750wET.LJII;
        if (j14 > 0) {
            mapLJIIJ.put("t_mix_mall_view_tab_end", Long.valueOf(j14));
        }
        long j15 = c1772750wET.LJIIJJI;
        if (j15 > 0) {
            mapLJIIJ.put("t_view_cache_render_start", Long.valueOf(j15));
        }
        long j16 = c1772750wET.LJIIL;
        if (j16 > 0) {
            mapLJIIJ.put("t_view_cache_render_required_end", Long.valueOf(j16));
        }
        if (c1772750wET.LJIILIIL > 0) {
            mapLJIIJ.put("t_view_cache_render_end", Long.valueOf(c1772750wET.LJIILIIL));
        }
        long j17 = c1772750wET.LJIIJ;
        if (j17 > 0) {
            mapLJIIJ.put("t_view_cache_data_trace_start", Long.valueOf(j17));
        }
        if (!c1772750wET.LJLIL.isEmpty()) {
            try {
                mapLJIIJ.put("preload_success_bundles", C1741890vQh.LJIIIIZZ(c1772750wET.LJLIL));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (!c1772750wET.LJLJJLL.isEmpty()) {
            try {
                mapLJIIJ.put("predecode_success_bundles", C1741890vQh.LJIIIIZZ(c1772750wET.LJLJJLL));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        if (str != null) {
            mapLJIIJ.put("chunk_name", str);
        }
        long j18 = c1772750wET.LJIJI;
        if (j18 <= 0) {
            j18 = c1772750wET.LJIILIIL;
        }
        mapLJIIJ.put("t_view_cache_render_api_end_next_loop", Long.valueOf(j18));
        long j19 = c1772750wET.LJIL;
        if (j19 > 0) {
            mapLJIIJ.put("t_view_online_data_draw_start", Long.valueOf(j19));
        }
        long j20 = c1772750wET.LJIJJLI;
        if (j20 > 0) {
            mapLJIIJ.put("t_view_cache_draw_start", Long.valueOf(j20));
        } else {
            long j21 = c1772750wET.LJIL;
            if (j21 > 0) {
                mapLJIIJ.put("t_view_cache_draw_start", Long.valueOf(j21));
            }
        }
        long j22 = c1772750wET.LJIJJ;
        if (j22 <= 0) {
            j22 = c1772750wET.LJIIZILJ;
        }
        mapLJIIJ.put("t_view_online_data_render_api_end_next_loop", Long.valueOf(j22));
        long j23 = c1772750wET.LJIILJJIL;
        if (j23 > 0) {
            mapLJIIJ.put("t_view_online_data_trace_start", Long.valueOf(j23));
        }
        long j24 = c1772750wET.LJIILL;
        if (j24 > 0) {
            mapLJIIJ.put("t_view_online_data_render_start", Long.valueOf(j24));
        }
        long j25 = c1772750wET.LJIILLIIL;
        if (j25 > 0) {
            mapLJIIJ.put("t_view_online_data_render_required_end", Long.valueOf(j25));
        }
        long j26 = c1772750wET.LJIIZILJ;
        if (j26 > 0) {
            mapLJIIJ.put("t_view_online_data_render_end", Long.valueOf(j26));
        }
        long j28 = c1772750wET.LJJJIL;
        if (j28 > 0) {
            mapLJIIJ.put("t_net_start", Long.valueOf(j28));
        }
        long j29 = c1772750wET.LJJJJ;
        if (j29 > 0) {
            mapLJIIJ.put("t_net_end", Long.valueOf(j29));
        }
        long j30 = c1772750wET.LJJJI;
        if (j30 <= 0) {
            j30 = 0;
        }
        mapLJIIJ.put("t_view_cache_interrupt_by_fetch", Long.valueOf(j30));
        long j31 = c1772750wET.LJL;
        if (j31 > 0) {
            mapLJIIJ.put("t_preload_start", Long.valueOf(j31));
        }
        long j32 = c1772750wET.LJLILLLLZI;
        if (j32 > 0) {
            mapLJIIJ.put("t_predecode_start", Long.valueOf(j32));
        }
        if (c1772750wET.LJIIIIZZ.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            mapLJIIJ.put("leave_mall_reason", c1772750wET.LJIIIIZZ);
        }
        long j33 = c1772750wET.LJIIIZ;
        if (j33 > 0) {
            mapLJIIJ.put("t_mix_mall_disappear", Long.valueOf(j33));
        }
        long j34 = c1772750wET.LJJIIZI;
        if (j34 > 0) {
            mapLJIIJ.put("t_load_global_context_start", Long.valueOf(j34));
        }
        long j35 = c1772750wET.LJJIJ;
        if (j35 > 0) {
            mapLJIIJ.put("t_load_global_context_end", Long.valueOf(j35));
        }
        long j36 = c1772750wET.LJJIJIIJI;
        if (j36 > 0) {
            mapLJIIJ.put("t_parse_diversion_start", Long.valueOf(j36));
        }
        long j37 = c1772750wET.LJJIJIIJIL;
        if (j37 > 0) {
            mapLJIIJ.put("t_parse_diversion_end", Long.valueOf(j37));
        }
        long j38 = c1772750wET.LJZ;
        if (j38 > 0) {
            mapLJIIJ.put("t_app_launch_start", Long.valueOf(j38));
        }
        long j39 = c1772750wET.LJLJL;
        if (j39 > 0) {
            mapLJIIJ.put("t_loading_page_start", Long.valueOf(j39));
        }
        long j40 = c1772750wET.LJLJLJ;
        if (j40 > 0) {
            mapLJIIJ.put("t_loading_page_end", Long.valueOf(j40));
        }
        long j41 = c1772750wET.LJLJLLL;
        if (j41 > 0) {
            mapLJIIJ.put("t_error_page_start", Long.valueOf(j41));
        }
        long j42 = c1772750wET.LJLL;
        if (j42 > 0) {
            mapLJIIJ.put("t_error_page_end", Long.valueOf(j42));
        }
        long j43 = c1772750wET.LJLLI;
        if (j43 > 0) {
            mapLJIIJ.put("t_toko_loading_page_start", Long.valueOf(j43));
        }
        long j44 = c1772750wET.LJLLILLLL;
        if (j44 > 0) {
            mapLJIIJ.put("t_toko_loading_page_end", Long.valueOf(j44));
        }
        int i3 = c1772750wET.LJJJJZ;
        if (i3 > 0) {
            mapLJIIJ.put("skip_cache_render_count", Integer.valueOf(i3));
        }
        if (!c1772750wET.LIZ) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("total_bind_duration", c1772750wET.LLFF);
            jSONObject.put("total_load_template_duration", c1772750wET.LLFFF);
            jSONObject.put("total_update_duration", c1772750wET.LLFII);
            jSONObject.put("total_bind_count", c1772750wET.LLFZ);
            jSONObject.put("total_update_count", c1772750wET.LLI);
            mapLJIIJ.put("cache_spark_perf", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("total_bind_duration", c1772750wET.LLIFFJFJJ);
            jSONObject2.put("total_load_template_duration", c1772750wET.LLII);
            jSONObject2.put("total_update_duration", c1772750wET.LLIIII);
            jSONObject2.put("total_bind_count", c1772750wET.LLIIIILZ);
            jSONObject2.put("total_update_count", c1772750wET.LLIIIJ);
            mapLJIIJ.put("online_spark_perf", jSONObject2);
            mapLJIIJ.put("disable_blank_card_detect", Integer.valueOf(c1772750wET.LLIIIZ ? 1 : 0));
            try {
                mapLJIIJ.put("extra_timing_info", new JSONObject(c1772750wET.LLIIZ));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C189200o6.m2constructorimpl(new C098200Yq(th3));
            }
            C1773070wEz c1773070wEz = c1772750wET.LLIIJI;
            C1773070wEz c1773070wEz2 = c1772750wET.LLIIJLIL;
            if (c1773070wEz != null && c1773070wEz2 != null) {
                mapLJIIJ.put("start_java_heap_ratio", Float.valueOf(c1773070wEz.LIZIZ));
                mapLJIIJ.put("start_memory_usage_ratio", Float.valueOf(c1773070wEz.LIZ));
                mapLJIIJ.put("end_java_heap_ratio", Float.valueOf(c1773070wEz2.LIZIZ));
                mapLJIIJ.put("end_memory_usage_ratio", Float.valueOf(c1773070wEz2.LIZ));
                if (c1773070wEz.LIZJ != null && (num = c1773070wEz2.LIZJ) != null) {
                    mapLJIIJ.put("diff_block_gc_count", Integer.valueOf(num.intValue() - c1773070wEz.LIZJ.intValue()));
                }
            }
            Double d = c1772750wET.LLIIL;
            if (d != null) {
                mapLJIIJ.put("diff_cpu_usage", Double.valueOf(d.doubleValue()));
            }
        }
        String str7 = c1772750wET.LJJIFFI;
        if (str7 != null) {
            mapLJIIJ.put("cache_data_service", str7);
        }
        String str8 = c1772750wET.LJJII;
        if (str8 != null) {
            mapLJIIJ.put("online_data_service", str8);
        }
        mapLJIIJ.put("mall_instance_index", Integer.valueOf(c1772750wET.LLIILII));
        mapLJIIJ.put("app_quit_cnt", Integer.valueOf(c1772750wET.LLIILZL));
        if (j4 > 0) {
            mapLJIIJ.put("duration_net", Long.valueOf(j4));
        }
        if (j3 > 0) {
            mapLJIIJ.put("duration_tti", Long.valueOf(j3));
        }
        if (j2 > 0) {
            mapLJIIJ.put("t_view_tti", Long.valueOf(j2));
        }
        String str9 = LIZJ;
        if (str9 != null) {
            mapLJIIJ.put("mall_out_source", str9);
        }
        Long l = LIZLLL;
        if (l != null) {
            mapLJIIJ.put("t_deeplink_start", Long.valueOf(l.longValue()));
        }
        Map<String, ? extends Object> map3 = LIZIZ;
        if (map3 != null) {
            mapLJIIJ.putAll(map3);
        }
        mapLJIIJ.putAll(C2190491AoB.LIZ());
        if (lValueOf6 != null) {
            lValueOf6.longValue();
        }
        if (lValueOf5 != null) {
            lValueOf5.longValue();
        }
        return mapLJIIJ;
    }

    public static void LIZJ(C1772750wET c1772750wET, String str) {
        if (c1772750wET.LJ <= 0) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
        } else {
            C1018703yb.LJ("rd_mixmall_perf_page_render", LIZ(c1772750wET, str));
        }
    }

    public static void LIZLLL(C1772760wEU c1772760wEU, String str, EnumC1772960wEo enumC1772960wEo, C1772750wET c1772750wET, Map map, String str2, int i) {
        int i2;
        int i3;
        int i4;
        if ((i & 8) != 0) {
            map = C2097608Jq.LJ();
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        c1772760wEU.getClass();
        if (c1772750wET.LJ <= 0) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
            return;
        }
        Pair[] pairArr = new Pair[16];
        int i5 = 0;
        pairArr[0] = new Pair("start_to_now", Long.valueOf(System.currentTimeMillis() - c1772750wET.LJ));
        pairArr[1] = new Pair("have_cache", Integer.valueOf(c1772750wET.LJJJJZI ? 1 : 0));
        pairArr[2] = new Pair("cache_rendered", Integer.valueOf(c1772750wET.LJJJZ ? 1 : 0));
        pairArr[3] = new Pair("have_popup_shown", Integer.valueOf(c1772750wET.LJJJLIIL ? 1 : 0));
        int i6 = C1772950wEn.LIZ[enumC1772960wEo.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        } else {
            i2 = 4;
        }
        pairArr[4] = new Pair("data_type", Integer.valueOf(i2));
        pairArr[5] = new Pair("mall_instance_index", Integer.valueOf(c1772750wET.LLIILII));
        pairArr[6] = new Pair("app_quit_cnt", Integer.valueOf(c1772750wET.LLIILZL));
        if (c1772750wET.LJJJLL) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        pairArr[7] = new Pair("is_offline", Integer.valueOf(i3));
        if (c1772750wET.LJJJLZIJ) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        pairArr[8] = new Pair("is_cache_exist", Integer.valueOf(i4));
        pairArr[9] = new Pair("page_name", "mall");
        pairArr[10] = new Pair("flag", "mix_mall");
        pairArr[11] = new Pair("is_timing", 2);
        pairArr[12] = new Pair("start_to_pagerendered", 999999);
        pairArr[13] = new Pair("rd_mix_page", 1);
        pairArr[14] = new Pair("mall_event_version", 3540);
        if (str2 != null) {
            i5 = 1;
        }
        pairArr[15] = new Pair("is_chunk_render", Integer.valueOf(i5));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String str3 = c1772750wET.LLF;
        if (str3 != null) {
            mapLJIIJ.put("enter_from", str3);
        }
        Map<String, ? extends Object> map2 = c1772750wET.LLIIIL;
        if (map2 != null && enumC1772960wEo == EnumC1772960wEo.FETCH) {
            mapLJIIJ.putAll(map2);
        }
        if (str2 != null) {
            mapLJIIJ.put("chunk_name", str2);
        }
        mapLJIIJ.putAll(C2190491AoB.LIZ());
        mapLJIIJ.putAll(map);
        C1018703yb.LJ(str, mapLJIIJ);
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report tech event, ");
        sbLIZ.append(str);
        sbLIZ.append(" data=");
        sbLIZ.append(mapLJIIJ);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZIZ();
    }
}
