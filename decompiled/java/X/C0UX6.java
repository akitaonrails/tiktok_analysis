package X;

import android.os.SystemClock;
import com.bytedance.android.live.uikit.setting.LiveRedDotValidDefaultValueSetting;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestReplayToGuestSetting;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveMarkViewerOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMuteGroupSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveMoyEffectRedDotSetting;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UX6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UX6 {
    public static final C0UX6 AIGC_WALLPAPER_REDDOT;
    public static final C0UX6 COHOST_INVITATION_DURING_MULTI_GUEST_INTERACT_REDDOT;
    public static final C0UX6 COHOST_INVITATION_DURING_MULTI_GUEST_SETTING;
    public static final C0UX6 COHOST_SETTING_REDDOT;
    public static final C0UX6 COHOST_WITH_MULTI_GUEST_GUIDE_REDDOT;
    public static final C0UX6 COMMUNITY_FLAG_COMMENT_ADMIN_FILTER;
    public static final C0UX6 COMMUNITY_FLAG_COMMENT_ADMIN_SETTING;
    public static final C0UX6 COMMUNITY_FLAG_COMMENT_FILTER;
    public static final C0UX6 COMMUNITY_FLAG_COMMENT_SETTING;
    public static final C0UX6 COMMUNITY_FLAG_FILTERED_ADMIN_ENTRANCE;
    public static final C0UX6 COMMUNITY_FLAG_FILTERED_ENTRANCE;
    public static final C0UX6 CREATOR_CLASS_RANKING_REST_CARD_RED_DOT;
    public static final C0UX6 FANS_CLUB_ENTRANCE_DIRECT;
    public static final C0UX6 GUEST_COUNT_DOWN_ENTRANCE;
    public static final C0UX6 GUEST_COUNT_DOWN_ENTRANCE_DIRECT;
    public static final C0UX6 GUEST_SHOWDOWN_ENTRANCE;
    public static final C0UX6 GUEST_SHOWDOWN_ENTRANCE_DIRECT;
    public static final C0UX6 LETS_DANCE_ENTRANCE;
    public static final C0UX6 LIVE_AI_SUMMARY_PREVIEW_SETTING_GUIDE;
    public static final C0UX6 LIVE_AI_SUMMARY_PREVIEW_SETTING_GUIDE_DIRECT;
    public static final C0UX6 LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_DIRECT;
    public static final C0UX6 LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_WITH_POPUP;
    public static final C0UX6 LIVE_BROADCAST_AI_BEAUTY_TAB;
    public static final C0UX6 LIVE_BROADCAST_AI_REPLY_SETTING;
    public static final C0UX6 LIVE_BROADCAST_BEAUTY_ENTRY_BEAUTY_GUIDE;
    public static final C0UX6 LIVE_BROADCAST_BEAUTY_ENTRY_MAKEUP_GUIDE;
    public static final C0UX6 LIVE_BROADCAST_BEAUTY_TAB;
    public static final C0UX6 LIVE_BROADCAST_CAMPAIGN_CENTER;
    public static final C0UX6 LIVE_BROADCAST_DECORATION;
    public static final C0UX6 LIVE_BROADCAST_EFFECT;
    public static final C0UX6 LIVE_BROADCAST_ENHANCE_BACKGROUND;
    public static final C0UX6 LIVE_BROADCAST_ENHANCE_BGM;
    public static final C0UX6 LIVE_BROADCAST_ENHANCE_ENTRY_BEAUTY_GUIDE;
    public static final C0UX6 LIVE_BROADCAST_ENHANCE_ENTRY_GUIDE;
    public static final C0UX6 LIVE_BROADCAST_ENHANCE_ENTRY_MAKEUP_GUIDE;
    public static final C0UX6 LIVE_BROADCAST_GIFT;
    public static final C0UX6 LIVE_BROADCAST_GOODYBAG_MORE;
    public static final C0UX6 LIVE_BROADCAST_INTERACT;
    public static final C0UX6 LIVE_BROADCAST_INTERACT_GOODYBAG;
    public static final C0UX6 LIVE_BROADCAST_KARAOKE_INTERACT;
    public static final C0UX6 LIVE_BROADCAST_KARAOKE_MORE;
    public static final C0UX6 LIVE_BROADCAST_MAKEUP_TAB;
    public static final C0UX6 LIVE_BROADCAST_MARK_VIEWER;
    public static final C0UX6 LIVE_BROADCAST_MORE;
    public static final C0UX6 LIVE_BROADCAST_MORE_GOODYBAG;
    public static final C0UX6 LIVE_BROADCAST_PLAYBOOK_INTERACT;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_COMMENT_SETTING;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_CUSTOM_DISCOUNT;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_DECORATION_ENTRANCE;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_FILTER_COMMENT;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_GUIDE_BOARD_INTELLIGENT_NEW_BATCH;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_MORE;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_MUTE_RULE;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_PROMOTE;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_SERVICE_PLUS_VERIFICATION;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_SETTING;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_SETTING_IN_GAME_RANK;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_SUBSCRIPTION;
    public static final C0UX6 LIVE_BROADCAST_PREVIEW_VOICE_CHAT;
    public static final C0UX6 LIVE_BROADCAST_PROPS;
    public static final C0UX6 LIVE_BROADCAST_RECORD_LIVE;
    public static final C0UX6 LIVE_BROADCAST_SUPER_FAN_TREASURE_BOX;
    public static final C0UX6 LIVE_EFFECT_NEW_TAB;
    public static final C0UX6 LIVE_EFFECT_RECENT_TAB;
    public static final C0UX6 LIVE_GENERAL_SETTINGS_MATURETHEMES;
    public static final C0UX6 LIVE_GENERAL_SETTINGS_ONE_STOP_SHOP;
    public static final C0UX6 LIVE_PLAYBOOK_BROADCAST_GUIDE;
    public static final C0UX6 LIVE_PLAYBOOK_BROADCAST_SMB;
    public static final C0UX6 LIVE_REPLAY_SETTINGS_GUIDE;
    public static final C0UX6 LIVE_SUB_SETTING_PAGE_BADGE_ENTRY;
    public static final C0UX6 LIVE_TITLE;
    public static final C0UX6 LIVE_VIEWER_WISHES_BROADCAST_GUIDE;
    public static final C0UX6 LIVE_VIEWER_WISHES_PREVIEW_GUIDE;
    public static final /* synthetic */ C0UX6[] LLJJIJI;
    public static final /* synthetic */ C2254308sP LLJJIJIIJIL;
    public static final C0UX6 MATCH_INVITE_SETTINGS_ICON;
    public static final C0UX6 MATCH_SETTING_AI_COMMENTARY_REDDOT;
    public static final C0UX6 MATCH_SPECIFIC_COMMUNITY_GIFT;
    public static final C0UX6 MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE;
    public static final C0UX6 MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE_DIRECT;
    public static final C0UX6 MG_NOTICEBOARD_PREVIEW_SETTING_GUIDE;
    public static final C0UX6 MG_NOTICEBOARD_PREVIEW_SETTING_GUIDE_DIRECT;
    public static final C0UX6 MG_PLAYBOOK_PREVIEW_SETTING_GUIDE;
    public static final C0UX6 MG_PLAYBOOK_PREVIEW_SETTING_GUIDE_DIRECT;
    public static final C0UX6 MG_PREVIEW_LIVE_LAYOUT_SETTING_GUIDE;
    public static final C0UX6 MULTI_GUEST_AVATAR;
    public static final C0UX6 MULTI_GUEST_GIFT_PRIORITY_DIRECT;
    public static final C0UX6 MULTI_GUEST_GIFT_PRIORITY_RED_DOT;
    public static final C0UX6 MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_DIRECT;
    public static final C0UX6 MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_RED_DOT;
    public static final C0UX6 MULTI_GUEST_MODERATOR_AUTHORIZATION_OPT_RED_DOT;
    public static final C0UX6 MULTI_GUEST_MODERATOR_DIRECT;
    public static final C0UX6 MULTI_GUEST_MODERATOR_RED_DOT;
    public static final C0UX6 MULTI_GUEST_QUICK_START_LAYOUT_RED_DOT;
    public static final C0UX6 MULTI_GUEST_REVENUE_SHARE_RED_DOT;
    public static final C0UX6 MULTI_GUEST_REVENUE_SHARE_RED_DOT_V2;
    public static final C0UX6 MULTI_GUEST_SHARE_LIVE_REPLAY;
    public static final C0UX6 MULTI_GUEST_SHARE_LIVE_REPLAY_DIRECT;
    public static final C0UX6 MULTI_GUEST_SWITCH_SPOT_RED_DOT;
    public static final C0UX6 MULTI_GUEST_TEXT_BANNER_RED_DOT;
    public static final C0UX6 MULTI_GUEST_TEXT_BANNER_RED_DOT_DIRECT;
    public static final C0UX6 PLAYBOOK_UGC_ENTRANCE;
    public static final C0UX6 PLAYBOOK_UGC_ENTRANCE_DIRECT;
    public static final C0UX6 PLAYBOOK_UGC_GO_LIVE_ENTRANCE_DIRECT;
    public static final C0UX6 PREVIEW_BEAUTY_ENTRY_AI_GUIDE;
    public static final C0UX6 PREVIEW_BEAUTY_ENTRY_BEAUTY_GUIDE;
    public static final C0UX6 PREVIEW_BEAUTY_ENTRY_MAKEUP_GUIDE;
    public static final C0UX6 PREVIEW_BEAUTY_TAB;
    public static final C0UX6 PREVIEW_MAKEUP_TAB;
    public static final C0UX6 RECORD_COMMENTS_GIFTS_IN_SETTING;
    public static final C0UX6 RED_DOT_ANCHOR_OPEN_DISPLAY_EMPTY_SEAT;
    public static final C0UX6 RED_DOT_ANCHOR_SHARE_BACKGROUND_BUTTON;
    public static final C0UX6 RED_DOT_ANCHOR_SHARE_BACKGROUND_DIRECT;
    public static final C0UX6 RED_DOT_AUDIENCE_MODERATOR_GUESSING_GAME;
    public static final C0UX6 RED_DOT_AUDIENCE_MODERATOR_GUIDE_TIPS;
    public static final C0UX6 RED_DOT_AUDIENCE_SHARE_BUTTON;
    public static final C0UX6 RED_DOT_AUDIENCE_SHARE_BUTTON_GAME_POINTS;
    public static final C0UX6 RED_DOT_AUDIENCE_SHARE_MODERATOR_SETTING;
    public static final C0UX6 RED_DOT_HOST_ACTIVITY_ENTRANCE;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_CUSTOM_GIFT_VOTE;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_CUSTOM_POLL_TEMPLATE_OPTIMIZATION_SELECT;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_EMOTE_POLL;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_EMOTE_POLL_MODERATOR;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_INTERACT_GUESSING;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_INTERACT_PLAY_TOGETHER;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE_DIRECT;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_PREVIEW_GUESSING;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_PREVIEW_LIVE_EVENT_STICKER_SETTING;
    public static final C0UX6 RED_DOT_LIVE_BROADCAST_QUICK_GIFT_VOTE;
    public static final C0UX6 RED_DOT_LIVE_GIFT_GALLERY_CREATOR_LEAGUE_RANKING;
    public static final C0UX6 RED_DOT_LIVE_GIFT_PANEL_BACKPACK_TAB;
    public static final C0UX6 RED_DOT_LIVE_GIFT_PANEL_CAMPAIGN_T25_FEST_VOTE_BACKPACK_TAB;
    public static final C0UX6 RED_DOT_LIVE_GIFT_PANEL_INTERACTIVE_GIFT_TAB;
    public static final C0UX6 RED_DOT_LIVE_PRIVILEGE_CENTER;
    public static final C0UX6 RED_DOT_MODERATOR_REPLAY_SHARE_SETTING;
    public static final C0UX6 RED_DOT_PLAY_AND_TOOL_ENTRANCE;
    public static final C0UX6 RED_DOT_SHARE_PANEL_SUGGEST_CREATOR_ENTRANCE;
    public static final C0UX6 RED_DOT_USE_GAME_POINTS;
    public static final C0UX6 SHARE_TO_BB_SETTING_REDDOT;
    public static final C0UX6 SUBSCRIPTION_INTEGRATE_FANS_CLUB;
    public static final C0UX6 SUBSCRIPTION_INTEGRATE_FANS_CLUB_TRANSITION;
    public String[] LL;
    public C0UX8[] LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final boolean LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public C0N1N LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public LiveMessagePlatformRedDotConfig LLJILLL;
    public final HashSet<C0UX6> LLJJ;
    public final HashSet<C0UX6> LLJJI;
    public C782760UnC LLJJIII;

    public C0UX6() {
        throw null;
    }

    public static final /* synthetic */ C0UX6[] LIZJ() {
        return new C0UX6[]{LIVE_GENERAL_SETTINGS_MATURETHEMES, LIVE_GENERAL_SETTINGS_ONE_STOP_SHOP, LIVE_BROADCAST_PREVIEW_MORE, LIVE_BROADCAST_PREVIEW_SETTING, LIVE_BROADCAST_PREVIEW_SETTING_IN_GAME_RANK, LIVE_BROADCAST_PREVIEW_SERVICE_PLUS_VERIFICATION, LIVE_BROADCAST_PREVIEW_SUBSCRIPTION, LIVE_BROADCAST_PREVIEW_CUSTOM_DISCOUNT, LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE, LIVE_BROADCAST_PREVIEW_PROMOTE, LIVE_BROADCAST_PREVIEW_VOICE_CHAT, LIVE_BROADCAST_PREVIEW_COMMENT_SETTING, LIVE_BROADCAST_PREVIEW_MUTE_RULE, LIVE_BROADCAST_PREVIEW_FILTER_COMMENT, LIVE_BROADCAST_PREVIEW_GUIDE_BOARD_INTELLIGENT_NEW_BATCH, LIVE_BROADCAST_DECORATION, LIVE_BROADCAST_ENHANCE_ENTRY_GUIDE, LIVE_BROADCAST_PREVIEW_DECORATION_ENTRANCE, LIVE_BROADCAST_PROPS, LIVE_BROADCAST_EFFECT, LIVE_EFFECT_NEW_TAB, LIVE_EFFECT_RECENT_TAB, LIVE_BROADCAST_ENHANCE_BGM, LIVE_BROADCAST_ENHANCE_BACKGROUND, LIVE_BROADCAST_GOODYBAG_MORE, LIVE_BROADCAST_MORE, LIVE_BROADCAST_MORE_GOODYBAG, LIVE_BROADCAST_GIFT, LIVE_BROADCAST_CAMPAIGN_CENTER, LIVE_BROADCAST_KARAOKE_MORE, LIVE_BROADCAST_RECORD_LIVE, LIVE_BROADCAST_KARAOKE_INTERACT, LIVE_BROADCAST_INTERACT, LIVE_BROADCAST_PLAYBOOK_INTERACT, LIVE_PLAYBOOK_BROADCAST_SMB, LIVE_PLAYBOOK_BROADCAST_GUIDE, LIVE_VIEWER_WISHES_BROADCAST_GUIDE, LIVE_BROADCAST_INTERACT_GOODYBAG, LIVE_SUB_SETTING_PAGE_BADGE_ENTRY, MG_NOTICEBOARD_PREVIEW_SETTING_GUIDE, MG_PLAYBOOK_PREVIEW_SETTING_GUIDE, MG_PREVIEW_LIVE_LAYOUT_SETTING_GUIDE, MG_NOTICEBOARD_PREVIEW_SETTING_GUIDE_DIRECT, MG_PLAYBOOK_PREVIEW_SETTING_GUIDE_DIRECT, LIVE_AI_SUMMARY_PREVIEW_SETTING_GUIDE_DIRECT, LIVE_AI_SUMMARY_PREVIEW_SETTING_GUIDE, LIVE_VIEWER_WISHES_PREVIEW_GUIDE, LIVE_BROADCAST_MARK_VIEWER, MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE, MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE_DIRECT, MULTI_GUEST_MODERATOR_RED_DOT, MULTI_GUEST_MODERATOR_AUTHORIZATION_OPT_RED_DOT, MULTI_GUEST_GIFT_PRIORITY_RED_DOT, MULTI_GUEST_SWITCH_SPOT_RED_DOT, RED_DOT_ANCHOR_SHARE_BACKGROUND_BUTTON, MULTI_GUEST_MODERATOR_DIRECT, MULTI_GUEST_GIFT_PRIORITY_DIRECT, RED_DOT_ANCHOR_SHARE_BACKGROUND_DIRECT, RED_DOT_LIVE_BROADCAST_INTERACT_GUESSING, RED_DOT_LIVE_BROADCAST_PREVIEW_GUESSING, AIGC_WALLPAPER_REDDOT, MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_RED_DOT, MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_DIRECT, MULTI_GUEST_REVENUE_SHARE_RED_DOT, MULTI_GUEST_REVENUE_SHARE_RED_DOT_V2, MULTI_GUEST_QUICK_START_LAYOUT_RED_DOT, MULTI_GUEST_AVATAR, RED_DOT_LIVE_BROADCAST_CUSTOM_POLL_TEMPLATE_OPTIMIZATION_SELECT, RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE_DIRECT, RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE, RED_DOT_LIVE_BROADCAST_CUSTOM_GIFT_VOTE, RED_DOT_LIVE_BROADCAST_QUICK_GIFT_VOTE, RED_DOT_LIVE_BROADCAST_EMOTE_POLL, RED_DOT_LIVE_BROADCAST_EMOTE_POLL_MODERATOR, CREATOR_CLASS_RANKING_REST_CARD_RED_DOT, RED_DOT_LIVE_GIFT_PANEL_BACKPACK_TAB, RED_DOT_LIVE_GIFT_PANEL_INTERACTIVE_GIFT_TAB, RED_DOT_LIVE_GIFT_PANEL_CAMPAIGN_T25_FEST_VOTE_BACKPACK_TAB, RED_DOT_LIVE_PRIVILEGE_CENTER, RED_DOT_HOST_ACTIVITY_ENTRANCE, RED_DOT_LIVE_BROADCAST_INTERACT_PLAY_TOGETHER, RED_DOT_AUDIENCE_SHARE_BUTTON, RED_DOT_AUDIENCE_SHARE_BUTTON_GAME_POINTS, RED_DOT_AUDIENCE_SHARE_MODERATOR_SETTING, RED_DOT_AUDIENCE_MODERATOR_GUESSING_GAME, RED_DOT_AUDIENCE_MODERATOR_GUIDE_TIPS, RED_DOT_USE_GAME_POINTS, RECORD_COMMENTS_GIFTS_IN_SETTING, LIVE_REPLAY_SETTINGS_GUIDE, LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_DIRECT, LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_WITH_POPUP, RED_DOT_ANCHOR_OPEN_DISPLAY_EMPTY_SEAT, RED_DOT_PLAY_AND_TOOL_ENTRANCE, RED_DOT_LIVE_BROADCAST_PREVIEW_LIVE_EVENT_STICKER_SETTING, RED_DOT_LIVE_GIFT_GALLERY_CREATOR_LEAGUE_RANKING, RED_DOT_SHARE_PANEL_SUGGEST_CREATOR_ENTRANCE, GUEST_SHOWDOWN_ENTRANCE, GUEST_COUNT_DOWN_ENTRANCE, LETS_DANCE_ENTRANCE, PLAYBOOK_UGC_ENTRANCE, RED_DOT_MODERATOR_REPLAY_SHARE_SETTING, MULTI_GUEST_SHARE_LIVE_REPLAY, MULTI_GUEST_SHARE_LIVE_REPLAY_DIRECT, COHOST_INVITATION_DURING_MULTI_GUEST_SETTING, GUEST_SHOWDOWN_ENTRANCE_DIRECT, MULTI_GUEST_TEXT_BANNER_RED_DOT_DIRECT, MULTI_GUEST_TEXT_BANNER_RED_DOT, GUEST_COUNT_DOWN_ENTRANCE_DIRECT, PLAYBOOK_UGC_ENTRANCE_DIRECT, PLAYBOOK_UGC_GO_LIVE_ENTRANCE_DIRECT, COMMUNITY_FLAG_COMMENT_SETTING, COMMUNITY_FLAG_COMMENT_ADMIN_SETTING, COMMUNITY_FLAG_COMMENT_FILTER, COMMUNITY_FLAG_COMMENT_ADMIN_FILTER, COMMUNITY_FLAG_FILTERED_ENTRANCE, COMMUNITY_FLAG_FILTERED_ADMIN_ENTRANCE, SHARE_TO_BB_SETTING_REDDOT, SUBSCRIPTION_INTEGRATE_FANS_CLUB, FANS_CLUB_ENTRANCE_DIRECT, SUBSCRIPTION_INTEGRATE_FANS_CLUB_TRANSITION, PREVIEW_BEAUTY_TAB, LIVE_BROADCAST_BEAUTY_TAB, PREVIEW_MAKEUP_TAB, LIVE_BROADCAST_MAKEUP_TAB, PREVIEW_BEAUTY_ENTRY_BEAUTY_GUIDE, PREVIEW_BEAUTY_ENTRY_MAKEUP_GUIDE, PREVIEW_BEAUTY_ENTRY_AI_GUIDE, LIVE_BROADCAST_BEAUTY_ENTRY_BEAUTY_GUIDE, LIVE_BROADCAST_BEAUTY_ENTRY_MAKEUP_GUIDE, LIVE_BROADCAST_ENHANCE_ENTRY_BEAUTY_GUIDE, LIVE_BROADCAST_ENHANCE_ENTRY_MAKEUP_GUIDE, COHOST_WITH_MULTI_GUEST_GUIDE_REDDOT, COHOST_INVITATION_DURING_MULTI_GUEST_INTERACT_REDDOT, MATCH_SETTING_AI_COMMENTARY_REDDOT, LIVE_BROADCAST_AI_REPLY_SETTING, LIVE_BROADCAST_AI_BEAUTY_TAB, LIVE_BROADCAST_SUPER_FAN_TREASURE_BOX, COHOST_SETTING_REDDOT, MATCH_INVITE_SETTINGS_ICON, MATCH_SPECIFIC_COMMUNITY_GIFT, LIVE_TITLE};
    }

    public static InterfaceC2044707zh<C0UX6> getEntries() {
        return LLJJIJIIJIL;
    }

    public static C0UX6[] values() {
        return (C0UX6[]) LLJJIJI.clone();
    }

    public final void clearGuideShowStartTimestamp() {
        this.LLIZ = 0L;
    }

    public final void clearShowStartTimestamp() {
        this.LLILZLL = 0L;
    }

    public final InterfaceC1102120emo createComponentInstance() {
        C782760UnC c782760UnC = new C782760UnC(this, C963140bAe.LIZIZ());
        this.LLJJIII = c782760UnC;
        return c782760UnC;
    }

    public final int getCurrentRedDotCount$liveui_release() {
        C782710Un7.LIZ.getClass();
        HashMap<String, Set<String>> map = C782710Un7.LJIJ;
        String str = this.LLJILLL.roomLocation;
        if (str == null) {
            str = this.LLJILJIL;
        }
        Set<String> set = map.get(str);
        return set != null ? set.size() : this.LLJILJILJ ? 1 : 0;
    }

    public final String getEventPosition$liveui_release() {
        String str = this.LLJILJIL;
        return str == null ? this.LLJILLL.roomLocation : str;
    }

    public final long getGuideToClickTotalDuration() {
        if (this.LLILZLL > 0) {
            return (this.LLIZLLLIL + SystemClock.uptimeMillis()) - this.LLILZLL;
        }
        return 0L;
    }

    public final int getPriority$liveui_release() {
        return this.LLJILLL.priority;
    }

    public final long getShowTotalDuration() {
        if (this.LLILZLL > 0) {
            return SystemClock.uptimeMillis() - this.LLILZLL;
        }
        return 0L;
    }

    public final void reset() {
        this.LLJI = "";
        this.LLJILJILJ = false;
        this.LLJJIII = null;
        this.LLJJ.clear();
        clearShowStartTimestamp();
    }

    static {
        C0UX8 c0ux8 = C0UX8.EVENT_PAGE_BROADCAST_PREVIEW;
        C0N1N c0n1n = C0N1N.LEVEL2;
        LIVE_GENERAL_SETTINGS_MATURETHEMES = new C0UX6("LIVE_GENERAL_SETTINGS_MATURETHEMES", 0, new String[]{"RedDotMatureThemes"}, new C0UX8[]{c0ux8}, C0UKZ.LLJILLL.LIZIZ().booleanValue(), false, false, c0n1n, false, null, 65256);
        LIVE_GENERAL_SETTINGS_ONE_STOP_SHOP = new C0UX6("LIVE_GENERAL_SETTINGS_ONE_STOP_SHOP", 1, new String[]{"RedDotOneStopShopGuidePanel"}, new C0UX8[]{c0ux8}, false, false, true, c0n1n, false, null, 65260);
        C0N1N c0n1n2 = C0N1N.LEVEL1;
        LIVE_BROADCAST_PREVIEW_MORE = new C0UX6("LIVE_BROADCAST_PREVIEW_MORE", 2, new String[]{"SubscriptionIntegrateFansClubMoreGuide", "FansClubEntranceDirectMoreGuide", "SubscriptionIntegrateFansClubTransitionMoreGuide", "RedDotFansClubPromoteDirect", "RedDotPromoteDirect", "RedDotPreviewSubscirptionDirect", "GuideLiveEventStickerEntranceSettingsDirect", "RedDotGoLiveCustomDiscountMore"}, new C0UX8[]{c0ux8}, false, false, true, c0n1n2, false, "preview_first_screen", 63212);
        LIVE_BROADCAST_PREVIEW_SETTING = new C0UX6("LIVE_BROADCAST_PREVIEW_SETTING", 3, new String[]{"LivePreviewSetting", "RedDotModeratorReplayShareDirect", "RedDotRecordingsSettingsEntranceInSetting"}, new C0UX8[]{c0ux8}, false, false, true, c0n1n2, false, "preview_first_screen", 63212);
        LIVE_BROADCAST_PREVIEW_SETTING_IN_GAME_RANK = new C0UX6("LIVE_BROADCAST_PREVIEW_SETTING_IN_GAME_RANK", 4, new String[]{"LivePreviewSettingInGameRank"}, new C0UX8[]{c0ux8}, false, false, false, c0n1n2, false, "preview_setting", 63212);
        LIVE_BROADCAST_PREVIEW_SERVICE_PLUS_VERIFICATION = new C0UX6("LIVE_BROADCAST_PREVIEW_SERVICE_PLUS_VERIFICATION", 5, new String[]{"RedDotGoLiveServicePlusVerification"}, new C0UX8[]{c0ux8}, false, false, false, c0n1n2, false, "preview_first_screen", 63212);
        LIVE_BROADCAST_PREVIEW_SUBSCRIPTION = new C0UX6("LIVE_BROADCAST_PREVIEW_SUBSCRIPTION", 6, new String[]{"RedDotPreviewSubscirption"}, new C0UX8[]{c0ux8}, false, false, false, c0n1n2, false, "preview_first_screen", 63212);
        LIVE_BROADCAST_PREVIEW_CUSTOM_DISCOUNT = new C0UX6("LIVE_BROADCAST_PREVIEW_CUSTOM_DISCOUNT", 7, new String[]{"RedDotGoLiveCustomDiscount"}, new C0UX8[]{c0ux8}, false, false, false, c0n1n2, false, "preview_first_screen", 63212);
        LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE = new C0UX6("LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE", 8, new String[]{"RedDotFansClubPromote"}, new C0UX8[]{c0ux8}, false, true, false, c0n1n2, false, null, 65252);
        LIVE_BROADCAST_PREVIEW_PROMOTE = new C0UX6("LIVE_BROADCAST_PREVIEW_PROMOTE", 9, new String[]{"RedDotPromote"}, new C0UX8[]{c0ux8}, false, true, false, c0n1n2, false, "preview_first_screen", 63204);
        LIVE_BROADCAST_PREVIEW_VOICE_CHAT = new C0UX6("LIVE_BROADCAST_PREVIEW_VOICE_CHAT", 10, new String[]{"RedDotPreviewVoiceChat"}, new C0UX8[]{c0ux8}, false, true, false, null, false, "preview_first_screen", 63460);
        C0UX8 c0ux82 = C0UX8.EVENT_PAGE_BROADCAST;
        LiveMuteGroupSetting liveMuteGroupSetting = LiveMuteGroupSetting.INSTANCE;
        LIVE_BROADCAST_PREVIEW_COMMENT_SETTING = new C0UX6("LIVE_BROADCAST_PREVIEW_COMMENT_SETTING", 11, new String[]{"LiveBroadcastCommentSetting", "LiveBroadcastMuteGuideCommentSetting"}, new C0UX8[]{c0ux8, c0ux82}, liveMuteGroupSetting.value(), false, true, c0n1n, false, null, 65256);
        LIVE_BROADCAST_PREVIEW_MUTE_RULE = new C0UX6("LIVE_BROADCAST_PREVIEW_MUTE_RULE", 12, new String[]{"LiveBroadcastMuteRules"}, new C0UX8[]{c0ux8, c0ux82}, liveMuteGroupSetting.value(), false, false, c0n1n, false, null, 65256);
        C0N1N c0n1n3 = C0N1N.LEVEL3;
        LIVE_BROADCAST_PREVIEW_FILTER_COMMENT = new C0UX6("LIVE_BROADCAST_PREVIEW_FILTER_COMMENT", 13, new String[]{"LiveBroadcastFilterComment"}, new C0UX8[]{c0ux8, c0ux82}, true, false, false, c0n1n3, false, null, 65256);
        LIVE_BROADCAST_PREVIEW_GUIDE_BOARD_INTELLIGENT_NEW_BATCH = new C0UX6("LIVE_BROADCAST_PREVIEW_GUIDE_BOARD_INTELLIGENT_NEW_BATCH", 14, new String[]{"DecorationPreviewEntrance"}, new C0UX8[]{c0ux8}, false, true, false, null, false, "preview_first_screen", 63460);
        LIVE_BROADCAST_DECORATION = new C0UX6("LIVE_BROADCAST_DECORATION", 15, new String[]{"DecorationEnhanceEntrance"}, new C0UX8[]{c0ux82}, false, true, false, null, false, "anchor_enhance", 63460);
        LIVE_BROADCAST_ENHANCE_ENTRY_GUIDE = new C0UX6("LIVE_BROADCAST_ENHANCE_ENTRY_GUIDE", 16, new String[]{"DecorationEnhanceEntranceDirect"}, new C0UX8[]{c0ux82}, false, false, true, c0n1n2, false, "anchor_first_screen", 63212);
        LIVE_BROADCAST_PREVIEW_DECORATION_ENTRANCE = new C0UX6("LIVE_BROADCAST_PREVIEW_DECORATION_ENTRANCE", 17, new String[]{"RedDotDecorationPreviewEntranceDirect"}, new C0UX8[]{c0ux8}, true, false, false, null, false, "preview_first_screen", 63464);
        LiveMoyEffectRedDotSetting liveMoyEffectRedDotSetting = LiveMoyEffectRedDotSetting.INSTANCE;
        LIVE_BROADCAST_PROPS = new C0UX6("LIVE_BROADCAST_PROPS", 18, new String[]{"LiveBroadcastProps"}, new C0UX8[]{c0ux82}, liveMoyEffectRedDotSetting.getValue(), false, false, null, false, "anchor_enhance", 63464);
        LIVE_BROADCAST_EFFECT = new C0UX6("LIVE_BROADCAST_EFFECT", 19, new String[]{"LiveBroadcastEffectNewTab"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_first_screen", 63468);
        LIVE_EFFECT_NEW_TAB = new C0UX6("LIVE_EFFECT_NEW_TAB", 20, new String[]{"LiveEffectNewTab"}, new C0UX8[]{c0ux82}, liveMoyEffectRedDotSetting.getValue(), false, false, null, false, "preview_effects", 63464);
        LIVE_EFFECT_RECENT_TAB = new C0UX6("LIVE_EFFECT_RECENT_TAB", 21, new String[]{"LiveEffectRecentTab"}, new C0UX8[]{c0ux8, c0ux82}, false, false, false, null, false, null, 65516);
        String[] strArr = {"RedDotAnchorBGMusic"};
        C0UX8[] c0ux8Arr = {c0ux82};
        LiveBGMSetting liveBGMSetting = LiveBGMSetting.INSTANCE;
        LIVE_BROADCAST_ENHANCE_BGM = new C0UX6("LIVE_BROADCAST_ENHANCE_BGM", 22, strArr, c0ux8Arr, liveBGMSetting.inLiveBGMUpgradeV1() || liveBGMSetting.inLiveBGMUpgradeV3(), false, false, null, false, null, 65512);
        LIVE_BROADCAST_ENHANCE_BACKGROUND = new C0UX6("LIVE_BROADCAST_ENHANCE_BACKGROUND", 23, new String[]{"RedDotAnchorBackgroundButton"}, new C0UX8[]{c0ux82}, true, false, false, null, false, "anchor_enhance", 63464);
        LIVE_BROADCAST_GOODYBAG_MORE = new C0UX6("LIVE_BROADCAST_GOODYBAG_MORE", 24, new String[]{"GoodyBagInteractiveButtonRedDot"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_first_screen", 63468);
        LIVE_BROADCAST_MORE = new C0UX6("LIVE_BROADCAST_MORE", 25, new String[]{"live_broadcast_more", "RedDotLiveKaraokMoreDirect", "RedDotActivitiesCenterMorePanelDirect", "RedDotAnchorGiftIcon", "RedDotRecordMoreEntranceDirect"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_first_screen", 63468);
        LIVE_BROADCAST_MORE_GOODYBAG = new C0UX6("LIVE_BROADCAST_MORE_GOODYBAG", 26, new String[]{"GoodyBagInteractivePanelRedDot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, null, 65516);
        LIVE_BROADCAST_GIFT = new C0UX6("LIVE_BROADCAST_GIFT", 27, new String[]{"RedDotCreatorGiftPanel"}, new C0UX8[]{c0ux82}, true, false, false, null, false, "anchor_more", 63464);
        LIVE_BROADCAST_CAMPAIGN_CENTER = new C0UX6("LIVE_BROADCAST_CAMPAIGN_CENTER", 28, new String[]{"RedDotActivitiesCenterMorePanelFunction"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_more", 63464);
        String[] strArr2 = {"RedDotLiveKaraokMenu"};
        C0UX8[] c0ux8Arr2 = {c0ux82};
        LiveKaraokeSetting liveKaraokeSetting = LiveKaraokeSetting.INSTANCE;
        LIVE_BROADCAST_KARAOKE_MORE = new C0UX6("LIVE_BROADCAST_KARAOKE_MORE", 29, strArr2, c0ux8Arr2, liveKaraokeSetting.enable() && !InterfaceC766480U4w.LJJZ.LIZIZ().booleanValue(), false, false, null, false, "anchor_more", 63464);
        LIVE_BROADCAST_RECORD_LIVE = new C0UX6("LIVE_BROADCAST_RECORD_LIVE", 30, new String[]{"RedDotRecordMorePanelDirect"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_first_screen", 63464);
        LIVE_BROADCAST_KARAOKE_INTERACT = new C0UX6("LIVE_BROADCAST_KARAOKE_INTERACT", 31, new String[]{"RedDotLiveKaraokInteract"}, new C0UX8[]{c0ux82}, liveKaraokeSetting.enable() && !InterfaceC766480U4w.LJJZ.LIZIZ().booleanValue(), false, false, null, false, "anchor_interaction", 63464);
        LIVE_BROADCAST_INTERACT = new C0UX6("LIVE_BROADCAST_INTERACT", 32, new String[]{"LiveBroadcastInteract_1", "LiveBroadcastInteract_2", "InteractionGuessDirect", "RedDotAnchorAigcWallpaperInteract", "RedDotLiveKaraokInteractDirect", "InteractionPlayTogetherDirect", "RedDotCustomVoteToolbarDirect", "RedDotPlaybookBroadcastDirect", "GBLRedDotTypeInteractPanelViewerWishesDirect"}, new C0UX8[]{c0ux82}, false, false, true, c0n1n2, false, "anchor_first_screen", 63212);
        LIVE_BROADCAST_PLAYBOOK_INTERACT = new C0UX6("LIVE_BROADCAST_PLAYBOOK_INTERACT", 33, new String[]{"RedDotPlaybookInteractiveItem"}, new C0UX8[]{c0ux82}, false, false, true, c0n1n2, false, "anchor_first_screen", 63212);
        LIVE_PLAYBOOK_BROADCAST_SMB = new C0UX6("LIVE_PLAYBOOK_BROADCAST_SMB", 34, new String[]{"RedDotAnchorPlaybook"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_interaction", 63468);
        LIVE_PLAYBOOK_BROADCAST_GUIDE = new C0UX6("LIVE_PLAYBOOK_BROADCAST_GUIDE", 35, new String[]{"RedDotPlaybookBroadcast"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_interaction", 63468);
        LIVE_VIEWER_WISHES_BROADCAST_GUIDE = new C0UX6("LIVE_VIEWER_WISHES_BROADCAST_GUIDE", 36, new String[]{"GBLRedDotTypeInteractPanelViewerWishes"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_interaction", 63468);
        LIVE_BROADCAST_INTERACT_GOODYBAG = new C0UX6("LIVE_BROADCAST_INTERACT_GOODYBAG", 37, new String[]{"GoodyBagInteractivePanelRedDot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_interaction", 63468);
        LIVE_SUB_SETTING_PAGE_BADGE_ENTRY = new C0UX6("LIVE_SUB_SETTING_PAGE_BADGE_ENTRY", 38, new String[]{"HostSubSettingPageBadgeEntryRedDot"}, new C0UX8[]{C0UX8.EVENT_PAGE_SUBSCRIBE_SETTING_PAGE}, false, false, false, null, false, null, 65516);
        MG_NOTICEBOARD_PREVIEW_SETTING_GUIDE = new C0UX6("MG_NOTICEBOARD_PREVIEW_SETTING_GUIDE", 39, new String[]{"NoticeboardLiveSettingGuidePanel"}, new C0UX8[]{c0ux8}, false, false, false, null, false, "preview_setting", 63468);
        MG_PLAYBOOK_PREVIEW_SETTING_GUIDE = new C0UX6("MG_PLAYBOOK_PREVIEW_SETTING_GUIDE", 40, new String[]{"PlaybookLiveSettingGuidePanel"}, new C0UX8[]{c0ux8}, false, false, false, null, false, "preview_setting", 63468);
        MG_PREVIEW_LIVE_LAYOUT_SETTING_GUIDE = new C0UX6("MG_PREVIEW_LIVE_LAYOUT_SETTING_GUIDE", 41, new String[]{"MultiGuestLayoutGuideSettingsRedDot"}, new C0UX8[]{c0ux8}, true, false, false, null, false, "preview_setting", 63464);
        MG_NOTICEBOARD_PREVIEW_SETTING_GUIDE_DIRECT = new C0UX6("MG_NOTICEBOARD_PREVIEW_SETTING_GUIDE_DIRECT", 42, new String[]{"NoticeboardLiveSettingGuidePanelDirect"}, new C0UX8[]{c0ux8}, false, false, true, null, false, "preview_first_screen", 63468);
        MG_PLAYBOOK_PREVIEW_SETTING_GUIDE_DIRECT = new C0UX6("MG_PLAYBOOK_PREVIEW_SETTING_GUIDE_DIRECT", 43, new String[]{"PlaybookLiveSettingGuidePanelDirect"}, new C0UX8[]{c0ux8}, false, false, true, null, false, "preview_first_screen", 63468);
        LIVE_AI_SUMMARY_PREVIEW_SETTING_GUIDE_DIRECT = new C0UX6("LIVE_AI_SUMMARY_PREVIEW_SETTING_GUIDE_DIRECT", 44, new String[]{"RedDotAISummaryPreviewDirect"}, new C0UX8[]{c0ux8}, false, false, true, null, false, "preview_first_screen", 63468);
        LIVE_AI_SUMMARY_PREVIEW_SETTING_GUIDE = new C0UX6("LIVE_AI_SUMMARY_PREVIEW_SETTING_GUIDE", 45, new String[]{"RedDotAISummaryPreview"}, new C0UX8[]{c0ux8}, false, false, true, null, false, "preview_setting", 63468);
        LIVE_VIEWER_WISHES_PREVIEW_GUIDE = new C0UX6("LIVE_VIEWER_WISHES_PREVIEW_GUIDE", 46, new String[]{"GBLRedDotTypeLiveBroadcastPreviewViewerWishes"}, new C0UX8[]{c0ux8}, false, false, true, null, false, "preview_viewer_wishes", 63468);
        LIVE_BROADCAST_MARK_VIEWER = new C0UX6("LIVE_BROADCAST_MARK_VIEWER", 47, new String[]{"MarkViewerProfileManageRedDot"}, new C0UX8[]{c0ux82}, LiveMarkViewerOptimizationSetting.INSTANCE.getValue(), false, false, null, false, "user_preview", 63464);
        MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE = new C0UX6("MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE", 48, new String[]{"NoticeboardMultiGuestSettingPanel"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_multi_setting", 63468);
        MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE_DIRECT = new C0UX6("MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE_DIRECT", 49, new String[]{"NoticeboardMultiGuestSettingPanelDirect"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_multi", 63468);
        MULTI_GUEST_MODERATOR_RED_DOT = new C0UX6("MULTI_GUEST_MODERATOR_RED_DOT", 50, new String[]{"MultiGuestModeratorRedDot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, null, 65516);
        MULTI_GUEST_MODERATOR_AUTHORIZATION_OPT_RED_DOT = new C0UX6("MULTI_GUEST_MODERATOR_AUTHORIZATION_OPT_RED_DOT", 51, new String[]{"MultiGuestAnchorPanelSettingsModeratorsRedDot"}, new C0UX8[]{c0ux82}, true, false, false, null, false, null, 65512);
        MULTI_GUEST_GIFT_PRIORITY_RED_DOT = new C0UX6("MULTI_GUEST_GIFT_PRIORITY_RED_DOT", 52, new String[]{"MultiGuestGiftPriorityRedDot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, null, 65516);
        C0UX8 c0ux83 = C0UX8.EVENT_PAGE_WATCH_LIVE;
        MULTI_GUEST_SWITCH_SPOT_RED_DOT = new C0UX6("MULTI_GUEST_SWITCH_SPOT_RED_DOT", 53, new String[]{"MultiGuestSwitchSpotRedDot"}, new C0UX8[]{c0ux82, c0ux83}, true, false, false, null, false, null, 65512);
        RED_DOT_ANCHOR_SHARE_BACKGROUND_BUTTON = new C0UX6("RED_DOT_ANCHOR_SHARE_BACKGROUND_BUTTON", 54, new String[]{"RedDotAnchorShareBackgroundButton"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_multi_setting", 63468);
        MULTI_GUEST_MODERATOR_DIRECT = new C0UX6("MULTI_GUEST_MODERATOR_DIRECT", 55, new String[]{"MultiGuestModeratorDirect"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_multi", 63468);
        MULTI_GUEST_GIFT_PRIORITY_DIRECT = new C0UX6("MULTI_GUEST_GIFT_PRIORITY_DIRECT", 56, new String[]{"MultiGuestGiftPriorityDirect"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_multi", 63468);
        RED_DOT_ANCHOR_SHARE_BACKGROUND_DIRECT = new C0UX6("RED_DOT_ANCHOR_SHARE_BACKGROUND_DIRECT", 57, new String[]{"RedDotAnchorSettingShareBackgroundDirect"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_multi", 63468);
        RED_DOT_LIVE_BROADCAST_INTERACT_GUESSING = new C0UX6("RED_DOT_LIVE_BROADCAST_INTERACT_GUESSING", 58, new String[]{"InteractionGuess"}, new C0UX8[]{c0ux82}, false, true, false, null, false, "anchor_interaction", 63456);
        RED_DOT_LIVE_BROADCAST_PREVIEW_GUESSING = new C0UX6("RED_DOT_LIVE_BROADCAST_PREVIEW_GUESSING", 59, new String[]{"RedDotGuessPreview"}, new C0UX8[]{c0ux8}, false, false, false, null, false, "preview_first_screen", 63468);
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        AIGC_WALLPAPER_REDDOT = new C0UX6("AIGC_WALLPAPER_REDDOT", 60, new String[]{"RedDotAnchorAigcWallpaper"}, new C0UX8[]{c0ux82}, settingsManager.getBooleanValue("multi_guest_aigc_wallpaper_enable", false), false, false, null, false, null, 65512);
        MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_RED_DOT = new C0UX6("MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_RED_DOT", 61, new String[]{"MultiGuestGiftPriorityTopHostRedDot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, null, 65516);
        MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_DIRECT = new C0UX6("MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_DIRECT", 62, new String[]{"MultiGuestGiftPriorityTopHostDirect"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_multi", 63468);
        MULTI_GUEST_REVENUE_SHARE_RED_DOT = new C0UX6("MULTI_GUEST_REVENUE_SHARE_RED_DOT", 63, new String[]{"MultiGuestRevenueShareRedDot"}, new C0UX8[]{c0ux82}, true, false, true, null, false, "anchor_multi", 63464);
        MULTI_GUEST_REVENUE_SHARE_RED_DOT_V2 = new C0UX6("MULTI_GUEST_REVENUE_SHARE_RED_DOT_V2", 64, new String[]{"MultiGuestRevenueShareRedDotV2"}, new C0UX8[]{c0ux82}, true, false, true, null, false, "anchor_multi", 63464);
        MULTI_GUEST_QUICK_START_LAYOUT_RED_DOT = new C0UX6("MULTI_GUEST_QUICK_START_LAYOUT_RED_DOT", 65, new String[]{"MultiGuestQuickStartLayoutRedDot"}, new C0UX8[]{c0ux82}, true, false, false, null, false, null, 65512);
        MULTI_GUEST_AVATAR = new C0UX6("MULTI_GUEST_AVATAR", 66, new String[]{"MultiGuestAvatar"}, new C0UX8[]{c0ux82}, true, false, false, null, false, null, 65512);
        RED_DOT_LIVE_BROADCAST_CUSTOM_POLL_TEMPLATE_OPTIMIZATION_SELECT = new C0UX6("RED_DOT_LIVE_BROADCAST_CUSTOM_POLL_TEMPLATE_OPTIMIZATION_SELECT", 67, new String[]{"RedDotCustomVote"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "live_custom_vote", 63464);
        RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE_DIRECT = new C0UX6("RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE_DIRECT", 68, new String[]{"RedDotCustomGiftVoteToolbarDirect", "RedDotQuickGiftVoteToolbarDirect"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_first_screen", 63468);
        RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE = new C0UX6("RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE", 69, new String[]{"RedDotCustomGiftVoteInteractionPanelDirect", "RedDotQuickGiftVoteInteractionPanelDirect", "RedDotEmotePollDirect", "RedDotCustomVoteInteractionPanelDirect"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_interaction", 63468);
        RED_DOT_LIVE_BROADCAST_CUSTOM_GIFT_VOTE = new C0UX6("RED_DOT_LIVE_BROADCAST_CUSTOM_GIFT_VOTE", 70, new String[]{"RedDotCustomGiftVote"}, new C0UX8[]{c0ux82}, false, true, false, null, false, "anchor_interaction_vote", 63456);
        RED_DOT_LIVE_BROADCAST_QUICK_GIFT_VOTE = new C0UX6("RED_DOT_LIVE_BROADCAST_QUICK_GIFT_VOTE", 71, new String[]{"RedDotQuickGiftVote"}, new C0UX8[]{c0ux82}, false, true, false, null, false, "anchor_interaction_vote", 63456);
        RED_DOT_LIVE_BROADCAST_EMOTE_POLL = new C0UX6("RED_DOT_LIVE_BROADCAST_EMOTE_POLL", 72, new String[]{"RedDotEmotePoll"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_interaction_vote", 63464);
        RED_DOT_LIVE_BROADCAST_EMOTE_POLL_MODERATOR = new C0UX6("RED_DOT_LIVE_BROADCAST_EMOTE_POLL_MODERATOR", 73, new String[]{"RedDotEmotePollModerator"}, new C0UX8[]{c0ux83}, false, false, false, null, false, "watch_poll", 63464);
        CREATOR_CLASS_RANKING_REST_CARD_RED_DOT = new C0UX6("CREATOR_CLASS_RANKING_REST_CARD_RED_DOT", 74, new String[]{"RedDotAnchorLeagueDetailDirect"}, new C0UX8[]{c0ux82}, true, true, true, c0n1n, false, null, 65248);
        RED_DOT_LIVE_GIFT_PANEL_BACKPACK_TAB = new C0UX6("RED_DOT_LIVE_GIFT_PANEL_BACKPACK_TAB", 75, new String[]{"RedDotGiftPanelBackpackTab"}, new C0UX8[]{c0ux82}, true, false, false, c0n1n2, true, "watch_gift", 62176);
        RED_DOT_LIVE_GIFT_PANEL_INTERACTIVE_GIFT_TAB = new C0UX6("RED_DOT_LIVE_GIFT_PANEL_INTERACTIVE_GIFT_TAB", 76, new String[]{"RedDotGiftPanelInteractiveGiftTab"}, new C0UX8[]{c0ux83}, true, false, true, null, false, "watch_gift", 63464);
        RED_DOT_LIVE_GIFT_PANEL_CAMPAIGN_T25_FEST_VOTE_BACKPACK_TAB = new C0UX6("RED_DOT_LIVE_GIFT_PANEL_CAMPAIGN_T25_FEST_VOTE_BACKPACK_TAB", 77, new String[]{"CampaignT25FestVoteRedDot"}, new C0UX8[]{c0ux83}, true, false, true, null, false, "watch_gift", 63464);
        RED_DOT_LIVE_PRIVILEGE_CENTER = new C0UX6("RED_DOT_LIVE_PRIVILEGE_CENTER", 78, new String[]{"RedDotPrivilegeCenter"}, new C0UX8[]{c0ux82}, true, false, false, c0n1n2, true, "watch_gift", 62176);
        RED_DOT_HOST_ACTIVITY_ENTRANCE = new C0UX6("RED_DOT_HOST_ACTIVITY_ENTRANCE", 79, new String[]{"RedDotHostActivityEntrance"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_multi", 63468);
        RED_DOT_LIVE_BROADCAST_INTERACT_PLAY_TOGETHER = new C0UX6("RED_DOT_LIVE_BROADCAST_INTERACT_PLAY_TOGETHER", 80, new String[]{"InteractionPlayTogether"}, new C0UX8[]{c0ux82}, false, true, false, null, false, "anchor_interaction", 63456);
        RED_DOT_AUDIENCE_SHARE_BUTTON = new C0UX6("RED_DOT_AUDIENCE_SHARE_BUTTON", 81, new String[]{"RedDotGuessAdminShareBtnDirect", "RedDotModeratorShareBtnDirect"}, new C0UX8[]{c0ux83}, false, false, true, null, false, "watch_first_screen", 63468);
        RED_DOT_AUDIENCE_SHARE_BUTTON_GAME_POINTS = new C0UX6("RED_DOT_AUDIENCE_SHARE_BUTTON_GAME_POINTS", 82, new String[]{"RedDotUseGamePointsShareBtnDirect"}, new C0UX8[]{c0ux83}, false, false, true, null, false, "watch_first_screen", 63468);
        RED_DOT_AUDIENCE_SHARE_MODERATOR_SETTING = new C0UX6("RED_DOT_AUDIENCE_SHARE_MODERATOR_SETTING", 83, new String[]{"RedDotGuessAdminModeratorSettingBtnDirect", "RedDotModeratorSettingBtnDirect"}, new C0UX8[]{c0ux83}, false, false, true, null, false, "watch_share", 63468);
        RED_DOT_AUDIENCE_MODERATOR_GUESSING_GAME = new C0UX6("RED_DOT_AUDIENCE_MODERATOR_GUESSING_GAME", 84, new String[]{"RedDotGuessAdmin"}, new C0UX8[]{c0ux83}, false, true, false, null, false, null, 65504);
        RED_DOT_AUDIENCE_MODERATOR_GUIDE_TIPS = new C0UX6("RED_DOT_AUDIENCE_MODERATOR_GUIDE_TIPS", 85, new String[]{"RedDotModeratorGuide"}, new C0UX8[]{c0ux83}, false, true, false, null, false, null, 65504);
        RED_DOT_USE_GAME_POINTS = new C0UX6("RED_DOT_USE_GAME_POINTS", 86, new String[]{"RedDotUseGamePoints"}, new C0UX8[]{c0ux83}, true, false, false, null, false, "watch_share", 63456);
        RECORD_COMMENTS_GIFTS_IN_SETTING = new C0UX6("RECORD_COMMENTS_GIFTS_IN_SETTING", 87, new String[]{"RecordCommentsGiftsInSetting"}, new C0UX8[]{c0ux8}, false, false, false, null, false, "anchor_multi_setting", 63468);
        LIVE_REPLAY_SETTINGS_GUIDE = new C0UX6("LIVE_REPLAY_SETTINGS_GUIDE", 88, new String[]{"RedDotGoLiveRecordingSettingsEntrance"}, new C0UX8[]{c0ux8}, false, false, true, null, false, "preview_setting", 63468);
        LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_DIRECT = new C0UX6("LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_DIRECT", 89, new String[]{"RedDotAutoPostLivingSettingsEntrance"}, new C0UX8[]{c0ux8}, false, false, true, null, false, "preview_setting", 63468);
        LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_WITH_POPUP = new C0UX6("LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_WITH_POPUP", 90, new String[]{"RedDotAutoPostLivingSettingsWithPopup"}, new C0UX8[]{c0ux8}, true, false, true, null, false, "preview_setting", 63464);
        RED_DOT_ANCHOR_OPEN_DISPLAY_EMPTY_SEAT = new C0UX6("RED_DOT_ANCHOR_OPEN_DISPLAY_EMPTY_SEAT", 91, new String[]{"MultiGuestAnchorSettingAvailableSpotRedDot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, null, 65516);
        RED_DOT_PLAY_AND_TOOL_ENTRANCE = new C0UX6("RED_DOT_PLAY_AND_TOOL_ENTRANCE", 92, new String[]{"MultiGuestAnchorPlayAndToolEntranceRedDot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_multi", 63468);
        RED_DOT_LIVE_BROADCAST_PREVIEW_LIVE_EVENT_STICKER_SETTING = new C0UX6("RED_DOT_LIVE_BROADCAST_PREVIEW_LIVE_EVENT_STICKER_SETTING", 93, new String[]{"GuideLiveEventStickerEntrance"}, new C0UX8[]{c0ux8}, false, false, false, null, false, "preview_setting", 63468);
        RED_DOT_LIVE_GIFT_GALLERY_CREATOR_LEAGUE_RANKING = new C0UX6("RED_DOT_LIVE_GIFT_GALLERY_CREATOR_LEAGUE_RANKING", 94, new String[]{"RedDotGiftGalleryCreatorLeagueRanking"}, new C0UX8[]{c0ux82}, true, false, false, c0n1n2, true, null, 64224);
        RED_DOT_SHARE_PANEL_SUGGEST_CREATOR_ENTRANCE = new C0UX6("RED_DOT_SHARE_PANEL_SUGGEST_CREATOR_ENTRANCE", 95, new String[]{"CohostSuggestionShareReddot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "watch_share", 63468);
        GUEST_SHOWDOWN_ENTRANCE = new C0UX6("GUEST_SHOWDOWN_ENTRANCE", 96, new String[]{"GuestShowdownUpgradeEntrance"}, new C0UX8[]{c0ux82}, true, false, false, null, false, "anchor_multi", 63464);
        GUEST_COUNT_DOWN_ENTRANCE = new C0UX6("GUEST_COUNT_DOWN_ENTRANCE", 97, new String[]{"CountDownForAllEntrance"}, new C0UX8[]{c0ux82, c0ux8}, false, false, false, null, false, "anchor_multi", 63468);
        LETS_DANCE_ENTRANCE = new C0UX6("LETS_DANCE_ENTRANCE", 98, new String[]{"LetsDanceEntrance"}, new C0UX8[]{c0ux82, c0ux8}, false, false, false, null, false, "anchor_multi", 63468);
        PLAYBOOK_UGC_ENTRANCE = new C0UX6("PLAYBOOK_UGC_ENTRANCE", 99, new String[]{"PlaybookUgcEntrance"}, new C0UX8[]{c0ux8}, true, false, false, null, false, "anchor_multi", 63464);
        RED_DOT_MODERATOR_REPLAY_SHARE_SETTING = new C0UX6("RED_DOT_MODERATOR_REPLAY_SHARE_SETTING", 100, new String[]{"RedDotModeratorReplayShareSetting"}, new C0UX8[]{c0ux8}, false, false, false, null, false, "preview_setting", 63468);
        MultiGuestReplayToGuestSetting multiGuestReplayToGuestSetting = MultiGuestReplayToGuestSetting.INSTANCE;
        MULTI_GUEST_SHARE_LIVE_REPLAY = new C0UX6("MULTI_GUEST_SHARE_LIVE_REPLAY", 101, new String[]{"MultiGuestShareLiveReplayRedDot"}, new C0UX8[]{c0ux82}, multiGuestReplayToGuestSetting.enable(), false, false, null, false, "anchor_multi", 63464);
        MULTI_GUEST_SHARE_LIVE_REPLAY_DIRECT = new C0UX6("MULTI_GUEST_SHARE_LIVE_REPLAY_DIRECT", 102, new String[]{"MultiGuestShareLiveReplayDirect"}, new C0UX8[]{c0ux82}, multiGuestReplayToGuestSetting.enable(), false, true, null, false, "anchor_multi", 63464);
        COHOST_INVITATION_DURING_MULTI_GUEST_SETTING = new C0UX6("COHOST_INVITATION_DURING_MULTI_GUEST_SETTING", 103, new String[]{"CohostInvitationDuringMultiGuestSetting"}, new C0UX8[]{c0ux82}, !InterfaceC934710aQn.Cc.LIZIZ().booleanValue(), false, false, null, false, null, 65512);
        GUEST_SHOWDOWN_ENTRANCE_DIRECT = new C0UX6("GUEST_SHOWDOWN_ENTRANCE_DIRECT", 104, new String[]{"GuestShowdownUpgradeEntranceDirect"}, new C0UX8[]{c0ux82}, true, false, true, null, false, "anchor_multi", 63464);
        MULTI_GUEST_TEXT_BANNER_RED_DOT_DIRECT = new C0UX6("MULTI_GUEST_TEXT_BANNER_RED_DOT_DIRECT", 105, new String[]{"MultiGuestTextBannerRedDotDirect"}, new C0UX8[]{c0ux82}, true, false, true, null, false, "anchor_multi", 63464);
        MULTI_GUEST_TEXT_BANNER_RED_DOT = new C0UX6("MULTI_GUEST_TEXT_BANNER_RED_DOT", 106, new String[]{"MultiGuestTextBannerRedDot"}, new C0UX8[]{c0ux82}, true, false, false, null, false, "anchor_multi", 63464);
        GUEST_COUNT_DOWN_ENTRANCE_DIRECT = new C0UX6("GUEST_COUNT_DOWN_ENTRANCE_DIRECT", 107, new String[]{"CountDownForAllEntranceDirect"}, new C0UX8[]{c0ux82}, false, false, true, null, false, "anchor_multi", 63468);
        PLAYBOOK_UGC_ENTRANCE_DIRECT = new C0UX6("PLAYBOOK_UGC_ENTRANCE_DIRECT", 108, new String[]{"PlaybookUgcInteractEntranceDirect"}, new C0UX8[]{c0ux8}, false, false, true, null, false, "anchor_multi", 63468);
        PLAYBOOK_UGC_GO_LIVE_ENTRANCE_DIRECT = new C0UX6("PLAYBOOK_UGC_GO_LIVE_ENTRANCE_DIRECT", 109, new String[]{"PlaybookUgcGoLivePageEntranceDirect"}, new C0UX8[]{c0ux8}, false, false, true, null, false, "anchor_multi", 63468);
        COMMUNITY_FLAG_COMMENT_SETTING = new C0UX6("COMMUNITY_FLAG_COMMENT_SETTING", 110, new String[]{"CommunityFlagCommentSetting"}, new C0UX8[]{c0ux82}, false, false, true, null, false, null, 65516);
        COMMUNITY_FLAG_COMMENT_ADMIN_SETTING = new C0UX6("COMMUNITY_FLAG_COMMENT_ADMIN_SETTING", 111, new String[]{"CommunityFlagCommentAdminSetting"}, new C0UX8[]{c0ux83}, false, false, true, null, false, null, 65516);
        COMMUNITY_FLAG_COMMENT_FILTER = new C0UX6("COMMUNITY_FLAG_COMMENT_FILTER", 112, new String[]{"CommunityFlagCommentFilter"}, new C0UX8[]{c0ux82}, false, false, true, null, false, null, 65516);
        COMMUNITY_FLAG_COMMENT_ADMIN_FILTER = new C0UX6("COMMUNITY_FLAG_COMMENT_ADMIN_FILTER", 113, new String[]{"CommunityFlagCommentAdminFilter"}, new C0UX8[]{c0ux83}, false, false, true, null, false, null, 65516);
        COMMUNITY_FLAG_FILTERED_ENTRANCE = new C0UX6("COMMUNITY_FLAG_FILTERED_ENTRANCE", 114, new String[]{"CommunityFlagFilteredEntrance"}, new C0UX8[]{c0ux82}, false, false, true, null, false, null, 65516);
        COMMUNITY_FLAG_FILTERED_ADMIN_ENTRANCE = new C0UX6("COMMUNITY_FLAG_FILTERED_ADMIN_ENTRANCE", 115, new String[]{"CommunityFlagFilteredAdminEntrance"}, new C0UX8[]{c0ux83}, false, false, true, null, false, null, 65516);
        SHARE_TO_BB_SETTING_REDDOT = new C0UX6("SHARE_TO_BB_SETTING_REDDOT", 116, new String[]{"RedDotShareLiveToBB"}, new C0UX8[]{c0ux82}, false, false, false, null, false, null, 65516);
        SUBSCRIPTION_INTEGRATE_FANS_CLUB = new C0UX6("SUBSCRIPTION_INTEGRATE_FANS_CLUB", 117, new String[]{"SubscriptionIntegrateFansClub"}, new C0UX8[]{c0ux8}, false, false, false, null, false, null, 65516);
        FANS_CLUB_ENTRANCE_DIRECT = new C0UX6("FANS_CLUB_ENTRANCE_DIRECT", 118, new String[]{"FansClubEntranceDirect"}, new C0UX8[]{c0ux8}, false, false, false, null, false, null, 65516);
        SUBSCRIPTION_INTEGRATE_FANS_CLUB_TRANSITION = new C0UX6("SUBSCRIPTION_INTEGRATE_FANS_CLUB_TRANSITION", 119, new String[]{"SubscriptionIntegrateFansClubTransition"}, new C0UX8[]{c0ux8}, false, false, false, null, false, null, 65516);
        PREVIEW_BEAUTY_TAB = new C0UX6("PREVIEW_BEAUTY_TAB", 120, new String[]{"PreviewBeautyTab"}, new C0UX8[]{c0ux8}, false, false, false, c0n1n, false, null, 65252);
        LIVE_BROADCAST_BEAUTY_TAB = new C0UX6("LIVE_BROADCAST_BEAUTY_TAB", 121, new String[]{"BroadcastBeautyTab"}, new C0UX8[]{c0ux82}, false, false, false, c0n1n3, false, null, 65252);
        PREVIEW_MAKEUP_TAB = new C0UX6("PREVIEW_MAKEUP_TAB", 122, new String[]{"PreviewMakeupTab"}, new C0UX8[]{c0ux8}, false, false, false, c0n1n, false, null, 65252);
        LIVE_BROADCAST_MAKEUP_TAB = new C0UX6("LIVE_BROADCAST_MAKEUP_TAB", 123, new String[]{"BroadcastMakeupTab"}, new C0UX8[]{c0ux82}, false, false, false, c0n1n3, false, null, 65252);
        PREVIEW_BEAUTY_ENTRY_BEAUTY_GUIDE = new C0UX6("PREVIEW_BEAUTY_ENTRY_BEAUTY_GUIDE", 124, new String[]{"PreviewBeautifyBeautyTab"}, new C0UX8[]{c0ux8}, false, false, true, c0n1n2, false, "preview_first_screen", 63204);
        PREVIEW_BEAUTY_ENTRY_MAKEUP_GUIDE = new C0UX6("PREVIEW_BEAUTY_ENTRY_MAKEUP_GUIDE", 125, new String[]{"PreviewBeautifyMakeupTab"}, new C0UX8[]{c0ux8}, false, false, true, c0n1n2, false, "preview_first_screen", 63204);
        PREVIEW_BEAUTY_ENTRY_AI_GUIDE = new C0UX6("PREVIEW_BEAUTY_ENTRY_AI_GUIDE", 126, new String[]{"RedDotAIBeautyTabDirect"}, new C0UX8[]{c0ux8}, false, false, true, c0n1n2, false, "preview_first_screen", 63204);
        LIVE_BROADCAST_BEAUTY_ENTRY_BEAUTY_GUIDE = new C0UX6("LIVE_BROADCAST_BEAUTY_ENTRY_BEAUTY_GUIDE", 127, new String[]{"BroadcastBeautifyBeautyTab"}, new C0UX8[]{c0ux82}, false, false, true, c0n1n, false, null, 65252);
        LIVE_BROADCAST_BEAUTY_ENTRY_MAKEUP_GUIDE = new C0UX6("LIVE_BROADCAST_BEAUTY_ENTRY_MAKEUP_GUIDE", 128, new String[]{"BroadcastBeautifyMakeupTab"}, new C0UX8[]{c0ux82}, false, false, true, c0n1n, false, null, 65252);
        LIVE_BROADCAST_ENHANCE_ENTRY_BEAUTY_GUIDE = new C0UX6("LIVE_BROADCAST_ENHANCE_ENTRY_BEAUTY_GUIDE", 129, new String[]{"BroadcastEnhanceBeautyTab"}, new C0UX8[]{c0ux82}, false, false, true, c0n1n2, false, "anchor_first_screen", 63212);
        LIVE_BROADCAST_ENHANCE_ENTRY_MAKEUP_GUIDE = new C0UX6("LIVE_BROADCAST_ENHANCE_ENTRY_MAKEUP_GUIDE", 130, new String[]{"BroadcastEnhanceMakeupTab"}, new C0UX8[]{c0ux82}, false, false, true, c0n1n2, false, "anchor_first_screen", 63212);
        COHOST_WITH_MULTI_GUEST_GUIDE_REDDOT = new C0UX6("COHOST_WITH_MULTI_GUEST_GUIDE_REDDOT", 131, new String[]{"CoHostWithMultiGuestGuideRedDot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, null, 65516);
        COHOST_INVITATION_DURING_MULTI_GUEST_INTERACT_REDDOT = new C0UX6("COHOST_INVITATION_DURING_MULTI_GUEST_INTERACT_REDDOT", 132, new String[]{"CohostInvitationDuringMultiGuestInteract"}, new C0UX8[]{c0ux82}, false, false, false, null, false, null, 65516);
        MATCH_SETTING_AI_COMMENTARY_REDDOT = new C0UX6("MATCH_SETTING_AI_COMMENTARY_REDDOT", 133, new String[]{"MatchSettingAiCommentaryRedDot"}, new C0UX8[]{c0ux82}, false, false, false, c0n1n2, false, "live_match_panel", 63212);
        LIVE_BROADCAST_AI_REPLY_SETTING = new C0UX6("LIVE_BROADCAST_AI_REPLY_SETTING", 134, new String[]{"BroadcastAiReplySetting"}, new C0UX8[]{c0ux82, c0ux8}, false, false, true, null, false, "anchor_multi", 63468);
        LIVE_BROADCAST_AI_BEAUTY_TAB = new C0UX6("LIVE_BROADCAST_AI_BEAUTY_TAB", 135, new String[]{"RedDotAIBeautyTab"}, new C0UX8[]{c0ux8}, false, false, false, c0n1n, false, null, 65252);
        LIVE_BROADCAST_SUPER_FAN_TREASURE_BOX = new C0UX6("LIVE_BROADCAST_SUPER_FAN_TREASURE_BOX", 136, new String[]{"SuperFanBoxInteractivePanelRedDot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, "anchor_interaction", 63468);
        COHOST_SETTING_REDDOT = new C0UX6("COHOST_SETTING_REDDOT", 137, new String[]{"CoHostSettingsRedDot"}, new C0UX8[]{c0ux82}, false, false, false, null, false, null, 65516);
        MATCH_INVITE_SETTINGS_ICON = new C0UX6("MATCH_INVITE_SETTINGS_ICON", 138, new String[]{"MatchInviteSettingsIcon"}, new C0UX8[]{c0ux82}, false, false, false, c0n1n2, false, "live_match_panel", 63212);
        MATCH_SPECIFIC_COMMUNITY_GIFT = new C0UX6("MATCH_SPECIFIC_COMMUNITY_GIFT", 139, new String[]{"MatchSpecificCommunityGift"}, new C0UX8[]{c0ux82}, false, false, false, c0n1n2, false, "live_match_panel", 63212);
        LIVE_TITLE = new C0UX6("LIVE_TITLE", 140, new String[]{"LiveTitle"}, new C0UX8[]{c0ux82}, settingsManager.getIntValue("multi_guest_live_title_ability", 0) > 0, false, false, null, false, "anchor_more", 63464);
        C0UX6[] c0ux6ArrLIZJ = LIZJ();
        LLJJIJI = c0ux6ArrLIZJ;
        LLJJIJIIJIL = C0UX7.LIZ(c0ux6ArrLIZJ);
    }

    public final InterfaceC1102150emr getComponent() {
        return C1113770f5b.LL;
    }

    public final InterfaceC1102120emo getComponentInstance() {
        return this.LLJJIII;
    }

    public final String getCurrentId() {
        return this.LLJI;
    }

    public final long getGuideShowStartAtMillis() {
        return this.LLIZ;
    }

    public final long getGuideShowTotalDuration() {
        return this.LLIZLLLIL;
    }

    public final String[] getIds() {
        return this.LL;
    }

    public final HashSet<C0UX6> getInnerLayerRedDots() {
        return this.LLJJI;
    }

    public final LiveMessagePlatformRedDotConfig getLiveMessagePlatformRedDotConfig() {
        return this.LLJILLL;
    }

    public final C0UX8[] getLivePage() {
        return this.LLILLJJLI;
    }

    public final HashSet<C0UX6> getOutLayerRedDots() {
        return this.LLJJ;
    }

    public final C0N1N getPageLevel() {
        return this.LLJ;
    }

    public final String getPosition() {
        return this.LLJILJIL;
    }

    public final long getShowStartAtMills() {
        return this.LLILZLL;
    }

    public final boolean isAssetsRedDot() {
        return this.LLJIJIL;
    }

    public final boolean isDynamic() {
        return this.LLILZ;
    }

    public final boolean isGuide() {
        return this.LLILZIL;
    }

    public final boolean isShowing() {
        return this.LLJILJILJ;
    }

    public final boolean isValid() {
        return this.LLILLL;
    }

    public static C0UX6 valueOf(String str) {
        return (C0UX6) C08FF.LIZ(C0UX6.class, str);
    }

    public final void setAssetsRedDot(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setCurrentId(String str) {
        this.LLJI = str;
    }

    public final void setDynamic(boolean z) {
        this.LLILZ = z;
    }

    public final void setGuideShowStartAtMillis(long j) {
        this.LLIZ = j;
    }

    public final void setGuideShowTotalDuration(long j) {
        this.LLIZLLLIL = j;
    }

    public final void setIds(String[] strArr) {
        this.LL = strArr;
    }

    public final void setLiveMessagePlatformRedDotConfig(LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig) {
        this.LLJILLL = liveMessagePlatformRedDotConfig;
    }

    public final void setLivePage(C0UX8[] c0ux8Arr) {
        this.LLILLJJLI = c0ux8Arr;
    }

    public final void setPageLevel(C0N1N c0n1n) {
        this.LLJ = c0n1n;
    }

    public final void setPosition(String str) {
        this.LLJILJIL = str;
    }

    public final void setShowStartAtMills(long j) {
        this.LLILZLL = j;
    }

    public final void setShowing(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setValid(boolean z) {
        this.LLILLL = z;
    }

    public C0UX6(String str, int i, String[] strArr, C0UX8[] c0ux8Arr, boolean z, boolean z2, boolean z3, C0N1N c0n1n, boolean z4, String str2, int i2) {
        String str3;
        LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig;
        HashSet<C0UX6> hashSet;
        boolean z5 = z4;
        C0N1N c0n1n2 = c0n1n;
        boolean z6 = z2;
        String str4 = str2;
        boolean zValidDefaultValue = (i2 & 4) != 0 ? LiveRedDotValidDefaultValueSetting.INSTANCE.validDefaultValue() : z;
        z6 = (i2 & 8) != 0 ? false : z6;
        c0n1n2 = (i2 & 256) != 0 ? C0N1N.LEVEL1 : c0n1n2;
        if ((i2 & 512) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        z5 = (i2 & 1024) != 0 ? false : z5;
        str4 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str4;
        if ((i2 & 8192) != 0) {
            liveMessagePlatformRedDotConfig = new LiveMessagePlatformRedDotConfig(0, false, 0, null, false, null, 0L, null, 0, 0, 0L, null, 4095, null);
        } else {
            liveMessagePlatformRedDotConfig = null;
        }
        if ((i2 & 16384) != 0) {
            hashSet = new HashSet<>();
        } else {
            hashSet = null;
        }
        HashSet<C0UX6> hashSet2 = (i2 & 32768) != 0 ? new HashSet<>() : null;
        this.LL = strArr;
        this.LLILLJJLI = c0ux8Arr;
        this.LLILLL = zValidDefaultValue;
        this.LLILZ = z6;
        this.LLILZIL = z3;
        this.LLILZLL = 0L;
        this.LLIZ = 0L;
        this.LLIZLLLIL = 0L;
        this.LLJ = c0n1n2;
        this.LLJI = str3;
        this.LLJIJIL = z5;
        this.LLJILJIL = str4;
        this.LLJILJILJ = false;
        this.LLJILLL = liveMessagePlatformRedDotConfig;
        this.LLJJ = hashSet;
        this.LLJJI = hashSet2;
    }
}
