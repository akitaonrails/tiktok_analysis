package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import java.util.Set;

/* JADX INFO: renamed from: X.0Rb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698830Rb7 {
    public static final C698830Rb7 LIZ = new C698830Rb7();
    public static final Set<String> LIZIZ;
    public static final Set<String> LIZJ;

    static {
        Set<String> setLJ = C093Y.LJ("bottom_banner_take_down", "bottom_banner_audio_violation", "bottom_banner_content_check_bar", "bottom_banner_moderation_status_bar", "bottom_banner_customized_notice", "bottom_banner_engagement_counts", "bottom_banner_promote_ads", "bottom_banner_warning", "bottom_banner_tcm", "bottom_banner_series_mini_drama", "bottom_banner_ad_deduction", "bottom_banner_edit_caption", "bottom_banner_playlist", "bottom_banner_inspiration", "bottom_banner_retag_poi", "bottom_banner_survey_publish", "bottom_banner_poi_write_review", "bottom_banner_replace_background_music", "bottom_banner_ad_search_rs", "bottom_banner_ec_search_rs", "bottom_banner_search_rs", "bottom_banner_audio_violation_low_priority", "bottom_banner_game_live", "bottom_banner_trends", "bottom_banner_qna", "bottom_banner_podcast_entrance", "bottom_banner_referral", "bottom_banner_anti_addiction", "bottom_banner_video_gift_bag", "bottom_banner_schedule_video", "bottom_banner_live_task", "bottom_banner_commerce_ace_disclaimer", "bottom_banner_survey", "bottom_banner_early_feedback", "bottom_banner_id_verification", "bottom_banner_tako", "bottom_banner_fundraiser_customize", "bottom_banner_anole_slot", "bottom_banner_photo_mode_high_quality_post", "bottom_banner_under_water", "bottom_banner_photo_mode_after_creation_feedback", "bottom_banner_asset_companion_banner", "bottom_banner_aigc_overlabel");
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            setLJ.addAll(iFeedDebugService.LJJIIZ());
        }
        LIZIZ = setLJ;
        LIZJ = C093Y.LJ("bottom_banner_warning", "bottom_banner_customized_notice", "bottom_banner_engagement_counts", "bottom_banner_edit_caption", "bottom_banner_video_gift_bag", "bottom_banner_ec_search_rs", "bottom_banner_search_rs", "bottom_banner_poi_write_review", "bottom_banner_retag_poi", "bottom_banner_replace_background_music");
    }
}
