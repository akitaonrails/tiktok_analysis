package X;

import Y.ACallableS240S0200000_8;
import Y.ACallableS415S0100000_8;
import Y.AObjectS240S0100000_5;
import Y.AObjectS241S0100000_8;
import Y.AObjectS245S0100000_22;
import Y.AObserverS122S0300000_5;
import Y.AObserverS225S0100000_22;
import Y.AfS177S0100000_8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator;
import com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0nfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443410nfH extends AbstractC2255721DQs<InterfaceC559500Lwy> implements InterfaceC559500Lwy, InterfaceC379610EuV {
    public static final C1443460nfM LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C1DRG LL;
    public volatile boolean LLILLJJLI;
    public InterfaceC420801kM LLJJIJI;
    public volatile AwemeDraft LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC376040Eok.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444170ngV.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444130ngR.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455680nz4.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EB6.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366450EYh.class, null);
    public final Map<C196925122x, StickerItemModel> LLJJ = new LinkedHashMap();
    public final List<StickerItemModel> LLJJI = new ArrayList();
    public final C11RK<Boolean> LLJJIII = new C11RK<>();
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 458));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 621));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 459));

    public InterfaceC559500Lwy Z1() {
        return this;
    }

    @Override // X.InterfaceC559500Lwy
    public void wQ1() {
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0nfM] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1443410nfH.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1443410nfH.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C1443410nfH.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C1443410nfH.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C1443410nfH.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C1443410nfH.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0), new C2217381BqS(C1443410nfH.class, "stickerScene", "getStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/IEditStickerScene;", 0), new C2217381BqS(C1443410nfH.class, "videoSizeProvider", "getVideoSizeProvider()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", 0), new C2217381BqS(C1443410nfH.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0), new C2217381BqS(C1443410nfH.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0), new C2217381BqS(C1443410nfH.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0), new C2217381BqS(C1443410nfH.class, "lyricBusinessApi", "getLyricBusinessApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0)};
        LLJJJJ = new Object() { // from class: X.0nfM
        };
        LLJJJJLIIL = 8;
    }

    private final InterfaceC1444170ngV B3() {
        return (InterfaceC1444170ngV) this.LLJ.getValue(this, LLJJJJJIL[6]);
    }

    private final boolean H3() {
        return ((Boolean) this.LLJJJ.getValue()).booleanValue();
    }

    private final InterfaceC1444130ngR LLJIJIL() {
        return (InterfaceC1444130ngR) this.LLJI.getValue(this, LLJJJJJIL[7]);
    }

    private final InterfaceC1456910o13 T2() {
        return (InterfaceC1456910o13) this.LLJIJIL.getValue(this, LLJJJJJIL[8]);
    }

    private final InterfaceC1455680nz4 X1() {
        return (InterfaceC1455680nz4) this.LLJILJIL.getValue(this, LLJJJJJIL[9]);
    }

    private final InterfaceC1455850nzL o2() {
        return (InterfaceC1455850nzL) this.LLILZ.getValue(this, LLJJJJJIL[1]);
    }

    private final InterfaceC366450EYh q3() {
        return (InterfaceC366450EYh) this.LLJILLL.getValue(this, LLJJJJJIL[11]);
    }

    @Override // X.InterfaceC559500Lwy
    public void Bw0() {
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoSaveDraftComponent recoverDraft ");
        sbLIZ.append(this.LLJJIJIIJIL);
        C201955140j.LJIILJJIL(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        Rm2();
        AwemeDraft awemeDraft = this.LLJJIJIIJIL;
        if (awemeDraft != null) {
            C15O7.LIZIZ(new ACallableS240S0200000_8(awemeDraft, this, 2), C741040T5a.LIZ, null);
        }
    }

    public final void DU0() {
        for (StickerItemModel stickerItemModel : this.LLJJI) {
            InfoStickerModel infoStickerModel = LJJJLIIL().getInfoStickerModel();
            if (infoStickerModel != null) {
                infoStickerModel.removeSticker(stickerItemModel);
            }
        }
        this.LLJJI.clear();
    }

    public final InterfaceC1455860nzM G2() {
        return (InterfaceC1455860nzM) this.LLILZIL.getValue(this, LLJJJJJIL[2]);
    }

    public final InterfaceC1461350o8D H2() {
        return (InterfaceC1461350o8D) this.LLILZLL.getValue(this, LLJJJJJIL[3]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJJJJJIL[0]);
    }

    @Override // X.InterfaceC559500Lwy
    public void Rm2() {
        InterfaceC420801kM interfaceC420801kM = this.LLJJIJI;
        if (interfaceC420801kM == null || interfaceC420801kM.isDisposed()) {
            return;
        }
        interfaceC420801kM.dispose();
    }

    public final C0E48 W2() {
        return (C0E48) this.LLJJIJIL.getValue();
    }

    public final InterfaceC377540ErA c3() {
        return (InterfaceC377540ErA) this.LLIZ.getValue(this, LLJJJJJIL[4]);
    }

    public final C0EB6 i3() {
        return (C0EB6) this.LLJILJILJ.getValue(this, LLJJJJJIL[10]);
    }

    public final C1443450nfL v3() {
        return (C1443450nfL) this.LLJJJIL.getValue();
    }

    public final InterfaceC376040Eok w2() {
        return (InterfaceC376040Eok) this.LLIZLLLIL.getValue(this, LLJJJJJIL[5]);
    }

    public final void x5() {
        for (Map.Entry<C196925122x, StickerItemModel> entry : this.LLJJ.entrySet()) {
            entry.getValue().extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), entry.getKey().LJIIJ());
        }
        t5(this, false, true);
    }

    private final void E3() {
        if (H3()) {
            return;
        }
        if (LJJJLIIL().isRetakeVideo()) {
            C363500EMy.LIZ.getClass();
        }
        EventBus.LIZLLL().LJIJJ(this);
        C15O7.LIZIZ(new ACallableS415S0100000_8(this, 10), C741040T5a.LIZ, null);
    }

    private final void F4() {
        C385670FAf<C349430Dmv> c385670FAfWL1;
        LiveEvent<Unit> liveEventYE1;
        LiveEvent<Boolean> liveEventPu1;
        if (C301790BsH.LIZ()) {
            InterfaceC377540ErA interfaceC377540ErAC3 = c3();
            if (interfaceC377540ErAC3 != null && (liveEventPu1 = interfaceC377540ErAC3.Pu1()) != null) {
                liveEventPu1.LIZ(this, new AObjectS240S0100000_5(this, 17));
            }
            InterfaceC377540ErA interfaceC377540ErAC32 = c3();
            if (interfaceC377540ErAC32 != null && (liveEventYE1 = interfaceC377540ErAC32.YE1()) != null) {
                liveEventYE1.LIZ(this, new AObjectS240S0100000_5(this, 18));
            }
            InterfaceC377540ErA interfaceC377540ErAC33 = c3();
            if (interfaceC377540ErAC33 == null || (c385670FAfWL1 = interfaceC377540ErAC33.wL1()) == null) {
                return;
            }
            c385670FAfWL1.LIZ(this, new AObjectS240S0100000_5(this, 19));
        }
    }

    private final void H4() {
        MutableLiveData<Unit> mutableLiveDataBd0;
        C0ETY c0ety;
        Class<InterfaceC1461350o8D> cls;
        AwS601S0100000_22 awS601S0100000_22;
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS601S0100000_22(this, 319));
        } else {
            C1DRG diContainer = getDiContainer();
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
                c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
                cls = InterfaceC1461350o8D.class;
                awS601S0100000_22 = new AwS601S0100000_22(this, 317);
            } else if (C365940EWi.LIZLLL(videoPublishEditModelLJJJLIIL)) {
                c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
                cls = InterfaceC1461350o8D.class;
                awS601S0100000_22 = new AwS601S0100000_22(this, 318);
            } else {
                InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) ((C05YF) diContainer.LJIIL(null, InterfaceC1461350o8D.class));
                if (interfaceC1461350o8D != null && (mutableLiveDataBd0 = interfaceC1461350o8D.Bd0()) != null) {
                    mutableLiveDataBd0.observe(this, new AObserverS225S0100000_22(this, 71));
                }
            }
            c0ety.Sd(cls, awS601S0100000_22);
        }
        o2().Iz2().LIZ(this, new AObjectS245S0100000_22(this, 119));
    }

    private final void K4() {
        LiveData<Boolean> liveDataQ72;
        InterfaceC366450EYh interfaceC366450EYhQ3 = q3();
        if (interfaceC366450EYhQ3 == null || (liveDataQ72 = interfaceC366450EYhQ3.q72()) == null) {
            return;
        }
        liveDataQ72.observe(this, new AObserverS225S0100000_22(this, 72));
    }

    private final boolean O3() {
        NLEInfoModel nLEInfoModel;
        NLEModel nLEModelLIZ;
        if (!C1440380naO.LIZIZ(LJJJLIIL())) {
            return false;
        }
        InterfaceC1452170ntP value = G2().g().getValue();
        if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null) {
            return C1440390naP.LIZIZ(LJJJLIIL(), nLEModelLIZ);
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (!C1440380naO.LIZIZ(videoPublishEditModelLJJJLIIL) || videoPublishEditModelLJJJLIIL == null) {
            return false;
        }
        CreativeModel creativeModel = videoPublishEditModelLJJJLIIL.creativeModel;
        if (creativeModel != null && (nLEInfoModel = creativeModel.nleInfoModel) != null) {
            NLEModel nLEModel = nLEInfoModel.nleModel;
            if (nLEModel != null) {
                boolean zLIZ = C348750Dlp.LIZ(nLEModel);
                if (!zLIZ) {
                    return zLIZ;
                }
                C1440390naP.LIZ("cached NLE model");
                return zLIZ;
            }
            if (videoPublishEditModelLJJJLIIL == null) {
                return false;
            }
        }
        String nleData = videoPublishEditModelLJJJLIIL.getNleData();
        if (nleData == null || nleData.length() == 0) {
            return false;
        }
        if (!a0.LJJIIZI(nleData, "http://", false) && !a0.LJJIIZI(nleData, "https://", false)) {
            return false;
        }
        C1440390naP.LIZ("serialized nleData payload");
        return true;
    }

    private final void O4() {
        LiveData<Unit> liveDataKp2;
        C0ETY c0ety;
        Class<InterfaceC1456910o13> cls;
        AwS601S0100000_22 awS601S0100000_22;
        o2().AT().LIZ(this, new AObjectS245S0100000_22(this, 120));
        C1DRG diContainer = getDiContainer();
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC1456910o13.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 320);
        } else {
            if (!C365940EWi.LIZLLL(videoPublishEditModelLJJJLIIL)) {
                InterfaceC1456910o13 interfaceC1456910o13 = (InterfaceC1456910o13) ((C05YF) diContainer.LJIIL(null, InterfaceC1456910o13.class));
                if (interfaceC1456910o13 == null || (liveDataKp2 = interfaceC1456910o13.Kp2()) == null) {
                    return;
                }
                liveDataKp2.observe(this, new AObserverS225S0100000_22(this, 73));
                return;
            }
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC1456910o13.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 321);
        }
        c0ety.Sd(cls, awS601S0100000_22);
    }

    private final boolean Q3() {
        InterfaceC1417440mzO interfaceC1417440mzO;
        return C1428470nHB.LJJZ(LJJJLIIL()) || C568750MSj.LIZIZ(LJJJLIIL()) || ((interfaceC1417440mzO = (InterfaceC1417440mzO) ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(InterfaceC1417440mzO.class)) != null && interfaceC1417440mzO.bF()) || O3();
    }

    private final void T4() {
        o2().uR1().LIZ(this, new AObjectS245S0100000_22(this, 121));
    }

    private final void Z4() {
        if (LJJJLIIL().isFromRestoreRecover()) {
            InterfaceC1639870sm9 interfaceC1639870sm9M3 = C1428520nHG.LJLIL(LJJJLIIL()) ? m3(C1453840nw6.LIZIZ()) : m3(null);
            FilterBean filterBeanLJ = C1428470nHB.LJ(LJJJLIIL(), interfaceC1639870sm9M3);
            String id = filterBeanLJ.getId();
            if (id == null || id.length() == 0 || Intrinsics.LJFF(filterBeanLJ.getId(), "-1")) {
                MutableLiveData mutableLiveDataLJFF = interfaceC1639870sm9M3.LJJI().LJFF();
                mutableLiveDataLJFF.observe(this, new AObserverS122S0300000_5(this, interfaceC1639870sm9M3, mutableLiveDataLJFF, 0));
            }
        }
    }

    private final void e4() {
        LiveEvent<Unit> liveEventNo2;
        InterfaceC377540ErA interfaceC377540ErAC3 = c3();
        if (interfaceC377540ErAC3 == null || (liveEventNo2 = interfaceC377540ErAC3.no2()) == null) {
            return;
        }
        liveEventNo2.LIZ(this, new AObjectS245S0100000_22(this, 118));
    }

    private final void o4() {
        LiveEvent<Unit> liveEventXh;
        InterfaceC1455680nz4 interfaceC1455680nz4X1 = X1();
        if (interfaceC1455680nz4X1 == null || (liveEventXh = interfaceC1455680nz4X1.xh()) == null) {
            return;
        }
        liveEventXh.LIZ(this, new AObjectS241S0100000_8(this, 44));
    }

    public final void C5() {
        InterfaceC1444130ngR interfaceC1444130ngRLLJIJIL;
        if (!H3() || (interfaceC1444130ngRLLJIJIL = LLJIJIL()) == null) {
            return;
        }
        interfaceC1444130ngRLLJIJIL.LJ(false, false);
    }

    public final void NZ() {
        DU0();
        W1();
        Qk(false);
    }

    public final void W1() {
        ArrayList<StickerItemModel> arrayList;
        InlineCaptionModel inlineCaptionModel = LJJJLIIL().creativeModel.inlineCaptionModel;
        if (inlineCaptionModel == null || (arrayList = inlineCaptionModel.utterances) == null) {
            return;
        }
        if (!LJJJLIIL().hasInfoStickers()) {
            LJJJLIIL().setInfoStickerModel(new InfoStickerModel(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIJ(LJJJLIIL())));
        }
        for (StickerItemModel stickerItemModel : arrayList) {
            this.LLJJI.add(stickerItemModel);
            InfoStickerModel infoStickerModel = LJJJLIIL().getInfoStickerModel();
            if (infoStickerModel != null) {
                infoStickerModel.addSticker(0, stickerItemModel);
            }
        }
    }

    @Override // X.InterfaceC559500Lwy
    public boolean fz() {
        CreativeModel creativeModel;
        EditorProDraftModel editorProDraftModel;
        if (!C301790BsH.LIZ()) {
            return false;
        }
        AwemeDraft awemeDraft = this.LLJJIJIIJIL;
        return C123100dR.LIZ((awemeDraft == null || (creativeModel = awemeDraft.LIZ) == null || (editorProDraftModel = creativeModel.editorProDraftModel) == null) ? null : editorProDraftModel.nleDataPath) && !C123100dR.LIZ(LJJJLIIL().getEditorProDraftModel().nleDataPath);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "EditAutoSaveDraftComponent onCreate");
        E3();
        if (C301570Brv.LIZ()) {
            H4();
            if (C1416310mxZ.LJJLIIIJJIZ(LJJJLIIL())) {
                O4();
            } else {
                T4();
            }
        }
        F4();
        o4();
        e4();
        Z4();
        K4();
        this.LLJJIJI = this.LLJJIII.LJIL(((Number) C0BRV.LIZ.getValue()).longValue(), TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 43));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        Rm2();
        EventBus.LIZLLL().LJJI(this);
        C363500EMy.LIZ.getClass();
        super.onDestroy();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1443410nfH(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final InterfaceC1639870sm9 m3(String str) {
        return C0CHQ.LIZ().LJJIJ(str).LIZIZ();
    }

    public final void P4(C122Q c122q) {
        LiveEvent<C196925122x> liveEventSC0;
        if (c122q != null && (liveEventSC0 = c122q.sC0()) != null) {
            liveEventSC0.LIZ(this, new AObjectS240S0100000_5(this, 20));
        }
    }

    @Override // X.InterfaceC559500Lwy
    public void Qk(boolean z) {
        if (!C301570Brv.LIZ()) {
            return;
        }
        d5(this, z);
    }

    public final void n5(C540340LHc c540340LHc) {
        IInternalDraftSizeCalculator iInternalDraftSizeCalculatorLIZIZ;
        this.LLILLJJLI = false;
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoSaveDraftComponent saveDraftInternal save draft done ");
        sbLIZ.append(c540340LHc.LIZ.isSuc());
        C201955140j.LJIILJJIL(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        IPublishGuideDraftService iPublishGuideDraftService = (IPublishGuideDraftService) PluggableExtentionKt.pluggableSpi$default(IPublishGuideDraftService.class, false, false, false, 14, null);
        if (iPublishGuideDraftService != null && (iInternalDraftSizeCalculatorLIZIZ = iPublishGuideDraftService.LIZIZ()) != null && iInternalDraftSizeCalculatorLIZIZ.LJ()) {
            try {
                iInternalDraftSizeCalculatorLIZIZ.LJFF(LJJJLIIL());
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C856010Xi3 c856010Xi3) {
        Bw0();
    }

    public final void z4(C122Q c122q) {
        if (u4.LJLJLJ(LJJJLIIL()) && c122q != null) {
            c122q.eC1(new AnonymousClass1243() { // from class: X.0nfK
                @Override // X.AnonymousClass1243
                public final void LIZ() {
                    this.LIZ.NZ();
                }

                @Override // X.AnonymousClass1243
                public final void LIZIZ() {
                    this.LIZ.DU0();
                    this.LIZ.Qk(false);
                }

                @Override // X.AnonymousClass1243
                public final void LIZJ() {
                    this.LIZ.NZ();
                }
            });
        }
    }

    public static final void d5(C1443410nfH c1443410nfH, boolean z) {
        if (!c1443410nfH.LLILLJJLI && !c1443410nfH.Q3()) {
            InterfaceC420801kM interfaceC420801kM = c1443410nfH.LLJJIJI;
            if (interfaceC420801kM != null && interfaceC420801kM.isDisposed()) {
                return;
            }
            c1443410nfH.LLJJIII.onNext(Boolean.valueOf(z));
        }
    }

    public static final void t5(C1443410nfH c1443410nfH, boolean z, boolean z2) {
        IInternalDraftSizeCalculator iInternalDraftSizeCalculatorLIZIZ;
        Unit unit;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
        InterfaceC1446740nke interfaceC1446740nke;
        NLEModel nLEModelLLZ;
        String strLIZJ;
        if (c1443410nfH.O3()) {
            return;
        }
        IPublishGuideDraftService iPublishGuideDraftService = (IPublishGuideDraftService) PluggableExtentionKt.pluggableSpi$default(IPublishGuideDraftService.class, false, false, false, 14, null);
        if (iPublishGuideDraftService != null) {
            iInternalDraftSizeCalculatorLIZIZ = iPublishGuideDraftService.LIZIZ();
        } else {
            iInternalDraftSizeCalculatorLIZIZ = null;
        }
        if (iInternalDraftSizeCalculatorLIZIZ == null || !iInternalDraftSizeCalculatorLIZIZ.LJ()) {
            if (iInternalDraftSizeCalculatorLIZIZ == null) {
                unit = null;
            } else {
                try {
                    iInternalDraftSizeCalculatorLIZIZ.LJFF(c1443410nfH.LJJJLIIL());
                    unit = Unit.LIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            C189200o6.m2constructorimpl(unit);
        }
        if (!z && !c1443410nfH.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "EditAutoSaveDraftComponent saveDraftInternal " + c1443410nfH.getLifecycle().getCurrentState());
            return;
        }
        if (c1443410nfH.LLILLJJLI) {
            return;
        }
        c1443410nfH.LLILLJJLI = true;
        if (z2) {
            C1436990nUv.LJIIIZ(c1443410nfH.G2().g().getValue(), c1443410nfH.LJJJLIIL());
            if (!C1428520nHG.LJJJJJ(c1443410nfH.LJJJLIIL())) {
                InterfaceC1455860nzM interfaceC1455860nzMG2 = c1443410nfH.G2();
                if ((interfaceC1455860nzMG2 instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMG2) != null && (nLEModelLLZ = interfaceC1446740nke.LLZ()) != null && (strLIZJ = C375260EnU.LIZJ(nLEModelLLZ)) != null) {
                    VideoPublishEditModel videoPublishEditModelLJJJLIIL2 = c1443410nfH.LJJJLIIL();
                    videoPublishEditModelLJJJLIIL2.setNleData(strLIZJ);
                    if (C350300DoK.LIZ()) {
                        videoPublishEditModelLJJJLIIL2.setNleModel(NLEModel.dynamicCast(nLEModelLLZ.deepClone()));
                        videoPublishEditModelLJJJLIIL2.setNleDataChange(false);
                    }
                }
            }
        }
        if (c1443410nfH.H3()) {
            boolean zVi0 = c1443410nfH.w2().vi0();
            C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "EditAutoSaveDraftComponent saveDraftInternal check point " + zVi0);
            if (!zVi0) {
                if (((Boolean) C0BDX.LIZ.getValue()).booleanValue()) {
                    c1443410nfH.w2().gh0(new AwS587S0100000_8(c1443410nfH, 412));
                    return;
                } else {
                    c1443410nfH.LLILLJJLI = false;
                    return;
                }
            }
            C573960MfC.LIZ(C0CHQ.LIZ().LJIIJ(), c1443410nfH.LJJJLIIL(), c1443410nfH.LJJJLIIL().getCreationId(), 1, new AwS587S0100000_8(c1443410nfH, 413), 8);
            return;
        }
        C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "EditAutoSaveDraftComponent saveDraftInternal save draft");
        if (((Boolean) C0BDY.LIZ.getValue()).booleanValue()) {
            videoPublishEditModelLJJJLIIL = c1443410nfH.LJJJLIIL().clone();
        } else {
            videoPublishEditModelLJJJLIIL = c1443410nfH.LJJJLIIL();
        }
        videoPublishEditModelLJJJLIIL.creativeModel.draftInfoModel.saveDraftScene = "silence";
        C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZ), null, null, new C0LI5(videoPublishEditModelLJJJLIIL, c1443410nfH, null), 3);
    }
}
