package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13FE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13FE<T> extends C13Y7 implements C13FO<T> {
    public static final int $stable = 0;
    public C13FD<T> next;
    public final C13FF<T> policy;

    @Override // X.C05P0, X.C05P1
    public final T getValue() {
        return ((C13FD) C13YE.LJIJI(this.next, this)).LIZJ;
    }

    public final String toString() {
        C13FD c13fd = (C13FD) C13YE.LJII(this.next);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutableState(value=");
        sbLIZ.append(c13fd.LIZJ);
        sbLIZ.append(")@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C13FO
    public final C13FF<T> LJFF() {
        return this.policy;
    }

    @Override // X.C13YP
    public final AbstractC19977113Ej LJIIZILJ() {
        return this.next;
    }

    @Override // X.C13YP
    public final void LJIIL(AbstractC19977113Ej abstractC19977113Ej) {
        this.next = (C13FD) abstractC19977113Ej;
    }

    @Override // X.C05P0
    public final void setValue(T t) {
        C13YG c13ygLJIIIZ;
        C13FD c13fd = (C13FD) C13YE.LJII(this.next);
        if (!this.policy.LIZIZ(c13fd.LIZJ, t)) {
            C13FD<T> c13fd2 = this.next;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    ((C13FD) C13YE.LJIILJJIL(c13fd2, this, c13ygLJIIIZ, c13fd)).LIZJ = t;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        }
    }

    public C13FE(T t, C13FF<T> c13ff) {
        this.policy = c13ff;
        C13YG c13ygLJIIIZ = C13YE.LJIIIZ();
        C13FD<T> c13fd = new C13FD<>(c13ygLJIIIZ.LJI(), t);
        if (!(c13ygLJIIIZ instanceof C13YB)) {
            c13fd.LIZIZ = new C13FD(1, t);
        }
        this.next = c13fd;
    }

    @Override // X.C13Y7, X.C13YP
    public final AbstractC19977113Ej LJIILIIL(AbstractC19977113Ej abstractC19977113Ej, AbstractC19977113Ej abstractC19977113Ej2, AbstractC19977113Ej abstractC19977113Ej3) {
        if (!this.policy.LIZIZ(((C13FD) abstractC19977113Ej2).LIZJ, ((C13FD) abstractC19977113Ej3).LIZJ)) {
            this.policy.LIZ();
            return null;
        }
        return abstractC19977113Ej2;
    }
}
