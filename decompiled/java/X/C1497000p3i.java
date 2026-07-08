package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.0p3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497000p3i<T> extends AbstractList<T> implements RandomAccess, Serializable {
    public final ArrayList<T> LL;

    private Object writeReplace() {
        return Collections.unmodifiableList(this.LL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LL.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.LL.toArray();
    }

    public C1497000p3i(List<T> list) {
        this.LL = new ArrayList<>(list);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) ListProtector.get(this.LL, i);
    }
}
