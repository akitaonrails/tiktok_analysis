package X;

import android.opengl.GLES20;

/* JADX INFO: renamed from: X.0jV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1283300jV2 {
    public int LIZ;

    public C1283300jV2(String str, int i) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("before glCreateShader, glError: ");
            sbLIZ.append(iGlGetError);
            C2484209oO.LIZJ("TEProgramObject", C2188811AlT.LIZIZ(sbLIZ));
        }
        int iGlCreateShader = GLES20.glCreateShader(i);
        int iGlGetError2 = GLES20.glGetError();
        if (iGlGetError2 != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("after glCreateShader, glError: ");
            sbLIZ2.append(iGlGetError2);
            C2484209oO.LIZJ("TEProgramObject", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int iGlGetError3 = GLES20.glGetError();
            if (iGlGetError3 != 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("after glCompileShader, glError: ");
                sbLIZ3.append(iGlGetError3);
                C2484209oO.LIZJ("TEProgramObject", C2188811AlT.LIZIZ(sbLIZ3));
            }
            int[] iArr = {0};
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] != 1) {
                C2484209oO.LIZJ("TEProgramObject", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                iGlCreateShader = 0;
            }
        }
        this.LIZ = iGlCreateShader;
        if (iGlCreateShader == 0) {
            C2484209oO.LIZJ("TEProgramObject", "glCreateShader Failed!...");
        }
    }
}
