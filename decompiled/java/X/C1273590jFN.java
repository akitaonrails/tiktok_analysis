package X;

import android.opengl.GLES20;
import com.ss.pusher.core.opengl.GlUtil;
import com.ss.pusher.core.utils.AVLog;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: X.0jFN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273590jFN {
    public int LIZ;

    public C1273590jFN(String str) {
        int iLIZ = LIZ(35633, "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n");
        int iLIZ2 = LIZ(35632, str);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.LIZ = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iLIZ);
            GLES20.glAttachShader(this.LIZ, iLIZ2);
            GLES20.glLinkProgram(this.LIZ);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.LIZ, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(iLIZ);
                GLES20.glDeleteShader(iLIZ2);
                GlUtil.LIZJ("Creating GlShader");
                return;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Could not link program: ");
                sbLIZ.append(GLES20.glGetProgramInfoLog(this.LIZ));
                AVLog.e("GlShader", C2188811AlT.LIZIZ(sbLIZ));
                throw new RuntimeException(GLES20.glGetProgramInfoLog(this.LIZ));
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("glCreateProgram() failed. GLES20 error: ");
        sbLIZ2.append(GLES20.glGetError());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final int LIZIZ(String str) {
        int i = this.LIZ;
        if (i != -1) {
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (iGlGetUniformLocation >= 0) {
                return iGlGetUniformLocation;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not locate uniform '");
            sbLIZ.append(str);
            sbLIZ.append("' in program");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new RuntimeException("The program has been released");
    }

    public static int LIZ(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                GlUtil.LIZJ("compileShader");
                return iGlCreateShader;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not compile shader ");
            sbLIZ.append(i);
            sbLIZ.append(":");
            sbLIZ.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
            AVLog.e("GlShader", C2188811AlT.LIZIZ(sbLIZ));
            throw new RuntimeException(GLES20.glGetShaderInfoLog(iGlCreateShader));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("glCreateShader() failed. GLES20 error: ");
        sbLIZ2.append(GLES20.glGetError());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZJ(String str, FloatBuffer floatBuffer) {
        int i = this.LIZ;
        if (i != -1) {
            if (i != -1) {
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, str);
                if (iGlGetAttribLocation >= 0) {
                    GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
                    GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) floatBuffer);
                    GlUtil.LIZJ("setVertexAttribArray");
                    return;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Could not locate '");
                    sbLIZ.append(str);
                    sbLIZ.append("' in program");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            throw new RuntimeException("The program has been released");
        }
        throw new RuntimeException("The program has been released");
    }
}
