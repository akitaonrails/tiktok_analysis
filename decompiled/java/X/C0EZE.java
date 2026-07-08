package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEAudioRecorder;
import com.ss.android.vesdk.VEException;

/* JADX INFO: renamed from: X.0EZE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZE {
    public boolean LIZ;
    public boolean LIZIZ;
    public final VEAudioRecorder LIZJ = new VEAudioRecorder();

    public final String LIZ() {
        String wavFilePath = "";
        try {
            wavFilePath = this.LIZJ.getWavFilePath();
            return wavFilePath;
        } catch (VEException e) {
            TryCatchGuardChecker.doCheck(e);
            return wavFilePath;
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return wavFilePath;
        }
    }

    public final long LIZLLL(Cert cert) {
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZJ();
        this.LIZ = false;
        if (cert == null) {
            return this.LIZJ.stopRecord();
        }
        return this.LIZJ.stopRecord(cert);
    }

    public static void LIZIZ(C0EZE c0eze, String str, int i) {
        c0eze.LIZJ.init(str, new VEAudioEncodeSettings.Builder().Build(), i);
    }

    public final int LIZJ(int i, int i2, Cert cert) {
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZIZ();
        this.LIZ = true;
        if (cert == null) {
            return this.LIZJ.startRecord(1.0f, i, i2);
        }
        return this.LIZJ.startRecord(1.0f, i, i2, cert);
    }
}
