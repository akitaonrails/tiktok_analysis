package X;

/* JADX INFO: renamed from: X.12Re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19755612Re implements InterfaceC19756212Rk {
    public final /* synthetic */ C19755412Rc LIZ;

    public C19755612Re(C19755412Rc c19755412Rc) {
        this.LIZ = c19755412Rc;
    }

    @Override // X.InterfaceC19756212Rk
    public final void LIZ(float f, boolean z) {
        int iMo51if;
        long jTe;
        long j = (long) (r1.LJ * f);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ.LIZLLL;
        if (interfaceC1452170ntP != null) {
            iMo51if = interfaceC1452170ntP.mo51if();
        } else {
            iMo51if = 0;
        }
        int i = (int) (iMo51if * f);
        InterfaceC1452170ntP interfaceC1452170ntP2 = this.LIZ.LIZLLL;
        if (interfaceC1452170ntP2 != null) {
            jTe = interfaceC1452170ntP2.Te(i);
        } else {
            jTe = 0;
        }
        if (z) {
            C19755412Rc c19755412Rc = this.LIZ;
            c19755412Rc.LJII = null;
            c19755412Rc.LJFF.setValue(C1452730nuJ.LIZLLL(jTe));
            this.LIZ.LJFF.setValue(C1452730nuJ.LIZJ());
        } else {
            this.LIZ.LJFF.setValue(C1452730nuJ.LIZIZ(jTe));
            this.LIZ.LJFF.setValue(C1452730nuJ.LIZJ());
        }
        this.LIZ.LJIIIIZZ().setValue(Long.valueOf(j));
        this.LIZ.getClass();
    }
}
