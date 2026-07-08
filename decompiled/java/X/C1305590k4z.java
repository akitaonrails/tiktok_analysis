package X;

import android.hardware.Camera;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0k4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305590k4z {
    public static void LIZ(final Camera camera, Cert cert) {
        if (cert == null || C825920Wac.LIZ(cert) == null || C825920Wac.LIZ(cert).intValue() <= 0) {
            cert = CertProviderManagerKt.findCert("bpea-ve_close", 1476788484);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check privacy, Camera close cert: ");
        sbLIZ.append(cert);
        C2183341Ace.LIZLLL("TECamera1PolicyAdapter", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C1305550k4v.LIZ(cert, new InterfaceC1305530k4t<Object>() { // from class: X.0k4x
                @Override // X.InterfaceC1305530k4t
                public final Object invoke() throws Throwable {
                    C2204961BRm.LJJJLL(camera, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoJ7hfzUvnLVbiTjP2cKR", null));
                    return null;
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZJ("TECamera1PolicyAdapter", "Exception occur:", e);
        }
    }

    public static Camera LIZIZ(final int i, Cert cert) {
        if (cert == null || C825920Wac.LIZ(cert) == null || C825920Wac.LIZ(cert).intValue() <= 0) {
            cert = CertProviderManagerKt.findCert("bpea-ve_open", 1476788496);
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check privacy, Camera open cert: ");
        sbLIZ.append(cert);
        C2183341Ace.LIZLLL("TECamera1PolicyAdapter", C2188811AlT.LIZIZ(sbLIZ));
        try {
            return (Camera) C1305550k4v.LIZIZ(cert, new InterfaceC1305530k4t<Camera>() { // from class: X.0k4y
                @Override // X.InterfaceC1305530k4t
                public final Camera invoke() {
                    int i3 = i;
                    return i3 >= 0 ? C2204961BRm.LJJJJZI(i3, new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoJ7hfzUvnLVbiTjP2cKR", null)) : C2204961BRm.LJJJLIIL(new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoJ7hfzUvnLVbiTjP2cKR", null));
                }
            });
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZJ("TECamera1PolicyAdapter", "Exception occur:", e);
            return null;
        }
    }
}
