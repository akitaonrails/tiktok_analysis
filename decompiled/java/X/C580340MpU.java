package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.PostLandingModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.story.StoryStreakUser;
import com.ss.android.ugc.aweme.creative.model.story.StreaksData;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.SDKServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.external.ui.MultiVideoMedia;
import com.ss.android.ugc.aweme.services.external.ui.ShareConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS622S0100000_8;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580340MpU implements IEditService {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new C580350MpV();
    }

    public C580340MpU() {
        new SDKServiceImpl();
    }

    public static ShortVideoContext LIZ(EditConfig editConfig) {
        StoryStreakUser storyStreakUser;
        ShortVideoContext shortVideoContextLIZIZ = C1443540nfU.LIZIZ(new Bundle());
        shortVideoContextLIZIZ.creativeModel.postLandingModel = new PostLandingModel(editConfig.getLandingBack(), 30);
        shortVideoContextLIZIZ.shootWay = editConfig.getShootway();
        List<AnchorTransData> anchors = editConfig.getAnchors();
        if (anchors != null) {
            shortVideoContextLIZIZ.creativeFlowData.setAnchors(anchors);
        }
        List<AVChallenge> challenges = editConfig.getChallenges();
        if (challenges != null) {
            ((ArrayList) C1443030nef.LJII().LIZ).addAll(challenges);
        }
        editConfig.setCreationId(shortVideoContextLIZIZ.getCreationId());
        AutoSelectedAnchorInfos autoSelectedAnchorInfos = shortVideoContextLIZIZ.creativeFlowData.getAutoSelectedAnchorInfos();
        if (autoSelectedAnchorInfos != null) {
            autoSelectedAnchorInfos.setOpenPlatFormExtra(editConfig.getOpenPlatformExtra());
        }
        AVETParameter aVETParameter = new AVETParameter();
        aVETParameter.setShootWay(String.valueOf(editConfig.getShootway()));
        aVETParameter.setCreationId(shortVideoContextLIZIZ.getCreationId());
        shortVideoContextLIZIZ.avetParameter = aVETParameter;
        CreativeInitialModel initialModel = editConfig.getInitialModel();
        if (initialModel != null) {
            shortVideoContextLIZIZ.creativeModel.initialModel = initialModel;
        }
        String epAIScene = editConfig.getEpAIScene();
        if (epAIScene != null) {
            shortVideoContextLIZIZ.creativeModel.editorProAIGCInfoModel.editorTabAlbumAICreate.deeplinkEpAIScene = epAIScene;
        }
        String epAIEnterSource = editConfig.getEpAIEnterSource();
        if (epAIEnterSource != null) {
            shortVideoContextLIZIZ.creativeModel.editorProAIGCInfoModel.editorTabAlbumAICreate.deeplinkEpAISceneEnterSource = epAIEnterSource;
        }
        AddYourRecordParam addYourRecordParam = editConfig.getAddYourRecordParam();
        if (addYourRecordParam != null) {
            C1466090oFr.LJIILL(shortVideoContextLIZIZ.creativeModel.stickerModel, addYourRecordParam);
        }
        StoryStreakEnterEditParam storyStreakParam = editConfig.getStoryStreakParam();
        if (storyStreakParam != null) {
            StreaksData streaksData = shortVideoContextLIZIZ.creativeModel.streaksData;
            streaksData.setShootEnterFrom(storyStreakParam.getEnterFrom());
            streaksData.setShootEnterMethod(storyStreakParam.getEnterMethod());
            String conversationId = storyStreakParam.getConversationId();
            String str = "";
            if (conversationId == null) {
                conversationId = "";
            }
            streaksData.setConversationId(conversationId);
            streaksData.setStreaksPost(true);
            streaksData.setStreaksLevel(storyStreakParam.getStreakLevel());
            User streakUser = storyStreakParam.getStreakUser();
            if (streakUser != null) {
                String uid = streakUser.getUid();
                String secUid = streakUser.getSecUid();
                if (secUid == null) {
                    secUid = "";
                }
                String uniqueId = streakUser.getUniqueId();
                if (uniqueId == null) {
                    uniqueId = "";
                }
                String nickname = streakUser.getNickname();
                if (nickname != null) {
                    str = nickname;
                }
                storyStreakUser = new StoryStreakUser(uid, secUid, uniqueId, str, streakUser.getAvatarThumb());
            } else {
                storyStreakUser = null;
            }
            streaksData.setStreakUser(storyStreakUser);
            streaksData.setMessageSentCount(storyStreakParam.getMessageCount());
            streaksData.setMufDaysCount(storyStreakParam.getMufDaysCount());
            streaksData.setInfoDescFontPath(storyStreakParam.getInfoDescFontPath());
            streaksData.setFakeLevel(storyStreakParam.isFakeLevel());
            streaksData.setNumUseEffectFont(storyStreakParam.isNumUseEffectFont());
            if (storyStreakParam.isNumUseEffectFont()) {
                streaksData.setInfoNumberFontPath(storyStreakParam.getInfoNumberFontPath());
            } else {
                streaksData.setInfoNumberFontCreativePath(storyStreakParam.getInfoNumberFontPath());
            }
            streaksData.setPosterBgColor(storyStreakParam.getPosterBgColor());
            shortVideoContextLIZIZ.creativeModel.storyEventStickerData.setCelebrationType(6);
        }
        StorySocialEventStickerModel storySocialEventStickerParam = editConfig.getStorySocialEventStickerParam();
        if (storySocialEventStickerParam != null) {
            shortVideoContextLIZIZ.creativeModel.storyEventStickerData = storySocialEventStickerParam;
        }
        String storyStreakGifPath = editConfig.getStoryStreakGifPath();
        if (storyStreakGifPath != null) {
            shortVideoContextLIZIZ.creativeModel.streaksData.setStreakGifPath(storyStreakGifPath);
        }
        return shortVideoContextLIZIZ;
    }

    public static Bundle LIZIZ(EditConfig editConfig, ShareConfig shareConfig) {
        Bundle bundle = new Bundle();
        C0MUK.LJIIJ(bundle, C0MUK.LJIIIIZZ());
        AVChallenge challenge = editConfig.getChallenge();
        if (challenge != null) {
            C786410Ut5.LJJIZ(bundle, "av_challenge", challenge);
        }
        C786410Ut5.LJJIZ(bundle, "av_challenge_list", (Serializable) C1443030nef.LJII().LIZ);
        C786410Ut5.LJJJI("shoot_way", editConfig.getShootway(), bundle);
        if (editConfig.getEnterFrom() != null) {
            C786410Ut5.LJJJI("enter_from", editConfig.getEnterFrom(), bundle);
        }
        bundle.putBoolean("is_from_sys_share", true);
        C786410Ut5.LJJJI("extra_share_app_name", shareConfig.getAppName(), bundle);
        C786410Ut5.LJJIZ(bundle, "extra_share_context", shareConfig.getShareContext());
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IEditService
    public final void startEdit(Context context, EditConfig editConfig) {
        C530750Krh c530750Krh;
        if (context != null) {
            if (editConfig.getClear() && (c530750Krh = C530750Krh.LJFF) != null) {
                c530750Krh.LIZ();
            }
            if (editConfig.getMediaInfo() != null) {
                C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C569020MTk(this, editConfig, context, null), 3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IEditService
    public final void startEdit(Context context, EditConfig editConfig, ShareConfig shareConfig) {
        CreativeInitialModel creativeInitialModel;
        CreativeInitialModel creativeInitialModel2;
        long j;
        if (context != null) {
            int type = shareConfig.getType();
            MusicBuzModel musicBuzModel = null;
            if (type != 2) {
                if (type == 4) {
                    Bundle bundleLIZIZ = LIZIZ(editConfig, shareConfig);
                    List<String> videoList = shareConfig.getVideoList();
                    if (videoList != null) {
                        ArrayList arrayList = new ArrayList();
                        long j2 = 0;
                        for (String str : videoList) {
                            boolean zLJJIII = C2471909mP.LJJIII(str, false, 6);
                            MediaModel mediaModel = new MediaModel(j2);
                            int[] iArrLIZIZ = C1404710mer.LIZIZ(str);
                            if (iArrLIZIZ != null) {
                                if (zLJJIII) {
                                    j = 3000;
                                } else {
                                    j = iArrLIZIZ[3];
                                }
                                mediaModel.duration = j;
                                mediaModel.width = iArrLIZIZ[0];
                                int i = 1;
                                mediaModel.height = iArrLIZIZ[1];
                                mediaModel.LJIILL(str);
                                if (!zLJJIII) {
                                    i = 4;
                                }
                                mediaModel.type = i;
                                arrayList.add(mediaModel);
                                j2++;
                            }
                        }
                        MultiVideoMedia multiVideoMedia = new MultiVideoMedia(arrayList);
                        multiVideoMedia.setExtraBundle(bundleLIZIZ);
                        editConfig.setMediaInfo(multiVideoMedia);
                    }
                    try {
                        creativeInitialModel2 = (CreativeInitialModel) C0CHQ.LIZ().getGson().LJII(shareConfig.getShareContext().creativeInitModelJson, CreativeInitialModel.class);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        creativeInitialModel2 = null;
                    }
                    editConfig.setInitialModel(creativeInitialModel2);
                }
            } else {
                Bundle bundleLIZIZ2 = LIZIZ(editConfig, shareConfig);
                String creationId = editConfig.getCreationId();
                if (creationId == null) {
                    creationId = C0DMI.LIZ();
                }
                C537520L6g.LJFF(bundleLIZIZ2, new CreativeInfo(creationId, 0, null, 6, null));
                C786410Ut5.LJJJI("open_platform_client_key", shareConfig.getShareContext().mClientKey, bundleLIZIZ2);
                C786410Ut5.LJJJI("open_platform_extra", shareConfig.getShareContext().mOpenPlatformExtra, bundleLIZIZ2);
                C786410Ut5.LJJJI("anchor_source_type", shareConfig.getShareContext().mAnchorSourceType, bundleLIZIZ2);
                bundleLIZIZ2.putInt("open_sdk_share_format", shareConfig.getShareContext().mShareFormat.getValue());
                Effect presetEffect = shareConfig.getPresetEffect();
                if (presetEffect != null) {
                    C786410Ut5.LJJIJL(bundleLIZIZ2, "green_screen_kit_preset_effect", presetEffect);
                }
                C786410Ut5.LJJIZ(bundleLIZIZ2, "share_model", editConfig.getShareModel());
                C786410Ut5.LJJIZ(bundleLIZIZ2, "publish_settings_op", editConfig.getPublishSettings());
                MusicContent musicContent = shareConfig.getShareContext().mMusicContent;
                if (musicContent != null) {
                    bundleLIZIZ2.putInt("music_start_time", musicContent.musicStartTime);
                    C786410Ut5.LJJJI("music_id", musicContent.musicId, bundleLIZIZ2);
                }
                C786410Ut5.LJJIZ(bundleLIZIZ2, "_aweme_open_sdk_extra_share_options", shareConfig.getShareContext().mExtraShareOptions);
                C1402840mbq shareContext = shareConfig.getShareContext();
                VideoMedia videoMedia = new VideoMedia(shareConfig.getFile());
                videoMedia.setExtraBundle(bundleLIZIZ2);
                editConfig.setMediaInfo(videoMedia);
                try {
                    creativeInitialModel = (CreativeInitialModel) C0CHQ.LIZ().getGson().LJII(shareContext.creativeInitModelJson, CreativeInitialModel.class);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    creativeInitialModel = null;
                }
                editConfig.setInitialModel(creativeInitialModel);
                String str2 = shareConfig.getShareContext().mOpenPlatformExtra;
                if (str2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        String strOptString = jSONObject.optString("ay_topic_id", "");
                        String strOptString2 = jSONObject.optString("ay_topic_text", "");
                        if (C123100dR.LIZ(strOptString)) {
                            ((IAddYoursStickerRecordService) ServiceManager.get().getService(IAddYoursStickerRecordService.class)).LIZIZ(CastLongProtector.parseLong(strOptString), new AwS622S0100000_8(editConfig, 48));
                        } else if (C123100dR.LIZ(strOptString2)) {
                            musicBuzModel = null;
                            editConfig.setAddYourRecordParam(new AddYourRecordParam(new AddYoursStickerStruct(null, null, strOptString2, 0, null, null, null, null, null, System.currentTimeMillis(), 14.0f, Boolean.FALSE, null, 0), false, false, null, null, null, null, true, false, null, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, true, false));
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            }
            startEdit(context, editConfig);
            C1452640nuA.LJ(musicBuzModel);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    @Override // com.ss.android.ugc.aweme.services.external.ui.IEditService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startEditorProChangeBanMusic(com.ss.android.ugc.aweme.feed.model.Aweme r31, android.app.Activity r32, long r33, com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig r35, com.ss.android.ugc.aweme.services.external.UIServiceCallback r36, java.lang.String r37, java.lang.String r38, X.InterfaceC1364105Vn<? super kotlin.Unit> r39) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C580340MpU.startEditorProChangeBanMusic(com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity, long, com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig, com.ss.android.ugc.aweme.services.external.UIServiceCallback, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
