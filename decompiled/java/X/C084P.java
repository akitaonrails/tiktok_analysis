package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.084P, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C084P extends C09AY implements Function0<LinkedHashMap<String, BufferBtm>> {
    public C084P() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LinkedHashMap<String, BufferBtm> invoke() {
        return new LinkedHashMap<String, BufferBtm>() { // from class: X.084O
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, BufferBtm>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, BufferBtm>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<BufferBtm> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<BufferBtm> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof BufferBtm)) {
                    return false;
                }
                return containsValue((BufferBtm) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ BufferBtm get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ BufferBtm remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, BufferBtm> entry) {
                if (size() >= 100) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(BufferBtm bufferBtm) {
                return super.containsValue((Object) bufferBtm);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ BufferBtm get(String str) {
                return (BufferBtm) super.get((Object) str);
            }

            public /* bridge */ BufferBtm remove(String str) {
                return (BufferBtm) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (BufferBtm) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof BufferBtm)) {
                    return false;
                }
                return remove((String) obj, (BufferBtm) obj2);
            }

            public final /* bridge */ BufferBtm getOrDefault(Object obj, BufferBtm bufferBtm) {
                if (!(obj instanceof String)) {
                    return bufferBtm;
                }
                return getOrDefault((String) obj, bufferBtm);
            }

            public /* bridge */ boolean remove(String str, BufferBtm bufferBtm) {
                return super.remove((Object) str, (Object) bufferBtm);
            }

            public /* bridge */ BufferBtm getOrDefault(String str, BufferBtm bufferBtm) {
                return (BufferBtm) super.getOrDefault((Object) str, bufferBtm);
            }
        };
    }
}
