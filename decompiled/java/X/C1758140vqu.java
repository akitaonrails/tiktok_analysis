package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758140vqu {
    public static final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(429));
    public static final C01GW LIZJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(430));
        LIZJ = c01gwLIZIZ;
        C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
        C1758160vqw c1758160vqw = (C1758160vqw) c01gwLIZIZ.getValue();
        c2188561Al4.getClass();
        C2188561Al4.LJII(c1758160vqw);
    }

    public static C1759020vsK LIZIZ() {
        return (C1759020vsK) LIZIZ.getValue();
    }

    public static Pair LIZJ(String str) {
        if (str != null && str.length() != 0) {
            return LIZIZ().LIZJ(str);
        }
        return null;
    }

    public static ProductPackStruct LIZLLL(String str) {
        boolean z;
        EnumC1756020vnU second;
        ProductPackStruct first;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Pair<? extends ProductPackStruct, ? extends EnumC1756020vnU> pairLIZJ = LIZIZ().LIZJ(str);
        if (pairLIZJ != null) {
            second = pairLIZJ.getSecond();
        } else {
            second = null;
        }
        if (second != EnumC1756020vnU.LAST_USED_CACHE || (first = pairLIZJ.getFirst()) == null) {
            return null;
        }
        return first.LJIIIZ();
    }

    public static String LIZ(Integer num, String str, String str2) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String string = null;
        if (z) {
            return null;
        }
        if (num != null && num.intValue() != 0) {
            string = num.toString();
        }
        return C13LP.LJJLIIIJ(C13LQ.LJIJI(new String[]{str, string, str2}), "_", null, null, 0, null, null, 62);
    }

    public static void LJ(Integer num, String str, Integer num2) {
        C1018703yb.LIZLLL("rd_tiktokec_cache_common", new C1758150vqv(num, num2, null, null, str));
    }

    public static void LJFF(String str, ProductPackStruct productPackStruct, EnumC1756020vnU enumC1756020vnU, Function0 function0) {
        C23250099c.LIZLLL(LIZ, null, null, new C1758130vqt(str, productPackStruct, enumC1756020vnU, function0, null), 3);
    }
}
