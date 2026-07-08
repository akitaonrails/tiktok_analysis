package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.1A79, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A79 extends TextureView implements InterfaceC2178741AOq, InterfaceC1474480oTO {
    public TextureView.SurfaceTextureListener LL;
    public C1A7D LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Surface LLILZIL;
    public SurfaceTexture LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public C1A77 LLJ;
    public C1474420oTI LLJI;

    public View getGestureView() {
        return this;
    }

    @Override // X.InterfaceC2178741AOq
    public SurfaceHolder getSurfaceHolder() {
        return null;
    }

    @Override // X.InterfaceC2178741AOq
    public View getView() {
        return this;
    }

    public final void LIZIZ() throws Throwable {
        Surface surface;
        if (!this.LLILLL || this.LLILZLL == null || !this.LLILZ || (surface = this.LLILZIL) == null || !surface.isValid() || this.LLILZLL == getSurfaceTexture()) {
            return;
        }
        boolean zLIZ = LIZ(this.LLILZLL);
        PrintStream printStream = System.err;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSurfaceTextureReleased:");
        sbLIZ.append(zLIZ);
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZ) {
            return;
        }
        setSurfaceTexture(this.LLILZLL);
        C1A7D c1a7d = this.LLILLJJLI;
        if (c1a7d != null) {
            ((C2178631AOf) c1a7d).LJJLIIIIJ();
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(this.LLILZLL, 0, 0);
        }
    }

    public float getCenterCropScaleFactor() {
        return this.LLJ.LIZ();
    }

    public float getCenterInsideScaleFactor() {
        this.LLJ.getClass();
        return 1.0f;
    }

    public float getLayoutScaleFactor() {
        return this.LLJ.LIZJ();
    }

    public Rect getRealViewRect() {
        return new Rect((int) getRealLeft(), (int) getRealTop(), (int) getRealRight(), (int) getRealBottom());
    }

    public RectF getRealViewRectF() {
        return new RectF(getRealLeft(), getRealTop(), getRealRight(), getRealBottom());
    }

    public int getVideoHeight() {
        return this.LLJ.LIZJ;
    }

    public int getVideoWidth() {
        return this.LLJ.LIZIZ;
    }

    public RectF getViewRect() {
        C1A77 c1a77 = this.LLJ;
        c1a77.getClass();
        return new RectF(c1a77.LIZLLL(), c1a77.LJ(), c1a77.LIZLLL() + (c1a77.LIZ.getWidth() * c1a77.LIZ.getScaleX()), c1a77.LJ() + (c1a77.LIZ.getHeight() * c1a77.LIZ.getScaleY()));
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        C1A77 c1a77 = this.LLJ;
        c1a77.LIZLLL = 0;
        c1a77.LJ = 0;
        super.onAttachedToWindow();
    }

    public float getRealBottom() {
        return getRealTop() + getRealHeight();
    }

    public float getRealHeight() {
        return getHeight() * getScaleY();
    }

    public float getRealLeft() {
        return getLeft() + ((getWidth() - getRealWidth()) / 2.0f) + getTranslationX();
    }

    public float getRealRight() {
        return getRealLeft() + getRealWidth();
    }

    public float getRealTop() {
        return getTop() + ((getHeight() - getRealHeight()) / 2.0f) + getTranslationY();
    }

    public float getRealWidth() {
        return getWidth() * getScaleX();
    }

    public C1474420oTI getPlayEntity() {
        return this.LLJI;
    }

    @Override // X.InterfaceC2178741AOq
    public Surface getSurface() {
        return this.LLILZIL;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C1A79(Context context) {
        super(context, null);
        this.LLJ = new C1A77(this, this);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.1A7A
            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Surface surface;
                C1A79 c1a79 = this.LL;
                if (c1a79.LLILLL && !c1a79.LLILZ && (surface = c1a79.LLILZIL) != null) {
                    surface.release();
                    C1A79 c1a792 = this.LL;
                    c1a792.LLILZIL = null;
                    c1a792.LLILZLL = null;
                }
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
                }
                C1A7D c1a7d = this.LL.LLILLJJLI;
                if (c1a7d != null) {
                    ((C2178631AOf) c1a7d).LJJLIIIJ();
                }
                C1A79 c1a793 = this.LL;
                if (!c1a793.LLILLL) {
                    Surface surface2 = c1a793.LLILZIL;
                    if (surface2 != null) {
                        surface2.release();
                        c1a793.LLILZIL = null;
                    }
                    c1a793.LLILZ = false;
                    c1a793.LLILZIL = null;
                    c1a793.LLILZLL = null;
                }
                return !this.LL.LLILLL;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C1A79 c1a79 = this.LL;
                if (c1a79.LLILLL) {
                    Surface surface = c1a79.LLILZIL;
                    if (surface != null && (!c1a79.LLILZ || !surface.isValid())) {
                        this.LL.LLILZIL.release();
                        C1A79 c1a792 = this.LL;
                        c1a792.LLILZIL = null;
                        c1a792.LLILZLL = null;
                    }
                    C1A79 c1a793 = this.LL;
                    if (c1a793.LLILZIL == null) {
                        c1a793.LLILZIL = new Surface(surfaceTexture);
                        this.LL.LLILZLL = surfaceTexture;
                    } else {
                        try {
                            SurfaceTexture surfaceTexture2 = c1a793.LLILZLL;
                            if (surfaceTexture2 != null && !C1A79.LIZ(surfaceTexture2)) {
                                C1A79 c1a794 = this.LL;
                                if (c1a794.LLILZLL != c1a794.getSurfaceTexture()) {
                                    C1A79 c1a795 = this.LL;
                                    c1a795.setSurfaceTexture(c1a795.LLILZLL);
                                }
                            } else {
                                C1A79 c1a796 = this.LL;
                                c1a796.LLILZLL = surfaceTexture;
                                c1a796.LLILZIL = new Surface(surfaceTexture);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("surface_texture_available:");
                            sbLIZ.append(e.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ);
                            C1A79 c1a797 = this.LL;
                            c1a797.LLILZLL = surfaceTexture;
                            c1a797.LLILZIL = new Surface(surfaceTexture);
                        }
                    }
                    this.LL.LLILZ = true;
                } else {
                    c1a79.LLILZIL = new Surface(surfaceTexture);
                    this.LL.LLILZLL = surfaceTexture;
                }
                C1A7D c1a7d = this.LL.LLILLJJLI;
                if (c1a7d != null) {
                    ((C2178631AOf) c1a7d).LJJLIIIIJ();
                }
                C1A79 c1a798 = this.LL;
                TextureView.SurfaceTextureListener surfaceTextureListener = c1a798.LL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(c1a798.LLILZLL, i, i2);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSurfaceTextureSizeChanged width:");
                sbLIZ.append(i);
                sbLIZ.append(" height:");
                sbLIZ.append(i2);
                C2188811AlT.LIZIZ(sbLIZ);
                C1A7D c1a7d = this.LL.LLILLJJLI;
                if (c1a7d != null) {
                    ((C2178631AOf) c1a7d).LJJLI();
                }
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }
        });
    }

    public static boolean LIZ(SurfaceTexture surfaceTexture) throws Throwable {
        if (surfaceTexture == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return surfaceTexture.isReleased();
        }
        Method methodLIZ = C1961607mI.LIZ(SurfaceTexture.class, "isReleased", null);
        boolean zBooleanValue = false;
        if (methodLIZ != null) {
            try {
                Object objA0 = C2204961BRm.a0(methodLIZ, surfaceTexture, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKcGbfixMLpxHqzfYQUE3HtAlFxjNfZJ0MU633YAfYNO2mYCgk", null));
                if (objA0 instanceof Boolean) {
                    zBooleanValue = ((Boolean) objA0).booleanValue();
                    return zBooleanValue;
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return zBooleanValue;
            }
        }
        return zBooleanValue;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) throws Throwable {
        super.onWindowVisibilityChanged(i);
        if (getVisibility() == 0 && i == 0) {
            LIZIZ();
        }
    }

    public void setCropStrategy(C1474490oTP c1474490oTP) {
        this.LLJ.getClass();
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z) {
        super.setKeepScreenOn(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("texture view keep_screen_on:");
        sbLIZ.append(Boolean.valueOf(z).toString());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public void setMaxScaleFactor(float f) {
        C1A77 c1a77 = this.LLJ;
        c1a77.getClass();
        if (!Float.isNaN(f) && f >= 0.0f && f <= Float.MAX_VALUE) {
            c1a77.LJII = f;
        }
    }

    public void setMinScaleFactor(float f) {
        C1A77 c1a77 = this.LLJ;
        c1a77.getClass();
        if (!Float.isNaN(f) && f >= 0.0f && f <= Float.MAX_VALUE) {
            c1a77.LJIIIIZZ = f;
        }
    }

    public void setOptimizeBlackSide(boolean z) {
        this.LLJ.getClass();
    }

    public void setOptimizeNormalFillScreen(boolean z) {
        this.LLJ.LJIIJ = z;
    }

    @Override // X.InterfaceC2178741AOq
    public void setPlayEntity(C1474420oTI c1474420oTI) {
        this.LLJI = c1474420oTI;
    }

    public void setResizeListener(C1A78 c1a78) {
        this.LLJ.getClass();
    }

    public void setReuseSurfaceTexture(boolean z) {
        this.LLILLL = z;
    }

    public void setRotatable(boolean z) {
        this.LLJ.getClass();
    }

    public void setScalable(boolean z) {
        this.LLJ.getClass();
    }

    @Override // X.InterfaceC2178741AOq
    public void setSurfaceCallback(C1A7D c1a7d) {
        this.LLILLJJLI = c1a7d;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LL = surfaceTextureListener;
    }

    public void setTextureLayout(int i) {
        C1A77 c1a77 = this.LLJ;
        if (c1a77.LJIIIZ != i) {
            c1a77.LJIIIZ = i;
            c1a77.LIZ.requestLayout();
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        this.LLJ.getClass();
    }

    public void setTranslatable(boolean z) {
        this.LLJ.getClass();
    }

    public void setZoomingEnabled(boolean z) {
        this.LLJ.LJIIJJI = z;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widthMeasureSpec:");
        sbLIZ.append(View.MeasureSpec.toString(i));
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("heightMeasureSpec:");
        sbLIZ2.append(View.MeasureSpec.toString(i2));
        C2188811AlT.LIZIZ(sbLIZ2);
        Pair<Integer, Integer> pairLJFF = this.LLJ.LJFF(i, i2, getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom());
        setMeasuredDimension(((Integer) pairLJFF.first).intValue(), ((Integer) pairLJFF.second).intValue());
    }

    @Override // android.view.TextureView, android.view.View
    public final void onVisibilityChanged(View view, int i) throws Throwable {
        try {
            super.onVisibilityChanged(view, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (view == this && i == 0) {
            LIZIZ();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (this.LLIZ != width || this.LLIZLLLIL != height) {
            this.LLIZ = width;
            this.LLIZLLLIL = height;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tv_size_layout:");
            sbLIZ.append(width);
            sbLIZ.append("*");
            sbLIZ.append(height);
            sbLIZ.append(" parent:");
            sbLIZ.append(this.LLJ.LJFF);
            sbLIZ.append("*");
            sbLIZ.append(this.LLJ.LJI);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            EnumC1471780oP2 enumC1471780oP2 = EnumC1471780oP2.INS;
            C1474420oTI c1474420oTI = this.LLJI;
            C1A77 c1a77 = this.LLJ;
            enumC1471780oP2.updateTextureSize(c1474420oTI, width, height, c1a77.LJFF, c1a77.LJI, getScaleX(), getContext());
            C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("TVOnLayout", EnumC1474430oTJ.TEXTURE_SIZE, 6);
            if (c1471760oP0LIZIZ != null) {
                c1471760oP0LIZIZ.LIZ("info", strLIZIZ);
                EnumC1471750oOz.INS.addTrace(this.LLJI, c1471760oP0LIZIZ);
            }
        }
    }
}
