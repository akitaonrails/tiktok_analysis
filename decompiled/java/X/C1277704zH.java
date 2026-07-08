package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceNetworkMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04zH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1277704zH {
    public static List LIZ() {
        Map<String, List<String>> value = EcommerceNetworkMonitor.LIZ.getValue();
        ArrayList arrayList = new ArrayList(value.size());
        Iterator<Map.Entry<String, List<String>>> it2 = value.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getKey());
        }
        return arrayList;
    }
}
