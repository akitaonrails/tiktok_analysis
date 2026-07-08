package X;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19977413Em<K, V, T> extends AbstractC19977513En<K, V, T> {
    public final C13CF<K, V> LLILZ;
    public K LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;

    @Override // X.AbstractC19977513En, java.util.Iterator
    public final T next() {
        if (this.LLILZ.LLILZIL != this.LLIZ) {
            throw new ConcurrentModificationException();
        }
        if (!this.LLILLL) {
            throw new NoSuchElementException();
        }
        AbstractC19977713Ep<K, V, T> abstractC19977713Ep = this.LL[this.LLILLJJLI];
        this.LLILZIL = (K) abstractC19977713Ep.LL[abstractC19977713Ep.LLILLL];
        this.LLILZLL = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19977513En, java.util.Iterator
    public final void remove() {
        if (!this.LLILZLL) {
            throw new IllegalStateException();
        }
        if (this.LLILLL) {
            AbstractC19977713Ep<K, V, T> abstractC19977713Ep = this.LL[this.LLILLJJLI];
            Object obj = abstractC19977713Ep.LL[abstractC19977713Ep.LLILLL];
            this.LLILZ.remove(this.LLILZIL);
            LIZLLL(obj == null ? 0 : obj.hashCode(), this.LLILZ.LLILLL, obj, 0);
        } else {
            this.LLILZ.remove(this.LLILZIL);
        }
        this.LLILZIL = null;
        this.LLILZLL = false;
        this.LLIZ = this.LLILZ.LLILZIL;
    }

    public C19977413Em(C13CF<K, V> c13cf, AbstractC19977713Ep<K, V, T>[] abstractC19977713EpArr) {
        super(c13cf.LLILLL, abstractC19977713EpArr);
        this.LLILZ = c13cf;
        this.LLIZ = c13cf.LLILZIL;
    }

    public final void LIZLLL(int i, C13CU<?, ?> c13cu, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            AbstractC19977713Ep<K, V, T> abstractC19977713Ep = this.LL[i2];
            Object[] objArr = c13cu.LIZLLL;
            abstractC19977713Ep.LIZ(objArr.length, 0, objArr);
            while (true) {
                AbstractC19977713Ep<K, V, T> abstractC19977713Ep2 = this.LL[i2];
                if (!Intrinsics.LJFF(abstractC19977713Ep2.LL[abstractC19977713Ep2.LLILLL], k)) {
                    this.LL[i2].LLILLL += 2;
                } else {
                    this.LLILLJJLI = i2;
                    return;
                }
            }
        } else {
            int i4 = 1 << ((i >> i3) & 31);
            if (c13cu.LJIIIIZZ(i4)) {
                this.LL[i2].LIZ(Integer.bitCount(c13cu.LIZ) * 2, c13cu.LJFF(i4), c13cu.LIZLLL);
                this.LLILLJJLI = i2;
                return;
            }
            int iLJIJJ = c13cu.LJIJJ(i4);
            C13CU<?, ?> c13cuLJIJI = c13cu.LJIJI(iLJIJJ);
            this.LL[i2].LIZ(Integer.bitCount(c13cu.LIZ) * 2, iLJIJJ, c13cu.LIZLLL);
            LIZLLL(i, c13cuLJIJI, k, i2 + 1);
        }
    }
}
