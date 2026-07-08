package com.bytedance.android.live.broadcast;

import X.C09CT;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes13.dex */
public class BroadcastSettingResponse {

    @C09CT("shopping_ranking")
    public int ecRankSwitchStatus;

    @C09CT("friend_rank_switch")
    public int friendRankSwitch;

    @C09CT("game_partnership_anchor")
    public boolean gamePartnershipAnchor;

    @C09CT("anchor_game_ranklist_swtich")
    public int gameRankSwitchStatus;

    @C09CT("show_gift_setting_switch")
    public int giftFeature;

    @C09CT("transaction_history")
    public int giftRankSwitchStatus;

    @C09CT("game_partnership_event")
    public boolean isSelectedByEvent;

    @C09CT("live_ba_link")
    public boolean liveBALink;

    @C09CT("live_ba_leads_gen")
    public boolean liveBaLeadsGen;

    @C09CT("live_commercial")
    public boolean liveCommercial;

    @C09CT("live_paid_content")
    public boolean livePaidContent;

    @C09CT("ranking_change_alter_switch")
    public int offlineRankNoticeStatus;

    @C09CT("play_back")
    public int playBack;

    @C09CT("promote_dot_badge")
    public boolean promoteDotBadge;

    @C09CT("promote_dot_badge_version")
    public String promoteDotBadgeVersion;

    @C09CT("custom_error_for_gift_setting")
    public RechargeCustomError rechargeCustomError;

    @C09CT("show_board")
    public boolean showBoard;

    @C09CT("show_fully_customized_board")
    public boolean showFullyCustomizedBoard;

    @C09CT("show_gift_gallery_setting_switch")
    public int showGiftGallerySettingSwitch;

    @C09CT("game_partnership")
    public boolean showPartnership;

    @C09CT("show_promote")
    public boolean showPromote;

    @C09CT("show_stage_reward")
    public boolean showStageReward;

    @C09CT("sub_upsell_permission")
    public boolean subUpsellPermission;

    @C09CT("show_live_goal_switch")
    public int isLiveGoalEnable = 1;

    @C09CT("ai_summary_switch")
    public int aiSummarySwitch = 2;

    @C09CT("ai_comment_reply_switch")
    public int aiCommentReplySwitch = -1;

    public final boolean LIZ() {
        return this.aiSummarySwitch == 1;
    }

    public final boolean LIZIZ() {
        return this.aiCommentReplySwitch == 1;
    }

    public final boolean LIZJ() {
        int i = this.giftFeature;
        return i == 1 || i == 5 || i == 6 || i == 8 || i == 9 || i == 10;
    }

    public final boolean LIZLLL() {
        int i = this.giftFeature;
        if (i == 3) {
            return true;
        }
        return (i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 10 || i != 1) ? false : true;
    }

    public final boolean LJ() {
        return this.isLiveGoalEnable == 1;
    }
}
