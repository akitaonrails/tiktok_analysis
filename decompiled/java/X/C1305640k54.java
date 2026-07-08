package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0k54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305640k54 {
    public static void LIZ(final CameraDevice cameraDevice, Cert cert) {
        if (cert == null || C825920Wac.LIZ(cert) == null || C825920Wac.LIZ(cert).intValue() <= 0) {
            cert = CertProviderManagerKt.findCert("bpea-ve_close", 1476788484);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check privacy, Camera close, cameraDevice:");
        sbLIZ.append(cameraDevice);
        sbLIZ.append(" cert: ");
        sbLIZ.append(cert);
        C2183341Ace.LIZLLL("TECamera2PolicyAdapter", C2188811AlT.LIZIZ(sbLIZ));
        C1321640kUs.LIZ("TECamera2PolicyAdapter-closeCamera");
        try {
            C1305550k4v.LIZ(cert, new InterfaceC1305530k4t<Object>() { // from class: X.0k56
                @Override // X.InterfaceC1305530k4t
                public final Object invoke() throws Throwable {
                    C2204961BRm.LJJLIIIJLLLLLLLZ(cameraDevice, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoJ3hfzUvnLVbiTjP2cKR", null));
                    return null;
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZJ("TECamera2PolicyAdapter", "Exception occur:", e);
        }
        C1321640kUs.LIZIZ();
    }

    public static void LIZIZ(final C1DN2 c1dn2, final CameraManager cameraManager, final Handler handler, Cert cert, final String str) {
        if (cert == null || C825920Wac.LIZ(cert) == null || C825920Wac.LIZ(cert).intValue() <= 0) {
            cert = CertProviderManagerKt.findCert("bpea-ve_open", 1476788496);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check privacy, Camera open cert: ");
        sbLIZ.append(cert);
        C2183341Ace.LIZLLL("TECamera2PolicyAdapter", C2188811AlT.LIZIZ(sbLIZ));
        C1321640kUs.LIZ("TECamera2PolicyAdapter-openCamera");
        try {
            C1305550k4v.LIZIZ(cert, new InterfaceC1305530k4t<Object>() { // from class: X.0k55
                @Override // X.InterfaceC1305530k4t
                public final Object invoke() throws Throwable {
                    C2204961BRm.LJJLIIJ(cameraManager, str, c1dn2, handler, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoJ3hfzUvnLVbiTjP2cKR", null));
                    return null;
                }
            });
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZJ("TECamera2PolicyAdapter", "Exception occur:", e);
        }
        C1321640kUs.LIZIZ();
    }
}
