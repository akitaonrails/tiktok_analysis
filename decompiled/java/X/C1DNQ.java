package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1DNQ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DNQ extends C1DNO {
    public final C1DO2 LJ;
    public AtomicBoolean LJFF;

    @Override // X.InterfaceC2254801DNe
    public final int LJIIIIZZ() {
        return ((AbstractC2254741DMy) this.LJ).LJJIJIIJI();
    }

    public C1DNQ(C1DO2 c1do2) {
        this.LJ = c1do2;
    }

    @Override // X.InterfaceC2254801DNe
    public final CameraCaptureSession.CaptureCallback LIZJ(final boolean z) {
        return new CameraCaptureSession.CaptureCallback() { // from class: X.1DNR
            public boolean LIZ;

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                C1DJG c1djg;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LJ("TEFocusAndMeterStrategy", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && (c1djg = this.LIZJ.LIZIZ) != null && !this.LIZ) {
                        c1djg.LJIIJJI.LIZ(c1djg.LIZ(), this.LIZJ.LIZJ.LLILZ, "Done");
                        this.LIZ = true;
                    }
                    this.LIZJ.LJ.LIZIZ();
                }
                C1DNQ c1dnq = this.LIZJ;
                if (c1dnq.LIZLLL) {
                    c1dnq.LIZLLL = C2183321Acc.LJI(totalCaptureResult);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                C1DNQ c1dnq;
                C1DJG c1djg;
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && (c1djg = (c1dnq = this.LIZJ).LIZIZ) != null) {
                    c1djg.LJIIJJI.LIZ(-411, c1dnq.LIZJ.LLILZ, captureFailure.toString());
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Manual Metering Failed: ");
                sbLIZ.append(captureFailure);
                C2183341Ace.LIZIZ("TEFocusAndMeterStrategy", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    @Override // X.C1DNO
    public final void LIZLLL(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }

    @Override // X.C1DNO
    public final void LJ(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    @Override // X.InterfaceC2254801DNe
    public final CameraCaptureSession.CaptureCallback LIZ(final CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, final boolean z, final AbstractC2254741DMy abstractC2254741DMy, final C1DJ6 c1dj6) {
        this.LJFF = atomicBoolean;
        return new C2254951DNt(abstractC2254741DMy, c1dj6) { // from class: X.1DNT
            public int LIZJ = -1;
            public boolean LIZLLL;

            public final void LIZ(CameraCaptureSession cameraCaptureSession) {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    ((AbstractC2254741DMy) this.LJI.LJ).LJJJJL(cameraCaptureSession, builder);
                }
                AtomicBoolean atomicBoolean2 = this.LJI.LJFF;
                if (atomicBoolean2 != null) {
                    atomicBoolean2.set(false);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TEFocusAndMeterStrategy", "Manual Focus capture abort ");
                C1DJG c1djg = this.LJI.LIZIZ;
                if (c1djg != null) {
                    c1djg.LJIIJJI.LIZ(-438, this.LIZIZ.LLILZ, "Manual Focus capture abort ");
                }
                LIZ(cameraCaptureSession);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                boolean z2;
                if (this.LIZIZ.LLLLZIL) {
                    ((AbstractC2254741DMy) this.LIZ).LJJIIJ(totalCaptureResult, false);
                }
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LJ("TEFocusAndMeterStrategy", "Focus failed.");
                    AtomicBoolean atomicBoolean2 = this.LJI.LJFF;
                    if (atomicBoolean2 != null) {
                        atomicBoolean2.set(false);
                        return;
                    }
                    return;
                }
                if (this.LIZJ != num.intValue()) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Focus onCaptureCompleted! afState = ");
                    sbLIZ.append(num);
                    C2183341Ace.LIZLLL("TEFocusAndMeterStrategy", C2188811AlT.LIZIZ(sbLIZ));
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LIZJ = num.intValue();
                if (z2 && (num.intValue() == 4 || num.intValue() == 5)) {
                    if (z) {
                        ((AbstractC2254741DMy) this.LJI.LJ).LJJJJL(cameraCaptureSession, builder);
                    } else {
                        ((AbstractC2254741DMy) this.LJI.LJ).LJJIJIIJI();
                    }
                    if (!this.LIZLLL) {
                        this.LIZLLL = true;
                        C1DJG c1djg = this.LJI.LIZIZ;
                        if (c1djg != null) {
                            c1djg.LJIIJJI.LIZ(c1djg.LIZ(), this.LIZIZ.LLILZ, "Done");
                        }
                    }
                    AtomicBoolean atomicBoolean3 = this.LJI.LJFF;
                    if (atomicBoolean3 != null) {
                        atomicBoolean3.set(false);
                    }
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Focus done, isLock = ");
                    sbLIZ2.append(z);
                    sbLIZ2.append(", afState = ");
                    sbLIZ2.append(num);
                    C2183341Ace.LIZLLL("TEFocusAndMeterStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (this.LIZLLL && num.intValue() != 4 && num.intValue() != 5) {
                    int i4 = C2187451AjH.LIZ;
                    C2183341Ace.LIZIZ("TEFocusAndMeterStrategy", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                    ((AbstractC2254741DMy) this.LJI.LJ).LJJIJIIJI();
                }
                C1DNQ c1dnq = this.LJI;
                if (c1dnq.LIZLLL) {
                    c1dnq.LIZLLL = C2183321Acc.LJI(totalCaptureResult);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (this.LIZIZ.LLLLZIL) {
                    ((AbstractC2254741DMy) this.LIZ).LJJIIJZLJL(captureFailure);
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Manual Focus Failed: ");
                sbLIZ.append(captureFailure);
                sbLIZ.append(", session: ");
                sbLIZ.append(cameraCaptureSession);
                C2183341Ace.LIZIZ("TEFocusAndMeterStrategy", C2188811AlT.LIZIZ(sbLIZ));
                C1DJG c1djg = this.LJI.LIZIZ;
                if (c1djg != null) {
                    c1djg.LJIIJJI.LIZ(-411, this.LIZIZ.LLILZ, captureFailure.toString());
                }
                LIZ(cameraCaptureSession);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TEFocusAndMeterStrategy", "Focus onCaptureProgressed!");
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TEFocusAndMeterStrategy", "Focus onCaptureSequenceCompleted!");
                AtomicBoolean atomicBoolean2 = this.LJI.LJFF;
                if (atomicBoolean2 != null) {
                    atomicBoolean2.set(false);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Manual Focus capture buffer lost , session: ");
                sbLIZ.append(cameraCaptureSession);
                C2183341Ace.LIZIZ("TEFocusAndMeterStrategy", C2188811AlT.LIZIZ(sbLIZ));
                C1DJG c1djg = this.LJI.LIZIZ;
                if (c1djg != null) {
                    c1djg.LJIIJJI.LIZ(-411, c1djg.LIZ(), "Manual Focus capture buffer lost ");
                }
                LIZ(cameraCaptureSession);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TEFocusAndMeterStrategy", "Focus onCaptureStarted!");
            }
        };
    }
}
