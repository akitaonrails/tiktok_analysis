package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0okQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485040okQ implements InterfaceC20499215Je {
    public final String LL;
    public InterfaceC1485100okW LLILLJJLI;
    public InterfaceC1485110okX LLILLL;
    public InterfaceC1485120okY LLILZ;
    public InterfaceC1485050okR LLILZIL;
    public InterfaceC1485090okV LLILZLL;
    public InterfaceC1485080okU LLIZ;
    public C1485060okS LLIZLLLIL;
    public SimVideoUrlModel LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC1483670oiD LLJILJILJ;

    @Override // X.InterfaceC20499215Je
    public final int K2() {
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        if (!this.LLJILJIL) {
            LJII();
        }
        InterfaceC1483670oiD interfaceC1483670oiD = this.LLJILJILJ;
        if (interfaceC1483670oiD == null || (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ()) == null) {
            return 0;
        }
        return (int) interfaceC1481730of5LJIIIZ.getDuration();
    }

    @Override // X.InterfaceC20499215Je
    public final int LJI() {
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        if (!this.LLJILJIL) {
            LJII();
        }
        InterfaceC1483670oiD interfaceC1483670oiD = this.LLJILJILJ;
        if (interfaceC1483670oiD == null || (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ()) == null) {
            return 0;
        }
        return (int) interfaceC1481730of5LJIIIZ.getCurrentPosition();
    }

    public final void LJII() {
        C1479300obA c1479300obALJII = ISimPlayerService.LIZ.get().LJII();
        c1479300obALJII.LJIILIIL().LIZ(new InterfaceC585470Mxl() { // from class: X.0My8
            @Override // X.InterfaceC585470Mxl
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LIZIZ() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJ(String str) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJFF(String str) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJI() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJII() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIIJ(String str, boolean z) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIIL(String str, JSONObject jSONObject) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJIILIIL() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJIILJJIL() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIILL(String str) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ boolean LJIILLIIL() {
                return false;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIIZILJ(String str, boolean z) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final EnumC585580Mxw LIZLLL() {
                return EnumC585580Mxw.DEFAULT;
            }

            @Override // X.InterfaceC585470Mxl
            public final EnumC1987207qQ LJIIJJI() {
                return EnumC1987207qQ.AUDIO;
            }
        });
        c1479300obALJII.LJIILIIL().LIZIZ(new C1481200oeE());
        c1479300obALJII.LJJIJ(new OnUIPlayListener() { // from class: X.0okT
            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                return C583620Mum.LIZ(this);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                C583620Mum.LIZIZ(this, str, f);
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
            public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                C583620Mum.LJFF(this, str, z, c1480430ocz);
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
            public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
                C583620Mum.LJIJJLI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
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
            public final void onPlayPrepare(String str) {
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
            public final /* synthetic */ void onPlayRelease(String str) {
                C583620Mum.LJJIIZI(this, str);
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
            public final /* synthetic */ void onPlaying(String str) {
                C583620Mum.LJJIJLIJ(this, str);
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
            public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                C583620Mum.LJJJJ(this, c1480420ocy);
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
            public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJLI(this, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJL(this, str, c1481290oeN);
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
                InterfaceC1483670oiD interfaceC1483670oiD;
                InterfaceC1485100okW interfaceC1485100okW = this.LL.LLILLJJLI;
                if (interfaceC1485100okW != null) {
                    interfaceC1485100okW.LIZIZ();
                }
                C1485040okQ c1485040okQ = this.LL;
                if (!c1485040okQ.LLJIJIL && (interfaceC1483670oiD = c1485040okQ.LLJILJILJ) != null) {
                    interfaceC1483670oiD.stop();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayPause(String str) {
                InterfaceC1485050okR interfaceC1485050okR = this.LL.LLILZIL;
                if (interfaceC1485050okR != null) {
                    interfaceC1485050okR.LJJZZI();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayStop(String str) {
                InterfaceC650720Pfi legacy;
                InterfaceC1479560oba interfaceC1479560oba;
                InterfaceC1483670oiD interfaceC1483670oiD = this.LL.LLJILJILJ;
                if (interfaceC1483670oiD != null && (legacy = interfaceC1483670oiD.getLegacy()) != null && (interfaceC1479560oba = ((C650730Pfj) legacy).LIZ.LIZIZ) != null) {
                    interfaceC1479560oba.LJJIIZI();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
                InterfaceC650720Pfi legacy;
                InterfaceC1479560oba interfaceC1479560oba;
                InterfaceC1483670oiD interfaceC1483670oiD = this.LL.LLJILJILJ;
                if (interfaceC1483670oiD != null && (legacy = interfaceC1483670oiD.getLegacy()) != null && (interfaceC1479560oba = ((C650730Pfj) legacy).LIZ.LIZIZ) != null) {
                    interfaceC1479560oba.LJJIIZI();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str, int i) {
                InterfaceC650720Pfi legacy;
                InterfaceC1479560oba interfaceC1479560oba;
                InterfaceC1483670oiD interfaceC1483670oiD = this.LL.LLJILJILJ;
                if (interfaceC1483670oiD != null && (legacy = interfaceC1483670oiD.getLegacy()) != null && (interfaceC1479560oba = ((C650730Pfj) legacy).LIZ.LIZIZ) != null) {
                    interfaceC1479560oba.LJJIIZI();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                String str2;
                List<String> list;
                String str3;
                InterfaceC650720Pfi legacy;
                InterfaceC1479560oba interfaceC1479560oba;
                int i;
                List<String> list2;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C1485040okQ c1485040okQ = this.LL;
                long j = jElapsedRealtime - c1485040okQ.LLJI;
                C1485060okS c1485060okS = c1485040okQ.LLIZLLLIL;
                int i2 = 0;
                if (c1485060okS == null || (list2 = c1485060okS.LIZIZ) == null || (str2 = (String) C13LP.LJJJLZIJ(0, list2)) == null) {
                    str2 = "";
                }
                C1485060okS c1485060okS2 = this.LL.LLIZLLLIL;
                List<String> list3 = null;
                if (c1485060okS2 != null) {
                    list = c1485060okS2.LIZIZ;
                } else {
                    list = null;
                }
                C1487610ooZ.LIZIZ(j, String.valueOf(list), str2, this.LL.LL);
                C1492570owZ c1492570owZ = C1492570owZ.LIZ;
                C1485060okS c1485060okS3 = this.LL.LLIZLLLIL;
                if (c1485060okS3 != null) {
                    str3 = c1485060okS3.LJFF;
                    list3 = c1485060okS3.LIZIZ;
                } else {
                    str3 = null;
                }
                String strValueOf = String.valueOf(list3);
                String str4 = this.LL.LL;
                Long lValueOf = Long.valueOf(j);
                c1492570owZ.getClass();
                C1492570owZ.LJFF(lValueOf, str3, strValueOf, str4, str2);
                C1485040okQ c1485040okQ2 = this.LL;
                InterfaceC1485120okY interfaceC1485120okY = c1485040okQ2.LLILZ;
                if (interfaceC1485120okY != null) {
                    C1485060okS c1485060okS4 = c1485040okQ2.LLIZLLLIL;
                    if (c1485060okS4 != null) {
                        i = c1485060okS4.LIZJ;
                        i2 = c1485060okS4.LIZLLL;
                    } else {
                        i = 0;
                    }
                    interfaceC1485120okY.LIZ(i, i2);
                }
                InterfaceC1483670oiD interfaceC1483670oiD = this.LL.LLJILJILJ;
                if (interfaceC1483670oiD != null && (legacy = interfaceC1483670oiD.getLegacy()) != null && (interfaceC1479560oba = ((C650730Pfj) legacy).LIZ.LIZIZ) != null) {
                    this.LL.getClass();
                    interfaceC1479560oba.LJJIJIIJI(60);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onSeekEnd(String str, boolean z) {
                InterfaceC1485090okV interfaceC1485090okV = this.LL.LLILZLL;
                if (interfaceC1485090okV != null) {
                    interfaceC1485090okV.LJII(z);
                }
                this.LL.LLILZLL = null;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onBufferedPercent(final java.lang.String r8, long r9, int r11) {
                /*
                    Method dump skipped, instruction units count: 385
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1485070okT.onBufferedPercent(java.lang.String, long, int):void");
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                String str2;
                int i;
                List<String> list;
                String string;
                String str3;
                String string2;
                List<String> list2;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C1485040okQ c1485040okQ = this.LL;
                long j = jElapsedRealtime - c1485040okQ.LLJI;
                C1485060okS c1485060okS = c1485040okQ.LLIZLLLIL;
                int i2 = 0;
                String str4 = "";
                if (c1485060okS == null || (list2 = c1485060okS.LIZIZ) == null || (str2 = (String) C13LP.LJJJLZIJ(0, list2)) == null) {
                    str2 = "";
                }
                if (c1481290oeN != null) {
                    i = c1481290oeN.LJ;
                    i2 = c1481290oeN.LJFF;
                } else {
                    i = 0;
                }
                InterfaceC1485110okX interfaceC1485110okX = this.LL.LLILLL;
                if (interfaceC1485110okX != null) {
                    interfaceC1485110okX.LIZ(i, i2);
                }
                C1485060okS c1485060okS2 = this.LL.LLIZLLLIL;
                List<String> list3 = null;
                if (c1485060okS2 != null) {
                    list = c1485060okS2.LIZIZ;
                } else {
                    list = null;
                }
                String strValueOf = String.valueOf(list);
                if (c1481290oeN == null || (string = Integer.valueOf(c1481290oeN.LJFF).toString()) == null) {
                    string = "";
                }
                C1487610ooZ.LIZ(i, strValueOf, str2, j, string, this.LL.LL);
                C1492570owZ c1492570owZ = C1492570owZ.LIZ;
                C1485060okS c1485060okS3 = this.LL.LLIZLLLIL;
                if (c1485060okS3 != null) {
                    str3 = c1485060okS3.LJFF;
                    list3 = c1485060okS3.LIZIZ;
                } else {
                    str3 = null;
                }
                String strValueOf2 = String.valueOf(list3);
                String str5 = this.LL.LL;
                if (c1481290oeN != null && (string2 = Integer.valueOf(c1481290oeN.LJFF).toString()) != null) {
                    str4 = string2;
                }
                c1492570owZ.getClass();
                C1492570owZ.LIZLLL(str3, strValueOf2, str5, str2, str4);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(String str, long j, long j2) {
                InterfaceC1485080okU interfaceC1485080okU = this.LL.LLIZ;
                if (interfaceC1485080okU != null) {
                    interfaceC1485080okU.LIZ((j * 1.0f) / j2, (int) j);
                }
            }
        });
        this.LLJILJILJ = c1479300obALJII;
        this.LLJILJIL = true;
    }

    @Override // X.InterfaceC20499215Je
    public final boolean isPlaying() {
        InterfaceC1484080ois playState;
        InterfaceC1483670oiD interfaceC1483670oiD = this.LLJILJILJ;
        if (interfaceC1483670oiD == null || (playState = interfaceC1483670oiD.getPlayState()) == null) {
            return false;
        }
        return playState.isPlaying();
    }

    @Override // X.InterfaceC20499215Je
    public final void release() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LLJILJILJ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.stop();
        }
        InterfaceC1483670oiD interfaceC1483670oiD2 = this.LLJILJILJ;
        if (interfaceC1483670oiD2 != null) {
            interfaceC1483670oiD2.release();
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC20499215Je
    public final void resume() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LLJILJILJ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.resume();
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void pause() {
        if (!C281040Azu.LIZ() || this.LLJILJIL) {
            InterfaceC1485050okR interfaceC1485050okR = this.LLILZIL;
            if (interfaceC1485050okR != null) {
                interfaceC1485050okR.LIZ();
            }
            InterfaceC1483670oiD interfaceC1483670oiD = this.LLJILJILJ;
            if (interfaceC1483670oiD != null) {
                interfaceC1483670oiD.pause();
            }
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void stop() {
        InterfaceC1483670oiD interfaceC1483670oiD;
        if ((!C281040Azu.LIZ() || this.LLJILJIL) && (interfaceC1483670oiD = this.LLJILJILJ) != null) {
            interfaceC1483670oiD.stop();
        }
    }

    public C1485040okQ(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZ(InterfaceC1485100okW interfaceC1485100okW) {
        this.LLILLJJLI = interfaceC1485100okW;
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZIZ(C1485060okS c1485060okS) {
        ArrayList arrayList;
        String str;
        String str2;
        if (!this.LLJILJIL) {
            LJII();
        }
        List<String> list = c1485060okS.LIZIZ;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        String str3 = c1485060okS.LIZ;
        if (str3 != null && str3.length() != 0) {
            arrayList.add(c1485060okS.LIZ);
        }
        String strLIZJ = c1485060okS.LJFF;
        if (strLIZJ == null) {
            strLIZJ = C08HM.LIZJ((String) C13LP.LJJJLL(arrayList));
        }
        c1485060okS.LJFF = strLIZJ;
        this.LLJI = SystemClock.elapsedRealtime();
        this.LLJIJIL = c1485060okS.LJI;
        this.LLIZLLLIL = c1485060okS;
        C1492570owZ c1492570owZ = C1492570owZ.LIZ;
        String str4 = c1485060okS.LJFF;
        String string = arrayList.toString();
        String str5 = this.LL;
        String str6 = (String) C13LP.LJJJLL(arrayList);
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        Long lValueOf = Long.valueOf(c1485060okS.LIZLLL);
        c1492570owZ.getClass();
        C1492570owZ.LJ(lValueOf, str4, string, str5, str6);
        if (C297100Bki.LIZ() && (str2 = c1485060okS.LJIIJ) != null && str2.length() != 0) {
            str = c1485060okS.LJIIJ;
        } else {
            str = c1485060okS.LJFF;
        }
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setUrlKey(str);
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setSourceId(c1485060okS.LJFF);
        simVideoUrlModel.origin = videoUrlModel;
        simVideoUrlModel.setSourceId(c1485060okS.LJFF);
        simVideoUrlModel.setUrlKey(str);
        simVideoUrlModel.setUrlList(arrayList);
        this.LLJ = simVideoUrlModel;
        InterfaceC1483670oiD interfaceC1483670oiD = this.LLJILJILJ;
        if (interfaceC1483670oiD != null) {
            C1479530obX c1479530obX = new C1479530obX();
            c1479530obX.LJJJLL = false;
            c1479530obX.LJIILLIIL = c1485060okS.LJI;
            int i = c1485060okS.LJII;
            if (i > 0) {
                c1479530obX.LJJJJLI = i;
            }
            int i2 = c1485060okS.LJIIIIZZ;
            if (i2 > 0) {
                c1479530obX.LJJJJLL = i2;
            }
            c1479530obX.LJIIJJI = c1485060okS.LJIIIZ;
            HashMap<String, Object> map = new HashMap<>();
            String str8 = this.LL;
            if (str8 != null) {
                str7 = str8;
            }
            map.put("enter_from", str7);
            c1479530obX.LJJJJZI = map;
            c1479530obX.LJIL = true;
            c1479530obX.LJII = this.LLJ;
            c1479530obX.LJJJJZ = true;
            c1479530obX.LJJL = true;
            if (!TextUtils.isEmpty(c1485060okS.LJIIJJI)) {
                c1479530obX.LJJLI = c1485060okS.LJIIJJI;
            }
            c1479530obX.LJJLIIIIJ = c1485060okS.LJIIL;
            if (C123100dR.LIZ(this.LL)) {
                c1479530obX.LJIIZILJ = this.LL;
            }
            interfaceC1483670oiD.LJJJJJL(c1479530obX);
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZJ(InterfaceC1485110okX interfaceC1485110okX) {
        this.LLILLL = interfaceC1485110okX;
    }

    @Override // X.InterfaceC20499215Je
    public final void LIZLLL(C0PDN c0pdn) {
        this.LLILZIL = c0pdn;
    }

    @Override // X.InterfaceC20499215Je
    public final void LJ(InterfaceC1485120okY interfaceC1485120okY) {
        this.LLILZ = interfaceC1485120okY;
    }

    @Override // X.InterfaceC20499215Je
    public final void Of(InterfaceC1485080okU interfaceC1485080okU) {
        this.LLIZ = interfaceC1485080okU;
    }

    @Override // X.InterfaceC20499215Je
    public final void LJIILLIIL(float f, float f2) {
        InterfaceC1483810oiR interfaceC1483810oiRLJIILIIL;
        InterfaceC1483670oiD interfaceC1483670oiD = this.LLJILJILJ;
        if (interfaceC1483670oiD != null && (interfaceC1483810oiRLJIILIIL = interfaceC1483670oiD.LJIILIIL()) != null) {
            interfaceC1483810oiRLJIILIIL.LJIILLIIL(f, f2);
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void Nf(int i, InterfaceC1485090okV interfaceC1485090okV) {
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        if (!this.LLJILJIL) {
            LJII();
        }
        InterfaceC1483670oiD interfaceC1483670oiD = this.LLJILJILJ;
        if (interfaceC1483670oiD != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ()) != null) {
            long duration = interfaceC1481730of5LJIIIZ.getDuration();
            if (duration > 0) {
                float f = (i * 100.0f) / duration;
                this.LLILZLL = interfaceC1485090okV;
                InterfaceC1483670oiD interfaceC1483670oiD2 = this.LLJILJILJ;
                if (interfaceC1483670oiD2 != null) {
                    interfaceC1483670oiD2.seek(f);
                }
            }
        }
    }

    @Override // X.InterfaceC20499215Je
    public final void LJFF(String str, String str2, InterfaceC1475840oVa interfaceC1475840oVa) {
        C1475700oVM.LIZ().LJIIIZ(str, str2, true, false, interfaceC1475840oVa);
    }
}
