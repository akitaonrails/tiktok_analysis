package Y;

import X.AbstractC1317090kNX;
import X.C1274830jHN;
import X.C1297860jsW;
import X.C1297910jsb;
import X.C1317120kNa;
import X.C1317130kNb;
import X.C1317170kNf;
import X.C1C7U;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.performance.PerformanceController;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS1S2100100_20 implements Runnable {
    public final int $t;
    public long j3;
    public Object l2;
    public String s0;
    public String s1;

    public static final void run$1(ARunnableS1S2100100_20 aRunnableS1S2100100_20) {
        PerformanceController.LJ((PerformanceController) aRunnableS1S2100100_20.l2, aRunnableS1S2100100_20.s0, aRunnableS1S2100100_20.j3, aRunnableS1S2100100_20.s1);
    }

    public static final void run$2(ARunnableS1S2100100_20 aRunnableS1S2100100_20) {
        PerformanceController.LJI((PerformanceController) aRunnableS1S2100100_20.l2, aRunnableS1S2100100_20.s0, aRunnableS1S2100100_20.j3, aRunnableS1S2100100_20.s1);
    }

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str = this.s0;
        if (str == null || this.j3 == 0) {
            return;
        }
        if (str.startsWith("setup_")) {
            C1317120kNa c1317120kNa = (C1317120kNa) this.l2;
            String strReplace = this.s0.replace("setup_", "");
            long j = this.j3;
            c1317120kNa.getClass();
            if (!strReplace.endsWith("_ssr")) {
                ((HashMap) c1317120kNa.LIZJ).put(strReplace, Long.valueOf(j));
            }
            if ((c1317120kNa.LIZ.booleanValue() || !strReplace.equals("draw_end")) && ((HashMap) c1317120kNa.LIZJ).size() != 21) {
                return;
            }
            long jLongValue = ((Long) ((HashMap) c1317120kNa.LIZJ).get("draw_end")).longValue();
            long jLongValue2 = c1317120kNa.LIZ.booleanValue() ? ((Long) ((HashMap) c1317120kNa.LIZJ).get("load_app_end")).longValue() : 0L;
            long j2 = c1317120kNa.LIZIZ.LIZLLL;
            if (j2 > 0) {
                long jMax = Math.max(jLongValue, jLongValue2) - c1317120kNa.LIZIZ.LIZLLL;
                ((HashMap) c1317120kNa.LJ).put("fcp", Long.valueOf(jLongValue - j2));
                ((HashMap) c1317120kNa.LJ).put("tti", Long.valueOf(jMax));
            }
            if (((HashMap) c1317120kNa.LIZJ).containsKey("load_template_start")) {
                long jLongValue3 = ((Long) ((HashMap) c1317120kNa.LIZJ).get("load_template_start")).longValue();
                long j3 = jLongValue - jLongValue3;
                long jMax2 = Math.max(jLongValue, jLongValue2) - jLongValue3;
                ((HashMap) c1317120kNa.LJ).put("lynx_fcp", Long.valueOf(j3));
                ((HashMap) c1317120kNa.LJ).put("lynx_tti", Long.valueOf(jMax2));
            }
            AbstractC1317090kNX abstractC1317090kNX = c1317120kNa.LJFF.get();
            if (abstractC1317090kNX != null) {
                C1317130kNb c1317130kNb = abstractC1317090kNX.LLIZLLLIL;
                if (c1317130kNb != null) {
                    c1317130kNb.LJIIIZ(c1317120kNa.LIZ());
                }
                new C1297910jsb().pushMap(c1317120kNa.LIZIZ());
                return;
            }
            return;
        }
        if (!this.s0.startsWith("update_")) {
            if (this.s0.equals("prepare_template_start")) {
                C1317170kNf c1317170kNf = ((C1317120kNa) this.l2).LIZIZ;
                if (c1317170kNf.LIZLLL == 0) {
                    c1317170kNf.LIZLLL = this.j3;
                    return;
                }
            }
            if (this.s0.equals("prepare_template_end")) {
                C1317170kNf c1317170kNf2 = ((C1317120kNa) this.l2).LIZIZ;
                if (c1317170kNf2.LJ == 0) {
                    c1317170kNf2.LJ = this.j3;
                    return;
                }
                return;
            }
            return;
        }
        C1317120kNa c1317120kNa2 = (C1317120kNa) this.l2;
        String strReplace2 = this.s0.replace("update_", "");
        long j4 = this.j3;
        String str2 = this.s1;
        c1317120kNa2.getClass();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (!((HashMap) c1317120kNa2.LIZLLL).containsKey(str2)) {
            ((HashMap) c1317120kNa2.LIZLLL).put(str2, new HashMap());
        }
        Map map = (Map) ((HashMap) c1317120kNa2.LIZLLL).get(str2);
        if (map.containsKey(strReplace2)) {
            return;
        }
        map.put(strReplace2, Long.valueOf(j4));
        if ((c1317120kNa2.LIZ.booleanValue() || !strReplace2.equals("draw_end")) && map.size() != 10) {
            return;
        }
        if (str2.equals("__lynx_timing_actual_fmp")) {
            long j5 = c1317120kNa2.LIZIZ.LIZLLL;
            if (j5 > 0) {
                ((HashMap) c1317120kNa2.LJ).put("actual_fmp", Long.valueOf(j4 - j5));
            }
            if (((HashMap) c1317120kNa2.LIZJ).containsKey("load_template_start")) {
                ((HashMap) c1317120kNa2.LJ).put("lynx_actual_fmp", Long.valueOf(j4 - ((Long) ((HashMap) c1317120kNa2.LIZJ).get("load_template_start")).longValue()));
            }
        }
        AbstractC1317090kNX abstractC1317090kNX2 = c1317120kNa2.LJFF.get();
        if (abstractC1317090kNX2 != null) {
            C1317130kNb c1317130kNb2 = abstractC1317090kNX2.LLIZLLLIL;
            if (c1317130kNb2 != null) {
                c1317130kNb2.LJIIJ(str2, c1317120kNa2.LIZ(), map);
            }
            C1297860jsW c1297860jsWLIZIZ = c1317120kNa2.LIZIZ();
            C1297860jsW c1297860jsW = new C1297860jsW();
            c1297860jsW.putMap(str2, C1297860jsW.from(map));
            c1297860jsWLIZIZ.put("update_timings", c1297860jsW);
            new C1297910jsb().pushMap(c1297860jsWLIZIZ);
        }
    }

    public final void LIZ$1() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l2;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j3, "RTCInteractAPI") : c1274830jHN.LIZIZ(this.j3, "rtc_engine_api_call");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("engine_api_name", this.s0).put("api_parameter_info", this.s1);
            if (((C1274830jHN) this.l2).LJJI != null) {
                jSONObjectLIZIZ.put("api", this.s0);
                jSONObjectLIZIZ.put("message", this.s1);
            }
            ((C1274830jHN) this.l2).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public final void LIZ$2() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l2;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j3, "RTCInteractAPI") : c1274830jHN.LIZIZ(this.j3, "rtc_on_user_biz_session_id");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uid:");
        sbLIZ.append(this.s0);
        sbLIZ.append(",bizSessionId:");
        sbLIZ.append(this.s1);
        try {
            jSONObjectLIZIZ.put("message", C2188811AlT.LIZIZ(sbLIZ));
            if (((C1274830jHN) this.l2).LJJI != null) {
                jSONObjectLIZIZ.put("api", "onUserBizSessionId");
            }
            ((C1274830jHN) this.l2).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public static final void run$0(ARunnableS1S2100100_20 aRunnableS1S2100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("TimingHandler@e1c9.setTiming$1");
        try {
            aRunnableS1S2100100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TimingHandler@e1c9.setTiming$1");
    }

    public static final void run$3(ARunnableS1S2100100_20 aRunnableS1S2100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onEngineAPICall$1");
        try {
            aRunnableS1S2100100_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onEngineAPICall$1");
    }

    public static final void run$4(ARunnableS1S2100100_20 aRunnableS1S2100100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onUserBizSessionId$1");
        try {
            aRunnableS1S2100100_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onUserBizSessionId$1");
    }

    public ARunnableS1S2100100_20(PerformanceController performanceController, String str, long j, int i) {
        this.$t = i;
        this.l2 = performanceController;
        this.s0 = str;
        this.j3 = j;
        this.s1 = null;
    }

    public ARunnableS1S2100100_20(Object obj, String str, long j, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.j3 = j;
        this.s1 = str2;
    }
}
