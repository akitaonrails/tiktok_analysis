package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.Config;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11NQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11NQ {
    public static <T, R> boolean LIZ(C11LE<T> c11le, C11M9<? super R> c11m9, InterfaceC1487280oo2<? super T, ? extends C11LE<? extends R>> interfaceC1487280oo2) throws Throwable {
        if (c11le instanceof Callable) {
            try {
                Config config = (Object) ((Callable) c11le).call();
                if (config == null) {
                    C11NS.complete(c11m9);
                    return true;
                }
                try {
                    C11LE<? extends R> c11leApply = interfaceC1487280oo2.apply(config);
                    C1701890uOB.LIZ(c11leApply, "The mapper returned a null Publisher");
                    C11LE<? extends R> c11le2 = c11leApply;
                    if (c11le2 instanceof Callable) {
                        try {
                            Object objCall = ((Callable) c11le2).call();
                            if (objCall == null) {
                                C11NS.complete(c11m9);
                                return true;
                            }
                            c11m9.onSubscribe(new C11NR(c11m9, objCall));
                            return true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C11SP.LIZ(th);
                            C11NS.error(th, c11m9);
                            return true;
                        }
                    }
                    c11le2.subscribe(c11m9);
                    return true;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C11SP.LIZ(th2);
                    C11NS.error(th2, c11m9);
                    return true;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C11SP.LIZ(th3);
                C11NS.error(th3, c11m9);
                return true;
            }
        }
        return false;
    }
}
