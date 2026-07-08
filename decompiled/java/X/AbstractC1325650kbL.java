package X;

/* JADX INFO: renamed from: X.0kbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1325650kbL<T> extends AbstractC1321260kUG<T> {
    public final C1327900key LJII;
    public final InterfaceC1325670kbN LJIIIIZZ;

    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (LIZ()) {
            return true;
        }
        this.LJIIIIZZ.LIZLLL(this.LJII.LIZIZ);
        this.LJII.LJIIJ();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIILL(int i, Object obj) {
        boolean zLIZLLL = AbstractC1327820keq.LIZLLL(i);
        if (LJIILIIL(obj, zLIZLLL)) {
            if (zLIZLLL) {
                InterfaceC1325670kbN interfaceC1325670kbN = this.LJIIIIZZ;
                C1327900key c1327900key = this.LJII;
                interfaceC1325670kbN.LJII(c1327900key.LIZ, c1327900key.LIZIZ, c1327900key.LJI());
            } else {
                InterfaceC1325670kbN interfaceC1325670kbN2 = this.LJIIIIZZ;
                if (!(interfaceC1325670kbN2 instanceof C1320270kSf)) {
                    return;
                }
                C1327900key c1327900key2 = this.LJII;
                ((C1320270kSf) interfaceC1325670kbN2).LJIIJJI(c1327900key2.LIZ, c1327900key2.LIZIZ, c1327900key2.LJI());
            }
        }
    }

    public AbstractC1325650kbL(InterfaceC1327390ke9<T> interfaceC1327390ke9, C1327900key c1327900key, InterfaceC1325670kbN interfaceC1325670kbN) {
        C1336010ks3.LIZIZ();
        this.LJII = c1327900key;
        C1325710kbR c1325710kbR = c1327900key.LIZ;
        if (c1325710kbR != null && c1325710kbR.LJJJIL) {
            this.LJI = true;
        } else {
            this.LJI = false;
        }
        this.LJIIIIZZ = interfaceC1325670kbN;
        C1336010ks3.LIZIZ();
        interfaceC1325670kbN.LIZJ(c1327900key.LIZ, c1327900key.LIZLLL, c1327900key.LIZIZ, c1327900key.LJI());
        C1336010ks3.LIZIZ();
        C1336010ks3.LIZIZ();
        interfaceC1327390ke9.LIZIZ(new AbstractC1327820keq<Object>() { // from class: X.0kbM
            @Override // X.AbstractC1327820keq
            public final void LJFF() {
                AbstractC1325650kbL abstractC1325650kbL = this.LIZIZ;
                synchronized (abstractC1325650kbL) {
                    C1322350kW1.LJFF(abstractC1325650kbL.LJIIIIZZ());
                }
            }

            @Override // X.AbstractC1327820keq
            public final void LJI(Throwable th) {
                AbstractC1325650kbL abstractC1325650kbL = this.LIZIZ;
                if (abstractC1325650kbL.LJIIJJI(th)) {
                    InterfaceC1325670kbN interfaceC1325670kbN2 = abstractC1325650kbL.LJIIIIZZ;
                    C1327900key c1327900key2 = abstractC1325650kbL.LJII;
                    interfaceC1325670kbN2.LJ(c1327900key2.LIZ, c1327900key2.LIZIZ, th, c1327900key2.LJI());
                }
            }

            @Override // X.AbstractC1327820keq
            public final void LJIIIIZZ(float f) {
                this.LIZIZ.LJIIL(f);
            }

            @Override // X.AbstractC1327820keq
            public final void LJII(int i, Object obj) {
                this.LIZIZ.LJIILL(i, obj);
            }
        }, c1327900key);
        C1336010ks3.LIZIZ();
        C1336010ks3.LIZIZ();
    }
}
