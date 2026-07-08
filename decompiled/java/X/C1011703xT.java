package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03xT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1011703xT {
    public static void LIZ(WaistJumpSchema waistJumpSchema, InterfaceC1748810vbr interfaceC1748810vbr, Context context, IPdpStarter.PdpEnterParam pdpEnterParam) {
        Map<String, Object> map;
        if (waistJumpSchema != null && waistJumpSchema.schemaType > 0 && waistJumpSchema != null && waistJumpSchema.schema != null) {
            int i = waistJumpSchema.schemaType;
            if (i != 1 && i != 2) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
                linkedHashMap.putAll(map);
            }
            for (Map.Entry<String, Object> entry : C1748800vbq.LIZ(interfaceC1748810vbr).entrySet()) {
                Object value = entry.getValue();
                if (value != null && !Intrinsics.LJFF(entry.getKey(), "trackParams")) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
            linkedHashMap.put("previous_page", "product_detail");
            linkedHashMap.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
            linkedHashMap.put("init_time", Long.valueOf(System.currentTimeMillis()));
            C919503ib.LIZIZ(context, waistJumpSchema.schema, C2097908Jt.LIZJ(new Pair("trackParams", linkedHashMap)), false).open();
        }
    }
}
