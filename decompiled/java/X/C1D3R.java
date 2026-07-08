package X;

import com.ss.android.vesdk.VECameraSettings;

/* JADX INFO: renamed from: X.1D3R, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3R {
    public static final VECameraSettings.CAMERA_FACING_ID LIZ(C1D3N c1d3n) {
        int i = C1D3P.LIZ[c1d3n.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
                }
                throw new C1954807lC();
            }
            return VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
        }
        return VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
    }
}
