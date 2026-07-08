package X;

/* JADX INFO: renamed from: X.1CxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247261CxY implements InterfaceC1473480oRm {
    public final /* synthetic */ C2247231CxV LIZ;

    @Override // X.InterfaceC1473480oRm
    public final void LJFF(int i, int i2) {
    }

    @Override // X.InterfaceC1473480oRm
    public final void onPrepared() {
        InterfaceC1473480oRm interfaceC1473480oRm = this.LIZ.LLILLL;
        if (interfaceC1473480oRm != null) {
            interfaceC1473480oRm.onPrepared();
        }
        this.LIZ.LLILLJJLI.LIZIZ.setLooping(false);
        this.LIZ.LJIILJJIL(true);
        C2247241CxW c2247241CxW = this.LIZ.LLILLJJLI;
        c2247241CxW.LIZIZ.start();
        c2247241CxW.LIZ = 4;
        C2247261CxY c2247261CxY = c2247241CxW.LIZJ;
        if (c2247261CxY != null) {
            c2247261CxY.LIZ(false);
        }
    }

    public C2247261CxY(C2247231CxV c2247231CxV) {
        this.LIZ = c2247231CxV;
    }

    @Override // X.InterfaceC1473480oRm
    public final void LIZ(boolean z) {
        InterfaceC1473480oRm interfaceC1473480oRm = this.LIZ.LLILLL;
        if (interfaceC1473480oRm != null) {
            interfaceC1473480oRm.LIZ(z);
        }
    }

    @Override // X.InterfaceC1473480oRm
    public final void LIZLLL(int i) {
        InterfaceC1473480oRm interfaceC1473480oRm = this.LIZ.LLILLL;
        if (interfaceC1473480oRm != null) {
            interfaceC1473480oRm.LIZLLL(i);
        }
    }

    @Override // X.InterfaceC1473480oRm
    public final void LIZIZ(int i, int i2) {
        InterfaceC1473480oRm interfaceC1473480oRm = this.LIZ.LLILLL;
        if (interfaceC1473480oRm != null) {
            interfaceC1473480oRm.LIZIZ(i, i2);
        }
    }

    @Override // X.InterfaceC1473480oRm
    public final void LJ(int i, boolean z) {
        InterfaceC1473480oRm interfaceC1473480oRm = this.LIZ.LLILLL;
        if (interfaceC1473480oRm != null) {
            interfaceC1473480oRm.LJ(i, z);
        }
    }

    @Override // X.InterfaceC1473480oRm
    public final void LIZJ(int i, String str, boolean z) {
        InterfaceC1473480oRm interfaceC1473480oRm = this.LIZ.LLILLL;
        if (interfaceC1473480oRm != null) {
            interfaceC1473480oRm.LIZJ(i, str, z);
        }
    }
}
