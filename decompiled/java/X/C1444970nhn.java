package X;

import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.GroupShotDataModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.CameraPageConfig;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMMediaModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.GroupShotParam;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeCommonModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeRecordModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMEffectModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMGameCameraInfo;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMStickerFontData;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.Photo2StickerStatus;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

/* JADX INFO: renamed from: X.0nhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444970nhn {
    public static final CreativeModel LIZ(IMCreativeEditModel iMCreativeEditModel) {
        DMCameraModel dMCameraModel;
        DMMediaModel dMMediaModel;
        CreativeModel creativeModelLJIIIIZZ = C0MUK.LJIIIIZZ();
        CreativeInitialModel creativeInitialModel = new CreativeInitialModel(new ProfileParametersModel(""), new DMCameraModel(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null), null, null, null, null, null, null, new HighLightVideoParametersModel(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, 2097151, null), null, null, null, null, null, null, null, null, null, null, null, null, new CollectMusicModel(null, false, false, false, false, null));
        DMCameraModelMirror dMCameraModelMirror = iMCreativeEditModel.dmCameraModelMirror;
        if (dMCameraModelMirror != null) {
            dMCameraModel = LIZIZ(dMCameraModelMirror);
        } else {
            dMCameraModel = new DMCameraModel(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null);
        }
        creativeInitialModel.dmCameraModel = dMCameraModel;
        creativeModelLJIIIIZZ.initialModel = creativeInitialModel;
        DMMediaModelMirror dMMediaModelMirror = iMCreativeEditModel.dmMediaModelMirror;
        if (dMMediaModelMirror != null) {
            dMMediaModel = LIZJ(dMMediaModelMirror);
        } else {
            dMMediaModel = new DMMediaModel(0, "", "", "", false, false, false, null);
        }
        creativeModelLJIIIIZZ.dmMediaModel = dMMediaModel;
        creativeModelLJIIIIZZ.creativeInfo = new CreativeInfo(iMCreativeEditModel.creationId, 0, null, 6, null);
        return creativeModelLJIIIIZZ;
    }

    public static final DMCameraModel LIZIZ(DMCameraModelMirror dMCameraModelMirror) {
        GroupShotDataModel groupShotDataModel;
        boolean z = dMCameraModelMirror.enterFromDM;
        String str = dMCameraModelMirror.enterMethodDM;
        String str2 = dMCameraModelMirror.enterDM;
        boolean z2 = dMCameraModelMirror.shouldDisplayRestrictSharingNoticeShooting;
        boolean z3 = dMCameraModelMirror.shouldDisplayTnsNoticeShooting;
        boolean z4 = dMCameraModelMirror.shouldDisplayRecordGuide;
        String str3 = dMCameraModelMirror.receiverNickname;
        Boolean bool = dMCameraModelMirror.isVideo;
        int i = dMCameraModelMirror.maxSelectableVideoDuration;
        boolean z5 = dMCameraModelMirror.shouldDisplayTnsNoticeAlbum;
        int i2 = dMCameraModelMirror.tnsNoticeRes;
        String str4 = dMCameraModelMirror.sessionID;
        int i3 = dMCameraModelMirror.chatType;
        String str5 = dMCameraModelMirror.effectName;
        String str6 = dMCameraModelMirror.effectIconUrl;
        boolean z6 = dMCameraModelMirror.hasReportedFirstCrossClick;
        boolean z7 = dMCameraModelMirror.isBulletin;
        boolean z8 = dMCameraModelMirror.enableTextStickerOnRecord;
        Long l = dMCameraModelMirror.effectTriggerMsgSentServerTime;
        Map<String, String> map = dMCameraModelMirror.openCameraOrAlbumMobMap;
        Map<String, String> map2 = dMCameraModelMirror.openCameraOrAlbumMobMapV2;
        String str7 = dMCameraModelMirror.photoSwapScene;
        String str8 = dMCameraModelMirror.photoSwapPairedMsgId;
        String str9 = dMCameraModelMirror.enterMethodType;
        String str10 = dMCameraModelMirror.enterMethod;
        boolean z9 = dMCameraModelMirror.enablePhotoSwap;
        boolean z10 = dMCameraModelMirror.enableGroupShot;
        boolean z11 = dMCameraModelMirror.enablePlayground;
        GroupShotParam groupShotParam = dMCameraModelMirror.groupShotData;
        if (groupShotParam != null) {
            groupShotDataModel = new GroupShotDataModel(groupShotParam.sessionIds, groupShotParam.shouldDisplayInviteToast, groupShotParam.groupShotTemplateId, groupShotParam.groupShotTaskId, groupShotParam.refMessageId);
        } else {
            groupShotDataModel = null;
        }
        return new DMCameraModel(z, str, str2, z2, z3, z4, str3, bool, i, z5, i2, str4, i3, str5, str6, z6, z7, null, z8, l, map, map2, str7, str8, str9, str10, z9, z10, z11, groupShotDataModel, dMCameraModelMirror.toUserId, dMCameraModelMirror.searchSessionId, dMCameraModelMirror.isFromEffectButton, dMCameraModelMirror.initialEffectId, dMCameraModelMirror.fetchGroupEffectForAIGroupShot, dMCameraModelMirror.isStoryQuickImmersiveReply, dMCameraModelMirror.enterDMWay, null, dMCameraModelMirror.quoteMode, 0L, false, null, null, null, null);
    }

    public static final DMMediaModel LIZJ(DMMediaModelMirror dMMediaModelMirror) {
        GroupShotDataModel groupShotDataModel;
        int i = dMMediaModelMirror.type;
        String str = dMMediaModelMirror.photoFile;
        String str2 = dMMediaModelMirror.synthesisedFile;
        String str3 = dMMediaModelMirror.outputCoverFile;
        boolean z = dMMediaModelMirror.isSynthesised;
        boolean z2 = dMMediaModelMirror.skipExtractVideoCover;
        boolean z3 = dMMediaModelMirror.isFromMainPost;
        GroupShotParam groupShotParam = dMMediaModelMirror.groupShotData;
        if (groupShotParam != null) {
            groupShotDataModel = new GroupShotDataModel(groupShotParam.sessionIds, groupShotParam.shouldDisplayInviteToast, groupShotParam.groupShotTemplateId, groupShotParam.groupShotTaskId, groupShotParam.refMessageId);
        } else {
            groupShotDataModel = null;
        }
        return new DMMediaModel(i, str, str2, str3, z, z2, z3, groupShotDataModel);
    }

    public static final TextStickerModel LJ(IMStickerFontData iMStickerFontData) {
        String text = iMStickerFontData.getText();
        BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.TEXT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, iMStickerFontData.getTranslationY(), 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.7f, null, null, null, false, 2143289339, 15, null);
        int style = iMStickerFontData.getStyle();
        int color = iMStickerFontData.getColor();
        String fontResId = iMStickerFontData.getFontResId();
        if (fontResId == null) {
            fontResId = "";
        }
        return new TextStickerModel(baseStickerModel, null, null, text, null, style, color, 0, 0.0f, new TextFontModel(null, fontResId, null, null, null, null, 0, 0, null, null, false, false, false, 0, 16381, null), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, true, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -7786, 65533, null);
    }

    public static final IMCreativeRecordModel LIZLLL(CreativeInitialModel creativeInitialModel, String str, CameraPageConfig cameraPageConfig, Effect effect, DMCreativeStickerFontData dMCreativeStickerFontData, String str2) {
        GroupShotParam groupShotParam;
        IMStickerFontData iMStickerFontData;
        String str3 = str2;
        DMCameraModel dMCameraModel = creativeInitialModel.dmCameraModel;
        boolean z = dMCameraModel.enterFromDM;
        String str4 = dMCameraModel.enterMethodDM;
        String str5 = dMCameraModel.enterDM;
        boolean z2 = dMCameraModel.shouldDisplayRestrictSharingNoticeShooting;
        boolean z3 = dMCameraModel.shouldDisplayTnsNoticeShooting;
        boolean z4 = dMCameraModel.shouldDisplayRecordGuide;
        String str6 = dMCameraModel.receiverNickname;
        Boolean bool = dMCameraModel.isVideo;
        int i = dMCameraModel.maxSelectableVideoDuration;
        boolean z5 = dMCameraModel.shouldDisplayTnsNoticeAlbum;
        int i2 = dMCameraModel.tnsNoticeRes;
        String str7 = dMCameraModel.sessionID;
        int i3 = dMCameraModel.chatType;
        String str8 = dMCameraModel.effectName;
        String str9 = dMCameraModel.effectIconUrl;
        boolean z6 = dMCameraModel.hasReportedFirstCrossClick;
        boolean z7 = dMCameraModel.isBulletin;
        boolean z8 = dMCameraModel.enableTextStickerOnRecord;
        Long l = dMCameraModel.effectTriggerMsgSentServerTime;
        Map<String, String> map = dMCameraModel.openCameraOrAlbumMobMap;
        Map<String, String> map2 = dMCameraModel.openCameraOrAlbumMobMapV2;
        String str10 = dMCameraModel.photoSwapScene;
        String str11 = dMCameraModel.photoSwapPairedMsgId;
        String str12 = dMCameraModel.enterMethodType;
        String str13 = dMCameraModel.enterMethod;
        boolean z9 = dMCameraModel.enablePhotoSwap;
        boolean z10 = dMCameraModel.enableGroupShot;
        boolean z11 = dMCameraModel.enablePlayground;
        GroupShotDataModel groupShotDataModel = dMCameraModel.groupShotData;
        if (groupShotDataModel != null) {
            groupShotParam = new GroupShotParam(groupShotDataModel.sessionIds, groupShotDataModel.shouldDisplayInviteToast, groupShotDataModel.groupShotTemplateId, groupShotDataModel.groupShotTaskId, groupShotDataModel.refMessageId);
        } else {
            groupShotParam = null;
        }
        DMCameraModelMirror dMCameraModelMirror = new DMCameraModelMirror(z, str4, str5, z2, z3, z4, str6, bool, i, z5, i2, str7, i3, str8, str9, z6, z7, z8, l, map, map2, str10, str11, str12, str13, z9, z10, z11, groupShotParam, dMCameraModel.toUserId, dMCameraModel.searchSessionId, dMCameraModel.isFromEffectButton, dMCameraModel.initialEffectId, dMCameraModel.fetchGroupEffectForAIGroupShot, dMCameraModel.isStoryQuickImmersiveReply, dMCameraModel.enterDMWay, dMCameraModel.quoteMode);
        IMEffectModel iMEffectModel = new IMEffectModel(effect);
        if (dMCreativeStickerFontData != null) {
            iMStickerFontData = new IMStickerFontData(dMCreativeStickerFontData.getText(), dMCreativeStickerFontData.getFontResId(), dMCreativeStickerFontData.getStyle(), dMCreativeStickerFontData.getTranslationY(), dMCreativeStickerFontData.getColor());
        } else {
            iMStickerFontData = null;
        }
        DMCameraModel dMCameraModel2 = creativeInitialModel.dmCameraModel;
        int i4 = dMCameraModel2.chatType;
        if (str3 == null) {
            str3 = "chat";
        }
        String str14 = dMCameraModel2.enterDM;
        String str15 = dMCameraModel2.enterMethodDM;
        return new IMCreativeRecordModel(str, dMCameraModelMirror, iMEffectModel, iMStickerFontData, (IMGameCameraInfo) null, (Photo2StickerStatus.ENABLED) null, new IMCreativeCommonModel(str3, str14, i4, str15, dMCameraModel2.enterDMWay, dMCameraModel2.shouldDisplayRestrictSharingNoticeShooting, dMCameraModel2.tnsNoticeRes, dMCameraModel2.photoSwapScene, dMCameraModel2.photoSwapPairedMsgId, dMCameraModel2.quoteMode, dMCameraModel2.sessionID, dMCameraModel2.enterMethod, dMCameraModel2.enterMethodType, str15), cameraPageConfig, 176);
    }
}
