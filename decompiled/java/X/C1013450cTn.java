package X;

import android.view.Surface;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013450cTn implements InterfaceC1010530cP5 {
    public static final /* synthetic */ int LLILZLL = 0;
    public final InterfaceC1013490cTr LL;
    public InterfaceC1484830ok5 LLILLJJLI;
    public final C1482560ogQ LLILLL;
    public final C1013470cTp LLILZ;
    public final C1013500cTs LLILZIL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final int LIZ() {
        InterfaceC1483420oho interfaceC1483420ohoLJIIIZ;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLJJLI;
        if (interfaceC1484830ok5 == null || (interfaceC1483420ohoLJIIIZ = interfaceC1484830ok5.LJIIIZ()) == null) {
            return 0;
        }
        return (int) interfaceC1483420ohoLJIIIZ.getCurrentPosition();
    }

    public final boolean LIZIZ() {
        InterfaceC1483850oiV playState;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLJJLI;
        if (interfaceC1484830ok5 == null || (playState = interfaceC1484830ok5.getPlayState()) == null) {
            return false;
        }
        return playState.isPlaying();
    }

    public final void LIZJ() {
        if (this.LLILLJJLI != null) {
            return;
        }
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
        interfaceC1484830ok5LIZJ.LJIIZILJ(this.LLILZIL);
        this.LLILLJJLI = interfaceC1484830ok5LIZJ;
    }

    public final void LIZLLL() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLJJLI;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.resume();
        }
    }

    public final void LJ() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLJJLI;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.stop();
        }
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0cTp] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0cTs, X.0ogN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C1013450cTn(C1013380cTg c1013380cTg) {
        this.LL = c1013380cTg;
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        this.LLILLJJLI = C582130MsN.LIZ().LIZJ(c1478410oZj);
        this.LLILLL = C1018190cbR.LIZ(c1013380cTg.LIZ, c1013380cTg.LJ(), c1013380cTg.LIZIZ);
        this.LLILZ = new InterfaceC1483820oiS() { // from class: X.0cTp
            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ boolean bn() {
                return true;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ Surface getSurface() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void hj() {
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void pe() {
            }

            @Override // X.InterfaceC1483820oiS
            public final HashMap getParams() {
                return new HashMap();
            }

            @Override // X.InterfaceC1483820oiS
            public final FrameLayout getPlayViewContainer() {
                return this.LL.LL.M4();
            }
        };
        ?? r1 = new InterfaceC1482530ogN() { // from class: X.0cTs
            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Au(Surface surface) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void VK() {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void W1(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLoopPlay(String str, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPause(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepare(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayRelease(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
            public final /* synthetic */ void onPreRenderReady(String str) {
                C490850JMt.LIZ(this, str);
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekStart(String str, int i, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onStopPlay(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSecondFrame(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
                C1013450cTn c1013450cTn = this.LL;
                c1013450cTn.LL.LIZ(c1013450cTn.LIZ());
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i) {
                C1013450cTn c1013450cTn = this.LL;
                InterfaceC1484830ok5 interfaceC1484830ok5 = c1013450cTn.LLILLJJLI;
                if (interfaceC1484830ok5 != null) {
                    interfaceC1484830ok5.stop();
                }
                InterfaceC1484830ok5 interfaceC1484830ok52 = c1013450cTn.LLILLJJLI;
                if (interfaceC1484830ok52 != null) {
                    interfaceC1484830ok52.release();
                }
                c1013450cTn.LLILLJJLI = null;
                this.LL.LL.LIZIZ();
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                this.LL.LL.onStart();
            }

            @Override // X.InterfaceC1482530ogN
            public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C1013450cTn c1013450cTn = this.LL;
                c1013450cTn.LL.LIZJ(c1013450cTn.LIZ());
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                this.LL.LL.LIZLLL(c1481290oeN);
            }
        };
        this.LLILZIL = r1;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLJJLI;
        if (interfaceC1484830ok5 != 0) {
            interfaceC1484830ok5.LJIIZILJ(r1);
        }
    }
}
