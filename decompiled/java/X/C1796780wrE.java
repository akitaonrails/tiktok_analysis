package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wrE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796780wrE {
    public static final AtomicReference<String> LIZ = new AtomicReference<>(null);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static C818740W9w LJFF;

    public static void LIZ(String str, C1796760wrC c1796760wrC, Function1 function1) {
        AbstractC1795460wp6 abstractC1795460wp6;
        Object c098200Yq;
        if (!LJ.compareAndSet(false, true)) {
            return;
        }
        if (c1796760wrC != null) {
            C404501hj.LIZ.removeCallbacks(c1796760wrC.LIZJ);
        }
        if (str != null) {
            LIZ.set(str);
            LIZIZ.set(false);
            C818740W9w c818740W9w = LJFF;
            if (c818740W9w != null) {
                c818740W9w.LIZ("gp_region", str);
            }
        }
        LIZJ.set(true);
        LIZLLL.set(false);
        if (c1796760wrC != null && (abstractC1795460wp6 = c1796760wrC.LIZ) != null) {
            try {
                abstractC1795460wp6.LIZLLL();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            C189200o6.m1boximpl(c098200Yq);
        }
        String str2 = LIZ.get();
        if (c1796760wrC != null) {
            Function1<? super String, Unit> function12 = c1796760wrC.LIZIZ;
            if (function12 != null) {
                function12.invoke(str2);
            }
            c1796760wrC.LIZIZ = null;
        }
        if (function1 != null) {
            function1.invoke(str2);
        }
    }
}
