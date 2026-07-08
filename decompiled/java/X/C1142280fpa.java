package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0fpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142280fpa implements InterfaceC1121900fIi, InterfaceC1083960eJW, InterfaceC1103440eow {
    public final InterfaceC497601wk LIZ;
    public final C2252321DDq LIZIZ;
    public final C05KC<C1889207ac> LIZJ;
    public final C05KC<C1889107ab> LIZLLL;
    public final C1142360fpi LJ;
    public final C1142360fpi LJFF;
    public final C1142360fpi LJI;

    @Override // X.InterfaceC1121760fIU
    public final void LIZJ() {
        this.LIZJ.LJ.incrementAndGet();
    }

    @Override // X.InterfaceC1121760fIU
    public final void LIZLLL() {
        C05KC<C1889207ac> c05kc = this.LIZJ;
        if (c05kc.LIZIZ != null) {
            C23250099c.LIZLLL(c05kc.LIZ, null, null, new C1329105Ib(c05kc, null), 3);
        }
        C05KC<C1889107ab> c05kc2 = this.LIZLLL;
        if (c05kc2.LIZIZ != null) {
            C23250099c.LIZLLL(c05kc2.LIZ, null, null, new C1329105Ib(c05kc2, null), 3);
        }
    }

    @Override // X.InterfaceC1103490ep1
    public final C1142360fpi LJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1083980eJY
    public final C1142360fpi LJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1083980eJY
    public final InterfaceC1083950eJV<Boolean> LJIIIZ() {
        return this.LJ;
    }

    public static Boolean LJIIJ(C1889207ac c1889207ac) {
        boolean z;
        boolean z2;
        if (c1889207ac == null) {
            return null;
        }
        boolean z3 = false;
        if (c1889207ac.LIZ == 1) {
            z = true;
        } else {
            z = false;
        }
        if (c1889207ac.LIZJ > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override // X.InterfaceC1083960eJW, X.InterfaceC1103440eow
    public final void LIZIZ(boolean z) {
        this.LIZIZ.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1103440eow
    public final void LJFF(C1889107ab c1889107ab) {
        this.LIZLLL.LIZIZ(c1889107ab);
    }

    @Override // X.InterfaceC1121900fIi
    public final void LJII(C1889207ac c1889207ac) {
        this.LIZJ.LIZIZ(c1889207ac);
    }

    @Override // X.InterfaceC1121900fIi
    public final void LJIIIIZZ(int i) {
        C1889207ac c1889207ac = (C1889207ac) this.LIZJ.LIZJ.getValue();
        if (c1889207ac == null) {
            c1889207ac = new C1889207ac(0);
        }
        if (c1889207ac.LIZ == i) {
            return;
        }
        this.LIZJ.LIZIZ(C1889207ac.LIZ(c1889207ac, i, 0L, 510));
    }

    @Override // X.InterfaceC1083960eJW, X.InterfaceC1103440eow
    public final void LIZ(int i, long j) {
        C1889207ac c1889207ac = (C1889207ac) this.LIZJ.LIZJ.getValue();
        if (c1889207ac == null) {
            c1889207ac = new C1889207ac(0);
        }
        this.LIZJ.LIZIZ(C1889207ac.LIZ(c1889207ac, i, j, 506));
    }

    public C1142280fpa(InterfaceC497601wk interfaceC497601wk, C1122180fJA c1122180fJA, C1122170fJ9 c1122170fJ9) {
        this.LIZ = interfaceC497601wk;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LIZIZ = c2252321DDqLIZ;
        C05KC<C1889207ac> c05kc = new C05KC<>(interfaceC497601wk, c1122180fJA);
        this.LIZJ = c05kc;
        C05KC<C1889107ab> c05kc2 = new C05KC<>(interfaceC497601wk, c1122170fJ9);
        this.LIZLLL = c05kc2;
        final AnonymousClass0951 anonymousClass0951 = c05kc.LJII;
        this.LJ = new C1142360fpi(interfaceC497601wk, new InterfaceC346201Wa<Boolean>() { // from class: X.0fwm
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = anonymousClass0951.collect(new C1146750fwn(interfaceC346701Wf, this), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        });
        final AnonymousClass0951 anonymousClass09512 = c05kc.LJII;
        this.LJFF = new C1142360fpi(interfaceC497601wk, new C414301jJ(new InterfaceC346201Wa<Boolean>() { // from class: X.0fwp
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = anonymousClass09512.collect(new C1146780fwq(interfaceC346701Wf, this), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        }, c2252321DDqLIZ, new C01M7(null)));
        this.LJI = new C1142360fpi(interfaceC497601wk, C09IC.LJIIIIZZ(c05kc2.LJII, c05kc.LJII, c2252321DDqLIZ, new C23197097b(this, null)));
    }
}
