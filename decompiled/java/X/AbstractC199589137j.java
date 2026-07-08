package X;

import X.C137C;

/* JADX INFO: renamed from: X.137j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC199589137j<K, V, E extends C137C<K, V, E>> implements C137C<K, V, E> {
    public final K LL;
    public final int LLILLJJLI;
    public final E LLILLL;

    @Override // X.C137C
    public final int getHash() {
        return this.LLILLJJLI;
    }

    @Override // X.C137C
    public final K getKey() {
        return this.LL;
    }

    @Override // X.C137C
    public final E getNext() {
        return this.LLILLL;
    }

    public AbstractC199589137j(K k, int i, E e) {
        this.LL = k;
        this.LLILLJJLI = i;
        this.LLILLL = e;
    }
}
