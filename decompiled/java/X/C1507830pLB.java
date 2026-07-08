package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigEventParams;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigPage;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigScene;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECDispatchResourceConditionItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pLB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507830pLB {
    public static final C2232408os LIZ;
    public static final C054G LIZIZ;
    public static final BPEAHandler LIZJ;
    public static boolean LIZLLL;
    public static String LJ;
    public static C1507860pLE LJFF;
    public static boolean LJI;
    public static AnonymousClass0956 LJII;
    public static final CopyOnWriteArraySet<InterfaceC2173208fK> LJIIIIZZ;
    public static final ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC2173208fK>> LJIIIZ;
    public static final ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1507880pLG>> LJIIJ;
    public static final C603820NmG<String, String> LJIIJJI;
    public static final CopyOnWriteArrayList<String> LJIIL;
    public static String LJIILIIL;
    public static volatile long LJIILJJIL;
    public static volatile String LJIILL;
    public static final boolean LJIILLIIL;

    static {
        C2232408os c2232408os = new C2232408os(C786410Ut5.h4());
        LIZ = c2232408os;
        LIZIZ = C2296808zG.LIZ(c2232408os.plus(C2296908zH.LIZ()));
        LIZJ = new BPEAHandler(Looper.getMainLooper());
        LJIIIIZZ = new CopyOnWriteArraySet<>();
        LJIIIZ = new ConcurrentHashMap<>();
        LJIIJ = new ConcurrentHashMap<>();
        LJIIJJI = new C603820NmG<>(64);
        LJIIL = new CopyOnWriteArrayList<>();
        LJIILLIIL = C1507840pLC.LIZIZ().blockGC;
    }

    public static void LIZ(String str) {
        if (Intrinsics.LJFF(LJ, str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ECDispatchResourceConditionItem eCDispatchResourceConditionItem = C1507840pLC.LIZIZ().netCondition;
        if (eCDispatchResourceConditionItem != null) {
            boolean zBooleanValue = ((Boolean) C1507870pLF.LIZ(eCDispatchResourceConditionItem).getFirst()).booleanValue();
            boolean z = C1507840pLC.LIZIZ().netConditionReverse;
            if (zBooleanValue) {
                if (!z) {
                    return;
                }
            } else if (z) {
                return;
            }
        }
        C23250099c.LIZLLL(LIZIZ, null, null, new C1507810pL9(jCurrentTimeMillis, str, null), 3);
    }

    public static String LIZJ(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        C603820NmG<String, String> c603820NmG = LJIIJJI;
        String strLIZJ = c603820NmG.LIZJ(str);
        String str3 = "#";
        if (strLIZJ != null) {
            if (Intrinsics.LJFF(strLIZJ, "#")) {
                return null;
            }
            return strLIZJ;
        }
        Map.Entry entryLIZ = C1507840pLC.LIZ(str);
        if (entryLIZ != null && (str2 = (String) entryLIZ.getKey()) != null) {
            str3 = str2;
        }
        c603820NmG.LIZLLL(str, str3);
        return str2;
    }

    public static void LJ(String str) {
        Boolean boolValueOf;
        String str2;
        EcomLoadRetreatConfigPage ecomLoadRetreatConfigPage;
        CopyOnWriteArraySet<InterfaceC1507880pLG> copyOnWriteArraySet;
        String strLIZJ = LIZJ(str);
        if (strLIZJ != null && (copyOnWriteArraySet = LJIIJ.get(strLIZJ)) != null) {
            Iterator<InterfaceC1507880pLG> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF(strLIZJ);
            }
        }
        String str3 = LJ;
        if (str != null && str3 != null) {
            EcomLoadRetreatConfigScene ecomLoadRetreatConfigScene = C1507840pLC.LIZIZ().scenes.get(str3);
            if (ecomLoadRetreatConfigScene != null && (str2 = ecomLoadRetreatConfigScene.exit) != null && (ecomLoadRetreatConfigPage = C1507840pLC.LIZIZ().pages.get(str2)) != null) {
                boolValueOf = Boolean.valueOf(ecomLoadRetreatConfigPage.LIZ(str));
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                LIZIZ(str3, "onPageResumed");
            }
        }
    }

    public static void LJFF(InterfaceC2173208fK interfaceC2173208fK) {
        LJIIIIZZ.add(interfaceC2173208fK);
    }

    public static void LIZIZ(String str, String str2) {
        if (!Intrinsics.LJFF(LJ, str)) {
            return;
        }
        C23250099c.LIZLLL(LIZIZ, null, null, new C1507820pLA(str, str2, null), 3);
    }

    public static void LIZLLL(String str, JSONObject jSONObject) {
        String str2;
        String str3;
        List<EcomLoadRetreatConfigEventParams> list;
        Object objOpt;
        try {
            if (!C1507840pLC.LIZ.enable || !LIZLLL || (str2 = LJ) == null || (str3 = LJIILIIL) == null) {
                return;
            }
            EcomLoadRetreatConfigPage ecomLoadRetreatConfigPage = C1507840pLC.LIZIZ().pages.get(str3);
            Unit unit = null;
            if (ecomLoadRetreatConfigPage != null && (list = ecomLoadRetreatConfigPage.exitPoints) != null) {
                for (EcomLoadRetreatConfigEventParams ecomLoadRetreatConfigEventParams : list) {
                    if (Intrinsics.LJFF(ecomLoadRetreatConfigEventParams.eventName, str)) {
                        List<Map<String, String>> list2 = ecomLoadRetreatConfigEventParams.matchers;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (Map<String, String> map : list2) {
                                if (!map.isEmpty()) {
                                    for (Map.Entry<String, String> entry : map.entrySet()) {
                                        if (jSONObject != null) {
                                            objOpt = jSONObject.opt(entry.getKey());
                                        } else {
                                            objOpt = null;
                                        }
                                        if (!Intrinsics.LJFF(objOpt, entry.getValue())) {
                                            break;
                                        }
                                    }
                                }
                                LIZIZ(str2, "onLogEvent");
                                return;
                            }
                        }
                    }
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJI(String str, InterfaceC2173208fK interfaceC2173208fK) {
        ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC2173208fK>> concurrentHashMap = LJIIIZ;
        CopyOnWriteArraySet<InterfaceC2173208fK> copyOnWriteArraySet = concurrentHashMap.get(str);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            concurrentHashMap.put(str, copyOnWriteArraySet);
        }
        copyOnWriteArraySet.add(interfaceC2173208fK);
    }

    public static void LJII(InterfaceC2173208fK interfaceC2173208fK, String str) {
        CopyOnWriteArraySet<InterfaceC2173208fK> copyOnWriteArraySet = LJIIIZ.get(str);
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.remove(interfaceC2173208fK);
        }
    }
}
