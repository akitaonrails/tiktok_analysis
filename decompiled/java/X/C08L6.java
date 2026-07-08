package X;

import Y.ARunnableS0S2000000_3;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS1S1000000_3;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.trace.EcomTraceExitEvent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08L6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08L6 {
    public static final C08L6 LIZ = new C08L6();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final BPEAHandler LJ;
    public static String LJFF;
    public static EcomTraceExitEvent LJI;
    public static final C08L7 LJII;

    static {
        boolean z = false;
        IApplicationDependencyService iApplicationDependencyService = (IApplicationDependencyService) PluggableExtentionKt.pluggableSpi$default(IApplicationDependencyService.class, false, false, false, 14, null);
        if (iApplicationDependencyService != null && iApplicationDependencyService.isLocalTest()) {
            z = true;
        }
        LIZJ = z;
        LIZLLL = C08L4.LIZ.enable;
        LJ = C1507830pLB.LIZJ;
        LJII = C08L7.LL;
    }

    public static void LIZLLL() {
        if (LIZJ && !C08L8.LIZ()) {
            throw new IllegalStateException("Call in Main Thread!!!");
        }
    }

    public static void LIZIZ(String str) {
        if (!C08L8.LIZ()) {
            BPEAHandler bPEAHandler = LJ;
            C786410Ut5.LJLJJLL(bPEAHandler, Message.obtain(bPEAHandler, new ARunnableS1S1000000_3(str, 3)));
        } else {
            LIZJ(str, "normal");
        }
    }

    public static void LJFF(String str) {
        Printer printer;
        if (!LIZLLL || Intrinsics.LJFF(str, LJFF)) {
            return;
        }
        String str2 = LJFF;
        if (str2 != null) {
            LIZ.getClass();
            LIZJ(str2, "replaced");
        }
        LJFF = str;
        if (LIZIZ.compareAndSet(false, true)) {
            C2100808Kw c2100808Kw = C2101008Ky.LIZ;
            C2100808Kw c2100808Kw2 = new C2100808Kw(0);
            if (!C2101008Ky.LIZIZ) {
                C2101008Ky.LIZ = c2100808Kw2;
                try {
                    Field declaredField = Looper.class.getDeclaredField("mLogging");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(Looper.getMainLooper());
                    if (obj instanceof Printer) {
                        printer = (Printer) obj;
                    } else {
                        printer = null;
                    }
                    C2101008Ky.LIZJ = printer;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C2101008Ky.LIZLLL = new C08L0();
                C786410Ut5.LJIIZILJ(Looper.getMainLooper(), new Printer() { // from class: X.08Kz
                    @Override // android.util.Printer
                    public final void println(String str3) {
                        C08L0 c08l0;
                        if (str3 == null) {
                            return;
                        }
                        Printer printer2 = C2101008Ky.LIZJ;
                        if (printer2 != null) {
                            printer2.println(str3);
                        }
                        String str4 = null;
                        if (u.LJJIIJZLJL(str3, ">>>>> Dispatching to", false)) {
                            C2101008Ky.LJIIIIZZ = System.nanoTime();
                            if (u.LJJIIJZLJL(str3, ">>>>> Dispatching to", false) && str3.length() > 21) {
                                str3 = a0.LJLIIIL(str3.substring(21)).toString();
                            }
                            C2101008Ky.LJIIIZ = str3;
                            if (C2101008Ky.LJ != null && (c08l0 = C2101008Ky.LIZLLL) != null) {
                                long j = C2101008Ky.LIZ.LIZ;
                                c08l0.LIZJ = null;
                                C786410Ut5.LJLIIL(j, c08l0.LIZIZ, new ARunnableS103S0100000_3(c08l0, 94));
                                return;
                            }
                            return;
                        }
                        if (!u.LJJIIJZLJL(str3, "<<<<< Finished to", false)) {
                            return;
                        }
                        long jNanoTime = System.nanoTime();
                        C08L0 c08l02 = C2101008Ky.LIZLLL;
                        if (c08l02 != null) {
                            c08l02.LIZIZ.removeCallbacksAndMessages(null);
                        }
                        if (C2101008Ky.LJ != null) {
                            ThreadLocal<String> threadLocal = C08L1.LIZ;
                            String str5 = threadLocal.get();
                            threadLocal.remove();
                            if (str5 != null) {
                                if (c08l02 != null) {
                                    c08l02.LIZJ = null;
                                }
                            } else if (c08l02 != null) {
                                String str6 = c08l02.LIZJ;
                                c08l02.LIZJ = null;
                                str4 = str6;
                            }
                            ((ArrayList) C2101008Ky.LJII).add(new C2100408Ks(C2101008Ky.LJIIIIZZ, jNanoTime, C2101008Ky.LJIIIZ, str5, str4));
                            if (!C2101008Ky.LJFF) {
                                return;
                            }
                            C2101008Ky.LIZ();
                            return;
                        }
                        ThreadLocal<String> threadLocal2 = C08L1.LIZ;
                        threadLocal2.get();
                        threadLocal2.remove();
                    }
                });
                C2101008Ky.LIZIZ = true;
            }
            C2101008Ky.LJIIJ.add(new InterfaceC2100608Ku() { // from class: X.08Kv
                public static JSONObject LIZIZ(List list) throws JSONException {
                    long jLongValue;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C2100908Kx c2100908Kx : (ArrayList) list) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c2100908Kx.LIZ);
                        sbLIZ.append('@');
                        sbLIZ.append(c2100908Kx.LIZIZ);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        Object arrayList = linkedHashMap.get(strLIZIZ);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(strLIZIZ, arrayList);
                        }
                        ((List) arrayList).add(Long.valueOf(c2100908Kx.LIZJ));
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str3 = (String) entry.getKey();
                        List list2 = (List) entry.getValue();
                        int size = list2.size();
                        Long l = (Long) C13LP.LJJLIIIJLJLI(list2);
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        long jLJZL = C13LP.LJZL(list2) / ((long) size);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("count", size);
                        jSONObject2.put("max", jLongValue);
                        jSONObject2.put("avg", jLJZL);
                        jSONObject.put(str3, jSONObject2);
                    }
                    return jSONObject;
                }

                public static void LIZJ(C2100308Kr c2100308Kr) {
                    if (!C08L4.LIZ.debug) {
                        return;
                    }
                    for (C2100508Kt c2100508Kt : c2100308Kr.LJIIJJI) {
                        String strLIZIZ = C08L2.LIZIZ(c2100508Kt.LIZJ);
                        String strLIZ = C08L2.LIZ(c2100508Kt.LIZIZ);
                        if (C08L2.LIZJ(strLIZIZ, strLIZ)) {
                            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, c2100308Kr.LIZ), new Pair("duration_ms", Long.valueOf(c2100508Kt.LIZ)), new Pair("handler_info", C08L2.LIZLLL(c2100508Kt.LIZIZ)), new Pair("stack", strLIZIZ), new Pair("handler", strLIZ));
                            String str3 = c2100508Kt.LIZJ;
                            if (str3 != null && !a0.LJJJIL(str3)) {
                                mapLJIIJ.put("stack_trace", C13LN.LJZL(512, c2100508Kt.LIZJ));
                            }
                            C1018703yb.LJ("ec_trace_debug_slow_msg", mapLJIIJ);
                        }
                    }
                }

                public static void LIZLLL(C2100308Kr c2100308Kr) throws JSONException {
                    int i;
                    int i2;
                    Pair[] pairArr;
                    String str3;
                    List<C2100508Kt> list = c2100308Kr.LJIIJ;
                    ArrayList<C2100508Kt> arrayList = new ArrayList();
                    for (C2100508Kt c2100508Kt : list) {
                        if (c2100508Kt.LIZ >= 32) {
                            arrayList.add(c2100508Kt);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    for (C2100508Kt c2100508Kt2 : arrayList) {
                        arrayList2.add(new C2100908Kx(C08L2.LIZIZ(c2100508Kt2.LIZJ), C08L2.LIZ(c2100508Kt2.LIZIZ), c2100508Kt2.LIZ, c2100508Kt2));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        if (((C2100908Kx) obj2).LIZJ >= 50) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (((C2100908Kx) obj3).LIZJ < 50) {
                            arrayList4.add(obj3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : arrayList3) {
                        C2100908Kx c2100908Kx = (C2100908Kx) obj4;
                        if (C08L2.LIZJ(c2100908Kx.LIZ, c2100908Kx.LIZIZ)) {
                            arrayList5.add(obj4);
                        }
                    }
                    ArrayList<C2100908Kx> arrayList6 = new ArrayList();
                    for (Object obj5 : arrayList3) {
                        C2100908Kx c2100908Kx2 = (C2100908Kx) obj5;
                        if (!C08L2.LIZJ(c2100908Kx2.LIZ, c2100908Kx2.LIZIZ)) {
                            arrayList6.add(obj5);
                        }
                    }
                    Pair[] pairArr2 = new Pair[10];
                    pairArr2[0] = new Pair(Scene.SCENE_SERVICE, c2100308Kr.LIZ);
                    pairArr2[1] = new Pair("end_reason", c2100308Kr.LIZIZ);
                    pairArr2[2] = new Pair("total_ms", Long.valueOf(c2100308Kr.LIZJ));
                    pairArr2[3] = new Pair("busy_ms", Long.valueOf(c2100308Kr.LIZLLL));
                    pairArr2[4] = new Pair("idle_ms", Long.valueOf(c2100308Kr.LJ));
                    long j = c2100308Kr.LIZLLL;
                    long j2 = c2100308Kr.LIZJ;
                    if (j2 <= 0) {
                        i = 0;
                    } else {
                        i = (int) ((j / j2) * ((double) 100));
                    }
                    pairArr2[5] = new Pair("busy_pct", Integer.valueOf(i));
                    pairArr2[6] = new Pair("msg_count", Integer.valueOf(c2100308Kr.LJFF));
                    pairArr2[7] = new Pair("phase_count", Integer.valueOf(c2100308Kr.LJI.size()));
                    pairArr2[8] = new Pair("other_ms", Long.valueOf(c2100308Kr.LJIIIZ));
                    long j3 = c2100308Kr.LJIIIZ;
                    long j4 = c2100308Kr.LIZJ;
                    if (j4 <= 0) {
                        i2 = 0;
                    } else {
                        i2 = (int) ((j3 / j4) * ((double) 100));
                    }
                    pairArr2[9] = new Pair("other_pct", Integer.valueOf(i2));
                    Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr2);
                    if (!c2100308Kr.LJI.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        for (C1969707nb c1969707nb : c2100308Kr.LJI) {
                            jSONObject.put(c1969707nb.LIZ, c1969707nb.LIZIZ);
                        }
                        mapLJIIJ.put("phases", C786410Ut5.J3(jSONObject));
                    }
                    if (!arrayList5.isEmpty()) {
                        mapLJIIJ.put("slow_groups", C786410Ut5.J3(LIZIZ(arrayList5)));
                    }
                    if (!arrayList6.isEmpty()) {
                        mapLJIIJ.put("unknown_groups", C786410Ut5.J3(LIZIZ(arrayList6)));
                    }
                    if (!arrayList4.isEmpty()) {
                        mapLJIIJ.put("minor_groups", C786410Ut5.J3(LIZIZ(arrayList4)));
                    }
                    C1018703yb.LJ("ec_trace_summary", mapLJIIJ);
                    for (C2100908Kx c2100908Kx3 : arrayList6) {
                        try {
                            pairArr = new Pair[4];
                            pairArr[0] = new Pair(Scene.SCENE_SERVICE, c2100308Kr.LIZ);
                            pairArr[1] = new Pair("duration_ms", Long.valueOf(c2100908Kx3.LIZJ));
                            pairArr[2] = new Pair("handler", c2100908Kx3.LIZIZ);
                        } catch (Exception e2) {
                            e = e2;
                        }
                        try {
                            pairArr[3] = new Pair("stack", c2100908Kx3.LIZ);
                            Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr);
                            if (!C08L2.LIZLLL.contains(c2100908Kx3.LIZIZ)) {
                                String strLIZLLL = C08L2.LIZLLL(c2100908Kx3.LIZLLL.LIZIZ);
                                if (!a0.LJJJIL(strLIZLLL)) {
                                    mapLJIIJ2.put("handler_raw", strLIZLLL);
                                }
                            }
                            if (!C08L2.LIZJ.contains(c2100908Kx3.LIZ) && (str3 = c2100908Kx3.LIZLLL.LIZJ) != null && !a0.LJJJIL(str3)) {
                                mapLJIIJ2.put("stack_raw", C13LN.LJZL(512, c2100908Kx3.LIZLLL.LIZJ));
                            }
                            C1018703yb.LJ("ec_trace_slow_msg", mapLJIIJ2);
                        } catch (Exception e3) {
                            e = e3;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }

                @Override // X.InterfaceC2100608Ku
                public final void LIZ(C2100308Kr c2100308Kr) {
                    try {
                        LIZLLL(c2100308Kr);
                        LIZJ(c2100308Kr);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            });
        }
        LIZLLL();
        C08L5.LIZ.getClass();
        float fLIZ = C08L5.LIZ(str);
        if (fLIZ > 0.0f) {
            IOptimizerHelperService iOptimizerHelperService = (IOptimizerHelperService) PluggableExtentionKt.pluggableSpi$default(IOptimizerHelperService.class, false, false, false, 14, null);
            if (iOptimizerHelperService != null) {
                iOptimizerHelperService.sh(str);
            }
            C146A c146aLIZ = C202103146b.LIZ(0, str);
            c146aLIZ.LIZIZ(fLIZ);
            c146aLIZ.LIZ("start");
        }
        if (C2101008Ky.LIZIZ) {
            if (C2101008Ky.LJ != null) {
                C2101008Ky.LIZ();
            }
            C2101008Ky.LJ = str;
            C2101008Ky.LJFF = false;
            ((ArrayList) C2101008Ky.LJII).clear();
        }
        ThreadLocal<String> threadLocal = C08L1.LIZ;
        if (threadLocal.get() == null) {
            threadLocal.set("start");
        }
        C786410Ut5.LJLIIL(C08L4.LIZ.delayEnd, LJ, LJII);
    }

    public static void LIZ(String str, String str2) {
        if (!LIZLLL) {
            return;
        }
        if (!C08L8.LIZ()) {
            BPEAHandler bPEAHandler = LJ;
            C786410Ut5.LJLJJLL(bPEAHandler, Message.obtain(bPEAHandler, new ARunnableS0S2000000_3(str, str2, 4)));
            return;
        }
        if (!Intrinsics.LJFF(LJFF, str)) {
            return;
        }
        LIZLLL();
        C08L5.LIZ.getClass();
        if (C08L5.LIZ(str) > 0.0f) {
            C202103146b.LIZ(0, str).LIZ(str2);
        }
        C2100808Kw c2100808Kw = C2101008Ky.LIZ;
        ThreadLocal<String> threadLocal = C08L1.LIZ;
        if (threadLocal.get() == null) {
            threadLocal.set(str2);
        }
    }

    public static void LIZJ(String str, String str2) {
        if (!LIZLLL || !Intrinsics.LJFF(LJFF, str)) {
            return;
        }
        LJFF = null;
        LJI = null;
        LJ.removeCallbacks(LJII);
        LIZLLL();
        C08L5.LIZ.getClass();
        if (C08L5.LIZ(str) > 0.0f) {
            IOptimizerHelperService iOptimizerHelperService = (IOptimizerHelperService) PluggableExtentionKt.pluggableSpi$default(IOptimizerHelperService.class, false, false, false, 14, null);
            if (iOptimizerHelperService != null) {
                iOptimizerHelperService.LIZ(str);
            }
            C202103146b.LIZ(0, str).stop();
        }
        C2100808Kw c2100808Kw = C2101008Ky.LIZ;
        ThreadLocal<String> threadLocal = C08L1.LIZ;
        if (threadLocal.get() == null) {
            threadLocal.set("end");
        }
        if (C2101008Ky.LJ != null) {
            C2101008Ky.LJFF = true;
            C2101008Ky.LJI = str2;
        }
    }

    public static void LJ(String str, JSONObject jSONObject) {
        String str2;
        String string;
        Object objOpt;
        EcomTraceExitEvent ecomTraceExitEvent = LJI;
        if (ecomTraceExitEvent == null || (str2 = LJFF) == null || !Intrinsics.LJFF(str, ecomTraceExitEvent.eventName)) {
            return;
        }
        if (!ecomTraceExitEvent.matchers.isEmpty()) {
            List<Map<String, String>> list = ecomTraceExitEvent.matchers;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            for (Map<String, String> map : list) {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (jSONObject != null && (objOpt = jSONObject.opt(entry.getKey())) != null) {
                            string = objOpt.toString();
                        } else {
                            string = null;
                        }
                        if (!Intrinsics.LJFF(string, entry.getValue())) {
                            break;
                        }
                    }
                }
            }
            return;
        }
        LIZ(str2, str);
        LIZIZ(str2);
    }
}
