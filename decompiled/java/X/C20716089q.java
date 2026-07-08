package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.089q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20716089q<T> implements Iterator<T>, C03W4 {
    public final Function1<T, Iterator<T>> LL;
    public final List<Iterator<T>> LLILLJJLI = new ArrayList();
    public Iterator<? extends T> LLILLL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLL.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.LLILLL.next();
        Iterator<T> itInvoke = this.LL.invoke(next);
        if (itInvoke == null || !itInvoke.hasNext()) {
            while (!this.LLILLL.hasNext() && (!((ArrayList) this.LLILLJJLI).isEmpty())) {
                this.LLILLL = (Iterator) C13LP.LJJLIIIJJI(this.LLILLJJLI);
                C19719612Di.LJJIJ(this.LLILLJJLI);
            }
        } else {
            ((ArrayList) this.LLILLJJLI).add(this.LLILLL);
            this.LLILLL = itInvoke;
        }
        return next;
    }

    public C20716089q(Iterator it2, AFwS231S0000000_3 aFwS231S0000000_3) {
        this.LL = aFwS231S0000000_3;
        this.LLILLL = it2;
    }
}
