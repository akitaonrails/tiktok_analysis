package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.Prop;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropValue;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.RegionText;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mgZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405770mgZ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(RegionText regionText, String str) {
        Map<String, String> map = regionText.regionLabelMap;
        String str2 = regionText.defaultLabel;
        if (str != null && map != null && map.containsKey(str)) {
            return map.get(str);
        }
        return str2;
    }

    public static String LIZ(Prop prop, List list, String str) {
        Integer num;
        PropValue next;
        RegionText regionText;
        if (prop == null || (num = prop.propIndex) == null) {
            return null;
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(num.intValue(), list);
        List<PropValue> list2 = prop.propValues;
        if (list2 == null) {
            return null;
        }
        Iterator<PropValue> it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.propValueId, objLJJJLZIJ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PropValue propValue = next;
        if (propValue == null || (regionText = propValue.propValueName) == null) {
            return null;
        }
        return LIZIZ(regionText, str);
    }
}
