package X;

import android.util.Log;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0p4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1497580p4e extends AbstractC1497570p4d {
    public final /* synthetic */ C1498150p5Z LIZ;

    public C1497580p4e(C1498150p5Z c1498150p5Z) {
        this.LIZ = c1498150p5Z;
    }

    @Override // X.AbstractC1497570p4d
    public final void LIZ(final InterfaceC1497610p4h interfaceC1497610p4h, Throwable th, C0XLY c0xly) {
        final String str;
        final int i;
        Request requestLJIIIIZZ;
        C0XLQ c0xlqUrl;
        this.LIZ.getClass();
        final String message = "";
        if (interfaceC1497610p4h == null || (requestLJIIIIZZ = ((C1497410p4N) interfaceC1497610p4h).LJIIIIZZ()) == null || (c0xlqUrl = requestLJIIIIZZ.url()) == null) {
            str = "";
        } else {
            str = c0xlqUrl.LJIIIIZZ;
        }
        this.LIZ.getClass();
        if (c0xly != null) {
            try {
                i = CastIntegerProtector.parseInt(c0xly.LIZ("Handshake-Status", null));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                i = -1;
            }
        } else {
            i = -1;
        }
        this.LIZ.getClass();
        if (i == 0) {
            message = "success";
        } else if (i == 404) {
            message = "uri not found";
        } else if (i == 409) {
            message = "fpid not registered";
        } else if (i == 410) {
            message = "invalid device id";
        } else if (i == 411) {
            message = "appid not registered";
        } else if (i == 412) {
            message = "websocket protocol not support";
        } else if (i == 413) {
            message = "the device already connected";
        } else if (i == 414) {
            message = "server can't accept more connection,try again later";
        } else if (i == 415) {
            message = "device was blocked";
        } else if (i == 416) {
            message = "parameter error";
        } else if (i == 417) {
            message = "authentication failed";
        } else if (i == 510) {
            message = "server internal error";
        } else if (i == 511) {
            message = "server is busy，try again later";
        } else if (i == 512) {
            message = "server is shutting down";
        } else if (i == 513) {
            message = "auth server is error";
        } else if (i == 514) {
            message = "auth return error";
        }
        if (C2093608Ic.LJ(message)) {
            if (C2093608Ic.LJ(th.getMessage())) {
                message = Log.getStackTraceString(th);
            } else {
                message = th.getMessage();
            }
        }
        final Pair<String, Long> pairLIZIZ = this.LIZ.LLILLL.LIZIZ(c0xly);
        this.LIZ.getClass();
        if (c0xly != null) {
            try {
                c0xly.close();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        this.LIZ.LJII(new Runnable() { // from class: X.0p5Y
            public final void LIZ() {
                C1498150p5Z c1498150p5Z = this.LLILZLL.LIZ;
                C0WKP c0wkp = c1498150p5Z.LLJIJIL;
                if (c0wkp != null) {
                    String str2 = str;
                    int i2 = i;
                    c0wkp.LIZ(str2, c1498150p5Z.LLJJI, message, i2);
                }
                C1498150p5Z c1498150p5Z2 = this.LLILZLL.LIZ;
                if (c1498150p5Z2.LLJILJILJ) {
                    c1498150p5Z2.LLJILJILJ = false;
                    c1498150p5Z2.LJIIL(c1498150p5Z2.LLILLL.LIZJ());
                    return;
                }
                if (c1498150p5Z2.LLJILJIL != interfaceC1497610p4h) {
                    return;
                }
                int i3 = i;
                if (i3 <= 0 || i3 == 414 || i3 == 511 || i3 == 512 || i3 == 513) {
                    ((C1498160p5a) c1498150p5Z2.LLJILLL).LIZIZ();
                    this.LLILZLL.LIZ.LJIILIIL(((Long) pairLIZIZ.second).longValue(), (String) pairLIZIZ.first, false);
                    return;
                }
                c1498150p5Z2.LJIIJ(2);
                C1471740oOy c1471740oOy = this.LLILZLL.LIZ.LLILLL;
                if (c1471740oOy != null) {
                    c1471740oOy.LIZLLL();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("WsOkClient$WsListener@cf21.onFailure$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("WsOkClient$WsListener@cf21.onFailure$1");
            }
        });
    }
}
