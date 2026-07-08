package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.08bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2152008bu<T> extends AbstractC1421005hI<T> implements Iterator<T>, InterfaceC1364105Vn<Unit>, C03W4 {
    public int LL;
    public T LLILLJJLI;
    public Iterator<? extends T> LLILLL;
    public InterfaceC1364105Vn<? super Unit> LLILZ;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Throwable LIZLLL() {
        int i = this.LL;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected state of the iterator: ");
        sbLIZ.append(this.LL);
        return new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            int i = this.LL;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw LIZLLL();
                }
                if (this.LLILLL.hasNext()) {
                    this.LL = 2;
                    return true;
                }
                this.LLILLL = null;
            }
            this.LL = 5;
            InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn = this.LLILZ;
            this.LLILZ = null;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC1364105Vn.resumeWith(unit);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.LL;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.LL = 1;
            return this.LLILLL.next();
        }
        if (i != 3) {
            throw LIZLLL();
        }
        this.LL = 0;
        T t = this.LLILLJJLI;
        this.LLILLJJLI = null;
        return t;
    }

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return C23271099x.INSTANCE;
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        C155000ia.LIZIZ(obj);
        this.LL = 4;
    }

    @Override // X.AbstractC1421005hI
    public final Object LIZ(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        this.LLILLJJLI = t;
        this.LL = 3;
        this.LLILZ = interfaceC1364105Vn;
        Object objLJFF = C099R.LJFF();
        if (objLJFF == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJFF == C099R.LJFF()) {
            return objLJFF;
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC1421005hI
    public final Object LIZIZ(Iterator<? extends T> it2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (!it2.hasNext()) {
            return Unit.LIZ;
        }
        this.LLILLL = it2;
        this.LL = 2;
        this.LLILZ = interfaceC1364105Vn;
        Object objLJFF = C099R.LJFF();
        if (objLJFF == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJFF == C099R.LJFF()) {
            return objLJFF;
        }
        return Unit.LIZ;
    }
}
