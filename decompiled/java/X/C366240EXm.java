package X;

/* JADX INFO: renamed from: X.0EXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366240EXm {
    public final InterfaceC366210EXj LIZ;
    public C0EXH LIZIZ = null;

    public C366240EXm(InterfaceC366210EXj interfaceC366210EXj) {
        this.LIZ = interfaceC366210EXj;
    }

    public final void LIZ(EnumC366290EXr enumC366290EXr, C0EXG c0exg, C0EY1 c0ey1) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C0EXH(0);
        }
        int i = C366300EXs.LIZ[enumC366290EXr.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C0EXH c0exh = this.LIZIZ;
                        if (c0exh != null) {
                            c0exh.LIZLLL = c0exg;
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                C0EXH c0exh2 = this.LIZIZ;
                if (c0exh2 == null) {
                    return;
                }
                c0exh2.LIZIZ = c0ey1;
                return;
            }
            C0EXH c0exh3 = this.LIZIZ;
            if (c0exh3 == null) {
                return;
            }
            c0exh3.LIZJ = c0exg;
            return;
        }
        C0EXH c0exh4 = this.LIZIZ;
        if (c0exh4 == null) {
            return;
        }
        c0exh4.LIZ = c0exg;
    }
}
