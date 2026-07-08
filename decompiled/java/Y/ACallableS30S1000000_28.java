package Y;

import X.C0WR3;
import X.C10Z0;
import X.C1C7U;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes29.dex */
public class ACallableS30S1000000_28 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS30S1000000_28 aCallableS30S1000000_28) {
        String strLIZIZ;
        C1C7U.LIZ("QRCodeScanPresenter@e78f.onScanSuccess$2");
        if (C0WR3.LIZ(aCallableS30S1000000_28.s0)) {
            strLIZIZ = C10Z0.LIZIZ(aCallableS30S1000000_28.s0);
        } else {
            strLIZIZ = aCallableS30S1000000_28.s0;
        }
        C1C7U.LIZIZ("QRCodeScanPresenter@e78f.onScanSuccess$2");
        return strLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[PHI: r7
      0x005c: PHI (r7v2 int) = (r7v1 int), (r7v0 int), (r7v4 int) binds: [B:14:0x0059, B:4:0x0019, B:6:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS30S1000000_28 r11) {
        /*
            java.lang.String r10 = "PNSDeviceConsentDataManager@ba5c.fetchConsentConfig$1"
            X.C1C7U.LIZ(r10)
            X.0zrj r0 = X.C1912410zrj.LIZ
            java.lang.String r1 = r11.s0
            r0.getClass()
            long r8 = android.os.SystemClock.elapsedRealtime()
            r7 = -1
            X.01GW r0 = X.C1912420zrk.LIZ     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L58
            com.ss.android.ugc.aweme.compliance.api.services.consent.ConsentConfigApi r0 = (com.ss.android.ugc.aweme.compliance.api.services.consent.ConsentConfigApi) r0     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L5c
            X.0X9S r0 = r0.fetchConsentConfig(r1)     // Catch: java.lang.Throwable -> L58
            X.0X52 r1 = r0.execute()     // Catch: java.lang.Throwable -> L58
            X.08fh r0 = r1.LIZ     // Catch: java.lang.Throwable -> L58
            int r7 = r0.LIZIZ     // Catch: java.lang.Throwable -> L58
            T r1 = r1.LIZIZ     // Catch: java.lang.Throwable -> L58
            com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentConfigResponse r1 = (com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentConfigResponse) r1     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5c
            java.lang.Integer r0 = r1.statusCode     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L33
            java.lang.Integer r0 = r1.errorCode     // Catch: java.lang.Throwable -> L58
        L33:
            if (r0 == 0) goto L39
            int r7 = r0.intValue()     // Catch: java.lang.Throwable -> L58
        L39:
            X.C1912410zrj.LIZJ = r1     // Catch: java.lang.Throwable -> L58
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: java.lang.Throwable -> L58
            com.google.gson.Gson r0 = r0.getGson()     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = r0.LJIILL(r1)     // Catch: java.lang.Throwable -> L58
            X.01GW r0 = X.C1912430zrl.LIZ     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L58
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "response_json"
            r1.storeString(r0, r2)     // Catch: java.lang.Throwable -> L58
            r6 = 1
            X.C1912410zrj.LIZLLL = r6     // Catch: java.lang.Throwable -> L58
            goto L5d
        L58:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5c:
            r6 = 0
        L5d:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r8
            X.052C r0 = X.C052C.LIZ
            r0.getClass()
            r1 = r6 ^ 1
            java.lang.String r3 = "pns_device_consent_config_fetch"
            X.09Gk r2 = new X.09Gk     // Catch: java.lang.Throwable -> L93
            r2.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "duration_ms"
            r2.LIZLLL(r4, r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "status"
            r2.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "status_code"
            r2.LIZJ(r7, r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "is_first_launch"
            int r0 = X.C052C.LIZ()     // Catch: java.lang.Throwable -> L93
            r2.LIZJ(r0, r1)     // Catch: java.lang.Throwable -> L93
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.LIZ     // Catch: java.lang.Throwable -> L93
            X.C20684815ws.LJIILLIIL(r3, r0)     // Catch: java.lang.Throwable -> L93
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L93
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L93
            goto L9f
        L93:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L9f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS30S1000000_28.call$1(Y.ACallableS30S1000000_28):java.lang.Object");
    }

    public ACallableS30S1000000_28(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
