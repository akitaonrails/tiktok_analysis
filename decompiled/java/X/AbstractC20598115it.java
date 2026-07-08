package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.URLUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.album.IToolsAlbumService;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeDurationExtra;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumOpenApiModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeAfterCreationFeedbackMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeBannerMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationInfo;
import com.ss.android.ugc.aweme.creative.model.stickers.MentionStickerParam;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.model.CollectionInfoParcelableForShoot;
import com.ss.android.ugc.aweme.music.model.LyricStickerStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SDKServiceImpl;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.external.ui.CommentVideoConfig;
import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.ugc.aweme.services.external.ui.EffectConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.LiveParams;
import com.ss.android.ugc.aweme.services.external.ui.MiniAppConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.IBinderWrapper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.util.performance.SoundSyncOpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS158S0400000_31;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15it, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20598115it implements IRecordService {
    public final C1443030nef LIZ = C1443030nef.LJII();
    public final SDKServiceImpl LIZIZ = new SDKServiceImpl();

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startIndependentLiveActivity(Context context, RecordConfig recordConfig) {
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final Object startStripMusicPreview(Aweme aweme, Activity activity, long j, ChangeBanMusicConfig changeBanMusicConfig, UIServiceCallback uIServiceCallback, String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJ(this, aweme, activity, j, changeBanMusicConfig, uIServiceCallback, str, str2, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final boolean isBroadcastSmoothGoLive() {
        o.LJIILL.getClass();
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).isBroadcastSmoothGoLive();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final boolean isVideoRecordNewActivityInStack() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        boolean z = false;
        if (activityStack != null && activityStack.length > 0) {
            C089E c089e = new C089E(activityStack);
            z = false;
            while (c089e.hasNext()) {
                if (C577960Mle.LIZ((Activity) c089e.next()) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static Intent LIZ(RecordConfig recordConfig) {
        Set<Map.Entry<String, String>> setEntrySet;
        Set<Map.Entry<String, String>> setEntrySet2;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_tools_open_ab_optimization_before_loadso", true, false)) {
            C01GW c01gw = C289290BVn.LIZ;
            C289290BVn.LIZIZ = true;
            if (TENativeLibsLoader.getLibraryLoadStatus() != EnumC2122508Tf.LOADED) {
                C289290BVn.LIZIZ = false;
            }
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_tools_open_ab_opt_before_download_ab", true, false)) {
            C01GW c01gw2 = C289290BVn.LIZ;
            C289290BVn.LIZIZ = true;
            if (!AVSettingsServiceImpl.getInstance().hasUpdateABTestModelExecuted()) {
                C289290BVn.LIZIZ = false;
            }
        }
        Intent intent = new Intent();
        intent.putExtra("net_unavailable_music", recordConfig.getNetworkUnavailableMusic());
        intent.putExtra("need_load_later", recordConfig.getNeedLoadResourceAfterRecord());
        String landingTab = recordConfig.getLandingTab();
        if (landingTab != null) {
            intent.putExtra("landing_tab", landingTab);
        }
        intent.putExtra("do_not_load_music", recordConfig.getDoNotLoadMusic());
        MusicModel musicModel = recordConfig.getMusicModel();
        if (musicModel != null) {
            intent.putExtra("music_model", musicModel);
        }
        Boolean boolIsInterceptBackground = recordConfig.isInterceptBackground();
        if (boolIsInterceptBackground != null) {
            intent.putExtra("intercept_background", boolIsInterceptBackground.booleanValue());
        }
        String shootway = recordConfig.getShootway();
        if (shootway != null) {
            intent.putExtra("shoot_way", shootway);
        }
        Long maxDuration = recordConfig.getMaxDuration();
        if (maxDuration != null) {
            intent.putExtra("extra_max_shoot_duration", maxDuration.longValue());
        }
        Integer musicStart = recordConfig.getMusicStart();
        if (musicStart != null) {
            intent.putExtra("music_start", musicStart.intValue());
        }
        Integer musicEnd = recordConfig.getMusicEnd();
        if (musicEnd != null) {
            intent.putExtra("music_end", musicEnd.intValue());
        }
        String shootFrom = recordConfig.getShootFrom();
        if (shootFrom != null) {
            intent.putExtra("shoot_from", shootFrom);
        }
        Boolean supportPrivateAlbum = recordConfig.getSupportPrivateAlbum();
        if (supportPrivateAlbum != null) {
            intent.putExtra("show_private_album", supportPrivateAlbum.booleanValue());
        }
        String enterFrom = recordConfig.getEnterFrom();
        if (enterFrom != null) {
            intent.putExtra("enter_from", enterFrom);
            intent.putExtra("story_creative_enter_from_passthrough", enterFrom);
        }
        String enterMethod = recordConfig.getEnterMethod();
        if (enterMethod != null) {
            intent.putExtra("enter_method", enterMethod);
        }
        String relationEnterMethod = recordConfig.getRelationEnterMethod();
        if (relationEnterMethod != null) {
            intent.putExtra("relation_enter_method", relationEnterMethod);
        }
        PhotoModeBannerMobParams photoModeBannerMobParams = recordConfig.getPhotoModeBannerMobParams();
        if (photoModeBannerMobParams != null) {
            intent.putExtra("photo_mode_banner_mob_params", (Parcelable) photoModeBannerMobParams);
        }
        PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams = recordConfig.getPhotoModeAfterCreationFeedbackMobParams();
        if (photoModeAfterCreationFeedbackMobParams != null) {
            intent.putExtra("photo_mode_after_creation_feedback_mob_params", (Parcelable) photoModeAfterCreationFeedbackMobParams);
        }
        AddYourRecordParam addYourRecordParam = recordConfig.getAddYourRecordParam();
        if (addYourRecordParam != null) {
            intent.putExtra("add_yours_sticker_record_param", (Parcelable) addYourRecordParam);
        }
        MentionStickerParam mentionStickerParam = recordConfig.getMentionStickerParam();
        if (mentionStickerParam != null) {
            intent.putExtra("mention_sticker_param", (Parcelable) mentionStickerParam);
        }
        DMGroupChatStickerGroupInfo dmGroupChatStickerGroupInfo = recordConfig.getDmGroupChatStickerGroupInfo();
        if (dmGroupChatStickerGroupInfo != null) {
            intent.putExtra("dm_group_chat_sticker_group_info", (Parcelable) dmGroupChatStickerGroupInfo);
        }
        String liveEventStickerRawData = recordConfig.getLiveEventStickerRawData();
        if (liveEventStickerRawData != null) {
            intent.putExtra("extra_live_event_sticker_data", liveEventStickerRawData);
        }
        SecretRepliesRecordParam secretRepliesStickerParam = recordConfig.getSecretRepliesStickerParam();
        if (secretRepliesStickerParam != null) {
            intent.putExtra("secret_replies_sticker_param", (Parcelable) secretRepliesStickerParam);
        }
        MusicStickerStruct musicStickerStruct = recordConfig.getMusicStickerStruct();
        if (musicStickerStruct != null) {
            intent.putExtra("music_sticker_struct", musicStickerStruct);
        }
        Boolean boolIsUsedFullSong = recordConfig.isUsedFullSong();
        if (boolIsUsedFullSong != null) {
            intent.putExtra("used_full_song", boolIsUsedFullSong.booleanValue());
        }
        String creationId = recordConfig.getCreationId();
        if (creationId == null) {
            creationId = C0DMI.LIZ();
        }
        Serializable serializable = null;
        C537520L6g.LJ(intent, creationId, 0, null);
        intent.putExtra("restore", recordConfig.getRestoreType());
        String musicOrigin = recordConfig.getMusicOrigin();
        if (musicOrigin != null) {
            intent.putExtra("music_origin", musicOrigin);
        }
        intent.putExtra("need_refresh_filter_data", recordConfig.getPrepareFilter());
        Pair<String, String> mentionUser = recordConfig.getMentionUser();
        if (mentionUser != null) {
            intent.putExtra("extra_mention_uid", mentionUser.getFirst());
            intent.putExtra("extra_mention_user_name", mentionUser.getSecond());
        }
        String previousPage = recordConfig.getPreviousPage();
        if (previousPage != null) {
            intent.putExtra("extra_previous_page", previousPage);
        }
        String commerceData = recordConfig.getCommerceData();
        if (commerceData != null) {
            intent.putExtra("commerce_data_in_tools_line", commerceData);
        }
        Boolean needEcAITeleprompter = recordConfig.getNeedEcAITeleprompter();
        if (needEcAITeleprompter != null) {
            intent.putExtra("ec_need_ai_teleprompter", needEcAITeleprompter.booleanValue());
        }
        Integer recordFromTab = recordConfig.getRecordFromTab();
        if (recordFromTab != null) {
            intent.putExtra("extra_record_from_tab", recordFromTab.intValue());
        }
        Integer tabs = recordConfig.getTabs();
        if (tabs != null) {
            intent.putExtra("tabs", tabs.intValue());
        }
        String sticker = recordConfig.getSticker();
        if (sticker != null) {
            intent.putExtra("sticker_id", sticker);
        }
        Boolean showCancelAfterPinProp = recordConfig.getShowCancelAfterPinProp();
        if (showCancelAfterPinProp != null) {
            intent.putExtra("show_cancel_after_pin_prop", showCancelAfterPinProp.booleanValue());
        }
        String strIsFilterBusniessSticker = recordConfig.isFilterBusniessSticker();
        if (strIsFilterBusniessSticker != null) {
            intent.putExtra("filter_business_sticker", strIsFilterBusniessSticker);
        }
        Long videoDownloadDuration = recordConfig.getVideoDownloadDuration();
        if (videoDownloadDuration != null) {
            intent.putExtra("video_download_duration", videoDownloadDuration.longValue());
        }
        Long effectDownloadDuration = recordConfig.getEffectDownloadDuration();
        if (effectDownloadDuration != null) {
            intent.putExtra("effect_download_duration", effectDownloadDuration.longValue());
        }
        Long musicDownloadDuration = recordConfig.getMusicDownloadDuration();
        if (musicDownloadDuration != null) {
            intent.putExtra("music_download_duration", musicDownloadDuration.longValue());
        }
        MusicStickerStruct musicStickerStruct2 = recordConfig.getMusicStickerStruct();
        if (musicStickerStruct2 != null) {
            intent.putExtra("music_sticker_struct", musicStickerStruct2);
        }
        Boolean boolIsUsedFullSong2 = recordConfig.isUsedFullSong();
        if (boolIsUsedFullSong2 != null) {
            intent.putExtra("used_full_song", boolIsUsedFullSong2.booleanValue());
        }
        Long startRecordTime = recordConfig.getStartRecordTime();
        if (startRecordTime != null) {
            intent.putExtra("extra_start_record_time", startRecordTime.longValue());
        }
        String shootPerfSessionId = recordConfig.getShootPerfSessionId();
        if (shootPerfSessionId != null) {
            intent.putExtra("shoot_perf_session_id", shootPerfSessionId);
        }
        if (recordConfig.getOpenTime() > 0) {
            intent.putExtra("open_time", recordConfig.getOpenTime());
        }
        if (recordConfig.getShootNativeRecvTs() > 0) {
            intent.putExtra("shoot_native_recv_ts", recordConfig.getShootNativeRecvTs());
        }
        String inspirationEnterFrom = recordConfig.getInspirationEnterFrom();
        if (inspirationEnterFrom != null) {
            intent.putExtra("inspiration_enter_from", inspirationEnterFrom);
        }
        String inspirationEnterMethod = recordConfig.getInspirationEnterMethod();
        if (inspirationEnterMethod != null) {
            intent.putExtra("inspiration_enter_method", inspirationEnterMethod);
        }
        if (recordConfig.getInterceptorCost() >= 0) {
            intent.putExtra("interceptor_cost", recordConfig.getInterceptorCost());
        }
        if (recordConfig.getServiceLoadCost() >= 0) {
            intent.putExtra("service_load_cost", recordConfig.getServiceLoadCost());
        }
        Long duetStitchClickTime = recordConfig.getDuetStitchClickTime();
        if (duetStitchClickTime != null) {
            intent.putExtra("extra_duet_stitch_click_time", duetStitchClickTime.longValue());
        }
        String voiceEffectId = recordConfig.getVoiceEffectId();
        if (voiceEffectId != null) {
            intent.putExtra("voice_effect_id", voiceEffectId);
        }
        String voiceEffectName = recordConfig.getVoiceEffectName();
        if (voiceEffectName != null) {
            intent.putExtra("voice_effect_name", voiceEffectName);
        }
        String vcVoiceEffectId = recordConfig.getVcVoiceEffectId();
        if (vcVoiceEffectId != null) {
            intent.putExtra("voice_conversion_effect_id", vcVoiceEffectId);
        }
        String vcVoiceEffectName = recordConfig.getVcVoiceEffectName();
        if (vcVoiceEffectName != null) {
            intent.putExtra("voice_conversion_effect_name", vcVoiceEffectName);
        }
        ArrayList<String> ttsVoiceIDs = recordConfig.getTtsVoiceIDs();
        if (ttsVoiceIDs != null) {
            intent.putStringArrayListExtra("tts_voice_ids", ttsVoiceIDs);
        }
        ArrayList<String> ttsVoiceRefIDs = recordConfig.getTtsVoiceRefIDs();
        if (ttsVoiceRefIDs != null) {
            intent.putStringArrayListExtra("tts_voice_ref_ids", ttsVoiceRefIDs);
        }
        TtsVoiceInfo ttsVoiceInfo = recordConfig.getTtsVoiceInfo();
        if (ttsVoiceInfo != null) {
            intent.putExtra("tts_voice_info", ttsVoiceInfo);
        }
        Boolean originMusicRemoveTTS = recordConfig.getOriginMusicRemoveTTS();
        if (originMusicRemoveTTS != null) {
            intent.putExtra("origin_music_remove_tts", originMusicRemoveTTS.booleanValue());
        }
        ArrayList<String> vcVoiceIDs = recordConfig.getVcVoiceIDs();
        if (vcVoiceIDs != null) {
            intent.putStringArrayListExtra("vc_voice_ids", vcVoiceIDs);
        }
        ArrayList<String> vcVoiceRefIDs = recordConfig.getVcVoiceRefIDs();
        if (vcVoiceRefIDs != null) {
            intent.putStringArrayListExtra("vc_voice_ref_ids", vcVoiceRefIDs);
        }
        Long decompressTime = recordConfig.getDecompressTime();
        if (decompressTime != null) {
            intent.putExtra("extra_decompress_time", decompressTime.longValue());
        }
        Boolean presetSticker = recordConfig.getPresetSticker();
        if (presetSticker != null) {
            intent.putExtra("use_preset_sticker_at_first", presetSticker.booleanValue());
        }
        Integer translationType = recordConfig.getTranslationType();
        if (translationType != null) {
            intent.putExtra("translation_type", translationType.intValue());
        }
        if (Intrinsics.LJFF(recordConfig.getLandingTab(), "editor_tab")) {
            intent.putExtra("translation_type", 1);
        }
        Boolean permissionActivityRequired = recordConfig.getPermissionActivityRequired();
        if (permissionActivityRequired != null) {
            intent.putExtra("extra_need_permission_activity", permissionActivityRequired.booleanValue());
        }
        if (Intrinsics.LJFF(recordConfig.getFromMain(), Boolean.TRUE)) {
            intent.putExtra("from", "main");
        }
        Boolean fromSystem = recordConfig.getFromSystem();
        if (fromSystem != null) {
            intent.putExtra("enter_record_directly_from_system", fromSystem.booleanValue());
        }
        Boolean fromOtherPlatform = recordConfig.getFromOtherPlatform();
        if (fromOtherPlatform != null) {
            intent.putExtra("enter_record_from_other_platform", fromOtherPlatform.booleanValue());
        }
        Boolean boolIsMultiEntryFormDM = recordConfig.isMultiEntryFormDM();
        if (boolIsMultiEntryFormDM != null) {
            intent.putExtra("is_multi_entry_form_dm", boolIsMultiEntryFormDM.booleanValue());
        }
        Integer cameraFacing = recordConfig.getCameraFacing();
        if (cameraFacing != null) {
            intent.putExtra("extra_camera_facing", cameraFacing.intValue());
        }
        ArrayList<String> stickers = recordConfig.getStickers();
        if (stickers != null) {
            intent.putStringArrayListExtra("reuse_sticker_ids", stickers);
        }
        String feedPropPinIds = recordConfig.getFeedPropPinIds();
        if (feedPropPinIds != null) {
            intent.putExtra("EXTRA_FEED_PROP_PIN", feedPropPinIds);
        }
        String propResourceId = recordConfig.getPropResourceId();
        if (propResourceId != null) {
            intent.putExtra("prop_resource_id", propResourceId);
        }
        String propResourceList = recordConfig.getPropResourceList();
        if (propResourceList != null) {
            intent.putExtra("prop_resource_list", propResourceList);
        }
        String propList = recordConfig.getPropList();
        if (propList != null) {
            intent.putExtra("prop_list", propList);
        }
        String giphyGifIds = recordConfig.getGiphyGifIds();
        if (giphyGifIds != null) {
            intent.putExtra("reuse_giphy_gifs", giphyGifIds);
        }
        ShootExtraData shootExtraData = recordConfig.getShootExtraData();
        if (shootExtraData != null) {
            intent.putExtra("extra_shoot_data", (Parcelable) shootExtraData);
        }
        CreativeDurationExtra creativeDurationExtra = recordConfig.getCreativeDurationExtra();
        if (creativeDurationExtra != null) {
            intent.putExtra("extra_creative_duration", (Parcelable) creativeDurationExtra);
        }
        String musicPath = recordConfig.getMusicPath();
        if (musicPath != null) {
            intent.putExtra("path", musicPath);
        }
        String musicSticker = recordConfig.getMusicSticker();
        if (musicSticker != null) {
            intent.putExtra("music_reuse_sticker_id", musicSticker);
        }
        String stickerWithMusicFilePath = recordConfig.getStickerWithMusicFilePath();
        if (stickerWithMusicFilePath != null) {
            intent.putExtra("sticker_with_music_file_path", stickerWithMusicFilePath);
        }
        Effect musicWithStickerEffect = recordConfig.getMusicWithStickerEffect();
        if (musicWithStickerEffect != null) {
            intent.putExtra("music_with_sticker_effect", (Parcelable) musicWithStickerEffect);
        }
        Music stickerMusic = recordConfig.getStickerMusic();
        if (stickerMusic != null) {
            intent.putExtra("sticker_music", stickerMusic);
        }
        String musicId = recordConfig.getMusicId();
        if (musicId != null) {
            intent.putExtra("music_id", musicId);
        }
        ReuseSoundAndEffectModel reuseSoundAndEffectModel = recordConfig.getReuseSoundAndEffectModel();
        if (reuseSoundAndEffectModel != null) {
            intent.putExtra("reuse_sound_and_effect_model", (Parcelable) reuseSoundAndEffectModel);
        }
        String shareId = recordConfig.getShareId();
        if (shareId != null) {
            intent.putExtra("share_id", shareId);
        }
        String clientId = recordConfig.getClientId();
        if (clientId != null) {
            intent.putExtra("channel", clientId);
        }
        String challengeId = recordConfig.getChallengeId();
        if (challengeId != null) {
            intent.putExtra("challenge_id", challengeId);
        }
        if (C1837707Hr.LIZ()) {
            List<String> csiChallengeIdsList = recordConfig.getCsiChallengeIdsList();
            if (csiChallengeIdsList != null) {
                intent.putExtra("csi_challenge_ids", (String[]) csiChallengeIdsList.toArray(new String[0]));
            }
            if (C1837907Ht.LIZ()) {
                List<String> csiChallengeNamesList = recordConfig.getCsiChallengeNamesList();
                if (csiChallengeNamesList != null) {
                    intent.putExtra("csi_challenge_names", (String[]) csiChallengeNamesList.toArray(new String[0]));
                }
                String publishTitle = recordConfig.getPublishTitle();
                if (publishTitle != null && publishTitle.length() > 0) {
                    intent.putExtra("publish_title", publishTitle);
                }
            }
            intent.putExtra("challenge_ids_not_clear_when_back", recordConfig.getChallengeIdsNotClearWhenBack());
        }
        String shootFromViewPanelAwemeId = recordConfig.getShootFromViewPanelAwemeId();
        if (shootFromViewPanelAwemeId != null) {
            intent.putExtra("shoot_from_view_panel_aweme_id", shootFromViewPanelAwemeId);
        }
        String autoUseMusic = recordConfig.getAutoUseMusic();
        if (autoUseMusic != null) {
            intent.putExtra("direct_use_sticker_music", autoUseMusic);
        }
        String autoUseSticker = recordConfig.getAutoUseSticker();
        if (autoUseSticker != null) {
            intent.putExtra("first_face_sticker", autoUseSticker);
        }
        Boolean showPreloadingDialog = recordConfig.getShowPreloadingDialog();
        if (showPreloadingDialog != null) {
            intent.putExtra("show_preloading_dialog", showPreloadingDialog.booleanValue());
        }
        intent.putExtra("msg_preloading_dialog", recordConfig.getPreloadStringResource());
        Boolean boolIsFormFlipShootIcon = recordConfig.isFormFlipShootIcon();
        if (boolIsFormFlipShootIcon != null) {
            intent.putExtra("enter_form_flip_shoot_icon", boolIsFormFlipShootIcon.booleanValue());
        }
        intent.putExtra("enter_record_from_feed", recordConfig.getRecordFromFeed());
        intent.putExtra("extra_landing_back", recordConfig.getLandingBack());
        String backUrl = recordConfig.getBackUrl();
        if (backUrl != null) {
            intent.putExtra("extra_back_url", backUrl);
        }
        intent.putExtra("extra_back_by_clear_top", recordConfig.getBackByClearTop());
        intent.putExtra("is_landing_search_before", recordConfig.isLandingSearchBefore());
        intent.putExtra("extra_include_draft", recordConfig.getLandingIncludeDraft());
        AILivePhotoConsumptionModel aiAliveInfo = recordConfig.getAiAliveInfo();
        if (aiAliveInfo != null) {
            intent.putExtra("extra_ai_alive_info", (Parcelable) aiAliveInfo);
        }
        Effect mvSticker = recordConfig.getMvSticker();
        if (mvSticker != null) {
            intent.putExtra("reuse_mvtheme_enter", true);
            intent.putExtra("extra_bind_mv_id", mvSticker.getEffectId());
            intent.putExtra("extra_mv_effect", (Parcelable) mvSticker);
        }
        String mvStickerId = recordConfig.getMvStickerId();
        if (mvStickerId != null) {
            intent.putExtra("extra_bind_mv_id", mvStickerId);
        }
        String templateDebugId = recordConfig.getTemplateDebugId();
        if (templateDebugId != null) {
            intent.putExtra("extra_template_debug_id", templateDebugId);
        }
        String templateDebugType = recordConfig.getTemplateDebugType();
        if (templateDebugType != null) {
            intent.putExtra("extra_template_debug_type", templateDebugType);
        }
        String landingSubTab = recordConfig.getLandingSubTab();
        if (landingSubTab != null) {
            intent.putExtra("extra_template_landing_sub_tab", landingSubTab);
        }
        String strIsFromEoyBanner = recordConfig.isFromEoyBanner();
        if (strIsFromEoyBanner != null) {
            intent.putExtra("is_from_eoy_banner", strIsFromEoyBanner);
        }
        String schemaTag = recordConfig.getSchemaTag();
        if (schemaTag != null) {
            intent.putExtra("extra_template_schema_tag", schemaTag);
        }
        String templateBackCamera = recordConfig.getTemplateBackCamera();
        if (templateBackCamera != null) {
            intent.putExtra("extra_template_back_camera", templateBackCamera);
        }
        String groupId = recordConfig.getGroupId();
        if (groupId != null) {
            intent.putExtra("group_id", groupId);
        }
        CollectionInfoParcelableForShoot seriesCollectionInfo = recordConfig.getSeriesCollectionInfo();
        if (seriesCollectionInfo != null) {
            intent.putExtra("series_creation_info", (Parcelable) seriesCollectionInfo);
        }
        DMCreativeStickerFontData fontData = recordConfig.getFontData();
        if (fontData != null) {
            intent.putExtra("dm_text_sticker", (Parcelable) fontData);
        }
        MiniAppConfig miniAppConfig = recordConfig.getMiniAppConfig();
        if (miniAppConfig != null) {
            intent.putExtra("sticker_id", miniAppConfig.getStickerId());
            intent.putExtra("micro_app_info", miniAppConfig.getAppInfo());
            intent.putExtra("micro_app_class", miniAppConfig.getAppClass());
        }
        CommentVideoConfig commentVideoConfig = recordConfig.getCommentVideoConfig();
        if (commentVideoConfig != null) {
            intent.putExtra("comment_video_model", commentVideoConfig.getCommentVideoModel());
        }
        intent.putExtra("is_through_anchor", recordConfig.isThroughAnchor());
        Effect firstSticker = recordConfig.getFirstSticker();
        if (firstSticker != null) {
            intent.putExtra("first_sticker", (Parcelable) firstSticker);
        }
        String unpublishedEffect = recordConfig.getUnpublishedEffect();
        if (unpublishedEffect != null) {
            intent.putExtra("unpublished_sticker_id", unpublishedEffect);
        }
        String savedDraft = recordConfig.getSavedDraft();
        if (savedDraft != null) {
            intent.putExtra("saved_draft_id", savedDraft);
        }
        String draftLandPage = recordConfig.getDraftLandPage();
        if (draftLandPage != null) {
            intent.putExtra("draft_land_page", draftLandPage);
        }
        intent.putExtra("move_sticker_to_first", recordConfig.getMoveTargetStickerToFirst());
        intent.putExtra("mec_type_sticker", recordConfig.getMecTypeSticker());
        RecordPresetResource recordPresetResource = recordConfig.getRecordPresetResource();
        if (recordPresetResource != null) {
            intent.putExtra("record_preset_resource", (Parcelable) recordPresetResource);
        }
        Map<String, String> extraParams = recordConfig.getExtraParams();
        if (extraParams != null) {
            intent.putExtra("extra_sticker_from", extraParams.get(Scene.SCENE_SERVICE));
            intent.putExtra("grade_key", extraParams.get("grade_key"));
        }
        String editEffectUID = recordConfig.getEditEffectUID();
        if (editEffectUID != null) {
            intent.putExtra("extra_edit_effect_uid", editEffectUID);
        }
        String donationId = recordConfig.getDonationId();
        if (donationId != null) {
            intent.putExtra("donation_id", donationId);
        }
        Boolean boolIsPlayerPause = recordConfig.isPlayerPause();
        if (boolIsPlayerPause != null) {
            intent.putExtra("pause_video_player_when_enter_shoot", boolIsPlayerPause.booleanValue());
        }
        String mdpEnterFrom = recordConfig.getMdpEnterFrom();
        if (mdpEnterFrom != null) {
            intent.putExtra("single_song_shoot_previous_page", mdpEnterFrom);
        }
        String mdpEnterMethod = recordConfig.getMdpEnterMethod();
        if (mdpEnterMethod != null) {
            intent.putExtra("single_song_shoot_previous_enter_method", mdpEnterMethod);
        }
        String previousSearchQuery = recordConfig.getPreviousSearchQuery();
        if (previousSearchQuery != null) {
            intent.putExtra("previous_search_query", previousSearchQuery);
        }
        String strIsSameMusicSupplyDetailPage = recordConfig.isSameMusicSupplyDetailPage();
        if (strIsSameMusicSupplyDetailPage != null) {
            intent.putExtra("is_same_music_supply_detail_page", strIsSameMusicSupplyDetailPage);
        }
        Boolean autoOpenAlbum = recordConfig.getAutoOpenAlbum();
        if (autoOpenAlbum != null) {
            intent.putExtra("auto_open_album", autoOpenAlbum.booleanValue());
        }
        Boolean showAIAliveBanner = recordConfig.getShowAIAliveBanner();
        if (showAIAliveBanner != null) {
            intent.putExtra("show_ai_alive_banner", showAIAliveBanner.booleanValue());
        }
        intent.putExtra("extra_is_jato_boost_running", recordConfig.isJatoBoostRunning());
        Integer defaultTab = recordConfig.getDefaultTab();
        if (defaultTab != null) {
            if (defaultTab.intValue() == 1) {
                intent.putExtra("extra_to_status", true);
            } else if (defaultTab.intValue() == 2) {
                intent.putExtra("to_live", true);
            } else if (defaultTab.intValue() == 3) {
                intent.putExtra("to_upload_album", true);
            } else if (defaultTab.intValue() == 4) {
                intent.putExtra("to_ai_self", true);
            }
        }
        Integer defaultSubTabForUploadPage = recordConfig.getDefaultSubTabForUploadPage();
        if (defaultSubTabForUploadPage != null) {
            if (defaultSubTabForUploadPage.intValue() == 0) {
                intent.putExtra("key_default_landing_tab", EnumC538250L9b.ALL.getType());
            } else if (defaultSubTabForUploadPage.intValue() == 1) {
                intent.putExtra("key_default_landing_tab", EnumC538250L9b.VIDEO.getType());
            } else if (defaultSubTabForUploadPage.intValue() == 2) {
                intent.putExtra("key_default_landing_tab", EnumC538250L9b.PHOTO.getType());
            }
        }
        intent.putExtra("Key_enable_multi_select", recordConfig.getUploadPageMultiSelect());
        LiveParams liveParams = recordConfig.getLiveParams();
        if (liveParams != null) {
            String sourceParams = liveParams.getSourceParams();
            if (sourceParams != null) {
                intent.putExtra("extra_live_source_params", sourceParams);
            }
            Boolean onlyShowLiveTab = liveParams.getOnlyShowLiveTab();
            if (onlyShowLiveTab != null) {
                intent.putExtra("extra_only_show_live_tab", onlyShowLiveTab.booleanValue());
            }
        }
        if (recordConfig.getShowStickerPanel()) {
            intent.putExtra("sticker_pannel_show", true);
        }
        HashMap<String, String> starAtlasConfig = recordConfig.getStarAtlasConfig();
        if (starAtlasConfig != null && (setEntrySet2 = starAtlasConfig.entrySet()) != null) {
            for (Map.Entry<String, String> entry : setEntrySet2) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
        }
        HashMap<String, String> missionConfig = recordConfig.getMissionConfig();
        if (missionConfig != null && (setEntrySet = missionConfig.entrySet()) != null) {
            for (Map.Entry<String, String> entry2 : setEntrySet) {
                intent.putExtra(entry2.getKey(), entry2.getValue());
            }
        }
        String commerceTrafficType = recordConfig.getCommerceTrafficType();
        if (commerceTrafficType != null) {
            intent.putExtra("commerce_traffic_type", commerceTrafficType);
        }
        EffectConfig effectConfig = recordConfig.getEffectConfig();
        if (effectConfig != null) {
            intent.putExtra("effect_meta_info", effectConfig.getEffectMetaInfo());
            intent.putExtra("effect_image", effectConfig.getEffectImage());
        }
        StitchParams stitchParams = recordConfig.getStitchParams();
        if (stitchParams != null) {
            intent.putExtra("stitch_params", (Parcelable) stitchParams);
        }
        Boolean fromSpecialPlus = recordConfig.getFromSpecialPlus();
        if (fromSpecialPlus != null) {
            intent.putExtra("from_special_plus", fromSpecialPlus.booleanValue());
        }
        Integer videoLength = recordConfig.getVideoLength();
        if (videoLength != null) {
            intent.putExtra("extra_video_length", videoLength.intValue());
        }
        Integer duetVideoDuration = recordConfig.getDuetVideoDuration();
        if (duetVideoDuration != null) {
            intent.putExtra("duet_video_duration", duetVideoDuration.intValue());
        }
        String duetEntranceType = recordConfig.getDuetEntranceType();
        if (duetEntranceType != null) {
            intent.putExtra("duet_entrance_type", duetEntranceType);
        }
        String duetPrevEntranceType = recordConfig.getDuetPrevEntranceType();
        if (duetPrevEntranceType != null) {
            intent.putExtra("duet_prev_entrance_type", duetPrevEntranceType);
        }
        String duetFromItemId = recordConfig.getDuetFromItemId();
        if (duetFromItemId != null) {
            intent.putExtra("duet_from_item_id", duetFromItemId);
        }
        Boolean boolIsDuetFromDuet = recordConfig.isDuetFromDuet();
        if (boolIsDuetFromDuet != null) {
            intent.putExtra("is_duet_from_duet", boolIsDuetFromDuet.booleanValue());
        }
        String sharedARSessionId = recordConfig.getSharedARSessionId();
        if (sharedARSessionId != null) {
            intent.putExtra("session", sharedARSessionId);
        }
        String sharedARHostId = recordConfig.getSharedARHostId();
        if (sharedARHostId != null) {
            intent.putExtra("host_uid", sharedARHostId);
        }
        Effect ttepPreviewEffect = recordConfig.getTtepPreviewEffect();
        if (ttepPreviewEffect != null) {
            intent.putExtra("extra_ttep_preview_effect", (Parcelable) ttepPreviewEffect);
        }
        String ttepPreviewEffectId = recordConfig.getTtepPreviewEffectId();
        if (ttepPreviewEffectId != null) {
            intent.putExtra("extra_ttep_preview_effect_id", ttepPreviewEffectId);
        }
        intent.putExtra("extra_ttep_enter_preview_page", recordConfig.getEnterTTEPPage());
        intent.putExtra("auto_selected_anchor", recordConfig.getAutoSelectedAnchor());
        List<AnchorTransData> autoSelectedAnchorList = recordConfig.getAutoSelectedAnchorList();
        if (autoSelectedAnchorList != null) {
            if (autoSelectedAnchorList instanceof Serializable) {
                serializable = (Serializable) autoSelectedAnchorList;
            }
            intent.putExtra("auto_selected_anchors", serializable);
        }
        intent.putExtra("open_platform_extra", recordConfig.getOpenPlatformExtra());
        intent.putExtra("open_platform_client_key", recordConfig.getOpenPlatformClientKey());
        HashMap<String, String> extraLogParams = recordConfig.getExtraLogParams();
        if (extraLogParams != null) {
            intent.putExtra("extra_log_params", extraLogParams);
        }
        String duetModeType = recordConfig.getDuetModeType();
        if (duetModeType != null) {
            intent.putExtra("duet_mode_type", duetModeType);
        }
        OPSDK$GreenScreenKitConfig greenScreenKitConfig = recordConfig.getGreenScreenKitConfig();
        if (greenScreenKitConfig != null) {
            intent.putExtra("green_screen_kit_config", greenScreenKitConfig);
        }
        RecordPresetResource greenScreenKitPresetResource = recordConfig.getGreenScreenKitPresetResource();
        if (greenScreenKitPresetResource != null) {
            intent.putExtra("green_screen_kit_preset_source", (Parcelable) greenScreenKitPresetResource);
        }
        intent.putExtra("extra_event_params", recordConfig.getExtraEventParams());
        ShareKitPanel shareKitPanel = recordConfig.getShareKitPanel();
        if (shareKitPanel != null) {
            intent.putExtra("share_kit_panel", (Parcelable) shareKitPanel);
        }
        BaseShareContext shareModel = recordConfig.getShareModel();
        if (shareModel != null) {
            intent.putExtra("share_model", shareModel);
        }
        CreativeInitialModel initialModel = recordConfig.getInitialModel();
        if (initialModel != null) {
            intent.putExtra("creative_initial_model", initialModel);
        }
        String postTrendsId = recordConfig.getPostTrendsId();
        if (postTrendsId != null) {
            intent.putExtra("post_trends_id", postTrendsId);
        }
        String postTrendsType = recordConfig.getPostTrendsType();
        if (postTrendsType != null) {
            intent.putExtra("post_trends_type", postTrendsType);
        }
        String recordParam = recordConfig.getRecordParam();
        if (recordParam != null) {
            intent.putExtra("record_param", recordParam);
        }
        intent.putExtra("ugc_template_tag", recordConfig.getUgcTemplateTag());
        intent.putExtra("need_mob_shoot", recordConfig.getNeedMobShoot());
        intent.putExtra("music_download_complete", recordConfig.getMusicDownloadComplete());
        intent.putExtra("extra_need_add_recent", recordConfig.getNeedAddRecentMusic());
        intent.putExtra("extra_allow_multiple_entrance", recordConfig.getAllowMultipleEntrance());
        String shootEnterFrom = recordConfig.getShootEnterFrom();
        if (shootEnterFrom != null) {
            intent.putExtra("shoot_enter_from", shootEnterFrom);
        }
        String enterFromH5Type = recordConfig.getEnterFromH5Type();
        if (enterFromH5Type != null) {
            intent.putExtra("enter_from_h5_type", enterFromH5Type);
        }
        LyricStickerStruct lyricStickerStruct = recordConfig.getLyricStickerStruct();
        if (lyricStickerStruct != null) {
            intent.putExtra("music_lyric_sticker_struct", lyricStickerStruct);
        }
        String poiDataJsonString = recordConfig.getPoiDataJsonString();
        if (poiDataJsonString != null) {
            intent.putExtra("poi_biz_info", poiDataJsonString);
        }
        String poiPostInfoJsonString = recordConfig.getPoiPostInfoJsonString();
        if (poiPostInfoJsonString != null) {
            intent.putExtra("poi_post_info", poiPostInfoJsonString);
        }
        String poiExtraDataJsonString = recordConfig.getPoiExtraDataJsonString();
        if (poiExtraDataJsonString != null) {
            intent.putExtra("poi_extra_data", poiExtraDataJsonString);
        }
        String poiShootWay = recordConfig.getPoiShootWay();
        if (poiShootWay != null) {
            intent.putExtra("poi_shoot_way", poiShootWay);
        }
        String poiEnterFrom = recordConfig.getPoiEnterFrom();
        if (poiEnterFrom != null) {
            intent.putExtra("poi_enter_from", poiEnterFrom);
        }
        String poiEnterMethod = recordConfig.getPoiEnterMethod();
        if (poiEnterMethod != null) {
            intent.putExtra("poi_enter_method", poiEnterMethod);
        }
        String lsFromEncouragingPosting = recordConfig.getLsFromEncouragingPosting();
        if (lsFromEncouragingPosting != null) {
            intent.putExtra("from_encouraging_posting", lsFromEncouragingPosting);
        }
        String lsAllianceInfo = recordConfig.getLsAllianceInfo();
        if (lsAllianceInfo != null) {
            intent.putExtra("ls_alliance_info", lsAllianceInfo);
        }
        String lsAllianceExtraJsonStr = recordConfig.getLsAllianceExtraJsonStr();
        if (lsAllianceExtraJsonStr != null) {
            intent.putExtra("ls_alliance_extra", lsAllianceExtraJsonStr);
        }
        TemplateData templateData = recordConfig.getTemplateData();
        if (templateData != null) {
            intent.putExtra("template_type", templateData.getTemplateType());
            intent.putExtra("key_template_data_tag", (Parcelable) templateData);
        }
        Boolean openGreenScreenMode = recordConfig.getOpenGreenScreenMode();
        if (openGreenScreenMode != null) {
            intent.putExtra("open_green_screen_mode", openGreenScreenMode.booleanValue());
        }
        String cameraLayoutType = recordConfig.getCameraLayoutType();
        if (cameraLayoutType != null) {
            intent.putExtra("layout_mode", cameraLayoutType);
        }
        Boolean startScanFaceAIProfile = recordConfig.getStartScanFaceAIProfile();
        if (startScanFaceAIProfile != null) {
            intent.putExtra("scan_face_entry_white_t_shirt", startScanFaceAIProfile.booleanValue());
        }
        Boolean hideCameraUIOnStartRecord = recordConfig.getHideCameraUIOnStartRecord();
        if (hideCameraUIOnStartRecord != null) {
            intent.putExtra("hide_camera_ui_on_start_record", hideCameraUIOnStartRecord.booleanValue());
        }
        Boolean forceDisableTranslucent = recordConfig.getForceDisableTranslucent();
        if (forceDisableTranslucent != null) {
            intent.putExtra("extra_saa_scene_force_disable_translucent", forceDisableTranslucent.booleanValue());
        }
        Boolean jumpDisableAnim = recordConfig.getJumpDisableAnim();
        if (jumpDisableAnim != null) {
            intent.putExtra("extra_saa_scene_jump_disable_anim", jumpDisableAnim.booleanValue());
        }
        String missionStr = recordConfig.getMissionStr();
        if (missionStr != null) {
            intent.putExtra("mission_data", missionStr);
        }
        String liveShootPage = recordConfig.getLiveShootPage();
        if (liveShootPage != null) {
            intent.putExtra("live_shoot_page", liveShootPage);
        }
        InitialFilterConfig initialFilterConfig = recordConfig.getInitialFilterConfig();
        if (initialFilterConfig != null) {
            intent.putExtra("initial_filter_config", (Parcelable) initialFilterConfig);
        }
        String anchorExtra = recordConfig.getAnchorExtra();
        if (anchorExtra != null) {
            intent.putExtra("anchor_extra", anchorExtra);
        }
        String searchExtra = recordConfig.getSearchExtra();
        if (searchExtra != null) {
            intent.putExtra("search_extra", searchExtra);
        }
        InspirationInfo inspirationInfo = recordConfig.getInspirationInfo();
        if (inspirationInfo != null) {
            intent.putExtra("add_yours_inspiration_info", (Parcelable) inspirationInfo);
        }
        intent.putExtra("is_favourite_prop", recordConfig.isFavouriteProp());
        intent.putExtra("is_favourite_music", recordConfig.isFavouriteMusic());
        AlbumOpenApiModel albumOpenApiModel = recordConfig.getAlbumOpenApiModel();
        if (albumOpenApiModel != null) {
            intent.putExtra("album_open_api_model", (Parcelable) albumOpenApiModel);
        }
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final Intent getRecordBasicIntent(RecordConfig recordConfig) {
        return LIZ(recordConfig);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void enterRecordPageInTemplate(Context context, RecordConfig recordConfig) {
        recordConfig.setFromSpecialPlus(Boolean.TRUE);
        recordConfig.setEnterFrom("super_entrance");
        Intent intentLIZ = LIZ(recordConfig);
        Effect effectLIZIZ = new C0CIR().LIZIZ();
        if (effectLIZIZ != null) {
            intentLIZ.putExtra("reuse_mvtheme_enter", true);
            intentLIZ.putExtra("extra_bind_mv_id", effectLIZIZ.getEffectId());
            intentLIZ.putExtra("extra_mv_effect", (Parcelable) effectLIZIZ);
        }
        C1452640nuA.LJI(null);
        this.LIZ.LJIIIZ();
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intentLIZ);
        C1642020spc.LIZ().setSpecialPlusClicked();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void gotoAlbumForAutoCutFromMDP(Activity activity, C575860MiG c575860MiG) {
        CreativeFlowData creativeFlowData;
        Bundle bundle = new Bundle();
        C533730KwV.LIZ.getClass();
        bundle.putInt("key_photo_select_max_count", C533730KwV.LJII());
        bundle.putInt("key_video_select_max_count", C533730KwV.LJII());
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_set_column_count", 3);
        C786410Ut5.LJJJI("enter_from", c575860MiG.getEnterFrom(), bundle);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_choose_scene", 53);
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        if (c575860MiG.getShootExtraData() != null && (creativeFlowData = shortVideoContext.creativeFlowData) != null) {
            creativeFlowData.setShootExtraData(c575860MiG.getShootExtraData());
        }
        String creationId = c575860MiG.getCreationId();
        if (creationId == null) {
            creationId = UUID.randomUUID().toString();
        }
        CreativeInfo creativeInfo = new CreativeInfo(creationId);
        shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
        shortVideoContext.creativeInfo = creativeInfo;
        shortVideoContext.LJ().setCreationId(creationId);
        shortVideoContext.shootWay = c575860MiG.getShootWay();
        shortVideoContext.enterFrom = c575860MiG.getEnterFrom();
        shortVideoContext.enterMethod = c575860MiG.getEnterMethod();
        shortVideoContext.creativeModel.socialModel.relationEnterMethod = c575860MiG.getRelationEnterMethod();
        MusicModel musicModel = c575860MiG.getMusicModel();
        if (musicModel != null) {
            MusicBeanUtilKt.updateAVMusic(shortVideoContext.creativeModel.musicBuzModel, o.LJI.transformMusicModel(musicModel));
        }
        shortVideoContext.LJJLIIIJILLIZJL(c575860MiG.getMusicOrigin());
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        String str = MvChoosePhotoActivity._pnsPageId;
        C0L0F.LIZLLL(activity, bundle, 1);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecord(Context context, RecordConfig recordConfig) {
        IExternalService iExternalService;
        ICreativePerformanceMonitorService iCreativePerformanceMonitorServicePerformanceMonitorService;
        String sourceParams;
        String sourceParams2;
        InterfaceC493540JXc interfaceC493540JXcF6;
        Intent intentLIZ = LIZ(recordConfig);
        LiveParams liveParams = recordConfig.getLiveParams();
        String strOptString = null;
        if (liveParams != null && (sourceParams = liveParams.getSourceParams()) != null) {
            try {
                if (new JSONObject(sourceParams).optInt("open_sub_only_setting") == 1) {
                    LiveParams liveParams2 = recordConfig.getLiveParams();
                    if (liveParams2 != null && (sourceParams2 = liveParams2.getSourceParams()) != null) {
                        try {
                            strOptString = new JSONObject(sourceParams2).optString("show_entrance");
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                        if (iLiveOuterService != null && (interfaceC493540JXcF6 = iLiveOuterService.f6()) != null) {
                            interfaceC493540JXcF6.LIZ(strOptString, new AwS158S0400000_31(recordConfig, this, context, intentLIZ, 5));
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (C300000BpO.LIZ() && !recordConfig.isJatoBoostRunning() && (iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) != null && (iCreativePerformanceMonitorServicePerformanceMonitorService = iExternalService.performanceMonitorService()) != null) {
            iCreativePerformanceMonitorServicePerformanceMonitorService.getJatoBoostAbilityForShootPage();
        }
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            LIZJ(context, intentLIZ, recordConfig.getKeepChallenges(), recordConfig.getReshootConfig());
        } else {
            LIZIZ(context, intentLIZ, recordConfig.getKeepChallenges());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startSpecialPlusEntrance(Context context, RecordConfig recordConfig) {
        recordConfig.setSticker(C1642020spc.LIZ().getEffectId());
        Boolean bool = Boolean.TRUE;
        recordConfig.setFromSpecialPlus(bool);
        recordConfig.setEnterFrom("super_entrance");
        recordConfig.setPresetSticker(bool);
        Intent intentLIZ = LIZ(recordConfig);
        Effect effectLIZIZ = new C0CIR().LIZIZ();
        if (effectLIZIZ != null) {
            recordConfig.setFirstSticker(effectLIZIZ);
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intentLIZ);
        C1642020spc.LIZ().setSpecialPlusClicked();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecord(Context context, Intent intent) {
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r5, com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig r6, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener r7) {
        /*
            java.lang.Integer r0 = r6.getType()
            if (r0 == 0) goto L41
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L41
        Ld:
            r4 = 0
            if (r1 == 0) goto L30
            com.ss.android.ugc.aweme.services.effect.EffectService$Companion r0 = com.ss.android.ugc.aweme.services.effect.EffectService.Companion
            com.ss.android.ugc.aweme.services.effect.EffectService r1 = r0.getInstance()
            if (r1 == 0) goto L2f
            java.lang.String r0 = r6.getRegion()
            X.0sex r3 = r1.createMvEffectPlatform(r5, r0)
        L20:
            if (r3 == 0) goto L2f
            java.lang.String r2 = r6.getStickerId()
            X.0Mqc r1 = new X.0Mqc
            r0 = 1
            r1.<init>(r6, r7, r0)
            r3.LIZIZ(r2, r4, r1)
        L2f:
            return
        L30:
            com.ss.android.ugc.aweme.services.effect.EffectService$Companion r0 = com.ss.android.ugc.aweme.services.effect.EffectService.Companion
            com.ss.android.ugc.aweme.services.effect.EffectService r1 = r0.getInstance()
            if (r1 == 0) goto L2f
            java.lang.String r0 = r6.getRegion()
            X.0sex r3 = r1.createEffectPlatform(r5, r0)
            goto L20
        L41:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20598115it.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener):void");
    }

    public final void LIZIZ(Context context, Intent intent, Boolean bool) {
        C1452640nuA.LJI(null);
        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
            this.LIZ.LJIIIZ();
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void preloadDuetLayout(final int i, final int i2, final Function1<? super Effect, Unit> function1) {
        if (i != 0 && i2 != 0) {
            if (C1383720m70.LIZ().skipPortraitLayoutPreload && (i * 1.0f) / i2 <= 1.0f) {
                function1.invoke(null);
                return;
            } else {
                final InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C1BWL.LIZ(), null);
                interfaceC1635410sexLIZ.LJI("duet-layout", false, new IFetchEffectChannelListener() { // from class: X.0L5u
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        function1.invoke(null);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r6) {
                        /*
                            r5 = this;
                            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r6 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r6
                            int r0 = r1
                            float r1 = (float) r0
                            r0 = 1065353216(0x3f800000, float:1.0)
                            float r1 = r1 * r0
                            int r0 = r2
                            float r0 = (float) r0
                            float r1 = r1 / r0
                            double r3 = (double) r1
                            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                            r4 = 0
                            if (r0 > 0) goto L53
                            if (r6 == 0) goto L91
                            java.util.List r0 = r6.getAllCategoryEffects()
                            if (r0 == 0) goto L91
                            java.util.Iterator r3 = r0.iterator()
                        L20:
                            boolean r0 = r3.hasNext()
                            if (r0 == 0) goto L51
                            java.lang.Object r2 = r3.next()
                            r0 = r2
                            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
                            com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean r0 = X.C542790LQn.LIZIZ(r0)
                            if (r0 == 0) goto L4f
                            java.lang.String r1 = r0.name
                        L35:
                            java.lang.String r0 = "horizontal"
                            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
                            if (r0 == 0) goto L20
                        L3d:
                            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
                        L3f:
                            if (r2 == 0) goto L91
                            X.0sex r0 = r4
                            boolean r0 = r0.LJIIIIZZ(r2)
                            if (r0 == 0) goto L83
                            kotlin.jvm.functions.Function1<com.ss.android.ugc.effectmanager.effect.model.Effect, kotlin.Unit> r0 = r3
                            r0.invoke(r2)
                            return
                        L4f:
                            r1 = r4
                            goto L35
                        L51:
                            r2 = r4
                            goto L3d
                        L53:
                            if (r6 == 0) goto L91
                            java.util.List r0 = r6.getAllCategoryEffects()
                            if (r0 == 0) goto L91
                            java.util.Iterator r3 = r0.iterator()
                        L5f:
                            boolean r0 = r3.hasNext()
                            if (r0 == 0) goto L81
                            java.lang.Object r2 = r3.next()
                            r0 = r2
                            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
                            com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean r0 = X.C542790LQn.LIZIZ(r0)
                            if (r0 == 0) goto L7f
                            java.lang.String r1 = r0.name
                        L74:
                            java.lang.String r0 = "vertical"
                            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
                            if (r0 == 0) goto L5f
                        L7c:
                            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
                            goto L3f
                        L7f:
                            r1 = r4
                            goto L74
                        L81:
                            r2 = r4
                            goto L7c
                        L83:
                            X.0sex r4 = r4
                            X.0Mqe r3 = new X.0Mqe
                            kotlin.jvm.functions.Function1<com.ss.android.ugc.effectmanager.effect.model.Effect, kotlin.Unit> r1 = r3
                            r0 = 2
                            r3.<init>(r1, r0)
                            r4.LJIIL(r2, r3)
                            return
                        L91:
                            kotlin.jvm.functions.Function1<com.ss.android.ugc.effectmanager.effect.model.Effect, kotlin.Unit> r0 = r3
                            r0.invoke(r4)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C537400L5u.onSuccess(java.lang.Object):void");
                    }
                });
                return;
            }
        }
        function1.invoke(null);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void preloadFilterResource(final String str, String str2, long j) {
        C0CHQ.LIZ().LJJIL().LIZIZ().LJ(j, str, str2).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLIIIJJIZ(j).LJJZ(new C09JN() { // from class: X.0sN2
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RecordServiceBaseImpl@d40c.preloadFilterResource$1");
                C1639650sln c1639650sln = (C1639650sln) obj;
                C201967140v c201967140v = C201967140v.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preloadFilterResource exceptId=");
                sbLIZ.append(str);
                sbLIZ.append(", downloadId=");
                sbLIZ.append(c1639650sln.LIZ);
                sbLIZ.append(", state=");
                sbLIZ.append(c1639650sln.LIZIZ);
                C201955140j.LIZLLL(c201967140v, "RecordServiceBaseImpl", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.preloadFilterResource$1");
            }
        }, new C09JN() { // from class: X.0sN0
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RecordServiceBaseImpl@d40c.preloadFilterResource$2");
                C201967140v c201967140v = C201967140v.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preloadFilterResource, error: ");
                sbLIZ.append(obj);
                C201955140j.LIZLLL(c201967140v, "RecordServiceBaseImpl", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.preloadFilterResource$2");
            }
        }, new InterfaceC781210Ukh() { // from class: X.0sN1
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C201967140v c201967140v = C201967140v.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preloadFilterResource exceptId=");
                sbLIZ.append(str);
                sbLIZ.append(", preload finish");
                C201955140j.LIZLLL(c201967140v, "RecordServiceBaseImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startAlbum(Activity activity, C575860MiG c575860MiG, boolean z) {
        C566430MJl c566430MJlLIZ;
        IToolsAlbumService iToolsAlbumService = (IToolsAlbumService) PluggableExtentionKt.pluggableSpi$default(IToolsAlbumService.class, false, false, false, 14, null);
        if (iToolsAlbumService != null && (c566430MJlLIZ = iToolsAlbumService.LIZ(c575860MiG)) != null) {
            c566430MJlLIZ.LJ = z;
            c566430MJlLIZ.LIZJ(activity, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecord(Context context, RecordConfig recordConfig, Challenge challenge) {
        String str;
        String str2;
        recordConfig.setPrepareFilter(false);
        AVChallenge aVChallengeCl = o.LJI.cl(challenge);
        if (recordConfig.getRecordPresetResource() != null) {
            if (aVChallengeCl != null) {
                str = aVChallengeCl.stickerId;
                str2 = aVChallengeCl.musicId;
            } else {
                str = null;
                str2 = null;
            }
            recordConfig.setRecordPresetResource(new RecordPresetResource(str, null, str2, null));
        }
        this.LIZ.LIZ(aVChallengeCl);
        C1452640nuA.LJI(null);
        Intent intentLIZ = LIZ(recordConfig);
        if (aVChallengeCl != null) {
            intentLIZ.putExtra("extra_open_record_challenge", (Serializable) aVChallengeCl);
            if (aVChallengeCl.musicId != null) {
                intentLIZ.putExtra("music_origin", "challenge");
            }
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intentLIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecord(Context context, RecordConfig recordConfig, Uri uri) {
        Intent intentLIZ = LIZ(recordConfig);
        if (uri.isHierarchical()) {
            for (String str : UriProtector.getQueryParameterNames(uri)) {
                intentLIZ.putExtra(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
            }
        }
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            LIZJ(context, intentLIZ, recordConfig.getKeepChallenges(), recordConfig.getReshootConfig());
        } else {
            LIZIZ(context, intentLIZ, recordConfig.getKeepChallenges());
        }
    }

    public final void LIZJ(Context context, Intent intent, Boolean bool, ReshootConfig reshootConfig) {
        boolean zLJI;
        C1452640nuA.LJI(null);
        if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
            this.LIZ.LJIIIZ();
        }
        Boolean backMain = reshootConfig.getBackMain();
        if (backMain != null) {
            zLJI = backMain.booleanValue();
        } else {
            zLJI = o.LJI();
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            VideoRecordEntranceServiceImpl instance = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
            boolean enableReshoot = reshootConfig.getEnableReshoot();
            Boolean reshootClear = reshootConfig.getReshootClear();
            if (reshootClear != null) {
                instance.startToolPermissionActivity(activityLIZ, intent, enableReshoot, reshootClear.booleanValue(), zLJI);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().notifyToolPermissionActivity(context, intent, reshootConfig.getEnableReshoot(), reshootConfig.getReshootClear().booleanValue(), zLJI);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startAlbum(Context context, RecordConfig recordConfig, EnumC1429610nJ1 enumC1429610nJ1, EditEffectAnchorManager editEffectAnchorManager) {
        Intent intentLIZ = LIZ(recordConfig);
        C524780Ki4.LIZ.start(SoundSyncOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
        ShortVideoContext shortVideoContextLIZJ = C1443540nfU.LIZJ(C1688680u2s.LIZIZ(intentLIZ), context, null);
        Bundle bundle = new Bundle();
        C537520L6g.LJFF(bundle, shortVideoContextLIZJ.creativeInfo);
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContextLIZJ);
        C786410Ut5.LJJIJIL(bundle, "clip_arg_data_process_items", new ArrayList());
        Music music = (Music) intentLIZ.getSerializableExtra("sticker_music");
        String strLIZJ = C1688680u2s.LIZJ(intentLIZ, "sticker_with_music_file_path");
        if (music != null) {
            AVMusic aVMusicTransformMusicModel = o.LJI.transformMusicModel(music.convertToMusicModel());
            aVMusicTransformMusicModel.setMusicPriority(2);
            C1452640nuA.LJI(aVMusicTransformMusicModel);
            C786410Ut5.LJJIZ(bundle, "aweme_music", aVMusicTransformMusicModel);
        }
        C786410Ut5.LJJJI("path", strLIZJ, bundle);
        bundle.putInt("key_photo_select_min_count", 1);
        if (enumC1429610nJ1 != EnumC1429610nJ1.EDIT_EFFECT_SERVER && enumC1429610nJ1 != EnumC1429610nJ1.EDIT_EFFECT_COMBINED) {
            if (enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_CLIENT) {
                bundle.putInt("key_video_select_max_count", 1);
                bundle.putInt("key_video_select_min_count", 1);
                bundle.putBoolean("Key_enable_multi_video", false);
                bundle.putInt("key_support_flag", 4);
                bundle.putInt("key_choose_scene", 34);
            } else {
                C533730KwV.LIZ.getClass();
                int iLJII = C533730KwV.LJII();
                bundle.putLong("Key_min_duration", C566050MHz.LIZIZ());
                bundle.putInt("key_choose_scene", 11);
                bundle.putInt("key_photo_select_max_count", iLJII);
                bundle.putInt("key_video_select_max_count", iLJII);
                bundle.putInt("key_video_select_min_count", 1);
                bundle.putBoolean("Key_enable_multi_video", true);
                bundle.putBoolean("key_need_authentication", editEffectAnchorManager.needAuthenticationCheck());
                bundle.putInt("key_support_flag", 6);
            }
        } else {
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putInt("key_support_flag", 1);
            bundle.putInt("key_choose_scene", 32);
            bundle.putBoolean("key_need_authentication", editEffectAnchorManager.needAuthenticationCheck());
        }
        intentLIZ.putExtras(bundle);
        intentLIZ.putExtra("key_choose_request_code", 1);
        intentLIZ.setClass(context, MvChoosePhotoActivity.class);
        C1444870nhd.LIZ(shortVideoContextLIZJ, editEffectAnchorManager, null, shortVideoContextLIZJ.shootWay, null, null);
        C1688680u2s.LIZ(context, intentLIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecord(Activity activity, RecordConfig recordConfig, MusicModel musicModel, boolean z) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Intent intentLIZ = LIZ(recordConfig);
        boolean z2 = true;
        if (Intrinsics.LJFF("direct_shoot", C1443030nef.LJII().LIZIZ) && 2 == C1443030nef.LJII().LJ) {
            if (musicModel == null) {
                z2 = false;
            }
            intentLIZ.putExtra("extra_clear_dialog_show_needed", z2);
        }
        if (musicModel != null && musicModel.getMusicWaveBean() != null) {
            intentLIZ.putExtra("music_wave_data", musicModel.getMusicWaveBean());
        }
        C1452640nuA.LJI(o.LJI.transformMusicModel(musicModel));
        intentLIZ.putExtra("music_model", musicModel);
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            ReshootConfig reshootConfig = recordConfig.getReshootConfig();
            VideoRecordEntranceServiceImpl instance = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
            boolean enableReshoot = reshootConfig.getEnableReshoot();
            Boolean reshootClear = reshootConfig.getReshootClear();
            if (reshootClear != null) {
                zBooleanValue = reshootClear.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Boolean backMain = reshootConfig.getBackMain();
            if (backMain != null) {
                zBooleanValue2 = backMain.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            instance.startToolPermissionActivity(activity, intentLIZ, enableReshoot, zBooleanValue, zBooleanValue2);
            return;
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(activity, intentLIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startStitch(Context context, Intent intent, StitchParams stitchParams, boolean z) {
        C0CNO.LIZLLL(0L, new C15OV(intent, this, context, stitchParams, z));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startAiSelfScanFace(String str, String str2, Context context, String str3, String str4) {
        C1797450wsJ c1797450wsJ = C1797450wsJ.LIZ;
        C19562311gD c19562311gD = new C19562311gD(str4, str, str3, str2, this, context);
        AFwS218S0000000_29 aFwS218S0000000_29 = AFwS218S0000000_29.get$arr$(417);
        c1797450wsJ.getClass();
        C1797450wsJ.LIZJ(context, c19562311gD, aFwS218S0000000_29, true);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startDuet(Context context, RecordConfig recordConfig, DuetConfig duetConfig, UIServiceCallback uIServiceCallback, String str, String str2) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C300060BpU.LIZ() && URLUtil.isNetworkUrl(duetConfig.getOriginVideo())) {
            z = true;
        } else {
            z = false;
        }
        C15Q6 c15q6 = new C15Q6(str, jCurrentTimeMillis, duetConfig, this, recordConfig, z, context, uIServiceCallback, str2);
        if (C1383720m70.LIZ().reuseAwemeSize && duetConfig.getWidth() > 0 && duetConfig.getHeight() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startDuet reuseAwemeSize hit: aweme=");
            sbLIZ.append(duetConfig.getWidth());
            sbLIZ.append('x');
            sbLIZ.append(duetConfig.getHeight());
            C201955140j.LIZIZ("VEVideoStream", C2188811AlT.LIZIZ(sbLIZ));
            if (!z && !C1383720m70.LIZ().reuseLocalPath) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C15Q7(duetConfig, c15q6, null), 3);
                return;
            }
            duetConfig.setMp4Path(duetConfig.getOriginVideo());
            duetConfig.setWavPath(duetConfig.getOriginVideo());
            c15q6.onSuccess(duetConfig.getWidth(), duetConfig.getHeight());
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C15Q8(z, duetConfig, c15q6, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startChangeBanMusic(Aweme aweme, Activity activity, long j, ChangeBanMusicConfig changeBanMusicConfig, UIServiceCallback uIServiceCallback, String str, String str2) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, str, true)) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C574020MfI(changeBanMusicConfig, this, activity, aweme, str, uIServiceCallback, str2, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startExteriorVideoRecordScene(Context context, ExteriorRecordModel exteriorRecordModel, AbstractBinderC539700LEq abstractBinderC539700LEq, String str, Bundle bundle, Bundle bundle2, String str2, String str3) {
        Intent intent = new Intent();
        intent.putExtra("shoot_way", str);
        intent.putExtra("shoot_enter_from", str3);
        intent.putExtra("enter_from", str2);
        C537520L6g.LJ(intent, C0DMI.LIZ(), 0, null);
        intent.putExtra("exterior_record_model", exteriorRecordModel);
        Activity activityLIZ = C0FNT.LIZ(context);
        if (activityLIZ != null) {
            KeyboardUtils.LIZIZ(activityLIZ.getCurrentFocus());
        }
        intent.putExtra(abstractBinderC539700LEq.LIZ(), new IBinderWrapper(abstractBinderC539700LEq));
        if (bundle != null) {
            intent.putExtra("extraParams", bundle);
        }
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        LIZIZ(context, intent, Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Type inference failed for: r22v2, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.internal.AwS1S2200100_8] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJ(X.AbstractC20598115it r21, com.ss.android.ugc.aweme.feed.model.Aweme r22, android.app.Activity r23, long r24, com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig r26, com.ss.android.ugc.aweme.services.external.UIServiceCallback r27, java.lang.String r28, java.lang.String r29, X.InterfaceC1364105Vn<? super kotlin.Unit> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20598115it.LJ(X.15it, com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity, long, com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig, com.ss.android.ugc.aweme.services.external.UIServiceCallback, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
