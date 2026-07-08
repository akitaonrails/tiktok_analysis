package X;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.1Cxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247351Cxh {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final ByteBuffer LJ = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
    public final ByteBuffer LJFF = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
    public final ByteBuffer LJI = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());

    public static void LIZIZ(C2247361Cxi c2247361Cxi, ByteBuffer byteBuffer, boolean z) {
        float[] fArr;
        byteBuffer.clear();
        if (z) {
            float f = c2247361Cxi.LIZ;
            float f2 = c2247361Cxi.LIZIZ;
            float f3 = c2247361Cxi.LIZLLL + f2;
            float f4 = f + c2247361Cxi.LIZJ;
            fArr = new float[]{f, f3, f, f2, f4, f3, f4, f2};
        } else {
            float f5 = c2247361Cxi.LIZ;
            float f6 = c2247361Cxi.LIZIZ;
            float f7 = c2247361Cxi.LIZLLL + f6;
            float f8 = f5 + c2247361Cxi.LIZJ;
            fArr = new float[]{f5, f6, f5, f7, f8, f6, f8, f7};
        }
        for (float f9 : fArr) {
            byteBuffer.putFloat(f9);
        }
        byteBuffer.flip();
    }

    public static void LIZJ(C2247361Cxi c2247361Cxi, ByteBuffer byteBuffer, boolean z) {
        float[] fArr;
        if (z) {
            float f = c2247361Cxi.LIZ;
            float f2 = c2247361Cxi.LIZIZ;
            float f3 = c2247361Cxi.LIZLLL + f2;
            float f4 = c2247361Cxi.LIZJ + f;
            fArr = new float[]{f, f3, f, f2, f4, f3, f4, f3, f, f2, f4, f2};
        } else {
            float f5 = c2247361Cxi.LIZ;
            float f6 = c2247361Cxi.LIZIZ;
            float f7 = c2247361Cxi.LIZLLL + f6;
            float f8 = c2247361Cxi.LIZJ + f5;
            fArr = new float[]{f5, f6, f5, f7, f8, f6, f8, f6, f5, f7, f8, f7};
        }
        for (float f9 : fArr) {
            byteBuffer.putFloat(f9);
        }
    }

    public final void LIZ(C2247361Cxi c2247361Cxi, C2247361Cxi c2247361Cxi2, C2247361Cxi c2247361Cxi3) {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.LIZ);
        int i = this.LIZIZ;
        ByteBuffer byteBuffer = this.LJ;
        LIZIZ(c2247361Cxi, byteBuffer, true);
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 0, (Buffer) byteBuffer);
        int i2 = this.LIZJ;
        ByteBuffer byteBuffer2 = this.LJFF;
        LIZIZ(c2247361Cxi2, byteBuffer2, false);
        GLES20.glVertexAttribPointer(i2, 2, 5126, false, 0, (Buffer) byteBuffer2);
        int i3 = this.LIZLLL;
        ByteBuffer byteBuffer3 = this.LJI;
        LIZIZ(c2247361Cxi3, byteBuffer3, false);
        GLES20.glVertexAttribPointer(i3, 2, 5126, false, 0, (Buffer) byteBuffer3);
        GLES20.glEnableVertexAttribArray(this.LIZIZ);
        GLES20.glEnableVertexAttribArray(this.LIZJ);
        GLES20.glEnableVertexAttribArray(this.LIZLLL);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisable(3042);
    }

    public C2247351Cxh(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
