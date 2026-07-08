package X;

/* JADX INFO: renamed from: X.0wpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795710wpV implements InterfaceC1796310wqT {
    public final /* synthetic */ InterfaceC1795140woa LIZ;
    public final /* synthetic */ C1795340wou LIZIZ;

    @Override // X.InterfaceC1796310wqT
    public final void LIZIZ() {
        C1796170wqF c1796170wqF = new C1796170wqF();
        c1796170wqF.LIZ = 1;
        C1796120wqA c1796120wqA = new C1796120wqA(c1796170wqF);
        C1BAY c1bay = this.LIZIZ.LJIILIIL;
        final InterfaceC1795140woa interfaceC1795140woa = this.LIZ;
        c1bay.LIZJ(new InterfaceC1796450wqh() { // from class: X.0wpe
            @Override // X.InterfaceC1796450wqh
            public final void LIZ(C19885612rG c19885612rG, C1796410wqd c1796410wqd) {
                C1794920woE c1794920woE;
                String str;
                C1795710wpV c1795710wpV = this.LIZ;
                InterfaceC1795140woa interfaceC1795140woa2 = interfaceC1795140woa;
                c1795710wpV.getClass();
                int i = c19885612rG.LIZ;
                if (i == 0) {
                    if (c1796410wqd != null) {
                        str = c1796410wqd.LIZ;
                    } else {
                        str = null;
                    }
                    c1794920woE = new C1794920woE(0, c19885612rG.LIZJ, str, i);
                } else {
                    String str2 = c19885612rG.LIZJ;
                    c1794920woE = new C1794920woE(402, str2, null, i, C1792840wks.LIZLLL(i, str2));
                    c1795710wpV.LIZIZ.getClass();
                    C1795340wou.LJIIL(c1794920woE);
                }
                interfaceC1795140woa2.LIZ(c1794920woE);
            }
        }, c1796120wqA);
    }

    @Override // X.InterfaceC1796310wqT
    public final void LIZ(C1792840wks c1792840wks) {
        C1794920woE c1794920woE = new C1794920woE(402, c1792840wks.LJ, null, c1792840wks.LIZ);
        this.LIZIZ.getClass();
        C1795340wou.LJIIL(c1794920woE);
        this.LIZ.LIZ(c1794920woE);
    }

    public C1795710wpV(C1795340wou c1795340wou, InterfaceC1795140woa interfaceC1795140woa) {
        this.LIZIZ = c1795340wou;
        this.LIZ = interfaceC1795140woa;
    }
}
