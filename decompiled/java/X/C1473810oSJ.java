package X;

import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oSJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1473810oSJ extends TextureView implements InterfaceC1471580oOi {
    public SurfaceTexture LL;
    public SurfaceWrapper LLILLJJLI;
    public volatile boolean LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public TextureView.SurfaceTextureListener LLJIJIL;

    @Override // X.InterfaceC1471580oOi
    public final void LJIILIIL(String str, boolean z) {
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public final void LIZ() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("markNeedReCreateSurface keepSurfaceTexture:");
            sbLIZ.append(this.LL);
            sbLIZ.append(", surface ");
            sbLIZ.append(this.LLILLJJLI);
            C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLILLL = true;
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIIZILJ() {
        SurfaceWrapper surfaceWrapper = this.LLILLJJLI;
        if (surfaceWrapper != null) {
            C1471640oOo.LIZLLL(surfaceWrapper);
            this.LLILLJJLI.release();
            this.LLILLJJLI = null;
        }
        this.LLILLL = true;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            C786410Ut5.LJJJLZIJ(this, viewGroup);
            viewGroup.addView(this, layoutParams);
        }
    }

    public final void LIZJ() {
        SurfaceWrapper surfaceWrapper;
        SurfaceTexture surfaceTexture;
        if (!C1474810oTv.LJLJJL()) {
            if (this.LL != null && getSurfaceTexture() != this.LL) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("reuseTexture keepSurfaceTexture:");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(", surface ");
                    sbLIZ.append(this.LLILLJJLI);
                    C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ));
                }
                setSurfaceTexture(this.LL);
                this.LLIZ = true;
            } else if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", "same surface texture");
            }
            SurfaceWrapper surfaceWrapper2 = this.LLILLJJLI;
            if (surfaceWrapper2 == null || !surfaceWrapper2.isValid() || !this.LLILLL || (surfaceWrapper = this.LLILLJJLI) == null) {
                return;
            }
            surfaceWrapper.release();
            C1471640oOo.LIZLLL(this.LLILLJJLI);
            this.LLILLJJLI = new SurfaceWrapper(this.LL, this);
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("reCreateSurface keepSurfaceTexture:");
                sbLIZ2.append(this.LL);
                sbLIZ2.append(", surface ");
                sbLIZ2.append(this.LLILLJJLI);
                C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LLILLL = false;
            return;
        }
        boolean z = C1473840oSM.LIZ;
        int i = this.LLILZ;
        int i2 = this.LLILZIL;
        C1473840oSM.LIZ();
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchSurfaceTexture, width:");
            sbLIZ3.append(i);
            sbLIZ3.append(", height:");
            sbLIZ3.append(i2);
            C1481110oe5.LIZIZ("SurfaceTexturePool", C2188811AlT.LIZIZ(sbLIZ3));
            for (C1473830oSL c1473830oSL : C1473840oSM.LIZLLL) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("fetchSurfaceTexture. storedFixedTextureList  it:");
                sbLIZ4.append(c1473830oSL);
                C1481110oe5.LIZIZ("SurfaceTexturePool", C2188811AlT.LIZIZ(sbLIZ4));
            }
            for (C1473830oSL c1473830oSL2 : C1473840oSM.LJ) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("fetchSurfaceTexture. storedOtherTextureList it:");
                sbLIZ5.append(c1473830oSL2);
                C1481110oe5.LIZIZ("SurfaceTexturePool", C2188811AlT.LIZIZ(sbLIZ5));
            }
        }
        C1473830oSL c1473830oSL3 = null;
        if (i >= 0 && i2 >= 0) {
            for (C1473830oSL c1473830oSL4 : C1473840oSM.LIZLLL) {
                if (c1473830oSL4.LIZ == i && c1473830oSL4.LIZIZ == i2) {
                    c1473830oSL3 = c1473830oSL4;
                }
            }
            if (c1473830oSL3 != null) {
                C1473840oSM.LIZLLL.remove(c1473830oSL3);
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("storedFixedTextureList matchedStore:");
                    sbLIZ6.append(c1473830oSL3);
                    C1481110oe5.LIZIZ("SurfaceTexturePool", C2188811AlT.LIZIZ(sbLIZ6));
                }
                surfaceTexture = c1473830oSL3.LIZJ;
            } else {
                for (C1473830oSL c1473830oSL5 : C1473840oSM.LJ) {
                    if (c1473830oSL5.LIZ == i && c1473830oSL5.LIZIZ == i2) {
                        c1473830oSL3 = c1473830oSL5;
                    }
                }
                if (c1473830oSL3 != null) {
                    C1473840oSM.LJ.remove(c1473830oSL3);
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("storedOtherTextureList matchedStore:");
                        sbLIZ7.append(c1473830oSL3);
                        C1481110oe5.LIZIZ("SurfaceTexturePool", C2188811AlT.LIZIZ(sbLIZ7));
                    }
                    surfaceTexture = c1473830oSL3.LIZJ;
                }
            }
            if (surfaceTexture != null) {
                if (getSurfaceTexture() != surfaceTexture) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("reuseTexture keepSurfaceTexture:");
                        sbLIZ8.append(surfaceTexture);
                        sbLIZ8.append(", surface ");
                        sbLIZ8.append(this.LLILLJJLI);
                        sbLIZ8.append(", this:");
                        sbLIZ8.append(this);
                        C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ8));
                    }
                    this.LL = surfaceTexture;
                    setSurfaceTexture(surfaceTexture);
                    this.LLIZ = true;
                }
                this.LLILZLL = 2;
                this.LLILLJJLI = new SurfaceWrapper(surfaceTexture, this);
                return;
            }
        }
        if (this.LLILZ == -1 && this.LLILZIL == -1) {
            this.LLILZLL = 1;
        } else {
            this.LLILZLL = 3;
        }
    }

    public String getViewInfo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(", this:");
        sbLIZ.append(this);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        SurfaceWrapper surfaceWrapper;
        super.onAttachedToWindow();
        if (!this.LLJ || this.LL == null || (surfaceWrapper = this.LLILLJJLI) == null || !surfaceWrapper.isValid()) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", "beAttachedToContainer");
            }
            LIZJ();
        } else {
            if (!this.LLJI) {
                if (this.LL != getSurfaceTexture()) {
                    setSurfaceTexture(this.LL);
                    this.LLJI = true;
                    TextureView.SurfaceTextureListener surfaceTextureListener = this.LLJIJIL;
                    if (surfaceTextureListener != null) {
                        surfaceTextureListener.onSurfaceTextureAvailable(this.LL, getWidth(), getHeight());
                    }
                } else {
                    LIZIZ(true);
                }
            }
            this.LLIZ = true;
            this.LLJ = false;
        }
        if (this.LLIZ) {
            this.LLIZ = false;
            HandlerHook.viewPost(this, new ARunnableS123S0100000_23(this, 47));
        }
        this.LLIZLLLIL = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLIZLLLIL = false;
    }

    public Surface getSurface() {
        return this.LLILLJJLI;
    }

    public int getSurfaceTextureReuseState() {
        return this.LLILZLL;
    }

    public C1473810oSJ(Context context) {
        super(context, null, 0);
        this.LLILZ = -1;
        this.LLILZIL = -1;
        this.LLILZLL = 1;
        this.LLIZLLLIL = true;
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0T6M
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onViewAttachedToWindow view :");
                    sbLIZ.append(view);
                    C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onViewDetachedFromWindow view :");
                    sbLIZ.append(view);
                    C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        });
        super.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC1473820oSK(this));
    }

    public final void LIZIZ(boolean z) {
        WeakReference<InterfaceC1473850oSN> weakReference;
        InterfaceC1473850oSN interfaceC1473850oSN;
        SurfaceTexture surfaceTexture;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseSurface ");
            sbLIZ.append(z);
            C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!C1474810oTv.LJLJJL() && (surfaceTexture = this.LL) != null && z) {
            surfaceTexture.release();
            this.LL = null;
        }
        C1480850odf c1480850odf = C1480850odf.LIZJ;
        if (c1480850odf != null && c1480850odf.isEnableSurfaceLifeCycleNotification()) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("KeepSurfaceTextureView onSurfaceDestroyed sf: ");
                sbLIZ2.append(this.LLILLJJLI);
                C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ2));
            }
            SurfaceWrapper surfaceWrapper = this.LLILLJJLI;
            if (surfaceWrapper != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC1473850oSN = weakReference.get()) != null) {
                interfaceC1473850oSN.LIZJ(this.LLILLJJLI);
            }
        }
        SurfaceWrapper surfaceWrapper2 = this.LLILLJJLI;
        if (surfaceWrapper2 != null) {
            surfaceWrapper2.release();
            C1471640oOo.LIZLLL(this.LLILLJJLI);
            this.LLILLJJLI = null;
        }
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJI(String str) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        if (this.LLIZLLLIL && (surfaceTextureListener = getSurfaceTextureListener()) != null) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", "refreshSurface.");
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

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LLJIJIL = surfaceTextureListener;
    }
}
