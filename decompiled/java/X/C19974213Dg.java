package X;

import java.util.RandomAccess;

/* JADX INFO: renamed from: X.13Dg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19974213Dg<E> extends AbstractC19974313Dh<E> implements RandomAccess {
    public final AbstractC19974313Dh<E> LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final E get(int i) {
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int i2 = this.LLILZ;
        c19973713Db.getClass();
        C19973713Db.LIZIZ(i, i2);
        return this.LLILLJJLI.get(this.LLILLL + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19974213Dg(AbstractC19974313Dh<? extends E> abstractC19974313Dh, int i, int i2) {
        this.LLILLJJLI = abstractC19974313Dh;
        this.LLILLL = i;
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int size = abstractC19974313Dh.size();
        c19973713Db.getClass();
        C19973713Db.LIZLLL(i, i2, size);
        this.LLILZ = i2 - i;
    }
}
