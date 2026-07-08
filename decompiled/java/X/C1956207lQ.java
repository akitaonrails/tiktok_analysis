package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07lQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1956207lQ implements InterfaceC1769890w9r {
    public static final C01GW<Boolean> LIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(386));
    public static final C01GW<Map<String, Map<String, Object>>> LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1283));

    @Override // X.InterfaceC1769890w9r
    public final boolean LIZIZ(String str) {
        if (C1956307lR.LIZ().keySet().contains("*")) {
            return true;
        }
        return C1956307lR.LIZ().keySet().contains(str);
    }

    @Override // X.InterfaceC1769890w9r
    public final void LIZ(SparkContext sparkContext, String str, String str2) {
        Object c098200Yq;
        LinkedHashMap linkedHashMap;
        Map map;
        Double d;
        Boolean bool;
        String str3;
        try {
            sparkContext.LJJLIIIJ(C1741890vQh.LJIIIIZZ(C1956507lT.LIZ()), "ec_page_source_config");
            Map map2 = (Map) C1956307lR.LIZ().get("*");
            if (map2 != null) {
                sparkContext.LJJLIIIJILLIZJL(map2);
            }
            Map map3 = (Map) C1956307lR.LIZ().get(str2);
            if (map3 != null) {
                for (Map.Entry entry : map3.entrySet()) {
                    if (Intrinsics.LJFF(entry.getKey(), EnumC1980107pH.PLATFORM_CONFIG.getKey())) {
                        Object value = entry.getValue();
                        if ((value instanceof Map) && (map = (Map) value) != null) {
                            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                            for (Object obj : map.entrySet()) {
                                Object key = ((Map.Entry) obj).getKey();
                                Object value2 = ((Map.Entry) obj).getValue();
                                if (value2 instanceof Double) {
                                    int iDoubleValue = (int) ((Number) value2).doubleValue();
                                    if (Double.compare(((Number) value2).doubleValue(), iDoubleValue) == 0) {
                                        value2 = Integer.valueOf(iDoubleValue);
                                    }
                                }
                                linkedHashMap.put(key, value2);
                            }
                        } else {
                            linkedHashMap = null;
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (linkedHashMap != null) {
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                jSONObject.put((String) entry2.getKey(), entry2.getValue());
                            }
                        }
                        EnumC1980107pH enumC1980107pH = EnumC1980107pH.PLATFORM_CONFIG;
                        sparkContext.lynxViewConfig = C2097608Jq.LJI(new Pair(enumC1980107pH.getKey(), C786410Ut5.J3(jSONObject)));
                        if (LIZ.getValue().booleanValue()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("native_");
                            sbLIZ.append(enumC1980107pH.getKey());
                            sparkContext.LJJLIIIJ(jSONObject, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        sparkContext.LJJLIIIJ(entry.getValue(), (String) entry.getKey());
                        Set<String> set = C1239304t5.LIZ;
                        if (C1239304t5.LIZ((String) entry.getKey())) {
                            Object value3 = entry.getValue();
                            if (value3 instanceof Number) {
                                Object value4 = entry.getValue();
                                if ((value4 instanceof Double) && (d = (Double) value4) != null) {
                                    double dDoubleValue = d.doubleValue();
                                    int i = (int) dDoubleValue;
                                    if (Double.compare(dDoubleValue, i) == 0) {
                                        sparkContext.LJJJLZIJ(i, (String) entry.getKey());
                                    } else {
                                        sparkContext.LJJJLL(dDoubleValue, (String) entry.getKey());
                                    }
                                }
                            } else if (value3 instanceof Boolean) {
                                Object value5 = entry.getValue();
                                if ((value5 instanceof Boolean) && (bool = (Boolean) value5) != null) {
                                    sparkContext.LJJL((String) entry.getKey(), bool.booleanValue());
                                }
                            } else if (value3 instanceof String) {
                                Object value6 = entry.getValue();
                                if ((value6 instanceof String) && (str3 = (String) value6) != null) {
                                    sparkContext.LJJJZ((String) entry.getKey(), str3);
                                }
                            }
                        }
                    }
                }
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1019103yf.LIZ(EnumC1014603xw.ERR8, thM5exceptionOrNullimpl, null);
        }
    }
}
