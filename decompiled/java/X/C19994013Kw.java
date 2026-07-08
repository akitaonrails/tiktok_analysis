package X;

import e0.s0;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.13Kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19994013Kw<E> implements Iterator<E>, C03W4 {
    public int LL = -1;
    public final C2152008bu LLILLJJLI;
    public final /* synthetic */ s0<E> LLILLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        return (E) this.LLILLJJLI.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.LL;
        if (i != -1) {
            this.LLILLL.LLILLJJLI.LJIIL(i);
            this.LL = -1;
        }
    }

    public C19994013Kw(s0<E> s0Var) {
        this.LLILLL = s0Var;
        this.LLILLJJLI = C2152108bv.LIZ(new C19993913Kv(s0Var, this, null));
    }
}
