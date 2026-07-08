package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EcomGeckoPreloadConfigItem;
import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EventParamMatcher;
import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EventParamsConfig;
import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.GeckoResourceItem;
import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.RouterParamsConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qPR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548910qPR {
    public static final C1548910qPR LIZ = new C1548910qPR();
    public static final Map<String, List<EcomGeckoPreloadConfigItem>> LIZIZ;
    public static final Map<String, List<EcomGeckoPreloadConfigItem>> LIZJ;
    public static final Map<String, String> LIZLLL;
    public static final CopyOnWriteArraySet<String> LJ;

    static {
        String str;
        String str2;
        ArrayList arrayListLJ = C1697810uHb.LJ(new InterfaceC1549020qPc() { // from class: X.0qPb
            public static final EcomGeckoPreloadConfigItem[] LIZIZ = new EcomGeckoPreloadConfigItem[0];

            @Override // X.InterfaceC1549020qPc
            public final EcomGeckoPreloadConfigItem[] LIZ() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr = LIZIZ;
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr2 = (EcomGeckoPreloadConfigItem[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_common_gecko_preload_optimize", EcomGeckoPreloadConfigItem[].class, ecomGeckoPreloadConfigItemArr);
                return ecomGeckoPreloadConfigItemArr2 != null ? ecomGeckoPreloadConfigItemArr2 : ecomGeckoPreloadConfigItemArr;
            }
        }, new InterfaceC1549020qPc() { // from class: X.0qPT
            public static final EcomGeckoPreloadConfigItem[] LIZIZ = new EcomGeckoPreloadConfigItem[0];

            @Override // X.InterfaceC1549020qPc
            public final EcomGeckoPreloadConfigItem[] LIZ() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr = LIZIZ;
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr2 = (EcomGeckoPreloadConfigItem[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_common_gecko_preload_optimize_exp_1", EcomGeckoPreloadConfigItem[].class, ecomGeckoPreloadConfigItemArr);
                return ecomGeckoPreloadConfigItemArr2 != null ? ecomGeckoPreloadConfigItemArr2 : ecomGeckoPreloadConfigItemArr;
            }
        }, new InterfaceC1549020qPc() { // from class: X.0qPU
            public static final EcomGeckoPreloadConfigItem[] LIZIZ = new EcomGeckoPreloadConfigItem[0];

            @Override // X.InterfaceC1549020qPc
            public final EcomGeckoPreloadConfigItem[] LIZ() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr = LIZIZ;
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr2 = (EcomGeckoPreloadConfigItem[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_common_gecko_preload_optimize_exp_2", EcomGeckoPreloadConfigItem[].class, ecomGeckoPreloadConfigItemArr);
                return ecomGeckoPreloadConfigItemArr2 != null ? ecomGeckoPreloadConfigItemArr2 : ecomGeckoPreloadConfigItemArr;
            }
        }, new InterfaceC1549020qPc() { // from class: X.0qPV
            public static final EcomGeckoPreloadConfigItem[] LIZIZ = new EcomGeckoPreloadConfigItem[0];

            @Override // X.InterfaceC1549020qPc
            public final EcomGeckoPreloadConfigItem[] LIZ() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr = LIZIZ;
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr2 = (EcomGeckoPreloadConfigItem[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_common_gecko_preload_optimize_exp_3", EcomGeckoPreloadConfigItem[].class, ecomGeckoPreloadConfigItemArr);
                return ecomGeckoPreloadConfigItemArr2 != null ? ecomGeckoPreloadConfigItemArr2 : ecomGeckoPreloadConfigItemArr;
            }
        }, new InterfaceC1549020qPc() { // from class: X.0qPW
            public static final EcomGeckoPreloadConfigItem[] LIZIZ = new EcomGeckoPreloadConfigItem[0];

            @Override // X.InterfaceC1549020qPc
            public final EcomGeckoPreloadConfigItem[] LIZ() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr = LIZIZ;
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr2 = (EcomGeckoPreloadConfigItem[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_common_gecko_preload_optimize_exp_4", EcomGeckoPreloadConfigItem[].class, ecomGeckoPreloadConfigItemArr);
                return ecomGeckoPreloadConfigItemArr2 != null ? ecomGeckoPreloadConfigItemArr2 : ecomGeckoPreloadConfigItemArr;
            }
        }, new InterfaceC1549020qPc() { // from class: X.0qPX
            public static final EcomGeckoPreloadConfigItem[] LIZIZ = new EcomGeckoPreloadConfigItem[0];

            @Override // X.InterfaceC1549020qPc
            public final EcomGeckoPreloadConfigItem[] LIZ() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr = LIZIZ;
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr2 = (EcomGeckoPreloadConfigItem[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_common_gecko_preload_optimize_exp_5", EcomGeckoPreloadConfigItem[].class, ecomGeckoPreloadConfigItemArr);
                return ecomGeckoPreloadConfigItemArr2 != null ? ecomGeckoPreloadConfigItemArr2 : ecomGeckoPreloadConfigItemArr;
            }
        }, new InterfaceC1549020qPc() { // from class: X.0qPY
            public static final EcomGeckoPreloadConfigItem[] LIZIZ = new EcomGeckoPreloadConfigItem[0];

            @Override // X.InterfaceC1549020qPc
            public final EcomGeckoPreloadConfigItem[] LIZ() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr = LIZIZ;
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr2 = (EcomGeckoPreloadConfigItem[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_common_gecko_preload_optimize_exp_6", EcomGeckoPreloadConfigItem[].class, ecomGeckoPreloadConfigItemArr);
                return ecomGeckoPreloadConfigItemArr2 != null ? ecomGeckoPreloadConfigItemArr2 : ecomGeckoPreloadConfigItemArr;
            }
        }, new InterfaceC1549020qPc() { // from class: X.0qPZ
            public static final EcomGeckoPreloadConfigItem[] LIZIZ = new EcomGeckoPreloadConfigItem[0];

            @Override // X.InterfaceC1549020qPc
            public final EcomGeckoPreloadConfigItem[] LIZ() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr = LIZIZ;
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr2 = (EcomGeckoPreloadConfigItem[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_common_gecko_preload_optimize_exp_7", EcomGeckoPreloadConfigItem[].class, ecomGeckoPreloadConfigItemArr);
                return ecomGeckoPreloadConfigItemArr2 != null ? ecomGeckoPreloadConfigItemArr2 : ecomGeckoPreloadConfigItemArr;
            }
        }, new InterfaceC1549020qPc() { // from class: X.0qPa
            public static final EcomGeckoPreloadConfigItem[] LIZIZ = new EcomGeckoPreloadConfigItem[0];

            @Override // X.InterfaceC1549020qPc
            public final EcomGeckoPreloadConfigItem[] LIZ() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr = LIZIZ;
                EcomGeckoPreloadConfigItem[] ecomGeckoPreloadConfigItemArr2 = (EcomGeckoPreloadConfigItem[]) settingsManagerLIZLLL.LJIIIIZZ("ecom_common_gecko_preload_optimize_exp_8", EcomGeckoPreloadConfigItem[].class, ecomGeckoPreloadConfigItemArr);
                return ecomGeckoPreloadConfigItemArr2 != null ? ecomGeckoPreloadConfigItemArr2 : ecomGeckoPreloadConfigItemArr;
            }
        });
        LIZIZ = new LinkedHashMap();
        LIZJ = new LinkedHashMap();
        LIZLLL = new LinkedHashMap();
        LJ = new CopyOnWriteArraySet<>();
        try {
            Iterator it2 = arrayListLJ.iterator();
            while (it2.hasNext()) {
                for (EcomGeckoPreloadConfigItem ecomGeckoPreloadConfigItem : ((InterfaceC1549020qPc) it2.next()).LIZ()) {
                    String str3 = ecomGeckoPreloadConfigItem.triggerType;
                    String str4 = "";
                    if (Intrinsics.LJFF(str3, "event")) {
                        Map<String, List<EcomGeckoPreloadConfigItem>> map = LIZIZ;
                        EventParamsConfig eventParamsConfig = ecomGeckoPreloadConfigItem.eventParams;
                        if (eventParamsConfig != null && (str2 = eventParamsConfig.event) != null) {
                            str4 = str2;
                        }
                        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                        Object arrayList = linkedHashMap.get(str4);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(str4, arrayList);
                        }
                        ((List) arrayList).add(ecomGeckoPreloadConfigItem);
                    } else if (Intrinsics.LJFF(str3, "router")) {
                        Map<String, List<EcomGeckoPreloadConfigItem>> map2 = LIZJ;
                        RouterParamsConfig routerParamsConfig = ecomGeckoPreloadConfigItem.routerParams;
                        if (routerParamsConfig != null && (str = routerParamsConfig.path) != null) {
                            str4 = str;
                        }
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                        Object arrayList2 = linkedHashMap2.get(str4);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap2.put(str4, arrayList2);
                        }
                        ((List) arrayList2).add(ecomGeckoPreloadConfigItem);
                    }
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static void LIZJ(String str) {
        List<EcomGeckoPreloadConfigItem> list;
        ?? arrayList;
        GeckoResourceItem[] geckoResourceItemArr;
        try {
            String str2 = (String) ((LinkedHashMap) LIZLLL).get(str);
            if (str2 == null || (list = (List) ((LinkedHashMap) LIZJ).get(str2)) == null) {
                return;
            }
            for (EcomGeckoPreloadConfigItem ecomGeckoPreloadConfigItem : list) {
                RouterParamsConfig routerParamsConfig = ecomGeckoPreloadConfigItem.routerParams;
                if (routerParamsConfig != null && (geckoResourceItemArr = routerParamsConfig.resources) != null) {
                    ArrayList arrayList2 = new ArrayList(geckoResourceItemArr.length);
                    for (GeckoResourceItem geckoResourceItem : geckoResourceItemArr) {
                        String str3 = geckoResourceItem.channel;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList2.add(str3);
                    }
                    arrayList = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                if (!arrayList.isEmpty()) {
                    Integer num = ecomGeckoPreloadConfigItem.waitCPUFree;
                    if (num != null && num.intValue() != 0) {
                        C1528200ps2.LIZ(new AwS418S0200000_17((List) arrayList, (List<String>) ecomGeckoPreloadConfigItem, (EcomGeckoPreloadConfigItem) 72));
                    } else {
                        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1096220edI(arrayList, ecomGeckoPreloadConfigItem, null), 2);
                    }
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean LJ(String str) {
        if (LIZLLL.containsKey(str)) {
            return true;
        }
        for (String str2 : ((LinkedHashMap) LIZJ).keySet()) {
            if (str2.length() > 0 && a0.LJJIIZI(str, str2, false)) {
                LIZLLL.put(str, str2);
                return true;
            }
        }
        return false;
    }

    public static Set LIZIZ(EventParamsConfig eventParamsConfig, JSONObject jSONObject) {
        boolean z;
        GeckoResourceItem[] geckoResourceItemArr;
        k value;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EventParamMatcher eventParamMatcher : eventParamsConfig.matchers) {
            n nVar = eventParamMatcher.param;
            if (nVar == null) {
                GeckoResourceItem[] geckoResourceItemArr2 = eventParamMatcher.resources;
                if (geckoResourceItemArr2 != null) {
                    for (GeckoResourceItem geckoResourceItem : geckoResourceItemArr2) {
                        String str = geckoResourceItem.channel;
                        if (str != null) {
                            linkedHashSet.add(str);
                        }
                    }
                }
            } else if (jSONObject != null) {
                for (Map.Entry<String, k> entry : nVar.entrySet()) {
                    String key = entry.getKey();
                    if (key != null && (value = entry.getValue()) != null && !(value instanceof m)) {
                        if (value instanceof q) {
                            try {
                                q qVarLJIILJJIL = value.LJIILJJIL();
                                Object obj = qVarLJIILJJIL.LL;
                                if (obj instanceof String) {
                                    String strLJIL = qVarLJIILJJIL.LJIL();
                                    if (strLJIL != null && Intrinsics.LJFF(strLJIL, JSONObjectProtectorUtils.getString(jSONObject, key))) {
                                    }
                                } else if (!(obj instanceof Number) || qVarLJIILJJIL.LJIIJJI() == JSONObjectProtectorUtils.getInt(jSONObject, key)) {
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                    z = false;
                }
                z = true;
                if (!z && (geckoResourceItemArr = eventParamMatcher.resources) != null) {
                    for (GeckoResourceItem geckoResourceItem2 : geckoResourceItemArr) {
                        String str2 = geckoResourceItem2.channel;
                        if (str2 != null) {
                            linkedHashSet.add(str2);
                        }
                    }
                }
            } else {
                z = false;
                if (!z) {
                }
            }
        }
        return linkedHashSet;
    }

    public static void LIZLLL(String str, JSONObject jSONObject) {
        List<EcomGeckoPreloadConfigItem> list;
        try {
            Map<String, List<EcomGeckoPreloadConfigItem>> map = LIZIZ;
            if (str == null || (list = (List) ((LinkedHashMap) map).get(str)) == null) {
                return;
            }
            for (EcomGeckoPreloadConfigItem ecomGeckoPreloadConfigItem : list) {
                EventParamsConfig eventParamsConfig = ecomGeckoPreloadConfigItem.eventParams;
                if (eventParamsConfig != null) {
                    LIZ.getClass();
                    Set setLIZIZ = LIZIZ(eventParamsConfig, jSONObject);
                    if (!setLIZIZ.isEmpty()) {
                        AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(ecomGeckoPreloadConfigItem, (EcomGeckoPreloadConfigItem) setLIZIZ, (Set<String>) 73);
                        IDowngradeApi iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi$default(IDowngradeApi.class, false, false, false, 14, null);
                        if (iDowngradeApi != null) {
                            iDowngradeApi.LJI(awS418S0200000_17);
                        }
                    }
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x003e, code lost:
    
        if (r3 != r7) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Set<java.lang.String> r21, com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EcomGeckoPreloadConfigItem r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1548910qPR.LIZ(java.util.Set, com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EcomGeckoPreloadConfigItem, X.05Vn):java.lang.Object");
    }
}
