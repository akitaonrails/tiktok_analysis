package X;

import Y.ARunnableS38S1100000_34;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ad.splash.utils.WeakHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1CxV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247231CxV implements InterfaceC2213021BjQ, InterfaceC588460N6e, InterfaceC1322330kVz {
    public final InterfaceC1322340kW0 LL;
    public final C2247241CxW LLILLJJLI;
    public InterfaceC1473480oRm LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public final ArrayList<Runnable> LLILZLL;
    public final WeakHandler LLIZ = new WeakHandler(this);

    @Override // X.InterfaceC2213021BjQ
    public final int LIZLLL() {
        return -102;
    }

    @Override // X.InterfaceC2213021BjQ
    public final void LJFF() {
    }

    @Override // X.InterfaceC2213021BjQ
    public final float LJIIJ() {
        int iZ3;
        this.LLILLJJLI.getClass();
        try {
            Object objH2 = C786410Ut5.H2(C2212231Bi9.LJIILL, "audio");
            AudioManager audioManager = objH2 instanceof AudioManager ? (AudioManager) objH2 : null;
            int i = 0;
            if (audioManager != null) {
                iZ3 = C786410Ut5.Z3(audioManager, 3);
                if (iZ3 < 0) {
                }
                return i;
            }
            iZ3 = 0;
            i = iZ3;
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0.0f;
        }
    }

    @Override // X.InterfaceC2213021BjQ
    public final int getCurrentPosition() {
        return this.LLILLJJLI.LIZIZ.getCurrentPosition();
    }

    @Override // X.InterfaceC2213021BjQ
    public final int getDuration() {
        return this.LLILLJJLI.LIZIZ.getDuration();
    }

    @Override // X.InterfaceC2213021BjQ
    public final float getVolume() {
        int streamVolume;
        this.LLILLJJLI.getClass();
        try {
            Object objH2 = C786410Ut5.H2(C2212231Bi9.LJIILL, "audio");
            AudioManager audioManager = objH2 instanceof AudioManager ? (AudioManager) objH2 : null;
            int i = 0;
            if (audioManager != null) {
                streamVolume = audioManager.getStreamVolume(3);
                if (streamVolume < 0) {
                }
                return i;
            }
            streamVolume = 0;
            i = streamVolume;
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0.0f;
        }
    }

    @Override // X.InterfaceC2213021BjQ
    public final boolean isVideoPlaying() {
        return this.LLILLJJLI.LIZ == 4;
    }

    @Override // X.InterfaceC2213021BjQ
    public final void pause() {
        C2247241CxW c2247241CxW = this.LLILLJJLI;
        c2247241CxW.LIZIZ.pause();
        c2247241CxW.LIZ = 5;
    }

    @Override // X.InterfaceC2213021BjQ
    public final void release() {
        C1289520jf4 c1289520jf4 = ((TextureViewSurfaceTextureListenerC1322320kVy) this.LL).LL;
        if (c1289520jf4 != null) {
            c1289520jf4.LIZ();
        }
        C2247241CxW c2247241CxW = this.LLILLJJLI;
        c2247241CxW.LIZIZ.release();
        c2247241CxW.LIZIZ.setOnPreparedListener(null);
        c2247241CxW.LIZIZ.setOnBufferingUpdateListener(null);
        c2247241CxW.LIZIZ.setOnInfoListener(null);
        c2247241CxW.LIZIZ.setOnSeekCompleteListener(null);
        c2247241CxW.LIZIZ.setOnCompletionListener(null);
        c2247241CxW.LIZIZ.setOnVideoSizeChangedListener(null);
        c2247241CxW.LIZIZ.setOnErrorListener(null);
        c2247241CxW.LIZ = 8;
        c2247241CxW.LIZJ = null;
        this.LLILLL = null;
    }

    @Override // X.InterfaceC2213021BjQ
    public final void resume() {
        C2247241CxW c2247241CxW = this.LLILLJJLI;
        if (c2247241CxW.LIZ == 5) {
            c2247241CxW.LIZIZ.start();
            c2247241CxW.LIZ = 4;
            C2247261CxY c2247261CxY = c2247241CxW.LIZJ;
            if (c2247261CxY != null) {
                c2247261CxY.LIZ(false);
            }
        }
    }

    @Override // X.InterfaceC2213021BjQ
    public final void stop() {
        C2247241CxW c2247241CxW = this.LLILLJJLI;
        if (c2247241CxW.LIZ == 4) {
            c2247241CxW.LIZIZ.stop();
            c2247241CxW.LIZ = 6;
            C2247261CxY c2247261CxY = c2247241CxW.LIZJ;
            if (c2247261CxY != null) {
                c2247261CxY.LIZIZ(c2247241CxW.LIZIZ.getCurrentPosition(), c2247241CxW.LIZIZ.getDuration());
            }
        }
    }

    public C2247231CxV(TextureViewSurfaceTextureListenerC1322320kVy textureViewSurfaceTextureListenerC1322320kVy) {
        this.LL = textureViewSurfaceTextureListenerC1322320kVy;
        textureViewSurfaceTextureListenerC1322320kVy.setVideoViewCallback(this);
        textureViewSurfaceTextureListenerC1322320kVy.getViewContext();
        C2247241CxW c2247241CxW = new C2247241CxW();
        this.LLILLJJLI = c2247241CxW;
        this.LLILZLL = new ArrayList<>();
        c2247241CxW.LIZJ = new C2247261CxY(this);
    }

    @Override // X.InterfaceC2213021BjQ
    public final void LIZ(C2212941BjI c2212941BjI) {
        this.LLILLL = c2212941BjI;
    }

    @Override // X.InterfaceC2213021BjQ
    public final void LJIILJJIL(boolean z) {
        this.LLILLJJLI.LIZIZ.setVolume(0.0f, 0.0f);
    }

    @Override // X.InterfaceC588460N6e
    public final void handleMsg(Message message) {
        InterfaceC1473480oRm interfaceC1473480oRm;
        if (message.what == 1000) {
            if (isVideoPlaying()) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                long j = this.LLILZIL;
                long j2 = jUptimeMillis - j;
                long j3 = 100;
                if (j != 0 && j2 > 100) {
                    j3 = 100 - (j2 % 100);
                }
                this.LLIZ.sendMessageDelayed(this.LLIZ.obtainMessage(LSPassThroughRecordSizeConfig.DEFAULT), j3);
                this.LLILZIL = jUptimeMillis;
            } else {
                this.LLILZIL = 0L;
            }
            if (getDuration() > 0 && (interfaceC1473480oRm = this.LLILLL) != null) {
                interfaceC1473480oRm.LJFF(getCurrentPosition(), getDuration());
            }
        }
    }

    @Override // X.InterfaceC1322330kVz
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.LLILZ = false;
        return false;
    }

    @Override // X.InterfaceC2213021BjQ
    public final void LJIILLIIL(float f, float f2) {
        this.LLILLJJLI.LIZIZ.setVolume(f, f2);
    }

    @Override // X.InterfaceC2213021BjQ
    public final boolean LJII(String str, int i, boolean z) {
        if (a0.LJJJIL(str) || (!a0.LJJJIL(""))) {
            return false;
        }
        ((TextureViewSurfaceTextureListenerC1322320kVy) this.LL).setSurfaceViewVisibility(0);
        ARunnableS38S1100000_34 aRunnableS38S1100000_34 = new ARunnableS38S1100000_34(this, str, 6);
        if (this.LLILZ) {
            aRunnableS38S1100000_34.run();
            return true;
        }
        this.LLILZLL.add(aRunnableS38S1100000_34);
        return true;
    }

    @Override // X.InterfaceC1322330kVz
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.LLILZ = true;
        Surface surface = ((TextureViewSurfaceTextureListenerC1322320kVy) this.LL).getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        this.LLILLJJLI.LIZIZ.setSurface(surface);
        if (this.LLILZ && !this.LLILZLL.isEmpty()) {
            Iterator it2 = new ArrayList(this.LLILZLL).iterator();
            while (it2.hasNext()) {
                try {
                    ((Runnable) it2.next()).run();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.LLILZLL.clear();
        }
    }
}
