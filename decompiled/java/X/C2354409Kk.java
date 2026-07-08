package X;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: X.09Kk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2354409Kk<T> extends ArrayList<T> {
    public static final int $stable = 8;
    public int LL = -1;

    public final void LIZJ() {
        if (this.LL == -1) {
            return;
        }
        while (size() > this.LL) {
            remove(0);
        }
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final int getMaxSize() {
        return this.LL;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        super.add(t);
        LIZJ();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        boolean zAddAll = super.addAll(collection);
        if (zAddAll) {
            LIZJ();
        }
        return zAddAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final void setMaxSize(int i) {
        this.LL = i;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        super.add(i, t);
        LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean zAddAll = super.addAll(i, collection);
        if (zAddAll) {
            LIZJ();
        }
        return zAddAll;
    }
}
