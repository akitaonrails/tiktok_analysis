package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0V2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791330V2l {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final List<AbstractC791320V2k> LIZJ = new LinkedList();

    public static void LIZ() {
        List<AbstractC791320V2k> list = LIZJ;
        if (list.isEmpty()) {
            return;
        }
        Iterator<AbstractC791320V2k> it2 = list.iterator();
        while (it2.hasNext()) {
            C791390V2r.LJJIII.LJIILLIIL(it2.next());
        }
        ((LinkedList) LIZJ).clear();
    }

    public static void LIZIZ(String str) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid operation : ");
            sbLIZ.append(str);
            Throwable th = new Throwable(C2188811AlT.LIZIZ(sbLIZ));
            th.setStackTrace(ThreadMethodProxy.getStackTrace(C786410Ut5.u3()));
            C0VY3.LIZLLL(th, "MainThreadMonitorBugfixLancet", "MainThreadMonitorBugfixLancet", "removeObserver", "");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
