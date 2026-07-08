package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.051B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051B extends C09AY implements Function0<Pair<? extends Map<String, FilterTabType>, ? extends Map<FilterTabType, String>>> {
    public C051B() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pair<? extends Map<String, FilterTabType>, ? extends Map<FilterTabType, String>> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (FilterTabType filterTabType : FilterTabType.values()) {
            String serializedName = filterTabType.getSerializedName();
            linkedHashMap.put(serializedName, filterTabType);
            linkedHashMap.put(filterTabType.name(), filterTabType);
            linkedHashMap2.put(filterTabType, serializedName);
        }
        return new Pair<>(linkedHashMap, linkedHashMap2);
    }
}
