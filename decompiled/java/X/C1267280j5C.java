package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS25S1100000_20;
import Y.ARunnableS31S0101000_20;
import android.os.Handler;
import com.bytedance.android.livesdk.media.ttlhadaptive.TTLHAdaptiveConfig;
import com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategyNodeConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j5C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267280j5C {
    public final TTLHAdaptiveConfig LIZ;
    public final C1268280j6o LIZIZ;
    public final C1268090j6V LIZJ;
    public final C1267080j4s LIZLLL;
    public PthreadTimer LJ;
    public int LJFF;
    public Handler LJI;
    public ARunnableS120S0100000_20 LJII;
    public int LJIIIIZZ;
    public final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public Map<String, String> LJIIJ = new HashMap();

    public final void LIZ(int i) {
        if (!this.LJIIIZ.get()) {
            return;
        }
        LIZIZ("timer");
        if (!this.LJIIIZ.get()) {
            return;
        }
        C786410Ut5.LJLIIL(i * LSPassThroughRecordSizeConfig.DEFAULT, this.LJI, new ARunnableS31S0101000_20(i, this, 4));
    }

    public final void LIZIZ(String str) {
        Handler handler = this.LJI;
        if (handler != null && handler.getLooper().getThread() != C786410Ut5.u3()) {
            if ("generate_linkmic_video_params".equals(str)) {
                C786410Ut5.LJL(this.LJI, new ARunnableS25S1100000_20(this, str, 12));
                return;
            } else if ("encode_params_adaptive_strategy".equals(str)) {
                this.LJI.removeCallbacks(this.LJII);
                C786410Ut5.LJJZZIII(this.LJI, this.LJII);
                return;
            } else {
                C786410Ut5.LJJZZIII(this.LJI, new ARunnableS25S1100000_20(this, str, 13));
                return;
            }
        }
        C1267220j56 c1267220j56 = new C1267220j56();
        c1267220j56.LIZ = str;
        C1267080j4s c1267080j4s = this.LIZLLL;
        c1267080j4s.LIZ(c1267080j4s.LJIIJ, c1267220j56);
        Map<String, Object> mapLIZJ = this.LIZLLL.LIZJ();
        if (((HashMap) mapLIZJ).size() <= 1) {
            this.LJFF++;
        }
        this.LIZIZ.LIZ(mapLIZJ);
    }

    public C1267280j5C(TTLHAdaptiveConfig tTLHAdaptiveConfig, C1266460j3s c1266460j3s, Handler handler) {
        C1267480j5W.LIZ.LIZ = c1266460j3s;
        this.LJI = handler;
        this.LIZ = tTLHAdaptiveConfig;
        Map<String, StrategyNodeConfig> map = tTLHAdaptiveConfig.strategyGraph;
        if (map == null || map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("process", "config_initialize");
                jSONObject.put("success", 0);
                jSONObject.put("method_name", "TTLHAdaptive");
                C1267490j5X.LIZIZ(jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1268280j6o c1268280j6o = new C1268280j6o(tTLHAdaptiveConfig.strategySettingConfig, tTLHAdaptiveConfig.strategyGraph, tTLHAdaptiveConfig.LIZ, tTLHAdaptiveConfig.LIZIZ);
        this.LIZIZ = c1268280j6o;
        if (!c1268280j6o.LJI) {
            this.LJIIIIZZ = 2;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", "TTLHAdaptiveInit");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("api", "ttlh_adaptive_init");
            if (tTLHAdaptiveConfig.strategyGraph == null) {
                jSONObject2.put("null_param_name", "strategies_dependency_graph");
            }
            if (tTLHAdaptiveConfig.strategySettingConfig == null) {
                jSONObject2.put("null_param_name", "adaptive_base_config");
            }
            jSONObject3.put("init_status", 1);
            C1267490j5X.LIZ(jSONObject2);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LIZJ = new C1268090j6V();
        C1267080j4s c1267080j4s = new C1267080j4s();
        this.LIZLLL = c1267080j4s;
        c1267080j4s.LJIIZILJ = handler;
    }
}
