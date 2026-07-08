package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0QYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672200QYg {
    public static String LIZ;
    public static boolean LIZIZ = true;
    public static final HashMap<String, String> LIZJ = new HashMap<>();

    public static String LIZ(ECSearchEntranceData eCSearchEntranceData) {
        String str = LIZJ.get(LIZJ(eCSearchEntranceData));
        if (!C123100dR.LIZ(str)) {
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            return str2;
        }
        if (!eCSearchEntranceData.getBooleanStrategy("enable_disk_guess_cache_strategy")) {
            return "";
        }
        return Keva.getRepo("ecommerce_search_repo").getString(LIZJ(eCSearchEntranceData), "");
    }

    public static String LIZIZ(ECSearchEntranceData eCSearchEntranceData) {
        String str = LIZ;
        if (C123100dR.LIZ(str) && str != null) {
            return str;
        }
        if (!eCSearchEntranceData.getBooleanStrategy("enable_disk_guess_cache_strategy")) {
            return "";
        }
        return Keva.getRepo("ecommerce_search_repo").getString("ecommerce_suggest_words", "");
    }

    public static String LIZJ(ECSearchEntranceData eCSearchEntranceData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("before_search_cache_");
        sbLIZ.append(C650500PfM.LIZ(eCSearchEntranceData));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(ECSearchEntranceData eCSearchEntranceData, boolean z) {
        if (eCSearchEntranceData == null) {
            return "";
        }
        Integer intOrNullStrategy = eCSearchEntranceData.getIntOrNullStrategy("guess_cache_read_strategy");
        boolean z2 = true;
        if (intOrNullStrategy != null) {
            int iIntValue = intOrNullStrategy.intValue();
            Integer intOrNullStrategy2 = eCSearchEntranceData.getIntOrNullStrategy("guess_cache_write_strategy");
            int value = EnumC672230QYj.DISABLE.getValue();
            if (intOrNullStrategy2 != null && intOrNullStrategy2.intValue() == value) {
                return "";
            }
            int value2 = EnumC672230QYj.COMMON.getValue();
            if (intOrNullStrategy2 == null || intOrNullStrategy2.intValue() != value2) {
                z2 = false;
            }
            if (iIntValue == EnumC672240QYk.DISABLE.getValue()) {
                return "";
            }
            if (iIntValue == EnumC672240QYk.ENABLE_ALWAYS.getValue()) {
                if (z2) {
                    return LIZIZ(eCSearchEntranceData);
                }
                return LIZ(eCSearchEntranceData);
            }
            if (iIntValue != EnumC672240QYk.ONLY_RESEARCH.getValue() || !z) {
                return "";
            }
            if (z2) {
                return LIZIZ(eCSearchEntranceData);
            }
            return LIZ(eCSearchEntranceData);
        }
        int i = C672270QYn.LIZ[eCSearchEntranceData.getMiddleGuessCacheStrategy().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                if (!z) {
                    return LIZ(eCSearchEntranceData);
                }
                return LIZIZ(eCSearchEntranceData);
            }
            if (!z) {
                return "";
            }
            return LIZIZ(eCSearchEntranceData);
        }
        return LIZIZ(eCSearchEntranceData);
    }

    public static void LJ(ECSearchEntranceData eCSearchEntranceData, String str) {
        LIZ = str;
        LIZJ.put(LIZJ(eCSearchEntranceData), str);
        if (eCSearchEntranceData.getBooleanStrategy("enable_disk_guess_cache_strategy")) {
            Keva.getRepo("ecommerce_search_repo").storeString(LIZJ(eCSearchEntranceData), str);
            Keva.getRepo("ecommerce_search_repo").storeString("ecommerce_suggest_words", str);
        }
    }

    public static void LJFF(String str, ECSearchEntranceData eCSearchEntranceData, boolean z) {
        if (eCSearchEntranceData == null) {
            return;
        }
        Integer intOrNullStrategy = eCSearchEntranceData.getIntOrNullStrategy("guess_cache_write_strategy");
        if (intOrNullStrategy != null) {
            int iIntValue = intOrNullStrategy.intValue();
            if (iIntValue == EnumC672230QYj.COMMON.getValue()) {
                LIZ = str;
                if (eCSearchEntranceData.getBooleanStrategy("enable_disk_guess_cache_strategy")) {
                    Keva.getRepo("ecommerce_search_repo").storeString("ecommerce_suggest_words", str);
                    return;
                }
                return;
            }
            if (iIntValue != EnumC672230QYj.UNIQUE.getValue()) {
                return;
            }
            LJ(eCSearchEntranceData, str);
            return;
        }
        int i = C672270QYn.LIZ[eCSearchEntranceData.getMiddleGuessCacheStrategy().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                if (!z) {
                    LJ(eCSearchEntranceData, str);
                    return;
                }
                LIZ = str;
                if (!eCSearchEntranceData.getBooleanStrategy("enable_disk_guess_cache_strategy")) {
                    return;
                }
                Keva.getRepo("ecommerce_search_repo").storeString("ecommerce_suggest_words", str);
                return;
            }
            return;
        }
        LIZ = str;
        if (!eCSearchEntranceData.getBooleanStrategy("enable_disk_guess_cache_strategy")) {
            return;
        }
        Keva.getRepo("ecommerce_search_repo").storeString("ecommerce_suggest_words", str);
    }
}
