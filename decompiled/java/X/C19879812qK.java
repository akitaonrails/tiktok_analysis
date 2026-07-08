package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.12qK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19879812qK<E> extends AbstractC19879312qF<E> {
    public final /* synthetic */ AbstractC19878612q8 LL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<InterfaceC19878012q2<E>> iterator() {
        return this.LL.LJFF();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LL.LIZJ();
    }

    public C19879812qK(AbstractC19878612q8 abstractC19878612q8) {
        this.LL = abstractC19878612q8;
    }
}
