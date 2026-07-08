package X;

import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEditModel;
import com.ss.android.ugc.aweme.creative.model.photomode.ImagePublishBackSaveModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishSecureModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0XgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C854840XgA implements IEvent {
    public String LIZ;
    public List<AVTextExtraStruct> LIZIZ;
    public String LIZJ;
    public List<AVTextExtraStruct> LIZLLL;
    public String LJ;
    public final String LJFF;
    public final boolean LJI;
    public PoiData LJII;
    public final int LJIIIIZZ;
    public final List<AVChallenge> LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public final C855090XgZ LJIIL;
    public StickerNewEngineModel LJIILIIL;
    public final CompileProbeResult LJIILJJIL;
    public String LJIILL;
    public int LJIILLIIL;
    public final List<String> LJIIZILJ;
    public String LJIJ;
    public CommerceToolsTcmModel LJIJI;
    public boolean LJIJJ;
    public String LJIJJLI;
    public long LJIL;
    public String LJJ;
    public CopyOnWriteArrayList<CoverNewItem> LJJI;
    public String LJJIFFI;
    public String LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public int LJJIJ;
    public List<InteractionTagUserInfo> LJJIJIIJI;
    public List<User> LJJIJIIJIL;
    public ImageAlbumData LJJIJIL;
    public ArrayList<ImportVideoInfo> LJJIJL;
    public int LJJIJLIJ;
    public String LJJIL;
    public boolean LJJIZ;
    public boolean LJJJ;
    public HashMap<Integer, PreCheckResultModel> LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public EditDescMobModel LJJJJI;
    public ImagePublishBackSaveModel LJJJJIZL;
    public int LJJJJJ;
    public boolean LJJJJLI;
    public int LJJJJLL;
    public int LJJJJZ;
    public int LJJJJZI;
    public int LJJJLIIL;
    public int LJJJLZIJ;
    public int LJJJZ;
    public String LJJL;
    public boolean LJJLI;
    public int LJJLIIIIJ;
    public boolean LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public LivePhotoModel LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public int LJJIIZ = -1;
    public String LJJIIZI = "";
    public String LJJJJJL = "";
    public String LJJJJL = "";
    public String LJJJLL = "";
    public String LJJLIIIJLJLI = "";

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        int size;
        if (!videoPublishEditModel.getCreationId().equals(this.LJJIL)) {
            return;
        }
        videoPublishEditModel.setTitle(this.LIZ);
        videoPublishEditModel.setStructList(this.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBackEvent: markupMetadata size: ");
        List<AVTextExtraStruct> list = this.LIZLLL;
        if (list != null) {
            size = ((ArrayList) list).size();
        } else {
            size = -1;
        }
        sbLIZ.append(size);
        C201955140j.LIZIZ("dzy_hashtag", C2188811AlT.LIZIZ(sbLIZ));
        C0CHQ.LIZ().getPublishService().LJIIJJI();
        if (C856610Xj1.LIZ(videoPublishEditModel)) {
            CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
            captionModel.markupText = this.LIZJ;
            List<AVTextExtraStruct> list2 = this.LIZLLL;
            if (list2 != null) {
                captionModel.markupExtra = list2;
            }
        } else {
            PostPageModel postPageModel = videoPublishEditModel.creativeModel.postPageModel;
            postPageModel.markupCaption = this.LIZJ;
            List<AVTextExtraStruct> list3 = this.LIZLLL;
            if (list3 != null) {
                postPageModel.markupExtra = list3;
            }
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        PostPageModel postPageModel2 = creativeModel.postPageModel;
        postPageModel2.customCoverPath = this.LJJIFFI;
        postPageModel2.customCoverOriginalPath = this.LJJII;
        CoverPublishModel coverPublishModel = creativeModel.coverPublishModel;
        if (coverPublishModel != null) {
            coverPublishModel.setNewCoverList(this.LJJI);
        }
        CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
        CommonMobParamModel commonMobParamModel = creativeModel2.commonMobModel;
        commonMobParamModel.hasClickRecommendHashtag = this.LJJIZ;
        EditDescMobModel editDescMobModel = this.LJJJJI;
        if (editDescMobModel != null) {
            commonMobParamModel.editDescMobModel = editDescMobModel;
        }
        ImagePublishBackSaveModel imagePublishBackSaveModel = this.LJJJJIZL;
        if (imagePublishBackSaveModel != null) {
            creativeModel2.imagePublishBackSaveModel = imagePublishBackSaveModel;
        }
        PublishSecureModel publishSecureModel = creativeModel2.publishSecureModel;
        publishSecureModel.coverSecureSalt = this.LJJJJJL;
        publishSecureModel.coverMD5 = this.LJJJJL;
        videoPublishEditModel.setHeading(this.LJ);
        videoPublishEditModel.isPrivate = this.LJIIIIZZ;
        videoPublishEditModel.challenges = this.LJIIIZ;
        videoPublishEditModel.commentSetting = this.LJIIJ;
        videoPublishEditModel.creativeModel.privacySettingModel.contentCheckInfo.manualChangeSwitch = this.LJIIJJI;
        videoPublishEditModel.setCompileProbeResult(this.LJIILJJIL);
        videoPublishEditModel.commerceData = this.LJIILL;
        videoPublishEditModel.autoCaptionLang = this.LJIJ;
        videoPublishEditModel.allowDownloadSetting = this.LJIILLIIL;
        videoPublishEditModel.setMicroAppId(null);
        videoPublishEditModel.setMicroAppModel(null);
        videoPublishEditModel.setChain(this.LJFF);
        videoPublishEditModel.setDisableDeleteChain(this.LJI);
        videoPublishEditModel.geofencingSetting = this.LJIIZILJ;
        videoPublishEditModel.setDraftMusicIllegal(this.LJIJJ);
        videoPublishEditModel.playlist_id = this.LJJ;
        videoPublishEditModel.playlist_name = this.LJIJJLI;
        List<InteractionTagUserInfo> list4 = this.LJJIJIIJI;
        if (list4 != null && !list4.isEmpty()) {
            videoPublishEditModel.setTagUserList(new ArrayList<>(this.LJJIJIIJI));
        } else {
            videoPublishEditModel.setTagUserList(null);
        }
        List<User> list5 = this.LJJIJIIJIL;
        if (list5 != null && !list5.isEmpty()) {
            videoPublishEditModel.creativeModel.collabInfoModel.setCollabUserList(new ArrayList(this.LJJIJIIJIL));
        } else {
            videoPublishEditModel.creativeModel.collabInfoModel.setCollabUserList(null);
        }
        videoPublishEditModel.getEditorProModel().setBackFromPublishTimestamp(this.LJIL);
        CreativeModel creativeModel3 = videoPublishEditModel.creativeModel;
        creativeModel3.postPageModel.isEnterFromEPDirectly = false;
        creativeModel3.audioCopyrightDetectModel.setChangeMusicImmediately(this.LJJIII);
        videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setEditorProImmediately(this.LJJIIJ);
        videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setHasShopAnchor(this.LJJIIJZLJL);
        videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setDetectResults(this.LJJJI);
        videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setLastDetectResults(this.LJJJI);
        int i = this.LJJIIZ;
        if (i > -1) {
            videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setOperation(i);
        }
        if (!this.LJJIIZI.isEmpty()) {
            videoPublishEditModel.creativeModel.audioCopyrightDetectModel.setChangeMusicFrom(this.LJJIIZI);
        }
        videoPublishEditModel.creativeModel.musicBuzModel.isBestMatch = this.LJJLIIIJ;
        C855090XgZ c855090XgZ = this.LJIIL;
        c855090XgZ.getClass();
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            videoPublishEditModel.setCoverPublishModel(c855090XgZ.LIZJ);
        } else if (videoPublishEditModel.isMvThemeVideoType() && videoPublishEditModel.getMvCreateVideoData() != null) {
            MvCreateVideoData mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
            if (mvCreateVideoData != null) {
                mvCreateVideoData.videoCoverStartTime = c855090XgZ.LIZ;
                mvCreateVideoData.videoCoverImgPath = c855090XgZ.LIZIZ;
            }
            videoPublishEditModel.setCoverPublishModel(c855090XgZ.LIZJ);
        } else {
            videoPublishEditModel.setVideoCoverStartTm(c855090XgZ.LIZ / LSPassThroughRecordSizeConfig.DEFAULT);
            videoPublishEditModel.setCoverPublishModel(c855090XgZ.LIZJ);
        }
        if (C0CHQ.LIZ().getPublishService().LJJJZ()) {
            videoPublishEditModel.setPoiData(this.LJII);
        }
        int i2 = this.LJJIJ;
        if (i2 != 0) {
            videoPublishEditModel.creativeModel.commerceModel.setMusicUsageConfirmation(i2);
        }
        CommerceToolsTcmModel commerceToolsTcmModel = this.LJIJI;
        if (commerceToolsTcmModel != null) {
            videoPublishEditModel.creativeModel.commerceModel.setTcmModel(commerceToolsTcmModel);
        }
        StickerNewEngineModel stickerNewEngineModel = this.LJIILIIL;
        if (stickerNewEngineModel != null) {
            stickerNewEngineModel.lyricEffectAnchorRemoved = false;
            videoPublishEditModel.creativeModel.stickerModel = stickerNewEngineModel;
        }
        videoPublishEditModel.getCreativeFlowData().getPublishConfig().setMatureTheme(this.LJJIJLIJ);
        CreativeModel creativeModel4 = videoPublishEditModel.creativeModel;
        PrivacySettingModel privacySettingModel = creativeModel4.privacySettingModel;
        privacySettingModel.isSubscribeOnly = this.LJJJ;
        PUgcTemplateData pUgcTemplateData = creativeModel4.pugcTemplateData;
        pUgcTemplateData.canPostTemplate = this.LJJJIL;
        pUgcTemplateData.isFromCreateTemplate = this.LJJJJ;
        AIGCInfo aIGCInfo = privacySettingModel.aigcInfo;
        aIGCInfo.AIGCLabelType = this.LJJJJJ;
        aIGCInfo.manualChangeSwitch = this.LJJJJLI;
        videoPublishEditModel.reactDuetSetting = this.LJJJJLL;
        videoPublishEditModel.stitchSetting = this.LJJJJZ;
        privacySettingModel.allowCreateSticker = this.LJJJJZI;
        privacySettingModel.allowShareToStory = this.LJJJLIIL;
        privacySettingModel.contentReusePermission = this.LJJJLZIJ;
        privacySettingModel.allowAIRemix = this.LJJJZ;
        DefaultPostContentModel defaultPostContentModel = creativeModel4.initialModel.defaultPostContentModel;
        if (defaultPostContentModel != null) {
            defaultPostContentModel.defaultDescription = "";
            defaultPostContentModel.defaultTitle = "";
        }
        String str = this.LJJL;
        if (str != null) {
            videoPublishEditModel.setNleData(str);
        }
        ImageEditModel imageEditModel = videoPublishEditModel.creativeModel.imageEditModel;
        imageEditModel.enterFromImagePublishPreview = this.LJJLI;
        imageEditModel.selectedImageIndex = this.LJJLIIIIJ;
        if (C298900Bnc.LIZ()) {
            videoPublishEditModel.creativeModel.pugcTemplateData.templateTitle = this.LJJJLL;
        }
        CreativeModel creativeModel5 = videoPublishEditModel.creativeModel;
        CommonMobParamModel commonMobParamModel2 = creativeModel5.commonMobModel;
        commonMobParamModel2.originVideoCount = this.LJJLIIIJILLIZJL;
        commonMobParamModel2.originPhotoCount = this.LJJLIIIJJI;
        PostPageModel postPageModel3 = creativeModel5.postPageModel;
        postPageModel3.isHashtagLimitToastShown = this.LJJLIIIJL;
        EditSaveLocalModel editSaveLocalModel = creativeModel5.editSaveLocalModel;
        editSaveLocalModel.isClickQuickPublishToNext = false;
        editSaveLocalModel.isBackFromQuickPublish = editSaveLocalModel.isFromQuickPublish;
        postPageModel3.draftPanelModel.draftPanelSelectedVisibility = this.LJJLIIIJLJLI;
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AIGCManager -> VideoPublishBackEvent -> manualChangeSwitch = ");
        sbLIZ2.append(this.LJJJJLI);
        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ2));
        Iterator it2 = ((ArrayList) C855640XhS.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC855650XhT) it2.next()).LIZIZ();
        }
    }

    public C854840XgA(String str, String str2, boolean z, List list, int i, List list2, C855090XgZ c855090XgZ, CompileProbeResult compileProbeResult, List list3, C855330Xgx c855330Xgx) {
        this.LIZ = str;
        this.LJFF = str2;
        this.LJI = z;
        this.LIZIZ = list;
        this.LJIIIIZZ = i;
        this.LJIIIZ = list2;
        this.LJIIL = c855090XgZ;
        this.LJIILJJIL = compileProbeResult;
        this.LJIIZILJ = list3;
    }
}
