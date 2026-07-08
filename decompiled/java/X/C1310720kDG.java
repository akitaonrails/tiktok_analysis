package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0kDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1310720kDG extends C1310800kDO {
    public C1310720kDG(HashMap<String, Object> map) {
        super(map);
        C1310750kDJ.LIZLLL("identifier", map);
        Double dValueOf = Double.valueOf(-1.0d);
        C1310750kDJ.LIZIZ(map, "pipelineStart", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "pipelineEnd", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "mtsRenderStart", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "mtsRenderEnd", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "resolveStart", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "resolveEnd", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "layoutStart", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "layoutEnd", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "paintingUiOperationExecuteStart", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "paintingUiOperationExecuteEnd", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "layoutUiOperationExecuteStart", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "layoutUiOperationExecuteEnd", dValueOf).doubleValue();
        C1310750kDJ.LIZIZ(map, "paintEnd", dValueOf).doubleValue();
        if (map.get("frameworkRenderingTiming") != null) {
            map.get("frameworkRenderingTiming");
        } else {
            new HashMap();
        }
        if (map.get("hostPlatformTiming") != null) {
            final HashMap map2 = (HashMap) map.get("hostPlatformTiming");
            new Object(map2) { // from class: X.0kDB
                {
                    C1310750kDJ.LIZLLL("hostPlatformType", map2);
                    Double dValueOf2 = Double.valueOf(-1.0d);
                    C1310750kDJ.LIZIZ(map2, "measureStart", dValueOf2).doubleValue();
                    C1310750kDJ.LIZIZ(map2, "measureEnd", dValueOf2).doubleValue();
                    C1310750kDJ.LIZIZ(map2, "layoutStart", dValueOf2).doubleValue();
                    C1310750kDJ.LIZIZ(map2, "layoutEnd", dValueOf2).doubleValue();
                    C1310750kDJ.LIZIZ(map2, "drawStart", dValueOf2).doubleValue();
                    C1310750kDJ.LIZIZ(map2, "drawEnd", dValueOf2).doubleValue();
                }
            };
        } else {
            final HashMap map3 = new HashMap();
            new Object(map3) { // from class: X.0kDB
                {
                    C1310750kDJ.LIZLLL("hostPlatformType", map3);
                    Double dValueOf2 = Double.valueOf(-1.0d);
                    C1310750kDJ.LIZIZ(map3, "measureStart", dValueOf2).doubleValue();
                    C1310750kDJ.LIZIZ(map3, "measureEnd", dValueOf2).doubleValue();
                    C1310750kDJ.LIZIZ(map3, "layoutStart", dValueOf2).doubleValue();
                    C1310750kDJ.LIZIZ(map3, "layoutEnd", dValueOf2).doubleValue();
                    C1310750kDJ.LIZIZ(map3, "drawStart", dValueOf2).doubleValue();
                    C1310750kDJ.LIZIZ(map3, "drawEnd", dValueOf2).doubleValue();
                }
            };
        }
        if (map.get("actualFmp") != null) {
            new C1310810kDP((HashMap) map.get("actualFmp"));
        }
        if (map.get("lynxActualFmp") != null) {
            new C1310810kDP((HashMap) map.get("lynxActualFmp"));
        }
        if (map.get("totalActualFmp") != null) {
            new C1310810kDP((HashMap) map.get("totalActualFmp"));
        }
    }
}
