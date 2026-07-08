package X;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0p8Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499920p8Q<T> extends CopyOnWriteArrayList<T> {
    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean add(T t) {
        remove(t);
        return super.add(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        removeAll(collection);
        return super.addAll(collection);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }
}
