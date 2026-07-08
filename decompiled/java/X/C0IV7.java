package X;

/* JADX INFO: renamed from: X.0IV7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IV7 implements C0IV8 {
    public String LIZ;
    public C11JF LIZIZ;
    public final C0IV3 LIZJ = new C0IUF() { // from class: X.0IV3
        @Override // X.C0IUF
        public final C0IV2 LIZ() {
            return C0IV2.GLOBAL_POLLING;
        }
    };

    public final void LIZ() {
        C11JF c11jf;
        C11JF c11jf2 = this.LIZIZ;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LIZIZ) != null) {
            c11jf.dispose();
        }
        this.LIZIZ = null;
    }

    public final void LIZIZ(C0IVF c0ivf) {
        int i = C0IVE.LIZ[c0ivf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C0IV3 c0iv3 = this.LIZJ;
                        c0iv3.getClass();
                        c0iv3.LIZ = C0IUH.RUNNING;
                        return;
                    }
                    throw new C1954807lC();
                }
                C0IV3 c0iv32 = this.LIZJ;
                c0iv32.getClass();
                c0iv32.LIZ = C0IUH.PAUSE;
                return;
            }
            LJ();
            return;
        }
        LIZLLL();
    }
}
