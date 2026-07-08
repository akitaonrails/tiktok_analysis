package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13Do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19975013Do<E> extends AbstractC19975213Dq<E> {
    public int LLILLL;
    public Object[] LLILZ;
    public boolean LLILZIL;

    public final E LIZ() {
        int i = this.LL & 31;
        Object obj = this.LLILZ[this.LLILLL - 1];
        if (obj != null) {
            return (E) ((Object[]) obj)[i];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eLIZ = LIZ();
        int i2 = this.LL + 1;
        this.LL = i2;
        if (i2 == this.LLILLJJLI) {
            this.LLILZIL = true;
            return eLIZ;
        }
        int i3 = 0;
        while (true) {
            i = this.LL;
            if (((i >> i3) & 31) != 0) {
                break;
            }
            i3 += 5;
        }
        if (i3 > 0) {
            LIZIZ(i, ((this.LLILLL - 1) - (i3 / 5)) + 1);
        }
        return eLIZ;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        int i;
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.LL--;
        int i2 = 0;
        if (this.LLILZIL) {
            this.LLILZIL = false;
            return LIZ();
        }
        while (true) {
            i = this.LL;
            if (((i >> i2) & 31) != 31) {
                break;
            }
            i2 += 5;
        }
        if (i2 > 0) {
            LIZIZ(i, ((this.LLILLL - 1) - (i2 / 5)) + 1);
        }
        return LIZ();
    }

    public final void LIZIZ(int i, int i2) {
        int i3 = (this.LLILLL - i2) * 5;
        while (i2 < this.LLILLL) {
            Object[] objArr = this.LLILZ;
            Object obj = objArr[i2 - 1];
            if (obj != null) {
                objArr[i2] = ((Object[]) obj)[(i >> i3) & 31];
                i3 -= 5;
                i2++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public C19975013Do(int i, int i2, int i3, Object[] objArr) {
        ?? r0;
        super(i, i2);
        this.LLILLL = i3;
        Object[] objArr2 = new Object[i3];
        this.LLILZ = objArr2;
        if (i == i2) {
            r0 = 1;
        } else {
            r0 = 0;
        }
        this.LLILZIL = r0;
        objArr2[0] = objArr;
        LIZIZ(i - r0, 1);
    }
}
