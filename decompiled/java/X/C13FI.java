package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13FI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13FI extends C13Y7 implements C05ZL, C13FO<Float> {
    public static final int $stable = 0;
    public C13FJ next;

    @Override // X.C05ZL, X.C05PA
    public final float LIZIZ() {
        return ((C13FJ) C13YE.LJIJI(this.next, this)).LIZJ;
    }

    public final String toString() {
        C13FJ c13fj = (C13FJ) C13YE.LJII(this.next);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutableFloatState(value=");
        sbLIZ.append(c13fj.LIZJ);
        sbLIZ.append(")@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C05P1
    /* JADX INFO: renamed from: LJIJI, reason: merged with bridge method [inline-methods] */
    public final Float getValue() {
        return Float.valueOf(LIZIZ());
    }

    @Override // X.C13FO
    public final C13FF<Float> LJFF() {
        return C595410NWx.LIZ;
    }

    @Override // X.C13YP
    public final AbstractC19977113Ej LJIIZILJ() {
        return this.next;
    }

    public C13FI(float f) {
        C13YG c13ygLJIIIZ = C13YE.LJIIIZ();
        C13FJ c13fj = new C13FJ(c13ygLJIIIZ.LJI(), f);
        if (!(c13ygLJIIIZ instanceof C13YB)) {
            c13fj.LIZIZ = new C13FJ(1, f);
        }
        this.next = c13fj;
    }

    @Override // X.C13YP
    public final void LJIIL(AbstractC19977113Ej abstractC19977113Ej) {
        this.next = (C13FJ) abstractC19977113Ej;
    }

    @Override // X.C05ZL
    public final void LJIILJJIL(float f) {
        C13YG c13ygLJIIIZ;
        C13FJ c13fj = (C13FJ) C13YE.LJII(this.next);
        if (c13fj.LIZJ != f) {
            C13FJ c13fj2 = this.next;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    ((C13FJ) C13YE.LJIILJJIL(c13fj2, this, c13ygLJIIIZ, c13fj)).LIZJ = f;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        }
    }

    public final void LJIJJ(float f) {
        LJIILJJIL(f);
    }

    @Override // X.C05P0
    public final /* bridge */ /* synthetic */ void setValue(Float f) {
        LJIJJ(f.floatValue());
    }

    @Override // X.C13Y7, X.C13YP
    public final AbstractC19977113Ej LJIILIIL(AbstractC19977113Ej abstractC19977113Ej, AbstractC19977113Ej abstractC19977113Ej2, AbstractC19977113Ej abstractC19977113Ej3) {
        if (((C13FJ) abstractC19977113Ej2).LIZJ != ((C13FJ) abstractC19977113Ej3).LIZJ) {
            return null;
        }
        return abstractC19977113Ej2;
    }
}
