package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: X.0piP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522230piP<T> implements InterfaceC1522180piK<T> {
    public final InterfaceC1522240piQ<T> LIZ;
    public final int LIZIZ;
    public final InterfaceC1522250piR<T> LIZJ;
    public boolean LIZLLL = true;
    public final Queue<T> LJ = new LinkedList();

    @Override // X.InterfaceC1522180piK
    public final void LIZIZ() {
        C824310WVh.LIZJ(new ARunnableS123S0100000_23(this, 83));
    }

    @Override // X.InterfaceC1522180piK
    public final void LIZ(T t) {
        if (t == null) {
            return;
        }
        InterfaceC1522250piR<T> interfaceC1522250piR = this.LIZJ;
        if (interfaceC1522250piR != null) {
            interfaceC1522250piR.LIZ(t);
        }
        C824310WVh.LIZJ(new ARunnableS92S0200000_23(this, t, 58));
    }

    public C1522230piP(InterfaceC1522240piQ<T> interfaceC1522240piQ, int i, InterfaceC1522250piR<T> interfaceC1522250piR) {
        this.LIZ = interfaceC1522240piQ;
        this.LIZIZ = i;
        this.LIZJ = interfaceC1522250piR;
    }
}
