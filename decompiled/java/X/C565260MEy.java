package X;

import Y.AObjectS241S0100000_8;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoSwitchFromImageModel;
import com.ss.android.ugc.aweme.creative.model.ailive.BlipData;
import com.ss.android.ugc.aweme.creative.model.ailive.EditSwitchStyle;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.publish.PublishModel;
import com.ss.android.ugc.aweme.creative.model.template.MvModel;
import com.ss.android.ugc.aweme.image.switchmode.payload.SidebarActionPayload;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.gamora.editor.ailive.newprompt.NewPromptPageModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565260MEy extends AbstractC2255721DQs<C0MEI> implements C0MEI, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C1439810nZT.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0MF0.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC578430MmP.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), C565960MHq.class, null);

    public C0MEI X1() {
        return this;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C565260MEy.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C565260MEy.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C565260MEy.class, "imageEditPageData", "getImageEditPageData()Lcom/ss/android/ugc/aweme/image/switchmode/ImageEditPageData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C565260MEy.class, "imageModeSwitchActionApi", "getImageModeSwitchActionApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchActionApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C565260MEy.class, "switchModeApi", "getSwitchModeApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C565260MEy.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C565260MEy.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C565260MEy.class, "handleResultComponent", "getHandleResultComponent()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/functions/AILiveImageHandleResultComponent;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLJILJIL = 8;
    }

    private final C1439810nZT G2() {
        return (C1439810nZT) this.LLILZIL.getValue(this, LLJIJIL[2]);
    }

    private final C0MF0 H2() {
        return (C0MF0) this.LLILZLL.getValue(this, LLJIJIL[3]);
    }

    private final AbstractC214814194y T2() {
        return (AbstractC214814194y) this.LLILZ.getValue(this, LLJIJIL[1]);
    }

    private final InterfaceC578430MmP W2() {
        return (InterfaceC578430MmP) this.LLIZ.getValue(this, LLJIJIL[4]);
    }

    private final InterfaceC1451050nrb Z1() {
        return (InterfaceC1451050nrb) this.LLIZLLLIL.getValue(this, LLJIJIL[5]);
    }

    private final InterfaceC1460000o62 o2() {
        return (InterfaceC1460000o62) this.LLJ.getValue(this, LLJIJIL[6]);
    }

    private final C565960MHq w2() {
        return (C565960MHq) this.LLJI.getValue(this, LLJIJIL[7]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJIJIL[0]);
    }

    private final void i3() {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        Context sceneContext;
        AbstractC1452680nuE abstractC1452680nuEGc = Z1().gc();
        if (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (sceneContext = this.LL.getSceneContext()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C0MCR c0mcr = C0MCR.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        NLEModel model = nLEEditor.getModel();
        c0mcr.getClass();
        C786410Ut5.LJJIJL(bundle, "ai_live_new_prompt_model", new NewPromptPageModel(C0MCR.LJFF(editModel, model), C0MDI.IMAGE_EDITOR));
        C1428470nHB.LLIL(bundle, getEditModel());
        C0MUK.LJIIJ(bundle, getEditModel().creativeModel);
        C0MWH.LIZ.getClass();
        C0MWH.LIZIZ(sceneContext, bundle);
    }

    public final void c3() {
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        InterfaceC1460000o62 interfaceC1460000o62O2 = o2();
        if (interfaceC1460000o62O2 != null) {
            interfaceC1460000o62O2.Nn2(1800, AFwS239S0000000_8.get$arr$(185));
        }
        if (C0C06.LIZ()) {
            i3();
            return;
        }
        int iH7 = Z1().h7();
        ImageAlbumData imageAlbumData = getEditModel().creativeModel.imageAlbumModel;
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || (singleImageData = (SingleImageData) ListProtector.get(imageList, iH7)) == null) {
            return;
        }
        m3(singleImageData, null);
    }

    @Override // X.C0MEI
    public String m30() {
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcImageInfo srcImageInfo;
        String path;
        ImageAlbumData imageAlbumData = getEditModel().creativeModel.imageAlbumModel;
        return (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || (singleImageData = (SingleImageData) ListProtector.get(imageList, Z1().h7())) == null || (srcImageInfo = singleImageData.getSrcImageInfo()) == null || (path = srcImageInfo.getPath()) == null) ? "" : path;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<SingleImageData> liveDataY;
        super.onCreate();
        C565960MHq c565960MHqW2 = w2();
        if (c565960MHqW2 == null || (liveDataY = c565960MHqW2.Y()) == null) {
            return;
        }
        liveDataY.observe(this, new AObjectS241S0100000_8(this, 43));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    private final Bundle W1(SingleImageData singleImageData) {
        ImageVideoSharedModel imageVideoSharedModel;
        List<SingleImageData> imageList;
        SingleImageData singleImageData2;
        Bundle bundleBJ2 = W2().BJ2();
        if (bundleBJ2 == null) {
            bundleBJ2 = C571310Mav.LIZ(T2().mArguments);
        }
        G2().LIZJ = true;
        bundleBJ2.remove("av_et_parameter");
        CreativeModel creativeModelLIZJ = C0MUK.LIZJ(bundleBJ2);
        creativeModelLIZJ.draftInfoModel.isDraft = getEditModel().creativeModel.draftInfoModel.isDraft;
        NLEInfoModel nLEInfoModel = creativeModelLIZJ.nleInfoModel;
        nLEInfoModel.nleData = null;
        nLEInfoModel.nleModel = null;
        creativeModelLIZJ.editModel.multiEditVideoStatusRecordData = null;
        creativeModelLIZJ.videoImageSeparateSwitchModel = null;
        EditVideoSegment editVideoSegment = new EditVideoSegment("", null, new VideoFileInfo(1080, 1920, 10000L, 0, 0, 0, 0, 0, 0.0f, 504, null));
        CanvasVideoData canvasVideoData = new CanvasVideoData(null, null, null, null, null, 0, null, 0, null, null, null, null, 4095, null);
        creativeModelLIZJ.canvasVideoData = canvasVideoData;
        canvasVideoData.setCanvasType(0);
        CanvasVideoData canvasVideoData2 = creativeModelLIZJ.canvasVideoData;
        if (canvasVideoData2 != null) {
            canvasVideoData2.setSourceInfo(C1697810uHb.LJIILJJIL(singleImageData.getSrcImageInfo().getPath()));
        }
        CanvasVideoData canvasVideoData3 = creativeModelLIZJ.canvasVideoData;
        if (canvasVideoData3 != null) {
            ImageAlbumData imageAlbumData = getEditModel().creativeModel.imageAlbumModel;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData2 = (SingleImageData) C13LP.LJJJLL(imageList)) != null) {
                imageVideoSharedModel = singleImageData2.getImageVideoSharedModel();
            } else {
                imageVideoSharedModel = null;
            }
            canvasVideoData3.setImageVideoSharedModel(imageVideoSharedModel);
        }
        CanvasVideoData canvasVideoData4 = creativeModelLIZJ.canvasVideoData;
        if (canvasVideoData4 != null) {
            canvasVideoData4.setAigcInfo(singleImageData.getAigcInfo());
        }
        creativeModelLIZJ.editModel.editPreviewInfo = new C538330L9j(1080, 1920, 12).LIZ(editVideoSegment);
        creativeModelLIZJ.creationTypeModel.videoEditorType = 11;
        PublishModel publishModel = creativeModelLIZJ.publishModel;
        publishModel.videoCanvasWidth = 1080;
        publishModel.videoCanvasHeight = 1920;
        creativeModelLIZJ.commonMobModel.originVideoCount = getEditModel().creativeModel.commonMobModel.originVideoCount;
        creativeModelLIZJ.commonMobModel.originPhotoCount = getEditModel().creativeModel.commonMobModel.originPhotoCount;
        creativeModelLIZJ.recordData.origin = getEditModel().getOrigin();
        creativeModelLIZJ.mvModel = new MvModel(null, -1, null, null, null, -1, null, -1, false, null, false, null, null, false, false, false);
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct = creativeModelLIZJ.uploadMiscInfoStruct;
        if (aVUploadMiscInfoStruct != null) {
            aVUploadMiscInfoStruct.mvInfo = null;
            aVUploadMiscInfoStruct.mvThemeId = null;
        }
        creativeModelLIZJ.livePhotoModel = null;
        AILivePhotoModel aILivePhotoModel = getEditModel().creativeModel.aiLivePhotoModel;
        aILivePhotoModel.switchFromImageModel = new AILivePhotoSwitchFromImageModel(EditSwitchStyle.IMAGE_TO_VIDE, Long.valueOf(System.currentTimeMillis()), 4);
        BlipData blipData = aILivePhotoModel.pageDataCache.blip;
        if (blipData != null && !Intrinsics.LJFF(blipData.path, m30())) {
            C559010LwB.LIZJ("AILivePhotoPromptManager", "clear blip");
            aILivePhotoModel.LJIILLIIL(AFwS239S0000000_8.get$arr$(184));
        }
        creativeModelLIZJ.aiLivePhotoModel = aILivePhotoModel;
        return bundleBJ2;
    }

    @Override // X.C0MEI
    public void Kb2(AbstractC564980MDw abstractC564980MDw) {
        JL0(new C565270MEz(this), AFwS194S0000000_8.get$arr$(269));
    }

    public C565260MEy(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    @Override // X.C0MEI
    public void JL0(Function0<Unit> function0, Function0<Unit> function02) {
        C0M8O.LIZ.getClass();
        if (C0M8O.LIZJ()) {
            function0.invoke();
            return;
        }
        C0MES c0mes = C0MES.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        C19A3 c19a3 = this.LL;
        VideoPublishEditModel editModel = getEditModel();
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(function0, (Function0<Unit>) 583);
        c0mes.getClass();
        C0MES.LJFF(contextLJIIIZ, c19a3, editModel, null, "image_edit_page", R.id.mbc, awS552S0100000_8, null, null);
    }

    public final void m3(SingleImageData singleImageData, Function1<? super Bundle, Unit> function1) {
        SidebarActionPayload sidebarActionPayload = new SidebarActionPayload(1800);
        Bundle bundleW1 = W1(singleImageData);
        if (function1 != null) {
            function1.invoke(bundleW1);
        }
        H2().z50(sidebarActionPayload, bundleW1);
    }
}
