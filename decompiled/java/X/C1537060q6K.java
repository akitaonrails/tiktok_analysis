package X;

import android.content.Context;
import android.util.LruCache;
import android.view.View;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q6K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537060q6K {
    public static Map LJFF() {
        return C1529590puH.LIZIZ.getValue();
    }

    public static C1051630dTN LJI(String str) {
        return (C1051630dTN) LJFF().get(C1541030qCj.LIZ(str));
    }

    public static boolean LJIIIIZZ(String str) {
        if (C1529590puH.LJIIIIZZ.getValue().booleanValue()) {
            return true;
        }
        Set<String> value = C1529590puH.LJII.getValue();
        if (value != null) {
            return value.contains(str);
        }
        return false;
    }

    public static void LJIILIIL(List list) {
        C1529590puH.LIZLLL = list;
    }

    public static void LJIILJJIL(List list) {
        C1529590puH.LJ = list;
    }

    public static void LJIILL(String str) {
        LruCache<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> lruCache;
        Map<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> mapSnapshot;
        String strLIZ = C1541030qCj.LIZ(str);
        if (LJIIIIZZ(strLIZ)) {
            InterfaceC1532860pzY.LIZ.getClass();
            InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
            if (interfaceC1532860pzY != null) {
                interfaceC1532860pzY.LJII("", strLIZ);
            }
        } else {
            C1051630dTN c1051630dTN = (C1051630dTN) LJFF().get(strLIZ);
            if (c1051630dTN != null && c1051630dTN.LJI) {
                InterfaceC1532860pzY.LIZ.getClass();
                InterfaceC1532860pzY interfaceC1532860pzY2 = C1532910pzd.LIZJ;
                if (interfaceC1532860pzY2 != null) {
                    interfaceC1532860pzY2.LJII("", strLIZ);
                }
            }
        }
        C1051630dTN c1051630dTN2 = (C1051630dTN) LJFF().remove(strLIZ);
        if (c1051630dTN2 != null && (lruCache = c1051630dTN2.LJIIJ) != null && (mapSnapshot = lruCache.snapshot()) != null) {
            Iterator<Map.Entry<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>>> it2 = mapSnapshot.entrySet().iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = it2.next().getValue().iterator();
                while (it3.hasNext()) {
                    InterfaceC1540940qCa interfaceC1540940qCa = (InterfaceC1540940qCa) ((SoftReference) it3.next()).get();
                    if (interfaceC1540940qCa != null) {
                        interfaceC1540940qCa.release();
                    }
                }
            }
        }
    }

    public static boolean LIZ(String str, String str2) {
        LruCache<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> lruCache;
        Map<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> mapSnapshot;
        CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>> copyOnWriteArrayList;
        Integer numValueOf;
        C1051630dTN c1051630dTNLJI = LJI(str);
        if (c1051630dTNLJI != null && (lruCache = c1051630dTNLJI.LJIIJ) != null && (mapSnapshot = lruCache.snapshot()) != null && (copyOnWriteArrayList = mapSnapshot.get(str2)) != null && (numValueOf = Integer.valueOf(copyOnWriteArrayList.size())) != null && numValueOf.intValue() > 0) {
            return true;
        }
        return false;
    }

    public static InterfaceC1540940qCa LJII(C1537480q70 c1537480q70, CopyOnWriteArrayList copyOnWriteArrayList) {
        Object next;
        InterfaceC1540940qCa interfaceC1540940qCa;
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterfaceC1540940qCa interfaceC1540940qCa2 = (InterfaceC1540940qCa) ((SoftReference) next).get();
                if (interfaceC1540940qCa2 != null) {
                    C1537060q6K c1537060q6K = C1529590puH.LIZ;
                    if (C1540320qBa.LIZ(interfaceC1540940qCa2.LJIILJJIL(), c1537480q70)) {
                        break;
                    }
                    C1490740otc.LIZ.LIZ("the theme of preloaded view is inconsistent", EnumC1490770otf.E, "PreloadTool");
                }
            } else {
                next = null;
                break;
            }
        }
        SoftReference softReference = (SoftReference) next;
        if (softReference == null || (interfaceC1540940qCa = (InterfaceC1540940qCa) softReference.get()) == null) {
            return null;
        }
        copyOnWriteArrayList.remove(softReference);
        return interfaceC1540940qCa;
    }

    public static void LJIIL(C1051630dTN c1051630dTN, Boolean bool) {
        String str;
        if (LJIIIIZZ(c1051630dTN.LIZ) || c1051630dTN.LJI) {
            InterfaceC1532860pzY.LIZ.getClass();
            InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
            if (interfaceC1532860pzY != null) {
                interfaceC1532860pzY.LJIIJ(c1051630dTN);
            }
        }
        if (c1051630dTN.LIZ() == 1) {
            if (((C1097680efe) c1051630dTN).LJIIZILJ) {
                if (c1051630dTN.LJII != 0) {
                    Map mapLJFF = LJFF();
                    String strLIZ = C1541030qCj.LIZ(c1051630dTN.LIZ);
                    if (mapLJFF.get(strLIZ) == null) {
                        mapLJFF.put(strLIZ, c1051630dTN);
                    }
                } else {
                    LJFF().put(C1541030qCj.LIZ(c1051630dTN.LIZ), c1051630dTN);
                }
            }
        } else if (c1051630dTN.LJII != 0) {
            Map mapLJFF2 = LJFF();
            String strLIZ2 = C1541030qCj.LIZ(c1051630dTN.LIZ);
            if (mapLJFF2.get(strLIZ2) == null) {
                mapLJFF2.put(strLIZ2, c1051630dTN);
            }
        } else {
            LJFF().put(C1541030qCj.LIZ(c1051630dTN.LIZ), c1051630dTN);
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str = "jsb";
        } else {
            str = "native";
        }
        C1520080pew.LJFF(null, "container_prerender", "config", str, null, null, C1541030qCj.LIZ(c1051630dTN.LIZ), null, 177);
    }

    public static void LIZIZ(String str, String str2, C1537480q70 c1537480q70) {
        boolean z;
        Iterator<Map.Entry<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>>> it2;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (str.length() == 0) {
                if (LJIIIIZZ(str2)) {
                    InterfaceC1532860pzY.LIZ.getClass();
                    InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
                    if (interfaceC1532860pzY != null) {
                        interfaceC1532860pzY.LJII(str, str2);
                    }
                }
                Iterator it3 = LJFF().entrySet().iterator();
                while (it3.hasNext()) {
                    C1051630dTN c1051630dTN = (C1051630dTN) ((Map.Entry) it3.next()).getValue();
                    Map<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> mapSnapshot = c1051630dTN.LJIIJ.snapshot();
                    if (mapSnapshot != null && (it2 = mapSnapshot.entrySet().iterator()) != null) {
                        while (it2.hasNext()) {
                            CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>> copyOnWriteArrayListRemove = c1051630dTN.LJIIJ.remove(it2.next().getKey());
                            if (copyOnWriteArrayListRemove != null) {
                                Iterator<SoftReference<InterfaceC1540940qCa>> it4 = copyOnWriteArrayListRemove.iterator();
                                while (it4.hasNext()) {
                                    InterfaceC1540940qCa interfaceC1540940qCa = it4.next().get();
                                    if (interfaceC1540940qCa != null) {
                                        interfaceC1540940qCa.release();
                                    }
                                }
                            }
                        }
                    }
                }
                LJFF().clear();
                return;
            }
            return;
        }
        String strLIZ = C1541030qCj.LIZ(str2);
        if (LJIIIIZZ(strLIZ)) {
            InterfaceC1532860pzY.LIZ.getClass();
            InterfaceC1532860pzY interfaceC1532860pzY2 = C1532910pzd.LIZJ;
            if (interfaceC1532860pzY2 != null) {
                interfaceC1532860pzY2.LJII(str, strLIZ);
            }
        }
        C1051630dTN c1051630dTN2 = (C1051630dTN) LJFF().get(strLIZ);
        if (c1051630dTN2 != null) {
            if (c1051630dTN2.LJI) {
                InterfaceC1532860pzY.LIZ.getClass();
                InterfaceC1532860pzY interfaceC1532860pzY3 = C1532910pzd.LIZJ;
                if (interfaceC1532860pzY3 != null) {
                    interfaceC1532860pzY3.LJII(str, strLIZ);
                }
            }
            if (str.length() == 0) {
                Map<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> mapSnapshot2 = c1051630dTN2.LJIIJ.snapshot();
                if (mapSnapshot2 != null && (r5 = mapSnapshot2.entrySet().iterator()) != null) {
                    for (Map.Entry<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> entry : mapSnapshot2.entrySet()) {
                        c1051630dTN2.LJIIJ.remove(entry.getKey());
                        Iterator<T> it5 = entry.getValue().iterator();
                        while (it5.hasNext()) {
                            InterfaceC1540940qCa interfaceC1540940qCa2 = (InterfaceC1540940qCa) ((SoftReference) it5.next()).get();
                            if (interfaceC1540940qCa2 != null) {
                                interfaceC1540940qCa2.release();
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (c1051630dTN2.LIZ() == 1) {
                Map<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> mapSnapshot3 = c1051630dTN2.LJIIJ.snapshot();
                if (mapSnapshot3 != null && (r5 = mapSnapshot3.entrySet().iterator()) != null) {
                    for (Map.Entry<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> entry2 : mapSnapshot3.entrySet()) {
                        if (c1051630dTN2.LJIIIIZZ.invoke(entry2.getKey(), str).booleanValue() || c1051630dTN2.LJIIIZ.invoke(entry2.getKey(), str, c1537480q70).booleanValue()) {
                            c1051630dTN2.LJIIJ.remove(entry2.getKey());
                            Iterator<T> it6 = entry2.getValue().iterator();
                            while (it6.hasNext()) {
                                InterfaceC1540940qCa interfaceC1540940qCa3 = (InterfaceC1540940qCa) ((SoftReference) it6.next()).get();
                                if (interfaceC1540940qCa3 != null) {
                                    interfaceC1540940qCa3.release();
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>> copyOnWriteArrayListRemove2 = c1051630dTN2.LJIIJ.remove(str);
            if (copyOnWriteArrayListRemove2 != null) {
                Iterator<SoftReference<InterfaceC1540940qCa>> it7 = copyOnWriteArrayListRemove2.iterator();
                while (it7.hasNext()) {
                    InterfaceC1540940qCa interfaceC1540940qCa4 = it7.next().get();
                    if (interfaceC1540940qCa4 != null) {
                        interfaceC1540940qCa4.release();
                    }
                }
            }
        }
    }

    public static InterfaceC1105930esx LIZJ(Context context, String str, String str2) {
        return (InterfaceC1105930esx) LIZLLL(context, str, str2, null, null);
    }

    public static void LJIIIZ(String str, String str2, C1537480q70 c1537480q70, int i) {
        C1537480q70 c1537480q702 = c1537480q70;
        String str3 = str2;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        if ((i & 2) != 0) {
            str3 = "";
        }
        if ((i & 4) != 0) {
            c1537480q702 = null;
        }
        LJIIJJI(c1537060q6K, str, str3, c1537480q702, null, false, null, 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1540940qCa LIZLLL(Context context, String str, String str2, C1537070q6L c1537070q6L, C1537480q70 c1537480q70) {
        long viewCreatedTime;
        InterfaceC1540940qCa interfaceC1540940qCa;
        AbstractC1537120q6Q abstractC1537120q6Q;
        AbstractC1537120q6Q abstractC1537120q6Q2;
        C1537480q70 c1537480q70LJIILJJIL;
        View view;
        InterfaceC1540940qCa interfaceC1540940qCaLJ;
        long viewCreatedTime2;
        InterfaceC1540940qCa interfaceC1540940qCaLJ2;
        String strLIZ = C1541030qCj.LIZ(str2);
        if (LJIIIIZZ(strLIZ)) {
            InterfaceC1532860pzY.LIZ.getClass();
            InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
            if (interfaceC1532860pzY != null) {
                interfaceC1540940qCaLJ2 = interfaceC1532860pzY.LJ(context, c1537480q70, str, strLIZ);
            } else {
                interfaceC1540940qCaLJ2 = null;
            }
            if ((interfaceC1540940qCaLJ2 instanceof InterfaceC1540940qCa) && interfaceC1540940qCaLJ2 != null) {
                return interfaceC1540940qCaLJ2;
            }
        }
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LJI.LIZ == C00YJ.WHEN_FETCH) {
            Iterator it2 = LJFF().entrySet().iterator();
            while (it2.hasNext()) {
                C1051630dTN c1051630dTN = (C1051630dTN) ((Map.Entry) it2.next()).getValue();
                if (c1051630dTN.LIZ() == 1) {
                    if (((C1097680efe) c1051630dTN).LJIJI != -1) {
                        Iterator<Map.Entry<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>>> it3 = c1051630dTN.LJIIJ.snapshot().entrySet().iterator();
                        while (it3.hasNext()) {
                            Iterator<SoftReference<InterfaceC1540940qCa>> it4 = it3.next().getValue().iterator();
                            while (it4.hasNext()) {
                                SoftReference<InterfaceC1540940qCa> next = it4.next();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                InterfaceC1540940qCa interfaceC1540940qCa2 = next.get();
                                if (interfaceC1540940qCa2 != null) {
                                    viewCreatedTime2 = interfaceC1540940qCa2.getViewCreatedTime();
                                } else {
                                    viewCreatedTime2 = 0;
                                }
                                if (jCurrentTimeMillis - viewCreatedTime2 >= r8.LJIJI * LSPassThroughRecordSizeConfig.DEFAULT) {
                                    InterfaceC1540940qCa interfaceC1540940qCa3 = next.get();
                                    if (interfaceC1540940qCa3 != null) {
                                        interfaceC1540940qCa3.release();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                    }
                }
            }
        }
        C1051630dTN c1051630dTN2 = (C1051630dTN) LJFF().get(strLIZ);
        if (c1051630dTN2 == null) {
            if (c1537070q6L != null) {
                c1537070q6L.LIZ(str, new C1537080q6M("biz not register preloadInfo"));
            }
            return null;
        }
        if (c1051630dTN2.LJI) {
            InterfaceC1532860pzY.LIZ.getClass();
            InterfaceC1532860pzY interfaceC1532860pzY2 = C1532910pzd.LIZJ;
            if (interfaceC1532860pzY2 != null) {
                interfaceC1540940qCaLJ = interfaceC1532860pzY2.LJ(context, c1537480q70, str, strLIZ);
            } else {
                interfaceC1540940qCaLJ = null;
            }
            if ((interfaceC1540940qCaLJ instanceof InterfaceC1540940qCa) && interfaceC1540940qCaLJ != null) {
                return interfaceC1540940qCaLJ;
            }
        }
        InterfaceC1540940qCa interfaceC1540940qCaLJII = 0;
        for (Map.Entry<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>> entry : c1051630dTN2.LJIIJ.snapshot().entrySet()) {
            if (c1051630dTN2.LJIIIIZZ.invoke(str, entry.getKey()).booleanValue() || c1051630dTN2.LJIIIZ.invoke(str, entry.getKey(), c1537480q70).booleanValue()) {
                int iLIZ = c1051630dTN2.LIZ();
                if (iLIZ != 0) {
                    if (iLIZ == 1) {
                        C1097680efe c1097680efe = (C1097680efe) c1051630dTN2;
                        if (entry.getValue().size() > 0) {
                            C01GW<C1537410q6t> c01gw2 = C1537410q6t.LJIIIZ;
                            if (C1161970gLL.LIZIZ().LJI.LIZ == C00YJ.WHEN_MATCH_VIEW && c1097680efe.LJIJI != -1) {
                                while (entry.getValue().size() > 0) {
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    InterfaceC1540940qCa interfaceC1540940qCa4 = (InterfaceC1540940qCa) ((SoftReference) C13LP.LJJJJZI(entry.getValue())).get();
                                    if (interfaceC1540940qCa4 != null) {
                                        viewCreatedTime = interfaceC1540940qCa4.getViewCreatedTime();
                                    } else {
                                        viewCreatedTime = 0;
                                    }
                                    if (jCurrentTimeMillis2 - viewCreatedTime < c1097680efe.LJIJI * LSPassThroughRecordSizeConfig.DEFAULT) {
                                        break;
                                    }
                                    SoftReference softReference = (SoftReference) C19719612Di.LJJIIZ(entry.getValue());
                                    if (softReference != null && (interfaceC1540940qCa = (InterfaceC1540940qCa) softReference.get()) != null) {
                                        interfaceC1540940qCa.release();
                                    }
                                }
                            }
                            if (entry.getValue().size() > 0) {
                                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                                interfaceC1540940qCaLJII = LJII(c1537480q70, entry.getValue());
                                if (interfaceC1540940qCaLJII != 0) {
                                    interfaceC1540940qCaLJII.setOptimization(2);
                                }
                            }
                        }
                    }
                } else {
                    if (entry.getValue().size() == 0) {
                        break;
                    }
                    if (c1051630dTN2.LIZLLL) {
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("keepAliveWhenUsed is ");
                        sbLIZ.append(c1051630dTN2.LIZLLL);
                        sbLIZ.append(", we will not delete view if it is fetched");
                        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.D, "PreloadTool");
                        interfaceC1540940qCaLJII = (InterfaceC1540940qCa) ((SoftReference) C13LP.LJJJJZI(entry.getValue())).get();
                        if (!(interfaceC1540940qCaLJII instanceof View) || (view = (View) interfaceC1540940qCaLJII) == null || view.getParent() == null) {
                            C1537060q6K c1537060q6K2 = C1529590puH.LIZ;
                            if (interfaceC1540940qCaLJII != 0) {
                                c1537480q70LJIILJJIL = interfaceC1540940qCaLJII.LJIILJJIL();
                            } else {
                                c1537480q70LJIILJJIL = null;
                            }
                            if (!C1540320qBa.LIZ(c1537480q70LJIILJJIL, c1537480q70)) {
                                c1490740otc.LIZ("the theme of preloaded view is inconsistent", EnumC1490770otf.E, "PreloadTool");
                            }
                        }
                        interfaceC1540940qCaLJII = 0;
                    } else {
                        C1537060q6K c1537060q6K3 = C1529590puH.LIZ;
                        interfaceC1540940qCaLJII = LJII(c1537480q70, entry.getValue());
                    }
                }
                if (interfaceC1540940qCaLJII != 0) {
                    C1541030qCj.LIZIZ(interfaceC1540940qCaLJII, context);
                    if (c1051630dTN2.LJIIL && c1537480q70 != null) {
                        c1537480q70.startLynxJsRuntimeLater = true;
                    }
                    interfaceC1540940qCaLJII.LJIIIZ(context, c1537480q70);
                    C1537480q70 performanceViewHybridContext = interfaceC1540940qCaLJII.getPerformanceViewHybridContext();
                    if (performanceViewHybridContext != null) {
                        C1530570pvr.LJFF(performanceViewHybridContext, EnumC1537150q6T.OPT_PRE_RENDER_STATUS, 1);
                    }
                    C1537480q70 performanceViewHybridContext2 = interfaceC1540940qCaLJII.getPerformanceViewHybridContext();
                    if (performanceViewHybridContext2 != null) {
                        C1530570pvr.LIZIZ(performanceViewHybridContext2, "spark_consume_pre_result");
                    }
                    if (c1537070q6L != null) {
                        c1537070q6L.LIZIZ(str, str2, (InterfaceC1105930esx) interfaceC1540940qCaLJII);
                    }
                    C1537480q70 performanceViewHybridContext3 = interfaceC1540940qCaLJII.getPerformanceViewHybridContext();
                    if (performanceViewHybridContext3 != null && (abstractC1537120q6Q2 = (AbstractC1537120q6Q) performanceViewHybridContext3.LJFF(AbstractC1537120q6Q.class)) != null) {
                        do {
                            abstractC1537120q6Q2.LIZ(c1051630dTN2, interfaceC1540940qCaLJII);
                            abstractC1537120q6Q2 = abstractC1537120q6Q2.LL;
                        } while (abstractC1537120q6Q2 != null);
                    }
                    if (!Intrinsics.LJFF(interfaceC1540940qCaLJII.getPerformanceViewHybridContext(), c1537480q70) && c1537480q70 != null && (abstractC1537120q6Q = (AbstractC1537120q6Q) c1537480q70.LJFF(AbstractC1537120q6Q.class)) != null) {
                        do {
                            abstractC1537120q6Q.LIZ(c1051630dTN2, interfaceC1540940qCaLJII);
                            abstractC1537120q6Q = abstractC1537120q6Q.LL;
                        } while (abstractC1537120q6Q != null);
                    }
                    C1520080pew.LJFF(null, "container_prerender", "use", null, str, str2, C1541030qCj.LIZ(str2), null, 137);
                    return interfaceC1540940qCaLJII;
                }
            }
        }
        if (c1537070q6L == null) {
            return interfaceC1540940qCaLJII;
        }
        c1537070q6L.LIZ(str, new C1537080q6M("not match any instance"));
        return interfaceC1540940qCaLJII;
    }

    public static /* synthetic */ InterfaceC1540940qCa LJ(Context context, String str, String str2, C1537480q70 c1537480q70, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 16) != 0) {
            c1537480q70 = null;
        }
        return LIZLLL(context, str, str2, null, c1537480q70);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(java.lang.String r9, java.lang.String r10, X.C1537480q70 r11, X.C1537070q6L r12, boolean r13, java.lang.Boolean r14) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537060q6K.LJIIJ(java.lang.String, java.lang.String, X.0q70, X.0q6L, boolean, java.lang.Boolean):void");
    }

    public static /* synthetic */ void LJIIJJI(C1537060q6K c1537060q6K, String str, String str2, C1537480q70 c1537480q70, C1537070q6L c1537070q6L, boolean z, Boolean bool, int i) {
        Boolean bool2 = bool;
        boolean z2 = z;
        C1537480q70 c1537480q702 = c1537480q70;
        String str3 = str2;
        if ((i & 2) != 0) {
            str3 = "";
        }
        C1537070q6L c1537070q6L2 = null;
        if ((i & 4) != 0) {
            c1537480q702 = null;
        }
        if ((i & 8) == 0) {
            c1537070q6L2 = c1537070q6L;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            bool2 = Boolean.FALSE;
        }
        c1537060q6K.getClass();
        LJIIJ(str, str3, c1537480q702, c1537070q6L2, z2, bool2);
    }
}
