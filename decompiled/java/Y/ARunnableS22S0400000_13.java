package Y;

import X.AbstractC802520Vdy;
import X.C013C;
import X.C0CCZ;
import X.C0WS5;
import X.C0WS6;
import X.C0WSB;
import X.C0WSC;
import X.C0WSF;
import X.C13LP;
import X.C1C7U;
import X.C2097608Jq;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C238400w2;
import X.C786410Ut5;
import X.C799670VYn;
import X.C799900VZk;
import X.C802600Ve6;
import X.C802790VeP;
import X.C802900Vea;
import X.C805380Via;
import X.C805400Vic;
import X.C823280WRi;
import X.InterfaceC823540WSi;
import android.net.Uri;
import com.bytedance.crash.crash.CrashSummary;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.pumbaa.hybrid.rasp.router.BostonRouterFilterRuleModel;
import com.bytedance.pumbaa.hybrid.rasp.router.BostonRouterInterceptorModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.tiktok.pns.ldp.api.model.PrivatisedDataStorageModel;
import com.tiktok.pns.ldp.api.model.UnknownDataStorageModel;
import com.tiktok.pns.ldp.lib.LDPManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import jl3.g;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS22S0400000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C799900VZk.LIZ.getClass();
        if (C799900VZk.LJFF().LJJI()) {
            int priority = C786410Ut5.u3().getPriority();
            if (C799900VZk.LJFF().LJIJ()) {
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 1);
            } else if (C799900VZk.LJFF().LJIIL()) {
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 2);
            } else if (C799900VZk.LJFF().LIZJ()) {
                ThreadMethodProxy.setPriority(C786410Ut5.u3(), 3);
            }
            C799900VZk.LIZIZ.LJ((C0CCZ) this.l0);
            ThreadMethodProxy.setPriority(C786410Ut5.u3(), priority);
        } else {
            C799900VZk.LIZIZ.LJ((C0CCZ) this.l0);
        }
        ((C238400w2) this.l1).element = System.currentTimeMillis() - jCurrentTimeMillis;
        ((C799670VYn) this.l2).LIZLLL(((C238400w2) this.l1).element, ((C013C) this.l3).element);
    }

    public static final void run$0(ARunnableS22S0400000_13 aRunnableS22S0400000_13) {
        try {
            aRunnableS22S0400000_13.LIZ$0();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS22S0400000_13 aRunnableS22S0400000_13) {
        boolean zLIZ;
        C1C7U.LIZ("CrashManager@b28c.uploadAll$1");
        for (int i = 0; i < ((List) aRunnableS22S0400000_13.l0).size(); i++) {
            try {
                C802600Ve6 c802600Ve6 = (C802600Ve6) aRunnableS22S0400000_13.l3;
                CrashSummary crashSummary = (CrashSummary) ListProtector.get((List) aRunnableS22S0400000_13.l0, i);
                C802790VeP c802790VeP = (C802790VeP) aRunnableS22S0400000_13.l1;
                File file = (File) ListProtector.get((List) aRunnableS22S0400000_13.l2, i);
                c802600Ve6.getClass();
                C802600Ve6.LIZIZ(crashSummary, c802790VeP, file);
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("CrashManager@b28c.uploadAll$1");
    }

    public static final void run$2(ARunnableS22S0400000_13 aRunnableS22S0400000_13) {
        String string;
        List<String> list;
        C805400Vic c805400Vic = (C805400Vic) aRunnableS22S0400000_13.l0;
        BostonRouterInterceptorModel bostonRouterInterceptorModel = (BostonRouterInterceptorModel) aRunnableS22S0400000_13.l1;
        Throwable th = (Throwable) aRunnableS22S0400000_13.l2;
        Uri uri = (Uri) aRunnableS22S0400000_13.l3;
        C1C7U.LIZ("RaspRouterInterceptor@fd49.bostonReport$1L");
        if (C13LP.LJJJJ(c805400Vic.LIZLLL, bostonRouterInterceptorModel.riskySchemas)) {
            List<String> list2 = bostonRouterInterceptorModel.riskySchemas;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c805400Vic.LIZLLL);
            sbLIZ.append(c805400Vic.LJFF);
            if (list2.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                List<BostonRouterFilterRuleModel> list3 = bostonRouterInterceptorModel.riskFilters;
                ArrayList arrayList = new ArrayList();
                for (BostonRouterFilterRuleModel bostonRouterFilterRuleModel : list3) {
                    BostonRouterFilterRuleModel bostonRouterFilterRuleModel2 = bostonRouterFilterRuleModel;
                    if (!Intrinsics.LJFF(bostonRouterFilterRuleModel2.schema, c805400Vic.LIZLLL)) {
                        String str = bostonRouterFilterRuleModel2.schema;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(c805400Vic.LIZLLL);
                        sbLIZ2.append(c805400Vic.LJFF);
                        if (Intrinsics.LJFF(str, C2188811AlT.LIZIZ(sbLIZ2))) {
                        }
                    }
                    arrayList.add(bostonRouterFilterRuleModel);
                }
                boolean zIsEmpty = arrayList.isEmpty();
                Iterator it2 = arrayList.iterator();
                loop1: while (true) {
                    if (it2.hasNext()) {
                        BostonRouterFilterRuleModel bostonRouterFilterRuleModel3 = (BostonRouterFilterRuleModel) it2.next();
                        if (Intrinsics.LJFF(bostonRouterFilterRuleModel3.key, "url") && (Intrinsics.LJFF(uri.getScheme(), "http") || Intrinsics.LJFF(uri.getScheme(), "https"))) {
                            string = uri.toString();
                            if (string != null) {
                                continue;
                            }
                        } else {
                            Map<String, String> map = c805400Vic.LJI;
                            if (map != null) {
                                string = map.get(bostonRouterFilterRuleModel3.key);
                                if (string != null && string.length() != 0) {
                                    List<String> list4 = bostonRouterFilterRuleModel3.filter;
                                    if ((list4 != null && list4.isEmpty()) || (list = bostonRouterFilterRuleModel3.filter) == null) {
                                        break;
                                    }
                                    Iterator<String> it3 = list.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break loop1;
                                        }
                                        String next = it3.next();
                                        if (a0.LJJIIZI(string, next, false)) {
                                            if (next == null) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    } else if (zIsEmpty) {
                        break;
                    }
                }
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("url", uri.toString()), new Pair("schema", c805400Vic.LIZIZ), new Pair("host", c805400Vic.LIZLLL), new Pair("path", c805400Vic.LJFF));
                if (!C805380Via.LJI(th)) {
                    k.LIZJ().LJ(th, "", mapLJIIIIZZ, C786410Ut5.u3().getName(), "boston_router_callingPoint", "boston_router_callingPoint");
                }
            }
        }
        C1C7U.LIZIZ("RaspRouterInterceptor@fd49.bostonReport$1L");
    }

    public static final void run$3(ARunnableS22S0400000_13 aRunnableS22S0400000_13) {
        PrivatisedDataStorageModel privatisedDataStorageModel = (PrivatisedDataStorageModel) aRunnableS22S0400000_13.l0;
        UnknownDataStorageModel unknownDataStorageModel = (UnknownDataStorageModel) aRunnableS22S0400000_13.l1;
        LDPManager lDPManager = (LDPManager) aRunnableS22S0400000_13.l2;
        InterfaceC823540WSi interfaceC823540WSi = (InterfaceC823540WSi) aRunnableS22S0400000_13.l3;
        C1C7U.LIZ("LDPManager@a83d.saveData$1L");
        if (privatisedDataStorageModel != null || unknownDataStorageModel != null) {
            if (lDPManager.LIZIZ >= lDPManager.LIZJ) {
                ScheduledExecutorService scheduledExecutorService = lDPManager.LJI;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.execute(new ARunnableS113S0100000_13(lDPManager, 166));
                }
                lDPManager.LIZIZ = 0;
            }
            lDPManager.LIZIZ++;
            String string = UUID.randomUUID().toString();
            if (privatisedDataStorageModel != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append('_');
                sbLIZ.append(lDPManager.LJIIIZ);
                interfaceC823540WSi.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), interfaceC823540WSi.LIZJ(privatisedDataStorageModel));
            }
            if (unknownDataStorageModel != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(string);
                sbLIZ2.append('_');
                sbLIZ2.append(lDPManager.LJIIJ);
                interfaceC823540WSi.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), interfaceC823540WSi.LIZJ(unknownDataStorageModel));
            }
        }
        C1C7U.LIZIZ("LDPManager@a83d.saveData$1L");
    }

    public static final void run$4(ARunnableS22S0400000_13 aRunnableS22S0400000_13) {
        long j;
        C0WSB c0wsb = (C0WSB) aRunnableS22S0400000_13.l0;
        JSONObject jSONObject = (JSONObject) aRunnableS22S0400000_13.l1;
        JSONObject jSONObject2 = (JSONObject) aRunnableS22S0400000_13.l2;
        JSONObject jSONObject3 = (JSONObject) aRunnableS22S0400000_13.l3;
        C1C7U.LIZ("PerformanceTracker@1cb9.report$1L");
        c0wsb.getClass();
        try {
            C0WS6 c0ws6 = c0wsb.LIZLLL;
            c0ws6.getClass();
            if (PumbaaPerformanceTrackManager.LJIIIIZZ) {
                j = c0ws6.LIZLLL / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } else {
                j = c0ws6.LIZIZ / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            jSONObject.put("total_cost", j);
            jSONObject.put("total_cpu_cost", c0ws6.LIZLLL / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            jSONObject2.put("api_id", c0wsb.LJIIIIZZ);
            jSONObject2.put("execute_status", c0wsb.LJFF);
            jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c0wsb.LJ);
            Map<String, String> map = c0wsb.LJIIJ;
            if (map != null) {
                for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
            }
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (C0WSC c0wsc : c0wsb.LJII) {
                jSONArray.put(C0WSB.LJIIJJI(c0wsc));
                if (c0wsc.LJI() == C0WSF.EXCEEDED) {
                    jSONArray2.put(c0wsc.getName());
                } else if (c0wsc.LJI() == C0WSF.DROPPED) {
                    jSONArray3.put(c0wsc.getName());
                }
            }
            if (jSONArray2.length() > 0) {
                jSONObject2.put("exceeded_list", jSONArray2);
            }
            if (jSONArray3.length() > 0) {
                jSONObject2.put("dropped_list", jSONArray3);
            }
            if (!c0wsb.LJII.isEmpty()) {
                long j2 = c0ws6.LIZIZ;
                long j3 = c0ws6.LIZLLL;
                for (C0WSC c0wsc2 : c0wsb.LJII) {
                    j2 -= c0wsc2.getTimeStamp().LIZIZ;
                    j3 -= c0wsc2.getTimeStamp().LIZLLL;
                }
                jSONArray.put(C0WSB.LJIIL("unmeasured_cost", j2, j3, null, null, null, null, null));
                if (PumbaaPerformanceTrackManager.LJII) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((j2 / c0ws6.LIZIZ) * 100);
                    sbLIZ.append('%');
                    jSONObject3.put("unmeasured_cost_rate", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            jSONObject3.put("node_list", jSONArray);
            C823280WRi.LJI("pumbaa_performance", jSONObject2, jSONObject, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("metric", jSONObject);
            jSONObject4.put("category", jSONObject2);
            jSONObject4.put("extra", jSONObject3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0WS5.LIZIZ("PerformanceTracker_report_error", th);
        }
        C1C7U.LIZIZ("PerformanceTracker@1cb9.report$1L");
    }

    public static final void run$5(ARunnableS22S0400000_13 aRunnableS22S0400000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ResourceMonitorAdapter$ResourceMonitorUploader@a688.nativeCustomizeExceptionUpload$1");
        try {
            ((AbstractC802520Vdy) aRunnableS22S0400000_13.l3).LJI((g) aRunnableS22S0400000_13.l0, (File) aRunnableS22S0400000_13.l1, (C802900Vea) aRunnableS22S0400000_13.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ResourceMonitorAdapter$ResourceMonitorUploader@a688.nativeCustomizeExceptionUpload$1");
    }

    public ARunnableS22S0400000_13(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
    }
}
