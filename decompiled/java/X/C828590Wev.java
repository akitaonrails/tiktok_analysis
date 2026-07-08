package X;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityModifyResourceService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828590Wev {
    public static final SecureRandom LIZ = new SecureRandom();
    public static final C603820NmG<String, C828420Wee> LIZIZ = new C603820NmG<>(20);

    public static String LIZ() {
        StringBuilder sb = new StringBuilder(13);
        int i = 0;
        do {
            sb.append(LIZ.nextInt(10));
            i++;
        } while (i < 13);
        return sb.toString();
    }

    public static String LIZJ(String str, C828420Wee c828420Wee) {
        Object c098200Yq;
        if (!SparkSecurityServiceCenter.INSTANCE.getEnable()) {
            return str;
        }
        try {
            try {
                c098200Yq = UriProtector.parse(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Uri uri = (Uri) c098200Yq;
            if (uri == null) {
                C189200o6.m2constructorimpl(Unit.LIZ);
                return str;
            }
            String strLIZ = LIZ();
            c828420Wee.LIZLLL = strLIZ;
            LIZIZ.LIZLLL(strLIZ, c828420Wee);
            return uri.buildUpon().appendQueryParameter("sss-network-channel", strLIZ).build().toString();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return str;
        }
    }

    public static void LIZLLL(C828420Wee c828420Wee, String str, String str2) {
        Map linkedHashMap;
        Object obj = c828420Wee.LJFF.get("hybrid_info");
        if (C19719512Dh.LJII(obj) && obj != null) {
            linkedHashMap = C19719512Dh.LIZJ(c828420Wee.LJFF.get("hybrid_info"));
        } else {
            linkedHashMap = new LinkedHashMap();
            c828420Wee.LJFF.put("hybrid_info", linkedHashMap);
        }
        linkedHashMap.put(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(String str, String str2, String str3, WebResourceResponse webResourceResponse) {
        C1E6N c1e6n;
        Map<?, ?> map;
        Object value;
        SparkSecurityModifyResourceService sparkSecurityModifyResourceService = (SparkSecurityModifyResourceService) SparkSecurityServiceCenter.INSTANCE.protocol();
        Boolean bool = Boolean.TRUE;
        C1E6N c1e6n2 = C1E6N.SparkSecuritySolutionEndpointNative;
        if (Intrinsics.LJFF(bool, bool)) {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointWebView;
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointLynx;
        } else {
            c1e6n = c1e6n2;
        }
        C828420Wee c828420Wee = new C828420Wee(c1e6n2, c1e6n, C1E6B.SparkSecurityWebSolutionChannelResourceLoad);
        c828420Wee.LJFF.put("URL", str);
        c828420Wee.LJFF.put("access_key", str2);
        c828420Wee.LJFF.put("channel", str3);
        c828420Wee.LJFF.put("is_main_frame", bool);
        C821850WLv c821850WLvHandleWillModifyWebOfflineResourceWithEvent = sparkSecurityModifyResourceService.handleWillModifyWebOfflineResourceWithEvent(c828420Wee);
        if (c821850WLvHandleWillModifyWebOfflineResourceWithEvent != null && (map = c821850WLvHandleWillModifyWebOfflineResourceWithEvent.LIZIZ) != null) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    if (TextUtils.equals((String) entry.getKey(), "append_header") && (value = entry.getValue()) != null && (value instanceof Map)) {
                        for (Map.Entry entry2 : ((Map) value).entrySet()) {
                            webResourceResponse.getResponseHeaders().put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    public static C828420Wee LIZIZ(Boolean bool, String str, String str2, String str3, Map map) {
        C1E6N c1e6n;
        String str4;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointWebView;
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointLynx;
        } else {
            c1e6n = C1E6N.SparkSecuritySolutionEndpointNative;
        }
        C828420Wee c828420Wee = new C828420Wee(c1e6n, C1E6N.SparkSecuritySolutionEndpointRemoteServer, C1E6B.SparkSecuritySolutionChannelNetwork);
        LIZLLL(c828420Wee, "URL", str);
        LIZLLL(c828420Wee, "hybrid_channel", str2);
        LIZLLL(c828420Wee, "source_location", str3);
        if (map != null) {
            Object obj = map.get("origin_url");
            if (obj != null && (obj instanceof String) && ((CharSequence) obj).length() > 0) {
                LIZLLL(c828420Wee, "origin_url", (String) obj);
            }
            Object obj2 = map.get("x-metasec-webview-dataflow-id");
            if (!(obj2 instanceof String) || (str4 = (String) obj2) == null) {
                str4 = "";
            }
            LIZLLL(c828420Wee, "x-metasec-webview-dataflow-id", str4);
        }
        return c828420Wee;
    }
}
