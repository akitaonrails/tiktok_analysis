package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.066P, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C066P {
    public static final C066P LIZ = new C066P();

    public static void LIZ(Context context, String str, Map map) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://search_third_party");
        smartRouteBuildRoute.withParam("url", str);
        smartRouteBuildRoute.withParam("click_time", String.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            smartRouteBuildRoute.withParam((String) entry.getKey(), (String) entry.getValue());
        }
        smartRouteBuildRoute.open();
    }
}
