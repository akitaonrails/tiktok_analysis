package X;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13Dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19974913Dn<T> extends AbstractC19975213Dq<T> {
    public final C19974813Dm<T> LLILLL;
    public int LLILZ;
    public C19975013Do<? extends T> LLILZIL;
    public int LLILZLL;

    public final void LIZ() {
        if (this.LLILZ != this.LLILLL.LJ()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    public final void LIZIZ() {
        Object[] objArr = this.LLILLL.LLILZLL;
        if (objArr == null) {
            this.LLILZIL = null;
            return;
        }
        int size = (r0.size() - 1) & (-32);
        int i = this.LL;
        if (i > size) {
            i = size;
        }
        int i2 = (this.LLILLL.LLILZ / 5) + 1;
        C19975013Do<? extends T> c19975013Do = this.LLILZIL;
        if (c19975013Do == null) {
            this.LLILZIL = new C19975013Do<>(i, size, i2, objArr);
            return;
        }
        c19975013Do.LL = i;
        c19975013Do.LLILLJJLI = size;
        c19975013Do.LLILLL = i2;
        if (c19975013Do.LLILZ.length < i2) {
            c19975013Do.LLILZ = new Object[i2];
        }
        c19975013Do.LLILZ[0] = objArr;
        ?? r0 = i == size ? 1 : 0;
        c19975013Do.LLILZIL = r0;
        c19975013Do.LIZIZ(i - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        LIZ();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.LL;
        this.LLILZLL = i;
        C19975013Do<? extends T> c19975013Do = this.LLILZIL;
        if (c19975013Do == null) {
            Object[] objArr = this.LLILLL.LLIZ;
            this.LL = i + 1;
            return (T) objArr[i];
        }
        if (c19975013Do.hasNext()) {
            this.LL++;
            return c19975013Do.next();
        }
        Object[] objArr2 = this.LLILLL.LLIZ;
        int i2 = this.LL;
        this.LL = i2 + 1;
        return (T) objArr2[i2 - c19975013Do.LLILLJJLI];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        LIZ();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.LL;
        int i2 = i - 1;
        this.LLILZLL = i2;
        C19975013Do<? extends T> c19975013Do = this.LLILZIL;
        if (c19975013Do == null) {
            Object[] objArr = this.LLILLL.LLIZ;
            this.LL = i2;
            return (T) objArr[i2];
        }
        int i3 = c19975013Do.LLILLJJLI;
        if (i <= i3) {
            this.LL = i2;
            return c19975013Do.previous();
        }
        Object[] objArr2 = this.LLILLL.LLIZ;
        this.LL = i2;
        return (T) objArr2[i2 - i3];
    }

    @Override // X.AbstractC19975213Dq, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        LIZ();
        int i = this.LLILZLL;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.LLILLL.remove(i);
        int i2 = this.LLILZLL;
        if (i2 < this.LL) {
            this.LL = i2;
        }
        this.LLILLJJLI = this.LLILLL.size();
        this.LLILZ = this.LLILLL.LJ();
        this.LLILZLL = -1;
        LIZIZ();
    }

    @Override // X.AbstractC19975213Dq, java.util.ListIterator
    public final void add(T t) {
        LIZ();
        this.LLILLL.add(this.LL, t);
        this.LL++;
        this.LLILLJJLI = this.LLILLL.size();
        this.LLILZ = this.LLILLL.LJ();
        this.LLILZLL = -1;
        LIZIZ();
    }

    @Override // X.AbstractC19975213Dq, java.util.ListIterator
    public final void set(T t) {
        LIZ();
        int i = this.LLILZLL;
        if (i != -1) {
            this.LLILLL.set(i, t);
            this.LLILZ = this.LLILLL.LJ();
            LIZIZ();
            return;
        }
        throw new IllegalStateException();
    }

    public C19974913Dn(C19974813Dm<T> c19974813Dm, int i) {
        super(i, c19974813Dm.size());
        this.LLILLL = c19974813Dm;
        this.LLILZ = c19974813Dm.LJ();
        this.LLILZLL = -1;
        LIZIZ();
    }
}
