package X;

import android.media.Image;
import com.ss.android.medialib.camera.ImageFrame;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1AgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2185601AgI {
    public final ImageFrame LIZ;

    public C2185601AgI(ImageFrame imageFrame) {
        this.LIZ = imageFrame;
    }

    public final void LIZ(int[][] iArr, ByteBuffer[] byteBufferArr) {
        Image.Plane[] planeArr;
        C2185611AgJ plane = this.LIZ.getPlane();
        if (plane == null || (planeArr = plane.LIZ) == null) {
            return;
        }
        for (int i = 0; i < planeArr.length; i++) {
            ByteBuffer buffer = planeArr[i].getBuffer();
            byteBufferArr[i] = buffer;
            int iRemaining = buffer.remaining();
            int rowStride = planeArr[i].getRowStride();
            if (rowStride <= 0) {
                rowStride = this.LIZ.width;
                C2484209oO.LIZJ("PlanFrame", "rowStride <= 0");
            }
            int pixelStride = planeArr[i].getPixelStride();
            if (pixelStride <= 0) {
                C2484209oO.LIZJ("PlanFrame", "pixelStride <= 0");
                pixelStride = 1;
            }
            iArr[i] = new int[]{iRemaining, rowStride, pixelStride};
        }
    }
}
