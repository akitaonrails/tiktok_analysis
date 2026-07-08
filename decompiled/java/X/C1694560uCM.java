package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uCM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694560uCM implements Collection<C1694530uCJ>, C03W4 {
    public static final C1694560uCM LLILLL = new C1694560uCM(C13BV.INSTANCE);
    public final List<C1694530uCJ> LL;
    public final int LLILLJJLI;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C1694530uCJ c1694530uCJ) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C1694530uCJ> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super C1694530uCJ> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C1694530uCJ> iterator() {
        return this.LL.iterator();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocaleList(localeList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.LLILLJJLI;
    }

    public C1694560uCM(List<C1694530uCJ> list) {
        this.LL = list;
        this.LLILLJJLI = list.size();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C1694530uCJ)) {
            return false;
        }
        return this.LL.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        return this.LL.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1694560uCM) && Intrinsics.LJFF(this.LL, ((C1694560uCM) obj).LL)) {
            return true;
        }
        return false;
    }
}
