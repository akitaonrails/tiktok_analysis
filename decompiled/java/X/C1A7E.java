package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1A7E, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A7E extends C1A7G {
    public SurfaceTexture LLJ;
    public Surface LLJI;
    public boolean LLJIJIL;
    public TextureView.SurfaceTextureListener LLJILJIL;

    @Override // X.C1A7G, X.C0IF5
    public /* bridge */ /* synthetic */ void setRoomID(Long l) {
    }

    @Override // X.C1A7G, X.C0IF5
    public /* bridge */ /* synthetic */ void setVisibilityChangeListener(C1A7H c1a7h) {
    }

    public Surface getSurface() {
        return this.LLJI;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C1A7E(Context context) {
        super(context, 0);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.1A7F
            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C827750WdZ.LIZ("KeepSurfaceTextureRenderView", "onSurfaceTextureDestroyed");
                C1A7E c1a7e = this.LL;
                c1a7e.LLJIJIL = false;
                TextureView.SurfaceTextureListener surfaceTextureListener = c1a7e.LLJILJIL;
                if (surfaceTextureListener != null && !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
                    return false;
                }
                this.LL.getClass();
                this.LL.LIZ(true);
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLJILJIL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C827750WdZ.LIZ("KeepSurfaceTextureRenderView", "onSurfaceTextureAvailable");
                this.LL.LIZ(true);
                C1A7E c1a7e = this.LL;
                if (c1a7e.LLJ == null) {
                    c1a7e.LLJ = surfaceTexture;
                    c1a7e.LLJI = new Surface(this.LL.LLJ);
                }
                C1A7E c1a7e2 = this.LL;
                c1a7e2.LLJIJIL = true;
                TextureView.SurfaceTextureListener surfaceTextureListener = c1a7e2.LLJILJIL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(c1a7e2.LLJ, i, i2);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C827750WdZ.LIZ("KeepSurfaceTextureRenderView", "onSurfaceTextureSizeChanged");
                TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLJILJIL;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }
        });
    }

    public final void LIZ(boolean z) {
        SurfaceTexture surfaceTexture = this.LLJ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.LLJ = null;
        }
        Surface surface = this.LLJI;
        if (surface != null) {
            surface.release();
            this.LLJI = null;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        Surface surface;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            C20441214yg.LJIIIZ("KeepSurfaceTextureRenderView", "resume");
            if (this.LLJ != null && (surface = this.LLJI) != null && surface.isValid()) {
                if (!this.LLJIJIL) {
                    if (this.LLJ != getSurfaceTexture()) {
                        try {
                            setSurfaceTexture(this.LLJ);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        this.LLJIJIL = true;
                        TextureView.SurfaceTextureListener surfaceTextureListener = this.LLJILJIL;
                        if (surfaceTextureListener != null) {
                            surfaceTextureListener.onSurfaceTextureAvailable(this.LLJ, getWidth(), getHeight());
                            return;
                        }
                        return;
                    }
                    LIZ(true);
                    return;
                }
                return;
            }
            LIZ(true);
        }
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LLJILJIL = surfaceTextureListener;
    }
}
