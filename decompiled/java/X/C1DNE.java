package X;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1DNE, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DNE extends C1DN3 {
    public ImageReader LJIILIIL;

    @Override // X.C1DN3
    public final SurfaceTexture LJI() {
        return null;
    }

    @Override // X.C1DN3
    public final void LJIILL() {
    }

    @Override // X.C1DN3
    public final Surface LIZJ() {
        ImageReader imageReader = this.LJIILIIL;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // X.C1DN3
    public final void LJIILLIIL() {
        super.LJIILLIIL();
        ImageReader imageReader = this.LJIILIIL;
        if (imageReader != null) {
            imageReader.close();
            this.LJIILIIL = null;
        }
    }

    @Override // X.C1DN3
    public final EnumC2186221AhI LJIIJJI() {
        return EnumC2186221AhI.PROVIDER_TYPE_IMAGE_READER;
    }

    public C1DNE(C1DJM c1djm, C1DJK c1djk) {
        super(c1djm, c1djk);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        r6.LIZIZ = com.ss.android.ttvecamera.TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420;
        r0 = 35;
     */
    @Override // X.C1DN3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIL(android.hardware.camera2.params.StreamConfigurationMap r7, com.ss.android.ttvecamera.TEFrameSizei r8) {
        /*
            r6 = this;
            int[] r5 = r7.getOutputFormats()
            com.ss.android.ttvecamera.TECameraFrame$ETEPixelFormat r0 = r6.LIZIZ
            int r4 = com.ss.android.ttvecamera.TECameraFrame.pixelFormat2ImageFormat(r0)
            int r3 = r5.length
            r2 = 0
            r1 = 0
        Ld:
            if (r1 >= r3) goto L15
            r0 = r5[r1]
            if (r0 != r4) goto L27
            if (r0 != 0) goto L1b
        L15:
            com.ss.android.ttvecamera.TECameraFrame$ETEPixelFormat r0 = com.ss.android.ttvecamera.TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420
            r6.LIZIZ = r0
            r0 = 35
        L1b:
            android.util.Size[] r0 = r7.getOutputSizes(r0)
            java.util.List r0 = X.C1DN3.LIZ(r0)
            r6.LJIILIIL(r0, r8)
            return r2
        L27:
            int r1 = r1 + 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DNE.LJIIL(android.hardware.camera2.params.StreamConfigurationMap, com.ss.android.ttvecamera.TEFrameSizei):int");
    }

    @Override // X.C1DN3
    public final void LJIILIIL(List list, TEFrameSizei tEFrameSizei) {
        if (list != null && ((ArrayList) list).size() > 0) {
            this.LJFF = C2183321Acc.LIZIZ(list, this.LJFF, this.LJI.LIZIZ().LLLZ);
        }
        ImageReader imageReader = this.LJIILIIL;
        if (imageReader != null) {
            imageReader.close();
        }
        TEFrameSizei tEFrameSizei2 = this.LJFF;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(tEFrameSizei2.width, tEFrameSizei2.height, TECameraFrame.pixelFormat2ImageFormat(this.LIZIZ), 1);
        this.LJIILIIL = imageReaderNewInstance;
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: X.1DNJ
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                Image imageAcquireLatestImage = imageReader2.acquireLatestImage();
                if (imageAcquireLatestImage == null) {
                    return;
                }
                try {
                    try {
                        TECameraFrame tECameraFrame = new TECameraFrame(imageAcquireLatestImage.getWidth(), imageAcquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                        C2185681AgQ c2185681AgQ = new C2185681AgQ(imageAcquireLatestImage.getPlanes());
                        int iLJIIZILJ = this.LL.LJI.LJIIZILJ();
                        C1DNE c1dne = this.LL;
                        tECameraFrame.initYUVPlans(c2185681AgQ, iLJIIZILJ, c1dne.LIZIZ, c1dne.LJI.LJL());
                        this.LL.LJIILJJIL(tECameraFrame);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    imageAcquireLatestImage.close();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    imageAcquireLatestImage.close();
                    throw th;
                }
            }
        }, this.LJI.getHandler());
    }
}
