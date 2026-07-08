package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13FM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13FM extends C13Y7 implements C05P1, C05P0, C13FO<Double> {
    public static final int $stable = 0;
    public C13FN next;

    public final double LJIJI() {
        return ((C13FN) C13YE.LJIJI(this.next, this)).LIZJ;
    }

    public final String toString() {
        C13FN c13fn = (C13FN) C13YE.LJII(this.next);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutableDoubleState(value=");
        sbLIZ.append(c13fn.LIZJ);
        sbLIZ.append(")@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C05P1
    public final Object getValue() {
        return Double.valueOf(LJIJI());
    }

    @Override // X.C13FO
    public final C13FF<Double> LJFF() {
        return C595410NWx.LIZ;
    }

    @Override // X.C13YP
    public final AbstractC19977113Ej LJIIZILJ() {
        return this.next;
    }

    public C13FM(double d) {
        C13YG c13ygLJIIIZ = C13YE.LJIIIZ();
        C13FN c13fn = new C13FN(d, c13ygLJIIIZ.LJI());
        if (!(c13ygLJIIIZ instanceof C13YB)) {
            c13fn.LIZIZ = new C13FN(d, 1);
        }
        this.next = c13fn;
    }

    @Override // X.C13YP
    public final void LJIIL(AbstractC19977113Ej abstractC19977113Ej) {
        this.next = (C13FN) abstractC19977113Ej;
    }

    public final void LJIJJ(double d) {
        C13YG c13ygLJIIIZ;
        C13FN c13fn = (C13FN) C13YE.LJII(this.next);
        if (c13fn.LIZJ != d) {
            C13FN c13fn2 = this.next;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    ((C13FN) C13YE.LJIILJJIL(c13fn2, this, c13ygLJIIIZ, c13fn)).LIZJ = d;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        }
    }

    @Override // X.C05P0
    public final void setValue(Object obj) {
        LJIJJ(((Number) obj).doubleValue());
    }

    @Override // X.C13Y7, X.C13YP
    public final AbstractC19977113Ej LJIILIIL(AbstractC19977113Ej abstractC19977113Ej, AbstractC19977113Ej abstractC19977113Ej2, AbstractC19977113Ej abstractC19977113Ej3) {
        if (((C13FN) abstractC19977113Ej2).LIZJ != ((C13FN) abstractC19977113Ej3).LIZJ) {
            return null;
        }
        return abstractC19977113Ej2;
    }
}
