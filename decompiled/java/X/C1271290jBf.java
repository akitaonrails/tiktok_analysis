package X;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;

/* JADX INFO: renamed from: X.0jBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1271290jBf implements InterfaceC1271380jBo {
    public final /* synthetic */ C1271310jBh LIZ;

    public C1271290jBf(C1271310jBh c1271310jBh) {
        this.LIZ = c1271310jBh;
    }

    public final void LIZ(int i, int i2, int i3, float[] fArr) {
        synchronized (this.LIZ) {
            try {
                C1271310jBh c1271310jBh = this.LIZ;
                if (c1271310jBh.LLJIJIL) {
                    return;
                }
                C0VVR c0vvr = c1271310jBh.LLJILJIL;
                if (c0vvr != null) {
                    c0vvr.LIZ();
                }
                C1271310jBh c1271310jBh2 = this.LIZ;
                if (c1271310jBh2.LLJ == null) {
                    C1271300jBg c1271300jBg = new C1271300jBg();
                    c1271300jBg.LIZ = true;
                    c1271310jBh2.LLJ = new C1271390jBp(c1271300jBg);
                }
                C1271310jBh c1271310jBh3 = this.LIZ;
                if (c1271310jBh3.LLJI == null) {
                    c1271310jBh3.LLJI = new GlRenderDrawer();
                }
                Matrix matrixLIZJ = C1273010jER.LIZJ(0, fArr);
                matrixLIZJ.preTranslate(0.5f, 0.5f);
                matrixLIZJ.preScale(1.0f, -1.0f);
                matrixLIZJ.preTranslate(-0.5f, -0.5f);
                this.LIZ.LLJ.LIZLLL(i2, i3);
                GLES20.glBindFramebuffer(36160, this.LIZ.LLJ.LIZ);
                this.LIZ.LLJI.drawOes(i, null, C1273010jER.LIZIZ(matrixLIZJ), 0, 0, i2, i3);
                GLES20.glFinish();
                GLES20.glBindFramebuffer(36160, 0);
                int i4 = this.LIZ.LLJ.LIZIZ;
                Matrix matrix = new Matrix();
                matrix.preTranslate(0.5f, 0.5f);
                matrix.preScale(1.0f, -1.0f);
                matrix.preTranslate(-0.5f, -0.5f);
                k kVar = new k(i2, i3, EnumC1273550jFJ.RGB, i4, matrix, (SurfaceTextureHelper) null, (Runnable) null);
                kVar.setTransformMatrixArray(C1267770j5z.LIZ);
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("stream_id", this.LIZ.LLILZ, bundle);
                this.LIZ.LJIIIZ(new VideoFrame(kVar, 0, System.nanoTime()), bundle);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
