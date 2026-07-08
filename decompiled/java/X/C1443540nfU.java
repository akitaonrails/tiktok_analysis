package X;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeAfterCreationFeedbackMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeBannerMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeDefaultMusicModel;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModePostContentModel;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModePostMobParams;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationInfo;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationTag;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.stickers.MentionStickerParam;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.RecordContext;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.CompressConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.OptionalComponents;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordBottomTabConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.TabType;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.ss.android.ugc.aweme.shortvideo.model.ArticlePostModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import lth.o;

/* JADX INFO: renamed from: X.0nfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443540nfU {
    public static void LJIIL() {
        C01GW c01gw = C20021913Vp.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ShortVideoContext LIZIZ(Bundle bundle) {
        ArrayList arrayList;
        String description;
        C1443560nfW.LJ = C1443560nfW.LIZLLL;
        CreativeInfo creativeInfoLIZIZ = C537520L6g.LIZIZ(bundle);
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0, creativeInfoLIZIZ.getCreationId(), creativeInfoLIZIZ.getVersion()), C0MUK.LIZJ(bundle));
        shortVideoContext.creativeInfo = creativeInfoLIZIZ;
        OnThisDayData onThisDayData = C0MUK.LIZJ(bundle).onThisDayData;
        if (onThisDayData != null && onThisDayData.isFromOnThisDay() && C0CHL.LIZ()) {
            shortVideoContext.cameraComponentModel.mWorkspace = (Workspace) bundle.getParcelable("workspace");
        } else {
            shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(shortVideoContext.creativeInfo);
        }
        shortVideoContext.shootWay = bundle.getString("shoot_way");
        shortVideoContext.recordParam = bundle.getString("record_param");
        shortVideoContext.mShootFrom = bundle.getString("shoot_from");
        shortVideoContext.enterFrom = bundle.getString("enter_from");
        shortVideoContext.enterMethod = bundle.getString("enter_method");
        shortVideoContext.eventType = bundle.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE");
        shortVideoContext.sendToUserHead = (UrlModel) bundle.getSerializable("send_to_user_head");
        shortVideoContext.shareContext = (C1402840mbq) bundle.getSerializable("open_platform_share_context");
        shortVideoContext.clientId = bundle.getString("channel", "");
        shortVideoContext.draftId = 0;
        shortVideoContext.cameraComponentModel.mMusicStart = bundle.getInt("music_start_time", 0);
        C1443590nfZ c1443590nfZ = o.LJIIJJI;
        c1443590nfZ.LIZ();
        shortVideoContext.cameraComponentModel.mVideoWidth = c1443590nfZ.LIZ;
        C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
        c1443590nfZ2.LIZ();
        shortVideoContext.cameraComponentModel.mVideoHeight = c1443590nfZ2.LIZIZ;
        String string = bundle.getString("path");
        shortVideoContext.cameraComponentModel.mMusicPath = string;
        if (!TextUtils.isEmpty(string)) {
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            cameraComponentModel.mWorkspace.MC(cameraComponentModel.mMusicPath);
        }
        shortVideoContext.LJJLIIIJILLIZJL(bundle.getString("music_origin"));
        C1441190nbh c1441190nbh = new C1441190nbh();
        CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
        cameraComponentModel2.mDurings = c1441190nbh;
        cameraComponentModel2.mTotalRecordingTime = 0L;
        shortVideoContext.cameraComponentModel.mHardEncode = AVSettingsWrapper.enableHardEncodeForRecord() ? 1 : 0;
        shortVideoContext.cameraComponentModel.mUseBeautyFace = C1651150t4L.LIZ().LIZ();
        if (bundle.getParcelable("stitch_params") != null) {
            shortVideoContext.LJJII((StitchParams) bundle.getParcelable("stitch_params"));
        } else {
            shortVideoContext.LIZ();
        }
        AddYourRecordParam addYourRecordParam = (AddYourRecordParam) bundle.getParcelable("add_yours_sticker_record_param");
        if (addYourRecordParam != null) {
            C1466090oFr.LJIILL(shortVideoContext.creativeModel.stickerModel, addYourRecordParam);
        }
        MentionStickerParam mentionStickerParam = (MentionStickerParam) bundle.getParcelable("mention_sticker_param");
        if (mentionStickerParam != null) {
            C1466090oFr.LJIJ(shortVideoContext.creativeModel.stickerModel, mentionStickerParam);
        }
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo = (DMGroupChatStickerGroupInfo) bundle.getParcelable("dm_group_chat_sticker_group_info");
        if (dMGroupChatStickerGroupInfo != null) {
            C1466090oFr.LJIILLIIL(shortVideoContext.creativeModel.stickerModel, dMGroupChatStickerGroupInfo, shortVideoContext.enterMethod, shortVideoContext.enterFrom);
        }
        String string2 = bundle.getString("extra_live_event_sticker_data");
        if (!TextUtils.isEmpty(string2)) {
            C1466090oFr.LJIIZILJ(shortVideoContext.creativeModel.stickerModel, string2);
        }
        SecretRepliesRecordParam secretRepliesRecordParam = (SecretRepliesRecordParam) bundle.getParcelable("secret_replies_sticker_param");
        if (secretRepliesRecordParam != null) {
            C1466090oFr.LIZ(shortVideoContext.creativeModel.stickerModel, secretRepliesRecordParam);
        }
        if (bundle.containsKey("extra_landing_back")) {
            shortVideoContext.creativeModel.postLandingModel.landingBack = bundle.getBoolean("extra_landing_back");
            String string3 = bundle.getString("extra_back_url");
            if (!TextUtils.isEmpty(string3)) {
                shortVideoContext.creativeModel.postLandingModel.backUrl = string3;
            }
            shortVideoContext.creativeModel.postLandingModel.backByClearTop = bundle.getBoolean("extra_back_by_clear_top", false);
            if (bundle.getBoolean("is_landing_search_before", false)) {
                shortVideoContext.creativeModel.postLandingModel.backBundle.putBoolean("is_landing_search_before", true);
            }
        }
        MusicStickerStruct musicStickerStruct = (MusicStickerStruct) bundle.getSerializable("music_sticker_struct");
        if (musicStickerStruct != null) {
            StickerNewEngineModel stickerNewEngineModel = shortVideoContext.creativeModel.stickerModel;
            stickerNewEngineModel.musicStickerEnterMethod = "auto_add";
            MusicStickerStruct musicStickerStructCopy = musicStickerStruct.copy(musicStickerStruct.musicId, musicStickerStruct.artistName, musicStickerStruct.title, musicStickerStruct.cover, musicStickerStruct.isPGC(), musicStickerStruct.stickerStyle, "auto_add");
            List<MusicStickerModel> list = stickerNewEngineModel.musicStickerModels;
            list.clear();
            list.add(C1443600nfa.LIZ(musicStickerStructCopy));
        }
        FollowUpPublishTrackerModel followUpPublishTrackerModel = shortVideoContext.creativeModel.followUpPublishTrackerModel;
        followUpPublishTrackerModel.followUpFirstItemId = C1443560nfW.LJI;
        followUpPublishTrackerModel.followUpItemIdGroups = C1443560nfW.LJII;
        followUpPublishTrackerModel.enterRecordFromFeed = bundle.getBoolean("enter_record_from_feed", false);
        shortVideoContext.creativeModel.socialModel.relationEnterMethod = bundle.getString("relation_enter_method");
        if (bundle.getBoolean("change_avatar", false)) {
            ChangeAvatarModel changeAvatarModel = shortVideoContext.creativeModel.changeAvatarModel;
            changeAvatarModel.isFromChangeAvatar = true;
            changeAvatarModel.publishEnterMethod = bundle.getString("enter_method", "");
            shortVideoContext.creativeModel.changeAvatarModel.isFromAiVatar = bundle.getBoolean("is_aivatar", false);
            shortVideoContext.creativeModel.changeAvatarModel.isFromSocialAvatar = bundle.getBoolean("is_social_avatar", false);
            shortVideoContext.creativeModel.changeAvatarModel.aiVatarMode = bundle.getString("path_mode", "");
            shortVideoContext.creativeModel.changeAvatarModel.aiVatarMode = bundle.getString("path_mode", "");
            String string4 = bundle.getString("origin_avatar_uri", "");
            String string5 = bundle.getString("origin_no_crop_avatar_path", "");
            String string6 = bundle.getString("cover_avatar_path", "");
            String string7 = bundle.getString("realEnterMethod", "");
            ChangeAvatarModel changeAvatarModel2 = shortVideoContext.creativeModel.changeAvatarModel;
            changeAvatarModel2.originPath = string5;
            changeAvatarModel2.avatarStruct.setOriginAvatarUri(string4);
            ChangeAvatarModel changeAvatarModel3 = shortVideoContext.creativeModel.changeAvatarModel;
            changeAvatarModel3.coverPath = string6;
            changeAvatarModel3.realEnterMethod = string7;
            changeAvatarModel3.skipDecorativeInfoStickers = bundle.getBoolean("skip_decorative_info_stickers", false);
            int i = bundle.getInt("background_selection", 0);
            int i2 = bundle.getInt("expression_selection", 0);
            long j = bundle.getLong("avatar_id", 0L);
            String string8 = bundle.getString("dynamic_social_avatar", "");
            String string9 = bundle.getString("static_social_avatar_gif", "");
            String string10 = bundle.getString("static_social_avatar", "");
            String string11 = bundle.getString("compiled_social_avatar", "");
            int i3 = bundle.getInt("social_avatar_text_color", 0);
            String string12 = bundle.getString("social_avatar_enter_method", "");
            String string13 = bundle.getString("social_avatar_enter_from", "");
            boolean z = bundle.getBoolean("social_avatar_is_first_avatar", false);
            boolean z2 = bundle.getBoolean("social_avatar_is_using_user_bucket", false);
            long j2 = bundle.getLong("social_avatar_download_time_in_ms", -1L);
            int i4 = bundle.getInt("social_avatar_count", 0);
            boolean z3 = bundle.getBoolean("social_avatar_need_update", true);
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setStyleSelection(Integer.valueOf(i));
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setExpressionSelection(Integer.valueOf(i2));
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setDynamicAvatarUri(string8);
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setDynamicAvatarGifUri(string9);
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setStaticAvatarUri(string10);
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setCompiledAvatarUri(string11);
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setAvatarId(Long.valueOf(j));
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setAvatarColor(Integer.valueOf(i3));
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setEnterMethod(string12);
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setEnterFrom(string13);
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setFirstAvatar(Boolean.valueOf(z));
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setDownloadTimeInMs(Long.valueOf(j2));
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setUsingUserBucket(Boolean.valueOf(z2));
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setAvatarCount(Integer.valueOf(i4));
            shortVideoContext.creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct.setNeedUpdate(Boolean.valueOf(z3));
        }
        if (bundle.getSerializable("on_this_day_day") != null) {
            OnThisDayData onThisDayData2 = (OnThisDayData) bundle.getSerializable("on_this_day_day");
            shortVideoContext.creativeModel.onThisDayData.setCreateTime(onThisDayData2.getCreateTime());
            shortVideoContext.creativeModel.onThisDayData.setFromOnThisDay(onThisDayData2.isFromOnThisDay());
            shortVideoContext.creativeModel.onThisDayData.setPastMemoryKey(onThisDayData2.getPastMemoryKey());
            shortVideoContext.creativeModel.onThisDayData.setForwardType(onThisDayData2.getForwardType());
            shortVideoContext.creativeModel.onThisDayData.setVersion(onThisDayData2.getVersion());
            OnThisDayData onThisDayData3 = shortVideoContext.creativeModel.onThisDayData;
            onThisDayData3.setLeftWay(onThisDayData2.getLeftWay());
            onThisDayData3.setPostCnt(onThisDayData2.getPostCnt());
            onThisDayData3.setStoryCnt(onThisDayData2.getStoryCnt());
            onThisDayData3.setTextStyle(onThisDayData2.getTextStyle());
            onThisDayData3.setPostDataList(onThisDayData2.getPostDataList());
            onThisDayData3.setClickNextButtonTime(onThisDayData2.getClickNextButtonTime());
            if (shortVideoContext.creativeModel.onThisDayData.isFromOnThisDay() && "on_this_day_slider_edit".equals(shortVideoContext.creativeModel.onThisDayData.getLeftWay())) {
                shortVideoContext.isPrivate = bundle.getInt("is_private", shortVideoContext.LJIILLIIL());
                shortVideoContext.creativeModel.privacySettingModel.allowComment = bundle.getInt("comment_setting", 0);
            }
        }
        InitialFilterConfig initialFilterConfig = (InitialFilterConfig) bundle.getParcelable("initial_filter_config");
        if (initialFilterConfig != null) {
            shortVideoContext.creativeModel.initialModel.filterConfig = initialFilterConfig;
        }
        if (shortVideoContext.LJJJJ()) {
            AVMusic aVMusic = new AVMusic();
            aVMusic.setMusicId(bundle.getString("music_id"));
            shortVideoContext.creativeModel.musicBuzModel.music = MusicBeanUtilKt.extractMusicObject(aVMusic);
        }
        shortVideoContext.creativeModel.enterFromH5Type = bundle.getString("enter_from_h5_type", "");
        shortVideoContext.creativeModel.followUpPublishTrackerModel.followUpPromoId = C1443560nfW.LJIIJJI;
        LIZ(bundle, shortVideoContext);
        LJIIIIZZ(bundle, shortVideoContext);
        RssArticle rssArticle = (RssArticle) bundle.getParcelable("extra_rss_article");
        if (rssArticle != null) {
            shortVideoContext.creativeModel.initialModel.defaultPostContentModel = new DefaultPostContentModel(rssArticle.title, rssArticle.description, new ArrayList(Arrays.asList(bundle.getParcelable("article_anchor"))));
            shortVideoContext.creativeModel.initialModel.articlePostModel = new ArticlePostModel(rssArticle.rssGuid, rssArticle.rssUrl);
        }
        String string14 = bundle.getString("photomode_title");
        String string15 = bundle.getString("photomode_desc");
        int i5 = bundle.getInt("photomode_cover");
        String[] stringArray = bundle.getStringArray("photomode_hashtags");
        Parcelable parcelable = bundle.getParcelable("photomode_anchors");
        PhotoModeDefaultMusicModel photoModeDefaultMusicModel = (PhotoModeDefaultMusicModel) bundle.getParcelable("photomode_default_music");
        ArrayList arrayList2 = null;
        if (stringArray != null) {
            arrayList = new ArrayList(Arrays.asList(stringArray));
        } else {
            arrayList = null;
        }
        if (parcelable != null) {
            arrayList2 = new ArrayList(Arrays.asList(parcelable));
        }
        if (!TextUtils.isEmpty(string14) || !TextUtils.isEmpty(string15) || i5 > 0 || arrayList != null || arrayList2 != null || photoModeDefaultMusicModel != null) {
            shortVideoContext.creativeModel.initialModel.photoModePostContentModel = new PhotoModePostContentModel(string14, string15, Integer.valueOf(i5), arrayList, arrayList2, photoModeDefaultMusicModel);
        }
        String string16 = bundle.getString("open_platform_share_id");
        if (!TextUtils.isEmpty(string16)) {
            shortVideoContext.openPlatformShareId = string16;
        }
        String string17 = bundle.getString("open_platform_key");
        if (!TextUtils.isEmpty(string17)) {
            shortVideoContext.openPlatformClientKey = string17;
        }
        String string18 = bundle.getString("h5_entrance");
        String string19 = bundle.getString("photomode_trend_id");
        PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams = (PhotoModeAfterCreationFeedbackMobParams) bundle.getParcelable("photo_mode_after_creation_feedback_mob_params");
        if (photoModeAfterCreationFeedbackMobParams != null) {
            shortVideoContext.creativeModel.initialModel.photoModeAfterFeedbackMobParams = photoModeAfterCreationFeedbackMobParams;
        }
        if (string18 != null || string19 != null) {
            shortVideoContext.creativeModel.initialModel.photoModePostMobParams = new PhotoModePostMobParams(string18, string19);
        }
        if (d4.LJIJI(shortVideoContext)) {
            shortVideoContext.creativeModel.initialModel.photoModeBannerMobParams = new PhotoModeBannerMobParams(bundle.getString("category_name"), bundle.getString("ay_topic_id"), bundle.getString("camera_session_id"), bundle.getString("enter_from"), bundle.getString("shoot_enter_from"), Integer.valueOf(bundle.getInt("topic_type")), bundle.getString("debuginfo"), bundle.getString("search_topic_id"));
            InspirationInfo inspirationInfo = (InspirationInfo) bundle.getParcelable("add_yours_inspiration_info");
            if (inspirationInfo != null) {
                if (inspirationInfo.getDescription() != null && !inspirationInfo.getDescription().isEmpty()) {
                    shortVideoContext.creativeModel.imagePublishBackSaveModel.topicDefaultCopy = inspirationInfo.getDescription();
                }
                if (inspirationInfo.getInspirationTag() != null) {
                    for (InspirationTag inspirationTag : inspirationInfo.getInspirationTag()) {
                        shortVideoContext.creativeModel.imagePublishBackSaveModel.topicInspirations.add(inspirationTag.getTitle());
                        if (inspirationTag.getDescription() == null) {
                            description = "";
                        } else {
                            description = inspirationTag.getDescription();
                        }
                        shortVideoContext.creativeModel.imagePublishBackSaveModel.topicInspirationDescriptions.add(description);
                    }
                }
            }
        }
        LJIIJ(bundle, shortVideoContext);
        try {
            if ("educate_phase_iii".equals(shortVideoContext.shootWay) && shortVideoContext.creativeFlowData.getExtraLogParams() == null) {
                shortVideoContext.creativeFlowData.setExtraLogParams((HashMap) bundle.getSerializable("extra_log_params"));
            }
            shortVideoContext.creativeModel.commonMobModel.searchExtra = bundle.getString("search_extra");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "initCSIFromBundle");
        }
        C0MIX c0mix = C0MIX.LIZ;
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        c0mix.getClass();
        C0MIX.LIZ(bundle, creativeModel, shortVideoContext);
        C577580Ml2.LIZ.LJFF(shortVideoContext.creativeModel.shootLinkPerfMobModel, bundle);
        return shortVideoContext;
    }

    public static ShortVideoContext LJ(Bundle bundle) {
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            CreativeInfo creativeInfoLIZIZ = C537520L6g.LIZIZ(bundle);
            ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0, creativeInfoLIZIZ.getCreationId(), creativeInfoLIZIZ.getVersion()));
            shortVideoContext.creativeModel = C0MUK.LIZJ(bundle);
            shortVideoContext.avetParameter = AVETParameterKt.generateAVETParam(bundle);
            shortVideoContext.creativeInfo = creativeInfoLIZIZ;
            shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfoLIZIZ);
            shortVideoContext.shootWay = bundle.getString("shoot_way");
            shortVideoContext.recordParam = bundle.getString("record_param");
            shortVideoContext.mShootFrom = bundle.getString("shoot_from");
            shortVideoContext.enterFrom = bundle.getString("enter_from");
            bundle.getBoolean("move_sticker_to_first", false);
            shortVideoContext.creativeModel.mecReportModel.getClass();
            shortVideoContext.recordParam = bundle.getString("record_param");
            shortVideoContext.draftId = 0;
            shortVideoContext.shootMode = bundle.getInt("shoot_mode", 0);
            String string = bundle.getString("path");
            shortVideoContext.cameraComponentModel.mMusicPath = string;
            if (!TextUtils.isEmpty(string)) {
                CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
                cameraComponentModel.mWorkspace.MC(cameraComponentModel.mMusicPath);
            }
            shortVideoContext.LIZ();
            if (bundle.getBoolean("extra_read_duration_mode", true)) {
                new C1443670nfh();
                shortVideoContext.cameraComponentModel.mCurrentDurationMode = C1443670nfh.LIZ();
            }
            if (shortVideoContext.shootMode != 12) {
                shortVideoContext.cameraComponentModel.isMuted = shortVideoContext.LJJLL();
            }
            C1443960ngA.LJFF(shortVideoContext);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("maxduration is ");
            sbLIZ.append(shortVideoContext.cameraComponentModel.mMaxDuration);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            int i = bundle.getInt("music_start", 0);
            CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
            cameraComponentModel2.mMusicStart = i;
            shortVideoContext.LJJLIIIJ((int) cameraComponentModel2.mMaxDuration);
            C1443590nfZ c1443590nfZ = o.LJIIJJI;
            c1443590nfZ.LIZ();
            shortVideoContext.cameraComponentModel.mVideoWidth = c1443590nfZ.LIZ;
            C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
            c1443590nfZ2.LIZ();
            shortVideoContext.cameraComponentModel.mVideoHeight = c1443590nfZ2.LIZIZ;
            C1441190nbh c1441190nbh = new C1441190nbh();
            CameraComponentModel cameraComponentModel3 = shortVideoContext.cameraComponentModel;
            cameraComponentModel3.mDurings = c1441190nbh;
            cameraComponentModel3.mTotalRecordingTime = 0L;
            boolean zEnableHardEncodeForRecord = AVSettingsWrapper.enableHardEncodeForRecord();
            shortVideoContext.cameraComponentModel.mHardEncode = zEnableHardEncodeForRecord ? 1 : 0;
            shortVideoContext.cameraComponentModel.mUseBeautyFace = C1651150t4L.LIZ().LIZ();
            shortVideoContext.filterBusinessSticker = bundle.getString("filter_business_sticker");
            shortVideoContext.putPresetStickerAtFirst = bundle.getBoolean("use_preset_sticker_at_first", shortVideoContext.putPresetStickerAtFirst);
            if (TextUtils.isEmpty(shortVideoContext.presetEffectId)) {
                shortVideoContext.presetEffectId = bundle.getString("sticker_id");
            }
            if (bundle.containsKey("extra_mention_uid") && bundle.containsKey("extra_mention_user_name")) {
                shortVideoContext.mentionUserModel = ExtraMentionUserModel.Companion.newInstance(bundle.getString("extra_mention_uid"), bundle.getString("extra_mention_user_name"));
            }
            shortVideoContext.creativeModel.mecReportModel.LIZ = C1636550sgn.LJ(shortVideoContext.enterFrom, shortVideoContext.shootWay);
            shortVideoContext.isFromNormalRecord = true;
            shortVideoContext.effectMetaInfo = bundle.getString("effect_meta_info");
            shortVideoContext.effectImage = bundle.getString("effect_image");
            C569390MUv.LIZ(bundle, new C1443750nfp(shortVideoContext));
            if (bundle.getParcelable("mission") != null) {
                shortVideoContext.creativeModel.commerceModel.setMission((Mission) bundle.getParcelable("mission"));
            }
            LJIIJ(bundle, shortVideoContext);
            return shortVideoContext;
        }
        return LJFF(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x0a99  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.ShortVideoContext LJFF(android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 3549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1443540nfU.LJFF(android.os.Bundle):com.ss.android.ugc.aweme.shortvideo.ShortVideoContext");
    }

    public static void LJIIJJI(ShortVideoContext shortVideoContext) {
        int iMax;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null && C579130MnX.LIZ() && aVMusicExtractAVMusic.isNeedReuse()) {
            MusicBuzModel musicBuzModel = shortVideoContext.creativeModel.musicBuzModel;
            if (musicBuzModel.isTrimmingLimited) {
                MusicObject musicObject = musicBuzModel.music;
                int i = (int) (musicObject.previewStartTime * 1000.0f);
                int i2 = musicObject.duration + i;
                int musicBeginTime = aVMusicExtractAVMusic.getMusicBeginTime();
                int musicEndTime = aVMusicExtractAVMusic.getMusicEndTime();
                int i3 = shortVideoContext.creativeModel.musicBuzModel.music.duration;
                int iMin = Math.min(aVMusicExtractAVMusic.getTrimmedMusicDuration(), i3);
                int i4 = 0;
                if (musicBeginTime < i || musicBeginTime > i2 || musicEndTime > i2) {
                    iMax = Math.min(aVMusicExtractAVMusic.getTrimmedMusicDuration(), i3);
                } else {
                    int iMax2 = Math.max(musicBeginTime - i, 0);
                    iMax = Math.max(musicEndTime - i, 0);
                    i4 = iMax2;
                }
                CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
                cameraComponentModel.mMusicStart = i4;
                cameraComponentModel.musicEndTime = iMax;
                aVMusicExtractAVMusic.setMusicStartFromCut(i4);
                aVMusicExtractAVMusic.setMusicStart(i4);
                aVMusicExtractAVMusic.setMusicEndFromCut(iMax);
                MusicBuzModel musicBuzModel2 = shortVideoContext.creativeModel.musicBuzModel;
                musicBuzModel2.musicStart = i4;
                musicBuzModel2.musicStartFromCut = i4;
                musicBuzModel2.musicEndFromCut = iMax;
                shortVideoContext.LJJLIIIJJI(iMin);
                return;
            }
            shortVideoContext.cameraComponentModel.mMusicStart = aVMusicExtractAVMusic.getMusicBeginTime();
            shortVideoContext.cameraComponentModel.musicEndTime = aVMusicExtractAVMusic.getMusicEndTime();
            shortVideoContext.LJJLIIIJJI(aVMusicExtractAVMusic.getTrimmedMusicDuration());
        }
    }

    public static boolean LJIIZILJ(Bundle bundle) {
        String string = "default";
        if (bundle != null) {
            string = bundle.getString("shoot_way", "default");
        }
        if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJI() || !"direct_shoot".equals(string)) {
            if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ() && !"direct_shoot".equals(string)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void LIZ(Bundle bundle, ShortVideoContext shortVideoContext) {
        boolean z = false;
        shortVideoContext.creativeModel.commonMobModel.isUploadDirectEnter = bundle.getBoolean("is_upload_direct_enter", false);
        StoryShootModel storyShootModel = shortVideoContext.creativeModel.storyModel;
        storyShootModel.setShootEnterPosition(bundle.getString("story_shoot_enter_position", null));
        storyShootModel.setFromGroupId(bundle.getString("shoot_from_group_id", null));
        storyShootModel.setPipelineEnterFrom(bundle.getString("story_creative_enter_from_passthrough", null));
        storyShootModel.setStoryEntrance(bundle.getBoolean("is_story_entrance", false));
        storyShootModel.setSocialCameraEntrance(bundle.getBoolean("is_social_camera", false));
        storyShootModel.setEnableSwipeUpExitGesture(bundle.getBoolean("enable_story_swipe_up_exit_gesture", false));
        storyShootModel.setSharedElementTransitionMode(bundle.getInt("enable_story_shared_element_transition_mode", 0));
        storyShootModel.setRoundedMaskInitialTranslationY(bundle.getFloat("story_shared_element_rounded_mask_initial_translation_y", 0.0f));
        storyShootModel.setFromPermissionRequestingActivity(bundle.getBoolean("extra_from_permission_requesting", false));
        storyShootModel.setStoryArchiveTabName(bundle.getString("story_archive_tab_name", null));
        String string = bundle.getString("upload_page_entrance_type", "");
        if (!string.isEmpty()) {
            storyShootModel.setShootFromSocialAlbum(true);
            StoryUploadPageEntranceType.Companion.getClass();
            StoryUploadPageEntranceType storyUploadPageEntranceType = StoryUploadPageEntranceType.map.get(string);
            if (storyUploadPageEntranceType != null) {
                storyShootModel.setUploadPageEntranceType(storyUploadPageEntranceType);
                int i = C1443730nfn.LIZ[storyUploadPageEntranceType.ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        shortVideoContext.shootMode = 30;
                    }
                } else {
                    shortVideoContext.shootMode = 29;
                }
            }
        }
        if (bundle.getInt("after_publish_landing_mode", 0) == EnumC563750M9d.RETURN_TO_SOURCE.ordinal()) {
            z = true;
        }
        storyShootModel.setLandToOriginPageAfterPublish(z);
    }

    public static ShortVideoContext LIZLLL(Context context, Bundle bundle) {
        CameraLayoutModel cameraLayoutModel;
        boolean z;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) bundle.getSerializable("video_edit_model");
        videoPublishEditModel.creativeModel = C0MUK.LIZJ(bundle);
        videoPublishEditModel.refreshOldFieldIfNeeded();
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(1, videoPublishEditModel.getCreativeInfo().getCreationId(), videoPublishEditModel.getCreativeInfo().getVersion()));
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        shortVideoContext.creativeModel = creativeModel;
        shortVideoContext.duetVideoDuration = creativeModel.duetModel.duetVideoDuration;
        String musicPath = null;
        creativeModel.editModel.multiEditVideoStatusRecordData = null;
        creativeModel.infoStickerModel = null;
        C1432530nNj.LIZ(videoPublishEditModel);
        Iterator it2 = ((ArrayList) C855640XhS.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC855650XhT) it2.next()).LIZLLL();
        }
        int i = bundle.getInt("retake_shoot_mode", -1);
        shortVideoContext.avetParameter = AVETParameterKt.generateAVETParam(bundle);
        shortVideoContext.shootWay = bundle.getString("shoot_way");
        shortVideoContext.recordParam = bundle.getString("record_param");
        shortVideoContext.mShootFrom = bundle.getString("shoot_from");
        shortVideoContext.creativeInfo = videoPublishEditModel.getCreativeInfo();
        shortVideoContext.creativeModel.musicBuzModel.reuseOriginalSoundId = bundle.getString("reuse_original_sound_id");
        shortVideoContext.creativeModel.musicBuzModel.reuseOriginalSoundUrls = (UrlModel) bundle.getSerializable("reuse_original_sound_url");
        shortVideoContext.creativeModel.musicBuzModel.reuseOriginalSoundLength = bundle.getInt("reuse_original_sound_length", 0);
        if (!TextUtils.isEmpty(shortVideoContext.LJIJ())) {
            shortVideoContext.creativeModel.musicBuzModel.isReuseOriginalSound = true;
        }
        Workspace workspace = (Workspace) bundle.getParcelable("workspace");
        if (workspace != null) {
            shortVideoContext.cameraComponentModel.mWorkspace = workspace;
        } else {
            shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(shortVideoContext.creativeInfo);
        }
        C1445850njD.LIZ(shortVideoContext.cameraComponentModel.mWorkspace, videoPublishEditModel);
        shortVideoContext.draftToEditFrom = bundle.getInt("draft_to_edit_from", 0);
        if (InterfaceC1443810nfv.LIZ.contains(videoPublishEditModel.getMusicOrigin()) && i != 1) {
            C1452640nuA.LJII(null, false, shortVideoContext.creativeModel.musicBuzModel);
            shortVideoContext.cameraComponentModel.mWorkspace.wQ();
            videoPublishEditModel.setMusicOrigin(null);
        } else if (shortVideoContext.LJJJJZI() && shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath() != null && C2486109oh.LIZLLL(context, shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath())) {
            shortVideoContext.cameraComponentModel.mMusicPath = shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath();
        }
        if (bundle.containsKey("extra_bind_mv_id")) {
            shortVideoContext.mBindMovieId = bundle.getString("extra_bind_mv_id");
        }
        int[] recordVideoSize = videoPublishEditModel.getRecordVideoSize();
        if (i == 1 || recordVideoSize.length < 2) {
            shortVideoContext.cameraComponentModel.mVideoWidth = C0CHQ.LIZ().LJJJJLI().getVideoWidth();
            shortVideoContext.cameraComponentModel.mVideoHeight = C0CHQ.LIZ().LJJJJLI().getVideoHeight();
        } else {
            int videoWidth = recordVideoSize[0];
            if (videoWidth == 0) {
                videoWidth = C0CHQ.LIZ().LJJJJLI().getVideoWidth();
            }
            shortVideoContext.cameraComponentModel.mVideoWidth = videoWidth;
            int videoHeight = recordVideoSize[1];
            if (videoHeight == 0) {
                videoHeight = C0CHQ.LIZ().LJJJJLI().getVideoHeight();
            }
            shortVideoContext.cameraComponentModel.mVideoHeight = videoHeight;
        }
        shortVideoContext.shootMode = videoPublishEditModel.getShootMode();
        shortVideoContext.shootedShootMode = videoPublishEditModel.getShootedShootMode();
        if (videoPublishEditModel.getCreativeFlowData() != null) {
            CreativeFlowData creativeFlowData = videoPublishEditModel.getCreativeFlowData();
            shortVideoContext.creativeFlowData = creativeFlowData;
            creativeFlowData.setEditorProModel(null);
            shortVideoContext.creativeFlowData.getNleEditModel().resetModel();
        }
        shortVideoContext.cameraComponentModel.mCurrentDurationMode = videoPublishEditModel.getDurationMode();
        shortVideoContext.cameraComponentModel.isMuted = videoPublishEditModel.isMuted();
        shortVideoContext.draftId = videoPublishEditModel.getDraftId();
        shortVideoContext.newDraftId = videoPublishEditModel.getNewDraftId();
        shortVideoContext.LJ().setDraftId(videoPublishEditModel.getDraftId());
        shortVideoContext.LJ().setNewDraftId(videoPublishEditModel.getNewDraftId());
        shortVideoContext.LJ().setCreationId(videoPublishEditModel.getCreationId());
        DuetExtraInfo duetExtraInfo = (DuetExtraInfo) bundle.getParcelable(DuetExtraInfo.class.getName());
        if (duetExtraInfo != null) {
            DuetContext duetContext = shortVideoContext.cameraComponentModel.duetContext;
            duetContext.duetVideoPath = duetExtraInfo.getDuetVideoPath();
            duetContext.duetAudioPath = duetExtraInfo.getDuetAudioPath();
            duetContext.duetVideoWidth = duetExtraInfo.getDuetVideoWidth();
            duetContext.duetVideoHeight = duetExtraInfo.getDuetVideoHeight();
            duetContext.duetLayoutMode = duetExtraInfo.getDuetLayoutMode();
            duetContext.layoutDirection = duetExtraInfo.getDuetLayoutDirection();
            duetContext.duetFromAwemeId = bundle.getString("duet_from");
            duetContext.duetLayout = bundle.getString("extra_duet_layout");
            C1443590nfZ c1443590nfZ = o.LJIIJJI;
            c1443590nfZ.LIZ();
            shortVideoContext.cameraComponentModel.mVideoWidth = c1443590nfZ.LIZ;
            C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
            c1443590nfZ2.LIZ();
            shortVideoContext.cameraComponentModel.mVideoHeight = c1443590nfZ2.LIZIZ;
        }
        shortVideoContext.cameraComponentModel.recordContext = new RecordContext(StrArray.from(videoPublishEditModel.getRecordFilterLabels()), StrArray.from(videoPublishEditModel.getRecordFilterIds()), StrArray.from(videoPublishEditModel.getRecordFilterValues()), new StrArray(), new StrArray(), new StrArray(), null, 960);
        if (bundle.containsKey("stitch_params")) {
            shortVideoContext.LJJII((StitchParams) bundle.getParcelable("stitch_params"));
        } else {
            shortVideoContext.LIZ();
        }
        LJIIIIZZ(bundle, shortVideoContext);
        RecordScene recordScene = C1443030nef.LJII().LJIIIIZZ;
        if (recordScene == null || recordScene.isSegmentsNotValid() || ((cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel) != null && cameraLayoutModel.layoutEnabled)) {
            C1441190nbh c1441190nbh = new C1441190nbh();
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            cameraComponentModel.mDurings = c1441190nbh;
            cameraComponentModel.mTotalRecordingTime = 0L;
            boolean zEnableHardEncodeForRecord = AVSettingsWrapper.enableHardEncodeForRecord();
            CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
            cameraComponentModel2.mHardEncode = zEnableHardEncodeForRecord ? 1 : 0;
            cameraComponentModel2.mUseBeautyFace = true;
            if (shortVideoContext.LJJJJZI() && C2486109oh.LIZLLL(context, shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath())) {
                musicPath = shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath();
            }
            shortVideoContext.LJJLIIIJJI(C580310MpR.LIZ(i, musicPath));
            shortVideoContext.LJJLIIIJ((int) shortVideoContext.cameraComponentModel.mMaxDuration);
        } else {
            C1441190nbh c1441190nbh2 = new C1441190nbh(recordScene.videoSegments);
            shortVideoContext.cameraComponentModel.mDurings = c1441190nbh2;
            long jCalculateRealTime = TimeSpeedModelExtension.calculateRealTime(c1441190nbh2);
            CameraComponentModel cameraComponentModel3 = shortVideoContext.cameraComponentModel;
            cameraComponentModel3.mTotalRecordingTime = jCalculateRealTime;
            cameraComponentModel3.mMusicStart = recordScene.musicStart;
            cameraComponentModel3.musicEndTime = recordScene.musicEnd;
            cameraComponentModel3.mHardEncode = recordScene.hardEncode;
            if (recordScene.faceBeauty > 0) {
                z = true;
            } else {
                z = false;
            }
            cameraComponentModel3.mUseBeautyFace = z;
            shortVideoContext.LJJLIIIJJI(recordScene.maxDuration);
            LJII(context, shortVideoContext);
        }
        shortVideoContext.title = videoPublishEditModel.getTitle();
        shortVideoContext.chain = videoPublishEditModel.getChain();
        shortVideoContext.disableDeleteChain = videoPublishEditModel.isDisableDeleteChain();
        shortVideoContext.structList = videoPublishEditModel.getStructList();
        shortVideoContext.isPrivate = videoPublishEditModel.isPrivate;
        if (!TextUtils.isEmpty(videoPublishEditModel.getPic2VideoSource())) {
            String[] strArrSplit = videoPublishEditModel.getPic2VideoSource().split(",");
            if (strArrSplit.length > 0) {
                shortVideoContext.pic2VideoSourceList.addAll(Arrays.asList(strArrSplit));
            }
        }
        shortVideoContext.pic2VideoSource = 0;
        shortVideoContext.mIsFromDraft = true;
        shortVideoContext.draftFromShoot = true;
        C569390MUv.LIZJ(C1438710nXh.LIZIZ(videoPublishEditModel), new C1443750nfp(shortVideoContext), EnumC569430MUz.DRAFT, EnumC569430MUz.RECORD);
        shortVideoContext.cameraComponentModel.extractFramesModel = videoPublishEditModel.getExtractFramesModel();
        shortVideoContext.draftEditTransferModel = videoPublishEditModel.draftEditTransferModel;
        shortVideoContext.cameraComponentModel.videoRecordMetadata = videoPublishEditModel.getMetadataMap();
        shortVideoContext.LJJJLL(videoPublishEditModel.getCommentVideoModel());
        if (bundle.containsKey("extra_ve_cher_effect_param")) {
            shortVideoContext.cameraComponentModel.veCherEffectParam = (ClientCherEffectParam) bundle.getParcelable("extra_ve_cher_effect_param");
        }
        if (i != 1) {
            if (i == 2) {
                LJIILIIL(bundle, shortVideoContext);
            }
        } else {
            LJIILLIIL(bundle, shortVideoContext);
        }
        if (bundle.getBoolean("extra_editor_pro_to_record_retake", false)) {
            shortVideoContext.cameraComponentModel.isEditorProRecordMode = true;
            shortVideoContext.isPhotoMvMode = false;
        } else {
            shortVideoContext.isPhotoMvMode = C1428470nHB.LJLLI(videoPublishEditModel);
        }
        shortVideoContext.publishStage = videoPublishEditModel.getPublishStage();
        shortVideoContext.mIsPhotoMvModeMusic = videoPublishEditModel.isPhotoMvMusic();
        shortVideoContext.recordBGMDelay = videoPublishEditModel.getRecordBgmDelay();
        shortVideoContext.loudnessBalanceParam = videoPublishEditModel.getLoudnessBalanceParam();
        return shortVideoContext;
    }

    public static void LJI(ShortVideoContext shortVideoContext, ExteriorRecordModel exteriorRecordModel) {
        TabType tabType;
        EnumC1651790t5N enumC1651790t5N;
        C0LGK c0lgk = exteriorRecordModel.bottomTabType;
        if (c0lgk == C0LGK.PHOTO) {
            tabType = TabType.PHOTO;
        } else if (c0lgk != C0LGK.PHOTO_AND_VIDEO && c0lgk == C0LGK.VIDEO) {
            tabType = TabType.VIDEO;
        } else {
            tabType = TabType.PHOTO_AND_VIDEO;
        }
        Long lValueOf = Long.valueOf(exteriorRecordModel.minRecordSeconds);
        Long lValueOf2 = Long.valueOf(exteriorRecordModel.maxRecordSeconds);
        RecordBottomTabConfig recordBottomTabConfig = new RecordBottomTabConfig(tabType, lValueOf, lValueOf2);
        CompressConfig compressConfig = new CompressConfig(exteriorRecordModel.imageCompress, exteriorRecordModel.videoCompress, exteriorRecordModel.targetSize);
        ArrayList arrayList = new ArrayList();
        Iterator<C0MJU> it2 = exteriorRecordModel.toolBarList.iterator();
        while (it2.hasNext()) {
            int i = C0MJT.LIZ[it2.next().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            enumC1651790t5N = EnumC1651790t5N.M_BEAUTY;
                        } else {
                            throw new RuntimeException("Toolbar type match error");
                        }
                    } else {
                        enumC1651790t5N = EnumC1651790t5N.FLASH;
                    }
                } else {
                    enumC1651790t5N = EnumC1651790t5N.FILTER;
                }
            } else {
                enumC1651790t5N = EnumC1651790t5N.REVERSE;
            }
            arrayList.add(enumC1651790t5N.name());
        }
        C0LGC c0lgc = exteriorRecordModel.recordPageType;
        if (c0lgc == C0LGC.ECOMMERCE_COMMENT) {
            int i2 = exteriorRecordModel.maxSelectAssetCount;
            int i3 = 35;
            if (i2 < 1 || i2 > 35) {
                i2 = 35;
            }
            int i4 = exteriorRecordModel.maxSelectVideoCount;
            if (i4 >= 0 && i4 <= 35) {
                i3 = i4;
            }
            TabType tabType2 = TabType.PHOTO;
            if (i3 > 0) {
                tabType2 = TabType.PHOTO_AND_VIDEO;
            }
            shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig = new RecordPageOptionalConfig(exteriorRecordModel.recordPageType.getType(), arrayList, new OptionalComponents(false, false, true), "ec_write_review", recordBottomTabConfig, new UploadConfig(tabType2, Integer.valueOf(i3), Integer.valueOf(i2), true, lValueOf, lValueOf2), exteriorRecordModel.showPreviewAfterRecord, compressConfig, exteriorRecordModel.PreviousPage, true);
            shortVideoContext.cameraComponentModel.mWorkspace.LL.Di();
            shortVideoContext.LJJL(true);
            return;
        }
        if (c0lgc == C0LGC.AIGC) {
            shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig = new RecordPageOptionalConfig(exteriorRecordModel.recordPageType.getType(), arrayList, new OptionalComponents(false, false, false), "ai_avatar", recordBottomTabConfig, null, exteriorRecordModel.showPreviewAfterRecord, compressConfig, exteriorRecordModel.PreviousPage, true);
            return;
        }
        if (c0lgc.getType() != C0LGC.PHOTO_SEARCH.getType()) {
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<String>() { // from class: X.0nfb
            {
                add(EnumC1651790t5N.REVERSE.name());
                add(EnumC1651790t5N.FLASH.name());
            }
        };
        TabType tabType3 = TabType.PHOTO;
        shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig = new RecordPageOptionalConfig(exteriorRecordModel.recordPageType.getType(), arrayList2, new OptionalComponents(false, false, true), "ec_write_review", new RecordBottomTabConfig(tabType3, null, null), new UploadConfig(tabType3, null, null, false, null, null), false, new CompressConfig(null, null, null), exteriorRecordModel.PreviousPage, true);
    }

    public static void LJII(Context context, ShortVideoContext shortVideoContext) {
        if (shortVideoContext.LJJJJZI()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (!C2486109oh.LIZLLL(context, shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath())) {
                shortVideoContext.LJJLIIIJ((int) shortVideoContext.cameraComponentModel.mMaxDuration);
                return;
            }
            try {
                if (C2486109oh.LIZIZ(shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath())) {
                    LJIILJJIL(mediaMetadataRetriever, shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath());
                } else {
                    mediaMetadataRetriever.setDataSource(context, UriProtector.parse(shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath()));
                }
                shortVideoContext.LJJLIIIJ(CastIntegerProtector.parseInt(C20144413ru.LIZJ(mediaMetadataRetriever)));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                shortVideoContext.LJJLIIIJ((int) shortVideoContext.cameraComponentModel.mMaxDuration);
                return;
            }
        }
        shortVideoContext.LJJLIIIJ((int) shortVideoContext.cameraComponentModel.mMaxDuration);
    }

    public static void LJIIIIZZ(Bundle bundle, ShortVideoContext shortVideoContext) {
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = (DuetAndStitchRouterConfig) bundle.getParcelable("duet_and_stitch_router_config");
        if (duetAndStitchRouterConfig != null) {
            shortVideoContext.creativeModel.initialModel.duetAndStitchRouterConfig = duetAndStitchRouterConfig;
        }
    }

    public static void LJIIIZ(Bundle bundle, ShortVideoContext shortVideoContext) {
        String description;
        if (d4.LJIJI(shortVideoContext)) {
            PhotoModeBannerMobParams photoModeBannerMobParams = (PhotoModeBannerMobParams) bundle.getParcelable("photo_mode_banner_mob_params");
            if (photoModeBannerMobParams != null) {
                shortVideoContext.creativeModel.initialModel.photoModeBannerMobParams = photoModeBannerMobParams;
            }
            PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams = (PhotoModeAfterCreationFeedbackMobParams) bundle.getParcelable("photo_mode_after_creation_feedback_mob_params");
            if (photoModeAfterCreationFeedbackMobParams != null) {
                shortVideoContext.creativeModel.initialModel.photoModeAfterFeedbackMobParams = photoModeAfterCreationFeedbackMobParams;
            }
            InspirationInfo inspirationInfo = (InspirationInfo) bundle.getParcelable("add_yours_inspiration_info");
            if (inspirationInfo != null) {
                if (inspirationInfo.getDescription() != null && !inspirationInfo.getDescription().isEmpty()) {
                    shortVideoContext.creativeModel.imagePublishBackSaveModel.topicDefaultCopy = inspirationInfo.getDescription();
                }
                if (inspirationInfo.getInspirationTag() != null) {
                    for (InspirationTag inspirationTag : inspirationInfo.getInspirationTag()) {
                        shortVideoContext.creativeModel.imagePublishBackSaveModel.topicInspirations.add(inspirationTag.getTitle());
                        if (inspirationTag.getDescription() != null) {
                            description = inspirationTag.getDescription();
                        } else {
                            description = "";
                        }
                        shortVideoContext.creativeModel.imagePublishBackSaveModel.topicInspirationDescriptions.add(description);
                    }
                }
            }
        }
    }

    public static void LJIIJ(Bundle bundle, ShortVideoContext shortVideoContext) {
        MusicContent musicContent;
        String str;
        shortVideoContext.creativeModel.musicVolumeInfoModel.duetSrcLoudness = bundle.getFloat("duet_src_loudness", Float.MIN_VALUE);
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initMusicData called, get music from MusicBuzModel");
            sbLIZ.append(aVMusicExtractAVMusic.getMusicId());
            C201955140j.LIZIZ("MusicRefactor", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        AVMusic aVMusic = (AVMusic) bundle.getSerializable("aweme_music");
        if (aVMusic != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initMusicData called, get music from EXTRA_AWEME_MUSIC");
            sbLIZ2.append(aVMusic.getMusicId());
            C201955140j.LIZIZ("MusicRefactor", C2188811AlT.LIZIZ(sbLIZ2));
            MusicBeanUtilKt.updateAVMusic(shortVideoContext.creativeModel.musicBuzModel, aVMusic);
            return;
        }
        MusicModel musicModel = (MusicModel) bundle.getSerializable("music_model");
        if (musicModel != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("initMusicData called, get music from EXTRA_MUSIC_MODEL");
            sbLIZ3.append(musicModel.getMusicId());
            C201955140j.LIZIZ("MusicRefactor", C2188811AlT.LIZIZ(sbLIZ3));
            MusicBeanUtilKt.updateAVMusic(shortVideoContext.creativeModel.musicBuzModel, o.LJI.transformMusicModel(musicModel));
            if (!TextUtils.isEmpty(musicModel.getMusicVolumeInfo())) {
                shortVideoContext.creativeModel.musicVolumeInfoModel.musicVolumeInfo = musicModel.getMusicVolumeInfo();
                shortVideoContext.creativeModel.musicVolumeInfoModel.musicId = musicModel.getMusicId();
                return;
            }
            return;
        }
        Serializable serializable = bundle.getSerializable("open_platform_share_context");
        if (serializable != null && (serializable instanceof C1402840mbq) && (musicContent = ((BaseShareContext) serializable).mMusicContent) != null && (str = musicContent.musicId) != null) {
            AVMusic aVMusic2 = new AVMusic();
            aVMusic2.setMusicId(str);
            shortVideoContext.creativeModel.musicBuzModel.music = MusicBeanUtilKt.extractMusicObject(aVMusic2);
            return;
        }
        C201955140j.LIZIZ("MusicRefactor", "initMusicData called, no music found");
    }

    public static void LJIILIIL(Bundle bundle, ShortVideoContext shortVideoContext) {
        CreativeModel creativeModel = shortVideoContext.LL;
        if (creativeModel != null) {
            shortVideoContext.creativeModel = creativeModel;
            shortVideoContext.LL = null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("original_segments");
        int i = bundle.getInt("original_music_start", 0);
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        cameraComponentModel.mRetakeDuration = 0L;
        cameraComponentModel.mRetakeTime = 0L;
        cameraComponentModel.isRetakeMode = false;
        cameraComponentModel.retakeVideoContext = null;
        C1441190nbh c1441190nbh = new C1441190nbh(parcelableArrayList);
        shortVideoContext.cameraComponentModel.mDurings = c1441190nbh;
        long jCalculateRealTime = TimeSpeedModelExtension.calculateRealTime(c1441190nbh);
        CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
        cameraComponentModel2.mTotalRecordingTime = jCalculateRealTime;
        cameraComponentModel2.mWorkspace.LL.kr(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIIJ(shortVideoContext.creativeInfo, "", true));
        C1445850njD.LIZ(shortVideoContext.cameraComponentModel.mWorkspace, (VideoPublishEditModel) bundle.getSerializable("video_edit_model"));
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        shortVideoContext.musicBeforeRetake = aVMusicExtractAVMusic;
        if (aVMusicExtractAVMusic != null) {
            String str = aVMusicExtractAVMusic.path;
            shortVideoContext.cameraComponentModel.mWorkspace.MC(str);
            CameraComponentModel cameraComponentModel3 = shortVideoContext.cameraComponentModel;
            cameraComponentModel3.mMusicPath = str;
            cameraComponentModel3.mMusicStart = i;
        } else {
            C1443960ngA.LIZIZ(shortVideoContext);
        }
        if (bundle.containsKey("stitch_params")) {
            shortVideoContext.LJJII((StitchParams) bundle.getParcelable("stitch_params"));
        } else {
            shortVideoContext.LIZ();
        }
        LJIIIIZZ(bundle, shortVideoContext);
    }

    public static void LJIILJJIL(MediaMetadataRetriever mediaMetadataRetriever, String str) {
        if (str != null) {
            try {
                C0VSP c0vsp = new C0VSP(str);
                try {
                    mediaMetadataRetriever.setDataSource(c0vsp.getFD(), 0L, 576460752303423487L);
                    c0vsp.close();
                    return;
                } finally {
                }
            } catch (FileNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException(e);
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new IllegalArgumentException(e2);
            }
        }
        throw new IllegalArgumentException("path == null");
    }

    public static void LJIILL(Bundle bundle, ShortVideoContext shortVideoContext) {
        if (!Objects.equals(shortVideoContext.shootWay, "direct_shoot") && !((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ() && bundle != null && bundle.getBoolean("used_full_song", false)) {
            shortVideoContext.creativeModel.musicBuzModel.isTrimmingLimited = true;
        }
    }

    public static void LJIILLIIL(Bundle bundle, ShortVideoContext shortVideoContext) {
        shortVideoContext.LL = shortVideoContext.creativeModel;
        shortVideoContext.creativeModel = C0MUK.LIZJ(bundle);
        RetakeVideoContext retakeVideoContext = (RetakeVideoContext) bundle.getParcelable("retake_video");
        long j = retakeVideoContext.duration;
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        cameraComponentModel.mRetakeDuration = j;
        cameraComponentModel.mRetakeTime = 0L;
        cameraComponentModel.isRetakeMode = true;
        if (retakeVideoContext.multiEditVideoRecordData != null) {
            shortVideoContext.cameraComponentModel.mDurings = new C1441190nbh(retakeVideoContext.multiEditVideoRecordData.editSegments);
        }
        shortVideoContext.LJI().clear();
        Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
        workspace.LL.kr(retakeVideoContext.retakeDir);
        shortVideoContext.cameraComponentModel.retakeVideoContext = retakeVideoContext;
        StitchParams stitchParams = retakeVideoContext.stitchParams;
        if (stitchParams != null) {
            shortVideoContext.LJJII(stitchParams);
        } else {
            shortVideoContext.LIZ();
        }
        if (retakeVideoContext.isPip) {
            shortVideoContext.LJJL(true);
            Workspace workspace2 = shortVideoContext.cameraComponentModel.mWorkspace;
            workspace2.LL.g9(new C2347009Ho(retakeVideoContext.retakeDir));
            shortVideoContext.cameraComponentModel.editorProRecordUsedForPip = true;
        }
        MultiEditVideoRecordData multiEditVideoRecordData = retakeVideoContext.multiEditVideoRecordData.curMultiEditVideoRecordData;
        String str = multiEditVideoRecordData.musicPath;
        boolean zIsPlaySingleSegmentMusic = multiEditVideoRecordData.isPlaySingleSegmentMusic();
        if (str != null && (zIsPlaySingleSegmentMusic || !retakeVideoContext.disableBGM)) {
            int i = retakeVideoContext.multiEditVideoRecordData.curMultiEditVideoRecordData.musicTrimIn;
            CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
            cameraComponentModel2.mMusicStart = i;
            cameraComponentModel2.mWorkspace.MC(str);
            shortVideoContext.cameraComponentModel.mMusicPath = str;
            shortVideoContext.LJJLIIIJILLIZJL(retakeVideoContext.musicOrigin);
            return;
        }
        C1443960ngA.LIZIZ(shortVideoContext);
    }

    public static ShortVideoContext LIZJ(Bundle bundle, Context context, RecordScene recordScene) {
        CreativeInfo creativeInfo;
        String musicPath;
        int i = bundle.getInt("restore", 0);
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return LJ(bundle);
                    }
                    ShortVideoContext shortVideoContextLIZLLL = LIZLLL(context, bundle);
                    shortVideoContextLIZLLL.mIsFromDraft = bundle.getBoolean("fromDraft", true);
                    return shortVideoContextLIZLLL;
                }
                if (recordScene == null) {
                    recordScene = C1439190nYT.LIZIZ();
                }
                if (recordScene.isSegmentsNotValid()) {
                    creativeInfo = new CreativeInfo();
                } else {
                    creativeInfo = recordScene.creativeInfo;
                }
                ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(2, creativeInfo.getCreationId(), creativeInfo.getVersion()));
                shortVideoContext.avetParameter = AVETParameterKt.generateAVETParam(bundle);
                String str = recordScene.shootWay;
                if (str != null && !str.isEmpty()) {
                    shortVideoContext.shootWay = str;
                } else {
                    shortVideoContext.shootWay = bundle.getString("shoot_way");
                }
                shortVideoContext.mShootFrom = bundle.getString("shoot_from");
                shortVideoContext.recordParam = bundle.getString("record_param");
                shortVideoContext.draftId = 0;
                shortVideoContext.publishStage = 50;
                if (C297610BlX.LIZ()) {
                    shortVideoContext.shootMode = recordScene.shootMode;
                }
                if (bundle.containsKey("extra_bind_mv_id")) {
                    shortVideoContext.mBindMovieId = bundle.getString("extra_bind_mv_id");
                }
                C1443590nfZ c1443590nfZ = o.LJIIJJI;
                c1443590nfZ.LIZ();
                shortVideoContext.cameraComponentModel.mVideoWidth = c1443590nfZ.LIZ;
                C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
                c1443590nfZ2.LIZ();
                shortVideoContext.cameraComponentModel.mVideoHeight = c1443590nfZ2.LIZIZ;
                if (bundle.containsKey("stitch_params")) {
                    shortVideoContext.LJJII((StitchParams) bundle.getParcelable("stitch_params"));
                } else {
                    shortVideoContext.LIZ();
                }
                LJIIIIZZ(bundle, shortVideoContext);
                shortVideoContext.cameraComponentModel.mCurrentDurationMode = C0CHQ.LIZ().LJJIIZI().LJIIJ(true);
                if (recordScene.isSegmentsNotValid()) {
                    shortVideoContext.LJ().setCreationId(UUID.randomUUID().toString());
                    shortVideoContext.creativeInfo = creativeInfo;
                    shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
                    C1441190nbh c1441190nbh = new C1441190nbh();
                    CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
                    cameraComponentModel.mDurings = c1441190nbh;
                    cameraComponentModel.mTotalRecordingTime = 0L;
                    boolean zEnableHardEncodeForRecord = AVSettingsWrapper.enableHardEncodeForRecord();
                    CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
                    cameraComponentModel2.mHardEncode = zEnableHardEncodeForRecord ? 1 : 0;
                    cameraComponentModel2.mUseBeautyFace = true;
                    if (shortVideoContext.LJJJJZI() && C2486109oh.LIZLLL(context, shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath())) {
                        musicPath = shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath();
                    } else {
                        musicPath = null;
                    }
                    shortVideoContext.LJJLIIIJJI(C580310MpR.LIZ(shortVideoContext.shootMode, musicPath));
                    LJII(context, shortVideoContext);
                } else {
                    shortVideoContext.LJ().setCreationId(recordScene.getCreationId());
                    shortVideoContext.creativeInfo = creativeInfo;
                    shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(creativeInfo);
                    C1441190nbh c1441190nbh2 = new C1441190nbh(recordScene.videoSegments);
                    shortVideoContext.cameraComponentModel.mDurings = c1441190nbh2;
                    long jCalculateRealTime = TimeSpeedModelExtension.calculateRealTime(c1441190nbh2);
                    CameraComponentModel cameraComponentModel3 = shortVideoContext.cameraComponentModel;
                    cameraComponentModel3.mTotalRecordingTime = jCalculateRealTime;
                    String str2 = recordScene.musicPath;
                    cameraComponentModel3.mMusicPath = str2;
                    if (!TextUtils.isEmpty(str2)) {
                        shortVideoContext.cameraComponentModel.mWorkspace.MC(recordScene.musicPath);
                    }
                    int i2 = recordScene.musicStart;
                    CameraComponentModel cameraComponentModel4 = shortVideoContext.cameraComponentModel;
                    cameraComponentModel4.mMusicStart = i2;
                    cameraComponentModel4.mHardEncode = recordScene.hardEncode;
                    if (recordScene.faceBeauty <= 0) {
                        z = false;
                    }
                    cameraComponentModel4.mUseBeautyFace = z;
                    shortVideoContext.LJJLIIIJJI(recordScene.maxDuration);
                    MicDataModel micDataModel = shortVideoContext.creativeModel.micDataModel;
                    micDataModel.recordOriginalSoundWithBGM = recordScene.recordOriginalSoundWithBGM;
                    micDataModel.enableMicWithBgm = false;
                    LJII(context, shortVideoContext);
                    C1452640nuA.LJII(recordScene.musicModel, false, shortVideoContext.creativeModel.musicBuzModel);
                    shortVideoContext.sharedARModel = recordScene.sharedARModel;
                    shortVideoContext.stitchContext.stitchParams = recordScene.stitchParams;
                    shortVideoContext.cameraComponentModel.extractFramesModel = recordScene.extractFramesModel;
                    RecordContext recordContext = new RecordContext(StrArray.from(recordScene.filterLabels), StrArray.from(recordScene.filterIds), StrArray.from(recordScene.filterValues), new StrArray(), new StrArray(), new StrArray(), new StrArray(), 896);
                    CameraComponentModel cameraComponentModel5 = shortVideoContext.cameraComponentModel;
                    cameraComponentModel5.recordContext = recordContext;
                    cameraComponentModel5.veCherEffectParam = recordScene.cherEffectParam;
                    cameraComponentModel5.videoRecordMetadata = recordScene.videoRecordMetadata;
                    shortVideoContext.LJJJLL(recordScene.commentVideoModel);
                    shortVideoContext.shootedShootMode = recordScene.shootedShootMode;
                    C1443030nef.LJII().LIZ(recordScene.getChallengeFromStr());
                    if (C1837707Hr.LIZ()) {
                        C1443030nef.LJII().LJFF(recordScene.getCsiChallengesFromStr());
                    }
                    shortVideoContext.recordBGMDelay = recordScene.recordBGMDelay;
                    shortVideoContext.loudnessBalanceParam = recordScene.loudnessBalanceParam;
                    MobileEffectsModel2 mobileEffectsModel2 = recordScene.mobileEffectsModel;
                    if (mobileEffectsModel2 != null) {
                        shortVideoContext.creativeModel.mobileEffectsModel2 = mobileEffectsModel2;
                    }
                }
                C1443560nfW.LJ = recordScene.fromItemId;
                FollowUpPublishTrackerModel followUpPublishTrackerModel = shortVideoContext.creativeModel.followUpPublishTrackerModel;
                followUpPublishTrackerModel.followUpFirstItemId = recordScene.followUpFirstItemId;
                followUpPublishTrackerModel.followUpItemIdGroups = recordScene.followUpItemIdGroups;
                followUpPublishTrackerModel.enterRecordFromFeed = recordScene.enterRecordFromFeed;
                followUpPublishTrackerModel.followUpPromoId = recordScene.followUpPromoId;
                return shortVideoContext;
            }
            return LIZLLL(context, bundle);
        }
        return LJ(bundle);
    }
}
