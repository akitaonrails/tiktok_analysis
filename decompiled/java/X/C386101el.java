package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.01el, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C386101el implements InterfaceC19601711mZ {
    public final InterfaceC386401eo LIZ;
    public boolean LIZIZ;
    public C054G LIZJ;
    public final ConcurrentHashMap<Integer, InterfaceC386201em> LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC19601711mZ
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC19601711mZ
    public final void LIZ() {
        this.LIZLLL.clear();
        if (this.LIZIZ) {
            this.LIZIZ = false;
            this.LJ = false;
            C2296808zG.LIZLLL(this.LIZJ, "");
        }
    }

    public C386101el(InterfaceC386401eo interfaceC386401eo) {
        this.LIZ = interfaceC386401eo;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZJ = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LIZLLL = new ConcurrentHashMap<>();
    }

    @Override // X.InterfaceC19601711mZ
    public final void LIZIZ(InterfaceC386201em interfaceC386201em) {
        this.LIZLLL.remove(Integer.valueOf(interfaceC386201em.hashCode()));
    }

    @Override // X.InterfaceC19601711mZ
    public final void LIZLLL(InterfaceC386201em interfaceC386201em) {
        if (!this.LIZLLL.containsKey(Integer.valueOf(interfaceC386201em.hashCode()))) {
            this.LIZLLL.put(Integer.valueOf(interfaceC386201em.hashCode()), interfaceC386201em);
        }
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            this.LJ = true;
            C2296808zG.LIZLLL(this.LIZJ, "");
            C1DFH c1dfh = C0PEM.LIZ;
            this.LIZJ = C2296808zG.LIZ(C2107308Nj.LIZ);
            C09IC.LJJI(this.LIZJ, new C861640Xr8(new C386001ek(this, null), new C095D(new C385901ej(this, null))));
        }
    }
}
