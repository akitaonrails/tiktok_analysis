package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class TextureViewSurfaceTextureListenerC1287530jbr extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {
    public static final C1287540jbs LLJILJIL = new C1287540jbs();
    public IMonitor LL;
    public final WeakReference<TextureViewSurfaceTextureListenerC1287530jbr> LLILLJJLI;
    public C1287520jbq LLILLL;
    public InterfaceC1287560jbu LLILZ;
    public boolean LLILZIL;
    public InterfaceC1287600jby LLILZLL;
    public InterfaceC1287610jbz LLIZ;
    public InterfaceC1287620jc0 LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setGLWrapper(InterfaceC1287630jc1 interfaceC1287630jc1) {
    }

    public final void LJFF() {
        if (this.LLILLL != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public final void finalize() throws Throwable {
        try {
            C1287520jbq c1287520jbq = this.LLILLL;
            if (c1287520jbq != null) {
                c1287520jbq.requestExitAndWait();
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public int getRenderMode() {
        int i;
        C1287520jbq c1287520jbq = this.LLILLL;
        c1287520jbq.getClass();
        synchronized (LLJILJIL) {
            try {
                i = c1287520jbq.LLJILJILJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        C1287520jbq c1287520jbq = this.LLILLL;
        if (c1287520jbq != null) {
            c1287520jbq.requestExitAndWait();
        }
        this.LLILZIL = true;
        super.onDetachedFromWindow();
    }

    public final void onPause() {
        C1287520jbq c1287520jbq = this.LLILLL;
        c1287520jbq.getClass();
        C1287540jbs c1287540jbs = LLJILJIL;
        synchronized (c1287540jbs) {
            try {
                c1287520jbq.LLILLL = true;
                c1287540jbs.notifyAll();
                while (!c1287520jbq.LLILLJJLI && !c1287520jbq.LLILZ) {
                    try {
                        LLJILJIL.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void requestRender() {
        C1287520jbq c1287520jbq = this.LLILLL;
        c1287520jbq.getClass();
        C1287540jbs c1287540jbs = LLJILJIL;
        synchronized (c1287540jbs) {
            try {
                c1287520jbq.LLJILLL = true;
                c1287540jbs.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.LLILZIL && this.LLILZ != null) {
            C1287520jbq c1287520jbq = this.LLILLL;
            if (c1287520jbq != null) {
                synchronized (LLJILJIL) {
                    try {
                        i = c1287520jbq.LLJILJILJ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                i = 1;
            }
            C1287520jbq c1287520jbq2 = new C1287520jbq(this.LLILLJJLI);
            this.LLILLL = c1287520jbq2;
            if (i != 1) {
                c1287520jbq2.setRenderMode(i);
            }
            this.LLILLL.start();
        }
        this.LLILZIL = false;
    }

    public int getDebugFlags() {
        return this.LLJ;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.LLJIJIL;
    }

    public TextureViewSurfaceTextureListenerC1287530jbr(Context context) {
        super(context, null);
        this.LLILLJJLI = new WeakReference<>(this);
        setSurfaceTextureListener(this);
    }

    public final void LJI(Runnable runnable) {
        C1287520jbq c1287520jbq = this.LLILLL;
        c1287520jbq.getClass();
        C1287540jbs c1287540jbs = LLJILJIL;
        synchronized (c1287540jbs) {
            try {
                c1287520jbq.LLJJI.add(runnable);
                c1287540jbs.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1287520jbq c1287520jbq = this.LLILLL;
        c1287520jbq.getClass();
        C1287540jbs c1287540jbs = LLJILJIL;
        synchronized (c1287540jbs) {
            try {
                c1287520jbq.LLILZIL = false;
                c1287540jbs.notifyAll();
                while (!c1287520jbq.LLIZ && !c1287520jbq.LLILLJJLI) {
                    try {
                        LLJILJIL.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return true;
    }

    public void setDebugFlags(int i) {
        this.LLJ = i;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C1287570jbv(this, z));
    }

    public void setEGLContextClientVersion(int i) {
        LJFF();
        this.LLJI = i;
    }

    public void setEGLContextFactory(InterfaceC1287610jbz interfaceC1287610jbz) {
        LJFF();
        this.LLIZ = interfaceC1287610jbz;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC1287620jc0 interfaceC1287620jc0) {
        LJFF();
        this.LLIZLLLIL = interfaceC1287620jc0;
    }

    public void setMonitor(IMonitor iMonitor) {
        this.LL = iMonitor;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.LLJIJIL = z;
    }

    public void setRenderMode(int i) {
        this.LLILLL.setRenderMode(i);
    }

    public void setRenderer(InterfaceC1287560jbu interfaceC1287560jbu) {
        LJFF();
        if (this.LLILZLL == null) {
            this.LLILZLL = new C1287570jbv(this, true);
        }
        if (this.LLIZ == null) {
            this.LLIZ = new C1287580jbw(this);
        }
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new InterfaceC1287620jc0() { // from class: X.0jbx
            };
        }
        this.LLILZ = interfaceC1287560jbu;
        C1287520jbq c1287520jbq = new C1287520jbq(this.LLILLJJLI);
        this.LLILLL = c1287520jbq;
        c1287520jbq.start();
    }

    public void setEGLConfigChooser(InterfaceC1287600jby interfaceC1287600jby) {
        LJFF();
        this.LLILZLL = interfaceC1287600jby;
    }

    public final void LJIIIIZZ(int i, int i2) {
        C1287520jbq c1287520jbq = this.LLILLL;
        c1287520jbq.getClass();
        C1287540jbs c1287540jbs = LLJILJIL;
        synchronized (c1287540jbs) {
            try {
                c1287520jbq.LLJIJIL = i;
                c1287520jbq.LLJILJIL = i2;
                c1287520jbq.LLJJIII = true;
                c1287520jbq.LLJILLL = true;
                c1287520jbq.LLJJ = false;
                c1287540jbs.notifyAll();
                while (!c1287520jbq.LLILLJJLI && !c1287520jbq.LLILZ && !c1287520jbq.LLJJ && c1287520jbq.LLIZLLLIL && c1287520jbq.LLJ && c1287520jbq.readyToDraw()) {
                    try {
                        LLJILJIL.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C1287520jbq c1287520jbq = this.LLILLL;
        c1287520jbq.getClass();
        C1287540jbs c1287540jbs = LLJILJIL;
        synchronized (c1287540jbs) {
            try {
                c1287520jbq.LLILZIL = true;
                c1287540jbs.notifyAll();
                while (c1287520jbq.LLIZ && !c1287520jbq.LLILLJJLI) {
                    try {
                        LLJILJIL.wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIIIIZZ(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        LJIIIIZZ(i, i2);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        getSurfaceTexture();
        LJIIIIZZ(i3 - i, i4 - i2);
    }
}
