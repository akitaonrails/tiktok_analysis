package X;

import Y.AComparatorS30S0000000_11;
import com.bytedance.touchpoint.api.model.CommonFeedButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0Rtw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710500Rtw {
    public static final Set<String> LIZ = new LinkedHashSet();
    public static final Set<String> LIZIZ = new LinkedHashSet();

    public static CommonFeedButton LIZ(String str) {
        List listLJLLLL;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        List listLJFF = C2178808gE.LIZ().LJFF(95);
        Object obj = null;
        if (listLJFF == null || (listLJLLLL = C13LP.LJLLLL(new AComparatorS30S0000000_11(7), listLJFF)) == null) {
            return null;
        }
        Iterator it2 = listLJLLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            List<String> list = ((CommonFeedButton) next).videoIds;
            if (list != null && list.contains(str)) {
                obj = next;
                break;
            }
        }
        return (CommonFeedButton) obj;
    }
}
