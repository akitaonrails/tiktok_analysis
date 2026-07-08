package X;

import Y.AfS172S0100000_3;

/* JADX INFO: renamed from: X.08je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2200008je implements InterfaceC954320awQ {
    public final C784440Upu LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final C2252331DDr LIZJ;
    public final AnonymousClass0950 LIZLLL;
    public C11JF LJ;

    @Override // X.InterfaceC954320awQ
    public final void LIZ() {
        C11JF c11jf = this.LJ;
        if (c11jf != null) {
            C500260Jjc.LJJLIIIJLJLI(c11jf);
        }
    }

    @Override // X.InterfaceC954320awQ
    public final void LIZIZ() {
        C20441214yg.LJIIIZ("BusinessImMessageHub", "Start Listening BattleIM");
        C11JF c11jf = this.LJ;
        if (c11jf != null) {
            C500260Jjc.LJJLIIIJLJLI(c11jf);
        }
        this.LJ = (C11JF) this.LIZ.LJ(AbstractC957610b1j.class).LJJLJLI(new AfS172S0100000_3(this, 112));
    }

    @Override // X.InterfaceC954320awQ
    public final AnonymousClass0950 LIZJ() {
        return this.LIZLLL;
    }

    public C2200008je(C784440Upu c784440Upu, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = c784440Upu;
        this.LIZIZ = interfaceC497601wk;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LIZJ = c2252331DDrLIZIZ;
        this.LIZLLL = C09IC.LIZ(c2252331DDrLIZIZ);
    }
}
