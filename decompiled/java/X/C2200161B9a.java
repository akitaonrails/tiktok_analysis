package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200161B9a {
    public static C19885612rG LIZ(Bundle bundle, int i, C1BBD c1bbd, int i2) {
        if (bundle.containsKey("BILLING_RESULT")) {
            try {
                byte[] byteArray = bundle.getByteArray("BILLING_RESULT");
                if (byteArray != null) {
                    C19918312wX c19918312wXLJIJJLI = C19918312wX.LJIJJLI(byteArray);
                    C19889112rp c19889112rp = new C19889112rp();
                    c19889112rp.LIZ = c19918312wXLJIJJLI.zze;
                    c19889112rp.LIZJ = c19918312wXLJIJJLI.zzf;
                    C19885612rG c19885612rGLIZ = c19889112rp.LIZ();
                    if (c19885612rGLIZ.LIZ != 0) {
                        C1B9Z.LIZ(C1BAX.BILLING_RESULT_RECEIVED_FROM_PHONESKY, c19885612rGLIZ, c1bbd, i, i2);
                        return c19885612rGLIZ;
                    }
                    if (!bundle.containsKey("RESPONSE_DATA")) {
                        C1BAX c1bax = C1BAX.MISSING_RESPONSE_DATA_IN_DELEGATE_TO_BACKEND_RESPONSE;
                        C19885612rG c19885612rG = C2200541BAm.LJII;
                        C1B9Z.LIZ(c1bax, c19885612rG, c1bbd, i, i2);
                        return c19885612rG;
                    }
                    return c19885612rGLIZ;
                }
                throw new Exception("Billing result is null");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1BAX c1bax2 = C1BAX.ERROR_DECODING_DELEGATE_TO_BACKEND_BILLING_RESULT;
                C19885612rG c19885612rG2 = C2200541BAm.LJII;
                ((C2200551BAn) c1bbd).LIZIZ(C2200521BAk.LIZIZ(c1bax2, i, c19885612rG2, C2200521BAk.LIZ(e), EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED), i2);
                return c19885612rG2;
            }
        }
        C1BAX c1bax3 = C1BAX.MISSING_BILLING_RESULT_IN_DELEGATE_TO_BACKEND_RESPONSE;
        C19885612rG c19885612rG3 = C2200541BAm.LJII;
        C1B9Z.LIZ(c1bax3, c19885612rG3, c1bbd, i, i2);
        return c19885612rG3;
    }
}
