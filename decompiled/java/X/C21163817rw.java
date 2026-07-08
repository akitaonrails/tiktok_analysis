package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.17rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21163817rw {
    public static final C2091008Hc<Long, AnonymousClass0957<BaseResponse<PopProductResp>>> LIZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.08Hc, X.08Hc<java.lang.Long, X.0957<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp>>>] */
    static {
        final int i = 20;
        LIZ = new LinkedHashMap<K, V>(i) { // from class: X.08Hc
            public final int LL;

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
                return (Set<Map.Entry<K, V>>) getEntries();
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
            public final /* bridge */ Set<K> keySet() {
                return (Set<K>) getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<V> values() {
                return (Collection<V>) getValues();
            }

            {
                this.LL = i;
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
                if (size() > this.LL) {
                    return true;
                }
                return false;
            }
        };
    }
}
