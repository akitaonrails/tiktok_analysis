package X;

/* JADX INFO: renamed from: X.0oif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1483950oif implements Runnable {
    public final InterfaceC1483670oiD LL;
    public final InterfaceC1483990oij LLILLJJLI;
    public RunnableC1484000oik LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ChangeSurfaceTask@a3fa.run");
        try {
            if (this.LLILLJJLI.LIZIZ()) {
                LIZ();
            } else {
                this.LLILLL = new RunnableC1484000oik(this);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChangeSurfaceTask@a3fa.run");
    }

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeSurfaceCommand: setSurface:");
        sbLIZ.append(this.LLILLJJLI.getSurface());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LJIJJLI(this.LLILLJJLI.getSurface(), true);
    }

    public RunnableC1483950oif(InterfaceC1483670oiD interfaceC1483670oiD, InterfaceC1483990oij interfaceC1483990oij) {
        this.LL = interfaceC1483670oiD;
        this.LLILLJJLI = interfaceC1483990oij;
        interfaceC1483990oij.LJII(new InterfaceC1474000oSc() { // from class: X.0oil
            @Override // X.InterfaceC1474000oSc
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1474000oSc
            public final void LJ() {
                RunnableC1484000oik runnableC1484000oik = this.LIZ.LLILLL;
                if (runnableC1484000oik != null) {
                    runnableC1484000oik.run();
                    this.LIZ.LLILLL = null;
                }
            }
        });
    }
}
