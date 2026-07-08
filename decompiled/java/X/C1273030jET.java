package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: X.0jET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273030jET {
    public static Bitmap LIZ(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6 = i2;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i6 * i3 * 4);
        byteBufferAllocateDirect.clear();
        if (z) {
            i4 = i3;
        } else {
            i4 = i6;
            i6 = i3;
        }
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i7 = iArr[0];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, IntBuffer.wrap(iArr2));
        int i8 = iArr2[0];
        GLES20.glBindFramebuffer(36160, i7);
        int i9 = 36197;
        if (z) {
            i5 = 36197;
        } else {
            i5 = 3553;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, i5, i, 0);
        GLES20.glReadPixels(0, 0, i4, i6, 6408, 5121, byteBufferAllocateDirect);
        if (!z) {
            i9 = 3553;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, i9, 0, 0);
        GLES20.glBindFramebuffer(36160, i8);
        byteBufferAllocateDirect.clear();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i6, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
        return bitmapCreateBitmap;
    }
}
