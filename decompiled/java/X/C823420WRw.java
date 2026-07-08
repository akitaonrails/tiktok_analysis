package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0WRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823420WRw {
    public static final C823420WRw LIZ = new C823420WRw();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void LIZ(String str, Function1 function1) {
        C0WS0 c0ws0 = C0WS0.LIZ;
        C823430WRx c823430WRx = new C823430WRx(str, function1);
        c0ws0.getClass();
        C0WS0.LJFF.add(c823430WRx);
    }

    public static final void LIZIZ(String str, C0WR6 c0wr6) {
        Object c098200Yq;
        if (LIZIZ.get()) {
            return;
        }
        C823230WRd c823230WRd = C823230WRd.LIZIZ;
        c823230WRd.getClass();
        try {
            c823230WRd.LIZ("HostApp", str, c0wr6, false);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }
}
