package X;

import Y.AObjectS109S0000000_3;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13BG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i(with = C19980513Fr.class)
public final class C13BG extends AbstractC19979113Fd implements Map<String, AbstractC19979113Fd>, C03W4 {
    public static final C13BH Companion = new Object() { // from class: X.13BH
        public final C13HG<C13BG> serializer() {
            return C19980513Fr.LIZ;
        }
    };
    public final Map<String, AbstractC19979113Fd> LL;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC19979113Fd compute(String str, BiFunction<? super String, ? super AbstractC19979113Fd, ? extends AbstractC19979113Fd> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC19979113Fd computeIfAbsent(String str, Function<? super String, ? extends AbstractC19979113Fd> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC19979113Fd computeIfPresent(String str, BiFunction<? super String, ? super AbstractC19979113Fd, ? extends AbstractC19979113Fd> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC19979113Fd merge(String str, AbstractC19979113Fd abstractC19979113Fd, BiFunction<? super AbstractC19979113Fd, ? super AbstractC19979113Fd, ? extends AbstractC19979113Fd> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC19979113Fd put(String str, AbstractC19979113Fd abstractC19979113Fd) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC19979113Fd> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC19979113Fd putIfAbsent(String str, AbstractC19979113Fd abstractC19979113Fd) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC19979113Fd replace(String str, AbstractC19979113Fd abstractC19979113Fd) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC19979113Fd abstractC19979113Fd, AbstractC19979113Fd abstractC19979113Fd2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC19979113Fd, ? extends AbstractC19979113Fd> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC19979113Fd>> entrySet() {
        return this.LL.entrySet();
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.LL.keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return this.LL.size();
    }

    public final String toString() {
        return C13LP.LJJLIIIJ(this.LL.entrySet(), ",", "{", "}", 0, null, new AObjectS109S0000000_3(6), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC19979113Fd> values() {
        return this.LL.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13BG(Map<String, ? extends AbstractC19979113Fd> map) {
        this.LL = map;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.LL.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC19979113Fd)) {
            return false;
        }
        return this.LL.containsValue(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Intrinsics.LJFF(this.LL, obj);
    }

    @Override // java.util.Map
    public final AbstractC19979113Fd get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.LL.get(obj);
    }

    @Override // java.util.Map
    public final AbstractC19979113Fd remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
