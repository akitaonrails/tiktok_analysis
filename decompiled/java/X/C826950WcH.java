package X;

import com.bytedance.helios.network.pipeline.recognize.NetworkDomainRecognize;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.settings.impl.SandboxAspectConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLDecoder;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826950WcH {
    public static boolean LIZ(Map map, InterfaceC825580Wa4 interfaceC825580Wa4) {
        String str;
        Object c098200Yq;
        if (((SandboxAspectConfig) C840230Wxh.LIZIZ.getValue()).forbidReportFor3rdPage && Intrinsics.LJFF(map.get("bypass_log"), Boolean.TRUE)) {
            Object obj = map.get("origin_url");
            Object obj2 = null;
            if (!(obj instanceof String) || (str = (String) obj) == null) {
                return false;
            }
            try {
                c098200Yq = UriProtector.parse(URLDecoder.decode(str, "UTF-8")).getHost();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            String str2 = (String) obj2;
            if (str2 != null && Intrinsics.LJFF(NetworkDomainRecognize.domainIdentityRecognize(str2), "bd_3rd")) {
                C0WRU.LIZ(interfaceC825580Wa4, "AgControl", "Report bypassed for 3rd-party traffic from 3rd-party page: " + map.get("domain_after_tnc") + " from " + str2);
                return true;
            }
        }
        return false;
    }
}
