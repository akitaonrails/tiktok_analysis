package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0R26, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R26 implements C14NJ {
    @Override // X.C14NJ
    public final String getName() {
        return "openSchema";
    }

    public static Object LIZIZ(C14NX c14nx, Object obj) {
        String string;
        Object objLJ;
        if (obj instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key == null || (objLJ = c14nx.LJ(key)) == null || (string = objLJ.toString()) == null) {
                    string = "";
                }
                Pair pair = new Pair(string, LIZIZ(c14nx, value));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return GsonProtectorUtils.toJson(new Gson(), linkedHashMap);
        }
        if (obj != null) {
            return c14nx.LJ(obj);
        }
        return null;
    }

    @Override // X.C14NJ
    public final void LIZ(Map<String, ? extends Object> map, C14NX c14nx, Map<String, ? extends Object> map2, C14NF c14nf) {
        Object objLJ;
        String str;
        Map map3;
        Object objLJ2;
        LinkedHashMap linkedHashMap;
        Map map4;
        Set<Map.Entry> setEntrySet;
        String string;
        Object objLJ3;
        Object objLJ4;
        String string2;
        String string3;
        if (map == null) {
            return;
        }
        Object obj = map.get("url");
        if (obj != null) {
            objLJ = c14nx.LJ(obj);
        } else {
            objLJ = null;
        }
        if ((objLJ instanceof String) && (str = (String) objLJ) != null) {
            Object obj2 = map.get("routerParams");
            if ((obj2 instanceof Map) && (map3 = (Map) obj2) != null) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c14nx.getView().getContext(), str);
                Iterator it2 = map3.entrySet().iterator();
                while (true) {
                    String str2 = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key != null && (objLJ4 = c14nx.LJ(key)) != null && (string2 = objLJ4.toString()) != null) {
                        Object objLIZIZ = LIZIZ(c14nx, value);
                        if (objLIZIZ instanceof Boolean) {
                            smartRouteBuildRoute.withParam(string2, ((Boolean) objLIZIZ).booleanValue());
                        } else if (objLIZIZ instanceof Integer) {
                            smartRouteBuildRoute.withParam(string2, ((Number) objLIZIZ).intValue());
                        } else if (objLIZIZ instanceof Long) {
                            smartRouteBuildRoute.withParam(string2, ((Number) objLIZIZ).longValue());
                        } else if (objLIZIZ instanceof Float) {
                            smartRouteBuildRoute.withParam(string2, ((Number) objLIZIZ).floatValue());
                        } else if (objLIZIZ instanceof Double) {
                            smartRouteBuildRoute.withParam(string2, ((Number) objLIZIZ).doubleValue());
                        } else {
                            if (objLIZIZ != null && (string3 = objLIZIZ.toString()) != null) {
                                str2 = string3;
                            }
                            smartRouteBuildRoute.withParam(string2, str2);
                        }
                    }
                }
                Object obj3 = map.get("biz_log_extra");
                if (obj3 != null) {
                    objLJ2 = c14nx.LJ(obj3);
                } else {
                    objLJ2 = null;
                }
                if ((objLJ2 instanceof Map) && (map4 = (Map) objLJ2) != null && (setEntrySet = map4.entrySet()) != null) {
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (Map.Entry entry2 : setEntrySet) {
                        Object key2 = entry2.getKey();
                        Object value2 = entry2.getValue();
                        if (key2 == null || (objLJ3 = c14nx.LJ(key2)) == null || (string = objLJ3.toString()) == null) {
                            string = "";
                        }
                        Pair pair = new Pair(string, LIZIZ(c14nx, value2));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                } else {
                    linkedHashMap = null;
                }
                INimbleModelAbility iNimbleModelAbility = (INimbleModelAbility) C1558520qew.LIZ(c14nx.LIZIZ(), INimbleModelAbility.class, null);
                if (iNimbleModelAbility != null) {
                    iNimbleModelAbility.Yw1(linkedHashMap);
                }
                smartRouteBuildRoute.open();
            }
        }
    }
}
