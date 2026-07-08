package X;

import android.opengl.GLES20;

/* JADX INFO: renamed from: X.0jV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283310jV3 {
    public int LIZ = GLES20.glCreateProgram();
    public C1283300jV2 LIZIZ;
    public C1283300jV2 LIZJ;

    public final void LIZ() {
        GLES20.glUseProgram(this.LIZ);
    }

    public final boolean LIZIZ(String str, String str2) {
        int i;
        int i2;
        int iGlCreateProgram = this.LIZ;
        if (iGlCreateProgram == 0) {
            iGlCreateProgram = GLES20.glCreateProgram();
        }
        C1283300jV2 c1283300jV2 = this.LIZIZ;
        if (c1283300jV2 != null && (i2 = c1283300jV2.LIZ) != 0) {
            GLES20.glDeleteShader(i2);
            c1283300jV2.LIZ = 0;
        }
        C1283300jV2 c1283300jV22 = this.LIZJ;
        if (c1283300jV22 != null && (i = c1283300jV22.LIZ) != 0) {
            GLES20.glDeleteShader(i);
            c1283300jV22.LIZ = 0;
        }
        this.LIZIZ = new C1283300jV2(str, 35633);
        this.LIZJ = new C1283300jV2(str2, 35632);
        GLES20.glAttachShader(iGlCreateProgram, this.LIZIZ.LIZ);
        GLES20.glAttachShader(iGlCreateProgram, this.LIZJ.LIZ);
        int iGlGetError = GLES20.glGetError();
        int i3 = 0;
        while (iGlGetError != 0) {
            iGlGetError = GLES20.glGetError();
            i3++;
            if (i3 >= 32) {
                break;
            }
        }
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        C1283300jV2 c1283300jV23 = this.LIZIZ;
        int i4 = c1283300jV23.LIZ;
        if (i4 != 0) {
            GLES20.glDeleteShader(i4);
            c1283300jV23.LIZ = 0;
        }
        C1283300jV2 c1283300jV24 = this.LIZJ;
        int i5 = c1283300jV24.LIZ;
        if (i5 != 0) {
            GLES20.glDeleteShader(i5);
            c1283300jV24.LIZ = 0;
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(iGlCreateProgram);
            return false;
        }
        int i6 = this.LIZ;
        if (i6 != iGlCreateProgram && i6 != 0) {
            GLES20.glDeleteProgram(i6);
        }
        this.LIZ = iGlCreateProgram;
        return true;
    }
}
