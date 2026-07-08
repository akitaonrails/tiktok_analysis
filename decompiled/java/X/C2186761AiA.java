package X;

import Y.ARunnableS10S0100001_33;
import Y.ARunnableS133S0100000_33;
import Y.ARunnableS51S0110000_33;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1AiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2186761AiA extends ViewGroup {
    public C2186771AiB LL;
    public WindowManager LLILLJJLI;
    public BPEAHandler LLILLL;
    public boolean LLILZ;
    public SurfaceView LLILZIL;
    public TextureView LLILZLL;
    public boolean LLIZ;
    public C2186961AiU LLIZLLLIL;
    public int LLJ;
    public final List<InterfaceC2186931AiR> LLJI;
    public C2186951AiT LLJIJIL;
    public C2186981AiW LLJILJIL;
    public C2186841AiI LLJILJILJ;
    public C2186841AiI LLJILLL;
    public Rect LLJJ;
    public C2186841AiI LLJJI;
    public Rect LLJJIII;
    public Rect LLJJIJI;
    public C2186841AiI LLJJIJIIJIL;
    public double LLJJIJIL;
    public AbstractC2186971AiV LLJJJ;
    public boolean LLJJJIL;
    public final SurfaceHolderCallbackC2186891AiN LLJJJJ;
    public final C2186991AiX LLJJJJJIL;
    public final C2186821AiG LLJJJJLIIL;

    public void LIZIZ() {
    }

    private int getDisplayRotation() {
        return C2204961BRm.LLILZIL(this.LLILLJJLI, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmMuLgQZ2hbjUb4E7S0zKZkc1eearIGQ", null)).getRotation();
    }

    public final void LIZLLL() {
        if (this.LL == null || getDisplayRotation() == this.LLJ) {
            return;
        }
        LIZ();
        LIZJ();
    }

    public final void LJFF() {
        Rect rect;
        float f;
        C2186841AiI c2186841AiI = this.LLJJI;
        if (c2186841AiI == null || this.LLJILLL == null || (rect = this.LLJJ) == null) {
            return;
        }
        if (this.LLILZIL != null && c2186841AiI.equals(new C2186841AiI(rect.width(), this.LLJJ.height()))) {
            LJ(new C2186941AiS(this.LLILZIL.getHolder()));
            return;
        }
        TextureView textureView = this.LLILZLL;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.LLJILLL != null) {
            int width = this.LLILZLL.getWidth();
            int height = this.LLILZLL.getHeight();
            C2186841AiI c2186841AiI2 = this.LLJILLL;
            float f2 = width / height;
            float f3 = c2186841AiI2.LL / c2186841AiI2.LLILLJJLI;
            float f4 = 1.0f;
            if (f2 < f3) {
                float f5 = f3 / f2;
                f = 1.0f;
                f4 = f5;
            } else {
                f = f2 / f3;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f4, f);
            float f6 = width;
            float f7 = height;
            matrix.postTranslate((f6 - (f4 * f6)) / 2.0f, (f7 - (f * f7)) / 2.0f);
            this.LLILZLL.setTransform(matrix);
        }
        LJ(new C2186941AiS(this.LLILZLL.getSurfaceTexture()));
    }

    public AbstractC2186971AiV getPreviewScalingStrategy() {
        AbstractC2186971AiV abstractC2186971AiV = this.LLJJJ;
        return abstractC2186971AiV != null ? abstractC2186971AiV : this.LLILZLL != null ? new C2186861AiK() : new C2186871AiL();
    }

    public final void LIZ() {
        TextureView textureView;
        SurfaceView surfaceView;
        C21147817pM.LIZ();
        this.LLJ = -1;
        C2186771AiB c2186771AiB = this.LL;
        if (c2186771AiB != null) {
            C21147817pM.LIZ();
            if (c2186771AiB.LJFF) {
                c2186771AiB.LIZ.LIZIZ(c2186771AiB.LJIILJJIL);
            } else {
                c2186771AiB.LJI = true;
            }
            c2186771AiB.LJFF = false;
            this.LL = null;
            this.LLIZ = false;
        } else {
            C786410Ut5.LJLILLLLZI(this.LLILLL, R.id.zxing_camera_closed);
        }
        if (this.LLJJI == null && (surfaceView = this.LLILZIL) != null) {
            surfaceView.getHolder().removeCallback(this.LLJJJJ);
        }
        if (this.LLJJI == null && (textureView = this.LLILZLL) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJIJI = null;
        C2186961AiU c2186961AiU = this.LLIZLLLIL;
        C2186781AiC c2186781AiC = c2186961AiU.LIZJ;
        if (c2186781AiC != null) {
            c2186781AiC.disable();
        }
        c2186961AiU.LIZJ = null;
        c2186961AiU.LIZIZ = null;
        c2186961AiU.LIZLLL = null;
        this.LLJJJJLIIL.LIZIZ();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.1AiC, android.view.OrientationEventListener] */
    public void LIZJ() {
        C21147817pM.LIZ();
        if (this.LL == null) {
            getContext();
            C2186771AiB c2186771AiB = new C2186771AiB();
            C2186981AiW c2186981AiW = this.LLJILJIL;
            if (!c2186771AiB.LJFF) {
                c2186771AiB.LJIIIIZZ = c2186981AiW;
                c2186771AiB.LIZJ.LJFF = c2186981AiW;
            }
            this.LL = c2186771AiB;
            c2186771AiB.LIZJ.getClass();
            C2186771AiB c2186771AiB2 = this.LL;
            c2186771AiB2.LIZLLL = this.LLILLL;
            C21147817pM.LIZ();
            c2186771AiB2.LJFF = true;
            c2186771AiB2.LJI = false;
            C1701370uNL c1701370uNL = c2186771AiB2.LIZ;
            ARunnableS133S0100000_33 aRunnableS133S0100000_33 = c2186771AiB2.LJIIIZ;
            synchronized (c1701370uNL.LIZLLL) {
                try {
                    c1701370uNL.LIZJ++;
                    c1701370uNL.LIZIZ(aRunnableS133S0100000_33);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLJ = getDisplayRotation();
        }
        if (this.LLJJI != null) {
            LJFF();
        } else {
            SurfaceView surfaceView = this.LLILZIL;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.LLJJJJ);
            } else {
                TextureView textureView = this.LLILZLL;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        new TextureViewSurfaceTextureListenerC2186911AiP(this).onSurfaceTextureSizeChanged(this.LLILZLL.getSurfaceTexture(), this.LLILZLL.getWidth(), this.LLILZLL.getHeight());
                    } else {
                        this.LLILZLL.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2186911AiP(this));
                    }
                }
            }
        }
        requestLayout();
        final C2186961AiU c2186961AiU = this.LLIZLLLIL;
        Context context = getContext();
        C2186991AiX c2186991AiX = this.LLJJJJJIL;
        C2186781AiC c2186781AiC = c2186961AiU.LIZJ;
        if (c2186781AiC != null) {
            c2186781AiC.disable();
        }
        c2186961AiU.LIZJ = null;
        c2186961AiU.LIZIZ = null;
        c2186961AiU.LIZLLL = null;
        final Context contextN3 = C786410Ut5.N3(context);
        c2186961AiU.LIZLLL = c2186991AiX;
        c2186961AiU.LIZIZ = (WindowManager) C786410Ut5.H2(contextN3, "window");
        ?? r0 = new OrientationEventListener(contextN3) { // from class: X.1AiC
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                C2186961AiU c2186961AiU2 = c2186961AiU;
                WindowManager windowManager = c2186961AiU2.LIZIZ;
                InterfaceC2187011AiZ interfaceC2187011AiZ = c2186961AiU2.LIZLLL;
                if (windowManager != null && interfaceC2187011AiZ != null) {
                    int rotation = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmMuLgQZ2hbjUb4V4zQ3L5Ejyc6FtpCCy5Cc", null)).getRotation();
                    C2186961AiU c2186961AiU3 = c2186961AiU;
                    if (rotation != c2186961AiU3.LIZ) {
                        c2186961AiU3.LIZ = rotation;
                        C2186991AiX c2186991AiX2 = (C2186991AiX) interfaceC2187011AiZ;
                        C786410Ut5.LJLIIL(250L, c2186991AiX2.LIZ.LLILLL, new ARunnableS133S0100000_33(c2186991AiX2, 32));
                    }
                }
            }
        };
        c2186961AiU.LIZJ = r0;
        r0.enable();
        c2186961AiU.LIZ = C2204961BRm.LLILZIL(c2186961AiU.LIZIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmMuLgQZ2hbjUb4V4zQ3L5Ejyc6FtpCCy5Cc", null)).getRotation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLILZ) {
            TextureView textureView = new TextureView(getContext());
            this.LLILZLL = textureView;
            textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2186911AiP(this));
            addView(this.LLILZLL);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.LLILZIL = surfaceView;
        surfaceView.getHolder().addCallback(this.LLJJJJ);
        addView(this.LLILZIL);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.LLJJJIL);
        return bundle;
    }

    public C2186771AiB getCameraInstance() {
        return this.LL;
    }

    public C2186981AiW getCameraSettings() {
        return this.LLJILJIL;
    }

    public Rect getFramingRect() {
        return this.LLJJIII;
    }

    public C2186841AiI getFramingRectSize() {
        return this.LLJJIJIIJIL;
    }

    public double getMarginFraction() {
        return this.LLJJIJIL;
    }

    public Rect getPreviewFramingRect() {
        return this.LLJJIJI;
    }

    public final void LJ(C2186941AiS c2186941AiS) {
        C2186771AiB c2186771AiB;
        if (!this.LLIZ && (c2186771AiB = this.LL) != null) {
            c2186771AiB.LIZIZ = c2186941AiS;
            C21147817pM.LIZ();
            if (c2186771AiB.LJFF) {
                c2186771AiB.LIZ.LIZIZ(c2186771AiB.LJIIJJI);
            }
            this.LLIZ = true;
            LIZIZ();
            this.LLJJJJLIIL.LIZ();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public void setCameraSettings(C2186981AiW c2186981AiW) {
        this.LLJILJIL = c2186981AiW;
    }

    public void setFramingRectSize(C2186841AiI c2186841AiI) {
        this.LLJJIJIIJIL = c2186841AiI;
    }

    public void setLightListener(InterfaceC2187001AiY interfaceC2187001AiY) {
        C2186771AiB c2186771AiB = this.LL;
        if (c2186771AiB != null) {
            c2186771AiB.LIZJ.getClass();
        }
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.LLJJIJIL = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(AbstractC2186971AiV abstractC2186971AiV) {
        this.LLJJJ = abstractC2186971AiV;
    }

    public void setTorch(boolean z) {
        this.LLJJJIL = z;
        C2186771AiB c2186771AiB = this.LL;
        if (c2186771AiB != null) {
            C21147817pM.LIZ();
            if (c2186771AiB.LJFF) {
                c2186771AiB.LIZ.LIZIZ(new ARunnableS51S0110000_33(c2186771AiB, z, 1));
            }
        }
    }

    public void setUseTextureView(boolean z) {
        this.LLILZ = z;
    }

    public void setZoom(float f) {
        C2186771AiB c2186771AiB = this.LL;
        if (c2186771AiB != null && !c2186771AiB.LJI) {
            c2186771AiB.getClass();
            C21147817pM.LIZ();
            if (c2186771AiB.LJFF) {
                c2186771AiB.LIZ.LIZIZ(new ARunnableS10S0100001_33(c2186771AiB, f, 2));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1AiN] */
    public C2186761AiA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = -1;
        this.LLJI = new ArrayList();
        this.LLJILJIL = new C2186981AiW();
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = 0.1d;
        this.LLJJJ = null;
        this.LLJJJIL = false;
        this.LLJJJJ = new SurfaceHolder.Callback() { // from class: X.1AiN
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (!Build.BRAND.equalsIgnoreCase("Meizu")) {
                    this.LL.LLJJI = null;
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                if (surfaceHolder == null) {
                    return;
                }
                C2186761AiA c2186761AiA = this.LL;
                c2186761AiA.LLJJI = new C2186841AiI(i2, i3);
                c2186761AiA.LJFF();
            }
        };
        C2189631Amn c2189631Amn = new C2189631Amn(this, 1);
        this.LLJJJJJIL = new C2186991AiX(this);
        this.LLJJJJLIIL = new C2186821AiG(this);
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.zxing_camera_preview);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.LLJJIJIIJIL = new C2186841AiI(dimension, dimension2);
        }
        this.LLILZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            this.LLJJJ = new C2186861AiK();
        } else if (integer == 2) {
            this.LLJJJ = new C2186871AiL();
        } else if (integer == 3) {
            this.LLJJJ = new AbstractC2186971AiV() { // from class: X.1AiQ
                @Override // X.AbstractC2186971AiV
                public final float LIZ(C2186841AiI c2186841AiI, C2186841AiI c2186841AiI2) {
                    int i;
                    int i2 = c2186841AiI.LL;
                    if (i2 > 0 && (i = c2186841AiI.LLILLJJLI) > 0) {
                        int i3 = c2186841AiI2.LL;
                        float f = (i2 * 1.0f) / i3;
                        if (f < 1.0f) {
                            f = 1.0f / f;
                        }
                        int i4 = c2186841AiI2.LLILLJJLI;
                        float f2 = (i * 1.0f) / i4;
                        if (f2 < 1.0f) {
                            f2 = 1.0f / f2;
                        }
                        float f3 = (1.0f / f) / f2;
                        float f4 = ((i2 * 1.0f) / i) / ((i3 * 1.0f) / i4);
                        if (f4 < 1.0f) {
                            f4 = 1.0f / f4;
                        }
                        return f3 * (((1.0f / f4) / f4) / f4);
                    }
                    return 0.0f;
                }

                @Override // X.AbstractC2186971AiV
                public final Rect LIZIZ(C2186841AiI c2186841AiI, C2186841AiI c2186841AiI2) {
                    return new Rect(0, 0, c2186841AiI2.LL, c2186841AiI2.LLILLJJLI);
                }
            };
        }
        typedArrayObtainStyledAttributes.recycle();
        this.LLILLJJLI = (WindowManager) C786410Ut5.H2(context, "window");
        this.LLILLL = new BPEAHandler(c2189631Amn);
        this.LLIZLLLIL = new C2186961AiU();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2186841AiI c2186841AiI = new C2186841AiI(i3 - i, i4 - i2);
        this.LLJILJILJ = c2186841AiI;
        C2186771AiB c2186771AiB = this.LL;
        if (c2186771AiB != null && c2186771AiB.LJ == null) {
            C2186951AiT c2186951AiT = new C2186951AiT(getDisplayRotation(), c2186841AiI);
            this.LLJIJIL = c2186951AiT;
            c2186951AiT.LIZJ = getPreviewScalingStrategy();
            C2186771AiB c2186771AiB2 = this.LL;
            C2186951AiT c2186951AiT2 = this.LLJIJIL;
            c2186771AiB2.LJ = c2186951AiT2;
            c2186771AiB2.LIZJ.LJI = c2186951AiT2;
            C21147817pM.LIZ();
            if (c2186771AiB2.LJFF) {
                c2186771AiB2.LIZ.LIZIZ(c2186771AiB2.LJIIJ);
            }
            boolean z2 = this.LLJJJIL;
            if (z2) {
                C2186771AiB c2186771AiB3 = this.LL;
                c2186771AiB3.getClass();
                C21147817pM.LIZ();
                if (c2186771AiB3.LJFF) {
                    c2186771AiB3.LIZ.LIZIZ(new ARunnableS51S0110000_33(c2186771AiB3, z2, 1));
                }
            }
        }
        SurfaceView surfaceView = this.LLILZIL;
        if (surfaceView != null) {
            Rect rect = this.LLJJ;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
                return;
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        TextureView textureView = this.LLILZLL;
        if (textureView == null) {
            return;
        }
        textureView.layout(0, 0, getWidth(), getHeight());
    }
}
