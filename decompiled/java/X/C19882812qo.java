package X;

import X.AbstractC19872012p4;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: renamed from: X.12qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19882812qo<V> extends AbstractC19872012p4<K, V>.k.a implements ListIterator<V> {
    public final /* synthetic */ AbstractC19872012p4.l LLILZ;

    public final ListIterator<V> LIZIZ() {
        LIZ();
        return (ListIterator) this.LL;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return LIZIZ().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return LIZIZ().nextIndex();
    }

    @Override // java.util.ListIterator
    public final V previous() {
        return LIZIZ().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return LIZIZ().previousIndex();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19882812qo(AbstractC19872012p4.l lVar) {
        super();
        this.LLILZ = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(V v) {
        boolean zIsEmpty = this.LLILZ.isEmpty();
        LIZIZ().add(v);
        AbstractC19872012p4.l lVar = this.LLILZ;
        AbstractC19872012p4.this.LLIZ++;
        if (zIsEmpty) {
            lVar.LIZJ();
        }
    }

    @Override // java.util.ListIterator
    public final void set(V v) {
        LIZIZ().set(v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19882812qo(AbstractC19872012p4.l lVar, int i) {
        super(((List) lVar.LLILLJJLI).listIterator(i));
        this.LLILZ = lVar;
    }
}
