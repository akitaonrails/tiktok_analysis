package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VP5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VP5<V> implements Callable {
    public static final C0VP5<V> LL = new C0VP5<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("CookieHelper@956d.flushCookie$1");
        try {
            C786410Ut5.A2().flush();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CookieHelper@956d.flushCookie$1");
        return unit;
    }
}
