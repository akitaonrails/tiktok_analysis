package X;

import android.content.Context;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebRouterService;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828340WeW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, EnumC822170WNb enumC822170WNb, Context context) {
        SparkSecurityWebRouterService sparkSecurityWebRouterService = (SparkSecurityWebRouterService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelHybridLoad);
        Map<String, Object> map = c828420Wee.LJFF;
        if (str == null) {
            str = "";
        }
        map.put("URL", str);
        c828420Wee.LJFF.put("dataflowId", Integer.valueOf(i));
        c828420Wee.LJFF.put("web_runtime", Integer.valueOf(enumC822170WNb.ordinal()));
        c828420Wee.LJFF.put("context", new WeakReference(context));
        sparkSecurityWebRouterService.handleDidWebRouterWithEvent(c828420Wee);
    }

    public static C821850WLv LIZIZ(int i, String str, EnumC822170WNb enumC822170WNb, Context context, Map map) {
        SparkSecurityWebRouterService sparkSecurityWebRouterService = (SparkSecurityWebRouterService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelHybridLoad);
        Map<String, Object> map2 = c828420Wee.LJFF;
        if (str == null) {
            str = "";
        }
        map2.put("URL", str);
        c828420Wee.LJFF.put("dataflowId", Integer.valueOf(i));
        c828420Wee.LJFF.put("web_runtime", Integer.valueOf(enumC822170WNb.ordinal()));
        c828420Wee.LJFF.put("context", new WeakReference(context));
        Map<String, Object> map3 = c828420Wee.LJFF;
        if (map == null) {
            map = new LinkedHashMap();
        }
        map3.put("web_params", map);
        return sparkSecurityWebRouterService.handleWillWebRouterWithEvent(c828420Wee);
    }
}
