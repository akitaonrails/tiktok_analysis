package X;

/* JADX INFO: renamed from: X.0awL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954270awL implements InterfaceC954210awF, InterfaceC954200awE {
    public final InterfaceC497601wk LIZ;
    public final InterfaceC954320awQ LIZIZ;
    public final C955960az4 LIZJ;
    public final InterfaceC954180awC LIZLLL;
    public final InterfaceC954310awP LJ;
    public InterfaceC964770bDH LJFF;
    public AnonymousClass0956 LJI;

    @Override // X.InterfaceC954200awE
    public final void LIZ() {
    }

    @Override // X.InterfaceC954200awE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC954210awF
    public final void LIZIZ() {
        this.LJFF = C921730a5r.LL;
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            return;
        }
        this.LJ.d("LinkMicEventDispatcher", "cancel battle message observation");
        AnonymousClass0956 anonymousClass09562 = this.LJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LJI = null;
    }

    @Override // X.InterfaceC954200awE
    public final void LIZJ(int i) {
        InterfaceC954310awP interfaceC954310awP = this.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCancelInviteJoinGroupIntercepted. activeInviteGroupCount=");
        sbLIZ.append(i);
        interfaceC954310awP.d("LinkMicEventDispatcher", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 0) {
            return;
        }
        this.LJFF.LJLJLLL(6, this.LIZLLL);
        this.LJFF.LJLJLLL(0, this.LIZLLL);
    }

    @Override // X.InterfaceC954210awF
    public final void LJ(C964750bDF c964750bDF) {
        this.LJFF = c964750bDF;
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        this.LJ.d("LinkMicEventDispatcher", "observe battle message flow");
        this.LJI = C23250099c.LIZLLL(this.LIZ, null, null, new C954290awN(this, null), 3);
    }

    public C954270awL(C054G c054g, InterfaceC954320awQ interfaceC954320awQ, C955960az4 c955960az4, InterfaceC954180awC interfaceC954180awC) {
        C0TW8 c0tw8 = C0TW8.LIZ;
        this.LIZ = c054g;
        this.LIZIZ = interfaceC954320awQ;
        this.LIZJ = c955960az4;
        this.LIZLLL = interfaceC954180awC;
        this.LJ = c0tw8;
        this.LJFF = C921730a5r.LL;
    }
}
