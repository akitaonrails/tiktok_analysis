package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0oo5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1487310oo5 implements InterfaceC1487320oo6 {
    @Override // X.InterfaceC1487320oo6
    public final List<InetAddress> LIZ(String str) throws UnknownHostException {
        if (str != null) {
            try {
                return Arrays.asList(C2204961BRm.c0(str, new C0WZX("ezR2SBYqDIT4W0Q=", null)));
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e);
                throw unknownHostException;
            } catch (SecurityException e2) {
                TryCatchGuardChecker.doCheck(e2);
                UnknownHostException unknownHostException2 = new UnknownHostException("Permission denied for dns lookup of ".concat(str));
                unknownHostException2.initCause(e2);
                throw unknownHostException2;
            }
        }
        throw new UnknownHostException("hostname == null");
    }
}
