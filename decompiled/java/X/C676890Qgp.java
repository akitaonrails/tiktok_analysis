package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Qgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676890Qgp {
    public static final C676890Qgp LIZ = new C676890Qgp();
    public static volatile Long LIZIZ;

    public final boolean LIZJ() {
        Pair<Long, Boolean> pairLJIIJ;
        Long first;
        Long l = C676970Qgx.LIZ().tabSortFilterMinGeckoVersion;
        long jLongValue = 0;
        long jLongValue2 = l != null ? l.longValue() : 0L;
        if (jLongValue2 <= 0) {
            return true;
        }
        Long l2 = LIZIZ;
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            synchronized (this) {
                try {
                    Long l3 = LIZIZ;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                    } else {
                        LIZ.getClass();
                        String strLIZ = C1553670qX7.LIZ();
                        if (!a0.LJJJIL(strLIZ) && (pairLJIIJ = C1550600qSA.LJIIJ(strLIZ, "tiktok_ecom_vertical_search_hybrid", false)) != null && (first = pairLJIIJ.getFirst()) != null) {
                            jLongValue = first.longValue();
                        }
                        LIZIZ = Long.valueOf(jLongValue);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return jLongValue >= jLongValue2;
    }

    public final boolean LIZ(ECSearchEntranceData eCSearchEntranceData) {
        Integer num;
        Integer intOrNullStrategy;
        Integer num2 = C676970Qgx.LIZ().enable;
        if (num2 == null || num2.intValue() != 1 || (num = C676970Qgx.LIZ().enableNativeFilterEntry) == null || num.intValue() != 1 || !LIZJ() || eCSearchEntranceData == null || (intOrNullStrategy = eCSearchEntranceData.getIntOrNullStrategy("enable_native_filter_entry")) == null || intOrNullStrategy.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(ECSearchEntranceData eCSearchEntranceData) {
        Integer num;
        Integer intOrNullStrategy;
        Integer num2 = C676970Qgx.LIZ().enable;
        if (num2 == null || num2.intValue() != 1 || (num = C676970Qgx.LIZ().enableTabSortEntry) == null || num.intValue() != 1 || !LIZJ() || eCSearchEntranceData == null || (intOrNullStrategy = eCSearchEntranceData.getIntOrNullStrategy("enable_tab_sort_entry")) == null || intOrNullStrategy.intValue() != 1) {
            return false;
        }
        return true;
    }
}
