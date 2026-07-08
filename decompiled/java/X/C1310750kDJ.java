package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kDJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310750kDJ {
    public static C1310800kDO LJ(ReadableMap readableMap) {
        HashMap<String, Object> mapAsHashMap = readableMap.asHashMap();
        String str = (String) mapAsHashMap.get("name");
        String str2 = (String) mapAsHashMap.get("entryType");
        if (str2.equals("pipeline") && str.equals("updateTriggeredByBts")) {
            C1310720kDG c1310720kDG = new C1310720kDG(readableMap.asHashMap());
            c1310720kDG.LIZJ = true;
            return c1310720kDG;
        }
        if (str2.equals("pipeline") && str.equals("updateTriggeredByNative")) {
            C1310720kDG c1310720kDG2 = new C1310720kDG(readableMap.asHashMap());
            c1310720kDG2.LIZJ = true;
            return c1310720kDG2;
        }
        if (str2.equals("pipeline") && str.equals("reactLynxHydrate")) {
            C1310720kDG c1310720kDG3 = new C1310720kDG(readableMap.asHashMap());
            c1310720kDG3.LIZJ = true;
            return c1310720kDG3;
        }
        if (str2.equals("pipeline") && str.equals("setNativeProps")) {
            C1310720kDG c1310720kDG4 = new C1310720kDG(readableMap.asHashMap());
            c1310720kDG4.LIZJ = true;
            return c1310720kDG4;
        }
        if (str2.equals("pipeline") && str.equals("updateGlobalProps")) {
            C1310720kDG c1310720kDG5 = new C1310720kDG(readableMap.asHashMap());
            c1310720kDG5.LIZJ = true;
            return c1310720kDG5;
        }
        if (str2.equals("pipeline") && str.equals("loadBundle")) {
            final HashMap<String, Object> mapAsHashMap2 = readableMap.asHashMap();
            C1310720kDG c1310720kDG6 = new C1310720kDG(mapAsHashMap2) { // from class: X.0kDH
                {
                    super(mapAsHashMap2);
                    Double dValueOf = Double.valueOf(-1.0d);
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "loadBundleStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "loadBundleEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "parseStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "parseEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "loadBackgroundStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "loadBackgroundEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "verifyTasmStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "verifyTasmEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "ffiStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "ffiEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "createLynxStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "createLynxEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "loadCoreStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "loadCoreEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "openTime", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "containerInitStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "containerInitEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "prepareTemplateStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap2, "prepareTemplateEnd", dValueOf).doubleValue();
                    if (mapAsHashMap2.get("fcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap2.get("fcp"));
                    }
                    if (mapAsHashMap2.get("lynxFcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap2.get("lynxFcp"));
                    } else {
                        new C1310810kDP(new HashMap());
                    }
                    if (mapAsHashMap2.get("totalFcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap2.get("totalFcp"));
                    }
                }
            };
            c1310720kDG6.LIZJ = true;
            return c1310720kDG6;
        }
        if (str2.equals("init") && str.equals("container")) {
            final HashMap<String, Object> mapAsHashMap3 = readableMap.asHashMap();
            C1310800kDO c1310800kDO = new C1310800kDO(mapAsHashMap3) { // from class: X.0kDE
                {
                    super(mapAsHashMap3);
                    Double dValueOf = Double.valueOf(-1.0d);
                    C1310750kDJ.LIZIZ(mapAsHashMap3, "openTime", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap3, "containerInitStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap3, "containerInitEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap3, "prepareTemplateStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap3, "prepareTemplateEnd", dValueOf).doubleValue();
                    if (mapAsHashMap3.get("extraTiming") != null) {
                        mapAsHashMap3.get("extraTiming");
                    } else {
                        new HashMap();
                    }
                }
            };
            c1310800kDO.LIZJ = true;
            return c1310800kDO;
        }
        if (str2.equals("init") && str.equals("lynxview")) {
            final HashMap<String, Object> mapAsHashMap4 = readableMap.asHashMap();
            C1310800kDO c1310800kDO2 = new C1310800kDO(mapAsHashMap4) { // from class: X.0kDN
                {
                    super(mapAsHashMap4);
                    Double dValueOf = Double.valueOf(-1.0d);
                    C1310750kDJ.LIZIZ(mapAsHashMap4, "createLynxStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap4, "createLynxEnd", dValueOf).doubleValue();
                }
            };
            c1310800kDO2.LIZJ = true;
            return c1310800kDO2;
        }
        if (str2.equals("init") && str.equals("backgroundRuntime")) {
            final HashMap<String, Object> mapAsHashMap5 = readableMap.asHashMap();
            C1310800kDO c1310800kDO3 = new C1310800kDO(mapAsHashMap5) { // from class: X.0kDM
                {
                    super(mapAsHashMap5);
                    Double dValueOf = Double.valueOf(-1.0d);
                    C1310750kDJ.LIZIZ(mapAsHashMap5, "loadCoreStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap5, "loadCoreEnd", dValueOf).doubleValue();
                }
            };
            c1310800kDO3.LIZJ = true;
            return c1310800kDO3;
        }
        if (str2.equals("metric") && str.equals("fcp")) {
            final HashMap<String, Object> mapAsHashMap6 = readableMap.asHashMap();
            C1310800kDO c1310800kDO4 = new C1310800kDO(mapAsHashMap6) { // from class: X.0kDR
                {
                    super(mapAsHashMap6);
                    if (mapAsHashMap6.get("fcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap6.get("fcp"));
                    } else {
                        new C1310810kDP(new HashMap());
                    }
                    if (mapAsHashMap6.get("lynxFcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap6.get("lynxFcp"));
                    } else {
                        new C1310810kDP(new HashMap());
                    }
                    if (mapAsHashMap6.get("totalFcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap6.get("totalFcp"));
                    } else {
                        new C1310810kDP(new HashMap());
                    }
                }
            };
            c1310800kDO4.LIZJ = true;
            return c1310800kDO4;
        }
        if (str2.equals("metric") && str.equals("fsp")) {
            C1310710kDF c1310710kDF = new C1310710kDF(readableMap.asHashMap());
            c1310710kDF.LIZJ = true;
            return c1310710kDF;
        }
        if (str2.equals("metric") && str.equals("actualFmp")) {
            final HashMap<String, Object> mapAsHashMap7 = readableMap.asHashMap();
            C1310800kDO c1310800kDO5 = new C1310800kDO(mapAsHashMap7) { // from class: X.0kDQ
                {
                    super(mapAsHashMap7);
                    if (mapAsHashMap7.get("actualFmp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap7.get("actualFmp"));
                    } else {
                        new C1310810kDP(new HashMap());
                    }
                    if (mapAsHashMap7.get("lynxActualFmp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap7.get("lynxActualFmp"));
                    } else {
                        new C1310810kDP(new HashMap());
                    }
                    if (mapAsHashMap7.get("totalActualFmp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap7.get("totalActualFmp"));
                    } else {
                        new C1310810kDP(new HashMap());
                    }
                }
            };
            c1310800kDO5.LIZJ = true;
            return c1310800kDO5;
        }
        if (str2.equals("pipeline") && str.equals("reloadBundleFromNative")) {
            final HashMap<String, Object> mapAsHashMap8 = readableMap.asHashMap();
            C1310720kDG c1310720kDG7 = new C1310720kDG(mapAsHashMap8) { // from class: X.0kDI
                {
                    super(mapAsHashMap8);
                    Double dValueOf = Double.valueOf(-1.0d);
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "reloadBundleStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "reloadBundleEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "reloadBackgroundStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "reloadBackgroundEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "ffiStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "ffiEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "createLynxStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "createLynxEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "loadCoreStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "loadCoreEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "openTime", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "containerInitStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "containerInitEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "prepareTemplateStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap8, "prepareTemplateEnd", dValueOf).doubleValue();
                    if (mapAsHashMap8.get("fcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap8.get("fcp"));
                    }
                    if (mapAsHashMap8.get("lynxFcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap8.get("lynxFcp"));
                    } else {
                        new C1310810kDP(new HashMap());
                    }
                    if (mapAsHashMap8.get("totalFcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap8.get("totalFcp"));
                    }
                }
            };
            c1310720kDG7.LIZJ = true;
            return c1310720kDG7;
        }
        if (str2.equals("pipeline") && str.equals("reloadBundleFromBts")) {
            final HashMap<String, Object> mapAsHashMap9 = readableMap.asHashMap();
            C1310720kDG c1310720kDG8 = new C1310720kDG(mapAsHashMap9) { // from class: X.0kDI
                {
                    super(mapAsHashMap9);
                    Double dValueOf = Double.valueOf(-1.0d);
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "reloadBundleStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "reloadBundleEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "reloadBackgroundStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "reloadBackgroundEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "ffiStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "ffiEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "createLynxStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "createLynxEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "loadCoreStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "loadCoreEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "openTime", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "containerInitStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "containerInitEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "prepareTemplateStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap9, "prepareTemplateEnd", dValueOf).doubleValue();
                    if (mapAsHashMap9.get("fcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap9.get("fcp"));
                    }
                    if (mapAsHashMap9.get("lynxFcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap9.get("lynxFcp"));
                    } else {
                        new C1310810kDP(new HashMap());
                    }
                    if (mapAsHashMap9.get("totalFcp") != null) {
                        new C1310810kDP((HashMap) mapAsHashMap9.get("totalFcp"));
                    }
                }
            };
            c1310720kDG8.LIZJ = true;
            return c1310720kDG8;
        }
        if (str2.equals("memory") && str.equals("memory")) {
            C1310840kDS c1310840kDS = new C1310840kDS(readableMap.asHashMap());
            c1310840kDS.LIZJ = true;
            return c1310840kDS;
        }
        if (str2.equals("resource") && str.equals("lazyBundle")) {
            final HashMap<String, Object> mapAsHashMap10 = readableMap.asHashMap();
            C1310800kDO c1310800kDO6 = new C1310800kDO(mapAsHashMap10) { // from class: X.0kDL
                {
                    super(mapAsHashMap10);
                    C1310750kDJ.LIZLLL("componentUrl", mapAsHashMap10);
                    C1310750kDJ.LIZLLL("mode", mapAsHashMap10);
                    Double dValueOf = Double.valueOf(-1.0d);
                    C1310750kDJ.LIZIZ(mapAsHashMap10, "size", dValueOf).doubleValue();
                    Boolean bool = Boolean.FALSE;
                    C1310750kDJ.LIZ(mapAsHashMap10, "sync", bool).booleanValue();
                    C1310750kDJ.LIZ(mapAsHashMap10, "loadSuccess", bool).booleanValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap10, "requireStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap10, "requireEnd", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap10, "decodeStart", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap10, "decodeEnd", dValueOf).doubleValue();
                }
            };
            c1310800kDO6.LIZJ = true;
            return c1310800kDO6;
        }
        if (str2.equals("jsBlocking") && str.equals("jsBlocking")) {
            final HashMap<String, Object> mapAsHashMap11 = readableMap.asHashMap();
            C1310800kDO c1310800kDO7 = new C1310800kDO(mapAsHashMap11) { // from class: X.0kDV
                {
                    super(mapAsHashMap11);
                    C1310750kDJ.LIZLLL("stage", mapAsHashMap11);
                    Double dValueOf = Double.valueOf(-1.0d);
                    C1310750kDJ.LIZIZ(mapAsHashMap11, "total_blocking_time", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap11, "total_blocking_count", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap11, "total_duration", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap11, "blocking_ratio", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap11, "avg_blocking_time", dValueOf).doubleValue();
                    C1310750kDJ.LIZIZ(mapAsHashMap11, "time_after_fcp", dValueOf).doubleValue();
                }
            };
            c1310800kDO7.LIZJ = true;
            return c1310800kDO7;
        }
        C1310800kDO c1310800kDO8 = new C1310800kDO(readableMap.asHashMap());
        c1310800kDO8.LIZJ = false;
        return c1310800kDO8;
    }

    public static Long LIZJ(Long l, HashMap map) {
        Object obj = map.get("sizeBytes");
        if (obj == null) {
            return l;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(CastLongProtector.parseLong((String) obj));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return l;
            }
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        return l;
    }

    public static String LIZLLL(String str, HashMap map) {
        Object obj = map.get(str);
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return String.valueOf(obj);
    }

    public static Boolean LIZ(HashMap<String, Object> map, String str, Boolean bool) {
        boolean z;
        Object obj = map.get(str);
        if (obj == null) {
            return bool;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (obj instanceof String) {
            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
        }
        return bool;
    }

    public static Double LIZIZ(HashMap<String, Object> map, String str, Double d) {
        Object obj = map.get(str);
        if (obj == null) {
            return d;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(CastDoubleProtector.parseDouble((String) obj));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return d;
            }
        }
        if (obj instanceof Boolean) {
            return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
        }
        return d;
    }
}
