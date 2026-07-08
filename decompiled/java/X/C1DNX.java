package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1DNX, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DNX extends C1DNO {
    public AtomicBoolean LJ;
    public final C1DO2 LJFF;
    public boolean LJI = true;

    @Override // X.InterfaceC2254801DNe
    public final int LJIIIIZZ() {
        return ((AbstractC2254741DMy) this.LJFF).LJJIJIIJI();
    }

    public C1DNX(C1DO2 c1do2) {
        this.LJFF = c1do2;
    }

    @Override // X.InterfaceC2254801DNe
    public final void LIZIZ(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
    }

    @Override // X.InterfaceC2254801DNe
    public final CameraCaptureSession.CaptureCallback LIZJ(final boolean z) {
        return new CameraCaptureSession.CaptureCallback() { // from class: X.1DNW
            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                C1DJG c1djg;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LJ("TEImageFocus", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && (c1djg = this.LIZIZ.LIZIZ) != null) {
                        c1djg.LJIIJJI.LIZ(c1djg.LIZ(), this.LIZIZ.LIZJ.LLILZ, "Done");
                    }
                    C1DNX c1dnx = this.LIZIZ;
                    if (!c1dnx.LIZJ.LLJILLL) {
                        c1dnx.LJFF.LIZIZ();
                    }
                }
                C1DNX c1dnx2 = this.LIZIZ;
                if (c1dnx2.LJI) {
                    c1dnx2.LJI = C2183321Acc.LJI(totalCaptureResult);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                C1DNX c1dnx;
                C1DJG c1djg;
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && (c1djg = (c1dnx = this.LIZIZ).LIZIZ) != null) {
                    c1djg.LJIIJJI.LIZ(-411, c1dnx.LIZJ.LLILZ, captureFailure.toString());
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Manual Metering Failed: ");
                sbLIZ.append(captureFailure);
                C2183341Ace.LIZIZ("TEImageFocus", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    @Override // X.C1DNO
    public final void LJ(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        super.LJ(builder, rect);
    }

    @Override // X.InterfaceC2254801DNe
    public final CameraCaptureSession.CaptureCallback LIZ(final CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, final boolean z, final AbstractC2254741DMy abstractC2254741DMy, final C1DJ6 c1dj6) {
        this.LJ = atomicBoolean;
        return new C2254951DNt(abstractC2254741DMy, c1dj6) { // from class: X.1DNV
            public int LIZJ = -1;
            public boolean LIZLLL;

            public final void LIZ(CameraCaptureSession cameraCaptureSession) {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    ((AbstractC2254741DMy) this.LJI.LJFF).LJJJJL(cameraCaptureSession, builder);
                }
                AtomicBoolean atomicBoolean2 = this.LJI.LJ;
                if (atomicBoolean2 != null) {
                    atomicBoolean2.set(false);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TEImageFocus", "Manual Focus capture abort ");
                C1DJG c1djg = this.LJI.LIZIZ;
                if (c1djg != null) {
                    c1djg.LJIIJJI.LIZ(-438, this.LIZIZ.LLILZ, "Manual Focus capture abort ");
                }
                LIZ(cameraCaptureSession);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (captureRequest != null && "FOCUS_TAG".equals(captureRequest.getTag())) {
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null) {
                        int i = C2187451AjH.LIZ;
                        C2183341Ace.LJ("TEImageFocus", "Focus failed.");
                        AtomicBoolean atomicBoolean2 = this.LJI.LJ;
                        if (atomicBoolean2 != null) {
                            atomicBoolean2.set(false);
                            return;
                        }
                        return;
                    }
                    if (this.LIZJ != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                        if (z) {
                            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                            ((AbstractC2254741DMy) this.LJI.LJFF).LJJJJL(cameraCaptureSession, builder);
                        } else if (!this.LIZIZ.LLJILLL) {
                            ((AbstractC2254741DMy) this.LJI.LJFF).LJJIJIIJI();
                        }
                        if (!this.LIZLLL) {
                            this.LIZLLL = true;
                            C1DJG c1djg = this.LJI.LIZIZ;
                            if (c1djg != null) {
                                c1djg.LJIIJJI.LIZ(c1djg.LIZ(), this.LIZIZ.LLILZ, "Done");
                            }
                        }
                        AtomicBoolean atomicBoolean3 = this.LJI.LJ;
                        if (atomicBoolean3 != null) {
                            atomicBoolean3.set(false);
                        }
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Focus done, isLock = ");
                        sbLIZ.append(z);
                        sbLIZ.append(", afState = ");
                        sbLIZ.append(num);
                        C2183341Ace.LIZLLL("TEImageFocus", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (this.LIZLLL && num.intValue() != 4 && num.intValue() != 5) {
                        int i3 = C2187451AjH.LIZ;
                        C2183341Ace.LIZIZ("TEImageFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                        if (!this.LIZIZ.LLJILLL) {
                            ((AbstractC2254741DMy) this.LJI.LJFF).LJJIJIIJI();
                        }
                    }
                    this.LIZJ = num.intValue();
                    C1DNX c1dnx = this.LJI;
                    if (c1dnx.LJI) {
                        c1dnx.LJI = C2183321Acc.LJI(totalCaptureResult);
                        return;
                    }
                    return;
                }
                int i4 = C2187451AjH.LIZ;
                C2183341Ace.LJ("TEImageFocus", "Not focus request!");
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Manual Focus Failed: ");
                sbLIZ.append(captureFailure);
                C2183341Ace.LIZIZ("TEImageFocus", C2188811AlT.LIZIZ(sbLIZ));
                C1DJG c1djg = this.LJI.LIZIZ;
                if (c1djg != null) {
                    c1djg.LJIIJJI.LIZ(-411, this.LIZIZ.LLILZ, captureFailure.toString());
                }
                LIZ(cameraCaptureSession);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TEImageFocus", "Manual Focus capture buffer lost ");
                C1DJG c1djg = this.LJI.LIZIZ;
                if (c1djg != null) {
                    c1djg.LJIIJJI.LIZ(-411, this.LIZIZ.LLILZ, "Manual Focus capture buffer lost ");
                }
                LIZ(cameraCaptureSession);
            }
        };
    }
}
