package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentConfigResponse;

/* JADX INFO: renamed from: X.0zrj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912410zrj {
    public static final C1912410zrj LIZ = new C1912410zrj();
    public static final Object LIZIZ = new Object();
    public static volatile ConsentConfigResponse LIZJ;
    public static volatile boolean LIZLLL;

    public static ConsentConfigResponse LIZ() {
        ConsentConfigResponse consentConfigResponse;
        ConsentConfigResponse consentConfigResponse2 = LIZJ;
        if (consentConfigResponse2 != null || LIZLLL) {
            return consentConfigResponse2;
        }
        synchronized (LIZIZ) {
            try {
                if (LIZLLL) {
                    return LIZJ;
                }
                LIZ.getClass();
                String string = ((Keva) C1912430zrl.LIZ.getValue()).getString("response_json", "");
                if (string == null || string.length() == 0) {
                    consentConfigResponse = null;
                } else {
                    try {
                        consentConfigResponse = (ConsentConfigResponse) C7740030o.LIZ().getGson().LJII(string, ConsentConfigResponse.class);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        consentConfigResponse = null;
                    }
                }
                LIZJ = consentConfigResponse;
                LIZLLL = true;
                return LIZJ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
