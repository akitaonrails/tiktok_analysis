package X;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19875412pc<E> extends C19875212pa<E> {
    public final Comparator<? super E> LJFF;

    @Override // X.C19875212pa
    public final C19875212pa LJIIIIZZ(Iterator it2) {
        throw null;
    }

    @Override // X.C19875212pa
    /* JADX INFO: renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public final C19875712pf LJIIIZ() {
        C19875712pf c19875712pfLJIILIIL = AbstractC19875612pe.LJIILIIL(this.LJFF, this.LIZIZ, this.LIZ);
        this.LIZIZ = c19875712pfLJIILIIL.size();
        this.LIZJ = true;
        return c19875712pfLJIILIIL;
    }

    public C19875412pc(Comparator<? super E> comparator) {
        comparator.getClass();
        this.LJFF = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19875212pa, X.AbstractC19876412pm
    public final AbstractC19876412pm LIZ(Object obj) {
        super.LJI(obj);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19875212pa
    public final C19875212pa LJI(Object obj) {
        super.LJI(obj);
        return this;
    }

    @Override // X.C19875212pa
    public final C19875212pa LJII(Iterable iterable) {
        super.LJII(iterable);
        return this;
    }

    public final void LJIIJ(Iterator it2) {
        super.LJIIIIZZ(it2);
    }
}
