package X;

import com.ss.android.ugc.aweme.experiment.TopTabItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CXS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXS extends C09AY implements Function0<Map<String, List<? extends String>>> {
    public final /* synthetic */ C1585260rM4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CXS(C1585260rM4 c1585260rM4) {
        super(0);
        this.LL = c1585260rM4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, List<? extends String>> invoke() {
        this.LL.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TopTabItem topTabItem : C1584280rKU.LIZIZ) {
            ArrayList arrayList = new ArrayList();
            Map<String, Boolean> map = topTabItem.filterRules;
            if (map != null) {
                for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (entry.getValue().booleanValue()) {
                        arrayList.add(key);
                    }
                }
            }
            linkedHashMap.put(topTabItem.topTabKey, arrayList);
        }
        return linkedHashMap;
    }
}
