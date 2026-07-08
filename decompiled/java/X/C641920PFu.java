package X;

import com.ss.android.ugc.aweme.search.SearchTabInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641920PFu extends C09AY implements Function0<Map<String, ? extends SearchTabInfo>> {
    public C641920PFu() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends SearchTabInfo> invoke() {
        if (Intrinsics.LJFF(C641930PFv.LIZLLL(), C641930PFv.LIZ)) {
            return C641930PFv.LIZIZ();
        }
        List<SearchTabInfo> list = C641930PFv.LIZLLL().tabList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SearchTabInfo searchTabInfo : list) {
            if (searchTabInfo.tabName.length() > 0) {
                linkedHashMap.put(searchTabInfo.tabName, searchTabInfo);
            }
        }
        return linkedHashMap.isEmpty() ? C641930PFv.LIZIZ() : linkedHashMap;
    }
}
