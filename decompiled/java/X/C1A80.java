package X;

import android.content.Context;
import com.ss.android.vesdk.VECameraCapture;
import com.ss.android.vesdk.VECameraSettings;

/* JADX INFO: renamed from: X.1A80, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A80 {
    public final C1A82 LIZ;
    public final C1A86 LIZIZ;
    public VECameraSettings.CAMERA_FACING_ID LIZJ = VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
    public VECameraCapture LIZLLL;

    public final void LIZ() {
        if (this.LIZLLL != null) {
            return;
        }
        VECameraCapture vECameraCapture = new VECameraCapture();
        this.LIZLLL = vECameraCapture;
        C1A82 c1a82 = this.LIZ;
        vECameraCapture.LLIZLLLIL = c1a82.LIZJ;
        Context context = c1a82.LIZ;
        VECameraSettings vECameraSettingsLIZ = C1A85.LIZ(this.LIZIZ);
        vECameraSettingsLIZ.setCameraFacing(this.LIZJ);
        vECameraCapture.LJIIL(context, vECameraSettingsLIZ);
        InterfaceC2174411A7z<VECameraCapture> interfaceC2174411A7zLIZ = C2174401A7y.LIZ();
        if (interfaceC2174411A7zLIZ != null) {
            interfaceC2174411A7zLIZ.LIZIZ(this.LIZLLL);
        }
    }

    public C1A80(C1A82 c1a82) {
        this.LIZ = c1a82;
        this.LIZIZ = c1a82.LIZIZ;
    }
}
