package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13Ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19966413Ag extends AbstractC19966313Af {
    public static final Object[] LLIZLLLIL;
    public static final C19966413Ag LLJ;
    public final transient Object[] LLILLL;
    public final transient int LLILZ;
    public final transient Object[] LLILZIL;
    public final transient int LLILZLL;
    public final transient int LLIZ;

    static {
        Object[] objArr = new Object[0];
        LLIZLLLIL = objArr;
        LLJ = new C19966413Ag(0, 0, 0, objArr, objArr);
    }

    @Override // X.AbstractC19966513Ah
    public final int LJ() {
        return this.LLIZ;
    }

    @Override // X.AbstractC19966513Ah
    public final int LJFF() {
        return 0;
    }

    @Override // X.AbstractC19966513Ah
    public final Object[] LJIIIIZZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19966313Af, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.LLILZ;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LLIZ;
    }

    @Override // X.AbstractC19966313Af
    public final C19966813Ak LJIIJ() {
        Object[] objArr = this.LLILLL;
        int i = this.LLIZ;
        C19966913Al c19966913Al = AbstractC19966113Ad.LLILLJJLI;
        return i == 0 ? C19966813Ak.LLILZIL : new C19966813Ak(i, objArr);
    }

    @Override // X.AbstractC19966313Af, X.AbstractC19966513Ah, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // X.AbstractC19966313Af, X.AbstractC19966513Ah
    /* JADX INFO: renamed from: zzd */
    public final AbstractC19967113An iterator() {
        return zzg().listIterator(0);
    }

    @Override // X.AbstractC19966513Ah
    public final void LIZJ(Object[] objArr) {
        System.arraycopy(this.LLILLL, 0, objArr, 0, this.LLIZ);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    public C19966413Ag(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.LLILLL = objArr;
        this.LLILZ = i;
        this.LLILZIL = objArr2;
        this.LLILZLL = i2;
        this.LLIZ = i3;
    }
}
