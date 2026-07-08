package X;

/* JADX INFO: renamed from: X.0oih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483970oih extends RunnableC1484020oim {
    public RunnableC1483960oig LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PreRenderTask@d7fd.run");
        try {
            this.LLILLJJLI.LJII(new InterfaceC1474000oSc() { // from class: X.0oin
                @Override // X.InterfaceC1474000oSc
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1474000oSc
                public final void LJ() {
                    RunnableC1483960oig runnableC1483960oig = this.LIZ.LLILZ;
                    if (runnableC1483960oig != null) {
                        runnableC1483960oig.run();
                    }
                }
            });
            if (this.LLILLJJLI.LIZIZ()) {
                this.LLILLJJLI.LJIILLIIL();
                new RunnableC1483960oig(this).run();
            } else {
                this.LLILZ = new RunnableC1483960oig(this);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreRenderTask@d7fd.run");
    }

    public C1483970oih(InterfaceC1483670oiD interfaceC1483670oiD, InterfaceC1483990oij interfaceC1483990oij, InterfaceC1479620obg interfaceC1479620obg) {
        super(interfaceC1483670oiD, interfaceC1483990oij, interfaceC1479620obg);
    }
}
