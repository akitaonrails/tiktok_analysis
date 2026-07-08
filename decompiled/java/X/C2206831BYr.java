package X;

import com.ss.android.common.applog.AppLog;

/* JADX INFO: renamed from: X.1BYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206831BYr {
    public static final C11PQ<EnumC818600W9i> LIZ = new C11PQ<>();
    public static final C818640W9m LIZIZ = new InterfaceC2211121BgM() { // from class: X.0W9m
        @Override // X.InterfaceC2211121BgM
        public final void LIZ() {
            C827070WcT.LIZ.getClass();
            C827070WcT.LIZ();
            C2206831BYr.LIZ.onNext(EnumC818600W9i.Local);
        }

        @Override // X.InterfaceC2211121BgM
        public final void LIZIZ() {
            C827070WcT.LIZ.getClass();
            C827070WcT.LIZ();
            C2206831BYr.LIZ.onNext(EnumC818600W9i.Remote);
        }
    };

    public static void LIZ(final C1BFI c1bfi, InterfaceC2206851BYt interfaceC2206851BYt) {
        if (interfaceC2206851BYt != null) {
            interfaceC2206851BYt.LIZ();
        }
        C827040WcQ.LIZ.getClass();
        AppLog.addSessionHook(C827040WcQ.LIZLLL);
        AppLog.addAppCount();
        c1bfi.LIZIZ();
        AppLog.setUseGoogleAdId(true);
        AppLog.setLogEncryptConfig(new InterfaceC2206951BZd() { // from class: X.1BYs
            @Override // X.InterfaceC2206951BZd
            public final boolean LIZ() {
                C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
                if (c2213981Bky.isDebug()) {
                    return false;
                }
                if ((c2213981Bky.isOffline() || c2213981Bky.isRegressionTest()) && !C2211941Bhg.LIZ.LIZ()) {
                    return false;
                }
                return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_applog_content_encrypt", true, false);
            }

            @Override // X.InterfaceC2206951BZd
            public final boolean LIZIZ() {
                return c1bfi.LIZ();
            }
        });
    }
}
