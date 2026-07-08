package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.12r3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19884312r3 extends AbstractC19884912r9 {
    public final transient Object[] LLILLL;
    public final transient int LLILZ;
    public final transient int LLILZIL;

    @Override // X.AbstractC19884712r7
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILZIL;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C19863812nk.LIZ(i, this.LLILZIL);
        Object obj = this.LLILLL[i + i + this.LLILZ];
        Objects.requireNonNull(obj);
        return obj;
    }

    public C19884312r3(int i, int i2, Object[] objArr) {
        this.LLILLL = objArr;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }
}
