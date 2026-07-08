package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497080p3q {
    public static volatile CopyOnWriteArrayList<InterfaceC1493830oyb> LJJJZ = new CopyOnWriteArrayList<>();
    public static final AtomicBoolean LJJL = new AtomicBoolean(false);
    public static volatile C1497080p3q LJJLI;
    public EnumC1493300oxk LIZ = EnumC1493300oxk.NONE;
    public boolean LIZIZ = true;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public long LJJI;
    public long LJJIFFI;
    public long LJJII;
    public long LJJIII;
    public long LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIIJIL;
    public long LJJIJIL;
    public long LJJIJL;
    public String LJJIJLIJ;
    public long LJJIL;
    public String LJJIZ;
    public long LJJJ;
    public long LJJJI;
    public long LJJJIL;
    public long LJJJJ;
    public long LJJJJI;
    public long LJJJJIZL;
    public long LJJJJJ;
    public long LJJJJJL;
    public long LJJJJL;
    public long LJJJJLI;
    public long LJJJJLL;
    public long LJJJJZ;
    public long LJJJJZI;
    public long LJJJLIIL;
    public long LJJJLL;
    public long LJJJLZIJ;

    public static C1497080p3q LJ() {
        if (LJJLI == null) {
            synchronized (C1497080p3q.class) {
                try {
                    if (LJJLI == null) {
                        LJJLI = new C1497080p3q();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJJLI;
    }

    public static boolean LJFF() {
        return LJJL.get();
    }

    public static void LJII() {
        LJJL.set(true);
        if (LJJJZ.isEmpty()) {
            return;
        }
        new RunnableC823120WQs() { // from class: X.0oya
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTNetInitMetrics@9557.setCronetInitSuccess$1");
                try {
                    Iterator<InterfaceC1493830oyb> it2 = C1497080p3q.LJJJZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTNetInitMetrics@9557.setCronetInitSuccess$1");
            }
        }.LIZ();
    }

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("mode", this.LIZ.LL);
            jSONObject.put("is_main_process", this.LIZIZ);
            jSONObject.put("net_thread_priority", this.LIZJ);
            jSONObject2.put("ttnet_start", this.LIZLLL);
            jSONObject2.put("ttnet_end", (this.LIZLLL + this.LJII) - this.LJ);
            jSONObject2.put("engine_start", (this.LIZLLL + this.LJIILIIL) - this.LJ);
            jSONObject2.put("engine_end", (this.LIZLLL + this.LJJIJ) - this.LJ);
            jSONObject2.put("init_start", (this.LIZLLL + this.LJJIJIIJI) - this.LJ);
            jSONObject2.put("init_end", (this.LIZLLL + this.LJJIJIIJIL) - this.LJ);
            jSONObject2.put("preconnect_start", this.LJJJ);
            jSONObject3.put("builder_build", LIZJ(this.LJJIIJ, this.LJJIIJZLJL));
            jSONObject3.put("load_cronet", LIZJ(this.LJJIJIL, this.LJJIJL));
            jSONObject3.put("init_metasec", LIZJ(this.LJFF, this.LJI));
            jSONObject3.put("init_ttnet", LIZJ(this.LJ, this.LJII));
            jSONObject3.put("init_mssdk", LIZJ(this.LJJIIZ, this.LJJIIZI));
            jSONObject3.put("create_engine", LIZJ(this.LJIILIIL, this.LJJIJ));
            jSONObject3.put("init_thread", LIZJ(this.LJJIJIIJI, this.LJJIJIIJIL));
            jSONObject3.put("init_total", LIZJ(Math.min(this.LIZLLL, this.LJIIL) * 1000000, this.LJJJIL * 1000000));
            jSONObject3.put("init_preconnect", LIZJ(this.LIZLLL, this.LJJJ));
            long j = this.LJJJI;
            long j2 = this.LJJJIL;
            jSONObject3.put("network_thread", j > j2 ? -1L : j2 - j);
            long j3 = this.LJJJIL;
            long j4 = this.LJJJJ;
            jSONObject3.put("exec_tasks", j3 <= j4 ? j4 - j3 : -1L);
            jSONObject3.put("nqe_init", this.LJJJJI);
            jSONObject3.put("prefs_init", this.LJJJJIZL);
            jSONObject3.put("channel_init", this.LJJJJJ);
            jSONObject3.put("context_build", this.LJJJJJL);
            jSONObject3.put("tnc_config", this.LJJJJL);
            jSONObject3.put("update_appinfo", this.LJJJJLI);
            jSONObject3.put("netlog_init", this.LJJJJLL);
            jSONObject3.put("nqe_detect", this.LJJJJZ);
            jSONObject3.put("preconnect", this.LJJJJZI);
            jSONObject3.put("ssl_session", this.LJJJLIIL);
            jSONObject3.put("ttnet_config", this.LJJJLL);
            jSONObject3.put("install_cert", this.LJJJLZIJ);
            jSONObject.put("ttnet_timestamp", jSONObject2);
            jSONObject.put("ttnet_duration", jSONObject3);
            jSONObject.put("ab_test", this.LJJIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Logger.debug();
        return jSONObject;
    }

    public final JSONObject LIZIZ(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("mssdk", LIZLLL(this.LJJIIZ, this.LJJIIZI));
            jSONObject4.put("app_info_subset", LIZLLL(this.LJIILLIIL, this.LJIIZILJ));
            jSONObject4.put("thread_config_list", LIZLLL(this.LJIJ, this.LJIJI));
            jSONObject4.put("sla_samp_setting", LIZLLL(this.LJIL, this.LJJ));
            jSONObject4.put("build_ctx_config", LIZLLL(this.LJJI, this.LJJIFFI));
            jSONObject4.put("oec_init", LIZLLL(this.LJJII, this.LJJIII));
            jSONObject4.put("init_total", LIZLLL(Math.min(this.LIZLLL, this.LJIIL) * 1000000, this.LJJJIL * 1000000));
            String strLIZLLL = "-1";
            if (j != -1) {
                strLIZLLL = LIZLLL(j, this.LJ);
            }
            jSONObject4.put("app_init_time", strLIZLLL);
            jSONObject3.put("cross_plfm", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("ttnet_init", LIZLLL(this.LJ, this.LJII));
            jSONObject5.put("init_stack_config", LIZLLL(this.LJIIJ, this.LJIIJJI));
            jSONObject5.put("get_stack_config", LIZLLL(this.LJIILJJIL, this.LJIILL));
            jSONObject5.put("init_cookie_mgr", LIZLLL(this.LJIIIIZZ, this.LJIIIZ));
            jSONObject5.put("pre_init_mssdk", LIZLLL(this.LJFF, this.LJI));
            jSONObject5.put("builder_build", LIZLLL(this.LJJIIJ, this.LJJIIJZLJL));
            jSONObject5.put("create_engine", LIZLLL(this.LJIILIIL, this.LJJIJ));
            jSONObject5.put("cronet_init_thread", LIZLLL(this.LJJIJIIJI, this.LJJIJIIJIL));
            jSONObject5.put("cronet_load_so", LIZLLL(this.LJJIJIL, this.LJJIJL));
            jSONObject5.put("thread_config_callback", LIZLLL(this.LJIJJ, this.LJIJJLI));
            jSONObject3.put("android_spec", jSONObject5);
            jSONObject2.put("durations_us", jSONObject3);
            jSONObject2.put("cronet_init_mode", this.LIZ.LL);
            jSONObject.put("ttnet_layer", jSONObject2);
            jSONObject.put("cronet_layer", new JSONObject(this.LJJIJLIJ));
            jSONObject.put("ab_test", this.LJJIZ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public static long LIZJ(long j, long j2) {
        if (j != 0 && j2 != 0 && j <= j2) {
            long j3 = (j2 - j) / 1000;
            if (j3 != -1) {
                return j3 / 1000;
            }
        }
        return -1L;
    }

    public static String LIZLLL(long j, long j2) {
        long j3 = -1;
        if (j != 0 && j2 != 0 && j <= j2) {
            j3 = (j2 - j) / 1000;
        }
        return String.valueOf(j3);
    }

    public static boolean LJI(Context context, List list) {
        Class<?> cls;
        HashMap map = null;
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ml.MSB");
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            cls = null;
        }
        if (cls == null) {
            try {
                cls = Class.forName("com.bytedance.mobsec.metasec.ov.MSB");
            } catch (ClassNotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (cls == null) {
            return false;
        }
        if (list != null) {
            try {
                if (list.size() == 2) {
                    map = new HashMap();
                    map.put("http_callback", String.valueOf(list.get(0)));
                    map.put("ws_callback", String.valueOf(list.get(1)));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        cls.getMethod("a", Context.class, Integer.TYPE, Map.class).invoke(cls, context, 1, map);
        return true;
    }
}
