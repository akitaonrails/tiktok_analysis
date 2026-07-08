package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1339120kx4 implements InterfaceC1334000koo {
    public InterfaceC2222831BzF LIZIZ;
    public InterfaceC1339010kwt LIZJ;
    public final Executor LIZ = new ExecutorC1490620otQ();
    public final C0W1Y LIZLLL = new C0W1Y();

    public static String LIZJ(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String[] strArrSplit = th.getMessage().split("\\|");
            if (strArrSplit != null && strArrSplit.length >= 2) {
                Logger.debug();
                return strArrSplit[0];
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return "";
    }
}
