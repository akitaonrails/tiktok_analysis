package X;

import com.ss.android.ugc.aweme.longpress.LongPressStructure;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: renamed from: X.0m1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380470m1l {
    public static final boolean LIZ(String str, Map map, AwS387S0200000_21 awS387S0200000_21) {
        LongPressStructure longPressStructure;
        List<String> list;
        if (map != null && (longPressStructure = (LongPressStructure) map.get(str)) != null && (list = longPressStructure.children) != null && !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (LIZ(it2.next(), map, awS387S0200000_21)) {
                    it2.remove();
                }
            }
            if (!list.isEmpty()) {
                return false;
            }
            return true;
        }
        return ((Boolean) awS387S0200000_21.invoke(str)).booleanValue();
    }
}
