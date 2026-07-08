package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.08MN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MN<T> extends LinkedHashSet<T> {
    public final int LL;

    public C08MN() {
        this(100);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    public C08MN(int i) {
        this.LL = i;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        if (size() >= this.LL) {
            remove(C13LP.LJJJJZ(this));
        }
        return super.add(t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends T> collection) {
        Iterator<T> it2 = collection.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (add(it2.next())) {
                z = true;
            }
        }
        return z;
    }
}
