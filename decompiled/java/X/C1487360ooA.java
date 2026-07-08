package X;

import Y.AObjectS397S0100000_23;
import Y.ARunnableS123S0100000_23;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ooA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487360ooA implements InterfaceC1528040prm {
    public InterfaceC1483670oiD LIZ;
    public C1487450ooJ LIZIZ;
    public boolean LJ;
    public long LJFF;
    public boolean LJI;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final C1487420ooG LIZJ = new C1487420ooG();
    public final C1487390ooD LIZLLL = new C1487390ooD();
    public boolean LJII = true;
    public final BPEAHandler LJIIJJI = new BPEAHandler(Looper.getMainLooper());
    public final AObjectS397S0100000_23 LJIIL = new AObjectS397S0100000_23(this, 12);
    public final C1487350oo9 LJIILIIL = new OnUIPlayListener() { // from class: X.0oo9
        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
            return C583620Mum.LIZ(this);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBrightnessChanged(String str, float f) {
            C583620Mum.LIZIZ(this, str, f);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
            C583620Mum.LIZJ(this, str, j, i);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
            C583620Mum.LIZLLL(this, str, j);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBuffering(String str, boolean z) {
            C583620Mum.LJ(this, str, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onBuffering(boolean z) {
            C583620Mum.LJI(this, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
            C583620Mum.LJII(this, str, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onCrosstalkHappened(String str) {
            C583620Mum.LJIIIIZZ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
            C583620Mum.LJIIIZ(this, str, list);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
            C583620Mum.LJIIJ(this, str, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onDecoderBuffering(boolean z) {
            C583620Mum.LJIIL(this, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
            C583620Mum.LJIILIIL(this, i, j, j2, map);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            C583620Mum.LJIILJJIL(this, str, c1480420ocy);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onLoopPlay(String str, int i) {
            C583620Mum.LJIILL(this, str, i);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
            C583620Mum.LJIILLIIL(this, str, c1480290ocl);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPausePlay(String str) {
            C583620Mum.LJIIZILJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
            C583620Mum.LJIJ(this, str, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayCompleted(String str, int i) {
            C583620Mum.LJIJJ(this, str, i);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
            C583620Mum.LJIJJLI(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            C583620Mum.LJIL(this, str, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
            C583620Mum.LJJIFFI(this, c1481290oeN);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
            C583620Mum.LJJ(this, str, c1481290oeN);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
            C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayPrepare(String str) {
            C583620Mum.LJJIII(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayPrepared(String str) {
            C583620Mum.LJJIIJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayProgressChange(float f) {
            C583620Mum.LJJIIJZLJL(this, f);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
            C583620Mum.LJJIIZ(this, str, j, j2);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayStop(String str) {
            C583620Mum.LJJIJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
            C583620Mum.LJJIJIIJI(this, str, jSONObject);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayStop(String str, boolean z) {
            C583620Mum.LJJIJIL(this, str, z);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
            C583620Mum.LJJIJL(this, str, i, jSONObject);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
            C583620Mum.LJJIL(this, str, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPreRenderSessionMissed(String str) {
            C583620Mum.LJJIZ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPreparePlay(String str) {
            C583620Mum.LJJJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            C583620Mum.LJJJI(this, str, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
            C583620Mum.LJJJJ(this, c1480420ocy);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            C583620Mum.LJJJIL(this, str, c1480420ocy);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
            C583620Mum.LJJJJI(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
            C583620Mum.LJJJJIZL(this, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onResumePlay(String str) {
            C583620Mum.LJJJJJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
            C583620Mum.LJJJJJL(this, str, c1480430ocz);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
            C583620Mum.LJJJJLI(this, c1481290oeN);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onSeekStart(String str, int i, float f) {
            C583620Mum.LJJJJZ(this, str, i, f);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onSpeedChanged(String str, float f) {
            C583620Mum.LJJJJZI(this, str, f);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onStopPlay(String str) {
            C583620Mum.LJJJLIIL(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
            C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onVideoSecondFrame(String str) {
            C583620Mum.LJJJLZIJ(this, str);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
            C583620Mum.LJJJZ(this, str, i, i2);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str) {
            InterfaceC1483670oiD interfaceC1483670oiD = this.LL.LIZ;
            if (interfaceC1483670oiD != null) {
                interfaceC1483670oiD.seek(0.0f);
            }
            this.LL.LIZJ(6);
            C1487360ooA c1487360ooA = this.LL;
            c1487360ooA.LJII = false;
            c1487360ooA.LJ = false;
            c1487360ooA.LJIIIIZZ = true;
            c1487360ooA.LJIIIZ = false;
            c1487360ooA.LJIIJJI.removeCallbacksAndMessages(c1487360ooA.LJIIL);
            C1487450ooJ c1487450ooJ = this.LL.LIZIZ;
            if (c1487450ooJ != null) {
                c1487450ooJ.LIZIZ(2, 0L);
            }
            this.LL.LJIIJ = false;
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayPause(String str) {
            C1487360ooA c1487360ooA = this.LL;
            c1487360ooA.LJII = false;
            if (!c1487360ooA.LJIIIIZZ) {
                C1487360ooA.LJFF(c1487360ooA, 2, null, 2);
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayRelease(String str) {
            C1487450ooJ c1487450ooJ = this.LL.LIZIZ;
            if (c1487450ooJ != null) {
                c1487450ooJ.LJIIJJI(4);
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlaying(String str) {
            C1487360ooA c1487360ooA = this.LL;
            c1487360ooA.LJII = true;
            C1487360ooA.LJFF(c1487360ooA, 3, null, 2);
            this.LL.LJIIIIZZ = false;
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRetryOnError(String str, C1481290oeN c1481290oeN) {
            C1487450ooJ c1487450ooJ = this.LL.LIZIZ;
            if (c1487450ooJ != null) {
                c1487450ooJ.LJI(7);
            }
            C1487360ooA c1487360ooA = this.LL;
            c1487360ooA.LJII = false;
            c1487360ooA.LJ = false;
            c1487360ooA.LJIIIIZZ = true;
            C1487450ooJ c1487450ooJ2 = c1487360ooA.LIZIZ;
            if (c1487450ooJ2 != null) {
                c1487450ooJ2.LIZIZ(2, 0L);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onSeekEnd(java.lang.String r10, boolean r11) {
            /*
                r9 = this;
                X.0ooA r1 = r9.LL
                boolean r0 = r1.LJ
                if (r0 == 0) goto L4c
                X.0oiD r0 = r1.LIZ
                r7 = 0
                if (r0 == 0) goto L68
                X.0of5 r0 = r0.LJIIIZ()
                if (r0 == 0) goto L68
                long r5 = r0.getCurrentPosition()
            L16:
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                r4 = 1
                if (r0 <= 0) goto L29
                X.0ooA r3 = r9.LL
                long r1 = r3.LJFF
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 != 0) goto L29
                boolean r0 = r3.LJIIIIZZ
                if (r0 != 0) goto L2a
                r3.LJIIJ = r4
            L29:
                r7 = r5
            L2a:
                X.0ooA r3 = r9.LL
                boolean r0 = r3.LJIIIZ
                if (r0 == 0) goto L5f
                long r1 = r3.LJFF
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 == 0) goto L5f
                boolean r0 = r3.isPlaying()
                if (r0 == 0) goto L5d
                r0 = 3
            L3d:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                java.lang.Long r1 = java.lang.Long.valueOf(r7)
                X.0ooJ r0 = r3.LIZIZ
                if (r0 == 0) goto L4c
                r0.LIZIZ(r2, r1)
            L4c:
                X.0ooA r0 = r9.LL
                r2 = 0
                r0.LJIIIZ = r2
                com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = r0.LJIIJJI
                Y.AObjectS397S0100000_23 r0 = r0.LJIIL
                r1.removeCallbacksAndMessages(r0)
                X.0ooA r0 = r9.LL
                r0.LJ = r2
                return
            L5d:
                r0 = 2
                goto L3d
            L5f:
                java.lang.Long r1 = java.lang.Long.valueOf(r7)
                r0 = 0
                X.C1487360ooA.LJFF(r3, r0, r1, r4)
                goto L4c
            L68:
                r5 = 0
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1487350oo9.onSeekEnd(java.lang.String, boolean):void");
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            if (z) {
                C1487360ooA c1487360ooA = this.LL;
                if (c1487360ooA.LJII) {
                    c1487360ooA.LJIIJJI.removeCallbacksAndMessages(c1487360ooA.LJIIL);
                    C1487360ooA c1487360ooA2 = this.LL;
                    C786410Ut5.LJLIIL(150L, c1487360ooA2.LJIIJJI, new ARunnableS123S0100000_23(c1487360ooA2.LJIIL, 66));
                }
            } else {
                C1487360ooA c1487360ooA3 = this.LL;
                if (c1487360ooA3.LJIIIZ) {
                    if (c1487360ooA3.LJII) {
                        if (c1487360ooA3.LJ) {
                            C1487360ooA.LJFF(c1487360ooA3, 3, null, 2);
                        } else {
                            Long lValueOf = Long.valueOf(this.LL.getCurrentPosition());
                            C1487450ooJ c1487450ooJ = c1487360ooA3.LIZIZ;
                            if (c1487450ooJ != null) {
                                c1487450ooJ.LIZIZ(3, lValueOf);
                            }
                        }
                    } else {
                        C1487360ooA.LJFF(c1487360ooA3, 2, null, 2);
                    }
                }
            }
            C1487360ooA c1487360ooA4 = this.LL;
            c1487360ooA4.LJIIIZ = z;
            if (!z) {
                c1487360ooA4.LJIIJJI.removeCallbacksAndMessages(c1487360ooA4.LJIIL);
            }
        }
    };

    @Override // X.InterfaceC1528040prm
    public final float LIZ() {
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZ;
        if (interfaceC1483670oiD == null || (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ()) == null) {
            return 1.0f;
        }
        return interfaceC1481730of5LJIIIZ.getSpeed();
    }

    @Override // X.InterfaceC1528040prm
    public final long getCurrentPosition() {
        InterfaceC1483670oiD interfaceC1483670oiD;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        if (this.LJIIIIZZ || (interfaceC1483670oiD = this.LIZ) == null || (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ()) == null) {
            return 0L;
        }
        return interfaceC1481730of5LJIIIZ.getCurrentPosition();
    }

    @Override // X.InterfaceC1528040prm
    public final boolean isLoading() {
        InterfaceC1484080ois playState;
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZ;
        return (interfaceC1483670oiD == null || (playState = interfaceC1483670oiD.getPlayState()) == null || !playState.isLoading()) ? false : true;
    }

    @Override // X.InterfaceC1528040prm
    public final boolean isPlaying() {
        InterfaceC1484080ois playState;
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZ;
        return (interfaceC1483670oiD == null || (playState = interfaceC1483670oiD.getPlayState()) == null || !playState.isPlaying()) ? false : true;
    }

    @Override // X.InterfaceC1528040prm
    public final void LIZIZ() {
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        long currentPosition = getCurrentPosition();
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZ;
        if (interfaceC1483670oiD == null || (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ()) == null) {
            return;
        }
        long duration = interfaceC1481730of5LJIIIZ.getDuration();
        if (duration > 0) {
            float f = ((currentPosition - 10000 >= 0 ? r6 : 0L) * 100.0f) / duration;
            if (!isPlaying()) {
                LJ(4);
            }
            InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZ;
            if (interfaceC1483670oiD2 != null) {
                interfaceC1483670oiD2.seek(f);
            }
            this.LJ = true;
        }
    }

    @Override // X.InterfaceC1528040prm
    public final void LIZLLL() {
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        long currentPosition = getCurrentPosition();
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZ;
        if (interfaceC1483670oiD == null || (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ()) == null) {
            return;
        }
        long duration = interfaceC1481730of5LJIIIZ.getDuration();
        if (duration > 0) {
            long j = currentPosition + 10000;
            if (j > duration) {
                j = duration;
            }
            float f = (j * 100.0f) / duration;
            if (!isPlaying() && j != duration) {
                LJ(4);
            }
            InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZ;
            if (interfaceC1483670oiD2 != null) {
                interfaceC1483670oiD2.seek(f);
            }
            this.LJ = true;
        }
    }

    @Override // X.InterfaceC1528040prm
    public final void LIZJ(int i) {
        C1487450ooJ c1487450ooJ = this.LIZIZ;
        if (c1487450ooJ != null) {
            c1487450ooJ.LJI(i);
        }
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.pause();
        }
    }

    @Override // X.InterfaceC1528040prm
    public final void LJ(int i) {
        InterfaceC1483670oiD interfaceC1483670oiD;
        C1487450ooJ c1487450ooJ = this.LIZIZ;
        if (c1487450ooJ != null) {
            c1487450ooJ.LIZLLL(i);
        }
        if (this.LJIIJ && (interfaceC1483670oiD = this.LIZ) != null) {
            interfaceC1483670oiD.seek(0.0f);
        }
        InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZ;
        if (interfaceC1483670oiD2 != null) {
            interfaceC1483670oiD2.resume();
        }
        C1487420ooG c1487420ooG = this.LIZJ;
        if (!c1487420ooG.LIZ) {
            C582130MsN.LIZ().LJ().getClass();
            C1484570ojf.LJ().LJIIIIZZ(c1487420ooG, null, null);
        }
    }

    @Override // X.InterfaceC1528040prm
    public final void LJIIJ(long j) {
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZ;
        if (interfaceC1483670oiD != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ()) != null) {
            long duration = interfaceC1481730of5LJIIIZ.getDuration();
            if (duration > 0) {
                if (j < 0) {
                    j = 0;
                }
                if (j > duration) {
                    j = duration;
                }
                float f = (j * 100.0f) / duration;
                if (!isPlaying() && j != duration) {
                    LJ(4);
                }
                InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZ;
                if (interfaceC1483670oiD2 != null) {
                    interfaceC1483670oiD2.seek(f);
                }
                this.LJ = true;
            }
        }
    }

    public static void LJFF(C1487360ooA c1487360ooA, Integer num, Long l, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        C1487450ooJ c1487450ooJ = c1487360ooA.LIZIZ;
        if (c1487450ooJ != null) {
            c1487450ooJ.LIZIZ(num, l);
        }
    }
}
