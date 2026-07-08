package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.12rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19885112rB extends AbstractC19884912r9 {
    public static final C19885112rB LLILZIL = new C19885112rB(0, new Object[0]);
    public final transient Object[] LLILLL;
    public final transient int LLILZ;

    @Override // X.AbstractC19884712r7
    public final int LJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19884712r7
    public final int LJFF() {
        return 0;
    }

    @Override // X.AbstractC19884712r7
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC19884712r7
    public final Object[] LJIIIZ() {
        return this.LLILLL;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19884912r9, X.AbstractC19884712r7
    public final int LIZJ(Object[] objArr) {
        Object[] objArr2 = this.LLILLL;
        int i = this.LLILZ;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C19863812nk.LIZ(i, this.LLILZ);
        Object obj = this.LLILLL[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public C19885112rB(int i, Object[] objArr) {
        this.LLILLL = objArr;
        this.LLILZ = i;
    }
}
