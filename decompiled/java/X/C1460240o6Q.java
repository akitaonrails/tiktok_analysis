package X;

import Y.AObserverS225S0100000_22;
import Y.ARunnableS91S0200000_22;
import android.app.Activity;
import android.os.Build;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import com.ss.android.ugc.aweme.story.share.IShareToStoryVideoStreamController;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import l5a.a;

/* JADX INFO: renamed from: X.0o6Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460240o6Q extends AbstractC2255721DQs<InterfaceC2221571BxD> implements InterfaceC2221571BxD, InterfaceC379610EuV {
    public static final C1460580o6y LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final int LLJLL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final Activity LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final InterfaceC2221571BxD LLILLL = this;
    public final SafeHandler LLILZ = new SafeHandler(this);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444410ngt.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455680nz4.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460680o78.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1431860nMe.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC572230McP.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578380MmK.class, null);
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 372));
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457660o2G.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZ(getDiContainer(), C0MHM.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1439570nZ5.class, null);
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 365));
    public final InterfaceC332260D0u<C1666540tTA> LLJJIJIL = C1BNE.LIZ(new C1666540tTA(false, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, 524287));
    public final InterfaceC1731706qJ LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), AbstractC1453750nvx.class, null);
    public final InterfaceC1731706qJ LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453760nvy.class, null);

    /* JADX WARN: Type inference failed for: r0v32, types: [X.0o6y] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1460240o6Q.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1460240o6Q.class, "privacySettingApi", "getPrivacySettingApi()Lcom/ss/android/ugc/aweme/shortvideo/privacy/PrivacySettingApi;", 0), new C2217381BqS(C1460240o6Q.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0), new C2217381BqS(C1460240o6Q.class, "aiLiveGuideApi", "getAiLiveGuideApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveGuideApi;", 0), new C2217381BqS(C1460240o6Q.class, "sendToDMApi", "getSendToDMApi()Lcom/ss/android/ugc/aweme/social/sendtodm/SendToDMApiComponent;", 0), new C2217381BqS(C1460240o6Q.class, "editSaveLocalApi", "getEditSaveLocalApi()Lcom/ss/android/ugc/gamora/editor/savelocal/EditSaveLocalApi;", 0), new C2217381BqS(C1460240o6Q.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C1460240o6Q.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0), new C2217381BqS(C1460240o6Q.class, "editExitApiComponent", "getEditExitApiComponent()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0), new C2217381BqS(C1460240o6Q.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0), new C2217381BqS(C1460240o6Q.class, "changeAvatarApiComponent", "getChangeAvatarApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/changeavatar/ChangeAvatarApiComponent;", 0), new C2217381BqS(C1460240o6Q.class, "lighteningPublishApiComponent", "getLighteningPublishApiComponent()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningPublishApiComponent;", 0), new C2217381BqS(C1460240o6Q.class, "storyEditSpeedTestApi", "getStoryEditSpeedTestApi()Lcom/ss/android/ugc/aweme/story/edit/StoryEditSpeedTestApi;", 0), new C2217381BqS(C1460240o6Q.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new C2217381BqS(C1460240o6Q.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0), new C2217381BqS(C1460240o6Q.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0)};
        LLJLIL = new Object() { // from class: X.0o6y
        };
        LLJLL = 8;
    }

    private final InterfaceC578380MmK B3() {
        return (InterfaceC578380MmK) this.LLJILLL.getValue(this, LLJLILLLLZIIL[9]);
    }

    private final InterfaceC1451520nsM E3() {
        return (InterfaceC1451520nsM) this.LLJILJIL.getValue(this, LLJLILLLLZIIL[7]);
    }

    private final InterfaceC1459560o5K F4() {
        return (InterfaceC1459560o5K) this.LLJJ.getValue();
    }

    private final InterfaceC1455860nzM H3() {
        return (InterfaceC1455860nzM) this.LLJIJIL.getValue(this, LLJLILLLLZIIL[6]);
    }

    private final AbstractC214814194y H4() {
        return (AbstractC214814194y) this.LLJJJ.getValue(this, LLJLILLLLZIIL[13]);
    }

    private final InterfaceC1431860nMe K4() {
        return (InterfaceC1431860nMe) this.LLJ.getValue(this, LLJLILLLLZIIL[4]);
    }

    private final AbstractC1453750nvx O3() {
        return (AbstractC1453750nvx) this.LLJJJIL.getValue(this, LLJLILLLLZIIL[14]);
    }

    private final InterfaceC1439570nZ5 O4() {
        return (InterfaceC1439570nZ5) this.LLJJIJI.getValue(this, LLJLILLLLZIIL[12]);
    }

    private final InterfaceC572230McP Q3() {
        return (InterfaceC572230McP) this.LLJI.getValue(this, LLJLILLLLZIIL[5]);
    }

    private final InterfaceC1460680o78 T2() {
        return (InterfaceC1460680o78) this.LLIZLLLIL.getValue(this, LLJLILLLLZIIL[3]);
    }

    private final boolean d5() {
        if (!((Boolean) C0BN2.LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (C297670Bld.LIZ() && C1428470nHB.LJZ(getEditModel())) {
            return false;
        }
        return C1428470nHB.LJJZZI(getEditModel());
    }

    private final InterfaceC1457660o2G i3() {
        return (InterfaceC1457660o2G) this.LLJJI.getValue(this, LLJLILLLLZIIL[10]);
    }

    private final InterfaceC1453760nvy q3() {
        return (InterfaceC1453760nvy) this.LLJL.getValue(this, LLJLILLLLZIIL[15]);
    }

    private final InterfaceC1453420nvQ v3() {
        return (InterfaceC1453420nvQ) this.LLJILJILJ.getValue(this, LLJLILLLLZIIL[8]);
    }

    private final InterfaceC1444410ngt z4() {
        return (InterfaceC1444410ngt) this.LLILZLL.getValue(this, LLJLILLLLZIIL[1]);
    }

    @Override // X.InterfaceC2221571BxD
    public void DN() {
        C0L2R c0l2r = C0L2R.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c0l2r.getClass();
        C0LAB c0labLIZ = C0L2R.LIZ(editModel);
        c0labLIZ.LJ("message_button_show_way", "story_edit_page");
        C2341909Fp.LIZ("story_edit_page_send_message_button_show", c0labLIZ.LIZ);
    }

    public final void H2() {
        if (!this.LLJJL) {
            H3().wi0();
            this.LLJJL = true;
        }
        InterfaceC572230McP interfaceC572230McPQ3 = Q3();
        if (interfaceC572230McPQ3 != null) {
            interfaceC572230McPQ3.H91();
        }
        D5(2);
        t5();
    }

    @Override // X.InterfaceC2221571BxD
    public void SN0() {
        if (!this.LLJJLIIIJLLLLLLLZ) {
            H3().wi0();
            this.LLJJLIIIJLLLLLLLZ = true;
        }
        C0L2R.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("sub_only_story_publish_click", c0lab.LIZ);
        getEditModel().creativeModel.privacySettingModel.isSubscribeOnly = true;
        InterfaceC572230McP interfaceC572230McPQ3 = Q3();
        if (interfaceC572230McPQ3 != null) {
            interfaceC572230McPQ3.H91();
        }
        C1428470nHB.LLILII(4, this.LLJJJJ, getEditModel());
        t5();
    }

    public final InterfaceC1455680nz4 W2() {
        return (InterfaceC1455680nz4) this.LLIZ.getValue(this, LLJLILLLLZIIL[2]);
    }

    @Override // X.InterfaceC2221571BxD
    public void XU0() {
        if (W1(new AwS566S0100000_22(this, 367))) {
            H2();
        }
    }

    @Override // X.InterfaceC2221571BxD
    public void Xa0() {
        C0L2R.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("sub_only_story_publish_show", c0lab.LIZ);
    }

    @Override // X.InterfaceC2221571BxD
    public void Yz2() {
        C0L2R c0l2r = C0L2R.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c0l2r.getClass();
        C0LAB c0labLIZ = C0L2R.LIZ(editModel);
        if (C298680BnG.LIZ()) {
            c0labLIZ.LIZ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
        }
        C2341909Fp.LIZ("story_edit_page_share_button_show", c0labLIZ.LIZ);
    }

    @Override // X.InterfaceC2221571BxD
    public void bL2() {
        C0L2R c0l2r = C0L2R.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c0l2r.getClass();
        C2341909Fp.LIZ("edit_page_audience_footer_show", C0L2R.LIZ(editModel).LIZ);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJLILLLLZIIL[0]);
    }

    public final InterfaceC1460660o76 m3() {
        return (InterfaceC1460660o76) this.LLJJIJIIJIL.getValue();
    }

    public final void n5() {
        C1618440sDa.LIZIZ.LJJJJIZL().LIZ(this.LLILLJJLI.mView, getEditModel(), new AwS601S0100000_22(this, 240), new AwS601S0100000_22(this, 241));
    }

    public final C0MHM o4() {
        return (C0MHM) this.LLJJIII.getValue(this, LLJLILLLLZIIL[11]);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void publish() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1460240o6Q.publish():void");
    }

    @Override // X.InterfaceC2221571BxD
    public void rI2() {
        if (W1(new AwS566S0100000_22(this, 361))) {
            G2();
        }
    }

    public final void v5() {
        a.LIZIZ.LIZ(getEditModel().getCreationId());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialEditBottomBarComponent:publishVideo,isPublishing:");
        sbLIZ.append(this.LLJJJJJIL);
        sbLIZ.append(",isMvThemeVideoType:");
        sbLIZ.append(getEditModel().isMvThemeVideoType());
        sbLIZ.append(",isMultiVideoEdit:");
        sbLIZ.append(getEditModel().isMultiVideoEdit());
        sbLIZ.append(",isMixedFastImport:");
        sbLIZ.append(C1428470nHB.LJLIIIL(getEditModel()));
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!getEditModel().creativeModel.changeAvatarModel.isFromChangeAvatar || getEditModel().creativeModel.draftInfoModel.isDraft) {
            Z1(new AwS566S0100000_22(this, 371));
            return;
        }
        C201955140j.LJ("change_avatar_mode: start upload avatar info");
        InterfaceC1457660o2G interfaceC1457660o2GI3 = i3();
        if (interfaceC1457660o2GI3 != null) {
            interfaceC1457660o2GI3.RE(new AwS566S0100000_22(this, 370), AFwS261S0000000_22.get$arr$(136));
        }
    }

    private final void VB1() {
        NLEModel nLEModelLIZ;
        NLEModel nLEModelLIZ2;
        C1436990nUv.LJIIIZ(H3().g().getValue(), getEditModel());
        boolean zLJIIIIZZ = false;
        if (C365940EWi.LIZLLL(getEditModel())) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            VideoPublishEditModel editModel = getEditModel();
            InterfaceC1452170ntP value = H3().g().getValue();
            if (value != null && (nLEModelLIZ2 = C352130DrH.LIZ(value)) != null) {
                zLJIIIIZZ = C1429320nIY.LJIIIIZZ(nLEModelLIZ2);
            }
            C23250099c.LIZLLL(lifecycleScope, null, null, new C353301Yt(new AwS566S0100000_22(this, 363), editModel, zLJIIIIZZ, null), 3);
            return;
        }
        LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this);
        VideoPublishEditModel editModel2 = getEditModel();
        InterfaceC1452170ntP value2 = H3().g().getValue();
        if (value2 != null && (nLEModelLIZ = C352130DrH.LIZ(value2)) != null) {
            zLJIIIIZZ = C1429320nIY.LJIIIIZZ(nLEModelLIZ);
        }
        C23250099c.LIZLLL(lifecycleScope2, null, null, new C353301Yt(new AwS566S0100000_22(this, 364), editModel2, zLJIIIIZZ, null), 3);
    }

    private final void Z4() {
        C1428520nHG.LJLI(getEditModel());
        InterfaceC1452170ntP value = H3().g().getValue();
        if (value != null) {
            getEditModel().getPreviewInfo().setPreviewVideoLength(value.getDuration());
            getEditModel().setNleData(value.Zf());
            if (C350300DoK.LIZ()) {
                getEditModel().setNleModel(value.bf(false));
                getEditModel().setNleDataChange(false);
            }
        }
        if (getEditModel().mIsFromDraft && getEditModel().isDraftMusicIllegal() && MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel) != null) {
            getEditModel().setDraftMusicIllegal(false);
        }
    }

    private final InterfaceC1452170ntP e4() {
        return H3().g().getValue();
    }

    private final void o2() {
        InterfaceC1431860nMe interfaceC1431860nMeK4 = K4();
        if (interfaceC1431860nMeK4 != null) {
            interfaceC1431860nMeK4.hh2(true, "story_edit_page_message_panel", null);
        }
    }

    private final void w2() {
        AbstractC1453750nvx abstractC1453750nvxO3;
        InterfaceC1454960nxu interfaceC1454960nxuLLLLLIL;
        if (C1430550nKX.LIZ(getEditModel()) || (abstractC1453750nvxO3 = O3()) == null || (interfaceC1454960nxuLLLLLIL = abstractC1453750nvxO3.LLLLLIL()) == null) {
            return;
        }
        interfaceC1454960nxuLLLLLIL.ar();
    }

    private final void x5() {
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        NLEEditor nLEEditor;
        if (!C1440380naO.LIZIZ(getEditModel())) {
            C201955140j.LIZ("SocialEditBottomBarComponent replaceStreamingUrl: not a streaming-entry session, skip");
            return;
        }
        InterfaceC1452170ntP interfaceC1452170ntPE4 = e4();
        if (!(interfaceC1452170ntPE4 instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) interfaceC1452170ntPE4) == null || (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) == null || (nLEEditor = c348100DkmLIZLLL.LIZ) == null) {
            C201955140j.LIZ("SocialEditBottomBarComponent replaceStreamingUrl: nleEditor is null");
            return;
        }
        IShareToStoryVideoStreamController iShareToStoryVideoStreamController = (IShareToStoryVideoStreamController) PluggableExtentionKt.pluggableSpi$default(IShareToStoryVideoStreamController.class, false, false, false, 14, null);
        if (iShareToStoryVideoStreamController == null) {
            C201955140j.LIZ("SocialEditBottomBarComponent replaceStreamingUrl: streamController SPI is null");
            return;
        }
        Set<String> setLIZJ = C348750Dlp.LIZJ(nLEEditor.getModel(), new AwS601S0100000_22(iShareToStoryVideoStreamController, 242), AFwS261S0000000_22.get$arr$(135), new AwS601S0100000_22(nLEEditor, 238));
        if (!setLIZJ.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialEditBottomBarComponent replaceStreamingUrl: ");
            sbLIZ.append(setLIZJ.size());
            sbLIZ.append(" URL(s) still downloading at publish time; CompileTask.waitForStreamingDownloadsIfNeeded will wait.");
            C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void G2() {
        InterfaceC1439570nZ5 interfaceC1439570nZ5O4 = O4();
        if (interfaceC1439570nZ5O4 != null) {
            interfaceC1439570nZ5O4.fY0("social_bottom_bar");
        }
        if (!this.LLJJJJLIIL) {
            H3().wi0();
            this.LLJJJJLIIL = true;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "story_creative_tool_jato_publish_page_settings", true, false)) {
            C2139308Zr.LIZ();
        }
        InterfaceC572230McP interfaceC572230McPQ3 = Q3();
        if (interfaceC572230McPQ3 != null) {
            interfaceC572230McPQ3.H91();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("click story post2StoryClickListener creationId = ");
        sbLIZ.append(getEditModel().getCreationId());
        C1450070nq1.LJII(C2188811AlT.LIZIZ(sbLIZ));
        D5(0);
        t5();
    }

    @Override // X.InterfaceC2221571BxD
    public void YA2() {
        o2();
        n5();
        C0L2R c0l2r = C0L2R.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c0l2r.getClass();
        C0LAB c0labLIZ = C0L2R.LIZ(editModel);
        if (C298680BnG.LIZ()) {
            c0labLIZ.LIZ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
        }
        C2341909Fp.LIZ("story_edit_page_share_button_click", c0labLIZ.LIZ);
    }

    @Override // X.InterfaceC2221571BxD
    public void ZS1() {
        o2();
        C5("", new AwS566S0100000_22(this, 366));
        C0L2R c0l2r = C0L2R.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c0l2r.getClass();
        C0LAB c0labLIZ = C0L2R.LIZ(editModel);
        c0labLIZ.LJ("message_button_show_way", "story_edit_page");
        C2341909Fp.LIZ("story_edit_page_send_message_button_click", c0labLIZ.LIZ);
    }

    public final void k5() {
        IStoryRevealService iStoryRevealServiceLJJJJ;
        if (!C1453840nw6.LIZLLL(getEditModel()) || (iStoryRevealServiceLJJJJ = C1618440sDa.LIZIZ.LJJJJ()) == null) {
            return;
        }
        iStoryRevealServiceLJJJJ.LJIILLIIL(getEditModel().getCreationId(), Intrinsics.LJFF(getEditModel().getShootEnterMethod(), EnumC1225180hzI.CLICK_REVEAL_STORY_UNLOCK.getMobValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.1BqW, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // X.InterfaceC2221571BxD
    public void m4() {
        ?? c1460420o6i = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_quick_post_storage_permission_check", true) > 0 ? new C1460420o6i(this) : new C1460440o6k(this);
        if (!getEditModel().getAILivePhotoModel().LJIIJ() || W2() == null) {
            c1460420o6i.invoke();
            return;
        }
        InterfaceC1455680nz4 interfaceC1455680nz4W2 = W2();
        if (interfaceC1455680nz4W2 != null) {
            interfaceC1455680nz4W2.Qu(true, new AwS566S0100000_22((C2217421BqW) c1460420o6i, 368));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<Boolean> liveDataRJ;
        LiveData<Pair<Boolean, Boolean>> liveDataX8;
        LiveData<Boolean> liveDataQW;
        super.onCreate();
        C1465810oFP c1465810oFP = C1465810oFP.LIZ;
        String creationId = getEditModel().getCreationId();
        String enterFrom = getEditModel().getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        String shootEnterMethod = getEditModel().getShootEnterMethod();
        c1465810oFP.getClass();
        C1465810oFP.LIZIZ(creationId, enterFrom, shootEnterMethod, true);
        C1DRG diContainer = getDiContainer();
        if (C365940EWi.LIZLLL(getEditModel())) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1455610nyx.class, new AwS601S0100000_22(this, 239));
        } else {
            InterfaceC1455610nyx interfaceC1455610nyx = (InterfaceC1455610nyx) ((C05YF) diContainer.LJIIL(null, InterfaceC1455610nyx.class));
            if (interfaceC1455610nyx != null && (liveDataX8 = interfaceC1455610nyx.x8()) != null) {
                liveDataX8.observe(this, new AObserverS225S0100000_22(this, 55));
            }
            if (!C1454460nx6.LIZ() && interfaceC1455610nyx != null && (liveDataRJ = interfaceC1455610nyx.RJ()) != null) {
                liveDataRJ.observe(this, new AObserverS225S0100000_22(this, 56));
            }
        }
        InterfaceC1444410ngt interfaceC1444410ngtZ4 = z4();
        if (interfaceC1444410ngtZ4 == null || (liveDataQW = interfaceC1444410ngtZ4.QW()) == null) {
            return;
        }
        liveDataQW.observe(this, new AObserverS225S0100000_22(this, 57));
    }

    public final void t5() {
        InterfaceC1451520nsM interfaceC1451520nsME3;
        if (d5() && (interfaceC1451520nsME3 = E3()) != null) {
            interfaceC1451520nsME3.m7("enter Story publish!");
        }
        C1385120m9G.LIZ();
        C1465810oFP c1465810oFP = C1465810oFP.LIZ;
        String creationId = getEditModel().getCreationId();
        c1465810oFP.getClass();
        C1465810oFP.LIZ(creationId);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_publish_cancel_load_music", true) == 0) {
            w2();
        }
        getEditModel().creativeModel.collabInfoModel.setCollabUserList(null);
        C0CHQ.LIZ().LJI().LIZJ().LJFF(getEditModel(), "postStory");
        VB1();
    }

    public InterfaceC2221571BxD c3() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC2221571BxD
    public InterfaceC346201Wa<C1666540tTA> getState() {
        return this.LLJJIJIL;
    }

    private final void D5(int i) {
        if (!u4.LJJZZI(getEditModel())) {
            return;
        }
        C20622315mn.LIZJ();
    }

    public static final void P4(C1460240o6Q c1460240o6Q) {
        VideoPublishEditModel editModel = c1460240o6Q.getEditModel();
        C0CHQ.LIZ().getPublishService().LJJJLL();
        editModel.setSaveModel(C1431870nMf.LJIIJJI(c1460240o6Q.getEditModel(), 0, false, new InterfaceC1436300nTo() { // from class: X.0o6w
            @Override // X.InterfaceC1436300nTo
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1436300nTo
            public final boolean isEnabled() {
                return false;
            }
        }, false));
        AVUploadSaveModel saveModel = c1460240o6Q.getEditModel().getSaveModel();
        if (saveModel != null) {
            saveModel.setSaveLocal(true);
        }
        if (C1428520nHG.LJJ(c1460240o6Q.getEditModel()) && C0CHQ.LIZ().LJJIIZI().LJIIIIZZ()) {
            AVUploadSaveModel saveModel2 = c1460240o6Q.getEditModel().getSaveModel();
            if (saveModel2 != null) {
                saveModel2.setWaterMark(true);
            }
        } else {
            AVUploadSaveModel saveModel3 = c1460240o6Q.getEditModel().getSaveModel();
            if (saveModel3 != null) {
                saveModel3.setWaterMark(false);
            }
        }
        AVUploadSaveModel saveModel4 = c1460240o6Q.getEditModel().getSaveModel();
        if (saveModel4 != null) {
            CreativeModel creativeModel = c1460240o6Q.getEditModel().creativeModel;
            C548590LfN.LIZ.getClass();
            saveModel4.setAIWaterMark(C548590LfN.LIZLLL().LJIILJJIL(creativeModel));
        }
        if (c1460240o6Q.getEditModel().creativeModel.editSaveLocalModel.forceQuickPublicPost) {
            c1460240o6Q.getEditModel().isPrivate = 0;
        }
        c1460240o6Q.publish();
    }

    public static final void T4(final C1460240o6Q c1460240o6Q) {
        C19EG c19egRequireFragmentActivity;
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC214814194y abstractC214814194yH4 = c1460240o6Q.H4();
            if (abstractC214814194yH4 != null && (c19egRequireFragmentActivity = abstractC214814194yH4.requireFragmentActivity()) != null) {
                C540290LGx.LJI(C540290LGx.LIZ, c19egRequireFragmentActivity, new C0LH5() { // from class: X.0o6m
                    @Override // X.C0LH5
                    public final void LIZ(int[] iArr, String[] strArr) {
                        C1460240o6Q.P4(this.LIZ);
                    }
                }, null, null, null, TokenCert.Companion.with("bpea-tools_request_storage_permission_edit_page_save_local"), 28);
                return;
            }
            return;
        }
        P4(c1460240o6Q);
    }

    private final boolean W1(Function0<Unit> function0) {
        InterfaceC1453760nvy interfaceC1453760nvyQ3;
        if (getEditModel().getAILivePhotoModel().LJIIJ() && W2() != null) {
            InterfaceC1455680nz4 interfaceC1455680nz4W2 = W2();
            if (interfaceC1455680nz4W2 != null) {
                interfaceC1455680nz4W2.Qu(true, new AwS566S0100000_22(function0, (Function0<Boolean>) 360));
            }
            return false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_audio_copyright_detect_story", true) == 1 && (interfaceC1453760nvyQ3 = q3()) != null && interfaceC1453760nvyQ3.KB2("video_edit_page", "click_edit_page_next", !getEditModel().creativeModel.audioCopyrightDetectModel.getContinueSelected(), null, new AwS566S0100000_22(function0, (Function0<Boolean>) 362))) {
            return false;
        }
        return true;
    }

    private final void X1(final Function0<Unit> function0) {
        if (((Number) C301620Bs0.LIZ.getValue()).intValue() == 2) {
            function0.invoke();
            return;
        }
        Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(getEditModel(), true, null, true, 2);
        if (pairLJJIIJZLJL != null) {
            C1456230nzx c1456230nzx = new C1456230nzx(getEditModel());
            c1456230nzx.LIZ.LJIIIIZZ = e4();
            c1456230nzx.LIZ.LIZIZ = pairLJJIIJZLJL.getFirst();
            int iIntValue = pairLJJIIJZLJL.getSecond().intValue();
            C1457050o1H c1457050o1H = c1456230nzx.LIZ;
            c1457050o1H.LJFF = iIntValue;
            c1457050o1H.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0o6o
                @Override // X.InterfaceC1457180o1U
                public final void onError(int i, String str) {
                    C201955140j.LJ(str);
                    this.LIZ.LLJJJJJIL = false;
                }
            };
            c1457050o1H.LIZJ = new C0MBV() { // from class: X.0o6s
                @Override // X.C0MBV
                public final void LIZLLL() {
                    function0.invoke();
                }
            };
            C1457060o1I.LIZIZ(c1457050o1H);
            return;
        }
        function0.invoke();
    }

    public final void Z1(Function0<Unit> function0) {
        this.LLILZ.post(new ARunnableS91S0200000_22(this, (Function0) function0, 15));
    }

    @Override // X.InterfaceC1439590nZ7
    public void Zh1(boolean z) {
        InterfaceC332260D0u<C1666540tTA> interfaceC332260D0u = this.LLJJIJIL;
        interfaceC332260D0u.LIZJ(C1666540tTA.LIZ(interfaceC332260D0u.getValue(), z, null, 524286));
    }

    public C1460240o6Q(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLJJJJ = c19a3.requireActivity();
    }

    private final void C5(String str, Function0<Unit> function0) {
        C1618440sDa.LIZIZ.LJIIJJI().LIZIZ(this.LLJJJJ, str, true, getEditModel(), "story_edit_page", false, function0);
    }

    @Override // X.InterfaceC2221571BxD
    public void gL(int i, int i2) {
        InterfaceC1460680o78 interfaceC1460680o78T2 = T2();
        if (interfaceC1460680o78T2 != null) {
            interfaceC1460680o78T2.RL2();
        }
    }
}
