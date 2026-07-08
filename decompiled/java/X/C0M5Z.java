package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0M5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M5Z<T> extends HashSet<T> {
    public static final int $stable = 8;
    public final Function1<T, Boolean> LL;

    public C0M5Z() {
        this(null);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0M5Z(Function1<? super T, Boolean> function1) {
        this.LL = function1;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        Function1<T, Boolean> function1 = this.LL;
        if (function1 != null && !function1.invoke(t).booleanValue()) {
            return false;
        }
        return super.add(t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends T> collection) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
        return true;
    }
}
