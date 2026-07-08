package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.Config;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11KB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11KB {
    public static <T, R> boolean LIZ(C098D<T> c098d, InterfaceC626120Oh8<? super R> interfaceC626120Oh8, InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> interfaceC1487280oo2) throws Throwable {
        if (c098d instanceof Callable) {
            try {
                Config config = (Object) ((Callable) c098d).call();
                if (config == null) {
                    C11JT.complete(interfaceC626120Oh8);
                    return true;
                }
                try {
                    C098D<? extends R> c098dApply = interfaceC1487280oo2.apply(config);
                    C1701890uOB.LIZ(c098dApply, "The mapper returned a null ObservableSource");
                    C098D<? extends R> c098d2 = c098dApply;
                    if (c098d2 instanceof Callable) {
                        try {
                            Object objCall = ((Callable) c098d2).call();
                            if (objCall == null) {
                                C11JT.complete(interfaceC626120Oh8);
                                return true;
                            }
                            C11K8 c11k8 = new C11K8(interfaceC626120Oh8, objCall);
                            interfaceC626120Oh8.onSubscribe(c11k8);
                            c11k8.run();
                            return true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C11SP.LIZ(th);
                            C11JT.error(th, interfaceC626120Oh8);
                            return true;
                        }
                    }
                    c098d2.LIZIZ(interfaceC626120Oh8);
                    return true;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C11SP.LIZ(th2);
                    C11JT.error(th2, interfaceC626120Oh8);
                    return true;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C11SP.LIZ(th3);
                C11JT.error(th3, interfaceC626120Oh8);
                return true;
            }
        }
        return false;
    }
}
