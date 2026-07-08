package X;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12nJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19861112nJ extends AbstractC19850412la {
    public final /* synthetic */ C19861912nR LLILLL;

    @Override // X.AbstractC19850412la
    public final C19861912nR LJIILIIL() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19860912nH
    public final AbstractC19861312nL LJIIL() {
        return new AbstractC19861312nL() { // from class: X.12nQ
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILLL.LLILLL.size();
            }

            @Override // java.util.List
            public final /* bridge */ /* synthetic */ Object get(int i) {
                return new AbstractMap.SimpleImmutableEntry(this.LLILLL.LLILLL.LLILLL.LLILZIL.get(i), this.LLILLL.LLILLL.LLILZ.get(i));
            }
        };
    }

    @Override // X.AbstractC19860912nH, X.AbstractC19861612nO, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // X.AbstractC19860912nH, X.AbstractC19861612nO
    /* JADX INFO: renamed from: zzd */
    public final AbstractC19851112lh iterator() {
        return zzi().listIterator(0);
    }

    public C19861112nJ(C19861912nR c19861912nR) {
        this.LLILLL = c19861912nR;
    }
}
