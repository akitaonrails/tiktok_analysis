package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.152L, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C152L extends FeatureProducer {
    public static boolean LIZLLL;
    public static final C152L LIZIZ = new C152L();
    public static String LIZJ = "f_live_game";
    public static boolean LJ = true;

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        C1065380dpY c1065380dpYLIZ;
        InterfaceC1510030pOj interfaceC1510030pOj;
        if (LJ) {
            int i = C2187451AjH.LIZ;
            LJ = false;
            InterfaceC20318714ev interfaceC20318714evB4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4();
            Boolean bool = Boolean.FALSE;
            if (Intrinsics.LJFF(interfaceC20318714evB4.LIZJ(bool, "live_game_ai_feature_center_switch"), Boolean.TRUE)) {
                LIZLLL = true;
                AnonymousClass1523.LJFF.LIZ = true;
                FeatureServiceManager.Companion.getClass();
                C1510050pOl.LIZ().addAppLogListener(new InterfaceC1510030pOj() { // from class: X.152K
                    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"livesdk_live_duration", "livesdk_close_live_dialog_click"});

                    @Override // X.InterfaceC1510030pOj
                    public final Set<String> events() {
                        return LIZJ;
                    }

                    @Override // X.InterfaceC1510030pOj
                    public final void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
                        int i2 = C2187451AjH.LIZ;
                        if (Intrinsics.LJFF(str, "livesdk_live_duration")) {
                            AnonymousClass1523.LJFF.getClass();
                            Iterator<String> it2 = AnonymousClass1523.LJII.iterator();
                            while (it2.hasNext()) {
                                AnonymousClass1523.LJFF.setFeature(it2.next(), null, false);
                            }
                            return;
                        }
                        if (Intrinsics.LJFF(str, "livesdk_close_live_dialog_click") && Intrinsics.LJFF(c1510130pOt.LIZLLL("click_type"), "end_live")) {
                            AnonymousClass1523.LJFF.getClass();
                            Iterator<String> it3 = AnonymousClass1523.LJII.iterator();
                            while (it3.hasNext()) {
                                AnonymousClass1523.LJFF.setFeature(it3.next(), null, false);
                            }
                        }
                    }
                });
            }
            if (((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(bool, "live_game_ai_feature_center_preview_switch")).booleanValue()) {
                LIZLLL = true;
                C152U.LJFF.LIZ = true;
            }
        }
        if (!LIZLLL) {
            if (Intrinsics.LJFF(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(Boolean.FALSE, "live_game_ai_feature_center_switch"), Boolean.TRUE)) {
                LIZLLL = true;
            } else {
                return;
            }
        }
        if ((!C152T.LJFF.LIZ || !C152Q.LJFF.LIZ || !C152N.LJFF.LIZ || !AnonymousClass1523.LJFF.LIZ || !C152F.LJFF.LIZ) && list != null) {
            Iterator<FeatureItem> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().name;
                if (str != null && (c1065380dpYLIZ = C152M.LIZ(str)) != null && !c1065380dpYLIZ.LIZ) {
                    c1065380dpYLIZ.LIZ = true;
                    LIZIZ.getClass();
                    C1065380dpY c1065380dpYLIZ2 = C152M.LIZ(str);
                    String strLIZJ = null;
                    if (c1065380dpYLIZ2 != null) {
                        strLIZJ = c1065380dpYLIZ2.LIZJ();
                    }
                    C152T.LJFF.getClass();
                    if (Intrinsics.LJFF(strLIZJ, C152T.LJI)) {
                        interfaceC1510030pOj = new InterfaceC1510030pOj() { // from class: X.152S
                            public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"livesdk_live_play", "livesdk_live_definition_selection_select_success", "livesdk_explore_click", "livesdk_explore_request_finish", "livesdk_live_room_type_duration", "livesdk_screen_rotate", "livesdk_live_loadmore", "livesdk_like", "livesdk_live_duration", "livesdk_performance_monitor_base"});

                            @Override // X.InterfaceC1510030pOj
                            public final Set<String> events() {
                                return LIZJ;
                            }

                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                            @Override // X.InterfaceC1510030pOj
                            public final void handleAppLogEvent(String str2, C1510130pOt c1510130pOt) {
                                int i2 = C2187451AjH.LIZ;
                                String str3 = "";
                                switch (str2.hashCode()) {
                                    case -1889587881:
                                        if (str2.equals("livesdk_live_room_type_duration")) {
                                            String strLIZLLL = c1510130pOt.LIZLLL("live_type");
                                            if (strLIZLLL == null) {
                                                strLIZLLL = "";
                                            }
                                            if (Intrinsics.LJFF(strLIZLLL, "screen_share")) {
                                                String strLIZLLL2 = c1510130pOt.LIZLLL("room_orientation");
                                                if (strLIZLLL2 != null) {
                                                    str3 = strLIZLLL2;
                                                }
                                                if (Intrinsics.LJFF(str3, "landscape")) {
                                                    C152T c152t = C152T.LJFF;
                                                    c152t.setFeature("g_watch_landscape_watch_count", Integer.valueOf(C1509460pNo.LIZIZ(c152t, "g_watch_landscape_watch_count") + 1), false);
                                                    c152t.setFeature("g_watch_landscape_watch_time", Integer.valueOf(C1509460pNo.LIZIZ(c152t, "g_watch_landscape_watch_time") + c1510130pOt.LIZIZ("duration")), false);
                                                }
                                            }
                                        }
                                        break;
                                    case -1572451203:
                                        if (str2.equals("livesdk_live_loadmore")) {
                                            c1510130pOt.getClass();
                                            if (Intrinsics.LJFF(C1923007g4.LIZ(c1510130pOt.LIZ("is_landscape")), Boolean.TRUE)) {
                                                C152T c152t2 = C152T.LJFF;
                                                c152t2.setFeature("g_watch_landscape_loadmore_time", Integer.valueOf(C1509460pNo.LIZIZ(c152t2, "g_watch_landscape_loadmore_time") + 1), false);
                                            }
                                        }
                                        break;
                                    case -1115849514:
                                        if (str2.equals("livesdk_live_duration")) {
                                            C152T c152t3 = C152T.LJFF;
                                            c152t3.setFeature("g_watch_drawer_loadmore_time_room", 0, false);
                                            c152t3.setFeature("g_watch_drawer_count_room", 0, false);
                                            c152t3.setFeature("g_watch_like_count", 0, false);
                                            c152t3.setFeature("g_watch_definition", c1510130pOt.LIZLLL("initial_definition"));
                                        }
                                        break;
                                    case -1095209507:
                                        if (str2.equals("livesdk_screen_rotate")) {
                                            String strLIZLLL3 = c1510130pOt.LIZLLL("type");
                                            if (Intrinsics.LJFF(strLIZLLL3, "landscape_to_portrait")) {
                                                C152T.LJFF.setFeature("g_watch_orientation", 0, false);
                                            } else if (Intrinsics.LJFF(strLIZLLL3, "portrait_to_landscape")) {
                                                C152T.LJFF.setFeature("g_watch_orientation", 1, false);
                                            }
                                        }
                                        break;
                                    case 1126246144:
                                        if (str2.equals("livesdk_explore_request_finish")) {
                                            String strLIZLLL4 = c1510130pOt.LIZLLL("request_type");
                                            if (strLIZLLL4 != null) {
                                                str3 = strLIZLLL4;
                                            }
                                            if (Intrinsics.LJFF(str3, "loadmore")) {
                                                C152T c152t4 = C152T.LJFF;
                                                c152t4.setFeature("g_watch_drawer_loadmore_time_room", Integer.valueOf(C1509460pNo.LIZIZ(c152t4, "g_watch_drawer_loadmore_time_room") + 1), false);
                                                c152t4.setFeature("g_watch_drawer_loadmore_time_app", Integer.valueOf(C1509460pNo.LIZIZ(c152t4, "g_watch_drawer_loadmore_time_app") + 1), false);
                                            }
                                        }
                                        break;
                                    case 1294654397:
                                        if (str2.equals("livesdk_live_definition_selection_select_success")) {
                                            String strLIZLLL5 = c1510130pOt.LIZLLL("live_type");
                                            if (strLIZLLL5 != null) {
                                                str3 = strLIZLLL5;
                                            }
                                            if (Intrinsics.LJFF(str3, "screen_share")) {
                                                C152T.LJFF.setFeature("g_watch_definition", c1510130pOt.LIZLLL("current_definition"));
                                            }
                                        }
                                        break;
                                    case 1499179894:
                                        if (str2.equals("livesdk_live_play")) {
                                            C152T c152t5 = C152T.LJFF;
                                            c152t5.setFeature("g_watch_multi_canvas", Integer.valueOf(c1510130pOt.LIZIZ("is_multi_stream_room")), false);
                                            c152t5.setFeature("g_watch_drawer_loadmore_time_room", 0, false);
                                            c152t5.setFeature("g_watch_drawer_count_room", 0, false);
                                            c152t5.setFeature("g_watch_like_count", 0, false);
                                            if (Intrinsics.LJFF(c1510130pOt.LIZLLL("is_from_draw_req"), CardStruct.IStatusCode.DEFAULT) && Intrinsics.LJFF(c1510130pOt.LIZLLL("from_drawer_tab"), "game")) {
                                                c152t5.setFeature("g_watch_drawer_game_ct_app", Integer.valueOf(C1509460pNo.LIZIZ(c152t5, "g_watch_drawer_game_ct_app") + 1), false);
                                            }
                                            String strLIZLLL6 = c1510130pOt.LIZLLL("room_orientation");
                                            if (Intrinsics.LJFF(strLIZLLL6, "portrait")) {
                                                c152t5.setFeature("g_watch_orientation", 0, false);
                                            } else if (Intrinsics.LJFF(strLIZLLL6, "landscape")) {
                                                c152t5.setFeature("g_watch_orientation", 1, false);
                                            }
                                        }
                                        break;
                                    case 1607929387:
                                        if (str2.equals("livesdk_explore_click")) {
                                            C152T c152t6 = C152T.LJFF;
                                            c152t6.setFeature("g_watch_drawer_count_app", Integer.valueOf(C1509460pNo.LIZIZ(c152t6, "g_watch_drawer_count_app") + 1), false);
                                            c152t6.setFeature("g_watch_drawer_count_room", Integer.valueOf(C1509460pNo.LIZIZ(c152t6, "g_watch_drawer_count_room") + 1), false);
                                        }
                                        break;
                                    case 2041791848:
                                        if (str2.equals("livesdk_like") && !Intrinsics.LJFF(c1510130pOt.LIZLLL("from_user_type"), "anchor")) {
                                            C152T c152t7 = C152T.LJFF;
                                            c152t7.setFeature("g_watch_like_count", Integer.valueOf(C1509460pNo.LIZIZ(c152t7, "g_watch_like_count") + c1510130pOt.LIZIZ("like_amount")), false);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                    } else {
                        C152Q.LJFF.getClass();
                        if (Intrinsics.LJFF(strLIZJ, C152Q.LJI)) {
                            interfaceC1510030pOj = new InterfaceC1510030pOj() { // from class: X.152P
                                public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"livesdk_live_takepage_orientation_click", "livesdk_live_ingame_overlay_switch", "livesdk_live_game_rotate_screen_rotation", "livesdk_create_room", "livesdk_live_unexcepted_interruption_golive_click", "livesdk_back_to_live", "livesdk_golive_speedtest", "livesdk_live_prepare_page_stay_time", "livesdk_boost_card_start_show", "livesdk_anchor_highlight_result_show", "livesdk_live_take", "livesdk_anchor_heartbeat", "livesdk_close_live_dialog_click"});

                                @Override // X.InterfaceC1510030pOj
                                public final Set<String> events() {
                                    return LIZJ;
                                }

                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                /* JADX WARN: Removed duplicated region for block: B:93:0x01ed  */
                                @Override // X.InterfaceC1510030pOj
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void handleAppLogEvent(java.lang.String r14, X.C1510130pOt r15) {
                                    /*
                                        Method dump skipped, instruction units count: 612
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C152P.handleAppLogEvent(java.lang.String, X.0pOt):void");
                                }
                            };
                        } else {
                            C152N.LJFF.getClass();
                            if (Intrinsics.LJFF(strLIZJ, C152N.LJI)) {
                                interfaceC1510030pOj = new InterfaceC1510030pOj() { // from class: X.152O
                                    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"livesdk_create_room", "livesdk_live_unexcepted_interruption_golive_click", "livesdk_back_to_live", "livesdk_live_take", "livesdk_live_play", "livesdk_poll_show", "livesdk_audience_poll_end", "livesdk_anchor_custom_poll_card_show", "livesdk_anchor_custom_poll_end", "livesdk_guessing_game_indicator", "livesdk_multilive_mode_watch_start", "livesdk_multilive_mode_watch_duration", "livesdk_play_together_game_indicator", "livesdk_close_live_dialog_click", "livesdk_live_duration", "livesdk_shorttouch_effect_show", "livesdk_shorttouch_effect_finish"});
                                    public static Number LIZLLL;

                                    @Override // X.InterfaceC1510030pOj
                                    public final Set<String> events() {
                                        return LIZJ;
                                    }

                                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                    @Override // X.InterfaceC1510030pOj
                                    public final void handleAppLogEvent(String str2, C1510130pOt c1510130pOt) {
                                        Number number;
                                        int i2 = C2187451AjH.LIZ;
                                        switch (str2.hashCode()) {
                                            case -1761131699:
                                                if (!str2.equals("livesdk_create_room")) {
                                                    return;
                                                }
                                                break;
                                            case -1464828203:
                                                if (!str2.equals("livesdk_multilive_mode_watch_duration") || (number = LIZLLL) == null || !Intrinsics.LJFF(number, c1510130pOt.LIZJ("room_id"))) {
                                                    return;
                                                }
                                                C152N.LJFF.setFeature("g_interaction_link_mic", 0, false);
                                                return;
                                            case -1203033472:
                                                if (!str2.equals("livesdk_shorttouch_effect_show") || c1510130pOt.LIZLLL("poll_id") == null) {
                                                    return;
                                                }
                                                C152N.LJFF.setFeature("g_interaction_vote_enable", 1, false);
                                                return;
                                            case -1140258986:
                                                if (!str2.equals("livesdk_shorttouch_effect_finish") || c1510130pOt.LIZLLL("poll_id") == null) {
                                                    return;
                                                }
                                                C152N.LJFF.setFeature("g_interaction_vote_enable", 0, false);
                                                return;
                                            case -1115849514:
                                                if (!str2.equals("livesdk_live_duration")) {
                                                    return;
                                                }
                                                C152N.LJFF.getClass();
                                                Iterator<String> it3 = C152N.LJII.iterator();
                                                while (it3.hasNext()) {
                                                    C152N.LJFF.setFeature(it3.next(), 0, false);
                                                }
                                                return;
                                            case -538935440:
                                                if (!str2.equals("livesdk_anchor_custom_poll_end")) {
                                                    return;
                                                }
                                                C152N.LJFF.setFeature("g_interaction_vote_enable", 0, false);
                                                return;
                                            case -279037527:
                                                if (!str2.equals("livesdk_back_to_live")) {
                                                    return;
                                                }
                                                break;
                                            case -105679455:
                                                if (!str2.equals("livesdk_anchor_custom_poll_card_show")) {
                                                    return;
                                                }
                                                C152N.LJFF.setFeature("g_interaction_vote_enable", 1, false);
                                                return;
                                            case 292525421:
                                                if (!str2.equals("livesdk_play_together_game_indicator") || !Intrinsics.LJFF(c1510130pOt.LIZLLL("action_type"), "show")) {
                                                    return;
                                                }
                                                C152N.LJFF.setFeature("g_interaction_bring_play", 1, false);
                                                return;
                                            case 346644556:
                                                if (!str2.equals("livesdk_poll_show")) {
                                                    return;
                                                }
                                                C152N.LJFF.setFeature("g_interaction_vote_enable", 1, false);
                                                return;
                                            case 750322369:
                                                if (!str2.equals("livesdk_multilive_mode_watch_start") || c1510130pOt.LIZIZ("guest_cnt") == 0) {
                                                    return;
                                                }
                                                LIZLLL = c1510130pOt.LIZJ("room_id");
                                                C152N.LJFF.setFeature("g_interaction_link_mic", 1, false);
                                                return;
                                            case 822816844:
                                                if (!str2.equals("livesdk_close_live_dialog_click") || !Intrinsics.LJFF(c1510130pOt.LIZLLL("click_type"), "end_live")) {
                                                    return;
                                                }
                                                C152N.LJFF.getClass();
                                                Iterator<String> it4 = C152N.LJII.iterator();
                                                while (it4.hasNext()) {
                                                    C152N.LJFF.setFeature(it4.next(), 0, false);
                                                }
                                                return;
                                            case 1183738021:
                                                if (!str2.equals("livesdk_guessing_game_indicator") || !Intrinsics.LJFF(c1510130pOt.LIZLLL("action_type"), "show")) {
                                                    return;
                                                }
                                                C152N.LJFF.setFeature("g_interaction_guess", 1, false);
                                                return;
                                            case 1350667563:
                                                if (!str2.equals("livesdk_live_unexcepted_interruption_golive_click")) {
                                                    return;
                                                }
                                                break;
                                            case 1499179894:
                                                if (!str2.equals("livesdk_live_play")) {
                                                    return;
                                                }
                                                C152N c152n = C152N.LJFF;
                                                c152n.setFeature("g_interaction_hashtag", c1510130pOt.LIZLLL("game_label"));
                                                c152n.setFeature("g_interaction_vote_enable", 0, false);
                                                c152n.setFeature("g_interaction_guess", 0, false);
                                                c152n.setFeature("g_interaction_bring_play", 0, false);
                                                c152n.setFeature("g_interaction_link_mic", 0, false);
                                                return;
                                            case 1499288777:
                                                if (!str2.equals("livesdk_live_take")) {
                                                    return;
                                                }
                                                String strLIZLLL = c1510130pOt.LIZLLL("game_label");
                                                if (strLIZLLL != null) {
                                                    C152N.LJFF.setFeature("g_interaction_hashtag", strLIZLLL);
                                                }
                                                String strLIZLLL2 = c1510130pOt.LIZLLL("game_label_id");
                                                if (strLIZLLL2 != null) {
                                                    C152N.LJFF.setFeature("g_interaction_hashtag_id", strLIZLLL2);
                                                }
                                                C152N.LJFF.setFeature("g_interaction_guess", 0, false);
                                                return;
                                            case 1547160069:
                                                if (!str2.equals("livesdk_audience_poll_end")) {
                                                    return;
                                                }
                                                C152N.LJFF.setFeature("g_interaction_vote_enable", 0, false);
                                                return;
                                            default:
                                                return;
                                        }
                                        C152N c152n2 = C152N.LJFF;
                                        c152n2.setFeature("g_interaction_bring_play", 0, false);
                                        c152n2.setFeature("g_interaction_vote_enable", 0, false);
                                        c152n2.setFeature("g_interaction_guess", 0, false);
                                    }
                                };
                            } else {
                                AnonymousClass1523.LJFF.getClass();
                                if (Intrinsics.LJFF(strLIZJ, AnonymousClass1523.LJI)) {
                                    interfaceC1510030pOj = new InterfaceC1510030pOj() { // from class: X.152K
                                        public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"livesdk_live_duration", "livesdk_close_live_dialog_click"});

                                        @Override // X.InterfaceC1510030pOj
                                        public final Set<String> events() {
                                            return LIZJ;
                                        }

                                        @Override // X.InterfaceC1510030pOj
                                        public final void handleAppLogEvent(String str2, C1510130pOt c1510130pOt) {
                                            int i2 = C2187451AjH.LIZ;
                                            if (Intrinsics.LJFF(str2, "livesdk_live_duration")) {
                                                AnonymousClass1523.LJFF.getClass();
                                                Iterator<String> it22 = AnonymousClass1523.LJII.iterator();
                                                while (it22.hasNext()) {
                                                    AnonymousClass1523.LJFF.setFeature(it22.next(), null, false);
                                                }
                                                return;
                                            }
                                            if (Intrinsics.LJFF(str2, "livesdk_close_live_dialog_click") && Intrinsics.LJFF(c1510130pOt.LIZLLL("click_type"), "end_live")) {
                                                AnonymousClass1523.LJFF.getClass();
                                                Iterator<String> it3 = AnonymousClass1523.LJII.iterator();
                                                while (it3.hasNext()) {
                                                    AnonymousClass1523.LJFF.setFeature(it3.next(), null, false);
                                                }
                                            }
                                        }
                                    };
                                } else {
                                    C152F.LJFF.getClass();
                                    if (Intrinsics.LJFF(strLIZJ, C152F.LJI)) {
                                        interfaceC1510030pOj = new InterfaceC1510030pOj() { // from class: X.0pN6
                                            @Override // X.InterfaceC1510030pOj
                                            public final void handleAppLogEvent(String str2, C1510130pOt c1510130pOt) {
                                            }

                                            @Override // X.InterfaceC1510030pOj
                                            public final Set<String> events() {
                                                return C08CX.INSTANCE;
                                            }
                                        };
                                    }
                                }
                            }
                        }
                    }
                    if (interfaceC1510030pOj != null) {
                        FeatureServiceManager.Companion.getClass();
                        C1510050pOl.LIZ().addAppLogListener(interfaceC1510030pOj);
                    }
                }
            }
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        if (LIZLLL) {
            if (returnCode != null) {
                returnCode.code = 200;
            }
            C1065380dpY c1065380dpYLIZ = C152M.LIZ(str);
            if (c1065380dpYLIZ != null) {
                return c1065380dpYLIZ.getFeature(str);
            }
            return null;
        }
        return null;
    }
}
