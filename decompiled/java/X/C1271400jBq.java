package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.opengl.GlUtil;
import com.ss.pusher.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271400jBq {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZIZ() {
        int i = this.LIZ;
        if (i > 0) {
            GLES20.glBindFramebuffer(36160, i);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.LIZ}, 0);
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BUG! glDeleteFramebuffers fail with ");
                sbLIZ.append(iGlGetError);
                AVLog.logKibana(6, "GLTextureFrameBuffer", C2188811AlT.LIZIZ(sbLIZ), null);
            }
        }
        int i2 = this.LIZIZ;
        if (i2 > 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.LIZIZ = 0;
            int iGlGetError2 = GLES20.glGetError();
            if (iGlGetError2 != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BUG! glDeleteTextures fail with ");
                sbLIZ2.append(iGlGetError2);
                AVLog.logKibana(6, "GLTextureFrameBuffer", C2188811AlT.LIZIZ(sbLIZ2), null);
            }
        }
        this.LIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
    }

    public C1271400jBq() {
        String strLIZIZ;
        String strLIZIZ2;
        EGLContext eGLContextEglGetCurrentContext;
        try {
            this.LIZIZ = GlUtil.LIZLLL(3553);
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
            try {
                eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("some error occurs:");
                sbLIZ2.append(e2.getCause());
                AVLog.ioe("OpenGL", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (eGLContextEglGetCurrentContext != null) {
                long nativeHandle = eGLContextEglGetCurrentContext.getNativeHandle();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(eGLContextEglGetCurrentContext);
                sbLIZ3.append(" handle ");
                sbLIZ3.append(nativeHandle);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                strLIZIZ2 = "none";
            }
            String strJ4 = C786410Ut5.j4("[thread:%s context info:%s] create texture failed:%s", new Object[]{strLIZIZ2, name, Log.getStackTraceString(new Throwable())});
            AVLog.ioe("OpenGL", strJ4);
            int iGlGetError = GLES20.glGetError();
            int i = 0;
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
            this.LIZIZ = GlUtil.LIZLLL(3553);
        }
        this.LIZJ = 0;
        this.LIZLLL = 0;
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.LIZ = iArr[0];
    }

    public final void LIZ(int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.LIZIZ);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GlUtil.LIZJ("GlTextureFrameBuffer setSize");
    }

    public final void LIZJ(int i, int i2) {
        if (i != 0 && i2 != 0) {
            if (i == this.LIZJ && i2 == this.LIZLLL) {
                return;
            }
            this.LIZJ = i;
            this.LIZLLL = i2;
            String strLIZIZ = "";
            int i3 = 0;
            do {
                int i4 = i3 + 1;
                if (i3 >= 10) {
                    break;
                }
                try {
                    GlUtil.LIZ();
                    break;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append("|");
                    sbLIZ.append(e.getMessage());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    i3 = i4;
                }
            } while (1 != 0);
            if (!TextUtils.isEmpty(strLIZIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("clearAllGLError:");
                sbLIZ2.append(strLIZIZ);
                AVLog.logKibana(6, "GlUtil", C2188811AlT.LIZIZ(sbLIZ2), new AndroidRuntimeException("clearAllGLError"));
            }
            try {
                LIZ(i, i2);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                AVLog.ioe("GLTextureFrameBuffer", "try reSizeTextureInner first time with exception", e2);
                LIZ(i, i2);
            }
            GLES20.glBindFramebuffer(36160, this.LIZ);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.LIZIZ, 0);
            int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (iGlCheckFramebufferStatus == 36053) {
                GLES20.glBindFramebuffer(36160, 0);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Framebuffer not complete, status: ");
            sbLIZ3.append(iGlCheckFramebufferStatus);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Invalid size: ");
        sbLIZ4.append(i);
        sbLIZ4.append("x");
        sbLIZ4.append(i2);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
    }
}
