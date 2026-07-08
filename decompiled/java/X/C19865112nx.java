package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.12nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19865112nx extends AbstractC19875512pd<Object> {
    public final transient Object[] LLILLL;
    public final transient int LLILZ;
    public final transient int LLILZIL;

    @Override // X.AbstractC19875812pg
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILZIL;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C19864312np.LJFF(i, this.LLILZIL);
        Object obj = this.LLILLL[(i * 2) + this.LLILZ];
        Objects.requireNonNull(obj);
        return obj;
    }

    public C19865112nx(int i, int i2, Object[] objArr) {
        this.LLILLL = objArr;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }
}
