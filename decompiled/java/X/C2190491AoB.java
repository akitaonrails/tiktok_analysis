package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.EcMixMallTrafficSourceConfigModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1AoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190491AoB {
    public static final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();

    public static Map LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (((EcMixMallTrafficSourceConfigModel) C2190471Ao9.LIZIZ.getValue()).enable == 1) {
            linkedHashMap.put("rd_primary_mall_out_source", "time_early");
            linkedHashMap.put("rd_secondary_mall_landing_page", "time_early");
        }
        linkedHashMap.putAll(new LinkedHashMap(LIZ));
        return linkedHashMap;
    }
}
