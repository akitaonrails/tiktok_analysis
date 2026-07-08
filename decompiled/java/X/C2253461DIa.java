package X;

import com.ss.android.vesdk.VECameraCapture;
import com.ss.android.vesdk.VECameraSettings;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253461DIa {
    public final VECameraCapture LIZ;
    public final C1DK1 LIZIZ;
    public float LJFF;
    public float LIZJ = -1.0f;
    public float LIZLLL = 1.0f;
    public float LJ = 1.0f;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 387));

    public final boolean LIZ(float f) {
        float f2;
        float f3 = this.LIZJ;
        if (f3 == -1.0f) {
            return false;
        }
        float fMax = Math.max(Math.min(f3, f), 0.0f);
        if (0.0f > fMax || fMax > this.LIZJ) {
            return false;
        }
        VECameraSettings.CAMERA_TYPE cameraType = this.LIZ.LL.getCameraType();
        VECameraSettings.CAMERA_TYPE camera_type = VECameraSettings.CAMERA_TYPE.TYPE_CamKit;
        if (cameraType == camera_type && this.LIZ.LJJIIZI() == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
            float f4 = this.LIZJ;
            float f5 = 1;
            f2 = ((fMax / f4) * (f4 - f5)) + f5;
        } else {
            f2 = fMax;
        }
        if (this.LIZ.LL.getCameraType() == camera_type && this.LIZ.LJJIIZI() == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
            this.LIZIZ.LIZIZ().LIZIZ.LJJJ.LJJII("setShaderZoom", f2);
        } else {
            VECameraCapture vECameraCapture = this.LIZ;
            vECameraCapture.LLJILJIL.startZoom(f2, vECameraCapture);
        }
        this.LIZLLL = fMax;
        return true;
    }

    public C2253461DIa(VECameraCapture vECameraCapture, C1DK1 c1dk1) {
        this.LIZ = vECameraCapture;
        this.LIZIZ = c1dk1;
    }
}
