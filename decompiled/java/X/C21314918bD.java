package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.TTKLSUserTraceConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.BtmParamsRule;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughAbilityOptConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughEnableCommonParamsConfig;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService;
import com.ss.android.ugc.aweme.poi.transaction.IPoiTransactionService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18bD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21314918bD {
    public static final CopyOnWriteArrayList<InterfaceC21315218bG> LIZ = new CopyOnWriteArrayList<>();

    static {
        ((IDowngradeApi) ServiceManager.get().getService(IDowngradeApi.class)).LJFF(new Function0<Unit>() { // from class: X.18bC
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                CopyOnWriteArrayList<InterfaceC21315218bG> copyOnWriteArrayList = C21314918bD.LIZ;
                copyOnWriteArrayList.add(new InterfaceC21315218bG() { // from class: X.18b0
                    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
                    /* JADX WARN: Removed duplicated region for block: B:114:0x0233  */
                    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public static void LIZ(java.lang.String r22, org.json.JSONObject r23) {
                        /*
                            Method dump skipped, instruction units count: 775
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21313618b0.LIZ(java.lang.String, org.json.JSONObject):void");
                    }

                    public static void LIZIZ(String str, JSONObject jSONObject) {
                        String str2;
                        List<BtmParamsRule> listLJFF = C21313818b2.LIZ.LJFF(str);
                        if (listLJFF != null && !listLJFF.isEmpty()) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            C21313518az.LIZ.getClass();
                            C18C6 c18c6LJ = C21313518az.LJ(str, jSONObject);
                            if (c18c6LJ.LIZ.isEmpty()) {
                                C21314018b4.LIZ.getClass();
                                C21314018b4.LIZJ(str, "bcm_chain_is_empty");
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("eventName: ");
                                sbLIZ.append(str);
                                sbLIZ.append(", bcmChain is empty");
                                C2188811AlT.LIZIZ(sbLIZ);
                                return;
                            }
                            C1766940w56 c1766940w56 = (C1766940w56) C13LP.LJJJLZIJ(0, c18c6LJ.LIZ);
                            if (c1766940w56 == null || (str2 = c1766940w56.LIZIZ) == null) {
                                str2 = "";
                            }
                            for (BtmParamsRule btmParamsRule : listLJFF) {
                                C21313518az c21313518az = C21313518az.LIZ;
                                List<String> list = btmParamsRule.btmList;
                                c21313518az.getClass();
                                if (!C21313518az.LJIIJJI(str2, list)) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("btm is not match ruleBtm:");
                                    sbLIZ2.append(btmParamsRule);
                                    sbLIZ2.append(".btm, currentBtm:");
                                    sbLIZ2.append(str2);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                } else if (Intrinsics.LJFF(btmParamsRule.LIZ, "search")) {
                                    C21313518az.LJIIZILJ(btmParamsRule.params, jSONObject);
                                } else if (LSPassThroughAbilityOptConfig.INSTANCE.enable()) {
                                    C21313518az.LJIILLIIL(str, btmParamsRule, c18c6LJ, jSONObject);
                                } else {
                                    C21313518az.LJIILL(str, btmParamsRule, c18c6LJ.LIZ, jSONObject);
                                }
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            C21314018b4 c21314018b4 = C21314018b4.LIZ;
                            long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                            int size = c18c6LJ.LIZ.size();
                            c21314018b4.getClass();
                            C21314018b4.LIZLLL(size, j, "match_rules", str, null);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("appendLSPassThroughParamsWithSettings cost: ");
                            sbLIZ3.append(j);
                            C2188811AlT.LIZIZ(sbLIZ3);
                        }
                    }

                    @Override // X.InterfaceC21315218bG
                    public final void onEvent(String str, JSONObject jSONObject) {
                        if (str != null && jSONObject != null) {
                            try {
                                if (!C296990BkX.LIZ()) {
                                    C21313518az.LIZ.getClass();
                                    C21313518az.LJIJJLI(jSONObject);
                                } else {
                                    if (C1869010yjj.LIZ.contains(str)) {
                                        C21313518az.LIZ.getClass();
                                        C21313518az.LJIJJLI(jSONObject);
                                        return;
                                    }
                                    if (LSPassThroughEnableCommonParamsConfig.INSTANCE.enable()) {
                                        LIZ(str, jSONObject);
                                    } else {
                                        LIZIZ(str, jSONObject);
                                    }
                                    C21313518az.LIZ.getClass();
                                    C21313518az.LJIJJLI(jSONObject);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onLancetHook error: ");
                                sbLIZ.append(th.getMessage());
                                C2188811AlT.LIZIZ(sbLIZ);
                                C21314018b4.LIZ(C21314018b4.LIZ, EnumC21315318bH.PT_ONEVENT_ERROR, th);
                                C21313518az.LIZ.getClass();
                                C21313518az.LJIJJLI(jSONObject);
                            }
                        }
                    }
                });
                copyOnWriteArrayList.add(C18JM.LIZ);
                copyOnWriteArrayList.add(new InterfaceC21315218bG() { // from class: X.0VFv
                    @Override // X.InterfaceC21315218bG
                    public final void onEvent(String str, JSONObject jSONObject) throws JSONException {
                        TTKLSUserTraceConfig.Config config = TTKLSUserTraceConfig.LIZ;
                        Object obj = "";
                        if (str == null) {
                            str = "";
                        }
                        if (Intrinsics.LJFF(TTKLSUserTraceConfig.LIZ().enable, Boolean.TRUE) && TTKLSUserTraceConfig.LIZIZ.contains(str) && jSONObject != null) {
                            try {
                                AbstractC794590VEz abstractC794590VEzLIZ = C794670VFh.LIZ("ls_event_tracking", EnumC794690VFj.BATCH, EnumC794730VFn.PARALLEL_WRAPPER_MODE, false, C794850VFz.LIZ, null);
                                abstractC794590VEzLIZ.start();
                                C794740VFo c794740VFoLIZJ = abstractC794590VEzLIZ.LIZJ();
                                String strLIZIZ = c794740VFoLIZJ.LIZIZ();
                                c794740VFoLIZJ.LJI();
                                C794800VFu.LIZ = strLIZIZ;
                                obj = strLIZIZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            jSONObject.put("ls_traceparent", obj);
                        }
                    }
                });
                copyOnWriteArrayList.add(new InterfaceC21315218bG() { // from class: X.0X9d
                    @Override // X.InterfaceC21315218bG
                    public final void onEvent(String str, JSONObject jSONObject) {
                        Boolean bool;
                        SparkActivity sparkActivity;
                        SparkContext sparkContext;
                        List<String> list;
                        String strLJIJI;
                        if (Intrinsics.LJFF(str, "screen_shot") && (bool = TTKLSUserTraceConfig.LIZ().screenshotEnable) != null && bool.booleanValue()) {
                            try {
                                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                                Activity activityLIZIZ = null;
                                if (abstractC1387200mCcLIZIZ != null) {
                                    activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                                }
                                if ((activityLIZIZ instanceof SparkActivity) && (sparkActivity = (SparkActivity) activityLIZIZ) != null && (sparkContext = sparkActivity.LL) != null) {
                                    C1529880puk c1529880puk = SparkContext.Companion;
                                    SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
                                    if (sparkSchemaParamLJJJI != null) {
                                        String bundle = sparkSchemaParamLJJJI.getBundle();
                                        String channel = sparkSchemaParamLJJJI.getChannel();
                                        List<String> list2 = TTKLSUserTraceConfig.LIZ().ttklsSsChannels;
                                        if (list2 != null && list2.contains(channel) && (list = TTKLSUserTraceConfig.LIZ().ttklsSsBundles) != null && list.contains(bundle)) {
                                            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            linkedHashMap.put("channel", channel);
                                            linkedHashMap.put("bundle", bundle);
                                            SparkContext sparkContext2 = sparkActivity.LL;
                                            if (sparkContext2 == null || (strLJIJI = sparkContext2.LJIJI()) == null) {
                                                strLJIJI = "";
                                            }
                                            linkedHashMap.put("url", strLJIJI);
                                            c1185040gwY.getClass();
                                            C1185040gwY.LIZIZ("ttkls_screenshot", linkedHashMap, null);
                                        }
                                        C189200o6.m2constructorimpl(Unit.LIZ);
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                    }
                });
                copyOnWriteArrayList.add(new InterfaceC21315218bG() { // from class: X.0hC3
                    public static final List<Function2<String, JSONObject, Unit>> LIZIZ;

                    static {
                        Function2<String, JSONObject, Unit> function2LIZLLL;
                        Function2<String, JSONObject, Unit> eventHandler;
                        ArrayList arrayList = new ArrayList();
                        LIZIZ = arrayList;
                        ILSFeedCardService iLSFeedCardService = (ILSFeedCardService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
                        if (iLSFeedCardService != null && (eventHandler = iLSFeedCardService.getEventHandler()) != null) {
                            arrayList.add(eventHandler);
                        }
                        IPoiTransactionService iPoiTransactionService = (IPoiTransactionService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
                        if (iPoiTransactionService == null || (function2LIZLLL = iPoiTransactionService.LIZLLL()) == null) {
                            return;
                        }
                        arrayList.add(function2LIZLLL);
                    }

                    @Override // X.InterfaceC21315218bG
                    public final void onEvent(String str, JSONObject jSONObject) {
                        try {
                            Iterator<Function2<String, JSONObject, Unit>> it2 = LIZIZ.iterator();
                            while (it2.hasNext()) {
                                it2.next().invoke(str, jSONObject);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("error: ");
                            sbLIZ.append(th.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                });
                return Unit.LIZ;
            }
        });
    }
}
