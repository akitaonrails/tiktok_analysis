package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20132013pu implements Iterator<C20131713pr>, C03W4 {
    public int LL = -1;
    public boolean LLILLJJLI;
    public final /* synthetic */ C20131913pt LLILLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL + 1 < this.LLILLL.LLJIJIL.LJII();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.LLILLJJLI) {
            "You must call next() before you can remove an element".toString();
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        C1119470fEn<C20131713pr> c1119470fEn = this.LLILLL.LLJIJIL;
        c1119470fEn.LJIIIIZZ(this.LL).LLILLJJLI = null;
        int i = this.LL;
        Object[] objArr = c1119470fEn.LLILLL;
        Object obj = objArr[i];
        Object obj2 = C1101530elr.LIZ;
        if (obj != obj2) {
            objArr[i] = obj2;
            c1119470fEn.LL = true;
        }
        this.LL = i - 1;
        this.LLILLJJLI = false;
    }

    @Override // java.util.Iterator
    public final C20131713pr next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.LLILLJJLI = true;
        C1119470fEn<C20131713pr> c1119470fEn = this.LLILLL.LLJIJIL;
        int i = this.LL + 1;
        this.LL = i;
        return c1119470fEn.LJIIIIZZ(i);
    }

    public C20132013pu(C20131913pt c20131913pt) {
        this.LLILLL = c20131913pt;
    }
}
