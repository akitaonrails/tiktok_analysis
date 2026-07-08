package X;

import com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQ7 {
    public static final C0WQ7 LIZ = new C0WQ7();
    public static final Map<String, PumbaaFieldDefineProvider> LIZIZ;
    public static final Set<PumbaaFieldDefineProvider> LIZJ;

    static {
        PumbaaFieldDefineProvider pumbaaFieldDefineProvider = new PumbaaFieldDefineProvider() { // from class: X.0WRD
            public final Map<String, C0WQG> LIZ;

            @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
            public final String triggerBiz() {
                return "Pipeline";
            }

            {
                C0WRM c0wrm = C0WRM.Global;
                EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
                EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.Long;
                C0WRM c0wrm2 = C0WRM.CallSite;
                EnumC823400WRu enumC823400WRu3 = EnumC823400WRu.Bool;
                EnumC823400WRu enumC823400WRu4 = EnumC823400WRu.StringArray;
                this.LIZ = C2097608Jq.LJIIIIZZ(new Pair("pumbaa_app_version", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("pumbaa_version_code", new C0WQG(c0wrm, enumC823400WRu2, "/data/category")), new Pair("sdk_version", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("background_status", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("background_duration", new C0WQG(c0wrm, enumC823400WRu2, "/data/extra")), new Pair("report_category", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("strategy_id", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("strategy_version", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("const_pool_version", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("graph_path", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("report_sample", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("sample_rate", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("stack", new C0WQG(c0wrm2, enumC823400WRu, "/data/extra")), new Pair("is_cross_stack_enabled", new C0WQG(c0wrm2, enumC823400WRu3, "/data/category")), new Pair("is_cross_stack", new C0WQG(c0wrm2, enumC823400WRu3, "/data/category")), new Pair("method_id", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("trigger_id", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("trigger_biz", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("is_before_init", new C0WQG(c0wrm, enumC823400WRu3, "/data/category")), new Pair("process_name", new C0WQG(c0wrm, enumC823400WRu, "/data/category")), new Pair("pl_page_stack", new C0WQG(c0wrm, enumC823400WRu4, "/data/extra")), new Pair("pl_btm_stack", new C0WQG(c0wrm, enumC823400WRu4, "/data/extra")), new Pair("stack_extra_info", new C0WQG(c0wrm2, enumC823400WRu, "/data/extra")), new Pair("method_id_extra_info", new C0WQG(c0wrm2, enumC823400WRu, "/data/extra")), new Pair("call_site", new C0WQG(c0wrm2, enumC823400WRu, "/data/extra")), new Pair("cert_token", new C0WQG(c0wrm2, enumC823400WRu, "/data/extra")), new Pair("api_id", new C0WQG(c0wrm2, enumC823400WRu2, "/data/category")), new Pair("origin_api_id", new C0WQG(c0wrm2, enumC823400WRu2, "/data/category")), new Pair("unidfid", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("process_type", new C0WQG(c0wrm2, EnumC823400WRu.Any, "/data/category")), new Pair("nxet_info", new C0WQG(c0wrm2, enumC823400WRu, "/data/extra")), new Pair("is_timeout_report", new C0WQG(c0wrm2, enumC823400WRu3, "/data/category")), new Pair("is_exceed_capacity", new C0WQG(c0wrm2, enumC823400WRu3, "/data/category")), new Pair("aggregated_trigger_ids", new C0WQG(c0wrm2, enumC823400WRu4, "/data/category")), new Pair("merge_trigger_ids", new C0WQG(c0wrm2, enumC823400WRu4, "/data/category")), new Pair("graph_paths", new C0WQG(c0wrm2, enumC823400WRu4, "/data/category")), new Pair("merge_report_reason", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("merge_queue_max_size", new C0WQG(c0wrm2, enumC823400WRu2, "/data/category")), new Pair("cross_page_stack", new C0WQG(c0wrm2, enumC823400WRu, "/data/extra")), new Pair("cross_page", new C0WQG(c0wrm2, enumC823400WRu, "/data/extra")), new Pair("dfid", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("x_tt_pba_encode", new C0WQG(c0wrm2, enumC823400WRu, "/data/category")), new Pair("is_cache_event", new C0WQG(c0wrm2, enumC823400WRu3, "/data/category")));
            }

            @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
            public final boolean contains(String str) {
                return this.LIZ.containsKey(str);
            }

            @Override // com.bytedance.pumbaa.base2.define.PumbaaFieldDefineProvider
            public final C0WQG query(String str) {
                return this.LIZ.get(str);
            }
        };
        LIZIZ = new LinkedHashMap();
        LIZJ = C093Y.LJ(pumbaaFieldDefineProvider);
    }

    public static C0WQG LIZ(String str, String str2) {
        Object next;
        C0WQG c0wqgQuery;
        Map<String, PumbaaFieldDefineProvider> map = LIZIZ;
        if (!(!map.isEmpty())) {
            synchronized (map) {
                try {
                    if (!(!map.isEmpty())) {
                        for (PumbaaFieldDefineProvider pumbaaFieldDefineProvider : ServiceManager.get().getServices(PumbaaFieldDefineProvider.class)) {
                            Map<String, PumbaaFieldDefineProvider> map2 = LIZIZ;
                            map2.containsKey(pumbaaFieldDefineProvider.triggerBiz());
                            if (Intrinsics.LJFF(pumbaaFieldDefineProvider.triggerBiz(), "HostApp")) {
                                LIZJ.add(pumbaaFieldDefineProvider);
                            } else {
                                map2.put(pumbaaFieldDefineProvider.triggerBiz(), pumbaaFieldDefineProvider);
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        PumbaaFieldDefineProvider pumbaaFieldDefineProvider2 = (PumbaaFieldDefineProvider) ((LinkedHashMap) LIZIZ).get(str);
        if (pumbaaFieldDefineProvider2 == null || (c0wqgQuery = pumbaaFieldDefineProvider2.query(str2)) == null) {
            Iterator<T> it2 = LIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((PumbaaFieldDefineProvider) next).contains(str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PumbaaFieldDefineProvider pumbaaFieldDefineProvider3 = (PumbaaFieldDefineProvider) next;
            if (pumbaaFieldDefineProvider3 == null) {
                return null;
            }
            return pumbaaFieldDefineProvider3.query(str2);
        }
        return c0wqgQuery;
    }
}
