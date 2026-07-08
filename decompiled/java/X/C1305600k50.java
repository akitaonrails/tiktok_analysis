package X;

import android.media.AudioRecord;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0k50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305600k50 {
    public static void LIZ(final AudioRecord audioRecord, Cert cert) {
        if (cert == null || C825920Wac.LIZ(cert) == null || C825920Wac.LIZ(cert).intValue() <= 0) {
            cert = CertProviderManagerKt.findCert("bpea-ve_open", 1476788496);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check privacy, Audio start cert: ");
        sbLIZ.append(cert);
        C2484209oO.LJI("TEAudioPolicyAdapter", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C1305520k4s.LIZIZ(cert, new InterfaceC1305530k4t<Object>() { // from class: X.0k51
                @Override // X.InterfaceC1305530k4t
                public final Object invoke() throws Throwable {
                    C2204961BRm.LJLIIIL(audioRecord, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWmzvblv8cW3TJrgm/Vk6+wi5e5BE=", null));
                    return null;
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZIZ(C1305600k50.class, "Exception occur:", e);
        }
    }

    public static void LIZIZ(final AudioRecord audioRecord, Cert cert) {
        if (cert == null || C825920Wac.LIZ(cert) == null || C825920Wac.LIZ(cert).intValue() <= 0) {
            cert = CertProviderManagerKt.findCert("bpea-ve_close", 1476788484);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check privacy, Audio stop cert: ");
        sbLIZ.append(cert);
        C2484209oO.LJI("TEAudioPolicyAdapter", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C1305520k4s.LIZJ(cert, new InterfaceC1305530k4t<Object>() { // from class: X.0k52
                @Override // X.InterfaceC1305530k4t
                public final Object invoke() throws Throwable {
                    C2204961BRm.LJLIIL(audioRecord, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWmzvblv8cW3TJrgm/Vk6+wi5e5BE=", null));
                    return null;
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZIZ(C1305600k50.class, "Exception occur:", e);
        }
    }
}
