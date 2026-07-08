package X;

import com.ss.android.ugc.aweme.minis.perf.prefetch.model.MinisPrefetchBody;
import com.ss.android.ugc.aweme.minis.perf.prefetch.model.MinisPrefetchParam;
import com.ss.android.ugc.aweme.minis.perf.prefetch.model.MinisPrefetchQuery;
import com.ss.android.ugc.aweme.minis.perf.prefetch.model.MinisPrefetchRoute;
import com.ss.android.ugc.aweme.minis.perf.prefetch.model.MinisPrefetchRouteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pFY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504340pFY {
    public static MinisPrefetchRoute LIZ(Object obj, String str) {
        Map map;
        MinisPrefetchRouteConfig minisPrefetchRouteConfig;
        String str2;
        String str3;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        if (obj instanceof List) {
            List listLJJJJLI = C13LP.LJJJJLI((Iterable) obj);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
            Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZ(it2.next(), str));
            }
            return (MinisPrefetchRoute) C13LP.LJJJJZI(arrayList);
        }
        if (obj instanceof Map) {
            MinisPrefetchRoute.Companion.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && (value instanceof Map) && (map = (Map) value) != null) {
                    String str15 = (String) key;
                    MinisPrefetchRouteConfig.Companion.getClass();
                    Object obj2 = map.get("url");
                    if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
                        Object obj3 = map.get("method");
                        if (!(obj3 instanceof String) || (str3 = (String) obj3) == null) {
                            str3 = "GET";
                        }
                        Object obj4 = map.get("headers");
                        if (obj4 instanceof Map) {
                            map2 = (Map) obj4;
                        } else {
                            map2 = null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        Object obj5 = map.get("params");
                        if (obj5 instanceof Map) {
                            map3 = (Map) obj5;
                        } else {
                            map3 = null;
                        }
                        if (map3 != null) {
                            for (Map.Entry entry2 : map3.entrySet()) {
                                String str16 = (String) entry2.getKey();
                                Map map6 = (Map) entry2.getValue();
                                MinisPrefetchParam.Companion.getClass();
                                Object obj6 = map6.get("type");
                                if (obj6 instanceof String) {
                                    str12 = (String) obj6;
                                } else {
                                    str12 = null;
                                }
                                Object obj7 = map6.get("from");
                                if (obj7 instanceof String) {
                                    str13 = (String) obj7;
                                } else {
                                    str13 = null;
                                }
                                Object obj8 = map6.get("key");
                                if (obj8 instanceof String) {
                                    str14 = (String) obj8;
                                } else {
                                    str14 = null;
                                }
                                if (str12 != null && str12.length() != 0 && str13 != null && str13.length() != 0 && str14 != null && str14.length() != 0) {
                                    arrayList2.add(new MinisPrefetchParam(str16, str12, str13, str14));
                                }
                            }
                        }
                        Object obj9 = map.get("query");
                        if (obj9 instanceof Map) {
                            map4 = (Map) obj9;
                        } else {
                            map4 = null;
                        }
                        if (map4 != null) {
                            for (Map.Entry entry3 : map4.entrySet()) {
                                String str17 = (String) entry3.getKey();
                                Object value2 = entry3.getValue();
                                if (value2 instanceof Map) {
                                    Map map7 = (Map) value2;
                                    if (map7 != null) {
                                        MinisPrefetchQuery.Companion.getClass();
                                        Object obj10 = map7.get("type");
                                        if (obj10 instanceof String) {
                                            str8 = (String) obj10;
                                        } else {
                                            str8 = null;
                                        }
                                        Object obj11 = map7.get("from");
                                        if (obj11 instanceof String) {
                                            str9 = (String) obj11;
                                        } else {
                                            str9 = null;
                                        }
                                        Object obj12 = map7.get("key");
                                        if (obj12 instanceof String) {
                                            str10 = (String) obj12;
                                        } else {
                                            str10 = null;
                                        }
                                        Object obj13 = map7.get("value");
                                        if (obj13 instanceof String) {
                                            str11 = (String) obj13;
                                        } else {
                                            str11 = null;
                                        }
                                        if (str8 != null && str8.length() != 0) {
                                            arrayList3.add(new MinisPrefetchQuery(str17, str8, str9, str10, str11));
                                        }
                                    }
                                } else if (value2 instanceof String) {
                                    MinisPrefetchQuery.Companion.getClass();
                                    arrayList3.add(new MinisPrefetchQuery(str17, "string", null, null, (String) value2));
                                }
                            }
                        }
                        Object obj14 = map.get("body");
                        if ((obj14 instanceof Map) && (map5 = (Map) obj14) != null) {
                            for (Map.Entry entry4 : map5.entrySet()) {
                                String str18 = (String) entry4.getKey();
                                Map map8 = (Map) entry4.getValue();
                                MinisPrefetchBody.Companion.getClass();
                                Object obj15 = map8.get("type");
                                if (obj15 instanceof String) {
                                    str4 = (String) obj15;
                                } else {
                                    str4 = null;
                                }
                                Object obj16 = map8.get("from");
                                if (obj16 instanceof String) {
                                    str5 = (String) obj16;
                                } else {
                                    str5 = null;
                                }
                                Object obj17 = map8.get("key");
                                if (obj17 instanceof String) {
                                    str6 = (String) obj17;
                                } else {
                                    str6 = null;
                                }
                                Object obj18 = map8.get("value");
                                if (obj18 instanceof String) {
                                    str7 = (String) obj18;
                                } else {
                                    str7 = null;
                                }
                                if (str4 != null && str4.length() != 0) {
                                    arrayList4.add(new MinisPrefetchBody(str18, str4, str5, str6, str7));
                                }
                            }
                        }
                        minisPrefetchRouteConfig = new MinisPrefetchRouteConfig(str15, str2, str3, map2, arrayList2, arrayList3, arrayList4);
                    } else {
                        minisPrefetchRouteConfig = null;
                    }
                    if (minisPrefetchRouteConfig != null) {
                        linkedHashMap.put(key, minisPrefetchRouteConfig);
                    }
                }
            }
            if (!linkedHashMap.isEmpty() && str.length() != 0) {
                return new MinisPrefetchRoute(str, linkedHashMap);
            }
            return null;
        }
        return null;
    }
}
