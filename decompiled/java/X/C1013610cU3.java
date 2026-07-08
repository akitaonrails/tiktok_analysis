package X;

import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cU3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013610cU3 implements InterfaceC1010530cP5 {
    public static final /* synthetic */ int LLIZ = 0;
    public final InterfaceC1013520cTu LL;
    public final boolean LLILLJJLI;
    public InterfaceC1484830ok5 LLILLL;
    public final C1482560ogQ LLILZ;
    public final C1013600cU2 LLILZIL;
    public final C1013590cU1 LLILZLL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final int LIZ() {
        InterfaceC1483420oho interfaceC1483420ohoLJIIIZ;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 == null || (interfaceC1483420ohoLJIIIZ = interfaceC1484830ok5.LJIIIZ()) == null) {
            return 0;
        }
        return (int) interfaceC1483420ohoLJIIIZ.getCurrentPosition();
    }

    public final int LIZIZ() {
        InterfaceC1483420oho interfaceC1483420ohoLJIIIZ;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 == null || (interfaceC1483420ohoLJIIIZ = interfaceC1484830ok5.LJIIIZ()) == null) {
            return 0;
        }
        return interfaceC1483420ohoLJIIIZ.LJJIJIL();
    }

    public final boolean LIZJ() {
        InterfaceC1483850oiV playState;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 == null || (playState = interfaceC1484830ok5.getPlayState()) == null) {
            return false;
        }
        return playState.isPlaying();
    }

    public final void LIZLLL() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.pause();
        }
    }

    public final void LJFF() {
        if (this.LLILLL != null) {
            return;
        }
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
        interfaceC1484830ok5LIZJ.LJIIZILJ(this.LLILZLL);
        this.LLILLL = interfaceC1484830ok5LIZJ;
    }

    public final void LJI() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.stop();
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLILLL;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.release();
        }
        this.LLILLL = null;
    }

    public final void LJIIIIZZ() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.resume();
        }
    }

    public final void LJ() {
        Object next;
        LJFF();
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LIZJ(this.LLILZIL);
        }
        Iterator<View> it2 = new C09RD(this.LL.M4()).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                next = null;
                break;
            } else {
                next = c09re.next();
                if (next instanceof TextureView) {
                    break;
                }
            }
        }
        TextureView textureView = (TextureView) next;
        if (textureView != null) {
            textureView.setOpaque(false);
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLILLL;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.LJ(this.LLILZ);
        }
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0cU2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0cU1, X.0ogN] */
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
    public C1013610cU3(C1018330cbf c1018330cbf, boolean z) {
        this.LL = c1018330cbf;
        this.LLILLJJLI = z;
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        this.LLILLL = C582130MsN.LIZ().LIZJ(c1478410oZj);
        this.LLILZ = C1018490cbv.LIZ(c1018330cbf.LIZ, c1018330cbf.LJFF());
        this.LLILZIL = new InterfaceC1483820oiS() { // from class: X.0cU2
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
        ?? r1 = new InterfaceC1482530ogN() { // from class: X.0cU1
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
            public final /* synthetic */ void onBuffering(String str, boolean z2, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z2, C1480430ocz c1480430ocz) {
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
            public final /* synthetic */ void onSeekEnd(String str, boolean z2) {
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
                C1013610cU3 c1013610cU3 = this.LL;
                c1013610cU3.LL.LIZ(c1013610cU3.LIZ());
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i) {
                C1013610cU3 c1013610cU3 = this.LL;
                if (c1013610cU3.LLILLJJLI) {
                    C1022620cia.LIZ("VideoPlayerModule", "onPlayCompleted, repeat enabled -> replay");
                    this.LL.LJFF();
                    C1013610cU3 c1013610cU32 = this.LL;
                    InterfaceC1484830ok5 interfaceC1484830ok5 = c1013610cU32.LLILLL;
                    if (interfaceC1484830ok5 != null) {
                        interfaceC1484830ok5.LIZJ(c1013610cU32.LLILZIL);
                    }
                    C1013610cU3 c1013610cU33 = this.LL;
                    InterfaceC1484830ok5 interfaceC1484830ok52 = c1013610cU33.LLILLL;
                    if (interfaceC1484830ok52 != null) {
                        interfaceC1484830ok52.LJ(c1013610cU33.LLILZ);
                        return;
                    }
                    return;
                }
                c1013610cU3.LL.LIZIZ();
                C1022620cia.LIZ("VideoPlayerModule", "onPlayCompleted");
                this.LL.LJI();
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                long j;
                InterfaceC1013520cTu interfaceC1013520cTu = this.LL.LL;
                if (c1480430ocz != null) {
                    j = c1480430ocz.LIZJ;
                } else {
                    j = 0;
                }
                interfaceC1013520cTu.LJ(j);
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                this.LL.LL.onStart();
                C1022620cia.LIZ("VideoPlayerModule", "onRenderFirstFrame");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C1013610cU3 c1013610cU3 = this.LL;
                c1013610cU3.LL.LIZJ(c1013610cU3.LIZ());
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                Integer numValueOf;
                InterfaceC1013520cTu interfaceC1013520cTu = this.LL.LL;
                Integer numValueOf2 = null;
                if (c1481290oeN != null) {
                    numValueOf = Integer.valueOf(c1481290oeN.LJ);
                } else {
                    numValueOf = null;
                }
                interfaceC1013520cTu.LIZLLL(numValueOf);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayFailed error: ");
                sbLIZ.append(c1481290oeN);
                sbLIZ.append(" errorcode:");
                if (c1481290oeN != null) {
                    numValueOf2 = Integer.valueOf(c1481290oeN.LJ);
                }
                sbLIZ.append(numValueOf2);
                sbLIZ.append(" playerEvent: ");
                sbLIZ.append(c1480430ocz);
                C1022620cia.LIZ("VideoPlayerModule", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.LLILZLL = r1;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 != 0) {
            interfaceC1484830ok5.LJIIZILJ(r1);
        }
    }
}
