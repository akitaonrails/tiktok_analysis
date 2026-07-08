package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11S5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11S5 {
    public static final C11RO LIZ = C19489211Ms.LIZ(new Callable<C11RO>() { // from class: X.11S8
        @Override // java.util.concurrent.Callable
        public final C11RO call() {
            return C11SG.LIZ;
        }
    });
    public static final C11RO LIZIZ = C19489211Ms.LIZ(new Callable<C11RO>() { // from class: X.11S6
        @Override // java.util.concurrent.Callable
        public final C11RO call() {
            return C11S4.LIZ;
        }
    });
    public static final C11RO LIZJ = C19489211Ms.LIZ(new Callable<C11RO>() { // from class: X.11S9
        @Override // java.util.concurrent.Callable
        public final C11RO call() {
            return C11SE.LIZ;
        }
    });
    public static final C1701840uO6 LIZLLL = C1701840uO6.LIZIZ;
    public static final C11RO LJ = C19489211Ms.LIZ(new Callable<C11RO>() { // from class: X.11S7
        @Override // java.util.concurrent.Callable
        public final C11RO call() {
            return C11SF.LIZ;
        }
    });

    public static C11RO LIZ() {
        C11RO c11ro = LIZJ;
        InterfaceC1487280oo2<? super C11RO, ? extends C11RO> interfaceC1487280oo2 = C19489211Ms.LIZIZ;
        if (interfaceC1487280oo2 == null) {
            return c11ro;
        }
        try {
            return interfaceC1487280oo2.apply(c11ro);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw C11QG.LIZIZ(th);
        }
    }
}
