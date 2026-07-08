package X;

import Y.AObserverS170S0200000_5;
import Y.AObserverS209S0100000_5;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentMV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;
import com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.vesdk.VEEditor;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS1S0130000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;

/* JADX INFO: renamed from: X.0EiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372050EiJ extends AbstractC19755912Rh<InterfaceC377540ErA, C372140EiS, C372350Ein> implements InterfaceC377540ErA, InterfaceC379610EuV {
    public static final C372170EiV LLLLIILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIL;
    public static final int LLLLILI;
    public final C19A3 LLILZLL;
    public final C1DRG LLIZ;
    public final int LLIZLLLIL;
    public final long LLJ;
    public final C560530Lyd<Unit> LLJI;
    public final LiveEvent<Unit> LLJIJIL;
    public final C560530Lyd<Pair<EnumC377550ErB, Float>> LLJILJIL;
    public final C560530Lyd<Unit> LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final h0<Boolean> LLJJI;
    public final C560530Lyd<Unit> LLJJIII;
    public final C560530Lyd<Unit> LLJJIJI;
    public final C385670FAf<Boolean> LLJJIJIIJIL;
    public final LiveEvent<Unit> LLJJIJIL;
    public final LiveEvent<Unit> LLJJJ;
    public final C560530Lyd<Boolean> LLJJJIL;
    public final C560530Lyd<Unit> LLJJJJ;
    public final C560530Lyd<Unit> LLJJJJJIL;
    public final C560530Lyd<Boolean> LLJJJJLIIL;
    public final C560530Lyd<Unit> LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public volatile boolean LLJL;
    public C2217061Bpw LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public C0ELJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public final InterfaceC1731706qJ LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final InterfaceC1731706qJ LLLIIII;
    public final InterfaceC1731706qJ LLLIIIIL;
    public final InterfaceC1731706qJ LLLIIIL;
    public final InterfaceC1731706qJ LLLIIL;
    public final InterfaceC1731706qJ LLLIILIL;
    public final InterfaceC1731706qJ LLLIL;
    public final InterfaceC1731706qJ LLLILZ;
    public final InterfaceC1731706qJ LLLILZJ;
    public InterfaceC377490Er5 LLLILZLLLI;
    public MessageQueue.IdleHandler LLLIZZ;
    public Set<String> LLLJ;
    public long LLLJIL;
    public long LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final Function0<C372140EiS> LLLLIIL;
    public final Function0<C372350Ein> LLLLIILL;

    @Override // X.InterfaceC377540ErA
    public void JZ1() {
        INLEMediaSession iNLEMediaSessionF1;
        String nleData = C5().getNleData();
        AbstractC1452680nuE abstractC1452680nuEGc = JY0().gc();
        if (abstractC1452680nuEGc != null) {
            abstractC1452680nuEGc.LJJIFFI(nleData, true);
        }
        C0E48 c0e48Q3 = q3();
        if (c0e48Q3 == null || (iNLEMediaSessionF1 = c0e48Q3.f1()) == null) {
            return;
        }
        W7(null, nleData, iNLEMediaSessionF1, iNLEMediaSessionF1.getPlayerApi().getDuration());
    }

    @Override // X.InterfaceC377540ErA
    public void nO2() {
        C348100Dkm c348100DkmLIZIZ;
        NLEModel model;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (model = c348100DkmLIZIZ.LIZ.getModel()) == null) {
            return;
        }
        INLEMediaSession iNLEMediaSession = c348100DkmLIZIZ.LIZIZ;
        W7(model, null, iNLEMediaSession, iNLEMediaSession.getPlayerApi().getDuration());
    }

    public final boolean u7() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [X.0EiV] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C372050EiJ.class, "veAutoPlayInterceptorApi", "getVeAutoPlayInterceptorApi()Lcom/ss/android/ugc/gamora/editor/VEAutoPlayInterceptorApi;", 0);
        C13LE.LIZ.getClass();
        LLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C372050EiJ.class, "textNewApi", "getTextNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0), new C2217381BqS(C372050EiJ.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0), new C2217381BqS(C372050EiJ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C372050EiJ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C372050EiJ.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C372050EiJ.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C372050EiJ.class, "editorProAdapterApi", "getEditorProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0), new C2217381BqS(C372050EiJ.class, "subtitleApi", "getSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0), new C2217381BqS(C372050EiJ.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C372050EiJ.class, "audioCopyRightDistributeApi", "getAudioCopyRightDistributeApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/AudioCopyRightDistributeApi;", 0), new C2217381BqS(C372050EiJ.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(C372050EiJ.class, "taskScheduler", "getTaskScheduler()Lcom/ss/android/ugc/aweme/creative/taskscheduler/scheduler/TaskScheduler;", 0), new C2217381BqS(C372050EiJ.class, "mixEditingDataApi", "getMixEditingDataApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingMaterialDataApi;", 0), new C2217381BqS(C372050EiJ.class, "videoSizeProvider", "getVideoSizeProvider()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", 0), new C2217381BqS(C372050EiJ.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0), new C2217381BqS(C372050EiJ.class, "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoEditContainerScene;", 0), new C2217381BqS(C372050EiJ.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new C2217381BqS(C372050EiJ.class, "mixEditingMaterialApi", "getMixEditingMaterialApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingAssetsApi;", 0), new C2217381BqS(C372050EiJ.class, "autoCutPreloadApi", "getAutoCutPreloadApi()Lcom/ss/android/ugc/aweme/autocut/AutoCutPreloadingApi;", 0), new C2217381BqS(C372050EiJ.class, "stripPreviewApi", "getStripPreviewApi()Lcom/ss/android/ugc/gamora/editor/toolbar/StripMusicPreviewApi;", 0), new C2217381BqS(C372050EiJ.class, "templateAutoCutAIApi", "getTemplateAutoCutAIApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/TemplateAutoCutAIApi;", 0)};
        LLLLIILLL = new Object() { // from class: X.0EiV
        };
        LLLLILI = 8;
    }

    private final InterfaceC1417110myr F4() {
        return (InterfaceC1417110myr) this.LLLIL.getValue(this, LLLLIL[19]);
    }

    private final View H4() {
        return (View) this.LLLLIIIILLL.getValue();
    }

    private final InterfaceC1417440mzO J6() {
        return (InterfaceC1417440mzO) this.LLLILZJ.getValue(this, LLLLIL[21]);
    }

    private final InterfaceC1455850nzL K4() {
        return (InterfaceC1455850nzL) this.LLJZIJLIL.getValue(this, LLLLIL[6]);
    }

    private final C0EJ3 K6() {
        return (C0EJ3) this.LLJJ.getValue(this, LLLLIL[1]);
    }

    private final VideoEditContainerScene N6() {
        return (VideoEditContainerScene) this.LLLIIIL.getValue(this, LLLLIL[16]);
    }

    private final C372930Ejj S5() {
        return (C372930Ejj) this.LLLL.getValue();
    }

    private final void S6() {
        InterfaceC1462000o9G interfaceC1462000o9G = new InterfaceC1462000o9G() { // from class: X.0EiT
            @Override // X.InterfaceC1462000o9G
            public final boolean LJL(boolean z) {
                return true;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean LLIIIJ() {
                return true;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean b0() {
                return true;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean x0() {
                return true;
            }
        };
        InterfaceC372160EiU interfaceC372160EiUL6 = L6();
        if (interfaceC372160EiUL6 != null) {
            interfaceC372160EiUL6.FS1(interfaceC1462000o9G);
        }
        JY0().ww2().observe(this, new AObserverS170S0200000_5(interfaceC1462000o9G, this, 17));
    }

    private final boolean T6() {
        return ((Boolean) this.LLLLII.getValue()).booleanValue();
    }

    private final InterfaceC372120EiQ U5() {
        return (InterfaceC372120EiQ) this.LLLILZ.getValue(this, LLLLIL[20]);
    }

    private final C0EYP d5() {
        return (C0EYP) this.LLL.getValue(this, LLLLIL[7]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLLFZ.getValue(this, LLLLIL[11]);
    }

    private final C0EY2 k5() {
        return (C0EY2) this.LLLIIIIL.getValue(this, LLLLIL[15]);
    }

    private final C21378018lO u6() {
        return (C21378018lO) this.LLLI.getValue(this, LLLLIL[12]);
    }

    private final void v3() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        FrameCacheViewModel frameCacheViewModel = (FrameCacheViewModel) C364210EPr.LIZLLL(FrameCacheViewModel.class);
        if (frameCacheViewModel != null) {
            frameCacheViewModel.LLILLL = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIJ(C5().getCreativeInfo(), EnumC20228014Cw.EP_FRAME, String.valueOf(System.currentTimeMillis()), false);
        }
        if (!this.LLILZLL.isAdded(N5())) {
            this.LLILZLL.add(this.LLIZLLLIL, N5(), "EditorProScene");
        }
        if (this.LLLILZLLLI == null) {
            C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(M5());
            this.LLLILZLLLI = c1drgLJIIIZ != null ? (InterfaceC377490Er5) c1drgLJIIIZ.LJIIL(null, InterfaceC377490Er5.class) : null;
        }
    }

    private final InterfaceC1413730mtP v5() {
        return (InterfaceC1413730mtP) this.LLLII.getValue(this, LLLLIL[13]);
    }

    private final InterfaceC1414530muh x5() {
        return (InterfaceC1414530muh) this.LLLIILIL.getValue(this, LLLLIL[18]);
    }

    @Override // X.InterfaceC377540ErA
    public void B91() {
        i3(AFwS234S0000000_5.get$arr$(365));
        if (T6() || LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(InterfaceC1461350o8D.class);
            if (interfaceC1461350o8D != null) {
                interfaceC1461350o8D.TJ();
            }
        } else {
            InterfaceC1461350o8D interfaceC1461350o8DP4 = P4();
            if (interfaceC1461350o8DP4 != null) {
                interfaceC1461350o8DP4.TJ();
            }
        }
        JY0().FJ(true);
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null) {
            value.play();
        }
    }

    public final VideoPublishEditModel C5() {
        return (VideoPublishEditModel) this.LLJLL.getValue(this, LLLLIL[3]);
    }

    @Override // X.InterfaceC377540ErA
    public void Ds() {
        i3(AFwS234S0000000_5.get$arr$(369));
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJLLIL.getValue(this, LLLLIL[4]);
    }

    public final InterfaceC372160EiU L6() {
        return (InterfaceC372160EiU) this.LLJILLL.getValue(this, LLLLIL[0]);
    }

    public final InterfaceC1444130ngR LLJIJIL() {
        return (InterfaceC1444130ngR) this.LLLIIII.getValue(this, LLLLIL[14]);
    }

    public final C372480Ej0 N5() {
        return (C372480Ej0) this.LLJLILLLLZIIL.getValue();
    }

    public final void O3() {
        this.LLJJL.LJIIJ(Unit.LIZ);
    }

    public final C1451630nsX O4() {
        return (C1451630nsX) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLLIL[2]);
    }

    public final InterfaceC1461350o8D P4() {
        return (InterfaceC1461350o8D) this.LLJLLL.getValue(this, LLLLIL[5]);
    }

    @Override // X.InterfaceC377540ErA
    public void Q70() {
        C372830EjZ c372830EjZYh0;
        C0ET3 c0et3 = C0ET3.LIZ;
        VideoPublishEditModel videoPublishEditModelC5 = C5();
        c0et3.getClass();
        if (C0ET3.LIZ(videoPublishEditModelC5)) {
            C0E12 c0e12 = C363750ENx.LIZ;
            if (c0e12.LIZ("sync_control_height_when_enter_ep", false) && (c372830EjZYh0 = Yh0()) != null) {
                int iLIZ = C363750ENx.LIZ();
                int controlAreaHeight = c372830EjZYh0.getControlAreaHeight();
                if (controlAreaHeight != iLIZ && iLIZ > 0) {
                    c372830EjZYh0.LJIIIIZZ(iLIZ, false, null);
                    c372830EjZYh0.LJIIIZ();
                    C563650M8t c563650M8t = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("recordHeight :");
                    sbLIZ.append(iLIZ);
                    sbLIZ.append(" curHeight: ");
                    sbLIZ.append(controlAreaHeight);
                    sbLIZ.append(' ');
                    C201955140j.LIZLLL(c563650M8t, "EditorProComponent", C2188811AlT.LIZIZ(sbLIZ));
                }
                c0e12.LIZIZ("sync_control_height_when_enter_ep", false);
            }
        }
    }

    @Override // X.InterfaceC377540ErA
    public void R11() {
        this.LLJILJILJ.LJIIJ(Unit.LIZ);
    }

    public final InterfaceC1460000o62 T4() {
        return (InterfaceC1460000o62) this.LLLFF.getValue(this, LLLLIL[9]);
    }

    @Override // X.InterfaceC377540ErA
    public boolean Ux0() {
        InterfaceC377490Er5 interfaceC377490Er5 = this.LLLILZLLLI;
        if (interfaceC377490Er5 != null) {
            return interfaceC377490Er5.lu();
        }
        return false;
    }

    @Override // X.InterfaceC377540ErA
    public void XS0() {
        c3(AFwS234S0000000_5.get$arr$(371));
    }

    @Override // X.InterfaceC377540ErA
    public boolean Xc2() {
        return this.LLJL && this.LLILZLL.isAdded(M5());
    }

    @Override // X.InterfaceC377540ErA
    public C0EPN Xv2() {
        return new C0EPN() { // from class: X.0EiN
            @Override // X.C0EPN
            public final String LLIILZL() {
                C2217061Bpw c2217061Bpw = this.LIZ.LLJLIL;
                if (c2217061Bpw != null) {
                    return c2217061Bpw.LJIIIIZZ;
                }
                return null;
            }

            @Override // X.C0EPN
            public final C364440EQo LLLZIL() {
                C364440EQo c364440EQo;
                C372050EiJ c372050EiJ = this.LIZ;
                C2217061Bpw c2217061Bpw = c372050EiJ.LLJLIL;
                if (c2217061Bpw != null && (c364440EQo = c2217061Bpw.LJI) != null) {
                    return c364440EQo;
                }
                AbstractC2217051Bpv abstractC2217051BpvLLLFFI = LLLFFI(c372050EiJ.C5(), false);
                if (abstractC2217051BpvLLLFFI != null) {
                    return abstractC2217051BpvLLLFFI.LJII;
                }
                return null;
            }

            @Override // X.C0EPN
            public final void LLJJL(C364440EQo c364440EQo) {
                C372050EiJ c372050EiJ = this.LIZ;
                C2217061Bpw c2217061Bpw = c372050EiJ.LLJLIL;
                if (c2217061Bpw != null) {
                    if (c364440EQo != null) {
                        c2217061Bpw.LJI = c364440EQo;
                    }
                } else {
                    AbstractC2217051Bpv abstractC2217051BpvLLLFFI = LLLFFI(c372050EiJ.C5(), false);
                    if (abstractC2217051BpvLLLFFI == null || c364440EQo == null) {
                        return;
                    }
                    abstractC2217051BpvLLLFFI.LJI = c364440EQo;
                }
            }

            @Override // X.C0EPN
            public final void LLLLZIL(String str) {
                C2217061Bpw c2217061Bpw = this.LIZ.LLJLIL;
                if (c2217061Bpw != null) {
                    if (str == null) {
                        str = "";
                    }
                    c2217061Bpw.LJIIIIZZ = str;
                }
            }

            @Override // X.C0EPN
            public final AbstractC2217051Bpv LLLFFI(VideoPublishEditModel videoPublishEditModel, boolean z) {
                return this.LIZ.tD0(videoPublishEditModel, z);
            }
        };
    }

    public final InterfaceC1418580n1E Z4() {
        return (InterfaceC1418580n1E) this.LLLIIL.getValue(this, LLLLIL[17]);
    }

    public final InterfaceC1456910o13 d6() {
        return (InterfaceC1456910o13) this.LLLF.getValue(this, LLLLIL[8]);
    }

    public final void e4() {
        this.LLJJIII.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC377540ErA
    public void g4() {
        i3(AFwS234S0000000_5.get$arr$(370));
    }

    @Override // X.InterfaceC377540ErA
    public void in1() {
        i3(AFwS234S0000000_5.get$arr$(364));
    }

    @Override // X.InterfaceC377540ErA
    public boolean isShowing() {
        if (this.LLJL) {
            return this.LLILZLL.isShowing(M5());
        }
        return false;
    }

    public final void o7() {
        this.LLJI.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC377540ErA
    public boolean oH() {
        C0ELJ c0elj = this.LLJZ;
        return c0elj != null && c0elj.getEffectMultiTrackMode();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    @Override // X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372050EiJ.onCreate():void");
    }

    @Override // X.InterfaceC377540ErA
    public void uj2() {
        i3(AFwS234S0000000_5.get$arr$(362));
    }

    @Override // X.InterfaceC377540ErA
    public C385670FAf<C349430Dmv> wL1() {
        return Z1(new C2217381BqS() { // from class: X.0EiP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C372140EiS) obj).LIZLLL;
            }
        });
    }

    @Override // X.InterfaceC377540ErA
    public void yC2() {
        i3(AFwS234S0000000_5.get$arr$(363));
    }

    public final InterfaceC1417120mys z4() {
        return (InterfaceC1417120mys) this.LLLFFI.getValue(this, LLLLIL[10]);
    }

    private final Set<String> D5() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        NLEResourceNode resource;
        Iterable iterableLLIIII;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null) {
            return C08CX.INSTANCE;
        }
        VecNLETrackSPtr tracks = model.getTracks();
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                if (slots == null || (iterableLLIIII = C13LP.LLIIII(slots)) == null) {
                    iterableLLIIII = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterableLLIIII, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                NLESegment mainSegment = ((NLETrackSlot) it3.next()).getMainSegment();
                if (mainSegment != null && (resource = mainSegment.getResource()) != null && (NLESegmentVideo.dynamicCast((NLENode) mainSegment) != null || NLESegmentMV.dynamicCast(mainSegment) != null)) {
                    String resourceFile = resource.getResourceFile();
                    if (resourceFile != null && resourceFile.length() > 0) {
                        arrayList2.add(resourceFile);
                    }
                }
            }
            Set<String> setLLIIJI = C13LP.LLIIJI(arrayList2);
            if (setLLIIJI != null) {
                return setLLIIJI;
            }
        }
        return C08CX.INSTANCE;
    }

    private final void H3() {
        if (J6() == null) {
            return;
        }
        Set<String> set = this.LLLJ;
        this.LLLJ = null;
        if (set != null && (!set.isEmpty()) && C5().isCurrentAutoCutMode() && Intrinsics.LJFF(D5(), set)) {
            C5().getEditorProModel().setMediaUnchangedAfterEP(true);
            C201955140j.LJIILJJIL(C1398350mUb.LIZIZ, "EditorPro backToEditPage: NLE media unchanged (snapshot match), skip cancel");
            return;
        }
        C1417160myw c1417160myw = C1417160myw.LIZ;
        C19EG activity = getActivity();
        VideoPublishEditModel videoPublishEditModelC5 = C5();
        C1DRG diContainer = getDiContainer();
        c1417160myw.getClass();
        boolean zLJIILJJIL = C1417160myw.LJIILJJIL(activity, videoPublishEditModelC5, diContainer, null);
        VideoPublishEditModel videoPublishEditModelC52 = C5();
        boolean z = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_fix_template_import_media_check", true, true) && videoPublishEditModelC52.getAILivePhotoModel().LJII() && videoPublishEditModelC52.isCurrentAutoCutMode();
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorPro backToEditPage: isMaterialsUnChange=");
        sbLIZ.append(zLJIILJJIL);
        sbLIZ.append(", shouldKeepTemplateForAlive=");
        sbLIZ.append(z);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (zLJIILJJIL || z) {
            return;
        }
        InterfaceC1417440mzO interfaceC1417440mzOJ6 = J6();
        if (interfaceC1417440mzOJ6 != null) {
            interfaceC1417440mzOJ6.I22();
        }
        C201955140j.LJIILJJIL(c1398350mUb, "EditorPro backToEditPage: Material changed, cancel all AI tasks");
    }

    private final void I7() {
        InterfaceC372160EiU interfaceC372160EiUL6 = L6();
        if (interfaceC372160EiUL6 != null) {
            interfaceC372160EiUL6.FS1(new InterfaceC1462000o9G() { // from class: X.0EiR
                @Override // X.InterfaceC1462000o9G
                public final boolean LJL(boolean z) {
                    return false;
                }

                @Override // X.InterfaceC1462000o9G
                public final boolean LLIIIJ() {
                    return false;
                }

                @Override // X.InterfaceC1462000o9G
                public final boolean x0() {
                    return false;
                }

                @Override // X.InterfaceC1462000o9G
                public final boolean b0() {
                    InterfaceC372160EiU interfaceC372160EiUL62 = this.LL.L6();
                    if (interfaceC372160EiUL62 == null) {
                        return true;
                    }
                    interfaceC372160EiUL62.cg1(this);
                    return true;
                }
            });
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        InterfaceC1452170ntP value = JY0().g().getValue();
        C348100Dkm c348100DkmLIZIZ = value != null ? C352130DrH.LIZIZ(value) : null;
        c363500EMy.getClass();
        C363500EMy.LIZJ = c348100DkmLIZIZ;
        AbstractC1452680nuE abstractC1452680nuEGc = JY0().gc();
        if (abstractC1452680nuEGc != null) {
            abstractC1452680nuEGc.LJJ().nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    private final C19A3 M5() {
        return N5();
    }

    private final int P6() {
        int fullScreenHeight;
        View viewH4 = H4();
        if (viewH4 == null || (fullScreenHeight = viewH4.getHeight()) == 0) {
            fullScreenHeight = ScreenUtils.getFullScreenHeight(getActivity()) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(getActivity());
        }
        return (fullScreenHeight - m6()) - n5();
    }

    private final int m6() {
        int navBarHeight;
        C372830EjZ c372830EjZYh0 = Yh0();
        if (c372830EjZYh0 != null) {
            navBarHeight = c372830EjZYh0.getNavBarHeight();
        } else {
            int i = C372830EjZ.LLJJJJ;
            navBarHeight = C372830EjZ.LLJJJJ;
        }
        return navBarHeight + (C357540E0a.LJIILLIIL(getActivity()) ? 0 : ScreenUtils.getStatusBarHeight(getActivity()));
    }

    private final int n5() {
        int iLIZ = C363750ENx.LIZ();
        int grabberHeight = 0;
        if (iLIZ == -1) {
            iLIZ = C0ES3.LIZ();
            C372830EjZ c372830EjZYh0 = Yh0();
            if (c372830EjZYh0 != null) {
                grabberHeight = c372830EjZYh0.getGrabberHeight();
            }
        } else {
            C372830EjZ c372830EjZYh02 = Yh0();
            if (c372830EjZYh02 != null) {
                grabberHeight = c372830EjZYh02.getGrabberHeight();
            }
        }
        return iLIZ + grabberHeight;
    }

    private final void p8() {
        float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(C301770BsF.LIZ()));
        SurfaceView value = JY0().ge().getValue();
        if (value != null) {
            C1447470nlp.LIZIZ(value, fLIZIZ);
        }
    }

    private final int t5() {
        return m6();
    }

    private final void wi0() {
        SelectedMaterialItem selectedMaterialItem;
        if (C5().creativeModel.mixEditingModel.templateMobParams == null || (selectedMaterialItem = C5().creativeModel.mixEditingModel.selectedMaterialItem) == null) {
            return;
        }
        boolean z = selectedMaterialItem.materialType == MixEditingMaterialType.SOUND_SYNC;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(C5().creativeModel.musicBuzModel);
        boolean zLJFF = Intrinsics.LJFF(aVMusicExtractAVMusic != null ? aVMusicExtractAVMusic.getMusicId() : null, selectedMaterialItem.materialId);
        if (z) {
            if (zLJFF && C5().getEditMusicSyncMode()) {
                return;
            }
            C5().creativeModel.mixEditingModel.templateMobParams = null;
        }
    }

    @Override // X.InterfaceC377540ErA
    public boolean Bg() {
        return T2().LIZJ;
    }

    public final void W6() {
        if (T6() || LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(InterfaceC1461350o8D.class);
            if (interfaceC1461350o8D != null) {
                interfaceC1461350o8D.t41();
            }
        } else {
            InterfaceC1461350o8D interfaceC1461350o8DP4 = P4();
            if (interfaceC1461350o8DP4 != null) {
                interfaceC1461350o8DP4.t41();
            }
        }
        if (((Boolean) C301770BsF.LIZ.getValue()).booleanValue()) {
            p8();
        }
    }

    @Override // X.InterfaceC377540ErA
    public C372830EjZ Yh0() {
        C0EGE c0ege = N5().LLLILZ;
        if (c0ege != null) {
            return c0ege.LJIIJ;
        }
        return null;
    }

    public final void Z7() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProComponent runPreloadTaskIfNeeded: ");
        sbLIZ.append(this.LLLIZZ == null);
        sbLIZ.append("  isAdded");
        sbLIZ.append(Xc2());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (u6() != null && !Xc2()) {
            C21378018lO c21378018lOU6 = u6();
            if (c21378018lOU6 != null) {
                c21378018lOU6.UM2(new C19642411t8(getDiContainer()));
                return;
            }
            return;
        }
        if (this.LLLIZZ != null || Xc2()) {
            return;
        }
        C391590FWz c391590FWz = new C391590FWz(this, 0);
        C786410Ut5.f3(c391590FWz, Looper.myQueue());
        this.LLLIZZ = c391590FWz;
    }

    @Override // X.InterfaceC377540ErA
    public InterfaceC377480Er4 b72() {
        return S5();
    }

    public final void d7() {
        Q70();
        XL(true, false);
        C0EYP c0eypD5 = d5();
        if (c0eypD5 != null) {
            c0eypD5.nW1(m6());
        }
    }

    public final void fA1() {
        wi0();
        this.LLJJJJJIL.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC377540ErA
    public EnumC376530EpX getSaveType() {
        InterfaceC372610EjD interfaceC372610EjD;
        EnumC376530EpX enumC376530EpXCK2;
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(N5());
        return (c1drgLJIIIZ == null || (interfaceC372610EjD = (InterfaceC372610EjD) c1drgLJIIIZ.LJIIL(null, InterfaceC372610EjD.class)) == null || (enumC376530EpXCK2 = interfaceC372610EjD.cK2()) == null) ? EnumC376530EpX.DIRECT : enumC376530EpXCK2;
    }

    @Override // X.InterfaceC377540ErA
    public C372180EiW hk2() {
        if (C1428470nHB.LJJLIIIJLLLLLLLZ(C5())) {
            n5();
            C578100Mls.LIZJ(getActivity());
            m6();
        } else {
            n5();
        }
        int iLIZJ = C1428470nHB.LJJLIIIJLLLLLLLZ(C5()) ? C578100Mls.LIZJ(getActivity()) : m6();
        int iP6 = P6();
        c0.LIZ.n2();
        return new C372180EiW(iLIZJ, iP6);
    }

    public final void k7() {
        InterfaceC372120EiQ interfaceC372120EiQU5 = U5();
        if (interfaceC372120EiQU5 != null) {
            interfaceC372120EiQU5.yM();
        }
    }

    public final void n7() {
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaSettings mediaSettingApi;
        C0E55 player;
        InterfaceC1444130ngR interfaceC1444130ngRLLJIJIL = LLJIJIL();
        if (interfaceC1444130ngRLLJIJIL != null && !C1428470nHB.LJJLIIIJLLLLLLLZ(C5()) && interfaceC1444130ngRLLJIJIL.LIZJ() > 0 && interfaceC1444130ngRLLJIJIL.LJFF() > 0) {
            c0.LIZ.q2(interfaceC1444130ngRLLJIJIL.LJFF(), interfaceC1444130ngRLLJIJIL.LIZJ(), JY0().ge().getValue());
        }
        C0E48 c0e48Q3 = q3();
        if (c0e48Q3 != null && (player = c0e48Q3.getPlayer()) != null) {
            player.skipNextSeek(true);
        }
        C0E48 c0e48Q32 = q3();
        if (c0e48Q32 == null || (iNLEMediaSessionF1 = c0e48Q32.f1()) == null || (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) == null) {
            return;
        }
        mediaSettingApi.setLoopPlay(false);
    }

    public final void o4() {
        wi0();
        this.LLJJJJLIIL.LJIIJ(Boolean.TRUE);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC353240Dt4 interfaceC353240Dt4Ie;
        super.onDestroy();
        SurfaceView value = JY0().ge().getValue();
        if (value != null) {
            C1447470nlp.LIZIZ(value, C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
        }
        K4().dK2(null);
        MessageQueue.IdleHandler idleHandler = this.LLLIZZ;
        if (idleHandler != null) {
            Looper.myQueue().removeIdleHandler(idleHandler);
        }
        C0E48 c0e48Q3 = q3();
        if (c0e48Q3 == null || (interfaceC353240Dt4Ie = c0e48Q3.Ie()) == null) {
            return;
        }
        interfaceC353240Dt4Ie.LIZ();
    }

    public final void y7() {
        C0EY2 c0ey2K5 = k5();
        if (c0ey2K5 != null) {
            c0ey2K5.FJ1(null);
        }
    }

    public C560530Lyd<Unit> E5() {
        return this.LLJJJJ;
    }

    public C560530Lyd<Boolean> H5() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC377540ErA
    public LiveEvent<Unit> JY() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC377540ErA
    public C385670FAf<Boolean> LLL() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC377540ErA
    public LiveEvent<Unit> Nd2() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC377540ErA
    public /* bridge */ /* synthetic */ LiveEvent Pu1() {
        return this.LLJJJIL;
    }

    public C560530Lyd<Pair<EnumC377550ErB, Float>> R5() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC377540ErA
    public LiveEvent<Unit> Wz() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC377540ErA
    public /* bridge */ /* synthetic */ LiveEvent YE1() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC377540ErA
    public LiveEvent<Unit> fY() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLIZ;
    }

    public final C19A3 getParentScene() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC377540ErA
    public LiveEvent<Unit> no2() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C372140EiS> o2() {
        return this.LLLLIIL;
    }

    @Override // X.InterfaceC377540ErA
    public /* bridge */ /* synthetic */ LiveEvent on0() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC377540ErA
    public LiveEvent<Unit> rD() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC377540ErA
    public LiveEvent<Boolean> s70() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C372350Ein> w2() {
        return this.LLLLIILL;
    }

    private final void o8(boolean z) {
        i3(new AwS20S0010000_5(z, 38));
        C354270Duj.LIZ(this.LLJ, new AwS549S0100000_5(this, 875));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b3 A[EDGE_INSN: B:136:0x02b3->B:107:0x02b3 BREAK  A[LOOP:0: B:103:0x029d->B:137:?]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0268 A[PHI: r11
      0x0268: PHI (r11v5 int) = (r11v3 int), (r11v6 int) binds: [B:86:0x0264, B:71:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027d A[PHI: r11
      0x027d: PHI (r11v7 int) = (r11v0 int), (r11v8 int) binds: [B:92:0x0278, B:60:0x01d6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r8(X.C0ELJ r41) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372050EiJ.r8(X.0ELJ):void");
    }

    public final void L7(Function0<Unit> function0) {
        JY0().cW0().observe(M5(), new AObserverS209S0100000_5(function0, 94));
    }

    @Override // X.InterfaceC377540ErA
    public boolean LLLLILI(Bundle bundle) {
        C0EC7 c0ec7;
        boolean zLLLLILI = false;
        if (bundle == null) {
            return false;
        }
        boolean z = bundle.getBoolean("is_editor_pro_record_finish_to_edit", false);
        boolean z2 = bundle.getBoolean("is_editor_pro_photo_finish_to_aigc", false);
        if (!z && !z2) {
            return false;
        }
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(N5());
        if (c1drgLJIIIZ != null && (c0ec7 = (C0EC7) c1drgLJIIIZ.LJIIL(null, C0EC7.class)) != null && (zLLLLILI = c0ec7.LLLLILI(bundle))) {
            Integer numLIZJ = C1308910kAL.LIZJ(C0EGL.LIZ(), getActivity());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                VideoEditContainerScene videoEditContainerSceneN6 = N6();
                if (videoEditContainerSceneN6 != null) {
                    videoEditContainerSceneN6.LLLLLLIL(iIntValue);
                }
                p8();
            }
        }
        return zLLLLILI;
    }

    @Override // X.InterfaceC377540ErA
    public void Tp(boolean z) {
        C0E5S c0e5s;
        if (!isShowing()) {
            return;
        }
        try {
            C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(N5());
            if (c1drgLJIIIZ != null && (c0e5s = (C0E5S) c1drgLJIIIZ.LJIIL(null, C0E5S.class)) != null) {
                c0e5s.Tp(z);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void d8(EditorProCancelData editorProCancelData) {
        C0EYP c0eypD5 = d5();
        if (c0eypD5 != null) {
            c0eypD5.iR1(editorProCancelData, false);
        }
        this.LLJJJJ.LJIIIZ(Unit.LIZ);
    }

    @Override // X.InterfaceC377540ErA
    public void onSaveInstanceState(Bundle bundle) {
        C0ELJ c0elj;
        CreativeModel creativeModel;
        VideoPublishEditModel editModel;
        EditorProDraftModel editorProDraftModel;
        if (!isShowing() || (c0elj = this.LLJZ) == null) {
            return;
        }
        if (C301790BsH.LIZ() && (editModel = c0elj.getEditModel()) != null && (editorProDraftModel = editModel.getEditorProDraftModel()) != null) {
            editorProDraftModel.nleData = C5().getEditorProDraftModel().nleData;
        }
        C786410Ut5.LJJIZ(bundle, "editor_pro_init_data", c0elj);
        bundle.putBoolean("editor_pro_restore", true);
        C786410Ut5.LJJIJL(bundle, "editor_pro_edit_model", c0elj.getEditModel());
        VideoPublishEditModel editModel2 = c0elj.getEditModel();
        if (editModel2 != null && (creativeModel = editModel2.creativeModel) != null) {
            C786410Ut5.LJJIJL(bundle, "editor_pro_creative_model", creativeModel);
        }
    }

    @Override // X.InterfaceC377540ErA
    public void qL0(boolean z) {
        i3(new AwS20S0010000_5(z, 37));
    }

    private final void Q3(C0ELJ c0elj, boolean z) {
        if (T6()) {
            ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
            FrameCacheViewModel frameCacheViewModel = (FrameCacheViewModel) C364210EPr.LIZIZ(FrameCacheViewModel.class);
            ConcurrentHashMap<C370820EgK, Bitmap> concurrentHashMap2 = C23245098x.LJ;
            AFwS191S0000000_5 aFwS191S0000000_5 = AFwS191S0000000_5.get$arr$(265);
            frameCacheViewModel.LLILZ = concurrentHashMap2;
            frameCacheViewModel.LLILZIL = aFwS191S0000000_5;
            v3();
            S6();
            XL(false, true);
            JY0().ww2().observe(this, new AObserverS170S0200000_5(c0elj, this, 15));
            return;
        }
        v3();
        i3(AFwS234S0000000_5.get$arr$(366));
        if (z) {
            I7();
        }
        JY0().ww2().observe(this, new AObserverS170S0200000_5(c0elj, this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // X.InterfaceC377540ErA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void XL(boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372050EiJ.XL(boolean, boolean):void");
    }

    @Override // X.InterfaceC377540ErA
    public void bx0(C0ELJ c0elj, boolean z) {
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        NLEModel model;
        NLEEditor nLEEditor;
        C0EU3 c0eu3 = C0EU3.LIZ;
        C0E48 c0e48Q3 = q3();
        c0eu3.getClass();
        C0EU3.LIZ(c0e48Q3, "tool_editor_pro_page_load");
        SurfaceView value2 = JY0().ge().getValue();
        if (value2 == null || (value = JY0().g().getValue()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (model = c348100DkmLIZIZ.LIZ.getModel()) == null) {
            return;
        }
        if (C301680Bs6.LIZ()) {
            nLEEditor = c348100DkmLIZIZ.LIZ;
        } else {
            nLEEditor = null;
        }
        if (!c0elj.getNeedStartEditorProImmediately()) {
            r8(c0elj);
            C0EY2 c0ey2K5 = k5();
            if (c0ey2K5 != null) {
                C0ELH c0elh = new C0ELH(model, null, C5(), c0elj, false);
                INLEMediaSession iNLEMediaSession = c348100DkmLIZIZ.LIZIZ;
                c0ey2K5.I11(c0elh, new C0EL6(nLEEditor, value2, iNLEMediaSession, Long.valueOf(iNLEMediaSession.getPlayerApi().getDuration())));
            }
        }
        v3();
        this.LLILZLL.show(N5());
        C372480Ej0 c372480Ej0N5 = N5();
        if (c372480Ej0N5.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            c372480Ej0N5.onShow();
        } else {
            c372480Ej0N5.LLJJJJJIL = true;
        }
        if (z) {
            o8(true);
        }
        this.LLJJI.LJII(Boolean.TRUE);
        C1451630nsX c1451630nsXO4 = O4();
        if (c1451630nsXO4 != null) {
            c1451630nsXO4.LIZIZ(AFwS234S0000000_5.get$arr$(367));
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_autocut_media_unchanged_after_ep", true, true)) {
            C5().getEditorProModel().setMediaUnchangedAfterEP(false);
            this.LLLJ = D5();
        }
    }

    @Override // X.InterfaceC377540ErA
    public AbstractC2217051Bpv tD0(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C2217061Bpw c2217061Bpw = this.LLJLIL;
        if (c2217061Bpw != null) {
            if (videoPublishEditModel == null) {
                videoPublishEditModel = c2217061Bpw.LIZ;
            }
            c2217061Bpw.LIZ = videoPublishEditModel;
            c2217061Bpw.LJFF = z;
            return c2217061Bpw;
        }
        if (videoPublishEditModel == null) {
            return null;
        }
        C2217061Bpw c2217061Bpw2 = new C2217061Bpw(videoPublishEditModel);
        c2217061Bpw2.LJFF = z;
        this.LLJLIL = c2217061Bpw2;
        return c2217061Bpw2;
    }

    public C372050EiJ(C19A3 c19a3, C1DRG c1drg, int i) {
        super(c1drg);
        this.LLILZLL = c19a3;
        this.LLIZ = c1drg;
        this.LLIZLLLIL = i;
        this.LLJ = 250L;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLJI = c560530Lyd;
        this.LLJIJIL = c560530Lyd;
        this.LLJILJIL = new C560530Lyd<>();
        this.LLJILJILJ = new C560530Lyd<>();
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC372160EiU.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EJ3.class, null);
        h0<Boolean> h0Var = new h0<>(Boolean.FALSE);
        this.LLJJI = h0Var;
        C560530Lyd<Unit> c560530Lyd2 = new C560530Lyd<>();
        this.LLJJIII = c560530Lyd2;
        C560530Lyd<Unit> c560530Lyd3 = new C560530Lyd<>();
        this.LLJJIJI = c560530Lyd3;
        this.LLJJIJIIJIL = h0Var;
        this.LLJJIJIL = c560530Lyd2;
        this.LLJJJ = c560530Lyd3;
        this.LLJJJIL = new C560530Lyd<>();
        this.LLJJJJ = new C560530Lyd<>();
        this.LLJJJJJIL = new C560530Lyd<>();
        this.LLJJJJLIIL = new C560530Lyd<>();
        this.LLJJL = new C560530Lyd<>();
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 871));
        this.LLJLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJLLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        this.LLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EYP.class, null);
        this.LLLF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
        this.LLLFF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLLFFI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417120mys.class, null);
        this.LLLFZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLLI = C1664770tQJ.LIZIZ(getDiContainer(), C21378018lO.class, null);
        this.LLLII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413730mtP.class, null);
        this.LLLIIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444130ngR.class, null);
        this.LLLIIIIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLLIIIL = C1664770tQJ.LIZIZ(getDiContainer(), VideoEditContainerScene.class, null);
        this.LLLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
        this.LLLIILIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1414530muh.class, null);
        this.LLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417110myr.class, null);
        this.LLLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC372120EiQ.class, null);
        this.LLLILZJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417440mzO.class, null);
        this.LLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 874));
        this.LLLLII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 876));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 873));
        this.LLLLIIL = AFwS191S0000000_5.get$arr$(264);
        this.LLLLIILL = new AwS549S0100000_5(this, 870);
    }

    public final void h8(EditorProSaveData editorProSaveData, boolean z, boolean z2) {
        InterfaceC1414530muh interfaceC1414530muhX5;
        if (!z2 && (interfaceC1414530muhX5 = x5()) != null) {
            interfaceC1414530muhX5.bK1(new C1413010msF(false, false, null, false, false, 62));
        }
        if (z) {
            C372080EiM.LIZ(C5().getEditorProDraftModel());
        }
        this.LLJJJIL.LJIIIZ(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s7(com.bytedance.ies.nle.editor_jni.NLEModel r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = X.C301790BsH.LIZ()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.C5()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel r1 = r0.editorProDraftModel
            X.0ELJ r0 = r4.LLJZ
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.getEditModel()
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = X.C1444810nhX.LIZ(r0)
        L26:
            r1.musicBuzModel = r0
            X.0ELJ r0 = r4.LLJZ
            if (r0 == 0) goto L88
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.getEditModel()
            if (r0 == 0) goto L88
            boolean r0 = r0.isRetakeVideo()
            if (r0 != r3) goto L88
            if (r6 == 0) goto L8a
            X.0EMy r0 = X.C363500EMy.LIZ
            r0.getClass()
            java.lang.String r0 = X.C363500EMy.LIZLLL
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r4.C5()
            java.lang.String r0 = X.C363500EMy.LIZLLL
            r1.setNleData(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.C5()
            com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData r0 = r0.getMultiEditVideoRecordData()
            if (r0 == 0) goto L5c
            r0.isMultiEditRetake = r2
        L5c:
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = X.C346780Die.LIZ(r5)
            if (r0 == 0) goto L97
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r1 = r0.getSlots()
            if (r1 == 0) goto L97
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L97
            java.util.Iterator r2 = r1.iterator()
        L72:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r2.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            float r1 = X.C351220Dpo.LLLLL(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto La4
            goto L72
        L88:
            if (r6 != 0) goto L5c
        L8a:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.C5()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel r0 = r0.editorProDraftModel
            r0.canUndo = r7
            goto L5c
        L95:
            r0 = 0
            goto L26
        L97:
            r0 = 368(0x170, float:5.16E-43)
            kotlin.jvm.internal.AFwS234S0000000_5 r0 = kotlin.jvm.internal.AFwS234S0000000_5.get$arr$(r0)
            boolean r0 = X.C349940Dnk.LJ(r5, r0)
            if (r0 != 0) goto La4
            r3 = 0
        La4:
            kotlin.jvm.internal.AwS6S0120000_5 r1 = new kotlin.jvm.internal.AwS6S0120000_5
            r0 = 2
            r1.<init>(r5, r6, r3, r0)
            r4.i3(r1)
            if (r6 == 0) goto Lb6
            X.0Lyd<kotlin.Unit> r1 = r4.LLJJIJI
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.LJIIJ(r0)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372050EiJ.s7(com.bytedance.ies.nle.editor_jni.NLEModel, boolean, boolean):void");
    }

    private final void W7(NLEModel nLEModel, String str, INLEMediaSession iNLEMediaSession, long j) {
        C0ELJ c0elj;
        NLEEditor nLEEditor;
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        SurfaceView value2 = JY0().ge().getValue();
        if (value2 == null || (c0elj = this.LLJZ) == null) {
            return;
        }
        if (C301680Bs6.LIZ() && (value = JY0().g().getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null) {
            nLEEditor = c348100DkmLIZIZ.LIZ;
        } else {
            nLEEditor = null;
        }
        c0elj.setMobParam(new C365920EWg(true, true, false, false, false, false));
        C0EY2 c0ey2K5 = k5();
        if (c0ey2K5 != null) {
            c0ey2K5.I11(new C0ELH(nLEModel, str, C5(), c0elj, true), new C0EL6(nLEEditor, value2, iNLEMediaSession, Long.valueOf(j), true));
        }
        C0EY2 c0ey2K52 = k5();
        if (c0ey2K52 != null) {
            c0ey2K52.Lr1(Mp4ScreenVideoLoadTimeout.CONTROL);
        }
    }

    public final void B3(boolean z, boolean z2, boolean z3, boolean z4) {
        int iN5;
        int iM6;
        NowsShootModel nowsShootModel;
        NowsExtra nowsExtra;
        int iIntValue = 0;
        if (z4) {
            o8(false);
        }
        C5().creativeModel.postPageModel.isEnterFromEPDirectly = false;
        if (!C1428470nHB.LJJLIIIJLLLLLLLZ(C5()) || ((nowsShootModel = C5().creativeModel.nowsShootModel) != null && (nowsExtra = nowsShootModel.nowsExtra) != null && nowsExtra.is9To16Ratio)) {
            iN5 = n5();
            iM6 = m6();
        } else {
            iN5 = (n5() - C578100Mls.LIZJ(getActivity())) + m6();
            iM6 = C578100Mls.LIZJ(getActivity());
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, getActivity());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        int iP6 = P6();
        c0.LIZ.n2();
        C1453160nv0 c1453160nv0LIZ = C1453170nv1.LIZ(iIntValue, iM6, iN5, iP6);
        c1453160nv0LIZ.LJIIJ = Boolean.TRUE;
        c1453160nv0LIZ.LJIIIZ = this.LLJ;
        c1453160nv0LIZ.LJIILJJIL = new C21388418n4();
        c1453160nv0LIZ.LJIILIIL = z4;
        InterfaceC1461350o8D interfaceC1461350o8DP4 = P4();
        if (interfaceC1461350o8DP4 != null) {
            interfaceC1461350o8DP4.E92();
        }
        c1453160nv0LIZ.LJIIL = new AwS1S0130000_5(z, this, z2, z3, 0);
        C1403010mc7.LIZ.getCommerceService();
        C1465270oEX.LIZ();
        c1453160nv0LIZ.LJFF = C0EN2.LIZ(C5());
        JY0().aM0(c1453160nv0LIZ);
        this.LLJJI.LJII(Boolean.FALSE);
        C0EYP c0eypD5 = d5();
        if (c0eypD5 != null) {
            c0eypD5.hg2(m6(), new AwS549S0100000_5(this, 872));
        }
        InterfaceC1413730mtP interfaceC1413730mtPV5 = v5();
        if (interfaceC1413730mtPV5 != null) {
            interfaceC1413730mtPV5.yc1();
        }
        H3();
        InterfaceC1417110myr interfaceC1417110myrF4 = F4();
        if (interfaceC1417110myrF4 != null) {
            interfaceC1417110myrF4.pE0();
        }
    }

    @Override // X.InterfaceC377540ErA
    public void Vc0(EditorProCancelData editorProCancelData, EditorProSaveData editorProSaveData, boolean z, boolean z2) {
        if (editorProCancelData != null) {
            d8(editorProCancelData);
        } else if (editorProSaveData != null) {
            h8(editorProSaveData, z, z2);
        }
    }
}
