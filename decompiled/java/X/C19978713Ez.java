package X;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19978713Ez<K, V, T> extends C13F0<K, V, T> {
    public final C19971113Cb<K, V> LLILZ;
    public K LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;

    @Override // X.C13F0, java.util.Iterator
    public final T next() {
        if (this.LLILZ.LLILZIL != this.LLIZ) {
            throw new ConcurrentModificationException();
        }
        if (!this.LLILLL) {
            throw new NoSuchElementException();
        }
        C13F3<K, V, T> c13f3 = this.LL[this.LLILLJJLI];
        this.LLILZIL = (K) c13f3.LL[c13f3.LLILLL];
        this.LLILZLL = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C13F0, java.util.Iterator
    public final void remove() {
        if (!this.LLILZLL) {
            throw new IllegalStateException();
        }
        if (this.LLILLL) {
            C13F3<K, V, T> c13f3 = this.LL[this.LLILLJJLI];
            Object obj = c13f3.LL[c13f3.LLILLL];
            C19719512Dh.LIZJ(this.LLILZ).remove(this.LLILZIL);
            LIZLLL(obj != null ? obj.hashCode() : 0, this.LLILZ.LLILLL, obj, 0);
        } else {
            C19719512Dh.LIZJ(this.LLILZ).remove(this.LLILZIL);
        }
        this.LLILZIL = null;
        this.LLILZLL = false;
        this.LLIZ = this.LLILZ.LLILZIL;
    }

    public C19978713Ez(C19971113Cb<K, V> c19971113Cb, C13F3<K, V, T>[] c13f3Arr) {
        super(c19971113Cb.LLILLL, c13f3Arr);
        this.LLILZ = c19971113Cb;
        this.LLIZ = c19971113Cb.LLILZIL;
    }

    public final void LIZLLL(int i, C19971213Cc<?, ?> c19971213Cc, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            C13F3<K, V, T> c13f3 = this.LL[i2];
            Object[] objArr = c19971213Cc.LIZLLL;
            c13f3.LIZ(objArr.length, 0, objArr);
            while (true) {
                C13F3<K, V, T> c13f32 = this.LL[i2];
                if (!Intrinsics.LJFF(c13f32.LL[c13f32.LLILLL], k)) {
                    this.LL[i2].LLILLL += 2;
                } else {
                    this.LLILLJJLI = i2;
                    return;
                }
            }
        } else {
            int i4 = 1 << ((i >> i3) & 31);
            if (c19971213Cc.LJII(i4)) {
                this.LL[i2].LIZ(Integer.bitCount(c19971213Cc.LIZ) * 2, c19971213Cc.LJFF(i4), c19971213Cc.LIZLLL);
                this.LLILLJJLI = i2;
                return;
            }
            int iLJIJI = c19971213Cc.LJIJI(i4);
            C19971213Cc<?, ?> c19971213CcLJIJ = c19971213Cc.LJIJ(iLJIJI);
            this.LL[i2].LIZ(Integer.bitCount(c19971213Cc.LIZ) * 2, iLJIJI, c19971213Cc.LIZLLL);
            LIZLLL(i, c19971213CcLJIJ, k, i2 + 1);
        }
    }
}
