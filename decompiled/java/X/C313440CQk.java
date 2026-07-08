package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpStoreRecommendLogisticsTagStyleItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0CQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313440CQk extends HashMap<String, EcPdpStoreRecommendLogisticsTagStyleItem> {
    public static final int $stable = 8;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, EcPdpStoreRecommendLogisticsTagStyleItem>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, EcPdpStoreRecommendLogisticsTagStyleItem>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<EcPdpStoreRecommendLogisticsTagStyleItem> getValues() {
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
    public final /* bridge */ Collection<EcPdpStoreRecommendLogisticsTagStyleItem> values() {
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
        if (!(obj instanceof EcPdpStoreRecommendLogisticsTagStyleItem)) {
            return false;
        }
        return containsValue((EcPdpStoreRecommendLogisticsTagStyleItem) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ EcPdpStoreRecommendLogisticsTagStyleItem get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ EcPdpStoreRecommendLogisticsTagStyleItem remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(EcPdpStoreRecommendLogisticsTagStyleItem ecPdpStoreRecommendLogisticsTagStyleItem) {
        return super.containsValue((Object) ecPdpStoreRecommendLogisticsTagStyleItem);
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

    public /* bridge */ EcPdpStoreRecommendLogisticsTagStyleItem get(String str) {
        return (EcPdpStoreRecommendLogisticsTagStyleItem) super.get((Object) str);
    }

    public /* bridge */ EcPdpStoreRecommendLogisticsTagStyleItem remove(String str) {
        return (EcPdpStoreRecommendLogisticsTagStyleItem) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, (EcPdpStoreRecommendLogisticsTagStyleItem) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof EcPdpStoreRecommendLogisticsTagStyleItem)) {
            return false;
        }
        return remove((String) obj, (EcPdpStoreRecommendLogisticsTagStyleItem) obj2);
    }

    public final /* bridge */ EcPdpStoreRecommendLogisticsTagStyleItem getOrDefault(Object obj, EcPdpStoreRecommendLogisticsTagStyleItem ecPdpStoreRecommendLogisticsTagStyleItem) {
        if (!(obj instanceof String)) {
            return ecPdpStoreRecommendLogisticsTagStyleItem;
        }
        return getOrDefault((String) obj, ecPdpStoreRecommendLogisticsTagStyleItem);
    }

    public /* bridge */ boolean remove(String str, EcPdpStoreRecommendLogisticsTagStyleItem ecPdpStoreRecommendLogisticsTagStyleItem) {
        return super.remove((Object) str, (Object) ecPdpStoreRecommendLogisticsTagStyleItem);
    }

    public /* bridge */ EcPdpStoreRecommendLogisticsTagStyleItem getOrDefault(String str, EcPdpStoreRecommendLogisticsTagStyleItem ecPdpStoreRecommendLogisticsTagStyleItem) {
        return (EcPdpStoreRecommendLogisticsTagStyleItem) super.getOrDefault((Object) str, ecPdpStoreRecommendLogisticsTagStyleItem);
    }
}
