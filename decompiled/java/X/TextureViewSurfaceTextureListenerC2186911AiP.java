package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: renamed from: X.1AiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class TextureViewSurfaceTextureListenerC2186911AiP implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C2186761AiA LL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC2186911AiP(C2186761AiA c2186761AiA) {
        this.LL = c2186761AiA;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C2186761AiA c2186761AiA = this.LL;
        c2186761AiA.LLJJI = new C2186841AiI(i, i2);
        c2186761AiA.LJFF();
    }
}
