package X;

/* JADX INFO: renamed from: X.0oHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1467250oHj implements InterfaceC1467910oIn {
    public final C1467070oHR LIZ;
    public final C1467200oHe LIZIZ;
    public final InterfaceC1467240oHi LIZJ;
    public final InterfaceC1468010oIx LIZLLL;

    public C1467250oHj(C1467520oIA c1467520oIA) {
        this.LIZLLL = c1467520oIA;
        if (c1467520oIA.LIZ == null) {
            C1466990oHJ c1466990oHJ = c1467520oIA.LIZJ;
            C1467200oHe c1467200oHe = new C1467200oHe(c1466990oHJ.LJJLIIJ);
            c1467520oIA.LIZ = c1467200oHe;
            c1467200oHe.LIZJ = c1466990oHJ;
        }
        this.LIZIZ = c1467520oIA.LIZ;
        if (c1467520oIA.LIZIZ == null) {
            C1466990oHJ c1466990oHJ2 = c1467520oIA.LIZJ;
            C1467270oHl c1467270oHl = new C1467270oHl(c1466990oHJ2.LJJLIL);
            c1467520oIA.LIZIZ = c1467270oHl;
            c1467270oHl.LIZJ = c1466990oHJ2;
        }
        C1466990oHJ c1466990oHJ3 = c1467520oIA.LIZJ;
        this.LIZJ = c1466990oHJ3.LLLZIL;
        this.LIZ = c1466990oHJ3.LJLIIL;
    }
}
