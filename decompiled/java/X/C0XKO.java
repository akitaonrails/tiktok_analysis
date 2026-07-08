package X;

import android.os.Build;
import com.bytedance.crash.Npth;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.TTKOrbu;
import com.orbu.core.TTKOrbuConstants;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.mob.ITTKEventReport;
import com.orbu.core.mob.ITTKNativeCallback;
import com.orbu.core.utils.OrbuRequestExtKt;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ttp.orbu.sdk.Channel;

/* JADX INFO: renamed from: X.0XKO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XKO implements ITTKEventReport, ITTKNativeCallback {
    public static final C0XKO LIZ = new C0XKO();
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public static final AtomicReference<String> LIZJ = new AtomicReference<>("");

    @Override // com.orbu.core.mob.ITTKEventReport
    public final void onTTKRequest(ITTKOrbuRequest<?> iTTKOrbuRequest, boolean z) {
    }

    @Override // com.orbu.core.mob.ITTKEventReport
    public final boolean hitSampleDrop(String str) {
        int iIntValue;
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
        final String ruleHash = TTKOrbu.INSTANCE.getRuleHash();
        if (ruleHash == null) {
            ruleHash = "";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            LIZJ.getAndUpdate(new UnaryOperator() { // from class: X.0XKP
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    if (!str2.equals(ruleHash)) {
                        IPnSSandboxOptApi iPnSSandboxOptApi = (IPnSSandboxOptApi) PluggableExtentionKt.pluggableSpi$default(IPnSSandboxOptApi.class, false, false, false, 14, null);
                        if (iPnSSandboxOptApi != null) {
                            iPnSSandboxOptApi.LJIIJJI(ruleHash);
                        }
                        return ruleHash;
                    }
                    return str2;
                }
            });
        } else {
            AtomicReference<String> atomicReference = LIZJ;
            String str2 = atomicReference.get();
            if (!Intrinsics.LJFF(str2, ruleHash)) {
                while (true) {
                    if (atomicReference.compareAndSet(str2, ruleHash)) {
                        IPnSSandboxOptApi iPnSSandboxOptApi = (IPnSSandboxOptApi) PluggableExtentionKt.pluggableSpi$default(IPnSSandboxOptApi.class, false, false, false, 14, null);
                        if (iPnSSandboxOptApi != null) {
                            iPnSSandboxOptApi.LJIIJJI(ruleHash);
                        }
                    } else if (atomicReference.get() != str2) {
                        break;
                    }
                }
            }
        }
        if (!Intrinsics.LJFF(str, "pns_sandbox_intercept") || (iIntValue = ((Number) C0XKR.LIZ.getValue()).intValue()) <= 0 || (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId()) == null || strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId.length() == 0) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        int i = C844470XAv.LJIIJ;
        if (i <= 0) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(':');
        sbLIZ.append(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZIZ;
        Boolean boolValueOf = concurrentHashMap.get(strLIZIZ);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(!C13KM.LIZ(iIntValue, strLIZIZ));
            concurrentHashMap.put(strLIZIZ, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.orbu.core.mob.ITTKEventReport
    public final void onError(Throwable th) {
        C0XKV.LIZ.getClass();
        C0XKV.LIZIZ(th);
    }

    public static boolean LIZ(Integer num, String str) {
        Object[] objArr;
        if (str == null || num == null || (objArr = (Object[]) C303710BvN.LIZ.getValue()) == null || C13LQ.LJJIJIIJI(str, objArr) < 0 || num.intValue() <= 0 || num.intValue() == 102) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Throwable] */
    @Override // com.orbu.core.mob.ITTKEventReport
    public final void onEvent(final String str, final JSONObject jSONObject) {
        final String strOptString;
        final int i = C0XKT.LIZIZ;
        final Integer numValueOf = null;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("request_channel");
            numValueOf = Integer.valueOf(jSONObject.optInt("intercept_result_status_code"));
        } else {
            strOptString = null;
        }
        final C259800zU c259800zU = new C259800zU();
        if (LIZ(numValueOf, strOptString)) {
            c259800zU.element = new Throwable();
        }
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0XKN
            public final void LIZ() {
                LinkedHashMap linkedHashMap;
                Iterator<String> itKeys;
                String string;
                JSONObject jSONObject2 = jSONObject;
                C259800zU<Throwable> c259800zU2 = c259800zU;
                String str2 = str;
                String str3 = strOptString;
                Integer num = numValueOf;
                int i2 = i;
                if (jSONObject2 != null) {
                    try {
                        jSONObject2.put("is_regression_test", 0);
                        jSONObject2.put("sandbox_launch_exp", C0XKT.LIZIZ());
                        jSONObject2.put("launch_phase", i2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return;
                    }
                }
                if (c259800zU2.element != null) {
                    linkedHashMap = new LinkedHashMap();
                    if (jSONObject2 != null && (itKeys = jSONObject2.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            Object objOpt = jSONObject2.opt(next);
                            if (objOpt == null || (string = objOpt.toString()) == null) {
                                string = "";
                            }
                            linkedHashMap.put(next, string);
                        }
                    }
                } else {
                    linkedHashMap = null;
                }
                AppLogNewUtils.LJFF(str2, jSONObject2);
                if (c259800zU2.element != null) {
                    String str4 = linkedHashMap != null ? (String) linkedHashMap.get("dataflow_id") : null;
                    String str5 = "sandbox_validation_error_" + str3 + '_' + num + '_' + OrbuRequestExtKt.dataFlowId2Hex(str4);
                    C0XKO.LIZ.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sandbox_validation_error_");
                    sbLIZ.append(str3);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (Intrinsics.LJFF("671088895", str4)) {
                        strLIZIZ = strLIZIZ + "_0x280000FF";
                    }
                    Npth.reportBizException(strLIZIZ, c259800zU2.element, str5, linkedHashMap, linkedHashMap, true);
                    Objects.toString(linkedHashMap);
                    Throwable th2 = c259800zU2.element;
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OrbuCombineReporter@925d.onEvent$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OrbuCombineReporter@925d.onEvent$1");
            }
        });
    }

    @Override // com.orbu.core.mob.ITTKEventReport
    public final boolean shouldReportPayload(Channel channel, int i, String str) {
        int iLJ;
        String strName = channel.name();
        Map<String, Integer> map = C0XKQ.LIZIZ;
        if (map == null) {
            map = C0XKQ.LIZ;
        }
        Integer num = map.get(strName);
        if (num == null || (iLJ = C13LZ.LJ(num.intValue(), 0, 10000)) <= 0) {
            return false;
        }
        long j = iLJ;
        if (j < 10000 && AbstractC19994813Le.Default.nextLong(10000L) >= j) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Throwable] */
    @Override // com.orbu.core.mob.ITTKNativeCallback
    public final void onNativeNetworkEvent(String str, final String str2, String str3, String str4, final String str5, final int i, final int i2, final boolean z, final boolean z2) {
        final int i3 = C0XKT.LIZIZ;
        final C259800zU c259800zU = new C259800zU();
        if (LIZ(Integer.valueOf(i), "NETWORK")) {
            c259800zU.element = new Throwable();
        }
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0XKM
            public final void LIZ() {
                String str6;
                LinkedHashMap linkedHashMap;
                String string;
                String str7;
                String str8;
                String str9;
                String str10 = str5;
                String str11 = str2;
                int i4 = i;
                C259800zU<Throwable> c259800zU2 = c259800zU;
                int i5 = i2;
                int i6 = i3;
                boolean z3 = z;
                boolean z4 = z2;
                try {
                    boolean zIsDataFlowIdEmpty = OrbuRequestExtKt.isDataFlowIdEmpty(str10);
                    C805400Vic c805400VicLIZIZ = C295401Cm.LIZIZ(str11);
                    if (c805400VicLIZIZ == null || (str6 = c805400VicLIZIZ.LIZ) == null) {
                        str6 = "";
                    }
                    String strDataFlowId2Hex = OrbuRequestExtKt.dataFlowId2Hex(str10);
                    boolean zShouldReportPayload = (i4 != 0 || zIsDataFlowIdEmpty || TTKOrbuConstants.INSTANCE.isTransitionDFID(str10)) ? true : C0XKO.LIZ.shouldReportPayload(Channel.NETWORK, i4, strDataFlowId2Hex);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("request_channel", "NETWORK_NATIVE");
                    jSONObject.put("dataflow_id_source", str10);
                    jSONObject.put("dataflow_id", strDataFlowId2Hex);
                    if (zShouldReportPayload) {
                        jSONObject.put("payload", str6);
                    }
                    jSONObject.put("intercept_cost_time", i5);
                    jSONObject.put("intercept_result_status_code", i4);
                    TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
                    jSONObject.put("orbu_sdk_enable_state", tTKOrbu.getCurOrbuState());
                    jSONObject.put("orbu_sdk_internal_enable_state", tTKOrbu.getCurOrbuInternalState());
                    jSONObject.put("orbu_sdk_version", tTKOrbu.getOrbuSDKVersion());
                    jSONObject.put("rule_hash", tTKOrbu.getRuleHash());
                    jSONObject.put("experiment_group", (String) C0XKU.LIZ.getValue());
                    jSONObject.put("sandbox_launch_exp", C0XKT.LIZIZ());
                    jSONObject.put("is_regression_test", 0);
                    jSONObject.put("intercept_result_exist", i4 >= 0 ? 1 : 0);
                    jSONObject.put("launch_phase", i6);
                    try {
                        C189200o6.m2constructorimpl(jSONObject.put("domain_type", C841470Wzh.LIZ.identify(UriProtector.parse(str11).getHost())));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    jSONObject.put("block_mode", z3 ? "hard" : "soft");
                    jSONObject.put("intercept_result", z4 ? 0 : 1);
                    if (c259800zU2.element != null) {
                        linkedHashMap = new LinkedHashMap();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            Object objOpt = jSONObject.opt(next);
                            if (objOpt == null || (string = objOpt.toString()) == null) {
                                string = "";
                            }
                            linkedHashMap.put(next, string);
                            if (c805400VicLIZIZ == null || (str7 = c805400VicLIZIZ.LIZJ) == null) {
                                str7 = "";
                            }
                            linkedHashMap.put("scheme", str7);
                            if (c805400VicLIZIZ == null || (str8 = c805400VicLIZIZ.LIZLLL) == null) {
                                str8 = "";
                            }
                            linkedHashMap.put("host", str8);
                            if (c805400VicLIZIZ == null || (str9 = c805400VicLIZIZ.LJFF) == null) {
                                str9 = "";
                            }
                            linkedHashMap.put("path", str9);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    AppLogNewUtils.LJFF("pns_sandbox_intercept", jSONObject);
                    if (c259800zU2.element != null) {
                        String str12 = "sandbox_validation_error_NETWORK_" + i4 + '_' + OrbuRequestExtKt.dataFlowId2Hex(str10);
                        C0XKO.LIZ.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("sandbox_validation_error_");
                        sbLIZ.append("NETWORK");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        if (Intrinsics.LJFF("671088895", str10)) {
                            strLIZIZ = strLIZIZ + "_0x280000FF";
                        }
                        Npth.reportBizException(strLIZIZ, c259800zU2.element, str12, linkedHashMap, linkedHashMap, true);
                        Objects.toString(linkedHashMap);
                        Throwable th2 = c259800zU2.element;
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OrbuCombineReporter@925d.onNativeNetworkEvent$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OrbuCombineReporter@925d.onNativeNetworkEvent$1");
            }
        });
    }
}
