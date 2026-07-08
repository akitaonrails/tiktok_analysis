package X;

import Y.AObserverS212S0100000_8;
import Y.AfS177S0100000_8;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoSwitchFromImageModel;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.creative.model.ailive.RecommendMusicMobParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.RefreshQuotaScene;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ailive.newprompt.NewPromptPageModel;
import ge.i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0MDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564830MDh extends i<InterfaceC564900MDo, C0MDX, C0MDU, C564760MDa> implements InterfaceC564900MDo, InterfaceC379610EuV {
    public static final C0MEO LLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZ;
    public static final int LLLILZJ;
    public final C1DRG LLJILJILJ;
    public final C19A3 LLJILLL;
    public final Function0<C0MDX> LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public C09AE LLL;
    public final C11NJ LLLF;
    public final h0<C529150Kp7> LLLFF;
    public final C385670FAf<C529150Kp7> LLLFFI;
    public final C560530Lyd<Unit> LLLFZ;
    public final LiveEvent<Unit> LLLI;
    public AbstractC564980MDw LLLII;
    public C564960MDu LLLIIII;
    public final C01GW LLLIIIIL;
    public final Function0<C0MDU> LLLIIIL;
    public final Function0<C564760MDa> LLLIIL;
    public final C01GW LLLIILIL;

    /* JADX WARN: Type inference failed for: r0v36, types: [X.0MEO] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C564830MDh.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C564830MDh.class, "baseEditToolbarApi", "getBaseEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0), new C2217381BqS(C564830MDh.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C564830MDh.class, "privacySettingApi", "getPrivacySettingApi()Lcom/ss/android/ugc/aweme/shortvideo/privacy/PrivacySettingApi;", 0), new C2217381BqS(C564830MDh.class, "aiLiveEntranceApi", "getAiLiveEntranceApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveEntranceApi;", 0), new C2217381BqS(C564830MDh.class, "aiLivePromptApi", "getAiLivePromptApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePromptApi;", 0), new C2217381BqS(C564830MDh.class, "aiLiveSheetApi", "getAiLiveSheetApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveSheetApi;", 0), new C2217381BqS(C564830MDh.class, "taskHandler", "getTaskHandler()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveTaskApi;", 0), new C2217381BqS(C564830MDh.class, "aiLiveResultTipApi", "getAiLiveResultTipApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveResultTipApi;", 0), new C2217381BqS(C564830MDh.class, "livePhotoEditApi", "getLivePhotoEditApi()Lcom/ss/android/ugc/gamora/editor/livephoto/LivePhotoEditApi;", 0), new C2217381BqS(C564830MDh.class, "aiLiveQuotaApi", "getAiLiveQuotaApi()Lcom/ss/android/ugc/gamora/editor/ailive/quota/AILiveQuotaLogicApi;", 0), new C2217381BqS(C564830MDh.class, "mixEditingMaterialAiAliveApi", "getMixEditingMaterialAiAliveApi()Lcom/ss/android/ugc/gamora/editor/mixediting/ailive/MixEditingMaterialAiAliveApi;", 0), new C2217381BqS(C564830MDh.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0), new C2217381BqS(C564830MDh.class, "retouchApiComponent", "getRetouchApiComponent()Lcom/ss/android/ugc/gamora/editor/retouch/RetouchApiComponent;", 0), new C2217381BqS(C564830MDh.class, "editAiLiveToolbarApi", "getEditAiLiveToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditAIAliveToolbarApi;", 0), new C2217381BqS(C564830MDh.class, "handleResultApi", "getHandleResultApi()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/functions/AILiveHandleResultApi;", 0), new C2217381BqS(C564830MDh.class, "updatedModelApi", "getUpdatedModelApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveUpdatedModelApi;", 0), new C2217381BqS(C564830MDh.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0)};
        LLLIL = new Object() { // from class: X.0MEO
        };
        LLLILZJ = 8;
    }

    private final C0MEL K4() {
        return (C0MEL) this.LLJJJIL.getValue(this, LLLILZ[4]);
    }

    private final InterfaceC1444410ngt M5() {
        return (InterfaceC1444410ngt) this.LLJJJ.getValue(this, LLLILZ[3]);
    }

    private final InterfaceC564950MDt k5() {
        return (InterfaceC564950MDt) this.LLJLLIL.getValue(this, LLLILZ[14]);
    }

    private final C0MCN n5() {
        return (C0MCN) this.LLJLLL.getValue(this, LLLILZ[15]);
    }

    private final C564840MDi t5() {
        return (C564840MDi) this.LLLIILIL.getValue();
    }

    private final InterfaceC1413540mt6 v5() {
        return (InterfaceC1413540mt6) this.LLJLILLLLZIIL.getValue(this, LLLILZ[12]);
    }

    private final C0MFO x5() {
        return (C0MFO) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLILZ[9]);
    }

    public final InterfaceC564930MDr C5() {
        return (InterfaceC564930MDr) this.LLJLIL.getValue(this, LLLILZ[11]);
    }

    public final InterfaceC1454960nxu D5() {
        return (InterfaceC1454960nxu) this.LLJZIJLIL.getValue(this, LLLILZ[17]);
    }

    public final NLEEditor E5() {
        return (NLEEditor) this.LLJJIJI.getValue();
    }

    public final C348100Dkm H5() {
        return (C348100Dkm) this.LLJJIII.getValue();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIJIL.getValue(this, LLLILZ[2]);
    }

    public final C0MER N5() {
        return (C0MER) this.LLJLL.getValue(this, LLLILZ[13]);
    }

    public final InterfaceC564820MDg O4() {
        return (InterfaceC564820MDg) this.LLJJJJ.getValue(this, LLLILZ[5]);
    }

    public final C0MEH P4() {
        return (C0MEH) this.LLJL.getValue(this, LLLILZ[10]);
    }

    public final InterfaceC564940MDs S5() {
        return (InterfaceC564940MDs) this.LLJJJJLIIL.getValue(this, LLLILZ[7]);
    }

    public final C0MEG T4() {
        return (C0MEG) this.LLJJL.getValue(this, LLLILZ[8]);
    }

    public final InterfaceC23228098g U5() {
        return (InterfaceC23228098g) this.LLJZ.getValue(this, LLLILZ[16]);
    }

    public final C0ME6 Z4() {
        return (C0ME6) this.LLJJJJJIL.getValue(this, LLLILZ[6]);
    }

    public final InterfaceC1455610nyx d5() {
        return (InterfaceC1455610nyx) this.LLJJIJIIJIL.getValue(this, LLLILZ[1]);
    }

    public final int d6() {
        return ((Number) this.LLLIIIIL.getValue()).intValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJI.getValue(this, LLLILZ[0]);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        AILivePhotoSwitchFromImageModel aILivePhotoSwitchFromImageModel;
        AbstractC564980MDw abstractC564980MDw = this.LLLII;
        abstractC564980MDw.getClass();
        if (!(!(abstractC564980MDw instanceof C0MEJ))) {
            throw new IllegalStateException("if need show AIAlivePhoto, call show(AIAlivePhotoShowTransaction) instead if call show() directly");
        }
        InterfaceC564950MDt interfaceC564950MDtK5 = k5();
        if (interfaceC564950MDtK5 != null) {
            interfaceC564950MDtK5.TE1();
        }
        i3(new AwS587S0100000_8(this, 397));
        getEditModel().getAILivePhotoModel().LJIILL(AFwS239S0000000_8.get$arr$(193));
        K6();
        if (C0C06.LIZ()) {
            T6();
        } else {
            W6(abstractC564980MDw);
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            PromptModel promptModel = T2().LIZJ;
            c564410MBr.getClass();
            C0LAB c0labLJI = C564410MBr.LJI(editModel);
            c0labLJI.LJ("default_prompt_type", promptModel.promptTypeMob);
            C20684815ws.LJIILLIIL("ai_livephoto_generate_page_show", c0labLJI.LIZ);
        }
        if (!abstractC564980MDw.LIZ() || (aILivePhotoSwitchFromImageModel = getEditModel().getAILivePhotoModel().switchFromImageModel) == null) {
            return;
        }
        C554440Loo c554440Loo = C554440Loo.LIZ;
        Long l = aILivePhotoSwitchFromImageModel.switchStartTime;
        c554440Loo.getClass();
        if (l != null) {
            l.longValue();
            ICreativePerformanceMonitorService iCreativePerformanceMonitorServicePerformanceMonitorService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).performanceMonitorService();
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - l.longValue()));
            c543670LTx.LIZ.put("cpu_rate", iCreativePerformanceMonitorServicePerformanceMonitorService.getCpuUsedRate());
            c543670LTx.LIZ.put("memory_rate", iCreativePerformanceMonitorServicePerformanceMonitorService.getMemoryUsedRate());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ai_alive_image_to_video_show, ");
            sbLIZ.append(c543670LTx.LJ());
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZIZ("ai_alive_image_to_video_show", c543670LTx.LJ());
        }
        aILivePhotoSwitchFromImageModel.switchStartTime = null;
        aILivePhotoSwitchFromImageModel.hasProcessAutoShow = true;
    }

    private final void J6() {
        u7(C0MDL.LJII(getEditModel()));
    }

    private final boolean N6() {
        return MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel) == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if ((r1 != null ? r1.previewMode : null) == r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.bytedance.ies.nle.editor_jni.NLETrackSlot R5() {
        /*
            r5 = this;
            com.bytedance.ies.nle.editor_jni.NLEEditor r1 = r5.E5()
            r0 = 0
            if (r1 == 0) goto L50
            com.bytedance.ies.nle.editor_jni.NLEModel r1 = r1.getModel()
            if (r1 == 0) goto L50
            com.bytedance.ies.nle.editor_jni.NLETrack r1 = r1.getMainTrack()
            if (r1 == 0) goto L50
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r4 = r1.getSortedSlots()
        L17:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.getEditModel()
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel r1 = r1.getAILivePhotoModel()
            com.ss.android.ugc.aweme.creative.model.ailive.AIAliveRestoreData r1 = r1.restoreData
            com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel r1 = r1.livePhotoModel
            if (r1 == 0) goto L4e
            com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode r1 = r1.previewMode
        L27:
            com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode r2 = com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode.LOOP
            if (r1 == r2) goto L43
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.getEditModel()
            boolean r1 = r1.isLivePhotoEdit()
            if (r1 == 0) goto L52
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.getEditModel()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r1 = r1.creativeModel
            com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel r1 = r1.livePhotoModel
            if (r1 == 0) goto L4c
            com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode r1 = r1.previewMode
        L41:
            if (r1 != r2) goto L52
        L43:
            if (r4 == 0) goto L4b
            java.lang.Object r0 = X.C13LP.LJJJLL(r4)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
        L4b:
            return r0
        L4c:
            r1 = r0
            goto L41
        L4e:
            r1 = r0
            goto L27
        L50:
            r4 = r0
            goto L17
        L52:
            if (r4 == 0) goto L75
            java.util.Iterator r3 = r4.iterator()
        L58:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r1
            boolean r1 = X.C351220Dpo.LLJJIJIL(r1)
            if (r1 == 0) goto L58
        L6b:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r2 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r2
            if (r2 != 0) goto L78
            java.lang.Object r0 = X.C13LP.LJJJLL(r4)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
        L75:
            return r0
        L76:
            r2 = r0
            goto L6b
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C564830MDh.R5():com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }

    private final void T6() {
        AbstractC1452680nuE abstractC1452680nuEGc;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        Context sceneContext;
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 == null || (abstractC1452680nuEGc = interfaceC1446740nkeJY0.gc()) == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (sceneContext = this.LLJILLL.getSceneContext()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C0MCR c0mcr = C0MCR.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        NLEModel model = nLEEditor.getModel();
        c0mcr.getClass();
        C786410Ut5.LJJIJL(bundle, "ai_live_new_prompt_model", new NewPromptPageModel(C0MCR.LJFF(editModel, model), C0MDI.VIDEO_EDITOR));
        C1428470nHB.LLIL(bundle, getEditModel());
        C0MUK.LJIIJ(bundle, getEditModel().creativeModel);
        C0MWH.LIZ.getClass();
        C0MWH.LIZIZ(sceneContext, bundle);
    }

    public final void H4() {
        getEditModel().getAILivePhotoModel().LJIILL(AFwS239S0000000_8.get$arr$(191));
        Sc(false);
    }

    public final void K6() {
        if (T2().LIZJ.LIZLLL()) {
            u7(C0MD9.LIZ(C1383370m6R.LJIIJ(2131820733), PromptType.DEFAULT, true, 12));
        }
    }

    public final void P6() {
        InterfaceC564820MDg interfaceC564820MDgO4 = O4();
        if (interfaceC564820MDgO4 == null) {
            return;
        }
        boolean z = false;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_story_ai_live_default_prompt_strategy", true) > 0 && T2().LIZJ.LIZLLL()) {
            z = true;
        }
        interfaceC564820MDgO4.CQ(z);
        if (C564500MCa.LIZ()) {
            this.LLLF.LIZ(interfaceC564820MDgO4.Xn().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 40)));
            if (z) {
                interfaceC564820MDgO4.bw2().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 41));
            }
        }
        this.LLLF.LIZ(interfaceC564820MDgO4.q92().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 42)));
        interfaceC564820MDgO4.Xi();
    }

    @Override // X.InterfaceC564900MDo
    public void Re0() {
        InterfaceC1453430nvR interfaceC1453430nvR;
        C0MFO c0mfoX5;
        y7();
        this.LLLFF.LJII(new C529150Kp7());
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null && (c0mfoX5 = x5()) != null) {
            c0mfoX5.wl0(interfaceC1446740nkeJY0.xI(), false);
        }
        C0MER c0merN5 = N5();
        if (c0merN5 != null) {
            c0merN5.tM();
        }
        InterfaceC1446740nke interfaceC1446740nkeJY02 = JY0();
        if (interfaceC1446740nkeJY02 != null) {
            interfaceC1446740nkeJY02.Qb1(false);
        }
        this.LLLFZ.LJIIIZ(Unit.LIZ);
        InterfaceC1455610nyx interfaceC1455610nyxD5 = d5();
        if (interfaceC1455610nyxD5 != null) {
            interfaceC1455610nyxD5.ug2(C0ME4.AI_LIVE_PROGRESS_CHANGE);
        }
        InterfaceC564930MDr interfaceC564930MDrC5 = C5();
        if (interfaceC564930MDrC5 != null) {
            interfaceC564930MDrC5.aA0();
        }
        if (!C0C0E.LIZ() || (interfaceC1453430nvR = (InterfaceC1453430nvR) findReadyComponent(this, InterfaceC1453430nvR.class)) == null) {
            return;
        }
        interfaceC1453430nvR.Fv(true);
    }

    public final void S6() {
        InterfaceC564930MDr interfaceC564930MDrC5;
        InterfaceC564930MDr interfaceC564930MDrC52;
        if (C5() == null) {
            return;
        }
        if (getEditModel().getAILivePhotoModel().LJII() && (interfaceC564930MDrC52 = C5()) != null) {
            interfaceC564930MDrC52.kM();
        }
        if (!getEditModel().getAILivePhotoModel().LJI() || getEditModel().getAILivePhotoModel().LJIIIIZZ()) {
            return;
        }
        InterfaceC564930MDr interfaceC564930MDrC53 = C5();
        if ((interfaceC564930MDrC53 == null || !interfaceC564930MDrC53.Q02()) && (interfaceC564930MDrC5 = C5()) != null) {
            interfaceC564930MDrC5.Ti0(d6(), 1);
        }
    }

    public final void Xi() {
        LiveData<Unit> liveDataY;
        LiveData<Void> liveDataWw2;
        S5().wu2(t5());
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null && (liveDataWw2 = interfaceC1446740nkeJY0.ww2()) != null) {
            liveDataWw2.observe(this, new AObserverS212S0100000_8(this, 60));
        }
        C0MCN c0mcnN5 = n5();
        if (c0mcnN5 == null || (liveDataY = c0mcnN5.Y()) == null) {
            return;
        }
        liveDataY.observe(this, new AObserverS212S0100000_8(this, 61));
    }

    @Override // X.InterfaceC564900MDo
    public void Ym() {
        NLETrackSlot nLETrackSlotR5 = R5();
        if (nLETrackSlotR5 != null) {
            S5().xz1(new C558760Lvm(nLETrackSlotR5, false, 124));
        }
    }

    @Override // X.InterfaceC564900MDo
    public void bt() {
        PromptModel promptModelLIZJ = getEditModel().getAILivePhotoModel().LJIIIIZZ() ? getEditModel().getAILivePhotoModel().LIZJ() : T2().LIZJ;
        new AwS587S0100000_8(this, 395).invoke(getEditModel().getAILivePhotoModel().mobParam);
        NLETrackSlot nLETrackSlotR5 = R5();
        if (nLETrackSlotR5 != null) {
            AILivePhotoModel aILivePhotoModel = getEditModel().getAILivePhotoModel();
            if (aILivePhotoModel.LJFF()) {
                aILivePhotoModel.lastStatus = aILivePhotoModel.LIZIZ();
            }
            InterfaceC564940MDs interfaceC564940MDsS5 = S5();
            String str = T2().LIZLLL;
            ProgressModel progressModel = getEditModel().getAILivePhotoModel().lastFailProgressModel;
            String str2 = progressModel != null ? progressModel.taskId : null;
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            c564410MBr.getClass();
            interfaceC564940MDsS5.hu1(new C558760Lvm(nLETrackSlotR5, promptModelLIZJ, true, str2, C564410MBr.LJFF(editModel, promptModelLIZJ), str));
        }
        C564410MBr c564410MBr2 = C564410MBr.LIZ;
        VideoPublishEditModel editModel2 = getEditModel();
        c564410MBr2.getClass();
        C564410MBr.LJIIJJI(editModel2, promptModelLIZJ);
    }

    public final void d7() {
        VideoPublishEditModel editModel = getEditModel();
        int i = 0;
        if (!C0MDL.LJIIIIZZ(editModel)) {
            VideoPublishEditModel editModel2 = getEditModel();
            if (C0MDL.LJIIIZ(editModel2)) {
                editModel2.getAILivePhotoModel().hasAutoShow = true;
                K4().Os(new C565000MDy(i));
                return;
            }
            return;
        }
        editModel.getAILivePhotoModel().consumptionModel.setHasAutoApply(true);
        editModel.getAILivePhotoModel().hasAutoShow = true;
        if (getEditModel().getAILivePhotoModel().newPromptPageModel.getAutoApplyAiAlive()) {
            getEditModel().creativeModel.imageEditModel.isVideoChildPageFromImage = false;
            C0MEH c0mehP4 = P4();
            if (c0mehP4 != null && c0mehP4.Of0()) {
                return;
            } else {
                u7(getEditModel().getAILivePhotoModel().pageDataCache.curPrompt);
            }
        }
        Sc(false);
    }

    @Override // X.InterfaceC564900MDo
    public void f41() {
        PromptModel promptModel;
        ProgressModel progressModel = getEditModel().getAILivePhotoModel().lastFailProgressModel;
        if (progressModel != null && (promptModel = progressModel.prompt) != null) {
            u7(promptModel);
        }
        AX(new C565000MDy(EnumC564990MDx.CHANGE_MEDIA));
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        if (getEditModel().getAILivePhotoModel().mobParam.isPromptPageShowing) {
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            c564410MBr.getClass();
            C564410MBr.LJIJI(editModel, false, false);
            getEditModel().getAILivePhotoModel().LJIILL(AFwS239S0000000_8.get$arr$(192));
            if (!this.LLLIIII.LIZIZ.LIZ() || this.LLLIIII.LIZ != EnumC564890MDn.CANCEL) {
                InterfaceC564950MDt interfaceC564950MDtK5 = k5();
                if (interfaceC564950MDtK5 != null) {
                    interfaceC564950MDtK5.Uf0(new AwS622S0100000_8(this, 26));
                    return;
                }
                return;
            }
            InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
            if (interfaceC1446740nkeJY0 != null) {
                C1456140nzo.LIZIZ(interfaceC1446740nkeJY0, false, false, false, false, 12);
            }
            k7(new C565240MEw(1.0f, 0.0f, true, EnumC565210MEt.HIDE_IN_MEAN_WHILE, 32));
            super.hide();
            InterfaceC1446740nke interfaceC1446740nkeJY02 = JY0();
            if (interfaceC1446740nkeJY02 != null) {
                interfaceC1446740nkeJY02.pH0();
            }
        }
    }

    @Override // X.InterfaceC564900MDo
    public void ns0() {
        getEditModel().getAILivePhotoModel().LJIILL(AFwS239S0000000_8.get$arr$(194));
        u7(getEditModel().getAILivePhotoModel().LIZJ());
        AX(new C565010MDz(EnumC564910MDp.FINISH_GENERATE_SHEET));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        J6();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C11NJ c11nj = this.LLLF;
        if (!c11nj.LLILLJJLI) {
            c11nj.dispose();
        }
    }

    @Override // X.InterfaceC564900MDo
    public void rf1() {
        PromptModel promptModel;
        ProgressModel progressModel = getEditModel().getAILivePhotoModel().lastFailProgressModel;
        if (progressModel != null && (promptModel = progressModel.prompt) != null) {
            u7(promptModel);
        }
        AX(new C565010MDz(EnumC564910MDp.FAIL_TNS_PROMPT));
    }

    public final void u6() {
        Z4().Iw2();
        InterfaceC1444410ngt interfaceC1444410ngtM5 = M5();
        if (interfaceC1444410ngtM5 != null) {
            interfaceC1444410ngtM5.kM0();
        }
    }

    public final void y7() {
        C1464760oDi c1464760oDiLIZ = C0MCH.LIZ(getEditModel().getAILivePhotoModel().LIZIZ());
        InterfaceC564950MDt interfaceC564950MDtK5 = k5();
        if (interfaceC564950MDtK5 != null) {
            interfaceC564950MDtK5.Q81(c1464760oDiLIZ);
        }
        i3(new AwS587S0100000_8(c1464760oDiLIZ, 393));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTooBarState=");
        sbLIZ.append(c1464760oDiLIZ);
        C559010LwB.LIZIZ("AILivePhotoInnerRootComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // ge.i
    public Function0<C0MDX> E3() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC564900MDo
    public C385670FAf<C529150Kp7> Zn() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0MDU> o2() {
        return this.LLLIIIL;
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C564760MDa> w2() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC564900MDo
    public LiveEvent<Unit> xh() {
        return this.LLLI;
    }

    private final boolean L6(C564960MDu c564960MDu) {
        if (MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel) != null) {
            return false;
        }
        if ((c564960MDu.LIZIZ.LIZ() || C1428470nHB.LLILLIZIL(getEditModel())) && c564960MDu.LIZ == EnumC564890MDn.GENERATE) {
            return true;
        }
        if (C290620BaG.LIZ() && getEditModel().getAILivePhotoModel().mobParam.generateSidebarType == 2) {
            AbstractC564980MDw abstractC564980MDw = c564960MDu.LIZIZ;
            abstractC564980MDw.getClass();
            if (abstractC564980MDw instanceof C565000MDy) {
                return true;
            }
        }
        return false;
    }

    private final void W6(AbstractC564980MDw abstractC564980MDw) {
        boolean z;
        InterfaceC1446740nke interfaceC1446740nkeJY0;
        MutableLiveData<C1452730nuJ> mutableLiveDataVW1;
        InterfaceC564820MDg interfaceC564820MDgO4 = O4();
        if (interfaceC564820MDgO4 != null) {
            interfaceC564820MDgO4.Qr0();
        }
        k7(new C565240MEw(1.0f, C1415610mwR.LIZ(), false, null, 56));
        super.show();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_image_to_video_anim", true) <= 0 && this.LLLII.LIZ()) {
            z = false;
        } else {
            z = true;
        }
        k7(new C565240MEw(1.0f, 0.0f, 0.0f, z, EnumC565210MEt.SHOW_IN_MEAN_WHILE, new AwS409S0200000_8(abstractC564980MDw, this, 79)));
        InterfaceC1446740nke interfaceC1446740nkeJY02 = JY0();
        if (interfaceC1446740nkeJY02 != null && (mutableLiveDataVW1 = interfaceC1446740nkeJY02.vW1()) != null) {
            mutableLiveDataVW1.setValue(C1452730nuJ.LIZJ());
        }
        if (!abstractC564980MDw.LIZ() && (interfaceC1446740nkeJY0 = JY0()) != null) {
            C1456140nzo.LIZIZ(interfaceC1446740nkeJY0, false, false, false, false, 12);
        }
        InterfaceC1454960nxu interfaceC1454960nxuD5 = D5();
        if (interfaceC1454960nxuD5 != null) {
            interfaceC1454960nxuD5.Sq(false);
        }
    }

    private final void k7(C565240MEw c565240MEw) {
        i3(new AwS587S0100000_8(c565240MEw, 396));
    }

    @Override // X.InterfaceC564900MDo
    public void AX(AbstractC564980MDw abstractC564980MDw) {
        C0MEH c0mehP4;
        this.LLLII = abstractC564980MDw;
        abstractC564980MDw.getClass();
        if ((!(abstractC564980MDw instanceof C565000MDy) || abstractC564980MDw.LIZ()) && (c0mehP4 = P4()) != null) {
            c0mehP4.refreshQuotaCache(RefreshQuotaScene.CLICK_EDIT_ENTRY);
        }
        show();
        this.LLLIIII = new C564960MDu(abstractC564980MDw, 1);
        this.LLLII = C0MEJ.LIZ;
    }

    @Override // X.InterfaceC564900MDo
    public void Sc(boolean z) {
        getEditModel().getAILivePhotoModel().newPromptPageModel.setAutoApplyAiAlive(false);
        new AwS587S0100000_8(this, 394).invoke(getEditModel().getAILivePhotoModel().mobParam);
        InterfaceC564950MDt interfaceC564950MDtK5 = k5();
        if (interfaceC564950MDtK5 != null) {
            interfaceC564950MDtK5.TE1();
        }
        C09AE c09ae = this.LLL;
        if (c09ae != null && c09ae.isActive()) {
            return;
        }
        this.LLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0MDT(this, z, null), 3);
    }

    public final void m6(C564960MDu c564960MDu) {
        InterfaceC1413540mt6 interfaceC1413540mt6V5;
        if (N6()) {
            getEditModel().getAILivePhotoModel().musicMobParams = new RecommendMusicMobParams(System.currentTimeMillis());
        }
        if (L6(c564960MDu) && (interfaceC1413540mt6V5 = v5()) != null) {
            interfaceC1413540mt6V5.Ok2();
            interfaceC1413540mt6V5.QS1("video_capsule_recommend", false);
        }
        this.LLLIIII = c564960MDu;
        hide();
        this.LLLIIII = (C564960MDu) C564860MDk.LIZ.getValue();
    }

    @Override // X.InterfaceC564900MDo
    public void nh(boolean z) {
        NLETrackSlot nLETrackSlotR5 = R5();
        if (nLETrackSlotR5 != null) {
            S5().Lp2(new C558760Lvm(nLETrackSlotR5, z, 116));
        }
    }

    public final void o7(boolean z) {
        PromptModel promptModelLIZJ;
        String taskId;
        NLETrackSlot nLETrackSlotR5 = R5();
        if (nLETrackSlotR5 != null) {
            AILivePhotoModel aILivePhotoModel = getEditModel().getAILivePhotoModel();
            if (aILivePhotoModel.LJFF()) {
                aILivePhotoModel.lastStatus = aILivePhotoModel.LIZIZ();
            }
            if (z) {
                promptModelLIZJ = getEditModel().getAILivePhotoModel().LIZJ();
            } else {
                promptModelLIZJ = T2().LIZJ;
            }
            if (z) {
                taskId = getEditModel().getAILivePhotoModel().getTaskId();
            } else {
                taskId = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyAILive:prompt=");
            sbLIZ.append(promptModelLIZJ);
            sbLIZ.append("\n,file=");
            sbLIZ.append(T2().LIZLLL);
            C559010LwB.LIZIZ("AILivePhotoInnerRootComponent", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC564940MDs interfaceC564940MDsS5 = S5();
            String str = T2().LIZLLL;
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            c564410MBr.getClass();
            interfaceC564940MDsS5.hu1(new C558760Lvm(nLETrackSlotR5, promptModelLIZJ, z, taskId, C564410MBr.LJFF(editModel, promptModelLIZJ), str));
            if (!z) {
                C564410MBr.LJIIJJI(getEditModel(), promptModelLIZJ);
            }
        }
    }

    public final void s7(String str) {
        getEditModel().getAILivePhotoModel().LIZIZ().prompt = PromptModel.LIZIZ(getEditModel().getAILivePhotoModel().LIZJ(), str);
        u7(PromptModel.LIZIZ(T2().LIZJ, str));
    }

    public final void u7(PromptModel promptModel) {
        i3(new AwS587S0100000_8(promptModel, 398));
        new AwS587S0100000_8(promptModel, 399).invoke(getEditModel().getAILivePhotoModel().pageDataCache);
    }

    public C564830MDh(C1DRG c1drg, C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c19a3;
        this.LLJJ = AFwS194S0000000_8.get$arr$(275);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 595));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 594));
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444410ngt.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), C0MEL.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC564820MDg.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), C0ME6.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC564940MDs.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), C0MEG.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), C0MFO.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), C0MEH.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC564930MDr.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
        this.LLJLL = C1664770tQJ.LIZIZ(getDiContainer(), C0MER.class, null);
        this.LLJLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC564950MDt.class, null);
        this.LLJLLL = C1664770tQJ.LIZIZ(getDiContainer(), C0MCN.class, null);
        this.LLJZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC23228098g.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
        this.LLLF = new C11NJ();
        h0<C529150Kp7> h0Var = new h0<>(null);
        this.LLLFF = h0Var;
        this.LLLFFI = h0Var;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLLFZ = c560530Lyd;
        this.LLLI = c560530Lyd;
        this.LLLII = C0MEJ.LIZ;
        this.LLLIIII = (C564960MDu) C564860MDk.LIZ.getValue();
        this.LLLIIIIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(274));
        this.LLLIIIL = new AwS552S0100000_8(this, 592);
        this.LLLIIL = new AwS552S0100000_8(this, 596);
        this.LLLIILIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 593));
    }

    public final void n7(int i, int i2) {
        k7(new C565240MEw(0.0f, i - (this.LLJILLL.mView.getWidth() >> 1), i2 - (this.LLJILLL.mView.getHeight() >> 1), true, EnumC565210MEt.HIDE_IN_MEAN_WHILE, new AwS552S0100000_8(this, 597)));
    }
}
