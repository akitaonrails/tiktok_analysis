package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.048l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10493048l {
    public static final C10493048l LIZ = new C10493048l();

    public static final int LIZ() {
        IECommerceHostService iECommerceHostService;
        WindowManager windowManager;
        Display displayLLILZIL;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Context applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object objH2 = C786410Ut5.H2(applicationContext, "window");
        if ((objH2 instanceof WindowManager) && (windowManager = (WindowManager) objH2) != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Y9sLLCdyYgKadQ6jK2/rAJVMccKRAs=", null))) != null) {
            displayLLILZIL.getRealMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static final int LIZIZ(C19EG c19eg) {
        int i;
        C20244914Jj c20244914JjLIZ;
        int i2 = 0;
        if (c19eg == null) {
            return 0;
        }
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(c19eg.getWindow().getDecorView());
        if (c20246014JuLIZ != null && (c20244914JjLIZ = c20246014JuLIZ.LIZ(1)) != null) {
            i = c20244914JjLIZ.LIZIZ;
        } else {
            i = 0;
            if (c20246014JuLIZ != null) {
            }
            return i + i2;
        }
        C20244914Jj c20244914JjLIZ2 = c20246014JuLIZ.LIZ(2);
        if (c20244914JjLIZ2 != null) {
            i2 = c20244914JjLIZ2.LIZLLL;
        }
        return i + i2;
    }
}
