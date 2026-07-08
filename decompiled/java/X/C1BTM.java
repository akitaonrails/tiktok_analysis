package X;

import android.content.Context;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BTM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTM {
    public static boolean LIZ = false;

    public static synchronized int LIZ(Context context) {
        C0W3J.LJIIIZ(context, "Context is null");
        if (LIZ) {
            return 0;
        }
        try {
            C1BTO c1btoLIZ = C829110Wfl.LIZ(context);
            try {
                InterfaceC2205031BRt interfaceC2205031BRtLJ = c1btoLIZ.LJ();
                C0W3J.LJIIIIZZ(interfaceC2205031BRtLJ);
                C2204991BRp.LIZ = interfaceC2205031BRtLJ;
                C1BTA c1btaLJIILJJIL = c1btoLIZ.LJIILJJIL();
                if (C1BT8.LIZ == null) {
                    C0W3J.LJIIIZ(c1btaLJIILJJIL, "delegate must not be null");
                    C1BT8.LIZ = c1btaLJIILJJIL;
                    LIZ = true;
                    try {
                        c1btoLIZ.LIZLLL();
                        c1btoLIZ.LLJZ(new C0WH6(context), 0);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    return 0;
                }
                LIZ = true;
                c1btoLIZ.LIZLLL();
                c1btoLIZ.LLJZ(new C0WH6(context), 0);
                return 0;
            } catch (RemoteException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new C829150Wfp(e2);
            }
        } catch (C812710VuP e3) {
            TryCatchGuardChecker.doCheck(e3);
            return e3.errorCode;
        }
    }
}
