package X;

import Y.ARunnableS116S0100000_16;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.android.livesdk.replay.LiveReplayVideoSizeChangeSetting;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0opI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488060opI implements InterfaceC1836050xsZ {
    public final C1835970xsR LIZ;
    public boolean LIZIZ;
    public SurfaceTexture LIZJ;
    public Video LIZLLL;
    public C1483410ohn LJFF;
    public boolean LJI;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public final List<InterfaceC1488080opK> LJIILJJIL;
    public final C01GW LJIILL;
    public ARunnableS116S0100000_16 LJIILLIIL;
    public long LJIIZILJ;
    public Function0<C1488030opF> LJIJ;
    public Function0<Float> LJIJI;
    public final C1488050opH LJIJJ;
    public boolean LJIJJLI;
    public String LJ = "";
    public float LJII = -1.0f;
    public boolean LJIILIIL = true;

    @Override // X.InterfaceC1836050xsZ
    public final void mute() {
        this.LJIIL = true;
        C1483410ohn c1483410ohn = this.LJFF;
        if (c1483410ohn != null) {
            c1483410ohn.LJFF();
        }
        this.LJIJJLI = true;
    }

    @Override // X.InterfaceC1836050xsZ
    public final void pause() {
        C1488030opF c1488030opFInvoke;
        C1488030opF c1488030opFInvoke2;
        this.LJIIIZ = false;
        this.LJII = -1.0f;
        C1483410ohn c1483410ohn = this.LJFF;
        if (c1483410ohn != null) {
            ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
            c1483410ohn.LJJLI(false);
            c1483410ohn.LJJIIZI();
        }
        Function0<C1488030opF> function0 = this.LJIJ;
        if (function0 != null && (c1488030opFInvoke2 = function0.invoke()) != null) {
            c1488030opFInvoke2.LIZJ("", false);
        }
        Function0<C1488030opF> function02 = this.LJIJ;
        if (function02 == null || (c1488030opFInvoke = function02.invoke()) == null) {
            return;
        }
        c1488030opFInvoke.LJ = this.LJIIZILJ;
    }

    @Override // X.InterfaceC1836050xsZ
    public final void release() {
        C1488030opF c1488030opFInvoke;
        this.LIZIZ = false;
        SurfaceTexture surfaceTexture = this.LIZJ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.LIZJ = null;
        C1483410ohn c1483410ohn = this.LJFF;
        if (c1483410ohn != null) {
            ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
            c1483410ohn.LJJL();
            c1483410ohn.LJJIJ(null);
            c1483410ohn.LJJIIJZLJL();
            c1483410ohn.release();
        }
        this.LJFF = null;
        Function0<C1488030opF> function0 = this.LJIJ;
        if (function0 != null && (c1488030opFInvoke = function0.invoke()) != null) {
            C1488030opF.LJIIIZ(c1488030opFInvoke);
        }
        this.LJIIZILJ = 0L;
    }

    @Override // X.InterfaceC1836050xsZ
    public final void stop() {
    }

    public final void LIZ() {
        Float fInvoke;
        Function0<Float> function0 = this.LJIJI;
        if (function0 == null || (fInvoke = function0.invoke()) == null) {
            return;
        }
        float fFloatValue = fInvoke.floatValue() / 100.0f;
        C1483410ohn c1483410ohn = this.LJFF;
        if (c1483410ohn != null) {
            c1483410ohn.LJJLIL(fFloatValue, fFloatValue);
        }
    }

    public final long LIZIZ() {
        C1483410ohn c1483410ohn = this.LJFF;
        if (c1483410ohn != null) {
            return c1483410ohn.getCurrentPosition();
        }
        return 0L;
    }

    public final void LIZJ() {
        C1483410ohn c1483410ohn = this.LJFF;
        if (c1483410ohn != null) {
            ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
            c1483410ohn.LJJLI(false);
            c1483410ohn.LJJIIZI();
            c1483410ohn.LJJL();
            c1483410ohn.LJJIJ(null);
            c1483410ohn.LJJIIJZLJL();
            c1483410ohn.release();
        }
        C1483410ohn c1483410ohn2 = new C1483410ohn();
        this.LJFF = c1483410ohn2;
        if (this.LIZJ != null) {
            c1483410ohn2.setSurface(new Surface(this.LIZJ));
        }
    }

    public final void LIZLLL() {
        ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 126);
        this.LJIILLIIL = aRunnableS116S0100000_16;
        C786410Ut5.LJLIIL(1000L, (Handler) this.LJIILL.getValue(), aRunnableS116S0100000_16);
    }

    @Override // X.InterfaceC1836050xsZ
    public final void LJIIIIZZ() {
        C1483410ohn c1483410ohn = this.LJFF;
        if (c1483410ohn != null) {
            c1483410ohn.LJIJJ();
        }
        this.LJIJJLI = false;
        this.LJIIL = false;
    }

    @Override // X.InterfaceC1836050xsZ
    public final void LJIIIZ() {
        C1488030opF c1488030opFInvoke;
        C1488030opF c1488030opFInvoke2;
        if (this.LIZIZ) {
            C1483410ohn c1483410ohn = this.LJFF;
            if (c1483410ohn != null) {
                LIZLLL();
                c1483410ohn.LJJIIZ();
                c1483410ohn.LJJIJ(this.LJIJJ);
                c1483410ohn.LJIILIIL(this.LIZLLL, this.LJIJJ);
            }
            Function0<C1488030opF> function0 = this.LJIJ;
            if (function0 != null && (c1488030opFInvoke2 = function0.invoke()) != null) {
                c1488030opFInvoke2.LJ = this.LJIIZILJ;
            }
            Function0<C1488030opF> function02 = this.LJIJ;
            if (function02 != null && (c1488030opFInvoke = function02.invoke()) != null) {
                c1488030opFInvoke.LJII("");
            }
            LIZ();
        }
    }

    @Override // X.InterfaceC1836050xsZ
    public final float getBitrate() {
        C1483410ohn c1483410ohn = this.LJFF;
        if (c1483410ohn != null) {
            return c1483410ohn.getBitrate();
        }
        return 0.0f;
    }

    @Override // X.InterfaceC1836050xsZ
    public final int getNetworkSpeed() {
        return C1479130oat.LJII();
    }

    @Override // X.InterfaceC1836050xsZ
    public final boolean isMute() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC1836050xsZ
    public final void retry() {
        LJIIIZ();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0opH] */
    public C1488060opI(C1835970xsR c1835970xsR) {
        this.LIZ = c1835970xsR;
        ArrayList arrayList = new ArrayList();
        this.LJIILJJIL = arrayList;
        this.LJIILL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(137));
        this.LJFF = new C1483410ohn();
        arrayList.add(c1835970xsR);
        c1835970xsR.getVideoView().setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0opJ
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                SurfaceTexture surfaceTexture2 = this.LL.LIZJ;
                if (surfaceTexture2 != null && (Build.VERSION.SDK_INT < 26 || !surfaceTexture2.isReleased())) {
                    return false;
                }
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                SurfaceTexture surfaceTexture2 = this.LL.LIZJ;
                if (surfaceTexture2 == null || (Build.VERSION.SDK_INT >= 26 && surfaceTexture2.isReleased())) {
                    C1488060opI c1488060opI = this.LL;
                    c1488060opI.LIZJ = surfaceTexture;
                    C1483410ohn c1483410ohn = c1488060opI.LJFF;
                    if (c1483410ohn != null) {
                        c1483410ohn.setSurface(new Surface(this.LL.LIZJ));
                    }
                } else {
                    C1488060opI c1488060opI2 = this.LL;
                    SurfaceTexture surfaceTexture3 = c1488060opI2.LIZJ;
                    if (surfaceTexture3 != null && !Intrinsics.LJFF(surfaceTexture3, c1488060opI2.LIZ.getVideoView().getSurfaceTexture())) {
                        c1488060opI2.LIZ.getVideoView().setSurfaceTexture(surfaceTexture3);
                    }
                }
                C1488060opI c1488060opI3 = this.LL;
                c1488060opI3.LIZIZ = true;
                if (c1488060opI3.LJI) {
                    c1488060opI3.start(c1488060opI3.LJIIJJI);
                    this.LL.LJIIJJI = 0;
                }
            }
        });
        this.LJIJJ = new OnUIPlayListener() { // from class: X.0opH
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
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
                C583620Mum.LJIILIIL(this, i, j, j2, map);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                C583620Mum.LJIILJJIL(this, str, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
                C583620Mum.LJIILLIIL(this, str, c1480290ocl);
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
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIL(this, str, c1480430ocz);
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
            public final /* synthetic */ void onPlayRelease(String str) {
                C583620Mum.LJJIIZI(this, str);
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
            public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJI(this, str, c1480430ocz);
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
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJJL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJL(this, str, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
                C583620Mum.LJJJJLL(this, str, z);
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
            public final void onBuffering(boolean z) {
                C1488030opF c1488030opFInvoke;
                C1488030opF c1488030opFInvoke2;
                C1488030opF c1488030opFInvoke3;
                C1488030opF c1488030opFInvoke4;
                if (z) {
                    C1488060opI c1488060opI = this.LL;
                    if (!c1488060opI.LJIIIZ) {
                        Iterator it2 = ((ArrayList) c1488060opI.LJIILJJIL).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1488080opK) it2.next()).onBuffering(true);
                        }
                        C1488060opI c1488060opI2 = this.LL;
                        c1488060opI2.LJIIIZ = true;
                        Function0<C1488030opF> function0 = c1488060opI2.LJIJ;
                        if (function0 != null && (c1488030opFInvoke4 = function0.invoke()) != null) {
                            c1488030opFInvoke4.LIZJ("onBuffering", false);
                        }
                        Function0<C1488030opF> function02 = this.LL.LJIJ;
                        if (function02 != null && (c1488030opFInvoke3 = function02.invoke()) != null) {
                            c1488030opFInvoke3.LJ = this.LL.LJIIZILJ;
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1488060opI c1488060opI3 = this.LL;
                if (c1488060opI3.LJIIIZ) {
                    Iterator it3 = ((ArrayList) c1488060opI3.LJIILJJIL).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1488080opK) it3.next()).onBuffering(false);
                    }
                    C1488060opI c1488060opI4 = this.LL;
                    c1488060opI4.LJIIIZ = false;
                    Function0<C1488030opF> function03 = c1488060opI4.LJIJ;
                    if (function03 != null && (c1488030opFInvoke2 = function03.invoke()) != null) {
                        c1488030opFInvoke2.LJ = this.LL.LJIIZILJ;
                    }
                    Function0<C1488030opF> function04 = this.LL.LJIJ;
                    if (function04 != null && (c1488030opFInvoke = function04.invoke()) != null) {
                        c1488030opFInvoke.LJII("onBuffering");
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onDecoderBuffering(boolean z) {
                if (z) {
                    C1488060opI c1488060opI = this.LL;
                    if (!c1488060opI.LJIIJ) {
                        Iterator<InterfaceC1488080opK> it2 = c1488060opI.LJIILJJIL.iterator();
                        while (it2.hasNext()) {
                            it2.next().onDecoderBuffering(true);
                        }
                        this.LL.LJIIJ = true;
                        return;
                    }
                    return;
                }
                C1488060opI c1488060opI2 = this.LL;
                if (c1488060opI2.LJIIJ) {
                    Iterator<InterfaceC1488080opK> it3 = c1488060opI2.LJIILJJIL.iterator();
                    while (it3.hasNext()) {
                        it3.next().onDecoderBuffering(false);
                    }
                    this.LL.LJIIJ = false;
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPausePlay");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("LiveReplayClipPlayerController", C2188811AlT.LIZIZ(sbLIZ));
                Iterator<InterfaceC1488080opK> it2 = this.LL.LJIILJJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().onPausePlay(str);
                }
                C1488060opI c1488060opI = this.LL;
                if (c1488060opI.LJIILIIL) {
                    c1488060opI.getClass();
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().setCurrentPlayerMute(false);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                C20441214yg.LIZIZ("LiveReplayClipPlayerController", "onPlayCompleted");
                Iterator<InterfaceC1488080opK> it2 = this.LL.LJIILJJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayCompleted(str);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompletedFirstTime(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayCompletedFirstTime");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("LiveReplayClipPlayerController", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                int i;
                C20441214yg.LIZIZ("LiveReplayClipPlayerController", "onPlayFailed");
                for (InterfaceC1488080opK interfaceC1488080opK : this.LL.LJIILJJIL) {
                    if (c1481290oeN != null) {
                        i = c1481290oeN.LJ;
                    } else {
                        i = 0;
                    }
                    interfaceC1488080opK.LLJJIJIL(i, String.valueOf(c1481290oeN));
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayPause(String str) {
                C583620Mum.LJJII(this, str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayPause...");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("LiveReplayClipPlayerController", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(float f) {
                Iterator<InterfaceC1488080opK> it2 = this.LL.LJIILJJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayProgressChange(f);
                }
                C1488060opI c1488060opI = this.LL;
                if (c1488060opI.LJII == f) {
                    c1488060opI.LJIIIIZZ++;
                } else {
                    c1488060opI.LJIIIIZZ = 0;
                }
                if (c1488060opI.LJIIIIZZ > 1) {
                    onBuffering(true);
                } else {
                    onBuffering(false);
                }
                this.LL.LJII = f;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPreparePlay(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPreparePlay");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("LiveReplayClipPlayerController", C2188811AlT.LIZIZ(sbLIZ));
                Iterator<InterfaceC1488080opK> it2 = this.LL.LJIILJJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().onPreparePlay(str);
                }
                C1488060opI c1488060opI = this.LL;
                if (c1488060opI.LJIIL) {
                    c1488060opI.mute();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                long duration;
                int videoWidth;
                C20441214yg.LIZIZ("LiveReplayClipPlayerController", "onRenderFirstFrame");
                C1483410ohn c1483410ohn = this.LL.LJFF;
                if (c1483410ohn != null) {
                    duration = c1483410ohn.getDuration();
                } else {
                    duration = 0;
                }
                C1483410ohn c1483410ohn2 = this.LL.LJFF;
                int videoHeight = 0;
                if (c1483410ohn2 != null) {
                    videoWidth = c1483410ohn2.getVideoWidth();
                } else {
                    videoWidth = 0;
                }
                C1483410ohn c1483410ohn3 = this.LL.LJFF;
                if (c1483410ohn3 != null) {
                    videoHeight = c1483410ohn3.getVideoHeight();
                }
                if (videoWidth > 0 && videoHeight > 0) {
                    this.LL.LIZ.LJIILIIL(videoWidth, videoHeight);
                }
                Iterator it2 = ((ArrayList) this.LL.LJIILJJIL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1488080opK) it2.next()).LLLIZZ(videoWidth, videoHeight, duration);
                }
                if (this.LL.LJIILIIL) {
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().setCurrentPlayerMute(true);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onResumePlay");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("LiveReplayClipPlayerController", C2188811AlT.LIZIZ(sbLIZ));
                Iterator it2 = ((ArrayList) this.LL.LJIILJJIL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1488080opK) it2.next()).onResumePlay(str);
                }
                if (this.LL.LJIILIIL) {
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().setCurrentPlayerMute(true);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRetryOnError(C1481290oeN c1481290oeN) {
                C20441214yg.LIZIZ("LiveReplayClipPlayerController", "onRetryOnError");
                Iterator<InterfaceC1488080opK> it2 = this.LL.LJIILJJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LL(String.valueOf(c1481290oeN));
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onLoopPlay(java.lang.String r6, int r7) {
                /*
                    r5 = this;
                    X.C583620Mum.LJIILL(r5, r6, r7)
                    X.0opI r0 = r5.LL
                    kotlin.jvm.functions.Function0<X.0opF> r0 = r0.LJIJ
                    if (r0 == 0) goto L4c
                    java.lang.Object r4 = r0.invoke()
                    X.0opF r4 = (X.C1488030opF) r4
                    if (r4 == 0) goto L4c
                    boolean r0 = r4.LIZIZ()
                    if (r0 != 0) goto L4c
                    X.0ok5 r0 = r4.LIZ
                    r2 = 0
                    if (r0 == 0) goto L87
                    X.0oiV r3 = r0.getPlayState()
                L20:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "play playStart state: "
                    r1.append(r0)
                    if (r3 == 0) goto L33
                    int r0 = r3.getState()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                L33:
                    r1.append(r2)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r0 = "LiveHighlightMusicPlayerController"
                    X.C20441214yg.LIZIZ(r0, r1)
                    r2 = 0
                    r1 = 1
                    if (r3 == 0) goto L83
                    boolean r0 = r3.isPlaying()
                    if (r0 != r1) goto L6a
                    r4.LJI(r2)
                L4c:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "onLoopPlay..."
                    r1.append(r0)
                    r1.append(r6)
                    java.lang.String r0 = ", playCount: "
                    r1.append(r0)
                    r1.append(r7)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r0 = "LiveReplayClipPlayerController"
                    X.C20441214yg.LIZIZ(r0, r1)
                    return
                L6a:
                    boolean r0 = r3.LJJIJIIJIL()
                    if (r0 != r1) goto L74
                    r4.LJ(r2)
                    goto L4c
                L74:
                    boolean r0 = r3.isPaused()
                    if (r0 != r1) goto L83
                    java.lang.String r0 = ""
                    r4.LJII(r0)
                    r4.LJI(r2)
                    goto L4c
                L83:
                    r4.LJ(r2)
                    goto L4c
                L87:
                    r3 = r2
                    goto L20
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1488050opH.onLoopPlay(java.lang.String, int):void");
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBufferedPercent(String str, long j, int i) {
                Iterator<InterfaceC1488080opK> it2 = this.LL.LJIILJJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().onBufferedPercent(str, j, i);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(String str, long j, long j2) {
                C583620Mum.LJJIIZ(this, str, j, j2);
                this.LL.LJIIZILJ = j;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onVideoSizeChanged(String str, int i, int i2) {
                if (LiveReplayVideoSizeChangeSetting.INSTANCE.getValue()) {
                    C20441214yg.LIZIZ("LiveReplayClipPlayerController", "onVideoSizeChanged");
                    if (i > 0 && i2 > 0) {
                        this.LL.LIZ.LJIILIIL(i, i2);
                    }
                }
                Iterator<InterfaceC1488080opK> it2 = this.LL.LJIILJJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().onVideoSizeChanged(str, i, i2);
                }
            }
        };
    }

    @Override // X.InterfaceC1836050xsZ
    public final void LJIILL(float f) {
        long duration;
        C1488030opF c1488030opFInvoke;
        C1483410ohn c1483410ohn = this.LJFF;
        if (c1483410ohn != null) {
            c1483410ohn.seek(f);
        }
        C1483410ohn c1483410ohn2 = this.LJFF;
        if (c1483410ohn2 != null) {
            duration = c1483410ohn2.getDuration();
        } else {
            duration = 0;
        }
        this.LJIIZILJ = (long) ((duration * f) / 100);
        Function0<C1488030opF> function0 = this.LJIJ;
        if (function0 != null && (c1488030opFInvoke = function0.invoke()) != null) {
            c1488030opFInvoke.LJIIIIZZ((int) this.LJIIZILJ, "VideoSeek");
        }
    }

    @Override // X.InterfaceC1836050xsZ
    public final void start(int i) {
        if (this.LIZIZ) {
            this.LJI = false;
            C1483410ohn c1483410ohn = this.LJFF;
            if (c1483410ohn != null) {
                LIZLLL();
                c1483410ohn.LJJIJ(this.LJIJJ);
                C1479720obq c1479720obq = new C1479720obq();
                SimVideo simVideoLJI = C1481230oeH.LJI(this.LIZLLL);
                C1479530obX c1479530obX = c1479720obq.LIZ;
                c1479530obX.LIZLLL = simVideoLJI;
                c1479530obX.LJIIJ = true;
                c1479530obX.LJIIJJI = i;
                c1479720obq.LIZJ("live_replay");
                c1479720obq.LIZIZ(this.LJ);
                c1483410ohn.LJJZZIII(c1479720obq.LIZ());
                c1483410ohn.LJJIIZ();
                LIZ();
                return;
            }
            return;
        }
        this.LJI = true;
        this.LJIIJJI = i;
    }

    @Override // X.InterfaceC1836050xsZ
    public final void LJII(float f, int i) {
        Iterator<InterfaceC1488080opK> it2 = this.LJIILJJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(f, i);
        }
    }
}
