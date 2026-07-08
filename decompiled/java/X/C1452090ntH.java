package X;

import X.InterfaceC1446740nke;
import Y.AObjectS240S0100000_5;
import Y.AObjectS245S0100000_22;
import Y.AObserverS209S0100000_5;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS22S0100100_22;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.services.editeffect.FetchEffectState;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.VQEvaluationConfig;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.CompileProbeViewModel;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.SingleImageCoverBitmapData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS105S1200000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ntH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1452090ntH<T extends InterfaceC1446740nke> extends C1455870nzN<T> implements InterfaceC1446740nke {
    public static final C1452530ntz Z;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] a0;
    public static final int b0;
    public final C01GW A;
    public VEPreviewMusicParams B;
    public final C01GW C;
    public final String D;
    public final boolean E;
    public boolean F;
    public final C01GW G;
    public String H;
    public String I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f163J;
    public long K;
    public final MutableLiveData<Unit> L;
    public final VEPreviewParams LLLZLL;
    public final C1449780npY LLLZLZ;
    public final C1452480ntu LLLZZ;
    public final h0<Boolean> LLLZZIL;
    public final C01GW LLZ;
    public final C01GW LLZIL;
    public final C01GW LLZILL;
    public final C01GW LLZL;
    public final C01GW LLZLI;
    public final InterfaceC1731706qJ LLZLL;
    public final InterfaceC1731706qJ LLZLLIL;
    public final InterfaceC1731706qJ LLZLLLL;
    public final InterfaceC1731706qJ LLZZ;
    public final InterfaceC1731706qJ LLZZJLIL;
    public final C01GW LLZZLLIL;
    public Surface LLZZZIL;
    public InterfaceC2177771AKx LLZZZZ;
    public final MutableLiveData<Unit> M;
    public final MutableLiveData<SwitchModePayload> N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final MutableLiveData<Boolean> f164O;
    public final MutableLiveData<Boolean> P;
    public final C560530Lyd<Unit> Q;
    public final MutableLiveData<VEPreviewMusicParams> R;
    public final MutableLiveData<Unit> S;
    public final MutableLiveData<Unit> T;
    public final MutableLiveData<Unit> U;
    public final MutableLiveData<Integer> V;
    public final LiveData<Integer> W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final MutableLiveData<Boolean> f165X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final MutableLiveData<Unit> f166Y;
    public final C01GW a;
    public final C01GW b;
    public boolean c;
    public final InterfaceC1731706qJ d;
    public String e;
    public final InterfaceC1731706qJ f;
    public final InterfaceC1731706qJ g;
    public final InterfaceC1731706qJ h;
    public final C01GW i;
    public final MutableLiveData<Unit> j;
    public final C01GW k;
    public final InterfaceC1731706qJ l;
    public FilterBean m;
    public long n;
    public long o;
    public volatile long p;
    public volatile long q;
    public volatile boolean r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public boolean x;
    public final C01GW y;
    public final C01GW z;

    private final void nd() {
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0ntz] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1452090ntH.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C13LE.LIZ.getClass();
        a0 = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1452090ntH.class, "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditContainerScene;", 0), new C2217381BqS(C1452090ntH.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0), new C2217381BqS(C1452090ntH.class, "videoSizeProvider", "getVideoSizeProvider()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", 0), new C2217381BqS(C1452090ntH.class, "aiselfApi", "getAiselfApi()Lcom/ss/android/ugc/gamora/editor/aiself/AiSelfEditEffectApi;", 0), new C2217381BqS(C1452090ntH.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C1452090ntH.class, "editPreloadTaskManager", "getEditPreloadTaskManager()Lcom/ss/android/ugc/aweme/shortvideo/edit/EditPreloadTaskManager;", 0), new C2217381BqS(C1452090ntH.class, "taskScheduler", "getTaskScheduler()Lcom/ss/android/ugc/aweme/creative/taskscheduler/scheduler/ITaskScheduler;", 0), new C2217381BqS(C1452090ntH.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1452090ntH.class, "autoCutAsyncRenderService", "getAutoCutAsyncRenderService()Lcom/ss/android/ugc/aweme/shortvideo/autocut/asyncrender/AutoCutAsyncRenderService;", 0)};
        Z = new Object() { // from class: X.0ntz
        };
        b0 = 8;
    }

    private final C1452270ntZ Bb() {
        return (C1452270ntZ) this.G.getValue();
    }

    private final C348880Dm2 Cb() {
        return (C348880Dm2) this.C.getValue();
    }

    private final InterfaceC1455850nzL Da() {
        return (InterfaceC1455850nzL) this.d.getValue(this, a0[5]);
    }

    private final void Dd() {
        this.LLLLIIIILLL.observe(this, new AObserverS225S0100000_22(this, 108));
    }

    private final InterfaceC1444130ngR LLJIJIL() {
        return (InterfaceC1444130ngR) this.LLZZ.getValue(this, a0[3]);
    }

    private final FTCEditInfoStickerViewModel Lb() {
        return (FTCEditInfoStickerViewModel) this.LLZILL.getValue();
    }

    private final IToolsVQEvaluationService Mc() {
        return (IToolsVQEvaluationService) this.A.getValue();
    }

    private final InterfaceC1452130ntL Na() {
        return (InterfaceC1452130ntL) this.LLZ.getValue();
    }

    private final FTCEditStickerViewModel Vb() {
        return (FTCEditStickerViewModel) this.LLZLI.getValue();
    }

    private final InterfaceC566060MIa oa() {
        return (InterfaceC566060MIa) this.LLZZJLIL.getValue(this, a0[4]);
    }

    private final C353920DuA oc() {
        return (C353920DuA) this.LLZL.getValue();
    }

    private final C1439740nZM pc() {
        return (C1439740nZM) this.LLZLLLL.getValue(this, a0[2]);
    }

    private final boolean pd() {
        float f = this.f163J;
        return f > 0.0f && f < 1.0f;
    }

    private final C1420050n3b ra() {
        return (C1420050n3b) this.l.getValue(this, a0[9]);
    }

    private final CompileProbeViewModel sa() {
        return (CompileProbeViewModel) this.a.getValue();
    }

    private final InterfaceC1452410ntn sc() {
        return (InterfaceC1452410ntn) this.LLZIL.getValue();
    }

    private final boolean yb() {
        return ((Boolean) this.LLZZLLIL.getValue()).booleanValue();
    }

    private final void ye() {
        StickerChallenge stickerChallengeLIZ;
        HashMap<String, AVChallenge> stickerToChallenge;
        AVChallenge aVChallenge;
        ArrayList arrayList = new ArrayList();
        ArrayList<EffectPointModel> arrayList2 = new ArrayList();
        arrayList2.addAll(dc().getEffectList());
        arrayList2.addAll(C1416310mxZ.LJJIJLIJ(dc()));
        for (EffectPointModel effectPointModel : arrayList2) {
            C1439740nZM c1439740nZMPc = pc();
            if (c1439740nZMPc == null || (stickerChallengeLIZ = c1439740nZMPc.LIZ()) == null || (stickerToChallenge = stickerChallengeLIZ.getStickerToChallenge()) == null || (aVChallenge = stickerToChallenge.get(effectPointModel.getChallenge())) == null) {
                C1439740nZM c1439740nZMPc2 = pc();
                if (c1439740nZMPc2 != null) {
                    String challenge = effectPointModel.getChallenge();
                    new C1645820svk(challenge, this).LIZ(new C364060EPc(c1439740nZMPc2, challenge));
                }
            } else if (!arrayList.contains(aVChallenge)) {
                arrayList.add(aVChallenge);
            }
        }
        C1439740nZM c1439740nZMPc3 = pc();
        if (c1439740nZMPc3 != null) {
            c1439740nZMPc3.LIZ().setEditEffectStickerChallengeList(arrayList);
        }
    }

    private final void zd() {
        this.LLLLIILL.observe(this, new AObjectS245S0100000_22(this, 175));
    }

    @Override // X.InterfaceC1446740nke
    public void De1() {
        this.L.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1446740nke
    public void Fh2() {
        this.M.setValue(Unit.LIZ);
    }

    @Override // X.C1455870nzN
    public AbstractC1452680nuE G2() {
        this.LLILZ.LJFF.LIZIZ = "TiktokEditPreviewComponent";
        final AbstractC1452680nuE abstractC1452680nuELIZ = C574110MfR.LIZ(dc().getVideoEditorType(), this.LLILZ.LJFF);
        if (!C568750MSj.LIZIZ(dc())) {
            abstractC1452680nuELIZ.LJIL = new InterfaceC1464190oCn(this) { // from class: X.0ntK
                public final /* synthetic */ C1452090ntH<T> LIZ;

                {
                    this.LIZ = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.InterfaceC1464190oCn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onRendered() {
                    /*
                        r10 = this;
                        long r7 = java.lang.System.currentTimeMillis()
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "TiktokEditPreviewComponent onRendered done "
                        r1.append(r0)
                        r1.append(r7)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                        X.C201955140j.LJIIL(r0)
                        X.0ntH<T> r0 = r10.LIZ
                        boolean r0 = r0.sg()
                        if (r0 == 0) goto L42
                        X.0ntH<T> r5 = r10.LIZ
                        long r3 = r5.n
                        r1 = 0
                        int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                        if (r0 != 0) goto L42
                        kotlin.jvm.internal.AwS43S0200100_22 r4 = new kotlin.jvm.internal.AwS43S0200100_22
                        X.0nuE r6 = r2
                        r9 = 1
                        r4.<init>(r5, r6, r7, r9)
                        X.C0CNO.LJ(r4)
                    L34:
                        X.0ntH<T> r0 = r10.LIZ
                        X.19EG r0 = r0.getActivity()
                        android.content.Context r0 = X.C786410Ut5.P3(r0)
                        X.C1688780u32.LIZ(r0)
                        return
                    L42:
                        X.0ntH<T> r1 = r10.LIZ
                        X.0nuE r0 = r2
                        X.0ntP r0 = r0.LJJ()
                        r1.Gd(r0, r7)
                        goto L34
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1452120ntK.onRendered():void");
                }
            };
        }
        return abstractC1452680nuELIZ;
    }

    @Override // X.C1455870nzN
    public boolean H4() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final VideoPublishEditContainerScene Kc() {
        return (VideoPublishEditContainerScene) this.LLZLLIL.getValue(this, a0[1]);
    }

    @Override // X.InterfaceC1446740nke
    public void RF0() {
        this.T.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1446740nke
    public void Vc2() {
        this.U.setValue(Unit.LIZ);
    }

    @Override // X.C1455870nzN
    public void W1() {
        C0CNO.LIZLLL(0L, new AwS566S0100000_22((C1452090ntH) this, 667));
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0260 A[LOOP:0: B:126:0x025a->B:128:0x0260, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0494  */
    @Override // X.C1455870nzN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int W6() {
        /*
            Method dump skipped, instruction units count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.W6():int");
    }

    public final C1456190nzt Ya() {
        return (C1456190nzt) this.f.getValue(this, a0[6]);
    }

    @Override // X.C1455870nzN
    public void Z7() {
        j jVar = C524780Ki4.LIZ;
        jVar.step(this.D, "begin prepare");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.LLLZZ.LIZ) {
            C0CNO.LIZ(C15O7.LJI, new AwS566S0100000_22((C1452090ntH) this, 668));
        } else {
            super.Z7();
        }
        T9();
        this.t = SystemClock.elapsedRealtime() - jElapsedRealtime;
        jVar.step(this.D, "end prepare");
        if (yb()) {
            return;
        }
        he();
    }

    public final VideoPublishEditModel dc() {
        return (VideoPublishEditModel) this.z.getValue();
    }

    public final VideoPublishEditModel hc() {
        return (VideoPublishEditModel) this.h.getValue(this, a0[8]);
    }

    public final AbstractC214814194y kc() {
        return (AbstractC214814194y) this.LLZLL.getValue(this, a0[0]);
    }

    public final C1453130nux mc() {
        return (C1453130nux) this.y.getValue();
    }

    @Override // X.InterfaceC1446740nke
    public void pH0() {
        this.Q.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1446740nke
    /* JADX INFO: renamed from: tb, reason: merged with bridge method [inline-methods] */
    public C356830Dyr az1() {
        return (C356830Dyr) this.i.getValue();
    }

    public final Function1<Surface, Unit> tc() {
        return (Function1) this.k.getValue();
    }

    @Override // X.InterfaceC1446740nke
    public void u90() {
        this.f166Y.setValue(Unit.LIZ);
    }

    public final InterfaceC524270KhF wc() {
        return (InterfaceC524270KhF) this.g.getValue(this, a0[7]);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    @Override // X.InterfaceC1446740nke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.effect.EffectPointModel> xl2() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.xl2():java.util.List");
    }

    private final String Ba() {
        String filterFolder;
        FilterBean filterBeanBi2 = Bi2();
        if (filterBeanBi2 == null || (filterFolder = filterBeanBi2.getFilterFolder()) == null || a0.LJJJIL(filterFolder)) {
            return null;
        }
        return filterFolder;
    }

    private final List<VEPreviewMusicParams> Be() {
        AVMusic aVMusicExtractAVMusic;
        StickerInfo stickerInfo;
        EffectLabel effectLabel;
        if ((C1399570mWZ.LIZIZ() && ((stickerInfo = dc().stickerInfo) == null || (effectLabel = stickerInfo.getEffectLabel()) == null || !C1399400mWI.LIZIZ(effectLabel))) || C1428470nHB.LJLJLJ(dc())) {
            C578010Mlj.LIZ = false;
            return null;
        }
        if (!C1458070o2v.LJFF()) {
            return null;
        }
        InterfaceC1452170ntP value = g().getValue();
        int duration = value != null ? value.getDuration() : 0;
        dc().creativeModel.musicBuzModel.videoDuration = duration;
        if (!C1458070o2v.LJ(dc().creativeModel.musicBuzModel)) {
            C1452640nuA c1452640nuA = C1452640nuA.LIZ;
            MusicBuzModel musicBuzModel = dc().creativeModel.musicBuzModel;
            boolean z = dc().creativeModel.musicBuzModel.shouldMusicLoop;
            c1452640nuA.getClass();
            C1452640nuA.LJIIIZ(musicBuzModel, z, duration);
            return null;
        }
        if (!dc().creativeModel.musicBuzModel.shouldMusicLoop || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(dc().creativeModel.musicBuzModel)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iLJJL = C1416310mxZ.LJJL(dc(), duration, null, 2);
        VEPreviewMusicParams vEPreviewMusicParams = this.B;
        int i = vEPreviewMusicParams.mOutPoint;
        int i2 = vEPreviewMusicParams.mInPoint;
        int i3 = i - i2;
        int i4 = vEPreviewMusicParams.mDuration;
        if (i3 <= 0) {
            i3 = i4 - i2;
        }
        int iMin = Math.min(i4, i3);
        if (Math.abs(iMin - iLJJL) <= 200) {
            return null;
        }
        while (iMin < iLJJL) {
            VEPreviewMusicParams vEPreviewMusicParamsXI = xI();
            arrayList.add(vEPreviewMusicParamsXI);
            C1452640nuA c1452640nuA2 = C1452640nuA.LIZ;
            AVMusic aVMusicDeepCopy = aVMusicExtractAVMusic.deepCopy();
            MusicBuzModel musicBuzModel2 = dc().creativeModel.musicBuzModel;
            c1452640nuA2.getClass();
            C1452640nuA.LIZ(musicBuzModel2, aVMusicDeepCopy);
            int i5 = vEPreviewMusicParamsXI.mOutPoint;
            int i6 = vEPreviewMusicParamsXI.mInPoint;
            int i7 = i5 - i6;
            int i8 = vEPreviewMusicParamsXI.mDuration;
            if (i7 <= 0) {
                i7 = i8 - i6;
            }
            iMin += Math.min(i8, i7);
        }
        VEPreviewMusicParams vEPreviewMusicParams2 = this.B;
        vEPreviewMusicParams2.isMusicLoop = 1;
        vEPreviewMusicParams2.musicMaxLoopDuration = iLJJL;
        C1452640nuA c1452640nuA3 = C1452640nuA.LIZ;
        MusicBuzModel musicBuzModel3 = dc().creativeModel.musicBuzModel;
        c1452640nuA3.getClass();
        C1452640nuA.LJIIIIZZ(musicBuzModel3, true, iLJJL);
        return arrayList;
    }

    private final InterfaceC376040Eok Ga() {
        return ((InterfaceC1455850nzL) getDiContainer().LJII(InterfaceC1455850nzL.class, null)).kE().LIZJ();
    }

    private final InterfaceC1453420nvQ Ka() {
        return ((InterfaceC1455850nzL) getDiContainer().LJII(InterfaceC1455850nzL.class, null)).y80().LIZJ();
    }

    private final void Nc() {
        X21().observe(this, new AObjectS245S0100000_22(this, 173));
    }

    private final InterfaceC1461650o8h Oa() {
        return ((InterfaceC1455850nzL) getDiContainer().LJII(InterfaceC1455850nzL.class, null)).Iz2().LIZJ();
    }

    private final void P9() {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        final C348100Dkm c348100DkmLIZIZ;
        final C1449780npY c1449780npY;
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null || (c1449780npY = this.LLLZLZ) == null) {
            return;
        }
        final VideoPublishEditModel videoPublishEditModelDc = dc();
        final VideoPublishEditContainerScene videoPublishEditContainerSceneKc = Kc();
        if (videoPublishEditContainerSceneKc == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        final ReplayLiveData<C0EYM> replayLiveDataDS1 = dS1();
        final C356830Dyr c356830DyrAz1 = az1();
        final AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22((C1452090ntH) this, 666);
        if (c1449780npY.LIZ.isEditProp()) {
            return;
        }
        c348100DkmLIZIZ.LIZ.addConsumer(new C354000DuI() { // from class: X.0ntY
            @Override // X.C354000DuI
            public final void LIZ() {
                C1449780npY c1449780npY2 = c1449780npY;
                if (c1449780npY2.LIZLLL <= 0 || !c1449780npY2.LJ) {
                    return;
                }
                c1449780npY2.LJ = false;
                C524780Ki4.LIZ.recordSingleValuePerfLog("tool_performance_record_edit_effect_reuse_apply", new AwS566S0100000_22(c1449780npY2, 689));
            }
        });
        c1449780npY.LIZ.getState().observe(videoPublishEditContainerSceneKc, new Observer() { // from class: X.0npZ
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EditEffectAnchorInfo next;
                EnumC1429610nJ1 enumC1429610nJ1;
                FetchEffectState fetchEffectState = (FetchEffectState) obj;
                if (fetchEffectState instanceof FetchEffectState.ERROR) {
                    C1449780npY c1449780npY2 = c1449780npY;
                    String message = ((FetchEffectState.ERROR) fetchEffectState).getMessage();
                    AbstractC214814194y abstractC214814194y = videoPublishEditContainerSceneKc;
                    c1449780npY2.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error at FetchEffectState with message ");
                    sbLIZ.append(message);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("EditingEffectException", C2188811AlT.LIZIZ(sbLIZ));
                    CreativeDialogWrapper creativeDialogWrapper = c1449780npY2.LIZJ;
                    if (creativeDialogWrapper != null) {
                        creativeDialogWrapper.dismiss();
                    }
                    C1449780npY.LIZIZ(abstractC214814194y.requireActivity());
                    return;
                }
                if (Intrinsics.LJFF(fetchEffectState, FetchEffectState.INIT.INSTANCE)) {
                    c1449780npY.getClass();
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("EditingEffectException", "FetchEffectState is INIT which isn't expected");
                    return;
                }
                if (Intrinsics.LJFF(fetchEffectState, FetchEffectState.LOADING.INSTANCE)) {
                    C1449780npY c1449780npY3 = c1449780npY;
                    Activity activityRequireActivity = videoPublishEditContainerSceneKc.requireActivity();
                    if (c1449780npY3.LIZJ == null) {
                        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
                        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                        creativeLoadingDialogBuilder.backCanCancel(false);
                        creativeLoadingDialogBuilder.showProgress(false);
                        creativeLoadingDialogBuilder.loadingMessage(activityRequireActivity.getString(2131833304));
                        c1449780npY3.LIZJ = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activityRequireActivity, 1117, creativeLoadingDialogBuilder);
                    }
                    CreativeDialogWrapper creativeDialogWrapper2 = c1449780npY3.LIZJ;
                    if (creativeDialogWrapper2 == null) {
                        return;
                    }
                    creativeDialogWrapper2.show();
                    return;
                }
                if (fetchEffectState instanceof FetchEffectState.SUCCESS) {
                    C1449780npY c1449780npY4 = c1449780npY;
                    AbstractC214814194y abstractC214814194y2 = videoPublishEditContainerSceneKc;
                    List<EditEffectAnchorInfo> data = ((FetchEffectState.SUCCESS) fetchEffectState).getData();
                    C356830Dyr c356830Dyr = c356830DyrAz1;
                    C348100Dkm c348100Dkm = c348100DkmLIZIZ;
                    VideoPublishEditModel videoPublishEditModel = videoPublishEditModelDc;
                    ReplayLiveData<C0EYM> replayLiveData = replayLiveDataDS1;
                    Function0<Boolean> function0 = awS566S0100000_22;
                    c1449780npY4.getClass();
                    try {
                        CreativeDialogWrapper creativeDialogWrapper3 = c1449780npY4.LIZJ;
                        if (creativeDialogWrapper3 != null) {
                            creativeDialogWrapper3.dismiss();
                        }
                        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
                        C364210EPr.LJ(new C364220EPs(abstractC214814194y2));
                        ArrayList arrayList = new ArrayList();
                        for (EditEffectAnchorInfo editEffectAnchorInfo : data) {
                            EnumC1429610nJ1 enumC1429610nJ12 = editEffectAnchorInfo.effectType;
                            if (enumC1429610nJ12 != EnumC1429610nJ1.EDIT_EFFECT_SERVER && enumC1429610nJ12 != EnumC1429610nJ1.EDIT_EFFECT_COMBINED && enumC1429610nJ12 != EnumC1429610nJ1.EDIT_EFFECT_CLIENT) {
                                arrayList.add(editEffectAnchorInfo);
                            }
                        }
                        Iterator<EditEffectAnchorInfo> it2 = data.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                EditEffectAnchorInfo editEffectAnchorInfo2 = next;
                                if (editEffectAnchorInfo2.effect != null && ((enumC1429610nJ1 = editEffectAnchorInfo2.effectType) == EnumC1429610nJ1.EDIT_EFFECT_SERVER || enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_COMBINED || enumC1429610nJ1 == EnumC1429610nJ1.EDIT_EFFECT_CLIENT)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        EditEffectAnchorInfo editEffectAnchorInfo3 = next;
                        C1449770npX c1449770npX = new C1449770npX(c1449780npY4, abstractC214814194y2, arrayList, c348100Dkm, videoPublishEditModel, replayLiveData, c356830Dyr);
                        if (editEffectAnchorInfo3 != null) {
                            c1449780npY4.LIZ(editEffectAnchorInfo3, videoPublishEditModel, c356830Dyr, c1449770npX, function0, abstractC214814194y2.requireActivity());
                            return;
                        } else {
                            c1449770npX.invoke("success");
                            return;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        ALog.e("EditingEffectException", "Error during successful FetchEffectState with exception ", e);
                        C1449780npY.LIZIZ(abstractC214814194y2.requireActivity());
                        return;
                    }
                }
                throw new C1954807lC();
            }
        });
    }

    private final InterfaceC1461350o8D cb() {
        return ((InterfaceC1455850nzL) getDiContainer().LJII(InterfaceC1455850nzL.class, null)).TI1().LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ed() {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.ed():void");
    }

    private final void he() {
        SingleImageCoverBitmapData singleImageCoverBitmapData;
        InterfaceC1452170ntP interfaceC1452170ntPLJJ;
        Bitmap bitmapLIZ;
        InterfaceC1452170ntP interfaceC1452170ntPLJJ2;
        if (!(gc() instanceof C1450380nqW) || (singleImageCoverBitmapData = this.LLLZLL.singleImageCoverBitmapData) == null) {
            return;
        }
        if (singleImageCoverBitmapData.isReuseTexture()) {
            AbstractC1452680nuE abstractC1452680nuEGc = gc();
            if (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJJ2 = abstractC1452680nuEGc.LJJ()) == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            SingleImageCoverBitmapData singleImageCoverBitmapData2 = this.LLLZLL.singleImageCoverBitmapData;
            if (singleImageCoverBitmapData2 == null || singleImageCoverBitmapData2.getItemCoverWidth() <= 0) {
                return;
            }
            interfaceC1452170ntPLJJ2.setPreviewSurfaceTexDesc(singleImageCoverBitmapData2.getSourcePath());
            return;
        }
        AbstractC1452680nuE abstractC1452680nuEGc2 = gc();
        if (abstractC1452680nuEGc2 == null || (interfaceC1452170ntPLJJ = abstractC1452680nuEGc2.LJJ()) == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        SingleImageCoverBitmapData singleImageCoverBitmapData3 = this.LLLZLL.singleImageCoverBitmapData;
        boolean z = false;
        if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "story_camera_disable_edit_fake_preview", true) == 1 && dc().getShootMode() == 29) || (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_online_camera_disable_edit_fake_preview", true) == 2 && dc().getShootMode() == 23)) {
            z = true;
        }
        if (singleImageCoverBitmapData3 == null || singleImageCoverBitmapData3.getItemCoverWidth() <= 0 || (bitmapLIZ = C0L06.LIZ(singleImageCoverBitmapData3, z)) == null) {
            return;
        }
        interfaceC1452170ntPLJJ.mg(bitmapLIZ);
    }

    private final void ie() {
        C0CHQ.LIZ().getPublishService().LJIIIIZZ();
    }

    private final void m6() {
        Pair<FilterBean, Float> pairLIZIZ;
        InterfaceC1453220nv6 value;
        C1452270ntZ c1452270ntZBb = Bb();
        if (c1452270ntZBb != null) {
            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22((C1452090ntH) this, 686);
            if (!c1452270ntZBb.LIZLLL.getBoolean("Edit_Filter_Data_2_Has_Migrated", false)) {
                final String str = C0CHQ.LIZ().LJJIL().LIZJ().get();
                if (a0.LJJIIZI(str, "composer", false)) {
                    str = c1452270ntZBb.LIZJ.get(str);
                }
                ((InterfaceC1635390sev) C1452230ntV.LL.get()).LJJJJI((String) new InterfaceC1456340o08() { // from class: X.0ntk
                    @Override // X.InterfaceC1456340o08
                    public final /* bridge */ /* synthetic */ Object get() {
                        return str;
                    }
                }.get(), true, false, new C1432990nOT(new AwS105S1200000_22(c1452270ntZBb, str, awS566S0100000_22, 9), AFwS261S0000000_22.get$arr$(340)));
            }
        }
        gq1().observe(this, new AObjectS245S0100000_22(this, 174));
        if (C123100dR.LIZ(dc().getSelectedFilterId()) || C123100dR.LIZ(dc().getSelectedFilterResId())) {
            FilterBean filterBeanLJ = C1428470nHB.LJ(dc(), Fb(dc()));
            if (C1428470nHB.LLIIIZ(dc()) || C1428470nHB.LLIIJI(dc()) || u4.LJJJJIZL(dc())) {
                AbstractC1452680nuE abstractC1452680nuEGc = gc();
                pairLIZIZ = C0E3A.LIZIZ(abstractC1452680nuEGc != null ? C352130DrH.LIZ(abstractC1452680nuEGc.LJJ()) : null);
            } else {
                pairLIZIZ = new Pair<>(null, Float.valueOf(0.0f));
            }
            FilterBean first = pairLIZIZ.getFirst();
            float fFloatValue = pairLIZIZ.getSecond().floatValue();
            if (first == null || Intrinsics.LJFF(filterBeanLJ.getId(), first.getId())) {
                nn1(filterBeanLJ);
            } else {
                InterfaceC358220E2q value2 = xq1().getValue();
                if (value2 == null || (value = zj2().getValue()) == null) {
                    return;
                }
                value2.LIZIZ(first, C1453210nv5.LIZJ(first, fFloatValue, value));
                nn1(first);
            }
        }
        dc().creativeModel.filterModel.isUseComposerFilterInEditPage = true;
    }

    private final void re() {
        C19292410dm currentUser;
        if (C289270BVl.LIZ() || (currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser()) == null) {
            return;
        }
        C128L c128lLIZIZ = C0CHQ.LIZ().LIZIZ();
        List<Integer> listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(dc().videoWidth()), Integer.valueOf(dc().videoHeight()));
        EditVideoSegment editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(dc().getPreviewInfo().getVideoList());
        c128lLIZIZ.LIZ(listLJIIJJI, editVideoSegment != null ? editVideoSegment.getVideoPath() : null, currentUser, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void we() {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.we():void");
    }

    private final boolean xd() {
        Bundle bundleRequireArgumentsSafely;
        VideoPublishEditContainerScene videoPublishEditContainerSceneKc = Kc();
        Parcelable parcelable = null;
        if (videoPublishEditContainerSceneKc != null && (bundleRequireArgumentsSafely = videoPublishEditContainerSceneKc.requireArgumentsSafely()) != null) {
            parcelable = bundleRequireArgumentsSafely.getParcelable("switch_mode_payload");
        }
        return (parcelable instanceof SwitchModePayload) && parcelable != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ae() {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.Ae():void");
    }

    public void Fd() {
        InterfaceC1452410ntn interfaceC1452410ntnSc;
        if (C1428470nHB.LJLZ(dc()) && (interfaceC1452410ntnSc = sc()) != null) {
            interfaceC1452410ntnSc.dJ2();
        }
        MutableLiveData<C1453160nv0> mutableLiveDataMW1 = MW1();
        mutableLiveDataMW1.observe(this, new AObjectS245S0100000_22(this, 176));
        mutableLiveDataMW1.observe(this, new C1453940nwG());
    }

    @Override // X.InterfaceC1446740nke
    public VideoPublishEditModel LJJJLIIL() {
        return dc();
    }

    @Override // X.InterfaceC1446740nke
    public NLEModel LLZ() {
        C1463670oBx c1463670oBx;
        InterfaceC1452170ntP value = g().getValue();
        if (!(value instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) value) == null) {
            return null;
        }
        return c1463670oBx.LIZJ();
    }

    @Override // X.InterfaceC1446740nke
    public void Qd0() {
        JA2(this.B, Be());
    }

    public void T9() {
        InterfaceC1452360nti interfaceC1452360ntiZ4 = z4();
        if (interfaceC1452360ntiZ4 != null) {
            InterfaceC2177771AKx interfaceC2177771AKx = new InterfaceC2177771AKx(this) { // from class: X.0F4g
                public boolean LL;
                public final /* synthetic */ C1452090ntH<T> LLILLJJLI;

                @Override // X.InterfaceC2177771AKx
                public final void M0() {
                }

                @Override // X.InterfaceC2177771AKx
                public final void l2() {
                }

                @Override // X.InterfaceC2177771AKx
                public final void LLJLIL() {
                    C1463670oBx c1463670oBx;
                    if (!Intrinsics.LJFF(this.LLILLJJLI.LLLLII.getValue(), Boolean.TRUE)) {
                        this.LL = true;
                    }
                    InterfaceC1452170ntP interfaceC1452170ntPO4 = this.LLILLJJLI.O4();
                    if (!(interfaceC1452170ntPO4 instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) interfaceC1452170ntPO4) == null) {
                        return;
                    }
                    C1463860oCG c1463860oCG = c1463670oBx.LJI;
                    ((C389960FQs) (c1463860oCG != null ? c1463860oCG : null).getPlayerApi()).surfaceDestroyed();
                }

                {
                    this.LLILLJJLI = this;
                }

                @Override // X.InterfaceC2177771AKx
                public final void WB(Surface surface) {
                    C1463670oBx c1463670oBx;
                    VEEditor.VEState state;
                    if (!Intrinsics.LJFF(surface, this.LLILLJJLI.LLZZZIL)) {
                        InterfaceC1452170ntP interfaceC1452170ntPO4 = this.LLILLJJLI.O4();
                        VEEditor.VEState state2 = null;
                        if (interfaceC1452170ntPO4 instanceof C1463670oBx) {
                            c1463670oBx = (C1463670oBx) interfaceC1452170ntPO4;
                        } else {
                            c1463670oBx = null;
                        }
                        if (c1463670oBx != null) {
                            C1463860oCG c1463860oCG = c1463670oBx.LJI;
                            if (c1463860oCG == null) {
                                c1463860oCG = null;
                            }
                            INLEPurePlayer.DefaultImpls.surfaceCreated$default(c1463860oCG.getPlayerApi(), surface, false, 2, null);
                        }
                        C563650M8t c563650M8t = C563650M8t.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onSurfaceReady-2: ");
                        InterfaceC1452170ntP interfaceC1452170ntPO42 = this.LLILLJJLI.O4();
                        if (interfaceC1452170ntPO42 != null) {
                            state2 = interfaceC1452170ntPO42.getState();
                        }
                        sbLIZ.append(state2);
                        C201955140j.LIZLLL(c563650M8t, "lazy_opt-cost", C2188811AlT.LIZIZ(sbLIZ));
                        if (!this.LLILLJJLI.H4()) {
                            return;
                        }
                        InterfaceC1452170ntP interfaceC1452170ntPO43 = this.LLILLJJLI.O4();
                        if (interfaceC1452170ntPO43 == null || (state = interfaceC1452170ntPO43.getState()) == null) {
                            state = VEEditor.VEState.ERROR;
                        }
                        if (this.LL || state.compareTo(VEEditor.VEState.PREPARED) < 0) {
                            MutableLiveData<Boolean> mutableLiveData = this.LLILLJJLI.LLLLII;
                            AbstractC2255721DQs abstractC2255721DQs = this.LLILLJJLI;
                            C0EHK.LJIIJ(mutableLiveData, abstractC2255721DQs, new AObserverS209S0100000_5(abstractC2255721DQs, 19));
                            this.LL = false;
                        }
                    }
                }

                @Override // X.InterfaceC2177771AKx
                public final void LLIIZ(int i, int i2, Surface surface) {
                    C1463670oBx c1463670oBx;
                    InterfaceC1452170ntP interfaceC1452170ntPO4 = this.LLILLJJLI.O4();
                    C1463860oCG c1463860oCG = null;
                    if ((interfaceC1452170ntPO4 instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPO4) != null) {
                        C1463860oCG c1463860oCG2 = c1463670oBx.LJI;
                        if (c1463860oCG2 != null) {
                            c1463860oCG = c1463860oCG2;
                        }
                        ((C389960FQs) c1463860oCG.getPlayerApi()).surfaceChanged(i, i2);
                    }
                }
            };
            interfaceC1452360ntiZ4.d12(interfaceC2177771AKx);
            this.LLZZZZ = interfaceC2177771AKx;
            this.LLZZZIL = null;
        }
    }

    public final int Yc() {
        return super.W6();
    }

    public final void cd() {
        String selectedFilterResId;
        String selectedFilterId = dc().getSelectedFilterId();
        if ((selectedFilterId == null || selectedFilterId.length() == 0) && ((selectedFilterResId = dc().getSelectedFilterResId()) == null || selectedFilterResId.length() == 0)) {
            return;
        }
        FilterBean filterBeanLJ = C1428470nHB.LJ(dc(), Fb(dc()));
        int selectedFilterIntensity = (int) (dc().getSelectedFilterIntensity() * 100);
        InterfaceC358220E2q value = xq1().getValue();
        if (value != null) {
            value.LIZIZ(filterBeanLJ, selectedFilterIntensity);
        }
    }

    public final void da() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        InterfaceC1452170ntP interfaceC1452170ntPO4 = O4();
        if (interfaceC1452170ntPO4 == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPO4)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null || !C0EHK.LIZLLL(dc(), model)) {
            return;
        }
        int i = C365960EWk.LIZ;
        VecNLETrackSPtr tracks = model.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getEnable()) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                if (nLETrackSlot.getKeyframes().size() > 0) {
                    arrayList2.add(nLETrackSlot);
                }
            }
            for (NLETrackSlot nLETrackSlot2 : arrayList2) {
                nLETrackSlot2.convertSlotKeyframe2SwingKeyframe();
                nLETrackSlot2.clearKeyframe();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1446740nke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean eS0() {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.eS0():boolean");
    }

    public final InterfaceC1418580n1E gb() {
        return Da().G51().LIZJ();
    }

    public final InterfaceC377540ErA kb() {
        return ((InterfaceC1455850nzL) getDiContainer().LJII(InterfaceC1455850nzL.class, null)).TF().LIZJ();
    }

    public final void ld() {
        C348100Dkm c348100DkmLIZIZ;
        if (dc().creativeModel.draftInfoModel.isDraft || this.LLLZZ.LIZIZ) {
            return;
        }
        InterfaceC1452170ntP interfaceC1452170ntPO4 = O4();
        if (interfaceC1452170ntPO4 == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPO4)) == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        c348100DkmLIZIZ.LJIIL();
    }

    @Override // X.InterfaceC1446740nke
    public boolean mi2() {
        return H4();
    }

    @Override // X.C1455870nzN
    public SurfaceView n7() {
        InterfaceC1452360nti interfaceC1452360ntiZ4 = z4();
        if (interfaceC1452360ntiZ4 != null) {
            return interfaceC1452360ntiZ4.LJIJJLI();
        }
        return null;
    }

    public View nc() {
        return LJIJJLI();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    @Override // X.InterfaceC1446740nke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.effect.EffectPointModel> o9() {
        /*
            r5 = this;
            X.0Dyr r0 = r5.az1()
            if (r0 == 0) goto L42
            X.0Dyr r0 = r5.az1()
            if (r0 == 0) goto L3c
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.LJIIJJI()
        L10:
            java.util.List r0 = X.C356830Dyr.LJIILJJIL(r0)
            if (r0 == 0) goto L42
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r1
            boolean r0 = X.C357540E0a.LJIILL(r1)
            if (r0 != 0) goto L38
            boolean r0 = X.C351220Dpo.LLJLLL(r1)
            if (r0 == 0) goto L1f
        L38:
            r4.add(r2)
            goto L1f
        L3c:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = new com.bytedance.ies.nle.editor_jni.NLEModel
            r0.<init>()
            goto L10
        L42:
            r4 = 0
        L43:
            X.0EMy r1 = X.C363500EMy.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LJJJLIIL()
            if (r4 != 0) goto L4d
            X.13BV r4 = X.C13BV.INSTANCE
        L4d:
            r1.getClass()
            java.util.List r0 = X.C363500EMy.LJ(r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.o9():java.util.List");
    }

    @Override // X.InterfaceC1446740nke
    public void oL2() {
        NLEModel nLEModelLIZ;
        NLEModel nLEModelLIZ2;
        if (C280460Ayy.LIZ()) {
            C0CNO.LIZLLL(0L, new AwS566S0100000_22((C1452090ntH) this, 681));
            return;
        }
        VideoPublishEditModel videoPublishEditModelDc = dc();
        InterfaceC1452170ntP interfaceC1452170ntPO4 = O4();
        NLENode nLENodeDeepClone = null;
        videoPublishEditModelDc.setNleData((interfaceC1452170ntPO4 == null || (nLEModelLIZ2 = C352130DrH.LIZ(interfaceC1452170ntPO4)) == null) ? null : C375260EnU.LIZJ(nLEModelLIZ2));
        if (C350300DoK.LIZ()) {
            VideoPublishEditModel videoPublishEditModelDc2 = dc();
            InterfaceC1452170ntP interfaceC1452170ntPO42 = O4();
            if (interfaceC1452170ntPO42 != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntPO42)) != null) {
                nLENodeDeepClone = nLEModelLIZ.deepClone(false);
            }
            videoPublishEditModelDc2.setNleModel(NLEModel.dynamicCast(nLENodeDeepClone));
            dc().setNleDataChange(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    @Override // X.C1455870nzN, X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.onCreate():void");
    }

    @Override // X.C1455870nzN, X.AbstractC2255721DQs
    public void onDestroy() {
        C1463670oBx c1463670oBx;
        AbstractC1452680nuE abstractC1452680nuEGc;
        InterfaceC1452360nti interfaceC1452360ntiZ4;
        C348100Dkm c348100DkmLIZIZ;
        CompileProbeViewModel compileProbeViewModelSa = sa();
        dc();
        ((AbstractC1465910oFZ) compileProbeViewModelSa.vQ2()).LIZIZ();
        InterfaceC1452170ntP interfaceC1452170ntPO4 = O4();
        if (interfaceC1452170ntPO4 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPO4)) != null) {
            c348100DkmLIZIZ.LIZIZ.getPlayerApi().unbindSurfaceView();
        }
        InterfaceC2177771AKx interfaceC2177771AKx = this.LLZZZZ;
        if (interfaceC2177771AKx != null && (interfaceC1452360ntiZ4 = z4()) != null) {
            interfaceC1452360ntiZ4.Wn2(interfaceC2177771AKx);
        }
        AbstractC1452680nuE abstractC1452680nuEGc2 = gc();
        InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuEGc2 != null ? abstractC1452680nuEGc2.LJJ() : null;
        if ((interfaceC1452170ntPLJJ instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) != null) {
            if (C299990BpN.LIZ() && (abstractC1452680nuEGc = gc()) != null) {
                abstractC1452680nuEGc.LJJ().dg(tc());
            }
            C1402850mbr.LIZ(c1463670oBx.LJIILL, c1463670oBx.LJIILLIIL);
        }
        super.onDestroy();
        IToolsVQEvaluationService iToolsVQEvaluationServiceMc = Mc();
        if (iToolsVQEvaluationServiceMc != null) {
            dc().getCreationId();
            iToolsVQEvaluationServiceMc.LJ();
        }
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        C364210EPr.LIZ(this.e);
        C2296808zG.LIZJ(this.LLIZ, null);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        for (String str : C1411560mpu.LIZJ.keySet()) {
            List<Long> list = C1411560mpu.LIZJ.get(str);
            if (list != null) {
                try {
                    double dLJJJI = C13LP.LJJJI(list);
                    InterfaceC1411570mpv interfaceC1411570mpv = C1411560mpu.LIZ;
                    if (interfaceC1411570mpv != null) {
                        interfaceC1411570mpv.LIZ(dLJJJI, str, !C1411560mpu.LIZIZ);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C1411560mpu.LIZJ.clear();
        IToolsVQEvaluationService iToolsVQEvaluationServiceMc = Mc();
        if (iToolsVQEvaluationServiceMc != null) {
            dc().getCreationId();
            iToolsVQEvaluationServiceMc.LJ();
        }
    }

    @Override // X.C1455870nzN, X.AbstractC2255721DQs
    public void onResume() {
        this.w = SystemClock.elapsedRealtime() - this.v;
        super.onResume();
        this.n = System.currentTimeMillis();
        dc().creativeModel.ffdEventReport.editUiFFD = this.n;
        IToolsVQEvaluationService iToolsVQEvaluationServiceMc = Mc();
        if (iToolsVQEvaluationServiceMc != null) {
            dc().getCreationId();
            iToolsVQEvaluationServiceMc.LJ();
        }
    }

    public final InterfaceC1452470ntt pa() {
        return ((InterfaceC1455850nzL) getDiContainer().LJII(InterfaceC1455850nzL.class, null)).AC2().LIZJ();
    }

    public boolean sg() {
        return z4() != null;
    }

    public final void ue() {
        CompileProbeResult.ResultStatus status;
        if (dc().getCompileProbeResult() != null) {
            CompileProbeResult compileProbeResult = dc().getCompileProbeResult();
            if (((compileProbeResult == null || (status = compileProbeResult.getStatus()) == null) ? null : status.getState()) != CompileProbeResult.State.CANCEL) {
                return;
            }
        }
        CompileProbeViewModel compileProbeViewModelSa = sa();
        dc();
        ((AbstractC1465910oFZ) compileProbeViewModelSa.vQ2()).LIZJ(dc());
    }

    @Override // X.C1455870nzN
    public void w9() {
        super.w9();
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "lazy_opt-cost", "videoEditorPrepareDone");
        C0CNO.LIZLLL(0L, new AwS566S0100000_22((C1452090ntH) this, 687));
        InterfaceC377540ErA interfaceC377540ErAKb = kb();
        if (interfaceC377540ErAKb == null || !interfaceC377540ErAKb.isShowing()) {
            W1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
    @Override // X.InterfaceC1446740nke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dmt.av.video.VEPreviewMusicParams xI() {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.xI():dmt.av.video.VEPreviewMusicParams");
    }

    @Override // X.C1455870nzN
    public void y7() {
        dS1().observe(this, new AObjectS240S0100000_5(this, 27));
        dS1().observe(this, new C1453940nwG());
    }

    @Override // X.C1455870nzN
    public void y8() {
        InterfaceC1452540nu0 interfaceC1452540nu0;
        InterfaceC1452360nti interfaceC1452360ntiZ4;
        C353920DuA c353920DuAOc;
        MusicAndTimeModel musicAndTimeModel;
        InterfaceC1452170ntP interfaceC1452170ntPO4;
        InterfaceC1452170ntP interfaceC1452170ntPO42;
        super.y8();
        if (C1428470nHB.LJIIZILJ(dc()) && (interfaceC1452170ntPO4 = O4()) != null) {
            VEEditor.VEState state = interfaceC1452170ntPO4.getState();
            if (state == null) {
                state = VEEditor.VEState.ERROR;
            }
            if (state.getValue() < VEEditor.VEState.PREPARED.getValue()) {
                InterfaceC1452170ntP interfaceC1452170ntPO43 = O4();
                if (interfaceC1452170ntPO43 != null) {
                    interfaceC1452170ntPO43.initBingoAlgorithm();
                }
                if (!dc().getEditMusicSyncMode() && (interfaceC1452170ntPO42 = O4()) != null) {
                    interfaceC1452170ntPO42.restoreAllVideoSound();
                }
            }
        }
        MusicAndTimeModel musicAndTimeModel2 = dc().creativeModel.musicAndTimeModel;
        if (C1452490ntv.LIZ() && musicAndTimeModel2 != null && (c353920DuAOc = oc()) != null && (musicAndTimeModel = c353920DuAOc.LJ.creativeModel.musicAndTimeModel) != null && !musicAndTimeModel.slowMotionApplied) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c353920DuAOc.LJFF), C0PEM.LIZ, null, new C353900Du8(c353920DuAOc, musicAndTimeModel2, null), 2);
        }
        InterfaceC2177771AKx interfaceC2177771AKx = this.LLZZZZ;
        if (interfaceC2177771AKx != null && (interfaceC1452360ntiZ4 = z4()) != null) {
            interfaceC1452360ntiZ4.d12(interfaceC2177771AKx);
        }
        if (!this.x) {
            P9();
        }
        this.x = true;
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22((C1452090ntH) this, 672);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "import_video_optimization", true, false)) {
            awS566S0100000_22.invoke();
        }
        if (sg()) {
            return;
        }
        C198H c198hKc = Kc();
        if (!(c198hKc instanceof InterfaceC1452540nu0) || (interfaceC1452540nu0 = (InterfaceC1452540nu0) c198hKc) == null) {
            return;
        }
        interfaceC1452540nu0.r7();
    }

    @Override // X.C1455870nzN
    public void z8() {
        InterfaceC1452540nu0 interfaceC1452540nu0;
        if (!sg()) {
            C198H c198hKc = Kc();
            if ((c198hKc instanceof InterfaceC1452540nu0) && (interfaceC1452540nu0 = (InterfaceC1452540nu0) c198hKc) != null) {
                interfaceC1452540nu0.LLLJIL();
            }
        }
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22((C1452090ntH) this, 673);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "import_video_optimization", true, false)) {
            awS566S0100000_22.invoke();
        }
        super.z8();
    }

    private final void ne() {
        C1439910nZd.LIZ();
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Boolean> FV1() {
        return this.f165X;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> GW1() {
        return this.S;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<VEPreviewMusicParams> ML1() {
        return this.R;
    }

    @Override // X.InterfaceC1446740nke
    public /* bridge */ /* synthetic */ C385670FAf Md2() {
        return this.LLLZZIL;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Boolean> SE() {
        return this.P;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> Te1() {
        return this.L;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> Tf2() {
        return this.T;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> UU() {
        return this.U;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<SwitchModePayload> Vh() {
        return this.N;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Integer> ZK() {
        return this.W;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> a62() {
        return this.M;
    }

    public h0<Boolean> bc() {
        return this.LLLZZIL;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Boolean> cA2() {
        return this.f164O;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> cW0() {
        return this.j;
    }

    @Override // X.C1455870nzN
    public boolean e4() {
        return this.F;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> l02() {
        return this.f166Y;
    }

    @Override // X.InterfaceC1446740nke
    public LiveEvent<Unit> t90() {
        return this.Q;
    }

    private final InterfaceC1639870sm9 Fb(VideoPublishEditModel videoPublishEditModel) {
        InterfaceC1642310sq5 interfaceC1642310sq5LJJIL;
        if (C1428520nHG.LJLIL(videoPublishEditModel)) {
            interfaceC1642310sq5LJJIL = C0CHQ.LIZ().LJJIJ(this.LLLZZ.LIZJ);
        } else {
            interfaceC1642310sq5LJJIL = C0CHQ.LIZ().LJJIL();
        }
        return interfaceC1642310sq5LJJIL.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Td(X.C1453000nuk r16) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.Td(X.0nuk):void");
    }

    private final void V9(String str) {
        String strLIZIZ;
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        C141Q c141q = C141Q.LIZ;
        String mMusicPath = dc().getMMusicPath();
        c141q.getClass();
        if (C141Q.LJII(mMusicPath)) {
            IMusicExternalService iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null);
            if (iMusicExternalService != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null) {
                strLIZIZ = interfaceC1662290tMJLIZJ.LIZIZ(dc().getMMusicPath(), -1, str, dc().mShootWay, Integer.valueOf(dc().getMMusicType()), C1428470nHB.LJIILL(dc()), "", dc().getMMusicUrlKey(dc().getMMusicPath()));
            } else {
                strLIZIZ = null;
            }
            if (C123100dR.LIZ(strLIZIZ)) {
                dc().setMMusicPath(strLIZIZ);
            }
        }
    }

    public static final <T extends InterfaceC1446740nke> boolean fd(C1452090ntH<T> c1452090ntH) {
        if (C1428470nHB.LLIIIJ(c1452090ntH.dc()) && !c1452090ntH.dc().isFromCrash() && !c1452090ntH.dc().mIsFromDraft) {
            return false;
        }
        return true;
    }

    private final void ma(InterfaceC1452170ntP interfaceC1452170ntP) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_destroy_temp_editor", true, true)) {
            C0CNO.LIZ(C15O7.LJI, new AwS566S0100000_22(interfaceC1452170ntP, 674));
        }
    }

    private final EffectPointModel xb(NLETrackSlot nLETrackSlot) {
        C348380DlE c348380DlE = new C348380DlE();
        c348380DlE.LIZIZ = nLETrackSlot.getStartTime();
        c348380DlE.LIZJ = nLETrackSlot.getEndTime();
        c348380DlE.LJFF = nLETrackSlot.getExtra("ep_magic_effect_id");
        c348380DlE.LJIIL = nLETrackSlot.getExtra("ep_magic_resource_id");
        return C363510EMz.LIZ(c348380DlE, false, (int) (c348380DlE.LIZJ - c348380DlE.LIZIZ));
    }

    public final void Id(long j) {
        IMediaPlayerManagerService iMediaPlayerManagerService;
        List<String> list;
        List<String> list2;
        Object objLJJJLL;
        Bundle bundle;
        C1439810nZT c1439810nZT;
        AbstractC1452680nuE abstractC1452680nuEGc;
        VideoPublishEditModel videoPublishEditModelHc = hc();
        if (((Boolean) C284650BDr.LIZ.getValue()).booleanValue() && C1428520nHG.LJJLJ(videoPublishEditModelHc) && (abstractC1452680nuEGc = gc()) != null) {
            abstractC1452680nuEGc.LJJ().Ff(true);
        }
        if (!C1428470nHB.LJLLLLLL(dc()) && !xd() && (!dc().isPhotoMvMode() || (c1439810nZT = (C1439810nZT) getDiContainer().LJIIL(null, C1439810nZT.class)) == null || c1439810nZT.LIZIZ == null)) {
            dc().creativeModel.ffdEventReport.editFFD = j;
            if (this.p > 0) {
                C1422040n6o c1422040n6o = C1422040n6o.LIZ;
                VideoPublishEditContainerScene videoPublishEditContainerSceneKc = Kc();
                if (videoPublishEditContainerSceneKc == null || (bundle = videoPublishEditContainerSceneKc.requireArgumentsSafely()) == null) {
                    AbstractC214814194y abstractC214814194yKc = kc();
                    if (abstractC214814194yKc != null) {
                        bundle = abstractC214814194yKc.requireArgumentsSafely();
                    } else {
                        bundle = new Bundle();
                    }
                }
                VideoPublishEditModel videoPublishEditModelDc = dc();
                long j2 = this.n;
                long j3 = this.p;
                C1422050n6p c1422050n6p = new C1422050n6p(this.o, this.s, this.u, this.t, this.w);
                c1422040n6o.getClass();
                C1422040n6o.LIZIZ(bundle, videoPublishEditModelDc, j2, j3, j, c1422050n6p);
            } else {
                this.r = true;
                this.q = j;
            }
        }
        if (C1428470nHB.LJLJLJ(dc())) {
            ArrayList arrayList = new ArrayList();
            CanvasVideoData canvasVideoData = dc().getCanvasVideoData();
            if (canvasVideoData != null && (list2 = canvasVideoData.sourceInfo) != null && (objLJJJLL = C13LP.LJJJLL(list2)) != null) {
                arrayList.add(objLJJJLL);
            }
            CanvasVideoData canvasVideoData2 = dc().getCanvasVideoData();
            if (canvasVideoData2 != null && (list = canvasVideoData2.auditFrames) != null && (!list.isEmpty())) {
                arrayList.addAll(list);
            }
            C373801cm.LIZJ(arrayList);
        }
        if (C298220BmW.LIZ()) {
            C141Q c141q = C141Q.LIZ;
            String mMusicPath = dc().getMMusicPath();
            c141q.getClass();
            if (C141Q.LJII(mMusicPath) && (iMediaPlayerManagerService = (IMediaPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IMediaPlayerManagerService.class, false, false, false, 14, null)) != null) {
                iMediaPlayerManagerService.LIZ(dc().creativeModel.musicBuzModel);
            }
        }
        C0CNO.LIZLLL(0L, new AwS566S0100000_22((C1452090ntH) this, 669));
        C0CHQ.LIZ().getPublishService().LJJLIIIIJ().LIZ();
        dc().getEditorProModel().setVeFirstFrameTimeStamp(Long.valueOf(j));
        C0CHQ.LIZ().getPublishService().LJIIL().LJJ(new AwS566S0100000_22((C1452090ntH) this, 670));
        C0CHQ.LIZ().getPublishService().LJJJJJ().LIZLLL();
        C1439910nZd.LIZ();
        ie();
        we();
        re();
        this.LLLLIILL.postValue(null);
    }

    @Override // X.InterfaceC1446740nke
    public void Ov2(LivePhotoPreviewMode livePhotoPreviewMode) {
        if (livePhotoPreviewMode == null) {
            return;
        }
        JA2(xI(), null);
    }

    @Override // X.InterfaceC1446740nke
    public void Qb1(boolean z) {
        this.f165X.setValue(Boolean.valueOf(z));
    }

    public final void Rd(float f) {
        InterfaceC1452130ntL interfaceC1452130ntLNa = Na();
        if (interfaceC1452130ntLNa != null) {
            interfaceC1452130ntLNa.Vy(f, 300L);
        }
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            Lb().Oi2(f, 300L);
            Vb().Qi0(f, 300L);
            return;
        }
        InterfaceC1461650o8h interfaceC1461650o8hOa = Oa();
        if (interfaceC1461650o8hOa != null) {
            interfaceC1461650o8hOa.Oi2(f, 300L);
        }
        InterfaceC1461350o8D interfaceC1461350o8DCb = cb();
        if (interfaceC1461350o8DCb != null) {
            interfaceC1461350o8DCb.Qi0(f, 300L);
        }
        InterfaceC1461350o8D interfaceC1461350o8DCb2 = cb();
        if (interfaceC1461350o8DCb2 == null) {
            return;
        }
        interfaceC1461350o8DCb2.uQ(f, 300L);
    }

    @Override // X.C1455870nzN
    public void Z1(C1453000nuk c1453000nuk) {
        if (c1453000nuk == null || c1453000nuk.LJFF) {
            return;
        }
        C1451980nt6.LIZ.getClass();
        C1451980nt6.LIZIZ = false;
        FilterBean filterBean = c1453000nuk.LIZIZ;
        if (filterBean != null && C1643880ssc.LJ(filterBean)) {
            Td(c1453000nuk);
        } else {
            AbstractC1452680nuE abstractC1452680nuEGc = gc();
            if (abstractC1452680nuEGc != null) {
                abstractC1452680nuEGc.LJIIJ(c1453000nuk.LIZIZ, this.LLILZ.LIZ.invoke().booleanValue());
            }
        }
        FilterBean filterBean2 = c1453000nuk.LIZIZ;
        if (filterBean2 != null) {
            dc().setSelectedFilterResId(filterBean2.getResId());
            VideoPublishEditModel videoPublishEditModelDc = dc();
            String id = filterBean2.getId();
            id.toString();
            videoPublishEditModelDc.setSelectedFilterId(id);
            dc().setSelectedFilterLabel(filterBean2.getEnName());
            dc().creativeModel.filterModel.selectedFilterFrom = filterBean2.getEnterMethod();
            dc().setSelectedFilterCategoryKey(filterBean2.getCategoryKey());
            return;
        }
        dc().setSelectedFilterResId(null);
        dc().creativeModel.filterModel.selectedFilterFrom = "";
    }

    @Override // X.C1455870nzN
    public void c9(boolean z) {
        this.F = z;
    }

    @Override // X.InterfaceC1446740nke
    public void eD0(boolean z) {
        this.P.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1446740nke
    public void i61(String str) {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLESegment mainSegment;
        NLEStyCanvas canvasStyle;
        CanvasBackground canvasBackground;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        InterfaceC1452170ntP value = g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            NLEModel model = nLEEditor.getModel();
            if (model != null && (mainTrack = model.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null) {
                mainSegment = nLETrackSlot.getMainSegment();
            } else {
                mainSegment = null;
            }
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment);
            if (nLESegmentVideoDynamicCast != null && (canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) != null) {
                canvasStyle.getImage().setResourceFile(str);
                nLEEditor.commit();
                nLEEditor.done();
                CanvasVideoData canvasVideoData = dc().getCanvasVideoData();
                if (canvasVideoData != null && (canvasBackground = canvasVideoData.background) != null) {
                    canvasBackground.setFilePath(str);
                }
            }
        }
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void l4(boolean z) {
        InterfaceC1452170ntP value = g().getValue();
        if (!(value instanceof C1463670oBx)) {
            value = null;
        }
        if (C349760DnS.LIZ(dc(), LLZ())) {
            if (value != null) {
                if (z) {
                    Cb().LIZJ();
                }
                this.LLILZIL.LIZ = C1638720skI.LIZLLL();
                return;
            }
            return;
        }
        String str = this.H;
        String str2 = this.I;
        if (str != null && str2 != null && value != null) {
            Cb().LJFF(new String[]{str, str2}, new float[]{1.0f, 1.0f});
        }
        super.l4(z);
    }

    @Override // X.InterfaceC1446740nke
    public void nn1(FilterBean filterBean) {
        if (!dc().creativeModel.filterModel.isUseComposerFilterInEditPage) {
            ((C1463670oBx) g().getValue()).LIZLLL().LJII().LJJJ(null);
        }
        dc();
        boolean z = true;
        L7(new C1453000nuk(z, filterBean, false, (String) null, z, 8));
    }

    @Override // X.C1455870nzN
    public void o7(Integer num) {
        Object objValueOf;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", dc().getEnterFrom());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(dc()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(dc()));
        c0lab.LJ("shoot_way", dc().mShootWay);
        c0lab.LJ("creation_id", dc().getCreationId());
        c0lab.LIZ(C1428470nHB.LJJJZ(dc()) ? 1 : 0, "is_draft");
        c0lab.LIZ(dc().creativeModel.draftInfoModel.draftAwemeType, "draft_aweme_type");
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiterC3 = c3();
        if (vEEditorAutoStartStopArbiterC3 != null) {
            objValueOf = Integer.valueOf(vEEditorAutoStartStopArbiterC3.LLJJ);
        } else {
            objValueOf = null;
        }
        c0lab.LIZLLL(objValueOf, "error_code");
        C20684815ws.LJIILLIIL("tool_performance_edit_preview_result", c0lab.LIZ);
    }

    @Override // X.InterfaceC1446740nke
    public void rh0(boolean z) {
        this.f164O.setValue(Boolean.valueOf(z));
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void tH1(C364400EQk c364400EQk) {
        LJJJLIIL().creativeModel.commonMobModel.editPageFuncTracking.isVoiceEffectFuncUsed = true;
        super.tH1(c364400EQk);
    }

    @Override // X.C1455870nzN
    public InterfaceC358220E2q w2(String str) {
        return C1456550o0T.LIZ(str);
    }

    @Override // X.InterfaceC1446740nke
    public void x61(SwitchModePayload switchModePayload) {
        this.N.setValue(switchModePayload);
    }

    private final String ze(String str, VideoPublishEditModel videoPublishEditModel) {
        String nleData = videoPublishEditModel.getNleData();
        if (nleData != null && nleData.length() > 0) {
            String mMusicPath = videoPublishEditModel.getMMusicPath();
            if (mMusicPath == null) {
                mMusicPath = "";
            }
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            if (C350300DoK.LIZ() && !videoPublishEditModel.getNleDataChange() && videoPublishEditModel.getNleModel() != null) {
                nLEEditorLIZ.setModel(videoPublishEditModel.getNleModel());
            } else {
                nLEEditorLIZ.restore(nleData);
            }
            C347030Dj3.LIZ(nLEEditorLIZ, C2097608Jq.LJI(new Pair(str, mMusicPath)), AFwS261S0000000_22.get$arr$(202));
            dc().setNleData(nLEEditorLIZ.store());
            if (!C350300DoK.LIZ()) {
                dc().setNleDataChange(false);
                dc().setNleModel(nLEEditorLIZ.getModel());
            }
            return dc().getNleData();
        }
        return nleData;
    }

    public final void Gd(InterfaceC1452170ntP interfaceC1452170ntP, long j) {
        IToolsVQEvaluationService iToolsVQEvaluationServiceMc;
        final ARunnableS22S0100100_22 aRunnableS22S0100100_22 = new ARunnableS22S0100100_22(this, j, 2);
        new BPEAThread(aRunnableS22S0100100_22) { // from class: X.0ntp
        }.start();
        VQEvaluationConfig vQEvaluationConfig = dc().creativeModel.initialModel.vqEvaluationConfig;
        if (vQEvaluationConfig != null && vQEvaluationConfig.screenShotConfig != null && (iToolsVQEvaluationServiceMc = Mc()) != null) {
            dc().getCreationId();
            LJIJJLI();
            iToolsVQEvaluationServiceMc.LJ();
        }
    }

    @Override // X.C1455870nzN
    public void H2(AbstractC1452680nuE abstractC1452680nuE, C1450120nq6 c1450120nq6) {
        if (C1458070o2v.LJFF()) {
            AbstractC1452680nuE abstractC1452680nuEGc = gc();
            if (abstractC1452680nuEGc != null) {
                C391360FWc.LIZIZ(abstractC1452680nuEGc, "", abstractC1452680nuEGc.LJIJ(), new AwS388S0200000_22(abstractC1452680nuEGc, c1450120nq6, 155));
                return;
            }
            return;
        }
        super.H2(abstractC1452680nuE, c1450120nq6);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean JA2(dmt.av.video.VEPreviewMusicParams r6, java.util.List<? extends dmt.av.video.VEPreviewMusicParams> r7) {
        /*
            r5 = this;
            androidx.lifecycle.MutableLiveData<dmt.av.video.VEPreviewMusicParams> r0 = r5.R
            r0.setValue(r6)
            X.01GW r3 = X.C267890Aeh.LIZ
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            r0 = 2
            r1 = 1
            r4 = 0
            if (r2 == r0) goto L2f
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r1) goto L4e
            X.141Q r1 = X.C141Q.LIZ
            java.lang.String r0 = r6.mPath
            r1.getClass()
            boolean r0 = X.C141Q.LJII(r0)
            if (r0 == 0) goto L4e
        L2f:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4e
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r3 = X.C2296808zG.LIZ(r0)
            X.0ntI r2 = new X.0ntI
            r1 = 0
            r2.<init>(r5, r6, r7, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            return r4
        L4e:
            boolean r2 = super.JA2(r6, r7)
            X.0n1E r1 = r5.gb()
            if (r1 == 0) goto L61
            java.lang.String r0 = r6.mPath
            boolean r0 = X.C123100dR.LIZ(r0)
            r1.LLLLZI(r0)
        L61:
            androidx.lifecycle.MutableLiveData<kotlin.Unit> r1 = r5.S
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.setValue(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452090ntH.JA2(dmt.av.video.VEPreviewMusicParams, java.util.List):boolean");
    }

    @Override // X.InterfaceC1446740nke
    public void Jy0(long j, long j2) {
        this.o = j;
        this.s = j2;
    }

    public final boolean U9(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
        this.R.setValue(vEPreviewMusicParams);
        boolean zJA2 = super.JA2(vEPreviewMusicParams, list);
        InterfaceC1418580n1E interfaceC1418580n1EGb = gb();
        if (interfaceC1418580n1EGb != null) {
            interfaceC1418580n1EGb.LLLLZI(C123100dR.LIZ(vEPreviewMusicParams.mPath));
        }
        this.S.setValue(Unit.LIZ);
        return zJA2;
    }

    @Override // X.InterfaceC1446740nke
    public void Rd0(float f, float f2, float f3) {
        InterfaceC1461350o8D interfaceC1461350o8DCb = cb();
        if (interfaceC1461350o8DCb != null) {
            interfaceC1461350o8DCb.jJ(f, f2, f3);
            interfaceC1461350o8DCb.XW1(f, f2, f3);
            interfaceC1461350o8DCb.o70(f, f2, f3);
        }
        InterfaceC1452130ntL interfaceC1452130ntLNa = Na();
        if (interfaceC1452130ntLNa != null) {
            interfaceC1452130ntLNa.ih0(f, f2, f3);
        }
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            Lb().Rg2(f, f2, f3);
            Vb().jJ(f, f2, f3);
            return;
        }
        InterfaceC1461650o8h interfaceC1461650o8hOa = Oa();
        if (interfaceC1461650o8hOa != null) {
            interfaceC1461650o8hOa.Rg2(f, f2, f3);
        }
        InterfaceC1461350o8D interfaceC1461350o8DCb2 = cb();
        if (interfaceC1461350o8DCb2 == null) {
            return;
        }
        interfaceC1461350o8DCb2.jJ(f, f2, f3);
    }

    @Override // X.InterfaceC1446740nke
    public void oz1(long j, long j2, String str) {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLESegment mainSegment;
        NLEStyCanvas canvasStyle;
        CanvasBackground canvasBackground;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        InterfaceC1452170ntP value = g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            NLEModel model = nLEEditor.getModel();
            if (model != null && (mainTrack = model.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null) {
                mainSegment = nLETrackSlot.getMainSegment();
            } else {
                mainSegment = null;
            }
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment);
            if (nLESegmentVideoDynamicCast != null && (canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) != null) {
                canvasStyle.setType(NLECanvasType.GRADIENT_COLOR);
                canvasStyle.setStartColor(j);
                canvasStyle.setEndColor(j2);
                nLEEditor.commit();
                nLEEditor.done();
                CanvasVideoData canvasVideoData = dc().getCanvasVideoData();
                if (canvasVideoData != null && (canvasBackground = canvasVideoData.background) != null) {
                    canvasBackground.setFilePath(str);
                }
            }
        }
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void rt1(FilterBean filterBean, FilterBean filterBean2, float f) {
        final InterfaceC1452170ntP value;
        if (filterBean != null && filterBean2 != null) {
            InterfaceC1639870sm9 interfaceC1639870sm9Fb = Fb(dc());
            if (C1453230nv7.LJIIIZ(filterBean2, interfaceC1639870sm9Fb) && C1453230nv7.LJIIIZ(filterBean, interfaceC1639870sm9Fb) && (value = g().getValue()) != null) {
                if (this.LLILZ.LIZ.invoke().booleanValue()) {
                    InterfaceC1453220nv6 interfaceC1453220nv6 = new InterfaceC1453220nv6() { // from class: X.0ntX
                        @Override // X.InterfaceC1453220nv6
                        public final float LIZ(FilterBean filterBean3) {
                            float fLIZLLL = C1643880ssc.LIZLLL(filterBean3);
                            if (fLIZLLL == 0.0f) {
                                return value.getColorFilterIntensity(filterBean3.getFilterFolder());
                            }
                            return fLIZLLL;
                        }
                    };
                    InterfaceC358220E2q value2 = xq1().getValue();
                    if (value2 != null) {
                        ae(value, filterBean, filterBean2, f, C1453210nv5.LIZLLL(filterBean, value2.LIZ(filterBean, interfaceC1453220nv6), interfaceC1453220nv6), C1453210nv5.LIZLLL(filterBean2, value2.LIZ(filterBean2, interfaceC1453220nv6), interfaceC1453220nv6));
                        return;
                    }
                    return;
                }
                ae(value, filterBean, filterBean2, f, 0.0f, 0.0f);
            }
        }
    }

    public final void Ld(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) H3().getLayoutParams();
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.width = i3;
        layoutParams.height = i4;
        C786410Ut5.c6(H3(), layoutParams);
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void x7(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z && hc().creativeModel.imageEditModel.isVideoChildPageFromImage) {
            return;
        }
        super.x7(z, z2, z3, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1452090ntH(C1DRG c1drg, VEPreviewParams vEPreviewParams, C1449780npY c1449780npY, C1452480ntu c1452480ntu, Function1<? super C1455930nzT, Unit> function1) {
        String str;
        boolean z;
        super(c1drg, vEPreviewParams, function1, null, 8, 0 == true ? 1 : 0);
        this.LLLZLL = vEPreviewParams;
        this.LLLZLZ = c1449780npY;
        this.LLLZZ = c1452480ntu;
        this.LLLZZIL = new h0<>(Boolean.FALSE);
        this.LLZ = C452501pT.LIZIZ(new AwS566S0100000_22(c1drg, 676));
        this.LLZIL = C452501pT.LIZIZ(new AwS566S0100000_22(c1drg, 682));
        this.LLZILL = C452501pT.LIZIZ(new AwS566S0100000_22((C1452090ntH) this, 683));
        this.LLZL = C452501pT.LIZIZ(new AwS566S0100000_22((C1452090ntH) this, 679));
        this.LLZLI = C452501pT.LIZIZ(new AwS566S0100000_22((C1452090ntH) this, 685));
        this.LLZLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLZLLIL = C1664770tQJ.LIZIZ(getDiContainer(), VideoPublishEditContainerScene.class, null);
        this.LLZLLLL = C1664770tQJ.LIZIZ(getDiContainer(), C1439740nZM.class, null);
        this.LLZZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444130ngR.class, null);
        this.LLZZJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC566060MIa.class, null);
        this.LLZZLLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(224));
        this.a = C452501pT.LIZIZ(new AwS566S0100000_22((C1452090ntH) this, 671));
        this.b = C452501pT.LIZIZ(new AwS566S0100000_22((C1452090ntH) this, 678));
        this.d = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        this.f = C1664770tQJ.LIZIZ(getDiContainer(), C1456190nzt.class, null);
        this.g = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC524270KhF.class, null);
        this.h = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.i = C452501pT.LIZIZ(new AwS566S0100000_22((C1452090ntH) this, 677));
        this.j = new MutableLiveData<>();
        this.k = C452501pT.LIZIZ(new AwS566S0100000_22((C1452090ntH) this, 684));
        this.l = C1664770tQJ.LIZIZ(getDiContainer(), C1420050n3b.class, null);
        this.y = C452501pT.LIZIZ(new AwS566S0100000_22((C1452090ntH) this, 675));
        this.z = C452501pT.LIZIZ(new AwS566S0100000_22(c1drg, 688));
        this.A = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(225));
        this.B = new VEPreviewMusicParams();
        this.C = C452501pT.LIZIZ(new AwS423S0200000_22((C1452090ntH) this, c1drg, (C1DRG) 57));
        if (C298330Bmh.LIZ()) {
            str = "av_video_editor_init";
        } else {
            str = "av_video_edit";
        }
        this.D = str;
        if (dc().getVideoEditorType() == 6) {
            z = true;
        } else {
            z = false;
        }
        this.E = z;
        this.F = true;
        this.G = C452501pT.LIZIZ(new AwS566S0100000_22((C1452090ntH) this, 680));
        this.L = new MutableLiveData<>();
        this.M = new MutableLiveData<>();
        this.N = new MutableLiveData<>();
        this.f164O = new MutableLiveData<>();
        this.P = new MutableLiveData<>();
        this.Q = new C560530Lyd<>();
        this.R = new MutableLiveData<>();
        this.S = new MutableLiveData<>();
        this.T = new MutableLiveData<>();
        this.U = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.V = mutableLiveData;
        this.W = mutableLiveData;
        this.f165X = new MutableLiveData<>();
        this.f166Y = new MutableLiveData<>();
    }

    private final void Wd(FilterBean filterBean, FilterBean filterBean2, float f, float f2, float f3) {
        float fAbs;
        if (Intrinsics.LJFF(filterBean.getFilterFolder(), filterBean2.getFilterFolder())) {
            return;
        }
        if (f < 0.0f) {
            fAbs = Math.abs(f);
        } else {
            fAbs = 1 - f;
        }
        if (Math.abs(f) <= 0.05f) {
            if (f <= 0.0f) {
                fAbs = 0.0f;
            } else {
                fAbs = 1.0f;
            }
        }
        if (this.f163J == fAbs || C349760DnS.LIZ(dc(), LLZ())) {
            return;
        }
        String filterFolder = this.H;
        String filterFolder2 = this.I;
        if (filterFolder == null && filterFolder2 == null) {
            if (Intrinsics.LJFF(Ba(), filterBean.getFilterFolder())) {
                filterFolder = Ba();
            } else if (Intrinsics.LJFF(Ba(), filterBean2.getFilterFolder())) {
                filterFolder2 = Ba();
            }
        }
        if (!Intrinsics.LJFF(filterFolder, filterBean.getFilterFolder()) && filterFolder != null) {
            if (pd() && filterFolder2 != null) {
                Cb().LJFF(new String[]{filterFolder, filterFolder2}, new float[]{0.0f, 0.0f});
                this.f163J = 0.0f;
            }
            Cb().LIZLLL(Collections.singletonList(filterFolder));
            filterFolder = null;
        }
        if (!Intrinsics.LJFF(filterFolder2, filterBean2.getFilterFolder()) && filterFolder2 != null) {
            if (pd() && filterFolder != null) {
                Cb().LJFF(new String[]{filterFolder, filterFolder2}, new float[]{1.0f, 1.0f});
                this.f163J = 1.0f;
            }
            Cb().LIZLLL(Collections.singletonList(filterFolder2));
            filterFolder2 = null;
        }
        if (filterFolder == null) {
            Cb().LIZ(filterBean.getFilterFolder(), Collections.singletonList(new Pair("Filter_intensity", Float.valueOf(f2))), filterBean.getCategoryKey(), filterBean.getName(), filterBean.getId(), filterBean.getResId(), null, f2, false);
            LJJJLIIL().creativeModel.commonMobModel.editPageFuncTracking.isFilterFuncUsed = true;
            filterFolder = filterBean.getFilterFolder();
        }
        if (filterFolder2 == null) {
            Cb().LIZ(filterBean2.getFilterFolder(), Collections.singletonList(new Pair("Filter_intensity", Float.valueOf(f3))), filterBean.getCategoryKey(), filterBean.getName(), filterBean.getId(), filterBean2.getResId(), null, f3, false);
            LJJJLIIL().creativeModel.commonMobModel.editPageFuncTracking.isFilterFuncUsed = true;
            filterFolder2 = filterBean2.getFilterFolder();
        }
        if (filterFolder != null && filterFolder2 != null) {
            Cb().LJFF(new String[]{filterFolder, filterFolder2}, new float[]{fAbs, fAbs});
        }
        if (fAbs == 0.0f) {
            if (filterFolder != null) {
                Cb().LIZLLL(Collections.singletonList(filterFolder));
                filterFolder = null;
            }
            AbstractC1452680nuE abstractC1452680nuEGc = gc();
            if (abstractC1452680nuEGc != null) {
                abstractC1452680nuEGc.LJJIIZI = filterBean2;
            }
            Cb().LJ(null, filterBean2, f3, false);
        }
        if (fAbs == 1.0f) {
            if (filterFolder2 != null) {
                Cb().LIZLLL(Collections.singletonList(filterFolder2));
                filterFolder2 = null;
            }
            AbstractC1452680nuE abstractC1452680nuEGc2 = gc();
            if (abstractC1452680nuEGc2 != null) {
                abstractC1452680nuEGc2.LJJIIZI = filterBean;
            }
            Cb().LJ(null, filterBean, f2, false);
        }
        this.H = filterFolder;
        this.I = filterFolder2;
        this.f163J = fAbs;
    }

    private final void ae(InterfaceC1452170ntP interfaceC1452170ntP, FilterBean filterBean, FilterBean filterBean2, float f, float f2, float f3) {
        float fAbs;
        C348100Dkm c348100DkmLIZIZ;
        C348100Dkm c348100DkmLIZIZ2;
        if (filterBean != null && filterBean2 != null) {
            boolean zLJ = C1643880ssc.LJ(filterBean);
            boolean zLJ2 = C1643880ssc.LJ(filterBean2);
            C348100Dkm c348100DkmLIZIZ3 = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ3 != null) {
                if (zLJ && zLJ2) {
                    if (c348100DkmLIZIZ3.LJII().LIZIZ() != null) {
                        c348100DkmLIZIZ3.LJII().LJJJ(null);
                    }
                    Wd(filterBean, filterBean2, f, f2, f3);
                    return;
                }
                if (c348100DkmLIZIZ3.LJ().LIZIZ() != null) {
                    c348100DkmLIZIZ3.LJ().LJIJ(null, true, false);
                }
                if (f < 0.0f) {
                    fAbs = Math.abs(f);
                } else {
                    fAbs = 1 - f;
                }
                if (f2 != 0.0f && f3 != 0.0f) {
                    C348290Dl5 c348290Dl5 = new C348290Dl5(EnumC356230Dxt.COLOR_NO_COMPOSER);
                    c348290Dl5.LIZIZ = filterBean.getFilterFolder();
                    c348290Dl5.LJ = filterBean2.getFilterFolder();
                    c348290Dl5.LJI = fAbs;
                    c348290Dl5.LIZLLL = true;
                    c348290Dl5.LIZJ = f2;
                    c348290Dl5.LJII = filterBean.getResId();
                    c348290Dl5.LJFF = f3;
                    InterfaceC1452170ntP interfaceC1452170ntPO4 = O4();
                    if (interfaceC1452170ntPO4 != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntPO4)) != null) {
                        c348100DkmLIZIZ2.LJII().LJJJ(c348290Dl5);
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C348290Dl5 c348290Dl52 = new C348290Dl5(EnumC356230Dxt.COLOR_NO_COMPOSER);
                c348290Dl52.LIZJ = f2;
                c348290Dl52.LJFF = f3;
                c348290Dl52.LIZIZ = filterBean.getFilterFolder();
                c348290Dl52.LJ = filterBean2.getFilterFolder();
                c348290Dl52.LJI = fAbs;
                c348290Dl52.LJII = filterBean.getResId();
                InterfaceC1452170ntP interfaceC1452170ntPO42 = O4();
                if (interfaceC1452170ntPO42 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPO42)) != null) {
                    c348100DkmLIZIZ.LJII().LJJJ(c348290Dl52);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
