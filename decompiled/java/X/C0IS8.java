package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0IS8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IS8 extends LinkedHashMap<Object, Object> {
    public final /* synthetic */ C0IS7<Object, Object> LL;

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
        int size = size();
        C0IS7<Object, Object> c0is7 = this.LL;
        c0is7.getClass();
        if (size <= 20) {
            return false;
        }
        Function2<Object, Object, Unit> function2 = c0is7.LIZ;
        if (function2 != null) {
            function2.invoke(entry.getKey(), entry.getValue());
            return true;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IS8(C0IS7 c0is7, boolean z) {
        super(20, 0.75f, z);
        this.LL = c0is7;
    }
}
