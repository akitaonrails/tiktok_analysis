package X;

/* JADX INFO: renamed from: X.0V9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793100V9g {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C0V7R LIZLLL;
    public C0VA1 LJ;
    public InterfaceC793220V9s LJFF;
    public C0V9K LJI;
    public InterfaceC793220V9s LJII;
    public InterfaceC793220V9s LJIIIIZZ;
    public InterfaceC793220V9s LJIIIZ;
    public InterfaceC793220V9s LJIIJ;
    public InterfaceC793220V9s LJIIJJI;

    public final synchronized void LIZIZ() {
        LIZ(this.LJII);
    }

    public C793100V9g(C0V7R c0v7r) {
        this.LIZLLL = c0v7r;
    }

    public final void LIZ(InterfaceC793220V9s interfaceC793220V9s) {
        boolean z;
        if (this.LIZ && this.LIZIZ) {
            this.LJFF = interfaceC793220V9s;
            C0V9K c0v9k = this.LJI;
            C0V7R c0v7r = this.LIZLLL;
            if (c0v7r != null && c0v7r.isForeground()) {
                z = false;
            } else {
                z = true;
            }
            interfaceC793220V9s.LIZ(c0v9k, z);
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("change cpu exception detect state: ");
                sbLIZ.append(this.LJFF);
                C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
