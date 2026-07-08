package X;

import Y.ARunnableS25S1100000_20;

/* JADX INFO: renamed from: X.0klJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331830klJ extends C1320270kSf {
    public InterfaceC658750Psf LIZ;

    public static C1331830klJ LJIIL(InterfaceC658750Psf interfaceC658750Psf) {
        C1331830klJ c1331830klJ = new C1331830klJ();
        c1331830klJ.LIZ = interfaceC658750Psf;
        return c1331830klJ;
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZJ(C1325710kbR c1325710kbR, Object obj, String str, boolean z) {
        InterfaceC658750Psf interfaceC658750Psf = this.LIZ;
        if (str != null && interfaceC658750Psf != null) {
            C0STY.LIZ.execute(new ARunnableS25S1100000_20(interfaceC658750Psf, str, 1));
        }
    }
}
