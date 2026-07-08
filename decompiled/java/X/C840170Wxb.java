package X;

import com.bytedance.helios.network.pipeline.recognize.NetworkDomainRecognize;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840170Wxb {
    public static int LIZ(C840200Wxe c840200Wxe) {
        Object c098200Yq;
        URL url;
        String protocol;
        String host;
        String path;
        String host2;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("report_reason", "2030");
            linkedHashMap.put("event_type", "SandboxNetwork");
            linkedHashMap.put("sandbox_method", c840200Wxe.LIZ);
            linkedHashMap.put("PumbaaPerf", c840200Wxe.LJI);
            String str = c840200Wxe.LIZIZ;
            if (str != null) {
                String query = null;
                try {
                    url = new URL(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    url = null;
                }
                if (url != null) {
                    protocol = url.getProtocol();
                } else {
                    protocol = null;
                }
                linkedHashMap.put("scheme", protocol);
                if (url != null) {
                    host = url.getHost();
                } else {
                    host = null;
                }
                linkedHashMap.put("domain_after_tnc", host);
                if (url != null) {
                    path = url.getPath();
                } else {
                    path = null;
                }
                linkedHashMap.put("path", path);
                if (url != null) {
                    query = url.getQuery();
                }
                linkedHashMap.put("query_str", query);
                if (url != null && (host2 = url.getHost()) != null) {
                    linkedHashMap2.put("domain_type", NetworkDomainRecognize.domainIdentityRecognize(host2));
                }
            }
            Map<String, String> map = c840200Wxe.LJFF;
            if (map != null) {
                linkedHashMap2.put("event_source", map.get("event_source"));
                linkedHashMap2.put("function_sig_name", map.get("function_sig_name"));
                linkedHashMap2.put("trigger_id", map.get("function_sig_name"));
                linkedHashMap2.put("dfid", map.get("dfid"));
                linkedHashMap2.put("transition_dfid", map.get("transition_dfid"));
                linkedHashMap2.put("sandbox_result", Boolean.valueOf(Intrinsics.LJFF(map.get("sandbox_result"), "true")));
                linkedHashMap2.put("is_in_sandbox_region", map.get("is_in_sandbox_region"));
                linkedHashMap2.put("sandbox_state", map.get("sandbox_state"));
                linkedHashMap2.put("sandbox_channel", map.get("sandbox_channel"));
            }
            Map<String, String> map2 = c840200Wxe.LIZJ;
            if (map2 != null) {
                String str2 = map2.get("Content-Type");
                if (str2 == null) {
                    str2 = c840200Wxe.LIZJ.get("content-type");
                }
                linkedHashMap2.put("content_type", str2);
                linkedHashMap2.put("hybrid_origin_url", map2.get("x-metasec-hybrid-origin-url"));
                linkedHashMap2.put("hybrid_router_dataflow_id", map2.get("x-metasec-webview-dataflow-id"));
                linkedHashMap.put("header_mss", map2);
                String str3 = map2.get("x-tt-ttnet-origin-host");
                if (str3 == null) {
                    str3 = "pns-null";
                }
                linkedHashMap2.put("dynamic_cdn_domain", str3);
            }
            if (C839870Wx7.LIZ(linkedHashMap, linkedHashMap2) instanceof C840150WxZ) {
                return 0;
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return 1;
    }
}
