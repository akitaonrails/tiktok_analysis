package X;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;

/* JADX INFO: renamed from: X.1DNO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DNO implements InterfaceC2254801DNe {
    public C1DJG LIZIZ;
    public C1DJ6 LIZJ;
    public boolean LIZLLL = true;

    public void LIZLLL(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        builder.setTag("FOCUS_TAG");
    }

    public void LJ(CaptureRequest.Builder builder, Rect rect) {
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }
}
