package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1DNY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DNY extends C1DNO {
    public final C1DO2 LJ;
    public AtomicBoolean LJFF;

    @Override // X.InterfaceC2254801DNe
    public final int LJIIIIZZ() {
        return ((AbstractC2254741DMy) this.LJ).LJJIJIIJI();
    }

    public C1DNY(C1DO2 c1do2) {
        this.LJ = c1do2;
    }

    @Override // X.InterfaceC2254801DNe
    public final void LIZIZ(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // X.InterfaceC2254801DNe
    public final CameraCaptureSession.CaptureCallback LIZJ(final boolean z) {
        return new CameraCaptureSession.CaptureCallback() { // from class: X.1DNS
            public boolean LIZ;

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                C1DJG c1djg;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    int i = C2187451AjH.LIZ;
                    C2183341Ace.LJ("TEVideoFocus", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && (c1djg = this.LIZJ.LIZIZ) != null && !this.LIZ) {
                        c1djg.LJIIJJI.LIZ(c1djg.LIZ(), this.LIZJ.LIZJ.LLILZ, "Done");
                        this.LIZ = true;
                    }
                    C1DNY c1dny = this.LIZJ;
                    if (!c1dny.LIZJ.LLJILLL) {
                        c1dny.LJ.LIZIZ();
                    }
                    int i2 = C2187451AjH.LIZ;
                    C2183341Ace.LIZ("TEVideoFocus", "Manual Metering success");
                }
                C1DNY c1dny2 = this.LIZJ;
                if (c1dny2.LIZLLL) {
                    c1dny2.LIZLLL = C2183321Acc.LJI(totalCaptureResult);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                C1DNY c1dny;
                C1DJG c1djg;
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && (c1djg = (c1dny = this.LIZJ).LIZIZ) != null) {
                    c1djg.LJIIJJI.LIZ(-411, c1dny.LIZJ.LLILZ, captureFailure.toString());
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Manual Metering Failed: ");
                sbLIZ.append(captureFailure);
                C2183341Ace.LIZIZ("TEVideoFocus", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    @Override // X.InterfaceC2254801DNe
    public final CameraCaptureSession.CaptureCallback LIZ(final CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, final boolean z, final AbstractC2254741DMy abstractC2254741DMy, final C1DJ6 c1dj6) {
        this.LJFF = atomicBoolean;
        return new C2254951DNt(abstractC2254741DMy, c1dj6) { // from class: X.1DNU
            public int LIZJ = -1;
            public boolean LIZLLL;

            public final void LIZ() {
                AtomicBoolean atomicBoolean2 = this.LJI.LJFF;
                if (atomicBoolean2 != null) {
                    atomicBoolean2.set(false);
                }
            }

            public final void LIZIZ(CameraCaptureSession cameraCaptureSession) {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    ((AbstractC2254741DMy) this.LJI.LJ).LJJJJL(cameraCaptureSession, builder);
                }
                LIZ();
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TEVideoFocus", "Manual Focus capture abort ");
                C1DJG c1djg = this.LJI.LIZIZ;
                if (c1djg != null) {
                    c1djg.LJIIJJI.LIZ(-438, this.LIZIZ.LLILZ, "Manual Focus capture abort ");
                }
                LIZIZ(cameraCaptureSession);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (this.LIZIZ.LLLLZIL) {
                    ((AbstractC2254741DMy) this.LIZ).LJJIIJ(totalCaptureResult, false);
                }
                if (captureRequest != null && "FOCUS_TAG".equals(captureRequest.getTag())) {
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    Object obj = captureRequest.get(CaptureRequest.CONTROL_AF_TRIGGER);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Manual Focus onCaptureCompleted: afState = ");
                    sbLIZ.append(num);
                    sbLIZ.append(", triggerState = ");
                    sbLIZ.append(obj);
                    C2183341Ace.LIZ("TEVideoFocus", C2188811AlT.LIZIZ(sbLIZ));
                    if (num == null) {
                        C2183341Ace.LJ("TEVideoFocus", "Focus failed.");
                        LIZ();
                        return;
                    }
                    if (this.LIZJ != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                        if (z) {
                            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                            ((AbstractC2254741DMy) this.LJI.LJ).LJJJJL(cameraCaptureSession, builder);
                        } else if (!this.LIZIZ.LLJILLL) {
                            ((AbstractC2254741DMy) this.LJI.LJ).LJJIJIIJI();
                        }
                        if (!this.LIZLLL) {
                            this.LIZLLL = true;
                            C1DJG c1djg = this.LJI.LIZIZ;
                            if (c1djg != null) {
                                c1djg.LJIIJJI.LIZ(c1djg.LIZ(), this.LIZIZ.LLILZ, "Done");
                            }
                        }
                        LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Focus done, isLock = ");
                        sbLIZ2.append(z);
                        sbLIZ2.append(", afState = ");
                        sbLIZ2.append(num);
                        C2183341Ace.LIZLLL("TEVideoFocus", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (this.LIZLLL && num.intValue() != 4 && num.intValue() != 5) {
                        C2183341Ace.LIZIZ("TEVideoFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                        if (!this.LIZIZ.LLJILLL) {
                            ((AbstractC2254741DMy) this.LJI.LJ).LJJIJIIJI();
                        }
                    }
                    this.LIZJ = num.intValue();
                    C1DNY c1dny = this.LJI;
                    if (c1dny.LIZLLL) {
                        c1dny.LIZLLL = C2183321Acc.LJI(totalCaptureResult);
                        return;
                    }
                    return;
                }
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LJ("TEVideoFocus", "Not focus request!");
                LIZ();
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
                C2183341Ace.LIZIZ("TEVideoFocus", C2188811AlT.LIZIZ(sbLIZ));
                C1DJG c1djg = this.LJI.LIZIZ;
                if (c1djg != null) {
                    c1djg.LJIIJJI.LIZ(-411, this.LIZIZ.LLILZ, captureFailure.toString());
                }
                LIZIZ(cameraCaptureSession);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TEVideoFocus", "Focus onCaptureProgressed!");
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TEVideoFocus", "Focus onCaptureSequenceCompleted!");
                LIZ();
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TEVideoFocus", "Manual Focus capture buffer lost ");
                C1DJG c1djg = this.LJI.LIZIZ;
                if (c1djg != null) {
                    c1djg.LJIIJJI.LIZ(-411, c1djg.LIZ(), "Manual Focus capture buffer lost ");
                }
                LIZIZ(cameraCaptureSession);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZ("TEVideoFocus", "Focus onCaptureStarted!");
            }
        };
    }
}
