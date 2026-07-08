package X;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0V4D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4D {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(11));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(10));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(12));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(48));

    public static boolean LIZ(ExecutorService executorService) {
        if (!executorService.isShutdown() && !executorService.isTerminated()) {
            return false;
        }
        return true;
    }
}
