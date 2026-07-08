package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.0913, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0913 {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final ConcurrentLinkedQueue<String> LIZLLL;
    public static final Set<String> LJ;
    public static final Semaphore LJFF;
    public static final ConcurrentHashMap<String, C13M7<String>> LJI;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1447));
        LIZ = c01gwLIZIZ;
        LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1448));
        LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1449));
        LIZLLL = new ConcurrentLinkedQueue<>();
        LJ = new LinkedHashSet();
        LJFF = new Semaphore(((Number) c01gwLIZIZ.getValue()).intValue());
        LJI = new ConcurrentHashMap<>();
    }

    public static void LIZIZ() {
        try {
            if (LJFF.availablePermits() <= 0) {
                return;
            }
            String strPoll = LIZLLL.poll();
            if (strPoll != null) {
                C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new AnonymousClass0910(strPoll, null), 3).LJII(AFwS231S0000000_3.get$arr$(223));
                return;
            }
            ICreationAsyncTaskManager iCreationAsyncTaskManager = (ICreationAsyncTaskManager) LIZJ.getValue();
            if (iCreationAsyncTaskManager != null) {
                iCreationAsyncTaskManager.LJI("GlobalAsyncTaskHandler", AFwS189S0000000_3.get$arr$(377), false);
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(String str) {
        C13M7<String> c13m7 = LJI.get(str);
        if (c13m7 != null) {
            c13m7.clear();
        }
    }

    public static void LIZ(String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        ConcurrentHashMap<String, C13M7<String>> concurrentHashMap = LJI;
        if (concurrentHashMap.get(str) == null) {
            concurrentHashMap.put(str, new C13M7<>());
        }
        C13M7<String> c13m7 = concurrentHashMap.get(str);
        if (c13m7 != null) {
            c13m7.addAll(list);
        }
    }
}
