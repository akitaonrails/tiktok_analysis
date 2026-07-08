package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.VerificationWarningInfo;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.android.livesdk.message.proto.WebcastLSAccessStatus;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.RoomEventMessage;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComAvoidConfig;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import java.util.List;
import java.util.Map;
import webcast.api.room.LiveManagerEntranceInfo;
import webcast.api.room.PlaybookBannerContainer;
import webcast.data.AnchorReminderWordStatus;
import webcast.data.AutoShareLiveCardToBulletinBoard;
import webcast.data.CampaignExposureData;
import webcast.data.LiveGoLivePageContainer;
import webcast.data.MultiGuestPlayInfo;

/* JADX INFO: loaded from: classes.dex */
public class RoomCreateInfo {

    @C09CT("activities_icon_info")
    public ActivitiesIconInfo activitiesIconInfo;

    @C09CT("admin_ec_show_permission")
    public Map<Long, Long> adminEcShowPermission;

    @C09CT("age_restricted_config")
    public AgeRestrictedConfig ageRestrictedConfig;

    @C09CT("anchor_can_open_caption")
    public boolean anchorCanOpenCaption;

    @C09CT("star_comment_qualification")
    public boolean anchorStarCommentPermission;

    @C09CT("auto_share_live_card_to_bulletin_board")
    public AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard;

    @C09CT("avoid_config")
    public MsgNotifyComAvoidConfig avoidConfig;

    @C09CT("banner_data")
    public BannerInRoomCollection.BannerInfo bannerInfo;

    @C09CT("ban_status")
    public BlockStatus blockStatus;

    @C09CT("campaign_banner_data")
    public CampaignBannerData campaignBannerData;

    @C09CT("campaign_exposure_data")
    public CampaignExposureData campaignExposureData;

    @C09CT("can_strong_reach_auto_post_living")
    public boolean canStrongReachAutoPostLiving;

    @C09CT("cover_source")
    public String coverSource;

    @C09CT("cpp_age_verification_info")
    public CppAgeVerificationInfo cppAgeVerificationInfo;

    @C09CT("cpp_banner_info")
    public CppBannerInfo cppBannerInfo;

    @C09CT("create_room_copyright_geo_block_list")
    public List<String> createRoomCopyrightGeoBlockList;

    @C09CT("ecom_growth_line_banner")
    public UnifiedBannerData ecomGrowthLineBanner;

    @C09CT("anchor_can_pin_message")
    public boolean enablePinMessage;

    @C09CT("fan_club_info")
    public FanClubInfo fanClubInfo;

    @C09CT("fragment_revert_switch")
    public int fragmentRevertSwitch;

    @C09CT("game_live_convert_info")
    public GameLiveConvertInfo gameLiveConvertInfo;

    @C09CT("game_live_info")
    public GameLiveInfo gameLiveInfo;

    @C09CT("go_live_ec_icon_info")
    public GoLiveECIconInfo goLiveEcIconInfo;

    @C09CT("golive_locale_restricted")
    public boolean goliveLocaleRestricted;

    @C09CT("guessing_game_info")
    public GuessingGameInfo guessingGameInfo;

    @C09CT("has_game_guess_permission")
    public boolean hasGameGuessPermission;

    @C09CT("has_ttls_live_permission")
    public boolean hasTtlsLivePermission;

    @C09CT("hashtag")
    public Hashtag hashtag;

    @C09CT("have_campaign")
    public boolean haveCampaign;

    @C09CT("is_enigma")
    public boolean isEnigma;

    @C09CT("is_location_old_button_open")
    public boolean isLocationOldButtonOpen;

    @C09CT("last_fragment")
    public GameLiveFragment lastFragment;

    @C09CT("live_go_live_page_container")
    public LiveGoLivePageContainer liveGoLivePageContainer;

    @C09CT("live_goal_reward_premission")
    public boolean liveGoalRewardPremission;

    @C09CT("live_journey_banner")
    public UnifiedBannerData liveJourneyBanner;

    @C09CT("live_manager_entrance_info")
    public LiveManagerEntranceInfo liveManagerEntranceInfo;

    @C09CT("anchor_live_pro_info")
    public LiveProInfo liveProInfo;

    @C09CT("ls_show_mobile_view_guide")
    public boolean lsShowMobileViewGuide;

    @C09CT("anchor_prompt_type")
    public int mAnchorPromptType;

    @C09CT("cover")
    public ImageModel mCover;

    @C09CT("cover_audit_status")
    public long mCoverAuditStatus;

    @C09CT("never_go_live_flag")
    public int mIsFirstBroadcastFlag;

    @C09CT("last_room_id")
    public long mLastRoomId;

    @C09CT("mode_go_live_page_containers")
    public Map<Integer, LiveGoLivePageContainer> modeGoLivePageContainers;

    @C09CT("multi_guest_play_info")
    public MultiGuestPlayInfo multiGuestPlayInfo;

    @C09CT("new_anchor_incentive_banner_data")
    public NewAnchorIncentiveBannerData newAnchorIncentiveBannerData;

    @C09CT("quota_config")
    public Map<Long, MsgNotifyQuota> notifyQuotaConfig;

    @C09CT("ongoing_goal")
    public LiveStreamGoal ongoingGoal;

    @C09CT("perception_message")
    public CreateInfoPerceptionMessage perceptionMessage;

    @C09CT("perception_messages")
    public List<CreateInfoPerceptionMessage> perceptionMessages;

    @C09CT("permission_level_info")
    public PermissionLevelInfo permissionLevelInfo;

    @C09CT("playbook_banner")
    public PlaybookBannerContainer playbookBanner;

    @C09CT("poll_template_optimize_group")
    public long pollTemplateOptimizeGroup;

    @C09CT("pop_info_list")
    public List<PopMsgContainer> popInfoList;

    @C09CT("punishment_message")
    public CreateInfoPunishmentMessage punishmentMessage;

    @C09CT("push_stream_info")
    public Map<Long, PushStreamInfo> pushStreamInfoMap;

    @C09CT("reminder_word_status")
    public List<AnchorReminderWordStatus> reminderWordStatus;

    @C09CT("room_auth_customizable_poll")
    public int roomAuthCustomizablePoll;

    @C09CT("room_event_message_info")
    public RoomEventMessage roomEventMessageInfo;

    @C09CT("last_room_gift_count")
    public long roomGiftCount;

    @C09CT("seller_pre_live_exp_group")
    public int sellerPreLiveExpGroup;

    @C09CT("show_campaign_center_more_page")
    public boolean showCampaignCenterMorePage;

    @C09CT("show_campaign_center_open_page")
    public boolean showCampaignCenterOpenPage;

    @C09CT("show_voice_chat_guide")
    public boolean showVoiceChatGuide;

    @C09CT("smb_verification")
    public SMBVerification smbVerification;

    @C09CT("smb_verification_warning_info")
    public VerificationWarningInfo smbVerificationWarningInfo;

    @C09CT("star_comment_permission_switch")
    public boolean starCommentPermissionSwitch;

    @C09CT("stream_translation_state")
    public int streamTranslationState;

    @C09CT("subscription_live_open_page_red_dot")
    public boolean subscriptionLiveOpenPageRedDot;

    @C09CT("tts_probation_mode")
    public int ttsProbationMode;

    @C09CT("unified_banner_data")
    public UnifiedBannerData unifiedBannerData;

    @C09CT("use_avatar_as_cover")
    public boolean useAvatarAsCover;

    @C09CT("viewer_wishes_icon_info")
    public ViewerWishesIconInfo viewerWishesIconInfo;

    @C09CT("voice_cover")
    public ImageModel voiceCover;

    @C09CT("wallet_rewards_container_info")
    public WalletRewardsContainerInfo walletRewardsContainerInfo;

    @C09CT("webcast_ls_access_status")
    public WebcastLSAccessStatus webcastLSAccessStatus;

    @C09CT("title")
    public String mTitle = "";

    @C09CT("go_live_prompt")
    public String mPrompt = "";

    @C09CT("live_additional_prompt")
    public String mAdditionalPrompt = "";

    @C09CT("live_house_status")
    public Long live_house_status = 0L;

    @C09CT("donation_sticker")
    public int donationSticker = 0;

    @C09CT("event_info")
    public LiveEventInfo mLiveEventInfo = new LiveEventInfo();

    @C09CT("is_new_anchor")
    public boolean isNewAnchor = false;

    @C09CT("show_game_tags")
    public boolean showGameTags = false;

    @C09CT("guide_status")
    public int guideStatus = 0;

    @C09CT("can_show_fragment")
    public boolean canShowFragment = false;

    @C09CT("has_fragment")
    public boolean hasFragment = false;

    @C09CT("screenshot_cover_status")
    public int screenShotCoverStatus = 0;

    @C09CT("block_detail_url")
    public String blockDetailUrl = "";

    @C09CT("device_level")
    public int deviceLevel = 0;

    @C09CT("voice_title")
    public String voiceTitle = "";

    @C09CT("voice_cover_audit_status")
    public int voiceCoverAuditStatus = 0;

    @C09CT("use_avatar_as_voice_cover")
    public boolean useAvatarAsVoiceCover = false;

    @C09CT("voice_cover_source")
    public String voiceCoverSource = "";

    @C09CT("poll_optimize_group")
    public long pollOptimizeGroup = 0;

    @C09CT("fold_bottom_area")
    public boolean foldBottomArea = false;

    @C09CT("effect_active_level")
    public int effectActiveLevel = 1;

    @C09CT("has_growth_center")
    public boolean hasGrowthCenter = false;

    @C09CT("growth_center_first_display_text")
    public String growthCenterFirstDisplayText = "";

    @C09CT("growth_center_not_first_display_text")
    public String growthCenterNotFirstDisplayText = "";

    @C09CT("has_recent_stream")
    public boolean hasRecentStream = false;

    @C09CT("default_comment_tray_switch_value")
    public boolean defaultCommentTraySwitch = false;

    @C09CT("star_comment_permission_switch_off_reason")
    public String starCommentPermissionSwitchOffReason = "";

    @C09CT("show_shopping_manage")
    public Boolean showShoppingManage = Boolean.FALSE;

    public static final class CountDownInfo {

        @C09CT("coins")
        public long coins;

        @C09CT("seconds")
        public long seconds;
    }

    public static final class FanClubInfo {

        @C09CT("fan_club_permission")
        public boolean fanClubPermission;
    }

    public static final class SMBVerification {

        @C09CT("show_notice")
        public boolean showNotice;

        @C09CT("verification_info")
        public SMBVerificationInfo verificationInfo;
    }

    public static final class ViewerWishesIconInfo {

        @C09CT("active_in_music_campaign")
        public boolean activeInMusicCampaign;

        @C09CT("auto_start")
        public boolean autoStart;

        @C09CT("display_viewer_wishes_icon")
        public boolean displayViewerWishesIcon;

        @C09CT("has_unavailable_gifts")
        public boolean hasUnavailableGifts;
    }

    public final boolean LIZ() {
        Long l;
        Map<Long, Long> map = this.adminEcShowPermission;
        return (map == null || (l = map.get(8L)) == null || l.longValue() != 1) ? false : true;
    }

    public final boolean LIZIZ() {
        return this.donationSticker == 1;
    }
}
