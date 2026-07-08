package X;

import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.network.HttpRequest;

/* JADX INFO: renamed from: X.0kwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338940kwm {
    public static InterfaceC1338950kwn LIZ;
    public static InterfaceC1338860kwe LIZIZ = new InterfaceC1338860kwe() { // from class: X.0kwl
        @Override // X.InterfaceC1338860kwe
        public final void LIZ() {
        }

        @Override // X.InterfaceC1338860kwe
        public final void LIZIZ(HttpRequest httpRequest) {
        }

        @Override // X.InterfaceC1338860kwe
        public final void LIZJ() {
        }
    };

    public static void LIZ(C1515420pXQ c1515420pXQ) {
        LIZ = c1515420pXQ;
    }

    public static void LIZIZ(C1504310pFV c1504310pFV) {
        if (!(LIZIZ instanceof C1338930kwl)) {
            LynxLog.e("LynxNetConfig", "LynxHttpService interceptor already set, setHttpInterceptor ignored");
        } else {
            LIZIZ = c1504310pFV;
        }
    }
}
