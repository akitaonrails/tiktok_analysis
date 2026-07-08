package X;

import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.ECHead;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0w4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766860w4y {
    public static final C1766860w4y LIZ = new C1766860w4y();

    public static String LIZIZ(String str) {
        String strLIZ;
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
        if (c2211641BhC != null) {
            LIZ.getClass();
            strLIZ = LIZ(str, c2211641BhC);
        } else {
            strLIZ = null;
        }
        C1766870w4z.LIZ.getClass();
        String strLIZJ = C1766870w4z.LIZJ(null, str, strLIZ);
        if (strLIZJ != null) {
            return strLIZJ;
        }
        return strLIZ;
    }

    public static Map LIZJ(String... strArr) {
        LinkedHashMap linkedHashMap;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        String str;
        Map<String, String> map;
        String str2;
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
        Map mapLJIILLIIL = null;
        if (c2211641BhC != null) {
            C1766860w4y c1766860w4y = LIZ;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            c1766860w4y.getClass();
            ArrayList<String> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C19719612Di.LJJII(arrayList, objArrCopyOf);
            C19719612Di.LJJII(arrayList2, objArrCopyOf);
            int i = 0;
            linkedHashMap = null;
            do {
                for (String str3 : arrayList) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("prefix_ec_params_");
                    sbLIZ.append(str3);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C1766890w51 c1766890w51 = c2211641BhC.LJJIZ;
                    if (c1766890w51 != null && (map = c1766890w51.LJ) != null && (str2 = map.get(strLIZIZ)) != null) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(str3, str2);
                        arrayList2.remove(str3);
                    } else {
                        ConcurrentHashMap<String, String> concurrentHashMap = c2211641BhC.LJJJ;
                        if (concurrentHashMap != null && (str = concurrentHashMap.get(strLIZIZ)) != null) {
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                            }
                            linkedHashMap.put(str3, str);
                            arrayList2.remove(str3);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    break;
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                c2211641BhC = c2211641BhC.LJIJ;
                i++;
                if (c2211641BhC == null) {
                    break;
                }
            } while (i <= 200);
        } else {
            linkedHashMap = null;
        }
        C1766870w4z c1766870w4z = C1766870w4z.LIZ;
        List<String> listLJJLL = C13LQ.LJJLL(strArr);
        c1766870w4z.getClass();
        if (!C1766870w4z.LIZIZ) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            Pair<Boolean, Boolean> bDBTMReplaceSwitch = ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getBDBTMReplaceSwitch();
            boolean zBooleanValue = bDBTMReplaceSwitch.getFirst().booleanValue();
            boolean zBooleanValue2 = bDBTMReplaceSwitch.getSecond().booleanValue();
            if (zBooleanValue) {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJLL, 10));
                for (String str4 : listLJJLL) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("prefix_ec_params_");
                    sbLIZ2.append(str4);
                    arrayList3.add(C2188811AlT.LIZIZ(sbLIZ2));
                }
                Map<String, Object> bcmParamsWithKey = BtmSDK.getBcmParamsWithKey(PageFinder.via((View) null), arrayList3, EnumC21242418Ba.EMPTY, C18BZ.APP_TAB, 20, true);
                if (bcmParamsWithKey != null) {
                    ArrayList arrayList4 = new ArrayList(bcmParamsWithKey.size());
                    for (Map.Entry<String, Object> entry : bcmParamsWithKey.entrySet()) {
                        arrayList4.add(new Pair(a0.LJJJJZ("prefix_ec_params_", entry.getKey()), entry.getValue().toString()));
                    }
                    mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList4);
                }
                if (C1767060w5I.LJI.sendDiffTrack) {
                    Pair[] pairArr = new Pair[4];
                    String strLIZLLL = C1280004ze.LIZLLL(arrayList3);
                    String str5 = "";
                    if (strLIZLLL == null) {
                        strLIZLLL = "";
                    }
                    pairArr[0] = new Pair("keys", strLIZLLL);
                    String strLIZLLL2 = C1280004ze.LIZLLL(mapLJIILLIIL);
                    if (strLIZLLL2 == null) {
                        strLIZLLL2 = "";
                    }
                    pairArr[1] = new Pair("bd_params", strLIZLLL2);
                    String strLIZLLL3 = C1280004ze.LIZLLL(linkedHashMap);
                    if (strLIZLLL3 != null) {
                        str5 = strLIZLLL3;
                    }
                    pairArr[2] = new Pair("tt_params", str5);
                    pairArr[3] = new Pair("type", "get_multi_ec_params");
                    C1018703yb.LIZIZ("btm_tt_switch_to_bd_diff", C2097608Jq.LJIIIIZZ(pairArr));
                }
                if (zBooleanValue2 && mapLJIILLIIL != null) {
                    return new LinkedHashMap(mapLJIILLIIL);
                }
                return linkedHashMap;
            }
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    public static Pair LIZLLL(int i) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        String str;
        String str2;
        boolean z;
        String name;
        Object obj = null;
        int i2 = 0;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        List<C2211641BhC> pageRecordChain = ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getPageRecordChain(true);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (C2211641BhC c2211641BhC : pageRecordChain) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C2211641BhC c2211641BhC2 = c2211641BhC;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ConcurrentHashMap<String, String> concurrentHashMap = c2211641BhC2.LJJJ;
                if (concurrentHashMap != null) {
                    linkedHashMap.putAll(concurrentHashMap);
                }
                LIZ.getClass();
                List listLJIILJJIL = C1697810uHb.LJIILJJIL("prefix_ec_params_search_jump_in_num", "prefix_ec_params_ec_has_search_container");
                if (!listLJIILJJIL.isEmpty()) {
                    Iterator it2 = listLJIILJJIL.iterator();
                    while (it2.hasNext()) {
                        linkedHashMap.remove(it2.next());
                    }
                }
                PageSource pageSource = new PageSource(c2211641BhC2.LIZIZ(), linkedHashMap);
                String str3 = c2211641BhC2.LJ;
                PageSource pageSource2 = (PageSource) C13LP.LJJJLZIJ(i3 - 1, arrayList);
                if (C770702zh.LIZIZ(str3) && pageSource2 != null) {
                    LIZ.getClass();
                    LJIIJ(str3, pageSource2);
                }
                arrayList.add(pageSource);
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        List<ECHead> list = C1956507lT.LIZ().ecHeadPageSet;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            PageSource pageSource3 = (PageSource) next;
            if (list != null) {
                boolean z2 = false;
                for (ECHead eCHead : list) {
                    if ((C770702zh.LIZIZ(eCHead.pageCode) && Intrinsics.LJFF(eCHead.pageCode, pageSource3.pageName)) || (str = eCHead.pageCode) == null || str.length() == 0) {
                        Map<String, String> map = eCHead.extra;
                        if (map != null) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                Map<String, String> map2 = pageSource3.extra;
                                if (map2 != null) {
                                    str2 = map2.get(entry.getKey());
                                } else {
                                    str2 = null;
                                }
                                Intrinsics.LJFF(str2, entry.getValue());
                            }
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    obj = next;
                    break;
                }
            }
        }
        PageSource pageSource4 = (PageSource) obj;
        int size = arrayList.size() - i;
        if (size >= 0) {
            i2 = size;
        }
        int size2 = arrayList.size();
        if (i2 > size2) {
            i2 = size2;
        }
        return new Pair(new PageSourceInfo(arrayList.subList(i2, arrayList.size()), pageSource4, null), pageRecordChain);
    }

    public static void LJIIIIZZ(String str) {
        C2211641BhC c2211641BhC;
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (C1956507lT.LIZ().pageSourceEnable == 1) {
            C2211621BhA.LIZ.getClass();
            C2211641BhC c2211641BhC2 = C2211621BhA.LIZJ;
            if (c2211641BhC2 != null && c2211641BhC2.LJJJ == null && c2211641BhC2 != null) {
                c2211641BhC2.LJJJ = new ConcurrentHashMap<>();
            }
            C1766870w4z.LIZ.getClass();
            if (C1766870w4z.LIZ("ec_search_root_enter_from_type") && (c2211641BhC = C2211621BhA.LIZJ) != null && (concurrentHashMap = c2211641BhC.LJJJ) != null) {
                concurrentHashMap.put("ec_search_root_enter_from_type", str);
            }
            C1766870w4z.LJFF("ec_search_root_enter_from_type", str, C13BV.INSTANCE, false);
        }
    }

    public static String LIZ(String str, C2211641BhC c2211641BhC) {
        String str2;
        Map<String, String> map;
        String str3;
        for (int i = 0; c2211641BhC != null && i <= 200; i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prefix_ec_params_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1766890w51 c1766890w51 = c2211641BhC.LJJIZ;
            if (c1766890w51 != null && (map = c1766890w51.LJ) != null && (str3 = map.get(strLIZIZ)) != null) {
                return str3;
            }
            ConcurrentHashMap<String, String> concurrentHashMap = c2211641BhC.LJJJ;
            if (concurrentHashMap != null && (str2 = concurrentHashMap.get(strLIZIZ)) != null) {
                return str2;
            }
            c2211641BhC = c2211641BhC.LJIJ;
        }
        return null;
    }

    public static void LJIIJ(String str, PageSource pageSource) {
        if (!u.LJIIZILJ(str, ".c0.d0", false)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() == 4 && u.LJJIIJZLJL((String) ListProtector.get(listLJJLIIIJILLIZJL, 2), "c", false) && !Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 2), "c0")) {
                if (pageSource.extra == null) {
                    pageSource.extra = new LinkedHashMap();
                }
                Map<String, String> map = pageSource.extra;
                if (map != null) {
                    map.put("ec_next_page_c_btm_code", (String) ListProtector.get(listLJJLIIIJILLIZJL, 2));
                }
            }
            if (listLJJLIIIJILLIZJL.size() == 4 && u.LJJIIJZLJL((String) ListProtector.get(listLJJLIIIJILLIZJL, 3), "d", false) && !Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 3), "d0")) {
                if (pageSource.extra == null) {
                    pageSource.extra = new LinkedHashMap();
                }
                Map<String, String> map2 = pageSource.extra;
                if (map2 != null) {
                    map2.put("ec_next_page_d_btm_code", (String) ListProtector.get(listLJJLIIIJILLIZJL, 3));
                }
            }
        }
    }

    public static void LJIIJJI(View view, SparkContext sparkContext) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (C1956507lT.LIZ().pageSourceEnable == 1) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            sparkContext.LJJLIIIJ(((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getPageRecordChainStringDataSubPage(view, true, sparkContext.LJIJI()), "btm_route_data");
            sparkContext.LJJLIIIJ(1, "priority_btm_route_data_has_set");
        }
    }

    public static PageSourceInfo LJ(C1766860w4y c1766860w4y, String str, int i) {
        PageSourceInfo pageSourceInfo;
        if ((i & 2) != 0) {
            str = null;
        }
        c1766860w4y.getClass();
        if (C1956507lT.LIZ().pageSourceEnable == 1) {
            pageSourceInfo = (PageSourceInfo) LIZLLL(C1956507lT.LIZ().maxPageSize).getFirst();
            if (pageSourceInfo.sourcePageList.isEmpty()) {
                C1AF0.LIZJ("PageSourceManager getPageSourceInfo sourcePageList is empty.");
            }
        } else {
            C1AF0.LIZJ("PageSourceManager getPageSourceInfo==null, settings fetch failed.");
            pageSourceInfo = null;
        }
        C1766870w4z.LIZ.getClass();
        PageSourceInfo pageSourceInfoLIZIZ = C1766870w4z.LIZIZ(null, pageSourceInfo, null, str);
        if (pageSourceInfoLIZIZ != null) {
            return pageSourceInfoLIZIZ;
        }
        return pageSourceInfo;
    }

    public static void LJIIIZ(View view, Fragment fragment, boolean z) {
        C2211641BhC c2211641BhCLIZLLL;
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str;
        if (C1956507lT.LIZ().pageSourceEnable == 1) {
            C2211621BhA.LIZ.getClass();
            C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
            if (c2211641BhC != null && c2211641BhC.LJJJ == null && c2211641BhC != null) {
                c2211641BhC.LJJJ = new ConcurrentHashMap<>();
            }
            if (view == null || (c2211641BhCLIZLLL = C2211621BhA.LIZLLL(view, null)) == null) {
                c2211641BhCLIZLLL = C2211621BhA.LIZJ;
            }
            C1766870w4z.LIZ.getClass();
            String str2 = "1";
            if (C1766870w4z.LIZ("ec_is_video_page") && c2211641BhCLIZLLL != null && (concurrentHashMap = c2211641BhCLIZLLL.LJJJ) != null) {
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                concurrentHashMap.put("ec_is_video_page", str);
            }
            List listLJIIJJI = C1697810uHb.LJIIJJI(PageFinder.via(fragment), PageFinder.via(view));
            if (!z) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C1766870w4z.LJFF("ec_is_video_page", str2, listLJIIJJI, false);
        }
    }

    public static void LJIILIIL(View view, Map map, boolean z) {
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhCLIZLLL = C2211621BhA.LIZLLL(view, null);
        if (c2211641BhCLIZLLL != null) {
            for (Map.Entry entry : map.entrySet()) {
                C1766860w4y c1766860w4y = LIZ;
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                c1766860w4y.getClass();
                LJIIZILJ(str, str2, c2211641BhCLIZLLL);
            }
        }
        if (z) {
            C1766870w4z c1766870w4z = C1766870w4z.LIZ;
            List listSingletonList = Collections.singletonList(PageFinder.via(view));
            c1766870w4z.getClass();
            C1766870w4z.LJ(true, listSingletonList, map);
        }
    }

    public static void LJIIZILJ(String str, String str2, C2211641BhC c2211641BhC) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (c2211641BhC.LJJJ == null) {
            c2211641BhC.LJJJ = new ConcurrentHashMap<>();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prefix_ec_params_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1766870w4z.LIZ.getClass();
        if (C1766870w4z.LIZ(strLIZIZ) && (concurrentHashMap = c2211641BhC.LJJJ) != null) {
            concurrentHashMap.put(strLIZIZ, str2);
        }
    }

    public static void LJIIL(C1766860w4y c1766860w4y, String str, String str2, String str3) {
        c1766860w4y.getClass();
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhCLJFF = C2211621BhA.LJFF(str3);
        if (c2211641BhCLJFF != null) {
            LIZ.getClass();
            LJIIZILJ(str, str2, c2211641BhCLJFF);
        }
        C1766870w4z c1766870w4z = C1766870w4z.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c1766870w4z.getClass();
        C1766870w4z.LJFF(str, str2, c13bv, true);
    }

    public static void LJIILL(PageFinder pageFinder, String str, String str2, boolean z) {
        List listSingletonList;
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
        if (c2211641BhC != null) {
            LIZ.getClass();
            LJIIZILJ(str, str2, c2211641BhC);
        }
        if (z) {
            C1766870w4z c1766870w4z = C1766870w4z.LIZ;
            if (pageFinder == null || (listSingletonList = Collections.singletonList(pageFinder)) == null) {
                listSingletonList = C13BV.INSTANCE;
            }
            c1766870w4z.getClass();
            C1766870w4z.LJFF(str, str2, listSingletonList, true);
        }
    }

    public static PageSourceInfo LJFF(C1766860w4y c1766860w4y, PageSource pageSource, String str, String str2, int i) {
        String str3;
        C1766890w51 c1766890w51;
        HashMap<String, HashSet<C2211641BhC>> map;
        PageSourceInfo pageSourceInfo = null;
        str = null;
        String str4 = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        c1766860w4y.getClass();
        if (C1956507lT.LIZ().pageSourceEnable == 1) {
            Pair pairLIZLLL = LIZLLL(C1956507lT.LIZ().maxPageSize - 1);
            PageSourceInfo pageSourceInfo2 = (PageSourceInfo) pairLIZLLL.getFirst();
            List list = (List) pairLIZLLL.getSecond();
            C2211641BhC c2211641BhC = (C2211641BhC) C13LP.LJJLIIIJL(list);
            C2211621BhA.LIZ.getClass();
            C2211641BhC c2211641BhC2 = C2211621BhA.LJ;
            if (c2211641BhC != null && (map = c2211641BhC.LJIJJLI) != null && (!map.isEmpty()) && c2211641BhC2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ConcurrentHashMap<String, String> concurrentHashMap = c2211641BhC2.LJJJ;
                if (concurrentHashMap != null) {
                    linkedHashMap.putAll(concurrentHashMap);
                }
                List listLJIILJJIL = C1697810uHb.LJIILJJIL("prefix_ec_params_search_jump_in_num", "prefix_ec_params_ec_has_search_container");
                if (!listLJIILJJIL.isEmpty()) {
                    Iterator it2 = listLJIILJJIL.iterator();
                    while (it2.hasNext()) {
                        linkedHashMap.remove(it2.next());
                    }
                }
                pageSourceInfo2.sourcePageList.add(new PageSource(c2211641BhC2.LIZIZ(), linkedHashMap));
            }
            C2211641BhC c2211641BhC3 = (C2211641BhC) C13LP.LJJLIIIJL(list);
            if (c2211641BhC3 != null) {
                C1766890w51 c1766890w512 = c2211641BhC3.LJJIZ;
                if (c1766890w512 != null) {
                    str3 = c1766890w512.LIZIZ;
                } else {
                    str3 = null;
                }
                if (C770702zh.LIZIZ(str3) && str3 != null) {
                    str4 = str3;
                } else {
                    C2211641BhC c2211641BhC4 = c2211641BhC3.LJIL;
                    if (c2211641BhC4 != null && (c1766890w51 = c2211641BhC4.LJJIZ) != null) {
                        str4 = c1766890w51.LIZIZ;
                    }
                }
                if (C770702zh.LIZIZ(str4)) {
                    List<PageSource> list2 = pageSourceInfo2.sourcePageList;
                    PageSource pageSource2 = (PageSource) C13LP.LJJJLZIJ(list2.size() - 1, list2);
                    if (pageSource2 != null) {
                        LIZ.getClass();
                        LJIIJ(str4, pageSource2);
                    }
                }
            }
            pageSourceInfo2.sourcePageList.add(pageSource);
            pageSourceInfo = pageSourceInfo2;
        }
        C1766870w4z.LIZ.getClass();
        PageSourceInfo pageSourceInfoLIZIZ = C1766870w4z.LIZIZ(pageSource, pageSourceInfo, str, str2);
        if (pageSourceInfoLIZIZ != null) {
            return pageSourceInfoLIZIZ;
        }
        return pageSourceInfo;
    }

    public static void LJI(View view, String str, String str2, Map map, InterfaceC2211711BhJ interfaceC2211711BhJ) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prefix_ec_params_");
                sbLIZ.append((String) entry.getKey());
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), entry.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        C2211631BhB.LJIJ(view, str, str2, linkedHashMap, interfaceC2211711BhJ);
    }
}
