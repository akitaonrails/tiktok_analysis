package X;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: renamed from: X.0jFF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273510jFF {
    public static float[] LIZIZ() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static int LIZ(String str) {
        int iLIZJ;
        int iLIZJ2 = LIZJ(35633, "attribute vec4 aVertexCo;\nattribute vec2 aTextureCo;\nuniform mat4 uTextureMatrix;\nvarying vec2 vTextureCo;\nvoid main() {\n    gl_Position = aVertexCo;\n    vTextureCo = (uTextureMatrix * vec4(aTextureCo, 0.0, 1.0)).xy;\n}");
        if (iLIZJ2 == 0 || (iLIZJ = LIZJ(35632, str)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iLIZJ2);
            GLES20.glAttachShader(iGlCreateProgram, iLIZJ);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Could not link program:");
                sbLIZ.append(GLES20.glGetProgramInfoLog(iGlCreateProgram));
                C2188811AlT.LIZIZ(sbLIZ);
                GLES20.glDeleteProgram(iGlCreateProgram);
                return 0;
            }
        }
        return iGlCreateProgram;
    }

    public static int LIZJ(int i, String str) {
        if (str == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Shader source ==null : shaderType =");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            return 0;
        }
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Could not compile shader:");
                sbLIZ2.append(i);
                C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("GLES20 Error:");
                sbLIZ3.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
                C2188811AlT.LIZIZ(sbLIZ3);
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public static void LIZLLL(int i, int i2, int i3, int i4, float[] fArr) {
        float f = i / i2;
        float f2 = i3 / i4;
        if (f > f2) {
            float f3 = f2 / f;
            Matrix.scaleM(fArr, 0, f3, 1.0f, 1.0f);
            Matrix.translateM(fArr, 0, ((1.0f - f3) / 2.0f) / f3, 0.0f, 0.0f);
        } else {
            float f4 = f / f2;
            Matrix.scaleM(fArr, 0, 1.0f, f4, 1.0f);
            Matrix.translateM(fArr, 0, 0.0f, ((1.0f - f4) / 2.0f) / f4, 0.0f);
        }
    }
}
