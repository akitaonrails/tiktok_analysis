package X;

import Y.ARunnableS101S0200000_32;
import Y.ARunnableS28S1100000_23;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21386118mh extends AbstractC21386218mi {
    public final C21385918mf LJIIL;
    public final C21385718md LJIILIIL = new InterfaceC1482530ogN() { // from class: X.18md
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
        public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayCompleted(String str, int i) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
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
        public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
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
        public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void uv(JSONObject jSONObject) {
        }

        public final void LIZ(String str) {
            String sourceId;
            if (!TextUtils.isEmpty(str)) {
                InterfaceC21386618mm interfaceC21386618mm = this.LL.LJI;
                if (interfaceC21386618mm != null) {
                    sourceId = interfaceC21386618mm.getSourceId();
                } else {
                    sourceId = null;
                }
                if (Intrinsics.LJFF(sourceId, str)) {
                    C21386118mh c21386118mh = this.LL;
                    InterfaceC21386618mm interfaceC21386618mm2 = c21386118mh.LJI;
                    if (interfaceC21386618mm2 != null) {
                        c21386118mh.LJIIIZ();
                        interfaceC21386618mm2.LIZIZ();
                    }
                    InterfaceC21386618mm interfaceC21386618mm3 = this.LL.LJI;
                    if (interfaceC21386618mm3 != null) {
                        interfaceC21386618mm3.LJI();
                    }
                    C786410Ut5.LJLLLLLL(8, this.LL.LJFF());
                }
            }
        }

        @Override // X.InterfaceC1482530ogN
        public final void onVideoSecondFrame(String str) {
            C21385918mf c21385918mf = this.LL.LJIIL;
            if (c21385918mf != null && c21385918mf.LIZIZ) {
                LIZ(str);
            }
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            ExecutorService executorService;
            if (C1474810oTv.LJLL() && (executorService = C1475000oUE.LIZLLL) != null) {
                executorService.execute(new ARunnableS28S1100000_23(this.LL, str, 29));
            }
        }

        @Override // X.InterfaceC1482530ogN
        public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            C21385918mf c21385918mf = this.LL.LJIIL;
            if (c21385918mf == null || !c21385918mf.LIZIZ) {
                LIZ(str);
            }
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            String sourceId;
            if (!TextUtils.isEmpty(str)) {
                InterfaceC21386618mm interfaceC21386618mm = this.LL.LJI;
                if (interfaceC21386618mm != null) {
                    sourceId = interfaceC21386618mm.getSourceId();
                } else {
                    sourceId = null;
                }
                if (Intrinsics.LJFF(sourceId, str)) {
                    C21386118mh c21386118mh = this.LL;
                    c21386118mh.LJIILL(c21386118mh.LJI);
                }
            }
        }
    };

    @Override // X.AbstractC21386218mi
    public final void LJIILIIL() {
        C714880S2k c714880S2kLIZIZ;
        InterfaceC1484830ok5 player;
        InterfaceC690370R6d interfaceC690370R6d = this.LJ;
        if (interfaceC690370R6d == null || (c714880S2kLIZIZ = interfaceC690370R6d.LIZIZ()) == null || (player = c714880S2kLIZIZ.getPlayer()) == null) {
            return;
        }
        player.LJIIZILJ(this.LJIILIIL);
    }

    public final void LJIILLIIL() {
        C714880S2k c714880S2kLIZIZ;
        InterfaceC1484830ok5 player;
        InterfaceC690370R6d interfaceC690370R6d = this.LJ;
        if (interfaceC690370R6d == null || (c714880S2kLIZIZ = interfaceC690370R6d.LIZIZ()) == null || (player = c714880S2kLIZIZ.getPlayer()) == null) {
            return;
        }
        player.LJJIIZ(this.LJIILIIL);
    }

    @Override // X.C0S34, X.C0S3C
    public final void LJII() {
        C1322090kVb c1322090kVb;
        View viewLJFF = LJFF();
        if ((viewLJFF instanceof SmartImageView) && (c1322090kVb = (C1322090kVb) viewLJFF) != null) {
            c1322090kVb.setImageBitmap(null);
        }
        LJIILLIIL();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.18md] */
    public C21386118mh(C21385918mf c21385918mf) {
        this.LJIIL = c21385918mf;
    }

    @Override // X.AbstractC21386218mi
    public final void LJIIJ(InterfaceC21386618mm interfaceC21386618mm) {
        ExecutorService executorService;
        View viewLJFF;
        if (interfaceC21386618mm != null) {
            interfaceC21386618mm.getSourceId();
            C21386818mo c21386818moLIZJ = interfaceC21386618mm.LIZJ();
            if (c21386818moLIZJ != null) {
                Drawable drawable = c21386818moLIZJ.LIZ;
                if (drawable != null && (viewLJFF = LJFF()) != null) {
                    viewLJFF.setBackground(drawable);
                }
                KeyEvent.Callback callbackLJIIIZ = LJIIIZ();
                if (callbackLJIIIZ instanceof SmartImageView) {
                    int i = c21386818moLIZJ.LIZIZ;
                    if (i != -1) {
                        ((SmartImageView) callbackLJIIIZ).setPlaceholderImage(i);
                    }
                    Drawable drawable2 = c21386818moLIZJ.LIZJ;
                    if (drawable2 != null) {
                        ((SmartImageView) callbackLJIIIZ).setPlaceholderImage(drawable2);
                    }
                    if (c21386818moLIZJ instanceof C21386918mp) {
                        ((C1322090kVb) callbackLJIIIZ).setImageBitmap(((C21386918mp) c21386818moLIZJ).LJ);
                        this.LJIIIIZZ = 2;
                        return;
                    }
                    if (c21386818moLIZJ instanceof C0R6D) {
                        ((C1322110kVd) callbackLJIIIZ).setImageURI(((C0R6D) c21386818moLIZJ).LJ);
                        this.LJIIIIZZ = 2;
                        return;
                    }
                    if (!(c21386818moLIZJ instanceof C21386418mk)) {
                        return;
                    }
                    C21386418mk c21386418mk = (C21386418mk) c21386818moLIZJ;
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(c21386418mk.LJFF);
                    Uri uri = c21386418mk.LJ;
                    if (uri != null) {
                        c1331670kl3LJIIIIZZ = C1331660kl2.LJI(uri);
                    }
                    Pair<Integer, Integer> pair = c21386418mk.LJIIIZ;
                    if (pair != null) {
                        c1331670kl3LJIIIIZZ.LJJIJ(new int[]{pair.getFirst().intValue(), pair.getSecond().intValue()});
                    }
                    c1331670kl3LJIIIIZZ.LIZLLL("MediaBoxCoverPresenter");
                    c1331670kl3LJIIIIZZ.LJJIII = c21386418mk.LJI;
                    c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) callbackLJIIIZ);
                    c1331670kl3LJIIIIZZ.LJJIIZ = c21386418mk.LJIIJ;
                    c1331670kl3LJIIIIZZ.LJIIJ(c21386418mk.LJII);
                    if (!C1474810oTv.LJLL() || (executorService = C1475000oUE.LIZLLL) == null) {
                        return;
                    }
                    executorService.execute(new ARunnableS101S0200000_32(this, interfaceC21386618mm, 53));
                }
            }
        }
    }

    @Override // X.AbstractC21386218mi
    public final void LJIILJJIL(InterfaceC690390R6f interfaceC690390R6f) {
        C0S3E c0s3e;
        InterfaceC21386618mm interfaceC21386618mm = this.LJI;
        if (interfaceC21386618mm != null) {
            interfaceC21386618mm.getSourceId();
            interfaceC21386618mm.LJIIIIZZ();
        } else if ((interfaceC690390R6f instanceof C0S3E) && (c0s3e = (C0S3E) interfaceC690390R6f) != null) {
            c0s3e.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    @Override // X.AbstractC21386218mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILL(X.InterfaceC21386618mm r7) {
        /*
            r6 = this;
            r5 = 1
            r3 = 0
            if (r7 == 0) goto L22
            r7.getSourceId()
            boolean r0 = r7.LJFF()
            if (r0 != r5) goto L22
            r0 = 1
        Le:
            r4 = 3
            if (r0 == 0) goto L24
            android.view.View r1 = r6.LJFF()
            if (r1 == 0) goto L1c
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L1c:
            r6.LJIIIIZZ = r4
            r6.LJIIJJI()
            return r3
        L22:
            r0 = 0
            goto Le
        L24:
            X.0R6d r0 = r6.LJ
            if (r0 == 0) goto L61
            X.0S2k r0 = r0.LIZIZ()
            if (r0 == 0) goto L61
            X.0ok5 r2 = r0.getPlayer()
            if (r2 == 0) goto L61
            X.0oho r0 = r2.LJIIIZ()
            r1 = 0
            if (r0 == 0) goto L5f
            X.0obV r0 = r0.LIZJ()
            if (r0 == 0) goto L5f
            java.lang.String r0 = r0.LJIIIZ
        L43:
            if (r7 == 0) goto L49
            java.lang.String r1 = r7.getSourceId()
        L49:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L61
            X.0oiV r0 = r2.getPlayState()
            boolean r0 = r0.LJJIJIIJIL()
            if (r0 != 0) goto L61
            r6.LJIIJJI()
            r6.LJIIIIZZ = r4
            return r3
        L5f:
            r0 = r1
            goto L43
        L61:
            if (r7 == 0) goto L6c
            r6.LJIIIZ()
            r7.LJIIIZ()
            r7.LJ()
        L6c:
            android.view.View r0 = r6.LJFF()
            if (r0 == 0) goto L75
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L75:
            r6.LJIIL()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21386118mh.LJIILL(X.18mm):boolean");
    }
}
