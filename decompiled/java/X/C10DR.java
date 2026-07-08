package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IPushSystemPermissionApi;

/* JADX INFO: renamed from: X.10DR, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10DR {
    public static boolean LIZ(Context context) {
        IPushSystemPermissionApi iPushSystemPermissionApi;
        if (context == null || (iPushSystemPermissionApi = (IPushSystemPermissionApi) PluggableExtentionKt.pluggableSpi$default(IPushSystemPermissionApi.class, false, false, false, 14, null)) == null) {
            return false;
        }
        return iPushSystemPermissionApi.LIZLLL(context);
    }
}
