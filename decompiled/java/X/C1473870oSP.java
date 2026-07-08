package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oSP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1473870oSP extends TextureView implements InterfaceC1471580oOi, InterfaceC1474060oSi {
    public SurfaceTexture LL;
    public SurfaceWrapper LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public TextureView.SurfaceTextureListener LLILZLL;

    public final /* synthetic */ void LJIIL(String str, ViewGroup.LayoutParams layoutParams) {
        C1474050oSh.LIZIZ(this, str, layoutParams);
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIILIIL(String str, boolean z) {
    }

    public /* bridge */ /* synthetic */ String getStackTraceString() {
        return C1474050oSh.LIZ();
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    private void LJIILL() {
        SurfaceWrapper surfaceWrapper;
        WeakReference<InterfaceC1473850oSN> weakReference;
        InterfaceC1473850oSN interfaceC1473850oSN;
        SurfaceTexture surfaceTexture = this.LL;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.LL = null;
        }
        C1480850odf c1480850odf = C1480850odf.LIZJ;
        if (c1480850odf != null && c1480850odf.isEnableSurfaceLifeCycleNotification() && (surfaceWrapper = this.LLILLJJLI) != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC1473850oSN = weakReference.get()) != null) {
            interfaceC1473850oSN.LIZJ(this.LLILLJJLI);
        }
        SurfaceWrapper surfaceWrapper2 = this.LLILLJJLI;
        if (surfaceWrapper2 != null) {
            C1471640oOo.LIZLLL(surfaceWrapper2);
            this.LLILLJJLI.release();
            this.LLILLJJLI = null;
        }
    }

    public final void LJIILLIIL() {
        SurfaceWrapper surfaceWrapper;
        if (this.LL == null || (surfaceWrapper = this.LLILLJJLI) == null || !surfaceWrapper.isValid()) {
            LJIILL();
            return;
        }
        if (this.LLILLL) {
            return;
        }
        if (this.LL == getSurfaceTexture()) {
            LJIILL();
            return;
        }
        setSurfaceTexture(this.LL);
        this.LLILLL = true;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LLILZLL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(this.LL, getWidth(), getHeight());
        }
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIIZILJ() {
        SurfaceWrapper surfaceWrapper = this.LLILLJJLI;
        if (surfaceWrapper != null) {
            C1471640oOo.LIZLLL(surfaceWrapper);
            this.LLILLJJLI.release();
            this.LLILLJJLI = null;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            C786410Ut5.LJJJLZIJ(this, viewGroup);
            viewGroup.addView(this, layoutParams);
        }
    }

    @Override // X.InterfaceC1474060oSi
    public final boolean LJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLILZIL < 500) {
            return false;
        }
        this.LLILZIL = jCurrentTimeMillis;
        return true;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZ = true;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZ = false;
    }

    public final void LJIILJJIL() {
        LJIILL();
    }

    public Surface getSurface() {
        return this.LLILLJJLI;
    }

    public C1473870oSP(Context context) {
        this(context, null);
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJI(String str) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        if (this.LLILZ && (surfaceTextureListener = getSurfaceTextureListener()) != null) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("KeepSurfaceTextureView", "refreshSurface.");
            }
            SurfaceWrapper surfaceWrapper = this.LLILLJJLI;
            if (surfaceWrapper != null) {
                C1471640oOo.LIZLLL(surfaceWrapper);
                this.LLILLJJLI.release();
                this.LLILLJJLI = null;
                if (this.LL != null) {
                    this.LLILLJJLI = new SurfaceWrapper(this.LL, this);
                    surfaceTextureListener.onSurfaceTextureAvailable(this.LL, getWidth(), getHeight());
                }
            }
        }
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIJJLI(String str) {
        LJI("EngineRefreshSurfaceHelper: NativeWindow");
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0 && this.LLILZ) {
            LJIILLIIL();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LJIJ(layoutParams, "UNKNOWN");
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        C1474050oSh.LIZJ(this, f);
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        C1474050oSh.LIZLLL(this, f);
        super.setScaleY(f);
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LLILZLL = surfaceTextureListener;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        LJIIIIZZ(f, "UNKNOWN");
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        LJIIJJI(f, "UNKNOWN");
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        C1474050oSh.LJI(this, i);
        super.setVisibility(i);
    }

    @Override // android.view.View
    public final void startAnimation(Animation animation) {
        C1474050oSh.LJII(this);
        super.startAnimation(animation);
    }

    public C1473870oSP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.InterfaceC1474060oSi
    public final void LJIIIIZZ(float f, String str) {
        C1474050oSh.LJ(this, str, f);
        super.setTranslationX(f);
    }

    @Override // X.InterfaceC1474060oSi
    public final void LJIIJJI(float f, String str) {
        C1474050oSh.LJFF(this, str, f);
        super.setTranslationY(f);
    }

    public final void LJIJ(ViewGroup.LayoutParams layoutParams, String str) {
        if (C1474810oTv.LLIILZL()) {
            str = "";
        } else if ("UNKNOWN".equals(str)) {
            str = getStackTraceString();
        }
        LJIIL(str, layoutParams);
        super.setLayoutParams(layoutParams);
    }

    public C1473870oSP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0oSO
            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C1473870oSP c1473870oSP = this.LL;
                c1473870oSP.LLILLL = false;
                TextureView.SurfaceTextureListener surfaceTextureListener = c1473870oSP.LLILZLL;
                if (surfaceTextureListener == null || !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
                    return false;
                }
                this.LL.getClass();
                this.LL.LJIILJJIL();
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                SurfaceWrapper surfaceWrapper;
                WeakReference<InterfaceC1473850oSN> weakReference;
                InterfaceC1473850oSN interfaceC1473850oSN;
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLILZLL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                }
                C1480850odf c1480850odf = C1480850odf.LIZJ;
                if (c1480850odf != null && c1480850odf.isEnableSurfaceLifeCycleNotification() && (surfaceWrapper = this.LL.LLILLJJLI) != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC1473850oSN = weakReference.get()) != null) {
                    interfaceC1473850oSN.LIZIZ();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                SurfaceWrapper surfaceWrapper;
                WeakReference<InterfaceC1473850oSN> weakReference;
                InterfaceC1473850oSN interfaceC1473850oSN;
                C1473870oSP c1473870oSP = this.LL;
                if (surfaceTexture != c1473870oSP.LL) {
                    c1473870oSP.LJIILJJIL();
                }
                C1473870oSP c1473870oSP2 = this.LL;
                if (c1473870oSP2.LL == null) {
                    c1473870oSP2.LL = surfaceTexture;
                    c1473870oSP2.LLILLJJLI = new SurfaceWrapper(this.LL.LL, this.LL);
                }
                C1473870oSP c1473870oSP3 = this.LL;
                c1473870oSP3.LLILLL = true;
                TextureView.SurfaceTextureListener surfaceTextureListener = c1473870oSP3.LLILZLL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(c1473870oSP3.LL, i2, i3);
                }
                C1480850odf c1480850odf = C1480850odf.LIZJ;
                if (c1480850odf != null && c1480850odf.isEnableSurfaceLifeCycleNotification() && (surfaceWrapper = this.LL.LLILLJJLI) != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC1473850oSN = weakReference.get()) != null) {
                    interfaceC1473850oSN.LIZ();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLILZLL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
                }
            }
        });
    }
}
