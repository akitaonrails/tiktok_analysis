package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1DNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public interface InterfaceC2254801DNe {
    public static final MeteringRectangle[] LIZ = {new MeteringRectangle(0, 0, 0, 0, 0)};

    CameraCaptureSession.CaptureCallback LIZ(CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z, AbstractC2254741DMy abstractC2254741DMy, C1DJ6 c1dj6);

    void LIZIZ(CaptureRequest.Builder builder);

    CameraCaptureSession.CaptureCallback LIZJ(boolean z);

    int LJIIIIZZ();
}
