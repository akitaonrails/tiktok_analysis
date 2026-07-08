package X;

import com.bytedance.pns.engine.Action;
import com.bytedance.pns.engine.ExecuteResult;
import com.bytedance.pns.engine.StrategyResult;
import com.bytedance.pns.engine.builtin.BuiltinNativeStrategyConfig;
import com.bytedance.pns.engine.builtin.BuiltinStrategyInitService;
import com.bytedance.pns.engine.builtin.StrategyProtocol;
import com.bytedance.pumbaa.base2.event.IDecisionTraceAppender;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0WZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825480WZu {
    public static final C825480WZu LIZ = new C825480WZu();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, List<String>> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, StrategyProtocol> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C825470WZt> LJFF = new ConcurrentHashMap<>();
    public static final Set<String> LJI = new LinkedHashSet();
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(406));

    static {
        try {
            Iterator it2 = ServiceManager.get().getServices(BuiltinStrategyInitService.class).iterator();
            while (it2.hasNext()) {
                try {
                    ((BuiltinStrategyInitService) it2.next()).init();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static final void LIZ(BuiltinNativeStrategyConfig builtinNativeStrategyConfig) {
        for (C825540Wa0 c825540Wa0 : builtinNativeStrategyConfig.config().LIZIZ) {
            for (String str : c825540Wa0.LIZ) {
                int i = C825510WZx.LIZ[c825540Wa0.LIZJ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        ConcurrentHashMap<String, String> concurrentHashMap = LIZJ;
                        concurrentHashMap.containsKey(str);
                        concurrentHashMap.put(str, c825540Wa0.LIZIZ);
                    }
                } else {
                    ConcurrentHashMap<String, String> concurrentHashMap2 = LIZIZ;
                    concurrentHashMap2.containsKey(str);
                    concurrentHashMap2.put(str, c825540Wa0.LIZIZ);
                }
            }
        }
        for (C825560Wa2 c825560Wa2 : builtinNativeStrategyConfig.config().LIZ) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c825560Wa2.LIZIZ);
            ConcurrentHashMap<String, List<String>> concurrentHashMap3 = LIZLLL;
            concurrentHashMap3.containsKey(c825560Wa2.LIZ);
            concurrentHashMap3.put(c825560Wa2.LIZ, arrayList);
        }
    }

    public static final void LIZIZ(StrategyProtocol strategyProtocol) {
        if (!strategyProtocol.LIZIZ()) {
            return;
        }
        String str = strategyProtocol.config().LIZ;
        ConcurrentHashMap<String, StrategyProtocol> concurrentHashMap = LJ;
        if (!concurrentHashMap.containsKey(str)) {
            concurrentHashMap.put(str, strategyProtocol);
            for (C825470WZt c825470WZt : strategyProtocol.config().LIZJ) {
                ConcurrentHashMap<String, C825470WZt> concurrentHashMap2 = LJFF;
                concurrentHashMap2.contains(c825470WZt.LIZ);
                concurrentHashMap2.put(c825470WZt.LIZ, c825470WZt);
            }
        }
    }

    public static final void LIZJ(StrategyProtocol strategyProtocol) {
        try {
            if (!strategyProtocol.LIZIZ()) {
                return;
            }
            LJ.put(strategyProtocol.config().LIZ, strategyProtocol);
            for (C825470WZt c825470WZt : strategyProtocol.config().LIZJ) {
                LJFF.put(c825470WZt.LIZ, c825470WZt);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final ExecuteResult LIZLLL(InterfaceC825580Wa4 interfaceC825580Wa4, EnumC825520WZy enumC825520WZy, List<String> list, List<String> list2) {
        boolean zBooleanValue;
        ConcurrentHashMap<String, String> concurrentHashMap;
        boolean z;
        String str;
        Boolean bool = (Boolean) C308480C7i.LIZLLL(Boolean.TYPE, "pumbaa_builtin_strategy_enable", Boolean.TRUE);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (!zBooleanValue) {
            return null;
        }
        String strTriggerId = interfaceC825580Wa4.triggerId();
        int i = C825510WZx.LIZ[enumC825520WZy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                concurrentHashMap = LIZJ;
            } else {
                throw new C1954807lC();
            }
        } else {
            concurrentHashMap = LIZIZ;
        }
        String str2 = concurrentHashMap.get(strTriggerId);
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        List<String> list3 = LIZLLL.get(str2);
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            if (list != null) {
                arrayList2.addAll(list);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList3 = new ArrayList();
            Iterator<String> it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next = it2.next();
                    Set<String> set = LJI;
                    if ((!set.isEmpty()) && set.contains(next)) {
                        LIZ.getClass();
                        IDecisionTraceAppender iDecisionTraceAppender = (IDecisionTraceAppender) LJII.getValue();
                        if (iDecisionTraceAppender != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Strategy ");
                            sbLIZ.append(next);
                            sbLIZ.append(" is disabled temporarily, skip execution");
                            iDecisionTraceAppender.LIZ(interfaceC825580Wa4, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else if (arrayList.contains(next)) {
                        LIZ.getClass();
                        IDecisionTraceAppender iDecisionTraceAppender2 = (IDecisionTraceAppender) LJII.getValue();
                        if (iDecisionTraceAppender2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Strategy ");
                            sbLIZ2.append(next);
                            sbLIZ2.append(" is blocked, skip execution");
                            iDecisionTraceAppender2.LIZ(interfaceC825580Wa4, C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    } else if ((!arrayList2.isEmpty()) && !arrayList2.contains(next)) {
                        LIZ.getClass();
                        IDecisionTraceAppender iDecisionTraceAppender3 = (IDecisionTraceAppender) LJII.getValue();
                        if (iDecisionTraceAppender3 != null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Strategy ");
                            sbLIZ3.append(next);
                            sbLIZ3.append(" not in allowlist, skip execution");
                            iDecisionTraceAppender3.LIZ(interfaceC825580Wa4, C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } else {
                        StrategyProtocol strategyProtocol = LJ.get(next);
                        if (strategyProtocol != null) {
                            long jNanoTime = System.nanoTime();
                            try {
                                C825530WZz c825530WZzLIZ = strategyProtocol.LIZ(interfaceC825580Wa4);
                                long jNanoTime2 = System.nanoTime();
                                LIZ.getClass();
                                IDecisionTraceAppender iDecisionTraceAppender4 = (IDecisionTraceAppender) LJII.getValue();
                                if (iDecisionTraceAppender4 != null) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("Strategy ");
                                    sbLIZ4.append(next);
                                    sbLIZ4.append(" executed in ");
                                    sbLIZ4.append((jNanoTime2 - jNanoTime) / 1000.0d);
                                    sbLIZ4.append("us");
                                    iDecisionTraceAppender4.LIZ(interfaceC825580Wa4, C2188811AlT.LIZIZ(sbLIZ4));
                                }
                                if (c825530WZzLIZ == null) {
                                    arrayList3.add(new StrategyResult(null, 0L, null, next, next, C13BV.INSTANCE, null, true, 0L, strategyProtocol.config().LIZIZ, false));
                                } else {
                                    arrayList.addAll(c825530WZzLIZ.LIZJ);
                                    arrayList2.addAll(c825530WZzLIZ.LIZLLL);
                                    linkedHashSet.addAll(c825530WZzLIZ.LJ);
                                    ArrayList arrayList4 = new ArrayList();
                                    for (String str3 : c825530WZzLIZ.LIZ) {
                                        C825470WZt c825470WZt = LJFF.get(str3);
                                        if (c825470WZt != null) {
                                            Action action = new Action(null, null, c825470WZt.LIZIZ, str3);
                                            action.setParams(c825470WZt.LIZJ);
                                            arrayList4.add(action);
                                        }
                                    }
                                    arrayList3.add(new StrategyResult(null, 0L, null, next, next, arrayList4, null, true, 0L, strategyProtocol.config().LIZIZ, false));
                                    if (c825530WZzLIZ.LIZIZ) {
                                        z = true;
                                        break;
                                    }
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                str = "stop_others";
            } else {
                str = null;
            }
            return new ExecuteResult(str, null, strTriggerId, arrayList3, arrayList, arrayList2, linkedHashSet);
        }
        LIZ.getClass();
        IDecisionTraceAppender iDecisionTraceAppender5 = (IDecisionTraceAppender) LJII.getValue();
        if (iDecisionTraceAppender5 != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("No strategies found for collectionId '");
            sbLIZ5.append(str2);
            sbLIZ5.append('\'');
            iDecisionTraceAppender5.LIZ(interfaceC825580Wa4, C2188811AlT.LIZIZ(sbLIZ5));
        }
        return null;
    }
}
