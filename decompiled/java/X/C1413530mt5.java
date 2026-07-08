package X;

import Y.AObjectS245S0100000_22;
import Y.AObjectS305S0200000_22;
import Y.AObserverS206S0100000_2;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS122S0100000_22;
import android.view.MotionEvent;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.ReusedMusicInfo;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPerformanceImproveExperiment;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS11S1001000_22;
import kotlin.jvm.internal.AwS22S0111000_22;
import kotlin.jvm.internal.AwS260S0000000_22;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS72S1000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import nv7.c0;

/* JADX INFO: renamed from: X.0mt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413530mt5 extends i<InterfaceC1415760mwg, C1414130mu3, C1413890mtf, C1413570mt9> implements InterfaceC379610EuV, InterfaceC1415760mwg {
    public static final C1413670mtJ LLLIILIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIL;
    public static final int LLLILZ;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C1413700mtM LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public long LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public C1414660muu LLL;
    public C1414130mu3 LLLF;
    public boolean LLLFF;
    public final Function0<C1414130mu3> LLLFFI;
    public final InterfaceC497601wk LLLFZ;
    public final Set<C1412470mrN> LLLI;
    public final InterfaceC1464200oCo LLLII;
    public final long LLLIIII;
    public final List<C1412800mru> LLLIIIIL;
    public final LiveData<C1412800mru> LLLIIIL;
    public final LiveData<Boolean> LLLIIL;

    @Override // X.InterfaceC1414530muh
    public void I62(C1412800mru c1412800mru, boolean z) {
    }

    @Override // X.InterfaceC1414530muh
    public void qJ0(String str, boolean z) {
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.0mtJ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1413530mt5.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1413530mt5.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1413530mt5.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new C2217381BqS(C1413530mt5.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1413530mt5.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C1413530mt5.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C1413530mt5.class, "mixEditingMaterialDataApi", "getMixEditingMaterialDataApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingMaterialDataApi;", 0), new C2217381BqS(C1413530mt5.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0), new C2217381BqS(C1413530mt5.class, "videoPicCountHolder", "getVideoPicCountHolder()Lcom/ss/android/ugc/gamora/editor/mixediting/eventtrack/MixEditingCurrentEditModelVideoPicCountHolder;", 0), new C2217381BqS(C1413530mt5.class, "silentAutoCaptionApi", "getSilentAutoCaptionApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/SilentAutoCaptionApiComponent;", 0), new C2217381BqS(C1413530mt5.class, "mixOperationApi", "getMixOperationApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingMaterialOperationApi;", 0), new C2217381BqS(C1413530mt5.class, "mixForAiAliveApi", "getMixForAiAliveApi()Lcom/ss/android/ugc/gamora/editor/mixediting/ailive/MixEditingMaterialAiAliveApi;", 0), new C2217381BqS(C1413530mt5.class, "editorAutoSaveDraftApi", "getEditorAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0), new C2217381BqS(C1413530mt5.class, "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoEditContainerScene;", 0), new C2217381BqS(C1413530mt5.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0)};
        LLLIILIL = new Object() { // from class: X.0mtJ
        };
        LLLILZ = 8;
    }

    private final VideoEditContainerScene C5() {
        return (VideoEditContainerScene) this.LLJLLIL.getValue(this, LLLIL[13]);
    }

    private final boolean K4() {
        return ((Boolean) this.LLJL.getValue()).booleanValue();
    }

    private final void M5() {
        T4().LIZIZ(new GestureInteractItem(50, new C0FUM() { // from class: X.0mtU
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                InterfaceC377540ErA interfaceC377540ErAP4 = this.LL.P4();
                if (interfaceC377540ErAP4 != null && interfaceC377540ErAP4.isShowing()) {
                    return false;
                }
                if (this.LL.LJLILLLLZI()) {
                    this.LL.bK1(new C1413010msF(false, false, null, true, false, 54));
                    return true;
                }
                return this instanceof C1417630mzh;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                int i;
                InterfaceC377540ErA interfaceC377540ErAP4 = this.LL.P4();
                if (interfaceC377540ErAP4 != null && interfaceC377540ErAP4.isShowing()) {
                    return false;
                }
                if (motionEvent == null) {
                    return this instanceof C1417630mzh;
                }
                if (motionEvent2 == null) {
                    return this instanceof C1417630mzh;
                }
                float x = motionEvent.getX() - motionEvent2.getX();
                float y = motionEvent.getY() - motionEvent2.getY();
                if (Math.abs(x) >= Math.abs(y) && x > 0.0f) {
                    i = 1;
                } else if (Math.abs(x) >= Math.abs(y) && x < 0.0f) {
                    i = -1;
                } else {
                    i = 0;
                    if (y < 0.0f && this.LL.LJLILLLLZI()) {
                        this.LL.bK1(new C1413010msF(false, false, null, false, false, 62));
                        return true;
                    }
                }
                if (i != 0) {
                    if (this.LL.LJLILLLLZI() && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_block_horizontal_sliding_gesture", true, false)) {
                        this.LL.i3(new AwS35S0001000_22(i, 16));
                        return true;
                    }
                    if (!this.LL.LJLILLLLZI() && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_block_horizontal_sliding_gesture", true, false)) {
                        this.LL.bK1(new C1413010msF(true, false, EnumC1412690mrj.PAGE_SWIPE, false, false, 58));
                        return true;
                    }
                }
                return this instanceof C1417630mzh;
            }
        }));
    }

    private final InterfaceC559500Lwy O4() {
        return (InterfaceC559500Lwy) this.LLJLIL.getValue(this, LLLIL[12]);
    }

    private final InterfaceC1461390o8H T4() {
        return (InterfaceC1461390o8H) this.LLJJIJI.getValue(this, LLLIL[2]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLJJI.getValue(this, LLLIL[0]);
    }

    private final InterfaceC564930MDr k5() {
        return (InterfaceC564930MDr) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLIL[11]);
    }

    private final void k7() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1412930ms7(this, null), 3);
    }

    private final InterfaceC1454960nxu t5() {
        return (InterfaceC1454960nxu) this.LLJLLL.getValue(this, LLLIL[14]);
    }

    private final InterfaceC1455620nyy v5() {
        return (InterfaceC1455620nyy) this.LLJJJJLIIL.getValue(this, LLLIL[9]);
    }

    private final InterfaceC1460000o62 x5() {
        return (InterfaceC1460000o62) this.LLJJJ.getValue(this, LLLIL[5]);
    }

    public final C1412740mro D5() {
        return (C1412740mro) this.LLJJJJJIL.getValue(this, LLLIL[8]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIJIIJIL.getValue(this, LLLIL[3]);
    }

    @Override // X.InterfaceC1414530muh
    public void Jv0() {
        i3(AFwS261S0000000_22.get$arr$(193));
    }

    @Override // X.InterfaceC1414530muh
    public void Ns1() {
        ArrayList<C1412800mru> arrayList;
        C1414150mu5.LIZIZ.clear();
        C1414150mu5.LIZ = null;
        List<C1412800mru> listLIZJ = d5().j70().LIZJ();
        if (listLIZJ != null) {
            Iterator<C1412800mru> it2 = listLIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LJ = null;
            }
        }
        Iterator<C1412800mru> it3 = T2().LJ.iterator();
        while (it3.hasNext()) {
            it3.next().LJ = null;
        }
        C1414130mu3 c1414130mu3 = this.LLLF;
        if (c1414130mu3 == null || (arrayList = c1414130mu3.LLLII) == null) {
            return;
        }
        Iterator<C1412800mru> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            it4.next().LJ = null;
        }
    }

    @Override // X.InterfaceC1414530muh
    public void OH1() {
        if (this.LLJJ.LIZ && !this.LLLFF && C0C0E.LIZ()) {
            InterfaceC1453430nvR interfaceC1453430nvR = (InterfaceC1453430nvR) getDiContainer().LJIIL(null, InterfaceC1453430nvR.class);
            if (interfaceC1453430nvR != null) {
                interfaceC1453430nvR.Fv(false);
            }
            M5();
            this.LLLFF = true;
            C201955140j.LIZJ(C0MJ8.LIZIZ, "VideoMixEditingMaterialComponent gesture init");
        }
        show();
    }

    public final InterfaceC377540ErA P4() {
        return (InterfaceC377540ErA) this.LLJJIJIL.getValue(this, LLLIL[4]);
    }

    @Override // X.InterfaceC1414530muh
    public void S72() {
        i3(AFwS261S0000000_22.get$arr$(198));
    }

    public final InterfaceC1413540mt6 Z4() {
        return (InterfaceC1413540mt6) this.LLJJJJ.getValue(this, LLLIL[7]);
    }

    public final InterfaceC1413730mtP d5() {
        return (InterfaceC1413730mtP) this.LLJJJIL.getValue(this, LLLIL[6]);
    }

    @Override // X.InterfaceC1414530muh
    public boolean fe0() {
        C1414130mu3 c1414130mu3 = this.LLLF;
        if (c1414130mu3 != null) {
            return this.LLJILJILJ.isAdded(c1414130mu3);
        }
        return false;
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJIII.getValue(this, LLLIL[1]);
    }

    public final InterfaceC1413600mtC n5() {
        return (InterfaceC1413600mtC) this.LLJJL.getValue(this, LLLIL[10]);
    }

    @Override // X.InterfaceC1414530muh
    public List<C1412800mru> nx2() {
        ArrayList<C1412800mru> arrayList;
        C1414130mu3 c1414130mu3 = this.LLLF;
        return (c1414130mu3 == null || (arrayList = c1414130mu3.LLLII) == null) ? C13BV.INSTANCE : arrayList;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1413890mtf> o2() {
        return AFwS210S0000000_22.get$arr$(220);
    }

    @Override // X.InterfaceC1414530muh
    public int qr() {
        C1414130mu3 c1414130mu3 = this.LLLF;
        if (c1414130mu3 != null) {
            return c1414130mu3.LLLI;
        }
        return 0;
    }

    @Override // X.InterfaceC1414530muh
    public void tx() {
        i3(AFwS261S0000000_22.get$arr$(188));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1413570mt9> w2() {
        return new AwS566S0100000_22(this, 649);
    }

    private final C1412800mru H4() {
        MixEditingMaterialType mixEditingMaterialType;
        C1412800mru c1412800mru = (C1412800mru) G2().LIZ(new C2217381BqS() { // from class: X.0mtD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIJJLI;
            }
        }).LIZJ();
        if (c1412800mru == null || (mixEditingMaterialType = c1412800mru.LIZ) == MixEditingMaterialType.UNKNOWN_TYPE || mixEditingMaterialType == MixEditingMaterialType.CANCEL_TYPE) {
            return null;
        }
        return c1412800mru;
    }

    private final void H5() {
        m6();
        D5().LIZIZ(getEditModel());
    }

    private final void N5() {
        LiveData<Boolean> liveDataNz2;
        LiveData<Unit> liveDataXO;
        LiveData<Boolean> liveDataRJ0;
        C0ETY c0ety;
        Class<InterfaceC1413730mtP> cls;
        AwS601S0100000_22 awS601S0100000_22;
        InterfaceC1454960nxu interfaceC1454960nxuT5;
        MutableLiveData mutableLiveDataKr;
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1419190n2D.class, new AwS601S0100000_22(this, 433));
        } else {
            InterfaceC1419190n2D interfaceC1419190n2D = (InterfaceC1419190n2D) getDiContainer().LJIIL(null, InterfaceC1419190n2D.class);
            if (interfaceC1419190n2D != null && (liveDataRJ0 = interfaceC1419190n2D.rJ0()) != null) {
                liveDataRJ0.observe(this, new AObserverS225S0100000_22(this, 93));
            }
            InterfaceC1419190n2D interfaceC1419190n2D2 = (InterfaceC1419190n2D) getDiContainer().LJIIL(null, InterfaceC1419190n2D.class);
            if (interfaceC1419190n2D2 != null && (liveDataXO = interfaceC1419190n2D2.xO()) != null) {
                liveDataXO.observe(this, new AObserverS225S0100000_22(this, 94));
            }
            InterfaceC1419190n2D interfaceC1419190n2D3 = (InterfaceC1419190n2D) getDiContainer().LJIIL(null, InterfaceC1419190n2D.class);
            if (interfaceC1419190n2D3 != null && (liveDataNz2 = interfaceC1419190n2D3.nz2()) != null) {
                liveDataNz2.observe(this, new AObserverS225S0100000_22(this, 95));
            }
        }
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS601S0100000_22(this, 434));
        C1DRG diContainer = getDiContainer();
        VideoPublishEditModel editModel = getEditModel();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC1413730mtP.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 431);
        } else {
            if (!C365940EWi.LIZLLL(editModel)) {
                ((InterfaceC1413730mtP) ((C05YF) diContainer.LJII(InterfaceC1413730mtP.class, null))).lN0().LIZ(this, C1413580mtA.LL);
                interfaceC1454960nxuT5 = t5();
                if (interfaceC1454960nxuT5 != null || (mutableLiveDataKr = interfaceC1454960nxuT5.kr()) == null) {
                }
                mutableLiveDataKr.observe(this, new AObjectS245S0100000_22(this, 165));
                return;
            }
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC1413730mtP.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 432);
        }
        c0ety.Sd(cls, awS601S0100000_22);
        interfaceC1454960nxuT5 = t5();
        if (interfaceC1454960nxuT5 != null) {
        }
    }

    private final void m6() {
        NLEEditor nLEEditor;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            if (c348100DkmLIZIZ != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
                nLEEditor.setListener(new NLEEditorListener() { // from class: X.0mtB
                    @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
                    public final void onChanged() {
                        InterfaceC1413600mtC interfaceC1413600mtCN5 = this.LIZ.n5();
                        if (interfaceC1413600mtCN5 != null) {
                            interfaceC1413600mtCN5.sU();
                        }
                    }
                });
            }
            value.df(this.LLLII);
        }
    }

    @Override // X.InterfaceC1414530muh
    public C1412800mru LJIL() {
        return H4();
    }

    @Override // X.InterfaceC1414530muh
    public boolean LJLILLLLZI() {
        return Intrinsics.LJFF(T2().LIZIZ, Boolean.TRUE);
    }

    public final boolean d7() {
        return (u4.LJJZ(getEditModel()) || v5() == null || !C1416310mxZ.LJIIIZ(getEditModel())) ? false : true;
    }

    @Override // X.InterfaceC1414530muh
    public C1412800mru m11() {
        return H4();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        C0ETY c0ety;
        Class<InterfaceC1453430nvR> cls;
        AwS260S0000000_22 awS260S0000000_22;
        InterfaceC377540ErA interfaceC377540ErAP4;
        super.onCreate();
        ReusedMusicInfo reusedMusicInfo = null;
        if (this.LLJJ.LIZ && C0C0E.LIZ()) {
            C201955140j.LIZJ(C0MJ8.LIZIZ, "VideoMixEditingMaterialComponent delay gesture init");
        } else {
            C1DRG diContainer = getDiContainer();
            VideoPublishEditModel editModel = getEditModel();
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
                c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
                cls = InterfaceC1453430nvR.class;
                awS260S0000000_22 = new AwS260S0000000_22(14);
            } else if (C365940EWi.LIZLLL(editModel)) {
                c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
                cls = InterfaceC1453430nvR.class;
                awS260S0000000_22 = new AwS260S0000000_22(15);
            } else {
                InterfaceC1453430nvR interfaceC1453430nvR = (InterfaceC1453430nvR) ((C05YF) diContainer.LJIIL(null, InterfaceC1453430nvR.class));
                if (interfaceC1453430nvR != null) {
                    interfaceC1453430nvR.Fv(false);
                }
                M5();
                this.LLLFF = true;
            }
            c0ety.Sd(cls, awS260S0000000_22);
            M5();
            this.LLLFF = true;
        }
        N5();
        H5();
        Jv0();
        InterfaceC1413600mtC interfaceC1413600mtCN5 = n5();
        this.LLL = interfaceC1413600mtCN5 != null ? interfaceC1413600mtCN5.y41() : null;
        VideoPublishEditModel editModel2 = getEditModel();
        CreativeModel creativeModel = editModel2.creativeModel;
        MusicBuzModel musicBuzModel = creativeModel.musicBuzModel;
        if (!creativeModel.draftInfoModel.isDraft) {
            MixEditingModel mixEditingModel = creativeModel.mixEditingModel;
            if (C123100dR.LIZ(musicBuzModel.musicPath) && musicBuzModel.music != null) {
                reusedMusicInfo = new ReusedMusicInfo(C1429680nJ8.LIZJ(musicBuzModel), editModel2.getMusicOriginWithCheck());
            }
            mixEditingModel.reusedMusicInfo = reusedMusicInfo;
        }
        if (!u4.LJJZ(getEditModel()) || (((interfaceC377540ErAP4 = P4()) != null && interfaceC377540ErAP4.isShowing()) || getEditModel().isFromRestoreRecover())) {
            i3(AFwS261S0000000_22.get$arr$(192));
        } else {
            be(false);
            i3(AFwS261S0000000_22.get$arr$(190));
        }
        if (C1414940mvM.LJ(getEditModel())) {
            C579830Mof.LIZIZ(getDiContainer(), InterfaceC1414530muh.class, AFwS261S0000000_22.get$arr$(195));
        }
        if (this.LLJJ.LIZ) {
            hide();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC1452170ntP value;
        super.onDestroy();
        if (C299990BpN.LIZ() && (value = JY0().g().getValue()) != null) {
            value.Gf(this.LLLII);
        }
        C2296808zG.LIZJ(this.LLLFZ, null);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent && C0MSC.LIZ(getEditModel())) {
            LifecycleOwnerExtensionsKt.LIZIZ(this, 16L, new ARunnableS122S0100000_22(this, 66));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        C1412800mru c1412800mru;
        super.onStop();
        if (!LJLILLLLZI() || (c1412800mru = (C1412800mru) G2().LIZ(new C2217381BqS() { // from class: X.0mtE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIJJLI;
            }
        }).LIZJ()) == null) {
            return;
        }
        Pair<Integer, Integer> pairLIZ = D5().LIZ();
        C1412440mrK c1412440mrK = C1412440mrK.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(pairLIZ, (Pair<Integer, Integer>) 647);
        c1412440mrK.getClass();
        C1412440mrK.LJFF(editModel, c1412800mru, awS566S0100000_22);
        C1412440mrK.LJIIIIZZ(getEditModel(), c1412800mru, new AwS566S0100000_22(pairLIZ, (Pair<Integer, Integer>) 648));
    }

    @Override // ge.i
    public Function0<C1414130mu3> E3() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC1415760mwg
    public LiveData<Boolean> Gn0() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC1415760mwg
    public LiveData<C1412800mru> Ns2() {
        return this.LLLIIIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1414530muh
    public void hJ() {
        hide();
    }

    private final boolean J6(C1413010msF c1413010msF) {
        if (this.LLJZIJLIL && K4()) {
            EnumC1412690mrj enumC1412690mrj = c1413010msF.LIZJ;
            if ((enumC1412690mrj == EnumC1412690mrj.PAGE_SWIPE || enumC1412690mrj == EnumC1412690mrj.BOTTOM_BUTTON) && !C565160MEo.LIZJ(getEditModel())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final void T6(String str) {
        C201955140j.LIZLLL(C0MJ8.LIZIZ, "VideoMixEditingMaterialComponent", str);
    }

    @Override // X.InterfaceC1414530muh
    public void Bd(int i) {
        if (i != 0) {
            i3(new AwS35S0001000_22(i, 17));
            return;
        }
        if (this.LLJZ) {
            return;
        }
        this.LLJZ = true;
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        if (c1660590tJZ == null) {
            return;
        }
        i3(new AwS35S0001000_22(c1660590tJZ.LIZIZ() + C1660590tJZ.LJFF(), 18));
    }

    public final void F4(Function1<? super Boolean, Unit> function1) {
        LiveData<Boolean> liveDataYS0;
        if (!d7()) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        InterfaceC1455620nyy interfaceC1455620nyyV5 = v5();
        if (interfaceC1455620nyyV5 != null && (liveDataYS0 = interfaceC1455620nyyV5.yS0()) != null) {
            C0EHK.LJIIJ(liveDataYS0, this, new AObserverS206S0100000_2(function1, 6));
        }
    }

    @Override // X.InterfaceC1414530muh
    public void F92(C1412800mru c1412800mru) {
        i3(new AwS601S0100000_22(c1412800mru, 435));
    }

    public final void K6(C1412800mru c1412800mru) {
        MixEditingMaterialType mixEditingMaterialType;
        C1413070msL c1413070msL;
        AbstractC1412880ms2 abstractC1412880ms2;
        String strLIZ;
        if (c1412800mru != null) {
            mixEditingMaterialType = c1412800mru.LIZ;
        } else {
            mixEditingMaterialType = null;
        }
        if (mixEditingMaterialType == MixEditingMaterialType.EFFECT_TYPE && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_mix_editing_effect_music_recommend", true, false)) {
            if ((c1412800mru == null || (abstractC1412880ms2 = c1412800mru.LJ) == null || (strLIZ = abstractC1412880ms2.LIZ()) == null || strLIZ.length() == 0) && MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel) == null) {
                AbstractC1412880ms2 abstractC1412880ms22 = c1412800mru.LJ;
                if ((abstractC1412880ms22 instanceof C1413070msL) && (c1413070msL = (C1413070msL) abstractC1412880ms22) != null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1413100msO(c1413070msL, this, c1412800mru, null), 2);
                }
            }
        }
    }

    public final void L6(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shown: ");
        sbLIZ.append(z);
        T6(C2188811AlT.LIZIZ(sbLIZ));
        d5().j70().LIZ(this, new AObjectS245S0100000_22(this, 164));
    }

    @Override // X.InterfaceC1414530muh
    public void M81(String str) {
        C23250099c.LIZLLL(this.LLLFZ, null, null, new C1412910ms5(this, str, null), 3);
    }

    @Override // X.InterfaceC1414530muh
    public void N91(List<C1412800mru> list) {
        P6(list);
    }

    public final void P6(List<C1412800mru> list) {
        int size = list.size();
        MixEditingPerformanceImproveExperiment.LIZ.getClass();
        Iterator<Integer> it2 = C13LZ.LJIILJJIL(0, Math.min(size, MixEditingPerformanceImproveExperiment.LIZ().firstPredownloadCount)).iterator();
        while (((C531650Kt9) it2).LLILLL) {
            int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
            o7((C1412800mru) ListProtector.get(list, iNextInt), iNextInt);
        }
    }

    @Override // X.InterfaceC1414530muh
    public void Rn1(boolean z) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_effect_template_mutually_exclusive", true, false)) {
            return;
        }
        if (!C0EYU.LIZ(JY0().g().getValue(), getEditModel())) {
            return;
        }
        C1414450muZ.LIZIZ(JY0().g().getValue(), getEditModel());
        InterfaceC1413600mtC interfaceC1413600mtCN5 = n5();
        if (interfaceC1413600mtCN5 != null) {
            interfaceC1413600mtCN5.DV(new C1413690mtL(z));
        }
    }

    @Override // X.InterfaceC1414530muh
    public Integer UF2(C1412800mru c1412800mru) {
        ArrayList<C1412800mru> arrayList;
        C1414130mu3 c1414130mu3 = this.LLLF;
        if (c1414130mu3 != null && (arrayList = c1414130mu3.LLLII) != null) {
            return Integer.valueOf(arrayList.indexOf(c1412800mru));
        }
        return null;
    }

    public final void W6(int i) {
        String asset_id;
        C1412860ms0 c1412860ms0LIZ;
        MixEditingPerformanceImproveExperiment.LIZ.getClass();
        if (MixEditingPerformanceImproveExperiment.LIZ().enableCancellation) {
            ArrayList arrayList = new ArrayList();
            C1412800mru c1412800mruH4 = H4();
            for (C1412800mru c1412800mru : this.LLLIIIIL) {
                if (C1412830mrx.LIZ(c1412800mru)) {
                    Asset asset = c1412800mru.LIZLLL;
                    String strLIZIZ = null;
                    if (asset != null) {
                        asset_id = asset.getAsset_id();
                    } else {
                        asset_id = null;
                    }
                    if (c1412800mruH4 != null) {
                        strLIZIZ = c1412800mruH4.LIZIZ();
                    }
                    if (!Intrinsics.LJFF(asset_id, strLIZIZ)) {
                        int iAbs = Math.abs(T2().LJ.indexOf(c1412800mru) - i);
                        MixEditingPerformanceImproveExperiment.LIZ.getClass();
                        if (iAbs >= MixEditingPerformanceImproveExperiment.LIZ().farAwayThreshold && (c1412860ms0LIZ = c1412800mru.LIZ()) != null) {
                            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("scrollingOnCenterOf center=");
                            sbLIZ.append(i);
                            sbLIZ.append(", cancel Asset(");
                            sbLIZ.append(c1412860ms0LIZ.LIZ.getTitle());
                            sbLIZ.append(", ");
                            sbLIZ.append(c1412860ms0LIZ.LIZ.getAsset_id());
                            sbLIZ.append(')');
                            C201955140j.LIZLLL(c0mj8, "MixAssetDownloader", C2188811AlT.LIZIZ(sbLIZ));
                            ((InterfaceC1416020mx6) d5().qm1().LJIIZILJ.getValue()).LIZIZ(c1412860ms0LIZ);
                            arrayList.add(c1412800mru);
                        }
                    }
                }
            }
            C1414450muZ.LJFF(this.LLLIIIIL, new AwS601S0100000_22(arrayList, (List<CreateAnchorInfo>) 436));
        }
    }

    @Override // X.InterfaceC1414530muh
    public void ZD2(boolean z) {
        Gn0().setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019a  */
    @Override // X.InterfaceC1414530muh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bK1(X.C1413010msF r18) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1413530mt5.bK1(X.0msF):void");
    }

    @Override // X.InterfaceC1414530muh
    public void be(boolean z) {
        i3(new AwS35S0010000_22(z, 23));
    }

    @Override // X.InterfaceC1414530muh
    public void hP0(C1412800mru c1412800mru) {
        this.LLLIIIIL.add(c1412800mru);
    }

    @Override // X.InterfaceC1415760mwg
    public void i01(int i) {
        i3(new AwS35S0001000_22(i, 19));
    }

    @Override // X.InterfaceC1414530muh
    public boolean mR1(String str) {
        C1414130mu3 c1414130mu3 = this.LLLF;
        if (c1414130mu3 == null || !c1414130mu3.LLLZIIL(str)) {
            return false;
        }
        return true;
    }

    public final void n7(InterfaceC1460000o62 interfaceC1460000o62) {
        interfaceC1460000o62.Py1().observe(this, new AObjectS245S0100000_22(this, 163));
        interfaceC1460000o62.ww().observe(this, new AObjectS305S0200000_22(interfaceC1460000o62, this, 14));
    }

    @Override // X.InterfaceC1414530muh
    public C1412800mru pL(int i) {
        C1414130mu3 c1414130mu3 = this.LLLF;
        if (c1414130mu3 != null) {
            return c1414130mu3.LLLLLLZZ.LIZ.LLLFZ.LLLFZ(i);
        }
        return null;
    }

    @Override // X.InterfaceC1414530muh
    public void sD1(String str) {
        i3(new AwS72S1000000_22(str, 7));
    }

    @Override // X.InterfaceC1414530muh
    public void tC(boolean z) {
        i3(new AwS35S0010000_22(z, 24));
        InterfaceC564930MDr interfaceC564930MDrK5 = k5();
        if (interfaceC564930MDrK5 != null) {
            interfaceC564930MDrK5.LH(z);
        }
        if (!z) {
            T6("VideoMixEditingMaterialComponent -> notifyPanelDataLoadResult: failed; fetchAllPanelDataSucceed = false");
        }
    }

    private final void E5(boolean z, boolean z2) {
        String str;
        long jCurrentTimeMillis;
        boolean zLJFF;
        LiveData<Boolean> liveDataPy1;
        if (((Boolean) G2().LIZ(new C2217381BqS() { // from class: X.0mt8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1413890mtf) obj).LJIILLIIL);
            }
        }).LIZJ()).booleanValue()) {
            return;
        }
        i3(AFwS261S0000000_22.get$arr$(191));
        InterfaceC1413600mtC interfaceC1413600mtCN5 = n5();
        if (interfaceC1413600mtCN5 != null) {
            interfaceC1413600mtCN5.AO1(null);
        }
        if (!this.LLJLILLLLZIIL && this.LLJZ) {
            InterfaceC1455610nyx interfaceC1455610nyx = (InterfaceC1455610nyx) findReadyComponent(this, InterfaceC1460000o62.class);
            if (interfaceC1455610nyx != null && (liveDataPy1 = interfaceC1455610nyx.Py1()) != null) {
                zLJFF = Intrinsics.LJFF(liveDataPy1.getValue(), Boolean.FALSE);
            } else {
                zLJFF = false;
            }
            be(!zLJFF);
            if (!K4()) {
                C1414930mvL c1414930mvL = C1414930mvL.LIZ;
                VideoPublishEditModel editModel = getEditModel();
                c1414930mvL.getClass();
                if (C1414930mvL.LIZIZ(editModel)) {
                    bK1(new C1413010msF(true, true, EnumC1412690mrj.AUTO_SHOW, false, false, 24));
                }
            }
        }
        if (!z) {
            i3(AFwS261S0000000_22.get$arr$(194));
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_sound_sync_edit_loading_style", true) != 3 && !z2) {
                C1389880mGw c1389880mGw = new C1389880mGw(getActivity());
                c1389880mGw.LJIIIIZZ(2131848633);
                c1389880mGw.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
                c1389880mGw.LJIIJ();
            }
        }
        if (this.LLJLILLLLZIIL) {
            Jv0();
            if (z) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else if (z2) {
                str = "2";
            } else {
                str = "1";
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("music_id", C1429680nJ8.LIZJ(getEditModel().creativeModel.musicBuzModel));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(getEditModel()));
            c0lab.LJ("shoot_way", getEditModel().mShootWay);
            c0lab.LJ("creation_id", getEditModel().getCreationId());
            c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            if (this.LLJLL > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLL;
            } else {
                jCurrentTimeMillis = -1;
            }
            c0lab.LIZIZ(jCurrentTimeMillis, "duration");
            C20684815ws.LJIILLIIL("edit_default_sound_sync_loading_dismiss", c0lab.LIZ);
        }
    }

    public static final void R5(C1413530mt5 c1413530mt5, InterfaceC1419190n2D interfaceC1419190n2D) {
        interfaceC1419190n2D.rJ0().observe(c1413530mt5, new AObserverS225S0100000_22(c1413530mt5, 96));
        interfaceC1419190n2D.xO().observe(c1413530mt5, new AObserverS225S0100000_22(c1413530mt5, 97));
        interfaceC1419190n2D.nz2().observe(c1413530mt5, new AObserverS225S0100000_22(c1413530mt5, 98));
    }

    public static final void S5(C1413530mt5 c1413530mt5, Unit unit) {
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoMixEditingMaterialComponent observe cancelDefaultMusicSyncEvent: ");
        sbLIZ.append(unit);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        c1413530mt5.E5(false, true);
    }

    public static final void U5(C1413530mt5 c1413530mt5, boolean z) {
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoMixEditingMaterialComponent observe defaultMusicSyncFinishEvent: ");
        sbLIZ.append(z);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        c1413530mt5.E5(z, false);
    }

    public static final void d6(C1413530mt5 c1413530mt5, boolean z) {
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoMixEditingMaterialComponent observe startMusicSyncEvent: ");
        sbLIZ.append(z);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        if (z && c1413530mt5.LLJLILLLLZIIL) {
            c1413530mt5.k7();
            c1413530mt5.i3(AFwS261S0000000_22.get$arr$(196));
            c1413530mt5.LLJLL = System.currentTimeMillis();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("music_id", C1429680nJ8.LIZJ(c1413530mt5.getEditModel().creativeModel.musicBuzModel));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(c1413530mt5.getEditModel()));
            c0lab.LJ("shoot_way", c1413530mt5.getEditModel().mShootWay);
            c0lab.LJ("creation_id", c1413530mt5.getEditModel().getCreationId());
            C20684815ws.LJIILLIIL("edit_default_sound_sync_loading_show", c0lab.LIZ);
        }
    }

    private final void o7(C1412800mru c1412800mru, int i) {
        if (C0CA5.LIZ()) {
            return;
        }
        C1430405io.LIZ.getClass();
        if (((Number) C1430405io.LIZIZ.getValue()).longValue() > 0) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1430505ip(this, c1412800mru, i, null), 3);
        } else {
            C201955140j.LIZLLL(C0MJ8.LIZIZ, "a21740", "no limit, let's preload");
            N6(c1412800mru, i);
        }
    }

    @Override // X.InterfaceC1414530muh
    public void EL0(int i, int i2) {
        C23250099c.LIZLLL(this.LLLFZ, null, null, new C1412920ms6(this, i, null), 3);
    }

    @Override // X.InterfaceC1414530muh
    public Pair<Integer, C1412800mru> Hc1(String str, int i) {
        C1414130mu3 c1414130mu3 = this.LLLF;
        if (c1414130mu3 != null) {
            return c1414130mu3.LLLLLLZ(i, str);
        }
        return null;
    }

    public final void N6(final C1412800mru c1412800mru, int i) {
        C1412860ms0 c1412860ms0LIZ = c1412800mru.LIZ();
        if ((c1412860ms0LIZ != null && c1412860ms0LIZ.LIZIZ != null) || this.LLLIIIIL.contains(c1412800mru)) {
            return;
        }
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadNeighbors position=");
        sbLIZ.append(i);
        sbLIZ.append(", Asset(");
        sbLIZ.append(c1412800mru.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(c1412800mru.LIZIZ());
        sbLIZ.append(')');
        C201955140j.LIZLLL(c0mj8, "MixAssetDownloader", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLIIIIL.add(c1412800mru);
        C1412860ms0 c1412860ms0LIZ2 = c1412800mru.LIZ();
        if (c1412860ms0LIZ2 == null) {
            return;
        }
        d5().qm1().LIZJ(c1412860ms0LIZ2, false, new InterfaceC1437705jz<C1412860ms0>() { // from class: X.05ir
            @Override // X.InterfaceC1437705jz
            public final void onProgress(int i2) {
            }

            @Override // X.InterfaceC1437705jz
            public final void LIZ(Exception exc) {
                C1413530mt5 c1413530mt5 = this.LIZ;
                C23250099c.LIZLLL(c1413530mt5.LLLFZ, null, null, new C1430605iq(c1413530mt5, c1412800mru, null), 3);
            }

            @Override // X.InterfaceC1437705jz
            public final void LIZIZ(C1412860ms0 c1412860ms0, boolean z) {
                C1413530mt5 c1413530mt5 = this.LIZ;
                C23250099c.LIZLLL(c1413530mt5.LLLFZ, null, null, new C1412850mrz(c1412860ms0, c1413530mt5, c1412800mru, null), 3);
            }
        });
    }

    public final void S6(List<C1412800mru> list, int i) {
        MixEditingPerformanceImproveExperiment.LIZ.getClass();
        Iterator<Integer> it2 = new IntRange(i - MixEditingPerformanceImproveExperiment.LIZ().leadingCount, MixEditingPerformanceImproveExperiment.LIZ().trailCount + i).iterator();
        while (((C531650Kt9) it2).LLILLL) {
            int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
            C1412800mru c1412800mru = (C1412800mru) C13LP.LJJJLZIJ(iNextInt, list);
            if (c1412800mru != null && iNextInt != i && c1412800mru.LJ == null && C1412830mrx.LIZ(c1412800mru)) {
                o7(c1412800mru, iNextInt);
            }
        }
    }

    @Override // X.InterfaceC1415760mwg
    public void W82(String str, String str2) {
        C1412800mru c1412800mruH4 = H4();
        if (Intrinsics.LJFF("music_clear_from_capsule", str2)) {
            getEditModel().creativeModel.musicBuzModel.isMusicFromAutoEdit = false;
            C1414660muu c1414660muu = this.LLL;
            if (c1414660muu != null) {
                c1414660muu.LJ = null;
                C1412870ms1.LIZ.getClass();
                C1412870ms1.LIZLLL(c1412800mruH4, null, null);
                C201955140j.LIZLLL(C0MJ8.LIZIZ, "music_recovery", "set recovery = null");
            }
            i3(AFwS261S0000000_22.get$arr$(189));
        }
        if (str != null) {
            if (this.LLL != null) {
                C1414660muu.LIZ(getEditModel(), (InterfaceC1454960nxu) getDiContainer().LJIIL(null, InterfaceC1454960nxu.class), str, new AwS566S0100000_22(this, 645));
            }
            getEditModel().creativeModel.musicBuzModel.isMusicFromAutoEdit = false;
        }
    }

    @Override // X.InterfaceC1414530muh
    public void fS1(C1412860ms0 c1412860ms0, int i) {
        i3(new AwS601S0100000_22(c1412860ms0, 430));
    }

    @Override // X.InterfaceC1414530muh
    public void gU1(int i, String str) {
        i3(new AwS11S1001000_22(i, str, 5));
    }

    public final void u6(boolean z, boolean z2) {
        boolean z3;
        String str;
        NowsShootModel nowsShootModel;
        List<AutoCutMediaModel> list = C1417160myw.LJII(getActivity(), getEditModel(), getDiContainer(), true).LIZ;
        String str2 = getEditModel().creativeModel.mixEditingModel.firstEnterFrom;
        if (str2 == null) {
            str2 = "edit_page_mix_material";
        }
        String str3 = getEditModel().mShootWay;
        String creationId = getEditModel().getCreationId();
        boolean zIsCurrentAutoCutMode = getEditModel().isCurrentAutoCutMode();
        String strLJJIIZI = C1428470nHB.LJJIIZI(getEditModel());
        int origin = getEditModel().getOrigin();
        String musicId = getEditModel().getMusicId();
        String strLIZIZ = C1412490mrP.LIZIZ(getEditModel());
        String str4 = getEditModel().creativeModel.initialModel.dmCameraModel.enterDM;
        if (str4 == null) {
            str4 = "";
        }
        if (C1428470nHB.LJJLIIIJLLLLLLLZ(getEditModel()) && (nowsShootModel = getEditModel().creativeModel.nowsShootModel) != null && nowsShootModel.type == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        String strLIZLLL = C1403850mdT.LIZLLL(getEditModel());
        String strLJ = C1403850mdT.LJ(getEditModel());
        boolean zLIZIZ = C573570MeZ.LIZIZ(getEditModel());
        if (z) {
            str = "auto";
        } else {
            str = "click";
        }
        C1417710mzp.LJIIZILJ(list, str2, str3, creationId, zIsCurrentAutoCutMode, strLJJIIZI, origin, musicId, strLIZIZ, str4, z3, "autocut", strLIZLLL, strLJ, zLIZIZ, 0, false, null, 0, str, 0, false, false, z2, C1428470nHB.LJJJZ(getEditModel()), null, null, 108494848);
    }

    public C1413530mt5(C19A3 c19a3, C1DRG c1drg, C1413700mtM c1413700mtM) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c1413700mtM;
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1413730mtP.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), C1412740mro.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455620nyy.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413600mtC.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC564930MDr.class, null);
        this.LLJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 646));
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
        this.LLJLILLLLZIIL = C1414930mvL.LIZLLL(getEditModel());
        this.LLJLL = -1L;
        this.LLJLLIL = C1664770tQJ.LIZIZ(getDiContainer(), VideoEditContainerScene.class, null);
        this.LLJLLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
        this.LLJZIJLIL = true;
        this.LLLFFI = new AwS566S0100000_22(this, 650);
        this.LLLFZ = C2296808zG.LIZIZ();
        this.LLLI = new LinkedHashSet();
        this.LLLII = new InterfaceC1464200oCo() { // from class: X.0mt7
            @Override // X.InterfaceC1464200oCo
            public final void onCallback(int i, int i2, float f, String str) {
                InterfaceC1413600mtC interfaceC1413600mtCN5;
                if (i == 4429 && (interfaceC1413600mtCN5 = this.LL.n5()) != null) {
                    interfaceC1413600mtCN5.gJ2();
                }
            }
        };
        this.LLLIIII = 20L;
        this.LLLIIIIL = new ArrayList();
        this.LLLIIIL = new MutableLiveData();
        this.LLLIIL = new MutableLiveData();
    }

    @Override // X.InterfaceC1414530muh
    public void WL0(int i, C1412860ms0 c1412860ms0, boolean z) {
        i3(new AwS22S0111000_22(i, c1412860ms0, z, 1));
    }
}
