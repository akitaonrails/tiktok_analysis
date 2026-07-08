package X;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: X.0jV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283330jV5 {
    public static final float[] LJII = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
    public static final float[] LJIIIIZZ = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    public C1283310jV3 LIZ;
    public int[] LIZIZ;
    public FloatBuffer LIZJ;
    public FloatBuffer LIZLLL;
    public int LJ;
    public RectF LJFF;
    public int LJI = Integer.MAX_VALUE;

    public final void LIZJ() {
        C1283310jV3 c1283310jV3 = this.LIZ;
        int i = c1283310jV3.LIZ;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            c1283310jV3.LIZ = 0;
        }
        int[] iArr = this.LIZIZ;
        if (iArr != null) {
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            this.LIZIZ = null;
        }
        this.LIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    public static FloatBuffer LIZ(float[] fArr) {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr, 0, fArr.length);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public final void LIZIZ(int i) {
        this.LIZ.LIZ();
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glBindBuffer(34962, this.LIZIZ[0]);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.LIZIZ[1]);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void LJ(RectF rectF) {
        if (rectF != null) {
            RectF rectF2 = this.LJFF;
            if (rectF2 != null && rectF.equals(rectF2)) {
                return;
            }
            this.LJFF = rectF;
            float[] fArr = LJIIIIZZ;
            float f = rectF.left;
            fArr[0] = f;
            float f2 = 1.0f - rectF.top;
            fArr[1] = f2;
            fArr[2] = f;
            float f3 = 1.0f - rectF.bottom;
            fArr[3] = f3;
            float f4 = rectF.right;
            fArr[4] = f4;
            fArr[5] = f2;
            fArr[6] = f4;
            fArr[7] = f3;
            this.LIZLLL = LIZ(fArr);
            this.LIZ.LIZ();
            GLES20.glBindBuffer(34962, this.LIZIZ[1]);
            this.LIZLLL.position(0);
            GLES20.glBufferSubData(34962, 0, 32, this.LIZLLL);
        }
    }

    public final void LIZLLL(int i, int i2, int i3, int i4, int i5, boolean z) {
        float f;
        float f2;
        this.LIZ.LIZ();
        if (i2 > 0 && i3 > 0 && i4 > 0 && i5 > 0) {
            if (this.LJI == i) {
                return;
            }
            this.LJI = i;
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
            float[] fArr5 = new float[16];
            Matrix.setIdentityM(fArr5, 0);
            Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
            GLES20.glUniformMatrix4fv(this.LJ, 1, false, fArr5, 0);
            return;
        }
        float[] fArr6 = new float[16];
        Matrix.setIdentityM(fArr6, 0);
        GLES20.glUniformMatrix4fv(this.LJ, 1, false, fArr6, 0);
    }
}
