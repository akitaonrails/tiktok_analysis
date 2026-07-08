package X;

import android.util.SparseIntArray;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;

/* JADX INFO: renamed from: X.1DIO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DIO {
    public static VECameraController LIZ(C2253371DHr c2253371DHr) {
        VECameraController vECameraController = new VECameraController(c2253371DHr.LIZ, c2253371DHr.LIZJ, c2253371DHr.LIZLLL, c2253371DHr.LIZIZ.LJIIZILJ(), c2253371DHr.LJ, c2253371DHr.LJI, c2253371DHr.LJFF);
        vECameraController.LLJLL = c2253371DHr.LIZIZ.LJJIIZI();
        vECameraController.LLJLLIL = c2253371DHr.LIZIZ.LJIIJJI();
        vECameraController.LLLIIIIL = c2253371DHr.LIZIZ.LJIJ();
        vECameraController.LLLIIIL = c2253371DHr.LIZIZ.LIZJ();
        vECameraController.LLLIIL = c2253371DHr.LIZIZ.LJIIL();
        vECameraController.LLJLLL = c2253371DHr.LIZIZ.LJIL();
        if (c2253371DHr.LIZIZ.LJII()) {
            SparseIntArray sparseIntArray = new SparseIntArray(3);
            sparseIntArray.put(0, 2);
            sparseIntArray.put(2, 3);
            sparseIntArray.put(3, 0);
            vECameraController.LLLJL = sparseIntArray;
        }
        vECameraController.LLLIZZ = c2253371DHr.LIZIZ.LJIIIZ();
        vECameraController.LLLJ = c2253371DHr.LIZIZ.LJJIIZ();
        return vECameraController;
    }
}
