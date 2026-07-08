package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.12ZH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZH extends AbstractC19899712tX<C12ZI, C12ZH> implements InterfaceC19900412te {
    public final long LJIILL() {
        return ((C12ZI) this.LLILLJJLI).zzi;
    }

    public final long LJIJ() {
        return ((C12ZI) this.LLILLJJLI).zzh;
    }

    public final String LJIJI() {
        return ((C12ZI) this.LLILLJJLI).zzg;
    }

    public final List<C19777712Zr> LJIJJ() {
        return Collections.unmodifiableList(((C12ZI) this.LLILLJJLI).zzf);
    }

    public C12ZH() {
        super(C12ZI.zzc);
    }

    public final void LJIIL(int i) {
        LJIIJ();
        C12ZI c12zi = (C12ZI) this.LLILLJJLI;
        int i2 = C12ZI.LL;
        c12zi.LJJIJIIJI();
        c12zi.zzf.remove(i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJIILIIL(C19778912a3 c19778912a3) {
        LJIIJ();
        C12ZI c12zi = (C12ZI) this.LLILLJJLI;
        AbstractC19899612tW abstractC19899612tWLJI = c19778912a3.LJI();
        int i = C12ZI.LL;
        c12zi.getClass();
        c12zi.LJJIJIIJI();
        c12zi.zzf.add((C19777712Zr) abstractC19899612tWLJI);
    }

    public final void LJIILJJIL(C19777712Zr c19777712Zr) {
        LJIIJ();
        C12ZI c12zi = (C12ZI) this.LLILLJJLI;
        int i = C12ZI.LL;
        c12zi.getClass();
        c19777712Zr.getClass();
        c12zi.LJJIJIIJI();
        c12zi.zzf.add(c19777712Zr);
    }

    public final C19777712Zr LJIILLIIL(int i) {
        return ((C12ZI) this.LLILLJJLI).zzf.get(i);
    }
}
