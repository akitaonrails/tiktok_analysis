package X;

import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0q0Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533490q0Z extends C1533550q0f {
    public final String LJJJJIZL;
    public final Forest LJJJJJ;
    public final boolean LJJJJJL;
    public final Uri LJJJJL;
    public final C1533510q0b LJJJJLI;
    public boolean LJJJJLL;
    public InterfaceC1534850q2l LJJJJZ;
    public List<String> LJJJJZI;
    public boolean LJJJLIIL;
    public List<String> LJJJLL;
    public C1533910q1F LJJJLZIJ;
    public String LJJJZ;

    public final boolean LIZ() {
        EnumC1533980q1M enumC1533980q1M;
        return this.LJJJJI != null || (enumC1533980q1M = this.LJJJ) == EnumC1533980q1M.WEB_CHILD_RESOURCE || enumC1533980q1M == EnumC1533980q1M.WEB_MAIN_DOCUMENT;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request: ");
        sbLIZ.append(C1533500q0a.LIZ(C1533500q0a.LIZJ(this)));
        sbLIZ.append(C1533500q0a.LIZ(C1533500q0a.LIZIZ(this.LJJJJLI)));
        HashMap map = new HashMap();
        map.put("allow_io_on_main_thread", String.valueOf(this.LIZ).toLowerCase());
        map.put("allow_redirect_internally", String.valueOf(this.LIZIZ).toLowerCase());
        map.put("cdn_region_redirect", String.valueOf(this.LIZJ).toLowerCase());
        map.put("cdn_timeout", String.valueOf(this.LIZLLL).toLowerCase());
        map.put("consume_type", String.valueOf(this.LJ).toLowerCase());
        map.put("disable_built_in", String.valueOf(this.LJII).toLowerCase());
        map.put("disable_cdn_online", String.valueOf(this.LJIIIIZZ).toLowerCase());
        map.put("disable_cdn", String.valueOf(this.LJIIIZ).toLowerCase());
        map.put("disable_gecko_remote_settings", String.valueOf(this.LJIIJ).toLowerCase());
        map.put("disable_gecko_statics", String.valueOf(this.LJIIJJI).toLowerCase());
        map.put("disable_gecko", String.valueOf(this.LJIIL).toLowerCase());
        map.put("disable_prefix_parser", String.valueOf(this.LJIILIIL).toLowerCase());
        map.put("disable_report", String.valueOf(this.LJIILJJIL).toLowerCase());
        map.put("cdn_cache", this.LJIILL);
        map.put("enable_consume_memory_cache", String.valueOf(this.LJIILLIIL).toLowerCase());
        map.put("enable_memory_cache", String.valueOf(this.LJIIZILJ).toLowerCase());
        map.put("enable_negotiation", String.valueOf(this.LJIJ).toLowerCase());
        map.put("enable_process_chain", String.valueOf(this.LJIJI).toLowerCase());
        map.put("enable_request_reuse", Boolean.valueOf(this.LJIJJ));
        map.put("fetch_preloaded_cache_timeout", String.valueOf(this.LJIJJLI).toLowerCase());
        map.put("force_meta_type", String.valueOf(this.LJIL).toLowerCase());
        map.put("force_process_chain", String.valueOf(this.LJJ).toLowerCase());
        map.put("gecko_url_redirect", String.valueOf(this.LJJI).toLowerCase());
        map.put("res_trace_id", String.valueOf(this.LJJIFFI).toLowerCase());
        map.put("http_request_headers", String.valueOf(this.LJJII).toLowerCase());
        map.put("ignore_all_params", String.valueOf(this.LJJIII).toLowerCase());
        map.put("ignore_expiration", String.valueOf(this.LJJIIJ).toLowerCase());
        map.put("ignored_query_params", String.valueOf(this.LJJIIJZLJL).toLowerCase());
        map.put("is_preload", String.valueOf(this.LJJIIZ).toLowerCase());
        map.put("load_retry_times", String.valueOf(this.LJJIJ).toLowerCase());
        map.put("load_to_memory", String.valueOf(this.LJJIJIIJI).toLowerCase());
        map.put("max_expiration_time", String.valueOf(this.LJJIJIIJIL).toLowerCase());
        map.put("need_local_file", String.valueOf(this.LJJIJIL).toLowerCase());
        map.put("only_local", String.valueOf(this.LJJIJL).toLowerCase());
        map.put("only_online", String.valueOf(this.LJJIJLIJ).toLowerCase());
        map.put("parallel_loading", String.valueOf(this.LJJIL).toLowerCase());
        map.put("redirect_regions", String.valueOf(this.LJJIZ).toLowerCase());
        map.put("res_scene", String.valueOf(this.LJJJ).toLowerCase());
        map.put("session_id", String.valueOf(this.LJJJI).toLowerCase());
        map.put("optimized_source", String.valueOf(this.LJJJIL).toLowerCase());
        map.put("support_directory", String.valueOf(this.LJJJJ).toLowerCase());
        map.put("web_resource_request", String.valueOf(this.LJJJJI).toLowerCase());
        sbLIZ.append(C1533500q0a.LIZ(map));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1533490q0Z(Forest forest, RequestParams requestParams, String str, boolean z) {
        Object c098200Yq;
        super(requestParams, forest.getConfig());
        this.LJJJJIZL = str;
        this.LJJJJJ = forest;
        this.LJJJJJL = z;
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LJJJJL = (Uri) (C189200o6.m7isFailureimpl(c098200Yq) ? new Uri.Builder().build() : c098200Yq);
        this.LJJJJLI = new C1533510q0b("", "", "");
        this.LJJJJZ = C1534080q1W.LIZ;
        this.LJJJJZI = C13BV.INSTANCE;
        this.LJJJLL = new ArrayList(requestParams.fetcherSequence);
    }
}
