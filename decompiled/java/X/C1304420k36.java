package X;

import android.hardware.Camera;

/* JADX INFO: renamed from: X.0k36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304420k36 {
    public static int LIZ() {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        int i = 0;
        while (i < numberOfCameras) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0) {
                break;
            }
            i++;
        }
        if (i < numberOfCameras) {
            return i;
        }
        return 0;
    }
}
