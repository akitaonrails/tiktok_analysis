package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NWL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NWL {
    public static volatile boolean LIZLLL;
    public static volatile boolean LJFF;
    public static volatile long LJI;
    public static final C0NWL LIZ = new C0NWL();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final AtomicInteger LIZJ = new AtomicInteger(0);
    public static volatile float LJ = -1.0f;

    public static IPlayerManagerService LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IPlayerManagerService.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (IPlayerManagerService) c098200Yq;
    }

    public static void LIZIZ() {
        LIZJ.incrementAndGet();
        LIZJ(AFwS195S0000000_9.get$arr$(548));
    }

    public static void LIZJ(Function0 function0) {
        Object c098200Yq;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            try {
                function0.invoke();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C786410Ut5.LJJZZIII(LIZIZ, new ARunnableS103S0100000_3(function0, 126));
    }
}
