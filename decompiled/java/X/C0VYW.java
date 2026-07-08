package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0VYW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYW {
    public static final C0VYW LIZ = new C0VYW();
    public static final ConcurrentHashMap<String, List<String>> LIZIZ;

    static {
        C13LE.LIZ(C0VYW.class).LJI();
        LIZIZ = new ConcurrentHashMap<>();
    }

    public static void LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (List) LIZIZ.remove(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C0VZK.LIZ(thM5exceptionOrNullimpl, "fragment_recorder_removeFragmentRecords_error", C2097608Jq.LJIIJ(new Pair("activityName", str)));
        }
    }
}
