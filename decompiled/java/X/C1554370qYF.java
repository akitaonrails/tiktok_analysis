package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.scene.Scene;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qYF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554370qYF extends LynxViewClient {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ() throws JSONException {
        if (this.$t != 0) {
            super.LJIIJ();
        } else {
            LJIIJ$0(this);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ() {
        if (this.$t != 0) {
            super.LJIJ();
        } else {
            LJIJ$0(this);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJ(LynxError lynxError) {
        if (1 - this.$t != 0) {
            super.LJJ(lynxError);
        } else {
            LJJ$0(this, lynxError);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(Map<String, Object> map) {
        if (this.$t != 0) {
            super.onTimingSetup(map);
        } else {
            onTimingSetup$0(this, map);
        }
    }

    public static final void LJIIJ$0(C1554370qYF c1554370qYF) throws JSONException {
        long jLongValue;
        long jLongValue2;
        String str;
        Boolean enableMemoryCache;
        Integer numValueOf;
        InterfaceC1538940q9M interfaceC1538940q9M = (InterfaceC1538940q9M) ((SparkContext) c1554370qYF.l1).LJFF(InterfaceC1538940q9M.class);
        if (interfaceC1538940q9M != null && ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c1554370qYF.l0).LLILZIL != null) {
            interfaceC1538940q9M.LJJ();
        }
        String str2 = null;
        ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c1554370qYF.l0).LLJLLL = C1530570pvr.LIZJ((SparkContext) c1554370qYF.l1, new EnumC1537220q6a[]{EnumC1537220q6a.LYNX_VIEW_FIRST_SCREEN}, null);
        C1538200q8A c1538200q8A = (C1538200q8A) ((SparkContext) c1554370qYF.l1).LJFF(C1538200q8A.class);
        if (c1538200q8A != null) {
            SparkContext sparkContext = (SparkContext) c1554370qYF.l1;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c1554370qYF.l0;
            Long l = c1538200q8A.LIZJ;
            if (l != null) {
                long jLongValue3 = l.longValue();
                EnumC1520990pgP enumC1520990pgP = EnumC1520990pgP.SparkPerfMonitorOpt;
                if (enumC1520990pgP.not()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue3;
                    if (sparkContext != null) {
                        str2 = sparkContext.containerId;
                    }
                    C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_lynx_first_screen_duration");
                    c1520360pfO.LIZIZ = sparkContext.bid;
                    c1520360pfO.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJZIJLIL;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("res_memory", c1538200q8A.LIZ);
                    c1520360pfO.LIZLLL = jSONObject;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("duration", jCurrentTimeMillis);
                    c1520360pfO.LJ = jSONObject2;
                    C1520080pew.LIZ(str2, c1520360pfO.LIZ());
                }
                Long l2 = c1538200q8A.LJIIIIZZ;
                if (l2 != null) {
                    jLongValue = jLongValue3 + l2.longValue();
                } else {
                    jLongValue = 0;
                }
                C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.RENDER_START}, Long.valueOf(jLongValue));
                if (enumC1520990pgP.not()) {
                    if (sparkContext != null) {
                        str = sparkContext.containerId;
                    } else {
                        str = null;
                    }
                    C1520360pfO c1520360pfO2 = new C1520360pfO("hybrid_monitor_lynx_timeline");
                    c1520360pfO2.LIZIZ = sparkContext.bid;
                    c1520360pfO2.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJZIJLIL;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("res_memory", c1538200q8A.LIZ);
                    jSONObject3.put("is_forest", sparkContext.LJJIJIIJI());
                    jSONObject3.put("jsb_optimize", sparkContext.jsbOptimize);
                    jSONObject3.put("jsb_optimize_v2", sparkContext.jsbOptimizeV2);
                    SparkSchemaParam sparkSchemaParam = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJJ;
                    if (sparkSchemaParam != null) {
                        enableMemoryCache = sparkSchemaParam.getEnableMemoryCache();
                    } else {
                        enableMemoryCache = null;
                    }
                    jSONObject3.put("enable_memory_cache", enableMemoryCache);
                    SparkSchemaParam sparkSchemaParam2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJJ;
                    if (sparkSchemaParam2 != null) {
                        numValueOf = Integer.valueOf(sparkSchemaParam2.getParallelFetchResource());
                    } else {
                        numValueOf = null;
                    }
                    jSONObject3.put("parallel_fetch_resource", numValueOf);
                    c1520360pfO2.LIZLLL = jSONObject3;
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("init_to_start_render", c1538200q8A.LJIIIIZZ);
                    jSONObject4.put("lynx_render", sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLLL - jLongValue);
                    jSONObject4.put("resource_load", c1538200q8A.LJIILL);
                    jSONObject4.put("render_template_main", c1538200q8A.LJIIIZ);
                    jSONObject4.put("read_template", c1538200q8A.LJIIJ);
                    jSONObject4.put("create_view_component", c1538200q8A.LJIIJJI);
                    c1520360pfO2.LJ = jSONObject4;
                    C1520080pew.LIZ(str, c1520360pfO2.LIZ());
                }
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                if (C1161970gLL.LIZIZ().LIZ) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    Long l3 = c1538200q8A.LIZIZ;
                    if (l3 != null) {
                        jLongValue2 = l3.longValue();
                    } else {
                        jLongValue2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLL;
                    }
                    String str3 = sparkContext.containerId;
                    C1520360pfO c1520360pfO3 = new C1520360pfO("lynx_start_to_finish");
                    c1520360pfO3.LIZIZ = sparkContext.bid;
                    c1520360pfO3.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJZIJLIL;
                    c1520360pfO3.LJIIJJI = EnumC993170bx5.Both;
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("duration", jCurrentTimeMillis2 - jLongValue2);
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("metric_name", "lynx_start_to_finish");
                    jSONObject6.put("start_time", jLongValue2);
                    jSONObject6.put("end_time", jCurrentTimeMillis2);
                    jSONObject5.put("metric_extra", Collections.singletonList(jSONObject6));
                    c1520360pfO3.LJ = jSONObject5;
                    c1520360pfO3.LJFF = new JSONObject();
                    C1520080pew.LIZ(str3, c1520360pfO3.LIZ());
                }
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c1554370qYF.l0;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJIJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getHybridKitType());
    }

    public static final void LJIJ$0(C1554370qYF c1554370qYF) {
        InterfaceC1538940q9M interfaceC1538940q9M;
        if (((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c1554370qYF.l0).LLLI && (interfaceC1538940q9M = (InterfaceC1538940q9M) ((SparkContext) c1554370qYF.l1).LJFF(InterfaceC1538940q9M.class)) != null && ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c1554370qYF.l0).LLILZIL != null) {
            interfaceC1538940q9M.LIZIZ();
        }
    }

    public static final void LJJ$0(C1554370qYF c1554370qYF, LynxError lynxError) {
        ((LynxView) c1554370qYF.l0).removeLynxViewClient(c1554370qYF);
        C1540890qCV c1540890qCV = (C1540890qCV) c1554370qYF.l1;
        c1540890qCV.LIZ.LJIIIZ(EnumC1541150qCv.TASK_FAILED);
    }

    public static final void onTimingSetup$0(C1554370qYF c1554370qYF, Map map) {
        Object obj;
        super.onTimingSetup(map);
        if (EnumC1520990pgP.SparkPerfMonitorOpt.not() && map != null && (obj = map.get("setup_timing")) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) c1554370qYF.l0;
            SparkContext sparkContext = (SparkContext) c1554370qYF.l1;
            Map map2 = (Map) obj;
            if (map2.containsKey("draw_end")) {
                C1520080pew.LIZLLL("hybrid_log_report", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "lynx_start_to_draw_end"), new Pair("schema", sparkContext.LJJIL()), new Pair("duration", Long.valueOf(((Long) map2.get("draw_end")).longValue() - sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLL))));
            }
        }
    }

    public C1554370qYF(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
