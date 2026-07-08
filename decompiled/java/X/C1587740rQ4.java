package X;

import Y.ARunnableS13S0000100_13;
import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rQ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587740rQ4 {
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static Long LJIIL;
    public static int LJIILJJIL;
    public static int LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static boolean LJIJ;
    public static boolean LJIJI;
    public static boolean LJIJJ;
    public static boolean LJIJJLI;
    public static boolean LJIL;
    public static boolean LJJ;
    public static Aweme LJJI;
    public static int LJJII;
    public static final C1587740rQ4 LIZ = new C1587740rQ4();
    public static final HashMap<String, String> LIZIZ = new HashMap<>();
    public static long LJFF = -1;
    public static long LJI = -1;
    public static long LJII = -1;
    public static long LJIIIIZZ = -1;
    public static long LJIIIZ = -1;
    public static long LJIIJ = -1;
    public static long LJIIJJI = -1;
    public static long LJIILIIL = -1;
    public static String LJJIFFI = "";

    public static void LIZIZ(C1587770rQ7 c1587770rQ7) {
        String string;
        HashMap map = new HashMap();
        map.put("start_time_from_open_app", String.valueOf(c1587770rQ7.LIZIZ));
        map.put("duration", String.valueOf(c1587770rQ7.LIZJ));
        map.put("is_success", String.valueOf(c1587770rQ7.LIZLLL ? 1 : 0));
        map.put("status_code", String.valueOf(c1587770rQ7.LJ));
        map.put("status_msg", c1587770rQ7.LJFF);
        map.put(Scene.SCENE_SERVICE, String.valueOf(c1587770rQ7.LIZ));
        map.put("has_response", c1587770rQ7.LJI);
        map.put("red_dot_count", String.valueOf(c1587770rQ7.LJII));
        map.put("avatar_count", String.valueOf(c1587770rQ7.LJIIIIZZ));
        Integer num = c1587770rQ7.LJIIIZ;
        String string2 = null;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        map.put("last_request_source", string);
        Long l = c1587770rQ7.LJIIJ;
        if (l != null) {
            string2 = l.toString();
        }
        map.put("to_last_request_internal", string2);
        map.put("is_number_count_changed", String.valueOf(c1587770rQ7.LJIIJJI ? 1 : 0));
        map.put("is_avatar_response_changed", String.valueOf(c1587770rQ7.LJIIL ? 1 : 0));
        C20684815ws.LJIILLIIL("friends_tab_fetch_red_dot", map);
    }

    public static void LIZJ(C1587780rQ8 c1587780rQ8) {
        HashMap map = new HashMap();
        map.put("pull_type", String.valueOf(c1587780rQ8.LIZIZ));
        map.put("source", String.valueOf(c1587780rQ8.LIZ));
        map.put("last_view_item_id", c1587780rQ8.LJ);
        map.put("count", String.valueOf(c1587780rQ8.LJIIIIZZ));
        map.put("has_more", String.valueOf(c1587780rQ8.LJIIIZ));
        map.put("is_success", String.valueOf(c1587780rQ8.LJFF ? 1 : 0));
        map.put("status_code", String.valueOf(c1587780rQ8.LJI));
        map.put("status_msg", c1587780rQ8.LJII);
        map.put("duration", String.valueOf(c1587780rQ8.LIZLLL));
        map.put("to_last_request_internal", String.valueOf(c1587780rQ8.LIZJ));
        map.put("preload", CardStruct.IStatusCode.DEFAULT);
        map.put("red_dot_source", "unknown");
        C20684815ws.LJIILLIIL("friends_feed_resp_monitor", map);
    }

    public static void LIZLLL(C1587790rQ9 c1587790rQ9) {
        HashMap map = new HashMap();
        map.put("start_time_from_open_app", String.valueOf(c1587790rQ9.LIZIZ));
        map.put("duration", String.valueOf(c1587790rQ9.LIZLLL));
        map.put("is_success", String.valueOf(c1587790rQ9.LJ ? 1 : 0));
        map.put("status_code", String.valueOf(c1587790rQ9.LJFF));
        map.put("status_msg", c1587790rQ9.LJI);
        map.put(Scene.SCENE_SERVICE, c1587790rQ9.LIZ);
        map.put("pull_type", "1");
        map.put("count", String.valueOf(c1587790rQ9.LJII));
        map.put("has_more", String.valueOf(c1587790rQ9.LJIIIIZZ));
        map.put("preload", "1");
        map.put("to_last_request_internal", String.valueOf(c1587790rQ9.LIZJ));
        map.put("red_dot_source", c1587790rQ9.LJIIIZ);
        C20684815ws.LJIILLIIL("friends_feed_resp_monitor", map);
    }

    public static void LJ(final boolean z) {
        final long jLongValue;
        if (!LJIJI) {
            LJIJI = true;
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            Long l = LJIIL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = LJIIJ;
            }
            C15O7.LIZJ(new Callable() { // from class: X.0rQ6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FriendsTabTechMonitor@425.reportEmptyPageLanding$1");
                    C1587740rQ4.LIZ.getClass();
                    HashMap<String, String> map = C1587740rQ4.LIZIZ;
                    map.put("to_page", z ? "FriendsEmpty" : "EmptyDataError");
                    map.put("first_aweme_type", "-1");
                    map.put("group", "5");
                    map.put("duration", String.valueOf(jElapsedRealtime - C1587740rQ4.LIZJ));
                    map.put("duration_v3", String.valueOf(Math.max(C1587740rQ4.LJIILIIL, jLongValue)));
                    map.put("hit_preload", CardStruct.IStatusCode.DEFAULT);
                    map.put("fetch_retry_count", String.valueOf(C1587740rQ4.LJIILJJIL));
                    map.put("duration_container_frag_on_create_view", String.valueOf(C1587740rQ4.LJFF));
                    map.put("duration_container_frag_init_tab_layout", String.valueOf(C1587740rQ4.LJI));
                    map.put("duration_friends_feed_frag_on_create_view", String.valueOf(C1587740rQ4.LJII));
                    map.put("duration_home_top_tab_build_view", String.valueOf(C1587740rQ4.LJIIIIZZ));
                    map.put("duration_fetch_friends_feed", String.valueOf(C1587740rQ4.LJ - C1587740rQ4.LIZLLL));
                    map.put("duration_response_to_first_frame", String.valueOf(jElapsedRealtime - C1587740rQ4.LJ));
                    map.put("exit_before_first_frame", String.valueOf(C1587740rQ4.LJJII));
                    map.put("duration_on_refresh_result", String.valueOf(C1587740rQ4.LJIIIZ));
                    map.put("with_insert_ids", C1587740rQ4.LJIILLIIL ? "1" : CardStruct.IStatusCode.DEFAULT);
                    map.put("hit_cached", C1587740rQ4.LJIIZILJ ? "1" : CardStruct.IStatusCode.DEFAULT);
                    map.put("is_skylight_hit_cache", C1587740rQ4.LJIJ ? "1" : CardStruct.IStatusCode.DEFAULT);
                    map.put("landing_result", z ? CardStruct.IStatusCode.DEFAULT : "1");
                    map.put("click_to_initial_fetch_skylight_completion", String.valueOf(C1587740rQ4.LJIIJ));
                    map.put("click_to_first_skylight_data", String.valueOf(C1587740rQ4.LJIIJJI));
                    map.put("click_to_skylight_consumable_data_duration", String.valueOf(jLongValue));
                    map.put("duration_first_frame", String.valueOf(C1587740rQ4.LJIILIIL));
                    if (z) {
                        map.put("landing_success_reason", "FriendsEmpty");
                    } else {
                        map.put("landing_error_reason", "EmptyDataError");
                    }
                    map.put("is_friends_v2", CardStruct.IStatusCode.DEFAULT);
                    map.put("tab_style", CardStruct.IStatusCode.DEFAULT);
                    map.put("friends_type", C1587740rQ4.LJJIFFI);
                    C20684815ws.LJIILLIIL("friends_tab_landing", map);
                    long j = jElapsedRealtime - C1587740rQ4.LIZJ;
                    if (((Boolean) C1DS1.LJJJI.getValue()).booleanValue()) {
                        C823050WQl.LIZLLL().execute(new ARunnableS13S0000100_13(j, 0));
                    }
                    ((IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)).LIZ("latency_friends");
                    C1C7U.LIZIZ("FriendsTabTechMonitor@425.reportEmptyPageLanding$1");
                    return null;
                }
            });
        }
    }

    public static void LJFF(final Aweme aweme, final Aweme aweme2) {
        final long jLongValue;
        if (!LJIJI) {
            LJIJI = true;
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            Long l = LJIIL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = LJIIJ;
            }
            C15O7.LIZJ(new Callable() { // from class: X.0rQ5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FriendsTabTechMonitor@425.reportFeedLanding$1");
                    Aweme aweme3 = aweme;
                    String aid = aweme3 != null ? aweme3.getAid() : null;
                    Aweme aweme4 = aweme2;
                    boolean z = Intrinsics.LJFF(aid, aweme4 != null ? aweme4.getAid() : null) || aweme2 == null;
                    Aweme aweme5 = aweme;
                    int awemeType = aweme5 != null ? aweme5.getAwemeType() : -1;
                    C1587740rQ4.LIZ.getClass();
                    String strValueOf = String.valueOf(C1587740rQ4.LJIILL);
                    HashMap<String, String> map = C1587740rQ4.LIZIZ;
                    map.put("to_page", z ? "Friends" : "FriendsPlayCancel");
                    map.put("first_aweme_type", String.valueOf(awemeType));
                    map.put("group", "5");
                    map.put("duration", String.valueOf(jElapsedRealtime - C1587740rQ4.LIZJ));
                    map.put("duration_v3", String.valueOf(Math.max(C1587740rQ4.LJIILIIL, jLongValue)));
                    map.put("hit_preload", strValueOf);
                    map.put("fetch_retry_count", String.valueOf(C1587740rQ4.LJIILJJIL));
                    map.put("duration_container_frag_on_create_view", String.valueOf(C1587740rQ4.LJFF));
                    map.put("duration_container_frag_init_tab_layout", String.valueOf(C1587740rQ4.LJI));
                    map.put("duration_friends_feed_frag_on_create_view", String.valueOf(C1587740rQ4.LJII));
                    map.put("duration_home_top_tab_build_view", String.valueOf(C1587740rQ4.LJIIIIZZ));
                    map.put("duration_fetch_friends_feed", String.valueOf(C1587740rQ4.LJ - C1587740rQ4.LIZLLL));
                    map.put("duration_response_to_first_frame", String.valueOf(jElapsedRealtime - C1587740rQ4.LJ));
                    map.put("exit_before_first_frame", String.valueOf(C1587740rQ4.LJJII));
                    map.put("duration_on_refresh_result", String.valueOf(C1587740rQ4.LJIIIZ));
                    map.put("click_to_initial_fetch_skylight_completion", String.valueOf(C1587740rQ4.LJIIJ));
                    map.put("click_to_first_skylight_data", String.valueOf(C1587740rQ4.LJIIJJI));
                    map.put("click_to_skylight_consumable_data_duration", String.valueOf(jLongValue));
                    map.put("with_insert_ids", C1587740rQ4.LJIILLIIL ? "1" : CardStruct.IStatusCode.DEFAULT);
                    map.put("hit_cached", C1587740rQ4.LJIIZILJ ? "1" : CardStruct.IStatusCode.DEFAULT);
                    map.put("is_skylight_hit_cache", C1587740rQ4.LJIJ ? "1" : CardStruct.IStatusCode.DEFAULT);
                    map.put("landing_result", CardStruct.IStatusCode.DEFAULT);
                    map.put("landing_success_reason", z ? "Friends" : "FriendsPlayCancel");
                    map.put("is_friends_v2", CardStruct.IStatusCode.DEFAULT);
                    map.put("tab_style", CardStruct.IStatusCode.DEFAULT);
                    map.put("friends_type", C1587740rQ4.LJJIFFI);
                    map.put("duration_first_frame", String.valueOf(C1587740rQ4.LJIILIIL));
                    C20684815ws.LJIILLIIL("friends_tab_landing", map);
                    long j = jElapsedRealtime - C1587740rQ4.LIZJ;
                    if (((Boolean) C1DS1.LJJJI.getValue()).booleanValue()) {
                        C823050WQl.LIZLLL().execute(new ARunnableS13S0000100_13(j, 0));
                    }
                    ((IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)).LIZ("latency_friends");
                    C1C7U.LIZIZ("FriendsTabTechMonitor@425.reportFeedLanding$1");
                    return null;
                }
            });
        }
    }

    public static void LIZ(long j, long j2, long j3, boolean z) {
        HashMap map = new HashMap();
        map.put("start_time_from_open_app", String.valueOf(j));
        map.put("duration", String.valueOf(j2));
        map.put("expire_time", String.valueOf(j3));
        map.put("is_success", String.valueOf(z ? 1 : 0));
        map.put("group", "5");
        C20684815ws.LJIILLIIL("friends_tab_cold_start_delete_db_record", map);
    }

    public static void LJI(C1587740rQ4 c1587740rQ4, C0SDP c0sdp, boolean z, String str, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        c1587740rQ4.getClass();
        if (c0sdp == C0SDP.FEED_LIST) {
            LJIJJ = true;
        }
        if (c0sdp == C0SDP.SKY_LIGHT) {
            LJIJJLI = true;
        }
        if (c0sdp == C0SDP.EMPTY_PAGE) {
            LJIL = true;
        }
        if (c0sdp == C0SDP.ERROR_PAGE) {
            LJJ = true;
        }
        if (LJIJJLI && LJIJJ) {
            Aweme aweme = LJJI;
            LJFF(aweme, aweme);
        }
        if (LJIJJLI && LJIL) {
            LJ(z);
        }
        if (LJIJJLI && LJJ && !LJIJI) {
            LJIJI = true;
            C15O7.LIZJ(new CallableC1582170rH5(str));
        }
    }
}
