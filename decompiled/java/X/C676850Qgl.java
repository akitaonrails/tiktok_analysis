package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676850Qgl {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Activity activity, Fragment fragment) {
        String string;
        C19EG c19eg;
        String string2;
        if (activity == null || (string = Integer.valueOf(activity.hashCode()).toString()) == null) {
            return null;
        }
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
            SAFHelper.LIZ.getClass();
            Integer numValueOf = Integer.valueOf(SAFHelper.LJIILL(fragment, c19eg));
            if (numValueOf.intValue() != -1 && (string2 = numValueOf.toString()) != null && string2.length() != 0 && !Intrinsics.LJFF(string2, string)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append('_');
                sbLIZ.append(string2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return string;
        }
        return string;
    }

    public static Map LIZIZ(ECSearchEntranceData eCSearchEntranceData, String str) {
        Integer intOrNullStrategy;
        int iIntValue;
        C676890Qgp c676890Qgp = C676890Qgp.LIZ;
        boolean zLIZIZ = c676890Qgp.LIZIZ(eCSearchEntranceData);
        boolean zLIZ = c676890Qgp.LIZ(eCSearchEntranceData);
        if ((eCSearchEntranceData != null && (intOrNullStrategy = eCSearchEntranceData.getIntOrNullStrategy("disable_lynx_filter_entry_count")) != null) || (intOrNullStrategy = C676970Qgx.LIZ().disableLynxFilterEntryCount) != null) {
            iIntValue = intOrNullStrategy.intValue();
        } else {
            iIntValue = 0;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enable_tab_sort_entry", Integer.valueOf(zLIZIZ ? 1 : 0)), new Pair("enable_native_filter_entry", Integer.valueOf(zLIZ ? 1 : 0)), new Pair("disable_lynx_filter_entry_count", Integer.valueOf(iIntValue)));
        if (str != null) {
            mapLJIIJ.put("container_unique_id", str);
        }
        return mapLJIIJ;
    }
}
