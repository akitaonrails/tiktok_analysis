package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0kVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class TextureViewSurfaceTextureListenerC1322320kVy extends FrameLayout implements InterfaceC1322340kW0, TextureView.SurfaceTextureListener {
    public C1289520jf4 LL;
    public InterfaceC1322330kVz LLILLJJLI;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public Surface getSurface() {
        C1289520jf4 c1289520jf4 = this.LL;
        if (c1289520jf4 != null) {
            return c1289520jf4.getSurface();
        }
        return null;
    }

    public Context getViewContext() {
        return getContext();
    }

    public TextureViewSurfaceTextureListenerC1322320kVy(Context context) {
        super(context);
        C1289520jf4 c1289520jf4 = new C1289520jf4(context);
        this.LL = c1289520jf4;
        c1289520jf4.setSurfaceTextureListener(this);
        addView(this.LL, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z = false;
        this.LL.setKeepScreenOn(false);
        InterfaceC1322330kVz interfaceC1322330kVz = this.LLILLJJLI;
        if (interfaceC1322330kVz != null) {
            interfaceC1322330kVz.onSurfaceTextureDestroyed(surfaceTexture);
        }
        C1289520jf4 c1289520jf4 = this.LL;
        if (c1289520jf4.LLILLJJLI && c1289520jf4.LLILZ) {
            z = true;
        }
        return !z;
    }

    public void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            C1289520jf4 c1289520jf4 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1289520jf4);
            c1289520jf4.setLayoutParams(layoutParams);
        }
    }

    public void setSurfaceViewVisibility(int i) {
        C1289520jf4 c1289520jf4 = this.LL;
        if (c1289520jf4 != null) {
            int visibility = c1289520jf4.getVisibility();
            c1289520jf4.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c1289520jf4);
        }
    }

    public void setTextureViewOnTouchListener(View.OnTouchListener onTouchListener) {
        this.LL.setOnTouchListener(onTouchListener);
    }

    public void setVideoViewCallback(InterfaceC1322330kVz interfaceC1322330kVz) {
        this.LLILLJJLI = interfaceC1322330kVz;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.LL.setKeepScreenOn(true);
        InterfaceC1322330kVz interfaceC1322330kVz = this.LLILLJJLI;
        if (interfaceC1322330kVz != null) {
            interfaceC1322330kVz.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }
}
