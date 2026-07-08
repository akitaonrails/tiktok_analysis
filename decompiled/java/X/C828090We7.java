package X;

import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.ss.android.ugc.aweme.hybridkit.web.hooks.WebMonitorExt;

/* JADX INFO: renamed from: X.0We7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828090We7 {
    public static void LIZ() {
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "enable_web_first_resource_monitor", true, false) && WebMonitorExt.LLJ.compareAndSet(false, true)) {
            WebViewHooker.LIZLLL(new WebMonitorExt());
        }
    }
}
