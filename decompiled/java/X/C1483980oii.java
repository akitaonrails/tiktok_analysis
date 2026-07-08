package X;

/* JADX INFO: renamed from: X.0oii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483980oii implements InterfaceC1474000oSc {
    public final /* synthetic */ InterfaceC1483990oij LIZ;
    public final /* synthetic */ C1483920oic LIZIZ;

    @Override // X.InterfaceC1474000oSc
    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceDestroy: holder:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", active:");
        sbLIZ.append(this.LIZ.LJIILJJIL());
        sbLIZ.append(", surface:");
        sbLIZ.append(this.LIZ.getSurface());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZ.LJIILJJIL()) {
            this.LIZIZ.LIZ.LJIJJLI(null, true);
        }
    }

    @Override // X.InterfaceC1474000oSc
    public final void LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceAvailable: holder:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", active:");
        sbLIZ.append(this.LIZ.LJIILJJIL());
        sbLIZ.append(", surface:");
        sbLIZ.append(this.LIZ.getSurface());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZ.LJIILJJIL()) {
            RunnableC1483930oid runnableC1483930oid = this.LIZIZ.LIZJ;
            if (runnableC1483930oid != null) {
                runnableC1483930oid.run();
                this.LIZIZ.LIZJ = null;
            }
            RunnableC1483940oie runnableC1483940oie = this.LIZIZ.LIZLLL;
            if (runnableC1483940oie != null) {
                runnableC1483940oie.run();
                this.LIZIZ.LIZLLL = null;
            }
        }
    }

    public C1483980oii(C1483920oic c1483920oic, InterfaceC1483990oij interfaceC1483990oij) {
        this.LIZIZ = c1483920oic;
        this.LIZ = interfaceC1483990oij;
    }
}
