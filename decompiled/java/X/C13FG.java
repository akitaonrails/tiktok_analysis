package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13FG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13FG extends C13Y7 implements InterfaceC1676320tiw, C13FO<Integer> {
    public static final int $stable = 0;
    public C13FH next;

    @Override // X.InterfaceC1676320tiw, X.InterfaceC594780NUm
    public final int LIZLLL() {
        return ((C13FH) C13YE.LJIJI(this.next, this)).LIZJ;
    }

    public final String toString() {
        C13FH c13fh = (C13FH) C13YE.LJII(this.next);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutableIntState(value=");
        sbLIZ.append(c13fh.LIZJ);
        sbLIZ.append(")@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C05P1
    public final Integer getValue() {
        return Integer.valueOf(LIZLLL());
    }

    @Override // X.C13FO
    public final C13FF<Integer> LJFF() {
        return C595410NWx.LIZ;
    }

    @Override // X.C13YP
    public final AbstractC19977113Ej LJIIZILJ() {
        return this.next;
    }

    public C13FG(int i) {
        C13YG c13ygLJIIIZ = C13YE.LJIIIZ();
        C13FH c13fh = new C13FH(c13ygLJIIIZ.LJI(), i);
        if (!(c13ygLJIIIZ instanceof C13YB)) {
            c13fh.LIZIZ = new C13FH(1, i);
        }
        this.next = c13fh;
    }

    @Override // X.InterfaceC1676320tiw
    public final void LJ(int i) {
        LJIIJ(i);
    }

    @Override // X.InterfaceC1676320tiw
    public final void LJIIJ(int i) {
        C13YG c13ygLJIIIZ;
        C13FH c13fh = (C13FH) C13YE.LJII(this.next);
        if (c13fh.LIZJ != i) {
            C13FH c13fh2 = this.next;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    ((C13FH) C13YE.LJIILJJIL(c13fh2, this, c13ygLJIIIZ, c13fh)).LIZJ = i;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        }
    }

    @Override // X.C13YP
    public final void LJIIL(AbstractC19977113Ej abstractC19977113Ej) {
        this.next = (C13FH) abstractC19977113Ej;
    }

    @Override // X.C05P0
    public final /* bridge */ /* synthetic */ void setValue(Integer num) {
        LJ(num.intValue());
    }

    @Override // X.C13Y7, X.C13YP
    public final AbstractC19977113Ej LJIILIIL(AbstractC19977113Ej abstractC19977113Ej, AbstractC19977113Ej abstractC19977113Ej2, AbstractC19977113Ej abstractC19977113Ej3) {
        if (((C13FH) abstractC19977113Ej2).LIZJ != ((C13FH) abstractC19977113Ej3).LIZJ) {
            return null;
        }
        return abstractC19977113Ej2;
    }
}
