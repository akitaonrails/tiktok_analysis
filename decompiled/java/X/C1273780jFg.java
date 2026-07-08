package X;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLES30;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273780jFg {
    public static float[] LIZ(float f) {
        Matrix matrixLIZJ = C1273520jFG.LIZJ(true);
        matrixLIZJ.preTranslate(0.0f, 0.5f);
        matrixLIZJ.preScale(1.0f, -1.0f);
        matrixLIZJ.preTranslate(0.0f, -0.5f);
        if (f != 0.0f) {
            matrixLIZJ.preTranslate(0.5f, 0.5f);
            matrixLIZJ.preRotate(f);
            matrixLIZJ.preTranslate(-0.5f, -0.5f);
        }
        return C1273010jER.LIZIZ(matrixLIZJ);
    }

    public static int LIZIZ(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, GlUtil.getFilterType(9729));
        GLES20.glTexParameterf(3553, 10240, GlUtil.getFilterType(9729));
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6409, i2, i3, 0, 6409, 5121, null);
        return iArr[0];
    }

    public static void LIZJ(boolean z, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer) {
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, i2);
        if (z && i5 >= i3) {
            GLES30.glPixelStorei(3314, i5);
        }
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6409, 5121, byteBuffer);
        if (z && i5 >= i3) {
            GLES30.glPixelStorei(3314, 0);
        }
    }
}
