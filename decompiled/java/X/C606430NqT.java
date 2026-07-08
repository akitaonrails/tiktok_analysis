package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606430NqT {
    public static final C606430NqT LIZ = new C606430NqT();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"exposure_item_list", "exposure_item_list_v2", "click_pdp_seq_item_info_list", "clicked_item_list", "clicked_item_list_v2"});
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"clicked_timestamp", "timestamp", "stay_time", "source"});

    public static void LIZIZ(Map map, Map map2, C1771590wCb c1771590wCb) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (map == null) {
            if (map2 == null) {
                return;
            }
        } else if (map2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (LIZIZ.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                if (LIZIZ.contains(entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            ArrayList<String> arrayList = new ArrayList();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (!LIZ(linkedHashMap, linkedHashMap2, arrayList, "", linkedHashMap3, linkedHashSet)) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZ("DynamicVerifyDebug Differences found:");
                for (String str : arrayList) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DynamicVerifyDebug diff=: ");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LIZ(strLIZIZ);
                }
                try {
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("diff_fail_keys", C1741890vQh.LJIIIIZZ(C13LP.LLIIII(linkedHashSet)));
                    pairArr[1] = new Pair("runtime_params", C1741890vQh.LJIIIIZZ(linkedHashMap2));
                    pairArr[2] = new Pair("na_behavior_params", C1741890vQh.LJIIIIZZ(linkedHashMap));
                    pairArr[3] = new Pair("request_type", "refresh");
                    String str2 = c1771590wCb.LIZ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    pairArr[4] = new Pair("tab_id", str2);
                    C1768180w76.LIZ("rd_ec_mix_mall_double_check_behavior_params_fail", null, C2097608Jq.LJIIIIZZ(pairArr), false);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZ("DynamicVerifyDebug equaled");
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap);
                String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(linkedHashMap2);
                C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DynamicVerifyDebug nativeParams JSON: ");
                sbLIZ2.append(strLJIIIIZZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c2341109Fh2.getClass();
                C2341109Fh.LIZ(strLIZIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("DynamicVerifyDebug feParams JSON: ");
                sbLIZ3.append(strLJIIIIZZ2);
                C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            return;
        }
        C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("DynamicVerifyDebug null nativeParams = ");
        sbLIZ4.append(map);
        sbLIZ4.append(" , feParams = ");
        sbLIZ4.append(map2);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
        c2341109Fh3.getClass();
        C2341109Fh.LIZ(strLIZIZ3);
    }

    public static boolean LIZ(Map map, Map map2, List list, String str, Map map3, Set set) {
        String strLIZIZ;
        boolean z = true;
        for (String str2 : C15442062u.LJIIIZ(map.keySet(), map2.keySet())) {
            if (str.length() == 0) {
                strLIZIZ = str2;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('.');
                sbLIZ.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            Object obj = map.get(str2);
            Object obj2 = map2.get(str2);
            if (!LIZJ.contains(str2)) {
                List list2 = list;
                if ((obj instanceof Map) && (obj2 instanceof Map)) {
                    if (!LIZ((Map) obj, (Map) obj2, list2, strLIZIZ, map3, set)) {
                        if (str.length() == 0) {
                            set.add(str2);
                        }
                        z = false;
                    }
                } else if ((obj instanceof List) && (obj2 instanceof List)) {
                    List list3 = (List) obj;
                    List list4 = (List) obj2;
                    if (list3.size() != list4.size()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Difference at ");
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(": List sizes differ, na=");
                        sbLIZ2.append(list3.size());
                        sbLIZ2.append(" != fe=");
                        sbLIZ2.append(list4.size());
                        ((ArrayList) list2).add(C2188811AlT.LIZIZ(sbLIZ2));
                        if (strLIZIZ.length() == 0) {
                            map3.put(strLIZIZ, C2097608Jq.LJIIIIZZ(new Pair("na", list3), new Pair("fe", list4)));
                            set.add(strLIZIZ);
                        }
                    } else {
                        int size = list3.size();
                        boolean z2 = true;
                        for (int i = 0; i < size; i++) {
                            Object obj3 = ListProtector.get(list3, i);
                            Object obj4 = ListProtector.get(list4, i);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZIZ);
                            sbLIZ3.append('[');
                            sbLIZ3.append(i);
                            sbLIZ3.append(']');
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                            if ((obj3 instanceof Map) && (obj4 instanceof Map)) {
                                list2 = list2;
                                if (!LIZ((Map) obj3, (Map) obj4, list2, strLIZIZ2, map3, set)) {
                                    if (strLIZIZ.length() == 0) {
                                        set.add(strLIZIZ2);
                                    }
                                    z2 = false;
                                }
                            } else if (!Intrinsics.LJFF(obj3, obj4)) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("Difference at ");
                                sbLIZ4.append(strLIZIZ2);
                                sbLIZ4.append(": na=");
                                sbLIZ4.append(obj3);
                                sbLIZ4.append(" != fe=");
                                sbLIZ4.append(obj4);
                                ((ArrayList) list2).add(C2188811AlT.LIZIZ(sbLIZ4));
                                if (strLIZIZ.length() == 0) {
                                    map3.put(strLIZIZ, C2097608Jq.LJIIIIZZ(new Pair("na", list3), new Pair("fe", list4)));
                                    set.add(strLIZIZ);
                                }
                                z2 = false;
                            }
                        }
                        if (!z2) {
                        }
                    }
                    if (str.length() == 0) {
                        set.add(str2);
                    }
                    z = false;
                } else if (!Intrinsics.LJFF(obj, obj2)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strLIZIZ);
                    sbLIZ5.append(": na=");
                    sbLIZ5.append(obj);
                    sbLIZ5.append(" != fe=");
                    sbLIZ5.append(obj2);
                    ((ArrayList) list2).add(C2188811AlT.LIZIZ(sbLIZ5));
                    if (str.length() == 0) {
                        map3.put(str2, C2097608Jq.LJIIIIZZ(new Pair("na", obj), new Pair("fe", obj2)));
                        set.add(str2);
                    }
                    z = false;
                }
            }
        }
        return z;
    }
}
