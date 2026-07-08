package X;

import Y.ARunnableS123S0100000_23;
import android.text.TextUtils;
import com.bytedance.android.monitorV2.debug.MonitorDebugTool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS212S0000000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520730pfz {
    public static final C1520700pfw LIZ = new C1520700pfw();
    public static final ConcurrentHashMap<String, AtomicLong> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, AtomicLong> LIZJ = new ConcurrentHashMap<>();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(277));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(X.C1520560pfi r14, com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo.BidConfig r15) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1520730pfz.LIZIZ(X.0pfi, com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo$BidConfig):boolean");
    }

    public static final void LIZJ(C1520560pfi c1520560pfi, InterfaceC1520860pgC interfaceC1520860pgC) {
        boolean z;
        String strLIZIZ;
        if (c1520560pfi == null) {
            z = true;
        } else {
            z = c1520560pfi instanceof C1520220pfA;
        }
        String str = null;
        if (z) {
            ((C1522170piJ) LIZLLL.getValue()).LIZ(new Pair(c1520560pfi, interfaceC1520860pgC));
        } else if (c1520560pfi instanceof C1520340pfM) {
            ((C1522170piJ) LIZLLL.getValue()).LIZ(new Pair(c1520560pfi, null));
        }
        if (c1520560pfi instanceof C1520220pfA) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("com:");
            AbstractC1520150pf3 abstractC1520150pf3 = ((C1520220pfA) c1520560pfi).LJIILIIL;
            if (abstractC1520150pf3 != null) {
                str = abstractC1520150pf3.LIZ;
            }
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            if (!(c1520560pfi instanceof C1520340pfM)) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cus:");
            C1520350pfN c1520350pfN = ((C1520340pfM) c1520560pfi).LJIILIIL;
            if (c1520350pfN != null) {
                str = c1520350pfN.LIZJ;
            }
            sbLIZ2.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (strLIZIZ != null && strLIZIZ.length() != 0) {
            ConcurrentHashMap<String, AtomicLong> concurrentHashMap = LIZJ;
            AtomicLong atomicLong = concurrentHashMap.get(strLIZIZ);
            if (atomicLong != null) {
                atomicLong.incrementAndGet();
                return;
            }
            AtomicLong atomicLong2 = new AtomicLong();
            AtomicLong atomicLongPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ, atomicLong2);
            if (atomicLongPutIfAbsent != null) {
                atomicLong2 = atomicLongPutIfAbsent;
            }
            atomicLong2.incrementAndGet();
        }
    }

    public static void LIZ(InterfaceC1520860pgC interfaceC1520860pgC, JSONObject jSONObject, String str, String str2, C1520560pfi c1520560pfi) {
        C1520700pfw c1520700pfw = LIZ;
        c1520700pfw.getClass();
        String strLIZIZ = "custom";
        if (!TextUtils.equals("custom", str)) {
            String strLJIIJ = C1520640pfq.LJIIJ("navigation_id", C1520640pfq.LJII("nativeBase", jSONObject));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(strLJIIJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c1520700pfw.LIZ.containsKey(str) && TextUtils.equals(strLIZIZ, null)) {
            InterfaceC1520720pfy interfaceC1520720pfy = c1520700pfw.LIZ.get(str);
            if (interfaceC1520720pfy != null) {
                if (interfaceC1520720pfy.LIZ(c1520700pfw.LIZIZ, jSONObject)) {
                    c1520700pfw.LIZJ++;
                    c1520560pfi.onEventTerminated(EnumC1520250pfD.EVENT_REPEATED);
                } else {
                    c1520700pfw.LIZ();
                    LIZLLL(interfaceC1520860pgC, jSONObject, str, str2, c1520560pfi);
                }
            }
        } else {
            c1520700pfw.LIZ();
            LIZLLL(interfaceC1520860pgC, jSONObject, str, str2, c1520560pfi);
        }
        c1520700pfw.LJFF = interfaceC1520860pgC;
        c1520700pfw.LIZIZ = jSONObject;
        c1520700pfw.LIZLLL = str;
        c1520700pfw.LJ = str2;
    }

    public static void LIZLLL(InterfaceC1520860pgC interfaceC1520860pgC, JSONObject jSONObject, String str, String str2, C1520560pfi c1520560pfi) {
        Object c098200Yq;
        String str3;
        if (jSONObject != null && str != null && str2 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                C12868051u.LJI(jSONObject2, "extra", jSONObject);
                if (interfaceC1520860pgC != null && !(interfaceC1520860pgC instanceof C1520400pfS)) {
                    interfaceC1520860pgC.LIZ(0, jSONObject2);
                } else if (EnumC1521240pgo.logType.isEnabled()) {
                    if (C1520750pg1.LIZ.contains(str)) {
                        str3 = "bd_hybrid_monitor_p_zero";
                    } else if (C1520750pg1.LIZIZ.contains(str)) {
                        str3 = "bd_hybrid_monitor_p_one";
                    } else {
                        str3 = "bd_hybrid_monitor_normal";
                    }
                    if (!MonitorDebugTool.isApmInstantEventOn()) {
                        C793770VBv.LJ(str3, jSONObject2);
                    }
                } else if (!MonitorDebugTool.isApmInstantEventOn()) {
                    C793770VBv.LJII("bd_hybrid_monitor_service_all_in_one", null, null, jSONObject2);
                }
                if (c1520560pfi != null && (!EnumC1521240pgo.eventStream.not())) {
                    C824310WVh.LIZIZ(new ARunnableS123S0100000_23(c1520560pfi, 104));
                }
                C1520380pfQ.LIZ.getClass();
                List<InterfaceC1520330pfL> list = C1520380pfQ.LJFF;
                if (list != null && (!((CopyOnWriteArrayList) list).isEmpty())) {
                    Iterator it2 = ((CopyOnWriteArrayList) list).iterator();
                    while (it2.hasNext()) {
                        try {
                            ((InterfaceC1520330pfL) it2.next()).LIZ(str, jSONObject2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1520960pgM.LIZIZ(th);
                        }
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null && c1520560pfi != null) {
                c1520560pfi.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
                return;
            }
            return;
        }
        if (c1520560pfi != null) {
            c1520560pfi.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
        }
    }
}
