package X;

import android.opengl.GLES20;
import com.ss.ttlivestreamer.core.opengl.GlUtil;

/* JADX INFO: renamed from: X.0jCD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271630jCD implements InterfaceC1273290jEt {
    public int LIZ = GlUtil.createFrameBuffer();
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    @Override // X.InterfaceC1273290jEt
    public final void LIZ() {
        GLES20.glBindFramebuffer(36160, this.LIZ);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LIZIZ, 0);
    }

    @Override // X.InterfaceC1273290jEt
    public final void LIZIZ() {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glFinish();
    }
}
