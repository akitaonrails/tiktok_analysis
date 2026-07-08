package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;

/* JADX INFO: renamed from: X.0rVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591070rVR {
    public static final C1591070rVR LIZ = new C1591070rVR();

    public static boolean LIZ() {
        Activity activityLIZ;
        IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi$default(IHomeSidebarService.class, false, false, false, 14, null);
        return (iHomeSidebarService == null || !iHomeSidebarService.LIZJ() || (activityLIZ = C2421209eE.LIZ()) == null || activityLIZ.isFinishing() || activityLIZ.isDestroyed()) ? false : true;
    }
}
