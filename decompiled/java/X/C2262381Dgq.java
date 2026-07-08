package X;

import android.app.Activity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.host.TikTokHostActivity;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Dgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262381Dgq extends C09AY implements Function0<RouterPageMonitor.RouterPageConfig> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262381Dgq(boolean z) {
        super(0);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RouterPageMonitor.RouterPageConfig invoke() {
        return new RouterPageMonitor.RouterPageConfig(this.LL, new RouterPageMonitor.IEventReport() { // from class: X.1ClM
            @Override // com.bytedance.router.monitor.RouterPageMonitor.IEventReport
            public final void onEvent(String str, JSONObject jSONObject) {
                AppLogNewUtils.onEventV3(str, jSONObject);
            }
        }, new RouterPageMonitor.IRouterNodeHost() { // from class: X.1Dgr
            @Override // com.bytedance.router.monitor.RouterPageMonitor.IRouterNodeHost
            public final boolean shouldSkipRouteActivityNode(Activity activity) {
                return activity instanceof TikTokHostActivity;
            }
        }, false);
    }
}
