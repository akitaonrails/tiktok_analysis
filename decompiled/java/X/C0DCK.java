package X;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.ucp.api.spi.IUcpDebugService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: renamed from: X.0DCK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCK {
    public static final C0DCK LIZ = new C0DCK();

    public static void LIZ(C0DCK c0dck, Activity activity, LifecycleOwner lifecycleOwner, View view, Map map, Object obj, String str, String str2, String str3, InterfaceC346201Wa interfaceC346201Wa) {
        IUcpDebugService iUcpDebugService;
        c0dck.getClass();
        if (activity != null && (iUcpDebugService = (IUcpDebugService) PluggableExtentionKt.pluggableSpi$default(IUcpDebugService.class, false, false, false, 14, null)) != null) {
            iUcpDebugService.LIZ();
        }
    }
}
