package X;

import Y.ARunnableS107S0100000_7;
import Y.ARunnableS127S0100000_27;
import android.os.Handler;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFpsAdapterOptABSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyEnterDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencySupportSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveViewTreeOptSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS100S1000000_15;
import kotlin.jvm.internal.AwS119S1000000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1EOY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EOY implements InterfaceC1300500jwm {
    public static final C1EOY LIZ = new C1EOY();
    public static final ArrayList<String> LIZIZ;
    public static final ArrayList<String> LIZJ;
    public static final ArrayList<String> LIZLLL;
    public static final ArrayList<String> LJ;
    public static final ArrayList<String> LJFF;
    public static final ArrayList<String> LJI;
    public static final ArrayList<String> LJII;
    public static final C01GW LJIIIIZZ;
    public static final long LJIIIZ;
    public static final Map<String, C01GW<C1300480jwk>> LJIIJ;
    public static final Map<String, C1300480jwk> LJIIJJI;
    public static final Map<String, C01GW<RunnableC1160830gJV>> LJIIL;
    public static final Map<String, RunnableC1160830gJV> LJIILIIL;
    public static String LJIILJJIL;
    public static String LJIILL;
    public static boolean LJIILLIIL;
    public static InterfaceC1300440jwg LJIIZILJ;
    public static WeakReference<InterfaceC1300390jwb> LJIJ;
    public static InterfaceC1101330elX LJIJI;
    public static String LJIJJ;
    public static final List<InterfaceC1300500jwm> LJIJJLI;

    public final void LJIILIIL() {
        LJIILLIIL = true;
        C1300480jwk c1300480jwkLIZIZ = LIZIZ("broadcast_enter");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LJIIIIZZ = true;
            c1300480jwkLIZIZ.LIZJ(null);
            C786410Ut5.LJLIIL(LJIIIZ, LJ(), new ARunnableS127S0100000_27(c1300480jwkLIZIZ, 74));
        }
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("board_applying_period");
        arrayList.add("board_editing_period");
        LIZIZ = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("multi_guest_apply_page");
        arrayList2.add("multi_guest_be_invite_page");
        arrayList2.add("multi_guest_guest_preview_page");
        arrayList2.add("multi_guest_guest_media_manage_page");
        arrayList2.add("multi_guest_anchor_manage_page");
        arrayList2.add("multi_guest_anchor_manage_page_scroll");
        arrayList2.add("multi_guest_anchor_setting_page");
        LIZJ = arrayList2;
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("toplive_hangout_page");
        arrayList3.add("toplive_hangout_distribute");
        arrayList3.add("toplive_hangout_interact_module");
        arrayList3.add("toplive_hangout_play_tab");
        arrayList3.add("toplive_hangout_play_feed");
        arrayList3.add("toplive_hangout_room_feed");
        LIZLLL = arrayList3;
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("linkmic_anchor_layout_switch");
        arrayList4.add("linkmic_guest_layout_switch");
        LJ = arrayList4;
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("playbook_funkit_panel");
        arrayList5.add("playbook_non_multi_panel");
        arrayList5.add("playbook_detail_panel");
        LJFF = arrayList5;
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("guest_showdown_begin_setting_page");
        arrayList6.add("guest_showdown_ing_setting_page");
        arrayList6.add("guest_showdown_party_ranking_page");
        arrayList6.add("guest_showdown_party_ranking_page_end");
        LJI = arrayList6;
        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("linkmic_anchor_period");
        arrayList7.add("linkmic_guest_period");
        arrayList7.add("linkmic_audience_period");
        LJII = arrayList7;
        LJIIIIZZ = C292401Bi.LIZ(AFwS208S0000000_20.get$arr$(97));
        LJIIIZ = LiveFluencyEnterDurationSetting.INSTANCE.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIIJ = linkedHashMap;
        LJIIJJI = new LinkedHashMap();
        LJIIL = new LinkedHashMap();
        LJIILIIL = new LinkedHashMap();
        LJIILJJIL = "";
        LJIILL = "";
        LJIJJ = "";
        LJIJJLI = new ArrayList();
        if (LiveViewTreeOptSetting.enableFluencyMonitorOpt()) {
            return;
        }
        LiveFluencySupportSampleSetting liveFluencySupportSampleSetting = LiveFluencySupportSampleSetting.INSTANCE;
        if (LJIIL(liveFluencySupportSampleSetting.getWatchEnterSamplingRate())) {
            linkedHashMap.put("watch_click_enter", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(737)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getWatchEnterSamplingRate())) {
            linkedHashMap.put("watch_slide_enter", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(769)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getWatchSlideSamplingRate())) {
            linkedHashMap.put("watch_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(728)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getWatchPeriodSamplingRate())) {
            linkedHashMap.put("watch_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(758)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getWatchPeriodAllSamplingRate())) {
            linkedHashMap.put("watch_period_all", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(718)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getBroadcastEnterSamplingRate())) {
            linkedHashMap.put("broadcast_enter", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(747)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getBroadcastPeriodSamplingRate())) {
            linkedHashMap.put("broadcast_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(779)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getBroadcastPeriodAllSamplingRate())) {
            linkedHashMap.put("broadcast_period_all", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(719)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getPreviewEnterSamplingRate())) {
            linkedHashMap.put("preview_enter", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(722)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getPreviewPeriodSamplingRate())) {
            linkedHashMap.put("preview_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(709)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getBroadcastLinkPeriodSamplingRate())) {
            linkedHashMap.put("broadcast_link_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(713)));
        }
        if (LJIIL(liveFluencySupportSampleSetting.getLinkMicRolePeriodSamplingRate())) {
            for (String str : arrayList7) {
                LJIIJ.put(str, C292401Bi.LIZ(new AwS119S1000000_35(str, 8)));
            }
        }
        if (LJIIL(LiveFluencySupportSampleSetting.INSTANCE.getBoardMetricSampling())) {
            for (String str2 : LIZIZ) {
                LJIIJ.put(str2, C292401Bi.LIZ(new AwS119S1000000_35(str2, 9)));
            }
        }
        LiveFluencySupportSampleSetting liveFluencySupportSampleSetting2 = LiveFluencySupportSampleSetting.INSTANCE;
        if (LJIIL(liveFluencySupportSampleSetting2.getPkPeriodSamplingRate())) {
            LJIIJ.put("pk_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(723)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPkPeriodSamplingRate())) {
            LJIIJ.put("match_prepare", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(725)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPkPeriodSamplingRate())) {
            LJIIJ.put("match_in_progress", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(727)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPkPeriodSamplingRate())) {
            LJIIJ.put("match_color_eggs_task_start", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(730)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPkPeriodSamplingRate())) {
            LJIIJ.put("match_color_eggs_reward_start", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(733)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPkPeriodSamplingRate())) {
            LJIIJ.put("match_color_eggs_guide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(735)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPkPeriodSamplingRate())) {
            LJIIJ.put("match_punish_prepare", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(739)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPkPeriodSamplingRate())) {
            LJIIJ.put("match_punish", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(742)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getGiftPlaySamplingRate())) {
            LJIIJ.put("gift_play", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(745)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelGiftSlideSamplingRate())) {
            LJIIJ.put("panel_gift_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(748)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getAnchorPanelGiftSlideSamplingRate())) {
            LJIIJ.put("anchor_panel_gift_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(751)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getAnchorPanelGiftSlideComposeSamplingRate())) {
            LJIIJ.put("anchor_panel_gift_slide_compose", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(754)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelRechargeSlideSamplingRate())) {
            LJIIJ.put("recharge_panel_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(757)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelBroadcastLinkSlideSamplingRate())) {
            LJIIJ.put("panel_broadcast_link_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(760)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelPublicScreenSlideSamplingRate())) {
            LJIIJ.put("panel_public_screen_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(763)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelPublicScreenAutoSlideSamplingRate())) {
            LJIIJ.put("panel_public_screen_auto_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(766)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelExtendedPublicScreenSlideSamplingRate())) {
            LJIIJ.put("panel_extended_public_screen_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(771)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelExtendedPublicScreenAutoSlideSamplingRate())) {
            LJIIJ.put("panel_extended_public_screen_auto_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(774)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelBeautySlideSamplingRate())) {
            LJIIJ.put("panel_beauty_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(777)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelFilterSlideSamplingRate())) {
            LJIIJ.put("panel_filter_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(780)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelStickerSlideSamplingRate())) {
            LJIIJ.put("panel_sticker_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(710)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPanelSoundSlideSamplingRate())) {
            LJIIJ.put("panel_sound_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(714)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getEffectPanelSlideSamplingRate())) {
            LJIIJ.put("panel_effect_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(717)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getSearchStickerPanelSlideSamplingRate())) {
            LJIIJ.put("panel_search_sticker_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(720)));
        }
        if (LJIIL(liveFluencySupportSampleSetting2.getPannelMultiGuestSamplingRate())) {
            for (String str3 : LIZJ) {
                LJIIJ.put(str3, C292401Bi.LIZ(new AwS119S1000000_35(str3, 10)));
            }
        }
        if (LJIIL(LiveFluencySupportSampleSetting.INSTANCE.getTopLiveHangoutSamplingRate())) {
            for (String str4 : LIZLLL) {
                LJIIJ.put(str4, C292401Bi.LIZ(new AwS119S1000000_35(str4, 11)));
            }
        }
        LiveFluencySupportSampleSetting liveFluencySupportSampleSetting3 = LiveFluencySupportSampleSetting.INSTANCE;
        if (LJIIL(liveFluencySupportSampleSetting3.getTopLiveHangoutSamplingRate())) {
            LJIIJ.put("toplive_hangout_page_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(731)));
        }
        if (LJIIL(liveFluencySupportSampleSetting3.getMultiGuestLayoutSamplingRate())) {
            for (String str5 : LJ) {
                LJIIJ.put(str5, C292401Bi.LIZ(new AwS119S1000000_35(str5, 12)));
            }
        }
        if (LJIIL(LiveFluencySupportSampleSetting.INSTANCE.getMultiGuestLayoutSamplingRate())) {
            for (String str6 : LJFF) {
                LJIIJ.put(str6, C292401Bi.LIZ(new AwS119S1000000_35(str6, 13)));
            }
        }
        if (LJIIL(LiveFluencySupportSampleSetting.INSTANCE.getMultiGuestLayoutSamplingRate())) {
            for (String str7 : LJI) {
                LJIIJ.put(str7, C292401Bi.LIZ(new AwS119S1000000_35(str7, 14)));
            }
        }
        Map<String, C01GW<RunnableC1160830gJV>> map = LJIIL;
        map.put("board_editing_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(740)));
        map.put("board_applying_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(743)));
        map.put("watch_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(746)));
        map.put("watch_period_all", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(749)));
        map.put("broadcast_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(752)));
        map.put("broadcast_period_all", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(755)));
        map.put("preview_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(761)));
        map.put("broadcast_link_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(764)));
        map.put("toplive_hangout_page_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(767)));
        for (String str8 : LJII) {
            LJIIL.put(str8, C292401Bi.LIZ(new AwS119S1000000_35(str8, 15)));
        }
        Map<String, C01GW<RunnableC1160830gJV>> map2 = LJIIL;
        map2.put("pk_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(772)));
        map2.put("match_prepare", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(775)));
        map2.put("match_in_progress", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(778)));
        map2.put("match_color_eggs_guide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(781)));
        map2.put("match_color_eggs_reward_start", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(711)));
        map2.put("match_color_eggs_task_start", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(715)));
        map2.put("match_punish_prepare", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(721)));
        map2.put("match_punish", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(724)));
        map2.put("broadcast_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(726)));
        LiveFluencySupportSampleSetting liveFluencySupportSampleSetting4 = LiveFluencySupportSampleSetting.INSTANCE;
        if (LJIIL(liveFluencySupportSampleSetting4.getRankShowSamplingRate())) {
            LJIIJ.put("rank_anim", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(729)));
        }
        if (LJIIL(liveFluencySupportSampleSetting4.getRankShowSamplingRate())) {
            LJIIJ.put("rank_list_show", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(732)));
        }
        if (LJIIL(liveFluencySupportSampleSetting4.getRankShowSamplingRate())) {
            LJIIJ.put("panel_ranking_list_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(734)));
        }
        if (LJIIL(liveFluencySupportSampleSetting4.getDrawerOpenSamplingRate())) {
            Map<String, C01GW<C1300480jwk>> map3 = LJIIJ;
            map3.put("drawer_open", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(736)));
            map3.put("drawer_slide", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(738)));
        }
        if (LJIIL(liveFluencySupportSampleSetting4.getCommentPanelOpenSampling())) {
            LJIIJ.put("panel_comment_open", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(741)));
        }
        if (LJIIL(liveFluencySupportSampleSetting4.getCommentPanelPeriodSampling())) {
            LJIIJ.put("panel_comment_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(744)));
        }
        if (LJIIL(liveFluencySupportSampleSetting4.getCommentPanelCloseSampling())) {
            LJIIJ.put("panel_comment_close", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(750)));
        }
        if (LJIIL(1)) {
            Map<String, C01GW<C1300480jwk>> map4 = LJIIJ;
            map4.put("replay_video_play_enter", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(753)));
            map4.put("replay_video_edit_enter", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(756)));
            map4.put("replay_video_play_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(759)));
            map4.put("replay_video_edit_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(762)));
            map4.put("replay_highlight_page_enter", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(765)));
            map4.put("replay_highlight_page_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(768)));
            map4.put("replay_list_page_enter", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(770)));
            map4.put("replay_list_page_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(773)));
        }
        map2.put("replay_video_play_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(776)));
        map2.put("replay_video_edit_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(782)));
        map2.put("replay_highlight_page_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(712)));
        map2.put("replay_list_page_period", C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(716)));
    }

    public static Handler LJ() {
        return (Handler) LJIIIIZZ.getValue();
    }

    public final void LJIILL() {
        if (a0.LJJJIL(LJIILL)) {
            return;
        }
        C1300480jwk c1300480jwkLIZIZ = LIZIZ(LJIILL);
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LJIIIIZZ = LJIILLIIL;
        }
        RunnableC1160830gJV runnableC1160830gJVLJFF = LJFF(LJIILL);
        if (runnableC1160830gJVLJFF != null) {
            LJ().removeCallbacks(runnableC1160830gJVLJFF);
            C786410Ut5.LJJZZIII(LJ(), runnableC1160830gJVLJFF);
        }
    }

    public final void LJIILLIIL() {
        C1300480jwk c1300480jwkLIZIZ = LIZIZ(LJIILJJIL);
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LJIIIIZZ = LJIILLIIL;
        }
        RunnableC1160830gJV runnableC1160830gJVLJFF = LJFF(LJIILJJIL);
        if (runnableC1160830gJVLJFF != null) {
            LJ().removeCallbacks(runnableC1160830gJVLJFF);
            C786410Ut5.LJJZZIII(LJ(), runnableC1160830gJVLJFF);
        }
    }

    public final void LJIJJ() {
        if (Intrinsics.LJFF(LJIILJJIL, "linkmic_anchor_period")) {
            LJJI();
            LJIILJJIL = "broadcast_period";
            LJIILLIIL();
        }
    }

    public final void LJIJJLI() {
        if (Intrinsics.LJFF(LJIILJJIL, "linkmic_audience_period")) {
            LJJI();
            LJIILJJIL = "watch_period";
            LJIILLIIL();
        }
    }

    public final void LJJ() {
        if (a0.LJJJIL(LJIILL)) {
            return;
        }
        RunnableC1160830gJV runnableC1160830gJVLJFF = LJFF(LJIILL);
        if (runnableC1160830gJVLJFF != null) {
            LJ().removeCallbacks(runnableC1160830gJVLJFF);
        }
        C1300480jwk c1300480jwkLIZIZ = LIZIZ(LJIILL);
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LJIJ = null;
            c1300480jwkLIZIZ.stop();
        }
    }

    public final void LJJI() {
        RunnableC1160830gJV runnableC1160830gJVLJFF = LJFF(LJIILJJIL);
        if (runnableC1160830gJVLJFF != null) {
            LJ().removeCallbacks(runnableC1160830gJVLJFF);
        }
        C1300480jwk c1300480jwkLIZIZ = LIZIZ(LJIILJJIL);
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LJIJ = null;
            c1300480jwkLIZIZ.stop();
        }
    }

    public final void LJJIFFI() {
        if (Intrinsics.LJFF(LJIILJJIL, "linkmic_guest_period")) {
            LJJI();
            LJIILJJIL = "watch_period";
            LJIILLIIL();
        }
    }

    public final void LJJIII() {
        C1300480jwk c1300480jwkLIZIZ = LIZIZ("replay_list_page_enter");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.stop();
        }
        LJJI();
        LJIILJJIL = "replay_list_page_period";
        LJIILLIIL();
    }

    public final void LJJIIJ() {
        if (Intrinsics.LJFF(LJIILL, "toplive_hangout_page_period")) {
            LJJ();
            LJIILL = "";
        }
    }

    public static void LJIIIIZZ() {
        LJ().removeCallbacksAndMessages(null);
        if (LiveViewTreeOptSetting.enableFluencyMonitorOpt()) {
            for (Map.Entry entry : ((LinkedHashMap) LJIIJJI).entrySet()) {
                if (((C1300480jwk) entry.getValue()).LJIIIZ) {
                    ((C1300480jwk) entry.getValue()).stop();
                }
            }
        } else {
            for (Map.Entry entry2 : ((LinkedHashMap) LJIIJ).entrySet()) {
                if (((C01GW) entry2.getValue()).isInitialized() && ((C1300480jwk) ((C01GW) entry2.getValue()).getValue()).LJIIIZ) {
                    ((C1300480jwk) ((C01GW) entry2.getValue()).getValue()).stop();
                }
            }
        }
        LJIILJJIL = "";
        LJIILL = "";
    }

    public final void LJII() {
        LJJI();
        if (!a0.LJJJIL(LJIILL)) {
            LJJ();
        }
    }

    public final void LJIIIZ() {
        LJIILLIIL();
        if (!a0.LJJJIL(LJIILL)) {
            LJIILL();
        }
    }

    public static boolean LJIIL(int i) {
        long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
        AnchorFpsAdapterOptABSetting anchorFpsAdapterOptABSetting = AnchorFpsAdapterOptABSetting.INSTANCE;
        if (anchorFpsAdapterOptABSetting.isEnable()) {
            if (anchorFpsAdapterOptABSetting.isEnable() && curUserId % ((long) i) == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void LJIILJJIL(String str) {
        RunnableC1160830gJV runnableC1160830gJV;
        C1300480jwk c1300480jwk;
        C01GW c01gw = (C01GW) ((LinkedHashMap) LJIIJ).get(str);
        if (c01gw != null && (c1300480jwk = (C1300480jwk) c01gw.getValue()) != null) {
            c1300480jwk.LJIIIIZZ = LJIILLIIL;
        }
        C01GW c01gw2 = (C01GW) ((LinkedHashMap) LJIIL).get(str);
        if (c01gw2 != null && (runnableC1160830gJV = (RunnableC1160830gJV) c01gw2.getValue()) != null) {
            LJ().removeCallbacks(runnableC1160830gJV);
            C786410Ut5.LJJZZIII(LJ(), runnableC1160830gJV);
        }
    }

    public static void LJIL(String str) {
        C1300480jwk c1300480jwk;
        C1300480jwk c1300480jwk2;
        RunnableC1160830gJV runnableC1160830gJV;
        C01GW c01gw = (C01GW) ((LinkedHashMap) LJIIL).get(str);
        if (c01gw != null && (runnableC1160830gJV = (RunnableC1160830gJV) c01gw.getValue()) != null) {
            LJ().removeCallbacks(runnableC1160830gJV);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJIIJ;
        C01GW c01gw2 = (C01GW) linkedHashMap.get(str);
        if (c01gw2 != null && (c1300480jwk2 = (C1300480jwk) c01gw2.getValue()) != null) {
            c1300480jwk2.LJIJ = null;
        }
        C01GW c01gw3 = (C01GW) linkedHashMap.get(str);
        if (c01gw3 != null && (c1300480jwk = (C1300480jwk) c01gw3.getValue()) != null) {
            c1300480jwk.stop();
        }
    }

    public final C1300480jwk LIZIZ(String str) {
        if (LiveViewTreeOptSetting.enableFluencyMonitorOpt()) {
            return LIZLLL(str);
        }
        C01GW c01gw = (C01GW) ((LinkedHashMap) LJIIJ).get(str);
        if (c01gw != null) {
            return (C1300480jwk) c01gw.getValue();
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0686  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1300480jwk LIZLLL(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 2060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1EOY.LIZLLL(java.lang.String):X.0jwk");
    }

    public final RunnableC1160830gJV LJFF(String str) {
        C1300480jwk c1300480jwk = null;
        if (LiveViewTreeOptSetting.enableFluencyMonitorOpt()) {
            Map<String, RunnableC1160830gJV> map = LJIILIIL;
            RunnableC1160830gJV runnableC1160830gJV = (RunnableC1160830gJV) ((LinkedHashMap) map).get(str);
            if (runnableC1160830gJV == null) {
                C1300480jwk c1300480jwkLIZLLL = LIZLLL(str);
                Handler handlerLJ = LJ();
                if (c1300480jwkLIZLLL != null) {
                    c1300480jwkLIZLLL.LIZLLL = true;
                    c1300480jwk = c1300480jwkLIZLLL;
                }
                runnableC1160830gJV = new RunnableC1160830gJV(handlerLJ, c1300480jwk);
                map.put(str, runnableC1160830gJV);
            }
            return runnableC1160830gJV;
        }
        C01GW c01gw = (C01GW) ((LinkedHashMap) LJIIL).get(str);
        if (c01gw == null) {
            return null;
        }
        return (RunnableC1160830gJV) c01gw.getValue();
    }

    public final void LJI(RunnableC781530UlD runnableC781530UlD) {
        runnableC781530UlD.addOnScrollListener(new C772770UTb(LIZIZ("panel_beauty_slide"), null));
    }

    public final void LJIIJ(int i) {
        String str;
        if (i != 1) {
            if (i == 2 && (str = LJIILJJIL) != null && !a0.LJJJIL(str)) {
                LJIILJJIL("broadcast_period_all");
            }
        } else {
            String str2 = LJIILJJIL;
            if (str2 != null && !a0.LJJJIL(str2)) {
                LJIILJJIL("watch_period_all");
            }
        }
        LJIIIZ();
    }

    public final void LJIIJJI(Function0<? extends Map<String, String>> function0) {
        C1300480jwk c1300480jwkLIZIZ = LIZIZ(LJIILJJIL);
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LJIJ = function0;
        }
    }

    public final void LJIIZILJ(AwS100S1000000_15 awS100S1000000_15) {
        if (Intrinsics.LJFF(LJIILJJIL, "linkmic_guest_period")) {
            return;
        }
        LJJI();
        LJIILJJIL = "linkmic_guest_period";
        LJIIJJI(awS100S1000000_15);
        LJIILLIIL();
    }

    public final void LJIJ(String str) {
        C1300480jwk c1300480jwkLIZIZ = LIZIZ(str);
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LIZJ(null);
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, LJ(), new ARunnableS107S0100000_7(c1300480jwkLIZIZ, 270));
        }
    }

    public final void LJJII(String str) {
        C1300480jwk c1300480jwkLIZIZ = LIZIZ(str);
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.stop();
        }
    }

    @Override // X.InterfaceC1300500jwm
    public final void LIZ(long j, String str) {
        Iterator<InterfaceC1300500jwm> it2 = LJIJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(j, str);
        }
    }

    @Override // X.InterfaceC1300500jwm
    public final void LIZJ(long j, String str) {
        Iterator<InterfaceC1300500jwm> it2 = LJIJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(j, str);
        }
    }

    public final void LJIJI(Window window, String str) {
        C1300480jwk c1300480jwkLIZIZ = LIZIZ(str);
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LIZJ(window);
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, LJ(), new ARunnableS107S0100000_7(c1300480jwkLIZIZ, 267));
        }
    }
}
