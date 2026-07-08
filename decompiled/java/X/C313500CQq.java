package X;

import com.bytedance.hybrid.spark.roma.config.ShortLinkConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0CQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313500CQq extends HashMap<String, ShortLinkConfig> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, ShortLinkConfig>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, ShortLinkConfig>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<ShortLinkConfig> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<ShortLinkConfig> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof ShortLinkConfig)) {
            return false;
        }
        return containsValue((ShortLinkConfig) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ ShortLinkConfig get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ ShortLinkConfig remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(ShortLinkConfig shortLinkConfig) {
        return super.containsValue((Object) shortLinkConfig);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
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

    public /* bridge */ ShortLinkConfig get(String str) {
        return (ShortLinkConfig) super.get((Object) str);
    }

    public /* bridge */ ShortLinkConfig remove(String str) {
        return (ShortLinkConfig) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, (ShortLinkConfig) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof ShortLinkConfig)) {
            return false;
        }
        return remove((String) obj, (ShortLinkConfig) obj2);
    }

    public final /* bridge */ ShortLinkConfig getOrDefault(Object obj, ShortLinkConfig shortLinkConfig) {
        if (!(obj instanceof String)) {
            return shortLinkConfig;
        }
        return getOrDefault((String) obj, shortLinkConfig);
    }

    public /* bridge */ boolean remove(String str, ShortLinkConfig shortLinkConfig) {
        return super.remove((Object) str, (Object) shortLinkConfig);
    }

    public /* bridge */ ShortLinkConfig getOrDefault(String str, ShortLinkConfig shortLinkConfig) {
        return (ShortLinkConfig) super.getOrDefault((Object) str, shortLinkConfig);
    }
}
