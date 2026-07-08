package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.12qM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19880012qM<E> extends AbstractC19879012qC<E> {
    public final /* synthetic */ AbstractC19878612q8 LL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return this.LL.LJ();
    }

    public C19880012qM(AbstractC19878612q8 abstractC19878612q8) {
        this.LL = abstractC19878612q8;
    }
}
