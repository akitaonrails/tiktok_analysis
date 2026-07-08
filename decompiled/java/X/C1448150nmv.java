package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.commerce.tools.challenge.ICommerceToolsChallengeService;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0nmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448150nmv {
    public static final EnumC2249681D3m LIZ(ShortVideoContext shortVideoContext) {
        String str = shortVideoContext.shootWay;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -892243791) {
                if (iHashCode == 3094784 && str.equals("duet")) {
                    return EnumC2249681D3m.DUET;
                }
            } else if (str.equals("stitch")) {
                return EnumC2249681D3m.STITCH;
            }
        }
        return EnumC2249681D3m.SHOOT;
    }

    public static final void LIZIZ(final ShortVideoContext shortVideoContext, Bundle bundle, C19GS c19gs) {
        boolean z;
        ArrayList arrayList;
        AVMusic aVMusicExtractAVMusic;
        ShareKitPanel shareKitPanel;
        OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig;
        C1402840mbq c1402840mbq;
        Serializable serializable = bundle.getSerializable("share_model");
        if ((serializable instanceof C1402840mbq) && (c1402840mbq = (C1402840mbq) serializable) != null) {
            shortVideoContext.shareContext = c1402840mbq;
        }
        C860560XpO.LIZIZ(shortVideoContext);
        if (bundle.getBoolean("reuse_mvtheme_enter", false)) {
            shortVideoContext.enterMvThemeEffect = (Effect) bundle.getParcelable("extra_mv_effect");
        }
        shortVideoContext.mUnpublishedEffectId = bundle.getString("unpublished_sticker_id");
        shortVideoContext.mSavedDraftId = bundle.getString("saved_draft_id");
        String string = bundle.getString("draft_land_page");
        if (string != null && string.length() != 0) {
            shortVideoContext.creativeModel.draftInfoModel.draftLandPage = string;
        }
        shortVideoContext.creativeModel.aiSelfScanFaceModel.aiSelfScanFaceEntry = bundle.getBoolean("scan_face_entry_white_t_shirt", false);
        shortVideoContext.creativeModel.aiSelfScanFaceModel.hideCameraUIOnStartRecord = bundle.getBoolean("hide_camera_ui_on_start_record", false);
        shortVideoContext.creativeModel.recordEffectModel.stickerFrom = bundle.getString("extra_sticker_from");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("reuse_sticker_ids");
        String string2 = bundle.getString("sticker_id");
        if (!TextUtils.isEmpty(string2) && (stringArrayList == null || stringArrayList.isEmpty())) {
            stringArrayList = new ArrayList<>();
            stringArrayList.add(string2);
        }
        Effect effect = (Effect) bundle.getParcelable("first_sticker");
        RecordEffectModel recordEffectModel = shortVideoContext.creativeModel.recordEffectModel;
        if (effect != null) {
            z = true;
        } else {
            z = false;
        }
        recordEffectModel.hasAutoApplyEffect = z;
        String string3 = bundle.getString("extra_draft_again_type");
        if (!TextUtils.isEmpty(string3)) {
            shortVideoContext.creativeModel.draftBoxModel.draftAgainType = string3;
        }
        String string4 = bundle.getString("session");
        String string5 = bundle.getString("host_uid");
        String string6 = bundle.getString("host_name");
        if (string4 != null && effect != null) {
            shortVideoContext.LJJLIIIJL(true);
            SharedARModel sharedARModel = shortVideoContext.sharedARModel;
            if (sharedARModel != null) {
                sharedARModel.setSharedARSessionId(string4);
                sharedARModel.setSharedARMultiPlayerUserName(string6);
                sharedARModel.setSharedARMultiPlayerUserId(string5);
            }
        }
        if (bundle.getBoolean("from_special_plus", false)) {
            shortVideoContext.isSpecialPlusIcon = 1;
        } else {
            shortVideoContext.isSpecialPlusIcon = 0;
        }
        shortVideoContext.tabs = bundle.getInt("tabs", 0);
        RecordEffectModel recordEffectModel2 = shortVideoContext.creativeModel.recordEffectModel;
        recordEffectModel2.autoApplyEffect = effect;
        recordEffectModel2.autoShowStickerPanel = bundle.getBoolean("sticker_pannel_show", false);
        String string7 = bundle.getString("grade_key");
        if (string7 != null) {
            shortVideoContext.creativeModel.recordEffectModel.gradeKey.add(string7);
        }
        shortVideoContext.creativeModel.loadMusicAndEffectModel.isDraftMusicLegal = bundle.getBoolean("draft_music_legal", true);
        shortVideoContext.creativeModel.recordData.isEditorProToRecord = bundle.getBoolean("extra_editor_pro_to_record", false);
        shortVideoContext.creativeModel.recordData.isEditorProToRecordRetake = bundle.getBoolean("extra_editor_pro_to_record_retake", false);
        shortVideoContext.creativeModel.recordMobModel.startRecordTime = bundle.getLong("extra_start_record_time", 0L);
        C577580Ml2.LIZ.LJFF(shortVideoContext.creativeModel.shootLinkPerfMobModel, bundle);
        shortVideoContext.creativeModel.recordMobModel.duetStitchClickTime = bundle.getLong("extra_duet_stitch_click_time", 0L);
        shortVideoContext.creativeModel.recordMobModel.downloadResourceTime = bundle.getLong("extra_start_record_download_res_time", 0L);
        shortVideoContext.creativeModel.recordMobModel.sdkLoadVESoStatus = bundle.getInt("sdk_load_ve_so_status", -1);
        shortVideoContext.creativeModel.recordMobModel.preloadVESoCostTime = bundle.getLong("preload_ve_so_cost_time", -1L);
        shortVideoContext.creativeModel.recordMobModel.preloadVESoStatus = bundle.getInt("preload_ve_so_task_status", -1);
        shortVideoContext.creativeModel.recordMobModel.decompressVESoCostTime = bundle.getLong("extra_decompress_time", -10086L);
        shortVideoContext.creativeModel.recordMobModel.effectDownloadTime = bundle.getLong("effect_download_duration", -1L);
        shortVideoContext.creativeModel.recordMobModel.musicDownloadTime = bundle.getLong("music_download_duration", -1L);
        shortVideoContext.creativeModel.recordMobModel.videoDownloadTime = bundle.getLong("video_download_duration", -1L);
        shortVideoContext.creativeModel.recordMobModel.waitVESoLoadDuration = bundle.getLong("extra_wait_ve_load_duration", -1L);
        shortVideoContext.creativeModel.recordMobModel.recordFromTab = bundle.getInt("extra_record_from_tab", EnumC569740MWe.DEFAULT.getTab());
        if (C0CLW.LIZIZ.LIZ.getStickerUpdateApp().booleanValue() && Intrinsics.LJFF("direct_shoot", shortVideoContext.shootWay) && effect == null && (stringArrayList == null || stringArrayList.isEmpty())) {
            String strLIZIZ = o.LJIILLIIL.LIZIZ(c19gs);
            if (!TextUtils.isEmpty(strLIZIZ)) {
                stringArrayList = new ArrayList<>();
                stringArrayList.add(strLIZIZ);
            }
        }
        if (!TextUtils.isEmpty(bundle.getString("star_atlas_object"))) {
            shortVideoContext.creativeModel.commerceModel.getTcmModel().setOuterTcmOrder(bundle.getString("star_atlas_object"));
            shortVideoContext.creativeModel.commerceModel.getTcmModel().setTcmPreventSelfSee(2);
            ICommerceToolsTcmService iCommerceToolsTcmService = (ICommerceToolsTcmService) PluggableExtentionKt.pluggableSpi$default(ICommerceToolsTcmService.class, false, false, false, 14, null);
            if (iCommerceToolsTcmService != null) {
                iCommerceToolsTcmService.LJIILL(shortVideoContext.creativeModel.commerceModel.getTcmModel());
            }
        } else {
            shortVideoContext.creativeModel.commerceModel.getTcmModel().setTcmPreventSelfSee(1);
        }
        if (effect == null && !C580130Mp9.LIZIZ(stringArrayList)) {
            RecordPresetResource recordPresetResource = shortVideoContext.recordPresetResource;
            if (recordPresetResource != null) {
                shortVideoContext.cameraComponentModel.enterRecordWithSticker = recordPresetResource.preSetEffect();
                shortVideoContext.creativeModel.recordEffectModel.hasAutoApplyEffect = shortVideoContext.recordPresetResource.preSetEffect();
            } else {
                shortVideoContext.cameraComponentModel.enterRecordWithSticker = false;
            }
        } else {
            shortVideoContext.cameraComponentModel.enterRecordWithSticker = true;
            RecordEffectModel recordEffectModel3 = shortVideoContext.creativeModel.recordEffectModel;
            if (stringArrayList != null) {
                arrayList = new ArrayList(stringArrayList);
            } else {
                arrayList = null;
            }
            recordEffectModel3.effectReuseFlowStickerIds = arrayList;
        }
        String string8 = bundle.getString("music_origin");
        if (string8 == null) {
            string8 = "original";
        }
        shortVideoContext.LJJLIIIJILLIZJL(string8);
        AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        if (C13LP.LJJJJ(shortVideoContext.LJIIJJI(), s.LIZIZ) && aVMusicExtractAVMusic2 != null) {
            shortVideoContext.creativeModel.musicBuzModel.keepOriginEnterMusicId = aVMusicExtractAVMusic2.getMusicId();
        }
        ICommerceToolsChallengeService iCommerceToolsChallengeService = (ICommerceToolsChallengeService) PluggableExtentionKt.pluggableSpi$default(ICommerceToolsChallengeService.class, false, false, false, 14, null);
        if (iCommerceToolsChallengeService != null) {
            iCommerceToolsChallengeService.LIZ(bundle, shortVideoContext);
        }
        shortVideoContext.mShareId = bundle.getString("share_id");
        shortVideoContext.clientId = bundle.getString("channel");
        if (bundle.containsKey("green_screen_kit_config")) {
            Serializable serializable2 = bundle.getSerializable("green_screen_kit_config");
            if (serializable2 instanceof OPSDK$GreenScreenKitConfig) {
                oPSDK$GreenScreenKitConfig = (OPSDK$GreenScreenKitConfig) serializable2;
            } else {
                oPSDK$GreenScreenKitConfig = null;
            }
            shortVideoContext.greenScreenKitConfig = oPSDK$GreenScreenKitConfig;
        }
        if (bundle.containsKey("share_kit_panel")) {
            CreativeFlowData creativeFlowData = shortVideoContext.creativeFlowData;
            Serializable serializable3 = bundle.getSerializable("share_kit_panel");
            if (serializable3 instanceof ShareKitPanel) {
                shareKitPanel = (ShareKitPanel) serializable3;
            } else {
                shareKitPanel = null;
            }
            creativeFlowData.setShareKitPanel(shareKitPanel);
        }
        AVMusic aVMusicExtractAVMusic3 = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic3 != null && aVMusicExtractAVMusic3.getDuration() > 0) {
            shortVideoContext.LJJLIIIJ(aVMusicExtractAVMusic3.getDuration());
        }
        AVMusicWaveBean aVMusicWaveBeanZk = o.LJI.Zk(bundle.getSerializable("music_wave_data"));
        if ((aVMusicWaveBeanZk != null && C15R6.LJ(aVMusicWaveBeanZk.getMusicWavePointArray())) || ((aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel)) != null && C15R6.LJ(aVMusicExtractAVMusic.getMusicWaveData()) && (aVMusicWaveBeanZk = C15R5.LIZLLL(aVMusicExtractAVMusic)) != null && C15R6.LJ(aVMusicWaveBeanZk.getMusicWavePointArray()))) {
            shortVideoContext.musicWaveBean = C15R5.LIZIZ(aVMusicWaveBeanZk);
        } else if (shortVideoContext.cameraComponentModel.mMusicPath != null && !C298140BmO.LIZ()) {
            C15R5.LJFF(shortVideoContext.cameraComponentModel.mMusicPath, new C15RH() { // from class: X.0nmz
                @Override // X.C15RH
                public final void LIZ(AVMusicWaveBean aVMusicWaveBean) {
                    if (aVMusicWaveBean != null) {
                        shortVideoContext.musicWaveBean = C15R5.LIZIZ(aVMusicWaveBean);
                    }
                }
            });
        }
        CreationFeatureBridge.Companion.getClass();
        C1448200nn0.LIZ().onShootContextUpdated(shortVideoContext);
    }
}
