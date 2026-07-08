package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13FK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13FK extends C13Y7 implements InterfaceC1675750ti1, C13FO<Long> {
    public static final int $stable = 0;
    public C13FL next;

    @Override // X.InterfaceC1675750ti1, X.InterfaceC594770NUl
    public final long LIZ() {
        return ((C13FL) C13YE.LJIJI(this.next, this)).LIZJ;
    }

    public final String toString() {
        C13FL c13fl = (C13FL) C13YE.LJII(this.next);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutableLongState(value=");
        sbLIZ.append(c13fl.LIZJ);
        sbLIZ.append(")@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C05P1
    /* JADX INFO: renamed from: LJIJI, reason: merged with bridge method [inline-methods] */
    public final Long getValue() {
        return Long.valueOf(LIZ());
    }

    @Override // X.C13FO
    public final C13FF<Long> LJFF() {
        return C595410NWx.LIZ;
    }

    @Override // X.C13YP
    public final AbstractC19977113Ej LJIIZILJ() {
        return this.next;
    }

    public C13FK(long j) {
        C13YG c13ygLJIIIZ = C13YE.LJIIIZ();
        C13FL c13fl = new C13FL(c13ygLJIIIZ.LJI(), j);
        if (!(c13ygLJIIIZ instanceof C13YB)) {
            c13fl.LIZIZ = new C13FL(1, j);
        }
        this.next = c13fl;
    }

    @Override // X.InterfaceC1675750ti1
    public final void LJIIIIZZ(long j) {
        C13YG c13ygLJIIIZ;
        C13FL c13fl = (C13FL) C13YE.LJII(this.next);
        if (c13fl.LIZJ != j) {
            C13FL c13fl2 = this.next;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    ((C13FL) C13YE.LJIILJJIL(c13fl2, this, c13ygLJIIIZ, c13fl)).LIZJ = j;
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
        this.next = (C13FL) abstractC19977113Ej;
    }

    public final void LJIJJ(long j) {
        LJIIIIZZ(j);
    }

    @Override // X.C05P0
    public final /* bridge */ /* synthetic */ void setValue(Long l) {
        LJIJJ(l.longValue());
    }

    @Override // X.C13Y7, X.C13YP
    public final AbstractC19977113Ej LJIILIIL(AbstractC19977113Ej abstractC19977113Ej, AbstractC19977113Ej abstractC19977113Ej2, AbstractC19977113Ej abstractC19977113Ej3) {
        if (((C13FL) abstractC19977113Ej2).LIZJ != ((C13FL) abstractC19977113Ej3).LIZJ) {
            return null;
        }
        return abstractC19977113Ej2;
    }
}
