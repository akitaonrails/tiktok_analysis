package X;

import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EcomGeckoFrontUpdateModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553880qXS {
    public static Map<String, EcomGeckoFrontUpdateModel> LIZ(InterfaceC1553940qXY interfaceC1553940qXY) {
        if (interfaceC1553940qXY.config().length == 0) {
            return C2097608Jq.LJ();
        }
        EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArrConfig = interfaceC1553940qXY.config();
        int iLIZIZ = C2097908Jt.LIZIZ(ecomGeckoFrontUpdateModelArrConfig.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EcomGeckoFrontUpdateModel ecomGeckoFrontUpdateModel : ecomGeckoFrontUpdateModelArrConfig) {
            linkedHashMap.put(ecomGeckoFrontUpdateModel.scene, ecomGeckoFrontUpdateModel);
        }
        return linkedHashMap;
    }
}
