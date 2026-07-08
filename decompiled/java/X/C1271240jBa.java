package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* JADX INFO: renamed from: X.0jBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271240jBa {
    public static int LIZ(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        if (i == 0) {
            return 0;
        }
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }
}
