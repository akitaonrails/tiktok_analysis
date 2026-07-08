package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.0pGS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504900pGS<T> extends AbstractList<T> implements RandomAccess, Serializable {
    public final List<T> LL;
    public List<T> LLILLJJLI;

    private Object writeReplace() {
        return new ArrayList(this.LLILLJJLI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LLILLJJLI.size();
    }

    public C1504900pGS(List<T> list) {
        this.LL = list;
        this.LLILLJJLI = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) ListProtector.get(this.LLILLJJLI, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        if (this.LLILLJJLI == this.LL) {
            this.LLILLJJLI = new ArrayList(this.LL);
        }
        return (T) ListProtector.remove(this.LLILLJJLI, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        if (this.LLILLJJLI == this.LL) {
            this.LLILLJJLI = new ArrayList(this.LL);
        }
        ListProtector.add(this.LLILLJJLI, i, t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        if (this.LLILLJJLI == this.LL) {
            this.LLILLJJLI = new ArrayList(this.LL);
        }
        return (T) ListProtector.set(this.LLILLJJLI, i, t);
    }
}
