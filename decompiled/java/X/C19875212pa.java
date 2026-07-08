package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: X.12pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19875212pa<E> extends AbstractC19875312pb<E> {
    public Object[] LIZLLL;
    public int LJ;

    public C19875212pa() {
        super(4);
    }

    public AbstractC19875112pZ<E> LJIIIZ() {
        AbstractC19875112pZ<E> abstractC19875112pZConstruct;
        int i = this.LIZIZ;
        if (i == 0) {
            return AbstractC19875112pZ.of();
        }
        if (i == 1) {
            Object obj = this.LIZ[0];
            Objects.requireNonNull(obj);
            return AbstractC19875112pZ.of(obj);
        }
        if (this.LIZLLL == null || AbstractC19875112pZ.LJIIJ(i) != this.LIZLLL.length) {
            abstractC19875112pZConstruct = AbstractC19875112pZ.construct(this.LIZIZ, this.LIZ);
            this.LIZIZ = abstractC19875112pZConstruct.size();
        } else {
            Object[] objArrCopyOf = AbstractC19875112pZ.shouldTrim(this.LIZIZ, this.LIZ.length) ? Arrays.copyOf(this.LIZ, this.LIZIZ) : this.LIZ;
            abstractC19875112pZConstruct = new C19876212pk<>(this.LJ, r8.length - 1, this.LIZIZ, objArrCopyOf, this.LIZLLL);
        }
        this.LIZJ = true;
        this.LIZLLL = null;
        return abstractC19875112pZConstruct;
    }

    public C19875212pa(int i) {
        super(i);
        this.LIZLLL = new Object[AbstractC19875112pZ.LJIIJ(i)];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19876412pm
    public /* bridge */ /* synthetic */ AbstractC19876412pm LIZ(Object obj) {
        LJI(obj);
        return this;
    }

    public C19875212pa<E> LJI(E e) {
        e.getClass();
        if (this.LIZLLL != null) {
            int iLJIIJ = AbstractC19875112pZ.LJIIJ(this.LIZIZ);
            Object[] objArr = this.LIZLLL;
            if (iLJIIJ <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = e.hashCode();
                int iLIZ = C19876812pq.LIZ(iHashCode);
                while (true) {
                    int i = iLIZ & length;
                    Object[] objArr2 = this.LIZLLL;
                    Object obj = objArr2[i];
                    if (obj == null) {
                        objArr2[i] = e;
                        this.LJ += iHashCode;
                        LIZLLL(e);
                        break;
                    }
                    if (obj.equals(e)) {
                        break;
                    }
                    iLIZ = i + 1;
                }
                return this;
            }
        }
        this.LIZLLL = null;
        LIZLLL(e);
        return this;
    }

    public C19875212pa<E> LJII(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (this.LIZLLL != null) {
            Iterator<? extends E> it2 = iterable.iterator();
            while (it2.hasNext()) {
                LJI(it2.next());
            }
        } else {
            LJ(iterable);
        }
        return this;
    }

    public C19875212pa<E> LJIIIIZZ(Iterator<? extends E> it2) {
        it2.getClass();
        while (it2.hasNext()) {
            LJI(it2.next());
        }
        return this;
    }
}
