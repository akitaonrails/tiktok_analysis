package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.ss.android.vesdk.VEConfigCenter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: X.0jV1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1283290jV1 {
    public final float[] LIZ;
    public final FloatBuffer LIZIZ;
    public final float[] LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIL;
    public final float[] LIZJ = new float[16];
    public final int[] LJIIJJI = new int[1];
    public EnumC1283320jV4 LJIILIIL = EnumC1283320jV4.UNKNOWN;
    public int LJIILJJIL = 2;

    public C1283290jV1(SurfaceTexture surfaceTexture) {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.LIZ = fArr;
        float[] fArr2 = new float[16];
        this.LIZLLL = fArr2;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.LIZIZ = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr2);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
    }

    public static int LIZ(String str) {
        int iLIZJ;
        int iLIZJ2 = LIZJ(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        if (iLIZJ2 == 0 || (iLIZJ = LIZJ(35632, str)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            C2484209oO.LIZJ("TEMediaCodecDecoder", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iLIZJ2);
        GLES20.glAttachShader(iGlCreateProgram, iLIZJ);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not link program: ");
            sbLIZ.append(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            C2484209oO.LIZJ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
            GLES20.glDeleteProgram(iGlCreateProgram);
            return 0;
        }
        return iGlCreateProgram;
    }

    public static int LIZJ(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not compile shader ");
            sbLIZ.append(i);
            sbLIZ.append(":");
            C2484209oO.LIZJ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" ");
            sbLIZ2.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
            C2484209oO.LIZJ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            GLES20.glDeleteShader(iGlCreateShader);
            return 0;
        }
        return iGlCreateShader;
    }

    public final void LIZLLL(int i, int i2, int i3, int i4, int i5, boolean z) {
        float f;
        float f2;
        if (i2 > 0 && i3 > 0 && i4 > 0 && i5 > 0) {
            int i6 = this.LJIIL;
            this.LJIIL = i;
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            Matrix.rotateM(fArr, 0, i, 0.0f, 0.0f, 1.0f);
            if (z) {
                Matrix.rotateM(fArr, 0, 180.0f, 1.0f, 0.0f, 0.0f);
            }
            if (Math.abs(i) != 90 && Math.abs(i) != 270) {
                f = i2;
            } else {
                f = i3;
            }
            if (Math.abs(i) != 90 && Math.abs(i) != 270) {
                f2 = i3;
            } else {
                f2 = i2;
            }
            float f3 = i4;
            float f4 = f3 / f;
            float f5 = i5;
            float f6 = f5 / f2;
            if (f4 <= f6) {
                f4 = f6;
            }
            Matrix.scaleM(fArr, 0, (i2 / 2.0f) * f4, (i3 / 2.0f) * f4, 1.0f);
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            Matrix.orthoM(fArr3, 0, (-i4) / 2.0f, f3 / 2.0f, (-i5) / 2.0f, f5 / 2.0f, -2.0f, 2.0f);
            float[] fArr4 = new float[16];
            Matrix.setIdentityM(fArr4, 0);
            Matrix.multiplyMM(fArr4, 0, fArr2, 0, fArr, 0);
            Matrix.setIdentityM(this.LIZJ, 0);
            Matrix.multiplyMM(this.LIZJ, 0, fArr3, 0, fArr4, 0);
            return;
        }
        Matrix.setIdentityM(this.LIZJ, 0);
    }

    public final void LJ(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i > 0 && i2 > 0 && i4 >= i3 && i6 >= i5 && i6 <= i && i4 <= i2) {
            float[] fArr = this.LIZ;
            float f = i;
            float f2 = (i5 * 1.0f) / f;
            fArr[3] = f2;
            float f3 = i2;
            float f4 = (i3 * 1.0f) / f3;
            fArr[4] = f4;
            float f5 = (i6 * 1.0f) / f;
            fArr[8] = f5;
            fArr[9] = f4;
            fArr[13] = f2;
            float f6 = (i4 * 1.0f) / f3;
            fArr[14] = f6;
            fArr[18] = f5;
            fArr[19] = f6;
            this.LIZIZ.clear();
            FloatBuffer floatBuffer = this.LIZIZ;
            floatBuffer.put(this.LIZ);
            floatBuffer.position(0);
        }
    }

    public final void LIZIZ(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
        boolean z2;
        EnumC1283320jV4 enumC1283320jV4;
        EnumC1283320jV4 enumC1283320jV42;
        int i8;
        float f;
        GLES20.glViewport(0, 0, i3, i4);
        C1283290jV1 c1283290jV1 = this;
        GLES20.glBindFramebuffer(36160, c1283290jV1.LJIIJJI[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i6, 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(c1283290jV1.LJ);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i5);
        if (Math.min(i, i2) >= Math.min(i3, i4) * 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!VEConfigCenter.getInstance().getValue("ve_enable_preview_sharpness_opt", false).booleanValue() && 2 != (VEConfigCenter.getInstance().getValue("ve_enable_odd_display", 0) & 2)) {
            if (VEConfigCenter.getInstance().getValue("ve_enable_opt_hwdecode_moire", false).booleanValue() && c1283290jV1.LJIILJJIL >= 3 && z2) {
                EnumC1283320jV4 enumC1283320jV43 = c1283290jV1.LJIILIIL;
                EnumC1283320jV4 enumC1283320jV44 = EnumC1283320jV4.NEAREST;
                if (enumC1283320jV43 != enumC1283320jV44) {
                    GLES20.glTexParameterf(36197, 10241, 9728.0f);
                    c1283290jV1.LJIILIIL = enumC1283320jV44;
                }
            }
        } else {
            int i9 = i * i2;
            int i10 = i3 * i4;
            if (i9 == i10 && ((enumC1283320jV42 = c1283290jV1.LJIILIIL) == EnumC1283320jV4.UNKNOWN || enumC1283320jV42 == EnumC1283320jV4.LINEAR)) {
                GLES20.glTexParameterf(36197, 10241, 9728.0f);
                c1283290jV1.LJIILIIL = EnumC1283320jV4.NEAREST;
            } else if (i9 != i10 && ((enumC1283320jV4 = c1283290jV1.LJIILIIL) == EnumC1283320jV4.UNKNOWN || enumC1283320jV4 == EnumC1283320jV4.NEAREST)) {
                if (VEConfigCenter.getInstance().getValue("ve_enable_opt_hwdecode_moire", false).booleanValue() && c1283290jV1.LJIILJJIL >= 3) {
                    if (z2) {
                        EnumC1283320jV4 enumC1283320jV45 = c1283290jV1.LJIILIIL;
                        EnumC1283320jV4 enumC1283320jV46 = EnumC1283320jV4.NEAREST;
                        if (enumC1283320jV45 != enumC1283320jV46) {
                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                            c1283290jV1.LJIILIIL = enumC1283320jV46;
                        }
                    }
                } else {
                    GLES20.glTexParameterf(36197, 10241, 9729.0f);
                    c1283290jV1.LJIILIIL = EnumC1283320jV4.LINEAR;
                }
            }
        }
        c1283290jV1.LIZIZ.position(0);
        GLES20.glVertexAttribPointer(c1283290jV1.LJII, 3, 5126, false, 20, (Buffer) c1283290jV1.LIZIZ);
        GLES20.glEnableVertexAttribArray(c1283290jV1.LJII);
        c1283290jV1.LIZIZ.position(3);
        GLES20.glVertexAttribPointer(c1283290jV1.LJIIIIZZ, 2, 5126, false, 20, (Buffer) c1283290jV1.LIZIZ);
        GLES20.glEnableVertexAttribArray(c1283290jV1.LJIIIIZZ);
        int i11 = i7;
        if (VEConfigCenter.getInstance().getValue("ve_enable_hw_decoder_use_surfacetexture_matrix", false).booleanValue()) {
            i8 = 1;
            f = 1.0f;
            c1283290jV1.LIZLLL(i11, i, i2, i3, i4, true);
        } else {
            i8 = 1;
            f = 1.0f;
            c1283290jV1 = c1283290jV1;
            i11 = i11;
            c1283290jV1.LIZLLL(i11, i, i2, i3, i4, false);
        }
        GLES20.glUniformMatrix4fv(c1283290jV1.LJFF, i8, false, c1283290jV1.LIZJ, 0);
        GLES20.glUniformMatrix4fv(c1283290jV1.LJI, i8, false, c1283290jV1.LIZLLL, 0);
        if (VEConfigCenter.getInstance().getValue("ve_enable_opt_hwdecode_moire", false).booleanValue() && c1283290jV1.LJIILJJIL >= 3) {
            float f2 = i * f;
            float f3 = i3;
            float f4 = f2 / f3;
            float f5 = i2 * f;
            float f6 = i4;
            float f7 = f5 / f6;
            if (Math.abs(i11) == 90 || Math.abs(i11) == 270) {
                f4 = f2 / f6;
                f7 = f5 / f3;
            }
            GLES20.glUniform2f(c1283290jV1.LJIIJ, f4, f7);
            GLES20.glUniform2f(c1283290jV1.LJIIIZ, f2, f5);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(c1283290jV1.LJII);
        GLES20.glDisableVertexAttribArray(c1283290jV1.LJIIIIZZ);
        GLES20.glBindTexture(36197, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
        if (!z) {
            GLES20.glFinish();
        }
    }
}
