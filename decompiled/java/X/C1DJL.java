package X;

import Y.ARunnableS135S0100000_35;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.b0;

/* JADX INFO: renamed from: X.1DJL, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DJL implements InterfaceC2254691DMt {
    public final /* synthetic */ b0 LIZ;

    public C1DJL(b0 b0Var) {
        this.LIZ = b0Var;
    }

    @Override // X.InterfaceC2254691DMt
    public final void LIZ(Object obj, String str) {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "stopCapture success!");
        LJ(4, 0, str);
    }

    @Override // X.InterfaceC2254691DMt
    public final void LIZLLL(int i, String str) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStabilizationError ");
        sbLIZ.append(str);
        sbLIZ.append(" stabilization mode: ");
        sbLIZ.append(i);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2254691DMt
    public final void LJFF(Object obj, String str) {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "startCapture success!");
        b0 b0Var = this.LIZ;
        b0Var.mStartPreviewError = false;
        if (b0Var.mCameraSettings != null && b0Var.mCameraInstance != null) {
            b0 b0Var2 = this.LIZ;
            int iLJJJJ = b0Var2.mCameraSettings.LLJJLIIIJLLLLLLLZ - b0Var2.mCameraInstance.LJJJJ();
            b0 b0Var3 = this.LIZ;
            if (!b0Var3.mCameraSettings.LLLIILIL) {
                b0Var3.mCameraInstance.LJJZ();
                C2183341Ace.LIZLLL("TECameraServer", "collect camera capabilities when preview success.");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", Retry preview times = ");
            sbLIZ.append(iLJJJJ);
            LJ(0, iLJJJJ, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LJ(0, 0, str);
    }

    @Override // X.InterfaceC2254691DMt
    public final void LJIIIIZZ(int i, String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTorchSuccess ");
        sbLIZ.append(str);
        if (i == 0) {
            str2 = " close";
        } else {
            str2 = " open";
        }
        sbLIZ.append(str2);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2254691DMt
    public final void LJIIIZ(int i, String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTorchError ");
        sbLIZ.append(str);
        if (i == 0) {
            str2 = " close";
        } else {
            str2 = " open";
        }
        sbLIZ.append(str2);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2254691DMt
    public final void LJ(int i, int i2, String str) {
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCameraInfo: ");
        sbLIZ.append(i);
        sbLIZ.append(", ext: ");
        sbLIZ.append(i2);
        sbLIZ.append(" msg: ");
        sbLIZ.append(str);
        C2183341Ace.LIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 108) {
            this.LIZ.updateCameraState(4);
        } else if (i == 109) {
            this.LIZ.updateCameraState(0);
        }
        this.LIZ.mCameraObserver.onInfo(i, i2, str);
    }

    @Override // X.InterfaceC2254691DMt
    public final void LJII(int i, C1DJK c1djk, Object obj) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCameraClosed, cameraType=");
        sbLIZ.append(i);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        if (c1djk == this.LIZ.mCameraInstance) {
            synchronized (this.LIZ.mStateLock) {
                try {
                    this.LIZ.updateCameraState(0);
                } finally {
                }
            }
            this.LIZ.mCameraObserver.LJIILJJIL(0);
            if (this.LIZ.mbNeedDestroy) {
                synchronized (this) {
                    try {
                        if (this.LIZ.decreaseClientCount() == 0) {
                            C2183341Ace.LIZLLL("TECameraServer", "destroy in onCameraClosed callback");
                            this.LIZ.destroy();
                        }
                    } finally {
                    }
                }
                this.LIZ.mbNeedDestroy = false;
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onCameraClosed ignored, reason=camera_instance_mismatch, cameraType=");
        sbLIZ2.append(i);
        C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC2254691DMt
    public final void LIZJ(Object obj, int i, int i2, String str) {
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCameraError, cameraType=");
        sbLIZ.append(i);
        sbLIZ.append(", code=");
        sbLIZ.append(i2);
        sbLIZ.append(", msg=");
        sbLIZ.append(str);
        C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        C1DJP c1djp = this.LIZ.mCameraObserver;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Error occurs, camera type: ");
        sbLIZ2.append(i);
        sbLIZ2.append(" msg: ");
        sbLIZ2.append(str);
        c1djp.onError(i2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC2254691DMt
    public final void LJI(Object obj, int i, int i2, String str) {
        b0 b0Var = this.LIZ;
        if (b0Var.mCameraSettings.LLLLJ && i2 == -437) {
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPreviewError fallback requested, cameraType=");
            sbLIZ.append(i);
            sbLIZ.append(", ret=");
            sbLIZ.append(i2);
            sbLIZ.append(", error=");
            sbLIZ.append(str);
            sbLIZ.append(", settings=");
            b0 b0Var2 = this.LIZ;
            sbLIZ.append(b0Var2.cameraSettingsForLog(b0Var2.mCameraSettings));
            C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
            C1305710k5B.LIZ(i2, "te_record_camera_preview_ret");
            Handler handler = this.LIZ.mHandler;
            if (handler == null) {
                C2183341Ace.LIZIZ("TECameraServer", "onPreviewError fallback aborted, reason=handler_null");
                return;
            } else {
                C786410Ut5.LJJZZIII(handler, new ARunnableS135S0100000_35(this, 7));
                return;
            }
        }
        synchronized (b0Var.mStateLock) {
            try {
                if (this.LIZ.mCameraInstance != null && this.LIZ.mCameraInstance.LJJJJ() > 0) {
                    this.LIZ.mStartPreviewError = true;
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Retry to startPreview. ");
                    sbLIZ2.append(this.LIZ.mCameraInstance.LJJJJ());
                    sbLIZ2.append(" times is waiting to retry.");
                    C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZ.mCameraInstance.LJJLIIIJILLIZJL();
                    Handler handler2 = this.LIZ.mHandler;
                    if (handler2 == null) {
                    } else {
                        C786410Ut5.LJLIIL(100L, handler2, new ARunnableS135S0100000_35(this, 8));
                    }
                } else {
                    LIZJ(obj, i, i2, str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x048e  */
    @Override // X.InterfaceC2254691DMt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r13, int r14, X.C1DJK r15, java.lang.Object r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DJL.LIZIZ(int, int, X.1DJK, java.lang.Object, java.lang.String):void");
    }
}
