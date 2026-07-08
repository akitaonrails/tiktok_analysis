package X;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams;
import com.bytedance.ies.sdk.widgets.XmlConstraintSolver;
import com.bytedance.ies.sdk.widgets.dependence.Barrier;
import com.bytedance.ies.sdk.widgets.dependence.Constraint;
import com.bytedance.ies.sdk.widgets.dependence.DefaultProperty;
import com.bytedance.ies.sdk.widgets.dependence.Guideline;
import com.bytedance.ies.sdk.widgets.dependence.Placeholder;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eIX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1083350eIX extends XmlConstraintSolver {
    public static final SparseIntArray LIZ = new SparseIntArray(174);

    public static Placeholder LIZ() {
        return new Placeholder(R.id.b_v, "audience_billboard_container");
    }

    public static Placeholder LIZIZ() {
        Placeholder placeholder = new Placeholder(R.id.dc9, "caption_delete");
        placeholder.topToTop = 0;
        placeholder.bottomToBottom = R.id.dcc;
        return placeholder;
    }

    public static Guideline LIZJ() {
        Guideline guideline = new Guideline(R.id.dcc, "caption_delete_top_guideline");
        guideline.topToBottom = R.id.hei;
        return guideline;
    }

    public static Placeholder LIZLLL() {
        Placeholder placeholder = new Placeholder(R.id.ddh, "caption_text");
        placeholder.startToStart = 0;
        placeholder.topToBottom = R.id.dcc;
        placeholder.bottomToBottom = 0;
        return placeholder;
    }

    public static Constraint LJ() {
        return new Constraint(R.id.eo4, "compliance_mask_layer");
    }

    public static Placeholder LJFF() {
        Placeholder placeholder = new Placeholder(R.id.ieq, "follow_guide_pin_card");
        placeholder.leftToRight = R.id.wkn;
        placeholder.bottomToTop = R.id.kwc;
        return placeholder;
    }

    public static Placeholder LJI() {
        Placeholder placeholder = new Placeholder(R.id.ixx, "gift_guide_pin_card");
        placeholder.leftToRight = R.id.wkn;
        placeholder.bottomToTop = R.id.kwc;
        return placeholder;
    }

    public static Placeholder LJII() {
        Placeholder placeholder = new Placeholder(R.id.mw7, "live_detect_container");
        placeholder.endToEnd = 0;
        placeholder.topToBottom = R.id.fgl;
        return placeholder;
    }

    public static Placeholder LJIIIIZZ() {
        return new Placeholder(R.id.mxv, "live_expand_guide_layer");
    }

    public static Placeholder LJIIIZ() {
        Placeholder placeholder = new Placeholder(R.id.n3l, "live_pin_card_horizontal_container");
        placeholder.bottomToTop = R.id.kwb;
        placeholder.leftToLeft = R.id.mk2;
        placeholder.rightToLeft = R.id.kwd;
        return placeholder;
    }

    public static Placeholder LJIIJ() {
        return new Placeholder(R.id.py0, "pad_auto_rotate_screen_guide_holder");
    }

    public static Placeholder LJIIJJI() {
        return new Placeholder(R.id.q0s, "paid_event_mask_layer");
    }

    public static Placeholder LJIIL() {
        Placeholder placeholder = new Placeholder(R.id.q0u, "paid_event_trial_live_card");
        placeholder.leftToRight = R.id.wkn;
        placeholder.bottomToTop = R.id.kwc;
        return placeholder;
    }

    public static Placeholder LJIILIIL() {
        Placeholder placeholder = new Placeholder(R.id.qfy, "pinCardContainer");
        placeholder.bottomToTop = R.id.kwb;
        placeholder.leftToLeft = R.id.mk2;
        placeholder.rightToLeft = R.id.kwd;
        return placeholder;
    }

    public static Constraint LJIILJJIL() {
        return new Constraint(R.id.s86, "programmed_live_background");
    }

    public static Placeholder LJIILL() {
        Placeholder placeholder = new Placeholder(R.id.s88, "programmed_live_follow_card");
        placeholder.rightToRight = 0;
        placeholder.bottomToTop = R.id.kwc;
        return placeholder;
    }

    public static Placeholder LJIILLIIL() {
        Placeholder placeholder = new Placeholder(R.id.s8_, "programmed_live_menu");
        placeholder.startToStart = 0;
        placeholder.endToEnd = 0;
        placeholder.topToBottom = R.id.s8h;
        placeholder.bottomToBottom = 0;
        return placeholder;
    }

    public static Placeholder LJIIZILJ() {
        return new Placeholder(R.id.tfq, "revenue_strategy_holder");
    }

    public static Constraint LJIJ() {
        Constraint constraint = new Constraint(R.id.vk_, "slide_up_guide");
        constraint.topToBottom = R.id.cdt;
        constraint.startToStart = R.id.vyl;
        constraint.endToEnd = R.id.h4p;
        return constraint;
    }

    public static Placeholder LJIJI() {
        return new Placeholder(R.id.wif, "subscribe_mask_layer");
    }

    public static Constraint LJIJJ() {
        return new Constraint(R.id.wig, "subscribe_mask_layer_ba");
    }

    public static Placeholder LJIJJLI() {
        Placeholder placeholder = new Placeholder(R.id.wiw, "subscription_common_guidance_live_card");
        placeholder.leftToRight = R.id.wkn;
        placeholder.bottomToTop = R.id.kwc;
        return placeholder;
    }

    public static Placeholder LJIL() {
        Placeholder placeholder = new Placeholder(R.id.wkm, "subscription_trial_live_card");
        placeholder.leftToRight = R.id.wkn;
        placeholder.bottomToTop = R.id.kwc;
        return placeholder;
    }

    public static Guideline LJJ() {
        Guideline guideline = new Guideline(R.id.wkn, "subscription_trial_live_card_guide_line");
        guideline.rightToRight = 0;
        return guideline;
    }

    public static Constraint LJJI() {
        Constraint constraint = new Constraint(R.id.wqh, "survey_a_container");
        constraint.bottomToTop = R.id.kwc;
        constraint.rightToLeft = R.id.tlb;
        return constraint;
    }

    @Override // com.bytedance.ies.sdk.widgets.XmlConstraintSolver
    public final Constraint createConstraint(int i) {
        switch (C1083360eIY.LIZIZ(i)) {
            case 1:
                return Constraint.PARENT_CONSTRAINT;
            case 2:
                Guideline guideline = new Guideline(R.id.cdt, "bottom_guideline");
                guideline.bottomToBottom = 0;
                return guideline;
            case 3:
                Guideline guideline2 = new Guideline(R.id.yah, "top_guideline");
                guideline2.topToTop = 0;
                return guideline2;
            case 4:
                Guideline guideline3 = new Guideline(R.id.vyl, "start_guideline");
                guideline3.startToStart = 0;
                return guideline3;
            case 5:
                Guideline guideline4 = new Guideline(R.id.h4p, "end_guideline");
                guideline4.endToEnd = 0;
                return guideline4;
            case 6:
                Guideline guideline5 = new Guideline(R.id.mk2, "left_guideline");
                guideline5.leftToLeft = 0;
                return guideline5;
            case 7:
                Guideline guideline6 = new Guideline(R.id.tlb, "right_guideline");
                guideline6.rightToRight = 0;
                return guideline6;
            case 8:
                Guideline guideline7 = new Guideline(R.id.y7u, "toolbar_top_guideline");
                guideline7.bottomToBottom = 0;
                return guideline7;
            case BdTuring.TYPE_ECAF /* 9 */:
                Guideline guideline8 = new Guideline(R.id.ike, "frame_right_guideline");
                guideline8.rightToRight = 0;
                return guideline8;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                Guideline guideline9 = new Guideline(R.id.kwb, "interactive_zone_push_card_bottom_guideline");
                guideline9.bottomToTop = R.id.cci;
                return guideline9;
            case BdTuring.TYPE_EMAIL /* 11 */:
                Guideline guideline10 = new Guideline(R.id.cci, "bottom_control_bar_top_guideline");
                guideline10.bottomToTop = R.id.cch;
                return guideline10;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                Guideline guideline11 = new Guideline(R.id.cch, "bottom_control_bar_bottom_guideline");
                guideline11.bottomToTop = R.id.ccg;
                return guideline11;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return new Barrier(R.id.ccg, "bottom_control_bar_bottom_barrier");
            case 14:
                Guideline guideline12 = new Guideline(R.id.kw9, "interactive_zone_bottom_guideline");
                guideline12.bottomToTop = R.id.kwc;
                return guideline12;
            case 15:
                Guideline guideline13 = new Guideline(R.id.kw8, "interactive_zone_bottom_group_top_guideline");
                guideline13.bottomToTop = R.id.kw9;
                return guideline13;
            case 16:
                Guideline guideline14 = new Guideline(R.id.kwf, "interactive_zone_top_group_bottom_guideline");
                guideline14.bottomToTop = R.id.kw8;
                return guideline14;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                Guideline guideline15 = new Guideline(R.id.video_bottom_guideline, "video_bottom_guideline");
                guideline15.bottomToBottom = 0;
                return guideline15;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                Constraint constraint = new Constraint(R.id.vl5, "slot_frame_container");
                constraint.bottomToTop = R.id.cci;
                constraint.topToTop = 0;
                return constraint;
            case 19:
                Guideline guideline16 = new Guideline(R.id.p1j, "nav_bar_top_guideline");
                guideline16.topToBottom = R.id.yah;
                return guideline16;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                Guideline guideline17 = new Guideline(R.id.p1a, "nav_bar_bottom_guideline");
                guideline17.topToTop = R.id.p1j;
                return guideline17;
            case 21:
                Placeholder placeholder = new Placeholder(R.id.gew, "ec_auction_acting_area");
                placeholder.leftToLeft = 0;
                placeholder.rightToRight = 0;
                placeholder.topToTop = R.id.p1a;
                return placeholder;
            case 22:
                Guideline guideline18 = new Guideline(R.id.hhm, "explore_top_guideline");
                guideline18.topToBottom = R.id.p1a;
                return guideline18;
            case 23:
                Guideline guideline19 = new Guideline(R.id.hgt, "explore_bottom_guideline");
                guideline19.topToBottom = R.id.hhm;
                return guideline19;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                Guideline guideline20 = new Guideline(R.id.hek, "event_info_top_guideline");
                guideline20.topToBottom = R.id.hgs;
                return guideline20;
            case 25:
                return new Placeholder(R.id.h5d, "end_widget_container");
            case 26:
                return new Placeholder(R.id.bss, "barrage_layout");
            case 27:
                return new Placeholder(R.id.gf0, "ec_barrage_layout");
            case 28:
                return new Placeholder(R.id.g_e, "draw_guess_canvas_widget_container");
            case 29:
                Constraint constraint2 = new Constraint(R.id.jrr, "horizontal_video_mask");
                constraint2.endToEnd = 0;
                constraint2.startToStart = 0;
                constraint2.topToTop = 0;
                return constraint2;
            case 30:
                Constraint constraint3 = new Constraint(R.id.kwg, "intercept_view");
                constraint3.bottomToBottom = 0;
                constraint3.endToEnd = 0;
                constraint3.startToStart = 0;
                constraint3.topToTop = 0;
                return constraint3;
            case 31:
                Constraint constraint4 = new Constraint(R.id.kvx, "interaction_top_mask_layer");
                constraint4.endToEnd = 0;
                constraint4.startToStart = 0;
                constraint4.topToTop = 0;
                return constraint4;
            case 32:
                Constraint constraint5 = new Constraint(R.id.bwl, "bg_anchor_interact_top_cover");
                constraint5.endToEnd = 0;
                constraint5.startToStart = 0;
                constraint5.topToTop = 0;
                return constraint5;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                Constraint constraint6 = new Constraint(R.id.bwj, "bg_anchor_interact");
                constraint6.bottomToBottom = 0;
                constraint6.endToEnd = 0;
                constraint6.startToStart = 0;
                constraint6.topToTop = 0;
                return constraint6;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                Placeholder placeholder2 = new Placeholder(R.id.bnr, "back_widget_container");
                placeholder2.bottomToBottom = R.id.p1a;
                placeholder2.startToStart = R.id.vyl;
                placeholder2.topToTop = R.id.p1j;
                return placeholder2;
            case 35:
                Placeholder placeholder3 = new Placeholder(R.id.user_info_container, "user_info_container");
                placeholder3.endToStart = R.id.ba7;
                placeholder3.startToEnd = R.id.vyl;
                placeholder3.topToTop = R.id.p1j;
                placeholder3.bottomToTop = R.id.p1a;
                return placeholder3;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                Placeholder placeholder4 = new Placeholder(R.id.s8f, "programmed_live_title");
                placeholder4.endToStart = R.id.vit;
                placeholder4.startToEnd = R.id.vyl;
                placeholder4.topToTop = R.id.p1j;
                placeholder4.bottomToTop = R.id.p1a;
                return placeholder4;
            case 37:
                Placeholder placeholder5 = new Placeholder(R.id.ba7, "audience_rank_list");
                placeholder5.bottomToBottom = R.id.p1a;
                placeholder5.endToStart = R.id.vit;
                placeholder5.startToEnd = R.id.user_info_container;
                placeholder5.topToTop = R.id.p1j;
                return placeholder5;
            case 38:
                Placeholder placeholder6 = new Placeholder(R.id.fas, "cumulative_watch_audience");
                placeholder6.bottomToBottom = R.id.p1a;
                placeholder6.endToStart = R.id.vit;
                placeholder6.startToEnd = R.id.user_info_container;
                placeholder6.topToTop = R.id.p1j;
                return placeholder6;
            case 39:
                Placeholder placeholder7 = new Placeholder(R.id.mo8, "like_user_info_anim_container");
                placeholder7.startToStart = R.id.user_info_container;
                placeholder7.topToTop = R.id.p1j;
                return placeholder7;
            case 40:
                Placeholder placeholder8 = new Placeholder(R.id.vit, "skylight_switch_widget_container");
                placeholder8.bottomToBottom = R.id.p1a;
                placeholder8.endToStart = R.id.e2y;
                placeholder8.topToTop = R.id.p1j;
                return placeholder8;
            case 41:
                Placeholder placeholder9 = new Placeholder(R.id.e2y, "close_widget_container");
                placeholder9.bottomToBottom = R.id.p1a;
                placeholder9.endToEnd = 0;
                placeholder9.topToTop = R.id.p1j;
                return placeholder9;
            case 42:
                Placeholder placeholder10 = new Placeholder(R.id.ioe, "full_window_switch_widget_container");
                placeholder10.bottomToBottom = R.id.p1a;
                placeholder10.endToEnd = 0;
                placeholder10.topToTop = R.id.p1j;
                return placeholder10;
            case 43:
                return new Constraint(R.id.vin, "skylight_mask");
            case 44:
                Placeholder placeholder11 = new Placeholder(R.id.id6, "floating_skylight_widget_container");
                placeholder11.endToEnd = R.id.h4p;
                placeholder11.startToStart = R.id.vyl;
                placeholder11.topToTop = R.id.p1j;
                return placeholder11;
            case 45:
                Placeholder placeholder12 = new Placeholder(R.id.kw2, "interactive_top_bar");
                placeholder12.endToEnd = 0;
                placeholder12.startToStart = 0;
                placeholder12.topToTop = R.id.kw8;
                return placeholder12;
            case 46:
                Constraint constraint7 = new Constraint(R.id.kw3, "interactive_top_bar_background");
                constraint7.endToEnd = 0;
                constraint7.startToStart = 0;
                constraint7.topToTop = R.id.kw2;
                constraint7.bottomToBottom = 0;
                return constraint7;
            case 47:
                Placeholder placeholder13 = new Placeholder(R.id.x_multi_tab_container, "x_multi_tab_container");
                placeholder13.endToEnd = 0;
                placeholder13.startToStart = 0;
                placeholder13.bottomToBottom = 0;
                placeholder13.topToBottom = R.id.kw2;
                return placeholder13;
            case 48:
                Placeholder placeholder14 = new Placeholder(R.id.dhx, "casters");
                placeholder14.endToEnd = 0;
                placeholder14.startToStart = 0;
                placeholder14.topToBottom = R.id.kw2;
                return placeholder14;
            case 49:
                Placeholder placeholder15 = new Placeholder(R.id.dhy, "casters_background");
                placeholder15.endToEnd = 0;
                placeholder15.startToStart = 0;
                placeholder15.topToTop = R.id.kw2;
                placeholder15.bottomToBottom = R.id.dhx;
                return placeholder15;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                Constraint constraint8 = new Constraint(R.id.sfo, "public_screen_background");
                constraint8.bottomToBottom = 0;
                constraint8.endToEnd = 0;
                constraint8.startToStart = 0;
                constraint8.topToTop = R.id.o_c;
                return constraint8;
            case 51:
                Placeholder placeholder16 = new Placeholder(R.id.cef, "bottom_left_link_host_container");
                placeholder16.bottomToBottom = R.id.cdt;
                placeholder16.leftToLeft = 0;
                placeholder16.topToTop = R.id.cci;
                return placeholder16;
            case 52:
                Placeholder placeholder17 = new Placeholder(R.id.ceh, "bottom_left_slot_container");
                placeholder17.bottomToBottom = R.id.cdt;
                placeholder17.leftToRight = R.id.irl;
                placeholder17.topToTop = R.id.cci;
                return placeholder17;
            case 53:
                Placeholder placeholder18 = new Placeholder(R.id.cei, "bottom_left_subs_icon");
                placeholder18.bottomToBottom = R.id.cdt;
                placeholder18.leftToRight = R.id.ceh;
                placeholder18.topToTop = R.id.cci;
                return placeholder18;
            case 54:
                return new Barrier(R.id.cej, "bottom_left_toolbar_right_barrier");
            case 55:
                Placeholder placeholder19 = new Placeholder(R.id.mlc, "left_toolbar_container");
                placeholder19.bottomToBottom = R.id.cdt;
                placeholder19.topToTop = R.id.cci;
                placeholder19.leftToLeft = 0;
                return placeholder19;
            case 56:
                Placeholder placeholder20 = new Placeholder(R.id.tml, "right_toolbar_container");
                placeholder20.bottomToBottom = R.id.cdt;
                placeholder20.rightToRight = 0;
                placeholder20.topToTop = R.id.cci;
                return placeholder20;
            case 57:
                Placeholder placeholder21 = new Placeholder(R.id.irl, "game_partnership_container");
                placeholder21.leftToLeft = 0;
                placeholder21.topToTop = R.id.cci;
                placeholder21.bottomToBottom = R.id.cdt;
                return placeholder21;
            case 58:
                Placeholder placeholder22 = new Placeholder(R.id.ebi, "comment_input_container");
                placeholder22.bottomToBottom = R.id.cdt;
                placeholder22.leftToRight = R.id.mlc;
                placeholder22.rightToLeft = R.id.tml;
                placeholder22.topToTop = R.id.cci;
                return placeholder22;
            case 59:
                Constraint constraint9 = new Constraint(R.id.cga, "bottom_right_banner_slot_container");
                constraint9.bottomToTop = R.id.cci;
                constraint9.rightToRight = R.id.tlb;
                return constraint9;
            case 60:
                Placeholder placeholder23 = new Placeholder(R.id.ght, "ec_watcher_water_mark_view_container_watcher");
                placeholder23.endToStart = R.id.h4p;
                placeholder23.bottomToTop = R.id.hei;
                return placeholder23;
            case 61:
                Placeholder placeholder24 = new Placeholder(R.id.gf3, "ec_billboard_view_container_watcher");
                placeholder24.topToBottom = R.id.hei;
                placeholder24.endToEnd = 0;
                return placeholder24;
            case BaseNotice.CREATOR /* 62 */:
                Constraint constraint10 = new Constraint(R.id.ysi, "ttlive_link_layout_layer_root_anchor_point");
                constraint10.leftToLeft = 0;
                constraint10.topToTop = 0;
                return constraint10;
            case 63:
                Constraint constraint11 = new Constraint(R.id.kv1, "interact_anchor_container");
                constraint11.leftToLeft = 0;
                constraint11.topToTop = 0;
                return constraint11;
            case 64:
                Placeholder placeholder25 = new Placeholder(R.id.pbp, "normal_interact_window_container");
                placeholder25.bottomToBottom = 0;
                placeholder25.endToEnd = 0;
                placeholder25.startToStart = 0;
                placeholder25.topToTop = 0;
                return placeholder25;
            case 65:
                Placeholder placeholder26 = new Placeholder(R.id.ir1, "game_linkmic_info_container");
                placeholder26.leftToLeft = 0;
                placeholder26.rightToRight = 0;
                placeholder26.bottomToBottom = 0;
                placeholder26.topToTop = 0;
                return placeholder26;
            case 66:
                Guideline guideline21 = new Guideline(R.id.pbo, "normal_interact_delegate_guideline");
                guideline21.rightToRight = 0;
                return guideline21;
            case 67:
                return new Barrier(R.id.kwd, "interactive_zone_right_group_left_barrier");
            case 68:
                return new Constraint(R.id.gex, "ec_auction_acting_area_left_barrier");
            case 69:
                Constraint constraint12 = new Constraint(R.id.iq0, "game_card_frame_container");
                constraint12.leftToLeft = 0;
                constraint12.rightToLeft = R.id.kwd;
                constraint12.bottomToTop = R.id.cci;
                return constraint12;
            case 70:
                return new Placeholder(R.id.kv5, "interact_cut_short_widget_container");
            case 71:
                Constraint constraint13 = new Constraint(R.id.ik5, "frame_l2_slot_container");
                constraint13.bottomToTop = R.id.kwb;
                constraint13.leftToLeft = 0;
                constraint13.rightToLeft = R.id.kwd;
                return constraint13;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                Placeholder placeholder27 = new Placeholder(R.id.gey, "ec_auction_right_bottom_acting_area");
                placeholder27.bottomToTop = R.id.kwc;
                placeholder27.leftToLeft = R.id.gex;
                placeholder27.rightToLeft = R.id.kwd;
                return placeholder27;
            case 73:
                Constraint constraint14 = new Constraint(R.id.jmj, "high_priority_slot_container");
                constraint14.bottomToTop = R.id.kwb;
                constraint14.leftToLeft = 0;
                constraint14.rightToLeft = R.id.kwd;
                return constraint14;
            case 74:
                Placeholder placeholder28 = new Placeholder(R.id.mxe, "live_event_desc_card_container");
                placeholder28.bottomToTop = R.id.kwb;
                placeholder28.leftToLeft = R.id.mk2;
                placeholder28.rightToLeft = R.id.kwd;
                return placeholder28;
            case 75:
                Placeholder placeholder29 = new Placeholder(R.id.fce, "custom_poll_card_widget_container");
                placeholder29.bottomToTop = R.id.kwb;
                placeholder29.leftToLeft = R.id.mk2;
                placeholder29.rightToLeft = R.id.kwd;
                return placeholder29;
            case 76:
                Placeholder placeholder30 = new Placeholder(R.id.fdx, "customized_perks_card");
                placeholder30.bottomToTop = R.id.kwb;
                placeholder30.leftToLeft = R.id.mk2;
                placeholder30.rightToLeft = R.id.kwd;
                return placeholder30;
            case 77:
                Placeholder placeholder31 = new Placeholder(R.id.weq, "sub_goal_card");
                placeholder31.bottomToTop = R.id.kwb;
                placeholder31.leftToLeft = R.id.mk2;
                placeholder31.rightToLeft = R.id.kwd;
                return placeholder31;
            case 78:
                return new Barrier(R.id.kwc, "interactive_zone_push_card_group_top_barrier");
            case 79:
                return new Barrier(R.id.kwa, "interactive_zone_only_push_card_group_top_barrier");
            case 80:
                return new Barrier(R.id.kw6, "interactive_zone_bottom_function_group_top_barrier");
            case 81:
                Guideline guideline22 = new Guideline(R.id.n8j, "live_toggle_watermark_container_top_spacing_guideline");
                guideline22.bottomToTop = R.id.n8i;
                return guideline22;
            case 82:
                Guideline guideline23 = new Guideline(R.id.kw7, "interactive_zone_bottom_function_group_top_spacing_guideline");
                guideline23.bottomToTop = R.id.kw6;
                return guideline23;
            case 83:
                Guideline guideline24 = new Guideline(R.id.kw5, "interactive_zone_bottom_function_group_bottom_extra_spacing_guideline");
                guideline24.bottomToTop = R.id.kw9;
                return guideline24;
            case 84:
                return new Barrier(R.id.sfq, "public_screen_bottom_barrier");
            case 85:
                Placeholder placeholder32 = new Placeholder(R.id.n2m, "live_normal_poll_container");
                placeholder32.endToStart = R.id.h4p;
                placeholder32.startToStart = R.id.o_c;
                placeholder32.topToBottom = R.id.rgd;
                return placeholder32;
            case 86:
                Placeholder placeholder33 = new Placeholder(R.id.myj, "live_gift_poll_container");
                placeholder33.endToStart = R.id.h4p;
                placeholder33.startToStart = R.id.o_c;
                placeholder33.topToBottom = R.id.rgd;
                return placeholder33;
            case 87:
                Placeholder placeholder34 = new Placeholder(R.id.g_h, "draw_guess_status_container");
                placeholder34.endToEnd = R.id.o_c;
                placeholder34.startToStart = R.id.o_c;
                placeholder34.topToBottom = R.id.rgd;
                return placeholder34;
            case 88:
                Guideline guideline25 = new Guideline(R.id.kw4, "interactive_top_bar_bottom_guideline");
                guideline25.topToTop = R.id.kw2;
                guideline25.startToStart = 0;
                guideline25.endToEnd = 0;
                return guideline25;
            case 89:
                Guideline guideline26 = new Guideline(R.id.vkw, "slot_bullet_curtain_placeholder_view");
                guideline26.topToBottom = R.id.kw4;
                guideline26.startToStart = 0;
                guideline26.endToEnd = 0;
                return guideline26;
            case 90:
                Guideline guideline27 = new Guideline(R.id.j0x, "gift_tray_in_bottom_section_bottom_guideline");
                guideline27.topToBottom = R.id.vkw;
                guideline27.startToStart = 0;
                guideline27.endToEnd = 0;
                return guideline27;
            case 91:
                return new Barrier(R.id.rgd, "poll_top_barrier");
            case 92:
                return new Barrier(R.id.rg9, "poll_state_barrier");
            case 93:
                return new Barrier(R.id.rf_, "poll_and_pin_bottom_barrier");
            case 94:
                Placeholder placeholder35 = new Placeholder(R.id.o_c, "message_view_container");
                placeholder35.bottomToTop = R.id.sfq;
                placeholder35.leftToLeft = 0;
                placeholder35.rightToLeft = R.id.gex;
                placeholder35.topToBottom = R.id.rf_;
                return placeholder35;
            case 95:
                Placeholder placeholder36 = new Placeholder(R.id.qhj, "pin_widget");
                placeholder36.endToEnd = R.id.o_c;
                placeholder36.startToStart = R.id.o_c;
                placeholder36.topToBottom = R.id.rg9;
                return placeholder36;
            case 96:
                Placeholder placeholder37 = new Placeholder(R.id.j5k, "greeting_anim_widget");
                placeholder37.endToStart = R.id.h4p;
                placeholder37.startToEnd = R.id.vyl;
                placeholder37.topToTop = 0;
                return placeholder37;
            case 97:
                Placeholder placeholder38 = new Placeholder(R.id.mnu, "like_guide_widget");
                placeholder38.endToStart = R.id.h4p;
                placeholder38.startToEnd = R.id.vyl;
                placeholder38.topToTop = 0;
                return placeholder38;
            case 98:
                Constraint constraint15 = new Constraint(R.id.sfs, "public_screen_likeable");
                constraint15.bottomToBottom = R.id.o_c;
                constraint15.endToEnd = R.id.o_c;
                constraint15.startToStart = R.id.o_c;
                constraint15.topToTop = R.id.o_c;
                return constraint15;
            case 99:
                Placeholder placeholder39 = new Placeholder(R.id.n20, "live_marketing_component");
                placeholder39.bottomToTop = R.id.kw5;
                placeholder39.leftToLeft = R.id.mk2;
                placeholder39.rightToLeft = R.id.kwd;
                return placeholder39;
            case 100:
                Placeholder placeholder40 = new Placeholder(R.id.ieo, "follow_guide_bottom_card");
                placeholder40.bottomToBottom = R.id.o_c;
                placeholder40.startToStart = R.id.o_c;
                return placeholder40;
            case 101:
                Placeholder placeholder41 = new Placeholder(R.id.f814ule, "select_poll_widget");
                placeholder41.bottomToTop = R.id.kw5;
                placeholder41.endToStart = R.id.h4p;
                placeholder41.startToStart = R.id.o_c;
                return placeholder41;
            case 102:
                Placeholder placeholder42 = new Placeholder(R.id.sup, "real_time_survey_card");
                placeholder42.bottomToTop = R.id.kw5;
                placeholder42.startToStart = R.id.o_c;
                placeholder42.endToEnd = R.id.o_c;
                return placeholder42;
            case 103:
                Placeholder placeholder43 = new Placeholder(R.id.mmt, "light_survey_transition");
                placeholder43.bottomToTop = R.id.kw9;
                placeholder43.endToEnd = R.id.o_c;
                placeholder43.startToStart = R.id.o_c;
                return placeholder43;
            case 104:
                Placeholder placeholder44 = new Placeholder(R.id.ukr, "select_gift_poll_widget");
                placeholder44.bottomToTop = R.id.kw5;
                placeholder44.endToStart = R.id.h4p;
                placeholder44.startToStart = R.id.o_c;
                return placeholder44;
            case 105:
                Placeholder placeholder45 = new Placeholder(R.id.pve, "others_like_widget_container");
                placeholder45.rightToRight = 0;
                placeholder45.bottomToBottom = 0;
                return placeholder45;
            case 106:
                Placeholder placeholder46 = new Placeholder(R.id.uoc, "self_like_widget_container");
                placeholder46.bottomToBottom = 0;
                placeholder46.leftToLeft = 0;
                placeholder46.rightToRight = 0;
                placeholder46.topToTop = 0;
                return placeholder46;
            case 107:
                Placeholder placeholder47 = new Placeholder(R.id.qjn, "pk_container");
                placeholder47.bottomToBottom = 0;
                placeholder47.endToEnd = 0;
                placeholder47.startToStart = 0;
                placeholder47.topToTop = 0;
                return placeholder47;
            case 108:
                Placeholder placeholder48 = new Placeholder(R.id.o1w, "match_audience_container");
                placeholder48.endToEnd = 0;
                placeholder48.startToStart = 0;
                placeholder48.topToTop = 0;
                return placeholder48;
            case 109:
                Placeholder placeholder49 = new Placeholder(R.id.kve, "interact_solo_container");
                placeholder49.endToEnd = 0;
                placeholder49.startToStart = 0;
                placeholder49.topToTop = 0;
                placeholder49.bottomToBottom = 0;
                return placeholder49;
            case 110:
                Placeholder placeholder50 = new Placeholder(R.id.q6g, "pcs_audience_dsl_decoration");
                placeholder50.endToEnd = 0;
                placeholder50.startToStart = 0;
                placeholder50.topToTop = 0;
                return placeholder50;
            case 111:
                return new Placeholder(R.id.mw2, "live_decoration_container");
            case 112:
                return new Placeholder(R.id.n5o, "live_roomsticker_container");
            case 113:
                return new Placeholder(R.id.n7j, "live_sticker_container");
            case 114:
                return new Placeholder(R.id.mxm, "live_event_sticker_container");
            case 115:
                return new Placeholder(R.id.m21, "karaoke_hoverball_container");
            case 116:
                return new Constraint(R.id.video_animate_container, "video_animate_container");
            case 117:
                Placeholder placeholder51 = new Placeholder(R.id.oay, "mic_room_info");
                placeholder51.bottomToTop = R.id.hgs;
                placeholder51.startToEnd = R.id.s8h;
                placeholder51.endToStart = R.id.hh1;
                placeholder51.topToBottom = R.id.s8g;
                return placeholder51;
            case 118:
                Placeholder placeholder52 = new Placeholder(R.id.sqk, "rank_container_1");
                placeholder52.bottomToTop = R.id.hgs;
                placeholder52.endToStart = R.id.wish_list_container;
                placeholder52.startToEnd = R.id.vyl;
                placeholder52.topToBottom = R.id.hhm;
                return placeholder52;
            case 119:
                Placeholder placeholder53 = new Placeholder(R.id.sql, "rank_container_2");
                placeholder53.bottomToTop = R.id.hgs;
                placeholder53.endToStart = R.id.wish_list_container;
                placeholder53.startToEnd = R.id.sqk;
                placeholder53.topToBottom = R.id.hhm;
                return placeholder53;
            case 120:
                return new Barrier(R.id.s8g, "programmed_live_title_bottom_barrier");
            case 121:
                Placeholder placeholder54 = new Placeholder(R.id.s8h, "programmed_live_user_info");
                placeholder54.startToEnd = R.id.vyl;
                placeholder54.endToEnd = R.id.hh1;
                placeholder54.topToBottom = R.id.s8g;
                return placeholder54;
            case 122:
                Placeholder placeholder55 = new Placeholder(R.id.s8c, "programmed_live_online_audience_when_menu_expand");
                placeholder55.endToStart = R.id.h4p;
                placeholder55.topToBottom = R.id.s8g;
                return placeholder55;
            case 123:
                return new Barrier(R.id.hh1, "explore_end_barrier");
            case 124:
                return new Barrier(R.id.hgs, "explore_bottom_barrier");
            case 125:
                return new Barrier(R.id.hei, "event_info_bottom_barrier");
            case 126:
                Placeholder placeholder56 = new Placeholder(R.id.vku, "slot_bullet_curtain");
                placeholder56.bottomToTop = R.id.vkv;
                placeholder56.leftToLeft = R.id.mk2;
                placeholder56.rightToLeft = R.id.kwd;
                return placeholder56;
            case 127:
                Placeholder placeholder57 = new Placeholder(R.id.ea1, "comment_combo_tray");
                placeholder57.bottomToTop = R.id.kwf;
                placeholder57.leftToLeft = R.id.mk2;
                placeholder57.rightToLeft = R.id.kwd;
                return placeholder57;
            case 128:
                Placeholder placeholder58 = new Placeholder(R.id.isf, "game_watch_focus");
                placeholder58.bottomToTop = R.id.kwf;
                placeholder58.leftToLeft = R.id.mk2;
                placeholder58.rightToLeft = R.id.kwd;
                placeholder58.topToBottom = R.id.vkw;
                return placeholder58;
            case 129:
                return new Constraint(R.id.vkv, "slot_bullet_curtain_bottom_barrier");
            case 130:
                Placeholder placeholder59 = new Placeholder(R.id.n8i, "live_toggle_watermark_container");
                placeholder59.bottomToTop = R.id.kw6;
                placeholder59.leftToLeft = 0;
                placeholder59.rightToRight = R.id.o_c;
                return placeholder59;
            case 131:
                Placeholder placeholder60 = new Placeholder(R.id.sme, "quick_comment_container");
                placeholder60.bottomToTop = R.id.kw5;
                placeholder60.endToEnd = 0;
                placeholder60.startToStart = 0;
                return placeholder60;
            case 132:
                Placeholder placeholder61 = new Placeholder(R.id.wu1, "switch_definition_tips_container");
                placeholder61.bottomToTop = R.id.cci;
                placeholder61.endToEnd = 0;
                placeholder61.startToStart = 0;
                return placeholder61;
            case 133:
                Placeholder placeholder62 = new Placeholder(R.id.io_, "full_video_layout");
                placeholder62.endToStart = R.id.h4p;
                placeholder62.topToTop = 0;
                return placeholder62;
            case 134:
                Placeholder placeholder63 = new Placeholder(R.id.s8b, "programmed_live_online_audience_when_menu_collapse");
                placeholder63.endToStart = R.id.h4p;
                placeholder63.topToBottom = R.id.hhm;
                placeholder63.bottomToTop = R.id.hgs;
                return placeholder63;
            case 135:
                Placeholder placeholder64 = new Placeholder(R.id.xn2, "text_header_display_container");
                placeholder64.topToBottom = R.id.hek;
                return placeholder64;
            case 136:
                Placeholder placeholder65 = new Placeholder(R.id.yci, "top_right_banner_container");
                placeholder65.endToStart = R.id.h4p;
                placeholder65.topToBottom = R.id.hhm;
                return placeholder65;
            case 137:
                Placeholder placeholder66 = new Placeholder(R.id.wish_list_container, "wish_list_container");
                placeholder66.endToStart = R.id.yci;
                placeholder66.topToBottom = R.id.hhm;
                return placeholder66;
            case 138:
                Placeholder placeholder67 = new Placeholder(R.id.j7j, "group_live_container");
                placeholder67.topToTop = 0;
                placeholder67.bottomToBottom = 0;
                placeholder67.leftToLeft = 0;
                placeholder67.rightToRight = 0;
                return placeholder67;
            case 139:
                Placeholder placeholder68 = new Placeholder(R.id.viewer_wishes_container, "viewer_wishes_container");
                placeholder68.topToTop = 0;
                placeholder68.bottomToBottom = 0;
                placeholder68.leftToLeft = 0;
                placeholder68.rightToRight = 0;
                return placeholder68;
            case 140:
                Placeholder placeholder69 = new Placeholder(R.id.bpl, "backup_tip_container");
                placeholder69.endToStart = R.id.h4p;
                placeholder69.topToBottom = R.id.hei;
                return placeholder69;
            case 141:
                Placeholder placeholder70 = new Placeholder(R.id.v97, "short_touch_view_widget_container");
                placeholder70.startToEnd = R.id.vyl;
                placeholder70.topToBottom = R.id.hek;
                return placeholder70;
            case 142:
                return new Placeholder(R.id.yjr, "treasure_box_widget_container");
            case 143:
                Placeholder placeholder71 = new Placeholder(R.id.v96, "short_touch_preview_widget_container");
                placeholder71.startToStart = 0;
                placeholder71.topToBottom = R.id.v97;
                return placeholder71;
            case 144:
                Placeholder placeholder72 = new Placeholder(R.id.fgl, "debug_info_container");
                placeholder72.endToEnd = 0;
                placeholder72.startToStart = 0;
                placeholder72.topToBottom = R.id.hei;
                return placeholder72;
            case 145:
                Placeholder placeholder73 = new Placeholder(R.id.kv7, "interact_debug_info_container");
                placeholder73.bottomToBottom = 0;
                placeholder73.rightToRight = 0;
                placeholder73.topToTop = 0;
                return placeholder73;
            case 146:
                Constraint constraint16 = new Constraint(R.id.n3_, "live_pause_text_view");
                constraint16.bottomToBottom = 0;
                constraint16.endToEnd = 0;
                constraint16.startToStart = 0;
                constraint16.topToTop = 0;
                return constraint16;
            case 147:
                Placeholder placeholder74 = new Placeholder(R.id.j2h, "global_notification");
                placeholder74.topToBottom = R.id.hek;
                return placeholder74;
            case 148:
                Placeholder placeholder75 = new Placeholder(R.id.n4a, "live_privilege_announcement_container");
                placeholder75.topToBottom = R.id.hek;
                return placeholder75;
            case 149:
                Placeholder placeholder76 = new Placeholder(R.id.ye6, "top_video_container");
                placeholder76.topToTop = R.id.hei;
                placeholder76.bottomToBottom = 0;
                return placeholder76;
            case 150:
                return LJJI();
            case 151:
                return LIZJ();
            case 152:
                return LIZLLL();
            case 153:
                return LIZIZ();
            case 154:
                return LJIILJJIL();
            case 155:
                return LJIILL();
            case 156:
                return LJIILLIIL();
            case 157:
                return LJJ();
            case 158:
                return LJIL();
            case 159:
                return LJIIL();
            case 160:
                return LJFF();
            case 161:
                return LJI();
            case 162:
                return LIZ();
            case 163:
                return LJIJJLI();
            case 164:
                return LJIILIIL();
            case 165:
                return LJIIIIZZ();
            case 166:
                return LJIIJJI();
            case 167:
                return LJIJI();
            case 168:
                return LJIJJ();
            case 169:
                return LJ();
            case 170:
                return LJII();
            case 171:
                return LJIJ();
            case 172:
                return LJIIIZ();
            case 173:
                return LJIIZILJ();
            case 174:
                return LJIIJ();
            default:
                return null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.XmlConstraintSolver, com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public final DefaultProperty getDefaultProperty(Context context, int i) {
        switch (C1083360eIY.LIZIZ(i)) {
            case 21:
                DefaultProperty.Builder builder = new DefaultProperty.Builder();
                builder.setVisibility(8);
                return builder.build();
            case 22:
            case 23:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
            case 37:
            case 39:
            case 41:
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
            case 54:
            case 56:
            case 58:
            case 60:
            case 61:
            case BaseNotice.CREATOR /* 62 */:
            case 63:
            case 64:
            case 65:
            case 67:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 116:
            case 120:
            case 122:
            case 123:
            case 124:
            case 125:
            case 129:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 140:
            case 141:
            case 142:
            case 143:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 157:
            case 170:
            case 173:
            default:
                return new DefaultProperty.Builder().build();
            case 29:
                DefaultProperty.Builder builder2 = new DefaultProperty.Builder();
                builder2.setVisibility(8);
                return builder2.build();
            case 30:
                DefaultProperty.Builder builder3 = new DefaultProperty.Builder();
                builder3.setVisibility(8);
                return builder3.build();
            case 31:
                DefaultProperty.Builder builder4 = new DefaultProperty.Builder();
                builder4.setVisibility(8);
                return builder4.build();
            case 32:
                DefaultProperty.Builder builder5 = new DefaultProperty.Builder();
                builder5.setVisibility(8);
                return builder5.build();
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                DefaultProperty.Builder builder6 = new DefaultProperty.Builder();
                builder6.setVisibility(8);
                return builder6.build();
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                DefaultProperty.Builder builder7 = new DefaultProperty.Builder();
                builder7.setVisibility(8);
                return builder7.build();
            case 35:
                DefaultProperty.Builder builder8 = new DefaultProperty.Builder();
                builder8.setVisibility(8);
                return builder8.build();
            case 38:
                DefaultProperty.Builder builder9 = new DefaultProperty.Builder();
                builder9.setVisibility(8);
                return builder9.build();
            case 40:
                DefaultProperty.Builder builder10 = new DefaultProperty.Builder();
                builder10.setVisibility(8);
                return builder10.build();
            case 42:
                DefaultProperty.Builder builder11 = new DefaultProperty.Builder();
                builder11.setVisibility(8);
                return builder11.build();
            case 43:
                DefaultProperty.Builder builder12 = new DefaultProperty.Builder();
                builder12.setVisibility(8);
                return builder12.build();
            case 44:
                DefaultProperty.Builder builder13 = new DefaultProperty.Builder();
                builder13.setVisibility(8);
                return builder13.build();
            case 45:
                DefaultProperty.Builder builder14 = new DefaultProperty.Builder();
                builder14.setVisibility(8);
                return builder14.build();
            case 46:
                DefaultProperty.Builder builder15 = new DefaultProperty.Builder();
                builder15.setVisibility(8);
                return builder15.build();
            case 47:
                DefaultProperty.Builder builder16 = new DefaultProperty.Builder();
                builder16.setVisibility(8);
                return builder16.build();
            case 48:
                DefaultProperty.Builder builder17 = new DefaultProperty.Builder();
                builder17.setVisibility(8);
                return builder17.build();
            case 49:
                DefaultProperty.Builder builder18 = new DefaultProperty.Builder();
                builder18.setVisibility(8);
                return builder18.build();
            case 51:
                DefaultProperty.Builder builder19 = new DefaultProperty.Builder();
                builder19.setVisibility(8);
                return builder19.build();
            case 52:
                DefaultProperty.Builder builder20 = new DefaultProperty.Builder();
                builder20.setVisibility(8);
                return builder20.build();
            case 53:
                DefaultProperty.Builder builder21 = new DefaultProperty.Builder();
                builder21.setVisibility(8);
                return builder21.build();
            case 55:
                DefaultProperty.Builder builder22 = new DefaultProperty.Builder();
                builder22.setVisibility(8);
                return builder22.build();
            case 57:
                DefaultProperty.Builder builder23 = new DefaultProperty.Builder();
                builder23.setVisibility(8);
                return builder23.build();
            case 59:
                DefaultProperty.Builder builder24 = new DefaultProperty.Builder();
                builder24.setVisibility(8);
                return builder24.build();
            case 66:
                DefaultProperty.Builder builder25 = new DefaultProperty.Builder();
                builder25.setVisibility(8);
                return builder25.build();
            case 68:
                DefaultProperty.Builder builder26 = new DefaultProperty.Builder();
                builder26.setVisibility(8);
                return builder26.build();
            case 69:
                DefaultProperty.Builder builder27 = new DefaultProperty.Builder();
                builder27.setVisibility(8);
                return builder27.build();
            case 70:
                DefaultProperty.Builder builder28 = new DefaultProperty.Builder();
                builder28.setVisibility(8);
                return builder28.build();
            case 71:
                DefaultProperty.Builder builder29 = new DefaultProperty.Builder();
                builder29.setVisibility(8);
                return builder29.build();
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                DefaultProperty.Builder builder30 = new DefaultProperty.Builder();
                builder30.setVisibility(8);
                return builder30.build();
            case 73:
                DefaultProperty.Builder builder31 = new DefaultProperty.Builder();
                builder31.setVisibility(8);
                return builder31.build();
            case 74:
                DefaultProperty.Builder builder32 = new DefaultProperty.Builder();
                builder32.setVisibility(8);
                return builder32.build();
            case 75:
                DefaultProperty.Builder builder33 = new DefaultProperty.Builder();
                builder33.setVisibility(8);
                return builder33.build();
            case 76:
                DefaultProperty.Builder builder34 = new DefaultProperty.Builder();
                builder34.setVisibility(8);
                return builder34.build();
            case 77:
                DefaultProperty.Builder builder35 = new DefaultProperty.Builder();
                builder35.setVisibility(8);
                return builder35.build();
            case 85:
                DefaultProperty.Builder builder36 = new DefaultProperty.Builder();
                builder36.setVisibility(8);
                return builder36.build();
            case 86:
                DefaultProperty.Builder builder37 = new DefaultProperty.Builder();
                builder37.setVisibility(8);
                return builder37.build();
            case 87:
                DefaultProperty.Builder builder38 = new DefaultProperty.Builder();
                builder38.setVisibility(8);
                return builder38.build();
            case 88:
                DefaultProperty.Builder builder39 = new DefaultProperty.Builder();
                builder39.setVisibility(8);
                return builder39.build();
            case 89:
                DefaultProperty.Builder builder40 = new DefaultProperty.Builder();
                builder40.setVisibility(8);
                return builder40.build();
            case 96:
                DefaultProperty.Builder builder41 = new DefaultProperty.Builder();
                builder41.setVisibility(8);
                return builder41.build();
            case 97:
                DefaultProperty.Builder builder42 = new DefaultProperty.Builder();
                builder42.setVisibility(8);
                return builder42.build();
            case 98:
                DefaultProperty.Builder builder43 = new DefaultProperty.Builder();
                builder43.setVisibility(8);
                return builder43.build();
            case 99:
                DefaultProperty.Builder builder44 = new DefaultProperty.Builder();
                builder44.setVisibility(8);
                return builder44.build();
            case 100:
                DefaultProperty.Builder builder45 = new DefaultProperty.Builder();
                builder45.setVisibility(8);
                return builder45.build();
            case 101:
                DefaultProperty.Builder builder46 = new DefaultProperty.Builder();
                builder46.setVisibility(8);
                return builder46.build();
            case 102:
                DefaultProperty.Builder builder47 = new DefaultProperty.Builder();
                builder47.setVisibility(8);
                return builder47.build();
            case 103:
                DefaultProperty.Builder builder48 = new DefaultProperty.Builder();
                builder48.setVisibility(8);
                return builder48.build();
            case 104:
                DefaultProperty.Builder builder49 = new DefaultProperty.Builder();
                builder49.setVisibility(8);
                return builder49.build();
            case 115:
                DefaultProperty.Builder builder50 = new DefaultProperty.Builder();
                builder50.setVisibility(8);
                return builder50.build();
            case 117:
                DefaultProperty.Builder builder51 = new DefaultProperty.Builder();
                builder51.setVisibility(8);
                return builder51.build();
            case 118:
                DefaultProperty.Builder builder52 = new DefaultProperty.Builder();
                builder52.setVisibility(8);
                return builder52.build();
            case 119:
                DefaultProperty.Builder builder53 = new DefaultProperty.Builder();
                builder53.setVisibility(8);
                return builder53.build();
            case 121:
                DefaultProperty.Builder builder54 = new DefaultProperty.Builder();
                builder54.setVisibility(8);
                return builder54.build();
            case 126:
                DefaultProperty.Builder builder55 = new DefaultProperty.Builder();
                builder55.setVisibility(8);
                return builder55.build();
            case 127:
                DefaultProperty.Builder builder56 = new DefaultProperty.Builder();
                builder56.setVisibility(8);
                return builder56.build();
            case 128:
                DefaultProperty.Builder builder57 = new DefaultProperty.Builder();
                builder57.setVisibility(8);
                return builder57.build();
            case 130:
                DefaultProperty.Builder builder58 = new DefaultProperty.Builder();
                builder58.setVisibility(8);
                return builder58.build();
            case 131:
                DefaultProperty.Builder builder59 = new DefaultProperty.Builder();
                builder59.setVisibility(8);
                return builder59.build();
            case 137:
                DefaultProperty.Builder builder60 = new DefaultProperty.Builder();
                builder60.setVisibility(8);
                return builder60.build();
            case 138:
                DefaultProperty.Builder builder61 = new DefaultProperty.Builder();
                builder61.setVisibility(8);
                return builder61.build();
            case 139:
                DefaultProperty.Builder builder62 = new DefaultProperty.Builder();
                builder62.setVisibility(8);
                return builder62.build();
            case 144:
                DefaultProperty.Builder builder63 = new DefaultProperty.Builder();
                builder63.setVisibility(8);
                return builder63.build();
            case 145:
                DefaultProperty.Builder builder64 = new DefaultProperty.Builder();
                builder64.setVisibility(8);
                return builder64.build();
            case 146:
                DefaultProperty.Builder builder65 = new DefaultProperty.Builder();
                builder65.setVisibility(8);
                return builder65.build();
            case 147:
                DefaultProperty.Builder builder66 = new DefaultProperty.Builder();
                builder66.setVisibility(8);
                return builder66.build();
            case 148:
                DefaultProperty.Builder builder67 = new DefaultProperty.Builder();
                builder67.setVisibility(8);
                return builder67.build();
            case 149:
                DefaultProperty.Builder builder68 = new DefaultProperty.Builder();
                builder68.setVisibility(8);
                return builder68.build();
            case 155:
                DefaultProperty.Builder builder69 = new DefaultProperty.Builder();
                builder69.setVisibility(8);
                return builder69.build();
            case 156:
                DefaultProperty.Builder builder70 = new DefaultProperty.Builder();
                builder70.setVisibility(8);
                return builder70.build();
            case 158:
                DefaultProperty.Builder builder71 = new DefaultProperty.Builder();
                builder71.setVisibility(8);
                return builder71.build();
            case 159:
                DefaultProperty.Builder builder72 = new DefaultProperty.Builder();
                builder72.setVisibility(8);
                return builder72.build();
            case 160:
                DefaultProperty.Builder builder73 = new DefaultProperty.Builder();
                builder73.setVisibility(8);
                return builder73.build();
            case 161:
                DefaultProperty.Builder builder74 = new DefaultProperty.Builder();
                builder74.setVisibility(8);
                return builder74.build();
            case 162:
                DefaultProperty.Builder builder75 = new DefaultProperty.Builder();
                builder75.setVisibility(8);
                return builder75.build();
            case 163:
                DefaultProperty.Builder builder76 = new DefaultProperty.Builder();
                builder76.setVisibility(8);
                return builder76.build();
            case 164:
                DefaultProperty.Builder builder77 = new DefaultProperty.Builder();
                builder77.setVisibility(8);
                return builder77.build();
            case 165:
                DefaultProperty.Builder builder78 = new DefaultProperty.Builder();
                builder78.setVisibility(8);
                return builder78.build();
            case 166:
                DefaultProperty.Builder builder79 = new DefaultProperty.Builder();
                builder79.setVisibility(8);
                return builder79.build();
            case 167:
                DefaultProperty.Builder builder80 = new DefaultProperty.Builder();
                builder80.setVisibility(8);
                return builder80.build();
            case 168:
                DefaultProperty.Builder builder81 = new DefaultProperty.Builder();
                builder81.setVisibility(8);
                return builder81.build();
            case 169:
                DefaultProperty.Builder builder82 = new DefaultProperty.Builder();
                builder82.setVisibility(8);
                return builder82.build();
            case 171:
                DefaultProperty.Builder builder83 = new DefaultProperty.Builder();
                builder83.setVisibility(8);
                return builder83.build();
            case 172:
                DefaultProperty.Builder builder84 = new DefaultProperty.Builder();
                builder84.setVisibility(8);
                return builder84.build();
            case 174:
                DefaultProperty.Builder builder85 = new DefaultProperty.Builder();
                builder85.setVisibility(8);
                return builder85.build();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public final LayeredConstraintLayout$LayoutParams getOrCreateLayoutParams(Context context, int i) {
        switch (C1083360eIY.LIZIZ(i)) {
            case 2:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asf);
                return layeredConstraintLayout$LayoutParams;
            case 3:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams2 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams2).topMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams2;
            case 4:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams3 = new LayeredConstraintLayout$LayoutParams(-2, -1);
                layeredConstraintLayout$LayoutParams3.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.asf));
                return layeredConstraintLayout$LayoutParams3;
            case 5:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams4 = new LayeredConstraintLayout$LayoutParams(-2, -1);
                layeredConstraintLayout$LayoutParams4.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asf));
                return layeredConstraintLayout$LayoutParams4;
            case 6:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams5 = new LayeredConstraintLayout$LayoutParams(-2, -1);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams5).leftMargin = context.getResources().getDimensionPixelSize(R.dimen.asf);
                return layeredConstraintLayout$LayoutParams5;
            case 7:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams6 = new LayeredConstraintLayout$LayoutParams(-2, -1);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams6).rightMargin = context.getResources().getDimensionPixelSize(R.dimen.asf);
                return layeredConstraintLayout$LayoutParams6;
            case 8:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams7 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams7).bottomMargin = C1083360eIY.LIZ(56, context);
                return layeredConstraintLayout$LayoutParams7;
            case BdTuring.TYPE_ECAF /* 9 */:
                return new LayeredConstraintLayout$LayoutParams(-2, -1);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams8 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams8).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.as8);
                return layeredConstraintLayout$LayoutParams8;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 14:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams9 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams9).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams9;
            case 15:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams10 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams10).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.au8);
                return layeredConstraintLayout$LayoutParams10;
            case 16:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams11 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams11).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams11;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return new LayeredConstraintLayout$LayoutParams(-1, 0);
            case 19:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams12 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams12).topMargin = context.getResources().getDimensionPixelSize(R.dimen.ash);
                return layeredConstraintLayout$LayoutParams12;
            case 21:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams13 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams13).topMargin = C1083360eIY.LIZ(48, context);
                return layeredConstraintLayout$LayoutParams13;
            case 22:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams14 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams14).topMargin = context.getResources().getDimensionPixelSize(R.dimen.ask);
                return layeredConstraintLayout$LayoutParams14;
            case 23:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams15 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams15).topMargin = context.getResources().getDimensionPixelSize(R.dimen.sn);
                return layeredConstraintLayout$LayoutParams15;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams16 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams16).topMargin = context.getResources().getDimensionPixelSize(R.dimen.ask);
                layeredConstraintLayout$LayoutParams16.goneTopMargin = 0;
                return layeredConstraintLayout$LayoutParams16;
            case 25:
                return new LayeredConstraintLayout$LayoutParams(-2, -1);
            case 26:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 27:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 28:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 29:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams17 = new LayeredConstraintLayout$LayoutParams(0, C1083360eIY.LIZ(210, context));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams17).topMargin = C1083360eIY.LIZ(100, context);
                return layeredConstraintLayout$LayoutParams17;
            case 30:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 31:
                return new LayeredConstraintLayout$LayoutParams(0, C1083360eIY.LIZ(140, context));
            case 32:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return new LayeredConstraintLayout$LayoutParams(C1083360eIY.LIZ(18, context), C1083360eIY.LIZ(18, context));
            case 35:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams18 = new LayeredConstraintLayout$LayoutParams(-2, 0);
                layeredConstraintLayout$LayoutParams18.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asf));
                layeredConstraintLayout$LayoutParams18.constrainedWidth = true;
                layeredConstraintLayout$LayoutParams18.horizontalBias = 0.0f;
                layeredConstraintLayout$LayoutParams18.horizontalChainStyle = 1;
                return layeredConstraintLayout$LayoutParams18;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams19 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams19.setMarginStart(0);
                layeredConstraintLayout$LayoutParams19.setMarginEnd(C1083360eIY.LIZ(28, context));
                layeredConstraintLayout$LayoutParams19.constrainedWidth = true;
                layeredConstraintLayout$LayoutParams19.horizontalBias = 0.0f;
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams19).topMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams19;
            case 37:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams20 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams20.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asf));
                layeredConstraintLayout$LayoutParams20.constrainedWidth = true;
                layeredConstraintLayout$LayoutParams20.horizontalBias = 1.0f;
                layeredConstraintLayout$LayoutParams20.horizontalChainStyle = 1;
                return layeredConstraintLayout$LayoutParams20;
            case 38:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams21 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams21.setMarginEnd(C1083360eIY.LIZ(8, context));
                layeredConstraintLayout$LayoutParams21.constrainedWidth = true;
                layeredConstraintLayout$LayoutParams21.horizontalBias = 1.0f;
                layeredConstraintLayout$LayoutParams21.horizontalChainStyle = 1;
                return layeredConstraintLayout$LayoutParams21;
            case 39:
                return new LayeredConstraintLayout$LayoutParams(-2, C1083360eIY.LIZ(36, context));
            case 40:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 41:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams22 = new LayeredConstraintLayout$LayoutParams(C1083360eIY.LIZ(24, context), C1083360eIY.LIZ(24, context));
                layeredConstraintLayout$LayoutParams22.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asg));
                return layeredConstraintLayout$LayoutParams22;
            case 42:
                return new LayeredConstraintLayout$LayoutParams(-2, context.getResources().getDimensionPixelSize(R.dimen.sn));
            case 43:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 44:
                return new LayeredConstraintLayout$LayoutParams(0, -2);
            case 45:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams23 = new LayeredConstraintLayout$LayoutParams(0, 0);
                layeredConstraintLayout$LayoutParams23.setMarginStart(0);
                layeredConstraintLayout$LayoutParams23.setMarginEnd(0);
                layeredConstraintLayout$LayoutParams23.constrainedWidth = true;
                return layeredConstraintLayout$LayoutParams23;
            case 46:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 47:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams24 = new LayeredConstraintLayout$LayoutParams(0, 0);
                layeredConstraintLayout$LayoutParams24.setMarginStart(0);
                layeredConstraintLayout$LayoutParams24.setMarginEnd(0);
                layeredConstraintLayout$LayoutParams24.constrainedWidth = true;
                return layeredConstraintLayout$LayoutParams24;
            case 48:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams25 = new LayeredConstraintLayout$LayoutParams(0, 0);
                layeredConstraintLayout$LayoutParams25.setMarginStart(0);
                layeredConstraintLayout$LayoutParams25.setMarginEnd(0);
                layeredConstraintLayout$LayoutParams25.constrainedWidth = true;
                return layeredConstraintLayout$LayoutParams25;
            case 49:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams26 = new LayeredConstraintLayout$LayoutParams(0, 0);
                layeredConstraintLayout$LayoutParams26.setMarginStart(0);
                layeredConstraintLayout$LayoutParams26.setMarginEnd(0);
                layeredConstraintLayout$LayoutParams26.constrainedWidth = true;
                return layeredConstraintLayout$LayoutParams26;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 51:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams27 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams27).leftMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams27;
            case 52:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 53:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 54:
                return new LayeredConstraintLayout$LayoutParams(-2, -1);
            case 55:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 56:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 57:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams28 = new LayeredConstraintLayout$LayoutParams(0, 0);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams28).leftMargin = context.getResources().getDimensionPixelSize(R.dimen.asf);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams28).rightMargin = context.getResources().getDimensionPixelSize(R.dimen.asl);
                return layeredConstraintLayout$LayoutParams28;
            case 58:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 59:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams29 = new LayeredConstraintLayout$LayoutParams(C1083360eIY.LIZ(114, context), -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams29).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams29;
            case 60:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams30 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams30).bottomMargin = C1083360eIY.LIZ(4, context);
                return layeredConstraintLayout$LayoutParams30;
            case 61:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams31 = new LayeredConstraintLayout$LayoutParams(0, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams31).topMargin = C1083360eIY.LIZ(8, context);
                return layeredConstraintLayout$LayoutParams31;
            case BaseNotice.CREATOR /* 62 */:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 63:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 64:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 65:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 66:
                return new LayeredConstraintLayout$LayoutParams(-2, -1);
            case 67:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 68:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 69:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 70:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 71:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams32 = new LayeredConstraintLayout$LayoutParams(0, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams32).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams32;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams33 = new LayeredConstraintLayout$LayoutParams(C1083360eIY.LIZ(108, context), C1083360eIY.LIZ(100, context));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams33).rightMargin = C1083360eIY.LIZ(12, context);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams33).bottomMargin = C1083360eIY.LIZ(4, context);
                return layeredConstraintLayout$LayoutParams33;
            case 73:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams34 = new LayeredConstraintLayout$LayoutParams(0, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams34).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams34;
            case 74:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams35 = new LayeredConstraintLayout$LayoutParams(0, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams35).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                layeredConstraintLayout$LayoutParams35.goneBottomMargin = 0;
                return layeredConstraintLayout$LayoutParams35;
            case 75:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams36 = new LayeredConstraintLayout$LayoutParams(0, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams36).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                layeredConstraintLayout$LayoutParams36.goneBottomMargin = 0;
                return layeredConstraintLayout$LayoutParams36;
            case 76:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams37 = new LayeredConstraintLayout$LayoutParams(0, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams37).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                layeredConstraintLayout$LayoutParams37.goneBottomMargin = 0;
                return layeredConstraintLayout$LayoutParams37;
            case 77:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams38 = new LayeredConstraintLayout$LayoutParams(0, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams38).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                layeredConstraintLayout$LayoutParams38.goneBottomMargin = 0;
                return layeredConstraintLayout$LayoutParams38;
            case 78:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 79:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 80:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 81:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams39 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams39).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.ask);
                layeredConstraintLayout$LayoutParams39.goneBottomMargin = 0;
                return layeredConstraintLayout$LayoutParams39;
            case 82:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams40 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams40).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.ask);
                layeredConstraintLayout$LayoutParams40.goneBottomMargin = 0;
                return layeredConstraintLayout$LayoutParams40;
            case 83:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 84:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 85:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams41 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams41.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.avm));
                return layeredConstraintLayout$LayoutParams41;
            case 86:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams42 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams42.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.avm));
                return layeredConstraintLayout$LayoutParams42;
            case 87:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams43 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams43.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.avm));
                layeredConstraintLayout$LayoutParams43.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.avm));
                layeredConstraintLayout$LayoutParams43.matchConstraintDefaultWidth = 1;
                layeredConstraintLayout$LayoutParams43.horizontalBias = 0.0f;
                return layeredConstraintLayout$LayoutParams43;
            case 88:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams44 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams44).topMargin = C1083360eIY.LIZ(42, context);
                return layeredConstraintLayout$LayoutParams44;
            case 89:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams45 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams45).topMargin = context.getResources().getDimensionPixelSize(R.dimen.ayg);
                return layeredConstraintLayout$LayoutParams45;
            case 90:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 91:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 92:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 93:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 94:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 95:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams46 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams46.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.asg));
                layeredConstraintLayout$LayoutParams46.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asg));
                return layeredConstraintLayout$LayoutParams46;
            case 96:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams47 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams47).topMargin = C1083360eIY.LIZ(284, context);
                return layeredConstraintLayout$LayoutParams47;
            case 97:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams48 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams48).topMargin = C1083360eIY.LIZ(284, context);
                return layeredConstraintLayout$LayoutParams48;
            case 98:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 99:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams49 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams49).rightMargin = context.getResources().getDimensionPixelSize(R.dimen.avm);
                layeredConstraintLayout$LayoutParams49.constrainedWidth = true;
                layeredConstraintLayout$LayoutParams49.horizontalBias = 0.0f;
                return layeredConstraintLayout$LayoutParams49;
            case 100:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams50 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams50.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.asf));
                return layeredConstraintLayout$LayoutParams50;
            case 101:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams51 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams51.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.avm));
                return layeredConstraintLayout$LayoutParams51;
            case 102:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams52 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams52.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.avm));
                layeredConstraintLayout$LayoutParams52.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asg));
                return layeredConstraintLayout$LayoutParams52;
            case 103:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams53 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams53.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.avm));
                layeredConstraintLayout$LayoutParams53.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asg));
                return layeredConstraintLayout$LayoutParams53;
            case 104:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams54 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams54.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.avm));
                return layeredConstraintLayout$LayoutParams54;
            case 105:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams55 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams55).bottomMargin = C1083360eIY.LIZ(32, context);
                return layeredConstraintLayout$LayoutParams55;
            case 106:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 107:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 108:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 109:
                return new LayeredConstraintLayout$LayoutParams(0, 0);
            case 110:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 111:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 112:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 113:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 114:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 115:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 116:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 117:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams56 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams56.setMarginStart(C1083360eIY.LIZ(6, context));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams56).topMargin = C1083360eIY.LIZ(6, context);
                layeredConstraintLayout$LayoutParams56.constrainedWidth = true;
                layeredConstraintLayout$LayoutParams56.horizontalBias = 0.0f;
                layeredConstraintLayout$LayoutParams56.horizontalChainStyle = 2;
                layeredConstraintLayout$LayoutParams56.goneStartMargin = 0;
                return layeredConstraintLayout$LayoutParams56;
            case 118:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams57 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams57.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.ask));
                layeredConstraintLayout$LayoutParams57.constrainedWidth = false;
                return layeredConstraintLayout$LayoutParams57;
            case 119:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams58 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams58.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.asg));
                layeredConstraintLayout$LayoutParams58.constrainedWidth = true;
                return layeredConstraintLayout$LayoutParams58;
            case 120:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 121:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams59 = new LayeredConstraintLayout$LayoutParams(-2, C1083360eIY.LIZ(22, context));
                layeredConstraintLayout$LayoutParams59.constrainedWidth = true;
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams59).topMargin = context.getResources().getDimensionPixelSize(R.dimen.ask);
                layeredConstraintLayout$LayoutParams59.horizontalBias = 0.0f;
                layeredConstraintLayout$LayoutParams59.goneStartMargin = 0;
                return layeredConstraintLayout$LayoutParams59;
            case 122:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams60 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams60).topMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams60;
            case 123:
                return new LayeredConstraintLayout$LayoutParams(-2, -1);
            case 124:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 125:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 126:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams61 = new LayeredConstraintLayout$LayoutParams(0, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams61).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                layeredConstraintLayout$LayoutParams61.goneBottomMargin = 0;
                return layeredConstraintLayout$LayoutParams61;
            case 127:
                return new LayeredConstraintLayout$LayoutParams(0, -2);
            case 128:
                return new LayeredConstraintLayout$LayoutParams(0, -2);
            case 129:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 130:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams62 = new LayeredConstraintLayout$LayoutParams(0, -2);
                layeredConstraintLayout$LayoutParams62.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.asa));
                layeredConstraintLayout$LayoutParams62.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asg));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams62).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.ask);
                return layeredConstraintLayout$LayoutParams62;
            case 131:
                return new LayeredConstraintLayout$LayoutParams(0, context.getResources().getDimensionPixelSize(R.dimen.awe));
            case 132:
                return new LayeredConstraintLayout$LayoutParams(0, -2);
            case 133:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams63 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams63).topMargin = C1083360eIY.LIZ(230, context);
                return layeredConstraintLayout$LayoutParams63;
            case 134:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 135:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 136:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams64 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams64.constrainedHeight = true;
                return layeredConstraintLayout$LayoutParams64;
            case 137:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams65 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams65.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.ask));
                return layeredConstraintLayout$LayoutParams65;
            case 138:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams66 = new LayeredConstraintLayout$LayoutParams(0, 0);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams66).topMargin = C1083360eIY.LIZ(130, context);
                return layeredConstraintLayout$LayoutParams66;
            case 139:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams67 = new LayeredConstraintLayout$LayoutParams(0, 0);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams67).topMargin = C1083360eIY.LIZ(130, context);
                return layeredConstraintLayout$LayoutParams67;
            case 140:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams68 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams68).topMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                layeredConstraintLayout$LayoutParams68.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asf));
                layeredConstraintLayout$LayoutParams68.goneTopMargin = 0;
                return layeredConstraintLayout$LayoutParams68;
            case 141:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams69 = new LayeredConstraintLayout$LayoutParams(-2, context.getResources().getDimensionPixelSize(R.dimen.ayd));
                layeredConstraintLayout$LayoutParams69.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asg));
                layeredConstraintLayout$LayoutParams69.constrainedWidth = true;
                layeredConstraintLayout$LayoutParams69.horizontalBias = 0.0f;
                layeredConstraintLayout$LayoutParams69.matchConstraintMaxWidth = C1083360eIY.LIZ(150, context);
                return layeredConstraintLayout$LayoutParams69;
            case 142:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams70 = new LayeredConstraintLayout$LayoutParams(-1, -1);
                layeredConstraintLayout$LayoutParams70.constrainedWidth = true;
                return layeredConstraintLayout$LayoutParams70;
            case 143:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams71 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams71.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.asf));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams71).topMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams71;
            case 144:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams72 = new LayeredConstraintLayout$LayoutParams(0, C1083360eIY.LIZ(295, context));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams72).leftMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams72).rightMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams72).topMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams72).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.b0m);
                return layeredConstraintLayout$LayoutParams72;
            case 145:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 146:
                return new LayeredConstraintLayout$LayoutParams(-2, -2);
            case 147:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 148:
                return new LayeredConstraintLayout$LayoutParams(-1, -2);
            case 149:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams73 = new LayeredConstraintLayout$LayoutParams(-1, 0);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams73).topMargin = context.getResources().getDimensionPixelSize(R.dimen.asl);
                layeredConstraintLayout$LayoutParams73.constrainedHeight = true;
                return layeredConstraintLayout$LayoutParams73;
            case 150:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams74 = new LayeredConstraintLayout$LayoutParams(C1083360eIY.LIZ(162, context), -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams74).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                return layeredConstraintLayout$LayoutParams74;
            case 151:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams75 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams75).topMargin = context.getResources().getDimensionPixelSize(R.dimen.alh);
                return layeredConstraintLayout$LayoutParams75;
            case 152:
                return new LayeredConstraintLayout$LayoutParams(-1, 0);
            case 153:
                return new LayeredConstraintLayout$LayoutParams(-1, 0);
            case 154:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 155:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams76 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams76.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asf));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams76).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asa);
                return layeredConstraintLayout$LayoutParams76;
            case 156:
                return new LayeredConstraintLayout$LayoutParams(-1, 0);
            case 157:
                return new LayeredConstraintLayout$LayoutParams(-2, -1);
            case 158:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams77 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams77.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asf));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams77).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asf);
                return layeredConstraintLayout$LayoutParams77;
            case 159:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams78 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams78.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asf));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams78).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asf);
                return layeredConstraintLayout$LayoutParams78;
            case 160:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams79 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams79.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asf));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams79).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asf);
                return layeredConstraintLayout$LayoutParams79;
            case 161:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams80 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams80.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asf));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams80).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asf);
                return layeredConstraintLayout$LayoutParams80;
            case 162:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 163:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams81 = new LayeredConstraintLayout$LayoutParams(-2, -2);
                layeredConstraintLayout$LayoutParams81.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.asf));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams81).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asf);
                return layeredConstraintLayout$LayoutParams81;
            case 164:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams82 = new LayeredConstraintLayout$LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams82).leftMargin = C1083360eIY.LIZ(12, context);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams82).rightMargin = C1083360eIY.LIZ(12, context);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams82).bottomMargin = C1083360eIY.LIZ(10, context);
                layeredConstraintLayout$LayoutParams82.goneBottomMargin = 0;
                return layeredConstraintLayout$LayoutParams82;
            case 165:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 166:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 167:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 168:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 169:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 170:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 171:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams83 = new LayeredConstraintLayout$LayoutParams(-2, C1083360eIY.LIZ(20, context));
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams83).topMargin = C1083360eIY.LIZ(12, context);
                return layeredConstraintLayout$LayoutParams83;
            case 172:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams84 = new LayeredConstraintLayout$LayoutParams(0, -2);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams84).rightMargin = context.getResources().getDimensionPixelSize(R.dimen.avm);
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams84).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.asg);
                layeredConstraintLayout$LayoutParams84.goneBottomMargin = 0;
                return layeredConstraintLayout$LayoutParams84;
            case 173:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            case 174:
                return new LayeredConstraintLayout$LayoutParams(-1, -1);
            default:
                return null;
        }
    }
}
