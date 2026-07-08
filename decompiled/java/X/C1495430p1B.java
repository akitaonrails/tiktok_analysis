package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import xlp.c;

/* JADX INFO: renamed from: X.0p1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495430p1B {
    public final C1495540p1M LIZ;
    public C1493980oyq LIZIZ;
    public C1495560p1O LIZJ;
    public final C1495440p1C LIZLLL;
    public final InterfaceC1495580p1Q LJ;
    public final AbstractC1494940p0O LJFF;
    public final Object LJI;
    public final C1493970oyp LJII;
    public int LJIIIIZZ;
    public C1495650p1X LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL = -1;
    public InterfaceC1495410p19 LJIILJJIL;

    public final synchronized C1495650p1X LIZIZ() {
        return this.LJIIIZ;
    }

    public final void LJFF() {
        C1495650p1X c1495650p1X;
        Socket socketLIZJ;
        synchronized (this.LIZLLL) {
            try {
                c1495650p1X = this.LJIIIZ;
                socketLIZJ = LIZJ(true, false, false);
                if (this.LJIIIZ != null) {
                    c1495650p1X = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c.LJFF(socketLIZJ);
        if (c1495650p1X != null) {
            this.LJFF.connectionReleased(this.LJ, c1495650p1X);
        }
    }

    public final void LJI() {
        C1495650p1X c1495650p1X;
        Socket socketLIZJ;
        synchronized (this.LIZLLL) {
            try {
                c1495650p1X = this.LJIIIZ;
                socketLIZJ = LIZJ(false, true, false);
                if (this.LJIIIZ != null) {
                    c1495650p1X = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c.LJFF(socketLIZJ);
        if (c1495650p1X != null) {
            C1495450p1D c1495450p1D = AbstractC1495490p1H.LIZ;
            InterfaceC1495580p1Q interfaceC1495580p1Q = this.LJ;
            c1495450p1D.getClass();
            ((C1495500p1I) interfaceC1495580p1Q).LIZLLL(null);
            this.LJFF.connectionReleased(this.LJ, c1495650p1X);
            this.LJFF.callEnd(this.LJ);
        }
    }

    public final String toString() {
        C1495650p1X c1495650p1XLIZIZ = LIZIZ();
        return c1495650p1XLIZIZ != null ? c1495650p1XLIZIZ.toString() : this.LIZ.toString();
    }

    public final void LJII(IOException iOException) {
        C1495650p1X c1495650p1X;
        boolean z;
        Socket socketLIZJ;
        synchronized (this.LIZLLL) {
            try {
                c1495650p1X = null;
                if (iOException instanceof C1495470p1F) {
                    EnumC1496090p2F enumC1496090p2F = ((C1495470p1F) iOException).errorCode;
                    if (enumC1496090p2F == EnumC1496090p2F.REFUSED_STREAM) {
                        int i = this.LJIIIIZZ + 1;
                        this.LJIIIIZZ = i;
                        if (i > 1) {
                            this.LIZJ = null;
                            z = true;
                        }
                        z = false;
                    } else {
                        if (enumC1496090p2F != EnumC1496090p2F.CANCEL) {
                            this.LIZJ = null;
                            z = true;
                        }
                        z = false;
                    }
                } else {
                    C1495650p1X c1495650p1X2 = this.LJIIIZ;
                    if (c1495650p1X2 != null && (c1495650p1X2.LJII == null || (iOException instanceof C1495390p17))) {
                        if (c1495650p1X2.LJIIJJI == 0) {
                            C1495560p1O c1495560p1O = this.LIZJ;
                            if (c1495560p1O != null && iOException != null) {
                                this.LJII.LIZ(c1495560p1O, iOException);
                            }
                            this.LIZJ = null;
                        }
                        z = true;
                    }
                    z = false;
                }
                C1495650p1X c1495650p1X3 = this.LJIIIZ;
                socketLIZJ = LIZJ(z, false, true);
                if (this.LJIIIZ == null && this.LJIIJ) {
                    c1495650p1X = c1495650p1X3;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c.LJFF(socketLIZJ);
        if (c1495650p1X != null) {
            this.LJFF.connectionReleased(this.LJ, c1495650p1X);
        }
    }

    public final void LIZ(C1495650p1X c1495650p1X, boolean z) {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = c1495650p1X;
            this.LJIIJ = z;
            ((ArrayList) c1495650p1X.LJIILIIL).add(new C1495480p1G(this, this.LJI));
            return;
        }
        throw new IllegalStateException();
    }

    public final Socket LIZJ(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.LJIILJJIL = null;
        }
        if (z2) {
            this.LJIIJJI = true;
        }
        C1495650p1X c1495650p1X = this.LJIIIZ;
        if (c1495650p1X != null) {
            if (z) {
                c1495650p1X.LJIIJ = true;
            }
            if (this.LJIILJJIL == null && (this.LJIIJJI || c1495650p1X.LJIIJ)) {
                int size = ((ArrayList) c1495650p1X.LJIILIIL).size();
                for (int i = 0; i < size; i++) {
                    if (((Reference) ListProtector.get(c1495650p1X.LJIILIIL, i)).get() == this) {
                        ListProtector.remove(c1495650p1X.LJIILIIL, i);
                        if (((ArrayList) this.LJIIIZ.LJIILIIL).isEmpty()) {
                            this.LJIIIZ.LJIILJJIL = System.nanoTime();
                            C1495450p1D c1495450p1D = AbstractC1495490p1H.LIZ;
                            C1495440p1C c1495440p1C = this.LIZLLL;
                            C1495650p1X c1495650p1X2 = this.LJIIIZ;
                            c1495450p1D.getClass();
                            c1495440p1C.getClass();
                            if (!c1495650p1X2.LJIIJ && c1495440p1C.LIZ != 0) {
                                c1495440p1C.notifyAll();
                                socket = null;
                            } else {
                                ((ArrayDeque) c1495440p1C.LIZLLL).remove(c1495650p1X2);
                                socket = this.LJIIIZ.LJ;
                            }
                        } else {
                            socket = null;
                        }
                        this.LJIIIZ = null;
                        return socket;
                    }
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    public final void LJIIIIZZ(boolean z, InterfaceC1495410p19 interfaceC1495410p19, long j, IOException iOException) {
        C1495650p1X c1495650p1X;
        Socket socketLIZJ;
        boolean z2;
        this.LJFF.responseBodyEnd(this.LJ, j);
        synchronized (this.LIZLLL) {
            if (interfaceC1495410p19 != null) {
                try {
                    if (interfaceC1495410p19 == this.LJIILJJIL) {
                        if (!z) {
                            this.LJIIIZ.LJIIJJI++;
                        }
                        c1495650p1X = this.LJIIIZ;
                        socketLIZJ = LIZJ(z, false, true);
                        if (this.LJIIIZ != null) {
                            c1495650p1X = null;
                        }
                        z2 = this.LJIIJJI;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("expected ");
            sbLIZ.append(this.LJIILJJIL);
            sbLIZ.append(" but was ");
            sbLIZ.append(interfaceC1495410p19);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        c.LJFF(socketLIZJ);
        if (c1495650p1X != null) {
            this.LJFF.connectionReleased(this.LJ, c1495650p1X);
        }
        if (iOException != null) {
            C1495450p1D c1495450p1D = AbstractC1495490p1H.LIZ;
            InterfaceC1495580p1Q interfaceC1495580p1Q = this.LJ;
            c1495450p1D.getClass();
            this.LJFF.callFailed(this.LJ, ((C1495500p1I) interfaceC1495580p1Q).LIZLLL(iOException));
            return;
        }
        if (!z2) {
            return;
        }
        C1495450p1D c1495450p1D2 = AbstractC1495490p1H.LIZ;
        InterfaceC1495580p1Q interfaceC1495580p1Q2 = this.LJ;
        c1495450p1D2.getClass();
        ((C1495500p1I) interfaceC1495580p1Q2).LIZLLL(null);
        this.LJFF.callEnd(this.LJ);
    }

    public C1495430p1B(C1495440p1C c1495440p1C, C1495540p1M c1495540p1M, InterfaceC1495580p1Q interfaceC1495580p1Q, AbstractC1494940p0O abstractC1494940p0O, Object obj) {
        this.LIZLLL = c1495440p1C;
        this.LIZ = c1495540p1M;
        this.LJ = interfaceC1495580p1Q;
        this.LJFF = abstractC1494940p0O;
        AbstractC1495490p1H.LIZ.getClass();
        this.LJII = new C1493970oyp(c1495540p1M, c1495440p1C.LJ, interfaceC1495580p1Q, abstractC1494940p0O);
        this.LJI = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1495650p1X LIZLLL(int r22, int r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495430p1B.LIZLLL(int, int, int, int, boolean):X.0p1X");
    }

    public final C1495650p1X LJ(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            C1495650p1X c1495650p1XLIZLLL = LIZLLL(i, i2, i3, i4, z);
            synchronized (this.LIZLLL) {
                try {
                    if (c1495650p1XLIZLLL.LJIIJJI != 0 || c1495650p1XLIZLLL.LJII != null) {
                        if (!c1495650p1XLIZLLL.LJII(z2)) {
                            LJFF();
                        } else {
                            return c1495650p1XLIZLLL;
                        }
                    } else {
                        return c1495650p1XLIZLLL;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
