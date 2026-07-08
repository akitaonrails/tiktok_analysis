package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0PUY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PUY {
    public static Map LIZ(Object obj) {
        String string;
        if (obj != null && (obj instanceof Map)) {
            C13DA c13da = new C13DA();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                String string2 = null;
                if (key != null) {
                    string = key.toString();
                } else {
                    string = null;
                }
                Object value = entry.getValue();
                if (value != null) {
                    string2 = value.toString();
                }
                if (C123100dR.LIZ(string) && C123100dR.LIZ(string2)) {
                    c13da.put(string, string2);
                }
            }
            return c13da.build();
        }
        return C2097608Jq.LJ();
    }

    public static C643420PLo LIZIZ(Map map, Map map2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        boolean zBooleanValue;
        Object obj8;
        Object obj9;
        String str;
        Object obj10;
        List list;
        Object obj11;
        Boolean bool;
        Object obj12;
        C0DYH c0dyh;
        Map map3;
        Boolean bool2;
        Object obj13;
        if (map != null) {
            try {
                obj = map.get("searchId");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                return null;
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            if (map != null && (obj2 = map.get("originType")) != null) {
                int iIntValue = ((Integer) obj2).intValue();
                if (map != null && (obj3 = map.get("awemeIDs")) != null) {
                    List list2 = (List) obj3;
                    if (map != null && (obj4 = map.get("entryAwemeID")) != null) {
                        String str2 = (String) obj4;
                        Object obj14 = "video";
                        if (map != null && (obj13 = map.get("tokenType")) != null) {
                            obj14 = obj13;
                        }
                        String str3 = (String) obj14;
                        if (map != null) {
                            obj5 = map.get("isLandingPage");
                        } else {
                            obj5 = null;
                        }
                        if (obj5 != null) {
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            if (map != null && (obj6 = map.get("needGeneralSearchVideos")) != null) {
                                boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
                                if (map != null) {
                                    obj7 = map.get("openKeyframePanel");
                                } else {
                                    obj7 = null;
                                }
                                if ((obj7 instanceof Boolean) && (bool2 = (Boolean) obj7) != null) {
                                    zBooleanValue = bool2.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                                if (map == null) {
                                    obj8 = null;
                                } else {
                                    obj8 = map.get("bundlerExtraParams");
                                }
                                if ((obj8 instanceof Map) && (map3 = (Map) obj8) != null) {
                                    obj9 = map3.get("openSubPanel");
                                } else {
                                    obj9 = null;
                                }
                                if (obj9 instanceof String) {
                                    str = (String) obj9;
                                } else {
                                    str = null;
                                }
                                if (map == null) {
                                    obj10 = null;
                                } else {
                                    obj10 = map.get("inflowCountAwemes");
                                }
                                if (obj10 instanceof List) {
                                    list = (List) obj10;
                                } else {
                                    list = null;
                                }
                                if (map == null) {
                                    obj11 = null;
                                } else {
                                    obj11 = map.get("shouldBackToEntry");
                                }
                                if (obj11 instanceof Boolean) {
                                    bool = (Boolean) obj11;
                                } else {
                                    bool = null;
                                }
                                if (map == null || (obj12 = map.get("loadMoreRequest")) == null) {
                                    obj12 = null;
                                }
                                HashMap map4 = (HashMap) obj12;
                                if (map4 != null) {
                                    Object obj15 = map4.get("url");
                                    if (obj15 != null) {
                                        c0dyh = new C0DYH((String) obj15, LIZ(map4.get("params")));
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                } else {
                                    c0dyh = null;
                                }
                                return new C643420PLo(iIntValue, list2, str2, str3, zBooleanValue2, zBooleanValue3, zBooleanValue, str, list, bool, c0dyh, LIZ(map2));
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
