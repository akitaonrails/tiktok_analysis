package X;

import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigData;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigGlobalData;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigPage;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0pLC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507840pLC {
    public static final EcomLoadRetreatConfigGlobalData LIZ;
    public static final C01GW LIZIZ;

    static {
        EcomLoadRetreatConfigGlobalData ecomLoadRetreatConfigGlobalData = new EcomLoadRetreatConfigGlobalData(false, null, false);
        EcomLoadRetreatConfigGlobalData ecomLoadRetreatConfigGlobalData2 = (EcomLoadRetreatConfigGlobalData) C0C64.LJIILLIIL().LJJII(EcomLoadRetreatConfigGlobalData.class, ecomLoadRetreatConfigGlobalData, "ec_load_retreat", true);
        if (ecomLoadRetreatConfigGlobalData2 != null) {
            ecomLoadRetreatConfigGlobalData = ecomLoadRetreatConfigGlobalData2;
        }
        LIZ = ecomLoadRetreatConfigGlobalData;
        LIZIZ = C452501pT.LIZIZ(new C1523500pkS());
    }

    public static EcomLoadRetreatConfigData LIZIZ() {
        return (EcomLoadRetreatConfigData) LIZIZ.getValue();
    }

    public static boolean LIZJ() {
        return LIZ.enable && LIZIZ().enableSubs.contains("preload");
    }

    public static Map.Entry LIZ(String str) {
        Object next;
        Iterator<T> it2 = LIZIZ().pages.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((EcomLoadRetreatConfigPage) ((Map.Entry) next).getValue()).LIZ(str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (Map.Entry) next;
    }
}
