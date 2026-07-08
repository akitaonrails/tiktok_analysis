package X;

import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.entrance.api.EcSearchEntranceConfigPreload;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.05xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1524405xy implements InterfaceC1769890w9r {
    public static final C1524405xy LIZ = new C1524405xy();
    public static final Map<String, Map<String, Object>> LIZIZ = new LinkedHashMap();

    @Override // X.InterfaceC1769890w9r
    public final boolean LIZIZ(String str) {
        return ((Map) C1524505xz.LIZIZ.getValue()).containsKey(str);
    }

    @Override // X.InterfaceC1769890w9r
    public final void LIZ(SparkContext sparkContext, String str, String str2) {
        final String str3 = (String) ((Map) C1524505xz.LIZIZ.getValue()).get(str2);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("source", str3, bundle);
        C1524605y0.LIZ().LIZ(bundle, EcSearchEntranceConfigPreload.class, new InterfaceC1726310v1Z() { // from class: X.05gl
            @Override // X.InterfaceC1726310v1Z
            public final void LIZ(Exception exc) {
            }

            @Override // X.InterfaceC1726310v1Z
            public final void onSuccess(Object obj) {
                k kVar;
                if (str3 != null) {
                    if (obj instanceof n) {
                        kVar = (k) obj;
                    } else {
                        kVar = null;
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), kVar, (Class<Object>) HashMap.class);
                    if ((objFromJson instanceof Map) && objFromJson != null) {
                        C1524405xy.LIZIZ.put(str3, (Map<String, Object>) objFromJson);
                        Keva repo = Keva.getRepo("ecommerce_search_repo");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ecom_search_entrance_config_data");
                        sbLIZ.append(str3);
                        repo.storeString(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(kVar));
                    }
                }
            }
        }, Boolean.FALSE);
    }
}
