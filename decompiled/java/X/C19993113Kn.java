package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.13Kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19993113Kn<E> implements Iterator<E>, C03W4 {
    public int LL = -1;
    public final C2152008bu LLILLJJLI;
    public final /* synthetic */ C19992813Kk<E> LLILLL;

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
            this.LLILLL.LLILLJJLI.LJII(i);
            this.LL = -1;
        }
    }

    public C19993113Kn(C19992813Kk<E> c19992813Kk) {
        this.LLILLL = c19992813Kk;
        this.LLILLJJLI = C2152108bv.LIZ(new C19992913Kl(c19992813Kk, this, null));
    }
}
