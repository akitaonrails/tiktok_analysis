package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jf4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289520jf4 extends TextureView {
    public TextureView.SurfaceTextureListener LL;
    public final boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Surface LLILZIL;
    public SurfaceTexture LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;

    public final void LIZ() {
        this.LLILLL = false;
        this.LLILZ = false;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    public Surface getSurface() {
        return this.LLILZIL;
    }

    public C1289520jf4(Context context) {
        super(context, null);
        this.LLILLJJLI = true;
        this.LLIZ = -1;
        this.LLIZLLLIL = -1;
        context.getResources().getDisplayMetrics();
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0jf5
            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Surface surface;
                C1289520jf4 c1289520jf4 = this.LL;
                if (c1289520jf4.LLILLJJLI && !c1289520jf4.LLILLL && (surface = c1289520jf4.LLILZIL) != null) {
                    surface.release();
                    C1289520jf4 c1289520jf42 = this.LL;
                    c1289520jf42.LLILZIL = null;
                    c1289520jf42.LLILZLL = null;
                }
                this.LL.getClass();
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LL;
                if (surfaceTextureListener != null && surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
                    this.LL.LIZ();
                    return true;
                }
                return false;
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
                C1289520jf4 c1289520jf4 = this.LL;
                if (c1289520jf4.LLILLJJLI) {
                    c1289520jf4.LLILZ = true;
                    Surface surface = c1289520jf4.LLILZIL;
                    if (surface != null && (!c1289520jf4.LLILLL || !surface.isValid())) {
                        this.LL.LLILZIL.release();
                        C1289520jf4 c1289520jf42 = this.LL;
                        c1289520jf42.LLILZIL = null;
                        c1289520jf42.LLILZLL = null;
                    }
                    C1289520jf4 c1289520jf43 = this.LL;
                    if (c1289520jf43.LLILZIL == null) {
                        c1289520jf43.LLILZIL = new Surface(surfaceTexture);
                        this.LL.LLILZLL = surfaceTexture;
                    } else {
                        try {
                            SurfaceTexture surfaceTexture2 = c1289520jf43.LLILZLL;
                            if (surfaceTexture2 != null) {
                                c1289520jf43.setSurfaceTexture(surfaceTexture2);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    this.LL.getClass();
                    this.LL.LLILLL = true;
                } else {
                    c1289520jf4.LLILZIL = new Surface(surfaceTexture);
                    this.LL.LLILZLL = surfaceTexture;
                }
                C1289520jf4 c1289520jf44 = this.LL;
                TextureView.SurfaceTextureListener surfaceTextureListener = c1289520jf44.LL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(c1289520jf44.LLILZLL, i, i2);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }
        });
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24 && drawable != null) {
            setBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LL = surfaceTextureListener;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLIZ != -1 && this.LLIZLLLIL != -1) {
            int iMax = Math.max(getSuggestedMinimumWidth(), this.LLIZ) + getPaddingLeft() + getPaddingRight();
            int iMax2 = Math.max(getSuggestedMinimumHeight(), this.LLIZLLLIL) + getPaddingTop() + getPaddingBottom();
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                iMax = size;
            } else if (mode == Integer.MIN_VALUE) {
                iMax = Math.min(iMax, size);
            }
            if (mode2 == 1073741824) {
                iMax2 = size2;
            } else if (mode2 == Integer.MIN_VALUE) {
                iMax2 = Math.min(iMax2, size2);
            }
            float f = iMax2 / iMax;
            int i3 = this.LLIZLLLIL;
            int i4 = this.LLIZ;
            if (((i3 * 1.05f) / i4) + 0.01f > f) {
                iMax2 = (i3 * iMax) / i4;
            } else {
                iMax = (i4 * iMax2) / i3;
            }
            setMeasuredDimension(iMax, iMax2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
