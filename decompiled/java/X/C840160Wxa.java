package X;

import com.bytedance.pumbaa.settings.impl.SandboxAspectConfig;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Wxa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840160Wxa extends AbstractC835370Wpr<C840200Wxe, Unit> {
    public static final C826950WcH LIZJ = new C826950WcH();
    public static final String LIZLLL = "2030";
    public static final double LJ;
    public static final double LJFF;
    public static final Set<String> LJI;
    public static final Set<String> LJII;
    public final C840200Wxe LIZIZ;

    static {
        C01GW c01gw = C840230Wxh.LIZIZ;
        LJ = ((SandboxAspectConfig) c01gw.getValue()).reportSampleRate;
        LJFF = ((SandboxAspectConfig) c01gw.getValue()).reportInterceptSampleRate;
        LJI = C13LQ.LJLIIL(new String[]{"function_sig_name", "event_source", "event_type", "dfid", "transition_dfid", "report_reason", "report_sample", "scheme", "domain_after_tnc", "dfid", "is_in_sandbox_region", "sandbox_result", "sandbox_method", "sandbox_channel", "sandbox_state", "content_type", "hybrid_router_dataflow_id", "dynamic_cdn_domain"});
        LJII = C13LQ.LJLIIL(new String[]{"header_keys", "query_keys", "path", "origin_url"});
    }

    public C840160Wxa(C840200Wxe c840200Wxe) {
        super(c840200Wxe);
        this.LIZIZ = c840200Wxe;
    }

    public static boolean LIZIZ(double d) {
        if (d < 1.0d) {
            if (d > 0.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) <= d) {
                return true;
            }
            return false;
        }
        return true;
    }
}
