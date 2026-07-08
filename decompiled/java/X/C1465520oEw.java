package X;

import Y.ACallableS413S0100000_5;
import Y.AObjectS245S0100000_22;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.social.creation.api.IStoryEditExitDialogRelaxPolicy;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS91S0210000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465520oEw extends AbstractC2255721DQs<InterfaceC1453420nvQ> implements InterfaceC1453420nvQ, InterfaceC379610EuV {
    public static final C1465610oF5 LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C1DRG LL;
    public NLENode LLJILJIL;
    public InterfaceC391240FVq LLJILJILJ;
    public String LLJILLL;
    public final C560530Lyd<Unit> LLJJJ;
    public final LiveEvent<Unit> LLJJJIL;
    public final C560530Lyd<Unit> LLJJJJ;
    public final LiveEvent<Unit> LLJJJJJIL;
    public final LiveEvent<Unit> LLJJJJLIIL;
    public final LiveEvent<Unit> LLJJL;
    public final C560530Lyd<Unit> LLJJLIIIJLLLLLLLZ;
    public final LiveEvent<Unit> LLJL;
    public final C560530Lyd<Unit> LLJLIL;
    public final LiveEvent<Unit> LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C01GW LLJLLIL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578380MmK.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455010nxz.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457990o2n.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
    public final C19EG LLJIJIL = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public int LLJJ = -1;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 474));
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453760nvy.class, null);
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 471));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 512));
    public final C1465520oEw LLJJIJIL = this;

    @Override // X.InterfaceC1453420nvQ
    public boolean yV0() {
        return Z1(false, "");
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0oF5] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1465520oEw.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1465520oEw.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1465520oEw.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0), new C2217381BqS(C1465520oEw.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1465520oEw.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/BaseEditStickerApi;", 0), new C2217381BqS(C1465520oEw.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C1465520oEw.class, "memeSongStickerApi", "getMemeSongStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/memesong/MemeSongStickerApi;", 0), new C2217381BqS(C1465520oEw.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0), new C2217381BqS(C1465520oEw.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0), new C2217381BqS(C1465520oEw.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0)};
        LLJLLL = new Object() { // from class: X.0oF5
        };
        LLJZIJLIL = 8;
    }

    private final InterfaceC1455850nzL G2() {
        return (InterfaceC1455850nzL) this.LLIZ.getValue(this, LLJZ[5]);
    }

    private final C0M81 H3() {
        return (C0M81) this.LLJJIJIIJIL.getValue();
    }

    private final boolean O3() {
        boolean z = false;
        IStoryEditExitDialogRelaxPolicy iStoryEditExitDialogRelaxPolicy = (IStoryEditExitDialogRelaxPolicy) PluggableExtentionKt.pluggableSpi$default(IStoryEditExitDialogRelaxPolicy.class, false, false, false, 14, null);
        if (iStoryEditExitDialogRelaxPolicy != null && iStoryEditExitDialogRelaxPolicy.LIZ(getEditModel())) {
            z = true;
        }
        return Z1(z, " quitDialog");
    }

    private final void Q3() {
        C1402840mbq c1402840mbqLJ = C1403010mc7.LIZ.getBridgeService().LJ(getEditModel());
        if (c1402840mbqLJ != null) {
            EditModel editModel = getEditModel().creativeModel.editModel;
            String str = c1402840mbqLJ.mAppName;
            if (str == null) {
                str = "";
            }
            editModel.sdkSourceApp = str;
        }
    }

    private final InterfaceC1451520nsM i3() {
        return (InterfaceC1451520nsM) this.LLJ.getValue(this, LLJZ[7]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x023b, code lost:
    
        if (com.bytedance.ies.abmock.SettingsManager.LIZ("aigc_countdown_draft_exit_killswitch", false) == false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean k5() {
        /*
            Method dump skipped, instruction units count: 1633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465520oEw.k5():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean n5() {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465520oEw.n5():boolean");
    }

    private final InterfaceC1457990o2n v3() {
        return (InterfaceC1457990o2n) this.LLIZLLLIL.getValue(this, LLJZ[6]);
    }

    public final AbstractC214814194y B3() {
        return (AbstractC214814194y) this.LLILLJJLI.getValue(this, LLJZ[0]);
    }

    public final C1465540oEy E3() {
        return (C1465540oEy) this.LLJLLIL.getValue();
    }

    public final InterfaceC1453760nvy H2() {
        return (InterfaceC1453760nvy) this.LLJJIII.getValue(this, LLJZ[9]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZIL.getValue(this, LLJZ[3]);
    }

    public final void K4() {
        C560380LyO c560380LyO = C560380LyO.LIZ;
        boolean zIsLastScene = B3().isLastScene();
        c560380LyO.getClass();
        C560380LyO.LJIIIZ("quit_to_ai_self_tab", zIsLastScene);
        InterfaceC559500Lwy interfaceC559500LwyT2 = T2();
        if (interfaceC559500LwyT2 != null) {
            interfaceC559500LwyT2.Bw0();
        }
        W2().LIZ();
    }

    public final void O4() {
        C560380LyO c560380LyO = C560380LyO.LIZ;
        boolean zIsLastScene = B3().isLastScene();
        c560380LyO.getClass();
        C560380LyO.LJIIIZ("quit_to_last_page", zIsLastScene);
        B3().setResult();
        B3().finish();
    }

    @Override // X.InterfaceC1453420nvQ
    public void Of1() {
        NLEModel nLEModelLIZ;
        NLENode nLENodeDeepClone;
        NLEModel nLEModelDynamicCast;
        VecNLETrackSlotSPtr slots;
        VecNLETrackSlotSPtr slots2;
        C201955140j.LJIILL(C1662160tM6.LIZIZ, "EditExitComponent", "updateOriginalModel");
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null || (nLENodeDeepClone = nLEModelLIZ.deepClone()) == null) {
            return;
        }
        if (C301590Brx.LIZ()) {
            nLEModelDynamicCast = NLEModel.dynamicCast(nLENodeDeepClone);
            VecNLETrackSPtr tracks = nLEModelDynamicCast.getTracks();
            if (tracks != null) {
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    NLETrack nLETrack2 = nLETrack;
                    if (C351220Dpo.LLLJL(nLETrack2) || !nLETrack2.getEnable() || (slots2 = nLETrack2.getSlots()) == null || slots2.isEmpty()) {
                        arrayList.add(nLETrack);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    nLEModelDynamicCast.removeTrack((NLETrack) it2.next());
                }
            }
            NLETrack mainTrack = nLEModelDynamicCast.getMainTrack();
            if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                for (NLETrackSlot nLETrackSlot : slots) {
                    NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                    boolean enableAudio = nLESegmentVideo != null ? nLESegmentVideo.getEnableAudio() : true;
                    NLESegmentVideo nLESegmentVideo2 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                    if (nLESegmentVideo2 != null) {
                        nLESegmentVideo2.setEnableAudio(enableAudio);
                    }
                }
            }
        } else {
            nLEModelDynamicCast = NLEModel.dynamicCast(nLENodeDeepClone);
        }
        this.LLJILJIL = nLEModelDynamicCast;
    }

    @Override // X.InterfaceC1453420nvQ
    public boolean Q2() {
        InterfaceC559500Lwy interfaceC559500LwyT2;
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditExitComponent -> hasEdited() -> hasStickers = ");
        InterfaceC578380MmK interfaceC578380MmKC3 = c3();
        sbLIZ.append(interfaceC578380MmKC3 != null ? interfaceC578380MmKC3.C1() : false);
        sbLIZ.append(", nleHasEdited() = ");
        sbLIZ.append(e4());
        C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC578380MmK interfaceC578380MmKC32 = c3();
        return (interfaceC578380MmKC32 != null && interfaceC578380MmKC32.C1()) || e4() || ((interfaceC559500LwyT2 = T2()) != null && interfaceC559500LwyT2.fz()) || z4();
    }

    public final InterfaceC559500Lwy T2() {
        return (InterfaceC559500Lwy) this.LLJI.getValue(this, LLJZ[8]);
    }

    public final C0M7N W2() {
        return (C0M7N) this.LLJJIJI.getValue();
    }

    public final InterfaceC578380MmK c3() {
        return (InterfaceC578380MmK) this.LLILZ.getValue(this, LLJZ[2]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJZ[1]);
    }

    public final InterfaceC1455010nxz m3() {
        return (InterfaceC1455010nxz) this.LLILZLL.getValue(this, LLJZ[4]);
    }

    public final C0E48 q3() {
        return (C0E48) this.LLJJI.getValue();
    }

    private final boolean F4() {
        if (C571290Mat.LIZLLL(getEditModel())) {
            O4();
            return true;
        }
        if (getEditModel().getOriginal() == 0 || getEditModel().getOriginal() == 2 || getEditModel().getAILivePhotoModel().LJI()) {
            if (Q2()) {
                W2().LJIIL(R.raw.icon_x_mark_circle, 2131829833, new AwS566S0100000_22(this, 483));
                return true;
            }
            o2();
            return true;
        }
        if (C1428520nHG.LJJJZ(getEditModel()) || C1428520nHG.LJJLIIIJ(getEditModel())) {
            if (Q2()) {
                W2().LJIIL(R.raw.icon_x_mark_circle, 2131829833, new AwS566S0100000_22(this, 485));
                return true;
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_remove_start_over_in_story_draft", true, false)) {
                dC1();
                return true;
            }
            W2().LJIILJJIL(C1428520nHG.LJJLIIIJ(getEditModel()) ? 2131839857 : 2131829848, R.raw.icon_arrow_turn_left, AFwS210S0000000_22.get$arr$(204), new C1465570oF1(this), false);
            return true;
        }
        if (getEditModel().getOriginal() == 1 && getEditModel().getRecordMode() == 0 && !Q2()) {
            W2().LJIILJJIL(2131829843, R.raw.icon_camera, new AwS566S0100000_22(this, 489), new C1465580oF2(this), C1439180nYS.LIZ(getEditModel()) && !C351360Dq2.LJFF(JY0().LLZ()));
            return true;
        }
        if (getEditModel().getOriginal() != 1 || getEditModel().getRecordMode() != 0 || !Q2()) {
            return false;
        }
        boolean zLJFF = C351360Dq2.LJFF(JY0().LLZ());
        if (!C1439180nYS.LIZ(getEditModel()) || zLJFF) {
            C1452150ntN.LIZLLL();
            W2().LJIIL(R.raw.icon_x_mark_circle, 2131829833, new AwS566S0100000_22(this, 494));
            return true;
        }
        C571460MbA c571460MbA = C571460MbA.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        NLEModel nLEModelLLZ = JY0().LLZ();
        C19EG c19eg = this.LLJIJIL;
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 492);
        c571460MbA.getClass();
        C571460MbA.LIZIZ(editModel, nLEModelLLZ, c19eg, awS566S0100000_22);
        return true;
    }

    private final boolean H4() {
        if (C571290Mat.LIZLLL(getEditModel())) {
            O4();
            return true;
        }
        if (getEditModel().isTemplateMv() || C1428520nHG.LJJLIIIJJIZ(getEditModel())) {
            W2().LJIIL(R.raw.icon_trash_bin, 2131829841, new AwS566S0100000_22(this, 496));
            return true;
        }
        if (getEditModel().isDuet()) {
            W2().LJIIL(R.raw.icon_x_mark_circle, 2131829833, new AwS566S0100000_22(this, 498));
            return true;
        }
        if (getEditModel().creativeModel.aiSelfModel.isUltraFastModelCreation) {
            if (Q2()) {
                W2().LJIIL(R.raw.icon_trash_bin, 2131829841, new AwS566S0100000_22(this, 500));
                return true;
            }
            K4();
            return true;
        }
        if (C1428470nHB.LJLZ(getEditModel()) || C1428470nHB.LLFFF(getEditModel())) {
            if (Q2()) {
                W2().LJIIL(R.raw.icon_trash_bin, 2131829841, new AwS566S0100000_22(this, 502));
                return true;
            }
            X1();
            return true;
        }
        if (C1428520nHG.LJLIIL(getEditModel())) {
            if (Q2()) {
                W2().LJIIL(R.raw.icon_trash_bin, 2131829841, new AwS566S0100000_22(this, 504));
                return true;
            }
            MO0();
            return true;
        }
        if (C1428520nHG.LJJJZ(getEditModel()) || C1428520nHG.LJJLIIIJ(getEditModel())) {
            if (Q2()) {
                W2().LJIIL(R.raw.icon_trash_bin, 2131829841, new AwS566S0100000_22(this, 506));
                return true;
            }
            P4();
            return true;
        }
        if ((getEditModel().getOriginal() != 1 && getEditModel().getOriginal() != 2) || getEditModel().getRecordMode() != 0) {
            return false;
        }
        if (Q2()) {
            W2().LJIIL(R.raw.icon_x_mark_circle, 2131829833, new AwS566S0100000_22(this, 508));
            return true;
        }
        P4();
        return true;
    }

    private final void W1() {
        if (C301590Brx.LIZ()) {
            G2().AT().LIZ(this, new AObjectS245S0100000_22(this, 122));
        }
    }

    private final void Z4() {
        List<TextStickerData> listLr0;
        if (C295830Bif.LIZ() && ((ArrayList) C1452150ntN.LIZJ).isEmpty()) {
            InterfaceC1452170ntP value = JY0().g().getValue();
            int duration = value != null ? value.getDuration() : 0;
            NLEModel nLEModelLLZ = JY0().LLZ();
            if (nLEModelLLZ != null) {
                ArrayList arrayList = new ArrayList();
                InterfaceC1461660o8i interfaceC1461660o8iLIZJ = ((InterfaceC1455850nzL) getDiContainer().LJII(InterfaceC1455850nzL.class, null)).AT().LIZJ();
                if (interfaceC1461660o8iLIZJ != null && (listLr0 = interfaceC1461660o8iLIZJ.lr0()) != null) {
                    Iterator<TextStickerData> it2 = listLr0.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C565910MHl());
                C1452150ntN.LJI(arrayList2, getEditModel(), nLEModelLLZ, arrayList, duration);
            }
            this.LLJLIL.LJIIJ(Unit.LIZ);
        }
    }

    private final boolean e4() {
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null) {
            return false;
        }
        C1463670oBx c1463670oBx = (C1463670oBx) value;
        NLENode nLENode = this.LLJILJIL;
        if (nLENode == null) {
            nLENode = null;
        }
        return !nLENode.unorderEquals(c1463670oBx.LIZJ());
    }

    private final boolean z4() {
        return C1428470nHB.LJLLLLLL(getEditModel()) && !C1428470nHB.LJJJZ(getEditModel());
    }

    @Override // X.InterfaceC1453420nvQ
    public boolean A8() {
        C570010MXf c570010MXf = W2().LJIILL;
        return c570010MXf != null && c570010MXf.LIZJ();
    }

    @Override // X.InterfaceC1453420nvQ
    public void MO0() {
        Z4();
        InterfaceC559500Lwy interfaceC559500LwyT2 = T2();
        if (interfaceC559500LwyT2 != null) {
            interfaceC559500LwyT2.Bw0();
        }
        if (C298240BmY.LIZ() && getEditModel().isUploadVideo()) {
            C0M7N c0m7nW2 = W2();
            c0m7nW2.getClass();
            CreativeInfo creativeInfo = c0m7nW2.LIZJ.getCreativeInfo();
            if (!((Boolean) C280810AzX.LIZ.getValue()).booleanValue()) {
                C15O7.LIZJ(new ACallableS413S0100000_5(creativeInfo, 1));
            }
        }
        if (C2263008to.LIZ() && getEditModel().isUploadVideo()) {
            ((IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class)).LJIIL();
        }
        W2().LJFF();
    }

    public final void P4() {
        if (C0CHQ.LIZ().LJJJJJ().shouldDisable10MinDraftRecord(getEditModel())) {
            C19EG c19eg = this.LLJIJIL;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131824731);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(c19eg, 1047, creativeToastBuilder);
            return;
        }
        C560380LyO.LIZ.getClass();
        C560380LyO.LJIIIZ("quit_to_record_page", false);
        Z4();
        C1446160nji.LIZLLL(getEditModel());
        JY0().vK2();
        InterfaceC559500Lwy interfaceC559500LwyT2 = T2();
        if (interfaceC559500LwyT2 != null) {
            interfaceC559500LwyT2.Bw0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // X.InterfaceC1453420nvQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Si1() {
        /*
            r4 = this;
            boolean r0 = X.C301590Brx.LIZ()
            if (r0 == 0) goto L44
            r0 = -1
            r4.LLJJ = r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.getEditModel()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
            java.util.List r3 = X.C1466090oFr.LJFF(r0)
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r4.LLJJ = r0
            if (r0 <= 0) goto L2a
            boolean r0 = r4.LLJLL
            if (r0 != 0) goto L2a
            r0 = 1
            r4.LLJLL = r0
            r4.W1()
        L2a:
            int r0 = r4.LLJJ
            if (r0 <= 0) goto L44
            X.0tM6 r2 = X.C1662160tM6.LIZIZ
            java.lang.String r1 = "EditExitComponent"
            java.lang.String r0 = "updateStickerModel"
            X.C201955140j.LJIILL(r2, r1, r0)
            com.google.gson.Gson r0 = X.C2337609Dy.LIZ()     // Catch: java.lang.RuntimeException -> L40
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r3)     // Catch: java.lang.RuntimeException -> L40
            goto L45
        L40:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L44:
            r0 = 0
        L45:
            r4.LLJILLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465520oEw.Si1():void");
    }

    public final void T4() {
        VideoEditContainerScene videoEditContainerScene;
        AbstractC1453750nvx abstractC1453750nvx;
        InterfaceC1444170ngV interfaceC1444170ngVLLLLLJIL;
        ArrayList<TimeSpeedModelExtension> arrayList;
        List<TextStickerData> listLr0;
        InterfaceC1452170ntP value = JY0().g().getValue();
        int duration = value != null ? value.getDuration() : 0;
        InterfaceC1457990o2n interfaceC1457990o2nV3 = v3();
        if (interfaceC1457990o2nV3 != null) {
            interfaceC1457990o2nV3.E31();
        }
        NLEModel nLEModelLLZ = JY0().LLZ();
        if (nLEModelLLZ != null) {
            ArrayList arrayList2 = new ArrayList();
            InterfaceC1461660o8i interfaceC1461660o8iLIZJ = ((InterfaceC1455850nzL) getDiContainer().LJII(InterfaceC1455850nzL.class, null)).AT().LIZJ();
            if (interfaceC1461660o8iLIZJ != null && (listLr0 = interfaceC1461660o8iLIZJ.lr0()) != null) {
                Iterator<TextStickerData> it2 = listLr0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next());
                }
            }
            InterfaceC1461660o8i interfaceC1461660o8iLIZJ2 = ((InterfaceC1455850nzL) getDiContainer().LJII(InterfaceC1455850nzL.class, null)).AT().LIZJ();
            if (interfaceC1461660o8iLIZJ2 != null) {
                interfaceC1461660o8iLIZJ2.Wf();
            }
            VideoPublishEditModel editModel = getEditModel();
            C1452150ntN.LIZLLL();
            C1452150ntN.LIZ = editModel.getCreationId();
            C1452150ntN.LIZIZ = editModel.creativeModel.editModel.showFirstTimeAnim;
            ArrayList arrayList3 = (ArrayList) C1452150ntN.LIZJ;
            arrayList3.clear();
            arrayList3.add(new InterfaceC349110DmP() { // from class: X.0EKV
                public final ArrayList<StickerItemModel> LIZ = new ArrayList<>();
                public final ArrayList<NLETrack> LIZIZ = new ArrayList<>();
                public long LIZJ;

                @Override // X.InterfaceC349110DmP
                public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJ() {
                    return false;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJ(Function1<? super List<? extends EffectPointModel>, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJJI(Function1<? super TextStickerData, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final List<TextStickerData> LLLLLLZZ() {
                    return null;
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZ() {
                    this.LIZIZ.clear();
                    this.LIZ.clear();
                    this.LIZJ = 0L;
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJFF() {
                    return !this.LIZ.isEmpty();
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJIIIIZZ() {
                    return !this.LIZ.isEmpty();
                }

                @Override // X.InterfaceC349110DmP
                public final NLETrackType LIZIZ() {
                    return NLETrackType.STICKER;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJII(NLEEditor nLEEditor) {
                    Iterator<NLETrack> it3 = this.LIZIZ.iterator();
                    while (it3.hasNext()) {
                        nLEEditor.getModel().addTrack(it3.next());
                    }
                    this.LIZIZ.clear();
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIIZ(Function1<? super StickerItemModel, Unit> function1) {
                    Iterator<StickerItemModel> it3 = this.LIZ.iterator();
                    while (it3.hasNext()) {
                        function1.invoke(it3.next());
                    }
                }

                public final NLETrackSlot LJIILIIL(String str) {
                    ArrayList<NLETrack> arrayList4 = this.LIZIZ;
                    if (arrayList4 != null) {
                        Iterator<NLETrack> it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            VecNLETrackSlotSPtr slots = it3.next().getSlots();
                            if (slots != null) {
                                for (NLETrackSlot nLETrackSlot : slots) {
                                    if (Intrinsics.LJFF(nLETrackSlot.getUUID(), str)) {
                                        return nLETrackSlot;
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    return null;
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZJ(VideoPublishEditModel videoPublishEditModel, int i) {
                    InfoStickerModel infoStickerModel;
                    List<StickerItemModel> list;
                    String uuid;
                    NLENode nLENode;
                    Iterator<StickerItemModel> it3 = this.LIZ.iterator();
                    while (it3.hasNext()) {
                        StickerItemModel next = it3.next();
                        if (next.isPin) {
                            next.isPin = false;
                        }
                        long j = i;
                        if (((long) next.startTime) * 1000 >= j) {
                            it3.remove();
                            String str = next.uuid;
                            Iterator<NLETrack> it4 = this.LIZIZ.iterator();
                            while (it4.hasNext()) {
                                VecNLETrackSlotSPtr slots = it4.next().getSlots();
                                if (slots != null && (nLENode = (NLENode) C13LP.LJJJLL(slots)) != null) {
                                    uuid = nLENode.getUUID();
                                } else {
                                    uuid = null;
                                }
                                if (Intrinsics.LJFF(uuid, str)) {
                                    it4.remove();
                                }
                            }
                        } else {
                            long j2 = ((long) next.endTime) * 1000;
                            if (j2 > j || (Math.abs(j2 - this.LIZJ) < 1000000 && next.startTime == 0)) {
                                int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
                                next.endTime = i2;
                                next.uiEndTime = i2;
                                NLETrackSlot nLETrackSlotLJIILIIL = LJIILIIL(next.uuid);
                                if (nLETrackSlotLJIILIIL != null) {
                                    nLETrackSlotLJIILIIL.setEndTime(j);
                                }
                            }
                        }
                        NLETrackSlot nLETrackSlotLJIILIIL2 = LJIILIIL(next.uuid);
                        if (nLETrackSlotLJIILIIL2 != null) {
                            nLETrackSlotLJIILIIL2.setPinAlgorithmFile(null);
                        }
                    }
                    if (!this.LIZ.isEmpty()) {
                        if (videoPublishEditModel.getInfoStickerModel() == null) {
                            videoPublishEditModel.setInfoStickerModel(new InfoStickerModel());
                        }
                        InfoStickerModel infoStickerModel2 = videoPublishEditModel.getInfoStickerModel();
                        if ((infoStickerModel2 == null || infoStickerModel2.stickers == null) && (infoStickerModel = videoPublishEditModel.getInfoStickerModel()) != null) {
                            infoStickerModel.stickers = new ArrayList();
                        }
                        for (StickerItemModel stickerItemModel : this.LIZ) {
                            if (stickerItemModel.endTime > i) {
                                stickerItemModel.endTime = i;
                            }
                        }
                        InfoStickerModel infoStickerModel3 = videoPublishEditModel.getInfoStickerModel();
                        if (infoStickerModel3 != null && (list = infoStickerModel3.stickers) != null) {
                            list.addAll(this.LIZ);
                        }
                    }
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIL(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                    if (Intrinsics.LJFF(nLETrack.getExtra("StickerTrackType"), "INFO") || Intrinsics.LJFF(nLETrack.getExtra("StickerTrackType"), "IMAGE")) {
                        this.LIZIZ.add(NLETrack.dynamicCast(nLETrack.deepClone()));
                    }
                }

                @Override // X.InterfaceC349110DmP
                public final void LJI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i) {
                    List<StickerItemModel> list2;
                    this.LIZJ = ((long) i) * 1000;
                    InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
                    if (infoStickerModel != null && (list2 = infoStickerModel.stickers) != null) {
                        ArrayList<StickerItemModel> arrayList4 = this.LIZ;
                        ArrayList arrayList5 = new ArrayList();
                        for (StickerItemModel stickerItemModel : list2) {
                            int i2 = stickerItemModel.type;
                            if (i2 == 0 || i2 == 11 || i2 == 10) {
                                arrayList5.add(stickerItemModel);
                            }
                        }
                        arrayList4.addAll(arrayList5);
                    }
                }
            });
            arrayList3.add(new InterfaceC349110DmP() { // from class: X.0DmO
                public final List<NLETrack> LIZ = new ArrayList();

                @Override // X.InterfaceC349110DmP
                public final void LIZJ(VideoPublishEditModel videoPublishEditModel, int i) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJ() {
                    return false;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i) {
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIIZ(Function1<? super StickerItemModel, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJ(Function1<? super List<? extends EffectPointModel>, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJJI(Function1<? super TextStickerData, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final List<TextStickerData> LLLLLLZZ() {
                    return null;
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZ() {
                    ((ArrayList) this.LIZ).clear();
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJFF() {
                    return !this.LIZ.isEmpty();
                }

                @Override // X.InterfaceC349110DmP
                public final NLETrackType LIZIZ() {
                    return NLETrackType.AUDIO;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJII(NLEEditor nLEEditor) {
                    String uuid;
                    NLENode nLENode;
                    for (NLETrack nLETrack : (ArrayList) this.LIZ) {
                        VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                        if (slots == null || (nLENode = (NLENode) C13LP.LJJJLL(slots)) == null || (uuid = nLENode.getUUID()) == null) {
                            uuid = "";
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (InterfaceC349110DmP interfaceC349110DmP : (ArrayList) C1452150ntN.LIZJ) {
                            if (interfaceC349110DmP.LLLLLLZZ() != null) {
                                List<TextStickerData> listLLLLLLZZ = interfaceC349110DmP.LLLLLLZZ();
                                if (listLLLLLLZZ == null) {
                                    listLLLLLLZZ = C13BV.INSTANCE;
                                }
                                arrayList4.addAll(listLLLLLLZZ);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj : arrayList4) {
                            if (Intrinsics.LJFF(((TextStickerData) obj).getNleUuid(), uuid)) {
                                arrayList5.add(obj);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            nLEEditor.getModel().addTrack(nLETrack);
                        }
                    }
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIL(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                    NLEModel nleModel;
                    NLETrack mainTrack;
                    long endTime;
                    long timeClipEnd;
                    if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "TEXT_SPEAK") && (nleModel = videoPublishEditModel.getNleModel()) != null && (mainTrack = nleModel.getMainTrack()) != null) {
                        List<NLETrack> list = this.LIZ;
                        NLETrack nLETrackDynamicCast = NLETrack.dynamicCast(nLETrack.deepClone());
                        if (nLETrackDynamicCast.getTrackType() == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrackDynamicCast.getExtra("AudioTrackType"), "TEXT_SPEAK")) {
                            VecNLETrackSlotSPtr slots = mainTrack.getSlots();
                            if (slots != null) {
                                endTime = -2;
                                for (NLETrackSlot nLETrackSlot : slots) {
                                    endTime += nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime();
                                }
                            } else {
                                endTime = -2;
                            }
                            for (NLETrackSlot nLETrackSlot2 : nLETrackDynamicCast.getSlots()) {
                                if (nLETrackSlot2.getEndTime() == -2) {
                                    NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
                                    if (nLESegmentAudioDynamicCast != null) {
                                        timeClipEnd = nLESegmentAudioDynamicCast.getTimeClipEnd();
                                    } else {
                                        timeClipEnd = -2;
                                    }
                                    if (endTime < timeClipEnd) {
                                        timeClipEnd = endTime;
                                    }
                                    nLETrackSlot2.setEndTime(timeClipEnd);
                                }
                            }
                        }
                        ((ArrayList) list).add(nLETrackDynamicCast);
                    }
                }
            });
            arrayList3.add(new InterfaceC349110DmP() { // from class: X.0F9N
                public final ArrayList<TextStickerData> LIZ = new ArrayList<>();
                public final List<AVChallenge> LIZIZ = new LinkedList();

                @Override // X.InterfaceC349110DmP
                public final NLETrackType LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJ() {
                    return false;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJII(NLEEditor nLEEditor) {
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIIZ(Function1<? super StickerItemModel, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJ(Function1<? super List<? extends EffectPointModel>, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIL(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZ() {
                    this.LIZ.clear();
                    ((LinkedList) this.LIZIZ).clear();
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJFF() {
                    return !this.LIZ.isEmpty();
                }

                @Override // X.InterfaceC349110DmP
                public final List<TextStickerData> LLLLLLZZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJJI(Function1<? super TextStickerData, Unit> function1) {
                    Iterator<TextStickerData> it3 = this.LIZ.iterator();
                    while (it3.hasNext()) {
                        function1.invoke(it3.next());
                    }
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZJ(VideoPublishEditModel videoPublishEditModel, int i) {
                    Iterator<TextStickerData> it3 = this.LIZ.iterator();
                    String effectId = null;
                    if (!this.LIZ.isEmpty()) {
                        TTSVoiceModel ttsVoiceModel = videoPublishEditModel.getTtsVoiceModel();
                        if (ttsVoiceModel != null) {
                            effectId = ttsVoiceModel.getEffectId();
                        }
                        if (C123100dR.LIZ(effectId)) {
                            videoPublishEditModel.setAutoAddTTSStickerOnce(true);
                        }
                    }
                    while (it3.hasNext()) {
                        TextStickerData next = it3.next();
                        long j = i;
                        if (((long) next.getStartTime()) * 1000 >= j) {
                            it3.remove();
                            for (String str : next.getTtsHashTagIds()) {
                                Iterator<AVChallenge> it4 = this.LIZIZ.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        AVChallenge next2 = it4.next();
                                        if (Intrinsics.LJFF(next2.cid, str)) {
                                            if (next2 != null) {
                                                ((LinkedList) this.LIZIZ).remove(next2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (((long) next.getEndTime()) * 1000 > j || (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel) && next.getEndTime() == 0)) {
                            next.setEndTime(i / LSPassThroughRecordSizeConfig.DEFAULT);
                        }
                    }
                    for (AVChallenge aVChallenge : this.LIZIZ) {
                        TextStickerChallenges textStickerChallenges = videoPublishEditModel.getTextStickerChallenges();
                        if (textStickerChallenges != null) {
                            textStickerChallenges.addReadTextChallenge(aVChallenge);
                        }
                    }
                }

                @Override // X.InterfaceC349110DmP
                public final void LJI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i) {
                    if (list != null) {
                        for (TextStickerData textStickerData : (ArrayList) list) {
                            if (Intrinsics.LJFF(textStickerData.getType(), "type_text_sticker") && !textStickerData.isAICaption()) {
                                if (textStickerData.getEndTime() == i && textStickerData.getStartTime() == 0) {
                                    textStickerData.setEndTime(0);
                                }
                                this.LIZ.add(textStickerData.m187clone());
                            }
                        }
                    }
                    TextStickerChallenges textStickerChallenges = videoPublishEditModel.getTextStickerChallenges();
                    if (textStickerChallenges != null) {
                        Iterator<AVChallenge> it3 = textStickerChallenges.getReadTextChallenges().iterator();
                        while (it3.hasNext()) {
                            ((LinkedList) this.LIZIZ).add(it3.next());
                        }
                    }
                }
            });
            if (C295830Bif.LIZ()) {
                arrayList3.add(new C565910MHl());
            } else {
                arrayList3.add(new InterfaceC349110DmP() { // from class: X.0Dmt
                    public final List<NLETrack> LIZ = new ArrayList();
                    public MusicBuzModel LIZIZ;
                    public Float LIZJ;
                    public boolean LIZLLL;
                    public long LJ;

                    @Override // X.InterfaceC349110DmP
                    public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
                    }

                    @Override // X.InterfaceC349110DmP
                    public final boolean LJIIIIZZ() {
                        return false;
                    }

                    @Override // X.InterfaceC349110DmP
                    public final void LJIIIZ(Function1<? super StickerItemModel, Unit> function1) {
                    }

                    @Override // X.InterfaceC349110DmP
                    public final void LJIIJ(Function1<? super List<? extends EffectPointModel>, Unit> function1) {
                    }

                    @Override // X.InterfaceC349110DmP
                    public final void LJIIJJI(Function1<? super TextStickerData, Unit> function1) {
                    }

                    @Override // X.InterfaceC349110DmP
                    public final List<TextStickerData> LLLLLLZZ() {
                        return null;
                    }

                    @Override // X.InterfaceC349110DmP
                    public final void LIZ() {
                        ((ArrayList) this.LIZ).clear();
                        this.LIZIZ = null;
                        this.LIZLLL = false;
                        this.LJ = 0L;
                    }

                    @Override // X.InterfaceC349110DmP
                    public final boolean LJ() {
                        return this.LIZIZ != null;
                    }

                    @Override // X.InterfaceC349110DmP
                    public final boolean LJFF() {
                        return this.LIZIZ != null;
                    }

                    @Override // X.InterfaceC349110DmP
                    public final NLETrackType LIZIZ() {
                        return NLETrackType.AUDIO;
                    }

                    @Override // X.InterfaceC349110DmP
                    public final void LJII(NLEEditor nLEEditor) {
                        Iterator it3 = ((ArrayList) this.LIZ).iterator();
                        while (it3.hasNext()) {
                            nLEEditor.getModel().addTrack((NLETrack) it3.next());
                        }
                    }

                    @Override // X.InterfaceC349110DmP
                    public final void LIZJ(VideoPublishEditModel videoPublishEditModel, int i) {
                        VecNLETrackSlotSPtr slots;
                        NLETrackSlot nLETrackSlot;
                        long duration2;
                        if (videoPublishEditModel.creativeModel.musicBuzModel.isUseMusicBeforeEdit) {
                            LIZ();
                            return;
                        }
                        MusicBuzModel musicBuzModel = this.LIZIZ;
                        if (musicBuzModel != null) {
                            NLETrack nLETrack = (NLETrack) C13LP.LJJJLL(this.LIZ);
                            if (nLETrack != null && (slots = nLETrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null) {
                                if (this.LIZLLL) {
                                    nLETrackSlot.setEndTime(-2L);
                                    NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                                    if (nLESegmentAudioDynamicCast != null) {
                                        nLESegmentAudioDynamicCast.setTimeClipEnd(nLESegmentAudioDynamicCast.getTimeClipStart() + ((long) i));
                                        long timeClipEnd = nLESegmentAudioDynamicCast.getTimeClipEnd();
                                        NLEResourceAV aVFile = nLESegmentAudioDynamicCast.getAVFile();
                                        long duration3 = 0;
                                        if (aVFile != null) {
                                            duration2 = aVFile.getDuration();
                                        } else {
                                            duration2 = 0;
                                        }
                                        if (timeClipEnd > duration2) {
                                            NLEResourceAV aVFile2 = nLESegmentAudioDynamicCast.getAVFile();
                                            if (aVFile2 != null) {
                                                duration3 = aVFile2.getDuration();
                                            }
                                            nLESegmentAudioDynamicCast.setTimeClipEnd(duration3);
                                            nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + (nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart()));
                                        }
                                        musicBuzModel.musicEnd = (int) (nLESegmentAudioDynamicCast.getTimeClipEnd() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                                    }
                                } else {
                                    long j = i;
                                    if (j < this.LJ) {
                                        nLETrackSlot.setEndTime(j);
                                    }
                                    if (nLETrackSlot.getStartTime() >= j) {
                                        LIZ();
                                        return;
                                    } else {
                                        videoPublishEditModel.creativeModel.musicBuzModel = musicBuzModel;
                                        videoPublishEditModel.refreshOldFieldIfNeeded();
                                    }
                                }
                            }
                            videoPublishEditModel.creativeModel.musicBuzModel = musicBuzModel;
                            videoPublishEditModel.refreshOldFieldIfNeeded();
                        }
                        Float f = this.LIZJ;
                        if (f != null) {
                            videoPublishEditModel.setMusicVolume(f.floatValue());
                        }
                    }

                    @Override // X.InterfaceC349110DmP
                    public final void LJIIL(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                        VecNLETrackSlotSPtr slots;
                        NLETrackSlot nLETrackSlot;
                        if (this.LIZIZ != null && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "BGM")) {
                            ((ArrayList) this.LIZ).add(NLETrack.dynamicCast(nLETrack.deepClone()));
                            NLETrack nLETrack2 = (NLETrack) C13LP.LJJJLL(this.LIZ);
                            if (nLETrack2 != null && (slots = nLETrack2.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && nLETrackSlot.getMainSegment() != null) {
                                NLEResourceAV aVFile = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment()).getAVFile();
                                if (aVFile != null) {
                                    aVFile.getDuration();
                                }
                                if (nLETrackSlot.getStartTime() == 0) {
                                    if (nLETrackSlot.getEndTime() == this.LJ || nLETrackSlot.getEndTime() == -2) {
                                        this.LIZLLL = true;
                                    }
                                }
                            }
                        }
                    }

                    @Override // X.InterfaceC349110DmP
                    public final void LJI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i) {
                        if (MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel) != null) {
                            MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
                            if (!musicBuzModel.isUseMusicBeforeEdit) {
                                this.LIZIZ = (MusicBuzModel) C571330Max.LIZ(musicBuzModel);
                                this.LIZJ = Float.valueOf(videoPublishEditModel.getMusicVolume());
                                this.LJ = ((long) i) * 1000;
                            }
                        }
                    }
                });
            }
            arrayList3.add(new InterfaceC349110DmP() { // from class: X.0DyW
                public final List<NLETrack> LIZ = new ArrayList();
                public final List<EffectPointModel> LIZIZ = new ArrayList();
                public long LIZJ;

                @Override // X.InterfaceC349110DmP
                public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJ() {
                    return false;
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIIZ(Function1<? super StickerItemModel, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJJI(Function1<? super TextStickerData, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final List<TextStickerData> LLLLLLZZ() {
                    return null;
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZ() {
                    ((ArrayList) this.LIZ).clear();
                    ((ArrayList) this.LIZIZ).clear();
                    this.LIZJ = 0L;
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJFF() {
                    return !this.LIZIZ.isEmpty();
                }

                @Override // X.InterfaceC349110DmP
                public final NLETrackType LIZIZ() {
                    return NLETrackType.EFFECT;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJII(NLEEditor nLEEditor) {
                    Iterator it3 = ((ArrayList) this.LIZ).iterator();
                    while (it3.hasNext()) {
                        nLEEditor.getModel().addTrack((NLETrack) it3.next());
                    }
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJ(Function1<? super List<? extends EffectPointModel>, Unit> function1) {
                    if (!((ArrayList) this.LIZIZ).isEmpty()) {
                        function1.invoke(this.LIZIZ);
                    }
                    LIZ();
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZJ(VideoPublishEditModel videoPublishEditModel, int i) {
                    List<NLETrack> list;
                    Iterator it3 = ((ArrayList) this.LIZIZ).iterator();
                    while (it3.hasNext()) {
                        EffectPointModel effectPointModel = (EffectPointModel) it3.next();
                        long j = i;
                        if (((long) effectPointModel.getStartPoint()) * 1000 >= j) {
                            it3.remove();
                            String uuid = effectPointModel.getUuid();
                            if (uuid != null) {
                                Iterator it4 = ((ArrayList) this.LIZ).iterator();
                                while (it4.hasNext()) {
                                    NLETrack nLETrack = (NLETrack) it4.next();
                                    VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                                    if (slots != null) {
                                        for (NLETrackSlot nLETrackSlot : slots) {
                                            if (Intrinsics.LJFF(nLETrackSlot.getUUID(), uuid)) {
                                                nLETrack.removeSlot(nLETrackSlot);
                                            }
                                        }
                                    }
                                    VecNLETrackSlotSPtr slots2 = nLETrack.getSlots();
                                    if (slots2 == null || slots2.isEmpty()) {
                                        it4.remove();
                                    }
                                }
                            }
                        } else if (((long) effectPointModel.getEndPoint()) * 1000 > j || (Math.abs((((long) effectPointModel.getEndPoint()) * 1000) - this.LIZJ) < 1000000 && effectPointModel.getStartPoint() == 0)) {
                            int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
                            effectPointModel.setEndPoint(i2);
                            effectPointModel.setUiEndPoint(i2);
                            String uuid2 = effectPointModel.getUuid();
                            if (uuid2 != null && (list = this.LIZ) != null) {
                                Iterator it5 = ((ArrayList) list).iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    VecNLETrackSlotSPtr slots3 = ((NLETrack) it5.next()).getSlots();
                                    if (slots3 != null) {
                                        for (NLETrackSlot nLETrackSlot2 : slots3) {
                                            if (Intrinsics.LJFF(nLETrackSlot2.getUUID(), uuid2)) {
                                                nLETrackSlot2.setEndTime(j);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    videoPublishEditModel.getEffectList().addAll(this.LIZIZ);
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIL(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                    ((ArrayList) this.LIZ).add(NLETrack.dynamicCast(nLETrack.deepClone()));
                }

                @Override // X.InterfaceC349110DmP
                public final void LJI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i) {
                    this.LIZJ = ((long) i) * 1000;
                    for (EffectPointModel effectPointModel : videoPublishEditModel.getEffectList()) {
                        ((ArrayList) this.LIZIZ).add(effectPointModel.m190clone());
                    }
                }
            });
            arrayList3.add(new InterfaceC349110DmP() { // from class: X.0nMX
                public String LIZIZ;
                public String LIZJ;
                public String LIZLLL;
                public String LJFF;
                public final List<NLETrack> LIZ = new ArrayList();
                public float LJ = -1.0f;

                @Override // X.InterfaceC349110DmP
                public final NLETrackType LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJ() {
                    return false;
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIIZ(Function1<? super StickerItemModel, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJ(Function1<? super List<? extends EffectPointModel>, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJJI(Function1<? super TextStickerData, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIL(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                }

                @Override // X.InterfaceC349110DmP
                public final List<TextStickerData> LLLLLLZZ() {
                    return null;
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZ() {
                    ((ArrayList) this.LIZ).clear();
                    this.LIZIZ = null;
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJFF() {
                    return !this.LIZ.isEmpty();
                }

                @Override // X.InterfaceC349110DmP
                public final void LJII(NLEEditor nLEEditor) {
                    Iterator it3 = ((ArrayList) this.LIZ).iterator();
                    while (it3.hasNext()) {
                        nLEEditor.getModel().addTrack((NLETrack) it3.next());
                    }
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZJ(VideoPublishEditModel videoPublishEditModel, int i) {
                    String str = this.LIZIZ;
                    if (str != null) {
                        videoPublishEditModel.setSelectedFilterId(str);
                        videoPublishEditModel.setSelectedFilterLabel(this.LIZJ);
                        videoPublishEditModel.setSelectedFilterResId(this.LIZLLL);
                        videoPublishEditModel.setSelectedFilterIntensity(this.LJ);
                        videoPublishEditModel.setSelectedFilterCategoryKey(this.LJFF);
                    }
                }

                @Override // X.InterfaceC349110DmP
                public final void LJI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i) {
                    String selectedFilterId = videoPublishEditModel.getSelectedFilterId();
                    if (selectedFilterId != null) {
                        this.LIZIZ = selectedFilterId;
                        this.LIZJ = videoPublishEditModel.getSelectedFilterLabel();
                        this.LIZLLL = videoPublishEditModel.getSelectedFilterResId();
                        this.LJ = videoPublishEditModel.getSelectedFilterIntensity();
                        this.LJFF = videoPublishEditModel.getSelectedFilterCategoryKey();
                    }
                    VecNLETrackSPtr tracks = nLEModel.getTracks();
                    ArrayList<NLENode> arrayList4 = new ArrayList();
                    for (NLETrack nLETrack : tracks) {
                        NLETrack nLETrack2 = nLETrack;
                        if (Intrinsics.LJFF(C348350DlB.LJII(nLETrack2), "COLOR_NO_COMPOSER") || Intrinsics.LJFF(C348350DlB.LJII(nLETrack2), "COLOR")) {
                            arrayList4.add(nLETrack);
                        }
                    }
                    for (NLENode nLENode : arrayList4) {
                        ((ArrayList) this.LIZ).add(NLETrack.dynamicCast(nLENode.deepClone()));
                    }
                }
            });
            MultiEditVideoStatusRecordData multiEditVideoRecordData = editModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData != null && (arrayList = multiEditVideoRecordData.originalSegments) != null) {
                Iterator<TimeSpeedModelExtension> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String createId = it3.next().getCreateId();
                    if (createId != null) {
                        C1452150ntN.LIZLLL.add(createId);
                    }
                }
            }
            Iterator it4 = ((ArrayList) C1452150ntN.LIZJ).iterator();
            while (it4.hasNext()) {
                ((InterfaceC349110DmP) it4.next()).LJI(editModel, nLEModelLLZ, arrayList2, duration);
            }
            for (NLETrack nLETrack : nLEModelLLZ.getTracks()) {
                List<InterfaceC349110DmP> list = C1452150ntN.LIZJ;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : (ArrayList) list) {
                    if (C347830DkL.LIZ(nLETrack) == ((InterfaceC349110DmP) obj).LIZIZ()) {
                        arrayList4.add(obj);
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    ((InterfaceC349110DmP) it5.next()).LJIIL(nLETrack, editModel);
                }
            }
            AbstractC214814194y abstractC214814194yB3 = B3();
            if ((abstractC214814194yB3 instanceof VideoEditContainerScene) && (videoEditContainerScene = (VideoEditContainerScene) abstractC214814194yB3) != null && (abstractC1453750nvx = videoEditContainerScene.LLLILZLLLI) != null && (interfaceC1444170ngVLLLLLJIL = abstractC1453750nvx.LLLLLJIL()) != null) {
                interfaceC1444170ngVLLLLLJIL.LJLI();
            }
        }
        this.LLJLIL.LJIIJ(Unit.LIZ);
    }

    public final void X1() {
        InterfaceC1455010nxz interfaceC1455010nxzM3 = m3();
        if (interfaceC1455010nxzM3 != null) {
            interfaceC1455010nxzM3.hide();
        }
        MO0();
    }

    @Override // X.InterfaceC1453420nvQ
    public void cG0() {
        C570010MXf c570010MXf = W2().LJIILL;
        if (c570010MXf != null) {
            c570010MXf.LIZIZ();
        }
    }

    @Override // X.InterfaceC1453420nvQ
    public void dC1() {
        InterfaceC559500Lwy interfaceC559500LwyT2 = T2();
        if (interfaceC559500LwyT2 != null) {
            interfaceC559500LwyT2.Bw0();
        }
        if (C289390BVx.LIZ()) {
            InterfaceC1604540rrA cleanUselessDraftsProvider = C0CHQ.LIZ().LJJIIJZLJL().getCleanUselessDraftsProvider();
            CreativeInfo creativeInfo = getEditModel().getCreativeInfo();
            cleanUselessDraftsProvider.LIZ(creativeInfo.copy(creativeInfo.creationId, creativeInfo.version, creativeInfo.sessionId));
        }
        W2().LIZIZ(false);
    }

    @Override // X.InterfaceC1453420nvQ
    public void iZ0() {
        C0M7N c0m7nW2 = W2();
        boolean zQ2 = Q2();
        if (c0m7nW2.LIZJ.getFromPublishPageEditBtn() || c0m7nW2.LIZJ.creativeModel.imageEditModel.enterFromImagePublishPreview) {
            c0m7nW2.LJI();
            return;
        }
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        C19GS c19gs = c0m7nW2.LJIIL;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.loadingMessage(c0m7nW2.LJIIL.getString(2131846827));
        CreativeDialogWrapper creativeDialogWrapper = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(c19gs, 1121, creativeLoadingDialogBuilder);
        c0m7nW2.LJIIIIZZ("click_exit_edit_page_auto_save", 26, new AwS566S0100000_22(creativeDialogWrapper, 535), new AwS91S0210000_8(creativeDialogWrapper, zQ2, c0m7nW2, 5), new AwS91S0210000_8(creativeDialogWrapper, zQ2, c0m7nW2, 6));
    }

    @Override // X.InterfaceC1453420nvQ
    public void nU1() {
        C0M81 c0m81H3 = H3();
        c0m81H3.getClass();
        c0m81H3.LJI(false, true, false, "editor_pro_add_more", new AwS566S0100000_22(c0m81H3, 523), new AwS566S0100000_22(c0m81H3, 524));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o2() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.getEditModel()
            boolean r0 = X.C1428470nHB.LJLZ(r0)
            if (r0 != 0) goto L14
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.getEditModel()
            boolean r0 = X.C1428470nHB.LLFFF(r0)
            if (r0 == 0) goto L1d
        L14:
            X.0nxz r0 = r5.m3()
            if (r0 == 0) goto L1d
            r0.hide()
        L1d:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.getEditModel()
            boolean r0 = r0.isFromCrash()
            r4 = 0
            r3 = 1
            if (r0 != 0) goto Lc2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.getEditModel()
            boolean r0 = r0.isPostDraftPrompt()
            if (r0 != 0) goto L62
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.getEditModel()
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel r0 = r0.getAILivePhotoModel()
            boolean r0 = r0.LJIIJJI()
            if (r0 != 0) goto L62
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.getEditModel()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel r0 = r0.aigcOfflineModel
            boolean r0 = r0.isOfflineAIGCEffectGenerated
            if (r0 != 0) goto L62
            X.0LfN r0 = X.C548590LfN.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService r1 = X.C548590LfN.LIZ()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.getEditModel()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            boolean r0 = r1.LJIIJ(r0)
            if (r0 != r3) goto Lc2
        L62:
            r1 = 1
        L63:
            boolean r0 = X.C301590Brx.LIZ()
            if (r0 == 0) goto Lbc
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.getEditModel()
            boolean r0 = r0.isFromCrash()
            if (r0 == 0) goto Lbc
        L73:
            X.0Lwy r0 = r5.T2()
            if (r0 == 0) goto L7c
            r0.Bw0()
        L7c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.getEditModel()
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel r2 = r0.getAILivePhotoModel()
            r2.getClass()
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay[] r1 = new com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay[r3]
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay r0 = com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay.OUT_APP_PUSH
            r1[r4] = r0
            com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam r0 = r2.mobParam
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay r0 = r0.recallWay
            int r0 = X.C13LQ.LJJIJIIJI(r0, r1)
            if (r0 >= 0) goto La9
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.getEditModel()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel r0 = r0.aigcOfflineModel
            boolean r0 = r0.isOfflineAIGCEffectGenerated
            if (r0 == 0) goto Lc4
            boolean r0 = X.C0LZR.LIZ()
            if (r0 != 0) goto Lc4
        La9:
            X.194y r0 = r5.B3()
            android.content.Context r2 = r0.requireSceneContext()
            kotlin.jvm.internal.AwS566S0100000_22 r1 = new kotlin.jvm.internal.AwS566S0100000_22
            r0 = 477(0x1dd, float:6.68E-43)
            r1.<init>(r5, r0)
            X.C560480LyY.LIZ(r2, r1)
            return
        Lbc:
            if (r1 != 0) goto L73
            r5.dC1()
            return
        Lc2:
            r1 = 0
            goto L63
        Lc4:
            r5.O4()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465520oEw.o2():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (X.C548590LfN.LIZ().LJIIJ(getEditModel().creativeModel) == true) goto L34;
     */
    @Override // X.InterfaceC1453420nvQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void oE() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465520oEw.oE():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        G2().SP1(this);
        Of1();
        Si1();
        Q3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        G2().SP1(null);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        IDMSendToFriendMenuActionHelper.LIZ.getClass();
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
        if (iDMSendToFriendMenuActionHelperLIZ != null) {
            iDMSendToFriendMenuActionHelperLIZ.LIZJ(false);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        IDMSendToFriendMenuActionHelper.LIZ.getClass();
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
        if (iDMSendToFriendMenuActionHelperLIZ != null) {
            iDMSendToFriendMenuActionHelperLIZ.LIZJ(true);
            iDMSendToFriendMenuActionHelperLIZ.LIZLLL();
        }
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> J30() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> LLLLIILLL() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> TK2() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> Yl2() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> lv2() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> qc0() {
        return this.LLJJJJLIIL;
    }

    public C1465520oEw w2() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1453420nvQ
    public void yO0() {
        MO0();
    }

    public C1465520oEw(C1DRG c1drg) {
        this.LL = c1drg;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLJJJ = c560530Lyd;
        this.LLJJJIL = c560530Lyd;
        C560530Lyd<Unit> c560530Lyd2 = new C560530Lyd<>();
        this.LLJJJJ = c560530Lyd2;
        this.LLJJJJJIL = c560530Lyd2;
        this.LLJJJJLIIL = new C560530Lyd();
        this.LLJJL = new C560530Lyd();
        C560530Lyd<Unit> c560530Lyd3 = new C560530Lyd<>();
        this.LLJJLIIIJLLLLLLLZ = c560530Lyd3;
        this.LLJL = c560530Lyd3;
        C560530Lyd<Unit> c560530Lyd4 = new C560530Lyd<>();
        this.LLJLIL = c560530Lyd4;
        this.LLJLILLLLZIIL = c560530Lyd4;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 510));
    }

    private final boolean o4(boolean z) {
        NLEModel nLEModelD5;
        NLENode nLENode = null;
        if (!z) {
            NLEModel nLEModelLLZ = JY0().LLZ();
            if (nLEModelLLZ == null) {
                return false;
            }
            NLEModel nLEModelD52 = d5(nLEModelLLZ, false);
            NLENode nLENode2 = this.LLJILJIL;
            if (nLENode2 != null) {
                nLENode = nLENode2;
            }
            return !nLENode.unorderEquals(nLEModelD52);
        }
        NLEModel nLEModelLLZ2 = JY0().LLZ();
        if (nLEModelLLZ2 == null || (nLEModelD5 = d5(nLEModelLLZ2, true)) == null) {
            return false;
        }
        NLENode nLENode3 = this.LLJILJIL;
        if (nLENode3 != null) {
            nLENode = nLENode3;
        }
        if (d5(nLENode, true) == null) {
            return false;
        }
        return !r0.unorderEquals(nLEModelD5);
    }

    @Override // X.InterfaceC1453420nvQ
    public boolean g72(View view) {
        InterfaceC1451520nsM interfaceC1451520nsMI3 = i3();
        if (interfaceC1451520nsMI3 != null) {
            interfaceC1451520nsMI3.m7("quit edit page!");
        }
        if (getEditModel().creativeModel.imageEditModel.enterFromImagePublishPreview) {
            W2().LJI();
            return true;
        }
        if (TextUtils.equals(getEditModel().getEnterFrom(), "effect_qr_scan")) {
            O4();
            return true;
        }
        InterfaceC578380MmK interfaceC578380MmKC3 = c3();
        if (interfaceC578380MmKC3 != null && interfaceC578380MmKC3.nu()) {
            interfaceC578380MmKC3.pu();
            return false;
        }
        if (getEditModel().getOriginal() == 1 && getEditModel().getRecordMode() == 1) {
            return false;
        }
        W2().LIZIZ = view;
        if (C301590Brx.LIZ()) {
            H3().LIZIZ = view;
        }
        if (C1444940nhk.LJIIIIZZ(getEditModel().getCanvasVideoData())) {
            P4();
            return true;
        }
        C548590LfN.LIZ.getClass();
        if (C548590LfN.LIZIZ().LJII(getEditModel().creativeModel)) {
            C0M81 c0m81H3 = H3();
            c0m81H3.getClass();
            c0m81H3.LJI(false, true, true, "clickPopupFromEdit", new AwS552S0100000_8(c0m81H3, 627), AFwS210S0000000_22.get$arr$(205));
            return true;
        }
        if (!C1428470nHB.LJJJZ(getEditModel()) || (C1428470nHB.LJJJZ(getEditModel()) && (getEditModel().getDraftFromShoot() || getEditModel().isFromCrash()))) {
            if (!C301590Brx.LIZ()) {
                boolean zLJFF = C351360Dq2.LJFF(JY0().LLZ());
                if (C1439180nYS.LIZ(getEditModel()) && !zLJFF) {
                    if (Q2()) {
                        C571460MbA c571460MbA = C571460MbA.LIZ;
                        VideoPublishEditModel editModel = getEditModel();
                        NLEModel nLEModelLLZ = JY0().LLZ();
                        C19EG c19eg = this.LLJIJIL;
                        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 480);
                        c571460MbA.getClass();
                        C571460MbA.LIZIZ(editModel, nLEModelLLZ, c19eg, awS566S0100000_22);
                        return true;
                    }
                    T4();
                    P4();
                    return true;
                }
                C1452150ntN.LIZLLL();
            }
            if (C301590Brx.LIZ()) {
                if (!C1428470nHB.LJJJZ(getEditModel()) && n5()) {
                    return true;
                }
            } else if (H4()) {
                return true;
            }
        }
        if (C301590Brx.LIZ()) {
            return k5();
        }
        return F4();
    }

    private final boolean Z1(boolean z, String str) {
        InterfaceC1444170ngV interfaceC1444170ngVLLLLLJIL;
        C1462070o9N c1462070o9N;
        Boolean boolValueOf;
        InterfaceC559500Lwy interfaceC559500LwyT2;
        C124T c124tLLLLLLLLLL;
        boolean z2;
        VideoEditContainerScene videoEditContainerScene;
        AbstractC1453750nvx abstractC1453750nvx;
        AbstractC214814194y abstractC214814194yB3 = B3();
        String json = null;
        if ((abstractC214814194yB3 instanceof VideoEditContainerScene) && (videoEditContainerScene = (VideoEditContainerScene) abstractC214814194yB3) != null && (abstractC1453750nvx = videoEditContainerScene.LLLILZLLLI) != null) {
            interfaceC1444170ngVLLLLLJIL = abstractC1453750nvx.LLLLLJIL();
        } else {
            interfaceC1444170ngVLLLLLJIL = null;
        }
        if (interfaceC1444170ngVLLLLLJIL instanceof C1460730o7D) {
            c1462070o9N = (C1462070o9N) interfaceC1444170ngVLLLLLJIL;
        } else {
            c1462070o9N = null;
        }
        if (c1462070o9N != null && (c124tLLLLLLLLLL = c1462070o9N.LLLLLLLLLL()) != null) {
            String str2 = c124tLLLLLLLLLL.LLJLLL;
            if (str2 != null && !str2.equals(c124tLLLLLLLLLL.getEditTextStr())) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolValueOf = Boolean.valueOf(z2);
        } else {
            boolValueOf = null;
        }
        if (o4(z) || Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || (((interfaceC559500LwyT2 = T2()) != null && interfaceC559500LwyT2.fz()) || z4())) {
            C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLE hasEditedOpt or dp edit: true");
            sbLIZ.append(str);
            C201955140j.LIZLLL(c1662160tM6, "EditExitComponent", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        List<StickerModel> listLJFF = C1466090oFr.LJFF(getEditModel().creativeModel.stickerModel);
        if (!((ArrayList) listLJFF).isEmpty()) {
            try {
                json = GsonProtectorUtils.toJson(C2337609Dy.LIZ(), listLJFF);
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!Intrinsics.LJFF(json, this.LLJILLL)) {
            C1662160tM6 c1662160tM62 = C1662160tM6.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sticker changed");
            sbLIZ2.append(str);
            C201955140j.LIZLLL(c1662160tM62, "EditExitComponent", C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        }
        C1662160tM6 c1662160tM63 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("hasEditedOpt: no edit");
        sbLIZ3.append(str);
        C201955140j.LIZLLL(c1662160tM63, "EditExitComponent", C2188811AlT.LIZIZ(sbLIZ3));
        return false;
    }

    private final NLEModel d5(NLENode nLENode, boolean z) {
        VecNLETrackSlotSPtr slots;
        boolean enableAudio;
        VecNLETrackSlotSPtr slots2;
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLENode.deepClone());
        if (nLEModelDynamicCast == null) {
            return null;
        }
        VecNLETrackSPtr tracks = nLEModelDynamicCast.getTracks();
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (C351220Dpo.LLLJL(nLETrack2) || !nLETrack2.getEnable() || (slots2 = nLETrack2.getSlots()) == null || slots2.isEmpty() || (z && (C351220Dpo.LLILLL(nLETrack2) || C351220Dpo.LLJILLL(nLETrack2)))) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                nLEModelDynamicCast.removeTrack((NLETrack) it2.next());
            }
        }
        NLETrack mainTrack = nLEModelDynamicCast.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                if (nLESegmentVideo != null) {
                    enableAudio = nLESegmentVideo.getEnableAudio();
                } else {
                    enableAudio = true;
                }
                NLESegmentVideo nLESegmentVideo2 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                if (nLESegmentVideo2 != null) {
                    nLESegmentVideo2.setEnableAudio(enableAudio);
                }
            }
        }
        return nLEModelDynamicCast;
    }

    @Override // X.InterfaceC1453420nvQ
    public void vR(boolean z, String str, String str2) {
        W2().LJIIIZ(z, str, str2);
    }

    @Override // X.InterfaceC1453420nvQ
    public void Ys0(String str, int i, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        W2().LJIIIIZZ(str, i, function0, function02, function03);
    }

    @Override // X.InterfaceC1453420nvQ
    public void Za0(String str, boolean z, String str2, Function0<Unit> function0, Function0<Unit> function02) {
        W2().LJIIJJI(str, z, str2, function0, function02);
    }

    @Override // X.InterfaceC1453420nvQ
    public void iz(String str, int i, Function1<? super String, Unit> function1, Function1<? super VideoPublishEditModel, Unit> function12, Function0<Unit> function0) {
        W2().LJIIJ(str, function1, function12, function0);
    }
}
