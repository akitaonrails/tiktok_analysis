package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.12pk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19876212pk<E> extends AbstractC19875112pZ<E> {
    public static final Object[] LLIZLLLIL;
    public static final C19876212pk<Object> LLJ;
    public final transient Object[] LLILLL;
    public final transient int LLILZ;
    public final transient Object[] LLILZIL;
    public final transient int LLILZLL;
    public final transient int LLIZ;

    static {
        Object[] objArr = new Object[0];
        LLIZLLLIL = objArr;
        LLJ = new C19876212pk<>(0, 0, 0, objArr, objArr);
    }

    @Override // X.AbstractC19875812pg
    public final int LJIIIIZZ() {
        return 0;
    }

    @Override // X.AbstractC19875812pg
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.AbstractC19875112pZ
    public final AbstractC19875512pd<E> LJIIJJI() {
        return AbstractC19875512pd.LJIIJ(this.LLIZ, this.LLILLL);
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC19853312m3<E> iterator() {
        return asList().iterator();
    }

    @Override // X.AbstractC19875812pg
    public final Object[] LJ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19875812pg
    public final int LJFF() {
        return this.LLIZ;
    }

    @Override // X.AbstractC19875112pZ, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.LLILZ;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LLIZ;
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.LLILZIL;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iLIZIZ = C19876812pq.LIZIZ(obj);
        while (true) {
            int i = iLIZIZ & this.LLILZLL;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iLIZIZ = i + 1;
        }
    }

    @Override // X.AbstractC19875812pg
    public final int LIZJ(int i, Object[] objArr) {
        System.arraycopy(this.LLILLL, 0, objArr, i, this.LLIZ);
        return i + this.LLIZ;
    }

    public C19876212pk(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.LLILLL = objArr;
        this.LLILZ = i;
        this.LLILZIL = objArr2;
        this.LLILZLL = i2;
        this.LLIZ = i3;
    }
}
