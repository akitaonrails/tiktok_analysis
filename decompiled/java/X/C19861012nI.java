package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.12nI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19861012nI extends AbstractC19860912nH {
    public static final Object[] LLIZLLLIL;
    public static final C19861012nI LLJ;
    public final transient Object[] LLILLL;
    public final transient int LLILZ;
    public final transient Object[] LLILZIL;
    public final transient int LLILZLL;
    public final transient int LLIZ;

    static {
        Object[] objArr = new Object[0];
        LLIZLLLIL = objArr;
        LLJ = new C19861012nI(0, 0, 0, objArr, objArr);
    }

    @Override // X.AbstractC19861612nO
    public final int LJ() {
        return this.LLIZ;
    }

    @Override // X.AbstractC19861612nO
    public final int LJFF() {
        return 0;
    }

    @Override // X.AbstractC19861612nO
    public final Object[] LJIIIIZZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19860912nH, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.LLILZ;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LLIZ;
    }

    @Override // X.AbstractC19860912nH
    public final AbstractC19861312nL LJIIL() {
        return AbstractC19861312nL.LJIIIZ(this.LLIZ, this.LLILLL);
    }

    @Override // X.AbstractC19860912nH, X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // X.AbstractC19860912nH, X.AbstractC19861612nO
    /* JADX INFO: renamed from: zzd */
    public final AbstractC19851112lh iterator() {
        return zzi().listIterator(0);
    }

    @Override // X.AbstractC19861612nO
    public final int LIZJ(Object[] objArr) {
        System.arraycopy(this.LLILLL, 0, objArr, 0, this.LLIZ);
        return this.LLIZ;
    }

    @Override // X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.LLILZIL;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.LLILZLL;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    public C19861012nI(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.LLILLL = objArr;
        this.LLILZ = i;
        this.LLILZIL = objArr2;
        this.LLILZLL = i2;
        this.LLIZ = i3;
    }
}
