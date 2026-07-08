package X;

import Y.ARunnableS122S0100000_22;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.HashTagService;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS486S0200000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1439430nYr extends AbstractC2255721DQs<C0LHY> implements C0LHY, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444410ngt.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1439510nYz.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1439430nYr.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC1439430nYr.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AbstractC1439430nYr.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AbstractC1439430nYr.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(AbstractC1439430nYr.class, "privacySettingApi", "getPrivacySettingApi()Lcom/ss/android/ugc/aweme/shortvideo/privacy/PrivacySettingApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(AbstractC1439430nYr.class, "lighteningBottomApiComponent", "getLighteningBottomApiComponent()Lcom/ss/android/ugc/gamora/editor/lightening/bottom/LighteningBottomApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(AbstractC1439430nYr.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJI = 8;
    }

    public abstract String H2();

    public C0LHY W1() {
        return this;
    }

    private final InterfaceC1444410ngt G2() {
        return (InterfaceC1444410ngt) this.LLILZLL.getValue(this, LLJ[4]);
    }

    private final AbstractC214814194y T2() {
        return (AbstractC214814194y) this.LLILLJJLI.getValue(this, LLJ[0]);
    }

    private final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLIZLLLIL.getValue(this, LLJ[6]);
    }

    private final InterfaceC1439510nYz Z1() {
        return (InterfaceC1439510nYz) this.LLIZ.getValue(this, LLJ[5]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLJ[1]);
    }

    private final VideoPublishEditModel o2() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJ[2]);
    }

    private final InterfaceC1454960nxu w2() {
        return (InterfaceC1454960nxu) this.LLILZIL.getValue(this, LLJ[3]);
    }

    private final boolean W2() {
        return o2().creativeModel.quickPostOnEditPageModel.LIZ && C1428520nHG.LJJLL(o2());
    }

    private final void c3() {
        Integer celebrationType;
        if (C566780MKu.LIZ(o2().creativeModel) && o2().creativeModel.onThisDayData.isFromOnThisDay()) {
            VideoPublishEditModel videoPublishEditModelO2 = o2();
            AVChallenge aVChallenge = new AVChallenge();
            aVChallenge.challengeName = getActivity().getString(2131821884);
            videoPublishEditModelO2.challenges = Collections.singletonList(aVChallenge);
            C579920Moo.LIZ(o2(), HashTagService.LIZIZ().LIZ(T2().getString(2131821884)));
        }
        CelebrationData celebrationData = o2().creativeModel.celebrationData;
        if (C0MQ1.LIZJ((celebrationData == null || (celebrationType = celebrationData.getCelebrationType()) == null) ? 0 : celebrationType.intValue())) {
            VideoPublishEditModel videoPublishEditModelO22 = o2();
            AVChallenge aVChallenge2 = new AVChallenge();
            aVChallenge2.challengeName = getActivity().getString(2131833996);
            videoPublishEditModelO22.challenges = Collections.singletonList(aVChallenge2);
            C579920Moo.LIZ(o2(), HashTagService.LIZIZ().LIZ(getActivity().getString(2131833996)));
        }
    }

    private final void q3() {
        Window window;
        View decorView;
        VideoPublishEditModel videoPublishEditModelO2 = o2();
        getActivity();
        if (C1439620nZA.LIZIZ(videoPublishEditModelO2)) {
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
            Activity activityFindActivityInstance = C0CHQ.LIZ().LJJJJJ().findActivityInstance(C19221910Hx.LIZJ());
            if (activityFindActivityInstance != null && (window = activityFindActivityInstance.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                HandlerHook.viewPost(decorView, new ARunnableS122S0100000_22(activityFindActivityInstance, 63));
            }
            ComplianceServiceProvider.LJIJJLI().LIZJ();
        }
    }

    public final void m3() {
        C1439210nYV.LIZ().LIZ(1);
        i3(true);
        q3();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC1439430nYr(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void i3(boolean z) {
        if (Intrinsics.LJFF(H2(), "on_this_day_page")) {
            o2().creativeModel.nleInfoModel.nleDataPath = "";
            o2().creativeModel.nleInfoModel.nleModel = null;
            o2().creativeModel.nleInfoModel.nleData = null;
        }
        Bundle bundleLIZIZ = C1436250nTj.LIZIZ(o2());
        int iGr = 1;
        if (W2()) {
            o2().stitchSetting = 1;
            o2().reactDuetSetting = 1;
            o2().creativeModel.privacySettingModel.allowCreateSticker = 2;
        }
        if (!z) {
            bundleLIZIZ.putBoolean("directly_publish_only", true);
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().startPublish(getActivity(), bundleLIZIZ);
        C1431870nMf c1431870nMfLJJJLL = C0CHQ.LIZ().getPublishService().LJJJLL();
        C19EG activity = getActivity();
        VideoPublishEditModel videoPublishEditModelO2 = o2();
        InterfaceC1454960nxu interfaceC1454960nxuW2 = w2();
        if (interfaceC1454960nxuW2 != null) {
            iGr = interfaceC1454960nxuW2.gr();
        }
        C557270LtN.LIZ(c1431870nMfLJJJLL, activity, videoPublishEditModelO2, iGr, C1428470nHB.LLI(o2()), true, null, T2().mArguments, H2(), 32);
    }

    @Override // X.C0LHY
    public void MC(Function0<Unit> function0) {
        Scene sceneT2;
        C19A3 c19a3T2;
        NLEModel nLEModelLIZ;
        int length;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        C1437510nVl.LJFF(C1428470nHB.LJIIJJI(o2()), o2().getCreationId());
        VideoPublishEditModel videoPublishEditModelO2 = o2();
        AbstractC857240Xk2<?> abstractC857240Xk2ZJ = null;
        if (!C855830Xhl.LIZ()) {
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
        }
        if (C855830Xhl.LIZ() && X1() != null) {
            VideoPublishEditModel videoPublishEditModelO22 = o2();
            InterfaceC1455860nzM interfaceC1455860nzMX1 = X1();
            if (interfaceC1455860nzMX1 != null && (liveDataG = interfaceC1455860nzMX1.g()) != null && (value = liveDataG.getValue()) != null) {
                nLEModelLIZ = C352130DrH.LIZ(value);
            } else {
                nLEModelLIZ = null;
            }
            videoPublishEditModelO22.setNleModel(nLEModelLIZ);
            C859330XnP c859330XnP = C859330XnP.LIZ;
            C19EG activity = getActivity();
            VideoPublishEditModel videoPublishEditModelO23 = o2();
            c859330XnP.getClass();
            if (C1428470nHB.LJJZZI(videoPublishEditModelO23)) {
                IAVPublishService iAVPublishService = C1429320nIY.LIZ;
                if (C1428470nHB.LJJZZI(videoPublishEditModelO23)) {
                    int iLJJI = C0CHQ.LIZ().getPublishService().LJJI(videoPublishEditModelO23);
                    String title = videoPublishEditModelO23.getTitle();
                    if (title != null) {
                        length = title.length();
                    } else {
                        length = 0;
                    }
                    if (iLJJI - length < 0) {
                        String strLJJLIL = C0CHQ.LIZ().getPublishService().LJJLIL(iLJJI);
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.isCenterToast(C859330XnP.LIZ());
                        creativeToastBuilder.message(strLJJLIL);
                        C1390380mHk.LIZ(activity, 2016, creativeToastBuilder);
                        return;
                    }
                }
            }
            C19EG activity2 = getActivity();
            VideoPublishEditModel videoPublishEditModelO24 = o2();
            if (C1428470nHB.LJJZZI(videoPublishEditModelO24)) {
                C0L1G c0l1g = C0L1G.LIZ;
                ImageAlbumData imageAlbumData = videoPublishEditModelO24.getImageAlbumData();
                c0l1g.getClass();
                if (imageAlbumData == null || imageAlbumData.getImageList().size() > 35) {
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.isCenterToast(C859330XnP.LIZ());
                    creativeToastBuilder2.message(activity2.getString(2131839794, 35));
                    C1390380mHk.LIZ(activity2, 2056, creativeToastBuilder2);
                    return;
                }
            }
            C0CHQ.LIZ().getPublishService().LJJLIIJ(getActivity(), o2());
        }
        C856040Xi6 c856040Xi6LIZLLL = C1403010mc7.LIZ.LIZLLL();
        AbstractC214814194y abstractC214814194yT2 = T2();
        VideoPublishEditModel videoPublishEditModelO25 = o2();
        C19EG activity3 = getActivity();
        InterfaceC1444410ngt interfaceC1444410ngtG2 = G2();
        if (interfaceC1444410ngtG2 != null) {
            abstractC857240Xk2ZJ = interfaceC1444410ngtG2.ZJ(null, false, true);
        }
        InterfaceC1439510nYz interfaceC1439510nYzZ1 = Z1();
        if (interfaceC1439510nYzZ1 == null || (sceneT2 = interfaceC1439510nYzZ1.sr1()) == null) {
            sceneT2 = T2();
        }
        InterfaceC1439510nYz interfaceC1439510nYzZ12 = Z1();
        if (interfaceC1439510nYzZ12 == null || (c19a3T2 = interfaceC1439510nYzZ12.I12()) == null) {
            c19a3T2 = T2();
        }
        c856040Xi6LIZLLL.LIZ(new C856060Xi8(abstractC214814194yT2, this, videoPublishEditModelO25, activity3, abstractC857240Xk2ZJ, sceneT2, c19a3T2, new AwS423S0200000_22(this, (AbstractC1439430nYr) function0, (Function0<Unit>) 53), false));
    }

    public final void v3(Function0<Unit> function0) {
        c3();
        C560380LyO.LIZ.getClass();
        C560380LyO.LJFF("edit_page_publish");
        C1438840nXu c1438840nXu = C1438840nXu.LIZ;
        getActivity();
        C1438920nY2 c1438920nY2 = new C1438920nY2(o2(), new AwS486S0200000_22(this, function0, 1));
        c1438840nXu.getClass();
        C1438840nXu.LIZ(c1438920nY2);
    }
}
