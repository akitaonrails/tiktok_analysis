package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: X.07cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1901907cf implements Map<String, InterfaceC1406105et>, C03W4 {
    public final Map<String, InterfaceC1406105et> LL;
    public final String LLILLJJLI;
    public final Set<String> LLILLL;
    public final Map<String, AbstractC553110Lmf<?>> LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ InterfaceC1406105et compute(String str, BiFunction<? super String, ? super InterfaceC1406105et, ? extends InterfaceC1406105et> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ InterfaceC1406105et computeIfAbsent(String str, Function<? super String, ? extends InterfaceC1406105et> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ InterfaceC1406105et computeIfPresent(String str, BiFunction<? super String, ? super InterfaceC1406105et, ? extends InterfaceC1406105et> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ InterfaceC1406105et merge(String str, InterfaceC1406105et interfaceC1406105et, BiFunction<? super InterfaceC1406105et, ? super InterfaceC1406105et, ? extends InterfaceC1406105et> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ InterfaceC1406105et put(String str, InterfaceC1406105et interfaceC1406105et) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends InterfaceC1406105et> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ InterfaceC1406105et putIfAbsent(String str, InterfaceC1406105et interfaceC1406105et) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ InterfaceC1406105et replace(String str, InterfaceC1406105et interfaceC1406105et) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, InterfaceC1406105et interfaceC1406105et, InterfaceC1406105et interfaceC1406105et2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super InterfaceC1406105et, ? extends InterfaceC1406105et> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        if (!this.LLILZIL) {
            return this.LL.keySet();
        }
        Set<String> setKeySet = this.LL.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (this.LLILLL.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return C13LP.LLIIJI(arrayList);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, InterfaceC1406105et>> entrySet() {
        Set<String> setKeySet = keySet();
        ArrayList arrayList = new ArrayList();
        for (String str : setKeySet) {
            InterfaceC1406105et interfaceC1406105et = (InterfaceC1406105et) get(str);
            if (interfaceC1406105et != null) {
                arrayList.add(new C1902007cg(str, interfaceC1406105et));
            }
        }
        return C13LP.LLIIJI(arrayList);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final int size() {
        return keySet().size();
    }

    @Override // java.util.Map
    public final Collection<InterfaceC1406105et> values() {
        Set<Map.Entry<String, InterfaceC1406105et>> setEntrySet = entrySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getValue());
        }
        return arrayList;
    }

    public final void LIZ(String str) {
        if (this.LLILZIL && !this.LLILLL.contains(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Node=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" read undeclared artifact: ");
            sbLIZ.append(str);
            throw new C1890807as(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        LIZ(str);
        return this.LL.containsKey(str);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof InterfaceC1406105et)) {
            return false;
        }
        return this.LL.containsValue(obj);
    }

    @Override // java.util.Map
    public final InterfaceC1406105et get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        LIZ(str);
        InterfaceC1406105et interfaceC1406105et = this.LL.get(str);
        if (interfaceC1406105et == null) {
            return null;
        }
        AbstractC553110Lmf<?> abstractC553110Lmf = this.LLILZ.get(str);
        if (abstractC553110Lmf != null && this.LLILZLL) {
            return new C1903907cz(interfaceC1406105et, str, abstractC553110Lmf, this.LLILLJJLI);
        }
        return interfaceC1406105et;
    }

    @Override // java.util.Map
    public final InterfaceC1406105et remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1901907cf(Map<String, ? extends InterfaceC1406105et> map, String str, Set<String> set, Map<String, ? extends AbstractC553110Lmf<?>> map2, boolean z, boolean z2) {
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = set;
        this.LLILZ = map2;
        this.LLILZIL = z;
        this.LLILZLL = z2;
    }
}
