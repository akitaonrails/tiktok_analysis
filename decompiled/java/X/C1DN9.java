package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1DN9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DN9 extends C1DN3 {
    public Surface LJIILIIL;
    public Surface LJIILJJIL;
    public SurfaceTexture LJIILL;
    public final float[] LJIILLIIL;
    public final int LJIIZILJ;

    @Override // X.C1DN3
    public final void LJIILL() {
        Surface surface = this.LJIILJJIL;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.LJIILL;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.LJIILL = new SurfaceTexture(this.LJIIZILJ);
        this.LJIILJJIL = new Surface(this.LJIILL);
        this.LIZ.LJLLILLLL(this.LJIILL);
    }

    @Override // X.C1DN3
    public final void LJIILLIIL() {
        super.LJIILLIIL();
        Surface surface = this.LJIILJJIL;
        if (surface != null) {
            surface.release();
            this.LJIILJJIL = null;
        }
        Surface surface2 = this.LJIILIIL;
        if (surface2 != null) {
            surface2.release();
            this.LJIILIIL = null;
        }
    }

    @Override // X.C1DN3
    public final Surface LIZIZ() {
        return this.LJIILIIL;
    }

    @Override // X.C1DN3
    public final Surface LIZJ() {
        return this.LJIILJJIL;
    }

    @Override // X.C1DN3
    public final SurfaceTexture LJI() {
        return this.LJIILL;
    }

    @Override // X.C1DN3
    public final EnumC2186221AhI LJIIJJI() {
        return EnumC2186221AhI.PROVIDER_TYPE_RECORDER;
    }

    public C1DN9(C1DJM c1djm, C1DJK c1djk) {
        super(c1djm, c1djk);
        this.LJIILLIIL = new float[16];
        this.LJIILL = c1djm.LIZLLL;
        this.LJIIZILJ = c1djm.LJ;
        this.LJIILJJIL = new Surface(c1djm.LIZLLL);
        this.LJIILIIL = c1djm.LJI;
    }

    @Override // X.C1DN3
    public final int LJIIL(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        LJIILIIL(C1DN3.LIZ(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
        return 0;
    }

    @Override // X.C1DN3
    public final void LJIILIIL(List list, TEFrameSizei tEFrameSizei) {
        if (list != null && ((ArrayList) list).size() > 0) {
            this.LJFF = C2183321Acc.LIZIZ(list, this.LJFF, this.LJI.LIZIZ().LLLZ);
        }
        SurfaceTexture surfaceTexture = this.LJIILL;
        TEFrameSizei tEFrameSizei2 = this.LJFF;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        this.LJIILL.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: X.1DNN
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                C1DN9 c1dn9 = this.LL;
                if (c1dn9.LJI == null) {
                    return;
                }
                surfaceTexture2.getTransformMatrix(c1dn9.LJIILLIIL);
                TEFrameSizei tEFrameSizei3 = this.LL.LJFF;
                TECameraFrame tECameraFrame = new TECameraFrame(tEFrameSizei3.width, tEFrameSizei3.height, surfaceTexture2.getTimestamp());
                C1DN9 c1dn92 = this.LL;
                int i = c1dn92.LJIIZILJ;
                int iLJIIZILJ = c1dn92.LJI.LJIIZILJ();
                C1DN9 c1dn93 = this.LL;
                tECameraFrame.initTextureFrame(i, iLJIIZILJ, c1dn93.LJIILLIIL, c1dn93.LIZIZ, c1dn93.LJI.LJL());
                this.LL.LJIILJJIL(tECameraFrame);
            }
        }, this.LJI.getHandler());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJFF.width);
        sbLIZ.append("*");
        sbLIZ.append(this.LJFF.height);
        C1305710k5B.LIZIZ("te_record_camera_output_size", C2188811AlT.LIZIZ(sbLIZ));
    }
}
