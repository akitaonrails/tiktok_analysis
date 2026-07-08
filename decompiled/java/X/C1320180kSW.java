package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0kSW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1320180kSW<T> extends AbstractC1321260kUG<T> {
    public ArrayList<InterfaceC1320200kSY<T>> LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public AtomicInteger LJIIJ;
    public Throwable LJIIJJI;
    public final /* synthetic */ C1320170kSV LJIIL;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LIZIZ() {
        /*
            r1 = this;
            monitor-enter(r1)
            X.0kSV r0 = r1.LJIIL     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto La
            r1.LJIILL()     // Catch: java.lang.Throwable -> L1c
        La:
            X.0kSY r0 = r1.LJIJ()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L17
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1320180kSW.LIZIZ():boolean");
    }

    public final synchronized InterfaceC1320200kSY<T> LJIJ() {
        return LJIIZILJ(this.LJIIIIZZ);
    }

    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
    public final synchronized T getResult() {
        InterfaceC1320200kSY<T> interfaceC1320200kSYLJIJ;
        if (this.LJIIL.LIZIZ) {
            LJIILL();
        }
        interfaceC1320200kSYLJIJ = LJIJ();
        return interfaceC1320200kSYLJIJ != null ? interfaceC1320200kSYLJIJ.getResult() : null;
    }

    public final void LJIILL() {
        if (this.LJIIJ != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LJIIJ == null) {
                    this.LJIIJ = new AtomicInteger(0);
                    int size = this.LJIIL.LIZ.size();
                    this.LJIIIZ = size;
                    this.LJIIIIZZ = size;
                    this.LJII = new ArrayList<>(size);
                    for (final int i = 0; i < size; i++) {
                        InterfaceC1320200kSY<T> interfaceC1320200kSY = this.LJIIL.LIZ.get(i).get();
                        this.LJII.add(interfaceC1320200kSY);
                        interfaceC1320200kSY.LIZJ(new InterfaceC589510NAf<T>(i) { // from class: X.0kSX
                            public final int LIZ;

                            @Override // X.InterfaceC589510NAf
                            public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                            }

                            @Override // X.InterfaceC589510NAf
                            public final void LIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY2) throws Throwable {
                                Throwable th;
                                boolean z;
                                int i2;
                                if (interfaceC1320200kSY2.LIZIZ()) {
                                    C1320180kSW c1320180kSW = this.LIZIZ;
                                    int i3 = this.LIZ;
                                    c1320180kSW.getClass();
                                    boolean zLIZ = interfaceC1320200kSY2.LIZ();
                                    synchronized (c1320180kSW) {
                                        try {
                                            int i4 = c1320180kSW.LJIIIIZZ;
                                            if (interfaceC1320200kSY2 == c1320180kSW.LJIIZILJ(i3) && i3 != c1320180kSW.LJIIIIZZ) {
                                                if (c1320180kSW.LJIJ() == null || (zLIZ && i3 < c1320180kSW.LJIIIIZZ)) {
                                                    c1320180kSW.LJIIIIZZ = i3;
                                                    i2 = i3;
                                                } else {
                                                    i2 = i4;
                                                }
                                                while (i4 > i2) {
                                                    InterfaceC1320200kSY<T> interfaceC1320200kSYLJIILLIIL = c1320180kSW.LJIILLIIL(i4);
                                                    if (interfaceC1320200kSYLJIILLIIL != null) {
                                                        interfaceC1320200kSYLJIILLIIL.close();
                                                    }
                                                    i4--;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            throw th2;
                                        }
                                    }
                                    if (interfaceC1320200kSY2 == c1320180kSW.LJIJ()) {
                                        if (i3 == 0 && interfaceC1320200kSY2.LIZ()) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        c1320180kSW.LJIILIIL(null, z);
                                    }
                                    if (c1320180kSW.LJIIJ.incrementAndGet() == c1320180kSW.LJIIIZ && (th = c1320180kSW.LJIIJJI) != null) {
                                        c1320180kSW.LJIIJJI(th);
                                        return;
                                    }
                                    return;
                                }
                                if (interfaceC1320200kSY2.LIZ()) {
                                    this.LIZIZ.LJIJI(this.LIZ, interfaceC1320200kSY2);
                                }
                            }

                            @Override // X.InterfaceC589510NAf
                            public final void LIZIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY2) {
                                this.LIZIZ.LJIJI(this.LIZ, interfaceC1320200kSY2);
                            }

                            @Override // X.InterfaceC589510NAf
                            public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
                                if (this.LIZ == 0) {
                                    this.LIZIZ.LJIIL(abstractC1321260kUG.getProgress());
                                }
                            }

                            {
                                this.LIZ = i;
                            }
                        }, C822700WPc.LL);
                        if (interfaceC1320200kSY.LIZIZ()) {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
    public final boolean close() {
        if (this.LJIIL.LIZIZ) {
            LJIILL();
        }
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                ArrayList<InterfaceC1320200kSY<T>> arrayList = this.LJII;
                this.LJII = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    InterfaceC1320200kSY<T> interfaceC1320200kSY = arrayList.get(i);
                    if (interfaceC1320200kSY != null) {
                        interfaceC1320200kSY.close();
                    }
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1320180kSW(C1320170kSV c1320170kSV) {
        this.LJIIL = c1320170kSV;
        if (!c1320170kSV.LIZIZ) {
            LJIILL();
        }
    }

    public final synchronized InterfaceC1320200kSY<T> LJIILLIIL(int i) {
        InterfaceC1320200kSY<T> interfaceC1320200kSY;
        ArrayList<InterfaceC1320200kSY<T>> arrayList = this.LJII;
        interfaceC1320200kSY = null;
        if (arrayList != null && i < arrayList.size()) {
            interfaceC1320200kSY = this.LJII.set(i, null);
        }
        return interfaceC1320200kSY;
    }

    public final synchronized InterfaceC1320200kSY<T> LJIIZILJ(int i) {
        InterfaceC1320200kSY<T> interfaceC1320200kSY;
        ArrayList<InterfaceC1320200kSY<T>> arrayList = this.LJII;
        if (arrayList != null && i < arrayList.size()) {
            interfaceC1320200kSY = this.LJII.get(i);
        } else {
            interfaceC1320200kSY = null;
        }
        return interfaceC1320200kSY;
    }

    public final void LJIJI(int i, InterfaceC1320200kSY<T> interfaceC1320200kSY) {
        InterfaceC1320200kSY<T> interfaceC1320200kSYLJIILLIIL;
        Throwable th;
        synchronized (this) {
            if (interfaceC1320200kSY != LJIJ()) {
                if (interfaceC1320200kSY == LJIIZILJ(i)) {
                    interfaceC1320200kSYLJIILLIIL = LJIILLIIL(i);
                } else {
                    interfaceC1320200kSYLJIILLIIL = interfaceC1320200kSY;
                }
                if (interfaceC1320200kSYLJIILLIIL != null) {
                    interfaceC1320200kSYLJIILLIIL.close();
                }
            }
        }
        if (i == 0) {
            this.LJIIJJI = interfaceC1320200kSY.LIZLLL();
        }
        if (this.LJIIJ.incrementAndGet() == this.LJIIIZ && (th = this.LJIIJJI) != null) {
            LJIIJJI(th);
        }
    }
}
