package X;

import Y.AObjectS241S0100000_8;
import Y.AfS177S0100000_8;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.ViewStub;
import com.bytedance.ies.nle.editor_jni.INLEExporter;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLERenderSetting;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVEEditorMode;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539980LFs extends AbstractC2255721DQs<InterfaceC576620MjU> implements InterfaceC576620MjU, InterfaceC379610EuV {
    public static final C540050LFz LLJJLIIIJLLLLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC576620MjU LLILLL = this;
    public final C11NJ LLILZ = new C11NJ();
    public final C11RK<Unit> LLILZIL = new C11RK<>();
    public final C11RK<Unit> LLILZLL = new C11RK<>();
    public final C11RK<Unit> LLIZ = new C11RK<>();
    public final C11RK<C0LDO> LLIZLLLIL = new C11RK<>();
    public final C11RK<Unit> LLJ = new C11RK<>();
    public final C11RK<Unit> LLJI;
    public final C11NZ<Unit> LLJIJIL;
    public final C11RK<Integer> LLJILJIL;
    public Boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final ShortVideoContext LLJJI;
    public final C563400M7u LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C1463860oCG LLJJIJIL;
    public C1463860oCG LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0LFz] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C539980LFs.class, "recordUIConductorApi", "getRecordUIConductorApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordUIConductorApi;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJLIIIJLLLLLLLZ = new Object() { // from class: X.0LFz
        };
        LLJLIL = 8;
    }

    public final void o2() {
        INLEPlayer playerApi;
        C1463860oCG c1463860oCG;
        INLEPlayer playerApi2;
        INLEPlayer playerApi3;
        INLEPlayer playerApi4;
        this.LLJILLL = false;
        C1463860oCG c1463860oCG2 = this.LLJJIJIL;
        if (c1463860oCG2 != null && (playerApi4 = c1463860oCG2.getPlayerApi()) != null) {
            ((C389960FQs) playerApi4).removeOnInfoListener(i3());
        }
        if (W2()) {
            C1463860oCG c1463860oCG3 = this.LLJJIJIL;
            if (((c1463860oCG3 == null || (playerApi3 = c1463860oCG3.getPlayerApi()) == null) ? null : ((C389960FQs) playerApi3).state()) == NLEPlayerState.STARTED && (c1463860oCG = this.LLJJIJIL) != null && (playerApi2 = c1463860oCG.getPlayerApi()) != null) {
                ((C389960FQs) playerApi2).stop();
            }
        }
        C1463860oCG c1463860oCG4 = this.LLJJIJIL;
        if (c1463860oCG4 != null && (playerApi = c1463860oCG4.getPlayerApi()) != null) {
            ((C389960FQs) playerApi).destroy();
        }
        this.LLJJIJIL = null;
    }

    private final C1463860oCG G2() {
        if (this.LLJJJ == null) {
            this.LLJJJ = X1(null, NLEVEEditorMode.COMPILE_ONLY);
        }
        return this.LLJJJ;
    }

    private final NLEEditor T2() {
        return (NLEEditor) this.LLJJL.getValue();
    }

    private final InterfaceC1647890sz5 m3() {
        return (InterfaceC1647890sz5) this.LLJJJIL.getValue(this, LLJL[0]);
    }

    private final boolean q3() {
        return ((Boolean) this.LLJJIJI.getValue()).booleanValue();
    }

    public final NLEEditor H2() {
        return (NLEEditor) this.LLJJJJLIIL.getValue();
    }

    @Override // X.InterfaceC576620MjU
    public C11NZ<Integer> OH0() {
        C11RK<Integer> c11rk = this.LLJILJIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final boolean W2() {
        return ((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue();
    }

    public final void Z1() {
        INLEExporter exporterApi;
        C1463860oCG c1463860oCG = this.LLJJJ;
        if (c1463860oCG != null && (exporterApi = c1463860oCG.getExporterApi()) != null) {
            ((C1463840oCE) exporterApi).destroyCompiler();
        }
        this.LLJJJ = null;
    }

    public final C0LG3 c3() {
        return (C0LG3) this.LLJJJJJIL.getValue();
    }

    @Override // X.InterfaceC576620MjU
    public float getPlayFps() {
        INLEMediaRuntime mediaRuntimeApi;
        C1463860oCG c1463860oCG = this.LLJJIJIL;
        if (c1463860oCG == null || (mediaRuntimeApi = c1463860oCG.getMediaRuntimeApi()) == null) {
            return 0.0f;
        }
        return ((C1463950oCP) mediaRuntimeApi).getPlayFps();
    }

    @Override // X.InterfaceC576620MjU
    public void h61() {
        C576730Mjf.LJIIIZ("CameraLayoutNLEComponent", "post cancel compile");
        this.LLJ.onNext(Unit.LIZ);
    }

    public final C539990LFt i3() {
        return (C539990LFt) this.LLJJJJ.getValue();
    }

    @Override // X.InterfaceC576620MjU
    public void mv0() {
        this.LLIZ.onNext(Unit.LIZ);
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        if (Intrinsics.LJFF(this.LLJILJILJ, Boolean.TRUE)) {
            aC0(true);
        }
        super.onStart();
    }

    public final void play() {
        C1463860oCG c1463860oCG = this.LLJJIJIL;
        if (c1463860oCG != null) {
            c1463860oCG.setDataSource(q3() ? T2().getModel() : H2().getModel());
            if (!this.LLJILLL) {
                ((C389960FQs) c1463860oCG.getPlayerApi()).prepare();
                this.LLJILLL = true;
            }
            if (!W2()) {
                ((C389960FQs) c1463860oCG.getPlayerApi()).play();
                ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setCanvasColor("#00000000");
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("should play: ");
            sbLIZ.append(this.LLJJ);
            C576730Mjf.LJIIIZ("CameraLayoutNLEComponent", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLJJ) {
                ((C389960FQs) c1463860oCG.getPlayerApi()).play();
                return;
            }
            C576730Mjf.LJIIIZ("CameraLayoutNLEComponent", "refreshCurrentFrame");
            if (((Boolean) C266940AdA.LIZ.getValue()).booleanValue()) {
                ((C389960FQs) c1463860oCG.getPlayerApi()).seekTime(0L);
            } else {
                ((C389960FQs) c1463860oCG.getPlayerApi()).refreshCurrentFrame();
            }
        }
    }

    @Override // X.InterfaceC576620MjU
    public void EB2() {
        H2().getModel().clearTrack();
        if (q3()) {
            T2().getModel().clearTrack();
        }
    }

    @Override // X.InterfaceC576620MjU
    public NLEModel LLZ() {
        return H2().getModel();
    }

    public final void W1() {
        INLEExporter exporterApi;
        C1463860oCG c1463860oCGG2 = G2();
        if (c1463860oCGG2 != null && (exporterApi = c1463860oCGG2.getExporterApi()) != null) {
            ((C1463840oCE) exporterApi).cancelCompile();
        }
        Z1();
        this.LLJJIII.LJ(0);
    }

    @Override // X.InterfaceC576620MjU
    public Rect dA2() {
        C0LG3 c0lg3C3 = c3();
        c0lg3C3.getClass();
        Rect rect = new Rect();
        SurfaceView surfaceView = c0lg3C3.LIZJ;
        if (surfaceView != null) {
            surfaceView.getGlobalVisibleRect(rect);
        }
        return rect;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        ViewStub viewStub;
        super.onCreate();
        C0FGC.LIZ(2);
        C1419820n3E.LIZ.LIZ();
        NLE nle = NLE.INSTANCE;
        nle.setLogger(new NLELoggerListener() { // from class: X.0LG1
            @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
            public final void onLog(LogLevel logLevel, String str) {
                int i;
                if (logLevel == null) {
                    i = -1;
                } else {
                    i = C560090Lxv.LIZ[logLevel.ordinal()];
                    if (i == 1) {
                        C823920WTu c823920WTu = C823920WTu.LIZIZ;
                        boolean z = C201955140j.LIZ;
                        return;
                    }
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                C823920WTu c823920WTu2 = C823920WTu.LIZIZ;
                                if (str == null) {
                                    str = "";
                                }
                                C201955140j.LJIIIIZZ(c823920WTu2, "CameraLayoutNLEComponent", str);
                                return;
                            }
                            return;
                        }
                        C823920WTu c823920WTu3 = C823920WTu.LIZIZ;
                        if (str == null) {
                            str = "";
                        }
                        C201955140j.LJIJJ(c823920WTu3, "CameraLayoutNLEComponent", str);
                        return;
                    }
                    C823920WTu c823920WTu4 = C823920WTu.LIZIZ;
                    if (str == null) {
                        str = "";
                    }
                    C201955140j.LJIILL(c823920WTu4, "CameraLayoutNLEComponent", str);
                    return;
                }
                C823920WTu c823920WTu5 = C823920WTu.LIZIZ;
                if (str == null) {
                    str = "";
                }
                C201955140j.LIZLLL(c823920WTu5, "CameraLayoutNLEComponent", str);
            }
        });
        nle.setLogLevel(LogLevel.LEVEL_DEBUG);
        C365090ETb.LIZIZ();
        if (C0L2Z.LIZ() && (viewStub = (ViewStub) this.LL.findViewById(R.id.sz4)) != null) {
            new C20576115fL(viewStub).LIZIZ(new AwS552S0100000_8(this, 759), new AwS552S0100000_8(this, 760));
        }
        this.LLILZ.LIZ(this.LLILZIL.LJLILLLLZI(10L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 77)));
        this.LLILZ.LIZ(this.LLIZLLLIL.LJLLL(c90(), new InterfaceC500500Jk0<Object, Object, Pair<Object, Object>>() { // from class: X.0Jjy
            @Override // X.InterfaceC500500Jk0
            public final Pair<Object, Object> apply(Object obj, Object obj2) {
                return new Pair<>(obj, obj2);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 78)));
        this.LLILZ.LIZ(this.LLJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 79)));
        this.LLILZ.LIZ(this.LLILZLL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 80)));
        this.LLILZ.LIZ(this.LLIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 81)));
        m3().Lg1().LIZ(this, new AObjectS241S0100000_8(this, 77));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        o2();
        Z1();
        this.LLILZ.dispose();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        SurfaceView surfaceView = c3().LIZJ;
        this.LLJILJILJ = Boolean.valueOf(surfaceView != null && surfaceView.getVisibility() == 0);
        aC0(false);
        super.onStop();
    }

    @Override // X.InterfaceC576620MjU
    public C11NZ<Unit> c90() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public InterfaceC576620MjU w2() {
        return this.LLILLL;
    }

    private final void E3(final C0LDL c0ldl) {
        INLEExporter exporterApi;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCompile outPhotoPath: ");
        sbLIZ.append(c0ldl.LJII);
        C576730Mjf.LJIIIZ("CameraLayoutNLEComponent", C2188811AlT.LIZIZ(sbLIZ));
        C1463860oCG c1463860oCGG2 = G2();
        if (c1463860oCGG2 != null && (exporterApi = c1463860oCGG2.getExporterApi()) != null) {
            ((C1463840oCE) exporterApi).compile(c0ldl.LJII, C576730Mjf.LJIIL(c0ldl), new INLEListenerCompile() { // from class: X.0LDQ
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileDone() {
                    c0ldl.LJIIL.invoke();
                    C01TT.LIZJ(new AwS552S0100000_8(this, 762));
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileProgress(float f) {
                    c0ldl.LJIILIIL.invoke(Float.valueOf(f));
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileError(int i, int i2, float f, String str) {
                    Function2<Integer, String, Unit> function2 = c0ldl.LJIILJJIL;
                    Integer numValueOf = Integer.valueOf(i);
                    if (str == null) {
                        str = "";
                    }
                    function2.invoke(numValueOf, str);
                    C01TT.LIZJ(new AwS552S0100000_8(this, 763));
                }
            });
        }
    }

    private final void H3(final C0LDM c0ldm) {
        INLEExporter exporterApi;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCompile outVideoPath: ");
        sbLIZ.append(c0ldm.LJII);
        sbLIZ.append(" outAudioPath: ");
        sbLIZ.append(c0ldm.LJIIIIZZ);
        C576730Mjf.LJIIIZ("CameraLayoutNLEComponent", C2188811AlT.LIZIZ(sbLIZ));
        C1463860oCG c1463860oCGG2 = G2();
        if (c1463860oCGG2 != null && (exporterApi = c1463860oCGG2.getExporterApi()) != null) {
            ((C1463840oCE) exporterApi).compile(c0ldm.LJII, c0ldm.LJIIIIZZ, C576730Mjf.LJIIL(c0ldm), new INLEListenerCompile() { // from class: X.0LDP
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileDone() {
                    c0ldm.LJIILIIL.invoke();
                    C01TT.LIZJ(new AwS552S0100000_8(this, 764));
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileProgress(float f) {
                    c0ldm.LJIILJJIL.invoke(Float.valueOf(f));
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileError(int i, int i2, float f, String str) {
                    Function2<Integer, String, Unit> function2 = c0ldm.LJIILL;
                    Integer numValueOf = Integer.valueOf(i);
                    if (str == null) {
                        str = "";
                    }
                    function2.invoke(numValueOf, str);
                    C01TT.LIZJ(new AwS552S0100000_8(this, 765));
                }
            });
        }
    }

    public final void B3(C0LDO c0ldo) {
        if (!this.LLJJIII.LIZ(1, 2)) {
            return;
        }
        if (c0ldo instanceof C0LDL) {
            E3((C0LDL) c0ldo);
        } else {
            if (!(c0ldo instanceof C0LDM)) {
                return;
            }
            H3((C0LDM) c0ldo);
        }
    }

    @Override // X.InterfaceC576620MjU
    public void TY0(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("post seek and play event: hasVideo=");
        sbLIZ.append(z);
        C576730Mjf.LJIIIZ("CameraLayoutNLEComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (W2()) {
            if (z) {
                this.LLJJ = true;
                this.LLILZLL.onNext(Unit.LIZ);
                return;
            }
            return;
        }
        this.LLILZLL.onNext(Unit.LIZ);
    }

    @Override // X.InterfaceC576620MjU
    public void aC0(boolean z) {
        int i;
        SurfaceView surfaceView = c3().LIZJ;
        if (surfaceView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLIIII(surfaceView, i);
        }
    }

    @Override // X.InterfaceC576620MjU
    public void qa2(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("post commit event: hasVideo=");
        sbLIZ.append(z);
        C576730Mjf.LJIIIZ("CameraLayoutNLEComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJ = z;
        this.LLILZIL.onNext(Unit.LIZ);
    }

    public C539980LFs(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        C11RK<Unit> c11rk = new C11RK<>();
        this.LLJI = c11rk;
        this.LLJIJIL = new C19475711Hn(c11rk);
        this.LLJILJIL = new C11RK<>();
        this.LLJJ = true;
        this.LLJJI = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
        this.LLJJIII = new C563400M7u(0);
        this.LLJJIJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(314));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(313));
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647890sz5.class, null);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 761));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 758));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 756));
        this.LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 757));
    }

    public final C1463860oCG X1(SurfaceView surfaceView, NLEVEEditorMode nLEVEEditorMode) {
        NLEEditor nLEEditorH2;
        int i;
        NLEMediaConfig nLEMediaConfigLIZLLL = C576730Mjf.LIZLLL(W2());
        if (q3() && nLEVEEditorMode == NLEVEEditorMode.PREVIEW_ONLY) {
            nLEEditorH2 = T2();
        } else {
            nLEEditorH2 = H2();
        }
        C1463860oCG c1463860oCG = new C1463860oCG(nLEMediaConfigLIZLLL, surfaceView, nLEEditorH2, false);
        ((C389960FQs) c1463860oCG.getPlayerApi()).setEditorMode(nLEVEEditorMode);
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setLoopPlay(true);
        INLEMediaSettings mediaSettingApi = c1463860oCG.getMediaSettingApi();
        if (W2() && nLEVEEditorMode == NLEVEEditorMode.PREVIEW_ONLY) {
            i = 105;
        } else {
            i = 100;
        }
        ((C1463880oCI) mediaSettingApi).setPageMode(i);
        c1463860oCG.setDataSource(nLEEditorH2.getModel());
        return c1463860oCG;
    }

    @Override // X.InterfaceC576620MjU
    public void xi2(String str, long j) {
        long j2 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(true);
        nLETrack.setStartTime(0L);
        nLETrack.setEndTime(j2);
        nLETrack.setDuration(j2);
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setStartTime(0L);
        nLETrackSlot.setEndTime(j2);
        nLETrackSlot.setDuration(j2);
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(str);
        nLEResourceAV.setResourceType(NLEResType.IMAGE);
        nLESegmentVideo.setAVFile(nLEResourceAV);
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setTimeClipEnd(j2);
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        nLETrack.addSlot(nLETrackSlot);
        H2().getModel().addTrack(nLETrack);
        if (q3()) {
            T2().getModel().addTrack(NLETrack.dynamicCast(nLETrack.deepClone(true)));
            T2().commit();
        }
        qa2(false);
    }

    public final void v3(NLEModel nLEModel, int i, int i2) {
        NLERenderSetting nLERenderSetting = new NLERenderSetting();
        if (!W2()) {
            nLERenderSetting.setPreviewBackgroundColor(0L);
        }
        nLERenderSetting.setEnable(true);
        nLERenderSetting.setCanvasWidth(i);
        nLERenderSetting.setCanvasHeight(i2);
        nLEModel.setRenderSetting(nLERenderSetting);
        nLEModel.setCanvasRatio(i / i2);
    }

    @Override // X.InterfaceC576620MjU
    public void zi2(String str, int i, int i2, String str2, boolean z, Function0<Unit> function0, Function1<? super Float, Unit> function1, Function2<? super Integer, ? super String, Unit> function2) {
        C576730Mjf.LJIIIZ("CameraLayoutNLEComponent", "post compile event");
        this.LLJJIII.LJ(1);
        this.LLIZLLLIL.onNext(new C0LDL(str, i, i2, str2, z, function0, function1, function2));
    }

    @Override // X.InterfaceC576620MjU
    public void QJ1(String str, String str2, int i, int i2, String str3, boolean z, Function0<Unit> function0, Function1<? super Float, Unit> function1, Function2<? super Integer, ? super String, Unit> function2) {
        C576730Mjf.LJIIIZ("CameraLayoutNLEComponent", "post compile event");
        this.LLJJIII.LJ(1);
        this.LLIZLLLIL.onNext(new C0LDM(str, str2, i, i2, str3, z, function0, function1, function2));
    }
}
