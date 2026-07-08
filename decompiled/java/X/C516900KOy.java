package X;

import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516900KOy {
    public static final void LIZ(Map<String, Object> map) {
        Object objValueOf;
        String string;
        C1101180elI c1101180elI;
        Map<String, C491530JPj> map2;
        C491530JPj c491530JPj;
        String string2;
        C1101180elI c1101180elI2;
        EnumC1101170elH enumC1101170elH;
        C1101180elI c1101180elI3;
        Map<String, C491530JPj> map3;
        C491530JPj c491530JPj2;
        C1101180elI c1101180elI4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0W0R.LIZJ();
        C0KM7 c0km7LIZ = C0W0R.LIZ(C497740JfY.LJII());
        linkedHashMap.put("network_type", c0km7LIZ.LIZIZ);
        linkedHashMap.put("network_speed", c0km7LIZ.LIZ);
        C1100750ekb c1100750ekbJM = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).jM();
        int iOrdinal = 0;
        if (c1100750ekbJM != null && (c1101180elI4 = c1100750ekbJM.LIZ) != null) {
            objValueOf = Float.valueOf(c1101180elI4.LIZ);
        } else {
            objValueOf = 0;
        }
        linkedHashMap.put("device_score", objValueOf);
        String str = "";
        if (c1100750ekbJM == null || (c1101180elI3 = c1100750ekbJM.LIZ) == null || (map3 = c1101180elI3.LIZJ) == null || (c491530JPj2 = map3.get("drop3")) == null || (string = Float.valueOf(c491530JPj2.LIZIZ).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("drop_3_duration_ratio", string);
        if (c1100750ekbJM != null && (c1101180elI2 = c1100750ekbJM.LIZ) != null && (enumC1101170elH = c1101180elI2.LIZLLL) != null) {
            iOrdinal = enumC1101170elH.ordinal();
        }
        linkedHashMap.put("perf_level", Integer.valueOf(iOrdinal));
        if (c1100750ekbJM != null && (c1101180elI = c1100750ekbJM.LIZ) != null && (map2 = c1101180elI.LIZJ) != null && (c491530JPj = map2.get("battery_temp")) != null && (string2 = Float.valueOf(c491530JPj.LIZIZ).toString()) != null) {
            str = string2;
        }
        linkedHashMap.put("thermal_level", str);
        map.putAll(linkedHashMap);
    }
}
