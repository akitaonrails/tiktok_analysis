package X;

import android.content.Context;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.07kH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1949107kH {
    public static final String LIZ(int i) {
        Context applicationContext;
        IAppContextManagerService iAppContextManagerService = (IAppContextManagerService) PluggableExtentionKt.pluggableSpi$default(IAppContextManagerService.class, false, false, false, 14, null);
        if (iAppContextManagerService != null && (applicationContext = iAppContextManagerService.getApplicationContext()) != null) {
            return applicationContext.getString(i);
        }
        return null;
    }
}
