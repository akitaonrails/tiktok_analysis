package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.12og, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19869612og<E> extends AbstractC19875112pZ<E> {
    public abstract E get(int i);

    @Override // X.AbstractC19875112pZ
    public final AbstractC19875512pd<E> LJIIJJI() {
        return new AbstractC19875512pd<E>() { // from class: X.12oh
            @Override // X.AbstractC19875812pg
            public final boolean LJIIIZ() {
                return this.LLILLL.LJIIIZ();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILLL.size();
            }

            @Override // java.util.List
            public final E get(int i) {
                return (E) this.LLILLL.get(i);
            }
        };
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public AbstractC19853312m3<E> iterator() {
        return asList().iterator();
    }

    @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // X.AbstractC19875812pg
    public final int LIZJ(int i, Object[] objArr) {
        return asList().LIZJ(i, objArr);
    }
}
