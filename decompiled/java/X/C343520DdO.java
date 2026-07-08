package X;

import Y.ARunnableS73S0200000_4;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.BackConfig;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.ss.android.ugc.aweme.tab.stability.TabStabilityData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS133S0400000_4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343520DdO {
    public static final C343520DdO LIZ = new C343520DdO();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C343680Dde());
    public static final C01GW LIZJ = C1935307i3.LIZ(new C343610DdX());
    public static volatile boolean LIZLLL;
    public static int LJ;
    public static boolean LJFF;
    public static volatile boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static String LJIIIZ;
    public static volatile AwS133S0400000_4 LJIIJ;

    static {
        if (((Boolean) C282880B6w.LIZ.getValue()).booleanValue()) {
            C0XQ7.LJ();
            IAccountService iAccountService = C0XQ7.LIZ;
            if (iAccountService != null) {
                iAccountService.LJIILL(new InterfaceC586170Myt() { // from class: X.0DdW
                    @Override // X.InterfaceC586170Myt
                    public final void onAccountResult(int i, boolean z, int i2, User user) {
                        String uid;
                        C343520DdO c343520DdO = C343520DdO.LIZ;
                        if (user != null) {
                            uid = user.getUid();
                        } else {
                            uid = null;
                        }
                        C343520DdO.LJIIIZ = uid;
                        C343520DdO.LIZLLL = true;
                        C343520DdO.LJ = i;
                    }
                });
            }
        }
    }

    public static Keva LIZJ() {
        return (Keva) LIZIZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, X.0rLn] */
    public static void LIZ(C19EG c19eg, EnumC1585090rLn enumC1585090rLn) {
        Object c098200Yq;
        String curUserId;
        String str;
        System.currentTimeMillis();
        C259800zU c259800zU = new C259800zU();
        T t = enumC1585090rLn;
        if (enumC1585090rLn != EnumC1585090rLn.NUJ_END) {
            t = enumC1585090rLn;
            if (LIZLLL) {
                int i = LJ;
                if (i == 2) {
                    t = EnumC1585090rLn.SWITCH_ACCOUNT;
                } else if (i == 1) {
                    t = EnumC1585090rLn.LOGIN;
                } else {
                    t = enumC1585090rLn;
                    if (i == 3) {
                        t = EnumC1585090rLn.LOGOUT;
                    }
                }
            }
        }
        c259800zU.element = t;
        try {
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String string = LIZJ().getString("tab_stability_data", "");
                c1227904rF.getClass();
                c098200Yq = (TabStabilityData) C1227904rF.LIZJ(string, TabStabilityData.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            String str2 = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            TabStabilityData tabStabilityData = (TabStabilityData) c098200Yq;
            EnumC1585090rLn enumC1585090rLn2 = (EnumC1585090rLn) c259800zU.element;
            C0CXN.LIZ.getClass();
            TabConfig tabConfigLIZJ = C0CXN.LIZJ();
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
                curUserId = LJIIIZ;
            }
            TabStabilityData tabStabilityDataLIZ = C0CXR.LIZ(enumC1585090rLn2, tabConfigLIZJ, curUserId);
            if (!tabStabilityDataLIZ.isNewUser && tabStabilityData == null) {
                Keva kevaLIZJ = LIZJ();
                C1227904rF.LIZ.getClass();
                kevaLIZJ.storeString("tab_stability_data", C1227904rF.LJI(tabStabilityDataLIZ));
                return;
            }
            T t2 = c259800zU.element;
            EnumC1585090rLn enumC1585090rLn3 = EnumC1585090rLn.COLD_LAUNCH;
            if (t2 == enumC1585090rLn3) {
                if (tabStabilityData == null) {
                    str = null;
                } else {
                    str = tabStabilityData.updateSource;
                }
                if (!Intrinsics.LJFF(str, EnumC1585090rLn.LOGOUT.getType())) {
                    if (tabStabilityData != null) {
                        str2 = tabStabilityData.updateSource;
                    }
                    if (Intrinsics.LJFF(str2, enumC1585090rLn3.getType()) || !LJIIIIZZ) {
                        if (tabStabilityData != null && Intrinsics.LJFF(tabStabilityDataLIZ.clientTopTabList, tabStabilityData.clientTopTabList) && Intrinsics.LJFF(tabStabilityDataLIZ.clientBottomTabList, tabStabilityData.clientBottomTabList) && Intrinsics.LJFF(tabStabilityDataLIZ.clientLeftIconList, tabStabilityData.clientLeftIconList) && Intrinsics.LJFF(tabStabilityDataLIZ.clientRightIconList, tabStabilityData.clientRightIconList)) {
                            if (!LJII) {
                                LJII = true;
                                Keva kevaLIZJ2 = LIZJ();
                                C1227904rF.LIZ.getClass();
                                kevaLIZJ2.storeString("tab_stability_data", C1227904rF.LJI(tabStabilityDataLIZ));
                                return;
                            }
                            return;
                        }
                        LIZIZ(c19eg, (EnumC1585090rLn) c259800zU.element, tabStabilityData, tabStabilityDataLIZ);
                        return;
                    }
                }
                ?? r0 = EnumC1585090rLn.COLD_LAUNCH_AFTER_LOGOUT;
                c259800zU.element = r0;
                tabStabilityDataLIZ.updateSource = r0.getType();
                LJIIJ = new AwS133S0400000_4(new WeakReference(c19eg), (WeakReference<C19EG>) c259800zU, (C259800zU<EnumC1585090rLn>) tabStabilityData, tabStabilityDataLIZ, (TabStabilityData) 1);
                return;
            }
            LIZIZ(c19eg, (EnumC1585090rLn) t2, tabStabilityData, tabStabilityDataLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJ(C19EG c19eg, EnumC1585090rLn enumC1585090rLn) {
        if (((Boolean) LIZJ.getValue()).booleanValue()) {
            if (enumC1585090rLn != EnumC1585090rLn.NUJ_END && !LJI) {
                return;
            }
            LJI = true;
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS73S0200000_4(c19eg, enumC1585090rLn, 18));
            return;
        }
        if (enumC1585090rLn == EnumC1585090rLn.COLD_LAUNCH) {
            C0S78.LIZLLL(true, new C0CUN(c19eg, enumC1585090rLn));
        } else {
            if (!LJFF) {
                return;
            }
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS73S0200000_4(c19eg, enumC1585090rLn, 19));
        }
    }

    public static void LIZIZ(C19EG c19eg, EnumC1585090rLn enumC1585090rLn, TabStabilityData tabStabilityData, TabStabilityData tabStabilityData2) {
        BackConfig backConfig;
        List listSingletonList;
        Set<String> setLJJIJIL;
        Set<String> setLJJIJIL2;
        Set<String> setLJJIJIL3;
        Set<String> setLJJIJIL4;
        Set<String> setLJJIJIL5;
        Set<String> setLJJIJIL6;
        Set<String> setLJJIJIL7;
        Set<String> setLJJIJIL8;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        k kVarLJJIIZ3;
        k kVarLJJIIZ4;
        k kVarLJJIIZ5;
        k kVarLJJIIZ6;
        k kVarLJJIIZ7;
        k kVarLJJIIZ8;
        List list;
        if (tabStabilityData == null) {
            if (tabStabilityData2.isNewUser) {
                listSingletonList = Collections.singletonList(new AbstractC343530DdP() { // from class: X.0Ddc
                    {
                        EnumC343590DdV enumC343590DdV = EnumC343590DdV.NEW_USER;
                    }
                });
            } else {
                listSingletonList = C13BV.INSTANCE;
            }
        } else {
            tabStabilityData2.getClass();
            ArrayList arrayList = new ArrayList();
            if (tabStabilityData2.isNewUser) {
                if (tabStabilityData2.LIZIZ(tabStabilityData)) {
                    arrayList.add(new AbstractC343530DdP() { // from class: X.0Ddc
                        {
                            EnumC343590DdV enumC343590DdV = EnumC343590DdV.NEW_USER;
                        }
                    });
                    listSingletonList = arrayList;
                }
            } else if ((Intrinsics.LJFF(tabStabilityData2.tabFcpConfig, C343770Ddn.LIZIZ.LIZJ()) || C123100dR.LIZ(tabStabilityData2.clientDecisionFcpConfigErrorDomain)) && tabStabilityData2.LIZIZ(tabStabilityData)) {
                arrayList.add(new AbstractC343530DdP() { // from class: X.0DdY
                    {
                        EnumC343590DdV enumC343590DdV = EnumC343590DdV.CLIENT_FCP_CONFIG_INVALID;
                    }
                });
            }
            final Map mapLIZ = TabStabilityData.LIZ(tabStabilityData.serverDecisionFilterRules, tabStabilityData2.serverDecisionFilterRules);
            if (!((HashMap) mapLIZ).isEmpty()) {
                arrayList.add(new AbstractC343530DdP(mapLIZ) { // from class: X.0DdS
                    public final Map<String, Map<String, Pair<Boolean, Boolean>>> LIZIZ;

                    @Override // X.AbstractC343530DdP
                    public final List<C343690Ddf> LIZIZ() {
                        String string;
                        String string2;
                        if (this.LIZIZ.isEmpty()) {
                            return C13BV.INSTANCE;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Map.Entry<String, Map<String, Pair<Boolean, Boolean>>> entry : this.LIZIZ.entrySet()) {
                            String key = entry.getKey();
                            for (Map.Entry<String, Pair<Boolean, Boolean>> entry2 : entry.getValue().entrySet()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(key);
                                sbLIZ.append('_');
                                sbLIZ.append(entry2.getKey());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                Boolean first = entry2.getValue().getFirst();
                                String str = "";
                                if (first == null || (string = first.toString()) == null) {
                                    string = "";
                                }
                                Boolean second = entry2.getValue().getSecond();
                                if (second != null && (string2 = second.toString()) != null) {
                                    str = string2;
                                }
                                arrayList2.add(new C343690Ddf(strLIZIZ, string, str));
                            }
                        }
                        return arrayList2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(EnumC343590DdV.SERVER_DIFF_FILTER_RULES);
                        this.LIZIZ = mapLIZ;
                    }
                });
            }
            final Map mapLIZ2 = TabStabilityData.LIZ(tabStabilityData.clientDecisionFilterRules, tabStabilityData2.clientDecisionFilterRules);
            if (!((HashMap) mapLIZ2).isEmpty()) {
                arrayList.add(new AbstractC343530DdP(mapLIZ2) { // from class: X.0DdR
                    public final Map<String, Map<String, Pair<Boolean, Boolean>>> LIZIZ;

                    @Override // X.AbstractC343530DdP
                    public final List<C343690Ddf> LIZIZ() {
                        String string;
                        String string2;
                        if (this.LIZIZ.isEmpty()) {
                            return C13BV.INSTANCE;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Map.Entry<String, Map<String, Pair<Boolean, Boolean>>> entry : this.LIZIZ.entrySet()) {
                            String key = entry.getKey();
                            for (Map.Entry<String, Pair<Boolean, Boolean>> entry2 : entry.getValue().entrySet()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(key);
                                sbLIZ.append('_');
                                sbLIZ.append(entry2.getKey());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                Boolean first = entry2.getValue().getFirst();
                                String str = "";
                                if (first == null || (string = first.toString()) == null) {
                                    string = "";
                                }
                                Boolean second = entry2.getValue().getSecond();
                                if (second != null && (string2 = second.toString()) != null) {
                                    str = string2;
                                }
                                arrayList2.add(new C343690Ddf(strLIZIZ, string, str));
                            }
                        }
                        return arrayList2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(EnumC343590DdV.CLIENT_DIFF_FILTER_RULES);
                        this.LIZIZ = mapLIZ2;
                    }
                });
            }
            listSingletonList = arrayList;
            if (!Intrinsics.LJFF(tabStabilityData.clientBackupMoveReason, tabStabilityData2.clientBackupMoveReason)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("compareClientDiff ClientTabFrameworkBackup: reason: ");
                C1584320rKY.LIZ.getClass();
                sbLIZ.append(C1584320rKY.LJIIIZ);
                sbLIZ.append(", backupConfig ");
                TabConfig tabConfig = tabStabilityData2.tabFcpConfig;
                if (tabConfig != null) {
                    backConfig = tabConfig.backupConfig;
                } else {
                    backConfig = null;
                }
                sbLIZ.append(backConfig);
                C2188811AlT.LIZIZ(sbLIZ);
                arrayList.add(new AbstractC343530DdP() { // from class: X.0DdZ
                    {
                        EnumC343590DdV enumC343590DdV = EnumC343590DdV.CLIENT_TAB_FRAMEWORK_BACKUP;
                    }
                });
                listSingletonList = arrayList;
            }
        }
        if (tabStabilityData == null) {
            list = C13BV.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (tabStabilityData.isNewUser && C123100dR.LIZ(tabStabilityData.clientDecisionFcpConfigErrorDomain) && tabStabilityData2.LIZIZ(tabStabilityData)) {
                arrayList2.add(new AbstractC343530DdP() { // from class: X.0Ddd
                    {
                        EnumC343590DdV enumC343590DdV = EnumC343590DdV.NEW_USER_SECOND_LAUNCH;
                    }
                });
                list = arrayList2;
            } else {
                if (!Intrinsics.LJFF(tabStabilityData.abUserId, tabStabilityData2.abUserId)) {
                    arrayList2.add(new AbstractC343530DdP() { // from class: X.0Ddb
                        {
                            EnumC343590DdV enumC343590DdV = EnumC343590DdV.SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_ACCOUNT;
                        }
                    });
                }
                n nVar = tabStabilityData.tabReqInfo;
                if (nVar == null || (setLJJIJIL = nVar.LJJIJIL()) == null) {
                    setLJJIJIL = C08CX.INSTANCE;
                }
                n nVar2 = tabStabilityData2.tabReqInfo;
                if (nVar2 == null || (setLJJIJIL2 = nVar2.LJJIJIL()) == null) {
                    setLJJIJIL2 = C08CX.INSTANCE;
                }
                Set<String> setLLIIJLIL = C13LP.LLIIJLIL(setLJJIJIL, setLJJIJIL2);
                final HashMap map = new HashMap();
                for (String str : setLLIIJLIL) {
                    n nVar3 = tabStabilityData.tabReqInfo;
                    if (nVar3 != null) {
                        kVarLJJIIZ7 = nVar3.LJJIIZ(str);
                    } else {
                        kVarLJJIIZ7 = null;
                    }
                    n nVar4 = tabStabilityData2.tabReqInfo;
                    if (nVar4 != null) {
                        kVarLJJIIZ8 = nVar4.LJJIIZ(str);
                    } else {
                        kVarLJJIIZ8 = null;
                    }
                    if (!Intrinsics.LJFF(kVarLJJIIZ7, kVarLJJIIZ8)) {
                        map.put(str, new Pair(kVarLJJIIZ7, kVarLJJIIZ8));
                    }
                }
                if (!map.isEmpty()) {
                    arrayList2.add(new AbstractC343530DdP(map) { // from class: X.0DdT
                        public final Map<String, Pair<k, k>> LIZIZ;

                        @Override // X.AbstractC343530DdP
                        public final List<C343690Ddf> LIZIZ() {
                            String strLIZ;
                            String strLIZ2;
                            if (this.LIZIZ.isEmpty()) {
                                return C13BV.INSTANCE;
                            }
                            Map<String, Pair<k, k>> map2 = this.LIZIZ;
                            ArrayList arrayList3 = new ArrayList(map2.size());
                            for (Map.Entry<String, Pair<k, k>> entry : map2.entrySet()) {
                                String key = entry.getKey();
                                k first = entry.getValue().getFirst();
                                k second = entry.getValue().getSecond();
                                String str2 = "";
                                if (first == null || (strLIZ = AbstractC343530DdP.LIZ(first)) == null) {
                                    strLIZ = "";
                                }
                                if (second != null && (strLIZ2 = AbstractC343530DdP.LIZ(second)) != null) {
                                    str2 = strLIZ2;
                                }
                                arrayList3.add(new C343690Ddf(key, strLIZ, str2));
                            }
                            return arrayList3;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(EnumC343590DdV.SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_DIFF_CONDITIONS);
                            this.LIZIZ = map;
                        }
                    });
                }
                n nVar5 = tabStabilityData.abExpVidInfo;
                if (nVar5 == null || (setLJJIJIL3 = nVar5.LJJIJIL()) == null) {
                    setLJJIJIL3 = C08CX.INSTANCE;
                }
                n nVar6 = tabStabilityData2.abExpVidInfo;
                if (nVar6 == null || (setLJJIJIL4 = nVar6.LJJIJIL()) == null) {
                    setLJJIJIL4 = C08CX.INSTANCE;
                }
                Set<String> setLLIIJLIL2 = C13LP.LLIIJLIL(setLJJIJIL3, setLJJIJIL4);
                HashMap map2 = new HashMap();
                for (String str2 : setLLIIJLIL2) {
                    n nVar7 = tabStabilityData.abExpVidInfo;
                    if (nVar7 != null) {
                        kVarLJJIIZ5 = nVar7.LJJIIZ(str2);
                    } else {
                        kVarLJJIIZ5 = null;
                    }
                    n nVar8 = tabStabilityData2.abExpVidInfo;
                    if (nVar8 != null) {
                        kVarLJJIIZ6 = nVar8.LJJIIZ(str2);
                    } else {
                        kVarLJJIIZ6 = null;
                    }
                    if (!Intrinsics.LJFF(kVarLJJIIZ5, kVarLJJIIZ6)) {
                        map2.put(str2, new Pair(kVarLJJIIZ5, kVarLJJIIZ6));
                    }
                }
                n nVar9 = tabStabilityData.abExpInfo;
                if (nVar9 == null || (setLJJIJIL5 = nVar9.LJJIJIL()) == null) {
                    setLJJIJIL5 = C08CX.INSTANCE;
                }
                n nVar10 = tabStabilityData2.abExpInfo;
                if (nVar10 == null || (setLJJIJIL6 = nVar10.LJJIJIL()) == null) {
                    setLJJIJIL6 = C08CX.INSTANCE;
                }
                Set<String> setLLIIJLIL3 = C13LP.LLIIJLIL(setLJJIJIL5, setLJJIJIL6);
                HashMap map3 = new HashMap();
                for (String str3 : setLLIIJLIL3) {
                    n nVar11 = tabStabilityData.abExpInfo;
                    if (nVar11 != null) {
                        kVarLJJIIZ3 = nVar11.LJJIIZ(str3);
                    } else {
                        kVarLJJIIZ3 = null;
                    }
                    n nVar12 = tabStabilityData2.abExpInfo;
                    if (nVar12 != null) {
                        kVarLJJIIZ4 = nVar12.LJJIIZ(str3);
                    } else {
                        kVarLJJIIZ4 = null;
                    }
                    if (!Intrinsics.LJFF(kVarLJJIIZ3, kVarLJJIIZ4)) {
                        map3.put(str3, new Pair(kVarLJJIIZ3, kVarLJJIIZ4));
                    }
                }
                if ((!map2.isEmpty()) || (!map3.isEmpty())) {
                    arrayList2.add(new C343540DdQ(map2, map3));
                }
                n nVar13 = tabStabilityData.serverPersonalize;
                if (nVar13 == null || (setLJJIJIL7 = nVar13.LJJIJIL()) == null) {
                    setLJJIJIL7 = C08CX.INSTANCE;
                }
                n nVar14 = tabStabilityData2.serverPersonalize;
                if (nVar14 == null || (setLJJIJIL8 = nVar14.LJJIJIL()) == null) {
                    setLJJIJIL8 = C08CX.INSTANCE;
                }
                Set<String> setLLIIJLIL4 = C13LP.LLIIJLIL(setLJJIJIL7, setLJJIJIL8);
                final HashMap map4 = new HashMap();
                for (String str4 : setLLIIJLIL4) {
                    n nVar15 = tabStabilityData.serverPersonalize;
                    if (nVar15 != null) {
                        kVarLJJIIZ = nVar15.LJJIIZ(str4);
                    } else {
                        kVarLJJIIZ = null;
                    }
                    n nVar16 = tabStabilityData2.serverPersonalize;
                    if (nVar16 != null) {
                        kVarLJJIIZ2 = nVar16.LJJIIZ(str4);
                    } else {
                        kVarLJJIIZ2 = null;
                    }
                    if (!Intrinsics.LJFF(kVarLJJIIZ, kVarLJJIIZ2)) {
                        map4.put(str4, new Pair(kVarLJJIIZ, kVarLJJIIZ2));
                    }
                }
                list = arrayList2;
                if (!map4.isEmpty()) {
                    arrayList2.add(new AbstractC343530DdP(map4) { // from class: X.0DdU
                        public final Map<String, Pair<k, k>> LIZIZ;

                        @Override // X.AbstractC343530DdP
                        public final List<C343690Ddf> LIZIZ() {
                            String strLIZ;
                            String strLIZ2;
                            if (this.LIZIZ.isEmpty()) {
                                return C13BV.INSTANCE;
                            }
                            Map<String, Pair<k, k>> map5 = this.LIZIZ;
                            ArrayList arrayList3 = new ArrayList(map5.size());
                            for (Map.Entry<String, Pair<k, k>> entry : map5.entrySet()) {
                                String key = entry.getKey();
                                k first = entry.getValue().getFirst();
                                k second = entry.getValue().getSecond();
                                String str5 = "";
                                if (first == null || (strLIZ = AbstractC343530DdP.LIZ(first)) == null) {
                                    strLIZ = "";
                                }
                                if (second != null && (strLIZ2 = AbstractC343530DdP.LIZ(second)) != null) {
                                    str5 = strLIZ2;
                                }
                                arrayList3.add(new C343690Ddf(key, strLIZ, str5));
                            }
                            return arrayList3;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(EnumC343590DdV.SERVER_TAB_FRAMEWORK_PERSONALIZE);
                            this.LIZIZ = map4;
                        }
                    });
                    list = arrayList2;
                }
            }
        }
        if (!(!listSingletonList.isEmpty()) && !(!list.isEmpty())) {
            if (tabStabilityData2.LIZIZ(tabStabilityData)) {
                LIZLLL(c19eg, enumC1585090rLn, tabStabilityData, tabStabilityData2, C13BV.INSTANCE, Collections.singletonList(new AbstractC343530DdP() { // from class: X.0Dda
                    {
                        EnumC343590DdV enumC343590DdV = EnumC343590DdV.SERVER_OTHER;
                    }
                }));
            }
        } else {
            LIZLLL(c19eg, enumC1585090rLn, tabStabilityData, tabStabilityData2, listSingletonList, list);
            LIZLLL = false;
        }
    }

    public static void LIZLLL(C19EG c19eg, EnumC1585090rLn enumC1585090rLn, TabStabilityData tabStabilityData, TabStabilityData tabStabilityData2, List list, List list2) throws JSONException {
        JSONObject jSONObjectLIZJ;
        Object next;
        Object c098200Yq;
        String strJ3;
        Iterator<String> itKeys;
        Iterator<String> itKeys2;
        C343540DdQ c343540DdQ;
        String strLJIL;
        String strLJIL2;
        Objects.toString(enumC1585090rLn);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AbstractC343530DdP) it2.next()).LIZ);
        }
        arrayList.toString();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((AbstractC343530DdP) it3.next()).LIZ);
        }
        JSONObject jSONObjectLIZJ2 = null;
        if (tabStabilityData != null) {
            jSONObjectLIZJ = tabStabilityData.LIZJ(true);
        } else {
            jSONObjectLIZJ = null;
        }
        JSONObject jSONObjectLIZJ3 = tabStabilityData2.LIZJ(false);
        JSONObject jSONObject = new JSONObject();
        C2096608Jg.LIZIZ(jSONObject, jSONObjectLIZJ);
        C2096608Jg.LIZIZ(jSONObject, jSONObjectLIZJ3);
        if (tabStabilityData != null) {
            if (tabStabilityData.updateTimestamp != 0) {
                jSONObject.put("update_time_interval", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf((System.currentTimeMillis() - r4) / 1000.0d)}, 1)));
            }
        }
        List listLJLIL = C13LP.LJLIL(list2, list);
        ArrayList arrayList3 = (ArrayList) listLJLIL;
        Iterator it4 = arrayList3.iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                if (next instanceof C343540DdQ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if ((next instanceof C343540DdQ) && (c343540DdQ = (C343540DdQ) next) != null) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (Map.Entry<String, Pair<k, k>> entry : c343540DdQ.LIZIZ.entrySet()) {
                k first = entry.getValue().getFirst();
                if (first != null) {
                    strLJIL = first.LJIL();
                } else {
                    strLJIL = null;
                }
                k second = entry.getValue().getSecond();
                if (second != null) {
                    strLJIL2 = second.LJIL();
                } else {
                    strLJIL2 = null;
                }
                if (C123100dR.LIZ(strLJIL)) {
                    arrayList4.add(strLJIL);
                }
                if (C123100dR.LIZ(strLJIL2)) {
                    arrayList5.add(strLJIL2);
                }
            }
            jSONObject.put("pre_vids", C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62));
            jSONObject.put("vids", C13LP.LJJLIIIJ(arrayList5, ",", null, null, 0, null, null, 62));
        }
        Object objLJJLIIIJ = C13LP.LJJLIIIJ(listLJLIL, ",", null, null, 0, null, AFwS232S0000000_4.get$arr$(184), 30);
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((AbstractC343530DdP) it5.next()).LIZIZ());
        }
        List listLJIJJLI = C15438062q.LJIJJLI(arrayList6);
        jSONObject.put("diff_reasons", objLJJLIIIJ);
        ArrayList<C343690Ddf> arrayList7 = (ArrayList) listLJIJJLI;
        if (!arrayList7.isEmpty()) {
            jSONObject.put("diff_sub_reasons", C13LP.LJJLIIIJ(listLJIJJLI, ",", null, null, 0, null, AFwS232S0000000_4.get$arr$(183), 30));
            JSONArray jSONArray = new JSONArray();
            for (C343690Ddf c343690Ddf : arrayList7) {
                c343690Ddf.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sub_reason", c343690Ddf.LIZ);
                jSONObject2.put("from", c343690Ddf.LIZIZ);
                jSONObject2.put("to", c343690Ddf.LIZJ);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("diff_extra_infos", jSONArray);
        }
        String str = "";
        try {
            try {
                LIZ.getClass();
                c098200Yq = new JSONObject(LIZJ().getString("tab_stability_common_mob_params", ""));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            JSONObject jSONObject3 = (JSONObject) c098200Yq;
            ITabStrip iTabStripLIZJ = (ITabStrip) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), ITabStrip.class, null);
            if (iTabStripLIZJ == null) {
                iTabStripLIZJ = C343720Ddi.LIZIZ.LIZJ(C343710Ddh.LIZ(c19eg).Ki("HOME"));
            }
            HomePageCommonService homePageCommonService = (HomePageCommonService) PluggableExtentionKt.pluggableSpi$default(HomePageCommonService.class, false, false, false, 14, null);
            if (homePageCommonService != null) {
                jSONObjectLIZJ2 = homePageCommonService.LIZJ(c19eg, iTabStripLIZJ);
            }
            if (jSONObject3 != null && (itKeys2 = jSONObject3.keys()) != null) {
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pre_");
                    sbLIZ.append(next2);
                    jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), jSONObject3.opt(next2));
                }
            }
            if (jSONObjectLIZJ2 != null && (itKeys = jSONObjectLIZJ2.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next3 = itKeys.next();
                    jSONObject.put(next3, jSONObjectLIZJ2.opt(next3));
                }
            }
            Keva kevaLIZJ = LIZJ();
            if (jSONObjectLIZJ2 != null && (strJ3 = C786410Ut5.J3(jSONObjectLIZJ2)) != null) {
                str = strJ3;
            }
            kevaLIZJ.storeString("tab_stability_common_mob_params", str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20684815ws.LJIJ("homepage_tab_did_change", jSONObject);
        C1586120rNS c1586120rNS = C1586120rNS.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("homepage_tab_did_change: ");
        sbLIZ2.append(jSONObject);
        C1586120rNS.LIZ(c1586120rNS, "TabStabilityReporter", C2188811AlT.LIZIZ(sbLIZ2));
        Keva kevaLIZJ2 = LIZJ();
        C1227904rF.LIZ.getClass();
        kevaLIZJ2.storeString("tab_stability_data", C1227904rF.LJI(tabStabilityData2));
        LJIIIIZZ = true;
    }
}
