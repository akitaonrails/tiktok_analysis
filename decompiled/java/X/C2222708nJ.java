package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.08nJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2222708nJ {
    static {
        new ReentrantReadWriteLock();
    }

    public static String[] LIZ(InterfaceC2423009eW interfaceC2423009eW) throws ClosedByInterruptException {
        if (interfaceC2423009eW instanceof C2222808nK) {
            C2222808nK c2222808nK = (C2222808nK) interfaceC2423009eW;
            int i = 0;
            while (true) {
                try {
                    return C2422809eU.LIZ(c2222808nK);
                } catch (ClosedByInterruptException e) {
                    TryCatchGuardChecker.doCheck(e);
                    i++;
                    if (i <= 4) {
                        Thread.interrupted();
                        c2222808nK.getClass();
                        C0VSP c0vsp = new C0VSP(c2222808nK.LL);
                        c2222808nK.LLILLJJLI = c0vsp;
                        c2222808nK.LLILLL = c0vsp.getChannel();
                    } else {
                        throw e;
                    }
                }
            }
        } else {
            return C2422809eU.LIZ(interfaceC2423009eW);
        }
    }
}
