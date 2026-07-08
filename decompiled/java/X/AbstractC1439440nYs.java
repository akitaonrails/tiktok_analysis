package X;

import Y.ARunnableS122S0100000_22;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.StoryLivePhotoMode;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.publish.publishcheck.CheckManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.story.service.IStoryMentionShareService;
import com.ss.android.ugc.aweme.utils.HashTagService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS486S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1439440nYs extends AbstractC2255721DQs<C0MHM> implements C0MHM, InterfaceC379610EuV {
    public static final C1439530nZ1 LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final C1DRG LL;
    public boolean LLIZ;
    public boolean LLJI;
    public final C0MHM LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final C01GW LLJ = C1449630npJ.LIZIZ(this, InterfaceC1444410ngt.class);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1439570nZ5.class, null);

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0nZ1] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1439440nYs.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AbstractC1439440nYs.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(AbstractC1439440nYs.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(AbstractC1439440nYs.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C2217381BqS(AbstractC1439440nYs.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(AbstractC1439440nYs.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0), new C2217381BqS(AbstractC1439440nYs.class, "storyEditSpeedTestApi", "getStoryEditSpeedTestApi()Lcom/ss/android/ugc/aweme/story/edit/StoryEditSpeedTestApi;", 0)};
        LLJILJILJ = new Object() { // from class: X.0nZ1
        };
        LLJJ = 8;
    }

    public abstract String H2();

    public final void i3() {
        v3(false);
        Intent intent = new Intent();
        intent.putExtra("new_uri", o2().creativeModel.changeAvatarModel.avatarStruct.getNewAvatarUri());
        intent.putExtra("new_url", o2().creativeModel.changeAvatarModel.newAvatarUrl);
        T2().setResult(9, intent);
        T2().finish();
    }

    private final InterfaceC1444410ngt G2() {
        return (InterfaceC1444410ngt) this.LLJ.getValue();
    }

    private final void O3() {
        IStoryMentionShareService iStoryMentionShareService = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
        if (iStoryMentionShareService == null) {
            return;
        }
        int privateAccountAllowReshareStoryType = o2().creativeModel.storyModel.getPrivateAccountAllowReshareStoryType();
        if (privateAccountAllowReshareStoryType == EnumC1439580nZ6.ENABLE.getValue()) {
            iStoryMentionShareService.LJIIIZ(true);
        } else if (privateAccountAllowReshareStoryType == EnumC1439580nZ6.DISABLE.getValue()) {
            iStoryMentionShareService.LJIIIZ(false);
        }
    }

    private final AbstractC214814194y T2() {
        return (AbstractC214814194y) this.LLILLL.getValue(this, LLJILLL[0]);
    }

    private final InterfaceC1439570nZ5 W2() {
        return (InterfaceC1439570nZ5) this.LLJILJIL.getValue(this, LLJILLL[6]);
    }

    private final InterfaceC1451520nsM X1() {
        return (InterfaceC1451520nsM) this.LLJIJIL.getValue(this, LLJILLL[5]);
    }

    private final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLIZLLLIL.getValue(this, LLJILLL[4]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILZ.getValue(this, LLJILLL[1]);
    }

    private final InterfaceC1454960nxu w2() {
        return (InterfaceC1454960nxu) this.LLILZLL.getValue(this, LLJILLL[3]);
    }

    public final VideoPublishEditModel o2() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJILLL[2]);
    }

    private final boolean Q3() {
        return o2().isLivePhotoEdit() && o2().getLivePhotoPreviewMode() == LivePhotoPreviewMode.STATIC;
    }

    private final boolean c3() {
        ImageAlbumData imageAlbumData;
        return C297670Bld.LIZ() && C1428470nHB.LJJZZI(o2()) && o2().getImageAlbumData() != null && ((imageAlbumData = o2().getImageAlbumData()) == null || !imageAlbumData.isTempImageMode());
    }

    private final void q3() {
        Integer celebrationType;
        if (C566780MKu.LIZ(o2().creativeModel) && o2().creativeModel.onThisDayData.isFromOnThisDay()) {
            C579920Moo.LIZ(o2(), HashTagService.LIZIZ().LIZ(getActivity().getString(2131821884)));
        }
        CelebrationData celebrationData = o2().creativeModel.celebrationData;
        if (C0MQ1.LIZJ((celebrationData == null || (celebrationType = celebrationData.getCelebrationType()) == null) ? 0 : celebrationType.intValue())) {
            C579920Moo.LIZ(o2(), HashTagService.LIZIZ().LIZ(getActivity().getString(2131833996)));
        }
    }

    public final void B3() {
        o2().creativeModel.postLandingModel.landingBack = false;
        v3(false);
        Intent intent = new Intent();
        intent.putExtra("new_uri", o2().creativeModel.changeAvatarModel.avatarStruct.getNewAvatarUri());
        intent.putExtra("new_url", o2().creativeModel.changeAvatarModel.newAvatarUrl);
        T2().setResult(9, intent);
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
        if (iCreativeSAAService != null) {
            iCreativeSAAService.finishActivitySafely(getActivity());
        }
    }

    public final void H3() {
        C1439210nYV.LIZ().LIZ(1);
        v3(true);
        e4();
    }

    public final void e4() {
        Window window;
        View decorView;
        VideoPublishEditModel videoPublishEditModelO2 = o2();
        getActivity();
        if (C1439620nZA.LIZIZ(videoPublishEditModelO2)) {
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
            Activity activityFindActivityInstance = C0CHQ.LIZ().LJJJJJ().findActivityInstance(C19221910Hx.LIZJ());
            if (activityFindActivityInstance != null && (window = activityFindActivityInstance.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                HandlerHook.viewPost(decorView, new ARunnableS122S0100000_22(activityFindActivityInstance, 62));
            }
            ComplianceServiceProvider.LJIJJLI().LIZJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        r11 = new X.C1439600nZ8(r9.LIZ, r9.LIZJ.g().getValue(), r9.LIZJ, new X.C1439520nZ0(new X.C1439460nYu(r6, r5)));
        r10 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105 A[EDGE_INSN: B:52:0x0105->B:46:0x0105 BREAK  A[LOOP:1: B:39:0x00f2->B:44:0x00ff], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1439440nYs.m3():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        if (this.LLJI) {
            C20622515mp.LIZ(getActivity(), R.anim.gd);
        }
    }

    public C0MHM W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC1439440nYs(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void E3(Function0<Unit> function0) {
        LifecycleOwner activity;
        AbstractC857240Xk2<?> abstractC857240Xk2ZJ;
        if (!C1428470nHB.LJLJJI(o2())) {
            C1428640nHS c1428640nHS = C1428640nHS.LIZ;
            VideoPublishEditModel videoPublishEditModelO2 = o2();
            c1428640nHS.getClass();
            if (!C1428640nHS.LIZLLL(videoPublishEditModelO2)) {
                return;
            }
        }
        C201955140j.LJIILJJIL(C830690WiJ.LIZIZ, "start publish story with checker");
        if (C294080Bfq.LIZ()) {
            activity = T2();
        } else {
            activity = getActivity();
        }
        C857230Xk1 c857230Xk1LIZIZ = CheckManager.LIZIZ(activity, "EditPageLightningPublishChecker");
        c857230Xk1LIZIZ.LIZ(new C856180XiK(getActivity()));
        c857230Xk1LIZIZ.LIZ(new C857290Xk7(getActivity(), o2()));
        InterfaceC1444410ngt interfaceC1444410ngtG2 = G2();
        if (interfaceC1444410ngtG2 != null) {
            abstractC857240Xk2ZJ = interfaceC1444410ngtG2.ZJ(new AwS566S0100000_22(this, 600), true, true);
        } else {
            abstractC857240Xk2ZJ = null;
        }
        c857230Xk1LIZIZ.LIZ(abstractC857240Xk2ZJ);
        c857230Xk1LIZIZ.LIZ(new C1437590nVt(o2()));
        AwS423S0200000_22 awS423S0200000_22 = new AwS423S0200000_22(this, (AbstractC1439440nYs) function0, (Function0<Unit>) 52);
        if (c857230Xk1LIZIZ.LJIIJJI == EnumC864300XvQ.NEW) {
            c857230Xk1LIZIZ.LJIILIIL = awS423S0200000_22;
        }
        c857230Xk1LIZIZ.LJFF();
    }

    private final void v3(boolean z) {
        InterfaceC1439570nZ5 interfaceC1439570nZ5W2 = W2();
        if (interfaceC1439570nZ5W2 != null) {
            interfaceC1439570nZ5W2.fY0("lightening_publish");
        }
        q3();
        Bundle bundleLIZ = C1436250nTj.LIZ(o2(), false);
        int iGr = 1;
        if (!z) {
            bundleLIZ.putBoolean("directly_publish_only", true);
        }
        TTStoryUploadModel ttStoryUploadModel = o2().getTtStoryUploadModel();
        if (ttStoryUploadModel != null) {
            ttStoryUploadModel.setStartPublishTime(System.currentTimeMillis());
        }
        O3();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().startPublish(getActivity(), bundleLIZ);
        C1431870nMf c1431870nMfLJJJLL = C0CHQ.LIZ().getPublishService().LJJJLL();
        C19EG activity = getActivity();
        VideoPublishEditModel videoPublishEditModelO2 = o2();
        InterfaceC1454960nxu interfaceC1454960nxuW2 = w2();
        if (interfaceC1454960nxuW2 != null) {
            iGr = interfaceC1454960nxuW2.gr();
        }
        boolean zLLI = C1428470nHB.LLI(o2());
        Bundle bundle = T2().mArguments;
        String strH2 = "chat_page";
        if (!Intrinsics.LJFF(o2().getEnterFrom(), "chat_page")) {
            strH2 = H2();
        }
        C557270LtN.LIZ(c1431870nMfLJJJLL, activity, videoPublishEditModelO2, iGr, zLLI, false, null, bundle, strH2, 32);
    }

    @Override // X.C0MHM
    public void iX(Function0<Unit> function0) {
        C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        C1437510nVl.LJFF(C1428470nHB.LJIIJJI(o2()), o2().getCreationId());
        E3(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData] */
    public final void o4(Function0<Unit> function0) {
        InterfaceC1446740nke interfaceC1446740nke;
        AbstractC1438910nY1 c1438920nY2;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        Object obj;
        Activity activity;
        ImageAlbumData imageAlbumData2;
        InterfaceC1451520nsM interfaceC1451520nsMX1;
        ?? imageAlbumData3;
        ?? arrayList;
        List<SingleImageData> imageList2;
        int iGr = 1;
        if (((Boolean) C0AS1.LIZ.getValue()).booleanValue()) {
            if (o2().creativeModel.transientPostPageModel.LJJJLL) {
                return;
            } else {
                o2().creativeModel.transientPostPageModel.LJJJLL = true;
            }
        }
        if (C1428470nHB.LJJJIL(o2()) && (imageAlbumData3 = o2().getImageAlbumData()) != 0) {
            ImageAlbumData imageAlbumData4 = o2().getImageAlbumData();
            if (imageAlbumData4 != null && (imageList2 = imageAlbumData4.getImageList()) != null) {
                arrayList = new ArrayList();
                for (SingleImageData singleImageData : imageList2) {
                    if (singleImageData.isText2Image()) {
                        arrayList.add(singleImageData);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            imageAlbumData3.setImageList(arrayList);
        }
        if (!C562550M4n.LIZ(o2()) && !Q3()) {
            if (C297670Bld.LIZ() && C1428470nHB.LJJZZI(o2()) && (imageAlbumData2 = o2().getImageAlbumData()) != null && imageAlbumData2.isTempImageMode() && (interfaceC1451520nsMX1 = X1()) != null) {
                interfaceC1451520nsMX1.m7("not allow story post single image");
            }
        } else if (!c3()) {
            InterfaceC1455860nzM interfaceC1455860nzMZ1 = Z1();
            if ((interfaceC1455860nzMZ1 instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMZ1) != null) {
                interfaceC1446740nke.RF0();
            }
        }
        AVUploadSaveModel saveModel = o2().getSaveModel();
        if (((saveModel != null && saveModel.isSaveLocal()) || C0C64.LJIILLIIL().LJIJ(31744, 0, "story_ai_live_photo_auto_save_local", true) == 1) && C855000XgQ.LIZ() && C0CHQ.LIZ().getPublishService().LJIILJJIL(o2()) && o2().getCreationMode() == 1) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null) {
                obj = abstractC1387200mCcLJ.LIZ;
            } else {
                obj = null;
            }
            if ((obj instanceof C19EG) && (activity = (Activity) obj) != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131858126);
                C1390380mHk.LIZ(activity, 2058, creativeToastBuilder);
            }
        }
        VideoPublishEditModel videoPublishEditModelO2 = o2();
        if (!C855830Xhl.LIZ()) {
            if (!C1428720nHa.LIZ(videoPublishEditModelO2)) {
                videoPublishEditModelO2.isPrivate = 0;
                videoPublishEditModelO2.commentSetting = 0;
            }
            videoPublishEditModelO2.setTitle(null);
            videoPublishEditModelO2.setStructList(null);
            videoPublishEditModelO2.challenges = null;
            videoPublishEditModelO2.resetCompileProbeResult();
            videoPublishEditModelO2.resetStrategiesResult();
            videoPublishEditModelO2.autoCaptionLang = null;
            videoPublishEditModelO2.allowDownloadSetting = 0;
            videoPublishEditModelO2.setMicroAppId(null);
            videoPublishEditModelO2.setMicroAppModel(null);
            videoPublishEditModelO2.setChain(null);
            videoPublishEditModelO2.setDisableDeleteChain(false);
            videoPublishEditModelO2.geofencingSetting = null;
            videoPublishEditModelO2.setDraftMusicIllegal(false);
            videoPublishEditModelO2.playlist_id = null;
            videoPublishEditModelO2.playlist_name = null;
            if (videoPublishEditModelO2.getVeAudioRecorderParam() != null) {
                videoPublishEditModelO2.getVeAudioRecorderParam().setAudioRecordIndex(-1);
            }
            videoPublishEditModelO2.creativeModel.postPageModel.captionModel = new CaptionModel();
            videoPublishEditModelO2.creativeModel.postPageModel.markupCaption = "";
            videoPublishEditModelO2.commerceData = null;
            videoPublishEditModelO2.setVideoCoverStartTm(0.0f);
            CoverPublishModel coverPublishModel = new CoverPublishModel();
            coverPublishModel.setNeedExpandCompiledSize(videoPublishEditModelO2.getCoverPublishModel().getNeedExpandCompiledSize());
            videoPublishEditModelO2.setCoverPublishModel(coverPublishModel);
        }
        if (C1428470nHB.LJJZZI(o2()) && (imageAlbumData = o2().getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && imageList.size() > 1) {
            if (C566780MKu.LIZ(o2().creativeModel)) {
                o2().setEnterFrom(H2());
            }
            C19EG activity2 = getActivity();
            VideoPublishEditModel videoPublishEditModelO22 = o2();
            InterfaceC1454960nxu interfaceC1454960nxuW2 = w2();
            if (interfaceC1454960nxuW2 != null) {
                iGr = interfaceC1454960nxuW2.gr();
            }
            c1438920nY2 = new C1438960nY6(activity2, videoPublishEditModelO22, iGr, new AwS566S0100000_22(this, 601));
        } else {
            if (o2().isImageLivePhotoEdit() && C295850Bih.LIZ()) {
                o2().creativeModel.storyModel.setStoryLivePhotoMode(StoryLivePhotoMode.LIVE_PHOTO);
            }
            getActivity();
            c1438920nY2 = new C1438920nY2(o2(), new AwS486S0200000_22(this, (AbstractC1439440nYs) function0, (Function0<Unit>) 0));
        }
        C560380LyO.LIZ.getClass();
        C560380LyO.LJFF("edit_page_publish_story");
        C1438840nXu.LIZ.getClass();
        C1438840nXu.LIZ(c1438920nY2);
    }
}
