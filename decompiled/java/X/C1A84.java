package X;

import com.ss.android.vesdk.VECameraSettings;

/* JADX INFO: renamed from: X.1A84, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A84 {
    public static final VECameraSettings.CAMERA_FACING_ID LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return VECameraSettings.CAMERA_FACING_ID.FACING_3RD;
                    }
                    throw new IllegalStateException();
                }
                return VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
            }
            return VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
        }
        return VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
    }
}
