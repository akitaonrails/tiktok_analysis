package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcCombineSummaryShowTypeModel;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.03oG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C954603oG {
    public static final EcCombineSummaryShowTypeModel LIZ = new EcCombineSummaryShowTypeModel(null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(352));

    public static final boolean LIZ(String str) {
        Integer num;
        if (str == null) {
            return false;
        }
        C01GW c01gw = LIZIZ;
        List<String> list = ((EcCombineSummaryShowTypeModel) c01gw.getValue()).allowList;
        if (list != null && !list.isEmpty()) {
            List<String> list2 = ((EcCombineSummaryShowTypeModel) c01gw.getValue()).allowList;
            if (list2 == null || !list2.contains(str) || (num = ((EcCombineSummaryShowTypeModel) c01gw.getValue()).type) == null || num.intValue() != 1) {
                return false;
            }
            return true;
        }
        Integer num2 = ((EcCombineSummaryShowTypeModel) c01gw.getValue()).type;
        if (num2 == null || num2.intValue() != 1) {
            return false;
        }
        return true;
    }
}
