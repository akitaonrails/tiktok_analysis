package X;

import android.hardware.Camera;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Aii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187101Aii implements C1DHV {
    public static int LIZIZ = -1;
    public final InterfaceC2187111Aij LIZ;

    @Override // X.C1DHV
    public final int LIZ() {
        Integer numLIZ = this.LIZ.LIZ();
        if (numLIZ != null) {
            return numLIZ.intValue();
        }
        if (LIZIZ == -1) {
            LIZIZ = LIZLLL();
        }
        int i = LIZIZ;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static int LIZLLL() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras <= 0) {
                return -1;
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i = 0;
            do {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    return 1;
                }
                i++;
            } while (i < numberOfCameras);
            return -1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public C2187101Aii(InterfaceC2187111Aij interfaceC2187111Aij) {
        this.LIZ = interfaceC2187111Aij;
    }

    @Override // X.C1DHV
    public final int LIZIZ(int i) {
        if (i == 1) {
            i = LIZLLL();
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // X.C1DHV
    public final void LIZJ(int i) {
        this.LIZ.LIZIZ(i);
    }
}
