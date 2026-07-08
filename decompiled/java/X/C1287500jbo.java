package X;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: renamed from: X.0jbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1287500jbo extends AbstractC1287550jbt {
    public final int[] LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1287530jbr LJIIIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287500jbo(TextureViewSurfaceTextureListenerC1287530jbr textureViewSurfaceTextureListenerC1287530jbr, int i, int i2) {
        super(textureViewSurfaceTextureListenerC1287530jbr, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i, 12325, i2, 12326, 0, 12344});
        this.LJIIIZ = textureViewSurfaceTextureListenerC1287530jbr;
        this.LIZJ = new int[1];
        this.LIZLLL = 8;
        this.LJ = 8;
        this.LJFF = 8;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = 0;
    }

    public final int LIZ(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.LIZJ)) {
            return 0;
        }
        return this.LIZJ[0];
    }
}
