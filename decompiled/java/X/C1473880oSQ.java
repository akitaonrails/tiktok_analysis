package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473880oSQ extends TextureView implements InterfaceC1471580oOi {
    public static int LLILZLL;
    public static final C587140N1c LLIZ;
    public final String LL;
    public TextureView.SurfaceTextureListener LLILLJJLI;
    public SurfaceWrapper LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC1471580oOi
    public final void LJIILIIL(String str, boolean z) {
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIJJLI(String str) {
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        this.LLILZ = true;
        if (getSurfaceTexture() == null) {
            if (this.LLILZIL) {
                this.LLILZIL = false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LL);
                sbLIZ.append(": reuseSurfaceTexture: noReuse");
                SimRadar.keyScan("TextureView", C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
            } else {
                C587140N1c c587140N1c = LLIZ;
                SurfaceTexture surfaceTexture = (SurfaceTexture) C13LP.LJJJLIIL(c587140N1c.LLILZ.keySet());
                if (surfaceTexture != null) {
                    c587140N1c.LLILZ.remove(surfaceTexture);
                } else {
                    surfaceTexture = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DTextureView: getSurfaceTexture: ");
                sbLIZ2.append(surfaceTexture);
                sbLIZ2.append(", store.size = ");
                sbLIZ2.append(c587140N1c.LLILZ.size());
                SimRadar.keyScan("TextureView", C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
                if (surfaceTexture != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(this.LL);
                    sbLIZ3.append(": reuseSurfaceTexture: ");
                    sbLIZ3.append(surfaceTexture);
                    SimRadar.keyScan("TextureView", C2188811AlT.LIZIZ(sbLIZ3), new Object[0]);
                    setSurfaceTexture(surfaceTexture);
                }
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.LLILZ = false;
        LIZ();
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    static {
        new CopyOnWriteArrayList();
        LLIZ = new C587140N1c();
    }

    public final void LIZ() {
        SurfaceWrapper surfaceWrapper = this.LLILLL;
        if (surfaceWrapper != null) {
            try {
                surfaceWrapper.release();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            this.LLILLL = null;
        }
    }

    public final Surface getSurface() {
        return this.LLILLL;
    }

    public C1473880oSQ(Context context) {
        super(context, null, 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DTextureView#");
        int i = LLILZLL;
        LLILZLL = i + 1;
        sbLIZ.append(i);
        this.LL = C2188811AlT.LIZIZ(sbLIZ);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0oSR
            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLILLJJLI;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
                }
                C587140N1c c587140N1c = C1473880oSQ.LLIZ;
                boolean z = false;
                if (surfaceTexture != null) {
                    if (c587140N1c.LLILZ.size() < c587140N1c.LL) {
                        c587140N1c.LLILZ.put(surfaceTexture, Long.valueOf(SystemClock.elapsedRealtime()));
                        long j = c587140N1c.LLILLJJLI;
                        if (!c587140N1c.LLILLL.hasMessages(0)) {
                            C786410Ut5.LJLJJI(0, j, c587140N1c.LLILLL);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("DTextureView: tryStoreOrRelease: ");
                        sbLIZ2.append(c587140N1c);
                        sbLIZ2.append(" Store, -> store.size = ");
                        sbLIZ2.append(c587140N1c.LLILZ.size());
                        SimRadar.keyScan("TextureView", C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
                        z = true;
                    }
                    return !z;
                }
                c587140N1c.getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("DTextureView: tryStoreOrRelease: ");
                sbLIZ3.append(c587140N1c);
                sbLIZ3.append(" -> Release, store.size = ");
                sbLIZ3.append(c587140N1c.LLILZ.size());
                SimRadar.keyScan("TextureView", C2188811AlT.LIZIZ(sbLIZ3), new Object[0]);
                return !z;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLILLJJLI;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                C1473880oSQ c1473880oSQ = this.LL;
                c1473880oSQ.LIZ();
                c1473880oSQ.LLILLL = new SurfaceWrapper(surfaceTexture, c1473880oSQ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c1473880oSQ.LL);
                sbLIZ2.append(": updateSurface: ");
                sbLIZ2.append(surfaceTexture);
                sbLIZ2.append(" -> ");
                sbLIZ2.append(c1473880oSQ.LLILLL);
                SimRadar.keyScan("TextureView", C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLILLJJLI;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i2, i3);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLILLJJLI;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
                }
            }
        });
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJI(String str) {
        LIZ();
        HandlerHook.viewPost(this, new ARunnableS123S0100000_23(this, 222));
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        super.setSurfaceTexture(surfaceTexture);
        HandlerHook.viewPost(this, new ARunnableS92S0200000_23(this, surfaceTexture, 151));
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LLILLJJLI = surfaceTextureListener;
    }
}
