package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0kTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1320930kTj<T> extends AbstractC1321260kUG<T> {
    public int LJII;
    public InterfaceC1320200kSY<T> LJIIIIZZ;
    public InterfaceC1320200kSY<T> LJIIIZ;
    public final /* synthetic */ C1320750kTR LJIIJ;

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZIZ() {
        /*
            r1 = this;
            monitor-enter(r1)
            X.0kSY r0 = r1.LJIILLIIL()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1320930kTj.LIZIZ():boolean");
    }

    public final synchronized InterfaceC1320200kSY<T> LJIILLIIL() {
        return this.LJIIIZ;
    }

    public final boolean LJIJI() {
        InterfaceC1320200kSY<T> interfaceC1320200kSY;
        synchronized (this) {
            interfaceC1320200kSY = null;
            if (!LJIIIIZZ() && this.LJII < this.LJIIJ.LIZ.size()) {
                List<InterfaceC1320070kSL<InterfaceC1320200kSY<T>>> list = this.LJIIJ.LIZ;
                int i = this.LJII;
                this.LJII = i + 1;
                InterfaceC1320070kSL<InterfaceC1320200kSY<T>> interfaceC1320070kSL = list.get(i);
                if (interfaceC1320070kSL != null) {
                    interfaceC1320200kSY = interfaceC1320070kSL.get();
                }
            }
        }
        if (LJIJ(interfaceC1320200kSY)) {
            if (interfaceC1320200kSY == null) {
                return false;
            }
            interfaceC1320200kSY.LIZJ(new InterfaceC589510NAf<T>() { // from class: X.0kTk
                @Override // X.InterfaceC589510NAf
                public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                }

                @Override // X.InterfaceC589510NAf
                public final void LIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY2) throws Throwable {
                    InterfaceC1320200kSY<T> interfaceC1320200kSY3;
                    if (interfaceC1320200kSY2.LIZIZ()) {
                        C1320930kTj c1320930kTj = this.LIZ;
                        c1320930kTj.getClass();
                        boolean zLIZ = interfaceC1320200kSY2.LIZ();
                        synchronized (c1320930kTj) {
                            try {
                                if (interfaceC1320200kSY2 == c1320930kTj.LJIIIIZZ && interfaceC1320200kSY2 != (interfaceC1320200kSY3 = c1320930kTj.LJIIIZ)) {
                                    if (interfaceC1320200kSY3 != null && !zLIZ) {
                                        interfaceC1320200kSY3 = null;
                                    } else {
                                        c1320930kTj.LJIIIZ = interfaceC1320200kSY2;
                                    }
                                    if (interfaceC1320200kSY3 != null) {
                                        interfaceC1320200kSY3.close();
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (interfaceC1320200kSY2 == c1320930kTj.LJIILLIIL()) {
                            c1320930kTj.LJIILIIL(null, interfaceC1320200kSY2.LIZ());
                            return;
                        }
                        return;
                    }
                    if (interfaceC1320200kSY2.LIZ()) {
                        this.LIZ.LJIIZILJ(interfaceC1320200kSY2);
                    }
                }

                @Override // X.InterfaceC589510NAf
                public final void LIZIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY2) {
                    this.LIZ.LJIIZILJ(interfaceC1320200kSY2);
                }

                @Override // X.InterfaceC589510NAf
                public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
                    this.LIZ.LJIIL(Math.max(this.LIZ.getProgress(), abstractC1321260kUG.getProgress()));
                }
            }, C822700WPc.LL);
            return true;
        }
        if (interfaceC1320200kSY == null) {
            return false;
        }
        interfaceC1320200kSY.close();
        return false;
    }

    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
    public final boolean close() {
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                InterfaceC1320200kSY<T> interfaceC1320200kSY = this.LJIIIIZZ;
                this.LJIIIIZZ = null;
                InterfaceC1320200kSY<T> interfaceC1320200kSY2 = this.LJIIIZ;
                this.LJIIIZ = null;
                if (interfaceC1320200kSY2 != null) {
                    interfaceC1320200kSY2.close();
                }
                if (interfaceC1320200kSY == null) {
                    return true;
                }
                interfaceC1320200kSY.close();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
    public final synchronized T getResult() {
        InterfaceC1320200kSY<T> interfaceC1320200kSYLJIILLIIL;
        interfaceC1320200kSYLJIILLIIL = LJIILLIIL();
        return interfaceC1320200kSYLJIILLIIL != null ? interfaceC1320200kSYLJIILLIIL.getResult() : null;
    }

    public final InterfaceC1320070kSL<InterfaceC1320200kSY<T>> LJIILL() {
        if (LJIIIIZZ() || this.LJII > this.LJIIJ.LIZ.size()) {
            return null;
        }
        return this.LJIIJ.LIZ.get(this.LJII - 1);
    }

    public C1320930kTj(C1320750kTR c1320750kTR) {
        this.LJIIJ = c1320750kTR;
        if (!LJIJI()) {
            LJIIJJI(new RuntimeException("No data source supplier or supplier returned null."));
        }
    }

    public final void LJIIZILJ(InterfaceC1320200kSY<T> interfaceC1320200kSY) {
        synchronized (this) {
            if (!LJIIIIZZ() && interfaceC1320200kSY == this.LJIIIIZZ) {
                this.LJIIIIZZ = null;
                if (interfaceC1320200kSY != LJIILLIIL() && interfaceC1320200kSY != null) {
                    interfaceC1320200kSY.close();
                }
                if (interfaceC1320200kSY.LIZLLL() instanceof OutOfMemoryError) {
                    LJIIJJI(interfaceC1320200kSY.LIZLLL());
                }
                if (!LJIJI()) {
                    LJIIJJI(interfaceC1320200kSY.LIZLLL());
                }
            }
        }
    }

    public final synchronized boolean LJIJ(InterfaceC1320200kSY<T> interfaceC1320200kSY) {
        if (LJIIIIZZ()) {
            return false;
        }
        this.LJIIIIZZ = interfaceC1320200kSY;
        return true;
    }
}
