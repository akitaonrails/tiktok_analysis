package com.bef.effectsdk;

import X.TextureViewSurfaceTextureListenerC1287510jbp;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes21.dex */
public class GLTextureView$ComponentSizeChooser extends GLTextureView$BaseConfigChooser {
    public int mAlphaSize;
    public int mBlueSize;
    public int mDepthSize;
    public int mGreenSize;
    public int mRedSize;
    public int mStencilSize;
    public int[] mValue;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1287510jbp this$0;

    @Override // com.bef.effectsdk.GLTextureView$BaseConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            int iFindConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
            int iFindConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
            if (iFindConfigAttrib >= this.mDepthSize && iFindConfigAttrib2 >= this.mStencilSize) {
                int iFindConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int iFindConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int iFindConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int iFindConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                if (iFindConfigAttrib3 == this.mRedSize && iFindConfigAttrib4 == this.mGreenSize && iFindConfigAttrib5 == this.mBlueSize && iFindConfigAttrib6 == this.mAlphaSize) {
                    return eGLConfig;
                }
            }
        }
        return null;
    }

    private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue)) {
            return this.mValue[0];
        }
        return i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GLTextureView$ComponentSizeChooser(final TextureViewSurfaceTextureListenerC1287510jbp textureViewSurfaceTextureListenerC1287510jbp, int i, int i2, int i3, int i4, int i5, int i6) {
        this.this$0 = textureViewSurfaceTextureListenerC1287510jbp;
        final int[] iArr = {12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344};
        new GLTextureView$EGLConfigChooser(iArr) { // from class: com.bef.effectsdk.GLTextureView$BaseConfigChooser
            public int[] mConfigSpec;

            public abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

            private int[] filterConfigSpec(int[] iArr2) {
                int i7 = this.this$0.mEGLContextClientVersion;
                if (i7 == 2) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length + 2];
                    int i8 = length - 1;
                    System.arraycopy(iArr2, 0, iArr3, 0, i8);
                    iArr3[i8] = 12352;
                    iArr3[length] = 4;
                    iArr3[length + 1] = 12344;
                    return iArr3;
                }
                if (i7 == 3) {
                    int length2 = iArr2.length;
                    int[] iArr4 = new int[length2 + 2];
                    int i9 = length2 - 1;
                    System.arraycopy(iArr2, 0, iArr4, 0, i9);
                    iArr4[i9] = 12352;
                    iArr4[length2] = 64;
                    iArr4[length2 + 1] = 12344;
                    return iArr4;
                }
                return iArr2;
            }

            {
                this.mConfigSpec = filterConfigSpec(iArr);
            }

            @Override // com.bef.effectsdk.GLTextureView$EGLConfigChooser
            public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
                int[] iArr2 = new int[1];
                if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, iArr2)) {
                    int i7 = iArr2[0];
                    if (i7 > 0) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[i7];
                        if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, i7, iArr2)) {
                            EGLConfig eGLConfigChooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
                            if (eGLConfigChooseConfig != null) {
                                return eGLConfigChooseConfig;
                            }
                            throw new IllegalArgumentException("No config chosen");
                        }
                        throw new IllegalArgumentException("eglChooseConfig#2 failed");
                    }
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
        };
        this.mValue = new int[1];
        this.mRedSize = i;
        this.mGreenSize = i2;
        this.mBlueSize = i3;
        this.mAlphaSize = i4;
        this.mDepthSize = i5;
        this.mStencilSize = i6;
    }
}
