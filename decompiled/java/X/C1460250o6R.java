package X;

import Y.AObserverS225S0100000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS91S0200000_22;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.als.h0;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS139S0110000_22;
import kotlin.jvm.internal.AwS16S0120000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import l5a.a;

/* JADX INFO: renamed from: X.0o6R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460250o6R extends AbstractC2255721DQs<InterfaceC1439510nYz> implements InterfaceC1439510nYz, InterfaceC379610EuV {
    public static final C1460590o6z LLLFFI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public static final int LLLI;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1439510nYz LLILZ = this;
    public final SafeHandler LLILZIL = new SafeHandler(this);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC372680EjK.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 557));
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460670o77.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), AbstractC1453750nvx.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), C0MHM.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460690o79.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0LHY.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), C1456470o0L.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457660o2G.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public final InterfaceC1731706qJ LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455680nz4.class, null);
    public final InterfaceC1731706qJ LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460540o6u.class, null);
    public final h0<Boolean> LLJJJIL;
    public final h0<Boolean> LLJJJJ;
    public final h0<Unit> LLJJJJJIL;
    public final h0<Boolean> LLJJJJLIIL;
    public final h0<Boolean> LLJJL;
    public final h0<Pair<Boolean, Function0<Unit>>> LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final C01GW LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final C1460300o6W LLJZIJLIL;
    public final C1460230o6P LLL;
    public boolean LLLF;
    public boolean LLLFF;

    public final int[] G2() {
        int[] iArr = new int[2];
        View view = this.LLL.mView;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    @Override // X.InterfaceC1439590nZ7
    public void Zh1(boolean z) {
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [X.0o6z] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1460250o6R.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1460250o6R.class, "editSlideApi", "getEditSlideApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/in/EditorProSlideApi;", 0), new C2217381BqS(C1460250o6R.class, "editCoverGenerator", "getEditCoverGenerator()Lcom/ss/android/ugc/gamora/editor/IEditCoverGneratator;", 0), new C2217381BqS(C1460250o6R.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0), new C2217381BqS(C1460250o6R.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1460250o6R.class, "lighteningPublishApiComponent", "getLighteningPublishApiComponent()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningPublishApiComponent;", 0), new C2217381BqS(C1460250o6R.class, "lighteningQuickPublishApiComponent", "getLighteningQuickPublishApiComponent()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningQuickPublishApiComponent;", 0), new C2217381BqS(C1460250o6R.class, "quickPostApiComponent", "getQuickPostApiComponent()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningQuickPostApiComponent;", 0), new C2217381BqS(C1460250o6R.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C1460250o6R.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1460250o6R.class, "publishButtonVisibility", "getPublishButtonVisibility()Lcom/ss/android/ugc/gamora/editor/LighteningBottomPublishButtonVisibility;", 0), new C2217381BqS(C1460250o6R.class, "changeAvatarApiComponent", "getChangeAvatarApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/changeavatar/ChangeAvatarApiComponent;", 0), new C2217381BqS(C1460250o6R.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C1460250o6R.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0), new C2217381BqS(C1460250o6R.class, "autoCutBottomLayoutCheckApi", "getAutoCutBottomLayoutCheckApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/AutoCutBottomLayoutCheckApi;", 0), new C2217381BqS(C1460250o6R.class, "imageGlobalStickerApi", "getImageGlobalStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/GlobalEditStickerNewEngineApi;", 0), new C2217381BqS(C1460250o6R.class, "editExitApiComponent", "getEditExitApiComponent()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0), new C2217381BqS(C1460250o6R.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0), new C2217381BqS(C1460250o6R.class, "switchModeApi", "getSwitchModeApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0), new C2217381BqS(C1460250o6R.class, "sendToDMApi", "getSendToDMApi()Lcom/ss/android/ugc/aweme/social/sendtodm/SendToDMApiComponent;", 0), new C2217381BqS(C1460250o6R.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0)};
        LLLFFI = new Object() { // from class: X.0o6z
        };
        LLLI = 8;
    }

    private final InterfaceC1457660o2G H2() {
        return (InterfaceC1457660o2G) this.LLJJIJI.getValue(this, LLLFZ[11]);
    }

    private final InterfaceC1459560o5K H4() {
        return (InterfaceC1459560o5K) this.LLJLLIL.getValue();
    }

    private final InterfaceC1464960oE2 O3() {
        return (InterfaceC1464960oE2) this.LLJL.getValue(this, LLLFZ[15]);
    }

    private final InterfaceC578430MmP P4() {
        return (InterfaceC578430MmP) this.LLJLL.getValue(this, LLLFZ[18]);
    }

    private final InterfaceC1455680nz4 Z1() {
        return (InterfaceC1455680nz4) this.LLJJIJIL.getValue(this, LLLFZ[13]);
    }

    private final InterfaceC578380MmK i3() {
        return (InterfaceC578380MmK) this.LLJLILLLLZIIL.getValue(this, LLLFZ[17]);
    }

    private final InterfaceC1453200nv4 m3() {
        return (InterfaceC1453200nv4) this.LLILZLL.getValue(this, LLLFZ[0]);
    }

    private final InterfaceC1455860nzM q3() {
        return (InterfaceC1455860nzM) this.LLJJ.getValue(this, LLLFZ[8]);
    }

    private final AbstractC1453750nvx v3() {
        return (AbstractC1453750nvx) this.LLJI.getValue(this, LLLFZ[3]);
    }

    private final InterfaceC1460540o6u w2() {
        return (InterfaceC1460540o6u) this.LLJJJ.getValue(this, LLLFZ[14]);
    }

    private final C1456470o0L z4() {
        return (C1456470o0L) this.LLJJIII.getValue(this, LLLFZ[10]);
    }

    public final InterfaceC372680EjK B3() {
        return (InterfaceC372680EjK) this.LLIZ.getValue(this, LLLFZ[1]);
    }

    public final void E5() {
        Activity activityLIZIZ;
        IExternalService iExternalService;
        ICreativePerformanceMonitorService iCreativePerformanceMonitorServicePerformanceMonitorService;
        if (this.LLLF) {
            return;
        }
        this.LLLF = true;
        C01GW c01gw = C0B9Y.LIZ;
        if (((Number) c01gw.getValue()).longValue() > 0 && (iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) != null && (iCreativePerformanceMonitorServicePerformanceMonitorService = iExternalService.performanceMonitorService()) != null) {
            iCreativePerformanceMonitorServicePerformanceMonitorService.startJatoBoostAbility(((Number) c01gw.getValue()).longValue());
        }
        AVUploadSaveModel saveModel = o4().getSaveModel();
        if (saveModel != null && saveModel.isSaveLocal() && C855000XgQ.LIZ() && C0CHQ.LIZ().getPublishService().LJIILJJIL(o4()) && o4().getCreationMode() == 1) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            Activity activityLIZ = null;
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            }
            if ((activityLIZ instanceof C19EG) && activityLIZ != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131858126);
                C1390380mHk.LIZ(activityLIZ, 2058, creativeToastBuilder);
            }
        }
        InterfaceC1459560o5K interfaceC1459560o5KH4 = H4();
        if (interfaceC1459560o5KH4 != null) {
            interfaceC1459560o5KH4.BC1(EnumC1412010mqd.NORMAL_POST.getValue());
        }
        k5();
        if (d5(new AwS566S0100000_22(this, 564))) {
            return;
        }
        W1(new AwS566S0100000_22(this, 565));
    }

    public final C0LHY F4() {
        return (C0LHY) this.LLJILLL.getValue(this, LLLFZ[7]);
    }

    public final InterfaceC377540ErA H3() {
        return (InterfaceC377540ErA) this.LLJJIJIIJIL.getValue(this, LLLFZ[12]);
    }

    public final void H5() {
        a.LIZIZ.LIZ(o4().getCreationId());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LighteningBottomComponent:publishVideo,isPublishing:");
        sbLIZ.append(this.LLLF);
        sbLIZ.append(",isMvThemeVideoType:");
        sbLIZ.append(o4().isMvThemeVideoType());
        sbLIZ.append(",isMultiVideoEdit:");
        sbLIZ.append(o4().isMultiVideoEdit());
        sbLIZ.append(",isMixedFastImport:");
        sbLIZ.append(C1428470nHB.LJLIIIL(o4()));
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!getEditModel().creativeModel.changeAvatarModel.isFromChangeAvatar || getEditModel().creativeModel.draftInfoModel.isDraft) {
            X1(new AwS566S0100000_22(this, 567));
            return;
        }
        C201955140j.LJ("change_avatar_mode: start upload avatar info");
        InterfaceC1457660o2G interfaceC1457660o2GH2 = H2();
        if (interfaceC1457660o2GH2 != null) {
            interfaceC1457660o2GH2.RE(new AwS566S0100000_22(this, 566), AFwS261S0000000_22.get$arr$(178));
        }
    }

    public final AbstractC214814194y K4() {
        return (AbstractC214814194y) this.LLJZ.getValue(this, LLLFZ[20]);
    }

    public final InterfaceC1431860nMe O4() {
        return (InterfaceC1431860nMe) this.LLJLLL.getValue(this, LLLFZ[19]);
    }

    @Override // X.InterfaceC1439510nYz
    public void Oh2() {
        View view = this.LLL.mView;
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS122S0100000_22(this, 51), 16L);
        }
    }

    public final C0MHM Q3() {
        return (C0MHM) this.LLJILJIL.getValue(this, LLLFZ[5]);
    }

    public final void R5() {
        h0<Boolean> h0Var = this.LLJJJIL;
        C1428640nHS c1428640nHS = C1428640nHS.LIZ;
        VideoPublishEditModel videoPublishEditModelO4 = o4();
        c1428640nHS.getClass();
        h0Var.LJII(Boolean.valueOf(C1428640nHS.LIZLLL(videoPublishEditModelO4)));
        if (!C1428470nHB.LLIIIJ(o4())) {
            this.LLJJJJ.LJII(Boolean.valueOf(((!C1428470nHB.LJJZZI(o4()) || C562550M4n.LIZ(o4())) && !C0MUK.LJFF(o4().creativeModel)) || u4.LJIIJ(getEditModel())));
        }
        if (!Intrinsics.LJFF(this.LLJJJIL.LIZJ(), Boolean.TRUE) || o4().mShootWay == null) {
            return;
        }
        if (Intrinsics.LJFF(o4().mShootWay, "direct_shoot")) {
            this.LLJJJIL.LJII(Boolean.valueOf(!(C298550Bn3.LIZIZ() == 1)));
            return;
        }
        if (C13LP.LJJJJ(o4().mShootWay, C13LQ.LJLIIL(new String[]{"single_song", "prop_page"}))) {
            this.LLJJJIL.LJII(Boolean.valueOf(!(C298550Bn3.LIZIZ() == 4)));
        }
    }

    public final InterfaceC1460660o76 T2() {
        return (InterfaceC1460660o76) this.LLIZLLLIL.getValue();
    }

    public final InterfaceC1460670o77 W2() {
        return (InterfaceC1460670o77) this.LLJ.getValue(this, LLLFZ[2]);
    }

    @Override // X.InterfaceC1439510nYz
    public void Yd() {
        this.LLJJJJJIL.LJII(Unit.LIZ);
    }

    public final InterfaceC1453420nvQ c3() {
        return (InterfaceC1453420nvQ) this.LLJLIL.getValue(this, LLLFZ[16]);
    }

    public final void d6() {
        this.LLJJJIL.LJII(Boolean.TRUE);
    }

    public final InterfaceC1460690o79 e4() {
        return (InterfaceC1460690o79) this.LLJILJILJ.getValue(this, LLLFZ[6]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJI.getValue(this, LLLFZ[9]);
    }

    public final VideoPublishEditModel o4() {
        return (VideoPublishEditModel) this.LLJIJIL.getValue(this, LLLFZ[4]);
    }

    @Override // X.InterfaceC1439510nYz
    public void publish() {
        if (this.LLLF) {
            return;
        }
        CommonMobParamModel commonMobParamModel = o4().creativeModel.commonMobModel;
        InterfaceC1453420nvQ interfaceC1453420nvQC3 = c3();
        commonMobParamModel.hasEdit = interfaceC1453420nvQC3 != null ? Boolean.valueOf(interfaceC1453420nvQC3.Q2()) : null;
        InterfaceC1451520nsM interfaceC1451520nsM = (InterfaceC1451520nsM) getDiContainer().LJIIL(null, InterfaceC1451520nsM.class);
        if (interfaceC1451520nsM != null) {
            InterfaceC1452170ntP value = q3().g().getValue();
            InterfaceC578380MmK interfaceC578380MmKI3 = i3();
            interfaceC1451520nsM.TV(null, value, interfaceC578380MmKI3 != null ? interfaceC578380MmKI3.C1() : true);
        }
        this.LLLF = true;
        InterfaceC1459560o5K interfaceC1459560o5KH4 = H4();
        if (interfaceC1459560o5KH4 != null) {
            interfaceC1459560o5KH4.BC1(EnumC1412010mqd.STORY_POST.getValue());
        }
        k5();
        if (n5() || d5(new AwS566S0100000_22(this, 561))) {
            return;
        }
        W1(new AwS566S0100000_22(this, 562));
    }

    @Override // X.InterfaceC1439510nYz
    public void uS() {
        C1460230o6P c1460230o6P = this.LLL;
        View.OnClickListener onClickListener = (View.OnClickListener) c1460230o6P.LLLLII.getValue();
        View view = c1460230o6P.LLJILJIL;
        if (view == null) {
            view = null;
        }
        onClickListener.onClick(view);
    }

    public final void v5() {
        InterfaceC1459560o5K interfaceC1459560o5K = (InterfaceC1459560o5K) findReadyComponent(this, InterfaceC1459560o5K.class);
        if (interfaceC1459560o5K != null) {
            interfaceC1459560o5K.BC1(EnumC1412010mqd.CLICK_NEXT.getValue());
        }
        o4().setClickNextToPublishPage(true);
        q3().fA1();
    }

    private final InterfaceC1452170ntP E3() {
        return q3().g().getValue();
    }

    private final void k5() {
        C1428520nHG.LJLI(o4());
        InterfaceC1452170ntP value = q3().g().getValue();
        if (value != null) {
            o4().getPreviewInfo().setPreviewVideoLength(value.getDuration());
            o4().setNleData(value.Zf());
            if (C350300DoK.LIZ()) {
                o4().setNleModel(value.bf(false));
                o4().setNleDataChange(false);
            }
        }
        if (o4().mIsFromDraft && o4().isDraftMusicIllegal() && MusicBeanUtilKt.extractAVMusic(o4().creativeModel.musicBuzModel) != null) {
            o4().setDraftMusicIllegal(false);
        }
    }

    private final boolean n5() {
        if (!C1428470nHB.LLIIIJ(o4())) {
            return false;
        }
        this.LLILZIL.post(new ARunnableS122S0100000_22(this, 55));
        return true;
    }

    public final void C5() {
        C1428520nHG.LJLI(o4());
        InterfaceC1452170ntP value = q3().g().getValue();
        if (value != null) {
            o4().getPreviewInfo().setPreviewVideoLength(value.getDuration());
            o4().setNleData(value.Zf());
        }
        this.LLILZIL.post(new ARunnableS122S0100000_22(this, 57));
    }

    @Override // X.InterfaceC1439510nYz
    public void Cv() {
        InterfaceC1451520nsM interfaceC1451520nsM = (InterfaceC1451520nsM) getDiContainer().LJIIL(null, InterfaceC1451520nsM.class);
        if (interfaceC1451520nsM != null) {
            InterfaceC1452170ntP value = q3().g().getValue();
            InterfaceC578380MmK interfaceC578380MmKI3 = i3();
            interfaceC1451520nsM.TV(null, value, interfaceC578380MmKI3 != null ? interfaceC578380MmKI3.C1() : true);
        }
        C1460230o6P c1460230o6P = this.LLL;
        c1460230o6P.getClass();
        c1460230o6P.LLLLLILLIL(new AwS566S0100000_22(c1460230o6P, 582), false, true);
    }

    public final void D5() {
        NLEModel nLEModelLIZ;
        InterfaceC1446740nke interfaceC1446740nke;
        InterfaceC1455860nzM interfaceC1455860nzMQ3 = q3();
        if ((interfaceC1455860nzMQ3 instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMQ3) != null) {
            interfaceC1446740nke.RF0();
        }
        C1436990nUv.LJIIIZ(q3().g().getValue(), o4());
        VideoPublishEditModel videoPublishEditModelO4 = o4();
        InterfaceC1452170ntP value = q3().g().getValue();
        C353701Yx.LIZ(videoPublishEditModelO4, (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null) ? false : C1429320nIY.LJIIIIZZ(nLEModelLIZ), new AwS566S0100000_22(this, 563));
    }

    public final void M5() {
        q3().ml1();
        this.LLILZIL.post(new ARunnableS122S0100000_22(this, 59));
    }

    public final void N5() {
        InterfaceC1446740nke interfaceC1446740nke;
        if (!(v3() instanceof C1455260nyO)) {
            D5();
            return;
        }
        InterfaceC1455860nzM interfaceC1455860nzMQ3 = q3();
        if ((interfaceC1455860nzMQ3 instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMQ3) != null) {
            interfaceC1446740nke.RF0();
        }
        E5();
    }

    @Override // X.InterfaceC1439510nYz
    public void VB1() {
        NLEModel nLEModelLIZ;
        NLEModel nLEModelLIZ2;
        C1436990nUv.LJIIIZ(q3().g().getValue(), o4());
        boolean zLJIIIIZZ = false;
        if (!C365940EWi.LIZLLL(o4())) {
            VideoPublishEditModel videoPublishEditModelO4 = o4();
            InterfaceC1452170ntP value = q3().g().getValue();
            if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null) {
                zLJIIIIZZ = C1429320nIY.LJIIIIZZ(nLEModelLIZ);
            }
            C353701Yx.LIZ(videoPublishEditModelO4, zLJIIIIZZ, new AwS566S0100000_22(this, 560));
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        VideoPublishEditModel videoPublishEditModelO42 = o4();
        InterfaceC1452170ntP value2 = q3().g().getValue();
        if (value2 != null && (nLEModelLIZ2 = C352130DrH.LIZ(value2)) != null) {
            zLJIIIIZZ = C1429320nIY.LJIIIIZZ(nLEModelLIZ2);
        }
        C23250099c.LIZLLL(lifecycleScope, null, null, new C353301Yt(new AwS566S0100000_22(this, 559), videoPublishEditModelO42, zLJIIIIZZ, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.1BqW, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // X.InterfaceC1439510nYz
    public void m4() {
        boolean z = (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_save_local_post_story_as_story", true, false) && (u4.LJIIZILJ(o4()) || o4().creativeModel.changeAvatarModel.isFromChangeAvatar)) || o4().creativeModel.editSaveLocalModel.isQuickPostAsStory;
        boolean z2 = C855610XhP.LIZ() && !z;
        ?? c1460430o6j = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_quick_post_storage_permission_check", true) > 0 ? new C1460430o6j(this, z2, z) : new C1460450o6l(this, z2, z);
        if (!getEditModel().getAILivePhotoModel().LJIIJ() || Z1() == null) {
            c1460430o6j.invoke();
            return;
        }
        InterfaceC1455680nz4 interfaceC1455680nz4Z1 = Z1();
        if (interfaceC1455680nz4Z1 != null) {
            interfaceC1455680nz4Z1.Qu(!z2, new AwS566S0100000_22((C2217421BqW) c1460430o6j, 558));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1460250o6R.onCreate():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (MusicBeanUtilKt.extractAVMusic(o4().creativeModel.musicBuzModel) != null) {
            R5();
        }
        View view = this.LLL.mView;
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS122S0100000_22(this, 52), 16L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x5() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1460250o6R.x5():void");
    }

    @Override // X.InterfaceC1439510nYz
    public C19A3 I12() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    public InterfaceC1439510nYz o2() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // X.InterfaceC1439510nYz
    public Scene sr1() {
        return this.LLL;
    }

    private final void W1(final Function0<Unit> function0) {
        if (((Number) C301620Bs0.LIZ.getValue()).intValue() == 2) {
            function0.invoke();
            return;
        }
        Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(o4(), true, null, true, 2);
        if (pairLJJIIJZLJL != null) {
            C1456230nzx c1456230nzx = new C1456230nzx(o4());
            InterfaceC1452170ntP interfaceC1452170ntPE3 = E3();
            C1457050o1H c1457050o1H = c1456230nzx.LIZ;
            c1457050o1H.LJIIIIZZ = interfaceC1452170ntPE3;
            c1457050o1H.LJIL = true;
            c1456230nzx.LIZ.LIZIZ = pairLJJIIJZLJL.getFirst();
            int iIntValue = pairLJJIIJZLJL.getSecond().intValue();
            C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
            c1457050o1H2.LJFF = iIntValue;
            c1457050o1H2.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0o6r
                @Override // X.InterfaceC1457180o1U
                public final void onError(int i, String str) {
                    C201955140j.LJ(str);
                    this.LIZ.LLLF = false;
                }
            };
            c1457050o1H2.LIZJ = new C0MBV() { // from class: X.0o6t
                @Override // X.C0MBV
                public final void LIZLLL() {
                    function0.invoke();
                }
            };
            C1457060o1I.LIZIZ(c1457050o1H2);
            return;
        }
        function0.invoke();
    }

    private final boolean d5(Function0<Unit> function0) {
        InterfaceC1455190nyH interfaceC1455190nyH = (InterfaceC1455190nyH) getDiContainer().LJIIL(null, InterfaceC1455190nyH.class);
        if (C1428470nHB.LJJZZI(o4()) && interfaceC1455190nyH != null) {
            InterfaceC578430MmP interfaceC578430MmPP4 = P4();
            if (interfaceC578430MmPP4 != null) {
                interfaceC578430MmPP4.hide();
            }
            interfaceC1455190nyH.LIZ(new AwS423S0200000_22(this, (C1460250o6R) function0, (Function0<Unit>) 51));
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1439510nYz
    public void JN(String str) {
        this.LLL.LLLIILIL(str);
    }

    public final void S5(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.setPhotoMvMode(false);
        videoPublishEditModel.setPhotoMvMode1080p(false);
        videoPublishEditModel.setPhotoMvMusic(false);
        videoPublishEditModel.setMvCreateVideoData(null);
        videoPublishEditModel.setVideoEditorType(12);
        AVUploadMiscInfoStruct uploadMiscInfoStruct = videoPublishEditModel.getUploadMiscInfoStruct();
        if (uploadMiscInfoStruct != null) {
            uploadMiscInfoStruct.mvInfo = null;
        }
        AVUploadMiscInfoStruct uploadMiscInfoStruct2 = videoPublishEditModel.getUploadMiscInfoStruct();
        if (uploadMiscInfoStruct2 != null) {
            uploadMiscInfoStruct2.mvThemeId = null;
        }
    }

    public final void U5(boolean z) {
        if (z) {
            this.LLILLJJLI.show(this.LLL);
        }
        this.LLJJLIIIJLLLLLLLZ.LJII(new Pair<>(Boolean.valueOf(z), new AwS139S0110000_22(z, this, 6)));
    }

    public final void X1(Function0<Unit> function0) {
        this.LLILZIL.post(new ARunnableS91S0200000_22(this, (Function0) function0, 19));
    }

    public final void m6(Pair<Integer, Integer> pair) {
        InterfaceC1460540o6u interfaceC1460540o6uW2 = w2();
        if (interfaceC1460540o6uW2 != null) {
            interfaceC1460540o6uW2.RP0(pair);
        }
    }

    public final void t5(InterfaceC1455610nyx interfaceC1455610nyx) {
        LiveData<Boolean> liveDataRJ;
        LiveData<Boolean> liveDataWc1;
        LiveData<Pair<Boolean, Boolean>> liveDataX8;
        if (interfaceC1455610nyx != null && (liveDataX8 = interfaceC1455610nyx.x8()) != null) {
            liveDataX8.observe(this, new AObserverS225S0100000_22(this, 82));
        }
        boolean z = interfaceC1455610nyx instanceof InterfaceC1460000o62;
        if (z) {
            InterfaceC1460000o62 interfaceC1460000o62 = (InterfaceC1460000o62) interfaceC1455610nyx;
            if (interfaceC1460000o62 != null && (liveDataWc1 = interfaceC1460000o62.Wc1()) != null) {
                liveDataWc1.observe(this, new AObserverS225S0100000_22(this, 83));
            }
            if (z && interfaceC1455610nyx != null && (liveDataRJ = interfaceC1455610nyx.RJ()) != null) {
                liveDataRJ.observe(this, new AObserverS225S0100000_22(this, 84));
            }
        }
    }

    public C1460250o6R(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        Boolean bool = Boolean.TRUE;
        h0<Boolean> h0Var = new h0<>(bool);
        this.LLJJJIL = h0Var;
        h0<Boolean> h0Var2 = new h0<>(bool);
        this.LLJJJJ = h0Var2;
        h0<Unit> h0Var3 = new h0<>(Unit.LIZ);
        this.LLJJJJJIL = h0Var3;
        h0<Boolean> h0Var4 = new h0<>(bool);
        this.LLJJJJLIIL = h0Var4;
        h0<Boolean> h0Var5 = new h0<>(bool);
        this.LLJJL = h0Var5;
        h0<Pair<Boolean, Function0<Unit>>> h0Var6 = new h0<>(null);
        this.LLJJLIIIJLLLLLLLZ = h0Var6;
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1464960oE2.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578380MmK.class, null);
        this.LLJLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578430MmP.class, null);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 568));
        this.LLJLLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1431860nMe.class, null);
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), AbstractC214814194y.class, null);
        C1460300o6W c1460300o6W = new C1460300o6W();
        c1460300o6W.LIZ = h0Var;
        c1460300o6W.LIZIZ = h0Var2;
        c1460300o6W.LIZJ = h0Var4;
        c1460300o6W.LJ = new C1460400o6g(this);
        c1460300o6W.LJFF = new C1460410o6h(this);
        c1460300o6W.LJI = new C1446750nkf(this);
        c1460300o6W.LJII = h0Var5;
        c1460300o6W.LJIIIIZZ = new C1460370o6d(this);
        c1460300o6W.LIZLLL = h0Var6;
        c1460300o6W.LJIIIZ = new C1460380o6e(this);
        c1460300o6W.LJIIJ = new C1460390o6f(this);
        c1460300o6W.LJIIJJI = new AwS566S0100000_22(this, 556);
        c1460300o6W.LJIIL = h0Var3;
        new C1460340o6a(this);
        this.LLJZIJLIL = c1460300o6W;
        this.LLL = new C1460230o6P(c1460300o6W, getDiContainer());
    }

    public static final void T4(boolean z, C1460250o6R c1460250o6R, boolean z2) {
        boolean zC1;
        if (z) {
            c1460250o6R.o4().creativeModel.editSaveLocalModel.isClickQuickPublishToNext = true;
            c1460250o6R.JN("edit_quick_publish");
            return;
        }
        VideoPublishEditModel videoPublishEditModelO4 = c1460250o6R.o4();
        C0CHQ.LIZ().getPublishService().LJJJLL();
        videoPublishEditModelO4.setSaveModel(C1431870nMf.LJIIJJI(c1460250o6R.o4(), 0, false, new InterfaceC1436300nTo() { // from class: X.0o6x
            @Override // X.InterfaceC1436300nTo
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1436300nTo
            public final boolean isEnabled() {
                return false;
            }
        }, false));
        AVUploadSaveModel saveModel = c1460250o6R.getEditModel().getSaveModel();
        if (saveModel != null) {
            saveModel.setSaveLocal(true);
        }
        if (C1428520nHG.LJJ(c1460250o6R.getEditModel()) && C0CHQ.LIZ().LJJIIZI().LJIIIIZZ()) {
            AVUploadSaveModel saveModel2 = c1460250o6R.getEditModel().getSaveModel();
            if (saveModel2 != null) {
                saveModel2.setWaterMark(true);
            }
        } else {
            AVUploadSaveModel saveModel3 = c1460250o6R.getEditModel().getSaveModel();
            if (saveModel3 != null) {
                saveModel3.setWaterMark(false);
            }
        }
        AVUploadSaveModel saveModel4 = c1460250o6R.getEditModel().getSaveModel();
        if (saveModel4 != null) {
            CreativeModel creativeModel = c1460250o6R.getEditModel().creativeModel;
            C548590LfN.LIZ.getClass();
            saveModel4.setAIWaterMark(C548590LfN.LIZLLL().LJIILJJIL(creativeModel));
        }
        if (c1460250o6R.o4().creativeModel.editSaveLocalModel.forceQuickPublicPost) {
            c1460250o6R.getEditModel().isPrivate = 0;
        }
        if (z2) {
            c1460250o6R.publish();
            return;
        }
        InterfaceC1451520nsM interfaceC1451520nsM = (InterfaceC1451520nsM) c1460250o6R.getDiContainer().LJIIL(null, InterfaceC1451520nsM.class);
        if (interfaceC1451520nsM != null) {
            InterfaceC1452170ntP value = c1460250o6R.q3().g().getValue();
            InterfaceC578380MmK interfaceC578380MmKI3 = c1460250o6R.i3();
            if (interfaceC578380MmKI3 != null) {
                zC1 = interfaceC578380MmKI3.C1();
            } else {
                zC1 = true;
            }
            interfaceC1451520nsM.TV(null, value, zC1);
        }
        C1460230o6P c1460230o6P = c1460250o6R.LLL;
        c1460230o6P.getClass();
        c1460230o6P.LLLLLILLIL(new AwS566S0100000_22(c1460230o6P, 582), false, true);
    }

    public static final void Z4(final C1460250o6R c1460250o6R, final boolean z, final boolean z2) {
        C19EG c19egRequireFragmentActivity;
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC214814194y abstractC214814194yK4 = c1460250o6R.K4();
            if (abstractC214814194yK4 != null && (c19egRequireFragmentActivity = abstractC214814194yK4.requireFragmentActivity()) != null) {
                C540290LGx.LJI(C540290LGx.LIZ, c19egRequireFragmentActivity, new C0LH5(c1460250o6R) { // from class: X.0o6n
                    public final /* synthetic */ C1460250o6R LIZIZ;

                    @Override // X.C0LH5
                    public final void LIZ(int[] iArr, String[] strArr) {
                        C1460250o6R.T4(z, this.LIZIZ, z2);
                    }

                    {
                        this.LIZIZ = c1460250o6R;
                    }
                }, null, new AwS16S0120000_22(c1460250o6R, z, z2, 1), new AwS16S0120000_22(c1460250o6R, z, z2, 2), TokenCert.Companion.with("bpea-tools_request_storage_permission_edit_page_save_local"), 4);
                return;
            }
            return;
        }
        T4(z, c1460250o6R, z2);
    }
}
