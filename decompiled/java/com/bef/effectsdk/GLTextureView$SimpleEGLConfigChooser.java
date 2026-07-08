package com.bef.effectsdk;

import X.TextureViewSurfaceTextureListenerC1287510jbp;

/* JADX INFO: loaded from: classes21.dex */
public class GLTextureView$SimpleEGLConfigChooser extends GLTextureView$ComponentSizeChooser {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1287510jbp this$0;

    /* JADX WARN: Illegal instructions before constructor call */
    public GLTextureView$SimpleEGLConfigChooser(TextureViewSurfaceTextureListenerC1287510jbp textureViewSurfaceTextureListenerC1287510jbp, boolean z) {
        int i;
        this.this$0 = textureViewSurfaceTextureListenerC1287510jbp;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        super(textureViewSurfaceTextureListenerC1287510jbp, 8, 8, 8, 0, i, 0);
    }
}
