package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0r8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576970r8h {
    public static final C1576970r8h LIZ = new C1576970r8h();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_S1Trigger");
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static volatile C11JF LIZLLL;

    public static void LIZ() {
        Object c098200Yq;
        if (LIZJ.compareAndSet(true, false)) {
            try {
                C11JF c11jf = LIZLLL;
                if (c11jf != null) {
                    c11jf.dispose();
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C19319410i8 c19319410i8 = LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[S1] dispose backgroundDisposable failed ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            LIZLLL = null;
            LIZIZ.LJIIJJI(AFwS213S0000000_24.get$arr$(459));
        }
    }
}
