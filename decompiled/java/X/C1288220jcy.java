package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0jcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1288220jcy extends TextureView {
    public Surface LL;
    public SurfaceTexture LLILLJJLI;
    public TextureView.SurfaceTextureListener LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        this.LLJI = 0;
        this.LLJIJIL = 0;
        super.onAttachedToWindow();
    }

    public final void LIZIZ() throws Throwable {
        Surface surface;
        if (!this.LLJILJIL || this.LLILLJJLI == null || !this.LLILZ || (surface = this.LL) == null || !surface.isValid() || this.LLILLJJLI == getSurfaceTexture()) {
            return;
        }
        boolean zLIZ = LIZ(this.LLILLJJLI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSurfaceTextureReleased:");
        sbLIZ.append(zLIZ);
        LynxLog.e("TextureVideoView", C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZ) {
            return;
        }
        setSurfaceTexture(this.LLILLJJLI);
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LLILLL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(this.LLILLJJLI, 0, 0);
        }
    }

    public Surface getSurface() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C1288220jcy(Context context) {
        super(context, null, 0);
        this.LLJ = 2;
        setReuseSurfaceTexture(true);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0jcx
            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Surface surface;
                C1288220jcy c1288220jcy = this.LL;
                if (c1288220jcy.LLJILJIL && !c1288220jcy.LLILZ && (surface = c1288220jcy.LL) != null) {
                    surface.release();
                    C1288220jcy c1288220jcy2 = this.LL;
                    c1288220jcy2.LL = null;
                    c1288220jcy2.LLILLJJLI = null;
                }
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLILLL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
                }
                C1288220jcy c1288220jcy3 = this.LL;
                if (!c1288220jcy3.LLJILJIL) {
                    Surface surface2 = c1288220jcy3.LL;
                    if (surface2 != null) {
                        surface2.release();
                        c1288220jcy3.LL = null;
                    }
                    c1288220jcy3.LLILZ = false;
                    c1288220jcy3.LL = null;
                    c1288220jcy3.LLILLJJLI = null;
                }
                return !this.LL.LLJILJIL;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLILLL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSurfaceTextureAvailable width = ");
                sbLIZ.append(i);
                sbLIZ.append(" height = ");
                sbLIZ.append(i2);
                LynxLog.i("TextureVideoView", C2188811AlT.LIZIZ(sbLIZ));
                C1288220jcy c1288220jcy = this.LL;
                if (c1288220jcy.LLJILJIL) {
                    Surface surface = c1288220jcy.LL;
                    if (surface != null && (!c1288220jcy.LLILZ || !surface.isValid())) {
                        this.LL.LL.release();
                        C1288220jcy c1288220jcy2 = this.LL;
                        c1288220jcy2.LL = null;
                        c1288220jcy2.LLILLJJLI = null;
                    }
                    C1288220jcy c1288220jcy3 = this.LL;
                    if (c1288220jcy3.LL == null) {
                        c1288220jcy3.LL = new Surface(surfaceTexture);
                        this.LL.LLILLJJLI = surfaceTexture;
                    } else {
                        try {
                            SurfaceTexture surfaceTexture2 = c1288220jcy3.LLILLJJLI;
                            if (surfaceTexture2 != null && !C1288220jcy.LIZ(surfaceTexture2)) {
                                C1288220jcy c1288220jcy4 = this.LL;
                                if (c1288220jcy4.LLILLJJLI != c1288220jcy4.getSurfaceTexture()) {
                                    C1288220jcy c1288220jcy5 = this.LL;
                                    c1288220jcy5.setSurfaceTexture(c1288220jcy5.LLILLJJLI);
                                }
                            } else {
                                C1288220jcy c1288220jcy6 = this.LL;
                                c1288220jcy6.LLILLJJLI = surfaceTexture;
                                c1288220jcy6.LL = new Surface(surfaceTexture);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onSurfaceTextureAvailable encounter exception ");
                            sbLIZ2.append(e.getMessage());
                            LynxLog.e("TextureVideoView", C2188811AlT.LIZIZ(sbLIZ2));
                            C1288220jcy c1288220jcy7 = this.LL;
                            c1288220jcy7.LLILLJJLI = surfaceTexture;
                            c1288220jcy7.LL = new Surface(surfaceTexture);
                        }
                    }
                    this.LL.LLILZ = true;
                } else {
                    c1288220jcy.LL = new Surface(surfaceTexture);
                    this.LL.LLILLJJLI = surfaceTexture;
                }
                C1288220jcy c1288220jcy8 = this.LL;
                TextureView.SurfaceTextureListener surfaceTextureListener = c1288220jcy8.LLILLL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(c1288220jcy8.LLILLJJLI, i, i2);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLILLL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.reflect.Method] */
    public static boolean LIZ(SurfaceTexture surfaceTexture) throws Throwable {
        Method declaredMethod;
        String method = "isReleased";
        if (surfaceTexture == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return surfaceTexture.isReleased();
        }
        if (!TextUtils.isEmpty("isReleased")) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("thread id : ");
                sbLIZ.append(C786410Ut5.u3().getName());
                LynxLog.d("TextureVideoView", C2188811AlT.LIZIZ(sbLIZ));
                method = SurfaceTexture.class.getMethod("isReleased", null);
                declaredMethod = method;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("exception in getMethod, pkg : ");
                sbLIZ2.append(SurfaceTexture.class.getName());
                sbLIZ2.append(", function : ");
                sbLIZ2.append("isReleased");
                sbLIZ2.append(", ");
                sbLIZ2.append(th.toString());
                LynxLog.e("TextureVideoView", C2188811AlT.LIZIZ(sbLIZ2));
                try {
                    declaredMethod = SurfaceTexture.class.getDeclaredMethod(method, null);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("exception in getMethod fallback ");
                    sbLIZ3.append(th.getMessage());
                    LynxLog.e("TextureVideoView", C2188811AlT.LIZIZ(sbLIZ3));
                    declaredMethod = 0;
                }
            }
        } else {
            declaredMethod = 0;
        }
        boolean zBooleanValue = false;
        if (declaredMethod != 0) {
            try {
                Object objA0 = C2204961BRm.a0(declaredMethod, surfaceTexture, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaYvTINRnKt5Qq7ei4BkMOijm6IKsHE2MAqD6w==", null));
                if (objA0 instanceof Boolean) {
                    zBooleanValue = ((Boolean) objA0).booleanValue();
                    return zBooleanValue;
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.e("TextureVideoView", "isSurfaceTextureReleased encounter exception " + e.getMessage());
            } catch (InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LynxLog.e("TextureVideoView", "isSurfaceTextureReleased encounter exception " + e2.getMessage());
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

    public void setReuseSurfaceTexture(boolean z) {
        this.LLJILJIL = true;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LLILLL = surfaceTextureListener;
    }

    public void setVideoViewLayout(int i) {
        if (this.LLJ != i) {
            this.LLJ = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        } else if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        }
        int i5 = this.LLJ;
        if (i5 != 1 && (i3 = this.LLILZIL) > 0 && (i4 = this.LLILZLL) > 0) {
            if (i5 == 2) {
                float f = suggestedMinimumHeight;
                float f2 = suggestedMinimumWidth;
                float f3 = i4;
                float f4 = i3;
                if (f3 / f4 > f / f2) {
                    suggestedMinimumHeight = (int) (f3 * ((f2 * 1.0f) / f4));
                } else {
                    suggestedMinimumWidth = (int) (f4 * ((f * 1.0f) / f3));
                }
                if (this.LLJI != suggestedMinimumWidth || this.LLJIJIL != suggestedMinimumHeight) {
                    this.LLJI = suggestedMinimumWidth;
                    this.LLJIJIL = suggestedMinimumHeight;
                }
                setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
                return;
            }
            float f5 = i3;
            float f6 = i4;
            int i6 = (int) (((suggestedMinimumWidth * 1.0f) / f5) * f6);
            if (i6 > suggestedMinimumHeight) {
                suggestedMinimumWidth = (int) (f5 * ((suggestedMinimumHeight * 1.0f) / f6));
            } else {
                suggestedMinimumHeight = i6;
            }
            if (this.LLJI != suggestedMinimumWidth || this.LLJIJIL != suggestedMinimumHeight) {
                this.LLJI = suggestedMinimumWidth;
                this.LLJIJIL = suggestedMinimumHeight;
            }
            setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
            return;
        }
        if (this.LLJI != suggestedMinimumWidth || this.LLJIJIL != suggestedMinimumHeight) {
            this.LLJI = suggestedMinimumWidth;
            this.LLJIJIL = suggestedMinimumHeight;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onVisibilityChanged(View view, int i) throws Throwable {
        try {
            super.onVisibilityChanged(view, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onVisibilityChanged encounter exception ");
            sbLIZ.append(e.getMessage());
            LynxLog.e("TextureVideoView", C2188811AlT.LIZIZ(sbLIZ));
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
        }
    }
}
