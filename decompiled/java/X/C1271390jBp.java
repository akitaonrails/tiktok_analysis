package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271390jBp {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final C1271300jBg LJ;

    public final void LIZ() {
        String strLIZIZ;
        try {
            this.LIZIZ = GlUtil.generateTexture(3553);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getMessage() != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exception:");
                sbLIZ.append(e.getMessage());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "";
            }
            this.LIZIZ = -1;
            Thread threadU3 = C786410Ut5.u3();
            String name = threadU3 != null ? threadU3.getName() : "";
            String strLIZIZ2 = "none";
            try {
                EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (eGLContextEglGetCurrentContext != null) {
                    long nativeEGLContext = GLThreadManager.toNativeEGLContext(eGLContextEglGetCurrentContext);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(eGLContextEglGetCurrentContext);
                    sbLIZ2.append(" handle ");
                    sbLIZ2.append(nativeEGLContext);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("some error occurs:");
                sbLIZ3.append(e2.getCause());
                AVLog.ioe("OpenGL", C2188811AlT.LIZIZ(sbLIZ3));
            }
            int i = 0;
            String strJ4 = C786410Ut5.j4("[thread:%s context info:%s] create texture failed:%s", new Object[]{strLIZIZ2, name, Log.getStackTraceString(new Throwable())});
            AVLog.ioe("OpenGL", strJ4);
            int iGlGetError = GLES20.glGetError();
            while (iGlGetError != 0) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append(", error code:");
                sbLIZ4.append(iGlGetError);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                iGlGetError = GLES20.glGetError();
                i++;
                if (i >= 10) {
                    break;
                }
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strJ4);
            sbLIZ5.append(", [opengl errors:");
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append("],loopCount:");
            sbLIZ5.append(i);
            AVLog.logKibana(6, "OpenGL", C2188811AlT.LIZIZ(sbLIZ5), null);
        }
        if (this.LIZIZ == -1) {
            this.LIZIZ = GlUtil.generateTexture(3553);
        }
    }

    public final void LIZJ() {
        int i = this.LIZ;
        if (i > 0) {
            GLES20.glBindFramebuffer(36160, i);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.LIZ}, 0);
        }
        int i2 = this.LIZIZ;
        if (i2 > 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.LIZIZ = 0;
        }
        this.LIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
    }

    public C1271390jBp(C1271300jBg c1271300jBg) {
        this.LJ = c1271300jBg;
        LIZ();
        this.LIZJ = 0;
        this.LIZLLL = 0;
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.LIZ = iArr[0];
    }

    public final void LIZIZ(int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.LIZIZ);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GLES20.glGetError();
    }

    public final boolean LIZLLL(int i, int i2) {
        if (i != 0 && i2 != 0) {
            if (i == this.LIZJ && i2 == this.LIZLLL) {
                return false;
            }
            this.LIZJ = i;
            this.LIZLLL = i2;
            GlUtil.clearAllGLError();
            C1271300jBg c1271300jBg = this.LJ;
            if (c1271300jBg != null && c1271300jBg.LIZ) {
                int i3 = this.LIZIZ;
                if (i3 > 0) {
                    GLES20.glDeleteTextures(1, new int[]{i3}, 0);
                    this.LIZIZ = 0;
                }
                LIZ();
            }
            try {
                LIZIZ(i, i2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.ioe("GLTextureFrameBuffer", "try reSizeTextureInner first time with exception", e);
                LIZIZ(i, i2);
            }
            GLES20.glBindFramebuffer(36160, this.LIZ);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LIZIZ, 0);
            int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (iGlCheckFramebufferStatus == 36053) {
                GLES20.glBindFramebuffer(36160, 0);
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Framebuffer not complete, status: ");
            sbLIZ.append(iGlCheckFramebufferStatus);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Invalid size: ");
        sbLIZ2.append(i);
        sbLIZ2.append("x");
        sbLIZ2.append(i2);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
