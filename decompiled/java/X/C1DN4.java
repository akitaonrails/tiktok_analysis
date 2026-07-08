package X;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1DN4, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DN4 extends C1DN3 {
    public final Map<Integer, SurfaceTexture> LJIILIIL;
    public final Map<Integer, List<Surface>> LJIILJJIL;
    public final Map<Integer, List<ImageReader>> LJIILL;
    public final Map<Integer, Integer> LJIILLIIL;
    public final Map<Integer, C1DJX> LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;

    @Override // X.C1DN3
    public final SurfaceTexture LJI() {
        return null;
    }

    @Override // X.C1DN3
    public final void LJIILL() {
    }

    @Override // X.C1DN3
    public final Surface LIZJ() {
        if (((HashMap) this.LJIILJJIL).get(0) != null) {
            return (Surface) ListProtector.get((List) ((HashMap) this.LJIILJJIL).get(0), 0);
        }
        return null;
    }

    @Override // X.C1DN3
    public final Surface[] LJIIIIZZ() {
        if (((HashMap) this.LJIILJJIL).get(0) != null) {
            return (Surface[]) ((List) ((HashMap) this.LJIILJJIL).get(0)).toArray(new Surface[0]);
        }
        return null;
    }

    @Override // X.C1DN3
    public final void LJIILLIIL() {
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJIIZILJ).entrySet()) {
            if (entry.getValue() instanceof C1DJQ) {
                entry.setValue(this.LJIIL);
            } else {
                entry.setValue(this.LJIIJJI);
            }
        }
    }

    @Override // X.C1DN3
    public final void LJIIZILJ() {
        for (Map.Entry entry : ((HashMap) this.LJIILIIL).entrySet()) {
            if (entry.getValue() != null && Build.VERSION.SDK_INT >= 26 && !((SurfaceTexture) entry.getValue()).isReleased()) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("releaseSurfaceTexture, mSurfaceTexture = ");
                sbLIZ.append(entry.getValue());
                C2183341Ace.LIZLLL("TEMultiSurfaceTextureProvider", C2188811AlT.LIZIZ(sbLIZ));
                ((SurfaceTexture) entry.getValue()).release();
            }
        }
    }

    @Override // X.C1DN3
    public final EnumC2186221AhI LJIIJJI() {
        return EnumC2186221AhI.PROVIDER_TYPE_MULTI_SURFACE_TEXTURE;
    }

    @Override // X.C1DN3
    public final Surface LIZLLL(int i) {
        if (((HashMap) this.LJIILJJIL).get(Integer.valueOf(i)) != null) {
            return (Surface) ListProtector.get((List) ((HashMap) this.LJIILJJIL).get(Integer.valueOf(i)), 0);
        }
        return null;
    }

    @Override // X.C1DN3
    public final Surface[] LJIIIZ(int i) {
        if (((HashMap) this.LJIILJJIL).get(Integer.valueOf(i)) != null) {
            return (Surface[]) ((List) ((HashMap) this.LJIILJJIL).get(Integer.valueOf(i))).toArray(new Surface[0]);
        }
        return null;
    }

    @Override // X.C1DN3
    public final void LJIJJ(C1DJX c1djx) {
        if (((ConcurrentHashMap) this.LJIIZILJ).get(Integer.valueOf(this.LJIJ)) == null) {
            ((ConcurrentHashMap) this.LJIIZILJ).put(Integer.valueOf(this.LJIJ), c1djx);
        } else {
            ((ConcurrentHashMap) this.LJIIZILJ).put(Integer.valueOf(this.LJIJI), c1djx);
        }
    }

    public C1DN4(C1DJM c1djm, C1DJK c1djk) {
        super(c1djm, c1djk);
        this.LJIJI = 1;
        this.LJIILIIL = new HashMap();
        this.LJIILJJIL = new HashMap();
        this.LJIILL = new HashMap();
        this.LJIILLIIL = new HashMap();
        this.LJIIZILJ = new ConcurrentHashMap();
        if (c1djk instanceof C1DN0) {
            c1djk.getClass();
            int i = C1DN0.LJIILLIIL;
            this.LJIJ = i;
            this.LJIJI = i != 0 ? 0 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
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
            if (r0 != r4) goto L23
            if (r0 != 0) goto L17
        L15:
            r0 = 35
        L17:
            android.util.Size[] r0 = r7.getOutputSizes(r0)
            java.util.List r0 = X.C1DN3.LIZ(r0)
            r6.LJIILIIL(r0, r8)
            return r2
        L23:
            int r1 = r1 + 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DN4.LJIIL(android.hardware.camera2.params.StreamConfigurationMap, com.ss.android.ttvecamera.TEFrameSizei):int");
    }

    @Override // X.C1DN3
    public final void LJIILIIL(List list, TEFrameSizei tEFrameSizei) {
        if (list != null && ((ArrayList) list).size() > 0) {
            this.LJFF = C2183321Acc.LIZIZ(list, this.LJFF, this.LJI.LIZIZ().LLLZ);
        }
        for (final Map.Entry entry : ((HashMap) this.LJIILIIL).entrySet()) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (surfaceTexture != null) {
                TEFrameSizei tEFrameSizei2 = this.LJFF;
                surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
                arrayList2.add(new Surface(surfaceTexture));
            }
            for (int i = 0; i < this.LJIIIIZZ; i++) {
                TEFrameSizei tEFrameSizei3 = this.LJFF;
                ImageReader imageReaderNewInstance = ImageReader.newInstance(tEFrameSizei3.width, tEFrameSizei3.height, TECameraFrame.pixelFormat2ImageFormat(this.LIZIZ), 1);
                imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: X.1DNI
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader) {
                        Image imageAcquireNextImage = imageReader.acquireNextImage();
                        if (imageAcquireNextImage == null) {
                            return;
                        }
                        TECameraFrame tECameraFrame = new TECameraFrame(imageAcquireNextImage.getWidth(), imageAcquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
                        tECameraFrame.initYUVPlans(new C2185681AgQ(imageAcquireNextImage.getPlanes()), this.LLILLJJLI.LJI.LJIL(((Integer) entry.getKey()).intValue()), this.LLILLJJLI.LIZIZ, ((Integer) entry.getKey()).intValue());
                        if (((ConcurrentHashMap) this.LLILLJJLI.LJIIZILJ).get(entry.getKey()) != null) {
                            ((C1DJX) ((ConcurrentHashMap) this.LLILLJJLI.LJIIZILJ).get(entry.getKey())).LIZIZ(tECameraFrame);
                        }
                        imageAcquireNextImage.close();
                    }
                }, this.LJI.getHandler());
                arrayList.add(imageReaderNewInstance);
                arrayList2.add(imageReaderNewInstance.getSurface());
            }
            ((HashMap) this.LJIILL).put(Integer.valueOf(iIntValue), arrayList);
            ((HashMap) this.LJIILJJIL).put(Integer.valueOf(iIntValue), arrayList2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJFF.width);
        sbLIZ.append("*");
        sbLIZ.append(this.LJFF.height);
        C1305710k5B.LIZIZ("te_record_camera_output_size", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1DN3
    public final void LJIL(SurfaceTexture surfaceTexture, int i) {
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
        if (((HashMap) this.LJIILIIL).get(Integer.valueOf(this.LJIJ)) == null) {
            ((HashMap) this.LJIILIIL).put(Integer.valueOf(this.LJIJ), surfaceTexture);
            ((HashMap) this.LJIILLIIL).put(Integer.valueOf(this.LJIJ), Integer.valueOf(i));
            final int i2 = this.LJIJ;
            onFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener() { // from class: X.1DND
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    C1DJK c1djk = this.LLILLJJLI.LJI;
                    if (c1djk == null) {
                        return;
                    }
                    c1djk.LJJL(i2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TESurfaceTextureProvider-onFrameAvailable facing ");
                    sbLIZ.append(this.LLILLJJLI.LJI.LJL());
                    sbLIZ.append(", timestampe ");
                    sbLIZ.append(surfaceTexture2.getTimestamp());
                    C1321640kUs.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    float[] fArr = new float[16];
                    surfaceTexture2.getTransformMatrix(fArr);
                    TEFrameSizei tEFrameSizei = this.LLILLJJLI.LJFF;
                    TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture2.getTimestamp());
                    if (((HashMap) this.LLILLJJLI.LJIILLIIL).get(Integer.valueOf(i2)) != null) {
                        if (((ConcurrentHashMap) this.LLILLJJLI.LJIIZILJ).get(Integer.valueOf(i2)) != null) {
                            tECameraFrame.initTextureFrame(((Integer) ((HashMap) this.LLILLJJLI.LJIILLIIL).get(Integer.valueOf(i2))).intValue(), this.LLILLJJLI.LJI.LJIL(i2), fArr, this.LLILLJJLI.LIZIZ, i2);
                            tECameraFrame.setMetadata(this.LLILLJJLI.LJIIIZ);
                            ((C1DJX) ((ConcurrentHashMap) this.LLILLJJLI.LJIIZILJ).get(Integer.valueOf(i2))).LIZIZ(tECameraFrame);
                        }
                    }
                    C1321640kUs.LIZIZ();
                }
            };
        } else {
            ((HashMap) this.LJIILIIL).put(Integer.valueOf(this.LJIJI), surfaceTexture);
            ((HashMap) this.LJIILLIIL).put(Integer.valueOf(this.LJIJI), Integer.valueOf(i));
            final int i3 = this.LJIJI;
            onFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener() { // from class: X.1DND
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    C1DJK c1djk = this.LLILLJJLI.LJI;
                    if (c1djk == null) {
                        return;
                    }
                    c1djk.LJJL(i3);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TESurfaceTextureProvider-onFrameAvailable facing ");
                    sbLIZ.append(this.LLILLJJLI.LJI.LJL());
                    sbLIZ.append(", timestampe ");
                    sbLIZ.append(surfaceTexture2.getTimestamp());
                    C1321640kUs.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    float[] fArr = new float[16];
                    surfaceTexture2.getTransformMatrix(fArr);
                    TEFrameSizei tEFrameSizei = this.LLILLJJLI.LJFF;
                    TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei.width, tEFrameSizei.height, surfaceTexture2.getTimestamp());
                    if (((HashMap) this.LLILLJJLI.LJIILLIIL).get(Integer.valueOf(i3)) != null) {
                        if (((ConcurrentHashMap) this.LLILLJJLI.LJIIZILJ).get(Integer.valueOf(i3)) != null) {
                            tECameraFrame.initTextureFrame(((Integer) ((HashMap) this.LLILLJJLI.LJIILLIIL).get(Integer.valueOf(i3))).intValue(), this.LLILLJJLI.LJI.LJIL(i3), fArr, this.LLILLJJLI.LIZIZ, i3);
                            tECameraFrame.setMetadata(this.LLILLJJLI.LJIIIZ);
                            ((C1DJX) ((ConcurrentHashMap) this.LLILLJJLI.LJIIZILJ).get(Integer.valueOf(i3))).LIZIZ(tECameraFrame);
                        }
                    }
                    C1321640kUs.LIZIZ();
                }
            };
        }
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, this.LJI.getHandler());
        }
    }
}
