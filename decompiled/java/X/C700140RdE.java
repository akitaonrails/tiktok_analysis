package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700140RdE {
    public static final boolean LJ(BaseCellTriggerComponent<?> baseCellTriggerComponent) {
        AssemSupervisor assemSupervisorLJI = C695930RRn.LJI(baseCellTriggerComponent);
        if (assemSupervisorLJI == null) {
            return true;
        }
        if (!assemSupervisorLJI.LLJJ.containsKey(baseCellTriggerComponent.getType())) {
            CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList = assemSupervisorLJI.LLJILLL;
            if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
                return false;
            }
            Iterator<AbstractC738140SxQ> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getClass(), C09R7.LIZ(baseCellTriggerComponent.getType()))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final ConditionData LIZLLL(ClientStandardModel clientStandardModel, String str) {
        ConditionData conditionData;
        Map<String, ConditionData> map = clientStandardModel.componentsConditionMap;
        if (C19719512Dh.LJII(map) && map != null && (conditionData = map.get(str)) != null) {
            return conditionData;
        }
        Boolean bool = Boolean.TRUE;
        ConditionData conditionData2 = new ConditionData(null, Integer.MAX_VALUE, bool, bool, bool, true, false);
        Map<String, ConditionData> map2 = clientStandardModel.componentsConditionMap;
        if (C19719512Dh.LJII(map2) && map2 != null) {
            map2.put(str, conditionData2);
        }
        return conditionData2;
    }

    public static boolean LIZJ(C12835050n c12835050n, FcpNodeProtocol fcpNodeProtocol, InterfaceC700210RdL interfaceC700210RdL) {
        C13BV c13bv = C13BV.INSTANCE;
        List listLJIIL = C1697810uHb.LJIIL(interfaceC700210RdL.LIZ());
        Object parameter = interfaceC700210RdL.getParameter("conditions");
        Iterable iterable = null;
        if (!(parameter instanceof Map) || parameter == null) {
            interfaceC700210RdL.getParameters();
        }
        String strLLLII = fcpNodeProtocol.LLLII();
        interfaceC700210RdL.getSource();
        Object parameter2 = interfaceC700210RdL.getParameter("nodeKeys");
        if (parameter2 instanceof List) {
            iterable = (Iterable) parameter2;
        }
        if (iterable != null && C13LP.LJJJJ(strLLLII, iterable)) {
            return true;
        }
        boolean z = !C13LP.LJJL(c13bv, C13LP.LLIIJI(listLJIIL)).isEmpty();
        if (!z) {
            c12835050n.LIZ("don't handle signal", C2097608Jq.LJIIIIZZ(new Pair("incoming_signal", listLJIIL), new Pair("is_accepted", Boolean.FALSE)));
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1445305lD LIZ(com.bytedance.assem.arch.reused.ReusedAssem<?> r19, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol r20, com.ss.android.ugc.aweme.feed.model.banner.ConditionData r21, java.lang.String r22, X.C700190RdJ r23) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700140RdE.LIZ(com.bytedance.assem.arch.reused.ReusedAssem, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol, com.ss.android.ugc.aweme.feed.model.banner.ConditionData, java.lang.String, X.0RdJ):X.05lD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.AbstractC738140SxQ r28, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol r29, java.lang.String r30, X.C700190RdJ r31, java.util.List<X.C1445305lD> r32, java.util.Map<java.lang.String, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol> r33) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700140RdE.LIZIZ(X.0SxQ, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol, java.lang.String, X.0RdJ, java.util.List, java.util.Map):void");
    }
}
