package X;

import Y.ARunnableS39S0110000_20;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ad.splash.utils.WeakHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.a4;
import fyo.e;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0oRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473470oRl implements InterfaceC2213021BjQ, InterfaceC588460N6e, a4, InterfaceC1467760oIY, InterfaceC1322330kVz {
    public Context LL;
    public InterfaceC1322340kW0 LLILLJJLI;
    public TTVideoEngine LLILLL;
    public InterfaceC1473480oRm LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZLLLIL;
    public long LLJILJIL;
    public final WeakHandler LLILZ = new WeakHandler(this);
    public final ArrayList<Runnable> LLIZ = new ArrayList<>();
    public boolean LLJ = false;
    public boolean LLJI = false;
    public boolean LLJIJIL = false;

    @Override // cxo.a4
    public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC2213021BjQ
    public final void LJFF() {
    }

    @Override // cxo.a4
    public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // cxo.a4
    public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // cxo.a4
    public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // cxo.a4
    public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // cxo.a4
    public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
    }

    @Override // cxo.a4
    public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // cxo.a4
    public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC1467760oIY
    public final boolean LJJIIZI(C1470240oMY c1470240oMY) {
        return false;
    }

    @Override // X.InterfaceC1322330kVz
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // X.InterfaceC2213021BjQ
    public final int LIZLLL() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJJZI(660);
        }
        return -101;
    }

    @Override // X.InterfaceC2213021BjQ
    public final float LJIIJ() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine == null) {
            return 0.0f;
        }
        return tTVideoEngine.LJJJZ();
    }

    @Override // X.InterfaceC2213021BjQ
    public final int getCurrentPosition() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJIL();
        }
        return 0;
    }

    @Override // X.InterfaceC2213021BjQ
    public final int getDuration() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJJL();
        }
        return 0;
    }

    @Override // X.InterfaceC2213021BjQ
    public final float getVolume() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine == null) {
            return 0.0f;
        }
        return tTVideoEngine.LJJLJLI();
    }

    @Override // X.InterfaceC2213021BjQ
    public final boolean isVideoPlaying() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        return tTVideoEngine != null && tTVideoEngine.LJJLIIIJILLIZJL() == 1;
    }

    @Override // X.InterfaceC2213021BjQ
    public final void pause() {
        if (this.LLILLL == null || !isVideoPlaying()) {
            return;
        }
        this.LLILLL.pause();
    }

    @Override // X.InterfaceC2213021BjQ
    public final void release() {
        C1289520jf4 c1289520jf4;
        InterfaceC1322340kW0 interfaceC1322340kW0 = this.LLILLJJLI;
        if (interfaceC1322340kW0 != null && (c1289520jf4 = ((TextureViewSurfaceTextureListenerC1322320kVy) interfaceC1322340kW0).LL) != null) {
            c1289520jf4.LIZ();
        }
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLI(null);
            TTVideoEngine tTVideoEngine2 = this.LLILLL;
            tTVideoEngine2.LIZ.LLLLZIL = null;
            tTVideoEngine2.LJIILL();
            this.LLILLL = null;
        }
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC2213021BjQ
    public final void resume() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine == null || tTVideoEngine.LJJLIIIJILLIZJL() != 2) {
            return;
        }
        this.LLILLL.play();
    }

    @Override // X.InterfaceC2213021BjQ
    public final void stop() {
        if (this.LLILLL == null || this.LLJ) {
            return;
        }
        this.LLILZIL.LIZIZ(getCurrentPosition(), getDuration());
        this.LLILLL.stop();
        this.LLJ = true;
    }

    public C1473470oRl(TextureViewSurfaceTextureListenerC1322320kVy textureViewSurfaceTextureListenerC1322320kVy) {
        if (textureViewSurfaceTextureListenerC1322320kVy != null) {
            this.LLILLJJLI = textureViewSurfaceTextureListenerC1322320kVy;
            textureViewSurfaceTextureListenerC1322320kVy.setVideoViewCallback(this);
            this.LL = ((TextureViewSurfaceTextureListenerC1322320kVy) this.LLILLJJLI).getViewContext();
            return;
        }
        throw new IllegalArgumentException("IBDASplashVideoView can not be null");
    }

    @Override // X.InterfaceC2213021BjQ
    public final void LIZ(C2212941BjI c2212941BjI) {
        this.LLILZIL = c2212941BjI;
    }

    @Override // cxo.a4
    public final void LJ(TTVideoEngine tTVideoEngine) {
        InterfaceC1473480oRm interfaceC1473480oRm = this.LLILZIL;
        if (interfaceC1473480oRm != null) {
            interfaceC1473480oRm.LIZLLL(tTVideoEngine.LJJJJL());
        }
    }

    @Override // cxo.a4
    public final void LJI(e eVar) {
        InterfaceC1473480oRm interfaceC1473480oRm = this.LLILZIL;
        if (interfaceC1473480oRm != null) {
            interfaceC1473480oRm.LIZJ(eVar.LIZ, eVar.LIZLLL, this.LLJIJIL);
        }
    }

    @Override // X.InterfaceC2213021BjQ
    public final void LJIILJJIL(boolean z) {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJ(z);
        }
    }

    @Override // cxo.a4
    public final void LJIILL(TTVideoEngine tTVideoEngine) {
        InterfaceC1473480oRm interfaceC1473480oRm = this.LLILZIL;
        if (interfaceC1473480oRm != null && !tTVideoEngine.LIZ.LJJJ) {
            interfaceC1473480oRm.LJ(getDuration(), this.LLJIJIL);
            this.LLJ = true;
        }
    }

    @Override // cxo.a4
    public final void LJIJJLI(int i) {
        InterfaceC1473480oRm interfaceC1473480oRm = this.LLILZIL;
        if (interfaceC1473480oRm != null) {
            interfaceC1473480oRm.LIZJ(i, "onVideoStatusException", this.LLJIJIL);
        }
    }

    @Override // X.InterfaceC588460N6e
    public final void handleMsg(Message message) {
        InterfaceC1473480oRm interfaceC1473480oRm;
        if (message.what == 1000 && this.LLILLL != null) {
            if (isVideoPlaying()) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                long j = this.LLJILJIL;
                long j2 = jUptimeMillis - j;
                long j3 = 100;
                if (j != 0 && j2 > 100) {
                    j3 = 100 - (j2 % 100);
                }
                this.LLILZ.sendMessageDelayed(this.LLILZ.obtainMessage(LSPassThroughRecordSizeConfig.DEFAULT), j3);
                this.LLJILJIL = jUptimeMillis;
            } else {
                this.LLJILJIL = 0L;
            }
            int iLJJJJL = this.LLILLL.LJJJJL();
            if (iLJJJJL > 0 && (interfaceC1473480oRm = this.LLILZIL) != null) {
                interfaceC1473480oRm.LJFF(this.LLILLL.LJJJIL(), iLJJJJL);
            }
        }
    }

    @Override // cxo.a4
    public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
        if (i == 1) {
            InterfaceC1473480oRm interfaceC1473480oRm = this.LLILZIL;
            if (interfaceC1473480oRm != null && !this.LLJI) {
                interfaceC1473480oRm.LIZ(this.LLJIJIL);
            }
            this.LLILZ.removeMessages(LSPassThroughRecordSizeConfig.DEFAULT);
            this.LLILZ.sendEmptyMessage(LSPassThroughRecordSizeConfig.DEFAULT);
            this.LLJI = true;
        }
    }

    @Override // X.InterfaceC2213021BjQ
    public final void LJIILLIIL(float f, float f2) {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJIILLIIL(f, f2);
        }
    }

    @Override // X.InterfaceC2213021BjQ
    public final boolean LJII(String str, int i, boolean z) throws JSONException {
        if (TextUtils.isEmpty(str) || this.LLILLJJLI == null) {
            return false;
        }
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
        }
        if (i == -1) {
            this.LLILLL = new TTVideoEngine(this.LL, 0);
        } else {
            this.LLILLL = new TTVideoEngine(this.LL, i);
        }
        this.LLILLL.LJ(true);
        this.LLILLL.LLJIJIL("splash_ad");
        this.LLILLL.LLI(this);
        TTVideoEngine tTVideoEngine2 = this.LLILLL;
        tTVideoEngine2.LIZ.LLLLZIL = this;
        tTVideoEngine2.LIZJ(4, 2);
        this.LLILLL.LJIJ(str);
        String str2 = C2212231Bi9.LIZ;
        this.LLILLL.LJJIFFI(0, false);
        if (!TextUtils.isEmpty("")) {
            this.LLILLL.LIZ.o = "";
            this.LLJIJIL = true;
        }
        this.LLILLL.LLILII(0);
        Surface surface = ((TextureViewSurfaceTextureListenerC1322320kVy) this.LLILLJJLI).getSurface();
        if (surface != null && surface.isValid()) {
            this.LLILLL.setSurface(surface);
            try {
                this.LLILLL.setLooping(z);
                this.LLILLL.play();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            ((TextureViewSurfaceTextureListenerC1322320kVy) this.LLILLJJLI).setSurfaceViewVisibility(0);
            ARunnableS39S0110000_20 aRunnableS39S0110000_20 = new ARunnableS39S0110000_20(this, z, 15);
            if (this.LLILZLL) {
                aRunnableS39S0110000_20.run();
            } else {
                this.LLIZ.add(aRunnableS39S0110000_20);
            }
        }
        this.LLJ = false;
        return true;
    }

    @Override // X.InterfaceC1322330kVz
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.LLILZLL = true;
        Surface surface = ((TextureViewSurfaceTextureListenerC1322320kVy) this.LLILLJJLI).getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.setSurface(surface);
            if (!this.LLIZLLLIL && !this.LLIZ.isEmpty()) {
                this.LLIZLLLIL = true;
                Iterator it2 = new ArrayList(this.LLIZ).iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                this.LLIZ.clear();
                this.LLIZLLLIL = false;
            }
        }
    }
}
