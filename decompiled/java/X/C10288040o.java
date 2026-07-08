package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.040o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10288040o implements InterfaceC10289040p {
    public final InterfaceC1053404Aa LIZ;

    public C10288040o(InterfaceC1053404Aa interfaceC1053404Aa) {
        this.LIZ = interfaceC1053404Aa;
    }

    @Override // X.InterfaceC10289040p
    public final void LIZ(InterfaceC1748810vbr interfaceC1748810vbr, Context context, IPdpStarter.PdpEnterParam pdpEnterParam, WaistJumpSchema waistJumpSchema, String str, String str2) {
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
            linkedHashMap.put("previous_page", str);
            linkedHashMap.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
            linkedHashMap.put("init_time", Long.valueOf(System.currentTimeMillis()));
            C919503ib.LIZIZ(context, this.LIZ.LJII(str2, waistJumpSchema.schema, null), C2097908Jt.LIZJ(new Pair("trackParams", linkedHashMap)), false).open();
        }
    }
}
