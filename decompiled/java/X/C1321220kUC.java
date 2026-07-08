package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kUC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1321220kUC<T> extends AbstractC1321260kUG<T> {
    public InterfaceC1320200kSY<T> LJII;

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZIZ() {
        /*
            r1 = this;
            monitor-enter(r1)
            X.0kSY<T> r0 = r1.LJII     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Ld
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            monitor-exit(r1)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1321220kUC.LIZIZ():boolean");
    }

    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
    public final boolean close() {
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                InterfaceC1320200kSY<T> interfaceC1320200kSY = this.LJII;
                this.LJII = null;
                LJIILL(interfaceC1320200kSY);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
    public final synchronized T getResult() {
        InterfaceC1320200kSY<T> interfaceC1320200kSY;
        interfaceC1320200kSY = this.LJII;
        return interfaceC1320200kSY != null ? interfaceC1320200kSY.getResult() : null;
    }

    public static <T> void LJIILL(InterfaceC1320200kSY<T> interfaceC1320200kSY) {
        if (interfaceC1320200kSY != null) {
            interfaceC1320200kSY.close();
        }
    }

    public final void LJIILLIIL(InterfaceC1320070kSL<InterfaceC1320200kSY<T>> interfaceC1320070kSL) {
        InterfaceC1320200kSY<T> interfaceC1320200kSY;
        if (LJIIIIZZ()) {
            return;
        }
        if (interfaceC1320070kSL != null) {
            interfaceC1320200kSY = interfaceC1320070kSL.get();
        } else {
            interfaceC1320200kSY = null;
        }
        synchronized (this) {
            try {
                if (LJIIIIZZ()) {
                    LJIILL(interfaceC1320200kSY);
                    return;
                }
                InterfaceC1320200kSY<T> interfaceC1320200kSY2 = this.LJII;
                this.LJII = interfaceC1320200kSY;
                if (interfaceC1320200kSY != null) {
                    interfaceC1320200kSY.LIZJ(new InterfaceC589510NAf<T>() { // from class: X.0kUB
                        @Override // X.InterfaceC589510NAf
                        public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                        }

                        @Override // X.InterfaceC589510NAf
                        public final void LIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY3) throws Throwable {
                            if (interfaceC1320200kSY3.LIZIZ()) {
                                C1321220kUC c1321220kUC = this.LIZ;
                                if (interfaceC1320200kSY3 == c1321220kUC.LJII) {
                                    c1321220kUC.LJIILIIL(null, false);
                                    return;
                                }
                                return;
                            }
                            if (!interfaceC1320200kSY3.LIZ()) {
                                return;
                            }
                            this.LIZ.getClass();
                        }

                        @Override // X.InterfaceC589510NAf
                        public final void LIZIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY3) {
                            this.LIZ.getClass();
                        }

                        @Override // X.InterfaceC589510NAf
                        public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
                            C1321220kUC c1321220kUC = this.LIZ;
                            if (abstractC1321260kUG == c1321220kUC.LJII) {
                                c1321220kUC.LJIIL(abstractC1321260kUG.getProgress());
                            }
                        }
                    }, C822700WPc.LL);
                }
                LJIILL(interfaceC1320200kSY2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
