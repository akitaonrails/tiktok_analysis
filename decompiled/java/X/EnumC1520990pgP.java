package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1520990pgP {
    public static final EnumC1520990pgP BLANK_SCREEN_OPTIMIZE;
    public static final C1521000pgQ Companion;
    public static final EnumC1520990pgP DECODE_PID;
    public static final EnumC1520990pgP ENABLE_HYBRID_SETTING_API_REQUEST_DELAY;
    public static final EnumC1520990pgP ENABLE_ISSUE_TRACING;
    public static final EnumC1520990pgP ENABLE_LYNX_BLANK_DOM_SCORE_DETECT;
    public static final EnumC1520990pgP ENABLE_NEW_LYNX_BLANK;
    public static final EnumC1520990pgP ENABLE_PRIVACY_TO_THIRD_PARTY_URL;
    public static final EnumC1520990pgP ENABLE_RES_AND_JSB_SPARK_TRACING;
    public static final EnumC1520990pgP FallbackBid;
    public static final EnumC1520990pgP HYBRID_STATUS_JOBBER_ENABLE;
    public static final /* synthetic */ EnumC1520990pgP[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1520990pgP LynxBlank;
    public static final EnumC1520990pgP LynxEventReporter;
    public static final EnumC1520990pgP NATIVE_PERF_MONITOR;
    public static final EnumC1520990pgP SparkPerfMonitorOpt;
    public static final EnumC1520990pgP SparkTracing;
    public static final EnumC1520990pgP SparkTracingStat;
    public static final EnumC1520990pgP WEB_JUMP_EXIT_LAST_SESSION;
    public static final EnumC1520990pgP WEB_UNRESPONSIVE_DETECTION;
    public static final EnumC1520990pgP WebBlank;
    public static final EnumC1520990pgP WebScriptInject;
    public static final EnumC1520990pgP WebScriptInjectProvider;
    public final String LL;
    public boolean LLILLJJLI;
    public JSONObject LLILLL;
    public C1514640pWA bidACL;

    public static InterfaceC2044707zh<EnumC1520990pgP> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC1520990pgP enumC1520990pgP = new EnumC1520990pgP("WEB_UNRESPONSIVE_DETECTION", 0, "unresponsive_detection", null == true ? 1 : 0);
        WEB_UNRESPONSIVE_DETECTION = enumC1520990pgP;
        EnumC1520990pgP enumC1520990pgP2 = new EnumC1520990pgP("LynxEventReporter", 1, "lynx_event_reporter", 1 == true ? 1 : 0);
        LynxEventReporter = enumC1520990pgP2;
        EnumC1520990pgP enumC1520990pgP3 = new EnumC1520990pgP("WebBlank", 2, "web_blank", 1 == true ? 1 : 0);
        WebBlank = enumC1520990pgP3;
        EnumC1520990pgP enumC1520990pgP4 = new EnumC1520990pgP("WebScriptInject", 3, "web_script_inject", 1 == true ? 1 : 0);
        WebScriptInject = enumC1520990pgP4;
        EnumC1520990pgP enumC1520990pgP5 = new EnumC1520990pgP("WebScriptInjectProvider", 4, "web_script_inject_provider", 1 == true ? 1 : 0);
        WebScriptInjectProvider = enumC1520990pgP5;
        EnumC1520990pgP enumC1520990pgP6 = new EnumC1520990pgP("LynxBlank", 5, "lynx_blank", 1 == true ? 1 : 0);
        LynxBlank = enumC1520990pgP6;
        EnumC1520990pgP enumC1520990pgP7 = new EnumC1520990pgP("FallbackBid", 6, "fallback_bid", null == true ? 1 : 0);
        FallbackBid = enumC1520990pgP7;
        EnumC1520990pgP enumC1520990pgP8 = new EnumC1520990pgP("SparkTracing", 7, "spark_tracing", 1 == true ? 1 : 0);
        SparkTracing = enumC1520990pgP8;
        EnumC1520990pgP enumC1520990pgP9 = new EnumC1520990pgP("SparkTracingStat", 8, "spark_tracing_stat", null == true ? 1 : 0);
        SparkTracingStat = enumC1520990pgP9;
        EnumC1520990pgP enumC1520990pgP10 = new EnumC1520990pgP("SparkPerfMonitorOpt", 9, "spark_perf_monitor_optimize", null == true ? 1 : 0);
        SparkPerfMonitorOpt = enumC1520990pgP10;
        EnumC1520990pgP enumC1520990pgP11 = new EnumC1520990pgP("ENABLE_ISSUE_TRACING", 10, "issue_tracing", 1 == true ? 1 : 0);
        ENABLE_ISSUE_TRACING = enumC1520990pgP11;
        EnumC1520990pgP enumC1520990pgP12 = new EnumC1520990pgP("WEB_JUMP_EXIT_LAST_SESSION", 11, "web_jump_exit_last_session", 1 == true ? 1 : 0);
        WEB_JUMP_EXIT_LAST_SESSION = enumC1520990pgP12;
        EnumC1520990pgP enumC1520990pgP13 = new EnumC1520990pgP("BLANK_SCREEN_OPTIMIZE", 12, "blank_screen_optimize", 1 == true ? 1 : 0);
        BLANK_SCREEN_OPTIMIZE = enumC1520990pgP13;
        EnumC1520990pgP enumC1520990pgP14 = new EnumC1520990pgP("ENABLE_RES_AND_JSB_SPARK_TRACING", 13, "enable_res_and_jsb_spark_tracing", 1 == true ? 1 : 0);
        ENABLE_RES_AND_JSB_SPARK_TRACING = enumC1520990pgP14;
        EnumC1520990pgP enumC1520990pgP15 = new EnumC1520990pgP(14, "ENABLE_HYBRID_SETTING_API_REQUEST_DELAY", "enable_hybrid_setting_api_request_delay", new JSONObject(C2097908Jt.LIZJ(new Pair("delay_s", 30))), false);
        ENABLE_HYBRID_SETTING_API_REQUEST_DELAY = enumC1520990pgP15;
        EnumC1520990pgP enumC1520990pgP16 = new EnumC1520990pgP(15, "ENABLE_LYNX_BLANK_DOM_SCORE_DETECT", "enable_lynx_blank_score_detect", new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("detect_on_fcp", Boolean.FALSE), new Pair("detect_on_fcp_delay", 2000L), new Pair("page_props_exit_delay", Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL)))), false);
        ENABLE_LYNX_BLANK_DOM_SCORE_DETECT = enumC1520990pgP16;
        EnumC1520990pgP enumC1520990pgP17 = new EnumC1520990pgP("DECODE_PID", 16, "decode_pid", true);
        DECODE_PID = enumC1520990pgP17;
        EnumC1520990pgP enumC1520990pgP18 = new EnumC1520990pgP("ENABLE_PRIVACY_TO_THIRD_PARTY_URL", 17, "enable_privacy_to_third_party_url", false);
        ENABLE_PRIVACY_TO_THIRD_PARTY_URL = enumC1520990pgP18;
        EnumC1520990pgP enumC1520990pgP19 = new EnumC1520990pgP("ENABLE_NEW_LYNX_BLANK", 18, "enable_new_lynx_blank", true);
        ENABLE_NEW_LYNX_BLANK = enumC1520990pgP19;
        EnumC1520990pgP enumC1520990pgP20 = new EnumC1520990pgP(19, "NATIVE_PERF_MONITOR", "native_perf_monitor", new JSONObject(C2097908Jt.LIZJ(new Pair("lynx_memory_ewma_alpha", Double.valueOf(0.1d)))), true);
        NATIVE_PERF_MONITOR = enumC1520990pgP20;
        EnumC1520990pgP enumC1520990pgP21 = new EnumC1520990pgP(20, "HYBRID_STATUS_JOBBER_ENABLE", "hybrid_status_jobber_enable", new JSONObject(C2097908Jt.LIZJ(new Pair("hybrid_status_jobber_interval", 300000L))), true);
        HYBRID_STATUS_JOBBER_ENABLE = enumC1520990pgP21;
        EnumC1520990pgP[] enumC1520990pgPArr = {enumC1520990pgP, enumC1520990pgP2, enumC1520990pgP3, enumC1520990pgP4, enumC1520990pgP5, enumC1520990pgP6, enumC1520990pgP7, enumC1520990pgP8, enumC1520990pgP9, enumC1520990pgP10, enumC1520990pgP11, enumC1520990pgP12, enumC1520990pgP13, enumC1520990pgP14, enumC1520990pgP15, enumC1520990pgP16, enumC1520990pgP17, enumC1520990pgP18, enumC1520990pgP19, enumC1520990pgP20, enumC1520990pgP21};
        LLILZ = enumC1520990pgPArr;
        LLILZIL = new C2254308sP(enumC1520990pgPArr);
        Companion = new C1521000pgQ();
    }

    public static EnumC1520990pgP[] values() {
        return (EnumC1520990pgP[]) LLILZ.clone();
    }

    public final boolean not() {
        return !this.LLILLJJLI;
    }

    public final String getKey() {
        return this.LL;
    }

    public final JSONObject getOptions() {
        return this.LLILLL;
    }

    public final boolean isEnabled() {
        return this.LLILLJJLI;
    }

    public static EnumC1520990pgP valueOf(String str) {
        return (EnumC1520990pgP) C08FF.LIZ(EnumC1520990pgP.class, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList<String> getStrListOptions(String str) {
        Object c098200Yq;
        ArrayList<String> arrayList = new ArrayList<>();
        JSONArray jSONArrayOptJSONArray = this.LLILLL.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    Object obj = jSONArrayOptJSONArray.get(i);
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
                }
            }
        }
        return arrayList;
    }

    public final void setEnabled(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setOptions(JSONObject jSONObject) {
        this.LLILLL = jSONObject;
    }

    public final int getIntOption(String str, int i) {
        C1521000pgQ c1521000pgQ = Companion;
        Object objOpt = this.LLILLL.opt(str);
        c1521000pgQ.getClass();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (objOpt instanceof Integer) {
            return ((Number) objOpt).intValue();
        }
        if (objOpt instanceof Long) {
            return (int) ((Number) objOpt).longValue();
        }
        if (objOpt instanceof String) {
            return CastIntegerProtector.parseInt((String) objOpt);
        }
        return i;
    }

    public final long getLongOption(String str, long j) {
        C1521000pgQ c1521000pgQ = Companion;
        Object objOpt = this.LLILLL.opt(str);
        c1521000pgQ.getClass();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (objOpt instanceof Long) {
            return ((Number) objOpt).longValue();
        }
        if (objOpt instanceof Integer) {
            return ((Number) objOpt).intValue();
        }
        if (objOpt instanceof String) {
            return CastLongProtector.parseLong((String) objOpt);
        }
        return j;
    }

    public final boolean isEnabled(String str, String str2) {
        C1514640pWA c1514640pWA = this.bidACL;
        if (c1514640pWA != null) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return c1514640pWA.LIZ(str, str2);
        }
        return this.LLILLJJLI;
    }

    public /* synthetic */ EnumC1520990pgP(String str, int i, String str2, boolean z) {
        this(i, str, str2, new JSONObject(), z);
    }

    public EnumC1520990pgP(int i, String str, String str2, JSONObject jSONObject, boolean z) {
        this.LL = str2;
        this.LLILLJJLI = z;
        this.LLILLL = jSONObject;
    }
}
