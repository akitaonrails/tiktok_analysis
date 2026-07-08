package X;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0WX2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WX2 {
    public static final int LIZ;
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final float LIZLLL;

    static {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        double d = ((IApplicationDependencyService) iECommerceHostService).getApplication().getResources().getDisplayMetrics().density;
        LIZ = d > 1.4d ? d <= 2.4d ? 2 : 3 : 1;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        LIZIZ = ((long) displayMetrics.heightPixels) * ((long) displayMetrics.widthPixels) * 4;
        LIZJ = 1048576L;
        LIZLLL = 2.0f;
    }

    public static final int LIZ() {
        return LIZ;
    }

    public static final long LIZIZ() {
        return LIZJ;
    }

    public static final float LIZJ() {
        return LIZLLL;
    }

    public static final long LIZLLL() {
        return LIZIZ;
    }
}
